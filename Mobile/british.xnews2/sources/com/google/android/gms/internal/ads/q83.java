package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class q83<F, T> implements Iterator<T> {

    /* renamed from: b */
    final Iterator<? extends F> f37939b;

    q83(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f37939b = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo32027a(F f);

    public final boolean hasNext() {
        return this.f37939b.hasNext();
    }

    public final T next() {
        return mo32027a(this.f37939b.next());
    }

    public final void remove() {
        this.f37939b.remove();
    }
}
