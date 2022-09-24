package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ap3 {

    /* renamed from: a */
    private static final xo3<?> f29714a = new yo3();

    /* renamed from: b */
    private static final xo3<?> f29715b;

    static {
        xo3<?> xo3;
        try {
            xo3 = (xo3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            xo3 = null;
        }
        f29715b = xo3;
    }

    /* renamed from: a */
    static xo3<?> m30431a() {
        xo3<?> xo3 = f29715b;
        if (xo3 != null) {
            return xo3;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static xo3<?> m30432b() {
        return f29714a;
    }
}
