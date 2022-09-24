package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class i53<K, V> extends l53<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public transient Map<K, Collection<V>> f20386e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public transient int f20387f;

    protected i53(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f20386e = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m20531q(i53 i53, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = i53.f20386e;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            i53.f20387f -= size;
        }
    }

    /* renamed from: a */
    public final boolean mo18409a(K k, V v) {
        Collection collection = this.f20386e.get(k);
        if (collection == null) {
            Collection h = mo18412h();
            if (h.add(v)) {
                this.f20387f++;
                this.f20386e.put(k, h);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f20387f++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Collection<V> mo18410b() {
        return new k53(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Iterator<V> mo18411c() {
        return new r43(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection<V> mo18412h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract <E> Collection<E> mo18413i(Collection<E> collection);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract Collection<V> mo18414j(K k, Collection<V> collection);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final List<V> mo18415l(K k, List<V> list, @CheckForNull f53 f53) {
        if (list instanceof RandomAccess) {
            return new b53(this, k, list, f53);
        }
        return new h53(this, k, list, f53);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Map<K, Collection<V>> mo18416n() {
        Map<K, Collection<V>> map = this.f20386e;
        if (map instanceof NavigableMap) {
            return new z43(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new c53(this, (SortedMap) map);
        }
        return new u43(this, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Set<K> mo18417o() {
        Map<K, Collection<V>> map = this.f20386e;
        if (map instanceof NavigableMap) {
            return new a53(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new d53(this, (SortedMap) map);
        }
        return new y43(this, map);
    }

    public final int zze() {
        return this.f20387f;
    }

    public final void zzp() {
        for (Collection<V> clear : this.f20386e.values()) {
            clear.clear();
        }
        this.f20386e.clear();
        this.f20387f = 0;
    }
}
