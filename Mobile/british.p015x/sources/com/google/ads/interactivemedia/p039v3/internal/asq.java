package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asq */
/* compiled from: IMASDK */
abstract class asq<K, V> implements aux<K, V> {

    /* renamed from: a */
    private transient Set<K> f15664a;

    /* renamed from: b */
    private transient Collection<V> f15665b;

    /* renamed from: c */
    private transient Map<K, Collection<V>> f15666c;

    asq() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aux)) {
            return false;
        }
        return mo14398y().equals(((aux) obj).mo14398y());
    }

    public int hashCode() {
        return mo14398y().hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Set<K> mo14375i();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract Collection<V> mo14377k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Iterator<V> mo14378l() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract Map<K, Collection<V>> mo14379m();

    public String toString() {
        return mo14398y().toString();
    }

    /* renamed from: u */
    public void mo14381u(K k, V v) {
        throw null;
    }

    /* renamed from: v */
    public boolean mo14395v(Object obj) {
        for (Collection contains : mo14398y().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public final Set<K> mo14396w() {
        Set<K> set = this.f15664a;
        if (set != null) {
            return set;
        }
        Set<K> i = mo14375i();
        this.f15664a = i;
        return i;
    }

    /* renamed from: x */
    public Collection<V> mo14397x() {
        Collection<V> collection = this.f15665b;
        if (collection != null) {
            return collection;
        }
        Collection<V> k = mo14377k();
        this.f15665b = k;
        return k;
    }

    /* renamed from: y */
    public Map<K, Collection<V>> mo14398y() {
        Map<K, Collection<V>> map = this.f15666c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> m = mo14379m();
        this.f15666c = m;
        return m;
    }
}
