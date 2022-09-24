package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adcolony.sdk.C2978z;
import com.google.ads.interactivemedia.p038v3.impl.data.C3791bd;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: com.adcolony.sdk.n */
class C2849n {

    /* renamed from: i */
    static final String f11553i = "Production";

    /* renamed from: j */
    static final int f11554j = 2000;

    /* renamed from: k */
    private static int f11555k = 2;

    /* renamed from: a */
    private String f11556a = "";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f11557b;

    /* renamed from: c */
    private final C2749e f11558c = new C2749e();

    /* renamed from: d */
    private boolean f11559d;

    /* renamed from: e */
    private JSONObject f11560e = C2976x.m10319b();

    /* renamed from: f */
    private String f11561f = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;

    /* renamed from: g */
    private String f11562g = "android_native";

    /* renamed from: h */
    private String f11563h = "";

    /* renamed from: com.adcolony.sdk.n$a */
    class C2850a implements C2750e0 {

        /* renamed from: com.adcolony.sdk.n$a$a */
        class C2851a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2714c0 f11565a;

            C2851a(C2714c0 c0Var) {
                this.f11565a = c0Var;
            }

            public void run() {
                try {
                    if (C2849n.this.mo9853f() < 14) {
                        new C2854c(this.f11565a, false).execute(new Void[0]);
                    } else {
                        new C2854c(this.f11565a, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                } catch (RuntimeException unused) {
                    new C2978z.C2979a().mo10088a("Error retrieving device info, disabling AdColony.").mo10090a(C2978z.f11950j);
                    AdColony.disable();
                } catch (StackOverflowError unused2) {
                    new C2978z.C2979a().mo10088a("StackOverflowError on info AsyncTask execution, disabling AdColony").mo10090a(C2978z.f11950j);
                    AdColony.disable();
                }
            }
        }

        C2850a() {
        }

        /* renamed from: a */
        public void mo9550a(C2714c0 c0Var) {
            C2916s0.m10063a((Runnable) new C2851a(c0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.n$b */
    class C2852b implements Runnable {

        /* renamed from: com.adcolony.sdk.n$b$a */
        class C2853a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ WebSettings f11568a;

            C2853a(WebSettings webSettings) {
                this.f11568a = webSettings;
            }

            public void run() {
                String unused = C2849n.this.f11557b = this.f11568a.getUserAgentString();
                C2684a.m9409c().mo9725l().mo9923a(C2849n.this.f11557b);
            }
        }

        C2852b() {
        }

        public void run() {
            Context b;
            if (C2849n.this.f11557b == null && (b = C2684a.m9407b()) != null) {
                try {
                    C2916s0.f11754b.execute(new C2853a(new WebView(b).getSettings()));
                } catch (RuntimeException e) {
                    C2978z.C2979a aVar = new C2978z.C2979a();
                    aVar.mo10088a(e.toString() + ": during WebView initialization.").mo10088a(" Disabling AdColony.").mo10090a(C2978z.f11949i);
                    String unused = C2849n.this.f11557b = "";
                    AdColony.disable();
                }
            }
        }
    }

    C2849n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public String mo9830A() {
        return Build.MODEL;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"SwitchIntDef"})
    /* renamed from: B */
    public int mo9831B() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return 2;
        }
        int i = b.getResources().getConfiguration().orientation;
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public String mo9832C() {
        return Build.VERSION.RELEASE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public String mo9833D() {
        return "4.5.0";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public String mo9834E() {
        TelephonyManager telephonyManager;
        Context b = C2684a.m9407b();
        if (b == null || (telephonyManager = (TelephonyManager) b.getSystemService("phone")) == null) {
            return "";
        }
        return telephonyManager.getSimCountryIso();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public int mo9835F() {
        return TimeZone.getDefault().getOffset(15) / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public String mo9836G() {
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public String mo9837H() {
        return this.f11557b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo9838I() {
        this.f11558c.mo9657a(false);
        C2684a.m9405a("Device.get_info", (C2750e0) new C2850a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo9839J() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        DisplayMetrics displayMetrics = b.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= 6.0d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo9840K() {
        C2916s0.m10063a((Runnable) new C2852b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo9847b() {
        return this.f11556a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9850c() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return "";
        }
        return Settings.Secure.getString(b.getContentResolver(), "advertising_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9851d() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(b.getContentResolver(), "limit_ad_tracking") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"HardwareIds"})
    /* renamed from: e */
    public String mo9852e() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return "";
        }
        return Settings.Secure.getString(b.getContentResolver(), "android_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9853f() {
        return Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public double mo9854g() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            double d = (double) intExtra;
            double d2 = (double) intExtra2;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        } catch (IllegalArgumentException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo9855h() {
        Context b = C2684a.m9407b();
        String str = "";
        if (b == null) {
            return str;
        }
        TelephonyManager telephonyManager = (TelephonyManager) b.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        }
        return str.length() == 0 ? C3791bd.UNKNOWN_CONTENT_TYPE : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9856i() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo9857j() {
        return this.f11563h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo9858k() {
        return Locale.getDefault().getCountry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo9859l() {
        TimeZone timeZone = TimeZone.getDefault();
        if (!timeZone.inDaylightTime(new Date())) {
            return 0;
        }
        return timeZone.getDSTSavings() / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo9860m() {
        int i;
        Context b = C2684a.m9407b();
        if (b == null || Build.VERSION.SDK_INT < 29 || (i = b.getResources().getConfiguration().uiMode & 48) == 16 || i != 32) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo9861n() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return 0.0f;
        }
        return b.getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public JSONObject mo9862o() {
        return mo9843a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo9863p() {
        return mo9839J() ? "tablet" : "phone";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo9864q() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.densityDpi;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo9865r() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo9866s() {
        Context b = C2684a.m9407b();
        if (b == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public String mo9867t() {
        return Locale.getDefault().getLanguage();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public JSONObject mo9868u() {
        return this.f11560e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo9869v() {
        return this.f11559d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public String mo9870w() {
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public String mo9871x() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo9872y() {
        ActivityManager activityManager;
        Context b = C2684a.m9407b();
        if (b == null || (activityManager = (ActivityManager) b.getSystemService("activity")) == null) {
            return 0;
        }
        return activityManager.getMemoryClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public long mo9873z() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / ((long) ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    /* renamed from: com.adcolony.sdk.n$c */
    private static class C2854c extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a */
        private C2714c0 f11570a;

        /* renamed from: b */
        private boolean f11571b;

        C2854c(C2714c0 c0Var, boolean z) {
            this.f11570a = c0Var;
            this.f11571b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public JSONObject doInBackground(Void... voidArr) {
            if (Build.VERSION.SDK_INT < 14) {
                return null;
            }
            return C2684a.m9409c().mo9723j().mo9843a((long) SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(JSONObject jSONObject) {
            if (this.f11571b) {
                new C2714c0("Device.update_info", 1, jSONObject).mo9612d();
            } else {
                this.f11570a.mo9607a(jSONObject).mo9612d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9849b(boolean z) {
        this.f11559d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9845a(JSONObject jSONObject) {
        this.f11560e = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9848b(String str) {
        this.f11563h = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9844a(String str) {
        this.f11556a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9846a(boolean z) {
        this.f11558c.mo9657a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9841a() {
        return System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9842a(Context context) {
        return C2916s0.m10076c(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo9843a(long j) {
        JSONObject b = C2976x.m10319b();
        C2794i c = C2684a.m9409c();
        C2976x.m10313a(b, "carrier_name", mo9855h());
        C2976x.m10313a(b, "data_path", C2684a.m9409c().mo9738y().mo9906b());
        C2976x.m10323b(b, "device_api", mo9853f());
        C2976x.m10323b(b, "display_width", mo9866s());
        C2976x.m10323b(b, "display_height", mo9865r());
        C2976x.m10323b(b, "screen_width", mo9866s());
        C2976x.m10323b(b, "screen_height", mo9865r());
        C2976x.m10323b(b, "display_dpi", mo9864q());
        C2976x.m10313a(b, "device_type", mo9863p());
        C2976x.m10313a(b, "locale_language_code", mo9867t());
        C2976x.m10313a(b, "ln", mo9867t());
        C2976x.m10313a(b, "locale_country_code", mo9858k());
        C2976x.m10313a(b, "locale", mo9858k());
        C2976x.m10313a(b, "mac_address", mo9870w());
        C2976x.m10313a(b, "manufacturer", mo9871x());
        C2976x.m10313a(b, "device_brand", mo9871x());
        C2976x.m10313a(b, "media_path", C2684a.m9409c().mo9738y().mo9907c());
        C2976x.m10313a(b, "temp_storage_path", C2684a.m9409c().mo9738y().mo9908d());
        C2976x.m10323b(b, "memory_class", mo9872y());
        C2976x.m10323b(b, "network_speed", 20);
        C2976x.m10324b(b, "memory_used_mb", mo9873z());
        C2976x.m10313a(b, "model", mo9830A());
        C2976x.m10313a(b, "device_model", mo9830A());
        C2976x.m10313a(b, "sdk_type", this.f11562g);
        C2976x.m10313a(b, "sdk_version", mo9833D());
        C2976x.m10313a(b, "network_type", c.mo9730q().mo9664a());
        C2976x.m10313a(b, "os_version", mo9832C());
        C2976x.m10313a(b, "os_name", this.f11561f);
        C2976x.m10313a(b, "platform", this.f11561f);
        C2976x.m10313a(b, "arch", mo9841a());
        C2976x.m10313a(b, "user_id", C2976x.m10337i(c.mo9733t().mo9413b(), "user_id"));
        C2976x.m10313a(b, "app_id", c.mo9733t().mo9412a());
        C2976x.m10313a(b, "app_bundle_name", C2916s0.m10069b());
        C2976x.m10313a(b, "app_bundle_version", C2916s0.m10075c());
        C2976x.m10312a(b, "battery_level", mo9854g());
        C2976x.m10313a(b, "cell_service_country_code", mo9834E());
        C2976x.m10313a(b, "timezone_ietf", mo9836G());
        C2976x.m10323b(b, "timezone_gmt_m", mo9835F());
        C2976x.m10323b(b, "timezone_dst_m", mo9859l());
        C2976x.m10315a(b, "launch_metadata", mo9868u());
        C2976x.m10313a(b, "controller_version", c.mo9714d());
        int B = mo9831B();
        f11555k = B;
        C2976x.m10323b(b, "current_orientation", B);
        C2976x.m10325b(b, "cleartext_permitted", mo9856i());
        C2976x.m10312a(b, "density", (double) mo9861n());
        C2976x.m10325b(b, "dark_mode", mo9860m());
        JSONArray a = C2976x.m10301a();
        if (C2916s0.m10077c("com.android.vending")) {
            a.put("google");
        }
        if (C2916s0.m10077c("com.amazon.venezia")) {
            a.put("amazon");
        }
        C2976x.m10314a(b, "available_stores", a);
        C2976x.m10314a(b, "permissions", C2916s0.m10080d(C2684a.m9407b()));
        if (!this.f11558c.mo9658a() && j > 0) {
            this.f11558c.mo9656a(j);
        }
        C2976x.m10313a(b, "advertiser_id", mo9847b());
        C2976x.m10325b(b, "limit_tracking", mo9869v());
        if (mo9847b() == null || mo9847b().equals("")) {
            C2976x.m10313a(b, "android_id_sha1", C2916s0.m10072b(mo9852e()));
        }
        return b;
    }
}
