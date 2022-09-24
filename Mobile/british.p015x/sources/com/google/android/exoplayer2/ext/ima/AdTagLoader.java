package com.google.android.exoplayer2.ext.ima;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p039v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p039v3.api.AdError;
import com.google.ads.interactivemedia.p039v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p039v3.api.AdEvent;
import com.google.ads.interactivemedia.p039v3.api.AdPodInfo;
import com.google.ads.interactivemedia.p039v3.api.AdsLoader;
import com.google.ads.interactivemedia.p039v3.api.AdsManager;
import com.google.ads.interactivemedia.p039v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.p039v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p039v3.api.AdsRequest;
import com.google.ads.interactivemedia.p039v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p039v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p039v3.api.UiElement;
import com.google.ads.interactivemedia.p039v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p039v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.p039v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p039v3.api.player.VideoProgressUpdate;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.C6808p0;
import com.google.android.exoplayer2.C6810q0;
import com.google.android.exoplayer2.ExoPlaybackException;
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
import com.google.android.exoplayer2.p041ui.AdOverlayInfo;
import com.google.android.exoplayer2.p041ui.AdViewProvider;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.C7020a;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.C4716h;
import com.google.common.collect.C4745p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

final class AdTagLoader implements Player.Listener {
    private static final int AD_PROGRESS_UPDATE_INTERVAL_MS = 100;
    private static final int IMA_AD_STATE_NONE = 0;
    private static final int IMA_AD_STATE_PAUSED = 2;
    private static final int IMA_AD_STATE_PLAYING = 1;
    private static final long IMA_DURATION_UNSET = -1;
    private static final String IMA_SDK_SETTINGS_PLAYER_TYPE = "google/exo.ext.ima";
    private static final String IMA_SDK_SETTINGS_PLAYER_VERSION = "2.14.0";
    private static final String TAG = "AdTagLoader";
    private static final long THRESHOLD_AD_MATCH_US = 1000;
    private static final long THRESHOLD_AD_PRELOAD_MS = 4000;
    private static final long THRESHOLD_END_OF_CONTENT_MS = 5000;
    /* access modifiers changed from: private */
    public final List<VideoAdPlayer.VideoAdPlayerCallback> adCallbacks;
    private final AdDisplayContainer adDisplayContainer;
    private final C4716h<AdMediaInfo, AdInfo> adInfoByAdMediaInfo;
    /* access modifiers changed from: private */
    public AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    /* access modifiers changed from: private */
    public final Object adsId;
    private final AdsLoader adsLoader;
    /* access modifiers changed from: private */
    public AdsManager adsManager;
    private boolean bufferingAd;
    private final ComponentListener componentListener;
    /* access modifiers changed from: private */
    public final ImaUtil.Configuration configuration;
    private long contentDurationMs;
    private final List<AdsLoader.EventListener> eventListeners;
    private long fakeContentProgressElapsedRealtimeMs;
    private long fakeContentProgressOffsetMs;
    private final Handler handler;
    private AdInfo imaAdInfo;
    private AdMediaInfo imaAdMediaInfo;
    private int imaAdState;
    private final ImaUtil.ImaFactory imaFactory;
    private boolean imaPausedContent;
    private boolean isAdsManagerInitialized;
    private VideoProgressUpdate lastAdProgress;
    private VideoProgressUpdate lastContentProgress;
    private int lastVolumePercent;
    /* access modifiers changed from: private */
    public AdsMediaSource.AdLoadException pendingAdLoadError;
    private AdInfo pendingAdPrepareErrorAdInfo;
    /* access modifiers changed from: private */
    public Object pendingAdRequestContext;
    /* access modifiers changed from: private */
    public long pendingContentPositionMs;
    private final Timeline.Period period;
    /* access modifiers changed from: private */
    public Player player;
    private boolean playingAd;
    private int playingAdIndexInAdGroup;
    private boolean released;
    private boolean sentContentComplete;
    private boolean sentPendingContentPositionMs;
    private final List<String> supportedMimeTypes;
    private Timeline timeline;
    private final Runnable updateAdProgressRunnable;
    /* access modifiers changed from: private */
    public long waitingForPreloadElapsedRealtimeMs;

    /* renamed from: com.google.android.exoplayer2.ext.ima.AdTagLoader$1 */
    static /* synthetic */ class C66811 {

        /* renamed from: $SwitchMap$com$google$ads$interactivemedia$v3$api$AdEvent$AdEventType */
        static final /* synthetic */ int[] f27405x68022ad9;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType[] r0 = com.google.ads.interactivemedia.p039v3.api.AdEvent.AdEventType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27405x68022ad9 = r0
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.p039v3.api.AdEvent.AdEventType.AD_BREAK_FETCH_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27405x68022ad9     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.p039v3.api.AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27405x68022ad9     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.p039v3.api.AdEvent.AdEventType.TAPPED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27405x68022ad9     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.p039v3.api.AdEvent.AdEventType.CLICKED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27405x68022ad9     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.p039v3.api.AdEvent.AdEventType.CONTENT_RESUME_REQUESTED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27405x68022ad9     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = com.google.ads.interactivemedia.p039v3.api.AdEvent.AdEventType.LOG     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ext.ima.AdTagLoader.C66811.<clinit>():void");
        }
    }

    private static final class AdInfo {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;

        public AdInfo(int i, int i2) {
            this.adGroupIndex = i;
            this.adIndexInAdGroup = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdInfo.class != obj.getClass()) {
                return false;
            }
            AdInfo adInfo = (AdInfo) obj;
            if (this.adGroupIndex == adInfo.adGroupIndex && this.adIndexInAdGroup == adInfo.adIndexInAdGroup) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.adGroupIndex * 31) + this.adIndexInAdGroup;
        }

        public String toString() {
            int i = this.adGroupIndex;
            int i2 = this.adIndexInAdGroup;
            StringBuilder sb = new StringBuilder(26);
            sb.append("(");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(')');
            return sb.toString();
        }
    }

    private final class ComponentListener implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {
        private ComponentListener() {
        }

        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            AdTagLoader.this.adCallbacks.add(videoAdPlayerCallback);
        }

        public VideoProgressUpdate getAdProgress() {
            throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
        }

        public VideoProgressUpdate getContentProgress() {
            VideoProgressUpdate access$800 = AdTagLoader.this.getContentVideoProgressUpdate();
            if (AdTagLoader.this.configuration.debugModeEnabled) {
                String valueOf = String.valueOf(ImaUtil.getStringForVideoProgressUpdate(access$800));
                Log.m19791d(AdTagLoader.TAG, valueOf.length() != 0 ? "Content progress: ".concat(valueOf) : new String("Content progress: "));
            }
            if (AdTagLoader.this.waitingForPreloadElapsedRealtimeMs != C6540C.TIME_UNSET) {
                if (SystemClock.elapsedRealtime() - AdTagLoader.this.waitingForPreloadElapsedRealtimeMs >= AdTagLoader.THRESHOLD_AD_PRELOAD_MS) {
                    long unused = AdTagLoader.this.waitingForPreloadElapsedRealtimeMs = C6540C.TIME_UNSET;
                    AdTagLoader.this.handleAdGroupLoadError(new IOException("Ad preloading timed out"));
                    AdTagLoader.this.maybeNotifyPendingAdLoadError();
                }
            } else if (AdTagLoader.this.pendingContentPositionMs != C6540C.TIME_UNSET && AdTagLoader.this.player != null && AdTagLoader.this.player.getPlaybackState() == 2 && AdTagLoader.this.isWaitingForAdToLoad()) {
                long unused2 = AdTagLoader.this.waitingForPreloadElapsedRealtimeMs = SystemClock.elapsedRealtime();
            }
            return access$800;
        }

        public int getVolume() {
            return AdTagLoader.this.getPlayerVolumePercent();
        }

        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            try {
                AdTagLoader.this.loadAdInternal(adMediaInfo, adPodInfo);
            } catch (RuntimeException e) {
                AdTagLoader.this.maybeNotifyInternalError("loadAd", e);
            }
        }

        public void onAdError(AdErrorEvent adErrorEvent) {
            AdError error = adErrorEvent.getError();
            if (AdTagLoader.this.configuration.debugModeEnabled) {
                Log.m19792d(AdTagLoader.TAG, "onAdError", error);
            }
            if (AdTagLoader.this.adsManager == null) {
                Object unused = AdTagLoader.this.pendingAdRequestContext = null;
                AdPlaybackState unused2 = AdTagLoader.this.adPlaybackState = new AdPlaybackState(AdTagLoader.this.adsId, new long[0]);
                AdTagLoader.this.updateAdPlaybackState();
            } else if (ImaUtil.isAdGroupLoadError(error)) {
                try {
                    AdTagLoader.this.handleAdGroupLoadError(error);
                } catch (RuntimeException e) {
                    AdTagLoader.this.maybeNotifyInternalError("onAdError", e);
                }
            }
            if (AdTagLoader.this.pendingAdLoadError == null) {
                AdsMediaSource.AdLoadException unused3 = AdTagLoader.this.pendingAdLoadError = AdsMediaSource.AdLoadException.createForAllAds(error);
            }
            AdTagLoader.this.maybeNotifyPendingAdLoadError();
        }

        public void onAdEvent(AdEvent adEvent) {
            AdEvent.AdEventType type = adEvent.getType();
            if (AdTagLoader.this.configuration.debugModeEnabled && type != AdEvent.AdEventType.AD_PROGRESS) {
                String valueOf = String.valueOf(type);
                StringBuilder sb = new StringBuilder(valueOf.length() + 11);
                sb.append("onAdEvent: ");
                sb.append(valueOf);
                Log.m19791d(AdTagLoader.TAG, sb.toString());
            }
            try {
                AdTagLoader.this.handleAdEvent(adEvent);
            } catch (RuntimeException e) {
                AdTagLoader.this.maybeNotifyInternalError("onAdEvent", e);
            }
        }

        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
            if (!Util.areEqual(AdTagLoader.this.pendingAdRequestContext, adsManagerLoadedEvent.getUserRequestContext())) {
                adsManager.destroy();
                return;
            }
            Object unused = AdTagLoader.this.pendingAdRequestContext = null;
            AdsManager unused2 = AdTagLoader.this.adsManager = adsManager;
            adsManager.addAdErrorListener(this);
            if (AdTagLoader.this.configuration.applicationAdErrorListener != null) {
                adsManager.addAdErrorListener(AdTagLoader.this.configuration.applicationAdErrorListener);
            }
            adsManager.addAdEventListener(this);
            if (AdTagLoader.this.configuration.applicationAdEventListener != null) {
                adsManager.addAdEventListener(AdTagLoader.this.configuration.applicationAdEventListener);
            }
            try {
                AdPlaybackState unused3 = AdTagLoader.this.adPlaybackState = new AdPlaybackState(AdTagLoader.this.adsId, ImaUtil.getAdGroupTimesUsForCuePoints(adsManager.getAdCuePoints()));
                AdTagLoader.this.updateAdPlaybackState();
            } catch (RuntimeException e) {
                AdTagLoader.this.maybeNotifyInternalError("onAdsManagerLoaded", e);
            }
        }

        public void pauseAd(AdMediaInfo adMediaInfo) {
            try {
                AdTagLoader.this.pauseAdInternal(adMediaInfo);
            } catch (RuntimeException e) {
                AdTagLoader.this.maybeNotifyInternalError("pauseAd", e);
            }
        }

        public void playAd(AdMediaInfo adMediaInfo) {
            try {
                AdTagLoader.this.playAdInternal(adMediaInfo);
            } catch (RuntimeException e) {
                AdTagLoader.this.maybeNotifyInternalError("playAd", e);
            }
        }

        public void release() {
        }

        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            AdTagLoader.this.adCallbacks.remove(videoAdPlayerCallback);
        }

        public void stopAd(AdMediaInfo adMediaInfo) {
            try {
                AdTagLoader.this.stopAdInternal(adMediaInfo);
            } catch (RuntimeException e) {
                AdTagLoader.this.maybeNotifyInternalError("stopAd", e);
            }
        }

        /* synthetic */ ComponentListener(AdTagLoader adTagLoader, C66811 r2) {
            this();
        }
    }

    public AdTagLoader(Context context, ImaUtil.Configuration configuration2, ImaUtil.ImaFactory imaFactory2, List<String> list, DataSpec dataSpec, Object obj, ViewGroup viewGroup) {
        this.configuration = configuration2;
        this.imaFactory = imaFactory2;
        ImaSdkSettings imaSdkSettings = configuration2.imaSdkSettings;
        if (imaSdkSettings == null) {
            imaSdkSettings = imaFactory2.createImaSdkSettings();
            if (configuration2.debugModeEnabled) {
                imaSdkSettings.setDebugMode(true);
            }
        }
        imaSdkSettings.setPlayerType(IMA_SDK_SETTINGS_PLAYER_TYPE);
        imaSdkSettings.setPlayerVersion("2.14.0");
        this.supportedMimeTypes = list;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        this.period = new Timeline.Period();
        this.handler = Util.createHandler(ImaUtil.getImaLooper(), (Handler.Callback) null);
        ComponentListener componentListener2 = new ComponentListener(this, (C66811) null);
        this.componentListener = componentListener2;
        this.eventListeners = new ArrayList();
        ArrayList arrayList = new ArrayList(1);
        this.adCallbacks = arrayList;
        VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback = configuration2.applicationVideoAdPlayerCallback;
        if (videoAdPlayerCallback != null) {
            arrayList.add(videoAdPlayerCallback);
        }
        this.updateAdProgressRunnable = new C6686a(this);
        this.adInfoByAdMediaInfo = C4745p.m21898h();
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.lastContentProgress = videoProgressUpdate;
        this.lastAdProgress = videoProgressUpdate;
        this.fakeContentProgressElapsedRealtimeMs = C6540C.TIME_UNSET;
        this.fakeContentProgressOffsetMs = C6540C.TIME_UNSET;
        this.pendingContentPositionMs = C6540C.TIME_UNSET;
        this.waitingForPreloadElapsedRealtimeMs = C6540C.TIME_UNSET;
        this.contentDurationMs = C6540C.TIME_UNSET;
        this.timeline = Timeline.EMPTY;
        this.adPlaybackState = AdPlaybackState.NONE;
        if (viewGroup != null) {
            this.adDisplayContainer = imaFactory2.createAdDisplayContainer(viewGroup, componentListener2);
        } else {
            this.adDisplayContainer = imaFactory2.createAudioAdDisplayContainer(context, componentListener2);
        }
        Collection<CompanionAdSlot> collection = configuration2.companionAdSlots;
        if (collection != null) {
            this.adDisplayContainer.setCompanionSlots(collection);
        }
        this.adsLoader = requestAds(context, imaSdkSettings, this.adDisplayContainer);
    }

    private void destroyAdsManager() {
        AdsManager adsManager2 = this.adsManager;
        if (adsManager2 != null) {
            adsManager2.removeAdErrorListener(this.componentListener);
            AdErrorEvent.AdErrorListener adErrorListener = this.configuration.applicationAdErrorListener;
            if (adErrorListener != null) {
                this.adsManager.removeAdErrorListener(adErrorListener);
            }
            this.adsManager.removeAdEventListener(this.componentListener);
            AdEvent.AdEventListener adEventListener = this.configuration.applicationAdEventListener;
            if (adEventListener != null) {
                this.adsManager.removeAdEventListener(adEventListener);
            }
            this.adsManager.destroy();
            this.adsManager = null;
        }
    }

    private void ensureSentContentCompleteIfAtEndOfStream() {
        if (!this.sentContentComplete && this.contentDurationMs != C6540C.TIME_UNSET && this.pendingContentPositionMs == C6540C.TIME_UNSET && getContentPeriodPositionMs((Player) Assertions.checkNotNull(this.player), this.timeline, this.period) + 5000 >= this.contentDurationMs) {
            sendContentComplete();
        }
    }

    private int getAdGroupIndexForAdPod(AdPodInfo adPodInfo) {
        if (adPodInfo.getPodIndex() == -1) {
            return this.adPlaybackState.adGroupCount - 1;
        }
        return getAdGroupIndexForCuePointTimeSeconds(adPodInfo.getTimeOffset());
    }

    private int getAdGroupIndexForCuePointTimeSeconds(double d) {
        double d2 = (double) ((float) d);
        Double.isNaN(d2);
        long round = Math.round(d2 * 1000000.0d);
        int i = 0;
        while (true) {
            AdPlaybackState adPlaybackState2 = this.adPlaybackState;
            if (i < adPlaybackState2.adGroupCount) {
                long j = adPlaybackState2.adGroupTimesUs[i];
                if (j != Long.MIN_VALUE && Math.abs(j - round) < 1000) {
                    return i;
                }
                i++;
            } else {
                throw new IllegalStateException("Failed to find cue point");
            }
        }
    }

    private String getAdMediaInfoString(AdMediaInfo adMediaInfo) {
        String str;
        AdInfo adInfo = this.adInfoByAdMediaInfo.get(adMediaInfo);
        if (adMediaInfo == null) {
            str = "null";
        } else {
            str = adMediaInfo.getUrl();
        }
        String valueOf = String.valueOf(adInfo);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15 + valueOf.length());
        sb.append("AdMediaInfo[");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    private VideoProgressUpdate getAdVideoProgressUpdate() {
        Player player2 = this.player;
        if (player2 == null) {
            return this.lastAdProgress;
        }
        if (this.imaAdState == 0 || !this.playingAd) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        long duration = player2.getDuration();
        if (duration == C6540C.TIME_UNSET) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        return new VideoProgressUpdate(this.player.getCurrentPosition(), duration);
    }

    private static long getContentPeriodPositionMs(Player player2, Timeline timeline2, Timeline.Period period2) {
        long contentPosition = player2.getContentPosition();
        if (timeline2.isEmpty()) {
            return contentPosition;
        }
        return contentPosition - timeline2.getPeriod(player2.getCurrentPeriodIndex(), period2).getPositionInWindowMs();
    }

    /* access modifiers changed from: private */
    public VideoProgressUpdate getContentVideoProgressUpdate() {
        boolean z = this.contentDurationMs != C6540C.TIME_UNSET;
        long j = this.pendingContentPositionMs;
        if (j != C6540C.TIME_UNSET) {
            this.sentPendingContentPositionMs = true;
        } else {
            Player player2 = this.player;
            if (player2 == null) {
                return this.lastContentProgress;
            }
            if (this.fakeContentProgressElapsedRealtimeMs != C6540C.TIME_UNSET) {
                j = this.fakeContentProgressOffsetMs + (SystemClock.elapsedRealtime() - this.fakeContentProgressElapsedRealtimeMs);
            } else if (this.imaAdState != 0 || this.playingAd || !z) {
                return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
            } else {
                j = getContentPeriodPositionMs(player2, this.timeline, this.period);
            }
        }
        return new VideoProgressUpdate(j, z ? this.contentDurationMs : -1);
    }

    private int getLoadingAdGroupIndex() {
        Player player2 = this.player;
        if (player2 == null) {
            return -1;
        }
        long msToUs = C6540C.msToUs(getContentPeriodPositionMs(player2, this.timeline, this.period));
        int adGroupIndexForPositionUs = this.adPlaybackState.getAdGroupIndexForPositionUs(msToUs, C6540C.msToUs(this.contentDurationMs));
        return adGroupIndexForPositionUs == -1 ? this.adPlaybackState.getAdGroupIndexAfterPositionUs(msToUs, C6540C.msToUs(this.contentDurationMs)) : adGroupIndexForPositionUs;
    }

    /* access modifiers changed from: private */
    public int getPlayerVolumePercent() {
        Player player2 = this.player;
        if (player2 == null) {
            return this.lastVolumePercent;
        }
        if (player2.isCommandAvailable(16)) {
            return (int) (player2.getVolume() * 100.0f);
        }
        return TrackSelectionUtil.hasTrackOfType(player2.getCurrentTrackSelections(), 1) ? 100 : 0;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (r2 >= r6.eventListeners.size()) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        r6.eventListeners.get(r2).onAdTapped();
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004b, code lost:
        if (r2 >= r6.eventListeners.size()) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        r6.eventListeners.get(r2).onAdClicked();
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleAdEvent(com.google.ads.interactivemedia.p039v3.api.AdEvent r7) {
        /*
            r6 = this;
            com.google.ads.interactivemedia.v3.api.AdsManager r0 = r6.adsManager
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int[] r0 = com.google.android.exoplayer2.ext.ima.AdTagLoader.C66811.f27405x68022ad9
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r1 = r7.getType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            java.lang.String r1 = "AdTagLoader"
            r2 = 0
            r3 = 1
            switch(r0) {
                case 1: goto L_0x0077;
                case 2: goto L_0x0071;
                case 3: goto L_0x005b;
                case 4: goto L_0x0045;
                case 5: goto L_0x003e;
                case 6: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x00c9
        L_0x001a:
            java.util.Map r7 = r7.getAdData()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r0 = r7.length()
            int r0 = r0 + 9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "AdEvent: "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.google.android.exoplayer2.util.Log.m19795i(r1, r7)
            goto L_0x00c9
        L_0x003e:
            r6.imaPausedContent = r2
            r6.resumeContentInternal()
            goto L_0x00c9
        L_0x0045:
            java.util.List<com.google.android.exoplayer2.source.ads.AdsLoader$EventListener> r7 = r6.eventListeners
            int r7 = r7.size()
            if (r2 >= r7) goto L_0x00c9
            java.util.List<com.google.android.exoplayer2.source.ads.AdsLoader$EventListener> r7 = r6.eventListeners
            java.lang.Object r7 = r7.get(r2)
            com.google.android.exoplayer2.source.ads.AdsLoader$EventListener r7 = (com.google.android.exoplayer2.source.ads.AdsLoader.EventListener) r7
            r7.onAdClicked()
            int r2 = r2 + 1
            goto L_0x0045
        L_0x005b:
            java.util.List<com.google.android.exoplayer2.source.ads.AdsLoader$EventListener> r7 = r6.eventListeners
            int r7 = r7.size()
            if (r2 >= r7) goto L_0x00c9
            java.util.List<com.google.android.exoplayer2.source.ads.AdsLoader$EventListener> r7 = r6.eventListeners
            java.lang.Object r7 = r7.get(r2)
            com.google.android.exoplayer2.source.ads.AdsLoader$EventListener r7 = (com.google.android.exoplayer2.source.ads.AdsLoader.EventListener) r7
            r7.onAdTapped()
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0071:
            r6.imaPausedContent = r3
            r6.pauseContentInternal()
            goto L_0x00c9
        L_0x0077:
            java.util.Map r7 = r7.getAdData()
            java.lang.String r0 = "adBreakTime"
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.exoplayer2.ext.ima.ImaUtil$Configuration r0 = r6.configuration
            boolean r0 = r0.debugModeEnabled
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r0 = r0.length()
            int r0 = r0 + 30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "Fetch error for ad at "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " seconds"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.exoplayer2.util.Log.m19791d(r1, r0)
        L_0x00b2:
            double r0 = java.lang.Double.parseDouble(r7)
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00c2
            com.google.android.exoplayer2.source.ads.AdPlaybackState r7 = r6.adPlaybackState
            int r7 = r7.adGroupCount
            int r7 = r7 - r3
            goto L_0x00c6
        L_0x00c2:
            int r7 = r6.getAdGroupIndexForCuePointTimeSeconds(r0)
        L_0x00c6:
            r6.markAdGroupInErrorStateAndClearPendingContentPosition(r7)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ext.ima.AdTagLoader.handleAdEvent(com.google.ads.interactivemedia.v3.api.AdEvent):void");
    }

    /* access modifiers changed from: private */
    public void handleAdGroupLoadError(Exception exc) {
        int loadingAdGroupIndex = getLoadingAdGroupIndex();
        if (loadingAdGroupIndex == -1) {
            Log.m19798w(TAG, "Unable to determine ad group index for ad group load error", exc);
            return;
        }
        markAdGroupInErrorStateAndClearPendingContentPosition(loadingAdGroupIndex);
        if (this.pendingAdLoadError == null) {
            this.pendingAdLoadError = AdsMediaSource.AdLoadException.createForAdGroup(exc, loadingAdGroupIndex);
        }
    }

    private void handleAdPrepareError(int i, int i2, Exception exc) {
        if (this.configuration.debugModeEnabled) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Prepare error for ad ");
            sb.append(i2);
            sb.append(" in group ");
            sb.append(i);
            Log.m19792d(TAG, sb.toString(), exc);
        }
        if (this.adsManager == null) {
            Log.m19797w(TAG, "Ignoring ad prepare error after release");
            return;
        }
        if (this.imaAdState == 0) {
            this.fakeContentProgressElapsedRealtimeMs = SystemClock.elapsedRealtime();
            long usToMs = C6540C.usToMs(this.adPlaybackState.adGroupTimesUs[i]);
            this.fakeContentProgressOffsetMs = usToMs;
            if (usToMs == Long.MIN_VALUE) {
                this.fakeContentProgressOffsetMs = this.contentDurationMs;
            }
            this.pendingAdPrepareErrorAdInfo = new AdInfo(i, i2);
        } else {
            AdMediaInfo adMediaInfo = (AdMediaInfo) Assertions.checkNotNull(this.imaAdMediaInfo);
            if (i2 > this.playingAdIndexInAdGroup) {
                for (int i3 = 0; i3 < this.adCallbacks.size(); i3++) {
                    this.adCallbacks.get(i3).onEnded(adMediaInfo);
                }
            }
            this.playingAdIndexInAdGroup = this.adPlaybackState.adGroups[i].getFirstAdIndexToPlay();
            for (int i4 = 0; i4 < this.adCallbacks.size(); i4++) {
                this.adCallbacks.get(i4).onError((AdMediaInfo) Assertions.checkNotNull(adMediaInfo));
            }
        }
        this.adPlaybackState = this.adPlaybackState.withAdLoadError(i, i2);
        updateAdPlaybackState();
    }

    private void handlePlayerStateChanged(boolean z, int i) {
        if (this.playingAd && this.imaAdState == 1) {
            boolean z2 = this.bufferingAd;
            if (!z2 && i == 2) {
                this.bufferingAd = true;
                AdMediaInfo adMediaInfo = (AdMediaInfo) Assertions.checkNotNull(this.imaAdMediaInfo);
                for (int i2 = 0; i2 < this.adCallbacks.size(); i2++) {
                    this.adCallbacks.get(i2).onBuffering(adMediaInfo);
                }
                stopUpdatingAdProgress();
            } else if (z2 && i == 3) {
                this.bufferingAd = false;
                updateAdProgress();
            }
        }
        int i3 = this.imaAdState;
        if (i3 == 0 && i == 2 && z) {
            ensureSentContentCompleteIfAtEndOfStream();
        } else if (i3 != 0 && i == 4) {
            AdMediaInfo adMediaInfo2 = this.imaAdMediaInfo;
            if (adMediaInfo2 == null) {
                Log.m19797w(TAG, "onEnded without ad media info");
            } else {
                for (int i4 = 0; i4 < this.adCallbacks.size(); i4++) {
                    this.adCallbacks.get(i4).onEnded(adMediaInfo2);
                }
            }
            if (this.configuration.debugModeEnabled) {
                Log.m19791d(TAG, "VideoAdPlayerCallback.onEnded in onPlaybackStateChanged");
            }
        }
    }

    private void handleTimelineOrPositionChanged() {
        Player player2 = this.player;
        if (this.adsManager != null && player2 != null) {
            if (!this.playingAd && !player2.isPlayingAd()) {
                ensureSentContentCompleteIfAtEndOfStream();
                if (!this.sentContentComplete && !this.timeline.isEmpty()) {
                    long contentPeriodPositionMs = getContentPeriodPositionMs(player2, this.timeline, this.period);
                    this.timeline.getPeriod(player2.getCurrentPeriodIndex(), this.period);
                    if (this.period.getAdGroupIndexForPositionUs(C6540C.msToUs(contentPeriodPositionMs)) != -1) {
                        this.sentPendingContentPositionMs = false;
                        this.pendingContentPositionMs = contentPeriodPositionMs;
                    }
                }
            }
            boolean z = this.playingAd;
            int i = this.playingAdIndexInAdGroup;
            boolean isPlayingAd = player2.isPlayingAd();
            this.playingAd = isPlayingAd;
            int currentAdIndexInAdGroup = isPlayingAd ? player2.getCurrentAdIndexInAdGroup() : -1;
            this.playingAdIndexInAdGroup = currentAdIndexInAdGroup;
            if (z && currentAdIndexInAdGroup != i) {
                AdMediaInfo adMediaInfo = this.imaAdMediaInfo;
                if (adMediaInfo == null) {
                    Log.m19797w(TAG, "onEnded without ad media info");
                } else {
                    AdInfo adInfo = this.adInfoByAdMediaInfo.get(adMediaInfo);
                    int i2 = this.playingAdIndexInAdGroup;
                    if (i2 == -1 || (adInfo != null && adInfo.adIndexInAdGroup < i2)) {
                        for (int i3 = 0; i3 < this.adCallbacks.size(); i3++) {
                            this.adCallbacks.get(i3).onEnded(adMediaInfo);
                        }
                        if (this.configuration.debugModeEnabled) {
                            Log.m19791d(TAG, "VideoAdPlayerCallback.onEnded in onTimelineChanged/onPositionDiscontinuity");
                        }
                    }
                }
            }
            if (!this.sentContentComplete && !z && this.playingAd && this.imaAdState == 0) {
                int currentAdGroupIndex = player2.getCurrentAdGroupIndex();
                if (this.adPlaybackState.adGroupTimesUs[currentAdGroupIndex] == Long.MIN_VALUE) {
                    sendContentComplete();
                    return;
                }
                this.fakeContentProgressElapsedRealtimeMs = SystemClock.elapsedRealtime();
                long usToMs = C6540C.usToMs(this.adPlaybackState.adGroupTimesUs[currentAdGroupIndex]);
                this.fakeContentProgressOffsetMs = usToMs;
                if (usToMs == Long.MIN_VALUE) {
                    this.fakeContentProgressOffsetMs = this.contentDurationMs;
                }
            }
        }
    }

    private static boolean hasMidrollAdGroups(long[] jArr) {
        int length = jArr.length;
        if (length == 1) {
            if (jArr[0] == 0 || jArr[0] == Long.MIN_VALUE) {
                return false;
            }
            return true;
        } else if (length == 2 && jArr[0] == 0 && jArr[1] == Long.MIN_VALUE) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public boolean isWaitingForAdToLoad() {
        int loadingAdGroupIndex;
        Player player2 = this.player;
        if (player2 == null || (loadingAdGroupIndex = getLoadingAdGroupIndex()) == -1) {
            return false;
        }
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        AdPlaybackState.AdGroup adGroup = adPlaybackState2.adGroups[loadingAdGroupIndex];
        int i = adGroup.count;
        if ((i == -1 || i == 0 || adGroup.states[0] == 0) && C6540C.usToMs(adPlaybackState2.adGroupTimesUs[loadingAdGroupIndex]) - getContentPeriodPositionMs(player2, this.timeline, this.period) < this.configuration.adPreloadTimeoutMs) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void loadAdInternal(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.adsManager != null) {
            int adGroupIndexForAdPod = getAdGroupIndexForAdPod(adPodInfo);
            int adPosition = adPodInfo.getAdPosition() - 1;
            AdInfo adInfo = new AdInfo(adGroupIndexForAdPod, adPosition);
            this.adInfoByAdMediaInfo.mo19687a(adMediaInfo, adInfo);
            if (this.configuration.debugModeEnabled) {
                String valueOf = String.valueOf(getAdMediaInfoString(adMediaInfo));
                Log.m19791d(TAG, valueOf.length() != 0 ? "loadAd ".concat(valueOf) : new String("loadAd "));
            }
            if (!this.adPlaybackState.isAdInErrorState(adGroupIndexForAdPod, adPosition)) {
                AdPlaybackState adPlaybackState2 = this.adPlaybackState;
                AdPlaybackState.AdGroup[] adGroupArr = adPlaybackState2.adGroups;
                int i = adInfo.adGroupIndex;
                AdPlaybackState withAdCount = adPlaybackState2.withAdCount(i, Math.max(adPodInfo.getTotalAds(), adGroupArr[i].states.length));
                this.adPlaybackState = withAdCount;
                AdPlaybackState.AdGroup adGroup = withAdCount.adGroups[adInfo.adGroupIndex];
                for (int i2 = 0; i2 < adPosition; i2++) {
                    if (adGroup.states[i2] == 0) {
                        this.adPlaybackState = this.adPlaybackState.withAdLoadError(adGroupIndexForAdPod, i2);
                    }
                }
                this.adPlaybackState = this.adPlaybackState.withAdUri(adInfo.adGroupIndex, adInfo.adIndexInAdGroup, Uri.parse(adMediaInfo.getUrl()));
                updateAdPlaybackState();
            }
        } else if (this.configuration.debugModeEnabled) {
            String adMediaInfoString = getAdMediaInfoString(adMediaInfo);
            String valueOf2 = String.valueOf(adPodInfo);
            StringBuilder sb = new StringBuilder(String.valueOf(adMediaInfoString).length() + 30 + valueOf2.length());
            sb.append("loadAd after release ");
            sb.append(adMediaInfoString);
            sb.append(", ad pod ");
            sb.append(valueOf2);
            Log.m19791d(TAG, sb.toString());
        }
    }

    private void markAdGroupInErrorStateAndClearPendingContentPosition(int i) {
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        AdPlaybackState.AdGroup adGroup = adPlaybackState2.adGroups[i];
        if (adGroup.count == -1) {
            AdPlaybackState withAdCount = adPlaybackState2.withAdCount(i, Math.max(1, adGroup.states.length));
            this.adPlaybackState = withAdCount;
            adGroup = withAdCount.adGroups[i];
        }
        for (int i2 = 0; i2 < adGroup.count; i2++) {
            if (adGroup.states[i2] == 0) {
                if (this.configuration.debugModeEnabled) {
                    StringBuilder sb = new StringBuilder(47);
                    sb.append("Removing ad ");
                    sb.append(i2);
                    sb.append(" in ad group ");
                    sb.append(i);
                    Log.m19791d(TAG, sb.toString());
                }
                this.adPlaybackState = this.adPlaybackState.withAdLoadError(i, i2);
            }
        }
        updateAdPlaybackState();
        this.pendingContentPositionMs = C6540C.TIME_UNSET;
        this.fakeContentProgressElapsedRealtimeMs = C6540C.TIME_UNSET;
    }

    private void maybeInitializeAdsManager(long j, long j2) {
        AdsManager adsManager2 = this.adsManager;
        if (!this.isAdsManagerInitialized && adsManager2 != null) {
            this.isAdsManagerInitialized = true;
            AdsRenderingSettings adsRenderingSettings = setupAdsRendering(j, j2);
            if (adsRenderingSettings == null) {
                destroyAdsManager();
            } else {
                adsManager2.init(adsRenderingSettings);
                adsManager2.start();
                if (this.configuration.debugModeEnabled) {
                    String valueOf = String.valueOf(adsRenderingSettings);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 41);
                    sb.append("Initialized with ads rendering settings: ");
                    sb.append(valueOf);
                    Log.m19791d(TAG, sb.toString());
                }
            }
            updateAdPlaybackState();
        }
    }

    /* access modifiers changed from: private */
    public void maybeNotifyInternalError(String str, Exception exc) {
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "Internal error in ".concat(valueOf) : new String("Internal error in ");
        Log.m19794e(TAG, concat, exc);
        int i = 0;
        while (true) {
            AdPlaybackState adPlaybackState2 = this.adPlaybackState;
            if (i >= adPlaybackState2.adGroupCount) {
                break;
            }
            this.adPlaybackState = adPlaybackState2.withSkippedAdGroup(i);
            i++;
        }
        updateAdPlaybackState();
        for (int i2 = 0; i2 < this.eventListeners.size(); i2++) {
            this.eventListeners.get(i2).onAdLoadError(AdsMediaSource.AdLoadException.createForUnexpected(new RuntimeException(concat, exc)), this.adTagDataSpec);
        }
    }

    /* access modifiers changed from: private */
    public void maybeNotifyPendingAdLoadError() {
        if (this.pendingAdLoadError != null) {
            for (int i = 0; i < this.eventListeners.size(); i++) {
                this.eventListeners.get(i).onAdLoadError(this.pendingAdLoadError, this.adTagDataSpec);
            }
            this.pendingAdLoadError = null;
        }
    }

    /* access modifiers changed from: private */
    public void pauseAdInternal(AdMediaInfo adMediaInfo) {
        if (this.configuration.debugModeEnabled) {
            String valueOf = String.valueOf(getAdMediaInfoString(adMediaInfo));
            Log.m19791d(TAG, valueOf.length() != 0 ? "pauseAd ".concat(valueOf) : new String("pauseAd "));
        }
        if (this.adsManager != null && this.imaAdState != 0) {
            if (this.configuration.debugModeEnabled && !adMediaInfo.equals(this.imaAdMediaInfo)) {
                String adMediaInfoString = getAdMediaInfoString(adMediaInfo);
                String adMediaInfoString2 = getAdMediaInfoString(this.imaAdMediaInfo);
                StringBuilder sb = new StringBuilder(String.valueOf(adMediaInfoString).length() + 34 + String.valueOf(adMediaInfoString2).length());
                sb.append("Unexpected pauseAd for ");
                sb.append(adMediaInfoString);
                sb.append(", expected ");
                sb.append(adMediaInfoString2);
                Log.m19797w(TAG, sb.toString());
            }
            this.imaAdState = 2;
            for (int i = 0; i < this.adCallbacks.size(); i++) {
                this.adCallbacks.get(i).onPause(adMediaInfo);
            }
        }
    }

    private void pauseContentInternal() {
        this.imaAdState = 0;
        if (this.sentPendingContentPositionMs) {
            this.pendingContentPositionMs = C6540C.TIME_UNSET;
            this.sentPendingContentPositionMs = false;
        }
    }

    /* access modifiers changed from: private */
    public void playAdInternal(AdMediaInfo adMediaInfo) {
        if (this.configuration.debugModeEnabled) {
            String valueOf = String.valueOf(getAdMediaInfoString(adMediaInfo));
            Log.m19791d(TAG, valueOf.length() != 0 ? "playAd ".concat(valueOf) : new String("playAd "));
        }
        if (this.adsManager != null) {
            if (this.imaAdState == 1) {
                Log.m19797w(TAG, "Unexpected playAd without stopAd");
            }
            int i = 0;
            if (this.imaAdState == 0) {
                this.fakeContentProgressElapsedRealtimeMs = C6540C.TIME_UNSET;
                this.fakeContentProgressOffsetMs = C6540C.TIME_UNSET;
                this.imaAdState = 1;
                this.imaAdMediaInfo = adMediaInfo;
                this.imaAdInfo = (AdInfo) Assertions.checkNotNull(this.adInfoByAdMediaInfo.get(adMediaInfo));
                for (int i2 = 0; i2 < this.adCallbacks.size(); i2++) {
                    this.adCallbacks.get(i2).onPlay(adMediaInfo);
                }
                AdInfo adInfo = this.pendingAdPrepareErrorAdInfo;
                if (adInfo != null && adInfo.equals(this.imaAdInfo)) {
                    this.pendingAdPrepareErrorAdInfo = null;
                    while (i < this.adCallbacks.size()) {
                        this.adCallbacks.get(i).onError(adMediaInfo);
                        i++;
                    }
                }
                updateAdProgress();
            } else {
                this.imaAdState = 1;
                Assertions.checkState(adMediaInfo.equals(this.imaAdMediaInfo));
                while (i < this.adCallbacks.size()) {
                    this.adCallbacks.get(i).onResume(adMediaInfo);
                    i++;
                }
            }
            Player player2 = this.player;
            if (player2 == null || !player2.getPlayWhenReady()) {
                ((AdsManager) Assertions.checkNotNull(this.adsManager)).pause();
            }
        }
    }

    private com.google.ads.interactivemedia.p039v3.api.AdsLoader requestAds(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer2) {
        com.google.ads.interactivemedia.p039v3.api.AdsLoader createAdsLoader = this.imaFactory.createAdsLoader(context, imaSdkSettings, adDisplayContainer2);
        createAdsLoader.addAdErrorListener(this.componentListener);
        AdErrorEvent.AdErrorListener adErrorListener = this.configuration.applicationAdErrorListener;
        if (adErrorListener != null) {
            createAdsLoader.addAdErrorListener(adErrorListener);
        }
        createAdsLoader.addAdsLoadedListener(this.componentListener);
        try {
            AdsRequest adsRequestForAdTagDataSpec = ImaUtil.getAdsRequestForAdTagDataSpec(this.imaFactory, this.adTagDataSpec);
            Object obj = new Object();
            this.pendingAdRequestContext = obj;
            adsRequestForAdTagDataSpec.setUserRequestContext(obj);
            Boolean bool = this.configuration.enableContinuousPlayback;
            if (bool != null) {
                adsRequestForAdTagDataSpec.setContinuousPlayback(bool.booleanValue());
            }
            int i = this.configuration.vastLoadTimeoutMs;
            if (i != -1) {
                adsRequestForAdTagDataSpec.setVastLoadTimeout((float) i);
            }
            adsRequestForAdTagDataSpec.setContentProgressProvider(this.componentListener);
            createAdsLoader.requestAds(adsRequestForAdTagDataSpec);
            return createAdsLoader;
        } catch (IOException e) {
            this.adPlaybackState = new AdPlaybackState(this.adsId, new long[0]);
            updateAdPlaybackState();
            this.pendingAdLoadError = AdsMediaSource.AdLoadException.createForAllAds(e);
            maybeNotifyPendingAdLoadError();
            return createAdsLoader;
        }
    }

    private void resumeContentInternal() {
        AdInfo adInfo = this.imaAdInfo;
        if (adInfo != null) {
            this.adPlaybackState = this.adPlaybackState.withSkippedAdGroup(adInfo.adGroupIndex);
            updateAdPlaybackState();
        }
    }

    private void sendContentComplete() {
        int i = 0;
        for (int i2 = 0; i2 < this.adCallbacks.size(); i2++) {
            this.adCallbacks.get(i2).onContentComplete();
        }
        this.sentContentComplete = true;
        if (this.configuration.debugModeEnabled) {
            Log.m19791d(TAG, "adsLoader.contentComplete");
        }
        while (true) {
            AdPlaybackState adPlaybackState2 = this.adPlaybackState;
            if (i < adPlaybackState2.adGroupCount) {
                if (adPlaybackState2.adGroupTimesUs[i] != Long.MIN_VALUE) {
                    this.adPlaybackState = adPlaybackState2.withSkippedAdGroup(i);
                }
                i++;
            } else {
                updateAdPlaybackState();
                return;
            }
        }
    }

    private AdsRenderingSettings setupAdsRendering(long j, long j2) {
        AdsRenderingSettings createAdsRenderingSettings = this.imaFactory.createAdsRenderingSettings();
        createAdsRenderingSettings.setEnablePreloading(true);
        List<String> list = this.configuration.adMediaMimeTypes;
        if (list == null) {
            list = this.supportedMimeTypes;
        }
        createAdsRenderingSettings.setMimeTypes(list);
        int i = this.configuration.mediaLoadTimeoutMs;
        if (i != -1) {
            createAdsRenderingSettings.setLoadVideoTimeout(i);
        }
        int i2 = this.configuration.mediaBitrate;
        if (i2 != -1) {
            createAdsRenderingSettings.setBitrateKbps(i2 / 1000);
        }
        createAdsRenderingSettings.setFocusSkipButtonWhenAvailable(this.configuration.focusSkipButtonWhenAvailable);
        Set<UiElement> set = this.configuration.adUiElements;
        if (set != null) {
            createAdsRenderingSettings.setUiElements(set);
        }
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        long[] jArr = adPlaybackState2.adGroupTimesUs;
        int adGroupIndexForPositionUs = adPlaybackState2.getAdGroupIndexForPositionUs(C6540C.msToUs(j), C6540C.msToUs(j2));
        if (adGroupIndexForPositionUs != -1) {
            if (!(this.configuration.playAdBeforeStartPosition || jArr[adGroupIndexForPositionUs] == C6540C.msToUs(j))) {
                adGroupIndexForPositionUs++;
            } else if (hasMidrollAdGroups(jArr)) {
                this.pendingContentPositionMs = j;
            }
            if (adGroupIndexForPositionUs > 0) {
                for (int i3 = 0; i3 < adGroupIndexForPositionUs; i3++) {
                    this.adPlaybackState = this.adPlaybackState.withSkippedAdGroup(i3);
                }
                if (adGroupIndexForPositionUs == jArr.length) {
                    return null;
                }
                long j3 = jArr[adGroupIndexForPositionUs];
                long j4 = jArr[adGroupIndexForPositionUs - 1];
                if (j3 == Long.MIN_VALUE) {
                    double d = (double) j4;
                    Double.isNaN(d);
                    createAdsRenderingSettings.setPlayAdsAfterTime((d / 1000000.0d) + 1.0d);
                } else {
                    double d2 = (double) (j3 + j4);
                    Double.isNaN(d2);
                    createAdsRenderingSettings.setPlayAdsAfterTime((d2 / 2.0d) / 1000000.0d);
                }
            }
        }
        return createAdsRenderingSettings;
    }

    /* access modifiers changed from: private */
    public void stopAdInternal(AdMediaInfo adMediaInfo) {
        if (this.configuration.debugModeEnabled) {
            String valueOf = String.valueOf(getAdMediaInfoString(adMediaInfo));
            Log.m19791d(TAG, valueOf.length() != 0 ? "stopAd ".concat(valueOf) : new String("stopAd "));
        }
        if (this.adsManager != null) {
            if (this.imaAdState == 0) {
                AdInfo adInfo = this.adInfoByAdMediaInfo.get(adMediaInfo);
                if (adInfo != null) {
                    this.adPlaybackState = this.adPlaybackState.withSkippedAd(adInfo.adGroupIndex, adInfo.adIndexInAdGroup);
                    updateAdPlaybackState();
                    return;
                }
                return;
            }
            this.imaAdState = 0;
            stopUpdatingAdProgress();
            Assertions.checkNotNull(this.imaAdInfo);
            AdInfo adInfo2 = this.imaAdInfo;
            int i = adInfo2.adGroupIndex;
            int i2 = adInfo2.adIndexInAdGroup;
            if (!this.adPlaybackState.isAdInErrorState(i, i2)) {
                this.adPlaybackState = this.adPlaybackState.withPlayedAd(i, i2).withAdResumePositionUs(0);
                updateAdPlaybackState();
                if (!this.playingAd) {
                    this.imaAdMediaInfo = null;
                    this.imaAdInfo = null;
                }
            }
        }
    }

    private void stopUpdatingAdProgress() {
        this.handler.removeCallbacks(this.updateAdProgressRunnable);
    }

    /* access modifiers changed from: private */
    public void updateAdPlaybackState() {
        for (int i = 0; i < this.eventListeners.size(); i++) {
            this.eventListeners.get(i).onAdPlaybackState(this.adPlaybackState);
        }
    }

    /* access modifiers changed from: private */
    public void updateAdProgress() {
        VideoProgressUpdate adVideoProgressUpdate = getAdVideoProgressUpdate();
        if (this.configuration.debugModeEnabled) {
            String valueOf = String.valueOf(ImaUtil.getStringForVideoProgressUpdate(adVideoProgressUpdate));
            Log.m19791d(TAG, valueOf.length() != 0 ? "Ad progress: ".concat(valueOf) : new String("Ad progress: "));
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) Assertions.checkNotNull(this.imaAdMediaInfo);
        for (int i = 0; i < this.adCallbacks.size(); i++) {
            this.adCallbacks.get(i).onAdProgress(adMediaInfo, adVideoProgressUpdate);
        }
        this.handler.removeCallbacks(this.updateAdProgressRunnable);
        this.handler.postDelayed(this.updateAdProgressRunnable, 100);
    }

    public void activate(Player player2) {
        AdInfo adInfo;
        this.player = player2;
        player2.addListener((Player.Listener) this);
        boolean playWhenReady = player2.getPlayWhenReady();
        onTimelineChanged(player2.getCurrentTimeline(), 1);
        AdsManager adsManager2 = this.adsManager;
        if (!AdPlaybackState.NONE.equals(this.adPlaybackState) && adsManager2 != null && this.imaPausedContent) {
            int adGroupIndexForPositionUs = this.adPlaybackState.getAdGroupIndexForPositionUs(C6540C.msToUs(getContentPeriodPositionMs(player2, this.timeline, this.period)), C6540C.msToUs(this.contentDurationMs));
            if (!(adGroupIndexForPositionUs == -1 || (adInfo = this.imaAdInfo) == null || adInfo.adGroupIndex == adGroupIndexForPositionUs)) {
                if (this.configuration.debugModeEnabled) {
                    String valueOf = String.valueOf(adInfo);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                    sb.append("Discarding preloaded ad ");
                    sb.append(valueOf);
                    Log.m19791d(TAG, sb.toString());
                }
                adsManager2.discardAdBreak();
            }
            if (playWhenReady) {
                adsManager2.resume();
            }
        }
    }

    public void addListenerWithAdView(AdsLoader.EventListener eventListener, AdViewProvider adViewProvider) {
        boolean z = !this.eventListeners.isEmpty();
        this.eventListeners.add(eventListener);
        if (!z) {
            this.lastVolumePercent = 0;
            VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
            this.lastAdProgress = videoProgressUpdate;
            this.lastContentProgress = videoProgressUpdate;
            maybeNotifyPendingAdLoadError();
            if (!AdPlaybackState.NONE.equals(this.adPlaybackState)) {
                eventListener.onAdPlaybackState(this.adPlaybackState);
            } else if (this.adsManager != null) {
                this.adPlaybackState = new AdPlaybackState(this.adsId, ImaUtil.getAdGroupTimesUsForCuePoints(this.adsManager.getAdCuePoints()));
                updateAdPlaybackState();
            }
            for (AdOverlayInfo next : adViewProvider.getAdOverlayInfos()) {
                this.adDisplayContainer.registerFriendlyObstruction(this.imaFactory.createFriendlyObstruction(next.view, ImaUtil.getFriendlyObstructionPurpose(next.purpose), next.reasonDetail));
            }
        } else if (!AdPlaybackState.NONE.equals(this.adPlaybackState)) {
            eventListener.onAdPlaybackState(this.adPlaybackState);
        }
    }

    public void deactivate() {
        Player player2 = (Player) Assertions.checkNotNull(this.player);
        if (!AdPlaybackState.NONE.equals(this.adPlaybackState) && this.imaPausedContent) {
            AdsManager adsManager2 = this.adsManager;
            if (adsManager2 != null) {
                adsManager2.pause();
            }
            this.adPlaybackState = this.adPlaybackState.withAdResumePositionUs(this.playingAd ? C6540C.msToUs(player2.getCurrentPosition()) : 0);
        }
        this.lastVolumePercent = getPlayerVolumePercent();
        this.lastAdProgress = getAdVideoProgressUpdate();
        this.lastContentProgress = getContentVideoProgressUpdate();
        player2.removeListener((Player.Listener) this);
        this.player = null;
    }

    public void focusSkipButton() {
        AdsManager adsManager2 = this.adsManager;
        if (adsManager2 != null) {
            adsManager2.focus();
        }
    }

    public AdDisplayContainer getAdDisplayContainer() {
        return this.adDisplayContainer;
    }

    public com.google.ads.interactivemedia.p039v3.api.AdsLoader getAdsLoader() {
        return this.adsLoader;
    }

    public void handlePrepareComplete(int i, int i2) {
        AdInfo adInfo = new AdInfo(i, i2);
        if (this.configuration.debugModeEnabled) {
            String valueOf = String.valueOf(adInfo);
            StringBuilder sb = new StringBuilder(valueOf.length() + 12);
            sb.append("Prepared ad ");
            sb.append(valueOf);
            Log.m19791d(TAG, sb.toString());
        }
        AdMediaInfo adMediaInfo = this.adInfoByAdMediaInfo.mo19688k().get(adInfo);
        if (adMediaInfo != null) {
            for (int i3 = 0; i3 < this.adCallbacks.size(); i3++) {
                this.adCallbacks.get(i3).onLoaded(adMediaInfo);
            }
            return;
        }
        String valueOf2 = String.valueOf(adInfo);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 23);
        sb2.append("Unexpected prepared ad ");
        sb2.append(valueOf2);
        Log.m19797w(TAG, sb2.toString());
    }

    public void handlePrepareError(int i, int i2, IOException iOException) {
        if (this.player != null) {
            try {
                handleAdPrepareError(i, i2, iOException);
            } catch (RuntimeException e) {
                maybeNotifyInternalError("handlePrepareError", e);
            }
        }
    }

    public void maybePreloadAds(long j, long j2) {
        maybeInitializeAdsManager(j, j2);
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

    public void onPlayWhenReadyChanged(boolean z, int i) {
        Player player2;
        AdsManager adsManager2 = this.adsManager;
        if (adsManager2 != null && (player2 = this.player) != null) {
            int i2 = this.imaAdState;
            if (i2 == 1 && !z) {
                adsManager2.pause();
            } else if (i2 != 2 || !z) {
                handlePlayerStateChanged(z, player2.getPlaybackState());
            } else {
                adsManager2.resume();
            }
        }
    }

    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        C6808p0.m28591i(this, playbackParameters);
    }

    public void onPlaybackStateChanged(int i) {
        Player player2 = this.player;
        if (this.adsManager != null && player2 != null) {
            if (i == 2 && !player2.isPlayingAd() && isWaitingForAdToLoad()) {
                this.waitingForPreloadElapsedRealtimeMs = SystemClock.elapsedRealtime();
            } else if (i == 3) {
                this.waitingForPreloadElapsedRealtimeMs = C6540C.TIME_UNSET;
            }
            handlePlayerStateChanged(player2.getPlayWhenReady(), i);
        }
    }

    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        C6808p0.m28593k(this, i);
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        if (this.imaAdState != 0) {
            AdMediaInfo adMediaInfo = (AdMediaInfo) Assertions.checkNotNull(this.imaAdMediaInfo);
            for (int i = 0; i < this.adCallbacks.size(); i++) {
                this.adCallbacks.get(i).onError(adMediaInfo);
            }
        }
    }

    public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        C6808p0.m28595m(this, z, i);
    }

    public /* synthetic */ void onPositionDiscontinuity(int i) {
        C6808p0.m28596n(this, i);
    }

    public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        handleTimelineOrPositionChanged();
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

    public void onTimelineChanged(Timeline timeline2, int i) {
        if (!timeline2.isEmpty()) {
            this.timeline = timeline2;
            Player player2 = (Player) Assertions.checkNotNull(this.player);
            long j = timeline2.getPeriod(player2.getCurrentPeriodIndex(), this.period).durationUs;
            this.contentDurationMs = C6540C.usToMs(j);
            AdPlaybackState adPlaybackState2 = this.adPlaybackState;
            if (j != adPlaybackState2.contentDurationUs) {
                this.adPlaybackState = adPlaybackState2.withContentDurationUs(j);
                updateAdPlaybackState();
            }
            maybeInitializeAdsManager(getContentPeriodPositionMs(player2, timeline2, this.period), this.contentDurationMs);
            handleTimelineOrPositionChanged();
        }
    }

    public /* synthetic */ void onTimelineChanged(Timeline timeline2, Object obj, int i) {
        C6808p0.m28603u(this, timeline2, obj, i);
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
        if (!this.released) {
            this.released = true;
            this.pendingAdRequestContext = null;
            destroyAdsManager();
            this.adsLoader.removeAdsLoadedListener(this.componentListener);
            this.adsLoader.removeAdErrorListener(this.componentListener);
            AdErrorEvent.AdErrorListener adErrorListener = this.configuration.applicationAdErrorListener;
            if (adErrorListener != null) {
                this.adsLoader.removeAdErrorListener(adErrorListener);
            }
            this.adsLoader.release();
            int i = 0;
            this.imaPausedContent = false;
            this.imaAdState = 0;
            this.imaAdMediaInfo = null;
            stopUpdatingAdProgress();
            this.imaAdInfo = null;
            this.pendingAdLoadError = null;
            while (true) {
                AdPlaybackState adPlaybackState2 = this.adPlaybackState;
                if (i < adPlaybackState2.adGroupCount) {
                    this.adPlaybackState = adPlaybackState2.withSkippedAdGroup(i);
                    i++;
                } else {
                    updateAdPlaybackState();
                    return;
                }
            }
        }
    }

    public void removeListener(AdsLoader.EventListener eventListener) {
        this.eventListeners.remove(eventListener);
        if (this.eventListeners.isEmpty()) {
            this.adDisplayContainer.unregisterAllFriendlyObstructions();
        }
    }

    public void skipAd() {
        AdsManager adsManager2 = this.adsManager;
        if (adsManager2 != null) {
            adsManager2.skip();
        }
    }
}
