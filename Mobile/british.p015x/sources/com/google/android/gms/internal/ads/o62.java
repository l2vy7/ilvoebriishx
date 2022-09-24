package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o62 implements uu3<n62> {

    /* renamed from: a */
    private final iv3<k51> f36301a;

    /* renamed from: b */
    private final iv3<t52> f36302b;

    /* renamed from: c */
    private final iv3<oa1> f36303c;

    /* renamed from: d */
    private final iv3<ScheduledExecutorService> f36304d;

    /* renamed from: e */
    private final iv3<nb3> f36305e;

    public o62(iv3<k51> iv3, iv3<t52> iv32, iv3<oa1> iv33, iv3<ScheduledExecutorService> iv34, iv3<nb3> iv35) {
        this.f36301a = iv3;
        this.f36302b = iv32;
        this.f36303c = iv33;
        this.f36304d = iv34;
        this.f36305e = iv35;
    }

    /* renamed from: a */
    public final n62 zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new n62(this.f36301a.zzb(), ((u52) this.f36302b).zzb(), this.f36303c.zzb(), this.f36304d.zzb(), nb3);
    }
}
