package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgh */
/* compiled from: IMASDK */
final class bgh<K, V> implements Map.Entry<K, V> {

    /* renamed from: a */
    bgh<K, V> f16279a;

    /* renamed from: b */
    bgh<K, V> f16280b;

    /* renamed from: c */
    bgh<K, V> f16281c;

    /* renamed from: d */
    bgh<K, V> f16282d;

    /* renamed from: e */
    bgh<K, V> f16283e;

    /* renamed from: f */
    final K f16284f;

    /* renamed from: g */
    V f16285g;

    /* renamed from: h */
    int f16286h;

    bgh() {
        this.f16284f = null;
        this.f16283e = this;
        this.f16282d = this;
    }

    bgh(bgh<K, V> bgh, K k, bgh<K, V> bgh2, bgh<K, V> bgh3) {
        this.f16279a = bgh;
        this.f16284f = k;
        this.f16286h = 1;
        this.f16282d = bgh2;
        this.f16283e = bgh3;
        bgh3.f16282d = this;
        bgh2.f16283e = this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f16284f;
            if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                V v = this.f16285g;
                if (v == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (!v.equals(entry.getValue())) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final K getKey() {
        return this.f16284f;
    }

    public final V getValue() {
        return this.f16285g;
    }

    public final int hashCode() {
        K k = this.f16284f;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f16285g;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        V v2 = this.f16285g;
        this.f16285g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16284f);
        String valueOf2 = String.valueOf(this.f16285g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
