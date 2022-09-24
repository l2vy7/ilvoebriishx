package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asf */
/* compiled from: IMASDK */
final class asf extends asi implements NavigableSet {

    /* renamed from: b */
    final /* synthetic */ asn f15647b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    asf(asn asn, NavigableMap navigableMap) {
        super(asn, navigableMap);
        this.f15647b = asn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final NavigableMap mo14312b() {
        return (NavigableMap) super.mo14312b();
    }

    public final Object ceiling(Object obj) {
        return mo14312b().ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new asf(this.f15647b, mo14312b().descendingMap());
    }

    public final Object floor(Object obj) {
        return mo14312b().floorKey(obj);
    }

    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return mo14312b().higherKey(obj);
    }

    public final Object lower(Object obj) {
        return mo14312b().lowerKey(obj);
    }

    public final Object pollFirst() {
        return aup.m14870a(iterator());
    }

    public final Object pollLast() {
        return aup.m14870a(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new asf(this.f15647b, mo14312b().headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new asf(this.f15647b, mo14312b().subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new asf(this.f15647b, mo14312b().tailMap(obj, z));
    }
}
