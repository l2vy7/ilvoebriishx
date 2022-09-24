package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gt */
/* compiled from: IMASDK */
public final class C4027gt {

    /* renamed from: a */
    private static Cipher f17337a;

    /* renamed from: b */
    private static final Object f17338b = new Object();

    /* renamed from: c */
    private static final Object f17339c = new Object();

    /* renamed from: c */
    private static final Cipher m17282c() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f17339c) {
            if (f17337a == null) {
                f17337a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f17337a;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo15886a(byte[] bArr, byte[] bArr2) throws C4026gs {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f17338b) {
                m17282c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m17282c().doFinal(bArr2);
                iv = m17282c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return C4038hd.m17316b(bArr3, false);
        } catch (NoSuchAlgorithmException e) {
            throw new C4026gs(e);
        } catch (InvalidKeyException e2) {
            throw new C4026gs(e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C4026gs(e3);
        } catch (NoSuchPaddingException e4) {
            throw new C4026gs(e4);
        } catch (BadPaddingException e5) {
            throw new C4026gs(e5);
        }
    }

    /* renamed from: b */
    public final byte[] mo15887b(byte[] bArr, String str) throws C4026gs {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] c = C4038hd.m17317c(str, false);
            int length2 = c.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(c);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[(length2 - 16)];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f17338b) {
                    m17282c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = m17282c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new C4026gs();
        } catch (NoSuchAlgorithmException e) {
            throw new C4026gs(e);
        } catch (InvalidKeyException e2) {
            throw new C4026gs(e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C4026gs(e3);
        } catch (NoSuchPaddingException e4) {
            throw new C4026gs(e4);
        } catch (BadPaddingException e5) {
            throw new C4026gs(e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new C4026gs(e6);
        } catch (IllegalArgumentException e7) {
            throw new C4026gs(e7);
        }
    }
}
