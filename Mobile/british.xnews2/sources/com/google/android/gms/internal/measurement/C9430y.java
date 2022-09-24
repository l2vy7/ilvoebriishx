package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9430y {

    /* renamed from: a */
    final Map f45526a = new HashMap();

    /* renamed from: b */
    final C9230l0 f45527b = new C9230l0();

    public C9430y() {
        mo38179b(new C9400w());
        mo38179b(new C9444z());
        mo38179b(new C9062a0());
        mo38179b(new C9124e0());
        mo38179b(new C9200j0());
        mo38179b(new C9215k0());
        mo38179b(new C9245m0());
    }

    /* renamed from: a */
    public final C9306q mo38178a(C9326r4 r4Var, C9306q qVar) {
        C9415x xVar;
        C9343s5.m43606c(r4Var);
        if (!(qVar instanceof C9321r)) {
            return qVar;
        }
        C9321r rVar = (C9321r) qVar;
        ArrayList c = rVar.mo37965c();
        String a = rVar.mo37964a();
        if (this.f45526a.containsKey(a)) {
            xVar = (C9415x) this.f45526a.get(a);
        } else {
            xVar = this.f45527b;
        }
        return xVar.mo37304a(a, r4Var, c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38179b(C9415x xVar) {
        for (C9261n0 d : xVar.f45508a) {
            this.f45526a.put(d.mo37742d().toString(), xVar);
        }
    }
}
