package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9128e4;
import com.google.android.gms.internal.measurement.C9143f4;
import com.google.android.gms.internal.measurement.C9159g4;
import com.google.android.gms.internal.measurement.C9174h4;
import com.google.android.gms.internal.measurement.C9189i4;
import com.google.android.gms.internal.measurement.C9204j4;
import com.google.android.gms.internal.measurement.C9249m4;
import com.google.android.gms.internal.measurement.C9265n4;
import com.google.android.gms.internal.measurement.C9280o4;
import com.google.android.gms.internal.measurement.C9296p4;
import com.google.android.gms.internal.measurement.C9311q4;
import com.google.android.gms.internal.measurement.C9358t4;
import com.google.android.gms.internal.measurement.C9435y4;
import com.google.android.gms.internal.measurement.C9449z4;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p256u5.C11026a;
import p256u5.C11027b;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9934v4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzau f46801a;

    /* renamed from: b */
    final /* synthetic */ String f46802b;

    /* renamed from: c */
    final /* synthetic */ C9716a5 f46803c;

    C9934v4(C9716a5 a5Var, zzau zzau, String str) {
        this.f46803c = a5Var;
        this.f46801a = zzau;
        this.f46802b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        C9958x8 x8Var;
        C9730b9 b9Var;
        Bundle bundle;
        C9249m4 m4Var;
        C9280o4 o4Var;
        String str;
        Object obj;
        C9885q4 q4Var;
        long j;
        C9859o oVar;
        this.f46803c.f46149b.mo39285a();
        C9833l6 c0 = this.f46803c.f46149b.mo39289c0();
        zzau zzau = this.f46801a;
        String str2 = this.f46802b;
        c0.mo19272b();
        C4670h4.m21579t();
        C4604n.m20098k(zzau);
        C4604n.m20094g(str2);
        if (!c0.f21269a.mo19392z().mo19337B(str2, C9903s2.f46670U)) {
            c0.f21269a.mo19276j().mo19281p().mo38857b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzau.f46937b) || "_iapx".equals(zzau.f46937b)) {
            C9249m4 z = C9265n4.m43236z();
            c0.f46518b.mo39280V().mo39001e0();
            C9885q4 R = c0.f46518b.mo39280V().mo38989R(str2);
            if (R == null) {
                c0.f21269a.mo19276j().mo19281p().mo38857b("Log and bundle not available. package_name", str2);
                bArr = new byte[0];
                x8Var = c0.f46518b;
            } else if (!R.mo39115I()) {
                c0.f21269a.mo19276j().mo19281p().mo38857b("Log and bundle disabled. package_name", str2);
                bArr = new byte[0];
                x8Var = c0.f46518b;
            } else {
                C9280o4 H1 = C9296p4.m43369H1();
                H1.mo37812e0(1);
                H1.mo37808a0(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                if (!TextUtils.isEmpty(R.mo39138c0())) {
                    H1.mo37769B(R.mo39138c0());
                }
                if (!TextUtils.isEmpty(R.mo39142e0())) {
                    H1.mo37777H((String) C4604n.m20098k(R.mo39142e0()));
                }
                if (!TextUtils.isEmpty(R.mo39144f0())) {
                    H1.mo37779I((String) C4604n.m20098k(R.mo39144f0()));
                }
                if (R.mo39117K() != -2147483648L) {
                    H1.mo37781J((int) R.mo39117K());
                }
                H1.mo37804W(R.mo39128V());
                H1.mo37797R(R.mo39126T());
                String h0 = R.mo39148h0();
                String a0 = R.mo39134a0();
                if (!TextUtils.isEmpty(h0)) {
                    H1.mo37803V(h0);
                } else if (!TextUtils.isEmpty(a0)) {
                    H1.mo37798R0(a0);
                }
                C11027b U = c0.f46518b.mo39279U(str2);
                H1.mo37791O(R.mo39125S());
                if (c0.f21269a.mo19385n() && c0.f21269a.mo19392z().mo19338C(H1.mo37824q0()) && U.mo43338i(C11026a.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                    H1.mo37795Q((String) null);
                }
                H1.mo37789N(U.mo43336h());
                if (U.mo43338i(C11026a.AD_STORAGE)) {
                    Pair m = c0.f46518b.mo39291d0().mo39247m(R.mo39138c0(), U);
                    if (R.mo39114H() && !TextUtils.isEmpty((CharSequence) m.first)) {
                        try {
                            H1.mo37814g0(C9833l6.m45212c((String) m.first, Long.toString(zzau.f46940e)));
                            Object obj2 = m.second;
                            if (obj2 != null) {
                                H1.mo37806Y(((Boolean) obj2).booleanValue());
                            }
                        } catch (SecurityException e) {
                            c0.f21269a.mo19276j().mo19281p().mo38857b("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            x8Var = c0.f46518b;
                        } catch (Throwable th) {
                            c0.f46518b.mo39280V().mo39002f0();
                            throw th;
                        }
                    }
                }
                c0.f21269a.mo19360A().mo38880i();
                H1.mo37793P(Build.MODEL);
                c0.f21269a.mo19360A().mo38880i();
                H1.mo37807Z(Build.VERSION.RELEASE);
                H1.mo37818k0((int) c0.f21269a.mo19360A().mo39058o());
                H1.mo37822o0(c0.f21269a.mo19360A().mo39059p());
                try {
                    if (U.mo43338i(C11026a.ANALYTICS_STORAGE) && R.mo39140d0() != null) {
                        H1.mo37771C(C9833l6.m45212c((String) C4604n.m20098k(R.mo39140d0()), Long.toString(zzau.f46940e)));
                    }
                    if (!TextUtils.isEmpty(R.mo39146g0())) {
                        H1.mo37802U((String) C4604n.m20098k(R.mo39146g0()));
                    }
                    String c02 = R.mo39138c0();
                    List c03 = c0.f46518b.mo39280V().mo38999c0(c02);
                    Iterator it = c03.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            b9Var = null;
                            break;
                        }
                        b9Var = (C9730b9) it.next();
                        if ("_lte".equals(b9Var.f46186c)) {
                            break;
                        }
                    }
                    if (b9Var == null || b9Var.f46188e == null) {
                        C9730b9 b9Var2 = new C9730b9(c02, TtmlNode.TEXT_EMPHASIS_AUTO, "_lte", c0.f21269a.mo19274f().currentTimeMillis(), 0L);
                        c03.add(b9Var2);
                        c0.f46518b.mo39280V().mo39016x(b9Var2);
                    }
                    C9978z8 f0 = c0.f46518b.mo39292f0();
                    f0.f21269a.mo19276j().mo19286v().mo38856a("Checking account type status for ad personalization signals");
                    if (f0.f21269a.mo19360A().mo39061s()) {
                        String c04 = R.mo39138c0();
                        C4604n.m20098k(c04);
                        if (R.mo39114H() && f0.f46518b.mo39284Z().mo38867t(c04)) {
                            f0.f21269a.mo19276j().mo19281p().mo38856a("Turning off ad personalization due to account type");
                            Iterator it2 = c03.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(((C9730b9) it2.next()).f46186c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            c03.add(new C9730b9(c04, TtmlNode.TEXT_EMPHASIS_AUTO, "_npa", f0.f21269a.mo19274f().currentTimeMillis(), 1L));
                        }
                    }
                    C9449z4[] z4VarArr = new C9449z4[c03.size()];
                    for (int i = 0; i < c03.size(); i++) {
                        C9435y4 C = C9449z4.m43918C();
                        C.mo38190K(((C9730b9) c03.get(i)).f46186c);
                        C.mo38191L(((C9730b9) c03.get(i)).f46187d);
                        c0.f46518b.mo39292f0().mo39348K(C, ((C9730b9) c03.get(i)).f46188e);
                        z4VarArr[i] = (C9449z4) C.mo37840w();
                    }
                    H1.mo37770B0(Arrays.asList(z4VarArr));
                    C9755e3 b = C9755e3.m45043b(zzau);
                    c0.f21269a.mo19372N().mo19334y(b.f46229d, c0.f46518b.mo39280V().mo38988Q(str2));
                    c0.f21269a.mo19372N().mo19335z(b, c0.f21269a.mo19392z().mo19347m(str2));
                    Bundle bundle2 = b.f46229d;
                    bundle2.putLong("_c", 1);
                    c0.f21269a.mo19276j().mo19281p().mo38856a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", zzau.f46939d);
                    if (c0.f21269a.mo19372N().mo19308S(H1.mo37824q0())) {
                        c0.f21269a.mo19372N().mo19291B(bundle2, "_dbg", 1L);
                        c0.f21269a.mo19372N().mo19291B(bundle2, "_r", 1L);
                    }
                    C9859o V = c0.f46518b.mo39280V().mo38993V(str2, zzau.f46937b);
                    if (V == null) {
                        o4Var = H1;
                        q4Var = R;
                        m4Var = z;
                        str = str2;
                        bundle = bundle2;
                        obj = null;
                        oVar = new C9859o(str2, zzau.f46937b, 0, 0, 0, zzau.f46940e, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        q4Var = R;
                        m4Var = z;
                        str = str2;
                        bundle = bundle2;
                        o4Var = H1;
                        obj = null;
                        long j2 = V.f46530f;
                        oVar = V.mo39083c(zzau.f46940e);
                        j = j2;
                    }
                    c0.f46518b.mo39280V().mo39009p(oVar);
                    C9848n nVar = new C9848n(c0.f21269a, zzau.f46939d, str, zzau.f46937b, zzau.f46940e, j, bundle);
                    C9128e4 D = C9143f4.m42844D();
                    D.mo37533R(nVar.f46487d);
                    D.mo37529N(nVar.f46485b);
                    D.mo37532Q(nVar.f46488e);
                    C9870p pVar = new C9870p(nVar.f46489f);
                    while (pVar.hasNext()) {
                        String a = pVar.next();
                        C9189i4 D2 = C9204j4.m43050D();
                        D2.mo37641O(a);
                        Object G0 = nVar.f46489f.mo39358G0(a);
                        if (G0 != null) {
                            c0.f46518b.mo39292f0().mo39347J(D2, G0);
                            D.mo37525J(D2);
                        }
                    }
                    C9280o4 o4Var2 = o4Var;
                    o4Var2.mo37772C0(D);
                    C9311q4 z2 = C9358t4.m43651z();
                    C9159g4 z3 = C9174h4.m42983z();
                    z3.mo37592B(oVar.f46527c);
                    z3.mo37593C(zzau.f46937b);
                    z2.mo37953B(z3);
                    o4Var2.mo37809b0(z2);
                    o4Var2.mo37832y0(c0.f46518b.mo39277S().mo39104l(q4Var.mo39138c0(), Collections.emptyList(), o4Var2.mo37827t0(), Long.valueOf(D.mo37523H()), Long.valueOf(D.mo37523H())));
                    if (D.mo37537V()) {
                        o4Var2.mo37817j0(D.mo37523H());
                        o4Var2.mo37799S(D.mo37523H());
                    }
                    long W = q4Var.mo39129W();
                    if (W != 0) {
                        o4Var2.mo37810c0(W);
                    }
                    long Y = q4Var.mo39131Y();
                    if (Y != 0) {
                        o4Var2.mo37811d0(Y);
                    } else if (W != 0) {
                        o4Var2.mo37811d0(W);
                    }
                    q4Var.mo39139d();
                    o4Var2.mo37783K((int) q4Var.mo39130X());
                    c0.f21269a.mo19392z().mo19350p();
                    o4Var2.mo37820m0(55005);
                    o4Var2.mo37819l0(c0.f21269a.mo19274f().currentTimeMillis());
                    o4Var2.mo37816i0(true);
                    C9249m4 m4Var2 = m4Var;
                    m4Var2.mo37726B(o4Var2);
                    C9885q4 q4Var2 = q4Var;
                    q4Var2.mo39109C(o4Var2.mo37830w0());
                    q4Var2.mo39167z(o4Var2.mo37829v0());
                    c0.f46518b.mo39280V().mo39008o(q4Var2);
                    c0.f46518b.mo39280V().mo39007n();
                    c0.f46518b.mo39280V().mo39002f0();
                    try {
                        return c0.f46518b.mo39292f0().mo39350O(((C9265n4) m4Var2.mo37840w()).mo37404l());
                    } catch (IOException e2) {
                        c0.f21269a.mo19276j().mo19282q().mo38858c("Data loss. Failed to bundle and serialize. appId", C4667d3.m21474z(str), e2);
                        return obj;
                    }
                } catch (SecurityException e3) {
                    c0.f21269a.mo19276j().mo19281p().mo38857b("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    x8Var = c0.f46518b;
                }
            }
            x8Var.mo39280V().mo39002f0();
            return bArr;
        } else {
            c0.f21269a.mo19276j().mo19281p().mo38858c("Generating a payload for this event is not available. package_name, event_name", str2, zzau.f46937b);
            return null;
        }
    }
}
