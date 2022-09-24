package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class pk2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ mb3 f37701a;

    /* renamed from: b */
    public final /* synthetic */ mb3 f37702b;

    public /* synthetic */ pk2(mb3 mb3, mb3 mb32) {
        this.f37701a = mb3;
        this.f37702b = mb32;
    }

    public final Object call() {
        return new rk2((String) this.f37701a.get(), (String) this.f37702b.get());
    }
}
