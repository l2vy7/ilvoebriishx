package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aad */
/* compiled from: IMASDK */
final class aad implements abk, C4282qe {

    /* renamed from: a */
    final /* synthetic */ aaf f13918a;

    /* renamed from: b */
    private final Object f13919b;

    /* renamed from: c */
    private abj f13920c;

    /* renamed from: d */
    private C4281qd f13921d;

    public aad(aaf aaf, Object obj) {
        this.f13918a = aaf;
        this.f13920c = aaf.mo16938f((abb) null);
        this.f13921d = aaf.mo16940h((abb) null);
        this.f13919b = obj;
    }

    /* renamed from: g */
    private final boolean m12712g(int i, abb abb) {
        abb abb2;
        if (abb != null) {
            abb2 = this.f13918a.mo13251A(this.f13919b, abb);
            if (abb2 == null) {
                return false;
            }
        } else {
            abb2 = null;
        }
        int z = this.f13918a.mo13262z(this.f13919b, i);
        abj abj = this.f13920c;
        if (abj.f14023a != z || !amm.m14233c(abj.f14024b, abb2)) {
            this.f13920c = this.f13918a.mo16943t(z, abb2);
        }
        C4281qd qdVar = this.f13921d;
        if (qdVar.f18423a == z && amm.m14233c(qdVar.f18424b, abb2)) {
            return true;
        }
        this.f13921d = this.f13918a.mo16941i(z, abb2);
        return true;
    }

    /* renamed from: h */
    private static final aax m12713h(aax aax) {
        return aax;
    }

    /* renamed from: a */
    public final void mo13245a(int i, abb abb, aas aas, aax aax) {
        if (m12712g(i, abb)) {
            this.f13920c.mo13331e(aas, m12713h(aax));
        }
    }

    /* renamed from: ae */
    public final void mo13246ae(int i, abb abb, aas aas, aax aax) {
        if (m12712g(i, abb)) {
            this.f13920c.mo13335i(aas, m12713h(aax));
        }
    }

    /* renamed from: af */
    public final void mo13247af(int i, abb abb, aas aas, aax aax, IOException iOException, boolean z) {
        if (m12712g(i, abb)) {
            this.f13920c.mo13337k(aas, m12713h(aax), iOException, z);
        }
    }

    /* renamed from: ag */
    public final void mo13248ag(int i, abb abb, aax aax) {
        if (m12712g(i, abb)) {
            this.f13920c.mo13339m(m12713h(aax));
        }
    }

    /* renamed from: ah */
    public final void mo13249ah(int i, abb abb, aax aax) {
        if (m12712g(i, abb)) {
            this.f13920c.mo13340n(m12713h(aax));
        }
    }

    /* renamed from: b */
    public final void mo13250b(int i, abb abb, aas aas, aax aax) {
        if (m12712g(i, abb)) {
            this.f13920c.mo13333g(aas, m12713h(aax));
        }
    }
}
