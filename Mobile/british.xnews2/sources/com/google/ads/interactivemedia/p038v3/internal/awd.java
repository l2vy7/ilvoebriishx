package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awd */
/* compiled from: IMASDK */
public abstract class awd<V> extends ath implements Future<V>, awk {
    protected awd() {
    }

    protected awd(byte[] bArr) {
        this();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo14445a() {
        throw null;
    }

    /* renamed from: b */
    public void mo14655b(Runnable runnable, Executor executor) {
        mo14688c().mo14655b(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract awk mo14688c();

    public boolean cancel(boolean z) {
        return mo14690d().cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* bridge */ /* synthetic */ Future mo14690d() {
        throw null;
    }

    public final V get() throws InterruptedException, ExecutionException {
        return mo14690d().get();
    }

    public final boolean isCancelled() {
        return mo14690d().isCancelled();
    }

    public final boolean isDone() {
        return mo14690d().isDone();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo14690d().get(j, timeUnit);
    }
}
