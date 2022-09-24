package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cb1 implements uu3<ab1> {

    /* renamed from: a */
    private final iv3<za1> f30312a;

    /* renamed from: b */
    private final iv3<Set<yh1<qa1>>> f30313b;

    /* renamed from: c */
    private final iv3<Executor> f30314c;

    /* renamed from: d */
    private final iv3<ScheduledExecutorService> f30315d;

    public cb1(iv3<za1> iv3, iv3<Set<yh1<qa1>>> iv32, iv3<Executor> iv33, iv3<ScheduledExecutorService> iv34) {
        this.f30312a = iv3;
        this.f30313b = iv32;
        this.f30314c = iv33;
        this.f30315d = iv34;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        za1 a = ((bb1) this.f30312a).zzb();
        Set b = ((gv3) this.f30313b).zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new ab1(a, b, nb3, this.f30315d.zzb());
    }
}
