package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.startapp.C12425x3;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bda */
/* compiled from: IMASDK */
public final class bda implements aws {

    /* renamed from: a */
    public static final int f16143a = azc.f15919a;

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f16144b = new bcy();

    /* renamed from: c */
    private static final ThreadLocal<Cipher> f16145c = new bcz();

    /* renamed from: d */
    private final byte[] f16146d;

    /* renamed from: e */
    private final byte[] f16147e;

    /* renamed from: f */
    private final SecretKeySpec f16148f;

    /* renamed from: g */
    private final int f16149g;

    public bda(byte[] bArr, int i) throws GeneralSecurityException {
        azc.m15270a(f16143a);
        if (i == 12 || i == 16) {
            this.f16149g = i;
            bea.m15756a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f16148f = secretKeySpec;
            Cipher cipher = f16144b.get();
            cipher.init(1, secretKeySpec);
            byte[] c = m15700c(cipher.doFinal(new byte[16]));
            this.f16146d = c;
            this.f16147e = m15700c(c);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: b */
    private static byte[] m15699b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: c */
    private static byte[] m15700c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & TsExtractor.TS_STREAM_TYPE_E_AC3) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: d */
    private final byte[] m15701d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m15699b(bArr3, this.f16146d));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m15699b(copyOfRange, this.f16146d);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f16147e, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ C12425x3.f55111d);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m15699b(doFinal, bArr2));
    }

    /* renamed from: a */
    public final byte[] mo14715a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f16149g;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(i + length + 16)];
            byte[] a = bdz.m15753a(i);
            System.arraycopy(a, 0, bArr3, 0, this.f16149g);
            Cipher cipher = f16144b.get();
            cipher.init(1, this.f16148f);
            Cipher cipher2 = cipher;
            byte[] d = m15701d(cipher2, 0, a, 0, a.length);
            byte[] bArr4 = bArr2;
            byte[] d2 = m15701d(cipher2, 1, bArr4, 0, bArr4.length);
            Cipher cipher3 = f16145c.get();
            cipher3.init(1, this.f16148f, new IvParameterSpec(d));
            cipher3.doFinal(bArr, 0, length, bArr3, this.f16149g);
            byte[] d3 = m15701d(cipher, 2, bArr3, this.f16149g, length);
            int i2 = length + this.f16149g;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((d2[i3] ^ d[i3]) ^ d3[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
