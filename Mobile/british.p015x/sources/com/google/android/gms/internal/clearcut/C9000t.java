package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.t */
abstract class C9000t<E> extends AbstractList<E> implements C8934k1<E> {

    /* renamed from: b */
    private boolean f44740b = true;

    C9000t() {
    }

    public boolean add(E e) {
        mo37158c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo37158c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo37158c();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo37158c() {
        if (!this.f44740b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo37158c();
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

    /* renamed from: n */
    public boolean mo36983n() {
        return this.f44740b;
    }

    public boolean remove(Object obj) {
        mo37158c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo37158c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo37158c();
        return super.retainAll(collection);
    }

    public final void zzv() {
        this.f44740b = false;
    }
}
