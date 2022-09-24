package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aua */
/* compiled from: IMASDK */
public final class aua<K, V> extends aug<K, V> {
    /* renamed from: a */
    public final aub<K, V> mo14535a() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.f15758a.entrySet();
        if (entrySet.isEmpty()) {
            return atg.f15700a;
        }
        auc auc = new auc(entrySet.size());
        int i = 0;
        for (Map.Entry next : entrySet) {
            Object key = next.getKey();
            atz m = atz.m14811m((Collection) next.getValue());
            if (!m.isEmpty()) {
                auc.mo14540b(key, m);
                i += m.size();
            }
        }
        return new aub<>(auc.mo14539a(), i);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14536b(Object obj, Iterable iterable) {
        super.mo14536b(obj, iterable);
    }

    /* renamed from: c */
    public final void mo14537c(K k, V... vArr) {
        mo14536b(k, Arrays.asList(vArr));
    }
}
