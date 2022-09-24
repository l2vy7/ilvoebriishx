package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asd */
/* compiled from: IMASDK */
class asd extends auu {

    /* renamed from: a */
    final /* synthetic */ asn f15645a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    asd(asn asn, Map map) {
        super(map);
        this.f15645a = asn;
    }

    public final void clear() {
        aup.m14871b(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f15772d.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f15772d.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f15772d.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new asc(this, this.f15772d.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f15772d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        asn.m14679t(this.f15645a, size);
        return size > 0;
    }
}
