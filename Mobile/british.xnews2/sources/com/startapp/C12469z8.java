package com.startapp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.startapp.z8 */
/* compiled from: Sta */
public class C12469z8 implements ExecutorService {

    /* renamed from: a */
    private final ExecutorService f55204a;

    public C12469z8(ExecutorService executorService) {
        this.f55204a = executorService;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f55204a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f55204a.execute(new C11787a9(runnable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f55204a.invokeAll(C12450y8.m53794a(collection));
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f55204a.invokeAny(C12450y8.m53794a(collection));
    }

    public boolean isShutdown() {
        return this.f55204a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f55204a.isTerminated();
    }

    public void shutdown() {
        this.f55204a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f55204a.shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f55204a.submit(new C12450y8(callable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f55204a.invokeAll(C12450y8.m53794a(collection), j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f55204a.invokeAny(C12450y8.m53794a(collection), j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f55204a.submit(new C11787a9(runnable), t);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f55204a.submit(new C11787a9(runnable));
    }
}
