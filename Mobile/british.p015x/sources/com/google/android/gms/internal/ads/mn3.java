package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class mn3<E> extends AbstractList<E> implements tp3<E> {

    /* renamed from: b */
    private boolean f35585b = true;

    mn3() {
    }

    public boolean add(E e) {
        mo33571c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo33571c();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo33571c() {
        if (!this.f35585b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo33571c();
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
        mo33571c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo33571c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo33571c();
        return super.retainAll(collection);
    }

    public final void zzb() {
        this.f35585b = false;
    }

    public final boolean zzc() {
        return this.f35585b;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo33571c();
        return super.addAll(collection);
    }
}
