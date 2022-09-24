package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.SonicAudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.nio.ByteBuffer;

final class TransformerAudioRenderer extends TransformerBaseRenderer {
    private static final int DEFAULT_ENCODER_BITRATE = 131072;
    private static final float SPEED_UNSET = -1.0f;
    private static final String TAG = "TransformerAudioRenderer";
    private float currentSpeed = -1.0f;
    private MediaCodecAdapterWrapper decoder;
    private final DecoderInputBuffer decoderInputBuffer = new DecoderInputBuffer(0);
    private boolean drainingSonicForSpeedChange;
    private MediaCodecAdapterWrapper encoder;
    private AudioProcessor.AudioFormat encoderInputAudioFormat;
    private final DecoderInputBuffer encoderInputBuffer = new DecoderInputBuffer(0);
    private boolean hasEncoderOutputFormat;
    private Format inputFormat;
    private boolean muxerWrapperTrackEnded;
    private long nextEncoderInputBufferTimeUs = 0;
    private final SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
    private ByteBuffer sonicOutputBuffer = AudioProcessor.EMPTY_BUFFER;
    private SpeedProvider speedProvider;

    public TransformerAudioRenderer(MuxerWrapper muxerWrapper, TransformerMediaClock transformerMediaClock, Transformation transformation) {
        super(1, muxerWrapper, transformerMediaClock, transformation);
    }

    private ExoPlaybackException createRendererException(Throwable th) {
        return ExoPlaybackException.createForRenderer(th, TAG, getIndex(), this.inputFormat, 4);
    }

    private boolean drainDecoderToFeedEncoder() {
        MediaCodecAdapterWrapper mediaCodecAdapterWrapper = (MediaCodecAdapterWrapper) Assertions.checkNotNull(this.decoder);
        if (!((MediaCodecAdapterWrapper) Assertions.checkNotNull(this.encoder)).maybeDequeueInputBuffer(this.encoderInputBuffer)) {
            return false;
        }
        if (mediaCodecAdapterWrapper.isEnded()) {
            queueEndOfStreamToEncoder();
            return false;
        }
        ByteBuffer outputBuffer = mediaCodecAdapterWrapper.getOutputBuffer();
        if (outputBuffer == null) {
            return false;
        }
        if (isSpeedChanging((MediaCodec.BufferInfo) Assertions.checkNotNull(mediaCodecAdapterWrapper.getOutputBufferInfo()))) {
            flushSonicAndSetSpeed(this.currentSpeed);
            return false;
        }
        feedEncoder(outputBuffer);
        if (outputBuffer.hasRemaining()) {
            return true;
        }
        mediaCodecAdapterWrapper.releaseOutputBuffer();
        return true;
    }

    private boolean drainDecoderToFeedSonic() {
        MediaCodecAdapterWrapper mediaCodecAdapterWrapper = (MediaCodecAdapterWrapper) Assertions.checkNotNull(this.decoder);
        if (this.drainingSonicForSpeedChange) {
            if (this.sonicAudioProcessor.isEnded() && !this.sonicOutputBuffer.hasRemaining()) {
                flushSonicAndSetSpeed(this.currentSpeed);
                this.drainingSonicForSpeedChange = false;
            }
            return false;
        } else if (this.sonicOutputBuffer.hasRemaining()) {
            return false;
        } else {
            if (mediaCodecAdapterWrapper.isEnded()) {
                this.sonicAudioProcessor.queueEndOfStream();
                return false;
            }
            Assertions.checkState(!this.sonicAudioProcessor.isEnded());
            ByteBuffer outputBuffer = mediaCodecAdapterWrapper.getOutputBuffer();
            if (outputBuffer == null) {
                return false;
            }
            if (isSpeedChanging((MediaCodec.BufferInfo) Assertions.checkNotNull(mediaCodecAdapterWrapper.getOutputBufferInfo()))) {
                this.sonicAudioProcessor.queueEndOfStream();
                this.drainingSonicForSpeedChange = true;
                return false;
            }
            this.sonicAudioProcessor.queueInput(outputBuffer);
            if (!outputBuffer.hasRemaining()) {
                mediaCodecAdapterWrapper.releaseOutputBuffer();
            }
            return true;
        }
    }

    private boolean drainEncoderToFeedMuxer() {
        MediaCodecAdapterWrapper mediaCodecAdapterWrapper = (MediaCodecAdapterWrapper) Assertions.checkNotNull(this.encoder);
        if (!this.hasEncoderOutputFormat) {
            Format outputFormat = mediaCodecAdapterWrapper.getOutputFormat();
            if (outputFormat == null) {
                return false;
            }
            this.hasEncoderOutputFormat = true;
            this.muxerWrapper.addTrackFormat(outputFormat);
        }
        if (mediaCodecAdapterWrapper.isEnded()) {
            this.muxerWrapper.endTrack(getTrackType());
            this.muxerWrapperTrackEnded = true;
            return false;
        }
        ByteBuffer outputBuffer = mediaCodecAdapterWrapper.getOutputBuffer();
        if (outputBuffer == null || !this.muxerWrapper.writeSample(getTrackType(), outputBuffer, true, ((MediaCodec.BufferInfo) Assertions.checkNotNull(mediaCodecAdapterWrapper.getOutputBufferInfo())).presentationTimeUs)) {
            return false;
        }
        mediaCodecAdapterWrapper.releaseOutputBuffer();
        return true;
    }

    private boolean drainSonicToFeedEncoder() {
        if (!((MediaCodecAdapterWrapper) Assertions.checkNotNull(this.encoder)).maybeDequeueInputBuffer(this.encoderInputBuffer)) {
            return false;
        }
        if (!this.sonicOutputBuffer.hasRemaining()) {
            ByteBuffer output = this.sonicAudioProcessor.getOutput();
            this.sonicOutputBuffer = output;
            if (!output.hasRemaining()) {
                if (((MediaCodecAdapterWrapper) Assertions.checkNotNull(this.decoder)).isEnded() && this.sonicAudioProcessor.isEnded()) {
                    queueEndOfStreamToEncoder();
                }
                return false;
            }
        }
        feedEncoder(this.sonicOutputBuffer);
        return true;
    }

    private boolean ensureDecoderConfigured() throws ExoPlaybackException {
        if (this.decoder != null) {
            return true;
        }
        FormatHolder formatHolder = getFormatHolder();
        if (readSource(formatHolder, this.decoderInputBuffer, 2) != -5) {
            return false;
        }
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        this.inputFormat = format;
        try {
            this.decoder = MediaCodecAdapterWrapper.createForAudioDecoding(format);
            SegmentSpeedProvider segmentSpeedProvider = new SegmentSpeedProvider(this.inputFormat);
            this.speedProvider = segmentSpeedProvider;
            this.currentSpeed = segmentSpeedProvider.getSpeed(0);
            return true;
        } catch (IOException e) {
            throw createRendererException(e);
        }
    }

    private boolean ensureEncoderAndAudioProcessingConfigured() throws ExoPlaybackException {
        if (this.encoder != null) {
            return true;
        }
        Format outputFormat = ((MediaCodecAdapterWrapper) Assertions.checkNotNull(this.decoder)).getOutputFormat();
        if (outputFormat == null) {
            return false;
        }
        AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(outputFormat.sampleRate, outputFormat.channelCount, outputFormat.pcmEncoding);
        if (this.transformation.flattenForSlowMotion) {
            try {
                audioFormat = this.sonicAudioProcessor.configure(audioFormat);
                flushSonicAndSetSpeed(this.currentSpeed);
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw createRendererException(e);
            }
        }
        try {
            this.encoder = MediaCodecAdapterWrapper.createForAudioEncoding(new Format.Builder().setSampleMimeType(((Format) Assertions.checkNotNull(this.inputFormat)).sampleMimeType).setSampleRate(audioFormat.sampleRate).setChannelCount(audioFormat.channelCount).setAverageBitrate(131072).build());
            this.encoderInputAudioFormat = audioFormat;
            return true;
        } catch (IOException e2) {
            throw createRendererException(e2);
        }
    }

    private boolean feedDecoderInputFromSource() {
        MediaCodecAdapterWrapper mediaCodecAdapterWrapper = (MediaCodecAdapterWrapper) Assertions.checkNotNull(this.decoder);
        if (!mediaCodecAdapterWrapper.maybeDequeueInputBuffer(this.decoderInputBuffer)) {
            return false;
        }
        this.decoderInputBuffer.clear();
        int readSource = readSource(getFormatHolder(), this.decoderInputBuffer, 0);
        if (readSource == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        } else if (readSource != -4) {
            return false;
        } else {
            this.mediaClock.updateTimeForTrackType(getTrackType(), this.decoderInputBuffer.timeUs);
            this.decoderInputBuffer.flip();
            mediaCodecAdapterWrapper.queueInputBuffer(this.decoderInputBuffer);
            return !this.decoderInputBuffer.isEndOfStream();
        }
    }

    private void feedEncoder(ByteBuffer byteBuffer) {
        AudioProcessor.AudioFormat audioFormat = (AudioProcessor.AudioFormat) Assertions.checkNotNull(this.encoderInputAudioFormat);
        ByteBuffer byteBuffer2 = (ByteBuffer) Assertions.checkNotNull(this.encoderInputBuffer.data);
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + byteBuffer2.capacity()));
        byteBuffer2.put(byteBuffer);
        DecoderInputBuffer decoderInputBuffer2 = this.encoderInputBuffer;
        long j = this.nextEncoderInputBufferTimeUs;
        decoderInputBuffer2.timeUs = j;
        this.nextEncoderInputBufferTimeUs = j + getBufferDurationUs((long) byteBuffer2.position(), audioFormat.bytesPerFrame, audioFormat.sampleRate);
        this.encoderInputBuffer.setFlags(0);
        this.encoderInputBuffer.flip();
        byteBuffer.limit(limit);
        ((MediaCodecAdapterWrapper) Assertions.checkNotNull(this.encoder)).queueInputBuffer(this.encoderInputBuffer);
    }

    private void flushSonicAndSetSpeed(float f) {
        this.sonicAudioProcessor.setSpeed(f);
        this.sonicAudioProcessor.setPitch(f);
        this.sonicAudioProcessor.flush();
    }

    private static long getBufferDurationUs(long j, int i, int i2) {
        return ((j / ((long) i)) * 1000000) / ((long) i2);
    }

    private boolean isSpeedChanging(MediaCodec.BufferInfo bufferInfo) {
        boolean z = false;
        if (!this.transformation.flattenForSlowMotion) {
            return false;
        }
        float speed = ((SpeedProvider) Assertions.checkNotNull(this.speedProvider)).getSpeed(bufferInfo.presentationTimeUs);
        if (speed != this.currentSpeed) {
            z = true;
        }
        this.currentSpeed = speed;
        return z;
    }

    private void queueEndOfStreamToEncoder() {
        MediaCodecAdapterWrapper mediaCodecAdapterWrapper = (MediaCodecAdapterWrapper) Assertions.checkNotNull(this.encoder);
        Assertions.checkState(((ByteBuffer) Assertions.checkNotNull(this.encoderInputBuffer.data)).position() == 0);
        this.encoderInputBuffer.addFlag(4);
        this.encoderInputBuffer.flip();
        mediaCodecAdapterWrapper.queueInputBuffer(this.encoderInputBuffer);
    }

    public String getName() {
        return TAG;
    }

    public boolean isEnded() {
        return this.muxerWrapperTrackEnded;
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        this.decoderInputBuffer.clear();
        this.decoderInputBuffer.data = null;
        this.encoderInputBuffer.clear();
        this.encoderInputBuffer.data = null;
        this.sonicAudioProcessor.reset();
        MediaCodecAdapterWrapper mediaCodecAdapterWrapper = this.decoder;
        if (mediaCodecAdapterWrapper != null) {
            mediaCodecAdapterWrapper.release();
            this.decoder = null;
        }
        MediaCodecAdapterWrapper mediaCodecAdapterWrapper2 = this.encoder;
        if (mediaCodecAdapterWrapper2 != null) {
            mediaCodecAdapterWrapper2.release();
            this.encoder = null;
        }
        this.speedProvider = null;
        this.inputFormat = null;
        this.encoderInputAudioFormat = null;
        this.sonicOutputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.nextEncoderInputBufferTimeUs = 0;
        this.currentSpeed = -1.0f;
        this.muxerWrapperTrackEnded = false;
        this.hasEncoderOutputFormat = false;
        this.drainingSonicForSpeedChange = false;
    }

    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.isRendererStarted && !isEnded() && ensureDecoderConfigured()) {
            if (ensureEncoderAndAudioProcessingConfigured()) {
                do {
                } while (drainEncoderToFeedMuxer());
                if (this.sonicAudioProcessor.isActive()) {
                    do {
                    } while (drainSonicToFeedEncoder());
                    do {
                    } while (drainDecoderToFeedSonic());
                } else {
                    do {
                    } while (drainDecoderToFeedEncoder());
                }
            }
            do {
            } while (feedDecoderInputFromSource());
        }
    }
}
