package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zz3 {

    /* renamed from: a */
    private final gf0 f42839a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public p63<c54> f42840b = p63.m20814A();

    /* renamed from: c */
    private t63<c54, gi0> f42841c = t63.m21028e();

    /* renamed from: d */
    private c54 f42842d;

    /* renamed from: e */
    private c54 f42843e;

    /* renamed from: f */
    private c54 f42844f;

    public zz3(gf0 gf0) {
        this.f42839a = gf0;
    }

    /* renamed from: j */
    private static c54 m40594j(kb0 kb0, p63<c54> p63, c54 c54, gf0 gf0) {
        gi0 zzm = kb0.zzm();
        int zzh = kb0.zzh();
        Object f = zzm.mo32145o() ? null : zzm.mo32135f(zzh);
        int b = (kb0.zzp() || zzm.mo32145o()) ? -1 : zzm.mo31484d(zzh, gf0, false).mo32102b(xy3.m39691c(kb0.zzk()));
        for (int i = 0; i < p63.size(); i++) {
            c54 c542 = p63.get(i);
            if (m40597m(c542, f, kb0.zzp(), kb0.zze(), kb0.zzf(), b)) {
                return c542;
            }
        }
        if (p63.isEmpty() && c54 != null) {
            if (m40597m(c54, f, kb0.zzp(), kb0.zze(), kb0.zzf(), b)) {
                return c54;
            }
        }
        return null;
    }

    /* renamed from: k */
    private final void m40595k(s63<c54, gi0> s63, c54 c54, gi0 gi0) {
        if (c54 != null) {
            if (gi0.mo32133a(c54.f34474a) != -1) {
                s63.mo34664a(c54, gi0);
                return;
            }
            gi0 gi02 = this.f42841c.get(c54);
            if (gi02 != null) {
                s63.mo34664a(c54, gi02);
            }
        }
    }

    /* renamed from: l */
    private final void m40596l(gi0 gi0) {
        s63 s63 = new s63();
        if (this.f42840b.isEmpty()) {
            m40595k(s63, this.f42843e, gi0);
            if (!x33.m21118a(this.f42844f, this.f42843e)) {
                m40595k(s63, this.f42844f, gi0);
            }
            if (!x33.m21118a(this.f42842d, this.f42843e) && !x33.m21118a(this.f42842d, this.f42844f)) {
                m40595k(s63, this.f42842d, gi0);
            }
        } else {
            for (int i = 0; i < this.f42840b.size(); i++) {
                m40595k(s63, this.f42840b.get(i), gi0);
            }
            if (!this.f42840b.contains(this.f42842d)) {
                m40595k(s63, this.f42842d, gi0);
            }
        }
        this.f42841c = s63.mo34666c();
    }

    /* renamed from: m */
    private static boolean m40597m(c54 c54, Object obj, boolean z, int i, int i2, int i3) {
        if (!c54.f34474a.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(c54.f34475b == i && c54.f34476c == i2)) {
                return false;
            }
        } else if (!(c54.f34475b == -1 && c54.f34478e == i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final gi0 mo36148a(c54 c54) {
        return this.f42841c.get(c54);
    }

    /* renamed from: b */
    public final c54 mo36149b() {
        return this.f42842d;
    }

    /* renamed from: c */
    public final c54 mo36150c() {
        T t;
        T next;
        if (this.f42840b.isEmpty()) {
            return null;
        }
        p63<c54> p63 = this.f42840b;
        if (!(p63 instanceof List)) {
            Iterator<T> it = p63.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            t = next;
        } else if (!p63.isEmpty()) {
            t = p63.get(p63.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (c54) t;
    }

    /* renamed from: d */
    public final c54 mo36151d() {
        return this.f42843e;
    }

    /* renamed from: e */
    public final c54 mo36152e() {
        return this.f42844f;
    }

    /* renamed from: g */
    public final void mo36153g(kb0 kb0) {
        this.f42842d = m40594j(kb0, this.f42840b, this.f42843e, this.f42839a);
    }

    /* renamed from: h */
    public final void mo36154h(List<c54> list, c54 c54, kb0 kb0) {
        this.f42840b = p63.m20824y(list);
        if (!list.isEmpty()) {
            this.f42843e = list.get(0);
            Objects.requireNonNull(c54);
            this.f42844f = c54;
        }
        if (this.f42842d == null) {
            this.f42842d = m40594j(kb0, this.f42840b, this.f42843e, this.f42839a);
        }
        m40596l(kb0.zzm());
    }

    /* renamed from: i */
    public final void mo36155i(kb0 kb0) {
        this.f42842d = m40594j(kb0, this.f42840b, this.f42843e, this.f42839a);
        m40596l(kb0.zzm());
    }
}
