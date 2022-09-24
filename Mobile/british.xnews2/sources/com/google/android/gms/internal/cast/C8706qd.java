package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.qd */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8706qd {
    C8706qd() {
    }

    /* renamed from: a */
    public static final int m41257a(int i, Object obj, Object obj2) {
        C8690pd pdVar = (C8690pd) obj;
        C8674od odVar = (C8674od) obj2;
        if (pdVar.isEmpty()) {
            return 0;
        }
        Iterator it = pdVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
