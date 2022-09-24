package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awe */
/* compiled from: IMASDK */
public final class awe<V> extends awd implements ScheduledFuture {

    /* renamed from: a */
    private final awk<V> f15849a;

    /* renamed from: b */
    private final ScheduledFuture f15850b;

    protected awe(awk<V> awk) {
        super((byte[]) null);
        ars.m14627g(awk);
        this.f15849a = awk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14445a() {
        return this.f15849a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final awk<V> mo14688c() {
        return this.f15849a;
    }

    public boolean cancel(boolean z) {
        boolean cancel = mo14690d().cancel(z);
        if (cancel) {
            this.f15850b.cancel(z);
        }
        return cancel;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15850b.compareTo((Delayed) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Future mo14690d() {
        return this.f15849a;
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f15850b.getDelay(timeUnit);
    }

    public awe(awk awk, ScheduledFuture scheduledFuture) {
        this(awk);
        this.f15850b = scheduledFuture;
    }
}
