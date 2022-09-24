package com.google.android.exoplayer2.transformer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C6580h1;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.transformer.FrameworkMuxer;
import com.google.android.exoplayer2.transformer.Muxer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public final class Transformer {
    public static final int PROGRESS_STATE_AVAILABLE = 1;
    public static final int PROGRESS_STATE_NO_TRANSFORMATION = 4;
    public static final int PROGRESS_STATE_UNAVAILABLE = 2;
    public static final int PROGRESS_STATE_WAITING_FOR_AVAILABILITY = 0;
    /* access modifiers changed from: private */
    public final Clock clock;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public Listener listener;
    /* access modifiers changed from: private */
    public final Looper looper;
    /* access modifiers changed from: private */
    public final MediaSourceFactory mediaSourceFactory;
    /* access modifiers changed from: private */
    public final Muxer.Factory muxerFactory;
    private MuxerWrapper muxerWrapper;
    /* access modifiers changed from: private */
    public SimpleExoPlayer player;
    /* access modifiers changed from: private */
    public int progressState;
    /* access modifiers changed from: private */
    public final Transformation transformation;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressState {
    }

    public static final class Builder {
        private Clock clock;
        private Context context;
        private boolean flattenForSlowMotion;
        private Listener listener;
        private Looper looper;
        private MediaSourceFactory mediaSourceFactory;
        private Muxer.Factory muxerFactory;
        private String outputMimeType;
        private boolean removeAudio;
        private boolean removeVideo;

        public Transformer build() {
            Assertions.checkStateNotNull(this.context);
            if (this.mediaSourceFactory == null) {
                DefaultExtractorsFactory defaultExtractorsFactory = new DefaultExtractorsFactory();
                if (this.flattenForSlowMotion) {
                    defaultExtractorsFactory.setMp4ExtractorFlags(4);
                }
                this.mediaSourceFactory = new DefaultMediaSourceFactory(this.context, (ExtractorsFactory) defaultExtractorsFactory);
            }
            boolean supportsOutputMimeType = this.muxerFactory.supportsOutputMimeType(this.outputMimeType);
            String valueOf = String.valueOf(this.outputMimeType);
            Assertions.checkState(supportsOutputMimeType, valueOf.length() != 0 ? "Unsupported output MIME type: ".concat(valueOf) : new String("Unsupported output MIME type: "));
            return new Transformer(this.context, this.mediaSourceFactory, this.muxerFactory, new Transformation(this.removeAudio, this.removeVideo, this.flattenForSlowMotion, this.outputMimeType), this.listener, this.looper, this.clock);
        }

        /* access modifiers changed from: package-private */
        public Builder setClock(Clock clock2) {
            this.clock = clock2;
            return this;
        }

        public Builder setContext(Context context2) {
            this.context = context2.getApplicationContext();
            return this;
        }

        public Builder setFlattenForSlowMotion(boolean z) {
            this.flattenForSlowMotion = z;
            return this;
        }

        public Builder setListener(Listener listener2) {
            this.listener = listener2;
            return this;
        }

        public Builder setLooper(Looper looper2) {
            this.looper = looper2;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSourceFactory mediaSourceFactory2) {
            this.mediaSourceFactory = mediaSourceFactory2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setMuxerFactory(Muxer.Factory factory) {
            this.muxerFactory = factory;
            return this;
        }

        public Builder setOutputMimeType(String str) {
            this.outputMimeType = str;
            return this;
        }

        public Builder setRemoveAudio(boolean z) {
            this.removeAudio = z;
            return this;
        }

        public Builder setRemoveVideo(boolean z) {
            this.removeVideo = z;
            return this;
        }

        public Builder() {
            this.muxerFactory = new FrameworkMuxer.Factory();
            this.outputMimeType = MimeTypes.VIDEO_MP4;
            this.listener = new Listener(this) {
                public /* synthetic */ void onTransformationCompleted(MediaItem mediaItem) {
                    C6928a.m28680a(this, mediaItem);
                }

                public /* synthetic */ void onTransformationError(MediaItem mediaItem, Exception exc) {
                    C6928a.m28681b(this, mediaItem, exc);
                }
            };
            this.looper = Util.getCurrentOrMainLooper();
            this.clock = Clock.DEFAULT;
        }

        private Builder(Transformer transformer) {
            this.context = transformer.context;
            this.mediaSourceFactory = transformer.mediaSourceFactory;
            this.muxerFactory = transformer.muxerFactory;
            this.removeAudio = transformer.transformation.removeAudio;
            this.removeVideo = transformer.transformation.removeVideo;
            this.flattenForSlowMotion = transformer.transformation.flattenForSlowMotion;
            this.outputMimeType = transformer.transformation.outputMimeType;
            this.listener = transformer.listener;
            this.looper = transformer.looper;
            this.clock = transformer.clock;
        }
    }

    public interface Listener {
        void onTransformationCompleted(MediaItem mediaItem);

        void onTransformationError(MediaItem mediaItem, Exception exc);
    }

    private final class TransformerAnalyticsListener implements AnalyticsListener {
        private final MediaItem mediaItem;
        private final MuxerWrapper muxerWrapper;

        public TransformerAnalyticsListener(MediaItem mediaItem2, MuxerWrapper muxerWrapper2) {
            this.mediaItem = mediaItem2;
            this.muxerWrapper = muxerWrapper2;
        }

        private void handleTransformationEnded(Exception exc) {
            try {
                Transformer.this.releaseResources(false);
            } catch (IllegalStateException e) {
                if (exc == null) {
                    exc = e;
                }
            }
            if (exc == null) {
                Transformer.this.listener.onTransformationCompleted(this.mediaItem);
            } else {
                Transformer.this.listener.onTransformationError(this.mediaItem, exc);
            }
        }

        public /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
            C6580h1.m28431a(this, eventTime, audioAttributes);
        }

        public /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
            C6580h1.m28433b(this, eventTime, exc);
        }

        public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
            C6580h1.m28435c(this, eventTime, str, j);
        }

        public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
            C6580h1.m28437d(this, eventTime, str, j, j2);
        }

        public /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
            C6580h1.m28439e(this, eventTime, str);
        }

        public /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
            C6580h1.m28441f(this, eventTime, decoderCounters);
        }

        public /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
            C6580h1.m28443g(this, eventTime, decoderCounters);
        }

        public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
            C6580h1.m28445h(this, eventTime, format);
        }

        public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            C6580h1.m28447i(this, eventTime, format, decoderReuseEvaluation);
        }

        public /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
            C6580h1.m28449j(this, eventTime, j);
        }

        public /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
            C6580h1.m28451k(this, eventTime, i);
        }

        public /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
            C6580h1.m28453l(this, eventTime, exc);
        }

        public /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
            C6580h1.m28455m(this, eventTime, i, j, j2);
        }

        public /* synthetic */ void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
            C6580h1.m28457n(this, eventTime, i, j, j2);
        }

        public /* synthetic */ void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
            C6580h1.m28459o(this, eventTime, i, decoderCounters);
        }

        public /* synthetic */ void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
            C6580h1.m28461p(this, eventTime, i, decoderCounters);
        }

        public /* synthetic */ void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
            C6580h1.m28463q(this, eventTime, i, str, j);
        }

        public /* synthetic */ void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
            C6580h1.m28465r(this, eventTime, i, format);
        }

        public /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
            C6580h1.m28467s(this, eventTime, mediaLoadData);
        }

        public /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
            C6580h1.m28468t(this, eventTime);
        }

        public /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
            C6580h1.m28469u(this, eventTime);
        }

        public /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
            C6580h1.m28470v(this, eventTime);
        }

        public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
            C6580h1.m28471w(this, eventTime);
        }

        public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
            C6580h1.m28472x(this, eventTime, i);
        }

        public /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
            C6580h1.m28473y(this, eventTime, exc);
        }

        public /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
            C6580h1.m28474z(this, eventTime);
        }

        public /* synthetic */ void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
            C6580h1.m28405A(this, eventTime, i, j);
        }

        public /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
            C6580h1.m28406B(this, player, events);
        }

        public /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            C6580h1.m28407C(this, eventTime, z);
        }

        public /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            C6580h1.m28408D(this, eventTime, z);
        }

        public /* synthetic */ void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            C6580h1.m28409E(this, eventTime, loadEventInfo, mediaLoadData);
        }

        public /* synthetic */ void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            C6580h1.m28410F(this, eventTime, loadEventInfo, mediaLoadData);
        }

        public /* synthetic */ void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            C6580h1.m28411G(this, eventTime, loadEventInfo, mediaLoadData, iOException, z);
        }

        public /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            C6580h1.m28412H(this, eventTime, loadEventInfo, mediaLoadData);
        }

        public /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            C6580h1.m28413I(this, eventTime, z);
        }

        public /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem2, int i) {
            C6580h1.m28414J(this, eventTime, mediaItem2, i);
        }

        public /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
            C6580h1.m28415K(this, eventTime, mediaMetadata);
        }

        public /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
            C6580h1.m28416L(this, eventTime, metadata);
        }

        public /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
            C6580h1.m28417M(this, eventTime, z, i);
        }

        public /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
            C6580h1.m28418N(this, eventTime, playbackParameters);
        }

        public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
            if (i == 4) {
                handleTransformationEnded((Exception) null);
            }
        }

        public /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
            C6580h1.m28420P(this, eventTime, i);
        }

        public void onPlayerError(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
            handleTransformationEnded(exoPlaybackException);
        }

        public /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
            C6580h1.m28422R(this, eventTime);
        }

        public /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
            C6580h1.m28423S(this, eventTime, z, i);
        }

        public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
            C6580h1.m28424T(this, eventTime, i);
        }

        public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            C6580h1.m28425U(this, eventTime, positionInfo, positionInfo2, i);
        }

        public /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
            C6580h1.m28426V(this, eventTime, obj, j);
        }

        public /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
            C6580h1.m28427W(this, eventTime, i);
        }

        public /* synthetic */ void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
            C6580h1.m28428X(this, eventTime);
        }

        public /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            C6580h1.m28429Y(this, eventTime);
        }

        public /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            C6580h1.m28430Z(this, eventTime, z);
        }

        public /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            C6580h1.m28432a0(this, eventTime, z);
        }

        public /* synthetic */ void onStaticMetadataChanged(AnalyticsListener.EventTime eventTime, List list) {
            C6580h1.m28434b0(this, eventTime, list);
        }

        public /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
            C6580h1.m28436c0(this, eventTime, i, i2);
        }

        public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
            if (Transformer.this.progressState == 0) {
                Timeline.Window window = new Timeline.Window();
                eventTime.timeline.getWindow(0, window);
                if (!window.isPlaceholder) {
                    long j = window.durationUs;
                    int unused = Transformer.this.progressState = (j <= 0 || j == C6540C.TIME_UNSET) ? 2 : 1;
                    ((SimpleExoPlayer) Assertions.checkNotNull(Transformer.this.player)).play();
                }
            }
        }

        public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            if (this.muxerWrapper.getTrackCount() == 0) {
                handleTransformationEnded(new IllegalStateException("The output does not contain any tracks. Check that at least one of the input sample formats is supported."));
            }
        }

        public /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
            C6580h1.m28442f0(this, eventTime, mediaLoadData);
        }

        public /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
            C6580h1.m28444g0(this, eventTime, exc);
        }

        public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
            C6580h1.m28446h0(this, eventTime, str, j);
        }

        public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
            C6580h1.m28448i0(this, eventTime, str, j, j2);
        }

        public /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
            C6580h1.m28450j0(this, eventTime, str);
        }

        public /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
            C6580h1.m28452k0(this, eventTime, decoderCounters);
        }

        public /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
            C6580h1.m28454l0(this, eventTime, decoderCounters);
        }

        public /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
            C6580h1.m28456m0(this, eventTime, j, i);
        }

        public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
            C6580h1.m28458n0(this, eventTime, format);
        }

        public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            C6580h1.m28460o0(this, eventTime, format, decoderReuseEvaluation);
        }

        public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
            C6580h1.m28462p0(this, eventTime, i, i2, i3, f);
        }

        public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
            C6580h1.m28464q0(this, eventTime, videoSize);
        }

        public /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
            C6580h1.m28466r0(this, eventTime, f);
        }
    }

    private static final class TransformerRenderersFactory implements RenderersFactory {
        private final TransformerMediaClock mediaClock = new TransformerMediaClock();
        private final MuxerWrapper muxerWrapper;
        private final Transformation transformation;

        public TransformerRenderersFactory(MuxerWrapper muxerWrapper2, Transformation transformation2) {
            this.muxerWrapper = muxerWrapper2;
            this.transformation = transformation2;
        }

        public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
            Transformation transformation2 = this.transformation;
            boolean z = transformation2.removeAudio;
            char c = 1;
            Renderer[] rendererArr = new Renderer[((z || transformation2.removeVideo) ? 1 : 2)];
            if (!z) {
                rendererArr[0] = new TransformerAudioRenderer(this.muxerWrapper, this.mediaClock, transformation2);
            } else {
                c = 0;
            }
            Transformation transformation3 = this.transformation;
            if (!transformation3.removeVideo) {
                rendererArr[c] = new TransformerVideoRenderer(this.muxerWrapper, this.mediaClock, transformation3);
            }
            return rendererArr;
        }
    }

    /* access modifiers changed from: private */
    public void releaseResources(boolean z) {
        verifyApplicationThread();
        SimpleExoPlayer simpleExoPlayer = this.player;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.release();
            this.player = null;
        }
        MuxerWrapper muxerWrapper2 = this.muxerWrapper;
        if (muxerWrapper2 != null) {
            muxerWrapper2.release(z);
            this.muxerWrapper = null;
        }
        this.progressState = 4;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() != this.looper) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public void cancel() {
        releaseResources(true);
    }

    public Looper getApplicationLooper() {
        return this.looper;
    }

    public int getProgress(ProgressHolder progressHolder) {
        verifyApplicationThread();
        if (this.progressState == 1) {
            Player player2 = (Player) Assertions.checkNotNull(this.player);
            progressHolder.progress = Math.min((int) ((player2.getCurrentPosition() * 100) / player2.getDuration()), 99);
        }
        return this.progressState;
    }

    public void setListener(Listener listener2) {
        verifyApplicationThread();
        this.listener = listener2;
    }

    public void startTransformation(MediaItem mediaItem, String str) throws IOException {
        startTransformation(mediaItem, this.muxerFactory.create(str, this.transformation.outputMimeType));
    }

    private Transformer(Context context2, MediaSourceFactory mediaSourceFactory2, Muxer.Factory factory, Transformation transformation2, Listener listener2, Looper looper2, Clock clock2) {
        Assertions.checkState(!transformation2.removeAudio || !transformation2.removeVideo, "Audio and video cannot both be removed.");
        this.context = context2;
        this.mediaSourceFactory = mediaSourceFactory2;
        this.muxerFactory = factory;
        this.transformation = transformation2;
        this.listener = listener2;
        this.looper = looper2;
        this.clock = clock2;
        this.progressState = 4;
    }

    public void startTransformation(MediaItem mediaItem, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        startTransformation(mediaItem, this.muxerFactory.create(parcelFileDescriptor, this.transformation.outputMimeType));
    }

    private void startTransformation(MediaItem mediaItem, Muxer muxer) {
        verifyApplicationThread();
        if (this.player == null) {
            MuxerWrapper muxerWrapper2 = new MuxerWrapper(muxer);
            this.muxerWrapper = muxerWrapper2;
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(this.context);
            defaultTrackSelector.setParameters(new DefaultTrackSelector.ParametersBuilder(this.context).setForceHighestSupportedBitrate(true).build());
            SimpleExoPlayer build = new SimpleExoPlayer.Builder(this.context, (RenderersFactory) new TransformerRenderersFactory(muxerWrapper2, this.transformation)).setMediaSourceFactory(this.mediaSourceFactory).setTrackSelector(defaultTrackSelector).setLoadControl(new DefaultLoadControl.Builder().setBufferDurationsMs(50000, 50000, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 500).build()).setLooper(this.looper).setClock(this.clock).build();
            this.player = build;
            build.setMediaItem(mediaItem);
            this.player.addAnalyticsListener(new TransformerAnalyticsListener(mediaItem, muxerWrapper2));
            this.player.prepare();
            this.progressState = 0;
            return;
        }
        throw new IllegalStateException("There is already a transformation in progress.");
    }
}
