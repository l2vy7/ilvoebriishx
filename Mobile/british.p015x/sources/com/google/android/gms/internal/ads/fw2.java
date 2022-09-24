package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fw2 implements uu3<dw2> {

    /* renamed from: a */
    private final iv3<nb3> f31901a;

    /* renamed from: b */
    private final iv3<ScheduledExecutorService> f31902b;

    /* renamed from: c */
    private final iv3<cw2> f31903c;

    public fw2(iv3<nb3> iv3, iv3<ScheduledExecutorService> iv32, iv3<cw2> iv33) {
        this.f31901a = iv3;
        this.f31902b = iv32;
        this.f31903c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new dw2(nb3, this.f31902b.zzb(), ((gw2) this.f31903c).zzb());
    }
}
