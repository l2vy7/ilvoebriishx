package com.google.ads.interactivemedia.p039v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auv */
/* compiled from: IMASDK */
final class auv<K, V> extends AbstractCollection<V> {

    /* renamed from: a */
    final Map<K, V> f15773a;

    auv(Map<K, V> map) {
        this.f15773a = map;
    }

    public final void clear() {
        this.f15773a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f15773a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f15773a.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new aus(this.f15773a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f15773a.entrySet()) {
                if (arq.m14618b(obj, next.getValue())) {
                    this.f15773a.remove(next.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        try {
            ars.m14627g(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet a = avr.m14959a();
            for (Map.Entry next : this.f15773a.entrySet()) {
                if (collection.contains(next.getValue())) {
                    a.add(next.getKey());
                }
            }
            return this.f15773a.keySet().removeAll(a);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        try {
            ars.m14627g(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet a = avr.m14959a();
            for (Map.Entry next : this.f15773a.entrySet()) {
                if (collection.contains(next.getValue())) {
                    a.add(next.getKey());
                }
            }
            return this.f15773a.keySet().retainAll(a);
        }
    }

    public final int size() {
        return this.f15773a.size();
    }
}
