package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cv1 implements uu3<yh1<kd1>> {

    /* renamed from: a */
    private final iv3<av1> f30498a;

    /* renamed from: b */
    private final iv3<Executor> f30499b;

    /* renamed from: c */
    private final iv3<n22> f30500c;

    public cv1(iv3<av1> iv3, iv3<Executor> iv32, iv3<n22> iv33) {
        this.f30498a = iv3;
        this.f30499b = iv32;
        this.f30500c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        av1 zzb = this.f30498a.zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return ((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue() ? new yh1(this.f30500c.zzb(), nb3) : new yh1(zzb, nb3);
    }
}
