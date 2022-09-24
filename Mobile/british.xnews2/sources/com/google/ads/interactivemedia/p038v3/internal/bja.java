package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bja */
/* compiled from: IMASDK */
public final class bja {

    /* renamed from: a */
    private final byte[] f16462a = new byte[256];

    /* renamed from: b */
    private int f16463b;

    /* renamed from: c */
    private int f16464c;

    public bja(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f16462a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.f16462a;
            byte b2 = bArr2[i2];
            b = (b + b2 + bArr[i2 % bArr.length]) & 255;
            bArr2[i2] = bArr2[b];
            bArr2[b] = b2;
        }
        this.f16463b = 0;
        this.f16464c = 0;
    }

    /* renamed from: a */
    public final void mo15159a(byte[] bArr) {
        int i = this.f16463b;
        int i2 = this.f16464c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f16462a;
            byte b = bArr2[i];
            i2 = (i2 + b) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b) & 255] ^ bArr[i3]);
        }
        this.f16463b = i;
        this.f16464c = i2;
    }
}
