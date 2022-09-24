package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pq3 {
    pq3() {
    }

    /* renamed from: a */
    public static final int m36170a(int i, Object obj, Object obj2) {
        oq3 oq3 = (oq3) obj;
        nq3 nq3 = (nq3) obj2;
        if (oq3.isEmpty()) {
            return 0;
        }
        Iterator it = oq3.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m36171b(Object obj) {
        return !((oq3) obj).mo33989h();
    }

    /* renamed from: c */
    public static final Object m36172c(Object obj, Object obj2) {
        oq3 oq3 = (oq3) obj;
        oq3 oq32 = (oq3) obj2;
        if (!oq32.isEmpty()) {
            if (!oq3.mo33989h()) {
                oq3 = oq3.mo33983c();
            }
            oq3.mo33988g(oq32);
        }
        return oq3;
    }
}
