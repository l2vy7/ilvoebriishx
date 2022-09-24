package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t6 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9360t6 {
    /* renamed from: a */
    public static C9306q m43659a(C9235l5 l5Var) {
        if (l5Var == null) {
            return C9306q.f45372d0;
        }
        int J = l5Var.mo37705J() - 1;
        if (J != 1) {
            if (J != 2) {
                if (J != 3) {
                    if (J == 4) {
                        List<C9235l5> D = l5Var.mo37700D();
                        ArrayList arrayList = new ArrayList();
                        for (C9235l5 a : D) {
                            arrayList.add(m43659a(a));
                        }
                        return new C9321r(l5Var.mo37698B(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (l5Var.mo37702G()) {
                    return new C9154g(Boolean.valueOf(l5Var.mo37701F()));
                } else {
                    return new C9154g((Boolean) null);
                }
            } else if (l5Var.mo37703H()) {
                return new C9184i(Double.valueOf(l5Var.mo37706z()));
            } else {
                return new C9184i((Double) null);
            }
        } else if (l5Var.mo37704I()) {
            return new C9369u(l5Var.mo37699C());
        } else {
            return C9306q.f45379k0;
        }
    }

    /* renamed from: b */
    public static C9306q m43660b(Object obj) {
        if (obj == null) {
            return C9306q.f45373e0;
        }
        if (obj instanceof String) {
            return new C9369u((String) obj);
        }
        if (obj instanceof Double) {
            return new C9184i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C9184i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C9184i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C9154g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C9260n nVar = new C9260n();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C9306q b = m43660b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    nVar.mo19179e((String) next, b);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            C4652f fVar = new C4652f();
            for (Object b2 : (List) obj) {
                fVar.mo19193v(fVar.mo19182g(), m43660b(b2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
