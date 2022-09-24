package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class l73<K, V> extends n83<K> {

    /* renamed from: b */
    final Map<K, V> f20527b;

    l73(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f20527b = map;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f20527b.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f20527b.isEmpty();
    }

    public Iterator<K> iterator() {
        throw null;
    }

    public final int size() {
        return this.f20527b.size();
    }
}
