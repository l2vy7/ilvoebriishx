package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.core.AppnextError;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.u6 */
/* compiled from: Sta */
public class C12361u6 extends WebViewClient {

    /* renamed from: a */
    public final Context f54815a;

    /* renamed from: b */
    public final C5069e f54816b;

    /* renamed from: c */
    public final Executor f54817c;

    /* renamed from: d */
    public final Handler f54818d;

    /* renamed from: e */
    public String f54819e;

    /* renamed from: f */
    public String f54820f;

    /* renamed from: g */
    public boolean f54821g = false;

    /* renamed from: h */
    public boolean f54822h = false;

    /* renamed from: i */
    public long f54823i;

    /* renamed from: j */
    public final long f54824j;

    /* renamed from: k */
    public boolean f54825k;

    /* renamed from: l */
    public Boolean f54826l;

    /* renamed from: m */
    public String f54827m;

    /* renamed from: n */
    public Runnable f54828n;

    /* renamed from: o */
    public boolean f54829o = false;

    /* renamed from: p */
    public boolean f54830p = false;

    /* renamed from: q */
    public final LinkedHashMap<String, Float> f54831q = new LinkedHashMap<>();

    /* renamed from: r */
    public long f54832r;

    /* renamed from: s */
    public final Runnable f54833s = new C12362a();

    /* renamed from: t */
    public final Runnable f54834t = new C12363b();

    /* renamed from: u */
    public final Runnable f54835u = new C12364c();

    /* renamed from: v */
    public final Runnable f54836v = new C12365d();

    /* renamed from: com.startapp.u6$a */
    /* compiled from: Sta */
    public class C12362a implements Runnable {
        public C12362a() {
        }

        public void run() {
            C12361u6 u6Var = C12361u6.this;
            u6Var.f54817c.execute(u6Var.f54834t);
        }
    }

    /* renamed from: com.startapp.u6$b */
    /* compiled from: Sta */
    public class C12363b implements Runnable {
        public C12363b() {
        }

        public void run() {
            C12361u6 u6Var = C12361u6.this;
            if (!u6Var.f54821g) {
                try {
                    C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed smart redirect hop info: ");
                    sb.append(u6Var.f54830p ? "Page Finished" : AppnextError.TIMEOUT);
                    d4Var.f22126d = sb.toString();
                    d4Var.f22128f = u6Var.mo46653b();
                    d4Var.f22129g = u6Var.f54820f;
                    d4Var.mo20661a();
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
                try {
                    u6Var.f54829o = true;
                    C5055a.m23161b(u6Var.f54815a);
                    u6Var.mo46651a();
                    if (!u6Var.f54825k || !MetaData.f22407k.mo21174P()) {
                        C5055a.m23164b(u6Var.f54815a, u6Var.f54819e, u6Var.f54820f);
                    } else {
                        C5055a.m23147a(u6Var.f54815a, u6Var.f54819e, u6Var.f54820f);
                    }
                    Runnable runnable = u6Var.f54828n;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th2) {
                    C5004d4.m22887a(th2);
                }
            }
        }
    }

    /* renamed from: com.startapp.u6$c */
    /* compiled from: Sta */
    public class C12364c implements Runnable {
        public C12364c() {
        }

        public void run() {
            C12361u6 u6Var = C12361u6.this;
            u6Var.f54817c.execute(u6Var.f54836v);
        }
    }

    /* renamed from: com.startapp.u6$d */
    /* compiled from: Sta */
    public class C12365d implements Runnable {
        public C12365d() {
        }

        public void run() {
            C12361u6 u6Var = C12361u6.this;
            if (!u6Var.f54829o && !u6Var.f54821g) {
                try {
                    u6Var.f54821g = true;
                    C5055a.m23161b(u6Var.f54815a);
                    if (!u6Var.f54825k || !MetaData.f22407k.mo21174P()) {
                        C5055a.m23164b(u6Var.f54815a, u6Var.f54819e, u6Var.f54820f);
                    } else {
                        C5055a.m23147a(u6Var.f54815a, u6Var.f54819e, u6Var.f54820f);
                    }
                    Runnable runnable = u6Var.f54828n;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
        }
    }

    /* renamed from: com.startapp.u6$e */
    /* compiled from: Sta */
    public class C12366e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f54841a;

        public C12366e(String str) {
            this.f54841a = str;
        }

        public void run() {
            C12361u6 u6Var = C12361u6.this;
            String str = this.f54841a;
            if (!u6Var.f54822h) {
                u6Var.f54832r = System.currentTimeMillis();
                u6Var.f54831q.put(str, Float.valueOf(-1.0f));
                u6Var.f54818d.postDelayed(u6Var.f54833s, u6Var.f54823i);
                u6Var.f54822h = true;
            }
            u6Var.f54830p = false;
            u6Var.mo46651a();
        }
    }

    /* renamed from: com.startapp.u6$f */
    /* compiled from: Sta */
    public class C12367f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f54843a;

        public C12367f(String str) {
            this.f54843a = str;
        }

        public void run() {
            C12361u6 u6Var = C12361u6.this;
            String str = this.f54843a;
            u6Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            u6Var.f54832r = currentTimeMillis;
            u6Var.f54831q.put(u6Var.f54819e, Float.valueOf(((float) (currentTimeMillis - u6Var.f54832r)) / 1000.0f));
            u6Var.f54831q.put(str, Float.valueOf(-1.0f));
            u6Var.f54819e = str;
        }
    }

    /* renamed from: com.startapp.u6$g */
    /* compiled from: Sta */
    public class C12368g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f54845a;

        /* renamed from: b */
        public final /* synthetic */ boolean f54846b;

        /* renamed from: c */
        public final /* synthetic */ String f54847c;

        public C12368g(String str, boolean z, String str2) {
            this.f54845a = str;
            this.f54846b = z;
            this.f54847c = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x008e A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ all -> 0x00df }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                com.startapp.u6 r0 = com.startapp.C12361u6.this
                java.lang.String r1 = r8.f54845a
                boolean r2 = r8.f54846b
                java.lang.String r3 = r8.f54847c
                r0.getClass()
                boolean r4 = r0.f54829o     // Catch:{ all -> 0x00df }
                if (r4 != 0) goto L_0x00e3
                r4 = 1
                r0.f54821g = r4     // Catch:{ all -> 0x00df }
                android.content.Context r5 = r0.f54815a     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.C5055a.m23161b((android.content.Context) r5)     // Catch:{ all -> 0x00df }
                r0.mo46651a()     // Catch:{ all -> 0x00df }
                android.content.Context r5 = r0.f54815a     // Catch:{ all -> 0x00df }
                if (r2 == 0) goto L_0x001f
                r1 = r3
            L_0x001f:
                r2 = 0
                com.startapp.sdk.adsbase.C5055a.m23164b((android.content.Context) r5, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r0.f54827m     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x0073
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0073
                java.lang.String r1 = r0.f54819e     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r0.f54827m     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ all -> 0x00df }
                boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0073
                com.startapp.d4 r1 = new com.startapp.d4     // Catch:{ all -> 0x00df }
                com.startapp.e4 r2 = com.startapp.C11882e4.f52886e     // Catch:{ all -> 0x00df }
                r1.<init>((com.startapp.C11882e4) r2)     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "Wrong package reached"
                r1.f22126d = r2     // Catch:{ all -> 0x00df }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
                r2.<init>()     // Catch:{ all -> 0x00df }
                java.lang.String r3 = "Expected: "
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = r0.f54827m     // Catch:{ all -> 0x00df }
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = ", Link: "
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = r0.f54819e     // Catch:{ all -> 0x00df }
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
                r1.f22127e = r2     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r0.f54820f     // Catch:{ all -> 0x00df }
                r1.f22129g = r2     // Catch:{ all -> 0x00df }
                r1.mo20661a()     // Catch:{ all -> 0x00df }
                goto L_0x00d7
            L_0x0073:
                com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r1 = r1.analytics     // Catch:{ all -> 0x00df }
                boolean r1 = r1.mo46318j()     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "firstSucceededSmartRedirect"
                r3 = 0
                if (r1 == 0) goto L_0x0089
                com.startapp.sdk.adsbase.e r1 = r0.f54816b     // Catch:{ all -> 0x00df }
                boolean r1 = r1.getBoolean(r2, r4)     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r4 = 0
            L_0x008a:
                java.lang.Boolean r1 = r0.f54826l     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0097
                com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f22407k     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r1 = r1.analytics     // Catch:{ all -> 0x00df }
                float r1 = r1.mo46317i()     // Catch:{ all -> 0x00df }
                goto L_0x00a1
            L_0x0097:
                boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x00a0
                r1 = 1120403456(0x42c80000, float:100.0)
                goto L_0x00a1
            L_0x00a0:
                r1 = 0
            L_0x00a1:
                if (r4 != 0) goto L_0x00b0
                double r4 = java.lang.Math.random()     // Catch:{ all -> 0x00df }
                r6 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r4 = r4 * r6
                double r6 = (double) r1     // Catch:{ all -> 0x00df }
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 >= 0) goto L_0x00d7
            L_0x00b0:
                com.startapp.d4 r1 = new com.startapp.d4     // Catch:{ all -> 0x00df }
                com.startapp.e4 r4 = com.startapp.C11882e4.f52894m     // Catch:{ all -> 0x00df }
                r1.<init>((com.startapp.C11882e4) r4)     // Catch:{ all -> 0x00df }
                org.json.JSONArray r4 = r0.mo46653b()     // Catch:{ all -> 0x00df }
                r1.f22128f = r4     // Catch:{ all -> 0x00df }
                java.lang.String r4 = r0.f54820f     // Catch:{ all -> 0x00df }
                r1.f22129g = r4     // Catch:{ all -> 0x00df }
                r1.mo20661a()     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.e r1 = r0.f54816b     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.e$a r1 = r1.edit()     // Catch:{ all -> 0x00df }
                java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00df }
                r1.mo21101a((java.lang.String) r2, r4)     // Catch:{ all -> 0x00df }
                android.content.SharedPreferences$Editor r4 = r1.f22385a     // Catch:{ all -> 0x00df }
                r4.putBoolean(r2, r3)     // Catch:{ all -> 0x00df }
                r1.apply()     // Catch:{ all -> 0x00df }
            L_0x00d7:
                java.lang.Runnable r0 = r0.f54828n     // Catch:{ all -> 0x00df }
                if (r0 == 0) goto L_0x00e3
                r0.run()     // Catch:{ all -> 0x00df }
                goto L_0x00e3
            L_0x00df:
                r0 = move-exception
                com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12361u6.C12368g.run():void");
        }
    }

    /* renamed from: com.startapp.u6$h */
    /* compiled from: Sta */
    public class C12369h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f54849a;

        public C12369h(String str) {
            this.f54849a = str;
        }

        public void run() {
            C12361u6 u6Var = C12361u6.this;
            String str = this.f54849a;
            if (!u6Var.f54821g && !u6Var.f54829o && u6Var.f54819e.equals(str) && !C5055a.m23165b(str)) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    u6Var.f54830p = true;
                    u6Var.mo46652a(str);
                    synchronized (u6Var.f54818d) {
                        u6Var.f54818d.removeCallbacks(u6Var.f54835u);
                        u6Var.f54818d.postDelayed(u6Var.f54835u, u6Var.f54824j);
                    }
                }
            }
        }
    }

    public C12361u6(Context context, C5069e eVar, Executor executor, Handler handler, long j, long j2, boolean z, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f54815a = context;
        this.f54816b = eVar;
        this.f54817c = new C12013k9(executor);
        this.f54818d = handler;
        this.f54823i = j;
        this.f54824j = j2;
        this.f54825k = z;
        this.f54826l = bool;
        this.f54819e = str;
        this.f54827m = str2;
        this.f54820f = str3;
        this.f54828n = runnable;
    }

    /* renamed from: a */
    public void mo46651a() {
        synchronized (this.f54818d) {
            this.f54818d.removeCallbacks(this.f54835u);
        }
    }

    /* renamed from: b */
    public JSONArray mo46653b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry next : this.f54831q.entrySet()) {
            String str = (String) next.getKey();
            Float f = (Float) next.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                mo46652a(str);
                jSONObject.put("time", String.valueOf(f));
                jSONObject.put("url", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f54817c.execute(new C12369h(str));
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f54817c.execute(new C12366e(str));
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        mo46651a();
        if (str2 != null && !C5055a.m23165b(str2) && C5055a.m23166c(str2)) {
            C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
            d4Var.f22126d = C12024l2.m52554a("Failed smart redirect: ", i);
            d4Var.f22127e = str2;
            d4Var.f22129g = this.f54820f;
            d4Var.mo20661a();
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!(webView == null || str == null)) {
            this.f54817c.execute(new C12367f(str));
            if (C5015nb.m22929b(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean b = C5055a.m23165b(lowerCase);
            boolean startsWith = lowerCase.startsWith("intent://");
            if (!b && !startsWith) {
                return false;
            }
            this.f54817c.execute(new C12368g(str, startsWith, webView.getUrl()));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo46652a(String str) {
        Float f = this.f54831q.get(str);
        if (f == null || f.floatValue() < 0.0f) {
            this.f54831q.put(str, Float.valueOf(((float) (System.currentTimeMillis() - this.f54832r)) / 1000.0f));
        }
    }
}
