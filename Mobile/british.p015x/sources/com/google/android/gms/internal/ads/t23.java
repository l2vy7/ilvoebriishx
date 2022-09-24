package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class t23 extends gi0 {

    /* renamed from: c */
    private final int f39261c;

    /* renamed from: d */
    private final u64 f39262d;

    public t23(boolean z, u64 u64, byte[] bArr) {
        this.f39262d = u64;
        this.f39261c = u64.mo35133c();
    }

    /* renamed from: w */
    private final int m37649w(int i, boolean z) {
        if (z) {
            return this.f39262d.mo35134d(i);
        }
        if (i >= this.f39261c - 1) {
            return -1;
        }
        return i + 1;
    }

    /* renamed from: x */
    private final int m37650x(int i, boolean z) {
        if (z) {
            return this.f39262d.mo35135e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: a */
    public final int mo32133a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo31952p(obj2);
        if (p == -1 || (a = mo31957u(p).mo32133a(obj3)) == -1) {
            return -1;
        }
        return mo31955s(p) + a;
    }

    /* renamed from: d */
    public final gf0 mo31484d(int i, gf0 gf0, boolean z) {
        int q = mo31953q(i);
        int t = mo31956t(q);
        mo31957u(q).mo31484d(i - mo31955s(q), gf0, z);
        gf0.f32286c += t;
        if (z) {
            Object v = mo31958v(q);
            Object obj = gf0.f32285b;
            Objects.requireNonNull(obj);
            gf0.f32285b = Pair.create(v, obj);
        }
        return gf0;
    }

    /* renamed from: e */
    public final gh0 mo31485e(int i, gh0 gh0, long j) {
        int r = mo31954r(i);
        int t = mo31956t(r);
        int s = mo31955s(r);
        mo31957u(r).mo31485e(i - t, gh0, j);
        Object v = mo31958v(r);
        if (!gh0.f32305o.equals(gh0.f32309a)) {
            v = Pair.create(v, gh0.f32309a);
        }
        gh0.f32309a = v;
        gh0.f32321m += s;
        gh0.f32322n += s;
        return gh0;
    }

    /* renamed from: f */
    public final Object mo32135f(int i) {
        int q = mo31953q(i);
        return Pair.create(mo31958v(q), mo31957u(q).mo32135f(i - mo31955s(q)));
    }

    /* renamed from: g */
    public final int mo32136g(boolean z) {
        if (this.f39261c == 0) {
            return -1;
        }
        int a = z ? this.f39262d.mo35131a() : 0;
        while (mo31957u(a).mo32145o()) {
            a = m37649w(a, z);
            if (a == -1) {
                return -1;
            }
        }
        return mo31956t(a) + mo31957u(a).mo32136g(z);
    }

    /* renamed from: h */
    public final int mo32137h(boolean z) {
        int i = this.f39261c;
        if (i == 0) {
            return -1;
        }
        int b = z ? this.f39262d.mo35132b() : i - 1;
        while (mo31957u(b).mo32145o()) {
            b = m37650x(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return mo31956t(b) + mo31957u(b).mo32137h(z);
    }

    /* renamed from: j */
    public final int mo32140j(int i, int i2, boolean z) {
        int r = mo31954r(i);
        int t = mo31956t(r);
        int j = mo31957u(r).mo32140j(i - t, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return t + j;
        }
        int w = m37649w(r, z);
        while (w != -1 && mo31957u(w).mo32145o()) {
            w = m37649w(w, z);
        }
        if (w != -1) {
            return mo31956t(w) + mo31957u(w).mo32136g(z);
        }
        if (i2 == 2) {
            return mo32136g(z);
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo32141k(int i, int i2, boolean z) {
        int r = mo31954r(i);
        int t = mo31956t(r);
        int k = mo31957u(r).mo32141k(i - t, 0, false);
        if (k != -1) {
            return t + k;
        }
        int x = m37650x(r, false);
        while (x != -1 && mo31957u(x).mo32145o()) {
            x = m37650x(x, false);
        }
        if (x != -1) {
            return mo31956t(x) + mo31957u(x).mo32137h(false);
        }
        return -1;
    }

    /* renamed from: n */
    public final gf0 mo32144n(Object obj, gf0 gf0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo31952p(obj2);
        int t = mo31956t(p);
        mo31957u(p).mo32144n(obj3, gf0);
        gf0.f32286c += t;
        gf0.f32285b = obj;
        return gf0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo31952p(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo31953q(int i);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo31954r(int i);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract int mo31955s(int i);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo31956t(int i);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract gi0 mo31957u(int i);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo31958v(int i);
}
