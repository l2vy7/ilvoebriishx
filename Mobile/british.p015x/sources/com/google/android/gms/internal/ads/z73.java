package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z73<K, V> extends q43<K, V> {

    /* renamed from: g */
    final transient n43<? extends List<V>> f42336g;

    z73(Map<K, Collection<V>> map, n43<? extends List<V>> n43) {
        super(map);
        this.f42336g = n43;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<K, Collection<V>> mo18504d() {
        return mo18416n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<K> mo18505e() {
        return mo18417o();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Collection mo18412h() {
        return this.f42336g.zza();
    }
}
