package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kw */
/* compiled from: IMASDK */
final class C4138kw implements abk, C4282qe {

    /* renamed from: a */
    final /* synthetic */ C4143la f17774a;

    /* renamed from: b */
    private final C4140ky f17775b;

    /* renamed from: c */
    private abj f17776c;

    /* renamed from: d */
    private C4281qd f17777d;

    public C4138kw(C4143la laVar, C4140ky kyVar) {
        this.f17774a = laVar;
        this.f17776c = laVar.f17799e;
        this.f17777d = laVar.f17800f;
        this.f17775b = kyVar;
    }

    /* renamed from: g */
    private final boolean m17805g(int i, abb abb) {
        abb abb2 = null;
        if (abb != null) {
            C4140ky kyVar = this.f17775b;
            int i2 = 0;
            while (true) {
                if (i2 >= kyVar.f17783c.size()) {
                    break;
                } else if (kyVar.f17783c.get(i2).f14001d == abb.f14001d) {
                    abb2 = abb.mo13315c(Pair.create(kyVar.f17782b, abb.f13998a));
                    break;
                } else {
                    i2++;
                }
            }
            if (abb2 == null) {
                return false;
            }
        }
        int i3 = i + this.f17775b.f17784d;
        abj abj = this.f17776c;
        if (abj.f14023a != i3 || !amm.m14233c(abj.f14024b, abb2)) {
            this.f17776c = this.f17774a.f17799e.mo13327a(i3, abb2, 0);
        }
        C4281qd qdVar = this.f17777d;
        if (qdVar.f18423a == i3 && amm.m14233c(qdVar.f18424b, abb2)) {
            return true;
        }
        this.f17777d = this.f17774a.f17800f.mo16572a(i3, abb2);
        return true;
    }

    /* renamed from: a */
    public final void mo13245a(int i, abb abb, aas aas, aax aax) {
        if (m17805g(i, abb)) {
            this.f17776c.mo13331e(aas, aax);
        }
    }

    /* renamed from: ae */
    public final void mo13246ae(int i, abb abb, aas aas, aax aax) {
        if (m17805g(i, abb)) {
            this.f17776c.mo13335i(aas, aax);
        }
    }

    /* renamed from: af */
    public final void mo13247af(int i, abb abb, aas aas, aax aax, IOException iOException, boolean z) {
        if (m17805g(i, abb)) {
            this.f17776c.mo13337k(aas, aax, iOException, z);
        }
    }

    /* renamed from: ag */
    public final void mo13248ag(int i, abb abb, aax aax) {
        if (m17805g(i, abb)) {
            this.f17776c.mo13339m(aax);
        }
    }

    /* renamed from: ah */
    public final void mo13249ah(int i, abb abb, aax aax) {
        if (m17805g(i, abb)) {
            this.f17776c.mo13340n(aax);
        }
    }

    /* renamed from: b */
    public final void mo13250b(int i, abb abb, aas aas, aax aax) {
        if (m17805g(i, abb)) {
            this.f17776c.mo13333g(aas, aax);
        }
    }
}
