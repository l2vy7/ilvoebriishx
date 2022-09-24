package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awp */
/* compiled from: IMASDK */
final class awp<V> extends awh implements RunnableFuture<V> {

    /* renamed from: a */
    private volatile awj<?> f15860a;

    awp(Callable<V> callable) {
        super((char[]) null);
        this.f15860a = new awj<>(this, callable);
    }

    /* renamed from: p */
    static <V> awp<V> m15059p(Callable<V> callable) {
        return new awp<>(callable);
    }

    /* renamed from: q */
    static <V> awp<V> m15060q(Runnable runnable, V v) {
        return new awp<>(Executors.callable(runnable, v));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo14656c() {
        awj<?> awj;
        if (mo14654a() && (awj = this.f15860a) != null) {
            awj.mo14702a();
        }
        this.f15860a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo14659e() {
        awj<?> awj = this.f15860a;
        if (awj == null) {
            return super.mo14659e();
        }
        String valueOf = String.valueOf(awj);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        awj<?> awj = this.f15860a;
        if (awj != null) {
            awj.run();
        }
        this.f15860a = null;
    }
}
