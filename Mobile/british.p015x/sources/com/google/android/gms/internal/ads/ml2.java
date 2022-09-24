package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ml2 implements uu3<kl2> {

    /* renamed from: a */
    private final iv3<nn0> f35544a;

    /* renamed from: b */
    private final iv3<Boolean> f35545b;

    /* renamed from: c */
    private final iv3<dn0> f35546c;

    /* renamed from: d */
    private final iv3<nb3> f35547d;

    /* renamed from: e */
    private final iv3<String> f35548e;

    /* renamed from: f */
    private final iv3<ScheduledExecutorService> f35549f;

    public ml2(iv3<nn0> iv3, iv3<Boolean> iv32, iv3<dn0> iv33, iv3<nb3> iv34, iv3<String> iv35, iv3<ScheduledExecutorService> iv36) {
        this.f35544a = iv3;
        this.f35545b = iv32;
        this.f35546c = iv33;
        this.f35547d = iv34;
        this.f35548e = iv35;
        this.f35549f = iv36;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        boolean booleanValue = ((dl2) this.f35545b).zzb().booleanValue();
        dn0 dn0 = new dn0();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new kl2(this.f35544a.zzb(), booleanValue, dn0, nb3, ((bl2) this.f35548e).mo30703a(), this.f35549f.zzb(), (byte[]) null);
    }
}
