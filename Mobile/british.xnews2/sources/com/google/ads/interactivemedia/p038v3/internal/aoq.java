package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aoq */
/* compiled from: IMASDK */
public final class aoq {

    /* renamed from: a */
    private static final AtomicReference<aop> f15505a = new AtomicReference<>();

    static {
        new AtomicBoolean();
    }

    /* renamed from: a */
    static aop m14473a() {
        return f15505a.get();
    }

    /* renamed from: b */
    public static void m14474b(aop aop) {
        f15505a.set(aop);
    }
}
