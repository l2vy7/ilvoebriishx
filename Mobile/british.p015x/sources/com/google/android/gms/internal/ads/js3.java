package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class js3 implements ListIterator<String> {

    /* renamed from: b */
    final ListIterator<String> f34035b;

    /* renamed from: c */
    final /* synthetic */ int f34036c;

    /* renamed from: d */
    final /* synthetic */ ls3 f34037d;

    js3(ls3 ls3, int i) {
        this.f34037d = ls3;
        this.f34036c = i;
        this.f34035b = ls3.f35236b.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f34035b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f34035b.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f34035b.next();
    }

    public final int nextIndex() {
        return this.f34035b.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f34035b.previous();
    }

    public final int previousIndex() {
        return this.f34035b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
