package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ib4 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f33191a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f33192b;

    /* renamed from: c */
    private final long f33193c;

    /* renamed from: d */
    private long f33194d = 0;

    /* renamed from: e */
    private long f33195e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f33196f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f33197g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f33198h;

    protected ib4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f33191a = j;
        long j8 = j2;
        this.f33192b = j8;
        long j9 = j4;
        this.f33195e = j9;
        long j10 = j5;
        this.f33196f = j10;
        long j11 = j6;
        this.f33197g = j11;
        long j12 = j7;
        this.f33193c = j12;
        this.f33198h = m33166f(j8, 0, j9, j10, j11, j12);
    }

    /* renamed from: f */
    protected static long m33166f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return d13.m20290U(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m33167g(ib4 ib4, long j, long j2) {
        ib4.f33195e = j;
        ib4.f33197g = j2;
        ib4.m33169i();
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m33168h(ib4 ib4, long j, long j2) {
        ib4.f33194d = j;
        ib4.f33196f = j2;
        ib4.m33169i();
    }

    /* renamed from: i */
    private final void m33169i() {
        this.f33198h = m33166f(this.f33192b, this.f33194d, this.f33195e, this.f33196f, this.f33197g, this.f33193c);
    }
}
