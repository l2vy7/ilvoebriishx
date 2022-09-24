package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dr3 {

    /* renamed from: c */
    private static final dr3 f30988c = new dr3();

    /* renamed from: a */
    private final pr3 f30989a = new mq3();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, or3<?>> f30990b = new ConcurrentHashMap();

    private dr3() {
    }

    /* renamed from: a */
    public static dr3 m31600a() {
        return f30988c;
    }

    /* renamed from: b */
    public final <T> or3<T> mo31400b(Class<T> cls) {
        up3.m38380f(cls, "messageType");
        or3<T> or3 = (or3) this.f30990b.get(cls);
        if (or3 == null) {
            or3 = this.f30989a.mo33582a(cls);
            up3.m38380f(cls, "messageType");
            up3.m38380f(or3, "schema");
            or3<T> putIfAbsent = this.f30990b.putIfAbsent(cls, or3);
            return putIfAbsent == null ? or3 : putIfAbsent;
        }
    }
}
