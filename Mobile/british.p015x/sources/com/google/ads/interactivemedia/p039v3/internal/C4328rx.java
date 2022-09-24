package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rx */
/* compiled from: IMASDK */
public final class C4328rx {

    /* renamed from: a */
    private final byte[] f18545a;

    /* renamed from: b */
    private final int f18546b;

    /* renamed from: c */
    private int f18547c;

    /* renamed from: d */
    private int f18548d;

    public C4328rx(byte[] bArr) {
        this.f18545a = bArr;
        this.f18546b = bArr.length;
    }

    /* renamed from: a */
    public final boolean mo16628a() {
        byte b = this.f18545a[this.f18547c];
        int i = this.f18548d;
        mo16630c(1);
        if (1 != (((b & 255) >> i) & 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo16629b(int i) {
        int i2 = this.f18547c;
        int min = Math.min(i, 8 - this.f18548d);
        int i3 = i2 + 1;
        int i4 = ((this.f18545a[i2] & 255) >> this.f18548d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f18545a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo16630c(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: c */
    public final void mo16630c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f18547c + i3;
        this.f18547c = i4;
        int i5 = this.f18548d + (i - (i3 * 8));
        this.f18548d = i5;
        if (i5 > 7) {
            i4++;
            this.f18547c = i4;
            i5 -= 8;
            this.f18548d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f18546b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        aup.m14887r(z);
    }

    /* renamed from: d */
    public final int mo16631d() {
        return (this.f18547c * 8) + this.f18548d;
    }
}
