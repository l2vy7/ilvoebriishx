package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gk2 implements uu3<ek2> {

    /* renamed from: a */
    private final iv3<fn0> f32349a;

    /* renamed from: b */
    private final iv3<Integer> f32350b;

    /* renamed from: c */
    private final iv3<Context> f32351c;

    /* renamed from: d */
    private final iv3<nn0> f32352d;

    /* renamed from: e */
    private final iv3<ScheduledExecutorService> f32353e;

    /* renamed from: f */
    private final iv3<Executor> f32354f;

    /* renamed from: g */
    private final iv3<String> f32355g;

    public gk2(iv3<fn0> iv3, iv3<Integer> iv32, iv3<Context> iv33, iv3<nn0> iv34, iv3<ScheduledExecutorService> iv35, iv3<Executor> iv36, iv3<String> iv37) {
        this.f32349a = iv3;
        this.f32350b = iv32;
        this.f32351c = iv33;
        this.f32352d = iv34;
        this.f32353e = iv35;
        this.f32354f = iv36;
        this.f32355g = iv37;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new ek2(new fn0(), ((cl2) this.f32350b).zzb().intValue(), ((zv0) this.f32351c).mo36135a(), this.f32352d.zzb(), this.f32353e.zzb(), nb3, ((bl2) this.f32355g).mo30703a(), (byte[]) null);
    }
}
