package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Pair;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ti */
/* compiled from: IMASDK */
final class C4367ti implements C4370tl {

    /* renamed from: a */
    private final long[] f18798a;

    /* renamed from: b */
    private final long[] f18799b;

    /* renamed from: c */
    private final long f18800c;

    private C4367ti(long[] jArr, long[] jArr2, long j) {
        this.f18798a = jArr;
        this.f18799b = jArr2;
        this.f18800c = j == C6540C.TIME_UNSET ? C4083iv.m17452b(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: f */
    public static C4367ti m18963f(long j, C4532zl zlVar, long j2) {
        int length = zlVar.f19760d.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zlVar.f19758b + zlVar.f19760d[i3]);
            j3 += (long) (zlVar.f19759c + zlVar.f19761e[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C4367ti(jArr, jArr2, j2);
    }

    /* renamed from: g */
    private static Pair<Long, Long> m18964g(long j, long[] jArr, long[] jArr2) {
        double d;
        int am = amm.m14223am(jArr, j, true);
        long j2 = jArr[am];
        long j3 = jArr2[am];
        int i = am + 1;
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

    /* renamed from: a */
    public final boolean mo16580a() {
        return true;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        Pair<Long, Long> g = m18964g(C4083iv.m17451a(amm.m14192I(j, 0, this.f18800c)), this.f18799b, this.f18798a);
        long longValue = ((Long) g.first).longValue();
        C4325ru ruVar = new C4325ru(C4083iv.m17452b(longValue), ((Long) g.second).longValue());
        return new C4322rr(ruVar, ruVar);
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f18800c;
    }

    /* renamed from: d */
    public final long mo16621d(long j) {
        return C4083iv.m17452b(((Long) m18964g(j, this.f18798a, this.f18799b).second).longValue());
    }

    /* renamed from: e */
    public final long mo16622e() {
        return -1;
    }
}
