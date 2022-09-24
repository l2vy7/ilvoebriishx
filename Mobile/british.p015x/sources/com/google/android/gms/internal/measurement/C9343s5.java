package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9343s5 {
    /* renamed from: a */
    public static double m43604a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        double d2 = (double) (d > 0.0d ? 1 : -1);
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return d2 * floor;
    }

    /* renamed from: b */
    public static int m43605b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        double d2 = (double) (d > 0.0d ? 1 : -1);
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return (int) ((long) ((d2 * floor) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m43606c(C9326r4 r4Var) {
        int b = m43605b(r4Var.mo37979d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (b <= 1000000) {
            r4Var.mo37982g("runtime.counter", new C9184i(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m43607d(double d) {
        return ((long) m43605b(d)) & 4294967295L;
    }

    /* renamed from: e */
    public static C9261n0 m43608e(String str) {
        C9261n0 n0Var = null;
        if (str != null && !str.isEmpty()) {
            n0Var = C9261n0.m43220a(Integer.parseInt(str));
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m43609f(C9306q qVar) {
        if (C9306q.f45373e0.equals(qVar)) {
            return null;
        }
        if (C9306q.f45372d0.equals(qVar)) {
            return "";
        }
        if (qVar instanceof C9260n) {
            return m43610g((C9260n) qVar);
        }
        if (qVar instanceof C4652f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C4652f) qVar).iterator();
            while (it.hasNext()) {
                Object f = m43609f((C9306q) it.next());
                if (f != null) {
                    arrayList.add(f);
                }
            }
            return arrayList;
        } else if (!qVar.zzh().isNaN()) {
            return qVar.zzh();
        } else {
            return qVar.zzi();
        }
    }

    /* renamed from: g */
    public static Map m43610g(C9260n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.mo37738d()) {
            Object f = m43609f(nVar.mo19178c(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m43611h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m43612i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m43613j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m43614k(C9306q qVar) {
        if (qVar == null) {
            return false;
        }
        Double zzh = qVar.zzh();
        if (zzh.isNaN() || zzh.doubleValue() < 0.0d || !zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m43615l(C9306q qVar, C9306q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof C9384v) || (qVar instanceof C9275o)) {
            return true;
        }
        if (qVar instanceof C9184i) {
            if (Double.isNaN(qVar.zzh().doubleValue()) || Double.isNaN(qVar2.zzh().doubleValue())) {
                return false;
            }
            return qVar.zzh().equals(qVar2.zzh());
        } else if (qVar instanceof C9369u) {
            return qVar.zzi().equals(qVar2.zzi());
        } else {
            if (qVar instanceof C9154g) {
                return qVar.zzg().equals(qVar2.zzg());
            }
            if (qVar == qVar2) {
                return true;
            }
            return false;
        }
    }
}
