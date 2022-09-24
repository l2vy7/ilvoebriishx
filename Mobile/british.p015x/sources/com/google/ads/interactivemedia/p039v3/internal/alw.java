package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alw */
/* compiled from: IMASDK */
public final class alw {

    /* renamed from: a */
    private byte[] f15249a;

    /* renamed from: b */
    private int f15250b;

    /* renamed from: c */
    private int f15251c;

    public alw() {
        this.f15249a = amm.f15303f;
    }

    public alw(byte[] bArr, int i) {
        this.f15249a = bArr;
        this.f15251c = i;
    }

    /* renamed from: A */
    public final int mo13932A() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        this.f15250b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: B */
    public final int mo13933B() {
        return (mo13957o() << 21) | (mo13957o() << 14) | (mo13957o() << 7) | mo13957o();
    }

    /* renamed from: C */
    public final int mo13934C() {
        int w = mo13965w();
        if (w >= 0) {
            return w;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(w);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: D */
    public final int mo13935D() {
        int x = mo13966x();
        if (x >= 0) {
            return x;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(x);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: E */
    public final long mo13936E() {
        long y = mo13967y();
        if (y >= 0) {
            return y;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(y);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: F */
    public final String mo13937F(int i) {
        return mo13938G(i, arm.f15614b);
    }

    /* renamed from: G */
    public final String mo13938G(int i, Charset charset) {
        String str = new String(this.f15249a, this.f15250b, i, charset);
        this.f15250b += i;
        return str;
    }

    /* renamed from: H */
    public final String mo13939H(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f15250b;
        int i3 = (i2 + i) - 1;
        String x = amm.m14254x(this.f15249a, i2, (i3 >= this.f15251c || this.f15249a[i3] != 0) ? i : i - 1);
        this.f15250b += i;
        return x;
    }

    /* renamed from: I */
    public final String mo13940I() {
        if (mo13947e() == 0) {
            return null;
        }
        int i = this.f15250b;
        while (i < this.f15251c && this.f15249a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f15249a;
        int i2 = this.f15250b;
        String x = amm.m14254x(bArr, i2, i - i2);
        this.f15250b = i;
        if (i >= this.f15251c) {
            return x;
        }
        this.f15250b = i + 1;
        return x;
    }

    /* renamed from: J */
    public final String mo13941J() {
        if (mo13947e() == 0) {
            return null;
        }
        int i = this.f15250b;
        while (i < this.f15251c && !amm.m14185B(this.f15249a[i])) {
            i++;
        }
        int i2 = this.f15250b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f15249a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.f15250b = i2;
            }
        }
        String x = amm.m14254x(this.f15249a, i2, i - i2);
        this.f15250b = i;
        int i3 = this.f15251c;
        if (i == i3) {
            return x;
        }
        byte[] bArr2 = this.f15249a;
        if (bArr2[i] == 13) {
            i++;
            this.f15250b = i;
            if (i == i3) {
                return x;
            }
        }
        if (bArr2[i] == 10) {
            this.f15250b = i + 1;
        }
        return x;
    }

    /* renamed from: K */
    public final long mo13942K() {
        int i;
        int i2;
        long j = (long) this.f15249a[this.f15250b];
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
                byte b = this.f15249a[this.f15250b + i2];
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
            this.f15250b += i;
            return j;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: a */
    public final void mo13943a(int i) {
        mo13945c(mo13953k() < i ? new byte[i] : this.f15249a, i);
    }

    /* renamed from: b */
    public final void mo13944b(byte[] bArr) {
        mo13945c(bArr, bArr.length);
    }

    /* renamed from: c */
    public final void mo13945c(byte[] bArr, int i) {
        this.f15249a = bArr;
        this.f15251c = i;
        this.f15250b = 0;
    }

    /* renamed from: d */
    public final void mo13946d(int i) {
        if (i > mo13953k()) {
            this.f15249a = Arrays.copyOf(this.f15249a, i);
        }
    }

    /* renamed from: e */
    public final int mo13947e() {
        return this.f15251c - this.f15250b;
    }

    /* renamed from: f */
    public final int mo13948f() {
        return this.f15251c;
    }

    /* renamed from: g */
    public final void mo13949g(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f15249a.length) {
            z = true;
        }
        aup.m14885p(z);
        this.f15251c = i;
    }

    /* renamed from: h */
    public final int mo13950h() {
        return this.f15250b;
    }

    /* renamed from: i */
    public final void mo13951i(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f15251c) {
            z = true;
        }
        aup.m14885p(z);
        this.f15250b = i;
    }

    /* renamed from: j */
    public final byte[] mo13952j() {
        return this.f15249a;
    }

    /* renamed from: k */
    public final int mo13953k() {
        return this.f15249a.length;
    }

    /* renamed from: l */
    public final void mo13954l(int i) {
        mo13951i(this.f15250b + i);
    }

    /* renamed from: m */
    public final void mo13955m(alv alv, int i) {
        mo13956n(alv.f15245a, 0, i);
        alv.mo13923e(0);
    }

    /* renamed from: n */
    public final void mo13956n(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f15249a, this.f15250b, bArr, i, i2);
        this.f15250b += i2;
    }

    /* renamed from: o */
    public final int mo13957o() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        this.f15250b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: p */
    public final int mo13958p() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        this.f15250b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: q */
    public final int mo13959q() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        this.f15250b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: r */
    public final short mo13960r() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        this.f15250b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: s */
    public final int mo13961s() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        this.f15250b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: t */
    public final int mo13962t() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        this.f15250b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    /* renamed from: u */
    public final long mo13963u() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f15250b = i4;
        byte b3 = bArr[i3];
        this.f15250b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: v */
    public final long mo13964v() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f15250b = i4;
        byte b3 = bArr[i3];
        this.f15250b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: w */
    public final int mo13965w() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f15250b = i4;
        byte b3 = bArr[i3];
        this.f15250b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: x */
    public final int mo13966x() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f15250b = i4;
        byte b3 = bArr[i3];
        this.f15250b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: y */
    public final long mo13967y() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f15250b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f15250b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f15250b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f15250b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f15250b = i8;
        byte b7 = bArr[i7];
        this.f15250b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: z */
    public final long mo13968z() {
        byte[] bArr = this.f15249a;
        int i = this.f15250b;
        int i2 = i + 1;
        this.f15250b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f15250b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f15250b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f15250b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f15250b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f15250b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f15250b = i8;
        byte b7 = bArr[i7];
        this.f15250b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    public alw(int i) {
        this.f15249a = new byte[i];
        this.f15251c = i;
    }

    public alw(byte[] bArr) {
        this.f15249a = bArr;
        this.f15251c = bArr.length;
    }
}
