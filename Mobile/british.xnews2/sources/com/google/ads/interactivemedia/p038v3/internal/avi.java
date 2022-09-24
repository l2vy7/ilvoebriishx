package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avi */
/* compiled from: IMASDK */
final class avi<K, V> extends aul<Map.Entry<K, V>> {

    /* renamed from: a */
    private final transient aue<K, V> f15791a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final transient Object[] f15792b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final transient int f15793c;

    avi(aue<K, V> aue, Object[] objArr, int i) {
        this.f15791a = aue;
        this.f15792b = objArr;
        this.f15793c = i;
    }

    /* renamed from: a */
    public final avu<Map.Entry<K, V>> iterator() {
        return mo14503e().listIterator();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f15791a.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14504f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo14505g(Object[] objArr, int i) {
        return mo14503e().mo14505g(objArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final atz<Map.Entry<K, V>> mo14573m() {
        return new avh(this);
    }

    public final int size() {
        return this.f15793c;
    }
}
