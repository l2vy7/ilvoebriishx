package com.startapp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.startapp.b9 */
/* compiled from: Sta */
public class C11804b9 implements ScheduledExecutorService {

    /* renamed from: a */
    private final ScheduledExecutorService f52629a;

    public C11804b9(ScheduledExecutorService scheduledExecutorService) {
        this.f52629a = scheduledExecutorService;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f52629a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f52629a.execute(new C11787a9(runnable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f52629a.invokeAll(C12450y8.m53794a(collection));
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f52629a.invokeAny(C12450y8.m53794a(collection));
    }

    public boolean isShutdown() {
        return this.f52629a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f52629a.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f52629a.schedule(new C11787a9(runnable), j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f52629a.scheduleAtFixedRate(new C11787a9(runnable), j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f52629a.scheduleWithFixedDelay(new C11787a9(runnable), j, j2, timeUnit);
    }

    public void shutdown() {
        this.f52629a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f52629a.shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f52629a.submit(new C12450y8(callable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f52629a.invokeAll(C12450y8.m53794a(collection), j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f52629a.invokeAny(C12450y8.m53794a(collection), j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.f52629a.schedule(new C12450y8(callable), j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f52629a.submit(new C11787a9(runnable), t);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f52629a.submit(new C11787a9(runnable));
    }
}
