package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.a0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7487a0 implements C7666f0 {

    /* renamed from: a */
    private final long[] f29479a;

    /* renamed from: b */
    private final long[] f29480b;

    /* renamed from: c */
    private final long f29481c;

    private C7487a0(long[] jArr, long[] jArr2, long j) {
        this.f29479a = jArr;
        this.f29480b = jArr2;
        this.f29481c = j == C6540C.TIME_UNSET ? xy3.m39691c(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static C7487a0 m30188a(long j, zzzy zzzy, long j2) {
        int length = zzzy.f43125f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzzy.f43123d + zzzy.f43125f[i3]);
            j3 += (long) (zzzy.f43124e + zzzy.f43126g[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C7487a0(jArr, jArr2, j2);
    }

    /* renamed from: c */
    private static Pair<Long, Long> m30189c(long j, long[] jArr, long[] jArr2) {
        double d;
        int J = d13.m20279J(jArr, j, true, true);
        long j2 = jArr[J];
        long j3 = jArr2[J];
        int i = J + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d2 = (double) j;
            double d3 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = (double) (j4 - j2);
            Double.isNaN(d4);
            d = (d2 - d3) / d4;
        }
        Long valueOf = Long.valueOf(j);
        double d5 = (double) (j5 - j3);
        Double.isNaN(d5);
        return Pair.create(valueOf, Long.valueOf(((long) (d * d5)) + j3));
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        Pair<Long, Long> c = m30189c(xy3.m39692d(d13.m20290U(j, 0, this.f29481c)), this.f29480b, this.f29479a);
        xc4 xc4 = new xc4(xy3.m39691c(((Long) c.first).longValue()), ((Long) c.second).longValue());
        return new uc4(xc4, xc4);
    }

    /* renamed from: e */
    public final long mo30270e(long j) {
        return xy3.m39691c(((Long) m30189c(j, this.f29479a, this.f29480b).second).longValue());
    }

    public final long zzb() {
        return -1;
    }

    public final long zze() {
        return this.f29481c;
    }

    public final boolean zzh() {
        return true;
    }
}
