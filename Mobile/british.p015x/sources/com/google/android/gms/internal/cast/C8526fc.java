package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.fc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8526fc {

    /* renamed from: a */
    private final C8509ec f43472a;

    private C8526fc(C8509ec ecVar) {
        C8443ad.m40690b(ecVar, "output");
        this.f43472a = ecVar;
        ecVar.f43444a = this;
    }

    /* renamed from: j */
    public static C8526fc m40863j(C8509ec ecVar) {
        C8526fc fcVar = ecVar.f43444a;
        return fcVar != null ? fcVar : new C8526fc(ecVar);
    }

    /* renamed from: A */
    public final void mo36489A(int i, Object obj, C8561he heVar) throws IOException {
        C8782vd vdVar = (C8782vd) obj;
        C8476cc ccVar = (C8476cc) this.f43472a;
        ccVar.mo36410r((i << 3) | 2);
        C8608kb kbVar = (C8608kb) vdVar;
        int b = kbVar.mo36567b();
        if (b == -1) {
            b = heVar.mo36372c(kbVar);
            kbVar.mo36568c(b);
        }
        ccVar.mo36410r(b);
        heVar.mo36374e(vdVar, ccVar.f43444a);
    }

    /* renamed from: B */
    public final void mo36490B(int i, Object obj, C8561he heVar) throws IOException {
        C8509ec ecVar = this.f43472a;
        ecVar.mo36399g(i, 3);
        heVar.mo36374e((C8782vd) obj, ecVar.f43444a);
        ecVar.mo36399g(i, 4);
    }

    /* renamed from: C */
    public final void mo36491C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8509ec.m40807z(list.get(i4).intValue());
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36409q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36400h(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: D */
    public final void mo36492D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36411s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36402j(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo36493E(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8509ec.m40798B(list.get(i4).longValue());
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36412t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36403k(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo36494F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8509ec.m40798B(list.get(i4).longValue());
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36412t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36403k(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo36495G(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36413u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36404l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo36496H(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36411s(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36402j(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo36497I(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36413u(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36404l(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo36498a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8509ec.m40807z(list.get(i4).intValue());
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36409q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36400h(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo36499b(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36408p(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36405m(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo36500c(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C8527fd) {
            C8527fd fdVar = (C8527fd) list;
            while (i2 < list.size()) {
                Object l = fdVar.mo36387l(i2);
                if (l instanceof String) {
                    this.f43472a.mo36406n(i, (String) l);
                } else {
                    this.f43472a.mo36407o(i, (C8796wb) l);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36406n(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo36501d(int i, List<C8796wb> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f43472a.mo36407o(i, list.get(i2));
        }
    }

    /* renamed from: e */
    public final void mo36502e(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8509ec.m40797A(list.get(i4).intValue());
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36410r(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36401i(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo36503f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36411s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36402j(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo36504g(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                this.f43472a.mo36413u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f43472a.mo36404l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo36505h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += C8509ec.m40797A((intValue >> 31) ^ (intValue + intValue));
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                C8509ec ecVar = this.f43472a;
                int intValue2 = list.get(i2).intValue();
                ecVar.mo36410r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C8509ec ecVar2 = this.f43472a;
            int intValue3 = list.get(i2).intValue();
            ecVar2.mo36401i(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo36506i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f43472a.mo36399g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += C8509ec.m40798B((longValue >> 63) ^ (longValue + longValue));
            }
            this.f43472a.mo36410r(i3);
            while (i2 < list.size()) {
                C8509ec ecVar = this.f43472a;
                long longValue2 = list.get(i2).longValue();
                ecVar.mo36412t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C8509ec ecVar2 = this.f43472a;
            long longValue3 = list.get(i2).longValue();
            ecVar2.mo36403k(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo36507k(int i, int i2) throws IOException {
        this.f43472a.mo36402j(i, i2);
    }

    /* renamed from: l */
    public final void mo36508l(int i, long j) throws IOException {
        this.f43472a.mo36403k(i, j);
    }

    /* renamed from: m */
    public final void mo36509m(int i, long j) throws IOException {
        this.f43472a.mo36404l(i, j);
    }

    /* renamed from: n */
    public final void mo36510n(int i, float f) throws IOException {
        this.f43472a.mo36402j(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: o */
    public final void mo36511o(int i, double d) throws IOException {
        this.f43472a.mo36404l(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: p */
    public final void mo36512p(int i, int i2) throws IOException {
        this.f43472a.mo36400h(i, i2);
    }

    /* renamed from: q */
    public final void mo36513q(int i, long j) throws IOException {
        this.f43472a.mo36403k(i, j);
    }

    /* renamed from: r */
    public final void mo36514r(int i, int i2) throws IOException {
        this.f43472a.mo36400h(i, i2);
    }

    /* renamed from: s */
    public final void mo36515s(int i, long j) throws IOException {
        this.f43472a.mo36404l(i, j);
    }

    /* renamed from: t */
    public final void mo36516t(int i, int i2) throws IOException {
        this.f43472a.mo36402j(i, i2);
    }

    /* renamed from: u */
    public final void mo36517u(int i, boolean z) throws IOException {
        this.f43472a.mo36405m(i, z);
    }

    /* renamed from: v */
    public final void mo36518v(int i, String str) throws IOException {
        this.f43472a.mo36406n(i, str);
    }

    /* renamed from: w */
    public final void mo36519w(int i, C8796wb wbVar) throws IOException {
        this.f43472a.mo36407o(i, wbVar);
    }

    /* renamed from: x */
    public final void mo36520x(int i, int i2) throws IOException {
        this.f43472a.mo36401i(i, i2);
    }

    /* renamed from: y */
    public final void mo36521y(int i, int i2) throws IOException {
        this.f43472a.mo36401i(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: z */
    public final void mo36522z(int i, long j) throws IOException {
        this.f43472a.mo36403k(i, (j >> 63) ^ (j + j));
    }
}
