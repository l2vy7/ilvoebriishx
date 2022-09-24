package com.google.ads.interactivemedia.p038v3.internal;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awc */
/* compiled from: IMASDK */
public class awc extends AbstractExecutorService implements awl {

    /* renamed from: a */
    private final ExecutorService f15848a;

    public awc() {
    }

    /* renamed from: a */
    public final <T> awk<T> submit(Callable<T> callable) {
        return (awk) super.submit(callable);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f15848a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f15848a.execute(runnable);
    }

    public boolean isShutdown() {
        return this.f15848a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f15848a.isTerminated();
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return awp.m15060q(runnable, t);
    }

    public void shutdown() {
        this.f15848a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f15848a.shutdownNow();
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return (awk) super.submit(runnable);
    }

    awc(ExecutorService executorService) {
        this();
        ars.m14627g(executorService);
        this.f15848a = executorService;
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return awp.m15059p(callable);
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (awk) super.submit(runnable, obj);
    }
}
