package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class du1 implements uu3<Set<yh1<ew2>>> {

    /* renamed from: a */
    private final iv3<Executor> f31003a;

    /* renamed from: b */
    private final iv3<wu1> f31004b;

    public du1(iv3<Executor> iv3, iv3<wu1> iv32) {
        this.f31003a = iv3;
        this.f31004b = iv32;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        wu1 a = ((xu1) this.f31004b).zzb();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37229v3)).booleanValue()) {
            set = Collections.singleton(new yh1(a, nb3));
        } else {
            set = Collections.emptySet();
        }
        cv3.m31156b(set);
        return set;
    }
}
