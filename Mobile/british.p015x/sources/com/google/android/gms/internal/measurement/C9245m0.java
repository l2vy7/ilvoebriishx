package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9245m0 extends C9415x {
    protected C9245m0() {
        this.f45508a.add(C9261n0.ASSIGN);
        this.f45508a.add(C9261n0.CONST);
        this.f45508a.add(C9261n0.CREATE_ARRAY);
        this.f45508a.add(C9261n0.CREATE_OBJECT);
        this.f45508a.add(C9261n0.EXPRESSION_LIST);
        this.f45508a.add(C9261n0.GET);
        this.f45508a.add(C9261n0.GET_INDEX);
        this.f45508a.add(C9261n0.GET_PROPERTY);
        this.f45508a.add(C9261n0.NULL);
        this.f45508a.add(C9261n0.SET_PROPERTY);
        this.f45508a.add(C9261n0.TYPEOF);
        this.f45508a.add(C9261n0.UNDEFINED);
        this.f45508a.add(C9261n0.VAR);
    }

    /* renamed from: a */
    public final C9306q mo37304a(String str, C9326r4 r4Var, List list) {
        String str2;
        C9261n0 n0Var = C9261n0.ADD;
        int ordinal = C9343s5.m43608e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C9343s5.m43611h(C9261n0.ASSIGN.name(), 2, list);
            C9306q b = r4Var.mo37977b((C9306q) list.get(0));
            if (!(b instanceof C9369u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (r4Var.mo37983h(b.zzi())) {
                C9306q b2 = r4Var.mo37977b((C9306q) list.get(1));
                r4Var.mo37982g(b.zzi(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.zzi()}));
            }
        } else if (ordinal == 14) {
            C9343s5.m43612i(C9261n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C9306q b3 = r4Var.mo37977b((C9306q) list.get(i2));
                    if (b3 instanceof C9369u) {
                        r4Var.mo37981f(b3.zzi(), r4Var.mo37977b((C9306q) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return C9306q.f45372d0;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C9343s5.m43612i(C9261n0.EXPRESSION_LIST.name(), 1, list);
            C9306q qVar = C9306q.f45372d0;
            while (i < list.size()) {
                qVar = r4Var.mo37977b((C9306q) list.get(i));
                if (!(qVar instanceof C9169h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qVar;
        } else if (ordinal == 33) {
            C9343s5.m43611h(C9261n0.GET.name(), 1, list);
            C9306q b4 = r4Var.mo37977b((C9306q) list.get(0));
            if (b4 instanceof C9369u) {
                return r4Var.mo37979d(b4.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C9343s5.m43611h(C9261n0.NULL.name(), 0, list);
            return C9306q.f45373e0;
        } else if (ordinal == 58) {
            C9343s5.m43611h(C9261n0.SET_PROPERTY.name(), 3, list);
            C9306q b5 = r4Var.mo37977b((C9306q) list.get(0));
            C9306q b6 = r4Var.mo37977b((C9306q) list.get(1));
            C9306q b7 = r4Var.mo37977b((C9306q) list.get(2));
            if (b5 == C9306q.f45372d0 || b5 == C9306q.f45373e0) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.zzi(), b5.zzi()}));
            }
            if ((b5 instanceof C4652f) && (b6 instanceof C9184i)) {
                ((C4652f) b5).mo19193v(b6.zzh().intValue(), b7);
            } else if (b5 instanceof C9244m) {
                ((C9244m) b5).mo19179e(b6.zzi(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C9343s5.m43611h(C9261n0.GET_PROPERTY.name(), 2, list);
                    C9306q b8 = r4Var.mo37977b((C9306q) list.get(0));
                    C9306q b9 = r4Var.mo37977b((C9306q) list.get(1));
                    if ((b8 instanceof C4652f) && C9343s5.m43614k(b9)) {
                        return ((C4652f) b8).mo19183h(b9.zzh().intValue());
                    }
                    if (b8 instanceof C9244m) {
                        return ((C9244m) b8).mo19178c(b9.zzi());
                    }
                    if (b8 instanceof C9369u) {
                        if (SessionDescription.ATTR_LENGTH.equals(b9.zzi())) {
                            return new C9184i(Double.valueOf((double) b8.zzi().length()));
                        }
                        if (C9343s5.m43614k(b9) && b9.zzh().doubleValue() < ((double) b8.zzi().length())) {
                            return new C9369u(String.valueOf(b8.zzi().charAt(b9.zzh().intValue())));
                        }
                    }
                    return C9306q.f45372d0;
                }
                switch (ordinal) {
                    case 62:
                        C9343s5.m43611h(C9261n0.TYPEOF.name(), 1, list);
                        C9306q b10 = r4Var.mo37977b((C9306q) list.get(0));
                        if (b10 instanceof C9384v) {
                            str2 = AdError.UNDEFINED_DOMAIN;
                        } else if (b10 instanceof C9154g) {
                            str2 = "boolean";
                        } else if (b10 instanceof C9184i) {
                            str2 = "number";
                        } else if (b10 instanceof C9369u) {
                            str2 = "string";
                        } else if (b10 instanceof C9291p) {
                            str2 = "function";
                        } else if ((b10 instanceof C9321r) || (b10 instanceof C9169h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new C9369u(str2);
                    case 63:
                        C9343s5.m43611h(C9261n0.UNDEFINED.name(), 0, list);
                        return C9306q.f45372d0;
                    case 64:
                        C9343s5.m43612i(C9261n0.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C9306q b11 = r4Var.mo37977b((C9306q) it.next());
                            if (b11 instanceof C9369u) {
                                r4Var.mo37980e(b11.zzi(), C9306q.f45372d0);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return C9306q.f45372d0;
                    default:
                        return super.mo38134b(str);
                }
            } else if (list.isEmpty()) {
                return new C9260n();
            } else {
                if (list.size() % 2 == 0) {
                    C9260n nVar = new C9260n();
                    while (i < list.size() - 1) {
                        C9306q b12 = r4Var.mo37977b((C9306q) list.get(i));
                        C9306q b13 = r4Var.mo37977b((C9306q) list.get(i + 1));
                        if ((b12 instanceof C9169h) || (b13 instanceof C9169h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        nVar.mo19179e(b12.zzi(), b13);
                        i += 2;
                    }
                    return nVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C4652f();
        } else {
            C4652f fVar = new C4652f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C9306q b14 = r4Var.mo37977b((C9306q) it2.next());
                if (!(b14 instanceof C9169h)) {
                    fVar.mo19193v(i, b14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
