package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9444z extends C9415x {
    public C9444z() {
        this.f45508a.add(C9261n0.EQUALS);
        this.f45508a.add(C9261n0.GREATER_THAN);
        this.f45508a.add(C9261n0.GREATER_THAN_EQUALS);
        this.f45508a.add(C9261n0.IDENTITY_EQUALS);
        this.f45508a.add(C9261n0.IDENTITY_NOT_EQUALS);
        this.f45508a.add(C9261n0.LESS_THAN);
        this.f45508a.add(C9261n0.LESS_THAN_EQUALS);
        this.f45508a.add(C9261n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m43892c(C9306q qVar, C9306q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C9384v) || (qVar instanceof C9275o)) {
                return true;
            }
            if (qVar instanceof C9184i) {
                return !Double.isNaN(qVar.zzh().doubleValue()) && !Double.isNaN(qVar2.zzh().doubleValue()) && qVar.zzh().doubleValue() == qVar2.zzh().doubleValue();
            }
            if (qVar instanceof C9369u) {
                return qVar.zzi().equals(qVar2.zzi());
            }
            if (qVar instanceof C9154g) {
                return qVar.zzg().equals(qVar2.zzg());
            }
            return qVar == qVar2;
        } else if (((qVar instanceof C9384v) || (qVar instanceof C9275o)) && ((qVar2 instanceof C9384v) || (qVar2 instanceof C9275o))) {
            return true;
        } else {
            boolean z = qVar instanceof C9184i;
            if (z && (qVar2 instanceof C9369u)) {
                return m43892c(qVar, new C9184i(qVar2.zzh()));
            }
            boolean z2 = qVar instanceof C9369u;
            if (z2 && (qVar2 instanceof C9184i)) {
                return m43892c(new C9184i(qVar.zzh()), qVar2);
            }
            if (qVar instanceof C9154g) {
                return m43892c(new C9184i(qVar.zzh()), qVar2);
            }
            if (qVar2 instanceof C9154g) {
                return m43892c(qVar, new C9184i(qVar2.zzh()));
            }
            if ((z2 || z) && (qVar2 instanceof C9244m)) {
                return m43892c(qVar, new C9369u(qVar2.zzi()));
            }
            if (!(qVar instanceof C9244m) || (!(qVar2 instanceof C9369u) && !(qVar2 instanceof C9184i))) {
                return false;
            }
            return m43892c(new C9369u(qVar.zzi()), qVar2);
        }
    }

    /* renamed from: d */
    private static boolean m43893d(C9306q qVar, C9306q qVar2) {
        if (qVar instanceof C9244m) {
            qVar = new C9369u(qVar.zzi());
        }
        if (qVar2 instanceof C9244m) {
            qVar2 = new C9369u(qVar2.zzi());
        }
        if ((qVar instanceof C9369u) && (qVar2 instanceof C9369u)) {
            return qVar.zzi().compareTo(qVar2.zzi()) < 0;
        }
        double doubleValue = qVar.zzh().doubleValue();
        double doubleValue2 = qVar2.zzh().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && !(doubleValue == 0.0d && doubleValue2 == 0.0d) && (!(doubleValue == 0.0d && doubleValue2 == 0.0d) && Double.compare(doubleValue, doubleValue2) < 0);
    }

    /* renamed from: e */
    private static boolean m43894e(C9306q qVar, C9306q qVar2) {
        if (qVar instanceof C9244m) {
            qVar = new C9369u(qVar.zzi());
        }
        if (qVar2 instanceof C9244m) {
            qVar2 = new C9369u(qVar2.zzi());
        }
        if (((!(qVar instanceof C9369u) || !(qVar2 instanceof C9369u)) && (Double.isNaN(qVar.zzh().doubleValue()) || Double.isNaN(qVar2.zzh().doubleValue()))) || m43893d(qVar2, qVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C9306q mo37304a(String str, C9326r4 r4Var, List list) {
        boolean z;
        boolean c;
        C9343s5.m43611h(C9343s5.m43608e(str).name(), 2, list);
        C9306q b = r4Var.mo37977b((C9306q) list.get(0));
        C9306q b2 = r4Var.mo37977b((C9306q) list.get(1));
        int ordinal = C9343s5.m43608e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m43892c(b, b2);
            } else if (ordinal == 42) {
                z = m43893d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m43893d(b2, b);
                        break;
                    case 38:
                        z = m43894e(b2, b);
                        break;
                    case 39:
                        z = C9343s5.m43615l(b, b2);
                        break;
                    case 40:
                        c = C9343s5.m43615l(b, b2);
                        break;
                    default:
                        return super.mo38134b(str);
                }
            } else {
                z = m43894e(b, b2);
            }
            z = !c;
        } else {
            z = m43892c(b, b2);
        }
        return z ? C9306q.f45377i0 : C9306q.f45378j0;
    }
}
