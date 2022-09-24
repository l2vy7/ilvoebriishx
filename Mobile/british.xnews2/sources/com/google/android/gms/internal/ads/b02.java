package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b02 implements uu3<a02> {

    /* renamed from: a */
    private final iv3<bs2> f29845a;

    /* renamed from: b */
    private final iv3<az1> f29846b;

    /* renamed from: c */
    private final iv3<nb3> f29847c;

    /* renamed from: d */
    private final iv3<ScheduledExecutorService> f29848d;

    /* renamed from: e */
    private final iv3<i32> f29849e;

    public b02(iv3<bs2> iv3, iv3<az1> iv32, iv3<nb3> iv33, iv3<ScheduledExecutorService> iv34, iv3<i32> iv35) {
        this.f29845a = iv3;
        this.f29846b = iv32;
        this.f29847c = iv33;
        this.f29848d = iv34;
        this.f29849e = iv35;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        bs2 a = ((da1) this.f29845a).mo31191a();
        az1 a2 = ((bz1) this.f29846b).zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new a02(a, a2, nb3, this.f29848d.zzb(), this.f29849e.zzb());
    }
}
