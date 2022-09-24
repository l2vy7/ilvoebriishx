package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9215k0 extends C9415x {
    protected C9215k0() {
        this.f45508a.add(C9261n0.ADD);
        this.f45508a.add(C9261n0.DIVIDE);
        this.f45508a.add(C9261n0.MODULUS);
        this.f45508a.add(C9261n0.MULTIPLY);
        this.f45508a.add(C9261n0.NEGATE);
        this.f45508a.add(C9261n0.POST_DECREMENT);
        this.f45508a.add(C9261n0.POST_INCREMENT);
        this.f45508a.add(C9261n0.PRE_DECREMENT);
        this.f45508a.add(C9261n0.PRE_INCREMENT);
        this.f45508a.add(C9261n0.SUBTRACT);
    }

    /* renamed from: a */
    public final C9306q mo37304a(String str, C9326r4 r4Var, List list) {
        C9261n0 n0Var = C9261n0.ADD;
        int ordinal = C9343s5.m43608e(str).ordinal();
        if (ordinal == 0) {
            C9343s5.m43611h(n0Var.name(), 2, list);
            C9306q b = r4Var.mo37977b((C9306q) list.get(0));
            C9306q b2 = r4Var.mo37977b((C9306q) list.get(1));
            if (!(b instanceof C9244m) && !(b instanceof C9369u) && !(b2 instanceof C9244m) && !(b2 instanceof C9369u)) {
                return new C9184i(Double.valueOf(b.zzh().doubleValue() + b2.zzh().doubleValue()));
            }
            String valueOf = String.valueOf(b.zzi());
            String valueOf2 = String.valueOf(b2.zzi());
            return new C9369u(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else if (ordinal == 21) {
            C9343s5.m43611h(C9261n0.DIVIDE.name(), 2, list);
            return new C9184i(Double.valueOf(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue() / r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()));
        } else if (ordinal == 59) {
            C9343s5.m43611h(C9261n0.SUBTRACT.name(), 2, list);
            return new C9184i(Double.valueOf(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue() + new C9184i(Double.valueOf(-r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C9343s5.m43611h(str, 2, list);
            C9306q b3 = r4Var.mo37977b((C9306q) list.get(0));
            r4Var.mo37977b((C9306q) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            C9343s5.m43611h(str, 1, list);
            return r4Var.mo37977b((C9306q) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    C9343s5.m43611h(C9261n0.MODULUS.name(), 2, list);
                    return new C9184i(Double.valueOf(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue() % r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()));
                case 45:
                    C9343s5.m43611h(C9261n0.MULTIPLY.name(), 2, list);
                    return new C9184i(Double.valueOf(r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue() * r4Var.mo37977b((C9306q) list.get(1)).zzh().doubleValue()));
                case 46:
                    C9343s5.m43611h(C9261n0.NEGATE.name(), 1, list);
                    return new C9184i(Double.valueOf(-r4Var.mo37977b((C9306q) list.get(0)).zzh().doubleValue()));
                default:
                    return super.mo38134b(str);
            }
        }
    }
}
