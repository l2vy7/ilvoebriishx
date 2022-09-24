package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.v0 */
final class C9015v0 {

    /* renamed from: a */
    private static final C8994s0<?> f44755a = new C9001t0();

    /* renamed from: b */
    private static final C8994s0<?> f44756b = m42407a();

    /* renamed from: a */
    private static C8994s0<?> m42407a() {
        try {
            return (C8994s0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static C8994s0<?> m42408b() {
        return f44755a;
    }

    /* renamed from: c */
    static C8994s0<?> m42409c() {
        C8994s0<?> s0Var = f44756b;
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
