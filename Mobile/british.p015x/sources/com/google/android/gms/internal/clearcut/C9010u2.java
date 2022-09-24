package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.u2 */
final class C9010u2 {

    /* renamed from: a */
    private static final C8996s2 f44748a = m42376c();

    /* renamed from: b */
    private static final C8996s2 f44749b = new C9003t2();

    /* renamed from: a */
    static C8996s2 m42374a() {
        return f44748a;
    }

    /* renamed from: b */
    static C8996s2 m42375b() {
        return f44749b;
    }

    /* renamed from: c */
    private static C8996s2 m42376c() {
        try {
            return (C8996s2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
