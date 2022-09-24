package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.g0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7703g0 implements C7666f0 {

    /* renamed from: a */
    private final long[] f32065a;

    /* renamed from: b */
    private final long[] f32066b;

    /* renamed from: c */
    private final long f32067c;

    /* renamed from: d */
    private final long f32068d;

    private C7703g0(long[] jArr, long[] jArr2, long j, long j2) {
        this.f32065a = jArr;
        this.f32066b = jArr2;
        this.f32067c = j;
        this.f32068d = j2;
    }

    /* renamed from: a */
    public static C7703g0 m32310a(long j, long j2, qc4 qc4, uq2 uq2) {
        int i;
        long j3 = j;
        qc4 qc42 = qc4;
        uq2 uq22 = uq2;
        uq22.mo35237g(10);
        int m = uq2.mo35243m();
        if (m <= 0) {
            return null;
        }
        int i2 = qc42.f37977d;
        long Z = d13.m20295Z((long) m, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int w = uq2.mo35253w();
        int w2 = uq2.mo35253w();
        int w3 = uq2.mo35253w();
        uq22.mo35237g(2);
        long j4 = j2 + ((long) qc42.f37976c);
        long[] jArr = new long[w];
        long[] jArr2 = new long[w];
        int i3 = 0;
        long j5 = j2;
        while (i3 < w) {
            int i4 = w2;
            jArr[i3] = (((long) i3) * Z) / ((long) w);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (w3 == 1) {
                i = uq2.mo35249s();
            } else if (w3 == 2) {
                i = uq2.mo35253w();
            } else if (w3 == 3) {
                i = uq2.mo35251u();
            } else if (w3 != 4) {
                return null;
            } else {
                i = uq2.mo35252v();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j6;
            w2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            Log.w("VbriSeeker", sb.toString());
        }
        return new C7703g0(jArr, jArr2, Z, j5);
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        int J = d13.m20279J(this.f32065a, j, true, true);
        xc4 xc4 = new xc4(this.f32065a[J], this.f32066b[J]);
        if (xc4.f41131a < j) {
            long[] jArr = this.f32065a;
            if (J != jArr.length - 1) {
                int i = J + 1;
                return new uc4(xc4, new xc4(jArr[i], this.f32066b[i]));
            }
        }
        return new uc4(xc4, xc4);
    }

    /* renamed from: e */
    public final long mo30270e(long j) {
        return this.f32065a[d13.m20279J(this.f32066b, j, true, true)];
    }

    public final long zzb() {
        return this.f32068d;
    }

    public final long zze() {
        return this.f32067c;
    }

    public final boolean zzh() {
        return true;
    }
}
