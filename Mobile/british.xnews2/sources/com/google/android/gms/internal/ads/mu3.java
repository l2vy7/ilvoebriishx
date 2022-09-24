package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class mu3 {
    /* renamed from: b */
    public static mu3 m34909b(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new hu3(cls.getSimpleName());
        }
        return new ju3(cls.getSimpleName());
    }

    /* renamed from: a */
    public abstract void mo32456a(String str);
}
