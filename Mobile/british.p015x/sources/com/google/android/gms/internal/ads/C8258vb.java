package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.vb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8258vb implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f40374a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f40375b = new AtomicInteger(1);

    C8258vb() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f40374a.newThread(runnable);
        int andIncrement = this.f40375b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
