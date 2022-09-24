package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Looper;
import android.util.DisplayMetrics;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hf */
/* compiled from: IMASDK */
public final class C4040hf {
    static {
        "0123456789abcdef".toCharArray();
    }

    /* renamed from: a */
    public static String m17333a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return C4038hd.m17316b(bArr, true);
    }

    /* renamed from: b */
    public static String m17334b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        bej.m15776c(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: c */
    public static boolean m17335c(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: d */
    public static boolean m17336d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: e */
    public static boolean m17337e(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    /* renamed from: f */
    public static long m17338f(double d, DisplayMetrics displayMetrics) {
        double d2 = (double) displayMetrics.density;
        Double.isNaN(d2);
        return Math.round(d / d2);
    }
}
