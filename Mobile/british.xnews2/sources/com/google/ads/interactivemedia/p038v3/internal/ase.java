package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ase */
/* compiled from: IMASDK */
final class ase extends ash implements NavigableMap {

    /* renamed from: c */
    final /* synthetic */ asn f15646c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ase(asn asn, NavigableMap navigableMap) {
        super(asn, navigableMap);
        this.f15646c = asn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final NavigableMap mo14299i() {
        return (NavigableMap) super.mo14299i();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = mo14299i().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return mo14260b(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return mo14299i().ceilingKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map.Entry mo14285d(Iterator<Map.Entry> it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry next = it.next();
        Collection c = this.f15646c.mo14250c();
        c.addAll((Collection) next.getValue());
        it.remove();
        return avr.m14969k(next.getKey(), this.f15646c.mo14248a(c));
    }

    public final NavigableSet descendingKeySet() {
        return ((ase) descendingMap()).keySet();
    }

    public final NavigableMap descendingMap() {
        return new ase(this.f15646c, mo14299i().descendingMap());
    }

    /* renamed from: e */
    public final NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final NavigableSet mo14300j() {
        return new asf(this.f15646c, mo14299i());
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = mo14299i().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return mo14260b(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = mo14299i().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return mo14260b(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return mo14299i().floorKey(obj);
    }

    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = mo14299i().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return mo14260b(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return mo14299i().higherKey(obj);
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = mo14299i().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return mo14260b(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = mo14299i().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return mo14260b(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return mo14299i().lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return mo14285d(entrySet().iterator());
    }

    public final Map.Entry pollLastEntry() {
        return mo14285d(descendingMap().entrySet().iterator());
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new ase(this.f15646c, mo14299i().headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new ase(this.f15646c, mo14299i().subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new ase(this.f15646c, mo14299i().tailMap(obj, z));
    }
}
