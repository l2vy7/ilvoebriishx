package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auy */
/* compiled from: IMASDK */
final class auy extends ava {

    /* renamed from: a */
    final /* synthetic */ Comparator f15777a;

    auy(Comparator comparator) {
        this.f15777a = comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <K, V> Map<K, Collection<V>> mo14598a() {
        return new TreeMap(this.f15777a);
    }
}
