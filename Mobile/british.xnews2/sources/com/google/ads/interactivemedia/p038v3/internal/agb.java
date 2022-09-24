package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agb */
/* compiled from: IMASDK */
final class agb implements ach {

    /* renamed from: a */
    private final int f14633a;

    /* renamed from: b */
    private final agi f14634b;

    /* renamed from: c */
    private int f14635c = -1;

    public agb(agi agi, int i) {
        this.f14634b = agi;
        this.f14633a = i;
    }

    /* renamed from: g */
    private final boolean m13535g() {
        int i = this.f14635c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* renamed from: a */
    public final void mo13647a() {
        aup.m14885p(this.f14635c == -1);
        this.f14635c = this.f14634b.mo13665i(this.f14633a);
    }

    /* renamed from: b */
    public final boolean mo13224b() {
        return this.f14635c == -3 || (m13535g() && this.f14634b.mo13673u(this.f14635c));
    }

    /* renamed from: c */
    public final void mo13225c() throws IOException {
        int i = this.f14635c;
        if (i == -2) {
            throw new agm(this.f14634b.mo13664h().mo13453a(this.f14633a).mo13445a(0).f17681l);
        } else if (i == -1) {
            this.f14634b.mo13675z();
        } else if (i != -3) {
            this.f14634b.mo13674y(i);
        }
    }

    /* renamed from: d */
    public final int mo13226d(C4121kf kfVar, C4269ps psVar, int i) {
        if (this.f14635c == -3) {
            psVar.mo16514g(4);
            return -4;
        } else if (m13535g()) {
            return this.f14634b.mo13653A(this.f14635c, kfVar, psVar, i);
        } else {
            return -3;
        }
    }

    /* renamed from: e */
    public final int mo13227e(long j) {
        if (m13535g()) {
            return this.f14634b.mo13654B(this.f14635c, j);
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo13648f() {
        if (this.f14635c != -1) {
            this.f14634b.mo13666j(this.f14633a);
            this.f14635c = -1;
        }
    }
}
