package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8282w0 {

    /* renamed from: a */
    public final ad4 f40634a;

    /* renamed from: b */
    public final C7851k1 f40635b = new C7851k1();

    /* renamed from: c */
    public final uq2 f40636c = new uq2();

    /* renamed from: d */
    public C7888l1 f40637d;

    /* renamed from: e */
    public C8140s0 f40638e;

    /* renamed from: f */
    public int f40639f;

    /* renamed from: g */
    public int f40640g;

    /* renamed from: h */
    public int f40641h;

    /* renamed from: i */
    public int f40642i;

    /* renamed from: j */
    private final uq2 f40643j = new uq2(1);

    /* renamed from: k */
    private final uq2 f40644k = new uq2();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f40645l;

    public C8282w0(ad4 ad4, C7888l1 l1Var, C8140s0 s0Var) {
        this.f40634a = ad4;
        this.f40637d = l1Var;
        this.f40638e = s0Var;
        mo35533h(l1Var, s0Var);
    }

    /* renamed from: a */
    public final int mo35527a() {
        int i;
        if (!this.f40645l) {
            i = this.f40637d.f34781g[this.f40639f];
        } else {
            i = this.f40635b.f34110k[this.f40639f] ? 1 : 0;
        }
        return mo35532f() != null ? i | 1073741824 : i;
    }

    /* renamed from: b */
    public final int mo35528b() {
        if (!this.f40645l) {
            return this.f40637d.f34778d[this.f40639f];
        }
        return this.f40635b.f34107h[this.f40639f];
    }

    /* renamed from: c */
    public final int mo35529c(int i, int i2) {
        uq2 uq2;
        C7815j1 f = mo35532f();
        if (f == null) {
            return 0;
        }
        int i3 = f.f33695d;
        if (i3 != 0) {
            uq2 = this.f40635b.f34114o;
        } else {
            byte[] bArr = (byte[]) d13.m20300c(f.f33696e);
            uq2 uq22 = this.f40644k;
            int length = bArr.length;
            uq22.mo35234d(bArr, length);
            uq2 = this.f40644k;
            i3 = length;
        }
        boolean c = this.f40635b.mo33012c(this.f40639f);
        boolean z = c || i2 != 0;
        this.f40643j.mo35238h()[0] = (byte) ((true != z ? 0 : 128) | i3);
        this.f40643j.mo35236f(0);
        this.f40634a.mo30359f(this.f40643j, 1, 1);
        this.f40634a.mo30359f(uq2, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!c) {
            this.f40636c.mo35233c(8);
            byte[] h = this.f40636c.mo35238h();
            h[0] = 0;
            h[1] = 1;
            h[2] = 0;
            h[3] = (byte) i2;
            h[4] = (byte) ((i >> 24) & 255);
            h[5] = (byte) ((i >> 16) & 255);
            h[6] = (byte) ((i >> 8) & 255);
            h[7] = (byte) (i & 255);
            this.f40634a.mo30359f(this.f40636c, 8, 1);
            return i3 + 9;
        }
        uq2 uq23 = this.f40635b.f34114o;
        int w = uq23.mo35253w();
        uq23.mo35237g(-2);
        int i4 = (w * 6) + 2;
        if (i2 != 0) {
            this.f40636c.mo35233c(i4);
            byte[] h2 = this.f40636c.mo35238h();
            uq23.mo35232b(h2, 0, i4);
            int i5 = (((h2[2] & 255) << 8) | (h2[3] & 255)) + i2;
            h2[2] = (byte) ((i5 >> 8) & 255);
            h2[3] = (byte) (i5 & 255);
            uq23 = this.f40636c;
        }
        this.f40634a.mo30359f(uq23, i4, 1);
        return i3 + 1 + i4;
    }

    /* renamed from: d */
    public final long mo35530d() {
        if (!this.f40645l) {
            return this.f40637d.f34777c[this.f40639f];
        }
        return this.f40635b.f34105f[this.f40641h];
    }

    /* renamed from: e */
    public final long mo35531e() {
        if (!this.f40645l) {
            return this.f40637d.f34780f[this.f40639f];
        }
        return this.f40635b.mo33010a(this.f40639f);
    }

    /* renamed from: f */
    public final C7815j1 mo35532f() {
        if (!this.f40645l) {
            return null;
        }
        C7851k1 k1Var = this.f40635b;
        C8140s0 s0Var = k1Var.f34100a;
        int i = d13.f20195a;
        int i2 = s0Var.f38821a;
        C7815j1 j1Var = k1Var.f34113n;
        if (j1Var == null) {
            j1Var = this.f40637d.f34775a.mo32520a(i2);
        }
        if (j1Var == null || !j1Var.f33692a) {
            return null;
        }
        return j1Var;
    }

    /* renamed from: h */
    public final void mo35533h(C7888l1 l1Var, C8140s0 s0Var) {
        this.f40637d = l1Var;
        this.f40638e = s0Var;
        this.f40634a.mo30354a(l1Var.f34775a.f33021f);
        mo35534i();
    }

    /* renamed from: i */
    public final void mo35534i() {
        C7851k1 k1Var = this.f40635b;
        k1Var.f34103d = 0;
        k1Var.f34116q = 0;
        k1Var.f34117r = false;
        k1Var.f34111l = false;
        k1Var.f34115p = false;
        k1Var.f34113n = null;
        this.f40639f = 0;
        this.f40641h = 0;
        this.f40640g = 0;
        this.f40642i = 0;
        this.f40645l = false;
    }

    /* renamed from: k */
    public final boolean mo35535k() {
        this.f40639f++;
        if (!this.f40645l) {
            return false;
        }
        int i = this.f40640g + 1;
        this.f40640g = i;
        int[] iArr = this.f40635b.f34106g;
        int i2 = this.f40641h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f40641h = i2 + 1;
        this.f40640g = 0;
        return false;
    }
}
