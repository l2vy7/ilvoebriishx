package com.google.android.gms.internal.cast;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.cast.ze */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8845ze implements ListIterator<String> {

    /* renamed from: b */
    final ListIterator<String> f44282b;

    /* renamed from: c */
    final /* synthetic */ int f44283c;

    /* renamed from: d */
    final /* synthetic */ C8462bf f44284d;

    C8845ze(C8462bf bfVar, int i) {
        this.f44284d = bfVar;
        this.f44283c = i;
        this.f44282b = bfVar.f43306b.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f44282b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f44282b.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f44282b.next();
    }

    public final int nextIndex() {
        return this.f44282b.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f44282b.previous();
    }

    public final int previousIndex() {
        return this.f44282b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
