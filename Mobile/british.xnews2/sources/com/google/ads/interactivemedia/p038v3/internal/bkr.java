package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkr */
/* compiled from: IMASDK */
public final class bkr {

    /* renamed from: a */
    static final Charset f16599a = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: b */
    public static final byte[] f16600b;

    static {
        Charset.forName(C6540C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        f16600b = bArr;
        ByteBuffer.wrap(bArr);
        bjs.m16089a(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static boolean m16338a(byte[] bArr) {
        return bna.m16777a(bArr);
    }

    /* renamed from: b */
    public static String m16339b(byte[] bArr) {
        return new String(bArr, f16599a);
    }

    /* renamed from: c */
    public static int m16340c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m16341d(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: e */
    public static int m16342e(byte[] bArr) {
        int length = bArr.length;
        int f = m16343f(length, bArr, 0, length);
        if (f == 0) {
            return 1;
        }
        return f;
    }

    /* renamed from: f */
    static int m16343f(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: g */
    static boolean m16344g(bln bln) {
        if (!(bln instanceof bjd)) {
            return false;
        }
        bjd bjd = (bjd) bln;
        throw null;
    }

    /* renamed from: h */
    static Object m16345h(Object obj, Object obj2) {
        return ((bln) obj).mo15169aT().mo15162Z((bln) obj2).mo15386af();
    }

    /* renamed from: i */
    static <T> void m16346i(T t) {
        Objects.requireNonNull(t);
    }

    /* renamed from: j */
    static <T> void m16347j(T t, String str) {
        Objects.requireNonNull(t, str);
    }
}
