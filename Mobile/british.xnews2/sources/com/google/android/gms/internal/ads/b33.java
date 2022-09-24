package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class b33 implements z23 {
    /* synthetic */ b33(a33 a33) {
    }

    /* renamed from: a */
    public final ExecutorService mo30615a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    public final ExecutorService mo30616b(ThreadFactory threadFactory, int i) {
        return mo30615a(1, threadFactory, 1);
    }

    /* renamed from: m */
    public final ExecutorService mo30617m(int i) {
        return mo30615a(1, Executors.defaultThreadFactory(), 2);
    }
}
