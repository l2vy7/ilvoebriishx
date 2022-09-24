package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ash */
/* compiled from: IMASDK */
class ash extends asa implements SortedMap {

    /* renamed from: d */
    SortedSet f15648d;

    /* renamed from: e */
    final /* synthetic */ asn f15649e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ash(asn asn, SortedMap sortedMap) {
        super(asn, sortedMap);
        this.f15649e = asn;
    }

    public final Comparator comparator() {
        return mo14299i().comparator();
    }

    public final Object firstKey() {
        return mo14299i().firstKey();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public SortedSet mo14300j() {
        return new asi(this.f15649e, mo14299i());
    }

    /* renamed from: h */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f15648d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet g = mo14300j();
        this.f15648d = g;
        return g;
    }

    public SortedMap headMap(Object obj) {
        return new ash(this.f15649e, mo14299i().headMap(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public SortedMap mo14299i() {
        return (SortedMap) this.f15636a;
    }

    public final Object lastKey() {
        return mo14299i().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new ash(this.f15649e, mo14299i().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new ash(this.f15649e, mo14299i().tailMap(obj));
    }
}
