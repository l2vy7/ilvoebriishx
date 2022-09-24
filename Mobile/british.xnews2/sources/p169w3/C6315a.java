package p169w3;

import android.util.Log;

/* renamed from: w3.a */
/* compiled from: Logging */
public final class C6315a {
    /* renamed from: a */
    public static void m27820a(String str, String str2, Object obj) {
        Log.d(m27823d(str), String.format(str2, new Object[]{obj}));
    }

    /* renamed from: b */
    public static void m27821b(String str, String str2, Object... objArr) {
        Log.d(m27823d(str), String.format(str2, objArr));
    }

    /* renamed from: c */
    public static void m27822c(String str, String str2, Throwable th) {
        Log.e(m27823d(str), str2, th);
    }

    /* renamed from: d */
    private static String m27823d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m27824e(String str, String str2) {
        Log.i(m27823d(str), str2);
    }

    /* renamed from: f */
    public static void m27825f(String str, String str2, Object obj) {
        Log.w(m27823d(str), String.format(str2, new Object[]{obj}));
    }
}
