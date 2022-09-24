package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9268n8 implements C9378u9 {

    /* renamed from: a */
    private static final C9268n8 f45313a = new C9268n8();

    private C9268n8() {
    }

    /* renamed from: a */
    public static C9268n8 m43243a() {
        return f45313a;
    }

    /* renamed from: b */
    public final C9347s9 mo37717b(Class cls) {
        String str;
        Class<C9330r8> cls2 = C9330r8.class;
        if (!cls2.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "Unsupported message type: ".concat(name);
            } else {
                str = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str);
        }
        try {
            return (C9347s9) C9330r8.m43559r(cls.asSubclass(cls2)).mo37393y(3, (Object) null, (Object) null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }

    /* renamed from: c */
    public final boolean mo37718c(Class cls) {
        return C9330r8.class.isAssignableFrom(cls);
    }
}
