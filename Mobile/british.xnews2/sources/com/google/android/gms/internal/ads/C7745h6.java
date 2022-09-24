package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.h6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7745h6 {

    /* renamed from: a */
    public static final String f32628a = "Volley";

    /* renamed from: b */
    public static final boolean f32629b = Log.isLoggable(f32628a, 2);

    /* renamed from: c */
    private static final String f32630c = C7745h6.class.getName();

    /* renamed from: a */
    public static void m32818a(String str, Object... objArr) {
        Log.d(f32628a, m32822e(str, objArr));
    }

    /* renamed from: b */
    public static void m32819b(String str, Object... objArr) {
        Log.e(f32628a, m32822e(str, objArr));
    }

    /* renamed from: c */
    public static void m32820c(Throwable th, String str, Object... objArr) {
        Log.e(f32628a, m32822e(str, objArr), th);
    }

    /* renamed from: d */
    public static void m32821d(String str, Object... objArr) {
        if (f32629b) {
            Log.v(f32628a, m32822e(str, objArr));
        }
    }

    /* renamed from: e */
    private static String m32822e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f32630c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, format});
    }
}
