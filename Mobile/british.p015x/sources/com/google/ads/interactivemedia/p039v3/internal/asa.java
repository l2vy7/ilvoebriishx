package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asa */
/* compiled from: IMASDK */
class asa extends auw {

    /* renamed from: a */
    final transient Map f15636a;

    /* renamed from: b */
    final /* synthetic */ asn f15637b;

    asa(asn asn, Map map) {
        this.f15637b = asn;
        this.f15636a = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set<Map.Entry> mo14259a() {
        return new ary(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map.Entry mo14260b(Map.Entry entry) {
        Object key = entry.getKey();
        return avr.m14969k(key, this.f15637b.mo14249b(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        if (this.f15636a == this.f15637b.f15661a) {
            this.f15637b.mo14373g();
        } else {
            aup.m14871b(new arz(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.f15636a;
        ars.m14627g(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f15636a.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) avr.m14970l(this.f15636a, obj);
        if (collection == null) {
            return null;
        }
        return this.f15637b.mo14249b(obj, collection);
    }

    public final int hashCode() {
        return this.f15636a.hashCode();
    }

    public Set keySet() {
        return this.f15637b.mo14396w();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f15636a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection c = this.f15637b.mo14250c();
        c.addAll(collection);
        asn.m14679t(this.f15637b, collection.size());
        collection.clear();
        return c;
    }

    public final int size() {
        return this.f15636a.size();
    }

    public final String toString() {
        return this.f15636a.toString();
    }
}
