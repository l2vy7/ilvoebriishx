package com.google.android.gms.internal.clearcut;

import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.clearcut.h1 */
public final class C8910h1 {

    /* renamed from: a */
    static final Charset f44548a = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: b */
    private static final Charset f44549b = Charset.forName(C6540C.ISO88591_NAME);

    /* renamed from: c */
    public static final byte[] f44550c;

    /* renamed from: d */
    private static final ByteBuffer f44551d;

    /* renamed from: e */
    private static final C8926j0 f44552e;

    static {
        byte[] bArr = new byte[0];
        f44550c = bArr;
        f44551d = ByteBuffer.wrap(bArr);
        f44552e = C8926j0.m41882b(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    static <T> T m41832a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static int m41833b(byte[] bArr) {
        int length = bArr.length;
        int c = m41834c(length, bArr, 0, length);
        if (c == 0) {
            return 1;
        }
        return c;
    }

    /* renamed from: c */
    static int m41834c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: d */
    static Object m41835d(Object obj, Object obj2) {
        return ((C8942l2) obj).mo36892b().mo37038r((C8942l2) obj2).mo36909q();
    }

    /* renamed from: e */
    static <T> T m41836e(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: f */
    public static int m41837f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static boolean m41838g(byte[] bArr) {
        return C8881d4.m41675h(bArr);
    }

    /* renamed from: h */
    public static String m41839h(byte[] bArr) {
        return new String(bArr, f44548a);
    }

    /* renamed from: i */
    static boolean m41840i(C8942l2 l2Var) {
        return false;
    }

    /* renamed from: j */
    public static int m41841j(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
