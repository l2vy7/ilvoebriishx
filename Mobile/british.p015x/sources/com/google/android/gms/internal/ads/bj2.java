package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class bj2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f30023a;

    /* renamed from: b */
    public final /* synthetic */ Object f30024b;

    public /* synthetic */ bj2(List list, Object obj) {
        this.f30023a = list;
        this.f30024b = obj;
    }

    public final Object call() {
        List<mb3> list = this.f30023a;
        Object obj = this.f30024b;
        for (mb3 mb3 : list) {
            yi2 yi2 = (yi2) mb3.get();
            if (yi2 != null) {
                yi2.zza(obj);
            }
        }
        return obj;
    }
}
