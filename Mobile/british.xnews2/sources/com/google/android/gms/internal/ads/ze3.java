package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ze3 implements gc3 {

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f42447b = new ye3();

    /* renamed from: a */
    private final SecretKey f42448a;

    public ze3(byte[] bArr) throws GeneralSecurityException {
        gn3.m32590a(bArr.length);
        this.f42448a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo31329a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = en3.m31869a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            int length2 = a.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, a, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (fn3.m32208b()) {
                    algorithmParameterSpec = new IvParameterSpec(a, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal<Cipher> threadLocal = f42447b;
            threadLocal.get().init(1, this.f42448a, algorithmParameterSpec);
            int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
