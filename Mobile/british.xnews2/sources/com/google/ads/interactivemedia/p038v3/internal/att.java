package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.internal.att */
/* compiled from: IMASDK */
public abstract class att<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f15737a = new Object[0];

    att() {
    }

    /* renamed from: a */
    public abstract avu<E> iterator();

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object[] mo14498b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo14499c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo14502d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public atz<E> mo14503e() {
        return isEmpty() ? atz.m14807i() : atz.m14813o(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo14504f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo14505g(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f15737a);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new atx(toArray());
    }

    public final <T> T[] toArray(T[] tArr) {
        ars.m14627g(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] b = mo14498b();
            if (b != null) {
                return Arrays.copyOfRange(b, mo14499c(), mo14502d(), tArr.getClass());
            }
            tArr = avr.m14965g(tArr, size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo14505g(tArr, 0);
        return tArr;
    }
}
