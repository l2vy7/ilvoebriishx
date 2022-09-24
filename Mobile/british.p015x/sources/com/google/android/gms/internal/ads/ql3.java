package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ql3 implements wm3 {

    /* renamed from: d */
    private static final ThreadLocal<Cipher> f38167d = new pl3();

    /* renamed from: a */
    private final SecretKeySpec f38168a;

    /* renamed from: b */
    private final int f38169b;

    /* renamed from: c */
    private final int f38170c;

    public ql3(byte[] bArr, int i) throws GeneralSecurityException {
        if (af3.m30313a(2)) {
            gn3.m32590a(bArr.length);
            this.f38168a = new SecretKeySpec(bArr, "AES");
            int blockSize = f38167d.get().getBlockSize();
            this.f38170c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f38169b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo30730a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f38169b;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = en3.m31869a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f38169b);
            int i3 = this.f38169b;
            Cipher cipher = f38167d.get();
            byte[] bArr3 = new byte[this.f38170c];
            System.arraycopy(a, 0, bArr3, 0, this.f38169b);
            cipher.init(1, this.f38168a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
