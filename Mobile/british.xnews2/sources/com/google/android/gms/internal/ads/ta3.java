package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ta3<V> extends sa3<V> {

    /* renamed from: i */
    private final mb3<V> f39365i;

    ta3(mb3<V> mb3) {
        Objects.requireNonNull(mb3);
        this.f39365i = mb3;
    }

    public final boolean cancel(boolean z) {
        return this.f39365i.cancel(z);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.f39365i.get();
    }

    public final boolean isCancelled() {
        return this.f39365i.isCancelled();
    }

    public final boolean isDone() {
        return this.f39365i.isDone();
    }

    public final String toString() {
        return this.f39365i.toString();
    }

    public final void zzc(Runnable runnable, Executor executor) {
        this.f39365i.zzc(runnable, executor);
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f39365i.get(j, timeUnit);
    }
}
