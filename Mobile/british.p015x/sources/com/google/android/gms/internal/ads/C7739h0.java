package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.h0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7739h0 implements C7666f0 {

    /* renamed from: a */
    private final long f32540a;

    /* renamed from: b */
    private final int f32541b;

    /* renamed from: c */
    private final long f32542c;

    /* renamed from: d */
    private final long f32543d;

    /* renamed from: e */
    private final long f32544e;

    /* renamed from: f */
    private final long[] f32545f;

    private C7739h0(long j, int i, long j2, long j3, long[] jArr) {
        this.f32540a = j;
        this.f32541b = i;
        this.f32542c = j2;
        this.f32545f = jArr;
        this.f32543d = j3;
        this.f32544e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: a */
    public static C7739h0 m32757a(long j, long j2, qc4 qc4, uq2 uq2) {
        int v;
        long j3 = j;
        qc4 qc42 = qc4;
        int i = qc42.f37980g;
        int i2 = qc42.f37977d;
        int m = uq2.mo35243m();
        if ((m & 1) != 1 || (v = uq2.mo35252v()) == 0) {
            return null;
        }
        long Z = d13.m20295Z((long) v, ((long) i) * 1000000, (long) i2);
        if ((m & 6) != 6) {
            return new C7739h0(j2, qc42.f37976c, Z, -1, (long[]) null);
        }
        long A = uq2.mo35223A();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) uq2.mo35249s();
        }
        if (j3 != -1) {
            long j4 = j2 + A;
            if (j3 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j3);
                sb.append(", ");
                sb.append(j4);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new C7739h0(j2, qc42.f37976c, Z, A, jArr);
    }

    /* renamed from: c */
    private final long m32758c(int i) {
        return (this.f32542c * ((long) i)) / 100;
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        double d;
        if (!zzh()) {
            xc4 xc4 = new xc4(0, this.f32540a + ((long) this.f32541b));
            return new uc4(xc4, xc4);
        }
        long U = d13.m20290U(j, 0, this.f32542c);
        double d2 = (double) U;
        Double.isNaN(d2);
        double d3 = (double) this.f32542c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d4;
                long[] jArr = (long[]) nu1.m20743b(this.f32545f);
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
        double d8 = (double) this.f32543d;
        Double.isNaN(d8);
        xc4 xc42 = new xc4(U, this.f32540a + d13.m20290U(Math.round((d5 / 256.0d) * d8), (long) this.f32541b, this.f32543d - 1));
        return new uc4(xc42, xc42);
    }

    /* renamed from: e */
    public final long mo30270e(long j) {
        long j2;
        double d;
        long j3 = j - this.f32540a;
        if (!zzh() || j3 <= ((long) this.f32541b)) {
            return 0;
        }
        long[] jArr = (long[]) nu1.m20743b(this.f32545f);
        double d2 = (double) j3;
        Double.isNaN(d2);
        double d3 = (double) this.f32543d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int J = d13.m20279J(jArr, (long) d4, true, true);
        long c = m32758c(J);
        long j4 = jArr[J];
        int i = J + 1;
        long c2 = m32758c(i);
        if (J == 99) {
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
        double d7 = (double) (c2 - c);
        Double.isNaN(d7);
        return c + Math.round(d * d7);
    }

    public final long zzb() {
        return this.f32544e;
    }

    public final long zze() {
        return this.f32542c;
    }

    public final boolean zzh() {
        return this.f32545f != null;
    }
}
