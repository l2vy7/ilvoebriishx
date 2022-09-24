package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmr */
/* compiled from: IMASDK */
final class bmr implements PrivilegedExceptionAction<Unsafe> {
    bmr() {
    }

    /* renamed from: a */
    public static final Unsafe m16686a() throws Exception {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() throws Exception {
        return m16686a();
    }
}
