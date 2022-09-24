package com.appnext.ads.fullscreen;

import android.content.Context;
import android.content.Intent;
import com.appnext.ads.AdsError;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3180d;
import com.appnext.core.C3198g;
import com.appnext.core.C3211o;
import com.appnext.core.ECPM;
import com.appnext.core.SettingsManager;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;

public abstract class Video extends C3148Ad {
    protected static final int FULL_SCREEN_VIDEO = 1;
    protected static final int REWARDED_VIDEO = 2;
    protected static final String TID = "301";
    protected static final String VID = "2.6.5.473";
    public static final String VIDEO_LENGTH_LONG = "30";
    public static final String VIDEO_LENGTH_SHORT = "15";
    private static boolean cacheVideo = true;
    protected static Video currentAd = null;
    /* access modifiers changed from: private */
    public static boolean init = false;
    private static boolean streamingEnable = false;
    private boolean canClose;
    private OnAdError internalOnAdError;
    private String language;
    protected long rnd;
    private int rollCaptionTime;
    private boolean showCta;
    private int type;
    private OnAdError userOnAdError;
    /* access modifiers changed from: private */
    public WeakReference<OnAdError> userOnAdErrorWR;
    private OnVideoEnded videoEnded;
    private String videoLength;

    public Video(Context context, int i, String str) {
        super(context, str);
        this.videoLength = "15";
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.language = "";
        this.canClose = true;
        try {
            this.type = i;
            this.rnd = (long) new Random(System.currentTimeMillis()).nextInt(Integer.MAX_VALUE);
            init();
        } catch (Throwable th) {
            C3117a.m10553a("Video$Video", th);
        }
    }

    public static boolean getCacheVideo() {
        return cacheVideo;
    }

    private void init() {
        try {
            getConfig().mo10729h("tid", getTID());
            getConfig().mo10728a(this.context, getPlacementID(), new SettingsManager.ConfigCallback() {
                public final void error(String str) {
                }

                public final void loaded(HashMap<String, Object> hashMap) {
                }
            });
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    try {
                        if (!Video.init) {
                            boolean unused = Video.init = true;
                            C3198g.m10783a(new File(Video.this.context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/" + "tmp/"));
                        }
                    } catch (Throwable th) {
                        C3117a.m10553a("Video$init", th);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean isStreamingModeEnabled() {
        return streamingEnable;
    }

    /* access modifiers changed from: private */
    public void load() {
        try {
            C3000b.m10379f().mo10769a(this.context, (C3148Ad) this, getPlacementID(), (C3180d.C3185a) new C3180d.C3185a() {
                /* renamed from: a */
                public final <T> void mo10220a(T t) {
                    OnAdError onAdErrorCallback;
                    try {
                        AppnextAd a = C3000b.m10379f().mo10230a(Video.this.context, (C3148Ad) Video.this);
                        if (a == null && (onAdErrorCallback = Video.this.getOnAdErrorCallback()) != null) {
                            onAdErrorCallback.adError(AppnextError.NO_ADS);
                        }
                        OnAdLoaded onAdLoadedCallback = Video.this.getOnAdLoadedCallback();
                        if (onAdLoadedCallback != null) {
                            onAdLoadedCallback.adLoaded(a.getBannerID(), a.getCreativeType());
                        }
                    } catch (Throwable th) {
                        C3117a.m10553a("Video$load", th);
                    }
                }

                public final void error(String str) {
                    try {
                        OnAdError onAdErrorCallback = Video.this.getOnAdErrorCallback();
                        if (onAdErrorCallback != null) {
                            onAdErrorCallback.adError(str);
                        }
                    } catch (Throwable th) {
                        C3117a.m10553a("Video$load", th);
                    }
                }
            });
        } catch (Throwable th) {
            C3117a.m10553a("Video$load", th);
        }
    }

    public static void setCacheVideo(boolean z) {
        cacheVideo = z;
    }

    public static void setStreamingMode(boolean z) {
        streamingEnable = z;
    }

    public void destroy() {
        super.destroy();
        this.videoEnded = null;
        try {
            Context context = this.context;
            if (context != null && context.getFilesDir() != null) {
                C3198g.m10783a(new File(this.context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/" + "tmp/vid" + this.rnd + "/"));
            }
        } catch (Throwable th) {
            C3117a.m10553a("Video$destroy", th);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            destroy();
        } catch (Throwable th) {
            C3117a.m10553a("Video$finalize", th);
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: protected */
    public SettingsManager getConfig() {
        int i = this.type;
        if (i == 2) {
            return C3012f.m10411o();
        }
        if (i == 1) {
            return C3002c.m10393h();
        }
        return null;
    }

    public void getECPM(final OnECPMLoaded onECPMLoaded) {
        if (onECPMLoaded != null) {
            C3000b.m10379f().mo10770a(this.context, (C3148Ad) this, getPlacementID(), (C3180d.C3185a) new C3180d.C3185a() {
                /* renamed from: a */
                public final <T> void mo10220a(T t) {
                    AppnextAd a = C3000b.m10379f().mo10230a(Video.this.context, (C3148Ad) Video.this);
                    if (a != null) {
                        onECPMLoaded.ecpm(new ECPM(a.getECPM(), a.getPPR(), a.getBannerID()));
                    } else {
                        onECPMLoaded.error(AppnextError.NO_ADS);
                    }
                }

                public final void error(String str) {
                    onECPMLoaded.error(str);
                }
            }, false);
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }

    public String getLanguage() {
        return this.language;
    }

    public OnAdError getOnAdErrorCallback() {
        return super.getOnAdErrorCallback();
    }

    public OnVideoEnded getOnVideoEndedCallback() {
        return this.videoEnded;
    }

    public int getRollCaptionTime() {
        return this.rollCaptionTime;
    }

    /* access modifiers changed from: protected */
    public String getSessionId() {
        return super.getSessionId();
    }

    public String getTID() {
        return TID;
    }

    public String getVID() {
        return VID;
    }

    public String getVideoLength() {
        return this.videoLength;
    }

    public boolean isAdLoaded() {
        if (getPlacementID().equals("")) {
            return false;
        }
        return C3000b.m10379f().mo10239b((C3148Ad) this);
    }

    public boolean isBackButtonCanClose() {
        return this.canClose;
    }

    public boolean isShowCta() {
        return this.showCta;
    }

    public void loadAd() {
        try {
            if (!getPlacementID().equals("")) {
                if (C3198g.m10792c(this.context, "android.permission.INTERNET")) {
                    if (C3198g.m10800k(this.context)) {
                        getConfig().mo10728a(this.context, getPlacementID(), new SettingsManager.ConfigCallback() {
                            public final void error(String str) {
                                Video.this.load();
                            }

                            public final void loaded(HashMap<String, Object> hashMap) {
                                Video.this.load();
                            }
                        });
                        return;
                    }
                }
                OnAdError onAdErrorCallback = getOnAdErrorCallback();
                if (onAdErrorCallback != null) {
                    onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Placement ID cannot be empty");
        } catch (Throwable th) {
            C3117a.m10553a("Video$loadAd", th);
        }
    }

    public void setBackButtonCanClose(boolean z) {
        this.canClose = z;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setOnAdErrorCallback(OnAdError onAdError) {
        if (onAdError != null) {
            C29986 r0 = new OnAdError() {
                public final void adError(String str) {
                    String str2;
                    OnAdError onAdError;
                    str.hashCode();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -2026653947:
                            if (str.equals(AppnextError.INTERNAL_ERROR)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1958363695:
                            if (str.equals(AppnextError.NO_ADS)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1477010874:
                            if (str.equals(AppnextError.CONNECTION_ERROR)) {
                                c = 2;
                                break;
                            }
                            break;
                        case -507110949:
                            if (str.equals(AppnextError.NO_MARKET)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 297538105:
                            if (str.equals(AdsError.AD_NOT_READY)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 350741825:
                            if (str.equals(AppnextError.TIMEOUT)) {
                                c = 5;
                                break;
                            }
                            break;
                        case 844170097:
                            if (str.equals(AppnextError.SLOW_CONNECTION)) {
                                c = 6;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            str2 = "error_internal_error";
                            break;
                        case 1:
                            str2 = "error_no_ads";
                            break;
                        case 2:
                            str2 = "error_connection_error";
                            break;
                        case 3:
                            str2 = "error_no_market";
                            break;
                        case 4:
                            str2 = "error_ad_not_ready";
                            break;
                        case 5:
                            str2 = "error_timeout";
                            break;
                        case 6:
                            str2 = "error_slow_connection";
                            break;
                        default:
                            str2 = "";
                            break;
                    }
                    C3198g.m10781a(Video.this.context, Video.this.getTID(), Video.this.getVID(), Video.this.getAUID(), Video.this.getPlacementID(), Video.this.getSessionId(), str2, "current_interstitial", "", "");
                    if (Video.this.userOnAdErrorWR != null && (onAdError = (OnAdError) Video.this.userOnAdErrorWR.get()) != null) {
                        onAdError.adError(str);
                    }
                }
            };
            this.internalOnAdError = r0;
            super.setOnAdErrorCallback(r0);
            this.userOnAdErrorWR = new WeakReference<>(onAdError);
        }
    }

    public void setOnVideoEndedCallback(OnVideoEnded onVideoEnded) {
        this.videoEnded = onVideoEnded;
    }

    public void setParams(String str, String str2) {
        getConfig().mo10731j(str, str2);
    }

    public void setRollCaptionTime(int i) {
        if (i == -1 || (i >= 3 && i <= 10)) {
            this.rollCaptionTime = i;
        }
    }

    public void setShowCta(boolean z) {
        this.showCta = z;
    }

    public void setVideoLength(String str) {
        if (str.equals("15") || str.equals("30")) {
            this.videoLength = str;
        }
    }

    public void showAd() {
        try {
            if (getPlacementID().equals("")) {
                throw new IllegalArgumentException("Placement ID cannot be empty");
            } else if (!C3198g.m10792c(this.context, "android.permission.INTERNET")) {
                OnAdError onAdErrorCallback = getOnAdErrorCallback();
                if (onAdErrorCallback != null) {
                    onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
                }
            } else {
                int v = C3198g.m10802v(getConfig().mo10732y("min_internet_connection_video"));
                int v2 = C3198g.m10802v(C3198g.m10795g(this.context));
                if (v2 == -1) {
                    OnAdError onAdErrorCallback2 = getOnAdErrorCallback();
                    if (onAdErrorCallback2 != null) {
                        onAdErrorCallback2.adError(AppnextError.CONNECTION_ERROR);
                    }
                } else if (v2 < v) {
                    OnAdError onAdErrorCallback3 = getOnAdErrorCallback();
                    if (onAdErrorCallback3 != null) {
                        onAdErrorCallback3.adError(AppnextError.SLOW_CONNECTION);
                    }
                } else {
                    C3198g.m10781a(this.context, getTID(), getVID(), getAUID(), getPlacementID(), getSessionId(), "show_request", this.type == 1 ? "fullscreen" : "rewarded", "", "");
                    if (C3000b.m10379f().mo10239b((C3148Ad) this)) {
                        Intent intent = new Intent(this.context, FullscreenActivity.class);
                        intent.setFlags(268435456);
                        intent.putExtra(TtmlNode.ATTR_ID, getPlacementID());
                        intent.putExtra(SessionDescription.ATTR_TYPE, this.type);
                        currentAd = this;
                        this.context.startActivity(intent);
                        return;
                    }
                    OnAdError onAdErrorCallback4 = getOnAdErrorCallback();
                    if (onAdErrorCallback4 != null) {
                        onAdErrorCallback4.adError(AdsError.AD_NOT_READY);
                    }
                    C3000b.m10379f().mo10769a(this.context, (C3148Ad) this, getPlacementID(), (C3180d.C3185a) null);
                    C3198g.m10781a(this.context, getTID(), getVID(), getAUID(), getPlacementID(), getSessionId(), "ad_not_ready", this.type == 1 ? "fullscreen" : "rewarded", "", "");
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("Video$showAd", th);
        }
    }

    public Video(Context context, int i, String str, VideoConfig videoConfig) {
        super(context, str);
        this.videoLength = "15";
        boolean z = true;
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.language = "";
        this.canClose = true;
        this.type = i;
        this.rnd = (long) new Random(System.currentTimeMillis()).nextInt(Integer.MAX_VALUE);
        init();
        if (videoConfig != null) {
            setPostback(videoConfig.getPostback());
            setCategories(videoConfig.getCategories());
            setSpecificCategories(videoConfig.getSpecificCategories());
            setOrientation(videoConfig.getOrientation());
            if (videoConfig.showCta != null) {
                setShowCta(videoConfig.isShowCta());
            }
            setRollCaptionTime(videoConfig.getRollCaptionTime());
            setVideoLength(videoConfig.getVideoLength());
            if (videoConfig.mute == null ? false : z) {
                setMute(videoConfig.getMute());
            }
            setMinVideoLength(videoConfig.getMinVideoLength());
            setMaxVideoLength(videoConfig.getMaxVideoLength());
            setLanguage(videoConfig.getLanguage());
        }
    }

    protected Video(Context context, Video video) {
        super(context, video.getPlacementID());
        this.videoLength = "15";
        this.showCta = true;
        this.rollCaptionTime = -2;
        this.language = "";
        this.canClose = true;
        try {
            this.type = video.type;
            this.rnd = video.rnd;
            setPostback(video.getPostback());
            setCategories(video.getCategories());
            setSpecificCategories(video.getSpecificCategories());
            setOrientation(video.getOrientation());
            setVideoLength(video.getVideoLength());
            setMute(video.getMute());
            setMinVideoLength(video.getMinVideoLength());
            setMaxVideoLength(video.getMaxVideoLength());
            setRollCaptionTime(video.getRollCaptionTime());
            setShowCta(video.isShowCta());
            setLanguage(video.getLanguage());
            setOnVideoEndedCallback(video.getOnVideoEndedCallback());
            setOnAdClosedCallback(video.getOnAdClosedCallback());
            setOnAdErrorCallback(video.getOnAdErrorCallback());
            setOnAdClickedCallback(video.getOnAdClickedCallback());
            setOnAdOpenedCallback(video.getOnAdOpenedCallback());
            setOnAdLoadedCallback(video.getOnAdLoadedCallback());
            setSessionId(video.getSessionId());
        } catch (Throwable th) {
            C3117a.m10553a("Video$Video", th);
        }
    }
}
