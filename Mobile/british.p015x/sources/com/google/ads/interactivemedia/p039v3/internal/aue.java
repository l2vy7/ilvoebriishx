package com.google.ads.interactivemedia.p039v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aue */
/* compiled from: IMASDK */
public abstract class aue<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a */
    private transient aul<Map.Entry<K, V>> f15752a;

    /* renamed from: b */
    private transient aul<K> f15753b;

    /* renamed from: c */
    private transient att<V> f15754c;

    aue() {
    }

    /* renamed from: a */
    public static <K, V> aue<K, V> m14836a() {
        return avl.f15799a;
    }

    /* renamed from: b */
    public static <K, V> auc<K, V> m14837b() {
        return new auc<>();
    }

    /* renamed from: c */
    public static <K, V> aue<K, V> m14838c(Map<? extends K, ? extends V> map) {
        if (!(map instanceof aue) || (map instanceof SortedMap)) {
            Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
            auc auc = new auc(entrySet instanceof Collection ? entrySet.size() : 4);
            auc.mo14541c(entrySet);
            return auc.mo14539a();
        }
        aue<K, V> aue = (aue) map;
        aue.mo14558j();
        return aue;
    }

    /* renamed from: k */
    public static <K, V> aue<K, V> m14839k(V v) {
        aup.m14882m("adBreakTime", v);
        return avl.m14941l(1, new Object[]{"adBreakTime", v});
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public final aul<Map.Entry<K, V>> entrySet() {
        aul<Map.Entry<K, V>> aul = this.f15752a;
        if (aul != null) {
            return aul;
        }
        aul<Map.Entry<K, V>> e = mo14547e();
        this.f15752a = e;
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract aul<Map.Entry<K, V>> mo14547e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* renamed from: f */
    public final aul<K> keySet() {
        aul<K> aul = this.f15753b;
        if (aul != null) {
            return aul;
        }
        aul<K> g = mo14551g();
        this.f15753b = g;
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract aul<K> mo14551g();

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public final att<V> values() {
        att<V> att = this.f15754c;
        if (att != null) {
            return att;
        }
        att<V> i = mo14556i();
        this.f15754c = i;
        return i;
    }

    public final int hashCode() {
        return avr.m14961c(entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract att<V> mo14556i();

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo14558j();

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        aup.m14884o(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new aud(this);
    }
}
