package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class h53 extends f53 implements List {

    /* renamed from: g */
    final /* synthetic */ i53 f20374g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h53(i53 i53, Object obj, @CheckForNull List list, f53 f53) {
        super(i53, obj, list, f53);
        this.f20374g = i53;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f20325c.isEmpty();
        ((List) this.f20325c).add(i, obj);
        i53 i53 = this.f20374g;
        i53.f20387f = i53.f20387f + 1;
        if (isEmpty) {
            mo18295c();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f20325c).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f20325c.size();
        i53 i53 = this.f20374g;
        i53.f20387f = i53.f20387f + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo18295c();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.f20325c).get(i);
    }

    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.f20325c).indexOf(obj);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.f20325c).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new g53(this);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f20325c).remove(i);
        i53 i53 = this.f20374g;
        i53.f20387f = i53.f20387f - 1;
        mo18299e();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f20325c).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        i53 i53 = this.f20374g;
        Object obj = this.f20324b;
        List subList = ((List) this.f20325c).subList(i, i2);
        f53 f53 = this.f20326d;
        if (f53 == null) {
            f53 = this;
        }
        return i53.mo18415l(obj, subList, f53);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new g53(this, i);
    }
}
