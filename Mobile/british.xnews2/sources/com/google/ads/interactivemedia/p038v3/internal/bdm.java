package com.google.ads.interactivemedia.p038v3.internal;

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

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdm */
/* compiled from: IMASDK */
public final class bdm {

    /* renamed from: a */
    private final ECPublicKey f16173a;

    public bdm(ECPublicKey eCPublicKey) {
        this.f16173a = eCPublicKey;
    }

    /* renamed from: a */
    public final bdl mo14948a(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        BigInteger bigInteger;
        char c;
        byte[] bArr3;
        int i3;
        int i4;
        byte[] bArr4;
        String str2 = str;
        byte[] bArr5 = bArr;
        int i5 = i;
        KeyPair d = bdt.m15737d(this.f16173a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) d.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) d.getPrivate();
        ECPublicKey eCPublicKey2 = this.f16173a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey2.getW();
            bdt.m15735b(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = bdo.f16180e.mo14949a("EC").generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement a = bdo.f16178c.mo14949a("ECDH");
            a.init(eCPrivateKey);
            int i6 = 1;
            try {
                a.doPhase(generatePublic, true);
                byte[] generateSecret = a.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger2 = new BigInteger(1, generateSecret);
                if (bigInteger2.signum() == -1 || bigInteger2.compareTo(bdt.m15736c(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger c2 = bdt.m15736c(curve);
                BigInteger mod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(c2);
                if (c2.signum() == 1) {
                    BigInteger mod2 = mod.mod(c2);
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    if (!mod2.equals(bigInteger3)) {
                        if (!c2.testBit(0) || !c2.testBit(1)) {
                            if (c2.testBit(0) && !c2.testBit(1)) {
                                bigInteger3 = BigInteger.ONE;
                                BigInteger shiftRight = c2.subtract(bigInteger3).shiftRight(1);
                                int i7 = 0;
                                while (true) {
                                    BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(c2);
                                    if (mod3.equals(BigInteger.ZERO)) {
                                        break;
                                    }
                                    BigInteger modPow = mod3.modPow(shiftRight, c2);
                                    BigInteger bigInteger4 = BigInteger.ONE;
                                    if (modPow.add(bigInteger4).equals(c2)) {
                                        BigInteger shiftRight2 = c2.add(bigInteger4).shiftRight(i6);
                                        BigInteger bigInteger5 = bigInteger3;
                                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                            BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                            BigInteger mod4 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(c2).multiply(mod3)).mod(c2);
                                            BigInteger mod5 = multiply.add(multiply).mod(c2);
                                            if (shiftRight2.testBit(bitLength)) {
                                                BigInteger mod6 = mod4.multiply(bigInteger3).add(mod5.multiply(mod3)).mod(c2);
                                                bigInteger4 = bigInteger3.multiply(mod5).add(mod4).mod(c2);
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
                                            if (!c2.isProbablePrime(80)) {
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
                            bigInteger = mod2.modPow(c2.add(BigInteger.ONE).shiftRight(2), c2);
                        }
                        if (bigInteger3 != null) {
                            if (bigInteger3.multiply(bigInteger3).mod(c2).compareTo(mod2) != 0) {
                                throw new GeneralSecurityException("Could not find a modular square root");
                            }
                        }
                    }
                    if (!bigInteger3.testBit(0)) {
                        c2.subtract(bigInteger3).mod(c2);
                    }
                    EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                    ECPoint w2 = eCPublicKey.getW();
                    bdt.m15735b(w2, curve2);
                    int bitLength2 = (bdt.m15736c(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
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
                    byte[] b = awr.m15065b(bArr6);
                    Mac a2 = bdo.f16177b.mo14949a(str2);
                    if (i5 <= a2.getMacLength() * 255) {
                        if (bArr5 == null || bArr5.length == 0) {
                            a2.init(new SecretKeySpec(new byte[a2.getMacLength()], str2));
                        } else {
                            a2.init(new SecretKeySpec(bArr5, str2));
                        }
                        byte[] doFinal = a2.doFinal(b);
                        byte[] bArr7 = new byte[i5];
                        a2.init(new SecretKeySpec(doFinal, str2));
                        byte[] bArr8 = new byte[0];
                        int i12 = 0;
                        while (true) {
                            a2.update(bArr8);
                            a2.update(bArr2);
                            a2.update((byte) i3);
                            byte[] doFinal2 = a2.doFinal();
                            int length8 = doFinal2.length;
                            int i13 = i12 + length8;
                            if (i13 < i5) {
                                System.arraycopy(doFinal2, 0, bArr7, i12, length8);
                                i3++;
                                bArr8 = doFinal2;
                                i12 = i13;
                            } else {
                                System.arraycopy(doFinal2, 0, bArr7, i12, i5 - i12);
                                return new bdl(bArr3, bArr7);
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
