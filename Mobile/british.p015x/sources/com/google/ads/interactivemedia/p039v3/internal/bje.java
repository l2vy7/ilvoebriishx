package com.google.ads.interactivemedia.p039v3.internal;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bje */
/* compiled from: IMASDK */
abstract class bje<E> extends AbstractList<E> implements bkq<E> {

    /* renamed from: a */
    private boolean f16466a = true;

    bje() {
    }

    /* renamed from: a */
    public boolean mo15173a() {
        return this.f16466a;
    }

    public void add(int i, E e) {
        mo15179c();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo15179c();
        return super.addAll(i, collection);
    }

    /* renamed from: b */
    public final void mo15178b() {
        this.f16466a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15179c() {
        if (!this.f16466a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo15179c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        mo15179c();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        mo15179c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo15179c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo15179c();
        return super.set(i, e);
    }

    public boolean add(E e) {
        mo15179c();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo15179c();
        return super.addAll(collection);
    }

    public boolean remove(Object obj) {
        mo15179c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
