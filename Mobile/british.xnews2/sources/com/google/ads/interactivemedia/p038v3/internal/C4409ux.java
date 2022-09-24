package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ux */
/* compiled from: IMASDK */
final class C4409ux {

    /* renamed from: a */
    private final C4410uy f19110a = new C4410uy();

    /* renamed from: b */
    private final alw f19111b = new alw(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c */
    private int f19112c = -1;

    /* renamed from: d */
    private int f19113d;

    /* renamed from: e */
    private boolean f19114e;

    C4409ux() {
    }

    /* renamed from: f */
    private final int m19180f(int i) {
        int i2;
        int i3 = 0;
        this.f19113d = 0;
        do {
            int i4 = this.f19113d;
            int i5 = i + i4;
            C4410uy uyVar = this.f19110a;
            if (i5 >= uyVar.f19118d) {
                break;
            }
            int[] iArr = uyVar.f19121g;
            this.f19113d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final void mo16692a() {
        this.f19110a.mo16697a();
        this.f19111b.mo13943a(0);
        this.f19112c = -1;
        this.f19114e = false;
    }

    /* renamed from: b */
    public final boolean mo16693b(C4307rc rcVar) throws IOException {
        aup.m14887r(true);
        if (this.f19114e) {
            this.f19114e = false;
            this.f19111b.mo13943a(0);
        }
        while (!this.f19114e) {
            int i = this.f19112c;
            if (i < 0) {
                if (!this.f19110a.mo16698b(rcVar) || !this.f19110a.mo16700d(rcVar, true)) {
                    return false;
                }
                C4410uy uyVar = this.f19110a;
                int i2 = uyVar.f19119e;
                if ((uyVar.f19116b & 1) == 1 && this.f19111b.mo13948f() == 0) {
                    i2 += m19180f(0);
                    i = this.f19113d;
                } else {
                    i = 0;
                }
                rcVar.mo16597d(i2);
                this.f19112c = i;
            }
            int f = m19180f(i);
            int i3 = this.f19112c + this.f19113d;
            if (f > 0) {
                alw alw = this.f19111b;
                alw.mo13946d(alw.mo13948f() + f);
                rcVar.mo16596c(this.f19111b.mo13952j(), this.f19111b.mo13948f(), f);
                alw alw2 = this.f19111b;
                alw2.mo13949g(alw2.mo13948f() + f);
                this.f19114e = this.f19110a.f19121g[i3 + -1] != 255;
            }
            if (i3 == this.f19110a.f19118d) {
                i3 = -1;
            }
            this.f19112c = i3;
        }
        return true;
    }

    /* renamed from: c */
    public final C4410uy mo16694c() {
        return this.f19110a;
    }

    /* renamed from: d */
    public final alw mo16695d() {
        return this.f19111b;
    }

    /* renamed from: e */
    public final void mo16696e() {
        if (this.f19111b.mo13952j().length != 65025) {
            alw alw = this.f19111b;
            alw.mo13945c(Arrays.copyOf(alw.mo13952j(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.f19111b.mo13948f())), this.f19111b.mo13948f());
        }
    }
}
