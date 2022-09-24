package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c61 implements uu3<x51> {

    /* renamed from: a */
    private final iv3<n61> f30253a;

    /* renamed from: b */
    private final iv3<i50> f30254b;

    /* renamed from: c */
    private final iv3<Runnable> f30255c;

    /* renamed from: d */
    private final iv3<Executor> f30256d;

    public c61(iv3<n61> iv3, iv3<i50> iv32, iv3<Runnable> iv33, iv3<Executor> iv34) {
        this.f30253a = iv3;
        this.f30254b = iv32;
        this.f30255c = iv33;
        this.f30256d = iv34;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new x51(((k81) this.f30253a).zzb(), ((b61) this.f30254b).mo30623a(), ((a61) this.f30255c).mo30312a(), this.f30256d.zzb());
    }
}
