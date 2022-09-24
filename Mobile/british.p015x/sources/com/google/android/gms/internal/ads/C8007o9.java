package com.google.android.gms.internal.ads;

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

/* renamed from: com.google.android.gms.internal.ads.o9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8007o9 {

    /* renamed from: a */
    static boolean f36337a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static MessageDigest f36338b;

    /* renamed from: c */
    private static final Object f36339c = new Object();

    /* renamed from: d */
    private static final Object f36340d = new Object();

    /* renamed from: e */
    static final CountDownLatch f36341e = new CountDownLatch(1);

    /* renamed from: a */
    static String m35597a(C8218u8 u8Var, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] g = u8Var.mo33365g();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37017X1)).booleanValue()) {
            Vector<byte[]> b = m35598b(g, 255);
            if (b == null || b.size() == 0) {
                bArr = m35603g(m35602f(4096).mo33365g(), str, true);
            } else {
                C7748h9 E = C7786i9.m33121E();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    E.mo32371y(eo3.m31873L(m35603g(b.get(i), str, false)));
                }
                E.mo32369B(eo3.m31873L(m35601e(g)));
                bArr = ((C7786i9) E.mo32424p()).mo33365g();
            }
        } else if (C7498ac.f29598a != null) {
            byte[] a = C7498ac.f29598a.mo32167a(g, str != null ? str.getBytes() : new byte[0]);
            C7748h9 E2 = C7786i9.m33121E();
            E2.mo32371y(eo3.m31873L(a));
            E2.mo32370C(3);
            bArr = ((C7786i9) E2.mo32424p()).mo33365g();
        } else {
            throw new GeneralSecurityException();
        }
        return C7859k9.m33875a(bArr, true);
    }

    /* renamed from: b */
    static Vector<byte[]> m35598b(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: d */
    static void m35600d() {
        synchronized (f36340d) {
            if (!f36337a) {
                f36337a = true;
                new Thread(new C7971n9((C7933m9) null)).start();
            }
        }
    }

    /* renamed from: e */
    public static byte[] m35601e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f36339c) {
            m35600d();
            MessageDigest messageDigest = null;
            try {
                if (f36341e.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = f36338b;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = f36338b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    /* renamed from: f */
    static C8218u8 m35602f(int i) {
        C7600d8 f0 = C8218u8.m38216f0();
        f0.mo31138E0(4096);
        return (C8218u8) f0.mo32424p();
    }

    /* renamed from: g */
    private static byte[] m35603g(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = m35602f(4096).mo33365g();
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
            bArr2 = ByteBuffer.allocate(256).put(m35601e(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        C8042p9[] p9VarArr = new C8043pa().f37397G2;
        int length2 = p9VarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            p9VarArr[i2].mo30642a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new jn3(str.getBytes(C6540C.UTF8_NAME)).mo32911a(bArr4);
        }
        return bArr4;
    }
}
