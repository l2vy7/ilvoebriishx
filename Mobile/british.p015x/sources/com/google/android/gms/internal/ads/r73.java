package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class r73 extends v73 {

    /* renamed from: a */
    final /* synthetic */ Comparator f38563a;

    r73(Comparator comparator) {
        this.f38563a = comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <K, V> Map<K, Collection<V>> mo34259a() {
        return new TreeMap(this.f38563a);
    }
}
