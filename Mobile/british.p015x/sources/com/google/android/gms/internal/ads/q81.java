package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q81 implements uu3<yh1<qa1>> {

    /* renamed from: a */
    private final iv3<yu1> f37933a;

    /* renamed from: b */
    private final iv3<Executor> f37934b;

    /* renamed from: c */
    private final iv3<l22> f37935c;

    public q81(iv3<yu1> iv3, iv3<Executor> iv32, iv3<l22> iv33) {
        this.f37933a = iv3;
        this.f37934b = iv32;
        this.f37935c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        yu1 zzb = this.f37933a.zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return ((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue() ? new yh1(this.f37935c.zzb(), nb3) : new yh1(zzb, nb3);
    }
}
