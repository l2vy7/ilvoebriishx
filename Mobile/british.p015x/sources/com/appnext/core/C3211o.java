package com.appnext.core;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appnext.core.o */
public final class C3211o {

    /* renamed from: ef */
    private static int f12379ef = Runtime.getRuntime().availableProcessors();

    /* renamed from: eh */
    private static final TimeUnit f12380eh = TimeUnit.SECONDS;

    /* renamed from: ej */
    private static volatile C3211o f12381ej;

    /* renamed from: eg */
    private final BlockingQueue<Runnable> f12382eg = new LinkedBlockingQueue();

    /* renamed from: ei */
    private ThreadPoolExecutor f12383ei = ((ThreadPoolExecutor) Executors.newCachedThreadPool());

    /* renamed from: az */
    public static C3211o m10825az() {
        if (f12381ej == null) {
            synchronized (C3204j.class) {
                if (f12381ej == null) {
                    f12381ej = new C3211o();
                }
            }
        }
        return f12381ej;
    }

    /* renamed from: a */
    public final void mo10821a(Runnable runnable) {
        if (runnable != null) {
            this.f12383ei.execute(runnable);
        }
    }
}
