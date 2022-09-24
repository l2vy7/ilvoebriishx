package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uc */
/* compiled from: IMASDK */
final class C4388uc {

    /* renamed from: a */
    public final C4327rw f18959a;

    /* renamed from: b */
    public final C4401up f18960b = new C4401up();

    /* renamed from: c */
    public final alw f18961c = new alw();

    /* renamed from: d */
    public C4402uq f18962d;

    /* renamed from: e */
    public C4383ty f18963e;

    /* renamed from: f */
    public int f18964f;

    /* renamed from: g */
    public int f18965g;

    /* renamed from: h */
    public int f18966h;

    /* renamed from: i */
    public int f18967i;

    /* renamed from: j */
    private final alw f18968j = new alw(1);

    /* renamed from: k */
    private final alw f18969k = new alw();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f18970l;

    public C4388uc(C4327rw rwVar, C4402uq uqVar, C4383ty tyVar) {
        this.f18959a = rwVar;
        this.f18962d = uqVar;
        this.f18963e = tyVar;
        mo16670a(uqVar, tyVar);
    }

    /* renamed from: a */
    public final void mo16670a(C4402uq uqVar, C4383ty tyVar) {
        this.f18962d = uqVar;
        this.f18963e = tyVar;
        this.f18959a.mo13403a(uqVar.f19077a.f19048f);
        mo16671b();
    }

    /* renamed from: b */
    public final void mo16671b() {
        C4401up upVar = this.f18960b;
        upVar.f19062d = 0;
        upVar.f19075q = 0;
        upVar.f19076r = false;
        upVar.f19070l = false;
        upVar.f19074p = false;
        upVar.f19072n = null;
        this.f18964f = 0;
        this.f18966h = 0;
        this.f18965g = 0;
        this.f18967i = 0;
        this.f18970l = false;
    }

    /* renamed from: c */
    public final long mo16672c() {
        if (!this.f18970l) {
            return this.f18962d.f19082f[this.f18964f];
        }
        return this.f18960b.mo16681b(this.f18964f);
    }

    /* renamed from: d */
    public final long mo16673d() {
        if (!this.f18970l) {
            return this.f18962d.f19079c[this.f18964f];
        }
        return this.f18960b.f19064f[this.f18966h];
    }

    /* renamed from: e */
    public final int mo16674e() {
        if (!this.f18970l) {
            return this.f18962d.f19080d[this.f18964f];
        }
        return this.f18960b.f19066h[this.f18964f];
    }

    /* renamed from: f */
    public final int mo16675f() {
        int i;
        if (!this.f18970l) {
            i = this.f18962d.f19083g[this.f18964f];
        } else {
            i = this.f18960b.f19069k[this.f18964f] ? 1 : 0;
        }
        return mo16678i() != null ? i | 1073741824 : i;
    }

    /* renamed from: g */
    public final boolean mo16676g() {
        this.f18964f++;
        if (!this.f18970l) {
            return false;
        }
        int i = this.f18965g + 1;
        this.f18965g = i;
        int[] iArr = this.f18960b.f19065g;
        int i2 = this.f18966h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f18966h = i2 + 1;
        this.f18965g = 0;
        return false;
    }

    /* renamed from: h */
    public final int mo16677h(int i, int i2) {
        alw alw;
        C4400uo i3 = mo16678i();
        if (i3 == null) {
            return 0;
        }
        int i4 = i3.f19057d;
        if (i4 != 0) {
            alw = this.f18960b.f19073o;
        } else {
            byte[] bArr = (byte[]) amm.m14236f(i3.f19058e);
            alw alw2 = this.f18969k;
            int length = bArr.length;
            alw2.mo13945c(bArr, length);
            alw = this.f18969k;
            i4 = length;
        }
        boolean c = this.f18960b.mo16682c(this.f18964f);
        boolean z = c || i2 != 0;
        this.f18968j.mo13952j()[0] = (byte) ((true != z ? 0 : 128) | i4);
        this.f18968j.mo13951i(0);
        this.f18959a.mo13408f(this.f18968j, 1);
        this.f18959a.mo13408f(alw, i4);
        if (!z) {
            return i4 + 1;
        }
        if (!c) {
            this.f18961c.mo13943a(8);
            byte[] j = this.f18961c.mo13952j();
            j[0] = 0;
            j[1] = 1;
            j[2] = 0;
            j[3] = (byte) i2;
            j[4] = (byte) ((i >> 24) & 255);
            j[5] = (byte) ((i >> 16) & 255);
            j[6] = (byte) ((i >> 8) & 255);
            j[7] = (byte) (i & 255);
            this.f18959a.mo13408f(this.f18961c, 8);
            return i4 + 9;
        }
        alw alw3 = this.f18960b.f19073o;
        int p = alw3.mo13958p();
        alw3.mo13954l(-2);
        int i5 = (p * 6) + 2;
        if (i2 != 0) {
            this.f18961c.mo13943a(i5);
            byte[] j2 = this.f18961c.mo13952j();
            alw3.mo13956n(j2, 0, i5);
            int i6 = (((j2[2] & 255) << 8) | (j2[3] & 255)) + i2;
            j2[2] = (byte) ((i6 >> 8) & 255);
            j2[3] = (byte) (i6 & 255);
            alw3 = this.f18961c;
        }
        this.f18959a.mo13408f(alw3, i5);
        return i4 + 1 + i5;
    }

    /* renamed from: i */
    public final C4400uo mo16678i() {
        if (!this.f18970l) {
            return null;
        }
        C4401up upVar = this.f18960b;
        C4383ty tyVar = upVar.f19059a;
        int i = amm.f15298a;
        int i2 = tyVar.f18862a;
        C4400uo uoVar = upVar.f19072n;
        if (uoVar == null) {
            uoVar = this.f18962d.f19077a.mo16679a(i2);
        }
        if (uoVar == null || !uoVar.f19054a) {
            return null;
        }
        return uoVar;
    }
}
