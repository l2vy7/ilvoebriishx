package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aex */
/* compiled from: IMASDK */
public final class aex extends aez implements aed {

    /* renamed from: a */
    final afa f14482a;

    public aex(C4120ke keVar, String str, afa afa, List<aes> list) {
        super(keVar, str, afa, list);
        this.f14482a = afa;
    }

    /* renamed from: a */
    public final long mo13529a(long j, long j2) {
        return this.f14482a.mo13590a(j, j2);
    }

    /* renamed from: b */
    public final long mo13530b(long j) {
        return this.f14482a.mo13592c(j);
    }

    /* renamed from: c */
    public final long mo13531c(long j, long j2) {
        return this.f14482a.mo13591b(j, j2);
    }

    /* renamed from: d */
    public final aew mo13532d(long j) {
        return this.f14482a.mo13593d(this, j);
    }

    /* renamed from: e */
    public final long mo13533e() {
        return this.f14482a.f14493a;
    }

    /* renamed from: f */
    public final long mo13534f(long j, long j2) {
        return this.f14482a.mo13594e(j, j2);
    }

    /* renamed from: g */
    public final int mo13535g(long j) {
        return this.f14482a.mo13597h(j);
    }

    /* renamed from: h */
    public final int mo13536h(long j, long j2) {
        return this.f14482a.mo13595f(j, j2);
    }

    /* renamed from: i */
    public final long mo13537i(long j, long j2) {
        afa afa = this.f14482a;
        if (afa.f14495c != null) {
            return C6540C.TIME_UNSET;
        }
        long e = afa.mo13594e(j, j2) + ((long) afa.mo13595f(j, j2));
        return (afa.mo13592c(e) + afa.mo13591b(e, j)) - afa.f14496d;
    }

    /* renamed from: j */
    public final boolean mo13538j() {
        return this.f14482a.mo13596g();
    }

    /* renamed from: k */
    public final aew mo13586k() {
        return null;
    }

    /* renamed from: l */
    public final aed mo13587l() {
        return this;
    }

    /* renamed from: m */
    public final void mo13588m() {
    }
}
