package com.google.common.collect;

import java.util.Iterator;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.d1 */
/* compiled from: TransformedIterator */
abstract class C10387d1<F, T> implements Iterator<T> {

    /* renamed from: b */
    final Iterator<? extends F> f48804b;

    C10387d1(Iterator<? extends F> it) {
        this.f48804b = (Iterator) C6073k.m26688k(it);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo19705a(F f);

    public final boolean hasNext() {
        return this.f48804b.hasNext();
    }

    public final T next() {
        return mo19705a(this.f48804b.next());
    }

    public final void remove() {
        this.f48804b.remove();
    }
}
