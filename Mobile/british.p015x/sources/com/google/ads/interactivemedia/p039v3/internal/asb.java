package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asb */
/* compiled from: IMASDK */
final class asb<T> implements Iterator<T> {

    /* renamed from: a */
    final Iterator<Map.Entry> f15638a;

    /* renamed from: b */
    Collection f15639b;

    /* renamed from: c */
    Iterator f15640c;

    /* renamed from: d */
    final /* synthetic */ asn f15641d;

    asb(asn asn, byte[] bArr) {
        this(asn);
    }

    public final boolean hasNext() {
        return this.f15638a.hasNext() || this.f15640c.hasNext();
    }

    public final T next() {
        if (!this.f15640c.hasNext()) {
            Map.Entry next = this.f15638a.next();
            next.getKey();
            Collection collection = (Collection) next.getValue();
            this.f15639b = collection;
            this.f15640c = collection.iterator();
        }
        return this.f15640c.next();
    }

    public final void remove() {
        this.f15640c.remove();
        if (this.f15639b.isEmpty()) {
            this.f15638a.remove();
        }
        asn.m14677r(this.f15641d);
    }

    asb(asn asn) {
        this.f15641d = asn;
        this.f15638a = asn.f15661a.entrySet().iterator();
        this.f15639b = null;
        this.f15640c = auo.f15770a;
    }
}
