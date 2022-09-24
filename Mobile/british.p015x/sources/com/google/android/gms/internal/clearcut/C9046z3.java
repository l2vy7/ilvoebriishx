package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.clearcut.z3 */
final class C9046z3 implements ListIterator<String> {

    /* renamed from: b */
    private ListIterator<String> f44808b;

    /* renamed from: c */
    private final /* synthetic */ int f44809c;

    /* renamed from: d */
    private final /* synthetic */ C9039y3 f44810d;

    C9046z3(C9039y3 y3Var, int i) {
        this.f44810d = y3Var;
        this.f44809c = i;
        this.f44808b = y3Var.f44801b.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f44808b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f44808b.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f44808b.next();
    }

    public final int nextIndex() {
        return this.f44808b.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f44808b.previous();
    }

    public final int previousIndex() {
        return this.f44808b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
