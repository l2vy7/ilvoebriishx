package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ic4 implements wc4 {

    /* renamed from: a */
    private final kc4 f33205a;

    /* renamed from: b */
    private final long f33206b;

    public ic4(kc4 kc4, long j) {
        this.f33205a = kc4;
        this.f33206b = j;
    }

    /* renamed from: a */
    private final xc4 m33186a(long j, long j2) {
        return new xc4((j * 1000000) / ((long) this.f33205a.f34245e), this.f33206b + j2);
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        long j2;
        nu1.m20743b(this.f33205a.f34251k);
        kc4 kc4 = this.f33205a;
        jc4 jc4 = kc4.f34251k;
        long[] jArr = jc4.f33842a;
        long[] jArr2 = jc4.f33843b;
        int J = d13.m20279J(jArr, kc4.mo33061b(j), true, false);
        long j3 = 0;
        if (J == -1) {
            j2 = 0;
        } else {
            j2 = jArr[J];
        }
        if (J != -1) {
            j3 = jArr2[J];
        }
        xc4 a = m33186a(j2, j3);
        if (a.f41131a == j || J == jArr.length - 1) {
            return new uc4(a, a);
        }
        int i = J + 1;
        return new uc4(a, m33186a(jArr[i], jArr2[i]));
    }

    public final long zze() {
        return this.f33205a.mo33060a();
    }

    public final boolean zzh() {
        return true;
    }
}
