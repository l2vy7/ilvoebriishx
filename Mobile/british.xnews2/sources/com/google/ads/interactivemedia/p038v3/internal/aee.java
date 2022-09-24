package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aee */
/* compiled from: IMASDK */
public final class aee implements aed {

    /* renamed from: a */
    private final C4300qw f14384a;

    /* renamed from: b */
    private final long f14385b;

    public aee(C4300qw qwVar, long j) {
        this.f14384a = qwVar;
        this.f14385b = j;
    }

    /* renamed from: a */
    public final long mo13529a(long j, long j2) {
        return (long) this.f14384a.mo16592d(j + this.f14385b);
    }

    /* renamed from: b */
    public final long mo13530b(long j) {
        return this.f14384a.f18460e[(int) j] - this.f14385b;
    }

    /* renamed from: c */
    public final long mo13531c(long j, long j2) {
        return this.f14384a.f18459d[(int) j];
    }

    /* renamed from: d */
    public final aew mo13532d(long j) {
        C4300qw qwVar = this.f14384a;
        int i = (int) j;
        return new aew((String) null, qwVar.f18458c[i], (long) qwVar.f18457b[i]);
    }

    /* renamed from: e */
    public final long mo13533e() {
        return 0;
    }

    /* renamed from: f */
    public final long mo13534f(long j, long j2) {
        return 0;
    }

    /* renamed from: g */
    public final int mo13535g(long j) {
        return this.f14384a.f18456a;
    }

    /* renamed from: h */
    public final int mo13536h(long j, long j2) {
        return this.f14384a.f18456a;
    }

    /* renamed from: i */
    public final long mo13537i(long j, long j2) {
        return C6540C.TIME_UNSET;
    }

    /* renamed from: j */
    public final boolean mo13538j() {
        return true;
    }
}
