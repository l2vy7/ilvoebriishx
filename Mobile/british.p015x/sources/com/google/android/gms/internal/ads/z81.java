package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z81 implements uu3<yh1<hb1>> {

    /* renamed from: a */
    private final iv3<yu1> f42343a;

    /* renamed from: b */
    private final iv3<Executor> f42344b;

    /* renamed from: c */
    private final iv3<l22> f42345c;

    public z81(iv3<yu1> iv3, iv3<Executor> iv32, iv3<l22> iv33) {
        this.f42343a = iv3;
        this.f42344b = iv32;
        this.f42345c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        yu1 zzb = this.f42343a.zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return ((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue() ? new yh1(this.f42345c.zzb(), nb3) : new yh1(zzb, nb3);
    }
}
