package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ku3 implements Iterator {

    /* renamed from: b */
    int f34484b = 0;

    /* renamed from: c */
    final /* synthetic */ lu3 f34485c;

    ku3(lu3 lu3) {
        this.f34485c = lu3;
    }

    public final boolean hasNext() {
        return this.f34484b < this.f34485c.f35266b.size() || this.f34485c.f35267c.hasNext();
    }

    public final Object next() {
        if (this.f34484b < this.f34485c.f35266b.size()) {
            List<E> list = this.f34485c.f35266b;
            int i = this.f34484b;
            this.f34484b = i + 1;
            return list.get(i);
        }
        lu3 lu3 = this.f34485c;
        lu3.f35266b.add(lu3.f35267c.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
