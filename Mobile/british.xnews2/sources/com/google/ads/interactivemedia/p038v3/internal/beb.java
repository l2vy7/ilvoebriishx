package com.google.ads.interactivemedia.p038v3.internal;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.beb */
/* compiled from: IMASDK */
final class beb extends bdf {
    beb(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int[] mo14941b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            bdf.m15708f(iArr3, this.f16160a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            bdf.m15709g(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            bdf.m15708f(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo14942c() {
        return 24;
    }
}
