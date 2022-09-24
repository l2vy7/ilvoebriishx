package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.za */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9455za implements ListIterator {

    /* renamed from: b */
    final ListIterator f45565b;

    /* renamed from: c */
    final /* synthetic */ int f45566c;

    /* renamed from: d */
    final /* synthetic */ C9087bb f45567d;

    C9455za(C9087bb bbVar, int i) {
        this.f45567d = bbVar;
        this.f45566c = i;
        this.f45565b = bbVar.f44904b.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f45565b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f45565b.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f45565b.next();
    }

    public final int nextIndex() {
        return this.f45565b.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f45565b.previous();
    }

    public final int previousIndex() {
        return this.f45565b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
