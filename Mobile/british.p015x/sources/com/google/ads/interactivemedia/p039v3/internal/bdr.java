package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdr */
/* compiled from: IMASDK */
public final class bdr {

    /* renamed from: a */
    private final byte[] f16186a;

    private bdr(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f16186a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    /* renamed from: a */
    public static bdr m15731a(byte[] bArr) {
        return new bdr(bArr, bArr.length);
    }

    /* renamed from: b */
    public final byte[] mo14951b() {
        byte[] bArr = this.f16186a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
