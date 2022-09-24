package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qc4 {

    /* renamed from: a */
    public int f37974a;

    /* renamed from: b */
    public String f37975b;

    /* renamed from: c */
    public int f37976c;

    /* renamed from: d */
    public int f37977d;

    /* renamed from: e */
    public int f37978e;

    /* renamed from: f */
    public int f37979f;

    /* renamed from: g */
    public int f37980g;

    /* renamed from: a */
    public final boolean mo34320a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!rc4.m37033m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f37974a = i2;
        this.f37975b = rc4.f38624a[3 - i3];
        int i8 = rc4.f38625b[i5];
        this.f37977d = i8;
        int i9 = 2;
        if (i2 == 2) {
            this.f37977d = i8 / 2;
        } else if (i2 == 0) {
            this.f37977d = i8 / 4;
        }
        int i10 = (i >>> 9) & 1;
        this.f37980g = rc4.m37032l(i2, i3);
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = rc4.f38626c[i4 - 1];
            } else {
                i7 = rc4.f38627d[i4 - 1];
            }
            this.f37979f = i7;
            this.f37976c = (((i7 * 12) / this.f37977d) + i10) * 4;
        } else {
            int i11 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = rc4.f38628e[i4 - 1];
                } else {
                    i6 = rc4.f38629f[i4 - 1];
                }
                this.f37979f = i6;
                this.f37976c = ((i6 * 144) / this.f37977d) + i10;
            } else {
                int i12 = rc4.f38630g[i4 - 1];
                this.f37979f = i12;
                if (i3 == 1) {
                    i11 = 72;
                }
                this.f37976c = ((i11 * i12) / this.f37977d) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.f37978e = i9;
        return true;
    }
}
