package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ade */
/* compiled from: IMASDK */
public final class ade implements ach {

    /* renamed from: a */
    public final adg f14249a;

    /* renamed from: b */
    final /* synthetic */ adg f14250b;

    /* renamed from: c */
    private final acg f14251c;

    /* renamed from: d */
    private final int f14252d;

    /* renamed from: e */
    private boolean f14253e;

    public ade(adg adg, adg adg2, acg acg, int i) {
        this.f14250b = adg;
        this.f14249a = adg2;
        this.f14251c = acg;
        this.f14252d = i;
    }

    /* renamed from: f */
    private final void m13146f() {
        if (!this.f14253e) {
            this.f14250b.f14261h.mo13341o(this.f14250b.f14256c[this.f14252d], this.f14250b.f14257d[this.f14252d], 0, this.f14250b.f14273t);
            this.f14253e = true;
        }
    }

    /* renamed from: a */
    public final void mo13485a() {
        aup.m14887r(this.f14250b.f14258e[this.f14252d]);
        this.f14250b.f14258e[this.f14252d] = false;
    }

    /* renamed from: b */
    public final boolean mo13224b() {
        return !this.f14250b.mo13492o() && this.f14251c.mo13427y(this.f14250b.f14255b);
    }

    /* renamed from: c */
    public final void mo13225c() {
    }

    /* renamed from: d */
    public final int mo13226d(C4121kf kfVar, C4269ps psVar, int i) {
        if (this.f14250b.mo13492o()) {
            return -3;
        }
        m13146f();
        return this.f14251c.mo13428z(kfVar, psVar, i, this.f14250b.f14255b);
    }

    /* renamed from: e */
    public final int mo13227e(long j) {
        if (this.f14250b.mo13492o()) {
            return 0;
        }
        int C = this.f14251c.mo13393C(j, this.f14250b.f14255b);
        this.f14251c.mo13394D(C);
        if (C > 0) {
            m13146f();
        }
        return C;
    }
}
