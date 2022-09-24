package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class pb3 extends t93 {

    /* renamed from: b */
    private final ExecutorService f37572b;

    pb3(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.f37572b = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f37572b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f37572b.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f37572b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f37572b.isTerminated();
    }

    public final void shutdown() {
        this.f37572b.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f37572b.shutdownNow();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f37572b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
        sb.append(obj);
        sb.append("[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
