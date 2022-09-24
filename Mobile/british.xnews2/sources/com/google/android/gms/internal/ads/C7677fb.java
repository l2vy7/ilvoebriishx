package com.google.android.gms.internal.ads;

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

/* renamed from: com.google.android.gms.internal.ads.fb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7677fb {

    /* renamed from: a */
    private static Cipher f31685a;

    /* renamed from: b */
    private static final Object f31686b = new Object();

    /* renamed from: c */
    private static final Object f31687c = new Object();

    public C7677fb(SecureRandom secureRandom) {
    }

    /* renamed from: c */
    private static final Cipher m32100c() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f31687c) {
            if (f31685a == null) {
                f31685a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f31685a;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo31787a(byte[] bArr, byte[] bArr2) throws C7640eb {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f31686b) {
                m32100c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m32100c().doFinal(bArr2);
                iv = m32100c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return C7859k9.m33875a(bArr3, false);
        } catch (NoSuchAlgorithmException e) {
            throw new C7640eb(this, e);
        } catch (InvalidKeyException e2) {
            throw new C7640eb(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C7640eb(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new C7640eb(this, e4);
        } catch (BadPaddingException e5) {
            throw new C7640eb(this, e5);
        }
    }

    /* renamed from: b */
    public final byte[] mo31788b(byte[] bArr, String str) throws C7640eb {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b = C7859k9.m33876b(str, false);
            int length2 = b.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(b);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[(length2 - 16)];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f31686b) {
                    m32100c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = m32100c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new C7640eb(this);
        } catch (NoSuchAlgorithmException e) {
            throw new C7640eb(this, e);
        } catch (InvalidKeyException e2) {
            throw new C7640eb(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C7640eb(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new C7640eb(this, e4);
        } catch (BadPaddingException e5) {
            throw new C7640eb(this, e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new C7640eb(this, e6);
        } catch (IllegalArgumentException e7) {
            throw new C7640eb(this, e7);
        }
    }
}
