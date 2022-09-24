package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kv2 {

    /* renamed from: a */
    private final Object f34492a;

    /* renamed from: b */
    private final List<mb3<?>> f34493b;

    /* renamed from: c */
    final /* synthetic */ uv2 f34494c;

    /* synthetic */ kv2(uv2 uv2, Object obj, List list, jv2 jv2) {
        this.f34494c = uv2;
        this.f34492a = obj;
        this.f34493b = list;
    }

    /* renamed from: a */
    public final <O> tv2<O> mo33189a(Callable<O> callable) {
        ab3<V> c = bb3.m30643c(this.f34493b);
        mb3<C> a = c.mo30342a(iv2.f33534a, po0.f37727f);
        uv2 uv2 = this.f34494c;
        return new tv2(uv2, this.f34492a, (String) null, a, this.f34493b, c.mo30342a(callable, uv2.f39998a), (sv2) null);
    }
}
