package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aut */
/* compiled from: IMASDK */
abstract class aut<K, V> extends avq<Map.Entry<K, V>> {
    aut() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Map<K, V> mo14251a();

    public final void clear() {
        mo14251a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object l = avr.m14970l(mo14251a(), key);
        if (!arq.m14618b(l, entry.getValue())) {
            return false;
        }
        if (l != null || mo14251a().containsKey(key)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        return mo14251a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (contains(obj)) {
            return mo14251a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    public final boolean removeAll(Collection<?> collection) {
        try {
            ars.m14627g(collection);
            return avr.m14963e(this, collection);
        } catch (UnsupportedOperationException unused) {
            return avr.m14962d(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        try {
            ars.m14627g(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet b = avr.m14960b(collection.size());
            for (Object next : collection) {
                if (contains(next)) {
                    b.add(((Map.Entry) next).getKey());
                }
            }
            return mo14251a().keySet().retainAll(b);
        }
    }

    public final int size() {
        return mo14251a().size();
    }
}
