package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9362t8 extends C9199j {

    /* renamed from: d */
    private final C9091c f45470d;

    public C9362t8(C9091c cVar) {
        super("internal.eventLogger");
        this.f45470d = cVar;
    }

    /* renamed from: d */
    public final C9306q mo37655d(C9326r4 r4Var, List list) {
        Map map;
        C9343s5.m43611h(this.f45093b, 3, list);
        String zzi = r4Var.mo37977b((C9306q) list.get(0)).zzi();
        long a = (long) C9343s5.m43604a(r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue());
        C9306q b = r4Var.mo37977b((C9306q) list.get(2));
        if (b instanceof C9260n) {
            map = C9343s5.m43610g((C9260n) b);
        } else {
            map = new HashMap();
        }
        this.f45470d.mo37435e(zzi, a, map);
        return C9306q.f45372d0;
    }
}
