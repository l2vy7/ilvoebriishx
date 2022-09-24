package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.c7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
abstract class C9099c7 extends AbstractList implements C9438y8 {

    /* renamed from: b */
    private boolean f44924b = true;

    C9099c7() {
    }

    public boolean add(Object obj) {
        mo37450c();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo37450c();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo37450c() {
        if (!this.f44924b) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo37450c();
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

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        mo37450c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo37450c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo37450c();
        return super.retainAll(collection);
    }

    public final void zzb() {
        this.f44924b = false;
    }

    public final boolean zzc() {
        return this.f44924b;
    }

    public boolean addAll(Collection collection) {
        mo37450c();
        return super.addAll(collection);
    }
}
