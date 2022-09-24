package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class qu3<K, V, V2> implements uu3<Map<K, V2>> {

    /* renamed from: a */
    private final Map<K, iv3<V>> f38285a;

    qu3(Map<K, iv3<V>> map) {
        this.f38285a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<K, iv3<V>> mo34418a() {
        return this.f38285a;
    }
}
