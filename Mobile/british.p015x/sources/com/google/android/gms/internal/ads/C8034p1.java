package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8034p1 implements C8248v1 {

    /* renamed from: a */
    private final kc4 f37270a;

    /* renamed from: b */
    private final jc4 f37271b;

    /* renamed from: c */
    private long f37272c = -1;

    /* renamed from: d */
    private long f37273d = -1;

    public C8034p1(kc4 kc4, jc4 jc4) {
        this.f37270a = kc4;
        this.f37271b = jc4;
    }

    /* renamed from: a */
    public final long mo30290a(wb4 wb4) {
        long j = this.f37273d;
        if (j < 0) {
            return -1;
        }
        this.f37273d = -1;
        return -(j + 2);
    }

    /* renamed from: b */
    public final void mo30291b(long j) {
        long[] jArr = this.f37271b.f33842a;
        this.f37273d = jArr[d13.m20279J(jArr, j, true, true)];
    }

    /* renamed from: c */
    public final void mo34034c(long j) {
        this.f37272c = j;
    }

    public final wc4 zze() {
        nu1.m20747f(this.f37272c != -1);
        return new ic4(this.f37270a, this.f37272c);
    }
}
