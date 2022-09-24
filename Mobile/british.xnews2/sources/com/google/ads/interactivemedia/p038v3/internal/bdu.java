package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdu */
/* compiled from: IMASDK */
public final class bdu implements bag {

    /* renamed from: a */
    public static final int f16187a = azc.f15919a;

    /* renamed from: b */
    private final SecretKey f16188b;

    /* renamed from: c */
    private byte[] f16189c;

    /* renamed from: d */
    private byte[] f16190d;

    public bdu(byte[] bArr) throws GeneralSecurityException {
        bea.m15756a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f16188b = secretKeySpec;
        Cipher b = m15746b();
        b.init(1, secretKeySpec);
        byte[] g = bdt.m15740g(b.doFinal(new byte[16]));
        this.f16189c = g;
        this.f16190d = bdt.m15740g(g);
    }

    /* renamed from: b */
    private static Cipher m15746b() throws GeneralSecurityException {
        azc.m15270a(f16187a);
        return bdo.f16176a.mo14949a("AES/ECB/NoPadding");
    }

    /* renamed from: a */
    public final byte[] mo14784a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m15746b();
            b.init(1, this.f16188b);
            int length = bArr.length;
            double d = (double) length;
            Double.isNaN(d);
            int max = Math.max(1, (int) Math.ceil(d / 16.0d));
            if (max * 16 == length) {
                bArr2 = awr.m15066c(bArr, (max - 1) * 16, this.f16189c, 0, 16);
            } else {
                bArr2 = awr.m15068e(bdt.m15741h(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f16190d);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(awr.m15066c(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(awr.m15068e(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
