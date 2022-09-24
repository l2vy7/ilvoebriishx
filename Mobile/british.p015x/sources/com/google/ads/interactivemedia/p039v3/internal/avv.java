package com.google.ads.interactivemedia.p039v3.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avv */
/* compiled from: IMASDK */
public abstract class avv<E> extends avu<E> implements ListIterator<E> {

    /* renamed from: a */
    private final int f15815a;

    /* renamed from: b */
    private int f15816b;

    protected avv() {
    }

    protected avv(int i, int i2) {
        this();
        ars.m14628h(i2, i);
        this.f15815a = i;
        this.f15816b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo14515a(int i);

    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        return this.f15816b < this.f15815a;
    }

    public boolean hasPrevious() {
        return this.f15816b > 0;
    }

    public Object next() {
        if (hasNext()) {
            int i = this.f15816b;
            this.f15816b = i + 1;
            return mo14515a(i);
        }
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return this.f15816b;
    }

    public Object previous() {
        if (hasPrevious()) {
            int i = this.f15816b - 1;
            this.f15816b = i;
            return mo14515a(i);
        }
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return this.f15816b - 1;
    }

    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
