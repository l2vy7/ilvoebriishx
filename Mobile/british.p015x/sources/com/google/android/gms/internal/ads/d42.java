package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class d42 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ f42 f30631a;

    public /* synthetic */ d42(f42 f42) {
        this.f30631a = f42;
    }

    public final Object call() {
        return this.f30631a.getWritableDatabase();
    }
}
