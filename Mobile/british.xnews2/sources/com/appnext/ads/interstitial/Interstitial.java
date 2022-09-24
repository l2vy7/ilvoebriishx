package com.appnext.ads.interstitial;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
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
import com.appnext.core.webview.AppnextWebView;
import com.appnext.core.webview.C3258a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public class Interstitial extends C3148Ad {
    private static final String JS_URL = "https://cdn.appnext.com/tools/sdk/interstitial/v75/script.min.js";
    protected static final String TID = "301";
    public static final String TYPE_MANAGED = "managed";
    public static final String TYPE_STATIC = "static";
    public static final String TYPE_VIDEO = "video";
    protected static final String VID = "2.6.5.473";
    protected static Interstitial currentAd;
    private boolean autoPlay;
    private String buttonColor;
    /* access modifiers changed from: private */
    public boolean calledShow;
    private Boolean canClose;
    /* access modifiers changed from: private */
    public boolean configLoaded;
    private String creativeType;
    private OnAdError internalOnAdError;
    private String language;
    private boolean setAutoPlay;
    private boolean setCanClose;
    private String skipText;
    private String titleText;
    /* access modifiers changed from: private */
    public WeakReference<OnAdError> userOnAdErrorWR;

    public Interstitial(Context context, String str) {
        super(context, str);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.language = "";
        init();
    }

    /* access modifiers changed from: private */
    public String getCreative() {
        int v = C3198g.m10802v(getConfig().mo10732y("min_internet_connection"));
        int v2 = C3198g.m10802v(getConfig().mo10732y("min_internet_connection_video"));
        int v3 = C3198g.m10802v(C3198g.m10795g(this.context));
        if (v3 < v || v3 >= v2) {
            return getCreativeType();
        }
        return "static";
    }

    private boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    private void init() {
        try {
            loadConfig();
            AppnextWebView.m10952t(this.context).mo10885a(getPageUrl(), (AppnextWebView.C3257c) null);
        } catch (Throwable th) {
            C3117a.m10553a("Interstitial$init", th);
        }
    }

    /* access modifiers changed from: private */
    public void load() {
        C3061a.m10493A().mo10380a(this.context, this, getPlacementID(), new C3180d.C3185a() {
            /* renamed from: a */
            public final <T> void mo10220a(T t) {
                AppnextAd appnextAd;
                try {
                    appnextAd = C3061a.m10493A().mo10378a(Interstitial.this.context, (ArrayList<AppnextAd>) (ArrayList) t, Interstitial.this.getCreative(), (C3148Ad) Interstitial.this);
                } catch (Throwable th) {
                    C3117a.m10553a("Interstitial$load", th);
                    return;
                }
                if (appnextAd != null) {
                    OnAdLoaded onAdLoadedCallback = Interstitial.this.getOnAdLoadedCallback();
                    if (onAdLoadedCallback != null) {
                        onAdLoadedCallback.adLoaded(appnextAd.getBannerID(), appnextAd.getCreativeType());
                        return;
                    }
                    return;
                }
                OnAdError onAdErrorCallback = Interstitial.this.getOnAdErrorCallback();
                if (onAdErrorCallback != null) {
                    onAdErrorCallback.adError(AppnextError.NO_ADS);
                }
            }

            public final void error(String str) {
                try {
                    OnAdError onAdErrorCallback = Interstitial.this.getOnAdErrorCallback();
                    if (onAdErrorCallback != null) {
                        onAdErrorCallback.adError(str);
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("Interstitial$error", th);
                }
            }
        }, getCreative());
    }

    private void loadConfig() {
        getConfig().mo10729h("tid", getTID());
        getConfig().mo10728a(this.context, getPlacementID(), new SettingsManager.ConfigCallback() {
            public final void error(String str) {
                try {
                    boolean unused = Interstitial.this.configLoaded = true;
                    if (Interstitial.this.calledShow) {
                        Interstitial.this.showAd();
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("Interstitial$error", th);
                }
            }

            public final void loaded(HashMap<String, Object> hashMap) {
                try {
                    boolean unused = Interstitial.this.configLoaded = true;
                    if (Interstitial.this.calledShow) {
                        Interstitial.this.showAd();
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("Interstitial$loadConfig", th);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void startInterstitialActivity() {
        try {
            Intent activityIntent = getActivityIntent();
            if (activityIntent != null) {
                this.context.startActivity(activityIntent);
                return;
            }
            throw new IllegalArgumentException("null intent");
        } catch (Throwable th) {
            C3117a.m10553a("Interstitial$startInterstitialActivity", th);
        }
    }

    public void destroy() {
        super.destroy();
        currentAd = null;
    }

    public String getAUID() {
        return "600";
    }

    /* access modifiers changed from: protected */
    public Intent getActivityIntent() {
        Intent intent = new Intent(this.context, InterstitialActivity.class);
        try {
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra(TtmlNode.ATTR_ID, getPlacementID());
            if (this.setAutoPlay) {
                intent.putExtra("auto_play", this.autoPlay);
            }
            if (this.setCanClose) {
                intent.putExtra("can_close", isBackButtonCanClose());
            }
            if (this.setMute) {
                intent.putExtra("mute", getMute());
            }
            intent.putExtra("cat", getCategories());
            intent.putExtra("lockcat", getSpecificCategories());
            intent.putExtra("pbk", getPostback());
            intent.putExtra("b_color", getButtonColor());
            intent.putExtra("skip_title", getSkipText());
            intent.putExtra("creative", getCreative());
        } catch (Throwable th) {
            C3117a.m10553a("Interstitial$getActivityIntent", th);
        }
        return intent;
    }

    public String getButtonColor() {
        return this.buttonColor;
    }

    /* access modifiers changed from: protected */
    public SettingsManager getConfig() {
        return C3063c.m10511C();
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    public void getECPM(final OnECPMLoaded onECPMLoaded) {
        if (onECPMLoaded != null) {
            try {
                C3061a.m10493A().mo10770a(this.context, (C3148Ad) this, getPlacementID(), (C3180d.C3185a) new C3180d.C3185a() {
                    /* renamed from: a */
                    public final <T> void mo10220a(T t) {
                        try {
                            AppnextAd a = C3061a.m10493A().mo10378a(Interstitial.this.context, (ArrayList<AppnextAd>) (ArrayList) t, Interstitial.this.getCreative(), (C3148Ad) Interstitial.this);
                            if (a != null) {
                                onECPMLoaded.ecpm(new ECPM(a.getECPM(), a.getPPR(), a.getBannerID()));
                            } else {
                                onECPMLoaded.error(AppnextError.NO_ADS);
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    public final void error(String str) {
                        onECPMLoaded.error(str);
                    }
                }, false);
            } catch (Throwable th) {
                C3117a.m10553a("Interstitial$getECPM", th);
            }
        } else {
            throw new IllegalArgumentException("Callback cannot be null");
        }
    }

    /* access modifiers changed from: protected */
    public C3258a getFallback() {
        return new C3062b();
    }

    public String getLanguage() {
        return this.language;
    }

    public OnAdError getOnAdErrorCallback() {
        return super.getOnAdErrorCallback();
    }

    /* access modifiers changed from: protected */
    public String getPageUrl() {
        return JS_URL;
    }

    /* access modifiers changed from: protected */
    public String getSessionId() {
        return super.getSessionId();
    }

    public String getSkipText() {
        return this.skipText;
    }

    public String getTID() {
        return TID;
    }

    public String getVID() {
        return VID;
    }

    public boolean isAdLoaded() {
        try {
            return !getPlacementID().equals("") && C3061a.m10493A().mo10382f(this);
        } catch (Throwable th) {
            C3117a.m10553a("Interstitial$isAdLoaded", th);
            return true;
        }
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    @Deprecated
    public boolean isBackButtonCanClose() {
        Boolean bool = this.canClose;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void loadAd() {
        try {
            if (getPlacementID().equals("")) {
                C3117a.m10553a("Interstitial$init", new Throwable("Placement ID cannot be empty"));
            }
            if (C3198g.m10792c(this.context, "android.permission.INTERNET")) {
                if (C3198g.m10800k(this.context)) {
                    C3211o.m10825az().mo10821a(new Runnable() {
                        public final void run() {
                            try {
                                if (Interstitial.this.context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                                    C3198g.m10776a(Interstitial.this.context, "http://www.appnext.com/myid.html", (HashMap<String, String>) null);
                                } else {
                                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) Interstitial.this.context.getSystemService("connectivity")).getActiveNetworkInfo();
                                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                        return;
                                    }
                                }
                                Interstitial.this.getConfig().mo10728a(Interstitial.this.context, Interstitial.this.getPlacementID(), new SettingsManager.ConfigCallback() {
                                    public final void error(String str) {
                                        Interstitial.this.load();
                                    }

                                    public final void loaded(HashMap<String, Object> hashMap) {
                                        Interstitial.this.load();
                                    }
                                });
                            } catch (Throwable th) {
                                C3117a.m10553a("Interstitial$init", th);
                                new Handler(Looper.getMainLooper()).post(new Runnable() {
                                    public final void run() {
                                        OnAdError onAdErrorCallback = Interstitial.this.getOnAdErrorCallback();
                                        if (onAdErrorCallback != null) {
                                            onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
                                        }
                                    }
                                });
                            }
                        }
                    });
                    return;
                }
            }
            OnAdError onAdErrorCallback = getOnAdErrorCallback();
            if (onAdErrorCallback != null) {
                onAdErrorCallback.adError(AppnextError.CONNECTION_ERROR);
            }
        } catch (Throwable th) {
            C3117a.m10553a("Interstitial$loadAd", th);
        }
    }

    public void setAutoPlay(boolean z) {
        this.setAutoPlay = true;
        this.autoPlay = z;
    }

    @Deprecated
    public void setBackButtonCanClose(boolean z) {
        this.setCanClose = true;
        this.canClose = Boolean.valueOf(z);
    }

    public void setButtonColor(String str) {
        if (str == null || str.equals("")) {
            this.buttonColor = "";
            return;
        }
        if (!str.startsWith("#")) {
            str = "#" + str;
        }
        try {
            Color.parseColor(str);
            this.buttonColor = str;
        } catch (Throwable unused) {
            throw new IllegalArgumentException("Unknown color");
        }
    }

    public void setCreativeType(String str) {
        if (str != null) {
            try {
                if (!str.equals(TYPE_MANAGED) && !str.equals("static")) {
                    if (!str.equals("video")) {
                        throw new IllegalArgumentException("Wrong creative type");
                    }
                }
                this.creativeType = str;
            } catch (Throwable th) {
                C3117a.m10553a("Interstitial$setCreativeType", th);
            }
        } else {
            throw new IllegalArgumentException("Wrong creative type");
        }
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setOnAdErrorCallback(OnAdError onAdError) {
        if (onAdError != null) {
            try {
                C30406 r0 = new OnAdError() {
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
                        C3198g.m10781a(Interstitial.this.context, Interstitial.this.getTID(), Interstitial.this.getVID(), Interstitial.this.getAUID(), Interstitial.this.getPlacementID(), Interstitial.this.getSessionId(), str2, "current_interstitial", "", "");
                        if (Interstitial.this.userOnAdErrorWR != null && (onAdError = (OnAdError) Interstitial.this.userOnAdErrorWR.get()) != null) {
                            onAdError.adError(str);
                        }
                    }
                };
                this.internalOnAdError = r0;
                super.setOnAdErrorCallback(r0);
                this.userOnAdErrorWR = new WeakReference<>(onAdError);
            } catch (Throwable th) {
                C3117a.m10553a("Interstitial$setOnAdErrorCallback", th);
            }
        }
    }

    @Deprecated
    public void setOrientation(String str) {
    }

    public void setParams(String str, String str2) {
        getConfig().mo10731j(str, str2);
    }

    public void setSkipText(String str) {
        if (str == null) {
            str = "";
        }
        this.skipText = str;
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
                int v = C3198g.m10802v(getConfig().mo10732y("min_internet_connection"));
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
                    currentAd = this;
                    if (C3061a.m10493A().mo10382f(this)) {
                        startInterstitialActivity();
                        return;
                    }
                    C3061a.m10493A().mo10380a(this.context, this, getPlacementID(), new C3180d.C3185a() {
                        /* renamed from: a */
                        public final <T> void mo10220a(T t) {
                            Interstitial.this.startInterstitialActivity();
                        }

                        public final void error(final String str) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                public final void run() {
                                    try {
                                        OnAdError onAdErrorCallback = Interstitial.this.getOnAdErrorCallback();
                                        if (onAdErrorCallback != null) {
                                            onAdErrorCallback.adError(str);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        }
                    }, getCreative());
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("Interstitial$showAd", th);
        }
    }

    public Interstitial(Context context, String str, InterstitialConfig interstitialConfig) {
        super(context, str);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        boolean z = true;
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.language = "";
        try {
            init();
            if (interstitialConfig != null) {
                setPostback(interstitialConfig.getPostback());
                setCategories(interstitialConfig.getCategories());
                setSpecificCategories(interstitialConfig.getSpecificCategories());
                setButtonColor(interstitialConfig.getButtonColor());
                if (interstitialConfig.backButtonCanClose != null) {
                    setBackButtonCanClose(interstitialConfig.isBackButtonCanClose());
                }
                setSkipText(interstitialConfig.getSkipText());
                if (interstitialConfig.autoPlay != null) {
                    setAutoPlay(interstitialConfig.isAutoPlay());
                }
                setCreativeType(interstitialConfig.getCreativeType());
                setOrientation(interstitialConfig.getOrientation());
                if (interstitialConfig.mute == null) {
                    z = false;
                }
                if (z) {
                    setMute(interstitialConfig.getMute());
                }
                setMinVideoLength(interstitialConfig.getMinVideoLength());
                setMaxVideoLength(interstitialConfig.getMaxVideoLength());
                setLanguage(interstitialConfig.getLanguage());
            }
        } catch (Throwable th) {
            C3117a.m10553a("Interstitial$Interstitial", th);
        }
    }

    protected Interstitial(Interstitial interstitial) {
        super(interstitial);
        this.creativeType = TYPE_MANAGED;
        this.titleText = "";
        this.skipText = "";
        this.autoPlay = true;
        this.setAutoPlay = false;
        this.setCanClose = false;
        this.configLoaded = false;
        this.calledShow = false;
        this.buttonColor = "";
        this.language = "";
        try {
            this.creativeType = interstitial.creativeType;
            this.titleText = interstitial.titleText;
            this.skipText = interstitial.skipText;
            this.autoPlay = interstitial.autoPlay;
            this.setAutoPlay = interstitial.setAutoPlay;
            this.setCanClose = interstitial.setCanClose;
            this.configLoaded = interstitial.configLoaded;
            this.calledShow = interstitial.calledShow;
            this.canClose = interstitial.canClose;
            this.buttonColor = interstitial.buttonColor;
            this.language = interstitial.language;
            this.userOnAdErrorWR = interstitial.userOnAdErrorWR;
        } catch (Throwable th) {
            C3117a.m10553a("Interstitial$Interstitial", th);
        }
    }
}
