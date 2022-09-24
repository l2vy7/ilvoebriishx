package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class t93 extends AbstractExecutorService implements nb3 {
    /* renamed from: b */
    public final <T> mb3<T> mo33675b(Callable<T> callable) {
        return (mb3) super.submit(callable);
    }

    /* renamed from: c */
    public final mb3<?> mo33676c(Runnable runnable) {
        return (mb3) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return bc3.m20214E(runnable, t);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (mb3) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new bc3(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (mb3) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (mb3) super.submit(callable);
    }
}
