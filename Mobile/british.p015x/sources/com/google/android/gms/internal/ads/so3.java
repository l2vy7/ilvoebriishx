package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class so3 {

    /* renamed from: a */
    private final ro3 f39023a;

    private so3(ro3 ro3) {
        up3.m38380f(ro3, "output");
        this.f39023a = ro3;
        ro3.f38748a = this;
    }

    /* renamed from: l */
    public static so3 m37467l(ro3 ro3) {
        so3 so3 = ro3.f38748a;
        return so3 != null ? so3 : new so3(ro3);
    }

    /* renamed from: A */
    public final void mo34733A(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33966l(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33965k(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo34734B(int i, Object obj, or3 or3) throws IOException {
        ro3 ro3 = this.f39023a;
        ro3.mo33973s(i, 3);
        or3.mo34000f((uq3) obj, ro3.f38748a);
        ro3.mo33973s(i, 4);
    }

    /* renamed from: C */
    public final void mo34735C(int i, int i2) throws IOException {
        this.f39023a.mo33969o(i, i2);
    }

    /* renamed from: D */
    public final void mo34736D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ro3.m37157z(list.get(i4).intValue());
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33970p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33969o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo34737E(int i, long j) throws IOException {
        this.f39023a.mo33976v(i, j);
    }

    /* renamed from: F */
    public final void mo34738F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ro3.m37152b(list.get(i4).longValue());
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33977w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33976v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo34739G(int i, Object obj, or3 or3) throws IOException {
        uq3 uq3 = (uq3) obj;
        oo3 oo3 = (oo3) this.f39023a;
        oo3.mo33975u((i << 3) | 2);
        ln3 ln3 = (ln3) uq3;
        int e = ln3.mo33139e();
        if (e == -1) {
            e = or3.zza(ln3);
            ln3.mo33144j(e);
        }
        oo3.mo33975u(e);
        or3.mo34000f(uq3, oo3.f38748a);
    }

    /* renamed from: H */
    public final void mo34740H(int i, int i2) throws IOException {
        this.f39023a.mo33965k(i, i2);
    }

    /* renamed from: I */
    public final void mo34741I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33966l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33965k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo34742J(int i, long j) throws IOException {
        this.f39023a.mo33967m(i, j);
    }

    /* renamed from: K */
    public final void mo34743K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33968n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33967m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo34744a(int i, int i2) throws IOException {
        this.f39023a.mo33974t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo34745b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += ro3.m37151a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                ro3 ro3 = this.f39023a;
                int intValue2 = list.get(i2).intValue();
                ro3.mo33975u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            ro3 ro32 = this.f39023a;
            int intValue3 = list.get(i2).intValue();
            ro32.mo33974t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo34746c(int i, long j) throws IOException {
        this.f39023a.mo33976v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo34747d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += ro3.m37152b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                ro3 ro3 = this.f39023a;
                long longValue2 = list.get(i2).longValue();
                ro3.mo33977w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            ro3 ro32 = this.f39023a;
            long longValue3 = list.get(i2).longValue();
            ro32.mo33976v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo34748e(int i) throws IOException {
        this.f39023a.mo33973s(i, 3);
    }

    /* renamed from: f */
    public final void mo34749f(int i, String str) throws IOException {
        this.f39023a.mo33972r(i, str);
    }

    /* renamed from: g */
    public final void mo34750g(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof cq3) {
            cq3 cq3 = (cq3) list;
            while (i2 < list.size()) {
                Object zzf = cq3.zzf(i2);
                if (zzf instanceof String) {
                    this.f39023a.mo33972r(i, (String) zzf);
                } else {
                    this.f39023a.mo33964j(i, (eo3) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33972r(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo34751h(int i, int i2) throws IOException {
        this.f39023a.mo33974t(i, i2);
    }

    /* renamed from: i */
    public final void mo34752i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ro3.m37151a(list.get(i4).intValue());
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33975u(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33974t(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo34753j(int i, long j) throws IOException {
        this.f39023a.mo33976v(i, j);
    }

    /* renamed from: k */
    public final void mo34754k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ro3.m37152b(list.get(i4).longValue());
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33977w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33976v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo34755m(int i, boolean z) throws IOException {
        this.f39023a.mo33963i(i, z);
    }

    /* renamed from: n */
    public final void mo34756n(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33962h(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33963i(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo34757o(int i, eo3 eo3) throws IOException {
        this.f39023a.mo33964j(i, eo3);
    }

    /* renamed from: p */
    public final void mo34758p(int i, List<eo3> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f39023a.mo33964j(i, list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo34759q(int i, double d) throws IOException {
        this.f39023a.mo33967m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo34760r(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33968n(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33967m(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo34761s(int i) throws IOException {
        this.f39023a.mo33973s(i, 4);
    }

    /* renamed from: t */
    public final void mo34762t(int i, int i2) throws IOException {
        this.f39023a.mo33969o(i, i2);
    }

    /* renamed from: u */
    public final void mo34763u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ro3.m37157z(list.get(i4).intValue());
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33970p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33969o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo34764v(int i, int i2) throws IOException {
        this.f39023a.mo33965k(i, i2);
    }

    /* renamed from: w */
    public final void mo34765w(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33966l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33965k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo34766x(int i, long j) throws IOException {
        this.f39023a.mo33967m(i, j);
    }

    /* renamed from: y */
    public final void mo34767y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f39023a.mo33973s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f39023a.mo33975u(i3);
            while (i2 < list.size()) {
                this.f39023a.mo33968n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f39023a.mo33967m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo34768z(int i, float f) throws IOException {
        this.f39023a.mo33965k(i, Float.floatToRawIntBits(f));
    }
}
