package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z43 extends c53 implements NavigableMap {

    /* renamed from: h */
    final /* synthetic */ i53 f21036h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z43(i53 i53, NavigableMap navigableMap) {
        super(i53, navigableMap);
        this.f21036h = i53;
    }

    @CheckForNull
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f20914d)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return mo18870c(ceilingEntry);
    }

    @CheckForNull
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f20914d)).ceilingKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ SortedMap mo18178d() {
        return (NavigableMap) ((SortedMap) this.f20914d);
    }

    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final NavigableMap descendingMap() {
        return new z43(this.f21036h, ((NavigableMap) ((SortedMap) this.f20914d)).descendingMap());
    }

    /* renamed from: f */
    public final /* synthetic */ SortedSet mo18180f() {
        return (NavigableSet) super.keySet();
    }

    @CheckForNull
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f20914d)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return mo18870c(firstEntry);
    }

    @CheckForNull
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f20914d)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return mo18870c(floorEntry);
    }

    @CheckForNull
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f20914d)).floorKey(obj);
    }

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: g */
    public final Map.Entry mo19037g(Iterator<Map.Entry> it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry next = it.next();
        Collection h = this.f21036h.mo18412h();
        h.addAll((Collection) next.getValue());
        it.remove();
        return new l63(next.getKey(), this.f21036h.mo18413i(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final NavigableSet mo18179e() {
        return new a53(this.f21036h, (NavigableMap) ((SortedMap) this.f20914d));
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @CheckForNull
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f20914d)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return mo18870c(higherEntry);
    }

    @CheckForNull
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f20914d)).higherKey(obj);
    }

    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @CheckForNull
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f20914d)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return mo18870c(lastEntry);
    }

    @CheckForNull
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f20914d)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return mo18870c(lowerEntry);
    }

    @CheckForNull
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f20914d)).lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @CheckForNull
    public final Map.Entry pollFirstEntry() {
        return mo19037g(entrySet().iterator());
    }

    @CheckForNull
    public final Map.Entry pollLastEntry() {
        return mo19037g(descendingMap().entrySet().iterator());
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new z43(this.f21036h, ((NavigableMap) ((SortedMap) this.f20914d)).headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new z43(this.f21036h, ((NavigableMap) ((SortedMap) this.f20914d)).subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new z43(this.f21036h, ((NavigableMap) ((SortedMap) this.f20914d)).tailMap(obj, z));
    }
}
