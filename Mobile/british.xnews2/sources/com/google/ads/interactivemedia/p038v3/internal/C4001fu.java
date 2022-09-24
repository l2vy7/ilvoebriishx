package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fu */
/* compiled from: IMASDK */
final class C4001fu {

    /* renamed from: a */
    static boolean f17084a = false;

    /* renamed from: b */
    static final CountDownLatch f17085b = new CountDownLatch(1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static MessageDigest f17086c;

    /* renamed from: d */
    private static final Object f17087d = new Object();

    /* renamed from: e */
    private static final Object f17088e = new Object();

    /* renamed from: a */
    static void m17209a() {
        synchronized (f17088e) {
            if (!f17084a) {
                f17084a = true;
                new Thread(new C4000ft((byte[]) null)).start();
            }
        }
    }

    /* renamed from: b */
    static String m17210b(C4385u uVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] aV = uVar.mo15165aV();
        if (aok.f15496l.mo14149f().booleanValue()) {
            Vector<byte[]> g = m17215g(aV);
            if (g == null || g.size() == 0) {
                bArr = m17216h(m17211c(C4223o.PSN_ENCODE_SIZE_FAIL).mo15165aV(), str, true);
            } else {
                C3836ag a = C3837ah.m13665a();
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    a.mo13643a(bjq.m16051n(m17216h(g.get(i), str, false)));
                }
                a.mo13645c(bjq.m16051n(m17212d(aV)));
                bArr = ((C3837ah) a.mo15385ae()).mo15165aV();
            }
        } else if (C4038hd.f17375a != null) {
            byte[] a2 = C4038hd.f17375a.mo14719a(aV, str != null ? str.getBytes() : new byte[0]);
            C3836ag a3 = C3837ah.m13665a();
            a3.mo13643a(bjq.m16051n(a2));
            a3.mo13644b(C3829aa.TINK_HYBRID);
            bArr = ((C3837ah) a3.mo15385ae()).mo15165aV();
        } else {
            throw new GeneralSecurityException();
        }
        return C4038hd.m17316b(bArr, true);
    }

    /* renamed from: c */
    static C4385u m17211c(C4223o oVar) {
        C4115k g = C4385u.m19061g();
        g.mo16044B((long) oVar.mo16388a());
        return (C4385u) g.mo15385ae();
    }

    /* renamed from: d */
    public static byte[] m17212d(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f17087d) {
            m17209a();
            MessageDigest messageDigest = null;
            try {
                if (f17085b.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = f17086c;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = f17086c.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    /* renamed from: f */
    static byte[] m17214f(String str, String str2) {
        byte[] bArr;
        C4439w a = C4466x.m19426a();
        try {
            if (str.length() < 3) {
                bArr = str.getBytes(C6540C.ISO88591_NAME);
            } else {
                bArr = C4038hd.m17317c(str, true);
            }
            a.mo16729b(bjq.m16051n(bArr));
            a.mo16728a(bjq.m16051n(str2.length() < 3 ? str2.getBytes(C6540C.ISO88591_NAME) : C4038hd.m17317c(str2, true)));
            return ((C4466x) a.mo15385ae()).mo15165aV();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    /* renamed from: g */
    static Vector<byte[]> m17215g(byte[] bArr) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i3 > 255) {
                    length2 = i3 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i3, length2));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: h */
    private static byte[] m17216h(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = m17211c(C4223o.PSN_ENCODE_SIZE_FAIL).mo15165aV();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr3 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(m17212d(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        C4002fv[] fvVarArr = new C4016gi().f17250cN;
        int length2 = fvVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            fvVarArr[i2].mo15860a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new bja(str.getBytes(C6540C.UTF8_NAME)).mo15159a(bArr4);
        }
        return bArr4;
    }
}
