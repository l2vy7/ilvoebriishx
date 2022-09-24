package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdd */
/* compiled from: IMASDK */
public final class bdd implements awv {

    /* renamed from: a */
    public static final int f16153a = azc.f15919a;

    /* renamed from: b */
    private static final Collection<Integer> f16154b = Arrays.asList(new Integer[]{64});

    /* renamed from: c */
    private static final byte[] f16155c = new byte[16];

    /* renamed from: d */
    private static final byte[] f16156d = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: e */
    private final bdu f16157e;

    /* renamed from: f */
    private final byte[] f16158f;

    public bdd(byte[] bArr) throws GeneralSecurityException {
        azc.m15270a(f16153a);
        Collection<Integer> collection = f16154b;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.f16158f = Arrays.copyOfRange(bArr, i, length);
            this.f16157e = new bdu(copyOfRange);
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }

    /* renamed from: a */
    public final byte[] mo14718a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        if (bArr.length <= 2147483631) {
            Cipher a = bdo.f16176a.mo14949a("AES/CTR/NoPadding");
            byte[][] bArr4 = {bArr2, bArr};
            byte[] a2 = this.f16157e.mo14784a(f16155c, 16);
            for (char c = 0; c <= 0; c = 1) {
                byte[] bArr5 = bArr4[0];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                a2 = awr.m15068e(bdt.m15740g(a2), this.f16157e.mo14784a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length = bArr6.length;
            if (length >= 16) {
                int length2 = a2.length;
                if (length >= length2) {
                    int i = length - length2;
                    bArr3 = Arrays.copyOf(bArr6, length);
                    for (int i2 = 0; i2 < a2.length; i2++) {
                        int i3 = i + i2;
                        bArr3[i3] = (byte) (bArr3[i3] ^ a2[i2]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = awr.m15068e(bdt.m15741h(bArr6), bdt.m15740g(a2));
            }
            byte[] a3 = this.f16157e.mo14784a(bArr3, 16);
            byte[] bArr7 = (byte[]) a3.clone();
            bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
            bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
            a.init(1, new SecretKeySpec(this.f16158f, "AES"), new IvParameterSpec(bArr7));
            return awr.m15065b(a3, a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
