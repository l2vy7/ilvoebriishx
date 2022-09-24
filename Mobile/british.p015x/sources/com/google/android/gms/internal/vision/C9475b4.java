package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.b4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9475b4 {

    /* renamed from: a */
    private static final C9690z3 f45594a = m44049c();

    /* renamed from: b */
    private static final C9690z3 f45595b = new C9486c4();

    /* renamed from: a */
    static C9690z3 m44047a() {
        return f45594a;
    }

    /* renamed from: b */
    static C9690z3 m44048b() {
        return f45595b;
    }

    /* renamed from: c */
    private static C9690z3 m44049c() {
        try {
            return (C9690z3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
