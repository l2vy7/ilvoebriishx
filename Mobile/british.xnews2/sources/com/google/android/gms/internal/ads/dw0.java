package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dw0 implements uu3<Set<yh1<mh1>>> {

    /* renamed from: a */
    private final iv3<p22> f31017a;

    /* renamed from: b */
    private final iv3<Executor> f31018b;

    public dw0(iv3<p22> iv3, iv3<Executor> iv32) {
        this.f31017a = iv3;
        this.f31018b = iv32;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        p22 zzb = this.f31017a.zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37243x1)).booleanValue()) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue()) {
                set = Collections.singleton(new yh1(zzb, nb3));
                cv3.m31156b(set);
                return set;
            }
        }
        set = Collections.emptySet();
        cv3.m31156b(set);
        return set;
    }
}
