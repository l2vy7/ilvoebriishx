package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.e2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9502e2 implements C9540i6 {

    /* renamed from: a */
    private final C9482c2 f45632a;

    private C9502e2(C9482c2 c2Var) {
        C9482c2 c2Var2 = (C9482c2) C9662w2.m44750d(c2Var, "output");
        this.f45632a = c2Var2;
        c2Var2.f45600a = this;
    }

    /* renamed from: O */
    public static C9502e2 m44188O(C9482c2 c2Var) {
        C9502e2 e2Var = c2Var.f45600a;
        if (e2Var != null) {
            return e2Var;
        }
        return new C9502e2(c2Var);
    }

    /* renamed from: A */
    public final void mo38337A(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C9570m3) {
            C9570m3 m3Var = (C9570m3) list;
            while (i2 < list.size()) {
                Object b0 = m3Var.mo38503b0(i2);
                if (b0 instanceof String) {
                    this.f45632a.mo38288m(i, (String) b0);
                } else {
                    this.f45632a.mo38283j(i, (C9552k1) b0);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38288m(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo38338B(int i, Object obj, C9664w4 w4Var) throws IOException {
        this.f45632a.mo38286l(i, (C9522g4) obj, w4Var);
    }

    /* renamed from: C */
    public final void mo38339C(int i) throws IOException {
        this.f45632a.mo38274b(i, 3);
    }

    /* renamed from: D */
    public final void mo38340D(int i, int i2) throws IOException {
        this.f45632a.mo38282i0(i, i2);
    }

    /* renamed from: E */
    public final void mo38341E(int i, int i2) throws IOException {
        this.f45632a.mo38289m0(i, i2);
    }

    /* renamed from: F */
    public final void mo38342F(int i, Object obj, C9664w4 w4Var) throws IOException {
        C9482c2 c2Var = this.f45632a;
        c2Var.mo38274b(i, 3);
        w4Var.mo38450i((C9522g4) obj, c2Var.f45600a);
        c2Var.mo38274b(i, 4);
    }

    /* renamed from: G */
    public final void mo38343G(int i, List<?> list, C9664w4 w4Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo38338B(i, list.get(i2), w4Var);
        }
    }

    /* renamed from: H */
    public final <K, V> void mo38344H(int i, C9674x3<K, V> x3Var, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f45632a.mo38274b(i, 2);
            this.f45632a.mo38269E(C9682y3.m44841a(x3Var, next.getKey(), next.getValue()));
            C9682y3.m44842b(this.f45632a, x3Var, next.getKey(), next.getValue());
        }
    }

    /* renamed from: I */
    public final void mo38345I(int i, List<?> list, C9664w4 w4Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo38342F(i, list.get(i2), w4Var);
        }
    }

    /* renamed from: J */
    public final void mo38346J(int i, int i2) throws IOException {
        this.f45632a.mo38287l0(i, i2);
    }

    /* renamed from: K */
    public final void mo38347K(int i) throws IOException {
        this.f45632a.mo38274b(i, 4);
    }

    /* renamed from: L */
    public final void mo38348L(int i, int i2) throws IOException {
        this.f45632a.mo38280h0(i, i2);
    }

    /* renamed from: M */
    public final void mo38349M(int i, C9552k1 k1Var) throws IOException {
        this.f45632a.mo38283j(i, k1Var);
    }

    /* renamed from: N */
    public final int mo38350N() {
        return C9557k6.f45726a;
    }

    /* renamed from: a */
    public final void mo38351a(int i, long j) throws IOException {
        this.f45632a.mo38281i(i, j);
    }

    /* renamed from: b */
    public final void mo38352b(int i, String str) throws IOException {
        this.f45632a.mo38288m(i, str);
    }

    /* renamed from: c */
    public final void mo38353c(int i, long j) throws IOException {
        this.f45632a.mo38273U(i, j);
    }

    /* renamed from: d */
    public final void mo38354d(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44086k0(list.get(i4).booleanValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38284j0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38290n(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo38355e(int i, int i2) throws IOException {
        this.f45632a.mo38280h0(i, i2);
    }

    /* renamed from: f */
    public final void mo38356f(int i, long j) throws IOException {
        this.f45632a.mo38264A(i, j);
    }

    /* renamed from: g */
    public final void mo38357g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44062I(list.get(i4).intValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38268D(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38280h0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo38358h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44067N(list.get(i4).intValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38268D(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38280h0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo38359i(int i, long j) throws IOException {
        this.f45632a.mo38273U(i, j);
    }

    /* renamed from: j */
    public final void mo38360j(int i, Object obj) throws IOException {
        if (obj instanceof C9552k1) {
            this.f45632a.mo38266B(i, (C9552k1) obj);
        } else {
            this.f45632a.mo38285k(i, (C9522g4) obj);
        }
    }

    /* renamed from: k */
    public final void mo38361k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44103y0(list.get(i4).longValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38294u0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38281i(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo38362l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44060E0(list.get(i4).longValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38296x0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38273U(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo38363m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44065L(list.get(i4).intValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38271G(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38289m0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo38364n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44063J(list.get(i4).intValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38269E(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38282i0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo38365o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44066M(list.get(i4).intValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38271G(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38289m0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo38366p(int i, double d) throws IOException {
        this.f45632a.mo38278g(i, d);
    }

    /* renamed from: q */
    public final void mo38367q(int i, float f) throws IOException {
        this.f45632a.mo38279h(i, f);
    }

    /* renamed from: r */
    public final void mo38368r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44059D0(list.get(i4).longValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38296x0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38273U(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo38369s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44057B0(list.get(i4).longValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38295w0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38264A(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo38370t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44105z0(list.get(i4).longValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38294u0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38281i(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo38371u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44064K(list.get(i4).intValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38270F(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38287l0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo38372v(int i, boolean z) throws IOException {
        this.f45632a.mo38290n(i, z);
    }

    /* renamed from: w */
    public final void mo38373w(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44092r(list.get(i4).doubleValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38277f(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38278g(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo38374x(int i, List<C9552k1> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f45632a.mo38283j(i, list.get(i2));
        }
    }

    /* renamed from: y */
    public final void mo38375y(int i, int i2) throws IOException {
        this.f45632a.mo38289m0(i, i2);
    }

    /* renamed from: z */
    public final void mo38376z(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f45632a.mo38274b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C9482c2.m44099v0(list.get(i4).floatValue());
            }
            this.f45632a.mo38269E(i3);
            while (i2 < list.size()) {
                this.f45632a.mo38293t0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f45632a.mo38279h(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void zza(int i, long j) throws IOException {
        this.f45632a.mo38281i(i, j);
    }
}
