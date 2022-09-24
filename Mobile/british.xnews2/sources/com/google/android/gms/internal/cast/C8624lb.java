package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.lb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
abstract class C8624lb<E> extends AbstractList<E> implements C8843zc<E> {

    /* renamed from: b */
    private boolean f43666b = true;

    C8624lb() {
    }

    public boolean add(E e) {
        mo36587c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo36587c();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo36587c() {
        if (!this.f43666b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo36587c();
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

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo36587c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo36587c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo36587c();
        return super.retainAll(collection);
    }

    public final boolean zza() {
        return this.f43666b;
    }

    public final void zzb() {
        this.f43666b = false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo36587c();
        return super.addAll(collection);
    }
}
