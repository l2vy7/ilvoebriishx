package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkb */
/* compiled from: IMASDK */
final class bkb {

    /* renamed from: a */
    private static final bmw f16516a = new bmw((byte[]) null);

    /* renamed from: b */
    private static final bmw f16517b;

    static {
        bmw bmw = null;
        try {
            bmw = (bmw) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f16517b = bmw;
    }

    /* renamed from: a */
    static bmw m16277a() {
        return f16516a;
    }

    /* renamed from: b */
    static bmw m16278b() {
        bmw bmw = f16517b;
        if (bmw != null) {
            return bmw;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
