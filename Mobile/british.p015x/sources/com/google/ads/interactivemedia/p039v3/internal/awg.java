package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awg */
/* compiled from: IMASDK */
final class awg<V> implements Runnable {

    /* renamed from: a */
    final Future<V> f15851a;

    /* renamed from: b */
    final awf<? super V> f15852b;

    awg(Future<V> future, awf<? super V> awf) {
        this.f15851a = future;
        this.f15852b = awf;
    }

    public final void run() {
        boolean z;
        V v;
        Throwable a;
        Future<V> future = this.f15851a;
        if (!(future instanceof awq) || (a = awr.m15064a((awq) future)) == null) {
            try {
                Future<V> future2 = this.f15851a;
                z = false;
                if (future2.isDone()) {
                    while (true) {
                        v = future2.get();
                        break;
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    this.f15852b.mo14698b(v);
                    return;
                }
                throw new IllegalStateException(aru.m14637c("Future was expected to be done: %s", future2));
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException e) {
                this.f15852b.mo14697a(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f15852b.mo14697a(e2);
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        } else {
            this.f15852b.mo14697a(a);
        }
    }

    public final String toString() {
        return arq.m14617a(this).mo14246a(this.f15852b).toString();
    }
}
