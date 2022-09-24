package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asc */
/* compiled from: IMASDK */
final class asc implements Iterator {

    /* renamed from: a */
    Map.Entry f15642a;

    /* renamed from: b */
    final /* synthetic */ Iterator f15643b;

    /* renamed from: c */
    final /* synthetic */ asd f15644c;

    asc(asd asd, Iterator it) {
        this.f15644c = asd;
        this.f15643b = it;
    }

    public final boolean hasNext() {
        return this.f15643b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f15643b.next();
        this.f15642a = entry;
        return entry.getKey();
    }

    public final void remove() {
        aup.m14883n(this.f15642a != null);
        Collection collection = (Collection) this.f15642a.getValue();
        this.f15643b.remove();
        asn.m14679t(this.f15644c.f15645a, collection.size());
        collection.clear();
        this.f15642a = null;
    }
}
