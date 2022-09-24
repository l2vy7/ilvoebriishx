package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auu */
/* compiled from: IMASDK */
class auu<K, V> extends avq<K> {

    /* renamed from: d */
    final Map<K, V> f15772d;

    auu(Map<K, V> map) {
        ars.m14627g(map);
        this.f15772d = map;
    }

    public void clear() {
        this.f15772d.clear();
    }

    public final boolean contains(Object obj) {
        return this.f15772d.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f15772d.isEmpty();
    }

    public Iterator<K> iterator() {
        return new aur(this.f15772d.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f15772d.remove(obj);
        return true;
    }

    public final int size() {
        return this.f15772d.size();
    }
}
