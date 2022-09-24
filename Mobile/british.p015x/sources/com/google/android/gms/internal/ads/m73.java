package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class m73<K, V> extends AbstractCollection<V> {

    /* renamed from: b */
    final Map<K, V> f20545b;

    m73(Map<K, V> map) {
        this.f20545b = map;
    }

    public final void clear() {
        this.f20545b.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f20545b.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f20545b.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new j73(this.f20545b.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f20545b.entrySet()) {
                if (x33.m21118a(obj, next.getValue())) {
                    this.f20545b.remove(next.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f20545b.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f20545b.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f20545b.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f20545b.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f20545b.size();
    }
}
