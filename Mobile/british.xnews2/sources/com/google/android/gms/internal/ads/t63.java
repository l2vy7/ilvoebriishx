package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class t63<K, V> implements Map<K, V>, Serializable {
    @CheckForNull

    /* renamed from: b */
    private transient a73<Map.Entry<K, V>> f20839b;
    @CheckForNull

    /* renamed from: c */
    private transient a73<K> f20840c;
    @CheckForNull

    /* renamed from: d */
    private transient k63<V> f20841d;

    t63() {
    }

    /* renamed from: d */
    public static <K, V> t63<K, V> m21027d(Map<? extends K, ? extends V> map) {
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        s63 s63 = new s63(entrySet instanceof Collection ? entrySet.size() : 4);
        s63.mo34665b(entrySet);
        return s63.mo34666c();
    }

    /* renamed from: e */
    public static <K, V> t63<K, V> m21028e() {
        return j83.f20461h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract k63<V> mo18450b();

    /* renamed from: c */
    public final k63<V> values() {
        k63<V> k63 = this.f20841d;
        if (k63 != null) {
            return k63;
        }
        k63<V> b = mo18450b();
        this.f20841d = b;
        return b;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract a73<Map.Entry<K, V>> mo18451f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract a73<K> mo18452g();

    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public final a73<Map.Entry<K, V>> entrySet() {
        a73<Map.Entry<K, V>> a73 = this.f20839b;
        if (a73 != null) {
            return a73;
        }
        a73<Map.Entry<K, V>> f = mo18451f();
        this.f20839b = f;
        return f;
    }

    public final int hashCode() {
        return o83.m35587a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        a73<K> a73 = this.f20840c;
        if (a73 != null) {
            return a73;
        }
        a73<K> g = mo18452g();
        this.f20840c = g;
        return g;
    }

    @CheckForNull
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        n53.m35069a(size, "size");
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
}
