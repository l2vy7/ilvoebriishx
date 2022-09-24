package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.p4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9595p4 {

    /* renamed from: a */
    private static final C9579n4 f45823a = m44522c();

    /* renamed from: b */
    private static final C9579n4 f45824b = new C9571m4();

    /* renamed from: a */
    static C9579n4 m44520a() {
        return f45823a;
    }

    /* renamed from: b */
    static C9579n4 m44521b() {
        return f45824b;
    }

    /* renamed from: c */
    private static C9579n4 m44522c() {
        try {
            return (C9579n4) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
