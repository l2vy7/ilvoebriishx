package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class na3<T> extends kb3<T> {

    /* renamed from: d */
    private final Executor f35962d;

    /* renamed from: e */
    final /* synthetic */ oa3 f35963e;

    na3(oa3 oa3, Executor executor) {
        this.f35963e = oa3;
        Objects.requireNonNull(executor);
        this.f35962d = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo30346d(Throwable th) {
        this.f35963e.f20612q = null;
        if (th instanceof ExecutionException) {
            this.f35963e.mo18664w(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f35963e.cancel(false);
        } else {
            this.f35963e.mo18664w(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo30347e(T t) {
        this.f35963e.f20612q = null;
        mo33515h(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo30348f() {
        return this.f35963e.isDone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo33515h(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo33673i() {
        try {
            this.f35962d.execute(this);
        } catch (RejectedExecutionException e) {
            this.f35963e.mo18664w(e);
        }
    }
}
