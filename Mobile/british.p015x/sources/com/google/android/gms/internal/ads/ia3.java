package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ia3<V> extends la3<V, List<V>> {
    ia3(k63<? extends mb3<? extends V>> k63, boolean z) {
        super(k63, true);
        mo19054T();
    }

    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo18520W(List list) {
        ArrayList a = i73.m33107a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ja3 ja3 = (ja3) it.next();
            a.add(ja3 != null ? ja3.f33827a : null);
        }
        return Collections.unmodifiableList(a);
    }
}
