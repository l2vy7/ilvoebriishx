package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.ue */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9383ue extends C9199j {

    /* renamed from: d */
    private final C9376u7 f45496d;

    /* renamed from: e */
    final Map f45497e = new HashMap();

    public C9383ue(C9376u7 u7Var) {
        super("require");
        this.f45496d = u7Var;
    }

    /* renamed from: d */
    public final C9306q mo37655d(C9326r4 r4Var, List list) {
        C9306q qVar;
        C9343s5.m43611h("require", 1, list);
        String zzi = r4Var.mo37977b((C9306q) list.get(0)).zzi();
        if (this.f45497e.containsKey(zzi)) {
            return (C9306q) this.f45497e.get(zzi);
        }
        C9376u7 u7Var = this.f45496d;
        if (u7Var.f45491a.containsKey(zzi)) {
            try {
                qVar = (C9306q) ((Callable) u7Var.f45491a.get(zzi)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(zzi);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            qVar = C9306q.f45372d0;
        }
        if (qVar instanceof C9199j) {
            this.f45497e.put(zzi, (C9199j) qVar);
        }
        return qVar;
    }
}
