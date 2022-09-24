package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alv */
/* compiled from: IMASDK */
public final class alv {

    /* renamed from: a */
    public byte[] f15245a;

    /* renamed from: b */
    private int f15246b;

    /* renamed from: c */
    private int f15247c;

    /* renamed from: d */
    private int f15248d;

    public alv() {
        this.f15245a = amm.f15303f;
    }

    /* renamed from: n */
    private final void m14058n() {
        int i;
        int i2 = this.f15246b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f15248d) && !(i2 == i && this.f15247c == 0))) {
            z = false;
        }
        aup.m14887r(z);
    }

    /* renamed from: a */
    public final void mo13919a(byte[] bArr) {
        mo13920b(bArr, bArr.length);
    }

    /* renamed from: b */
    public final void mo13920b(byte[] bArr, int i) {
        this.f15245a = bArr;
        this.f15246b = 0;
        this.f15247c = 0;
        this.f15248d = i;
    }

    /* renamed from: c */
    public final int mo13921c() {
        return ((this.f15248d - this.f15246b) * 8) - this.f15247c;
    }

    /* renamed from: d */
    public final int mo13922d() {
        return (this.f15246b * 8) + this.f15247c;
    }

    /* renamed from: e */
    public final void mo13923e(int i) {
        int i2 = i / 8;
        this.f15246b = i2;
        this.f15247c = i - (i2 * 8);
        m14058n();
    }

    /* renamed from: f */
    public final void mo13924f() {
        int i = this.f15247c + 1;
        this.f15247c = i;
        if (i == 8) {
            this.f15247c = 0;
            this.f15246b++;
        }
        m14058n();
    }

    /* renamed from: g */
    public final void mo13925g(int i) {
        int i2 = i / 8;
        int i3 = this.f15246b + i2;
        this.f15246b = i3;
        int i4 = this.f15247c + (i - (i2 * 8));
        this.f15247c = i4;
        if (i4 > 7) {
            this.f15246b = i3 + 1;
            this.f15247c = i4 - 8;
        }
        m14058n();
    }

    /* renamed from: h */
    public final boolean mo13926h() {
        boolean z = (this.f15245a[this.f15246b] & (128 >> this.f15247c)) != 0;
        mo13924f();
        return z;
    }

    /* renamed from: i */
    public final int mo13927i(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f15247c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f15247c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f15247c = i4;
            byte[] bArr = this.f15245a;
            int i5 = this.f15246b;
            this.f15246b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f15245a;
        int i6 = this.f15246b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f15247c = 0;
            this.f15246b = i6 + 1;
        }
        m14058n();
        return i7;
    }

    /* renamed from: j */
    public final void mo13928j() {
        if (this.f15247c != 0) {
            this.f15247c = 0;
            this.f15246b++;
            m14058n();
        }
    }

    /* renamed from: k */
    public final void mo13929k(int i) {
        aup.m14887r(this.f15247c == 0);
        this.f15246b += i;
        m14058n();
    }

    /* renamed from: l */
    public final void mo13930l(int i) {
        int i2 = i & 16383;
        int min = Math.min(8 - this.f15247c, 14);
        int i3 = this.f15247c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f15245a;
        int i5 = this.f15246b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - min;
        bArr[i5] = (byte) (b | ((i2 >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            i6 -= 8;
            this.f15245a[i7] = (byte) (i2 >>> i6);
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f15245a;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | b2);
        mo13925g(14);
        m14058n();
    }

    /* renamed from: m */
    public final void mo13931m(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f15245a;
            int i4 = this.f15246b;
            int i5 = i4 + 1;
            this.f15246b = i5;
            byte b = bArr2[i4];
            int i6 = this.f15247c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.f15247c;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.f15245a;
                int i9 = this.f15246b;
                this.f15246b = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
            }
            int i10 = i8 + i7;
            this.f15247c = i10;
            byte[] bArr4 = this.f15245a;
            int i11 = this.f15246b;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
            if (i10 == 8) {
                this.f15247c = 0;
                this.f15246b = i11 + 1;
            }
            m14058n();
        }
    }

    public alv(byte[] bArr) {
        int length = bArr.length;
        this.f15245a = bArr;
        this.f15248d = length;
    }
}
