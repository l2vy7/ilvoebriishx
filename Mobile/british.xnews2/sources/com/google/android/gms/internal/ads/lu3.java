package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lu3<E> extends AbstractList<E> {

    /* renamed from: d */
    private static final mu3 f35265d = mu3.m34909b(lu3.class);

    /* renamed from: b */
    final List<E> f35266b;

    /* renamed from: c */
    final Iterator<E> f35267c;

    public lu3(List<E> list, Iterator<E> it) {
        this.f35266b = list;
        this.f35267c = it;
    }

    public final E get(int i) {
        if (this.f35266b.size() > i) {
            return this.f35266b.get(i);
        }
        if (this.f35267c.hasNext()) {
            this.f35266b.add(this.f35267c.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final Iterator<E> iterator() {
        return new ku3(this);
    }

    public final int size() {
        mu3 mu3 = f35265d;
        mu3.mo32456a("potentially expensive size() call");
        mu3.mo32456a("blowup running");
        while (this.f35267c.hasNext()) {
            this.f35266b.add(this.f35267c.next());
        }
        return this.f35266b.size();
    }
}
