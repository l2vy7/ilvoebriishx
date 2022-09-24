package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.q0 */
final class C8980q0 {

    /* renamed from: a */
    private static final Class<?> f44720a = m42273a();

    /* renamed from: a */
    private static Class<?> m42273a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C8987r0 m42274b() {
        Class<?> cls = f44720a;
        if (cls != null) {
            try {
                return (C8987r0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C8987r0.f44730c;
    }
}
