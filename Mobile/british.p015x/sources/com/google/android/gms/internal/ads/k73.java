package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class k73<K, V> extends n83<Map.Entry<K, V>> {
    k73() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Map<K, V> mo18473c();

    public final void clear() {
        mo18473c().clear();
    }

    public abstract boolean contains(@CheckForNull Object obj);

    public final boolean isEmpty() {
        return mo18473c().isEmpty();
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return o83.m35588b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return o83.m35589c(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        int i;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                n53.m35069a(size, "expectedSize");
                i = size + 1;
            } else {
                i = size < 1073741824 ? (int) ((((float) size) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return mo18473c().keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo18473c().size();
    }
}
