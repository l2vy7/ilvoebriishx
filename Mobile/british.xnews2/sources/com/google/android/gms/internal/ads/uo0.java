package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class uo0<T> implements mb3<T> {

    /* renamed from: b */
    private final ub3<T> f20922b = ub3.m38262D();

    /* renamed from: b */
    private static final boolean m21081b(boolean z) {
        if (!z) {
            zzt.zzo().mo18591r(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public boolean cancel(boolean z) {
        return this.f20922b.cancel(z);
    }

    public final T get() throws ExecutionException, InterruptedException {
        return this.f20922b.get();
    }

    public final boolean isCancelled() {
        return this.f20922b.isCancelled();
    }

    public final boolean isDone() {
        return this.f20922b.isDone();
    }

    public final void zzc(Runnable runnable, Executor executor) {
        this.f20922b.zzc(runnable, executor);
    }

    public final boolean zzd(T t) {
        boolean v = this.f20922b.mo18663v(t);
        m21081b(v);
        return v;
    }

    public final boolean zze(Throwable th) {
        boolean w = this.f20922b.mo18664w(th);
        m21081b(w);
        return w;
    }

    public final T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f20922b.get(j, timeUnit);
    }
}
