package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gz */
/* compiled from: IMASDK */
final class C4033gz implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f17348a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f17349b = new AtomicInteger(1);

    C4033gz() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f17348a.newThread(runnable);
        int andIncrement = this.f17349b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
