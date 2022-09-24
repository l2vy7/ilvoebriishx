package com.google.ads.interactivemedia.p039v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ask */
/* compiled from: IMASDK */
class ask extends AbstractCollection {

    /* renamed from: a */
    final Object f15654a;

    /* renamed from: b */
    Collection f15655b;

    /* renamed from: c */
    final ask f15656c;

    /* renamed from: d */
    final Collection f15657d;

    /* renamed from: e */
    final /* synthetic */ asn f15658e;

    ask(asn asn, Object obj, Collection collection, ask ask) {
        this.f15658e = asn;
        this.f15654a = obj;
        this.f15655b = collection;
        this.f15656c = ask;
        this.f15657d = ask == null ? null : ask.f15655b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14337a() {
        Collection collection;
        ask ask = this.f15656c;
        if (ask != null) {
            ask.mo14337a();
            if (this.f15656c.f15655b != this.f15657d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f15655b.isEmpty() && (collection = (Collection) this.f15658e.f15661a.get(this.f15654a)) != null) {
            this.f15655b = collection;
        }
    }

    public final boolean add(Object obj) {
        mo14337a();
        boolean isEmpty = this.f15655b.isEmpty();
        boolean add = this.f15655b.add(obj);
        if (!add) {
            return add;
        }
        asn.m14676q(this.f15658e);
        if (!isEmpty) {
            return add;
        }
        mo14341c();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f15655b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        asn.m14678s(this.f15658e, this.f15655b.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo14341c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14340b() {
        ask ask = this.f15656c;
        if (ask != null) {
            ask.mo14340b();
        } else if (this.f15655b.isEmpty()) {
            this.f15658e.f15661a.remove(this.f15654a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14341c() {
        ask ask = this.f15656c;
        if (ask != null) {
            ask.mo14341c();
        } else {
            this.f15658e.f15661a.put(this.f15654a, this.f15655b);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f15655b.clear();
            asn.m14679t(this.f15658e, size);
            mo14340b();
        }
    }

    public final boolean contains(Object obj) {
        mo14337a();
        return this.f15655b.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        mo14337a();
        return this.f15655b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        mo14337a();
        return this.f15655b.equals(obj);
    }

    public final int hashCode() {
        mo14337a();
        return this.f15655b.hashCode();
    }

    public final Iterator iterator() {
        mo14337a();
        return new asj(this);
    }

    public final boolean remove(Object obj) {
        mo14337a();
        boolean remove = this.f15655b.remove(obj);
        if (remove) {
            asn.m14677r(this.f15658e);
            mo14340b();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f15655b.removeAll(collection);
        if (removeAll) {
            asn.m14678s(this.f15658e, this.f15655b.size() - size);
            mo14340b();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        ars.m14627g(collection);
        int size = size();
        boolean retainAll = this.f15655b.retainAll(collection);
        if (retainAll) {
            asn.m14678s(this.f15658e, this.f15655b.size() - size);
            mo14340b();
        }
        return retainAll;
    }

    public final int size() {
        mo14337a();
        return this.f15655b.size();
    }

    public final String toString() {
        mo14337a();
        return this.f15655b.toString();
    }
}
