package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.ParcelFileDescriptor;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.transformer.Muxer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaFormatUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;

final class FrameworkMuxer implements Muxer {
    private final MediaCodec.BufferInfo bufferInfo;
    private boolean isStarted;
    private final MediaMuxer mediaMuxer;
    private final String outputMimeType;

    /* access modifiers changed from: private */
    public static int mimeTypeToMuxerOutputFormat(String str) {
        if (str.equals(MimeTypes.VIDEO_MP4)) {
            return 0;
        }
        if (Util.SDK_INT >= 21 && str.equals(MimeTypes.VIDEO_WEBM)) {
            return 1;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unsupported output MIME type: ".concat(str) : new String("Unsupported output MIME type: "));
    }

    public int addTrack(Format format) {
        MediaFormat mediaFormat;
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        if (MimeTypes.isAudio(str)) {
            mediaFormat = MediaFormat.createAudioFormat((String) Util.castNonNull(str), format.sampleRate, format.channelCount);
        } else {
            mediaFormat = MediaFormat.createVideoFormat((String) Util.castNonNull(str), format.width, format.height);
            this.mediaMuxer.setOrientationHint(format.rotationDegrees);
        }
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        return this.mediaMuxer.addTrack(mediaFormat);
    }

    public void release(boolean z) {
        if (!this.isStarted) {
            this.mediaMuxer.release();
            return;
        }
        this.isStarted = false;
        try {
            this.mediaMuxer.stop();
        } catch (IllegalStateException e) {
            if (Util.SDK_INT < 30) {
                try {
                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    int intValue = ((Integer) Util.castNonNull((Integer) declaredField.get(this.mediaMuxer))).intValue();
                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.mediaMuxer, Integer.valueOf(intValue));
                } catch (Exception unused) {
                }
            }
            if (!z) {
                throw e;
            }
        } catch (Throwable th) {
            this.mediaMuxer.release();
            throw th;
        }
        this.mediaMuxer.release();
    }

    public boolean supportsSampleMimeType(String str) {
        int i;
        boolean isAudio = MimeTypes.isAudio(str);
        boolean isVideo = MimeTypes.isVideo(str);
        if (this.outputMimeType.equals(MimeTypes.VIDEO_MP4)) {
            if (isVideo) {
                if (MimeTypes.VIDEO_H263.equals(str) || MimeTypes.VIDEO_H264.equals(str) || MimeTypes.VIDEO_MP4V.equals(str)) {
                    return true;
                }
                if (Util.SDK_INT < 24 || !MimeTypes.VIDEO_H265.equals(str)) {
                    return false;
                }
                return true;
            } else if (isAudio) {
                if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_AMR_NB.equals(str) || MimeTypes.AUDIO_AMR_WB.equals(str)) {
                    return true;
                }
                return false;
            }
        } else if (this.outputMimeType.equals(MimeTypes.VIDEO_WEBM) && (i = Util.SDK_INT) >= 21) {
            if (isVideo) {
                if (MimeTypes.VIDEO_VP8.equals(str)) {
                    return true;
                }
                if (i < 24 || !MimeTypes.VIDEO_VP9.equals(str)) {
                    return false;
                }
                return true;
            } else if (isAudio) {
                return MimeTypes.AUDIO_VORBIS.equals(str);
            }
        }
        return false;
    }

    public void writeSampleData(int i, ByteBuffer byteBuffer, boolean z, long j) {
        if (!this.isStarted) {
            this.isStarted = true;
            this.mediaMuxer.start();
        }
        int position = byteBuffer.position();
        this.bufferInfo.set(position, byteBuffer.limit() - position, j, z ? 1 : 0);
        this.mediaMuxer.writeSampleData(i, byteBuffer, this.bufferInfo);
    }

    public static final class Factory implements Muxer.Factory {
        public boolean supportsOutputMimeType(String str) {
            try {
                int unused = FrameworkMuxer.mimeTypeToMuxerOutputFormat(str);
                return true;
            } catch (IllegalStateException unused2) {
                return false;
            }
        }

        public FrameworkMuxer create(String str, String str2) throws IOException {
            return new FrameworkMuxer(new MediaMuxer(str, FrameworkMuxer.mimeTypeToMuxerOutputFormat(str2)), str2);
        }

        public FrameworkMuxer create(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
            return new FrameworkMuxer(new MediaMuxer(parcelFileDescriptor.getFileDescriptor(), FrameworkMuxer.mimeTypeToMuxerOutputFormat(str)), str);
        }
    }

    private FrameworkMuxer(MediaMuxer mediaMuxer2, String str) {
        this.mediaMuxer = mediaMuxer2;
        this.outputMimeType = str;
        this.bufferInfo = new MediaCodec.BufferInfo();
    }
}
