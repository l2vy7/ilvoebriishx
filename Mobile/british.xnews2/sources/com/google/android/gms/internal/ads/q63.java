package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q63<K, V> extends v63<K, V> {
    /* renamed from: a */
    public final q63<K, V> mo34238a(K k, V... vArr) {
        List asList = Arrays.asList(vArr);
        Collection collection = this.f40323a.get(k);
        if (collection != null) {
            for (Object next : asList) {
                n53.m35070b(k, next);
                collection.add(next);
            }
        } else {
            Iterator it = asList.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    n53.m35070b(k, next2);
                    arrayList.add(next2);
                }
                this.f40323a.put(k, arrayList);
            }
        }
        return this;
    }

    /* renamed from: b */
    public final r63<K, V> mo34239b() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.f40323a.entrySet();
        if (entrySet.isEmpty()) {
            return f63.f31654g;
        }
        s63 s63 = new s63(entrySet.size());
        int i = 0;
        for (Map.Entry next : entrySet) {
            Object key = next.getKey();
            p63 y = p63.m20824y((Collection) next.getValue());
            if (!y.isEmpty()) {
                s63.mo34664a(key, y);
                i += y.size();
            }
        }
        return new r63<>(s63.mo34666c(), i);
    }
}
