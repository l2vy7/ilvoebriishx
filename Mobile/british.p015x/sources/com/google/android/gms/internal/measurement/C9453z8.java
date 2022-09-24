package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.z8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9453z8 {

    /* renamed from: a */
    static final Charset f45542a = Charset.forName(C6540C.ASCII_NAME);

    /* renamed from: b */
    static final Charset f45543b = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: c */
    static final Charset f45544c = Charset.forName(C6540C.ISO88591_NAME);

    /* renamed from: d */
    public static final byte[] f45545d;

    /* renamed from: e */
    public static final ByteBuffer f45546e;

    /* renamed from: f */
    public static final C9392v7 f45547f;

    static {
        byte[] bArr = new byte[0];
        f45545d = bArr;
        f45546e = ByteBuffer.wrap(bArr);
        int i = C9392v7.f45502a;
        C9361t7 t7Var = new C9361t7(bArr, 0, 0, false, (C9345s7) null);
        try {
            t7Var.mo38058c(0);
            f45547f = t7Var;
        } catch (C9085b9 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m43970a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m43971b(byte[] bArr) {
        int length = bArr.length;
        int d = m43973d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m43972c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m43973d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m43974e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m43975f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    static Object m43976g(Object obj, Object obj2) {
        return ((C9409w9) obj).mo37993d().mo37312E((C9409w9) obj2).mo37841x();
    }

    /* renamed from: h */
    public static String m43977h(byte[] bArr) {
        return new String(bArr, f45543b);
    }

    /* renamed from: i */
    public static boolean m43978i(byte[] bArr) {
        return C9240lb.m43188e(bArr);
    }
}
