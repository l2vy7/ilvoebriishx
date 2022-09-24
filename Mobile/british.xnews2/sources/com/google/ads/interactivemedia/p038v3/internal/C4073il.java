package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Pair;

/* renamed from: com.google.ads.interactivemedia.v3.internal.il */
/* compiled from: IMASDK */
public abstract class C4073il extends C4171mb {

    /* renamed from: b */
    private final int f17430b;

    /* renamed from: c */
    private final ack f17431c;

    public C4073il(ack ack) {
        this.f17431c = ack;
        this.f17430b = ack.mo13429a();
    }

    /* renamed from: B */
    private final int m17383B(int i, boolean z) {
        if (z) {
            return this.f17431c.mo13431c(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: a */
    public static Object m17384a(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: b */
    public static Object m17385b(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: s */
    private final int m17386s(int i, boolean z) {
        if (z) {
            return this.f17431c.mo13430b(i);
        }
        if (i >= this.f17430b - 1) {
            return -1;
        }
        return i + 1;
    }

    /* renamed from: c */
    public final int mo13285c(int i, int i2, boolean z) {
        int l = mo13265l(i);
        int p = mo13269p(l);
        int c = mo13267n(l).mo13285c(i - p, i2 == 2 ? 0 : i2, z);
        if (c != -1) {
            return p + c;
        }
        int s = m17386s(l, z);
        while (s != -1 && mo13267n(s).mo16333v()) {
            s = m17386s(s, z);
        }
        if (s != -1) {
            return mo13269p(s) + mo13267n(s).mo13287e(z);
        }
        if (i2 == 2) {
            return mo13287e(z);
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo13286d(boolean z) {
        int i = this.f17430b;
        if (i == 0) {
            return -1;
        }
        int d = z ? this.f17431c.mo13432d() : i - 1;
        while (mo13267n(d).mo16333v()) {
            d = m17383B(d, z);
            if (d == -1) {
                return -1;
            }
        }
        return mo13269p(d) + mo13267n(d).mo13286d(z);
    }

    /* renamed from: e */
    public final int mo13287e(boolean z) {
        if (this.f17430b == 0) {
            return -1;
        }
        int e = z ? this.f17431c.mo13433e() : 0;
        while (mo13267n(e).mo16333v()) {
            e = m17386s(e, z);
            if (e == -1) {
                return -1;
            }
        }
        return mo13269p(e) + mo13267n(e).mo13287e(z);
    }

    /* renamed from: f */
    public final C4170ma mo13288f(int i, C4170ma maVar, long j) {
        int l = mo13265l(i);
        int p = mo13269p(l);
        int o = mo13268o(l);
        mo13267n(l).mo13288f(i - p, maVar, j);
        Object q = mo13270q(l);
        if (!C4170ma.f17924a.equals(maVar.f17926b)) {
            q = Pair.create(q, maVar.f17926b);
        }
        maVar.f17926b = q;
        maVar.f17939o += o;
        maVar.f17940p += o;
        return maVar;
    }

    /* renamed from: g */
    public final C4168lz mo15925g(Object obj, C4168lz lzVar) {
        Object a = m17384a(obj);
        Object b = m17385b(obj);
        int m = mo13266m(a);
        int p = mo13269p(m);
        mo13267n(m).mo15925g(b, lzVar);
        lzVar.f17914c += p;
        lzVar.f17913b = obj;
        return lzVar;
    }

    /* renamed from: h */
    public final C4168lz mo13289h(int i, C4168lz lzVar, boolean z) {
        int k = mo13264k(i);
        int p = mo13269p(k);
        mo13267n(k).mo13289h(i - mo13268o(k), lzVar, z);
        lzVar.f17914c += p;
        if (z) {
            Object q = mo13270q(k);
            Object obj = lzVar.f17913b;
            aup.m14890u(obj);
            lzVar.f17913b = Pair.create(q, obj);
        }
        return lzVar;
    }

    /* renamed from: i */
    public final int mo13290i(Object obj) {
        int i;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object a = m17384a(obj);
        Object b = m17385b(obj);
        int m = mo13266m(a);
        if (m == -1 || (i = mo13267n(m).mo13290i(b)) == -1) {
            return -1;
        }
        return mo13268o(m) + i;
    }

    /* renamed from: j */
    public final Object mo13291j(int i) {
        int k = mo13264k(i);
        return Pair.create(mo13270q(k), mo13267n(k).mo13291j(i - mo13268o(k)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo13264k(int i);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo13265l(int i);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo13266m(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C4171mb mo13267n(int i);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo13268o(int i);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo13269p(int i);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract Object mo13270q(int i);

    /* renamed from: r */
    public final int mo13292r(int i) {
        int l = mo13265l(i);
        int p = mo13269p(l);
        int r = mo13267n(l).mo13292r(i - p);
        if (r != -1) {
            return p + r;
        }
        int B = m17383B(l, false);
        while (B != -1 && mo13267n(B).mo16333v()) {
            B = m17383B(B, false);
        }
        if (B != -1) {
            return mo13269p(B) + mo13267n(B).mo13286d(false);
        }
        return -1;
    }
}
