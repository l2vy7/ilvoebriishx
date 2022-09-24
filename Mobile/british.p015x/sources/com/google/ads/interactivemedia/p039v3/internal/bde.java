package com.google.ads.interactivemedia.p039v3.internal;

import java.security.InvalidKeyException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bde */
/* compiled from: IMASDK */
final class bde extends bdf {
    bde(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int[] mo14941b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            bdf.m15708f(iArr2, this.f16160a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo14942c() {
        return 12;
    }
}
