package com.google.ads.interactivemedia.p038v3.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auw */
/* compiled from: IMASDK */
abstract class auw<K, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private transient Set<Map.Entry<K, V>> f15774a;

    /* renamed from: b */
    private transient Set<K> f15775b;

    /* renamed from: c */
    private transient Collection<V> f15776c;

    auw() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Set<Map.Entry<K, V>> mo14259a();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f15774a;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo14259a();
        this.f15774a = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Set<K> mo14300j() {
        return new auu(this);
    }

    public Set<K> keySet() {
        Set<K> set = this.f15775b;
        if (set != null) {
            return set;
        }
        Set<K> j = mo14300j();
        this.f15775b = j;
        return j;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f15776c;
        if (collection != null) {
            return collection;
        }
        auv auv = new auv(this);
        this.f15776c = auv;
        return auv;
    }
}
