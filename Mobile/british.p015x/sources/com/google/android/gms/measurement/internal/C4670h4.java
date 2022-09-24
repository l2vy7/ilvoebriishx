package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C4659n6;
import com.google.android.gms.internal.measurement.C9318qc;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6483e;
import p006a5.C6486h;
import p193c5.C6520c;
import p256u5.C11026a;
import p256u5.C11027b;
import p256u5.C11038m;
import p256u5.C11045t;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C4670h4 implements C9747d5 {

    /* renamed from: H */
    private static volatile C4670h4 f21292H;

    /* renamed from: A */
    private volatile Boolean f21293A;

    /* renamed from: B */
    protected Boolean f21294B;

    /* renamed from: C */
    protected Boolean f21295C;

    /* renamed from: D */
    private volatile boolean f21296D;

    /* renamed from: E */
    private int f21297E;

    /* renamed from: F */
    private final AtomicInteger f21298F = new AtomicInteger(0);

    /* renamed from: G */
    final long f21299G;

    /* renamed from: a */
    private final Context f21300a;

    /* renamed from: b */
    private final String f21301b;

    /* renamed from: c */
    private final String f21302c;

    /* renamed from: d */
    private final String f21303d;

    /* renamed from: e */
    private final boolean f21304e;

    /* renamed from: f */
    private final C9721b f21305f;

    /* renamed from: g */
    private final C4669f f21306g;

    /* renamed from: h */
    private final C4671q3 f21307h;

    /* renamed from: i */
    private final C4667d3 f21308i;

    /* renamed from: j */
    private final C9766f4 f21309j;

    /* renamed from: k */
    private final C9813j8 f21310k;

    /* renamed from: l */
    private final C4668d9 f21311l;

    /* renamed from: m */
    private final C9962y2 f21312m;

    /* renamed from: n */
    private final C6483e f21313n;

    /* renamed from: o */
    private final C9917t6 f21314o;

    /* renamed from: p */
    private final C9779g6 f21315p;

    /* renamed from: q */
    private final C9961y1 f21316q;

    /* renamed from: r */
    private final C9822k6 f21317r;

    /* renamed from: s */
    private final String f21318s;

    /* renamed from: t */
    private C9952x2 f21319t;

    /* renamed from: u */
    private C9918t7 f21320u;

    /* renamed from: v */
    private C9837m f21321v;

    /* renamed from: w */
    private C4672u2 f21322w;

    /* renamed from: x */
    private boolean f21323x = false;

    /* renamed from: y */
    private Boolean f21324y;

    /* renamed from: z */
    private long f21325z;

    C4670h4(C9767f5 f5Var) {
        long j;
        Bundle bundle;
        boolean z = false;
        C4604n.m20098k(f5Var);
        Context context = f5Var.f46260a;
        C9721b bVar = new C9721b(context);
        this.f21305f = bVar;
        C9884q2.f46585a = bVar;
        this.f21300a = context;
        this.f21301b = f5Var.f46261b;
        this.f21302c = f5Var.f46262c;
        this.f21303d = f5Var.f46263d;
        this.f21304e = f5Var.f46267h;
        this.f21293A = f5Var.f46264e;
        this.f21318s = f5Var.f46269j;
        this.f21296D = true;
        zzcl zzcl = f5Var.f46266g;
        if (!(zzcl == null || (bundle = zzcl.f45580h) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f21294B = (Boolean) obj;
            }
            Object obj2 = zzcl.f45580h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f21295C = (Boolean) obj2;
            }
        }
        C4659n6.m21449e(context);
        C6483e b = C6486h.m28261b();
        this.f21313n = b;
        Long l = f5Var.f46268i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = b.currentTimeMillis();
        }
        this.f21299G = j;
        this.f21306g = new C4669f(this);
        C4671q3 q3Var = new C4671q3(this);
        q3Var.mo38881k();
        this.f21307h = q3Var;
        C4667d3 d3Var = new C4667d3(this);
        d3Var.mo38881k();
        this.f21308i = d3Var;
        C4668d9 d9Var = new C4668d9(this);
        d9Var.mo38881k();
        this.f21311l = d9Var;
        this.f21312m = new C9962y2(new C9757e5(f5Var, this));
        this.f21316q = new C9961y1(this);
        C9917t6 t6Var = new C9917t6(this);
        t6Var.mo39231h();
        this.f21314o = t6Var;
        C9779g6 g6Var = new C9779g6(this);
        g6Var.mo39231h();
        this.f21315p = g6Var;
        C9813j8 j8Var = new C9813j8(this);
        j8Var.mo39231h();
        this.f21310k = j8Var;
        C9822k6 k6Var = new C9822k6(this);
        k6Var.mo38881k();
        this.f21317r = k6Var;
        C9766f4 f4Var = new C9766f4(this);
        f4Var.mo38881k();
        this.f21309j = f4Var;
        zzcl zzcl2 = f5Var.f46266g;
        z = (zzcl2 == null || zzcl2.f45575c == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C9779g6 I = mo19367I();
            if (I.f21269a.f21300a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f21269a.f21300a.getApplicationContext();
                if (I.f46293c == null) {
                    I.f46293c = new C9768f6(I, (C11045t) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f46293c);
                    application.registerActivityLifecycleCallbacks(I.f46293c);
                    I.f21269a.mo19276j().mo19286v().mo38856a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo19276j().mo19287w().mo38856a("Application context is not an Application");
        }
        f4Var.mo38909z(new C9777g4(this, f5Var));
    }

    /* renamed from: H */
    public static C4670h4 m21577H(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.f45578f == null || zzcl.f45579g == null)) {
            zzcl = new zzcl(zzcl.f45574b, zzcl.f45575c, zzcl.f45576d, zzcl.f45577e, (String) null, (String) null, zzcl.f45580h, (String) null);
        }
        C4604n.m20098k(context);
        C4604n.m20098k(context.getApplicationContext());
        if (f21292H == null) {
            synchronized (C4670h4.class) {
                if (f21292H == null) {
                    f21292H = new C4670h4(new C9767f5(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.f45580h) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C4604n.m20098k(f21292H);
            f21292H.f21293A = Boolean.valueOf(zzcl.f45580h.getBoolean("dataCollectionDefaultEnabled"));
        }
        C4604n.m20098k(f21292H);
        return f21292H;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m21578a(C4670h4 h4Var, C9767f5 f5Var) {
        String str;
        h4Var.mo19273e().mo19272b();
        h4Var.f21306g.mo19356w();
        C9837m mVar = new C9837m(h4Var);
        mVar.mo38881k();
        h4Var.f21321v = mVar;
        C4672u2 u2Var = new C4672u2(h4Var, f5Var.f46265f);
        u2Var.mo39231h();
        h4Var.f21322w = u2Var;
        C9952x2 x2Var = new C9952x2(h4Var);
        x2Var.mo39231h();
        h4Var.f21319t = x2Var;
        C9918t7 t7Var = new C9918t7(h4Var);
        t7Var.mo39231h();
        h4Var.f21320u = t7Var;
        h4Var.f21311l.mo38882l();
        h4Var.f21307h.mo38882l();
        h4Var.f21322w.mo39232i();
        C9725b3 u = h4Var.mo19276j().mo19285u();
        h4Var.f21306g.mo19350p();
        u.mo38857b("App measurement initialized, version", 55005L);
        h4Var.mo19276j().mo19285u().mo38856a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = u2Var.mo19408s();
        if (TextUtils.isEmpty(h4Var.f21301b)) {
            if (h4Var.mo19372N().mo19308S(s)) {
                h4Var.mo19276j().mo19285u().mo38856a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                C9725b3 u2 = h4Var.mo19276j().mo19285u();
                String valueOf = String.valueOf(s);
                if (valueOf.length() != 0) {
                    str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf);
                } else {
                    str = new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                }
                u2.mo38856a(str);
            }
        }
        h4Var.mo19276j().mo19281p().mo38856a("Debug-level message logging enabled");
        if (h4Var.f21297E != h4Var.f21298F.get()) {
            h4Var.mo19276j().mo19282q().mo38858c("Not all components initialized", Integer.valueOf(h4Var.f21297E), Integer.valueOf(h4Var.f21298F.get()));
        }
        h4Var.f21323x = true;
    }

    /* renamed from: t */
    static final void m21579t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m21580u(C4666b5 b5Var) {
        if (b5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m21581v(C9923u3 u3Var) {
        if (u3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!u3Var.mo39233l()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(u3Var.getClass())));
        }
    }

    /* renamed from: w */
    private static final void m21582w(C9737c5 c5Var) {
        if (c5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!c5Var.mo38883m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(c5Var.getClass())));
        }
    }

    @Pure
    /* renamed from: A */
    public final C9837m mo19360A() {
        m21582w(this.f21321v);
        return this.f21321v;
    }

    @Pure
    /* renamed from: B */
    public final C4672u2 mo19361B() {
        m21581v(this.f21322w);
        return this.f21322w;
    }

    @Pure
    /* renamed from: C */
    public final C9952x2 mo19362C() {
        m21581v(this.f21319t);
        return this.f21319t;
    }

    @Pure
    /* renamed from: D */
    public final C9962y2 mo19363D() {
        return this.f21312m;
    }

    /* renamed from: E */
    public final C4667d3 mo19364E() {
        C4667d3 d3Var = this.f21308i;
        if (d3Var == null || !d3Var.mo38883m()) {
            return null;
        }
        return d3Var;
    }

    @Pure
    /* renamed from: F */
    public final C4671q3 mo19365F() {
        m21580u(this.f21307h);
        return this.f21307h;
    }

    /* access modifiers changed from: package-private */
    @SideEffectFree
    /* renamed from: G */
    public final C9766f4 mo19366G() {
        return this.f21309j;
    }

    @Pure
    /* renamed from: I */
    public final C9779g6 mo19367I() {
        m21581v(this.f21315p);
        return this.f21315p;
    }

    @Pure
    /* renamed from: J */
    public final C9822k6 mo19368J() {
        m21582w(this.f21317r);
        return this.f21317r;
    }

    @Pure
    /* renamed from: K */
    public final C9917t6 mo19369K() {
        m21581v(this.f21314o);
        return this.f21314o;
    }

    @Pure
    /* renamed from: L */
    public final C9918t7 mo19370L() {
        m21581v(this.f21320u);
        return this.f21320u;
    }

    @Pure
    /* renamed from: M */
    public final C9813j8 mo19371M() {
        m21581v(this.f21310k);
        return this.f21310k;
    }

    @Pure
    /* renamed from: N */
    public final C4668d9 mo19372N() {
        m21580u(this.f21311l);
        return this.f21311l;
    }

    @Pure
    /* renamed from: O */
    public final String mo19373O() {
        return this.f21301b;
    }

    @Pure
    /* renamed from: P */
    public final String mo19374P() {
        return this.f21302c;
    }

    @Pure
    /* renamed from: Q */
    public final String mo19375Q() {
        return this.f21303d;
    }

    @Pure
    /* renamed from: R */
    public final String mo19376R() {
        return this.f21318s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19377b() {
        this.f21298F.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo19378c(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo19276j().mo19287w().mo38858c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo19365F().f21342r.mo39051a(true);
            if (bArr == null || bArr.length == 0) {
                mo19276j().mo19281p().mo38856a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo19276j().mo19281p().mo38856a("Deferred Deep Link is empty.");
                    return;
                }
                C4668d9 N = mo19372N();
                C4670h4 h4Var = N.f21269a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f21269a.f21300a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f21315p.mo38956u(TtmlNode.TEXT_EMPHASIS_AUTO, "_cmp", bundle);
                        C4668d9 N2 = mo19372N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f21269a.f21300a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f21269a.f21300a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f21269a.mo19276j().mo19282q().mo38857b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo19276j().mo19287w().mo38858c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo19276j().mo19282q().mo38857b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo19276j().mo19287w().mo38858c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo19379d() {
        this.f21297E++;
    }

    @Pure
    /* renamed from: e */
    public final C9766f4 mo19273e() {
        m21582w(this.f21309j);
        return this.f21309j;
    }

    @Pure
    /* renamed from: f */
    public final C6483e mo19274f() {
        return this.f21313n;
    }

    @Pure
    /* renamed from: g */
    public final C9721b mo19275g() {
        return this.f21305f;
    }

    /* renamed from: h */
    public final void mo19380h() {
        mo19273e().mo19272b();
        m21582w(mo19368J());
        String s = mo19361B().mo19408s();
        Pair o = mo19365F().mo19394o(s);
        if (!this.f21306g.mo19336A() || ((Boolean) o.second).booleanValue() || TextUtils.isEmpty((CharSequence) o.first)) {
            mo19276j().mo19281p().mo38856a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C9822k6 J = mo19368J();
        J.mo38880i();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f21269a.f21300a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo19276j().mo19287w().mo38856a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C4668d9 N = mo19372N();
        mo19361B().f21269a.f21306g.mo19350p();
        URL q = N.mo19324q(55005, s, (String) o.first, mo19365F().f21343s.mo39075a() - 1);
        if (q != null) {
            C9822k6 J2 = mo19368J();
            C11038m mVar = new C11038m(this);
            J2.mo19272b();
            J2.mo38880i();
            C4604n.m20098k(q);
            C4604n.m20098k(mVar);
            J2.f21269a.mo19273e().mo38908y(new C9800i6(J2, s, q, (byte[]) null, (Map) null, mVar, (byte[]) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo19381i(boolean z) {
        this.f21293A = Boolean.valueOf(z);
    }

    @Pure
    /* renamed from: j */
    public final C4667d3 mo19276j() {
        m21582w(this.f21308i);
        return this.f21308i;
    }

    /* renamed from: k */
    public final void mo19382k(boolean z) {
        mo19273e().mo19272b();
        this.f21296D = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo19383l(zzcl zzcl) {
        C11027b bVar;
        mo19273e().mo19272b();
        C11027b p = mo19365F().mo19395p();
        C4671q3 F = mo19365F();
        C4670h4 h4Var = F.f21269a;
        F.mo19272b();
        int i = 100;
        int i2 = F.mo19393n().getInt("consent_source", 100);
        C4669f fVar = this.f21306g;
        C4670h4 h4Var2 = fVar.f21269a;
        Boolean t = fVar.mo19353t("google_analytics_default_allow_ad_storage");
        C4669f fVar2 = this.f21306g;
        C4670h4 h4Var3 = fVar2.f21269a;
        Boolean t2 = fVar2.mo19353t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo19365F().mo19401w(-10)) {
            bVar = new C11027b(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo19361B().mo19409t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo19367I().mo38928G(C11027b.f49992b, -10, this.f21299G);
            } else if (TextUtils.isEmpty(mo19361B().mo19409t()) && zzcl != null && zzcl.f45580h != null && mo19365F().mo19401w(30)) {
                bVar = C11027b.m49401a(zzcl.f45580h);
                if (!bVar.equals(C11027b.f49992b)) {
                    i = 30;
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            mo19367I().mo38928G(bVar, i, this.f21299G);
            p = bVar;
        }
        mo19367I().mo38932K(p);
        if (mo19365F().f21329e.mo39075a() == 0) {
            mo19276j().mo19286v().mo38857b("Persisting first open", Long.valueOf(this.f21299G));
            mo19365F().f21329e.mo39076b(this.f21299G);
        }
        mo19367I().f46304n.mo39033c();
        if (mo19388q()) {
            if (!TextUtils.isEmpty(mo19361B().mo19409t()) || !TextUtils.isEmpty(mo19361B().mo19407q())) {
                C4668d9 N = mo19372N();
                String t3 = mo19361B().mo19409t();
                C4671q3 F2 = mo19365F();
                F2.mo19272b();
                String string = F2.mo19393n().getString("gmp_app_id", (String) null);
                String q = mo19361B().mo19407q();
                C4671q3 F3 = mo19365F();
                F3.mo19272b();
                if (N.mo19311b0(t3, string, q, F3.mo19393n().getString("admob_app_id", (String) null))) {
                    mo19276j().mo19285u().mo38856a("Rechecking which service to use due to a GMP App Id change");
                    C4671q3 F4 = mo19365F();
                    F4.mo19272b();
                    Boolean q2 = F4.mo19396q();
                    SharedPreferences.Editor edit = F4.mo19393n().edit();
                    edit.clear();
                    edit.apply();
                    if (q2 != null) {
                        F4.mo19397s(q2);
                    }
                    mo19362C().mo39259p();
                    this.f21320u.mo39210Q();
                    this.f21320u.mo39209P();
                    mo19365F().f21329e.mo39076b(this.f21299G);
                    mo19365F().f21331g.mo39099b((String) null);
                }
                C4671q3 F5 = mo19365F();
                String t4 = mo19361B().mo19409t();
                F5.mo19272b();
                SharedPreferences.Editor edit2 = F5.mo19393n().edit();
                edit2.putString("gmp_app_id", t4);
                edit2.apply();
                C4671q3 F6 = mo19365F();
                String q3 = mo19361B().mo19407q();
                F6.mo19272b();
                SharedPreferences.Editor edit3 = F6.mo19393n().edit();
                edit3.putString("admob_app_id", q3);
                edit3.apply();
            }
            if (!mo19365F().mo19395p().mo43338i(C11026a.ANALYTICS_STORAGE)) {
                mo19365F().f21331g.mo39099b((String) null);
            }
            mo19367I().mo38924C(mo19365F().f21331g.mo39098a());
            C9318qc.m43515b();
            if (this.f21306g.mo19337B((String) null, C9903s2.f46685e0)) {
                try {
                    mo19372N().f21269a.f21300a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo19365F().f21344t.mo39098a())) {
                        mo19276j().mo19287w().mo38856a("Remote config removed with active feature rollouts");
                        mo19365F().f21344t.mo39099b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo19361B().mo19409t()) || !TextUtils.isEmpty(mo19361B().mo19407q())) {
                boolean n = mo19385n();
                if (!mo19365F().mo19399u() && !this.f21306g.mo19340E()) {
                    mo19365F().mo19398t(!n);
                }
                if (n) {
                    mo19367I().mo38948g0();
                }
                mo19371M().f46390d.mo38977a();
                mo19370L().mo39212S(new AtomicReference());
                mo19370L().mo39224v(mo19365F().f21347w.mo39062a());
            }
        } else if (mo19385n()) {
            if (!mo19372N().mo19307R("android.permission.INTERNET")) {
                mo19276j().mo19282q().mo38856a("App is missing INTERNET permission");
            }
            if (!mo19372N().mo19307R("android.permission.ACCESS_NETWORK_STATE")) {
                mo19276j().mo19282q().mo38856a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C6520c.m28321a(this.f21300a).mo24356g() && !this.f21306g.mo19342G()) {
                if (!C4668d9.m21489X(this.f21300a)) {
                    mo19276j().mo19282q().mo38856a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C4668d9.m21490Y(this.f21300a, false)) {
                    mo19276j().mo19282q().mo38856a("AppMeasurementService not registered/enabled");
                }
            }
            mo19276j().mo19282q().mo38856a("Uploading is not possible. App measurement disabled");
        }
        mo19365F().f21338n.mo39051a(true);
    }

    /* renamed from: m */
    public final boolean mo19384m() {
        return this.f21293A != null && this.f21293A.booleanValue();
    }

    /* renamed from: n */
    public final boolean mo19385n() {
        return mo19390x() == 0;
    }

    /* renamed from: o */
    public final boolean mo19386o() {
        mo19273e().mo19272b();
        return this.f21296D;
    }

    @Pure
    /* renamed from: p */
    public final boolean mo19387p() {
        return TextUtils.isEmpty(this.f21301b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo19388q() {
        if (this.f21323x) {
            mo19273e().mo19272b();
            Boolean bool = this.f21324y;
            if (bool == null || this.f21325z == 0 || (!bool.booleanValue() && Math.abs(this.f21313n.elapsedRealtime() - this.f21325z) > 1000)) {
                this.f21325z = this.f21313n.elapsedRealtime();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo19372N().mo19307R("android.permission.INTERNET") && mo19372N().mo19307R("android.permission.ACCESS_NETWORK_STATE") && (C6520c.m28321a(this.f21300a).mo24356g() || this.f21306g.mo19342G() || (C4668d9.m21489X(this.f21300a) && C4668d9.m21490Y(this.f21300a, false))));
                this.f21324y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo19372N().mo19300K(mo19361B().mo19409t(), mo19361B().mo19407q()) && TextUtils.isEmpty(mo19361B().mo19407q())) {
                        z = false;
                    }
                    this.f21324y = Boolean.valueOf(z);
                }
            }
            return this.f21324y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    /* renamed from: r */
    public final Context mo19277r() {
        return this.f21300a;
    }

    @Pure
    /* renamed from: s */
    public final boolean mo19389s() {
        return this.f21304e;
    }

    /* renamed from: x */
    public final int mo19390x() {
        mo19273e().mo19272b();
        if (this.f21306g.mo19340E()) {
            return 1;
        }
        Boolean bool = this.f21295C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo19273e().mo19272b();
        if (!this.f21296D) {
            return 8;
        }
        Boolean q = mo19365F().mo19396q();
        if (q == null) {
            C4669f fVar = this.f21306g;
            C9721b bVar = fVar.f21269a.f21305f;
            Boolean t = fVar.mo19353t("firebase_analytics_collection_enabled");
            if (t == null) {
                Boolean bool2 = this.f21294B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.f21293A == null || this.f21293A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (t.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (q.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    @Pure
    /* renamed from: y */
    public final C9961y1 mo19391y() {
        C9961y1 y1Var = this.f21316q;
        if (y1Var != null) {
            return y1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: z */
    public final C4669f mo19392z() {
        return this.f21306g;
    }
}
