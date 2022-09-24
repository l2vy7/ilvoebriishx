package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avt */
/* compiled from: IMASDK */
abstract class avt<F, T> implements Iterator<T> {

    /* renamed from: a */
    final Iterator<? extends F> f15814a;

    avt(Iterator<? extends F> it) {
        ars.m14627g(it);
        this.f15814a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo14579a(F f);

    public final boolean hasNext() {
        return this.f15814a.hasNext();
    }

    public final T next() {
        return mo14579a(this.f15814a.next());
    }

    public final void remove() {
        this.f15814a.remove();
    }
}
