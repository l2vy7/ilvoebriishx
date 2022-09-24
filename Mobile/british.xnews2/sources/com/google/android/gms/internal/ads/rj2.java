package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rj2 implements uu3<pj2> {

    /* renamed from: a */
    private final iv3<fn0> f38692a;

    /* renamed from: b */
    private final iv3<Context> f38693b;

    /* renamed from: c */
    private final iv3<ScheduledExecutorService> f38694c;

    /* renamed from: d */
    private final iv3<Executor> f38695d;

    /* renamed from: e */
    private final iv3<Integer> f38696e;

    public rj2(iv3<fn0> iv3, iv3<Context> iv32, iv3<ScheduledExecutorService> iv33, iv3<Executor> iv34, iv3<Integer> iv35) {
        this.f38692a = iv3;
        this.f38693b = iv32;
        this.f38694c = iv33;
        this.f38695d = iv34;
        this.f38696e = iv35;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new pj2(new fn0(), ((zv0) this.f38693b).mo36135a(), this.f38694c.zzb(), nb3, ((cl2) this.f38696e).zzb().intValue(), (byte[]) null);
    }
}
