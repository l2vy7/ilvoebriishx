package com.google.ads.interactivemedia.p039v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atu */
/* compiled from: IMASDK */
final class atu<K, V> extends aso<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final K f15738a;

    /* renamed from: b */
    final V f15739b;

    atu(K k, V v) {
        this.f15738a = k;
        this.f15739b = v;
    }

    public final K getKey() {
        return this.f15738a;
    }

    public final V getValue() {
        return this.f15739b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
