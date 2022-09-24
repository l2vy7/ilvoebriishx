package com.google.common.collect;

import java.util.NoSuchElementException;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.a */
/* compiled from: AbstractIndexedListIterator */
abstract class C10382a<E> extends C10390f1<E> {

    /* renamed from: b */
    private final int f48802b;

    /* renamed from: c */
    private int f48803c;

    protected C10382a(int i, int i2) {
        C6073k.m26690m(i2, i);
        this.f48802b = i;
        this.f48803c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo19669a(int i);

    public final boolean hasNext() {
        return this.f48803c < this.f48802b;
    }

    public final boolean hasPrevious() {
        return this.f48803c > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f48803c;
            this.f48803c = i + 1;
            return mo19669a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f48803c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f48803c - 1;
            this.f48803c = i;
            return mo19669a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f48803c - 1;
    }
}
