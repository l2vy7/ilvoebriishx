package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x81 implements uu3<yh1<mf1>> {

    /* renamed from: a */
    private final iv3<yu1> f41072a;

    /* renamed from: b */
    private final iv3<Executor> f41073b;

    /* renamed from: c */
    private final iv3<l22> f41074c;

    public x81(iv3<yu1> iv3, iv3<Executor> iv32, iv3<l22> iv33) {
        this.f41072a = iv3;
        this.f41073b = iv32;
        this.f41074c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        yu1 zzb = this.f41072a.zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return ((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue() ? new yh1(this.f41074c.zzb(), nb3) : new yh1(zzb, nb3);
    }
}
