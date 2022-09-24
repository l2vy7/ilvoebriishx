package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9124e0 extends C9415x {
    protected C9124e0() {
        this.f45508a.add(C9261n0.AND);
        this.f45508a.add(C9261n0.NOT);
        this.f45508a.add(C9261n0.OR);
    }

    /* renamed from: a */
    public final C9306q mo37304a(String str, C9326r4 r4Var, List list) {
        C9261n0 n0Var = C9261n0.ADD;
        int ordinal = C9343s5.m43608e(str).ordinal();
        if (ordinal == 1) {
            C9343s5.m43611h(C9261n0.AND.name(), 2, list);
            C9306q b = r4Var.mo37977b((C9306q) list.get(0));
            if (!b.zzg().booleanValue()) {
                return b;
            }
            return r4Var.mo37977b((C9306q) list.get(1));
        } else if (ordinal == 47) {
            C9343s5.m43611h(C9261n0.NOT.name(), 1, list);
            return new C9154g(Boolean.valueOf(!r4Var.mo37977b((C9306q) list.get(0)).zzg().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo38134b(str);
        } else {
            C9343s5.m43611h(C9261n0.OR.name(), 2, list);
            C9306q b2 = r4Var.mo37977b((C9306q) list.get(0));
            if (b2.zzg().booleanValue()) {
                return b2;
            }
            return r4Var.mo37977b((C9306q) list.get(1));
        }
    }
}
