package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uq2 {

    /* renamed from: a */
    private byte[] f39926a;

    /* renamed from: b */
    private int f39927b;

    /* renamed from: c */
    private int f39928c;

    public uq2() {
        this.f39926a = d13.f20200f;
    }

    public uq2(byte[] bArr, int i) {
        this.f39926a = bArr;
        this.f39928c = i;
    }

    /* renamed from: A */
    public final long mo35223A() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f39927b = i4;
        byte b3 = bArr[i3];
        this.f39927b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: B */
    public final long mo35224B() {
        long z = mo35256z();
        if (z >= 0) {
            return z;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(z);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: C */
    public final long mo35225C() {
        int i;
        int i2;
        long j = (long) this.f39926a[this.f39927b];
        int i3 = 7;
        while (true) {
            i = 0;
            i2 = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            while (i2 < i) {
                byte b = this.f39926a[this.f39927b + i2];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f39927b += i;
            return j;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: D */
    public final String mo35226D(char c) {
        int i = this.f39928c;
        int i2 = this.f39927b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f39928c && this.f39926a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f39926a;
        int i3 = this.f39927b;
        String e = d13.m20304e(bArr, i3, i2 - i3);
        this.f39927b = i2;
        if (i2 < this.f39928c) {
            this.f39927b = i2 + 1;
        }
        return e;
    }

    /* renamed from: E */
    public final String mo35227E(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f39927b;
        int i3 = (i2 + i) - 1;
        String e = d13.m20304e(this.f39926a, i2, (i3 >= this.f39928c || this.f39926a[i3] != 0) ? i : i - 1);
        this.f39927b += i;
        return e;
    }

    /* renamed from: F */
    public final String mo35228F(int i, Charset charset) {
        String str = new String(this.f39926a, this.f39927b, i, charset);
        this.f39927b += i;
        return str;
    }

    /* renamed from: G */
    public final short mo35229G() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        this.f39927b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: H */
    public final void mo35230H(int i) {
        byte[] bArr = this.f39926a;
        if (i > bArr.length) {
            this.f39926a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: a */
    public final void mo35231a(tp2 tp2, int i) {
        mo35232b(tp2.f39483a, 0, i);
        tp2.mo35013h(0);
    }

    /* renamed from: b */
    public final void mo35232b(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f39926a, this.f39927b, bArr, i, i2);
        this.f39927b += i2;
    }

    /* renamed from: c */
    public final void mo35233c(int i) {
        byte[] bArr = this.f39926a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo35234d(bArr, i);
    }

    /* renamed from: d */
    public final void mo35234d(byte[] bArr, int i) {
        this.f39926a = bArr;
        this.f39928c = i;
        this.f39927b = 0;
    }

    /* renamed from: e */
    public final void mo35235e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f39926a.length) {
            z = true;
        }
        nu1.m20745d(z);
        this.f39928c = i;
    }

    /* renamed from: f */
    public final void mo35236f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f39928c) {
            z = true;
        }
        nu1.m20745d(z);
        this.f39927b = i;
    }

    /* renamed from: g */
    public final void mo35237g(int i) {
        mo35236f(this.f39927b + i);
    }

    /* renamed from: h */
    public final byte[] mo35238h() {
        return this.f39926a;
    }

    /* renamed from: i */
    public final int mo35239i() {
        return this.f39928c - this.f39927b;
    }

    /* renamed from: j */
    public final int mo35240j() {
        return this.f39926a.length;
    }

    /* renamed from: k */
    public final int mo35241k() {
        return this.f39927b;
    }

    /* renamed from: l */
    public final int mo35242l() {
        return this.f39928c;
    }

    /* renamed from: m */
    public final int mo35243m() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f39927b = i4;
        byte b3 = bArr[i3];
        this.f39927b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: n */
    public final int mo35244n() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        this.f39927b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    /* renamed from: o */
    public final int mo35245o() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f39927b = i4;
        byte b3 = bArr[i3];
        this.f39927b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: p */
    public final int mo35246p() {
        int o = mo35245o();
        if (o >= 0) {
            return o;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(o);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: q */
    public final int mo35247q() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        this.f39927b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: r */
    public final int mo35248r() {
        return (mo35249s() << 21) | (mo35249s() << 14) | (mo35249s() << 7) | mo35249s();
    }

    /* renamed from: s */
    public final int mo35249s() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        this.f39927b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: t */
    public final int mo35250t() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        this.f39927b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: u */
    public final int mo35251u() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        this.f39927b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: v */
    public final int mo35252v() {
        int m = mo35243m();
        if (m >= 0) {
            return m;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(m);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: w */
    public final int mo35253w() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        this.f39927b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: x */
    public final long mo35254x() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f39927b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f39927b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f39927b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f39927b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f39927b = i8;
        byte b7 = bArr[i7];
        this.f39927b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: y */
    public final long mo35255y() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f39927b = i4;
        byte b3 = bArr[i3];
        this.f39927b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: z */
    public final long mo35256z() {
        byte[] bArr = this.f39926a;
        int i = this.f39927b;
        int i2 = i + 1;
        this.f39927b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f39927b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f39927b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f39927b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f39927b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f39927b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f39927b = i8;
        byte b7 = bArr[i7];
        this.f39927b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public uq2(int i) {
        this.f39926a = new byte[i];
        this.f39928c = i;
    }

    public uq2(byte[] bArr) {
        this.f39926a = bArr;
        this.f39928c = bArr.length;
    }
}
