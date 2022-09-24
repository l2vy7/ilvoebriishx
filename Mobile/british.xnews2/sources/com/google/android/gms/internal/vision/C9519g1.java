package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.g1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9519g1 {

    /* renamed from: a */
    private static final Class<?> f45646a = m44270c("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f45647b = (m44270c("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m44268a() {
        return f45646a != null && !f45647b;
    }

    /* renamed from: b */
    static Class<?> m44269b() {
        return f45646a;
    }

    /* renamed from: c */
    private static <T> Class<T> m44270c(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
