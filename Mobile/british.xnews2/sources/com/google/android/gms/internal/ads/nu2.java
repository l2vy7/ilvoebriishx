package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class nu2 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f36138a = new AtomicInteger(1);

    nu2() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f36138a.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
