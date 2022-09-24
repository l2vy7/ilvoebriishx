package com.google.common.collect;

import com.google.common.collect.C4757r;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.v */
/* compiled from: ImmutableMap */
public abstract class C4776v<K, V> implements Map<K, V>, Serializable {

    /* renamed from: e */
    static final Map.Entry<?, ?>[] f21539e = new Map.Entry[0];
    @LazyInit

    /* renamed from: b */
    private transient C4789y<Map.Entry<K, V>> f21540b;
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient C4789y<K> f21541c;
    @RetainedWith
    @LazyInit

    /* renamed from: d */
    private transient C4757r<V> f21542d;

    /* renamed from: com.google.common.collect.v$a */
    /* compiled from: ImmutableMap */
    public static class C4777a<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a */
        Comparator<? super V> f21543a;

        /* renamed from: b */
        Object[] f21544b;

        /* renamed from: c */
        int f21545c;

        /* renamed from: d */
        boolean f21546d;

        public C4777a() {
            this(4);
        }

        /* renamed from: b */
        private void m22060b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f21544b;
            if (i2 > objArr.length) {
                this.f21544b = Arrays.copyOf(objArr, C4757r.C4759b.m21956a(objArr.length, i2));
                this.f21546d = false;
            }
        }

        /* renamed from: a */
        public C4776v<K, V> mo19922a() {
            mo19926f();
            this.f21546d = true;
            return C4761s0.m21957r(this.f21545c, this.f21544b);
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C4777a<K, V> mo19923c(K k, V v) {
            m22060b(this.f21545c + 1);
            C10393j.m47929a(k, v);
            Object[] objArr = this.f21544b;
            int i = this.f21545c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f21545c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C4777a<K, V> mo19924d(Map.Entry<? extends K, ? extends V> entry) {
            return mo19923c(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C4777a<K, V> mo19925e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m22060b(this.f21545c + ((Collection) iterable).size());
            }
            for (Map.Entry d : iterable) {
                mo19924d(d);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo19926f() {
            int i;
            if (this.f21543a != null) {
                if (this.f21546d) {
                    this.f21544b = Arrays.copyOf(this.f21544b, this.f21545c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f21545c];
                int i2 = 0;
                while (true) {
                    i = this.f21545c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f21544b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, C4755p0.m21937a(this.f21543a).mo19835e(C4718i0.m21805k()));
                for (int i4 = 0; i4 < this.f21545c; i4++) {
                    int i5 = i4 * 2;
                    this.f21544b[i5] = entryArr[i4].getKey();
                    this.f21544b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        C4777a(int i) {
            this.f21544b = new Object[(i * 2)];
            this.f21545c = 0;
            this.f21546d = false;
        }
    }

    /* renamed from: com.google.common.collect.v$b */
    /* compiled from: ImmutableMap */
    static class C4778b implements Serializable {

        /* renamed from: b */
        private final Object[] f21547b;

        /* renamed from: c */
        private final Object[] f21548c;

        C4778b(C4776v<?, ?> vVar) {
            this.f21547b = new Object[vVar.size()];
            this.f21548c = new Object[vVar.size()];
            C10388e1<Map.Entry<?, ?>> r = vVar.entrySet().iterator();
            int i = 0;
            while (r.hasNext()) {
                Map.Entry next = r.next();
                this.f21547b[i] = next.getKey();
                this.f21548c[i] = next.getValue();
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo19927a(C4777a<Object, Object> aVar) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f21547b;
                if (i >= objArr.length) {
                    return aVar.mo19922a();
                }
                aVar.mo19923c(objArr[i], this.f21548c[i]);
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return mo19927a(new C4777a(this.f21547b.length));
        }
    }

    C4776v() {
    }

    /* renamed from: b */
    public static <K, V> C4777a<K, V> m22045b() {
        return new C4777a<>();
    }

    /* renamed from: c */
    static void m22046c(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!z) {
            throw m22047d(str, entry, entry2);
        }
    }

    /* renamed from: d */
    static IllegalArgumentException m22047d(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    /* renamed from: e */
    public static <K, V> C4776v<K, V> m22048e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C4777a aVar = new C4777a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.mo19925e(iterable);
        return aVar.mo19922a();
    }

    /* renamed from: f */
    public static <K, V> C4776v<K, V> m22049f(Map<? extends K, ? extends V> map) {
        if ((map instanceof C4776v) && !(map instanceof SortedMap)) {
            C4776v<K, V> vVar = (C4776v) map;
            if (!vVar.mo19856m()) {
                return vVar;
            }
        }
        return m22048e(map.entrySet());
    }

    /* renamed from: o */
    public static <K, V> C4776v<K, V> m22050o() {
        return C4761s0.f21510i;
    }

    /* renamed from: p */
    public static <K, V> C4776v<K, V> m22051p(K k, V v) {
        C10393j.m47929a(k, v);
        return C4761s0.m21957r(1, new Object[]{k, v});
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public boolean equals(@NullableDecl Object obj) {
        return C4718i0.m21796b(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract C4789y<Map.Entry<K, V>> mo19852g();

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract C4789y<K> mo19854h();

    public int hashCode() {
        return C4798z0.m22157b(entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract C4757r<V> mo19855i();

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public C4789y<Map.Entry<K, V>> entrySet() {
        C4789y<Map.Entry<K, V>> yVar = this.f21540b;
        if (yVar != null) {
            return yVar;
        }
        C4789y<Map.Entry<K, V>> g = mo19852g();
        this.f21540b = g;
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo19913l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo19856m();

    /* renamed from: n */
    public C4789y<K> keySet() {
        C4789y<K> yVar = this.f21541c;
        if (yVar != null) {
            return yVar;
        }
        C4789y<K> h = mo19854h();
        this.f21541c = h;
        return h;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public C4757r<V> values() {
        C4757r<V> rVar = this.f21542d;
        if (rVar != null) {
            return rVar;
        }
        C4757r<V> i = mo19855i();
        this.f21542d = i;
        return i;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C4718i0.m21804j(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C4778b(this);
    }
}
