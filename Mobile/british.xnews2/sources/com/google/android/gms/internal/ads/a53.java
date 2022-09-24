package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a53 extends d53 implements NavigableSet {

    /* renamed from: e */
    final /* synthetic */ i53 f20108e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a53(i53 i53, NavigableMap navigableMap) {
        super(i53, navigableMap);
        this.f20108e = i53;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ SortedMap mo18078c() {
        return (NavigableMap) ((SortedMap) this.f20527b);
    }

    @CheckForNull
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f20527b)).ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new a53(this.f20108e, ((NavigableMap) ((SortedMap) this.f20527b)).descendingMap());
    }

    @CheckForNull
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f20527b)).floorKey(obj);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @CheckForNull
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f20527b)).higherKey(obj);
    }

    @CheckForNull
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f20527b)).lowerKey(obj);
    }

    @CheckForNull
    public final Object pollFirst() {
        return e73.m20399a(iterator());
    }

    @CheckForNull
    public final Object pollLast() {
        return e73.m20399a(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new a53(this.f20108e, ((NavigableMap) ((SortedMap) this.f20527b)).headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new a53(this.f20108e, ((NavigableMap) ((SortedMap) this.f20527b)).subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new a53(this.f20108e, ((NavigableMap) ((SortedMap) this.f20527b)).tailMap(obj, z));
    }
}
