package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h73<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* renamed from: b */
    final List<F> f32646b;

    /* renamed from: c */
    final p33<? super F, ? extends T> f32647c;

    h73(List<F> list, p33<? super F, ? extends T> p33) {
        this.f32646b = list;
        this.f32647c = p33;
    }

    public final void clear() {
        this.f32646b.clear();
    }

    public final ListIterator<T> listIterator(int i) {
        return new g73(this, this.f32646b.listIterator(i));
    }

    public final int size() {
        return this.f32646b.size();
    }
}
