package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tu1 implements uu3<Set<yh1<ew2>>> {

    /* renamed from: a */
    private final iv3<String> f39534a;

    /* renamed from: b */
    private final iv3<Context> f39535b;

    /* renamed from: c */
    private final iv3<Executor> f39536c;

    /* renamed from: d */
    private final iv3<Map<wv2, vu1>> f39537d;

    public tu1(iv3<String> iv3, iv3<Context> iv32, iv3<Executor> iv33, iv3<Map<wv2, vu1>> iv34) {
        this.f39534a = iv3;
        this.f39535b = iv32;
        this.f39536c = iv33;
        this.f39537d = iv34;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String a = ((el2) this.f39534a).mo31598a();
        Context a2 = ((zv0) this.f39535b).mo36135a();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        Map c = ((yu3) this.f39537d).zzb();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37229v3)).booleanValue()) {
            C7728gq gqVar = new C7728gq(new C7913lq(a2));
            gqVar.mo32216b(new uu1(a));
            set = Collections.singleton(new yh1(new wu1(gqVar, c), nb3));
        } else {
            set = Collections.emptySet();
        }
        cv3.m31156b(set);
        return set;
    }
}
