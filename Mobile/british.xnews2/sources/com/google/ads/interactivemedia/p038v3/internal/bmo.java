package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ListIterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmo */
/* compiled from: IMASDK */
final class bmo implements ListIterator<String> {

    /* renamed from: a */
    final ListIterator<String> f16703a;

    /* renamed from: b */
    final /* synthetic */ int f16704b;

    /* renamed from: c */
    final /* synthetic */ bmq f16705c;

    bmo(bmq bmq, int i) {
        this.f16705c = bmq;
        this.f16704b = i;
        this.f16703a = bmq.f16708a.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f16703a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f16703a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f16703a.next();
    }

    public final int nextIndex() {
        return this.f16703a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f16703a.previous();
    }

    public final int previousIndex() {
        return this.f16703a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
