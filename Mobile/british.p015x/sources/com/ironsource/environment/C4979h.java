package com.ironsource.environment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.appnext.core.C3148Ad;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.ironsource.environment.h */
public final class C4979h {

    /* renamed from: a */
    private static String f22050a = null;

    /* renamed from: b */
    private static String f22051b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f22052c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f22053d = "";

    /* renamed from: com.ironsource.environment.h$a */
    static class C4980a implements InvocationHandler {
        C4980a() {
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                return null;
            }
            try {
                if (objArr.length <= 0 || objArr[0] == null) {
                    return null;
                }
                String obj2 = objArr[0].getClass().getMethod("getId", new Class[0]).invoke(objArr[0], new Object[0]).toString();
                if (TextUtils.isEmpty(obj2)) {
                    return null;
                }
                String unused = C4979h.f22053d = obj2;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: com.ironsource.environment.h$b */
    static class C4981b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Context f22054b;

        C4981b(Context context) {
            this.f22054b = context;
        }

        public final void run() {
            try {
                WebView webView = new WebView(this.f22054b);
                webView.setLayerType(1, (Paint) null);
                String unused = C4979h.f22052c = webView.getSettings().getUserAgentString();
                webView.destroy();
                C4979h.m22785a(this.f22054b, C4979h.f22052c);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: A */
    public static int m22780A(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    /* renamed from: B */
    public static String m22781B(Context context) {
        return m22796d(context) ? "Tablet" : "Phone";
    }

    /* renamed from: C */
    public static String m22782C(Context context) {
        C4978g gVar = C4978g.f22048a;
        if (!C4978g.m22779a()) {
            return "";
        }
        Class<AppSet> cls = AppSet.class;
        try {
            Object invoke = cls.getMethod("getClient", new Class[]{Context.class}).invoke(cls, new Object[]{context});
            Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]);
            Class<OnSuccessListener> cls2 = OnSuccessListener.class;
            invoke2.getClass().getMethod("addOnSuccessListener", new Class[]{cls2}).invoke(invoke2, new Object[]{Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls2}, new C4980a())});
            return !TextUtils.isEmpty(f22053d) ? f22053d : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static long m22783a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    /* renamed from: a */
    public static long m22784a(String str) {
        return m22789b(new File(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m22785a(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.ironsource.environment.h> r0 = com.ironsource.environment.C4979h.class
            monitor-enter(r0)
            java.lang.String r1 = "Mediation_Shared_Preferences"
            java.lang.String r2 = "browser_user_agent"
            com.ironsource.environment.C4983j.m22837a(r3, r1, r2, r4)     // Catch:{ Exception -> 0x000f, all -> 0x000c }
            monitor-exit(r0)
            return
        L_0x000c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x000f:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4979h.m22785a(android.content.Context, java.lang.String):void");
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m22786a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    /* renamed from: a */
    public static String[] m22787a(Context context) {
        Class<AdvertisingIdClient> cls = AdvertisingIdClient.class;
        Object invoke = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        Method method = invoke.getClass().getMethod("getId", new Class[0]);
        Method method2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
        String obj = method.invoke(invoke, new Object[0]).toString();
        boolean booleanValue = ((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append(booleanValue);
        return new String[]{obj, sb.toString()};
    }

    /* renamed from: b */
    public static int m22788b() {
        return -(TimeZone.getDefault().getOffset(m22783a()) / 60000);
    }

    /* renamed from: b */
    private static long m22789b(File file) {
        long j;
        long j2;
        StatFs statFs = new StatFs(file.getPath());
        if (Build.VERSION.SDK_INT < 19) {
            j2 = (long) statFs.getAvailableBlocks();
            j = (long) statFs.getBlockSize();
        } else {
            j2 = statFs.getAvailableBlocksLong();
            j = statFs.getBlockSizeLong();
        }
        return (j2 * j) / 1048576;
    }

    /* renamed from: b */
    public static String m22790b(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    /* renamed from: c */
    public static String m22791c() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    /* renamed from: c */
    public static String m22792c(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    /* renamed from: d */
    public static boolean m22795d() {
        return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
    }

    /* renamed from: d */
    public static boolean m22796d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static long m22797e(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        if (Build.VERSION.SDK_INT >= 16) {
            return memoryInfo.totalMem;
        }
        return -1;
    }

    /* renamed from: e */
    public static String m22798e() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: e */
    private static boolean m22799e(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                String str2 = strArr[i];
                if (new File(str2 + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static int m22800f() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: f */
    public static boolean m22801f(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra(IronSourceConstants.EVENTS_STATUS, -1);
        }
        return i == 2 || i == 5;
    }

    /* renamed from: g */
    public static int m22802g(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    /* renamed from: g */
    public static String m22803g() {
        return Build.MODEL;
    }

    /* renamed from: h */
    public static String m22804h() {
        return Build.MANUFACTURER;
    }

    /* renamed from: h */
    public static boolean m22805h(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 && Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: i */
    public static String m22806i() {
        return MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    /* renamed from: i */
    public static boolean m22807i(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 && Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getSystemService("phone");
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22808j(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getNetworkOperatorName()
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4979h.m22808j(android.content.Context):java.lang.String");
    }

    /* renamed from: j */
    public static boolean m22809j() {
        return m22799e("su");
    }

    /* renamed from: k */
    public static int m22810k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getSystemService("phone");
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22811k(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getNetworkCountryIso()
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4979h.m22811k(android.content.Context):java.lang.String");
    }

    /* renamed from: l */
    public static int m22812l() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: l */
    public static int m22813l(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: m */
    public static float m22814m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return ((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3));
        } catch (Exception e) {
            e.printStackTrace();
            return -1.0f;
        }
    }

    /* renamed from: m */
    public static int m22815m() {
        return m22810k();
    }

    /* renamed from: n */
    public static int m22816n() {
        return m22812l();
    }

    /* renamed from: n */
    public static int m22817n(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    /* renamed from: o */
    public static float m22818o() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: o */
    public static String m22819o(Context context) {
        if (context == null) {
            return "";
        }
        int n = m22817n(context);
        if (n != 0) {
            if (n != 1) {
                if (n != 11) {
                    if (n != 12) {
                        switch (n) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return C3148Ad.ORIENTATION_PORTRAIT;
        }
        return C3148Ad.ORIENTATION_LANDSCAPE;
    }

    /* renamed from: p */
    public static int m22820p(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    /* renamed from: p */
    public static long m22821p() {
        return m22789b(Environment.getDataDirectory());
    }

    /* renamed from: q */
    public static List<ApplicationInfo> m22822q(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    /* renamed from: q */
    public static void m22823q() {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
                f22052c = defaultUserAgent;
                m22785a(applicationContext, defaultUserAgent);
            } catch (Exception unused) {
            }
        } else {
            ContextProvider.getInstance().runOnUIThread(new C4981b(applicationContext));
        }
    }

    /* renamed from: r */
    public static String m22824r() {
        Context applicationContext;
        if (!f22052c.isEmpty() || (applicationContext = ContextProvider.getInstance().getApplicationContext()) == null) {
            return f22052c;
        }
        try {
            return C4983j.m22838b(applicationContext, "Mediation_Shared_Preferences", "browser_user_agent", "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: r */
    public static boolean m22825r(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    /* renamed from: s */
    public static File m22826s(Context context) {
        return context.getExternalCacheDir();
    }

    /* renamed from: t */
    public static File m22827t(Context context) {
        return context.getExternalFilesDir((String) null);
    }

    /* renamed from: u */
    public static File m22829u(Context context) {
        return context.getCacheDir();
    }

    /* renamed from: v */
    public static File m22830v(Context context) {
        return context.getFilesDir();
    }

    /* renamed from: w */
    public static int m22831w(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("scale", -1);
            }
            if (intExtra == -1 || i == -1) {
                return -1;
            }
            return (int) ((((float) intExtra) / ((float) i)) * 100.0f);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: x */
    public static boolean m22832x(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: y */
    public static synchronized String m22833y(Context context) {
        synchronized (C4979h.class) {
            if (!TextUtils.isEmpty(f22050a)) {
                String str = f22050a;
                return str;
            }
            boolean z = true;
            if (context != null) {
                z = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean("uuidEnabled", true);
            }
            if (z) {
                String b = C4983j.m22838b(context, "Mediation_Shared_Preferences", "cachedUUID", "");
                if (TextUtils.isEmpty(b)) {
                    String uuid = UUID.randomUUID().toString();
                    f22050a = uuid;
                    C4983j.m22837a(context, "Mediation_Shared_Preferences", "cachedUUID", uuid);
                } else {
                    f22050a = b;
                }
            }
            String str2 = f22050a;
            return str2;
        }
    }

    /* renamed from: z */
    public static synchronized String m22834z(Context context) {
        synchronized (C4979h.class) {
            if (!TextUtils.isEmpty(f22051b)) {
                String str = f22051b;
                return str;
            } else if (context == null) {
                return "";
            } else {
                String b = C4983j.m22838b(context, "supersonic_shared_preferen", "auid", "");
                f22051b = b;
                if (TextUtils.isEmpty(b)) {
                    String uuid = UUID.randomUUID().toString();
                    f22051b = uuid;
                    C4983j.m22837a(context, "supersonic_shared_preferen", "auid", uuid);
                }
                String str2 = f22051b;
                return str2;
            }
        }
    }
}
