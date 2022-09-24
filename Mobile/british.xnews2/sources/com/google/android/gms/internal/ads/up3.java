package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class up3 {

    /* renamed from: a */
    static final Charset f39918a = Charset.forName(C6540C.ASCII_NAME);

    /* renamed from: b */
    static final Charset f39919b = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: c */
    static final Charset f39920c = Charset.forName(C6540C.ISO88591_NAME);

    /* renamed from: d */
    public static final byte[] f39921d;

    /* renamed from: e */
    public static final ByteBuffer f39922e;

    /* renamed from: f */
    public static final mo3 f39923f;

    static {
        byte[] bArr = new byte[0];
        f39921d = bArr;
        f39922e = ByteBuffer.wrap(bArr);
        int i = mo3.f35591e;
        f39923f = mo3.m34839g(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m38375a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m38376b(byte[] bArr) {
        int length = bArr.length;
        int d = m38378d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m38377c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m38378d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static <T> T m38379e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    static <T> T m38380f(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: g */
    static Object m38381g(Object obj, Object obj2) {
        return ((uq3) obj).mo33143i().mo33117G((uq3) obj2).mo32426v();
    }

    /* renamed from: h */
    public static String m38382h(byte[] bArr) {
        return new String(bArr, f39919b);
    }

    /* renamed from: i */
    public static boolean m38383i(byte[] bArr) {
        return vs3.m38946i(bArr);
    }
}
