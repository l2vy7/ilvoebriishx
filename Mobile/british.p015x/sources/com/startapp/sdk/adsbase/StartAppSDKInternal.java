package com.startapp.sdk.adsbase;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.C11828cb;
import com.startapp.C11844d2;
import com.startapp.C11877e0;
import com.startapp.C11882e4;
import com.startapp.C11956i4;
import com.startapp.C12016kb;
import com.startapp.C12034lb;
import com.startapp.C12128p7;
import com.startapp.C12153r;
import com.startapp.C12430x7;
import com.startapp.C12437y;
import com.startapp.C12465z5;
import com.startapp.C5000a0;
import com.startapp.C5004d4;
import com.startapp.C5005f0;
import com.startapp.C5009h0;
import com.startapp.C5014n9;
import com.startapp.C5015nb;
import com.startapp.C5126w2;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.crashreport.C12282b;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.C5073c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.lang.Thread;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class StartAppSDKInternal implements C5005f0 {

    /* renamed from: C */
    public static final Object f22265C = new Object();

    /* renamed from: D */
    public static volatile InitState f22266D = InitState.UNSET;

    /* renamed from: A */
    public C11828cb f22267A;

    /* renamed from: B */
    public boolean f22268B;

    /* renamed from: a */
    public SDKAdPreferences f22269a;

    /* renamed from: b */
    public boolean f22270b = true;

    /* renamed from: c */
    public final boolean f22271c = C12437y.m53781a();

    /* renamed from: d */
    public boolean f22272d = false;

    /* renamed from: e */
    public boolean f22273e = false;

    /* renamed from: f */
    public boolean f22274f = false;

    /* renamed from: g */
    public long f22275g;

    /* renamed from: h */
    public Application f22276h;

    /* renamed from: i */
    public HashMap<Integer, Integer> f22277i = new HashMap<>();

    /* renamed from: j */
    public Object f22278j;

    /* renamed from: k */
    public Activity f22279k;

    /* renamed from: l */
    public boolean f22280l = false;

    /* renamed from: m */
    public boolean f22281m = true;

    /* renamed from: n */
    public boolean f22282n = false;

    /* renamed from: o */
    public boolean f22283o = false;

    /* renamed from: p */
    public Map<String, String> f22284p;

    /* renamed from: q */
    public Bundle f22285q = null;

    /* renamed from: r */
    public AdPreferences f22286r;

    /* renamed from: s */
    public CacheKey f22287s;

    /* renamed from: t */
    public boolean f22288t;

    /* renamed from: u */
    public boolean f22289u = false;

    /* renamed from: v */
    public boolean f22290v = false;

    /* renamed from: w */
    public boolean f22291w = false;

    /* renamed from: x */
    public boolean f22292x = false;

    /* renamed from: y */
    public C5068d f22293y = null;

    /* renamed from: z */
    public C11877e0 f22294z;

    /* renamed from: com.startapp.sdk.adsbase.StartAppSDKInternal$d */
    /* compiled from: Sta */
    public static class C5051d {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a */
        public static final StartAppSDKInternal f22295a = new StartAppSDKInternal();
    }

    /* compiled from: Sta */
    public enum InitState {
        UNSET,
        IMPLICIT,
        EXPLICIT
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppSDKInternal$a */
    /* compiled from: Sta */
    public class C5052a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f22300a;

        /* renamed from: b */
        public final /* synthetic */ String f22301b;

        /* renamed from: c */
        public final /* synthetic */ String f22302c;

        /* renamed from: d */
        public final /* synthetic */ SDKAdPreferences f22303d;

        /* renamed from: e */
        public final /* synthetic */ boolean f22304e;

        public C5052a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
            this.f22300a = context;
            this.f22301b = str;
            this.f22302c = str2;
            this.f22303d = sDKAdPreferences;
            this.f22304e = z;
        }

        public void run() {
            synchronized (StartAppSDKInternal.f22265C) {
                StartAppSDKInternal.m23099a(StartAppSDKInternal.this, this.f22300a, this.f22301b, this.f22302c, this.f22303d, this.f22304e);
            }
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppSDKInternal$c */
    /* compiled from: Sta */
    public class C5054c implements C5059d.C5060d {
        public C5054c() {
        }

        /* renamed from: a */
        public void mo20975a(C5041Ad ad, CacheKey cacheKey, boolean z) {
            StartAppSDKInternal.this.f22287s = cacheKey;
        }
    }

    public StartAppSDKInternal() {
        Map<Activity, Integer> map = C5015nb.f22145a;
    }

    /* renamed from: a */
    public static void m23099a(StartAppSDKInternal startAppSDKInternal, Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        startAppSDKInternal.getClass();
        C12282b b = ComponentLocator.m23305a(context).f22432H.mo46698b();
        InitState initState = f22266D;
        InitState initState2 = InitState.EXPLICIT;
        if (initState != initState2) {
            boolean a = ComponentLocator.m23305a(context).mo21216c().mo20648a();
            if (TextUtils.isEmpty(str2)) {
                if (C5015nb.m22937f(context) || C12437y.m53787c(context)) {
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
            }
            C5000a0 c = ComponentLocator.m23305a(context).mo21216c();
            if (str != null) {
                str = str.trim();
            }
            if (str2 != null) {
                str2 = str2.trim();
            }
            synchronized (c.f22107a) {
                c.f22109c = str;
                c.f22110d = str2;
                c.f22108b.edit().putString("c88d4eab540fab77", str).putString("2696a7f502faed4b", str2).commit();
            }
            startAppSDKInternal.f22269a = sDKAdPreferences;
            C5126w2.m23394b(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
            startAppSDKInternal.mo20979a(z);
            if (f22266D == InitState.IMPLICIT && !a) {
                startAppSDKInternal.mo20983b(context, MetaDataRequest.RequestReason.LAUNCH);
            } else if (f22266D == InitState.UNSET) {
                startAppSDKInternal.mo20977a(context, MetaDataRequest.RequestReason.LAUNCH);
            }
            f22266D = initState2;
        }
    }

    /* renamed from: c */
    public static boolean m23101c() {
        boolean z;
        synchronized (f22265C) {
            z = f22266D == InitState.EXPLICIT;
        }
        return z;
    }

    /* renamed from: f */
    public static void m23102f(Context context) {
        if (context != null) {
            m23100a(false, (C12128p7) null);
        }
    }

    /* renamed from: b */
    public boolean mo20984b() {
        return this.f22283o;
    }

    /* renamed from: d */
    public final void mo20986d(Context context) {
        Application application;
        if (Build.VERSION.SDK_INT >= 14) {
            Context a = C5009h0.m22892a(context);
            if (a instanceof Application) {
                application = (Application) a;
            } else if (context instanceof Application) {
                application = (Application) context;
            } else if (context instanceof Activity) {
                application = ((Activity) context).getApplication();
            } else {
                application = context instanceof Service ? ((Service) context).getApplication() : null;
            }
            if (application != null && this.f22294z == null) {
                C11877e0 e0Var = new C11877e0(this);
                this.f22294z = e0Var;
                application.registerActivityLifecycleCallbacks(e0Var);
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = ComponentLocator.m23305a(context).mo21231r().f22524e;
                    if (activityLifecycleCallbacks != null) {
                        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                        return;
                    }
                    throw new RuntimeException();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo20988e(Context context) {
        if (this.f22288t && !AdsCommonMetaData.f22242h.mo20881K()) {
            C5059d dVar = C5059d.f22346h;
            AdPreferences adPreferences = this.f22286r;
            AdPreferences adPreferences2 = adPreferences != null ? new AdPreferences(adPreferences) : new AdPreferences();
            C5054c cVar = new C5054c();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
            if (dVar.mo21049a(placement)) {
                dVar.mo21046a(context, (StartAppAd) null, placement, adPreferences2, cVar, false, 0);
            } else {
                cVar.mo20975a((C5041Ad) null, (CacheKey) null, false);
            }
        }
    }

    /* renamed from: g */
    public final void mo20989g(Context context) {
        C5069e d = ComponentLocator.m23305a(context).mo21217d();
        int i = d.getInt("shared_prefs_app_version_id", -1);
        int i2 = C12437y.f55146a;
        int i3 = 0;
        try {
            i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
        }
        if (i > 0 && i3 > i) {
            this.f22283o = true;
        }
        C5069e.C5070a a = d.edit();
        a.mo21101a("shared_prefs_app_version_id", Integer.valueOf(i3));
        a.f22385a.putInt("shared_prefs_app_version_id", i3);
        a.apply();
    }

    /* renamed from: h */
    public final void mo20990h(Context context) {
        ComponentLocator a = ComponentLocator.m23305a(context);
        C5069e.C5070a a2 = a.mo21217d().edit();
        Boolean bool = Boolean.FALSE;
        a2.mo21101a("periodicInfoEventPaused", bool);
        a2.f22385a.putBoolean("periodicInfoEventPaused", false);
        a2.mo21101a("periodicMetadataPaused", bool);
        a2.f22385a.putBoolean("periodicMetadataPaused", false);
        a2.apply();
        C5053b bVar = new C5053b(context, a);
        if (MetaData.f22407k.f22410b) {
            bVar.mo20651a((MetaDataRequest.RequestReason) null, false);
        } else {
            MetaData.f22407k.mo21186a((C5073c) bVar);
        }
    }

    /* renamed from: b */
    public void mo20983b(Context context, MetaDataRequest.RequestReason requestReason) {
        C5014n9.f22141d.mo20678a(context, requestReason);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ec, code lost:
        if (r0.isEmpty() == false) goto L_0x00f0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20982b(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "android.support.customtabs.action.CustomTabsService"
            r1 = 1
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ all -> 0x00c9 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = "android.intent.action.VIEW"
            java.lang.String r7 = "http://www.example.com"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x00c9 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r6 = r4.resolveActivity(r5, r3)     // Catch:{ all -> 0x00c9 }
            if (r6 == 0) goto L_0x0021
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = r6.packageName     // Catch:{ all -> 0x00c9 }
            goto L_0x0022
        L_0x0021:
            r6 = r2
        L_0x0022:
            java.util.List r7 = r4.queryIntentActivities(r5, r3)     // Catch:{ all -> 0x00c9 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00c9 }
            r8.<init>()     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x002f:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r9 == 0) goto L_0x0058
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9     // Catch:{ all -> 0x00c9 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x00c9 }
            r10.<init>()     // Catch:{ all -> 0x00c9 }
            r10.setAction(r0)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ActivityInfo r11 = r9.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r11 = r11.packageName     // Catch:{ all -> 0x00c9 }
            r10.setPackage(r11)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r10 = r4.resolveService(r10, r3)     // Catch:{ all -> 0x00c9 }
            if (r10 == 0) goto L_0x002f
            android.content.pm.ActivityInfo r9 = r9.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r9 = r9.packageName     // Catch:{ all -> 0x00c9 }
            r8.add(r9)     // Catch:{ all -> 0x00c9 }
            goto L_0x002f
        L_0x0058:
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x0060
            goto L_0x00cd
        L_0x0060:
            int r4 = r8.size()     // Catch:{ all -> 0x00c9 }
            java.lang.String r7 = "com.android.chrome"
            if (r4 != r1) goto L_0x0070
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00c9 }
            r2 = r4
            goto L_0x00cd
        L_0x0070:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00c9 }
            if (r4 != 0) goto L_0x00c1
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ all -> 0x00b2 }
            r9 = 64
            java.util.List r4 = r4.queryIntentActivities(r5, r9)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x00b6
            int r5 = r4.size()     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0089
            goto L_0x00b6
        L_0x0089:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00b2 }
        L_0x008d:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x00b6
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00b2 }
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5     // Catch:{ all -> 0x00b2 }
            android.content.IntentFilter r9 = r5.filter     // Catch:{ all -> 0x00b2 }
            if (r9 != 0) goto L_0x009e
            goto L_0x008d
        L_0x009e:
            int r10 = r9.countDataAuthorities()     // Catch:{ all -> 0x00b2 }
            if (r10 == 0) goto L_0x008d
            int r9 = r9.countDataPaths()     // Catch:{ all -> 0x00b2 }
            if (r9 != 0) goto L_0x00ab
            goto L_0x008d
        L_0x00ab:
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00b0
            goto L_0x008d
        L_0x00b0:
            r4 = 1
            goto L_0x00b7
        L_0x00b2:
            r4 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00c9 }
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            if (r4 != 0) goto L_0x00c1
            boolean r4 = r8.contains(r6)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x00c1
            r2 = r6
            goto L_0x00cd
        L_0x00c1:
            boolean r4 = r8.contains(r7)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x00cd
            r2 = r7
            goto L_0x00cd
        L_0x00c9:
            r4 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r4)
        L_0x00cd:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 18
            if (r4 < r5) goto L_0x00ef
            if (r2 != 0) goto L_0x00d6
            goto L_0x00ef
        L_0x00d6:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setPackage(r2)
            android.content.pm.PackageManager r0 = r13.getPackageManager()
            java.util.List r0 = r0.queryIntentServices(r4, r3)
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            com.startapp.sdk.components.ComponentLocator r13 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r13)
            com.startapp.sdk.adsbase.e r13 = r13.mo21217d()
            com.startapp.sdk.adsbase.e$a r13 = r13.edit()
            java.lang.String r0 = "chromeTabs"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r13.mo21101a((java.lang.String) r0, r2)
            android.content.SharedPreferences$Editor r2 = r13.f22385a
            r2.putBoolean(r0, r1)
            r13.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.mo20982b(android.content.Context):void");
    }

    /* renamed from: c */
    public SDKAdPreferences mo20985c(Context context) {
        if (this.f22269a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) C5126w2.m23386a(context, "shared_prefs_sdk_ad_prefs", SDKAdPreferences.class);
            if (sDKAdPreferences == null) {
                this.f22269a = new SDKAdPreferences();
            } else {
                this.f22269a = sDKAdPreferences;
            }
        }
        return this.f22269a;
    }

    /* renamed from: d */
    public boolean mo20987d() {
        return this.f22281m;
    }

    /* renamed from: a */
    public static StartAppSDKInternal m23097a() {
        return C5051d.f22295a;
    }

    /* renamed from: a */
    public void mo20978a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        Context a = C5009h0.m22892a(context);
        Context context2 = a != null ? a : context;
        try {
            ComponentLocator.m23305a(context2).mo21231r().mo21248a(256);
        } catch (Throwable unused) {
        }
        ComponentLocator.m23305a(context2).mo21220g().execute(new C5052a(context2, str, str2, sDKAdPreferences, z));
    }

    /* renamed from: a */
    public static void m23098a(Context context) {
        MetaDataRequest.RequestReason requestReason;
        ComponentLocator a = ComponentLocator.m23305a(context);
        C12282b b = a.f22432H.mo46698b();
        C12465z5 z5Var = new C12465z5(context);
        String str = z5Var.f55194a;
        if (!TextUtils.isEmpty(str)) {
            C5051d.f22295a.mo20978a(context, (String) null, str, (SDKAdPreferences) null, z5Var.f55195b);
            if (!z5Var.f55196c) {
                StartAppAd.disableSplash();
            }
            if (a.mo21217d().getBoolean("shared_prefs_first_init", true)) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52885d);
                d4Var.f22126d = "ManifestInit";
                d4Var.mo20661a();
            }
        } else if (f22266D == InitState.UNSET) {
            f22266D = InitState.IMPLICIT;
            C5000a0 c = a.mo21216c();
            StartAppSDKInternal startAppSDKInternal = C5051d.f22295a;
            if (c.mo20648a()) {
                requestReason = MetaDataRequest.RequestReason.LAUNCH;
            } else {
                requestReason = MetaDataRequest.RequestReason.IMPLICIT_LAUNCH;
            }
            startAppSDKInternal.mo20977a(context, requestReason);
        }
    }

    /* renamed from: a */
    public final void mo20977a(Context context, MetaDataRequest.RequestReason requestReason) {
        ComponentLocator a;
        if (Math.random() < 0.0d) {
            Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:4.10.2");
        }
        try {
            a = ComponentLocator.m23305a(context);
            C12153r b = a.f22430F.mo46698b();
            b.getClass();
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof C12153r)) {
                Thread.setDefaultUncaughtExceptionHandler(b);
                b.f54080a = defaultUncaughtExceptionHandler;
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return;
        }
        a.mo21225l().mo45468a();
        if (!C12437y.m53782a(context, "android.permission.INTERNET") || !C12437y.m53782a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            C5015nb.m22915a(context, 6, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.", true);
        }
        this.f22281m = !C5015nb.m22933d(context);
        a.mo21214a().mo46444b();
        C12034lb v = a.mo21235v();
        v.getClass();
        if (Build.VERSION.SDK_INT > 16) {
            try {
                new Thread(new C12016kb(v, context)).start();
            } catch (Throwable th2) {
                C5004d4.m22887a(th2);
            }
        }
        mo20986d(context);
        MetaData.m23246c(context);
        Map<Activity, Integer> map = C5015nb.f22145a;
        AdsCommonMetaData.m23012a(context);
        BannerMetaData.m52840a(context);
        SplashMetaData.m52956a(context);
        if (this.f22270b) {
            CacheMetaData.m23188a(context);
        }
        AdInformationMetaData.m53148a(context);
        SimpleTokenUtils.m23084c(context);
        MetaData.f22407k.mo21186a((C5073c) a.mo21219f());
        if (Build.VERSION.SDK_INT >= 9) {
            C11844d2.f52726a = new CookieManager(new C12430x7(context), CookiePolicy.ACCEPT_ALL);
        }
        mo20989g(context);
        mo20983b(context, requestReason);
        mo20982b(context);
        mo20990h(context);
        if (C12437y.m53781a() && (context instanceof Application)) {
            Application application = (Application) context;
            this.f22276h = application;
            try {
                Object obj = this.f22278j;
                if (obj != null) {
                    application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj);
                }
            } catch (Throwable th3) {
                C5004d4.m22887a(th3);
            }
            Application application2 = this.f22276h;
            C12291g gVar = new C12291g();
            application2.registerActivityLifecycleCallbacks(gVar);
            this.f22278j = gVar;
        }
        C5015nb.m22915a(context, 4, "StartApp SDK initialized", true);
    }

    /* renamed from: a */
    public static void m23100a(boolean z, C12128p7 p7Var) {
        C5004d4 d4Var = new C5004d4(C11882e4.f52892k);
        d4Var.f22132j = z;
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.f22424K.f55097a;
            if (componentLocator != null) {
                componentLocator.mo21225l().mo45473a(d4Var, (C11956i4) null);
            } else if (p7Var != null) {
                p7Var.mo45392a(Boolean.FALSE);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo20980a(Activity activity) {
        return this.f22292x || activity.getClass().getName().equals(C5015nb.m22931c((Context) activity));
    }

    /* renamed from: a */
    public boolean mo20981a(String str) {
        String str2;
        Map<String, String> map = this.f22284p;
        if (map == null) {
            str2 = null;
        } else {
            str2 = map.get(str);
        }
        return str2 != null;
    }

    /* renamed from: a */
    public void mo20979a(boolean z) {
        if (!z || !C12437y.m53781a()) {
            this.f22288t = false;
            C5059d.f22346h.mo21051b(AdPreferences.Placement.INAPP_RETURN);
            return;
        }
        this.f22288t = true;
    }

    /* renamed from: com.startapp.sdk.adsbase.StartAppSDKInternal$b */
    /* compiled from: Sta */
    public class C5053b implements C5073c {

        /* renamed from: a */
        public final /* synthetic */ Context f22306a;

        /* renamed from: b */
        public final /* synthetic */ ComponentLocator f22307b;

        public C5053b(Context context, ComponentLocator componentLocator) {
            this.f22306a = context;
            this.f22307b = componentLocator;
        }

        /* JADX WARNING: Removed duplicated region for block: B:140:0x046e  */
        /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo20651a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r19, boolean r20) {
            /*
                r18 = this;
                r1 = r18
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r8 = r1.f22306a
                boolean r2 = r0.f22270b
                r9 = 0
                r10 = 1
                if (r2 != 0) goto L_0x000e
                goto L_0x0117
            L_0x000e:
                boolean r2 = r0.f22283o
                if (r2 != 0) goto L_0x005f
                com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f22345a
                com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.mo21039a()
                boolean r2 = r2.mo21032f()
                if (r2 != 0) goto L_0x001f
                goto L_0x005f
            L_0x001f:
                boolean r2 = r0.f22271c
                if (r2 == 0) goto L_0x0078
                com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
                r2.getClass()
                android.content.Context r3 = com.startapp.C5009h0.m22892a(r8)
                if (r3 == 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r3 = r8
            L_0x0030:
                r2.f22353g = r3
                boolean r4 = r2.f22349c
                if (r4 != 0) goto L_0x0044
                com.startapp.sdk.adsbase.cache.CacheMetaData r4 = com.startapp.sdk.adsbase.cache.CacheMetaData.f22345a
                com.startapp.sdk.adsbase.cache.ACMConfig r4 = r4.mo21039a()
                boolean r4 = r4.mo21032f()
                if (r4 == 0) goto L_0x0044
                r4 = 1
                goto L_0x0045
            L_0x0044:
                r4 = 0
            L_0x0045:
                if (r4 == 0) goto L_0x0078
                r2.f22350d = r10
                com.startapp.sdk.adsbase.cache.a r4 = new com.startapp.sdk.adsbase.cache.a
                r4.<init>(r2, r3)
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r3)
                java.util.concurrent.Executor r2 = r2.mo21222i()
                com.startapp.sdk.adsbase.cache.j r5 = new com.startapp.sdk.adsbase.cache.j
                r5.<init>(r3, r4)
                r2.execute(r5)
                goto L_0x0078
            L_0x005f:
                com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
                r2.f22349c = r10
                com.startapp.sdk.adsbase.cache.b r3 = new com.startapp.sdk.adsbase.cache.b
                r3.<init>(r2)
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r8)
                java.util.concurrent.Executor r2 = r2.mo21222i()
                com.startapp.sdk.adsbase.cache.i r4 = new com.startapp.sdk.adsbase.cache.i
                r4.<init>(r8, r3)
                r2.execute(r4)
            L_0x0078:
                r0.mo20988e(r8)
                if (r20 == 0) goto L_0x0117
                com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.C5059d.f22346h
                r0.getClass()
                com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f22345a
                com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.mo21039a()
                if (r2 == 0) goto L_0x0117
                java.util.Set r2 = r2.mo21027b()
                if (r2 == 0) goto L_0x0117
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r8)
                com.startapp.sdk.adsbase.e r11 = r3.mo21217d()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                int r12 = r3.mo21168J()
                com.startapp.sdk.adsbase.AdsCommonMetaData r3 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22242h
                int r13 = r3.mo20897i()
                java.util.Iterator r14 = r2.iterator()
            L_0x00a8:
                boolean r2 = r14.hasNext()
                if (r2 == 0) goto L_0x0117
                java.lang.Object r2 = r14.next()
                r5 = r2
                com.startapp.sdk.adsbase.StartAppAd$AdMode r5 = (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5
                if (r5 != 0) goto L_0x00b8
                goto L_0x00a8
            L_0x00b8:
                java.lang.String r15 = com.startapp.sdk.adsbase.cache.C5059d.m23193a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r5)
                int r7 = r11.getInt(r15, r9)
                if (r7 < r12) goto L_0x00c3
                goto L_0x00a8
            L_0x00c3:
                com.startapp.sdk.adsbase.StartAppAd$AdMode r6 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE
                if (r5 != r6) goto L_0x00e1
                if (r13 <= 0) goto L_0x00de
                com.startapp.sdk.adsbase.model.AdPreferences r16 = new com.startapp.sdk.adsbase.model.AdPreferences
                r16.<init>()
                r4 = 0
                r17 = 0
                r2 = r0
                r3 = r8
                r5 = r6
                r6 = r16
                r16 = r7
                r7 = r17
                r2.mo21044a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.C5059d.C5060d) r7)
                goto L_0x0109
            L_0x00de:
                r16 = r7
                goto L_0x0109
            L_0x00e1:
                r16 = r7
                com.startapp.sdk.adsbase.StartAppAd$AdMode r6 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL
                if (r5 != r6) goto L_0x00fd
                r2 = 100
                if (r13 >= r2) goto L_0x0109
                com.startapp.sdk.adsbase.model.AdPreferences r7 = new com.startapp.sdk.adsbase.model.AdPreferences
                r7.<init>()
                r4 = 0
                r17 = 0
                r2 = r0
                r3 = r8
                r5 = r6
                r6 = r7
                r7 = r17
                r2.mo21044a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.C5059d.C5060d) r7)
                goto L_0x0109
            L_0x00fd:
                com.startapp.sdk.adsbase.model.AdPreferences r6 = new com.startapp.sdk.adsbase.model.AdPreferences
                r6.<init>()
                r4 = 0
                r7 = 0
                r2 = r0
                r3 = r8
                r2.mo21044a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.C5059d.C5060d) r7)
            L_0x0109:
                com.startapp.sdk.adsbase.e$a r2 = r11.edit()
                int r7 = r16 + 1
                com.startapp.sdk.adsbase.e$a r2 = r2.mo21098a((java.lang.String) r15, (int) r7)
                r2.apply()
                goto L_0x00a8
            L_0x0117:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f22307b
                com.startapp.w1<com.startapp.h1> r0 = r0.f22452r
                java.lang.Object r0 = r0.mo46698b()
                com.startapp.h1 r0 = (com.startapp.C11933h1) r0
                r0.mo46639e()
                com.startapp.sdk.components.ComponentLocator r0 = r1.f22307b
                com.startapp.w1<com.startapp.j9> r0 = r0.f22453s
                java.lang.Object r0 = r0.mo46698b()
                com.startapp.j9 r0 = (com.startapp.C11991j9) r0
                r0.mo46639e()
                com.startapp.sdk.components.ComponentLocator r0 = r1.f22307b
                com.startapp.ja r0 = r0.mo21233t()
                r0.mo46639e()
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f22306a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r2)
                com.startapp.g5 r0 = r0.mo21226m()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                boolean r2 = r2.mo21178T()
                r3 = 60000(0xea60, double:2.9644E-319)
                if (r2 == 0) goto L_0x017b
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                int r2 = r2.mo21213z()
                long r5 = (long) r2
                long r5 = r5 * r3
                com.startapp.sdk.jobs.e$a r2 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.d> r7 = com.startapp.sdk.adsbase.remoteconfig.C12295d.class
                r2.<init>(r7)
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r2.f54735d = r5
                com.startapp.sdk.jobs.JobRequest$Network r5 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r2.f54722b = r5
                com.startapp.sdk.jobs.e r5 = new com.startapp.sdk.jobs.e
                r5.<init>(r2)
                com.startapp.sdk.jobs.JobRequest[] r2 = new com.startapp.sdk.jobs.JobRequest[r10]
                r2[r9] = r5
                r0.mo45380a((com.startapp.sdk.jobs.JobRequest[]) r2)
                goto L_0x0188
            L_0x017b:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.d> r5 = com.startapp.sdk.adsbase.remoteconfig.C12295d.class
                r2[r9] = r5
                int r2 = com.startapp.sdk.jobs.JobRequest.m53446a((java.lang.Class<? extends com.startapp.sdk.jobs.C12320b>[]) r2)
                r0.mo45379a((int) r2)
            L_0x0188:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f22306a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r2)
                com.startapp.g5 r0 = r0.mo21226m()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                boolean r5 = r5.mo21177S()
                if (r5 == 0) goto L_0x01c6
                com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                int r2 = r5.mo21187b(r2)
                long r5 = (long) r2
                long r5 = r5 * r3
                com.startapp.sdk.jobs.e$a r2 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.v7> r3 = com.startapp.C12392v7.class
                r2.<init>(r3)
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r2.f54735d = r3
                com.startapp.sdk.jobs.JobRequest$Network r3 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r2.f54722b = r3
                com.startapp.sdk.jobs.e r3 = new com.startapp.sdk.jobs.e
                r3.<init>(r2)
                com.startapp.sdk.jobs.JobRequest[] r2 = new com.startapp.sdk.jobs.JobRequest[r10]
                r2[r9] = r3
                r0.mo45380a((com.startapp.sdk.jobs.JobRequest[]) r2)
                goto L_0x01d3
            L_0x01c6:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.v7> r3 = com.startapp.C12392v7.class
                r2[r9] = r3
                int r2 = com.startapp.sdk.jobs.JobRequest.m53446a((java.lang.Class<? extends com.startapp.sdk.jobs.C12320b>[]) r2)
                r0.mo45379a((int) r2)
            L_0x01d3:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f22306a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r2)
                com.startapp.g5 r0 = r0.mo21226m()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                boolean r4 = r3.mo21177S()
                if (r4 == 0) goto L_0x021b
                boolean r4 = r3.mo21176R()
                if (r4 == 0) goto L_0x021b
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                int r2 = r3.mo21181a((android.content.Context) r2)
                long r2 = (long) r2
                long r2 = r4.toMillis(r2)
                com.startapp.sdk.jobs.e$a r4 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.u7> r5 = com.startapp.C12370u7.class
                r4.<init>(r5)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r4.f54735d = r2
                com.startapp.sdk.jobs.JobRequest$Network r2 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r4.f54722b = r2
                r4.f54723c = r10
                com.startapp.sdk.jobs.e r2 = new com.startapp.sdk.jobs.e
                r2.<init>(r4)
                com.startapp.sdk.jobs.JobRequest[] r3 = new com.startapp.sdk.jobs.JobRequest[r10]
                r3[r9] = r2
                r0.mo45380a((com.startapp.sdk.jobs.JobRequest[]) r3)
                goto L_0x0228
            L_0x021b:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.u7> r3 = com.startapp.C12370u7.class
                r2[r9] = r3
                int r2 = com.startapp.sdk.jobs.JobRequest.m53446a((java.lang.Class<? extends com.startapp.sdk.jobs.C12320b>[]) r2)
                r0.mo45379a((int) r2)
            L_0x0228:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f22306a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r2)
                com.startapp.sdk.adsbase.e r4 = r3.mo21217d()
                java.lang.String r5 = "shared_prefs_first_init"
                boolean r5 = r4.getBoolean(r5, r10)
                if (r5 != 0) goto L_0x0240
                goto L_0x0273
            L_0x0240:
                com.startapp.sdk.adsbase.e$a r5 = r4.edit()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                java.lang.String r7 = "totalSessions"
                r5.mo21101a((java.lang.String) r7, r6)
                android.content.SharedPreferences$Editor r6 = r5.f22385a
                r6.putInt(r7, r9)
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.Long r8 = java.lang.Long.valueOf(r6)
                java.lang.String r11 = "firstSessionTime"
                r5.mo21101a((java.lang.String) r11, r8)
                android.content.SharedPreferences$Editor r8 = r5.f22385a
                r8.putLong(r11, r6)
                r5.apply()
                java.util.concurrent.Executor r5 = r3.mo21229p()
                com.startapp.sdk.adsbase.f r6 = new com.startapp.sdk.adsbase.f
                r6.<init>(r0, r2, r3, r4)
                r5.execute(r6)
            L_0x0273:
                android.content.Context r0 = r1.f22306a
                com.startapp.sdk.adsbase.StartAppSDKInternal.m23102f(r0)
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                r0.getClass()
                android.content.Context r0 = r1.f22306a
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r0)
                com.startapp.b2 r2 = r2.mo21219f()
                boolean r2 = r2.mo20655c()
                if (r2 == 0) goto L_0x036e
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                com.startapp.sdk.insight.NetworkTestsMetaData r2 = r2.mo21211x()
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 14
                if (r3 >= r4) goto L_0x029b
                goto L_0x036e
            L_0x029b:
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r0)
                com.startapp.g5 r3 = r3.mo21226m()
                java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
                boolean r4 = com.startapp.C12437y.m53782a((android.content.Context) r0, (java.lang.String) r4)
                if (r4 != 0) goto L_0x02b6
                java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
                boolean r4 = com.startapp.C12437y.m53782a((android.content.Context) r0, (java.lang.String) r4)
                if (r4 == 0) goto L_0x02b4
                goto L_0x02b6
            L_0x02b4:
                r4 = 0
                goto L_0x02b7
            L_0x02b6:
                r4 = 1
            L_0x02b7:
                if (r2 == 0) goto L_0x035b
                boolean r5 = r2.mo46472n()
                if (r5 == 0) goto L_0x035b
                if (r4 != 0) goto L_0x02c3
                goto L_0x035b
            L_0x02c3:
                double r4 = java.lang.Math.random()
                double r6 = r2.mo46468j()
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 >= 0) goto L_0x02d7
                com.startapp.f7 r4 = new com.startapp.f7
                r4.<init>()
                com.startapp.C12356u2.m53521a((com.startapp.C12356u2.C12357a) r4)
            L_0x02d7:
                boolean r4 = r2.mo46473o()     // Catch:{ all -> 0x0356 }
                com.startapp.sdk.cachedservice.BackgroundService.m53416a(r0, r4)     // Catch:{ all -> 0x0356 }
                com.startapp.networkTest.startapp.NetworkTester$Config r4 = new com.startapp.networkTest.startapp.NetworkTester$Config     // Catch:{ all -> 0x0356 }
                r4.<init>()     // Catch:{ all -> 0x0356 }
                java.lang.String r5 = r2.mo46469k()     // Catch:{ all -> 0x0356 }
                r4.PROJECT_ID = r5     // Catch:{ all -> 0x0356 }
                java.lang.String r5 = r2.mo46459c()     // Catch:{ all -> 0x0356 }
                r4.CONNECTIVITY_TEST_HOSTNAME = r5     // Catch:{ all -> 0x0356 }
                java.lang.String r5 = r2.mo46458b()     // Catch:{ all -> 0x0356 }
                r4.CONNECTIVITY_TEST_FILENAME = r5     // Catch:{ all -> 0x0356 }
                boolean r5 = r2.mo46470l()     // Catch:{ all -> 0x0356 }
                r4.CONNECTIVITY_TEST_ENABLED = r5     // Catch:{ all -> 0x0356 }
                boolean r5 = r2.mo46474p()     // Catch:{ all -> 0x0356 }
                r4.NIR_COLLECT_CELLINFO = r5     // Catch:{ all -> 0x0356 }
                boolean r5 = r2.mo46471m()     // Catch:{ all -> 0x0356 }
                r4.CT_COLLECT_CELLINFO = r5     // Catch:{ all -> 0x0356 }
                java.lang.String r5 = r2.mo46457a()     // Catch:{ all -> 0x0356 }
                r4.CONNECTIVITY_TEST_CDNCONFIG_URL = r5     // Catch:{ all -> 0x0356 }
                java.lang.String r5 = r2.mo46461e()     // Catch:{ all -> 0x0356 }
                r4.GEOIP_URL = r5     // Catch:{ all -> 0x0356 }
                android.content.Context r5 = com.startapp.C5009h0.m22892a(r0)     // Catch:{ all -> 0x0356 }
                if (r5 == 0) goto L_0x031a
                goto L_0x031b
            L_0x031a:
                r5 = r0
            L_0x031b:
                com.startapp.e7 r6 = new com.startapp.e7     // Catch:{ all -> 0x0356 }
                r6.<init>(r5)     // Catch:{ all -> 0x0356 }
                com.startapp.networkTest.startapp.NetworkTester.init(r0, r4)     // Catch:{ all -> 0x0356 }
                com.startapp.networkTest.startapp.NetworkTester.setOnConnectivityLatencyListener(r6)     // Catch:{ all -> 0x0356 }
                com.startapp.networkTest.startapp.NetworkTester.setOnNetworkInfoListener(r6)     // Catch:{ all -> 0x0356 }
                long r4 = r2.mo46460d()     // Catch:{ all -> 0x0356 }
                long r6 = r2.mo46463f()     // Catch:{ all -> 0x0356 }
                com.startapp.networkTest.startapp.NetworkTester.startListening(r4, r6)     // Catch:{ all -> 0x0356 }
                com.startapp.sdk.jobs.e$a r0 = new com.startapp.sdk.jobs.e$a     // Catch:{ all -> 0x0356 }
                java.lang.Class<com.startapp.g7> r4 = com.startapp.C11922g7.class
                r0.<init>(r4)     // Catch:{ all -> 0x0356 }
                long r4 = r2.mo46460d()     // Catch:{ all -> 0x0356 }
                java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0356 }
                r0.f54735d = r2     // Catch:{ all -> 0x0356 }
                com.startapp.sdk.jobs.JobRequest$Network r2 = com.startapp.sdk.jobs.JobRequest.Network.ANY     // Catch:{ all -> 0x0356 }
                r0.f54722b = r2     // Catch:{ all -> 0x0356 }
                com.startapp.sdk.jobs.e r2 = new com.startapp.sdk.jobs.e     // Catch:{ all -> 0x0356 }
                r2.<init>(r0)     // Catch:{ all -> 0x0356 }
                com.startapp.sdk.jobs.JobRequest[] r0 = new com.startapp.sdk.jobs.JobRequest[r10]     // Catch:{ all -> 0x0356 }
                r0[r9] = r2     // Catch:{ all -> 0x0356 }
                r3.mo45380a((com.startapp.sdk.jobs.JobRequest[]) r0)     // Catch:{ all -> 0x0356 }
                goto L_0x036e
            L_0x0356:
                r0 = move-exception
                com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
                goto L_0x036e
            L_0x035b:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.g7> r4 = com.startapp.C11922g7.class
                r2[r9] = r4
                int r2 = com.startapp.sdk.jobs.JobRequest.m53446a((java.lang.Class<? extends com.startapp.sdk.jobs.C12320b>[]) r2)
                r3.mo45379a((int) r2)
                com.startapp.networkTest.startapp.NetworkTester.stopListening()
                com.startapp.sdk.cachedservice.BackgroundService.m53416a(r0, r9)
            L_0x036e:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f22306a
                com.startapp.cb r3 = r0.f22267A
                if (r3 == 0) goto L_0x0377
                goto L_0x0388
            L_0x0377:
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.m23305a((android.content.Context) r2)
                com.startapp.w1<com.startapp.cb> r2 = r2.f22446l
                java.lang.Object r2 = r2.mo46698b()
                com.startapp.cb r2 = (com.startapp.C11828cb) r2
                r0.f22267A = r2
                r2.mo45219b()
            L_0x0388:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f22307b
                com.startapp.v8 r0 = r0.mo21231r()
                r0.getClass()
                boolean r2 = r0.mo21257b()     // Catch:{ all -> 0x03a3 }
                if (r2 == 0) goto L_0x0398
                goto L_0x03a7
            L_0x0398:
                java.util.concurrent.Executor r2 = r0.f22521b     // Catch:{ all -> 0x03a3 }
                com.startapp.w8 r3 = new com.startapp.w8     // Catch:{ all -> 0x03a3 }
                r3.<init>(r0)     // Catch:{ all -> 0x03a3 }
                r2.execute(r3)     // Catch:{ all -> 0x03a3 }
                goto L_0x03a7
            L_0x03a3:
                r0 = move-exception
                com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
            L_0x03a7:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f22307b
                com.startapp.r8 r0 = r0.mo21230q()
                java.util.List r2 = r0.mo45717a()
                r3 = 1024(0x400, float:1.435E-42)
                boolean r0 = r0.mo45719a((int) r3)
                if (r0 == 0) goto L_0x03e2
                com.startapp.d4 r0 = new com.startapp.d4
                com.startapp.e4 r3 = com.startapp.C11882e4.f52885d
                r0.<init>((com.startapp.C11882e4) r3)
                java.lang.String r3 = "RSC init"
                r0.f22126d = r3
                java.lang.String r3 = "targets: "
                java.lang.StringBuilder r3 = com.startapp.C12458z0.m53804a(r3)
                if (r2 == 0) goto L_0x03d5
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x03d6
            L_0x03d5:
                r2 = 0
            L_0x03d6:
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.f22127e = r2
                r0.mo20661a()
            L_0x03e2:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f22307b
                com.startapp.c6 r0 = r0.mo21228o()
                com.startapp.sdk.adsbase.remoteconfig.MotionMetadata r2 = r0.mo45198a()
                if (r2 == 0) goto L_0x03ff
                double r3 = java.lang.Math.random()
                double r5 = r2.mo46359k()
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 >= 0) goto L_0x03fc
                r2 = 1
                goto L_0x03fd
            L_0x03fc:
                r2 = 0
            L_0x03fd:
                r0.f52674f = r2
            L_0x03ff:
                android.os.Handler r2 = r0.f52672d
                com.startapp.d6 r3 = new com.startapp.d6
                r3.<init>(r0)
                r2.post(r3)
                com.startapp.sdk.components.ComponentLocator r0 = r1.f22307b
                com.startapp.v r0 = r0.mo21215b()
                if (r20 == 0) goto L_0x0413
                r2 = 1
                goto L_0x0414
            L_0x0413:
                r2 = 2
            L_0x0414:
                r0.mo46669a(r2)
                com.startapp.sdk.adsbase.remoteconfig.MetaData r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k
                java.lang.String r0 = r0.mo21207t()
                if (r0 == 0) goto L_0x0492
                java.lang.String r2 = com.startapp.sdk.adsbase.StartAppSDK.getVersion()
                java.lang.String r3 = "\\."
                java.lang.String[] r4 = r0.split(r3)
                java.lang.String[] r2 = r2.split(r3)
                int r3 = r4.length
                int r5 = r2.length
                int r3 = java.lang.Math.min(r3, r5)
                r5 = 0
            L_0x0434:
                if (r5 >= r3) goto L_0x045d
                r6 = r4[r5]     // Catch:{ NumberFormatException -> 0x0448 }
                int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0448 }
                r7 = r2[r5]     // Catch:{ NumberFormatException -> 0x0448 }
                int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0448 }
                if (r6 <= r7) goto L_0x0445
                goto L_0x0453
            L_0x0445:
                if (r6 >= r7) goto L_0x045a
                goto L_0x0457
            L_0x0448:
                r6 = r4[r5]
                r7 = r2[r5]
                int r6 = r6.compareTo(r7)
                if (r6 <= 0) goto L_0x0455
            L_0x0453:
                int r5 = r5 + r10
                goto L_0x046c
            L_0x0455:
                if (r6 >= 0) goto L_0x045a
            L_0x0457:
                int r5 = r5 + r10
                int r5 = -r5
                goto L_0x046c
            L_0x045a:
                int r5 = r5 + 1
                goto L_0x0434
            L_0x045d:
                int r5 = r4.length
                int r6 = r2.length
                if (r5 <= r6) goto L_0x0464
                int r5 = r3 + 1
                goto L_0x046c
            L_0x0464:
                int r4 = r4.length
                int r2 = r2.length
                if (r4 >= r2) goto L_0x046b
                int r3 = r3 + r10
                int r5 = -r3
                goto L_0x046c
            L_0x046b:
                r5 = 0
            L_0x046c:
                if (r5 <= 0) goto L_0x0492
                android.content.Context r2 = r1.f22306a
                java.lang.String r3 = "Current SDK version ("
                java.lang.StringBuilder r3 = com.startapp.C12458z0.m53804a(r3)
                java.lang.String r4 = com.startapp.sdk.adsbase.StartAppSDK.getVersion()
                r3.append(r4)
                java.lang.String r4 = ") is outdated. Integrate the most recent version ("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = ") in order to improve your ads performance."
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r3 = 5
                com.startapp.C5015nb.m22915a((android.content.Context) r2, (int) r3, (java.lang.String) r0, (boolean) r9)
            L_0x0492:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.C5053b.mo20651a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean):void");
        }

        /* renamed from: a */
        public void mo20650a(MetaDataRequest.RequestReason requestReason) {
            this.f22307b.mo21215b().mo46669a(0);
        }
    }
}
