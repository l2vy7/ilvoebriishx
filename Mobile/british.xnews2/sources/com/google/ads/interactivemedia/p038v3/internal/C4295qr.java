package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qr */
/* compiled from: IMASDK */
public final class C4295qr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f18440a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f18441b;

    /* renamed from: c */
    private final long f18442c;

    /* renamed from: d */
    private long f18443d = 0;

    /* renamed from: e */
    private long f18444e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f18445f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f18446g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f18447h;

    protected C4295qr(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f18440a = j;
        long j7 = j2;
        this.f18441b = j7;
        long j8 = j3;
        this.f18444e = j8;
        long j9 = j4;
        this.f18445f = j9;
        long j10 = j5;
        this.f18446g = j10;
        long j11 = j6;
        this.f18442c = j11;
        this.f18447h = m18664a(j7, 0, j8, j9, j10, j11);
    }

    /* renamed from: a */
    protected static long m18664a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return amm.m14192I(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    /* renamed from: g */
    static /* synthetic */ void m18670g(C4295qr qrVar, long j, long j2) {
        qrVar.f18444e = j;
        qrVar.f18446g = j2;
        qrVar.m18672i();
    }

    /* renamed from: h */
    static /* synthetic */ void m18671h(C4295qr qrVar, long j, long j2) {
        qrVar.f18443d = j;
        qrVar.f18445f = j2;
        qrVar.m18672i();
    }

    /* renamed from: i */
    private final void m18672i() {
        this.f18447h = m18664a(this.f18441b, this.f18443d, this.f18444e, this.f18445f, this.f18446g, this.f18442c);
    }
}
