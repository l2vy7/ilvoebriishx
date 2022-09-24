package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ca */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9102ca {

    /* renamed from: a */
    private static final C9086ba f44939a;

    /* renamed from: b */
    private static final C9086ba f44940b = new C9086ba();

    static {
        C9086ba baVar;
        try {
            baVar = (C9086ba) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            baVar = null;
        }
        f44939a = baVar;
    }

    /* renamed from: a */
    static C9086ba m42752a() {
        return f44939a;
    }

    /* renamed from: b */
    static C9086ba m42753b() {
        return f44940b;
    }
}
