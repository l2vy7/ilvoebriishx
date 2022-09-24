package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qb3<V> extends va3<V> implements ScheduledFuture<V> {

    /* renamed from: c */
    private final ScheduledFuture<?> f37957c;

    public qb3(mb3<V> mb3, ScheduledFuture<?> scheduledFuture) {
        super(mb3);
        this.f37957c = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = mo35155i().cancel(z);
        if (cancel) {
            this.f37957c.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f37957c.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f37957c.getDelay(timeUnit);
    }
}
