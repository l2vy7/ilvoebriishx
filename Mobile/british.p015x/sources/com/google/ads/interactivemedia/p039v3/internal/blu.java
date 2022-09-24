package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.blu */
/* compiled from: IMASDK */
final class blu {

    /* renamed from: a */
    private static final blu f16663a = new blu();

    /* renamed from: b */
    private final blz f16664b = new blf();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, bly<?>> f16665c = new ConcurrentHashMap();

    private blu() {
    }

    /* renamed from: a */
    public static blu m16503a() {
        return f16663a;
    }

    /* renamed from: b */
    public final <T> bly<T> mo15458b(Class<T> cls) {
        bkr.m16347j(cls, "messageType");
        bly<T> bly = (bly) this.f16665c.get(cls);
        if (bly == null) {
            bly = this.f16664b.mo15432a(cls);
            bkr.m16347j(cls, "messageType");
            bkr.m16347j(bly, "schema");
            bly<T> putIfAbsent = this.f16665c.putIfAbsent(cls, bly);
            return putIfAbsent == null ? bly : putIfAbsent;
        }
    }

    /* renamed from: c */
    public final <T> bly<T> mo15459c(T t) {
        return mo15458b(t.getClass());
    }
}
