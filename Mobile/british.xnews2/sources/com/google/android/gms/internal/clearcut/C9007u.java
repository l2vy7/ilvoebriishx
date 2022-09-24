package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.u */
final class C9007u {

    /* renamed from: a */
    private static final Class<?> f44745a = m42368a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f44746b = (m42368a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m42368a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m42369b() {
        return f44745a != null && !f44746b;
    }

    /* renamed from: c */
    static Class<?> m42370c() {
        return f44745a;
    }
}
