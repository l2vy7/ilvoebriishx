package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.l2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9561l2 {

    /* renamed from: a */
    private static final C9528h2<?> f45732a = new C9544j2();

    /* renamed from: b */
    private static final C9528h2<?> f45733b = m44445a();

    /* renamed from: a */
    private static C9528h2<?> m44445a() {
        try {
            return (C9528h2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static C9528h2<?> m44446b() {
        return f45732a;
    }

    /* renamed from: c */
    static C9528h2<?> m44447c() {
        C9528h2<?> h2Var = f45733b;
        if (h2Var != null) {
            return h2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
