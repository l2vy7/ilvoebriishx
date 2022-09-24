package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.xe */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9429xe {

    /* renamed from: a */
    final TreeMap f45524a = new TreeMap();

    /* renamed from: b */
    final TreeMap f45525b = new TreeMap();

    /* renamed from: c */
    private static final int m43856c(C9326r4 r4Var, C9291p pVar, C9306q qVar) {
        C9306q d = pVar.mo37655d(r4Var, Collections.singletonList(qVar));
        if (d instanceof C9184i) {
            return C9343s5.m43605b(d.zzh().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo38176a(String str, int i, C9291p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f45525b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f45524a;
        } else {
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pVar);
    }

    /* renamed from: b */
    public final void mo38177b(C9326r4 r4Var, C9091c cVar) {
        C9363t9 t9Var = new C9363t9(cVar);
        for (Integer num : this.f45524a.keySet()) {
            C9076b b = cVar.mo37431b().clone();
            int c = m43856c(r4Var, (C9291p) this.f45524a.get(num), t9Var);
            if (c == 2 || c == -1) {
                cVar.mo37436f(b);
            }
        }
        for (Integer num2 : this.f45525b.keySet()) {
            m43856c(r4Var, (C9291p) this.f45525b.get(num2), t9Var);
        }
    }
}
