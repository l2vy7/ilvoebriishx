package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9400w extends C9415x {
    public C9400w() {
        this.f45508a.add(C9261n0.BITWISE_AND);
        this.f45508a.add(C9261n0.BITWISE_LEFT_SHIFT);
        this.f45508a.add(C9261n0.BITWISE_NOT);
        this.f45508a.add(C9261n0.BITWISE_OR);
        this.f45508a.add(C9261n0.BITWISE_RIGHT_SHIFT);
        this.f45508a.add(C9261n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f45508a.add(C9261n0.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C9306q mo37304a(String str, C9326r4 r4Var, List list) {
        C9261n0 n0Var = C9261n0.ADD;
        switch (C9343s5.m43608e(str).ordinal()) {
            case 4:
                C9343s5.m43611h(C9261n0.BITWISE_AND.name(), 2, list);
                return new C9184i(Double.valueOf((double) (C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue()) & C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()))));
            case 5:
                C9343s5.m43611h(C9261n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C9184i(Double.valueOf((double) (C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue()) << ((int) (C9343s5.m43607d(r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()) & 31)))));
            case 6:
                C9343s5.m43611h(C9261n0.BITWISE_NOT.name(), 1, list);
                return new C9184i(Double.valueOf((double) (C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue()) ^ -1)));
            case 7:
                C9343s5.m43611h(C9261n0.BITWISE_OR.name(), 2, list);
                return new C9184i(Double.valueOf((double) (C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue()) | C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()))));
            case 8:
                C9343s5.m43611h(C9261n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C9184i(Double.valueOf((double) (C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue()) >> ((int) (C9343s5.m43607d(r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()) & 31)))));
            case 9:
                C9343s5.m43611h(C9261n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C9184i(Double.valueOf((double) (C9343s5.m43607d(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue()) >>> ((int) (C9343s5.m43607d(r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()) & 31)))));
            case 10:
                C9343s5.m43611h(C9261n0.BITWISE_XOR.name(), 2, list);
                return new C9184i(Double.valueOf((double) (C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue()) ^ C9343s5.m43605b(r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()))));
            default:
                return super.mo38134b(str);
        }
    }
}
