package com.google.ads.interactivemedia.p039v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asn */
/* compiled from: IMASDK */
abstract class asn<K, V> extends asq<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public transient Map<K, Collection<V>> f15661a;

    /* renamed from: b */
    private transient int f15662b;

    protected asn(Map<K, Collection<V>> map) {
        ars.m14621a(map.isEmpty());
        this.f15661a = map;
    }

    /* renamed from: p */
    static /* synthetic */ void m14675p(asn asn, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = asn.f15661a;
        ars.m14627g(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            asn.f15662b -= size;
        }
    }

    /* renamed from: q */
    static /* synthetic */ void m14676q(asn asn) {
        asn.f15662b++;
    }

    /* renamed from: r */
    static /* synthetic */ void m14677r(asn asn) {
        asn.f15662b--;
    }

    /* renamed from: s */
    static /* synthetic */ void m14678s(asn asn, int i) {
        asn.f15662b += i;
    }

    /* renamed from: t */
    static /* synthetic */ void m14679t(asn asn, int i) {
        asn.f15662b -= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <E> Collection<E> mo14248a(Collection<E> collection) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<V> mo14249b(K k, Collection<V> collection) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Collection<V> mo14250c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14370d(Map<K, Collection<V>> map) {
        this.f15661a = map;
        this.f15662b = 0;
        for (Collection next : map.values()) {
            ars.m14621a(!next.isEmpty());
            this.f15662b += next.size();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Map<K, Collection<V>> mo14371e() {
        return this.f15661a;
    }

    /* renamed from: f */
    public final int mo14372f() {
        return this.f15662b;
    }

    /* renamed from: g */
    public final void mo14373g() {
        for (Collection<V> clear : this.f15661a.values()) {
            clear.clear();
        }
        this.f15661a.clear();
        this.f15662b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final List<V> mo14374h(K k, List<V> list, ask ask) {
        if (list instanceof RandomAccess) {
            return new asg(this, k, list, ask);
        }
        return new asm(this, k, list, ask);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<K> mo14375i() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Set<K> mo14376j() {
        Map<K, Collection<V>> map = this.f15661a;
        if (map instanceof NavigableMap) {
            return new asf(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new asi(this, (SortedMap) map);
        }
        return new asd(this, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Collection<V> mo14377k() {
        return new asp(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Iterator<V> mo14378l() {
        return new asb(this, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Map<K, Collection<V>> mo14379m() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Map<K, Collection<V>> mo14380n() {
        Map<K, Collection<V>> map = this.f15661a;
        if (map instanceof NavigableMap) {
            return new ase(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new ash(this, (SortedMap) map);
        }
        return new asa(this, map);
    }

    /* renamed from: u */
    public void mo14381u(K k, V v) {
        Collection collection = this.f15661a.get(k);
        if (collection == null) {
            Collection c = mo14250c();
            if (c.add(v)) {
                this.f15662b++;
                this.f15661a.put(k, c);
                return;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.f15662b++;
        }
    }
}
