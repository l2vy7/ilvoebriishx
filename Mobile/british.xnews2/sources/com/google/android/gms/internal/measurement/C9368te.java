package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.te */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9368te extends C9199j {

    /* renamed from: d */
    private final C9429xe f45476d;

    public C9368te(C9429xe xeVar) {
        super("internal.registerCallback");
        this.f45476d = xeVar;
    }

    /* renamed from: d */
    public final C9306q mo37655d(C9326r4 r4Var, List list) {
        C9343s5.m43611h(this.f45093b, 3, list);
        String zzi = r4Var.mo37977b((C9306q) list.get(0)).zzi();
        C9306q b = r4Var.mo37977b((C9306q) list.get(1));
        if (b instanceof C9291p) {
            C9306q b2 = r4Var.mo37977b((C9306q) list.get(2));
            if (b2 instanceof C9260n) {
                C9260n nVar = (C9260n) b2;
                if (nVar.mo19176a(SessionDescription.ATTR_TYPE)) {
                    this.f45476d.mo38176a(zzi, nVar.mo19176a("priority") ? C9343s5.m43605b(nVar.mo19178c("priority").zzh().doubleValue()) : 1000, (C9291p) b, nVar.mo19178c(SessionDescription.ATTR_TYPE).zzi());
                    return C9306q.f45372d0;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
