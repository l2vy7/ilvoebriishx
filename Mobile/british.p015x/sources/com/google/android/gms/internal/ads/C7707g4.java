package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.g4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7707g4 {
    /* renamed from: a */
    public static int m32350a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m32351b(uq2 uq2, int i, int i2) {
        uq2.mo35236f(i);
        if (uq2.mo35239i() < 5) {
            return C6540C.TIME_UNSET;
        }
        int m = uq2.mo35243m();
        if ((8388608 & m) != 0 || ((m >> 8) & 8191) != i2 || (m & 32) == 0 || uq2.mo35249s() < 7 || uq2.mo35239i() < 7 || (uq2.mo35249s() & 16) != 16) {
            return C6540C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        uq2.mo35232b(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
