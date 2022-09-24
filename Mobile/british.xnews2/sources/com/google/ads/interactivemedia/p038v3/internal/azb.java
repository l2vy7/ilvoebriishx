package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azb */
/* compiled from: IMASDK */
public final class azb implements aws {

    /* renamed from: a */
    private static final ThreadLocal<Cipher> f15917a = new aza();

    /* renamed from: b */
    private final SecretKey f15918b;

    public azb(byte[] bArr) throws GeneralSecurityException {
        bea.m15756a(bArr.length);
        this.f15918b = new SecretKeySpec(bArr, "AES");
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
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, a, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (art.m14633d()) {
                    algorithmParameterSpec = new IvParameterSpec(a, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal<Cipher> threadLocal = f15917a;
            threadLocal.get().init(1, this.f15918b, algorithmParameterSpec);
            if (bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            int length3 = bArr.length;
            int doFinal = threadLocal.get().doFinal(bArr, 0, length3, bArr3, 12);
            if (doFinal == length3 + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length3)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
