package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class c32 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ a32 f30233a;

    public /* synthetic */ c32(a32 a32) {
        this.f30233a = a32;
    }

    public final Object call() {
        return this.f30233a.getWritableDatabase();
    }
}
