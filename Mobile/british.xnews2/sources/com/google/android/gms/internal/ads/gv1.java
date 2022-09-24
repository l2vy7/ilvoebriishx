package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gv1 implements uu3<yh1<ew2>> {

    /* renamed from: a */
    private final iv3<rv1> f32476a;

    /* renamed from: b */
    private final iv3<Executor> f32477b;

    /* renamed from: c */
    private final iv3<u22> f32478c;

    public gv1(iv3<rv1> iv3, iv3<Executor> iv32, iv3<u22> iv33) {
        this.f32476a = iv3;
        this.f32477b = iv32;
        this.f32478c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        rv1 zzb = this.f32476a.zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return ((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue() ? new yh1(this.f32478c.zzb(), nb3) : new yh1(zzb, nb3);
    }
}
