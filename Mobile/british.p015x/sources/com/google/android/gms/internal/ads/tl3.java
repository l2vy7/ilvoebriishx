package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.startapp.C12425x3;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tl3 implements gc3 {

    /* renamed from: e */
    private static final ThreadLocal<Cipher> f39453e = new rl3();

    /* renamed from: f */
    private static final ThreadLocal<Cipher> f39454f = new sl3();

    /* renamed from: a */
    private final byte[] f39455a;

    /* renamed from: b */
    private final byte[] f39456b;

    /* renamed from: c */
    private final SecretKeySpec f39457c;

    /* renamed from: d */
    private final int f39458d;

    public tl3(byte[] bArr, int i) throws GeneralSecurityException {
        if (!af3.m30313a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f39458d = i;
            gn3.m32590a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f39457c = secretKeySpec;
            Cipher cipher = f39453e.get();
            cipher.init(1, secretKeySpec);
            byte[] b = m37903b(cipher.doFinal(new byte[16]));
            this.f39455a = b;
            this.f39456b = m37903b(b);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: b */
    private static byte[] m37903b(byte[] bArr) {
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

    /* renamed from: c */
    private final byte[] m37904c(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m37905d(bArr3, this.f39455a));
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
            bArr2 = m37905d(copyOfRange, this.f39455a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f39456b, 16);
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
        return cipher.doFinal(m37905d(doFinal, bArr2));
    }

    /* renamed from: d */
    private static byte[] m37905d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo31329a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f39458d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(i + length + 16)];
            byte[] a = en3.m31869a(i);
            System.arraycopy(a, 0, bArr3, 0, this.f39458d);
            Cipher cipher = f39453e.get();
            cipher.init(1, this.f39457c);
            Cipher cipher2 = cipher;
            byte[] c = m37904c(cipher2, 0, a, 0, a.length);
            byte[] c2 = m37904c(cipher2, 1, bArr2, 0, 0);
            Cipher cipher3 = f39454f.get();
            cipher3.init(1, this.f39457c, new IvParameterSpec(c));
            cipher3.doFinal(bArr, 0, length, bArr3, this.f39458d);
            byte[] c3 = m37904c(cipher, 2, bArr3, this.f39458d, length);
            int i2 = length + this.f39458d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((c2[i3] ^ c[i3]) ^ c3[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
