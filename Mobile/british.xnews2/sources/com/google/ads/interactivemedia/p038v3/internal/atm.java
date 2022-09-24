package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atm */
/* compiled from: IMASDK */
final class atm<K, V> extends atq<K, V, Map.Entry<V, K>> {
    atm(atr<K, V> atr) {
        super(atr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14448a(int i) {
        return new atj(this.f15717b, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d = this.f15717b.mo14479d(key);
            if (d == -1 || !arq.m14618b(this.f15717b.f15718a[d], value)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int d = aup.m14873d(key);
        int e = this.f15717b.mo14480e(key, d);
        if (e == -1 || !arq.m14618b(this.f15717b.f15718a[e], value)) {
            return false;
        }
        this.f15717b.mo14485h(e, d);
        return true;
    }
}
