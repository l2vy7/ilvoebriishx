package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ya3<V> implements Runnable {

    /* renamed from: b */
    final Future<V> f41774b;

    /* renamed from: c */
    final xa3<? super V> f41775c;

    ya3(Future<V> future, xa3<? super V> xa3) {
        this.f41774b = future;
        this.f41775c = xa3;
    }

    public final void run() {
        Throwable a;
        Future<V> future = this.f41774b;
        if (!(future instanceof ec3) || (a = fc3.m32113a((ec3) future)) == null) {
            try {
                this.f41775c.zzb(bb3.m30656p(this.f41774b));
            } catch (ExecutionException e) {
                this.f41775c.zza(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f41775c.zza(e2);
            }
        } else {
            this.f41775c.zza(a);
        }
    }

    public final String toString() {
        v33 a = w33.m39025a(this);
        a.mo18896a(this.f41775c);
        return a.toString();
    }
}
