package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final /* synthetic */ class C9214k {
    /* renamed from: a */
    public static C9306q m43143a(C9244m mVar, C9306q qVar, C9326r4 r4Var, List list) {
        if (mVar.mo19176a(qVar.zzi())) {
            C9306q c = mVar.mo19178c(qVar.zzi());
            if (c instanceof C9199j) {
                return ((C9199j) c).mo37655d(r4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qVar.zzi()}));
        } else if ("hasOwnProperty".equals(qVar.zzi())) {
            C9343s5.m43611h("hasOwnProperty", 1, list);
            if (mVar.mo19176a(r4Var.mo37977b((C9306q) list.get(0)).zzi())) {
                return C9306q.f45377i0;
            }
            return C9306q.f45378j0;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qVar.zzi()}));
        }
    }

    /* renamed from: b */
    public static Iterator m43144b(Map map) {
        return new C9229l(map.keySet().iterator());
    }
}
