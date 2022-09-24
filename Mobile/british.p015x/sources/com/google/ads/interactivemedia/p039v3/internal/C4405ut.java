package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ut */
/* compiled from: IMASDK */
final class C4405ut implements C4411uz {

    /* renamed from: a */
    private final C4316rl f19098a;

    /* renamed from: b */
    private final C4315rk f19099b;

    /* renamed from: c */
    private long f19100c = -1;

    /* renamed from: d */
    private long f19101d = -1;

    public C4405ut(C4316rl rlVar, C4315rk rkVar) {
        this.f19098a = rlVar;
        this.f19099b = rkVar;
    }

    /* renamed from: a */
    public final long mo16685a(C4307rc rcVar) {
        long j = this.f19101d;
        if (j < 0) {
            return -1;
        }
        this.f19101d = -1;
        return -(j + 2);
    }

    /* renamed from: b */
    public final void mo16686b(long j) {
        long[] jArr = this.f19099b.f18510a;
        this.f19101d = jArr[amm.m14223am(jArr, j, true)];
    }

    /* renamed from: c */
    public final C4324rt mo16687c() {
        aup.m14887r(this.f19100c != -1);
        return new C4314rj(this.f19098a, this.f19100c);
    }

    /* renamed from: d */
    public final void mo16688d(long j) {
        this.f19100c = j;
    }
}
