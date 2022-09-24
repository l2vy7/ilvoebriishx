package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asm */
/* compiled from: IMASDK */
class asm extends ask implements List {

    /* renamed from: f */
    final /* synthetic */ asn f15660f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    asm(asn asn, Object obj, List list, ask ask) {
        super(asn, obj, list, ask);
        this.f15660f = asn;
    }

    public final void add(int i, Object obj) {
        mo14337a();
        boolean isEmpty = this.f15655b.isEmpty();
        mo14361d().add(i, obj);
        asn.m14676q(this.f15660f);
        if (isEmpty) {
            mo14341c();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = mo14361d().addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        asn.m14678s(this.f15660f, this.f15655b.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo14341c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo14361d() {
        return (List) this.f15655b;
    }

    public final Object get(int i) {
        mo14337a();
        return mo14361d().get(i);
    }

    public final int indexOf(Object obj) {
        mo14337a();
        return mo14361d().indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        mo14337a();
        return mo14361d().lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        mo14337a();
        return new asl(this);
    }

    public final Object remove(int i) {
        mo14337a();
        Object remove = mo14361d().remove(i);
        asn.m14677r(this.f15660f);
        mo14340b();
        return remove;
    }

    public final Object set(int i, Object obj) {
        mo14337a();
        return mo14361d().set(i, obj);
    }

    public final List subList(int i, int i2) {
        mo14337a();
        asn asn = this.f15660f;
        Object obj = this.f15654a;
        List subList = mo14361d().subList(i, i2);
        ask ask = this.f15656c;
        if (ask == null) {
            ask = this;
        }
        return asn.mo14374h(obj, subList, ask);
    }

    public final ListIterator listIterator(int i) {
        mo14337a();
        return new asl(this, i);
    }
}
