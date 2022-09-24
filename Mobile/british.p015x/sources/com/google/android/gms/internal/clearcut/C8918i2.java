package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.i2 */
final class C8918i2 {

    /* renamed from: a */
    private static final C8904g2 f44558a = m41858c();

    /* renamed from: b */
    private static final C8904g2 f44559b = new C8911h2();

    /* renamed from: a */
    static C8904g2 m41856a() {
        return f44558a;
    }

    /* renamed from: b */
    static C8904g2 m41857b() {
        return f44559b;
    }

    /* renamed from: c */
    private static C8904g2 m41858c() {
        try {
            return (C8904g2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
