package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class d53 extends y43 implements SortedSet {

    /* renamed from: d */
    final /* synthetic */ i53 f20215d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d53(i53 i53, SortedMap sortedMap) {
        super(i53, sortedMap);
        this.f20215d = i53;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SortedMap mo18078c() {
        return (SortedMap) this.f20527b;
    }

    @CheckForNull
    public final Comparator comparator() {
        return mo18078c().comparator();
    }

    public final Object first() {
        return mo18078c().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new d53(this.f20215d, mo18078c().headMap(obj));
    }

    public final Object last() {
        return mo18078c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new d53(this.f20215d, mo18078c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new d53(this.f20215d, mo18078c().tailMap(obj));
    }
}
