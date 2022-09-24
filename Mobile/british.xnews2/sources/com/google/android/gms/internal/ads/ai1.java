package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ai1 extends cg1<C7763hn> implements C7763hn {
    @GuardedBy("this")

    /* renamed from: c */
    private final Map<View, C7801in> f29642c = new WeakHashMap(1);

    /* renamed from: d */
    private final Context f29643d;

    /* renamed from: e */
    private final ir2 f29644e;

    public ai1(Context context, Set<yh1<C7763hn>> set, ir2 ir2) {
        super(set);
        this.f29643d = context;
        this.f29644e = ir2;
    }

    /* renamed from: E0 */
    public final synchronized void mo30383E0(View view) {
        C7801in inVar = this.f29642c.get(view);
        if (inVar == null) {
            inVar = new C7801in(this.f29643d, view);
            inVar.mo32703c(this);
            this.f29642c.put(view, inVar);
        }
        if (this.f29644e.f33458U) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37032Z0)).booleanValue()) {
                inVar.mo32707g(((Long) C8311wv.m39277c().mo18570b(p00.f37024Y0)).longValue());
                return;
            }
        }
        inVar.mo32706f();
    }

    /* renamed from: G0 */
    public final synchronized void mo30384G0(View view) {
        if (this.f29642c.containsKey(view)) {
            this.f29642c.get(view).mo32705e(this);
            this.f29642c.remove(view);
        }
    }

    /* renamed from: n0 */
    public final synchronized void mo18767n0(C7689fn fnVar) {
        mo30919B0(new zh1(fnVar));
    }
}
