package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pe */
/* compiled from: IMASDK */
public final class C4255pe {

    /* renamed from: a */
    public int f18310a;

    /* renamed from: b */
    public String f18311b;

    /* renamed from: c */
    public int f18312c;

    /* renamed from: d */
    public int f18313d;

    /* renamed from: e */
    public int f18314e;

    /* renamed from: f */
    public int f18315f;

    /* renamed from: g */
    public int f18316g;

    /* renamed from: a */
    public final boolean mo16493a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!C4256pf.m18520l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f18310a = i2;
        this.f18311b = C4256pf.f18317a[3 - i3];
        int i8 = C4256pf.f18318b[i5];
        this.f18313d = i8;
        int i9 = 2;
        if (i2 == 2) {
            this.f18313d = i8 / 2;
        } else if (i2 == 0) {
            this.f18313d = i8 / 4;
        }
        int i10 = (i >>> 9) & 1;
        this.f18316g = C4256pf.m18521m(i2, i3);
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = C4256pf.f18319c[i4 - 1];
            } else {
                i7 = C4256pf.f18320d[i4 - 1];
            }
            this.f18315f = i7;
            this.f18312c = (((i7 * 12) / this.f18313d) + i10) * 4;
        } else {
            int i11 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = C4256pf.f18321e[i4 - 1];
                } else {
                    i6 = C4256pf.f18322f[i4 - 1];
                }
                this.f18315f = i6;
                this.f18312c = ((i6 * 144) / this.f18313d) + i10;
            } else {
                int i12 = C4256pf.f18323g[i4 - 1];
                this.f18315f = i12;
                if (i3 == 1) {
                    i11 = 72;
                }
                this.f18312c = ((i11 * i12) / this.f18313d) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.f18314e = i9;
        return true;
    }
}
