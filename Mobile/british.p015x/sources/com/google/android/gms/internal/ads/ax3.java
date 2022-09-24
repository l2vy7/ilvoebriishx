package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ax3 {

    /* renamed from: a */
    private final List<yw3> f29809a = new ArrayList();

    /* renamed from: b */
    private final IdentityHashMap<b54, yw3> f29810b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, yw3> f29811c = new HashMap();

    /* renamed from: d */
    private final zw3 f29812d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final m54 f29813e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final f24 f29814f;

    /* renamed from: g */
    private final HashMap<yw3, xw3> f29815g;

    /* renamed from: h */
    private final Set<yw3> f29816h;

    /* renamed from: i */
    private boolean f29817i;

    /* renamed from: j */
    private mt1 f29818j;

    /* renamed from: k */
    private u64 f29819k = new u64(0);

    public ax3(zw3 zw3, a04 a04, Handler handler) {
        this.f29812d = zw3;
        m54 m54 = new m54();
        this.f29813e = m54;
        f24 f24 = new f24();
        this.f29814f = f24;
        this.f29815g = new HashMap<>();
        this.f29816h = new HashSet();
        m54.mo33482b(handler, a04);
        f24.mo31715b(handler, a04);
    }

    /* renamed from: p */
    private final void m30529p(int i, int i2) {
        while (i < this.f29809a.size()) {
            this.f29809a.get(i).f42019d += i2;
            i++;
        }
    }

    /* renamed from: q */
    private final void m30530q(yw3 yw3) {
        xw3 xw3 = this.f29815g.get(yw3);
        if (xw3 != null) {
            xw3.f41360a.mo31762m(xw3.f41361b);
        }
    }

    /* renamed from: r */
    private final void m30531r() {
        Iterator<yw3> it = this.f29816h.iterator();
        while (it.hasNext()) {
            yw3 next = it.next();
            if (next.f42018c.isEmpty()) {
                m30530q(next);
                it.remove();
            }
        }
    }

    /* renamed from: s */
    private final void m30532s(yw3 yw3) {
        if (yw3.f42020e && yw3.f42018c.isEmpty()) {
            xw3 remove = this.f29815g.remove(yw3);
            Objects.requireNonNull(remove);
            remove.f41360a.mo31758h(remove.f41361b);
            remove.f41360a.mo31757e(remove.f41362c);
            remove.f41360a.mo31760j(remove.f41362c);
            this.f29816h.remove(yw3);
        }
    }

    /* renamed from: t */
    private final void m30533t(yw3 yw3) {
        y44 y44 = yw3.f42016a;
        uw3 uw3 = new uw3(this);
        ww3 ww3 = new ww3(this, yw3);
        this.f29815g.put(yw3, new xw3(y44, uw3, ww3));
        y44.mo31759i(new Handler(d13.m20296a(), (Handler.Callback) null), ww3);
        y44.mo31754a(new Handler(d13.m20296a(), (Handler.Callback) null), ww3);
        y44.mo31761l(uw3, this.f29818j);
    }

    /* renamed from: u */
    private final void m30534u(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                yw3 remove = this.f29809a.remove(i2);
                this.f29811c.remove(remove.f42017b);
                m30529p(i2, -remove.f42016a.mo18985D().mo31951c());
                remove.f42020e = true;
                if (this.f29817i) {
                    m30532s(remove);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo30555a() {
        return this.f29809a.size();
    }

    /* renamed from: b */
    public final gi0 mo30556b() {
        if (this.f29809a.isEmpty()) {
            return gi0.f32342a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f29809a.size(); i2++) {
            yw3 yw3 = this.f29809a.get(i2);
            yw3.f42019d = i;
            i += yw3.f42016a.mo18985D().mo31951c();
        }
        return new fx3(this.f29809a, this.f29819k, (u64) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo30557e(f54 f54, gi0 gi0) {
        this.f29812d.zzh();
    }

    /* renamed from: f */
    public final void mo30558f(mt1 mt1) {
        nu1.m20747f(!this.f29817i);
        this.f29818j = mt1;
        for (int i = 0; i < this.f29809a.size(); i++) {
            yw3 yw3 = this.f29809a.get(i);
            m30533t(yw3);
            this.f29816h.add(yw3);
        }
        this.f29817i = true;
    }

    /* renamed from: g */
    public final void mo30559g() {
        for (xw3 next : this.f29815g.values()) {
            try {
                next.f41360a.mo31758h(next.f41361b);
            } catch (RuntimeException e) {
                fc2.m20475a("MediaSourceList", "Failed to release child source.", e);
            }
            next.f41360a.mo31757e(next.f41362c);
            next.f41360a.mo31760j(next.f41362c);
        }
        this.f29815g.clear();
        this.f29816h.clear();
        this.f29817i = false;
    }

    /* renamed from: h */
    public final void mo30560h(b54 b54) {
        yw3 remove = this.f29810b.remove(b54);
        Objects.requireNonNull(remove);
        remove.f42016a.mo18987g(b54);
        remove.f42018c.remove(((v44) b54).f40300b);
        if (!this.f29810b.isEmpty()) {
            m30531r();
        }
        m30532s(remove);
    }

    /* renamed from: i */
    public final boolean mo30561i() {
        return this.f29817i;
    }

    /* renamed from: j */
    public final gi0 mo30562j(int i, List<yw3> list, u64 u64) {
        if (!list.isEmpty()) {
            this.f29819k = u64;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                yw3 yw3 = list.get(i2 - i);
                if (i2 > 0) {
                    yw3 yw32 = this.f29809a.get(i2 - 1);
                    yw3.mo35980a(yw32.f42019d + yw32.f42016a.mo18985D().mo31951c());
                } else {
                    yw3.mo35980a(0);
                }
                m30529p(i2, yw3.f42016a.mo18985D().mo31951c());
                this.f29809a.add(i2, yw3);
                this.f29811c.put(yw3.f42017b, yw3);
                if (this.f29817i) {
                    m30533t(yw3);
                    if (this.f29810b.isEmpty()) {
                        this.f29816h.add(yw3);
                    } else {
                        m30530q(yw3);
                    }
                }
            }
        }
        return mo30556b();
    }

    /* renamed from: k */
    public final gi0 mo30563k(int i, int i2, int i3, u64 u64) {
        nu1.m20745d(mo30555a() >= 0);
        this.f29819k = null;
        return mo30556b();
    }

    /* renamed from: l */
    public final gi0 mo30564l(int i, int i2, u64 u64) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= mo30555a()) {
            z = true;
        }
        nu1.m20745d(z);
        this.f29819k = u64;
        m30534u(i, i2);
        return mo30556b();
    }

    /* renamed from: m */
    public final gi0 mo30565m(List<yw3> list, u64 u64) {
        m30534u(0, this.f29809a.size());
        return mo30562j(this.f29809a.size(), list, u64);
    }

    /* renamed from: n */
    public final gi0 mo30566n(u64 u64) {
        int a = mo30555a();
        if (u64.mo35133c() != a) {
            u64 = u64.mo35136f().mo35137g(0, a);
        }
        this.f29819k = u64;
        return mo30556b();
    }

    /* renamed from: o */
    public final b54 mo30567o(c54 c54, o84 o84, long j) {
        Object obj = c54.f34474a;
        Object obj2 = ((Pair) obj).first;
        c54 c = c54.mo30857c(((Pair) obj).second);
        yw3 yw3 = this.f29811c.get(obj2);
        Objects.requireNonNull(yw3);
        this.f29816h.add(yw3);
        xw3 xw3 = this.f29815g.get(yw3);
        if (xw3 != null) {
            xw3.f41360a.mo31756c(xw3.f41361b);
        }
        yw3.f42018c.add(c);
        v44 A = yw3.f42016a.mo18988k(c, o84, j);
        this.f29810b.put(A, yw3);
        m30531r();
        return A;
    }
}
