package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.cf */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8479cf implements PrivilegedExceptionAction<Unsafe> {
    C8479cf() {
    }

    /* renamed from: a */
    public static final Unsafe m40751a() throws Exception {
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
        return m40751a();
    }
}
