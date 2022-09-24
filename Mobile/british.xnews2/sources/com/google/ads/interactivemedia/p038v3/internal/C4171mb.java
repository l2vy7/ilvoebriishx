package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Pair;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mb */
/* compiled from: IMASDK */
public abstract class C4171mb {

    /* renamed from: a */
    public static final C4171mb f17942a = new C4167ly();

    /* renamed from: A */
    public final C4168lz mo16330A(int i, C4168lz lzVar) {
        return mo13289h(i, lzVar, false);
    }

    /* renamed from: c */
    public int mo13285c(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo13286d(z) ? mo13287e(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo13286d(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: d */
    public int mo13286d(boolean z) {
        if (mo16333v()) {
            return -1;
        }
        return mo13271t() - 1;
    }

    /* renamed from: e */
    public int mo13287e(boolean z) {
        return mo16333v() ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4171mb)) {
            return false;
        }
        C4171mb mbVar = (C4171mb) obj;
        if (mbVar.mo13271t() != mo13271t() || mbVar.mo13272u() != mo13272u()) {
            return false;
        }
        C4170ma maVar = new C4170ma();
        C4168lz lzVar = new C4168lz();
        C4170ma maVar2 = new C4170ma();
        C4168lz lzVar2 = new C4168lz();
        for (int i = 0; i < mo13271t(); i++) {
            if (!mo16334w(i, maVar).equals(mbVar.mo16334w(i, maVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo13272u(); i2++) {
            if (!mo13289h(i2, lzVar, true).equals(mbVar.mo13289h(i2, lzVar2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract C4170ma mo13288f(int i, C4170ma maVar, long j);

    /* renamed from: g */
    public C4168lz mo15925g(Object obj, C4168lz lzVar) {
        return mo13289h(mo13290i(obj), lzVar, true);
    }

    /* renamed from: h */
    public abstract C4168lz mo13289h(int i, C4168lz lzVar, boolean z);

    public final int hashCode() {
        C4170ma maVar = new C4170ma();
        C4168lz lzVar = new C4168lz();
        int t = mo13271t() + 217;
        for (int i = 0; i < mo13271t(); i++) {
            t = (t * 31) + mo16334w(i, maVar).hashCode();
        }
        int u = (t * 31) + mo13272u();
        for (int i2 = 0; i2 < mo13272u(); i2++) {
            u = (u * 31) + mo13289h(i2, lzVar, true).hashCode();
        }
        return u;
    }

    /* renamed from: i */
    public abstract int mo13290i(Object obj);

    /* renamed from: j */
    public abstract Object mo13291j(int i);

    /* renamed from: r */
    public int mo13292r(int i) {
        if (i == mo13287e(false)) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: t */
    public abstract int mo13271t();

    /* renamed from: u */
    public abstract int mo13272u();

    /* renamed from: v */
    public final boolean mo16333v() {
        return mo13271t() == 0;
    }

    /* renamed from: w */
    public final C4170ma mo16334w(int i, C4170ma maVar) {
        return mo13288f(i, maVar, 0);
    }

    /* renamed from: x */
    public final int mo16335x(int i, C4168lz lzVar, C4170ma maVar, int i2, boolean z) {
        int i3 = mo16330A(i, lzVar).f17914c;
        if (mo16334w(i3, maVar).f17940p != i) {
            return i + 1;
        }
        int c = mo13285c(i3, i2, z);
        if (c == -1) {
            return -1;
        }
        return mo16334w(c, maVar).f17939o;
    }

    /* renamed from: y */
    public final Pair<Object, Long> mo16336y(C4170ma maVar, C4168lz lzVar, int i, long j) {
        Pair<Object, Long> z = mo16337z(maVar, lzVar, i, j, 0);
        aup.m14890u(z);
        return z;
    }

    /* renamed from: z */
    public final Pair<Object, Long> mo16337z(C4170ma maVar, C4168lz lzVar, int i, long j, long j2) {
        aup.m14891v(i, mo13271t());
        mo13288f(i, maVar, j2);
        if (j == C6540C.TIME_UNSET) {
            j = maVar.f17937m;
            if (j == C6540C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = maVar.f17939o;
        mo16330A(i2, lzVar);
        while (i2 < maVar.f17940p && lzVar.f17916e != j) {
            int i3 = i2 + 1;
            if (mo16330A(i3, lzVar).f17916e > j) {
                break;
            }
            i2 = i3;
        }
        mo13289h(i2, lzVar, true);
        long j3 = lzVar.f17916e;
        Object obj = lzVar.f17913b;
        aup.m14890u(obj);
        return Pair.create(obj, Long.valueOf(j - j3));
    }
}
