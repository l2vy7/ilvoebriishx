package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aug */
/* compiled from: IMASDK */
public class aug<K, V> {

    /* renamed from: a */
    final Map<K, Collection<V>> f15758a = atb.m14710a();

    /* renamed from: b */
    public void mo14536b(K k, Iterable<? extends V> iterable) {
        Collection collection = this.f15758a.get(k);
        if (collection != null) {
            for (Object next : iterable) {
                aup.m14882m(k, next);
                collection.add(next);
            }
            return;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                Object next2 = it.next();
                aup.m14882m(k, next2);
                arrayList.add(next2);
            }
            this.f15758a.put(k, arrayList);
        }
    }
}
