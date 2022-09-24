package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgk */
/* compiled from: IMASDK */
final class bgk extends bgo {

    /* renamed from: a */
    final /* synthetic */ Method f16295a;

    /* renamed from: b */
    final /* synthetic */ Object f16296b;

    bgk(Method method, Object obj) {
        this.f16295a = method;
        this.f16296b = obj;
    }

    /* renamed from: a */
    public final <T> T mo15081a(Class<T> cls) throws Exception {
        bgo.m15861b(cls);
        return this.f16295a.invoke(this.f16296b, new Object[]{cls});
    }
}
