package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tn */
/* compiled from: IMASDK */
final class C4372tn implements C4370tl {

    /* renamed from: a */
    private final long f18826a;

    /* renamed from: b */
    private final int f18827b;

    /* renamed from: c */
    private final long f18828c;

    /* renamed from: d */
    private final long f18829d;

    /* renamed from: e */
    private final long f18830e;

    /* renamed from: f */
    private final long[] f18831f;

    private C4372tn(long j, int i, long j2, long j3, long[] jArr) {
        this.f18826a = j;
        this.f18827b = i;
        this.f18828c = j2;
        this.f18831f = jArr;
        this.f18829d = j3;
        this.f18830e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: f */
    public static C4372tn m18992f(long j, long j2, C4255pe peVar, alw alw) {
        int C;
        long j3 = j;
        C4255pe peVar2 = peVar;
        int i = peVar2.f18316g;
        int i2 = peVar2.f18313d;
        int w = alw.mo13965w();
        if ((w & 1) != 1 || (C = alw.mo13934C()) == 0) {
            return null;
        }
        long M = amm.m14196M((long) C, ((long) i) * 1000000, (long) i2);
        if ((w & 6) != 6) {
            return new C4372tn(j2, peVar2.f18312c, M, -1, (long[]) null);
        }
        long u = alw.mo13963u();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) alw.mo13957o();
        }
        if (j3 != -1) {
            long j4 = j2 + u;
            if (j3 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j3);
                sb.append(", ");
                sb.append(j4);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new C4372tn(j2, peVar2.f18312c, M, u, jArr);
    }

    /* renamed from: g */
    private final long m18993g(int i) {
        return (this.f18828c * ((long) i)) / 100;
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return this.f18831f != null;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        double d;
        if (!mo16580a()) {
            C4325ru ruVar = new C4325ru(0, this.f18826a + ((long) this.f18827b));
            return new C4322rr(ruVar, ruVar);
        }
        long I = amm.m14192I(j, 0, this.f18828c);
        double d2 = (double) I;
        Double.isNaN(d2);
        double d3 = (double) this.f18828c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d4;
                long[] jArr = (long[]) aup.m14889t(this.f18831f);
                double d6 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                double d7 = (double) i;
                Double.isNaN(d7);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d4 - d7) * (d - d6));
            }
        }
        double d8 = (double) this.f18829d;
        Double.isNaN(d8);
        C4325ru ruVar2 = new C4325ru(I, this.f18826a + amm.m14192I(Math.round((d5 / 256.0d) * d8), (long) this.f18827b, this.f18829d - 1));
        return new C4322rr(ruVar2, ruVar2);
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f18828c;
    }

    /* renamed from: d */
    public final long mo16621d(long j) {
        long j2;
        double d;
        long j3 = j - this.f18826a;
        if (!mo16580a() || j3 <= ((long) this.f18827b)) {
            return 0;
        }
        long[] jArr = (long[]) aup.m14889t(this.f18831f);
        double d2 = (double) j3;
        Double.isNaN(d2);
        double d3 = (double) this.f18829d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int am = amm.m14223am(jArr, (long) d4, true);
        long g = m18993g(am);
        long j4 = jArr[am];
        int i = am + 1;
        long g2 = m18993g(i);
        if (am == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d5 = (double) j4;
            Double.isNaN(d5);
            double d6 = (double) (j2 - j4);
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = (double) (g2 - g);
        Double.isNaN(d7);
        return g + Math.round(d * d7);
    }

    /* renamed from: e */
    public final long mo16622e() {
        return this.f18830e;
    }
}
