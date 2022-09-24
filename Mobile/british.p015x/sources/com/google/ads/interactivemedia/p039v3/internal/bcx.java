package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcx */
/* compiled from: IMASDK */
public final class bcx implements bds {

    /* renamed from: a */
    public static final int f16132a = azc.f15920b;

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f16133b = new bcw();

    /* renamed from: c */
    private final SecretKeySpec f16134c;

    /* renamed from: d */
    private final int f16135d;

    /* renamed from: e */
    private final int f16136e;

    public bcx(byte[] bArr, int i) throws GeneralSecurityException {
        azc.m15270a(f16132a);
        bea.m15756a(bArr.length);
        this.f16134c = new SecretKeySpec(bArr, "AES");
        int blockSize = f16133b.get().getBlockSize();
        this.f16136e = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f16135d = i;
    }

    /* renamed from: a */
    public final byte[] mo14932a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f16135d;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = bdz.m15753a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f16135d);
            int i3 = this.f16135d;
            Cipher cipher = f16133b.get();
            byte[] bArr3 = new byte[this.f16136e];
            System.arraycopy(a, 0, bArr3, 0, this.f16135d);
            cipher.init(1, this.f16134c, new IvParameterSpec(bArr3));
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
