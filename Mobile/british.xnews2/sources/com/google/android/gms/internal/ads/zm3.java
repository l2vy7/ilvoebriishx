package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zm3 implements hg3 {

    /* renamed from: a */
    private final SecretKey f42517a;

    /* renamed from: b */
    private final byte[] f42518b;

    /* renamed from: c */
    private final byte[] f42519c;

    public zm3(byte[] bArr) throws GeneralSecurityException {
        gn3.m32590a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f42517a = secretKeySpec;
        Cipher b = m40395b();
        b.init(1, secretKeySpec);
        byte[] b2 = yl3.m39961b(b.doFinal(new byte[16]));
        this.f42518b = b2;
        this.f42519c = yl3.m39961b(b2);
    }

    /* renamed from: b */
    private static Cipher m40395b() throws GeneralSecurityException {
        if (af3.m30313a(1)) {
            return mm3.f35566e.mo33568a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo30737a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m40395b();
            b.init(1, this.f42517a);
            int length = bArr.length;
            double d = (double) length;
            Double.isNaN(d);
            int max = Math.max(1, (int) Math.ceil(d / 16.0d));
            if (max * 16 == length) {
                bArr2 = zl3.m40381d(bArr, (max - 1) * 16, this.f42518b, 0, 16);
            } else {
                bArr2 = zl3.m40380c(yl3.m39960a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f42519c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(zl3.m40381d(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(zl3.m40380c(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
