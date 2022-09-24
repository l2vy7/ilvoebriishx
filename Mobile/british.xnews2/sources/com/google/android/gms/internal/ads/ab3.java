package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ab3<V> {

    /* renamed from: a */
    private final boolean f29589a;

    /* renamed from: b */
    private final p63<mb3<? extends V>> f29590b;

    /* synthetic */ ab3(boolean z, p63 p63, za3 za3) {
        this.f29589a = z;
        this.f29590b = p63;
    }

    /* renamed from: a */
    public final <C> mb3<C> mo30342a(Callable<C> callable, Executor executor) {
        return new oa3(this.f29590b, this.f29589a, executor, callable);
    }
}
