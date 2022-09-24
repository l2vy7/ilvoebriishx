package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sb3 extends pb3 implements ScheduledExecutorService {

    /* renamed from: c */
    final ScheduledExecutorService f38943c;

    sb3(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f38943c = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        bc3 E = bc3.m20214E(runnable, null);
        return new qb3(E, this.f38943c.schedule(E, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        rb3 rb3 = new rb3(runnable);
        return new qb3(rb3, this.f38943c.scheduleAtFixedRate(rb3, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        rb3 rb3 = new rb3(runnable);
        return new qb3(rb3, this.f38943c.scheduleWithFixedDelay(rb3, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        bc3 bc3 = new bc3(callable);
        return new qb3(bc3, this.f38943c.schedule(bc3, j, timeUnit));
    }
}
