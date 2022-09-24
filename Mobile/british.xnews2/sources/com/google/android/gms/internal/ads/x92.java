package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.yb1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x92<AdT, AdapterT, ListenerT extends yb1> implements uu3<w92<AdT, AdapterT, ListenerT>> {

    /* renamed from: a */
    private final iv3<dw2> f41091a;

    /* renamed from: b */
    private final iv3<nb3> f41092b;

    /* renamed from: c */
    private final iv3<t42<AdapterT, ListenerT>> f41093c;

    /* renamed from: d */
    private final iv3<a52<AdT, AdapterT, ListenerT>> f41094d;

    public x92(iv3<dw2> iv3, iv3<nb3> iv32, iv3<t42<AdapterT, ListenerT>> iv33, iv3<a52<AdT, AdapterT, ListenerT>> iv34) {
        this.f41091a = iv3;
        this.f41092b = iv32;
        this.f41093c = iv33;
        this.f41094d = iv34;
    }

    /* renamed from: a */
    public final w92<AdT, AdapterT, ListenerT> zzb() {
        return new w92<>(this.f41091a.zzb(), this.f41092b.zzb(), this.f41093c.zzb(), this.f41094d.zzb());
    }
}
