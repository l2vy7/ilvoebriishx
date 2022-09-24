package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.C12437y;
import com.startapp.C12451y9;
import com.startapp.C12470z9;
import com.startapp.C5004d4;
import com.startapp.C5009h0;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class SplashScreen {

    /* renamed from: a */
    public Activity f54296a;

    /* renamed from: b */
    public SplashEventHandler f54297b;

    /* renamed from: c */
    public SplashConfig f54298c;

    /* renamed from: d */
    public CacheKey f54299d;

    /* renamed from: e */
    public SplashHtml f54300e = null;

    /* renamed from: f */
    public Handler f54301f = new Handler();

    /* renamed from: g */
    public boolean f54302g = false;

    /* renamed from: h */
    public SplashStartAppAd f54303h;

    /* renamed from: i */
    public AdPreferences f54304i;

    /* renamed from: j */
    public Runnable f54305j = new C12210a();

    /* renamed from: k */
    public Runnable f54306k = new C12211b();

    /* renamed from: l */
    public AdEventListener f54307l = new C12214c();

    /* compiled from: Sta */
    public static class SplashStartAppAd extends StartAppAd {
        private static final long serialVersionUID = 1;

        public SplashStartAppAd(Context context) {
            super(context);
            this.placement = AdPreferences.Placement.INAPP_SPLASH;
        }

        /* renamed from: a */
        public AdRulesResult mo20951a(String str, AdPreferences.Placement placement) {
            return new AdRulesResult(true, "");
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$a */
    /* compiled from: Sta */
    public class C12210a implements Runnable {
        public C12210a() {
        }

        public void run() {
            boolean z;
            SplashScreen splashScreen = SplashScreen.this;
            if (splashScreen.f54298c.mo20805b(splashScreen.f54296a)) {
                View view = null;
                if (splashScreen.mo45958b()) {
                    view = splashScreen.f54298c.mo20801a((Context) splashScreen.f54296a);
                } else {
                    SplashHtml splashHtml = splashScreen.f54300e;
                    if (splashHtml != null) {
                        view = splashHtml.mo45950b();
                    }
                }
                if (view != null) {
                    splashScreen.f54296a.setContentView(view, new ViewGroup.LayoutParams(-1, -1));
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    SplashScreen splashScreen2 = SplashScreen.this;
                    Context a = C5009h0.m22892a(splashScreen2.f54296a);
                    if (a == null) {
                        a = splashScreen2.f54296a;
                    }
                    SplashStartAppAd splashStartAppAd = new SplashStartAppAd(a);
                    splashScreen2.f54303h = splashStartAppAd;
                    splashStartAppAd.loadSplash(splashScreen2.f54304i, splashScreen2.f54307l, new C12470z9(splashScreen2));
                    SplashScreen splashScreen3 = SplashScreen.this;
                    splashScreen3.f54301f.postDelayed(new C12218c(splashScreen3), splashScreen3.f54298c.mo20803a().longValue());
                    splashScreen3.f54301f.postDelayed(new C12219d(splashScreen3), splashScreen3.f54298c.getMinSplashTime().getIndex());
                    return;
                }
                SplashScreen.this.f54296a.finish();
                return;
            }
            throw new IllegalArgumentException(splashScreen.f54298c.getErrorMessage());
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b */
    /* compiled from: Sta */
    public class C12211b implements Runnable {

        /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b$a */
        /* compiled from: Sta */
        public class C12212a implements C12451y9 {

            /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b$a$a */
            /* compiled from: Sta */
            public class C12213a implements AdDisplayListener {
                public C12213a() {
                }

                public void adClicked(C5041Ad ad) {
                    SplashScreen.this.f54297b.f54279f = true;
                }

                public void adDisplayed(C5041Ad ad) {
                    SplashScreen.this.f54297b.f54282i = SplashEventHandler.SplashState.DISPLAYED;
                }

                public void adHidden(C5041Ad ad) {
                    SplashEventHandler splashEventHandler = SplashScreen.this.f54297b;
                    splashEventHandler.f54282i = SplashEventHandler.SplashState.HIDDEN;
                    splashEventHandler.mo45943b();
                }

                public void adNotDisplayed(C5041Ad ad) {
                }
            }

            public C12212a() {
            }

            /* renamed from: a */
            public void mo45946a() {
                SplashStartAppAd splashStartAppAd;
                SplashScreen splashScreen = SplashScreen.this;
                if (!splashScreen.f54302g && (splashStartAppAd = splashScreen.f54303h) != null) {
                    splashStartAppAd.showAd((AdDisplayListener) new C12213a());
                    SplashScreen splashScreen2 = SplashScreen.this;
                    if (splashScreen2.f54298c.getMaxAdDisplayTime() != SplashConfig.MaxAdDisplayTime.FOR_EVER) {
                        splashScreen2.f54301f.postDelayed(new C12220e(splashScreen2), splashScreen2.f54298c.getMaxAdDisplayTime().getIndex());
                    }
                    SplashScreen.this.f54296a.finish();
                }
            }
        }

        public C12211b() {
        }

        public void run() {
            SplashScreen splashScreen = SplashScreen.this;
            SplashEventHandler splashEventHandler = splashScreen.f54297b;
            SplashHtml splashHtml = splashScreen.f54300e;
            C12212a aVar = new C12212a();
            splashEventHandler.getClass();
            if (splashHtml == null) {
                aVar.mo45946a();
                return;
            }
            splashHtml.callback = aVar;
            splashHtml.mo45948a();
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$c */
    /* compiled from: Sta */
    public class C12214c implements AdEventListener {
        public C12214c() {
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            SplashScreen splashScreen = SplashScreen.this;
            if (splashScreen.f54303h != null) {
                SplashEventHandler splashEventHandler = splashScreen.f54297b;
                splashEventHandler.f54282i = SplashEventHandler.SplashState.DO_NOT_DISPLAY;
                splashEventHandler.mo45941a((Runnable) null);
            }
        }

        public void onReceiveAd(C5041Ad ad) {
            SplashScreen splashScreen = SplashScreen.this;
            SplashEventHandler splashEventHandler = splashScreen.f54297b;
            Runnable runnable = splashScreen.f54306k;
            if (splashEventHandler.f54282i == SplashEventHandler.SplashState.LOADING) {
                splashEventHandler.f54282i = SplashEventHandler.SplashState.RECEIVED;
            }
            splashEventHandler.mo45941a(runnable);
        }
    }

    /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$d */
    /* compiled from: Sta */
    public static /* synthetic */ class C12215d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54313a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.splash.SplashConfig$Orientation[] r0 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54313a = r0
                com.startapp.sdk.ads.splash.SplashConfig$Orientation r1 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54313a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.splash.SplashConfig$Orientation r1 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.splash.SplashScreen.C12215d.<clinit>():void");
        }
    }

    public SplashScreen(Activity activity, SplashConfig splashConfig, AdPreferences adPreferences) {
        this.f54296a = activity;
        this.f54298c = splashConfig;
        this.f54304i = adPreferences;
        try {
            mo45957a();
            this.f54297b = new SplashEventHandler(activity, this.f54300e);
        } catch (Throwable th) {
            SplashEventHandler splashEventHandler = new SplashEventHandler(activity);
            this.f54297b = splashEventHandler;
            splashEventHandler.mo45945d();
            this.f54297b.mo45940a();
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: a */
    public final void mo45957a() {
        SplashConfig splashConfig = this.f54298c;
        Activity activity = this.f54296a;
        if (splashConfig.getLogo() == null && splashConfig.getLogoRes() == -1 && splashConfig.getLogoByteArray() != null) {
            byte[] logoByteArray = splashConfig.getLogoByteArray();
            splashConfig.f22226a = new BitmapDrawable(activity.getResources(), BitmapFactory.decodeByteArray(logoByteArray, 0, logoByteArray.length));
        }
        if (!mo45958b()) {
            this.f54300e = this.f54298c.mo20802a(this.f54296a);
        }
    }

    /* renamed from: b */
    public final boolean mo45958b() {
        return !this.f54298c.isHtmlSplash() || this.f54298c.mo20804b();
    }

    /* renamed from: c */
    public final boolean mo45959c() {
        int i = this.f54296a.getResources().getConfiguration().orientation;
        if (this.f54298c.getOrientation() == SplashConfig.Orientation.AUTO) {
            if (i == 2) {
                this.f54298c.setOrientation(SplashConfig.Orientation.LANDSCAPE);
            } else {
                this.f54298c.setOrientation(SplashConfig.Orientation.PORTRAIT);
            }
        }
        int i2 = C12215d.f54313a[this.f54298c.getOrientation().ordinal()];
        boolean z = false;
        boolean z2 = true;
        if (i2 == 1) {
            if (i == 2) {
                z = true;
            }
            Activity activity = this.f54296a;
            int i3 = C12437y.f55146a;
            if (Build.VERSION.SDK_INT >= 9) {
                try {
                    activity.setRequestedOrientation(7);
                    return z;
                } catch (Throwable unused) {
                    return z;
                }
            } else {
                activity.setRequestedOrientation(1);
                return z;
            }
        } else if (i2 != 2) {
            return false;
        } else {
            if (i != 1) {
                z2 = false;
            }
            Activity activity2 = this.f54296a;
            int i4 = C12437y.f55146a;
            if (Build.VERSION.SDK_INT >= 9) {
                try {
                    activity2.setRequestedOrientation(6);
                } catch (Throwable unused2) {
                }
            } else {
                activity2.setRequestedOrientation(0);
            }
            return z2;
        }
    }
}
