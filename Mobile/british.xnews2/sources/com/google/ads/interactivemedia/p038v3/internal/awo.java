package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awo */
/* compiled from: IMASDK */
public final class awo {
    /* renamed from: a */
    public static awl m15056a(ExecutorService executorService) {
        awl awl;
        if (executorService instanceof awl) {
            return (awl) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            awl = new awn((ScheduledExecutorService) executorService);
        } else {
            awl = new awc(executorService);
        }
        return awl;
    }

    /* renamed from: b */
    public static <V> void m15057b(awk<V> awk, awf<? super V> awf, Executor executor) {
        awk.mo14655b(new awg(awk, awf), executor);
    }

    /* renamed from: c */
    public static int m15058c(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
