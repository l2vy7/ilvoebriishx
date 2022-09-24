package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aeg */
/* compiled from: IMASDK */
public final class aeg {

    /* renamed from: a */
    final adc f14388a;

    /* renamed from: b */
    public final aez f14389b;

    /* renamed from: c */
    public final aed f14390c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f14391d;

    /* renamed from: e */
    private final long f14392e;

    aeg(long j, aez aez, adc adc, long j2, aed aed) {
        this.f14391d = j;
        this.f14389b = aez;
        this.f14392e = j2;
        this.f14388a = adc;
        this.f14390c = aed;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aeg mo13540a(long j, aez aez) throws C4545zy {
        long a;
        long j2 = j;
        aed l = this.f14389b.mo13587l();
        aed l2 = aez.mo13587l();
        if (l == null) {
            return new aeg(j, aez, this.f14388a, this.f14392e, (aed) null);
        } else if (!l.mo13538j()) {
            return new aeg(j, aez, this.f14388a, this.f14392e, l2);
        } else {
            int g = l.mo13535g(j2);
            if (g == 0) {
                return new aeg(j, aez, this.f14388a, this.f14392e, l2);
            }
            long e = l.mo13533e();
            long b = l.mo13530b(e);
            long j3 = (((long) g) + e) - 1;
            long b2 = l.mo13530b(j3) + l.mo13531c(j3, j2);
            long j4 = e;
            long e2 = l2.mo13533e();
            long b3 = l2.mo13530b(e2);
            aed aed = l;
            long j5 = this.f14392e;
            if (b2 == b3) {
                a = j5 + ((j3 + 1) - e2);
                long j6 = j;
            } else if (b2 < b3) {
                throw new C4545zy();
            } else if (b3 < b) {
                a = j5 - (l2.mo13529a(b, j) - j4);
            } else {
                a = j5 + (aed.mo13529a(b3, j) - e2);
            }
            return new aeg(j, aez, this.f14388a, a, l2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final aeg mo13541b(aed aed) {
        return new aeg(this.f14391d, this.f14389b, this.f14388a, this.f14392e, aed);
    }

    /* renamed from: c */
    public final long mo13542c() {
        return this.f14390c.mo13533e() + this.f14392e;
    }

    /* renamed from: d */
    public final long mo13543d(long j) {
        return this.f14390c.mo13534f(this.f14391d, j) + this.f14392e;
    }

    /* renamed from: e */
    public final int mo13544e() {
        return this.f14390c.mo13535g(this.f14391d);
    }

    /* renamed from: f */
    public final long mo13545f(long j) {
        return this.f14390c.mo13530b(j - this.f14392e);
    }

    /* renamed from: g */
    public final long mo13546g(long j) {
        return mo13545f(j) + this.f14390c.mo13531c(j - this.f14392e, this.f14391d);
    }

    /* renamed from: h */
    public final long mo13547h(long j) {
        return this.f14390c.mo13529a(j, this.f14391d) + this.f14392e;
    }

    /* renamed from: i */
    public final aew mo13548i(long j) {
        return this.f14390c.mo13532d(j - this.f14392e);
    }

    /* renamed from: j */
    public final long mo13549j(long j) {
        return (mo13543d(j) + ((long) this.f14390c.mo13536h(this.f14391d, j))) - 1;
    }

    /* renamed from: k */
    public final boolean mo13550k(long j, long j2) {
        return j2 == C6540C.TIME_UNSET || mo13546g(j) <= j2;
    }
}
