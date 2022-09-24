package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class r83<F, T> extends q83<F, T> implements ListIterator<T> {
    r83(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f37939b).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f37939b).nextIndex();
    }

    public final T previous() {
        return mo32027a(((ListIterator) this.f37939b).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f37939b).previousIndex();
    }

    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
