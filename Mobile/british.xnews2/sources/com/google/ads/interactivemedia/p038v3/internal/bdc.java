package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdc */
/* compiled from: IMASDK */
public final class bdc implements aws {

    /* renamed from: a */
    public static final int f16150a = azc.f15920b;

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f16151b = new bdb();

    /* renamed from: c */
    private final SecretKey f16152c;

    public bdc(byte[] bArr) throws GeneralSecurityException {
        azc.m15270a(f16150a);
        bea.m15756a(bArr.length);
        this.f16152c = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo14715a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = bdz.m15753a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            int length2 = a.length;
            if (!art.m14633d() || art.m14634e() > 19) {
                algorithmParameterSpec = new GCMParameterSpec(128, a, 0, length2);
            } else {
                algorithmParameterSpec = new IvParameterSpec(a, 0, length2);
            }
            ThreadLocal<Cipher> threadLocal = f16151b;
            threadLocal.get().init(1, this.f16152c, algorithmParameterSpec);
            if (bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
