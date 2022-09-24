package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9177h8 {

    /* renamed from: a */
    private static final C9147f8 f45068a = new C9162g8();

    /* renamed from: b */
    private static final C9147f8 f45069b;

    static {
        C9147f8 f8Var;
        try {
            f8Var = (C9147f8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f8Var = null;
        }
        f45069b = f8Var;
    }

    /* renamed from: a */
    static C9147f8 m42985a() {
        C9147f8 f8Var = f45069b;
        if (f8Var != null) {
            return f8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C9147f8 m42986b() {
        return f45068a;
    }
}
