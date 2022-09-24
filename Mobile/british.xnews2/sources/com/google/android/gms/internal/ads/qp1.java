package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qp1 implements uu3<pp1> {

    /* renamed from: a */
    private final iv3<Executor> f38240a;

    /* renamed from: b */
    private final iv3<kp1> f38241b;

    public qp1(iv3<Executor> iv3, iv3<kp1> iv32) {
        this.f38240a = iv3;
        this.f38241b = iv32;
    }

    /* renamed from: a */
    public final pp1 zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new pp1(nb3, ((lp1) this.f38241b).zzb());
    }
}
