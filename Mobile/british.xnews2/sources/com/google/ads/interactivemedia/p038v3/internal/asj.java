package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asj */
/* compiled from: IMASDK */
class asj implements Iterator {

    /* renamed from: a */
    final Iterator f15651a;

    /* renamed from: b */
    final Collection f15652b;

    /* renamed from: c */
    final /* synthetic */ ask f15653c;

    asj(ask ask) {
        Iterator it;
        this.f15653c = ask;
        Collection collection = ask.f15655b;
        this.f15652b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f15651a = it;
    }

    asj(ask ask, Iterator it) {
        this.f15653c = ask;
        this.f15652b = ask.f15655b;
        this.f15651a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14333a() {
        this.f15653c.mo14337a();
        if (this.f15653c.f15655b != this.f15652b) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo14333a();
        return this.f15651a.hasNext();
    }

    public final Object next() {
        mo14333a();
        return this.f15651a.next();
    }

    public final void remove() {
        this.f15651a.remove();
        asn.m14677r(this.f15653c.f15658e);
        this.f15653c.mo14340b();
    }
}
