package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7579cm {

    /* renamed from: a */
    private final byte[] f30412a;

    /* renamed from: b */
    private final int f30413b;

    /* renamed from: c */
    private int f30414c;

    /* renamed from: d */
    private int f30415d = 0;

    public C7579cm(byte[] bArr, int i, int i2) {
        this.f30412a = bArr;
        this.f30414c = i;
        this.f30413b = i2;
        m31055g();
    }

    /* renamed from: f */
    private final int m31054f() {
        int i = 0;
        int i2 = 0;
        while (!mo30956e()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo30952a(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    private final void m31055g() {
        int i;
        int i2;
        int i3 = this.f30414c;
        boolean z = true;
        if (i3 < 0 || (i = this.f30415d) < 0 || i >= 8 || (i3 >= (i2 = this.f30413b) && !(i3 == i2 && i == 0))) {
            z = false;
        }
        C8195tl.m37900e(z);
    }

    /* renamed from: h */
    private final boolean m31056h(int i) {
        if (i < 2 || i >= this.f30413b) {
            return false;
        }
        byte[] bArr = this.f30412a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo30952a(int i) {
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4 = i >> 3;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            if (m31056h(this.f30414c + 1)) {
                i3 = this.f30414c + 2;
            } else {
                i3 = this.f30414c + 1;
            }
            int i6 = this.f30415d;
            if (i6 != 0) {
                byte[] bArr = this.f30412a;
                b2 = ((bArr[i3] & 255) >>> (8 - i6)) | ((bArr[this.f30414c] & 255) << i6);
            } else {
                b2 = this.f30412a[this.f30414c];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f30414c = i3;
        }
        if (i > 0) {
            int i7 = this.f30415d + i;
            byte b4 = (byte) (255 >> (8 - i));
            if (m31056h(this.f30414c + 1)) {
                i2 = this.f30414c + 2;
            } else {
                i2 = this.f30414c + 1;
            }
            if (i7 > 8) {
                byte[] bArr2 = this.f30412a;
                b = (b4 & (((255 & bArr2[i2]) >> (16 - i7)) | ((bArr2[this.f30414c] & 255) << (i7 - 8)))) | b3;
                this.f30414c = i2;
            } else {
                b = (b4 & ((255 & this.f30412a[this.f30414c]) >> (8 - i7))) | b3;
                if (i7 == 8) {
                    this.f30414c = i2;
                }
            }
            b3 = b;
            this.f30415d = i7 % 8;
        }
        m31055g();
        return b3;
    }

    /* renamed from: b */
    public final int mo30953b() {
        int f = m31054f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: c */
    public final int mo30954c() {
        return m31054f();
    }

    /* renamed from: d */
    public final void mo30955d(int i) {
        int i2 = this.f30414c;
        int i3 = (i >> 3) + i2;
        this.f30414c = i3;
        int i4 = this.f30415d + (i & 7);
        this.f30415d = i4;
        if (i4 > 7) {
            this.f30414c = i3 + 1;
            this.f30415d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f30414c) {
                m31055g();
                return;
            } else if (m31056h(i2)) {
                this.f30414c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo30956e() {
        return mo30952a(1) == 1;
    }
}
