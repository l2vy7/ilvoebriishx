package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tb3 {
    /* renamed from: a */
    public static nb3 m37770a(ExecutorService executorService) {
        nb3 nb3;
        if (executorService instanceof nb3) {
            return (nb3) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            nb3 = new sb3((ScheduledExecutorService) executorService);
        } else {
            nb3 = new pb3(executorService);
        }
        return nb3;
    }

    /* renamed from: b */
    public static Executor m37771b() {
        return pa3.INSTANCE;
    }

    /* renamed from: c */
    static Executor m37772c(Executor executor, q93<?> q93) {
        Objects.requireNonNull(executor);
        if (executor == pa3.INSTANCE) {
            return executor;
        }
        return new ob3(executor, q93);
    }
}
