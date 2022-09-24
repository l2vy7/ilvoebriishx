package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b93<V, X extends Throwable> extends d93<V, X, ha3<? super X, ? extends V>, mb3<? extends V>> {
    b93(mb3<? extends V> mb3, Class<X> cls, ha3<? super X, ? extends V> ha3) {
        super(mb3, cls, ha3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* bridge */ /* synthetic */ Object mo18226E(Object obj, Throwable th) throws Exception {
        ha3 ha3 = (ha3) obj;
        mb3 zza = ha3.zza(th);
        b43.m20207d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ha3);
        return zza;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo18227F(Object obj) {
        mo18665x((mb3) obj);
    }
}
