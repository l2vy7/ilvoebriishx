package com.google.android.gms.internal.vision;

import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.vision.w2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9662w2 {

    /* renamed from: a */
    static final Charset f45956a = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: b */
    private static final Charset f45957b = Charset.forName(C6540C.ISO88591_NAME);

    /* renamed from: c */
    public static final byte[] f45958c;

    /* renamed from: d */
    private static final ByteBuffer f45959d;

    /* renamed from: e */
    private static final C9672x1 f45960e;

    static {
        byte[] bArr = new byte[0];
        f45958c = bArr;
        f45959d = ByteBuffer.wrap(bArr);
        f45960e = C9672x1.m44794a(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    static <T> T m44747a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static int m44748b(byte[] bArr) {
        int length = bArr.length;
        int c = m44749c(length, bArr, 0, length);
        if (c == 0) {
            return 1;
        }
        return c;
    }

    /* renamed from: c */
    static int m44749c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: d */
    static <T> T m44750d(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: e */
    public static int m44751e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    static Object m44752f(Object obj, Object obj2) {
        return ((C9522g4) obj).mo38403c().mo38261F((C9522g4) obj2).mo38390t();
    }

    /* renamed from: g */
    static boolean m44753g(C9522g4 g4Var) {
        if (!(g4Var instanceof C9472b1)) {
            return false;
        }
        C9472b1 b1Var = (C9472b1) g4Var;
        return false;
    }

    /* renamed from: h */
    public static boolean m44754h(byte[] bArr) {
        return C9676x5.m44830i(bArr);
    }

    /* renamed from: i */
    public static String m44755i(byte[] bArr) {
        return new String(bArr, f45956a);
    }

    /* renamed from: j */
    public static int m44756j(boolean z) {
        return z ? 1231 : 1237;
    }
}
