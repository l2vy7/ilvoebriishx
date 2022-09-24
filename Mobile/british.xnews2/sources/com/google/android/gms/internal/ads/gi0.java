package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class gi0 {

    /* renamed from: a */
    public static final gi0 f32342a = new md0();

    /* renamed from: b */
    public static final wx3<gi0> f32343b = lc0.f34984a;

    protected gi0() {
    }

    /* renamed from: a */
    public abstract int mo32133a(Object obj);

    /* renamed from: b */
    public abstract int mo31950b();

    /* renamed from: c */
    public abstract int mo31951c();

    /* renamed from: d */
    public abstract gf0 mo31484d(int i, gf0 gf0, boolean z);

    /* renamed from: e */
    public abstract gh0 mo31485e(int i, gh0 gh0, long j);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi0)) {
            return false;
        }
        gi0 gi0 = (gi0) obj;
        if (gi0.mo31951c() != mo31951c() || gi0.mo31950b() != mo31950b()) {
            return false;
        }
        gh0 gh0 = new gh0();
        gf0 gf0 = new gf0();
        gh0 gh02 = new gh0();
        gf0 gf02 = new gf0();
        for (int i = 0; i < mo31951c(); i++) {
            if (!mo31485e(i, gh0, 0).equals(gi0.mo31485e(i, gh02, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo31950b(); i2++) {
            if (!mo31484d(i2, gf0, true).equals(gi0.mo31484d(i2, gf02, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract Object mo32135f(int i);

    /* renamed from: g */
    public int mo32136g(boolean z) {
        return mo32145o() ? -1 : 0;
    }

    /* renamed from: h */
    public int mo32137h(boolean z) {
        if (mo32145o()) {
            return -1;
        }
        return mo31951c() - 1;
    }

    public final int hashCode() {
        gh0 gh0 = new gh0();
        gf0 gf0 = new gf0();
        int c = mo31951c() + 217;
        for (int i = 0; i < mo31951c(); i++) {
            c = (c * 31) + mo31485e(i, gh0, 0).hashCode();
        }
        int b = (c * 31) + mo31950b();
        for (int i2 = 0; i2 < mo31950b(); i2++) {
            b = (b * 31) + mo31484d(i2, gf0, true).hashCode();
        }
        return b;
    }

    /* renamed from: i */
    public final int mo32139i(int i, gf0 gf0, gh0 gh0, int i2, boolean z) {
        int i3 = mo31484d(i, gf0, false).f32286c;
        if (mo31485e(i3, gh0, 0).f32322n != i) {
            return i + 1;
        }
        int j = mo32140j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return mo31485e(j, gh0, 0).f32321m;
    }

    /* renamed from: j */
    public int mo32140j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo32137h(z) ? mo32136g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo32137h(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: k */
    public int mo32141k(int i, int i2, boolean z) {
        if (i == mo32136g(false)) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: l */
    public final Pair<Object, Long> mo32142l(gh0 gh0, gf0 gf0, int i, long j) {
        Pair<Object, Long> m = mo32143m(gh0, gf0, i, j, 0);
        Objects.requireNonNull(m);
        return m;
    }

    /* renamed from: m */
    public final Pair<Object, Long> mo32143m(gh0 gh0, gf0 gf0, int i, long j, long j2) {
        nu1.m20742a(i, 0, mo31951c());
        mo31485e(i, gh0, j2);
        if (j == C6540C.TIME_UNSET) {
            long j3 = gh0.f32319k;
            j = 0;
        }
        int i2 = gh0.f32321m;
        mo31484d(i2, gf0, false);
        while (i2 < gh0.f32322n) {
            long j4 = gf0.f32288e;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = mo31484d(i3, gf0, false).f32288e;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        mo31484d(i2, gf0, true);
        long j6 = gf0.f32288e;
        long j7 = gf0.f32287d;
        if (j7 != C6540C.TIME_UNSET) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0, j);
        Object obj = gf0.f32285b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public gf0 mo32144n(Object obj, gf0 gf0) {
        return mo31484d(mo32133a(obj), gf0, true);
    }

    /* renamed from: o */
    public final boolean mo32145o() {
        return mo31951c() == 0;
    }
}
