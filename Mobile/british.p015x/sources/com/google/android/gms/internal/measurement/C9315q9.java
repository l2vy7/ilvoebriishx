package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9315q9 {
    C9315q9() {
    }

    /* renamed from: a */
    public static final int m43513a(int i, Object obj, Object obj2) {
        C9300p9 p9Var = (C9300p9) obj;
        C9285o9 o9Var = (C9285o9) obj2;
        if (p9Var.isEmpty()) {
            return 0;
        }
        Iterator it = p9Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m43514b(Object obj, Object obj2) {
        C9300p9 p9Var = (C9300p9) obj;
        C9300p9 p9Var2 = (C9300p9) obj2;
        if (!p9Var2.isEmpty()) {
            if (!p9Var.mo37935h()) {
                p9Var = p9Var.mo37929c();
            }
            p9Var.mo37934g(p9Var2);
        }
        return p9Var;
    }
}
