package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.yi2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hh2<S extends yi2> implements zi2<S> {

    /* renamed from: a */
    private final zi2<S> f32732a;

    /* renamed from: b */
    private final long f32733b;

    /* renamed from: c */
    private final ScheduledExecutorService f32734c;

    public hh2(zi2<S> zi2, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f32732a = zi2;
        this.f32733b = j;
        this.f32734c = scheduledExecutorService;
    }

    public final mb3<S> zzb() {
        mb3<S> zzb = this.f32732a.zzb();
        long j = this.f32733b;
        if (j > 0) {
            zzb = bb3.m30655o(zzb, j, TimeUnit.MILLISECONDS, this.f32734c);
        }
        return bb3.m30647g(zzb, Throwable.class, gh2.f32324a, po0.f37727f);
    }
}
