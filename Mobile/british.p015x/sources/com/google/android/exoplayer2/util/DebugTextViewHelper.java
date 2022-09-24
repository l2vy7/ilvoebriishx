package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.exoplayer2.C6808p0;
import com.google.android.exoplayer2.C6810q0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.C6628b;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.device.C6651b;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.C7020a;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;
import java.util.Locale;

public class DebugTextViewHelper implements Player.Listener, Runnable {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final SimpleExoPlayer player;
    private boolean started;
    private final TextView textView;

    public DebugTextViewHelper(SimpleExoPlayer simpleExoPlayer, TextView textView2) {
        Assertions.checkArgument(simpleExoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = simpleExoPlayer;
        this.textView = textView2;
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        int i = decoderCounters.skippedInputBufferCount;
        int i2 = decoderCounters.skippedOutputBufferCount;
        int i3 = decoderCounters.renderedOutputBufferCount;
        int i4 = decoderCounters.droppedBufferCount;
        int i5 = decoderCounters.maxConsecutiveDroppedBufferCount;
        int i6 = decoderCounters.droppedToKeyframeCount;
        StringBuilder sb = new StringBuilder(93);
        sb.append(" sib:");
        sb.append(i);
        sb.append(" sb:");
        sb.append(i2);
        sb.append(" rb:");
        sb.append(i3);
        sb.append(" db:");
        sb.append(i4);
        sb.append(" mcdb:");
        sb.append(i5);
        sb.append(" dk:");
        sb.append(i6);
        return sb.toString();
    }

    private static String getPixelAspectRatioString(float f) {
        if (f == -1.0f || f == 1.0f) {
            return "";
        }
        String valueOf = String.valueOf(String.format(Locale.US, "%.02f", new Object[]{Float.valueOf(f)}));
        return valueOf.length() != 0 ? " par:".concat(valueOf) : new String(" par:");
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j, int i) {
        if (i == 0) {
            return "N/A";
        }
        double d = (double) j;
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        return String.valueOf((long) (d / d2));
    }

    /* access modifiers changed from: protected */
    public String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        String str = audioFormat.sampleMimeType;
        String str2 = audioFormat.f27194id;
        int i = audioFormat.sampleRate;
        int i2 = audioFormat.channelCount;
        String decoderCountersBufferCountString = getDecoderCountersBufferCountString(audioDecoderCounters);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(decoderCountersBufferCountString).length());
        sb.append("\n");
        sb.append(str);
        sb.append("(id:");
        sb.append(str2);
        sb.append(" hz:");
        sb.append(i);
        sb.append(" ch:");
        sb.append(i2);
        sb.append(decoderCountersBufferCountString);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String getDebugString() {
        String playerStateString = getPlayerStateString();
        String videoString = getVideoString();
        String audioString = getAudioString();
        StringBuilder sb = new StringBuilder(String.valueOf(playerStateString).length() + String.valueOf(videoString).length() + String.valueOf(audioString).length());
        sb.append(playerStateString);
        sb.append(videoString);
        sb.append(audioString);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s window:%s", new Object[]{Boolean.valueOf(this.player.getPlayWhenReady()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? C3791bd.UNKNOWN_CONTENT_TYPE : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.player.getCurrentWindowIndex())});
    }

    /* access modifiers changed from: protected */
    public String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        String str = videoFormat.sampleMimeType;
        String str2 = videoFormat.f27194id;
        int i = videoFormat.width;
        int i2 = videoFormat.height;
        String pixelAspectRatioString = getPixelAspectRatioString(videoFormat.pixelWidthHeightRatio);
        String decoderCountersBufferCountString = getDecoderCountersBufferCountString(videoDecoderCounters);
        String videoFrameProcessingOffsetAverageString = getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length() + String.valueOf(pixelAspectRatioString).length() + String.valueOf(decoderCountersBufferCountString).length() + String.valueOf(videoFrameProcessingOffsetAverageString).length());
        sb.append("\n");
        sb.append(str);
        sb.append("(id:");
        sb.append(str2);
        sb.append(" r:");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append(pixelAspectRatioString);
        sb.append(decoderCountersBufferCountString);
        sb.append(" vfpo: ");
        sb.append(videoFrameProcessingOffsetAverageString);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        C6628b.m28486a(this, audioAttributes);
    }

    public /* synthetic */ void onAudioSessionIdChanged(int i) {
        C6628b.m28487b(this, i);
    }

    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        C6808p0.m28583a(this, commands);
    }

    public /* synthetic */ void onCues(List list) {
        C6810q0.m28605a(this, list);
    }

    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        C6651b.m28507a(this, deviceInfo);
    }

    public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        C6651b.m28508b(this, i, z);
    }

    public /* synthetic */ void onEvents(Player player2, Player.Events events) {
        C6808p0.m28584b(this, player2, events);
    }

    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        C6808p0.m28585c(this, z);
    }

    public /* synthetic */ void onIsPlayingChanged(boolean z) {
        C6808p0.m28586d(this, z);
    }

    public /* synthetic */ void onLoadingChanged(boolean z) {
        C6808p0.m28587e(this, z);
    }

    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        C6808p0.m28588f(this, mediaItem, i);
    }

    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        C6808p0.m28589g(this, mediaMetadata);
    }

    public /* synthetic */ void onMetadata(Metadata metadata) {
        C6810q0.m28606b(this, metadata);
    }

    public final void onPlayWhenReadyChanged(boolean z, int i) {
        updateAndPost();
    }

    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        C6808p0.m28591i(this, playbackParameters);
    }

    public final void onPlaybackStateChanged(int i) {
        updateAndPost();
    }

    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        C6808p0.m28593k(this, i);
    }

    public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
        C6808p0.m28594l(this, exoPlaybackException);
    }

    public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        C6808p0.m28595m(this, z, i);
    }

    public /* synthetic */ void onPositionDiscontinuity(int i) {
        C6808p0.m28596n(this, i);
    }

    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        updateAndPost();
    }

    public /* synthetic */ void onRenderedFirstFrame() {
        C7020a.m28755a(this);
    }

    public /* synthetic */ void onRepeatModeChanged(int i) {
        C6808p0.m28598p(this, i);
    }

    public /* synthetic */ void onSeekProcessed() {
        C6808p0.m28599q(this);
    }

    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        C6808p0.m28600r(this, z);
    }

    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        C6628b.m28488c(this, z);
    }

    public /* synthetic */ void onStaticMetadataChanged(List list) {
        C6808p0.m28601s(this, list);
    }

    public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        C7020a.m28756b(this, i, i2);
    }

    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        C6808p0.m28602t(this, timeline, i);
    }

    public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
        C6808p0.m28603u(this, timeline, obj, i);
    }

    public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        C6808p0.m28604v(this, trackGroupArray, trackSelectionArray);
    }

    public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
        C7020a.m28757c(this, i, i2, i3, f);
    }

    public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        C7020a.m28758d(this, videoSize);
    }

    public /* synthetic */ void onVolumeChanged(float f) {
        C6628b.m28489d(this, f);
    }

    public final void run() {
        updateAndPost();
    }

    public final void start() {
        if (!this.started) {
            this.started = true;
            this.player.addListener((Player.Listener) this);
            updateAndPost();
        }
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener((Player.Listener) this);
            this.textView.removeCallbacks(this);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this);
        this.textView.postDelayed(this, 1000);
    }
}
