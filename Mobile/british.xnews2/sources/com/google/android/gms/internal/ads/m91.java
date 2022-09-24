package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m91 implements uu3<l91> {

    /* renamed from: a */
    private final iv3<fb1> f35452a;

    /* renamed from: b */
    private final iv3<ir2> f35453b;

    /* renamed from: c */
    private final iv3<ScheduledExecutorService> f35454c;

    /* renamed from: d */
    private final iv3<Executor> f35455d;

    public m91(iv3<fb1> iv3, iv3<ir2> iv32, iv3<ScheduledExecutorService> iv33, iv3<Executor> iv34) {
        this.f35452a = iv3;
        this.f35453b = iv32;
        this.f35454c = iv33;
        this.f35455d = iv34;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new l91(this.f35452a.zzb(), ((f71) this.f35453b).mo31778a(), this.f35454c.zzb(), nb3);
    }
}
