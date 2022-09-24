package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awn */
/* compiled from: IMASDK */
final class awn extends awc implements ScheduledExecutorService {

    /* renamed from: a */
    final ScheduledExecutorService f15859a;

    awn(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        ars.m14627g(scheduledExecutorService);
        this.f15859a = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        awp q = awp.m15060q(runnable, null);
        return new awe(q, this.f15859a.schedule(q, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        awm awm = new awm(runnable);
        return new awe(awm, this.f15859a.scheduleAtFixedRate(awm, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        awm awm = new awm(runnable);
        return new awe(awm, this.f15859a.scheduleWithFixedDelay(awm, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        awp p = awp.m15059p(callable);
        return new awe(p, this.f15859a.schedule(p, j, timeUnit));
    }
}
