package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class ua3<V> extends g63 implements Future<V> {
    protected ua3() {
    }

    public final V get() throws InterruptedException, ExecutionException {
        return mo35155i().get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract Future<? extends V> mo35155i();

    public final boolean isCancelled() {
        return mo35155i().isCancelled();
    }

    public final boolean isDone() {
        return mo35155i().isDone();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo35155i().get(j, timeUnit);
    }
}
