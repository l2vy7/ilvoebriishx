package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.o0 */
final class C8966o0 implements C8977p4 {

    /* renamed from: a */
    private final C8947m0 f44675a;

    private C8966o0(C8947m0 m0Var) {
        C8947m0 m0Var2 = (C8947m0) C8910h1.m41836e(m0Var, "output");
        this.f44675a = m0Var2;
        m0Var2.f44611a = this;
    }

    /* renamed from: e */
    public static C8966o0 m42113e(C8947m0 m0Var) {
        C8966o0 o0Var = m0Var.f44611a;
        return o0Var != null ? o0Var : new C8966o0(m0Var);
    }

    /* renamed from: A */
    public final void mo37053A(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C9009u1) {
            C9009u1 u1Var = (C9009u1) list;
            while (i2 < list.size()) {
                Object u0 = u1Var.mo37169u0(i2);
                if (u0 instanceof String) {
                    this.f44675a.mo37027p(i, (String) u0);
                } else {
                    this.f44675a.mo37023m(i, (C8847a0) u0);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37027p(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo37054B(int i, List<?> list, C8870c3 c3Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo37064L(i, list.get(i2), c3Var);
        }
    }

    /* renamed from: C */
    public final void mo37055C(int i, boolean z) throws IOException {
        this.f44675a.mo37005K(i, z);
    }

    /* renamed from: D */
    public final void mo37056D(int i, List<?> list, C8870c3 c3Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo37062J(i, list.get(i2), c3Var);
        }
    }

    /* renamed from: E */
    public final void mo37057E(int i, int i2) throws IOException {
        this.f44675a.mo37008T(i, i2);
    }

    /* renamed from: F */
    public final void mo37058F(int i) throws IOException {
        this.f44675a.mo37001G(i, 4);
    }

    /* renamed from: G */
    public final void mo37059G(int i, int i2) throws IOException {
        this.f44675a.mo37008T(i, i2);
    }

    /* renamed from: H */
    public final void mo37060H(int i, C8847a0 a0Var) throws IOException {
        this.f44675a.mo37023m(i, a0Var);
    }

    /* renamed from: I */
    public final void mo37061I(int i, int i2) throws IOException {
        this.f44675a.mo37019i0(i, i2);
    }

    /* renamed from: J */
    public final void mo37062J(int i, Object obj, C8870c3 c3Var) throws IOException {
        this.f44675a.mo37026o(i, (C8942l2) obj, c3Var);
    }

    /* renamed from: K */
    public final void mo37063K(int i) throws IOException {
        this.f44675a.mo37001G(i, 3);
    }

    /* renamed from: L */
    public final void mo37064L(int i, Object obj, C8870c3 c3Var) throws IOException {
        C8947m0 m0Var = this.f44675a;
        m0Var.mo37001G(i, 3);
        c3Var.mo36864g((C8942l2) obj, m0Var.f44611a);
        m0Var.mo37001G(i, 4);
    }

    /* renamed from: M */
    public final <K, V> void mo37065M(int i, C8886e2<K, V> e2Var, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f44675a.mo37001G(i, 2);
            this.f44675a.mo37034y0(C8879d2.m41665a(e2Var, next.getKey(), next.getValue()));
            C8879d2.m41666b(this.f44675a, e2Var, next.getKey(), next.getValue());
        }
    }

    /* renamed from: N */
    public final void mo37066N(int i, int i2) throws IOException {
        this.f44675a.mo37012b0(i, i2);
    }

    /* renamed from: O */
    public final void mo37067O(int i, int i2) throws IOException {
        this.f44675a.mo37015f0(i, i2);
    }

    /* renamed from: a */
    public final void mo37068a(int i, long j) throws IOException {
        this.f44675a.mo37022l(i, j);
    }

    /* renamed from: b */
    public final void mo37069b(int i, String str) throws IOException {
        this.f44675a.mo37027p(i, str);
    }

    /* renamed from: c */
    public final void mo37070c(int i, long j) throws IOException {
        this.f44675a.mo37009U(i, j);
    }

    /* renamed from: d */
    public final void mo37071d(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41935F(list.get(i4).booleanValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37031t(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37005K(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo37072f(int i, long j) throws IOException {
        this.f44675a.mo37002H(i, j);
    }

    /* renamed from: g */
    public final void mo37073g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41930C0(list.get(i4).intValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37033x0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37008T(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo37074h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41938H0(list.get(i4).intValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37033x0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37008T(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo37075i(int i, long j) throws IOException {
        this.f44675a.mo37009U(i, j);
    }

    /* renamed from: j */
    public final void mo37076j(int i, Object obj) throws IOException {
        if (obj instanceof C8847a0) {
            this.f44675a.mo37003I(i, (C8847a0) obj);
        } else {
            this.f44675a.mo37004J(i, (C8942l2) obj);
        }
    }

    /* renamed from: k */
    public final void mo37077k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41955e0(list.get(i4).longValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37006L(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37022l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo37078l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41967s0(list.get(i4).longValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37014c0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37009U(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo37079m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41936F0(list.get(i4).intValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37000A0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37019i0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo37080n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41932D0(list.get(i4).intValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37034y0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37012b0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo37081o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41937G0(list.get(i4).intValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37000A0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37019i0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo37082p(int i, double d) throws IOException {
        this.f44675a.mo37020j(i, d);
    }

    /* renamed from: q */
    public final void mo37083q(int i, float f) throws IOException {
        this.f44675a.mo37021k(i, f);
    }

    /* renamed from: r */
    public final void mo37084r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41964p0(list.get(i4).longValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37014c0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37009U(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo37085s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41961l0(list.get(i4).longValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37010V(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37002H(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo37086t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41958h0(list.get(i4).longValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37006L(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37022l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo37087u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41934E0(list.get(i4).intValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37035z0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37015f0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final int mo37088v() {
        return C8891f1.C8896e.f44529l;
    }

    /* renamed from: w */
    public final void mo37089w(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41972w(list.get(i4).doubleValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37017h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37020j(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo37090x(int i, List<C8847a0> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f44675a.mo37023m(i, list.get(i2));
        }
    }

    /* renamed from: y */
    public final void mo37091y(int i, int i2) throws IOException {
        this.f44675a.mo37019i0(i, i2);
    }

    /* renamed from: z */
    public final void mo37092z(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f44675a.mo37001G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8947m0.m41974x(list.get(i4).floatValue());
            }
            this.f44675a.mo37034y0(i3);
            while (i2 < list.size()) {
                this.f44675a.mo37018i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f44675a.mo37021k(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void zza(int i, long j) throws IOException {
        this.f44675a.mo37022l(i, j);
    }
}
