package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atl */
/* compiled from: IMASDK */
final class atl<K, V> extends AbstractMap<V, K> implements Serializable, ass {

    /* renamed from: a */
    private final atr<K, V> f15708a;

    /* renamed from: b */
    private transient Set<Map.Entry<V, K>> f15709b;

    atl(atr<K, V> atr) {
        this.f15708a = atr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f15708a.f15733p = this;
    }

    public final void clear() {
        this.f15708a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f15708a.containsValue(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f15708a.containsKey(obj);
    }

    public final Set<Map.Entry<V, K>> entrySet() {
        Set<Map.Entry<V, K>> set = this.f15709b;
        if (set != null) {
            return set;
        }
        atm atm = new atm(this.f15708a);
        this.f15709b = atm;
        return atm;
    }

    public final K get(Object obj) {
        atr<K, V> atr = this.f15708a;
        int d = atr.mo14479d(obj);
        if (d == -1) {
            return null;
        }
        return atr.f15718a[d];
    }

    public final Set<V> keySet() {
        return this.f15708a.values();
    }

    public final K put(V v, K k) {
        return this.f15708a.mo14490q(v, k);
    }

    public final K remove(Object obj) {
        atr<K, V> atr = this.f15708a;
        int d = aup.m14873d(obj);
        int e = atr.mo14480e(obj, d);
        if (e == -1) {
            return null;
        }
        K k = atr.f15718a[e];
        atr.mo14485h(e, d);
        return k;
    }

    public final int size() {
        return this.f15708a.f15720c;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return this.f15708a.keySet();
    }
}
