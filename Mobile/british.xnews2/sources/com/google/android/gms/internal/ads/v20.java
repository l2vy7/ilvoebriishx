package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class v20 {

    /* renamed from: a */
    private static final AtomicReference<t20> f40263a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<u20> f40264b = new AtomicReference<>();

    /* renamed from: c */
    static final AtomicBoolean f40265c = new AtomicBoolean();

    /* renamed from: a */
    static t20 m38683a() {
        return f40263a.get();
    }

    /* renamed from: b */
    static u20 m38684b() {
        return f40264b.get();
    }

    /* renamed from: c */
    public static void m38685c(t20 t20) {
        f40263a.set(t20);
    }
}
