package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hv2<E, V> implements mb3<V> {

    /* renamed from: b */
    private final E f32857b;

    /* renamed from: c */
    private final String f32858c;

    /* renamed from: d */
    private final mb3<V> f32859d;

    public hv2(E e, String str, mb3<V> mb3) {
        this.f32857b = e;
        this.f32858c = str;
        this.f32859d = mb3;
    }

    /* renamed from: b */
    public final E mo32457b() {
        return this.f32857b;
    }

    /* renamed from: c */
    public final String mo32458c() {
        return this.f32858c;
    }

    public final boolean cancel(boolean z) {
        return this.f32859d.cancel(z);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.f32859d.get();
    }

    public final boolean isCancelled() {
        return this.f32859d.isCancelled();
    }

    public final boolean isDone() {
        return this.f32859d.isDone();
    }

    public final String toString() {
        String str = this.f32858c;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    public final void zzc(Runnable runnable, Executor executor) {
        this.f32859d.zzc(runnable, executor);
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f32859d.get(j, timeUnit);
    }
}
