package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asi */
/* compiled from: IMASDK */
class asi extends asd implements SortedSet {

    /* renamed from: c */
    final /* synthetic */ asn f15650c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    asi(asn asn, SortedMap sortedMap) {
        super(asn, sortedMap);
        this.f15650c = asn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SortedMap mo14312b() {
        return (SortedMap) this.f15772d;
    }

    public final Comparator comparator() {
        return mo14312b().comparator();
    }

    public final Object first() {
        return mo14312b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new asi(this.f15650c, mo14312b().headMap(obj));
    }

    public final Object last() {
        return mo14312b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new asi(this.f15650c, mo14312b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new asi(this.f15650c, mo14312b().tailMap(obj));
    }
}
