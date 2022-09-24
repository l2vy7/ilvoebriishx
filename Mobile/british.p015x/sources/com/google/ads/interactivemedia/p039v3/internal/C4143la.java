package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.la */
/* compiled from: IMASDK */
final class C4143la {

    /* renamed from: a */
    private final List<C4140ky> f17795a = new ArrayList();

    /* renamed from: b */
    private final IdentityHashMap<aaz, C4140ky> f17796b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, C4140ky> f17797c = new HashMap();

    /* renamed from: d */
    private final C4141kz f17798d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final abj f17799e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4281qd f17800f;

    /* renamed from: g */
    private final HashMap<C4140ky, C4139kx> f17801g;

    /* renamed from: h */
    private final Set<C4140ky> f17802h;

    /* renamed from: i */
    private boolean f17803i;

    /* renamed from: j */
    private akp f17804j;

    /* renamed from: k */
    private ack f17805k = new ack();

    public C4143la(C4141kz kzVar, C4201ne neVar, Handler handler) {
        this.f17798d = kzVar;
        abj abj = new abj();
        this.f17799e = abj;
        C4281qd qdVar = new C4281qd();
        this.f17800f = qdVar;
        this.f17801g = new HashMap<>();
        this.f17802h = new HashSet();
        if (neVar != null) {
            abj.mo13328b(handler, neVar);
            qdVar.mo16573b(handler, neVar);
        }
    }

    /* renamed from: p */
    private final void m17820p() {
        Iterator<C4140ky> it = this.f17802h.iterator();
        while (it.hasNext()) {
            C4140ky next = it.next();
            if (next.f17783c.isEmpty()) {
                m17821q(next);
                it.remove();
            }
        }
    }

    /* renamed from: q */
    private final void m17821q(C4140ky kyVar) {
        C4139kx kxVar = this.f17801g.get(kyVar);
        if (kxVar != null) {
            kxVar.f17778a.mo13321p(kxVar.f17779b);
        }
    }

    /* renamed from: r */
    private final void m17822r(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                C4140ky remove = this.f17795a.remove(i2);
                this.f17797c.remove(remove.f17782b);
                m17823s(i2, -remove.f17781a.mo13307C().mo13271t());
                remove.f17785e = true;
                if (this.f17803i) {
                    m17825u(remove);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    private final void m17823s(int i, int i2) {
        while (i < this.f17795a.size()) {
            this.f17795a.get(i).f17784d += i2;
            i++;
        }
    }

    /* renamed from: t */
    private final void m17824t(C4140ky kyVar) {
        aaw aaw = kyVar.f17781a;
        C4137kv kvVar = new C4137kv(this);
        C4138kw kwVar = new C4138kw(this, kyVar);
        this.f17801g.put(kyVar, new C4139kx(aaw, kvVar, kwVar));
        aaw.mo13316k(amm.m14243m(), kwVar);
        aaw.mo13318m(amm.m14243m(), kwVar);
        aaw.mo13319n(kvVar, this.f17804j);
    }

    /* renamed from: u */
    private final void m17825u(C4140ky kyVar) {
        if (kyVar.f17785e && kyVar.f17783c.isEmpty()) {
            C4139kx remove = this.f17801g.remove(kyVar);
            aup.m14890u(remove);
            remove.f17778a.mo13322q(remove.f17779b);
            remove.f17778a.mo13317l(remove.f17780c);
            this.f17802h.remove(kyVar);
        }
    }

    /* renamed from: a */
    public final boolean mo16202a() {
        return this.f17803i;
    }

    /* renamed from: b */
    public final int mo16203b() {
        return this.f17795a.size();
    }

    /* renamed from: c */
    public final void mo16204c(akp akp) {
        aup.m14887r(!this.f17803i);
        this.f17804j = akp;
        for (int i = 0; i < this.f17795a.size(); i++) {
            C4140ky kyVar = this.f17795a.get(i);
            m17824t(kyVar);
            this.f17802h.add(kyVar);
        }
        this.f17803i = true;
    }

    /* renamed from: d */
    public final void mo16205d(aaz aaz) {
        C4140ky remove = this.f17796b.remove(aaz);
        aup.m14890u(remove);
        remove.f17781a.mo13274V(aaz);
        remove.f17783c.remove(((aat) aaz).f13966a);
        if (!this.f17796b.isEmpty()) {
            m17820p();
        }
        m17825u(remove);
    }

    /* renamed from: e */
    public final void mo16206e() {
        for (C4139kx next : this.f17801g.values()) {
            try {
                next.f17778a.mo13322q(next.f17779b);
            } catch (RuntimeException e) {
                ali.m14023b("MediaSourceList", "Failed to release child source.", e);
            }
            next.f17778a.mo13317l(next.f17780c);
        }
        this.f17801g.clear();
        this.f17802h.clear();
        this.f17803i = false;
    }

    /* renamed from: f */
    public final C4171mb mo16207f() {
        if (this.f17795a.isEmpty()) {
            return C4171mb.f17942a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f17795a.size(); i2++) {
            C4140ky kyVar = this.f17795a.get(i2);
            kyVar.f17784d = i;
            i += kyVar.f17781a.mo13307C().mo13271t();
        }
        return new C4154ll(this.f17795a, this.f17805k);
    }

    /* renamed from: i */
    public final C4171mb mo16208i(List<C4140ky> list, ack ack) {
        m17822r(0, this.f17795a.size());
        return mo16209j(this.f17795a.size(), list, ack);
    }

    /* renamed from: j */
    public final C4171mb mo16209j(int i, List<C4140ky> list, ack ack) {
        if (!list.isEmpty()) {
            this.f17805k = ack;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C4140ky kyVar = list.get(i2 - i);
                if (i2 > 0) {
                    C4140ky kyVar2 = this.f17795a.get(i2 - 1);
                    kyVar.mo16200c(kyVar2.f17784d + kyVar2.f17781a.mo13307C().mo13271t());
                } else {
                    kyVar.mo16200c(0);
                }
                m17823s(i2, kyVar.f17781a.mo13307C().mo13271t());
                this.f17795a.add(i2, kyVar);
                this.f17797c.put(kyVar.f17782b, kyVar);
                if (this.f17803i) {
                    m17824t(kyVar);
                    if (this.f17796b.isEmpty()) {
                        this.f17802h.add(kyVar);
                    } else {
                        m17821q(kyVar);
                    }
                }
            }
        }
        return mo16207f();
    }

    /* renamed from: k */
    public final C4171mb mo16210k(int i, int i2, ack ack) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= mo16203b()) {
            z = true;
        }
        aup.m14885p(z);
        this.f17805k = ack;
        m17822r(i, i2);
        return mo16207f();
    }

    /* renamed from: l */
    public final C4171mb mo16211l(ack ack) {
        int b = mo16203b();
        if (ack.mo13429a() != b) {
            ack = ack.mo13436h().mo13434f(0, b);
        }
        this.f17805k = ack;
        return mo16207f();
    }

    /* renamed from: m */
    public final aaz mo16212m(abb abb, ajl ajl, long j) {
        Object a = C4073il.m17384a(abb.f13998a);
        abb c = abb.mo13315c(C4073il.m17385b(abb.f13998a));
        C4140ky kyVar = this.f17797c.get(a);
        aup.m14890u(kyVar);
        this.f17802h.add(kyVar);
        C4139kx kxVar = this.f17801g.get(kyVar);
        if (kxVar != null) {
            kxVar.f17778a.mo13320o(kxVar.f17779b);
        }
        kyVar.f17783c.add(c);
        aat D = kyVar.f17781a.mo13275W(c, ajl, j);
        this.f17796b.put(D, kyVar);
        m17820p();
        return D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo16213n() {
        this.f17798d.mo16039i();
    }

    /* renamed from: o */
    public final C4171mb mo16214o() {
        aup.m14885p(mo16203b() >= 0);
        this.f17805k = null;
        return mo16207f();
    }
}
