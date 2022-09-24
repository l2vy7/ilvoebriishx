package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgl */
/* compiled from: IMASDK */
final class bgl extends bgo {

    /* renamed from: a */
    final /* synthetic */ Method f16297a;

    /* renamed from: b */
    final /* synthetic */ int f16298b;

    bgl(Method method, int i) {
        this.f16297a = method;
        this.f16298b = i;
    }

    /* renamed from: a */
    public final <T> T mo15081a(Class<T> cls) throws Exception {
        bgo.m15861b(cls);
        return this.f16297a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f16298b)});
    }
}
