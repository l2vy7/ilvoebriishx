package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class f53 extends AbstractCollection {

    /* renamed from: b */
    final Object f20324b;

    /* renamed from: c */
    Collection f20325c;
    @CheckForNull

    /* renamed from: d */
    final f53 f20326d;
    @CheckForNull

    /* renamed from: e */
    final Collection f20327e;

    /* renamed from: f */
    final /* synthetic */ i53 f20328f;

    f53(i53 i53, Object obj, @CheckForNull Collection collection, f53 f53) {
        this.f20328f = i53;
        this.f20324b = obj;
        this.f20325c = collection;
        this.f20326d = f53;
        this.f20327e = f53 == null ? null : f53.f20325c;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f20325c.isEmpty();
        boolean add = this.f20325c.add(obj);
        if (add) {
            i53 i53 = this.f20328f;
            i53.f20387f = i53.f20387f + 1;
            if (isEmpty) {
                mo18295c();
                return true;
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f20325c.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f20325c.size();
        i53 i53 = this.f20328f;
        i53.f20387f = i53.f20387f + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo18295c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo18295c() {
        f53 f53 = this.f20326d;
        if (f53 != null) {
            f53.mo18295c();
        } else {
            this.f20328f.f20386e.put(this.f20324b, this.f20325c);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f20325c.clear();
            i53 i53 = this.f20328f;
            i53.f20387f = i53.f20387f - size;
            mo18299e();
        }
    }

    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.f20325c.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        zzb();
        return this.f20325c.containsAll(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo18299e() {
        f53 f53 = this.f20326d;
        if (f53 != null) {
            f53.mo18299e();
        } else if (this.f20325c.isEmpty()) {
            this.f20328f.f20386e.remove(this.f20324b);
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f20325c.equals(obj);
    }

    public final int hashCode() {
        zzb();
        return this.f20325c.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new e53(this);
    }

    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean remove = this.f20325c.remove(obj);
        if (remove) {
            i53 i53 = this.f20328f;
            i53.f20387f = i53.f20387f - 1;
            mo18299e();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f20325c.removeAll(collection);
        if (removeAll) {
            int size2 = this.f20325c.size();
            i53 i53 = this.f20328f;
            i53.f20387f = i53.f20387f + (size2 - size);
            mo18299e();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f20325c.retainAll(collection);
        if (retainAll) {
            int size2 = this.f20325c.size();
            i53 i53 = this.f20328f;
            i53.f20387f = i53.f20387f + (size2 - size);
            mo18299e();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.f20325c.size();
    }

    public final String toString() {
        zzb();
        return this.f20325c.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        f53 f53 = this.f20326d;
        if (f53 != null) {
            f53.zzb();
            if (this.f20326d.f20325c != this.f20327e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f20325c.isEmpty() && (collection = (Collection) this.f20328f.f20386e.get(this.f20324b)) != null) {
            this.f20325c = collection;
        }
    }
}
