package com.google.ads.interactivemedia.p039v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nd */
/* compiled from: IMASDK */
final class C4200nd {

    /* renamed from: a */
    private final C4168lz f18041a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public atz<abb> f18042b = atz.m14807i();

    /* renamed from: c */
    private aue<abb, C4171mb> f18043c = aue.m14836a();

    /* renamed from: d */
    private abb f18044d;

    /* renamed from: e */
    private abb f18045e;

    /* renamed from: f */
    private abb f18046f;

    public C4200nd(C4168lz lzVar) {
        this.f18041a = lzVar;
    }

    /* renamed from: j */
    private final void m18132j(C4171mb mbVar) {
        auc b = aue.m14837b();
        if (this.f18042b.isEmpty()) {
            m18133k(b, this.f18045e, mbVar);
            if (!arq.m14618b(this.f18046f, this.f18045e)) {
                m18133k(b, this.f18046f, mbVar);
            }
            if (!arq.m14618b(this.f18044d, this.f18045e) && !arq.m14618b(this.f18044d, this.f18046f)) {
                m18133k(b, this.f18044d, mbVar);
            }
        } else {
            for (int i = 0; i < this.f18042b.size(); i++) {
                m18133k(b, this.f18042b.get(i), mbVar);
            }
            if (!this.f18042b.contains(this.f18044d)) {
                m18133k(b, this.f18044d, mbVar);
            }
        }
        this.f18043c = b.mo14539a();
    }

    /* renamed from: k */
    private final void m18133k(auc<abb, C4171mb> auc, abb abb, C4171mb mbVar) {
        if (abb != null) {
            if (mbVar.mo13290i(abb.f13998a) != -1) {
                auc.mo14540b(abb, mbVar);
                return;
            }
            C4171mb mbVar2 = this.f18043c.get(abb);
            if (mbVar2 != null) {
                auc.mo14540b(abb, mbVar2);
            }
        }
    }

    /* renamed from: l */
    private static abb m18134l(C4150lh lhVar, atz<abb> atz, abb abb, C4168lz lzVar) {
        C4171mb v = lhVar.mo16018v();
        int m = lhVar.mo16009m();
        Object j = v.mo16333v() ? null : v.mo13291j(m);
        int e = (lhVar.mo16014r() || v.mo16333v()) ? -1 : v.mo16330A(m, lzVar).mo16318e(C4083iv.m17452b(lhVar.mo16012p()) - lzVar.f17916e);
        for (int i = 0; i < atz.size(); i++) {
            abb abb2 = atz.get(i);
            if (m18135m(abb2, j, lhVar.mo16014r(), lhVar.mo16015s(), lhVar.mo16016t(), e)) {
                return abb2;
            }
        }
        if (atz.isEmpty() && abb != null) {
            if (m18135m(abb, j, lhVar.mo16014r(), lhVar.mo16015s(), lhVar.mo16016t(), e)) {
                return abb;
            }
        }
        return null;
    }

    /* renamed from: m */
    private static boolean m18135m(abb abb, Object obj, boolean z, int i, int i2, int i3) {
        if (!abb.f13998a.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(abb.f13999b == i && abb.f14000c == i2)) {
                return false;
            }
        } else if (!(abb.f13999b == -1 && abb.f14002e == i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final abb mo16344a() {
        return this.f18044d;
    }

    /* renamed from: b */
    public final abb mo16345b() {
        return this.f18045e;
    }

    /* renamed from: c */
    public final abb mo16346c() {
        return this.f18046f;
    }

    /* renamed from: d */
    public final abb mo16347d() {
        if (this.f18042b.isEmpty()) {
            return null;
        }
        return (abb) art.m14630a(this.f18042b);
    }

    /* renamed from: e */
    public final C4171mb mo16348e(abb abb) {
        return this.f18043c.get(abb);
    }

    /* renamed from: f */
    public final void mo16349f(C4150lh lhVar) {
        this.f18044d = m18134l(lhVar, this.f18042b, this.f18045e, this.f18041a);
    }

    /* renamed from: g */
    public final void mo16350g(C4150lh lhVar) {
        this.f18044d = m18134l(lhVar, this.f18042b, this.f18045e, this.f18041a);
        m18132j(lhVar.mo16018v());
    }

    /* renamed from: h */
    public final void mo16351h(List<abb> list, abb abb, C4150lh lhVar) {
        this.f18042b = atz.m14811m(list);
        if (!list.isEmpty()) {
            this.f18045e = list.get(0);
            aup.m14890u(abb);
            this.f18046f = abb;
        }
        if (this.f18044d == null) {
            this.f18044d = m18134l(lhVar, this.f18042b, this.f18045e, this.f18041a);
        }
        m18132j(lhVar.mo16018v());
    }
}
