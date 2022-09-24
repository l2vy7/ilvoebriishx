package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class bp0<T> {

    /* renamed from: a */
    private final uo0<T> f30065a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f30066b = new AtomicInteger(0);

    public bp0() {
        uo0<T> uo0 = new uo0<>();
        this.f30065a = uo0;
        bb3.m30658r(uo0, new zo0(this), po0.f37727f);
    }

    @Deprecated
    /* renamed from: a */
    public final int mo30760a() {
        return this.f30066b.get();
    }

    @Deprecated
    /* renamed from: c */
    public final void mo30761c() {
        this.f30065a.zze(new Exception());
    }

    @Deprecated
    /* renamed from: d */
    public final void mo30762d(T t) {
        this.f30065a.zzd(t);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo30763e(yo0<T> yo0, wo0 wo0) {
        bb3.m30658r(this.f30065a, new ap0(this, yo0, wo0), po0.f37727f);
    }
}
