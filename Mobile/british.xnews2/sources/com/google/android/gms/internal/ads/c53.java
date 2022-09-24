package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class c53 extends u43 implements SortedMap {
    @CheckForNull

    /* renamed from: f */
    SortedSet f20173f;

    /* renamed from: g */
    final /* synthetic */ i53 f20174g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c53(i53 i53, SortedMap sortedMap) {
        super(i53, sortedMap);
        this.f20174g = i53;
    }

    @CheckForNull
    public final Comparator comparator() {
        return mo18178d().comparator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public SortedMap mo18178d() {
        return (SortedMap) this.f20914d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public SortedSet mo18179e() {
        return new d53(this.f20174g, mo18178d());
    }

    /* renamed from: f */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f20173f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet e = mo18179e();
        this.f20173f = e;
        return e;
    }

    public final Object firstKey() {
        return mo18178d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new c53(this.f20174g, mo18178d().headMap(obj));
    }

    public final Object lastKey() {
        return mo18178d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new c53(this.f20174g, mo18178d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new c53(this.f20174g, mo18178d().tailMap(obj));
    }
}
