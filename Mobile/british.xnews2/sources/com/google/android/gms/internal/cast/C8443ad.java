package com.google.android.gms.internal.cast;

import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.cast.ad */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8443ad {

    /* renamed from: a */
    static final Charset f43264a = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: b */
    static final Charset f43265b = Charset.forName(C6540C.ISO88591_NAME);

    /* renamed from: c */
    public static final byte[] f43266c;

    /* renamed from: d */
    public static final ByteBuffer f43267d;

    /* renamed from: e */
    public static final C8442ac f43268e;

    static {
        byte[] bArr = new byte[0];
        f43266c = bArr;
        f43267d = ByteBuffer.wrap(bArr);
        C8842zb zbVar = new C8842zb(bArr, 0, 0, false, (C8812xb) null);
        try {
            zbVar.mo36786a(0);
            f43268e = zbVar;
        } catch (C8460bd e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    static <T> T m40689a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    static <T> T m40690b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static boolean m40691c(byte[] bArr) {
        return C8612kf.m41104a(bArr);
    }

    /* renamed from: d */
    public static String m40692d(byte[] bArr) {
        return new String(bArr, f43264a);
    }

    /* renamed from: e */
    public static int m40693e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    public static int m40694f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static int m40695g(byte[] bArr) {
        int length = bArr.length;
        int h = m40696h(length, bArr, 0, length);
        if (h == 0) {
            return 1;
        }
        return h;
    }

    /* renamed from: h */
    static int m40696h(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: i */
    static Object m40697i(Object obj, Object obj2) {
        return ((C8782vd) obj).zzA().mo36564D((C8782vd) obj2).zzr();
    }
}
