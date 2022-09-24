package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import com.startapp.C12425x3;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdt */
/* compiled from: IMASDK */
public final class bdt {
    /* renamed from: a */
    static byte[] m15734a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long j = m15743j(bArr3, 0, 0);
            int i = 2;
            long j2 = m15743j(bArr3, 3, 2) & 67108611;
            long j3 = m15743j(bArr3, 6, 4) & 67092735;
            long j4 = m15743j(bArr3, 9, 6) & 66076671;
            long j5 = m15743j(bArr3, 12, 8) & 1048575;
            long j6 = j2 * 5;
            long j7 = j3 * 5;
            long j8 = j4 * 5;
            long j9 = j5 * 5;
            int i2 = 17;
            byte[] bArr5 = new byte[17];
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            int i3 = 0;
            while (true) {
                int length = bArr4.length;
                if (i3 < length) {
                    int min = Math.min(16, length - i3);
                    System.arraycopy(bArr4, i3, bArr5, 0, min);
                    bArr5[min] = 1;
                    if (min != 16) {
                        Arrays.fill(bArr5, min + 1, i2, (byte) 0);
                    }
                    long j15 = j14 + m15743j(bArr5, 0, 0);
                    long j16 = j11 + m15743j(bArr5, 3, i);
                    long j17 = j10 + m15743j(bArr5, 6, 4);
                    long j18 = j12 + m15743j(bArr5, 9, 6);
                    long j19 = j13 + (m15743j(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                    long j20 = (j15 * j) + (j16 * j9) + (j17 * j8) + (j18 * j7) + (j19 * j6);
                    long j21 = (j15 * j2) + (j16 * j) + (j17 * j9) + (j18 * j8) + (j19 * j7) + (j20 >> 26);
                    long j22 = (j15 * j3) + (j16 * j2) + (j17 * j) + (j18 * j9) + (j19 * j8) + (j21 >> 26);
                    long j23 = (j15 * j4) + (j16 * j3) + (j17 * j2) + (j18 * j) + (j19 * j9) + (j22 >> 26);
                    long j24 = (j15 * j5) + (j16 * j4) + (j17 * j3) + (j18 * j2) + (j19 * j) + (j23 >> 26);
                    j13 = j24 & 67108863;
                    long j25 = (j20 & 67108863) + ((j24 >> 26) * 5);
                    j14 = j25 & 67108863;
                    j11 = (j21 & 67108863) + (j25 >> 26);
                    i3 += 16;
                    j12 = j23 & 67108863;
                    j10 = j22 & 67108863;
                    i2 = 17;
                    i = 2;
                } else {
                    long j26 = j10 + (j11 >> 26);
                    long j27 = j26 & 67108863;
                    long j28 = j12 + (j26 >> 26);
                    long j29 = j28 & 67108863;
                    long j30 = j13 + (j28 >> 26);
                    long j31 = j30 & 67108863;
                    long j32 = j14 + ((j30 >> 26) * 5);
                    long j33 = j32 & 67108863;
                    long j34 = (j11 & 67108863) + (j32 >> 26);
                    long j35 = j33 + 5;
                    long j36 = (j35 >> 26) + j34;
                    long j37 = j27 + (j36 >> 26);
                    long j38 = j29 + (j37 >> 26);
                    long j39 = (j31 + (j38 >> 26)) - 67108864;
                    long j40 = j39 >> 63;
                    long j41 = j40 ^ -1;
                    long j42 = (j34 & j40) | (j36 & 67108863 & j41);
                    long j43 = (j27 & j40) | (j37 & 67108863 & j41);
                    long j44 = (j29 & j40) | (j38 & 67108863 & j41);
                    long i4 = (((j33 & j40) | (j35 & 67108863 & j41) | (j42 << 26)) & 4294967295L) + m15742i(bArr3, 16);
                    long i5 = (((j42 >> 6) | (j43 << 20)) & 4294967295L) + m15742i(bArr3, 20) + (i4 >> 32);
                    long i6 = (((j43 >> 12) | (j44 << 14)) & 4294967295L) + m15742i(bArr3, 24) + (i5 >> 32);
                    long i7 = m15742i(bArr3, 28);
                    byte[] bArr6 = new byte[16];
                    m15744k(bArr6, i4 & 4294967295L, 0);
                    m15744k(bArr6, i5 & 4294967295L, 4);
                    m15744k(bArr6, i6 & 4294967295L, 8);
                    m15744k(bArr6, ((((j44 >> 18) | (((j31 & j40) | (j39 & j41)) << 8)) & 4294967295L) + i7 + (i6 >> 32)) & 4294967295L, 12);
                    return bArr6;
                }
            }
        } else {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
    }

    /* renamed from: b */
    static void m15735b(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger c = m15736c(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(c) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(c) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(c).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(c))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: c */
    public static BigInteger m15736c(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: d */
    public static KeyPair m15737d(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator a = bdo.f16179d.mo14949a("EC");
        a.initialize(eCParameterSpec);
        return a.generateKeyPair();
    }

    /* renamed from: e */
    public static ECParameterSpec m15738e(int i) throws NoSuchAlgorithmException {
        int i2 = i - 1;
        if (i2 == 0) {
            return m15745l("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 != 1) {
            return m15745l("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        return m15745l("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    /* renamed from: f */
    public static ECPublicKey m15739f(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec e = m15738e(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m15735b(eCPoint, e.getCurve());
        return (ECPublicKey) bdo.f16180e.mo14949a("EC").generatePublic(new ECPublicKeySpec(eCPoint, e));
    }

    /* renamed from: g */
    static byte[] m15740g(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = bArr[i];
                byte b2 = (byte) ((b + b) & 254);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b2);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & TsExtractor.TS_STREAM_TYPE_E_AC3)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    /* renamed from: h */
    static byte[] m15741h(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = C12425x3.f55111d;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    /* renamed from: i */
    private static long m15742i(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* renamed from: j */
    private static long m15743j(byte[] bArr, int i, int i2) {
        return (m15742i(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: k */
    private static void m15744k(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: l */
    private static ECParameterSpec m15745l(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
