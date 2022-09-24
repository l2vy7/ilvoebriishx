package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.Callable;
import p255u5.C11026a;
import p255u5.C11027b;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9919t8 implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzp f46769a;

    /* renamed from: b */
    final /* synthetic */ C9958x8 f46770b;

    C9919t8(C9958x8 x8Var, zzp zzp) {
        this.f46770b = x8Var;
        this.f46769a = zzp;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C11027b U = this.f46770b.mo39279U((String) C4604n.m20098k(this.f46769a.f46948b));
        C11026a aVar = C11026a.ANALYTICS_STORAGE;
        if (U.mo43338i(aVar) && C11027b.m49402b(this.f46769a.f46969w).mo43338i(aVar)) {
            return this.f46770b.mo39276R(this.f46769a).mo39140d0();
        }
        this.f46770b.mo19276j().mo19286v().mo38856a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
