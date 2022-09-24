package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vr2 {

    /* renamed from: a */
    private byte[] f40525a;

    /* renamed from: b */
    private int f40526b;

    /* renamed from: c */
    private int f40527c;

    /* renamed from: d */
    private int f40528d = 0;

    public vr2(byte[] bArr, int i, int i2) {
        this.f40525a = bArr;
        this.f40527c = i;
        this.f40526b = i2;
        m38898h();
    }

    /* renamed from: g */
    private final int m38897g() {
        int i = 0;
        int i2 = 0;
        while (!mo35480f()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo35475a(i2);
        }
        return i3 + i;
    }

    /* renamed from: h */
    private final void m38898h() {
        int i;
        int i2 = this.f40527c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f40526b) && !(i2 == i && this.f40528d == 0))) {
            z = false;
        }
        nu1.m20747f(z);
    }

    /* renamed from: i */
    private final boolean m38899i(int i) {
        if (i < 2 || i >= this.f40526b) {
            return false;
        }
        byte[] bArr = this.f40525a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo35475a(int i) {
        int i2;
        int i3;
        this.f40528d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f40528d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f40528d = i5;
            byte[] bArr = this.f40525a;
            int i6 = this.f40527c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != m38899i(i6 + 1)) {
                i3 = 1;
            }
            this.f40527c = i6 + i3;
        }
        byte[] bArr2 = this.f40525a;
        int i7 = this.f40527c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f40528d = 0;
            if (true != m38899i(i7 + 1)) {
                i3 = 1;
            }
            this.f40527c = i7 + i3;
        }
        m38898h();
        return i8;
    }

    /* renamed from: b */
    public final int mo35476b() {
        int g = m38897g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }

    /* renamed from: c */
    public final int mo35477c() {
        return m38897g();
    }

    /* renamed from: d */
    public final void mo35478d() {
        int i = 1;
        int i2 = this.f40528d + 1;
        this.f40528d = i2;
        if (i2 == 8) {
            this.f40528d = 0;
            int i3 = this.f40527c;
            if (true == m38899i(i3 + 1)) {
                i = 2;
            }
            this.f40527c = i3 + i;
        }
        m38898h();
    }

    /* renamed from: e */
    public final void mo35479e(int i) {
        int i2 = this.f40527c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f40527c = i4;
        int i5 = this.f40528d + (i - (i3 * 8));
        this.f40528d = i5;
        if (i5 > 7) {
            this.f40527c = i4 + 1;
            this.f40528d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f40527c) {
                m38898h();
                return;
            } else if (m38899i(i2)) {
                this.f40527c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo35480f() {
        boolean z = (this.f40525a[this.f40527c] & (128 >> this.f40528d)) != 0;
        mo35478d();
        return z;
    }
}
