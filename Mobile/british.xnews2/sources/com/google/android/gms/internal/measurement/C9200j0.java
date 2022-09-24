package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9200j0 extends C9415x {
    protected C9200j0() {
        this.f45508a.add(C9261n0.FOR_IN);
        this.f45508a.add(C9261n0.FOR_IN_CONST);
        this.f45508a.add(C9261n0.FOR_IN_LET);
        this.f45508a.add(C9261n0.FOR_LET);
        this.f45508a.add(C9261n0.FOR_OF);
        this.f45508a.add(C9261n0.FOR_OF_CONST);
        this.f45508a.add(C9261n0.FOR_OF_LET);
        this.f45508a.add(C9261n0.WHILE);
    }

    /* renamed from: c */
    private static C9306q m43044c(C9170h0 h0Var, Iterator it, C9306q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                C9306q c = h0Var.mo37549a((C9306q) it.next()).mo37978c((C4652f) qVar);
                if (c instanceof C9169h) {
                    C9169h hVar = (C9169h) c;
                    if ("break".equals(hVar.mo37613c())) {
                        return C9306q.f45372d0;
                    }
                    if ("return".equals(hVar.mo37613c())) {
                        return hVar;
                    }
                }
            }
        }
        return C9306q.f45372d0;
    }

    /* renamed from: d */
    private static C9306q m43045d(C9170h0 h0Var, C9306q qVar, C9306q qVar2) {
        return m43044c(h0Var, qVar.zzl(), qVar2);
    }

    /* renamed from: e */
    private static C9306q m43046e(C9170h0 h0Var, C9306q qVar, C9306q qVar2) {
        if (qVar instanceof Iterable) {
            return m43044c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C9306q mo37304a(String str, C9326r4 r4Var, List list) {
        C9261n0 n0Var = C9261n0.ADD;
        int ordinal = C9343s5.m43608e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C9343s5.m43611h(C9261n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C9369u) {
                        String zzi = ((C9306q) list.get(0)).zzi();
                        return m43045d(new C9185i0(r4Var, zzi), r4Var.mo37977b((C9306q) list.get(1)), r4Var.mo37977b((C9306q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C9343s5.m43611h(C9261n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C9369u) {
                        String zzi2 = ((C9306q) list.get(0)).zzi();
                        return m43045d(new C9139f0(r4Var, zzi2), r4Var.mo37977b((C9306q) list.get(1)), r4Var.mo37977b((C9306q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C9343s5.m43611h(C9261n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C9369u) {
                        String zzi3 = ((C9306q) list.get(0)).zzi();
                        return m43045d(new C9155g0(r4Var, zzi3), r4Var.mo37977b((C9306q) list.get(1)), r4Var.mo37977b((C9306q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C9343s5.m43611h(C9261n0.FOR_LET.name(), 4, list);
                    C9306q b = r4Var.mo37977b((C9306q) list.get(0));
                    if (b instanceof C4652f) {
                        C4652f fVar = (C4652f) b;
                        C9306q qVar = (C9306q) list.get(1);
                        C9306q qVar2 = (C9306q) list.get(2);
                        C9306q b2 = r4Var.mo37977b((C9306q) list.get(3));
                        C9326r4 a = r4Var.mo37976a();
                        for (int i = 0; i < fVar.mo19182g(); i++) {
                            String zzi4 = fVar.mo19183h(i).zzi();
                            a.mo37982g(zzi4, r4Var.mo37979d(zzi4));
                        }
                        while (r4Var.mo37977b(qVar).zzg().booleanValue()) {
                            C9306q c = r4Var.mo37978c((C4652f) b2);
                            if (c instanceof C9169h) {
                                C9169h hVar = (C9169h) c;
                                if ("break".equals(hVar.mo37613c())) {
                                    return C9306q.f45372d0;
                                }
                                if ("return".equals(hVar.mo37613c())) {
                                    return hVar;
                                }
                            }
                            C9326r4 a2 = r4Var.mo37976a();
                            for (int i2 = 0; i2 < fVar.mo19182g(); i2++) {
                                String zzi5 = fVar.mo19183h(i2).zzi();
                                a2.mo37982g(zzi5, a.mo37979d(zzi5));
                            }
                            a2.mo37977b(qVar2);
                            a = a2;
                        }
                        return C9306q.f45372d0;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C9343s5.m43611h(C9261n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C9369u) {
                        String zzi6 = ((C9306q) list.get(0)).zzi();
                        return m43046e(new C9185i0(r4Var, zzi6), r4Var.mo37977b((C9306q) list.get(1)), r4Var.mo37977b((C9306q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C9343s5.m43611h(C9261n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C9369u) {
                        String zzi7 = ((C9306q) list.get(0)).zzi();
                        return m43046e(new C9139f0(r4Var, zzi7), r4Var.mo37977b((C9306q) list.get(1)), r4Var.mo37977b((C9306q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C9343s5.m43611h(C9261n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C9369u) {
                        String zzi8 = ((C9306q) list.get(0)).zzi();
                        return m43046e(new C9155g0(r4Var, zzi8), r4Var.mo37977b((C9306q) list.get(1)), r4Var.mo37977b((C9306q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo38134b(str);
            }
        } else {
            C9343s5.m43611h(C9261n0.WHILE.name(), 4, list);
            C9306q qVar3 = (C9306q) list.get(0);
            C9306q qVar4 = (C9306q) list.get(1);
            C9306q b3 = r4Var.mo37977b((C9306q) list.get(3));
            if (r4Var.mo37977b((C9306q) list.get(2)).zzg().booleanValue()) {
                C9306q c2 = r4Var.mo37978c((C4652f) b3);
                if (c2 instanceof C9169h) {
                    C9169h hVar2 = (C9169h) c2;
                    if ("break".equals(hVar2.mo37613c())) {
                        return C9306q.f45372d0;
                    }
                    if ("return".equals(hVar2.mo37613c())) {
                        return hVar2;
                    }
                }
            }
            while (r4Var.mo37977b(qVar3).zzg().booleanValue()) {
                C9306q c3 = r4Var.mo37978c((C4652f) b3);
                if (c3 instanceof C9169h) {
                    C9169h hVar3 = (C9169h) c3;
                    if ("break".equals(hVar3.mo37613c())) {
                        return C9306q.f45372d0;
                    }
                    if ("return".equals(hVar3.mo37613c())) {
                        return hVar3;
                    }
                }
                r4Var.mo37977b(qVar4);
            }
            return C9306q.f45372d0;
        }
    }
}
