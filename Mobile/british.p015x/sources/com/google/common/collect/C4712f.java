package com.google.common.collect;

import com.google.common.collect.C4738l0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.f */
/* compiled from: AbstractMultimap */
abstract class C4712f<K, V> implements C4727j0<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: b */
    private transient Collection<Map.Entry<K, V>> f21426b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    private transient Set<K> f21427c;
    @MonotonicNonNullDecl

    /* renamed from: d */
    private transient Collection<V> f21428d;
    @MonotonicNonNullDecl

    /* renamed from: e */
    private transient Map<K, Collection<V>> f21429e;

    /* renamed from: com.google.common.collect.f$b */
    /* compiled from: AbstractMultimap */
    class C4713b extends AbstractCollection<V> {
        C4713b() {
        }

        public void clear() {
            C4712f.this.clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            return C4712f.this.mo19674d(obj);
        }

        public Iterator<V> iterator() {
            return C4712f.this.mo19521k();
        }

        public int size() {
            return C4712f.this.size();
        }
    }

    /* renamed from: com.google.common.collect.f$a */
    /* compiled from: AbstractMultimap */
    class C4714a extends C4738l0.C4739b<K, V> {
        C4714a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4727j0<K, V> mo19685c() {
            return C4712f.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C4712f.this.mo19520i();
        }
    }

    C4712f() {
    }

    /* renamed from: a */
    public Collection<Map.Entry<K, V>> mo19516a() {
        Collection<Map.Entry<K, V>> collection = this.f21426b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> f = mo19518f();
        this.f21426b = f;
        return f;
    }

    /* renamed from: b */
    public Map<K, Collection<V>> mo19511b() {
        Map<K, Collection<V>> map = this.f21429e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e = mo19675e();
        this.f21429e = e;
        return e;
    }

    /* renamed from: c */
    public boolean mo19673c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) mo19511b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: d */
    public boolean mo19674d(@NullableDecl Object obj) {
        for (Collection contains : mo19511b().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Map<K, Collection<V>> mo19675e();

    public boolean equals(@NullableDecl Object obj) {
        return C4738l0.m21858a(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract Collection<Map.Entry<K, V>> mo19518f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Set<K> mo19676g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection<V> mo19519h();

    public int hashCode() {
        return mo19511b().hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Iterator<Map.Entry<K, V>> mo19520i();

    /* renamed from: j */
    public Set<K> mo19678j() {
        Set<K> set = this.f21427c;
        if (set != null) {
            return set;
        }
        Set<K> g = mo19676g();
        this.f21427c = g;
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract Iterator<V> mo19521k();

    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) mo19511b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo19511b().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f21428d;
        if (collection != null) {
            return collection;
        }
        Collection<V> h = mo19519h();
        this.f21428d = h;
        return h;
    }
}
