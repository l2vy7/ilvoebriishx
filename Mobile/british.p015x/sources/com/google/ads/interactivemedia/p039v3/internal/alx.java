package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alx */
/* compiled from: IMASDK */
public final class alx {

    /* renamed from: a */
    private byte[] f15252a;

    /* renamed from: b */
    private int f15253b;

    /* renamed from: c */
    private int f15254c;

    /* renamed from: d */
    private int f15255d;

    public alx(byte[] bArr, int i, int i2) {
        mo13969a(bArr, i, i2);
    }

    /* renamed from: j */
    private final int m14109j() {
        int i = 0;
        int i2 = 0;
        while (!mo13973e()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo13974f(i2);
        }
        return i3 + i;
    }

    /* renamed from: k */
    private final boolean m14110k(int i) {
        if (i < 2 || i >= this.f15253b) {
            return false;
        }
        byte[] bArr = this.f15252a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: l */
    private final void m14111l() {
        int i;
        int i2 = this.f15254c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f15253b) && !(i2 == i && this.f15255d == 0))) {
            z = false;
        }
        aup.m14887r(z);
    }

    /* renamed from: a */
    public final void mo13969a(byte[] bArr, int i, int i2) {
        this.f15252a = bArr;
        this.f15254c = i;
        this.f15253b = i2;
        this.f15255d = 0;
        m14111l();
    }

    /* renamed from: b */
    public final void mo13970b() {
        int i = 1;
        int i2 = this.f15255d + 1;
        this.f15255d = i2;
        if (i2 == 8) {
            this.f15255d = 0;
            int i3 = this.f15254c;
            if (true == m14110k(i3 + 1)) {
                i = 2;
            }
            this.f15254c = i3 + i;
        }
        m14111l();
    }

    /* renamed from: c */
    public final void mo13971c(int i) {
        int i2 = this.f15254c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f15254c = i4;
        int i5 = this.f15255d + (i - (i3 * 8));
        this.f15255d = i5;
        if (i5 > 7) {
            this.f15254c = i4 + 1;
            this.f15255d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f15254c) {
                m14111l();
                return;
            } else if (m14110k(i2)) {
                this.f15254c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo13972d(int i) {
        int i2 = this.f15254c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f15255d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f15253b) {
                int i6 = this.f15253b;
            } else if (m14110k(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f15253b;
        if (i4 >= i62) {
            return i4 == i62 && i5 == 0;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo13973e() {
        boolean z = (this.f15252a[this.f15254c] & (128 >> this.f15255d)) != 0;
        mo13970b();
        return z;
    }

    /* renamed from: f */
    public final int mo13974f(int i) {
        int i2;
        int i3;
        this.f15255d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f15255d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f15255d = i5;
            byte[] bArr = this.f15252a;
            int i6 = this.f15254c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != m14110k(i6 + 1)) {
                i3 = 1;
            }
            this.f15254c = i6 + i3;
        }
        byte[] bArr2 = this.f15252a;
        int i7 = this.f15254c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f15255d = 0;
            if (true != m14110k(i7 + 1)) {
                i3 = 1;
            }
            this.f15254c = i7 + i3;
        }
        m14111l();
        return i8;
    }

    /* renamed from: g */
    public final boolean mo13975g() {
        int i = this.f15254c;
        int i2 = this.f15255d;
        int i3 = 0;
        while (this.f15254c < this.f15253b && !mo13973e()) {
            i3++;
        }
        int i4 = this.f15254c;
        int i5 = this.f15253b;
        this.f15254c = i;
        this.f15255d = i2;
        return i4 != i5 && mo13972d((i3 + i3) + 1);
    }

    /* renamed from: h */
    public final int mo13976h() {
        return m14109j();
    }

    /* renamed from: i */
    public final int mo13977i() {
        int j = m14109j();
        return (j % 2 == 0 ? -1 : 1) * ((j + 1) / 2);
    }
}
