package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hm0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f32758a = new AtomicInteger(1);

    hm0(km0 km0) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f32758a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
