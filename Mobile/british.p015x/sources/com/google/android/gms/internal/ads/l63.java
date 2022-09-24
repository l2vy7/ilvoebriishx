package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l63<K, V> extends j53<K, V> implements Serializable {

    /* renamed from: b */
    final K f34921b;

    /* renamed from: c */
    final V f34922c;

    l63(K k, V v) {
        this.f34921b = k;
        this.f34922c = v;
    }

    public final K getKey() {
        return this.f34921b;
    }

    public final V getValue() {
        return this.f34922c;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
