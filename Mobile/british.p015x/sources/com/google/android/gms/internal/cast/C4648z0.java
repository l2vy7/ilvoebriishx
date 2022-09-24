package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.cast.z0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C4648z0<K, V> implements Map<K, V>, Serializable {

    /* renamed from: b */
    private transient C4633a1<Map.Entry<K, V>> f21214b;

    /* renamed from: c */
    private transient C4633a1<K> f21215c;

    /* renamed from: d */
    private transient C4645u0<V> f21216d;

    C4648z0() {
    }

    /* renamed from: b */
    public static <K, V> C4648z0<K, V> m21393b() {
        return C4635g1.f21182f;
    }

    /* renamed from: c */
    public final C4633a1<Map.Entry<K, V>> entrySet() {
        C4633a1<Map.Entry<K, V>> a1Var = this.f21214b;
        if (a1Var != null) {
            return a1Var;
        }
        C4633a1<Map.Entry<K, V>> d = mo19107d();
        this.f21214b = d;
        return d;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        return false;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract C4633a1<Map.Entry<K, V>> mo19107d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C4633a1<K> mo19108e();

    public final boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* renamed from: f */
    public final C4645u0<V> values() {
        C4645u0<V> u0Var = this.f21216d;
        if (u0Var != null) {
            return u0Var;
        }
        C4645u0<V> g = mo19109g();
        this.f21216d = g;
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract C4645u0<V> mo19109g();

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        return v;
    }

    public final int hashCode() {
        return C8548h1.m40981a(entrySet());
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        C4633a1<K> a1Var = this.f21215c;
        if (a1Var != null) {
            return a1Var;
        }
        C4633a1<K> e = mo19108e();
        this.f21215c = e;
        return e;
    }

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
        if (size >= 0) {
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
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("size cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }
}
