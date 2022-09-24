package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tp2 {

    /* renamed from: a */
    public byte[] f39483a;

    /* renamed from: b */
    private int f39484b;

    /* renamed from: c */
    private int f39485c;

    /* renamed from: d */
    private int f39486d;

    public tp2() {
        this.f39483a = d13.f20200f;
    }

    public tp2(byte[] bArr, int i) {
        this.f39483a = bArr;
        this.f39486d = i;
    }

    /* renamed from: m */
    private final void m37934m() {
        int i;
        int i2 = this.f39484b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f39486d) && !(i2 == i && this.f39485c == 0))) {
            z = false;
        }
        nu1.m20747f(z);
    }

    /* renamed from: a */
    public final int mo35006a() {
        return ((this.f39486d - this.f39484b) * 8) - this.f39485c;
    }

    /* renamed from: b */
    public final int mo35007b() {
        return (this.f39484b * 8) + this.f39485c;
    }

    /* renamed from: c */
    public final int mo35008c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f39485c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f39485c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f39485c = i4;
            byte[] bArr = this.f39483a;
            int i5 = this.f39484b;
            this.f39484b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f39483a;
        int i6 = this.f39484b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f39485c = 0;
            this.f39484b = i6 + 1;
        }
        m37934m();
        return i7;
    }

    /* renamed from: d */
    public final void mo35009d() {
        if (this.f39485c != 0) {
            this.f39485c = 0;
            this.f39484b++;
            m37934m();
        }
    }

    /* renamed from: e */
    public final void mo35010e(int i, int i2) {
        int i3 = i & 16383;
        int min = Math.min(8 - this.f39485c, 14);
        int i4 = this.f39485c;
        int i5 = (8 - i4) - min;
        byte[] bArr = this.f39483a;
        int i6 = this.f39484b;
        byte b = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - min;
        bArr[i6] = (byte) (b | ((i3 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.f39483a[i8] = (byte) (i3 >>> i7);
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f39483a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i3 & ((1 << i7) - 1)) << i9) | b2);
        mo35015j(14);
        m37934m();
    }

    /* renamed from: f */
    public final void mo35011f(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f39483a;
            int i5 = this.f39484b;
            int i6 = i5 + 1;
            this.f39484b = i6;
            byte b = bArr2[i5];
            int i7 = this.f39485c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 != 0) {
            byte b3 = (byte) (bArr[i3] & (255 >> i8));
            bArr[i3] = b3;
            int i9 = this.f39485c;
            if (i9 + i8 > 8) {
                byte[] bArr3 = this.f39483a;
                int i10 = this.f39484b;
                this.f39484b = i10 + 1;
                b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
                bArr[i3] = b3;
                i9 -= 8;
            }
            int i11 = i9 + i8;
            this.f39485c = i11;
            byte[] bArr4 = this.f39483a;
            int i12 = this.f39484b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
            if (i11 == 8) {
                this.f39485c = 0;
                this.f39484b = i12 + 1;
            }
            m37934m();
        }
    }

    /* renamed from: g */
    public final void mo35012g(byte[] bArr, int i) {
        this.f39483a = bArr;
        this.f39484b = 0;
        this.f39485c = 0;
        this.f39486d = i;
    }

    /* renamed from: h */
    public final void mo35013h(int i) {
        int i2 = i / 8;
        this.f39484b = i2;
        this.f39485c = i - (i2 * 8);
        m37934m();
    }

    /* renamed from: i */
    public final void mo35014i() {
        int i = this.f39485c + 1;
        this.f39485c = i;
        if (i == 8) {
            this.f39485c = 0;
            this.f39484b++;
        }
        m37934m();
    }

    /* renamed from: j */
    public final void mo35015j(int i) {
        int i2 = i / 8;
        int i3 = this.f39484b + i2;
        this.f39484b = i3;
        int i4 = this.f39485c + (i - (i2 * 8));
        this.f39485c = i4;
        if (i4 > 7) {
            this.f39484b = i3 + 1;
            this.f39485c = i4 - 8;
        }
        m37934m();
    }

    /* renamed from: k */
    public final void mo35016k(int i) {
        nu1.m20747f(this.f39485c == 0);
        this.f39484b += i;
        m37934m();
    }

    /* renamed from: l */
    public final boolean mo35017l() {
        boolean z = (this.f39483a[this.f39484b] & (128 >> this.f39485c)) != 0;
        mo35014i();
        return z;
    }
}
