package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.d1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
abstract class C9492d1<E> extends AbstractList<E> implements C9485c3<E> {

    /* renamed from: b */
    private boolean f45627b = true;

    C9492d1() {
    }

    /* renamed from: C */
    public boolean mo38298C() {
        return this.f45627b;
    }

    /* renamed from: T */
    public final void mo38299T() {
        this.f45627b = false;
    }

    public boolean add(E e) {
        mo38316c();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo38316c();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo38316c() {
        if (!this.f45627b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo38316c();
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

    public boolean remove(Object obj) {
        mo38316c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo38316c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo38316c();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo38316c();
        return super.addAll(i, collection);
    }
}
