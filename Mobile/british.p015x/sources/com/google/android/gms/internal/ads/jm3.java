package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jm3 {

    /* renamed from: a */
    private final ECPublicKey f33943a;

    public jm3(ECPublicKey eCPublicKey) {
        this.f33943a = eCPublicKey;
    }

    /* renamed from: a */
    public final im3 mo32907a(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        BigInteger bigInteger;
        char c;
        byte[] bArr3;
        int i3;
        int i4;
        byte[] bArr4;
        String str2 = str;
        byte[] bArr5 = bArr;
        int i5 = i;
        KeyPair b = km3.m33987b(this.f33943a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) b.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) b.getPrivate();
        ECPublicKey eCPublicKey2 = this.f33943a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey2.getW();
            km3.m33988c(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = mm3.f35572k.mo33568a("EC").generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement a = mm3.f35570i.mo33568a("ECDH");
            a.init(eCPrivateKey);
            int i6 = 1;
            try {
                a.doPhase(generatePublic, true);
                byte[] generateSecret = a.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger2 = new BigInteger(1, generateSecret);
                if (bigInteger2.signum() == -1 || bigInteger2.compareTo(km3.m33986a(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger a2 = km3.m33986a(curve);
                BigInteger mod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(a2);
                if (a2.signum() == 1) {
                    BigInteger mod2 = mod.mod(a2);
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    if (!mod2.equals(bigInteger3)) {
                        if (!a2.testBit(0) || !a2.testBit(1)) {
                            if (a2.testBit(0) && !a2.testBit(1)) {
                                bigInteger3 = BigInteger.ONE;
                                BigInteger shiftRight = a2.subtract(bigInteger3).shiftRight(1);
                                int i7 = 0;
                                while (true) {
                                    BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(a2);
                                    if (mod3.equals(BigInteger.ZERO)) {
                                        break;
                                    }
                                    BigInteger modPow = mod3.modPow(shiftRight, a2);
                                    BigInteger bigInteger4 = BigInteger.ONE;
                                    if (modPow.add(bigInteger4).equals(a2)) {
                                        BigInteger shiftRight2 = a2.add(bigInteger4).shiftRight(i6);
                                        BigInteger bigInteger5 = bigInteger3;
                                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                            BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                            BigInteger mod4 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(a2).multiply(mod3)).mod(a2);
                                            BigInteger mod5 = multiply.add(multiply).mod(a2);
                                            if (shiftRight2.testBit(bitLength)) {
                                                BigInteger mod6 = mod4.multiply(bigInteger3).add(mod5.multiply(mod3)).mod(a2);
                                                bigInteger4 = bigInteger3.multiply(mod5).add(mod4).mod(a2);
                                                bigInteger5 = mod6;
                                            } else {
                                                BigInteger bigInteger6 = mod5;
                                                bigInteger5 = mod4;
                                                bigInteger4 = bigInteger6;
                                            }
                                        }
                                        bigInteger = bigInteger5;
                                    } else if (modPow.equals(bigInteger4)) {
                                        bigInteger3 = bigInteger3.add(bigInteger4);
                                        i7++;
                                        if (i7 == 128) {
                                            if (!a2.isProbablePrime(80)) {
                                                throw new InvalidAlgorithmParameterException("p is not prime");
                                            }
                                        }
                                        i6 = 1;
                                    } else {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                }
                            } else {
                                bigInteger = null;
                            }
                        } else {
                            bigInteger = mod2.modPow(a2.add(BigInteger.ONE).shiftRight(2), a2);
                        }
                        if (bigInteger3 != null) {
                            if (bigInteger3.multiply(bigInteger3).mod(a2).compareTo(mod2) != 0) {
                                throw new GeneralSecurityException("Could not find a modular square root");
                            }
                        }
                    }
                    if (!bigInteger3.testBit(0)) {
                        a2.subtract(bigInteger3).mod(a2);
                    }
                    EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                    ECPoint w2 = eCPublicKey.getW();
                    km3.m33988c(w2, curve2);
                    int bitLength2 = (km3.m33986a(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                    int i8 = i2 - 1;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            int i9 = bitLength2 + 1;
                            bArr4 = new byte[i9];
                            byte[] byteArray = w2.getAffineX().toByteArray();
                            int length = byteArray.length;
                            c = 0;
                            System.arraycopy(byteArray, 0, bArr4, i9 - length, length);
                            bArr4[0] = true != w2.getAffineY().testBit(0) ? (byte) 2 : 3;
                        } else {
                            int i10 = bitLength2 + bitLength2;
                            bArr4 = new byte[i10];
                            byte[] byteArray2 = w2.getAffineX().toByteArray();
                            int length2 = byteArray2.length;
                            if (length2 > bitLength2) {
                                byteArray2 = Arrays.copyOfRange(byteArray2, length2 - bitLength2, length2);
                            }
                            byte[] byteArray3 = w2.getAffineY().toByteArray();
                            int length3 = byteArray3.length;
                            if (length3 > bitLength2) {
                                byteArray3 = Arrays.copyOfRange(byteArray3, length3 - bitLength2, length3);
                            }
                            int length4 = byteArray3.length;
                            c = 0;
                            System.arraycopy(byteArray3, 0, bArr4, i10 - length4, length4);
                            int length5 = byteArray2.length;
                            System.arraycopy(byteArray2, 0, bArr4, bitLength2 - length5, length5);
                        }
                        bArr3 = bArr4;
                        i4 = 2;
                        i3 = 1;
                    } else {
                        c = 0;
                        i3 = 1;
                        int i11 = bitLength2 + bitLength2 + 1;
                        bArr3 = new byte[i11];
                        byte[] byteArray4 = w2.getAffineX().toByteArray();
                        byte[] byteArray5 = w2.getAffineY().toByteArray();
                        int length6 = byteArray5.length;
                        System.arraycopy(byteArray5, 0, bArr3, i11 - length6, length6);
                        int length7 = byteArray4.length;
                        System.arraycopy(byteArray4, 0, bArr3, (bitLength2 + 1) - length7, length7);
                        bArr3[0] = 4;
                        i4 = 2;
                    }
                    byte[][] bArr6 = new byte[i4][];
                    bArr6[c] = bArr3;
                    bArr6[i3] = generateSecret;
                    byte[] b2 = zl3.m40379b(bArr6);
                    Mac a3 = mm3.f35567f.mo33568a(str2);
                    if (i5 <= a3.getMacLength() * 255) {
                        if (bArr5 == null || bArr5.length == 0) {
                            a3.init(new SecretKeySpec(new byte[a3.getMacLength()], str2));
                        } else {
                            a3.init(new SecretKeySpec(bArr5, str2));
                        }
                        byte[] doFinal = a3.doFinal(b2);
                        byte[] bArr7 = new byte[i5];
                        a3.init(new SecretKeySpec(doFinal, str2));
                        byte[] bArr8 = new byte[0];
                        int i12 = 0;
                        while (true) {
                            a3.update(bArr8);
                            a3.update(bArr2);
                            a3.update((byte) i3);
                            byte[] doFinal2 = a3.doFinal();
                            int length8 = doFinal2.length;
                            int i13 = i12 + length8;
                            if (i13 < i5) {
                                System.arraycopy(doFinal2, 0, bArr7, i12, length8);
                                i3++;
                                bArr8 = doFinal2;
                                i12 = i13;
                            } else {
                                System.arraycopy(doFinal2, 0, bArr7, i12, i5 - i12);
                                return new im3(bArr3, bArr7);
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("size too large");
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }
}
