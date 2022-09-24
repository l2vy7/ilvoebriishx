package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import com.facebook.appevents.C3406g;
import com.facebook.appevents.C3412i;
import com.facebook.internal.C3459b;
import com.facebook.internal.C3473c0;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.facebook.internal.C3511k;
import com.facebook.internal.C3559w;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import p083g3.C5338c;
import p108l3.C5670b;

/* renamed from: com.facebook.m */
/* compiled from: FacebookSdk */
public final class C3642m {

    /* renamed from: a */
    private static final String f13535a = "com.facebook.m";

    /* renamed from: b */
    private static final HashSet<C3752u> f13536b = new HashSet<>(Arrays.asList(new C3752u[]{C3752u.DEVELOPER_ERRORS}));

    /* renamed from: c */
    private static Executor f13537c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile String f13538d;

    /* renamed from: e */
    private static volatile String f13539e;

    /* renamed from: f */
    private static volatile String f13540f;

    /* renamed from: g */
    private static volatile Boolean f13541g;

    /* renamed from: h */
    private static volatile String f13542h = "facebook.com";

    /* renamed from: i */
    private static AtomicLong f13543i = new AtomicLong(65536);

    /* renamed from: j */
    private static volatile boolean f13544j = false;

    /* renamed from: k */
    private static boolean f13545k = false;

    /* renamed from: l */
    private static C3559w<File> f13546l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static Context f13547m;

    /* renamed from: n */
    private static int f13548n = 64206;

    /* renamed from: o */
    private static final Object f13549o = new Object();

    /* renamed from: p */
    private static String f13550p = C3473c0.m11574a();

    /* renamed from: q */
    private static Boolean f13551q;

    /* renamed from: r */
    private static Boolean f13552r;

    /* renamed from: com.facebook.m$a */
    /* compiled from: FacebookSdk */
    static class C3643a implements Callable<File> {
        C3643a() {
        }

        /* renamed from: b */
        public File call() throws Exception {
            return C3642m.f13547m.getCacheDir();
        }
    }

    /* renamed from: com.facebook.m$b */
    /* compiled from: FacebookSdk */
    static class C3644b implements C3511k.C3514c {
        C3644b() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C5670b.m25023a();
            }
        }
    }

    /* renamed from: com.facebook.m$c */
    /* compiled from: FacebookSdk */
    static class C3645c implements C3511k.C3514c {
        C3645c() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C3412i.m11425a();
            }
        }
    }

    /* renamed from: com.facebook.m$d */
    /* compiled from: FacebookSdk */
    static class C3646d implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C3648f f13553a;

        /* renamed from: b */
        final /* synthetic */ Context f13554b;

        C3646d(C3648f fVar, Context context) {
            this.f13553a = fVar;
            this.f13554b = context;
        }

        /* renamed from: b */
        public Void call() throws Exception {
            C3427b.m11468h().mo11865i();
            C3754w.m12656b().mo12612c();
            if (AccessToken.m11207t() && Profile.m11332d() == null) {
                Profile.m11331b();
            }
            C3648f fVar = this.f13553a;
            if (fVar != null) {
                fVar.onInitialized();
            }
            C3406g.m11397f(C3642m.f13547m, C3642m.f13538d);
            C3406g.m11398h(this.f13554b.getApplicationContext()).mo11828b();
            return null;
        }
    }

    /* renamed from: com.facebook.m$e */
    /* compiled from: FacebookSdk */
    static class C3647e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f13555b;

        /* renamed from: c */
        final /* synthetic */ String f13556c;

        C3647e(Context context, String str) {
            this.f13555b = context;
            this.f13556c = str;
        }

        public void run() {
            C3642m.m12300z(this.f13555b, this.f13556c);
        }
    }

    /* renamed from: com.facebook.m$f */
    /* compiled from: FacebookSdk */
    public interface C3648f {
        void onInitialized();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f13551q = bool;
        f13552r = bool;
    }

    /* renamed from: A */
    public static void m12272A(Context context, String str) {
        m12288n().execute(new C3647e(context.getApplicationContext(), str));
    }

    @Deprecated
    /* renamed from: B */
    public static synchronized void m12273B(Context context) {
        synchronized (C3642m.class) {
            m12274C(context, (C3648f) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    @java.lang.Deprecated
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m12274C(android.content.Context r3, com.facebook.C3642m.C3648f r4) {
        /*
            java.lang.Class<com.facebook.m> r0 = com.facebook.C3642m.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f13551q     // Catch:{ all -> 0x009f }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0010
            r4.onInitialized()     // Catch:{ all -> 0x009f }
        L_0x0010:
            monitor-exit(r0)
            return
        L_0x0012:
            java.lang.String r1 = "applicationContext"
            com.facebook.internal.C3489g0.m11687i(r3, r1)     // Catch:{ all -> 0x009f }
            r1 = 0
            com.facebook.internal.C3489g0.m11683e(r3, r1)     // Catch:{ all -> 0x009f }
            com.facebook.internal.C3489g0.m11684f(r3, r1)     // Catch:{ all -> 0x009f }
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x009f }
            f13547m = r1     // Catch:{ all -> 0x009f }
            com.facebook.appevents.C3406g.m11394c(r3)     // Catch:{ all -> 0x009f }
            android.content.Context r1 = f13547m     // Catch:{ all -> 0x009f }
            m12299y(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = f13538d     // Catch:{ all -> 0x009f }
            boolean r1 = com.facebook.internal.C3481f0.m11604O(r1)     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0097
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009f }
            f13551q = r1     // Catch:{ all -> 0x009f }
            boolean r1 = m12282h()     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0041
            m12277c()     // Catch:{ all -> 0x009f }
        L_0x0041:
            android.content.Context r1 = f13547m     // Catch:{ all -> 0x009f }
            boolean r1 = r1 instanceof android.app.Application     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0056
            boolean r1 = com.facebook.C3433b0.m11489g()     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0056
            android.content.Context r1 = f13547m     // Catch:{ all -> 0x009f }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x009f }
            java.lang.String r2 = f13538d     // Catch:{ all -> 0x009f }
            p083g3.C5330a.m24040x(r1, r2)     // Catch:{ all -> 0x009f }
        L_0x0056:
            com.facebook.internal.C3522n.m11805k()     // Catch:{ all -> 0x009f }
            com.facebook.internal.C3563z.m11934z()     // Catch:{ all -> 0x009f }
            com.facebook.C3433b0.m11495m()     // Catch:{ all -> 0x009f }
            android.content.Context r1 = f13547m     // Catch:{ all -> 0x009f }
            com.facebook.internal.BoltsMeasurementEventListener.m11527b(r1)     // Catch:{ all -> 0x009f }
            com.facebook.internal.w r1 = new com.facebook.internal.w     // Catch:{ all -> 0x009f }
            com.facebook.m$a r2 = new com.facebook.m$a     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            r1.<init>(r2)     // Catch:{ all -> 0x009f }
            f13546l = r1     // Catch:{ all -> 0x009f }
            com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.Instrument     // Catch:{ all -> 0x009f }
            com.facebook.m$b r2 = new com.facebook.m$b     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            com.facebook.internal.C3511k.m11755a(r1, r2)     // Catch:{ all -> 0x009f }
            com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.AppEvents     // Catch:{ all -> 0x009f }
            com.facebook.m$c r2 = new com.facebook.m$c     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            com.facebook.internal.C3511k.m11755a(r1, r2)     // Catch:{ all -> 0x009f }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x009f }
            com.facebook.m$d r2 = new com.facebook.m$d     // Catch:{ all -> 0x009f }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x009f }
            r1.<init>(r2)     // Catch:{ all -> 0x009f }
            java.util.concurrent.Executor r3 = m12288n()     // Catch:{ all -> 0x009f }
            r3.execute(r1)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)
            return
        L_0x0097:
            com.facebook.j r3 = new com.facebook.j     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x009f }
            throw r3     // Catch:{ all -> 0x009f }
        L_0x009f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3642m.m12274C(android.content.Context, com.facebook.m$f):void");
    }

    /* renamed from: c */
    public static void m12277c() {
        f13552r = Boolean.TRUE;
    }

    /* renamed from: d */
    public static boolean m12278d() {
        return C3433b0.m11487e();
    }

    /* renamed from: e */
    public static Context m12279e() {
        C3489g0.m11689k();
        return f13547m;
    }

    /* renamed from: f */
    public static String m12280f() {
        C3489g0.m11689k();
        return f13538d;
    }

    /* renamed from: g */
    public static String m12281g() {
        C3489g0.m11689k();
        return f13539e;
    }

    /* renamed from: h */
    public static boolean m12282h() {
        return C3433b0.m11488f();
    }

    /* renamed from: i */
    public static boolean m12283i() {
        return C3433b0.m11489g();
    }

    /* renamed from: j */
    public static File m12284j() {
        C3489g0.m11689k();
        return f13546l.mo12077c();
    }

    /* renamed from: k */
    public static int m12285k() {
        C3489g0.m11689k();
        return f13548n;
    }

    /* renamed from: l */
    public static String m12286l() {
        C3489g0.m11689k();
        return f13540f;
    }

    /* renamed from: m */
    public static boolean m12287m() {
        return C3433b0.m11490h();
    }

    /* renamed from: n */
    public static Executor m12288n() {
        synchronized (f13549o) {
            if (f13537c == null) {
                f13537c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f13537c;
    }

    /* renamed from: o */
    public static String m12289o() {
        AccessToken h = AccessToken.m11205h();
        String m = h != null ? h.mo11187m() : null;
        if (m == null) {
            return f13542h;
        }
        if (m.equals("gaming")) {
            return f13542h.replace("facebook.com", "fb.gg");
        }
        return f13542h;
    }

    /* renamed from: p */
    public static String m12290p() {
        C3481f0.m11609T(f13535a, String.format("getGraphApiVersion: %s", new Object[]{f13550p}));
        return f13550p;
    }

    /* renamed from: q */
    public static boolean m12291q(Context context) {
        C3489g0.m11689k();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: r */
    public static long m12292r() {
        C3489g0.m11689k();
        return f13543i.get();
    }

    /* renamed from: s */
    public static String m12293s() {
        return "5.15.3";
    }

    /* renamed from: t */
    public static boolean m12294t() {
        return f13544j;
    }

    /* renamed from: u */
    public static synchronized boolean m12295u() {
        boolean booleanValue;
        synchronized (C3642m.class) {
            booleanValue = f13552r.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: v */
    public static synchronized boolean m12296v() {
        boolean booleanValue;
        synchronized (C3642m.class) {
            booleanValue = f13551q.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: w */
    public static boolean m12297w() {
        return f13545k;
    }

    /* renamed from: x */
    public static boolean m12298x(C3752u uVar) {
        boolean z;
        HashSet<C3752u> hashSet = f13536b;
        synchronized (hashSet) {
            z = m12294t() && hashSet.contains(uVar);
        }
        return z;
    }

    /* renamed from: y */
    static void m12299y(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (f13538d == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                f13538d = str.substring(2);
                            } else {
                                f13538d = str;
                            }
                        } else if (obj instanceof Integer) {
                            throw new C3572j("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f13539e == null) {
                        f13539e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f13540f == null) {
                        f13540f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f13548n == 64206) {
                        f13548n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f13541g == null) {
                        f13541g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: z */
    static void m12300z(Context context, String str) {
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        try {
            C3459b h = C3459b.m11543h(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String str2 = str + "ping";
            long j = sharedPreferences.getLong(str2, 0);
            GraphRequest L = GraphRequest.m11254L((AccessToken) null, String.format("%s/activities", new Object[]{str}), C5338c.m24048a(C5338c.C5340b.MOBILE_INSTALL_EVENT, h, C3406g.m11394c(context), m12291q(context), context), (GraphRequest.C3360f) null);
            if (j == 0 && L.mo11250g().mo12380g() == null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str2, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e) {
            throw new C3572j("An error occurred while publishing install.", (Throwable) e);
        } catch (Exception e2) {
            C3481f0.m11608S("Facebook-publish", e2);
        }
    }
}
