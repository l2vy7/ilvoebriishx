package com.google.android.exoplayer2.ext.ima;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p039v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p039v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p039v3.api.AdEvent;
import com.google.ads.interactivemedia.p039v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p039v3.api.AdsRequest;
import com.google.ads.interactivemedia.p039v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p039v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p039v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.p039v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.p039v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p039v3.api.UiElement;
import com.google.ads.interactivemedia.p039v3.api.player.VideoAdPlayer;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.C6808p0;
import com.google.android.exoplayer2.C6810q0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.C6628b;
import com.google.android.exoplayer2.device.C6651b;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.ext.ima.ImaUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p041ui.AdViewProvider;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.C7020a;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.C4766t;
import com.google.common.collect.C4789y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public final class ImaAdsLoader implements Player.Listener, AdsLoader {
    private final HashMap<Object, AdTagLoader> adTagLoaderByAdsId;
    private final HashMap<AdsMediaSource, AdTagLoader> adTagLoaderByAdsMediaSource;
    private final ImaUtil.Configuration configuration;
    private final Context context;
    private AdTagLoader currentAdTagLoader;
    private final ImaUtil.ImaFactory imaFactory;
    private Player nextPlayer;
    private final Timeline.Period period;
    private Player player;
    private List<String> supportedMimeTypes;
    private boolean wasSetPlayerCalled;
    private final Timeline.Window window;

    public static final class Builder {
        public static final long DEFAULT_AD_PRELOAD_TIMEOUT_MS = 10000;
        private AdErrorEvent.AdErrorListener adErrorListener;
        private AdEvent.AdEventListener adEventListener;
        private List<String> adMediaMimeTypes;
        private long adPreloadTimeoutMs = DEFAULT_AD_PRELOAD_TIMEOUT_MS;
        private Set<UiElement> adUiElements;
        private Collection<CompanionAdSlot> companionAdSlots;
        private final Context context;
        private boolean debugModeEnabled;
        private Boolean enableContinuousPlayback;
        private boolean focusSkipButtonWhenAvailable = true;
        private ImaUtil.ImaFactory imaFactory = new DefaultImaFactory();
        private ImaSdkSettings imaSdkSettings;
        private int mediaBitrate = -1;
        private int mediaLoadTimeoutMs = -1;
        private boolean playAdBeforeStartPosition = true;
        private int vastLoadTimeoutMs = -1;
        private VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback;

        public Builder(Context context2) {
            this.context = ((Context) Assertions.checkNotNull(context2)).getApplicationContext();
        }

        public ImaAdsLoader build() {
            Context context2 = this.context;
            ImaUtil.Configuration configuration = r3;
            ImaUtil.Configuration configuration2 = new ImaUtil.Configuration(this.adPreloadTimeoutMs, this.vastLoadTimeoutMs, this.mediaLoadTimeoutMs, this.focusSkipButtonWhenAvailable, this.playAdBeforeStartPosition, this.mediaBitrate, this.enableContinuousPlayback, this.adMediaMimeTypes, this.adUiElements, this.companionAdSlots, this.adErrorListener, this.adEventListener, this.videoAdPlayerCallback, this.imaSdkSettings, this.debugModeEnabled);
            return new ImaAdsLoader(context2, configuration, this.imaFactory);
        }

        public Builder setAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener2) {
            this.adErrorListener = (AdErrorEvent.AdErrorListener) Assertions.checkNotNull(adErrorListener2);
            return this;
        }

        public Builder setAdEventListener(AdEvent.AdEventListener adEventListener2) {
            this.adEventListener = (AdEvent.AdEventListener) Assertions.checkNotNull(adEventListener2);
            return this;
        }

        public Builder setAdMediaMimeTypes(List<String> list) {
            this.adMediaMimeTypes = C4766t.m21988y((Collection) Assertions.checkNotNull(list));
            return this;
        }

        public Builder setAdPreloadTimeoutMs(long j) {
            Assertions.checkArgument(j == C6540C.TIME_UNSET || j > 0);
            this.adPreloadTimeoutMs = j;
            return this;
        }

        public Builder setAdUiElements(Set<UiElement> set) {
            this.adUiElements = C4789y.m22104v((Collection) Assertions.checkNotNull(set));
            return this;
        }

        public Builder setCompanionAdSlots(Collection<CompanionAdSlot> collection) {
            this.companionAdSlots = C4766t.m21988y((Collection) Assertions.checkNotNull(collection));
            return this;
        }

        public Builder setDebugModeEnabled(boolean z) {
            this.debugModeEnabled = z;
            return this;
        }

        public Builder setEnableContinuousPlayback(boolean z) {
            this.enableContinuousPlayback = Boolean.valueOf(z);
            return this;
        }

        public Builder setFocusSkipButtonWhenAvailable(boolean z) {
            this.focusSkipButtonWhenAvailable = z;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setImaFactory(ImaUtil.ImaFactory imaFactory2) {
            this.imaFactory = (ImaUtil.ImaFactory) Assertions.checkNotNull(imaFactory2);
            return this;
        }

        public Builder setImaSdkSettings(ImaSdkSettings imaSdkSettings2) {
            this.imaSdkSettings = (ImaSdkSettings) Assertions.checkNotNull(imaSdkSettings2);
            return this;
        }

        public Builder setMaxMediaBitrate(int i) {
            Assertions.checkArgument(i > 0);
            this.mediaBitrate = i;
            return this;
        }

        public Builder setMediaLoadTimeoutMs(int i) {
            Assertions.checkArgument(i > 0);
            this.mediaLoadTimeoutMs = i;
            return this;
        }

        public Builder setPlayAdBeforeStartPosition(boolean z) {
            this.playAdBeforeStartPosition = z;
            return this;
        }

        public Builder setVastLoadTimeoutMs(int i) {
            Assertions.checkArgument(i > 0);
            this.vastLoadTimeoutMs = i;
            return this;
        }

        public Builder setVideoAdPlayerCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback2) {
            this.videoAdPlayerCallback = (VideoAdPlayer.VideoAdPlayerCallback) Assertions.checkNotNull(videoAdPlayerCallback2);
            return this;
        }
    }

    private static final class DefaultImaFactory implements ImaUtil.ImaFactory {
        private DefaultImaFactory() {
        }

        public AdDisplayContainer createAdDisplayContainer(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAdDisplayContainer(viewGroup, videoAdPlayer);
        }

        public com.google.ads.interactivemedia.p039v3.api.AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
            return ImaSdkFactory.getInstance().createAdsLoader(context, imaSdkSettings, adDisplayContainer);
        }

        public AdsRenderingSettings createAdsRenderingSettings() {
            return ImaSdkFactory.getInstance().createAdsRenderingSettings();
        }

        public AdsRequest createAdsRequest() {
            return ImaSdkFactory.getInstance().createAdsRequest();
        }

        public AdDisplayContainer createAudioAdDisplayContainer(Context context, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAudioAdDisplayContainer(context, videoAdPlayer);
        }

        public FriendlyObstruction createFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
            return ImaSdkFactory.getInstance().createFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }

        public ImaSdkSettings createImaSdkSettings() {
            ImaSdkSettings createImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
            createImaSdkSettings.setLanguage(Util.getSystemLanguageCodes()[0]);
            return createImaSdkSettings;
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ima");
    }

    private AdTagLoader getCurrentAdTagLoader() {
        Object adsId;
        AdTagLoader adTagLoader;
        Player player2 = this.player;
        if (player2 == null) {
            return null;
        }
        Timeline currentTimeline = player2.getCurrentTimeline();
        if (!currentTimeline.isEmpty() && (adsId = currentTimeline.getPeriod(player2.getCurrentPeriodIndex(), this.period).getAdsId()) != null && (adTagLoader = this.adTagLoaderByAdsId.get(adsId)) != null && this.adTagLoaderByAdsMediaSource.containsValue(adTagLoader)) {
            return adTagLoader;
        }
        return null;
    }

    private void maybePreloadNextPeriodAds() {
        int nextPeriodIndex;
        AdTagLoader adTagLoader;
        Player player2 = this.player;
        if (player2 != null) {
            Timeline currentTimeline = player2.getCurrentTimeline();
            if (!currentTimeline.isEmpty() && (nextPeriodIndex = currentTimeline.getNextPeriodIndex(player2.getCurrentPeriodIndex(), this.period, this.window, player2.getRepeatMode(), player2.getShuffleModeEnabled())) != -1) {
                currentTimeline.getPeriod(nextPeriodIndex, this.period);
                Object adsId = this.period.getAdsId();
                if (adsId != null && (adTagLoader = this.adTagLoaderByAdsId.get(adsId)) != null && adTagLoader != this.currentAdTagLoader) {
                    Timeline.Window window2 = this.window;
                    Timeline.Period period2 = this.period;
                    adTagLoader.maybePreloadAds(C6540C.usToMs(((Long) currentTimeline.getPeriodPosition(window2, period2, period2.windowIndex, C6540C.TIME_UNSET).second).longValue()), C6540C.usToMs(this.period.durationUs));
                }
            }
        }
    }

    private void maybeUpdateCurrentAdTagLoader() {
        AdTagLoader adTagLoader = this.currentAdTagLoader;
        AdTagLoader currentAdTagLoader2 = getCurrentAdTagLoader();
        if (!Util.areEqual(adTagLoader, currentAdTagLoader2)) {
            if (adTagLoader != null) {
                adTagLoader.deactivate();
            }
            this.currentAdTagLoader = currentAdTagLoader2;
            if (currentAdTagLoader2 != null) {
                currentAdTagLoader2.activate((Player) Assertions.checkNotNull(this.player));
            }
        }
    }

    public void focusSkipButton() {
        AdTagLoader adTagLoader = this.currentAdTagLoader;
        if (adTagLoader != null) {
            adTagLoader.focusSkipButton();
        }
    }

    public AdDisplayContainer getAdDisplayContainer() {
        AdTagLoader adTagLoader = this.currentAdTagLoader;
        if (adTagLoader != null) {
            return adTagLoader.getAdDisplayContainer();
        }
        return null;
    }

    public com.google.ads.interactivemedia.p039v3.api.AdsLoader getAdsLoader() {
        AdTagLoader adTagLoader = this.currentAdTagLoader;
        if (adTagLoader != null) {
            return adTagLoader.getAdsLoader();
        }
        return null;
    }

    public void handlePrepareComplete(AdsMediaSource adsMediaSource, int i, int i2) {
        if (this.player != null) {
            ((AdTagLoader) Assertions.checkNotNull(this.adTagLoaderByAdsMediaSource.get(adsMediaSource))).handlePrepareComplete(i, i2);
        }
    }

    public void handlePrepareError(AdsMediaSource adsMediaSource, int i, int i2, IOException iOException) {
        if (this.player != null) {
            ((AdTagLoader) Assertions.checkNotNull(this.adTagLoaderByAdsMediaSource.get(adsMediaSource))).handlePrepareError(i, i2, iOException);
        }
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

    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        C6808p0.m28590h(this, z, i);
    }

    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        C6808p0.m28591i(this, playbackParameters);
    }

    public /* synthetic */ void onPlaybackStateChanged(int i) {
        C6808p0.m28592j(this, i);
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

    public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        maybeUpdateCurrentAdTagLoader();
        maybePreloadNextPeriodAds();
    }

    public /* synthetic */ void onRenderedFirstFrame() {
        C7020a.m28755a(this);
    }

    public void onRepeatModeChanged(int i) {
        maybePreloadNextPeriodAds();
    }

    public /* synthetic */ void onSeekProcessed() {
        C6808p0.m28599q(this);
    }

    public void onShuffleModeEnabledChanged(boolean z) {
        maybePreloadNextPeriodAds();
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

    public void onTimelineChanged(Timeline timeline, int i) {
        if (!timeline.isEmpty()) {
            maybeUpdateCurrentAdTagLoader();
            maybePreloadNextPeriodAds();
        }
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

    public void release() {
        Player player2 = this.player;
        if (player2 != null) {
            player2.removeListener((Player.Listener) this);
            this.player = null;
            maybeUpdateCurrentAdTagLoader();
        }
        this.nextPlayer = null;
        for (AdTagLoader release : this.adTagLoaderByAdsMediaSource.values()) {
            release.release();
        }
        this.adTagLoaderByAdsMediaSource.clear();
        for (AdTagLoader release2 : this.adTagLoaderByAdsId.values()) {
            release2.release();
        }
        this.adTagLoaderByAdsId.clear();
    }

    public void requestAds(DataSpec dataSpec, Object obj, ViewGroup viewGroup) {
        if (!this.adTagLoaderByAdsId.containsKey(obj)) {
            this.adTagLoaderByAdsId.put(obj, new AdTagLoader(this.context, this.configuration, this.imaFactory, this.supportedMimeTypes, dataSpec, obj, viewGroup));
        }
    }

    public void setPlayer(Player player2) {
        boolean z = false;
        Assertions.checkState(Looper.myLooper() == ImaUtil.getImaLooper());
        if (player2 == null || player2.getApplicationLooper() == ImaUtil.getImaLooper()) {
            z = true;
        }
        Assertions.checkState(z);
        this.nextPlayer = player2;
        this.wasSetPlayerCalled = true;
    }

    public void setSupportedContentTypes(int... iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i == 0) {
                arrayList.add(MimeTypes.APPLICATION_MPD);
            } else if (i == 2) {
                arrayList.add(MimeTypes.APPLICATION_M3U8);
            } else if (i == 4) {
                arrayList.addAll(Arrays.asList(new String[]{MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_WEBM, MimeTypes.VIDEO_H263, MimeTypes.AUDIO_MP4, MimeTypes.AUDIO_MPEG}));
            }
        }
        this.supportedMimeTypes = Collections.unmodifiableList(arrayList);
    }

    public void skipAd() {
        AdTagLoader adTagLoader = this.currentAdTagLoader;
        if (adTagLoader != null) {
            adTagLoader.skipAd();
        }
    }

    public void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        Assertions.checkState(this.wasSetPlayerCalled, "Set player using adsLoader.setPlayer before preparing the player.");
        if (this.adTagLoaderByAdsMediaSource.isEmpty()) {
            Player player2 = this.nextPlayer;
            this.player = player2;
            if (player2 != null) {
                player2.addListener((Player.Listener) this);
            } else {
                return;
            }
        }
        AdTagLoader adTagLoader = this.adTagLoaderByAdsId.get(obj);
        if (adTagLoader == null) {
            requestAds(dataSpec, obj, adViewProvider.getAdViewGroup());
            adTagLoader = this.adTagLoaderByAdsId.get(obj);
        }
        this.adTagLoaderByAdsMediaSource.put(adsMediaSource, (AdTagLoader) Assertions.checkNotNull(adTagLoader));
        adTagLoader.addListenerWithAdView(eventListener, adViewProvider);
        maybeUpdateCurrentAdTagLoader();
    }

    public void stop(AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        AdTagLoader remove = this.adTagLoaderByAdsMediaSource.remove(adsMediaSource);
        maybeUpdateCurrentAdTagLoader();
        if (remove != null) {
            remove.removeListener(eventListener);
        }
        if (this.player != null && this.adTagLoaderByAdsMediaSource.isEmpty()) {
            this.player.removeListener((Player.Listener) this);
            this.player = null;
        }
    }

    private ImaAdsLoader(Context context2, ImaUtil.Configuration configuration2, ImaUtil.ImaFactory imaFactory2) {
        this.context = context2.getApplicationContext();
        this.configuration = configuration2;
        this.imaFactory = imaFactory2;
        this.supportedMimeTypes = C4766t.m21978E();
        this.adTagLoaderByAdsId = new HashMap<>();
        this.adTagLoaderByAdsMediaSource = new HashMap<>();
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
    }
}
