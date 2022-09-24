package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.jc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8592jc {

    /* renamed from: a */
    private static final C8559hc<?> f43624a = new C8576ic();

    /* renamed from: b */
    private static final C8559hc<?> f43625b;

    static {
        C8559hc<?> hcVar;
        try {
            hcVar = (C8559hc) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            hcVar = null;
        }
        f43625b = hcVar;
    }

    /* renamed from: a */
    static C8559hc<?> m41028a() {
        return f43624a;
    }

    /* renamed from: b */
    static C8559hc<?> m41029b() {
        C8559hc<?> hcVar = f43625b;
        if (hcVar != null) {
            return hcVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
