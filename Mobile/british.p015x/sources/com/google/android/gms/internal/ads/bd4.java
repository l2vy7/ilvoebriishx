package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bd4 {

    /* renamed from: a */
    private final byte[] f29975a;

    /* renamed from: b */
    private final int f29976b;

    /* renamed from: c */
    private int f29977c;

    /* renamed from: d */
    private int f29978d;

    public bd4(byte[] bArr) {
        this.f29975a = bArr;
        this.f29976b = bArr.length;
    }

    /* renamed from: a */
    public final int mo30661a() {
        return (this.f29977c * 8) + this.f29978d;
    }

    /* renamed from: b */
    public final int mo30662b(int i) {
        int i2 = this.f29977c;
        int min = Math.min(i, 8 - this.f29978d);
        int i3 = i2 + 1;
        int i4 = ((this.f29975a[i2] & 255) >> this.f29978d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f29975a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo30663c(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: c */
    public final void mo30663c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f29977c + i3;
        this.f29977c = i4;
        int i5 = this.f29978d + (i - (i3 * 8));
        this.f29978d = i5;
        if (i5 > 7) {
            i4++;
            this.f29977c = i4;
            i5 -= 8;
            this.f29978d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f29976b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        nu1.m20747f(z);
    }

    /* renamed from: d */
    public final boolean mo30664d() {
        byte b = this.f29975a[this.f29977c];
        int i = this.f29978d;
        mo30663c(1);
        if (1 != (((b & 255) >> i) & 1)) {
            return false;
        }
        return true;
    }
}
