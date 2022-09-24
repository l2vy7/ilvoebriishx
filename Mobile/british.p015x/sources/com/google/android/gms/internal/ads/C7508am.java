package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.am */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7508am {

    /* renamed from: a */
    public byte[] f29687a;

    /* renamed from: b */
    private int f29688b;

    /* renamed from: c */
    private int f29689c;

    /* renamed from: d */
    private int f29690d;

    public C7508am(byte[] bArr, int i) {
        this.f29687a = bArr;
        this.f29690d = i;
    }

    /* renamed from: a */
    public final int mo30420a(int i) {
        int i2;
        int i3;
        byte b;
        byte b2;
        int i4 = i >> 3;
        boolean z = false;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f29689c;
            if (i6 != 0) {
                byte[] bArr = this.f29687a;
                int i7 = this.f29688b;
                b2 = ((bArr[i7 + 1] & 255) >>> (8 - i6)) | ((bArr[i7] & 255) << i6);
            } else {
                b2 = this.f29687a[this.f29688b];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f29688b++;
        }
        if (i > 0) {
            int i8 = this.f29689c + i;
            byte b4 = (byte) (255 >> (8 - i));
            if (i8 > 8) {
                byte[] bArr2 = this.f29687a;
                int i9 = this.f29688b;
                int i10 = i9 + 1;
                b = (b4 & (((255 & bArr2[i10]) >> (16 - i8)) | ((bArr2[i9] & 255) << (i8 - 8)))) | b3;
                this.f29688b = i10;
            } else {
                byte[] bArr3 = this.f29687a;
                int i11 = this.f29688b;
                b = (b4 & ((255 & bArr3[i11]) >> (8 - i8))) | b3;
                if (i8 == 8) {
                    this.f29688b = i11 + 1;
                }
            }
            b3 = b;
            this.f29689c = i8 % 8;
        }
        int i12 = this.f29688b;
        if (i12 >= 0 && (i2 = this.f29689c) >= 0 && (i12 < (i3 = this.f29690d) || (i12 == i3 && i2 == 0))) {
            z = true;
        }
        C8195tl.m37900e(z);
        return b3;
    }
}
