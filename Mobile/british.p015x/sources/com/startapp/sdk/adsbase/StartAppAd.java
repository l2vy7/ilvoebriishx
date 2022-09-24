package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C11876e;
import com.startapp.C11894f;
import com.startapp.C11911g;
import com.startapp.C12017kc;
import com.startapp.C12339t2;
import com.startapp.C5004d4;
import com.startapp.C5007h;
import com.startapp.C5009h0;
import com.startapp.C5011i;
import com.startapp.C5015nb;
import com.startapp.C5116u5;
import com.startapp.C5126w2;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5057c;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.cache.C5065h;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;

/* compiled from: Sta */
public class StartAppAd extends C5041Ad {
    private static final long serialVersionUID = 1;

    /* renamed from: ad */
    public C5068d f22258ad = null;
    /* access modifiers changed from: private */
    public CacheKey adKey = null;
    private AdMode adMode = AdMode.AUTOMATIC;
    private AdPreferences adPreferences = null;
    public AdDisplayListener callback = null;
    private final BroadcastReceiver callbackBroadcastReceiver = new C5047a();
    public VideoListener videoListener = null;

    /* compiled from: Sta */
    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$a */
    /* compiled from: Sta */
    public class C5047a extends BroadcastReceiver {
        public C5047a() {
        }

        public void onReceive(Context context, Intent intent) {
            C11876e eVar;
            C12017kc kcVar;
            C11911g gVar;
            C11894f fVar;
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            String stringExtra = intent.getStringExtra("dParam");
            if (action.equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                if (extras.containsKey("showFailedReason")) {
                    StartAppAd.this.mo20838a((NotDisplayedReason) extras.getSerializable("showFailedReason"));
                }
                StartAppAd startAppAd = StartAppAd.this;
                C5007h.m22891a(context, startAppAd.callback, startAppAd);
                C5116u5.m23368a(context).mo21242a((BroadcastReceiver) this);
            } else {
                boolean z = true;
                if (action.equals("com.startapp.android.ShowDisplayBroadcastListener")) {
                    StartAppAd startAppAd2 = StartAppAd.this;
                    AdDisplayListener adDisplayListener = startAppAd2.callback;
                    if (adDisplayListener == null) {
                        z = false;
                    }
                    C12339t2.m53496a("onShow", z, stringExtra, (String) null);
                    if (adDisplayListener == null) {
                        fVar = null;
                    } else {
                        fVar = new C11894f(adDisplayListener, startAppAd2, context);
                    }
                    C5055a.m23152a((Runnable) fVar);
                } else if (action.equals("com.startapp.android.OnClickCallback")) {
                    StartAppAd startAppAd3 = StartAppAd.this;
                    AdDisplayListener adDisplayListener2 = startAppAd3.callback;
                    if (adDisplayListener2 == null) {
                        z = false;
                    }
                    C12339t2.m53496a("onClicked", z, stringExtra, (String) null);
                    if (adDisplayListener2 == null) {
                        gVar = null;
                    } else {
                        gVar = new C11911g(adDisplayListener2, startAppAd3, context);
                    }
                    C5055a.m23152a((Runnable) gVar);
                } else if (action.equals("com.startapp.android.OnVideoCompleted")) {
                    VideoListener videoListener = StartAppAd.this.videoListener;
                    if (videoListener == null) {
                        z = false;
                    }
                    C12339t2.m53496a("onVideoCompleted", z, stringExtra, (String) null);
                    if (videoListener == null) {
                        kcVar = null;
                    } else {
                        kcVar = new C12017kc(videoListener, context);
                    }
                    C5055a.m23152a((Runnable) kcVar);
                } else {
                    StartAppAd startAppAd4 = StartAppAd.this;
                    AdDisplayListener adDisplayListener3 = startAppAd4.callback;
                    if (adDisplayListener3 == null) {
                        z = false;
                    }
                    C12339t2.m53496a("adHidden", z, stringExtra, (String) null);
                    if (adDisplayListener3 == null) {
                        eVar = null;
                    } else {
                        eVar = new C11876e(adDisplayListener3, startAppAd4, context);
                    }
                    C5055a.m23152a((Runnable) eVar);
                    C5116u5.m23368a(context).mo21242a((BroadcastReceiver) this);
                }
            }
            StartAppAd.this.f22258ad = null;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$b */
    /* compiled from: Sta */
    public class C5048b implements C5059d.C5060d {

        /* renamed from: a */
        public final /* synthetic */ AdEventListener f22260a;

        public C5048b(AdEventListener adEventListener) {
            this.f22260a = adEventListener;
        }

        /* renamed from: a */
        public void mo20975a(C5041Ad ad, CacheKey cacheKey, boolean z) {
            CacheKey unused = StartAppAd.this.adKey = cacheKey;
            AdEventListener adEventListener = this.f22260a;
            if (adEventListener == null) {
                return;
            }
            if (!z || ad == null) {
                adEventListener.onFailedToReceiveAd(ad);
            } else {
                adEventListener.onReceiveAd(ad);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$c */
    /* compiled from: Sta */
    public class C5049c extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ Activity f22262a;

        /* renamed from: b */
        public final /* synthetic */ SplashHideListener f22263b;

        public C5049c(Activity activity, SplashHideListener splashHideListener) {
            this.f22262a = activity;
            this.f22263b = splashHideListener;
        }

        public void onReceive(Context context, Intent intent) {
            C5015nb.m22914a(this.f22262a, false);
            SplashHideListener splashHideListener = this.f22263b;
            if (splashHideListener != null) {
                splashHideListener.splashHidden();
            }
            C5116u5.m23368a((Context) this.f22262a).mo21242a((BroadcastReceiver) this);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppAd$d */
    /* compiled from: Sta */
    public static /* synthetic */ class C5050d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22264a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.startapp.sdk.adsbase.StartAppAd$AdMode[] r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22264a = r0
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22264a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22264a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OVERLAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22264a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r1 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.C5050d.<clinit>():void");
        }
    }

    public StartAppAd(Context context) {
        super(context, (AdPreferences.Placement) null);
        try {
            ComponentLocator.m23305a(context).mo21231r().mo21248a(8192);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        C5057c.C5058a.f22344a.f22339a = false;
    }

    public static void disableSplash() {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal.C5051d.f22295a.f22290v = true;
        C5059d.f22346h.mo21051b(AdPreferences.Placement.INAPP_SPLASH);
    }

    public static void enableAutoInterstitial() {
        C5057c.C5058a.f22344a.f22339a = true;
    }

    public static void enableConsent(Context context, boolean z) {
        ComponentLocator.m23305a(context).mo21219f().f22115e = z;
    }

    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        C5057c cVar = C5057c.C5058a.f22344a;
        cVar.f22340b = autoInterstitialPreferences;
        cVar.f22341c = -1;
        cVar.f22342d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context a = C5009h0.m22892a(context);
        if (a != null) {
            Object obj = StartAppSDKInternal.f22265C;
            StartAppSDKInternal.C5051d.f22295a.f22269a = sDKAdPreferences;
            C5126w2.m23394b(a, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
        }
    }

    public static void setReturnAdsPreferences(AdPreferences adPreferences2) {
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        boolean z = !C5015nb.m22922a(startAppSDKInternal.f22286r, adPreferences2);
        startAppSDKInternal.f22286r = adPreferences2 != null ? new AdPreferences(adPreferences2) : null;
        if (z) {
            C5059d dVar = C5059d.f22346h;
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
            if (!dVar.f22350d) {
                synchronized (dVar.f22347a) {
                    for (C5065h next : dVar.f22347a.values()) {
                        if (next.f22364a == placement) {
                            next.mo21058b();
                        }
                    }
                }
            }
        }
    }

    public static void showSplash(Activity activity, Bundle bundle) {
        showSplash(activity, bundle, new SplashConfig());
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences2, AdEventListener adEventListener) {
    }

    public void close() {
        C5116u5.m23368a(this.f22229a).mo21242a(this.callbackBroadcastReceiver);
        C5116u5.m23368a(this.f22229a).mo21244a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.adKey;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.sdk.adsbase.model.AdPreferences.Placement mo20846f() {
        /*
            r3 = this;
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r3.placement
            if (r0 != 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.CacheKey r1 = r3.adKey
            if (r1 == 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            com.startapp.sdk.adsbase.d r1 = r2.mo21043a((com.startapp.sdk.adsbase.cache.CacheKey) r1)
            if (r1 == 0) goto L_0x001e
            com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            com.startapp.sdk.adsbase.cache.CacheKey r1 = r3.adKey
            com.startapp.sdk.adsbase.d r0 = r0.mo21043a((com.startapp.sdk.adsbase.cache.CacheKey) r1)
            com.startapp.sdk.adsbase.Ad r0 = (com.startapp.sdk.adsbase.C5041Ad) r0
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r0.mo20846f()
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.mo20846f():com.startapp.sdk.adsbase.model.AdPreferences$Placement");
    }

    public String getAdId() {
        C5068d a = C5059d.f22346h.mo21043a(this.adKey);
        if (a instanceof HtmlAd) {
            return ((HtmlAd) a).getAdId();
        }
        return null;
    }

    public String getBidToken() {
        C5068d a = C5059d.f22346h.mo21043a(this.adKey);
        if (a instanceof HtmlAd) {
            return ((HtmlAd) a).getBidToken();
        }
        return null;
    }

    public C5041Ad.AdState getState() {
        C5068d a = C5059d.f22346h.mo21043a(this.adKey);
        if (a != null) {
            return a.getState();
        }
        return C5041Ad.AdState.UN_INITIALIZED;
    }

    public boolean isBelowMinCPM() {
        C5068d a = C5059d.f22346h.mo21043a(this.adKey);
        if (a != null) {
            return a.isBelowMinCPM();
        }
        return false;
    }

    public boolean isNetworkAvailable() {
        return C5015nb.m22938g(this.f22229a);
    }

    public boolean isReady() {
        C5068d a = C5059d.f22346h.mo21043a(this.adKey);
        if (a != null) {
            return a.isReady();
        }
        return false;
    }

    @Deprecated
    public void load(AdPreferences adPreferences2, AdEventListener adEventListener) {
        if (MetaData.f22407k.mo21188b()) {
            C5059d.f22346h.mo21044a(this.f22229a, this, this.adMode, adPreferences2, (C5059d.C5060d) new C5048b(adEventListener));
        } else if (adEventListener != null) {
            setErrorMessage("serving ads disabled");
            C5011i.m22894a(this.f22229a, adEventListener, this, false);
        }
    }

    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), (AdEventListener) null);
    }

    public void loadSplash(AdPreferences adPreferences2, AdEventListener adEventListener, C5059d.C5060d dVar) {
        C5059d dVar2 = C5059d.f22346h;
        Context context = this.f22229a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_SPLASH;
        if (dVar2.mo21049a(placement)) {
            dVar2.mo21046a(context, this, placement, adPreferences2, dVar, false, 0);
        } else if (dVar != null) {
            dVar.mo20975a((C5041Ad) null, (CacheKey) null, false);
        }
    }

    public void onBackPressed() {
        showAd("exit_ad");
        Object obj = StartAppSDKInternal.f22265C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
        startAppSDKInternal.f22272d = false;
        startAppSDKInternal.f22274f = true;
    }

    public void onPause() {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        int i = bundle.getInt("AdMode");
        this.adMode = AdMode.AUTOMATIC;
        if (i == 1) {
            this.adMode = AdMode.FULLPAGE;
        } else if (i == 2) {
            this.adMode = AdMode.OFFERWALL;
        } else if (i == 3) {
            this.adMode = AdMode.OVERLAY;
        } else if (i == 4) {
            this.adMode = AdMode.REWARDED_VIDEO;
        } else if (i == 5) {
            this.adMode = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.adPreferences = (AdPreferences) serializable;
        }
    }

    public void onResume() {
        if (!isReady()) {
            loadAd();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i = C5050d.f22264a[this.adMode.ordinal()];
        int i2 = 4;
        if (i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 2;
        } else if (i == 3) {
            i2 = 3;
        } else if (i != 4) {
            i2 = 0;
        }
        AdPreferences adPreferences2 = this.adPreferences;
        if (adPreferences2 != null) {
            bundle.putSerializable("AdPrefs", adPreferences2);
        }
        bundle.putInt("AdMode", i2);
    }

    public void setVideoListener(VideoListener videoListener2) {
        this.videoListener = videoListener2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0165, code lost:
        if (r14 == false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e0  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean show(java.lang.String r13, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.f22229a
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r0)
            com.startapp.v8 r1 = r0.mo21231r()     // Catch:{ all -> 0x0011 }
            r2 = 32768(0x8000, float:4.5918E-41)
            r1.mo21248a((int) r2)     // Catch:{ all -> 0x0011 }
            goto L_0x0012
        L_0x0011:
        L_0x0012:
            r1 = 0
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r1)
            r12.callback = r14
            com.startapp.sdk.adsbase.remoteconfig.MetaData r14 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
            boolean r14 = r14.mo21188b()
            r2 = 0
            if (r14 != 0) goto L_0x002e
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r13 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.SERVING_ADS_DISABLED
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r13)
            android.content.Context r13 = r12.f22229a
            com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14 = r12.callback
            com.startapp.C5007h.m22891a(r13, r14, r12)
            return r2
        L_0x002e:
            com.startapp.sdk.adsbase.cache.CacheKey r14 = r12.adKey
            if (r14 != 0) goto L_0x0039
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.model.AdPreferences r3 = r12.adPreferences
            r12.loadAd((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14, (com.startapp.sdk.adsbase.model.AdPreferences) r3)
        L_0x0039:
            com.startapp.sdk.adsbase.AdsCommonMetaData r14 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h
            boolean r14 = r14.mo20885O()
            r3 = 1
            if (r14 == 0) goto L_0x004d
            android.content.Context r14 = r12.f22229a
            boolean r14 = com.startapp.C5015nb.m22936e((android.content.Context) r14)
            if (r14 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r14 = 0
            goto L_0x004e
        L_0x004d:
            r14 = 1
        L_0x004e:
            if (r14 == 0) goto L_0x0178
            boolean r14 = r12.isNetworkAvailable()
            if (r14 == 0) goto L_0x0172
            boolean r14 = r12.isReady()
            if (r14 == 0) goto L_0x010e
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r14 = r12.mo20846f()
            com.startapp.sdk.adsbase.adrules.AdRulesResult r4 = r12.mo20951a((java.lang.String) r13, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r14)
            boolean r5 = r4.mo21025b()
            if (r5 == 0) goto L_0x0105
            com.startapp.sdk.adsbase.cache.d r5 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            com.startapp.sdk.adsbase.cache.CacheKey r6 = r12.adKey
            com.startapp.sdk.adsbase.d r5 = r5.mo21052c(r6)
            r12.f22258ad = r5
            if (r5 == 0) goto L_0x010a
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r6 = r12.placement
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r7 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_SPLASH
            if (r6 != r7) goto L_0x0094
            java.lang.Object r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.f22265C
            com.startapp.sdk.adsbase.StartAppSDKInternal r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.C5051d.f22295a
            boolean r8 = r6.f22271c
            if (r8 == 0) goto L_0x008a
            boolean r6 = r6.f22272d
            if (r6 == 0) goto L_0x008a
            r6 = 1
            goto L_0x008b
        L_0x008a:
            r6 = 0
        L_0x008b:
            if (r6 == 0) goto L_0x0094
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.APP_IN_BACKGROUND
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
            goto L_0x010a
        L_0x0094:
            boolean r5 = r5.mo21075a((java.lang.String) r13)
            if (r5 == 0) goto L_0x00ee
            com.startapp.d r6 = com.startapp.C5003d.f22119d
            com.startapp.c r8 = new com.startapp.c
            r8.<init>(r14, r13)
            r6.mo20659a(r8)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            if (r14 == 0) goto L_0x00bc
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r14 = r12.placement
            if (r14 == r7) goto L_0x00bc
            com.startapp.sdk.adsbase.model.AdPreferences r14 = r12.adPreferences
            if (r14 == 0) goto L_0x00bd
            com.startapp.sdk.adsbase.model.AdPreferences r6 = new com.startapp.sdk.adsbase.model.AdPreferences
            r6.<init>()
            boolean r14 = r14.equals(r6)
            if (r14 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r3 = 0
        L_0x00bd:
            if (r3 == 0) goto L_0x00fd
            com.startapp.sdk.adsbase.cache.d r14 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.C5059d.m23193a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            com.startapp.sdk.adsbase.e r0 = r0.mo21217d()
            com.startapp.sdk.adsbase.e$a r0 = r0.edit()
            r0.mo21098a((java.lang.String) r14, (int) r2)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.StartAppAd$AdMode r3 = com.startapp.sdk.adsbase.StartAppAd.AdMode.AUTOMATIC
            if (r14 != r3) goto L_0x00ea
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.C5059d.m23193a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            r0.mo21098a((java.lang.String) r14, (int) r2)
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL
            java.lang.String r14 = com.startapp.sdk.adsbase.cache.C5059d.m23193a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r14)
            r0.mo21098a((java.lang.String) r14, (int) r2)
        L_0x00ea:
            r0.apply()
            goto L_0x00fd
        L_0x00ee:
            com.startapp.sdk.adsbase.d r14 = r12.f22258ad
            boolean r0 = r14 instanceof com.startapp.sdk.adsbase.C5041Ad
            if (r0 == 0) goto L_0x00fd
            com.startapp.sdk.adsbase.Ad r14 = (com.startapp.sdk.adsbase.C5041Ad) r14
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = r14.getNotDisplayedReason()
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x00fd:
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.model.AdPreferences r0 = r12.adPreferences
            r12.loadAd(r14, r0, r1)
            goto L_0x010b
        L_0x0105:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_RULES
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x010a:
            r5 = 0
        L_0x010b:
            r3 = 0
            goto L_0x0180
        L_0x010e:
            com.startapp.sdk.adsbase.StartAppAd$AdMode r14 = r12.adMode
            com.startapp.sdk.adsbase.StartAppAd$AdMode r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO
            if (r14 == r0) goto L_0x0168
            com.startapp.sdk.adsbase.StartAppAd$AdMode r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.VIDEO
            if (r14 == r0) goto L_0x0168
            com.startapp.sdk.adsbase.remoteconfig.MetaData r14 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
            boolean r14 = r14.mo21188b()
            if (r14 == 0) goto L_0x0164
            com.startapp.sdk.adsbase.AdsCommonMetaData r14 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h
            com.startapp.sdk.adsbase.VideoConfig r14 = r14.mo20877G()
            boolean r14 = r14.mo21010q()
            if (r14 != 0) goto L_0x012d
            goto L_0x0164
        L_0x012d:
            com.startapp.sdk.adsbase.model.AdPreferences r14 = r12.adPreferences
            if (r14 != 0) goto L_0x0136
            com.startapp.sdk.adsbase.model.AdPreferences r14 = new com.startapp.sdk.adsbase.model.AdPreferences
            r14.<init>()
        L_0x0136:
            com.startapp.sdk.adsbase.Ad$AdType r0 = com.startapp.sdk.adsbase.C5041Ad.AdType.NON_VIDEO
            r14.setType(r0)
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = r12.mo20846f()
            com.startapp.sdk.adsbase.cache.d r4 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            com.startapp.sdk.adsbase.cache.CacheKey r5 = new com.startapp.sdk.adsbase.cache.CacheKey
            r5.<init>(r0, r14)
            com.startapp.sdk.adsbase.d r14 = r4.mo21043a((com.startapp.sdk.adsbase.cache.CacheKey) r5)
            if (r14 == 0) goto L_0x0164
            boolean r4 = r14.isReady()
            if (r4 == 0) goto L_0x0164
            com.startapp.sdk.adsbase.adrules.AdRulesResult r0 = r12.mo20951a((java.lang.String) r13, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r0)
            boolean r0 = r0.mo21025b()
            if (r0 == 0) goto L_0x0164
            r14.mo21073a((boolean) r3)
            boolean r14 = r14.mo21075a((java.lang.String) r13)
            goto L_0x0165
        L_0x0164:
            r14 = 0
        L_0x0165:
            if (r14 == 0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r3 = 0
        L_0x0169:
            if (r3 != 0) goto L_0x0170
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_NOT_READY
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x0170:
            r4 = r1
            goto L_0x017f
        L_0x0172:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.NETWORK_PROBLEM
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
            goto L_0x017d
        L_0x0178:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.APP_IN_BACKGROUND
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x017d:
            r4 = r1
            r3 = 0
        L_0x017f:
            r5 = 0
        L_0x0180:
            if (r5 != 0) goto L_0x0184
            if (r3 == 0) goto L_0x01de
        L_0x0184:
            android.content.Context r14 = r12.f22229a
            com.startapp.u5 r14 = com.startapp.C5116u5.m23368a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.HideDisplayBroadcastListener"
            r6.<init>(r7)
            r14.mo21243a(r0, r6)
            android.content.Context r14 = r12.f22229a
            com.startapp.u5 r14 = com.startapp.C5116u5.m23368a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.ShowDisplayBroadcastListener"
            r6.<init>(r7)
            r14.mo21243a(r0, r6)
            android.content.Context r14 = r12.f22229a
            com.startapp.u5 r14 = com.startapp.C5116u5.m23368a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.ShowFailedDisplayBroadcastListener"
            r6.<init>(r7)
            r14.mo21243a(r0, r6)
            android.content.Context r14 = r12.f22229a
            com.startapp.u5 r14 = com.startapp.C5116u5.m23368a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.OnClickCallback"
            r6.<init>(r7)
            r14.mo21243a(r0, r6)
            android.content.Context r14 = r12.f22229a
            com.startapp.u5 r14 = com.startapp.C5116u5.m23368a((android.content.Context) r14)
            android.content.BroadcastReceiver r0 = r12.callbackBroadcastReceiver
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "com.startapp.android.OnVideoCompleted"
            r6.<init>(r7)
            r14.mo21243a(r0, r6)
        L_0x01de:
            if (r5 != 0) goto L_0x0229
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = r12.getNotDisplayedReason()
            if (r14 != 0) goto L_0x01eb
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.INTERNAL_ERROR
            r12.mo20838a((com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason) r14)
        L_0x01eb:
            com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
            com.startapp.sdk.adsbase.cache.CacheKey r6 = r12.adKey
            com.startapp.sdk.adsbase.d r0 = r0.mo21043a((com.startapp.sdk.adsbase.cache.CacheKey) r6)
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r6 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_RULES
            if (r14 == r6) goto L_0x0211
            if (r3 == 0) goto L_0x01fb
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r14 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK
        L_0x01fb:
            android.content.Context r6 = r12.f22229a
            com.startapp.sdk.adsbase.d r2 = r12.f22258ad
            if (r2 == 0) goto L_0x0202
            r0 = r2
        L_0x0202:
            java.lang.String[] r7 = com.startapp.sdk.adsbase.C5055a.m23159a((com.startapp.sdk.adsbase.C5068d) r0)
            java.lang.String r10 = r14.toString()
            r9 = 0
            r11 = 0
            r8 = r13
            com.startapp.sdk.adsbase.C5055a.m23151a((android.content.Context) r6, (java.lang.String[]) r7, (java.lang.String) r8, (int) r9, (java.lang.String) r10, (org.json.JSONObject) r11)
            goto L_0x021e
        L_0x0211:
            if (r4 == 0) goto L_0x021e
            java.lang.String[] r14 = com.startapp.sdk.adsbase.C5055a.m23159a((com.startapp.sdk.adsbase.C5068d) r0)
            java.lang.String r0 = r4.mo21024a()
            com.startapp.sdk.adsbase.C5055a.m23154a(r14, r13, r2, r0)
        L_0x021e:
            r12.f22258ad = r1
            if (r3 != 0) goto L_0x0229
            android.content.Context r13 = r12.f22229a
            com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14 = r12.callback
            com.startapp.C5007h.m22891a(r13, r14, r12)
        L_0x0229:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.show(java.lang.String, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener):boolean");
    }

    public boolean showAd() {
        return showAd((String) null, (AdDisplayListener) null);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
        showSplash(activity, bundle, splashConfig, new AdPreferences());
    }

    /* renamed from: a */
    public AdRulesResult mo20951a(String str, AdPreferences.Placement placement) {
        return AdsCommonMetaData.f22242h.mo20888b().mo21019a(placement, str);
    }

    public void loadAd(AdPreferences adPreferences2) {
        loadAd(AdMode.AUTOMATIC, adPreferences2, (AdEventListener) null);
    }

    public boolean showAd(String str) {
        return showAd(str, (AdDisplayListener) null);
    }

    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences2) {
        showSplash(activity, bundle, new SplashConfig(), adPreferences2);
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd((String) null, adDisplayListener);
    }

    /* renamed from: a */
    public static void m23092a(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2, SplashHideListener splashHideListener, boolean z) {
        if (activity != null && bundle == null && MetaData.f22407k.mo21188b() && C5015nb.m22936e((Context) activity) && ComponentLocator.m23305a((Context) activity).mo21216c().mo20648a()) {
            try {
                Object obj = StartAppSDKInternal.f22265C;
                StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C5051d.f22295a;
                int i = 0;
                if (!(!startAppSDKInternal.f22290v) && z) {
                    startAppSDKInternal.f22290v = false;
                }
                startAppSDKInternal.f22289u = z;
                if (!z) {
                    if (adPreferences2 == null) {
                        adPreferences2 = new AdPreferences();
                    }
                    adPreferences2.setAs(Boolean.TRUE);
                }
                splashConfig.setDefaults(activity);
                C5015nb.m22899a(activity, activity.getResources().getConfiguration().orientation, true);
                Intent intent = new Intent(activity, OverlayActivity.class);
                intent.putExtra("SplashConfig", splashConfig);
                intent.putExtra("AdPreference", adPreferences2);
                intent.putExtra("testMode", false);
                intent.putExtra("fullscreen", C5055a.m23155a(activity));
                intent.putExtra(IronSourceConstants.EVENTS_PLACEMENT_NAME, AdPreferences.Placement.INAPP_SPLASH.mo21158a());
                if (Build.VERSION.SDK_INT >= 11) {
                    i = 32768;
                }
                intent.addFlags(67108864 | i | 1073741824);
                activity.startActivity(intent);
                C5116u5.m23368a((Context) activity).mo21243a(new C5049c(activity, splashHideListener), new IntentFilter("com.startapp.android.splashHidden"));
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                if (splashHideListener != null) {
                    splashHideListener.splashHidden();
                }
            }
        }
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2) {
        showSplash(activity, bundle, splashConfig, adPreferences2, (SplashHideListener) null);
    }

    public void loadAd(AdPreferences adPreferences2, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences2, adEventListener);
    }

    public boolean showAd(String str, AdDisplayListener adDisplayListener) {
        try {
            return show(str, adDisplayListener);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            mo20838a(NotDisplayedReason.INTERNAL_ERROR);
            C5007h.m22891a(this.f22229a, this.callback, (C5041Ad) null);
            throw null;
        }
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2, SplashHideListener splashHideListener) {
        m23092a(activity, bundle, splashConfig, adPreferences2, splashHideListener, true);
    }

    public void loadAd(AdMode adMode2) {
        loadAd(adMode2, new AdPreferences(), (AdEventListener) null);
    }

    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    public void loadAd(AdMode adMode2, AdPreferences adPreferences2) {
        loadAd(adMode2, adPreferences2, (AdEventListener) null);
    }

    public void loadAd(AdMode adMode2, AdEventListener adEventListener) {
        loadAd(adMode2, new AdPreferences(), adEventListener);
    }

    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return false;
        }
    }

    public void loadAd(AdMode adMode2, AdPreferences adPreferences2, AdEventListener adEventListener) {
        try {
            ComponentLocator.m23305a(this.f22229a).mo21231r().mo21248a(16384);
        } catch (Throwable unused) {
        }
        this.adMode = adMode2;
        this.adPreferences = adPreferences2;
        try {
            load(adPreferences2, adEventListener);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            if (adEventListener != null) {
                C5011i.m22894a(this.f22229a, adEventListener, this, false);
            }
        }
    }

    @Deprecated
    public boolean show() {
        return show((String) null, (AdDisplayListener) null);
    }
}
