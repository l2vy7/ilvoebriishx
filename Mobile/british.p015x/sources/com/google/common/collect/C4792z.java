package com.google.common.collect;

import com.google.common.collect.C4757r;
import com.google.common.collect.C4776v;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.z */
/* compiled from: ImmutableSortedMap */
public final class C4792z<K, V> extends C10383a0<K, V> implements NavigableMap<K, V> {

    /* renamed from: i */
    private static final Comparator<Comparable> f21571i = C4755p0.m21938c();

    /* renamed from: j */
    private static final C4792z<Comparable, Object> f21572j = new C4792z<>(C4684b0.m21668L(C4755p0.m21938c()), C4766t.m21978E());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient C4775u0<K> f21573f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final transient C4766t<V> f21574g;

    /* renamed from: h */
    private transient C4792z<K, V> f21575h;

    /* renamed from: com.google.common.collect.z$a */
    /* compiled from: ImmutableSortedMap */
    static class C4793a implements Comparator<Map.Entry<K, V>> {

        /* renamed from: b */
        final /* synthetic */ Comparator f21576b;

        C4793a(Comparator comparator) {
            this.f21576b = comparator;
        }

        /* renamed from: a */
        public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
            return this.f21576b.compare(entry.getKey(), entry2.getKey());
        }
    }

    /* renamed from: com.google.common.collect.z$b */
    /* compiled from: ImmutableSortedMap */
    class C4794b extends C4779w<K, V> {

        /* renamed from: com.google.common.collect.z$b$a */
        /* compiled from: ImmutableSortedMap */
        class C4795a extends C4766t<Map.Entry<K, V>> {
            C4795a() {
            }

            /* renamed from: N */
            public Map.Entry<K, V> get(int i) {
                return new AbstractMap.SimpleImmutableEntry(C4792z.this.f21573f.mo19839c().get(i), C4792z.this.f21574g.get(i));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: q */
            public boolean mo19462q() {
                return true;
            }

            public int size() {
                return C4792z.this.size();
            }
        }

        C4794b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public C4776v<K, V> mo19929H() {
            return C4792z.this;
        }

        /* renamed from: r */
        public C10388e1<Map.Entry<K, V>> iterator() {
            return mo19839c().iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public C4766t<Map.Entry<K, V>> mo19466y() {
            return new C4795a();
        }
    }

    /* renamed from: com.google.common.collect.z$c */
    /* compiled from: ImmutableSortedMap */
    public static class C4796c<K, V> extends C4776v.C4777a<K, V> {

        /* renamed from: e */
        private transient Object[] f21579e;

        /* renamed from: f */
        private transient Object[] f21580f;

        /* renamed from: g */
        private final Comparator<? super K> f21581g;

        public C4796c(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        /* renamed from: b */
        private void m22147b(int i) {
            Object[] objArr = this.f21579e;
            if (i > objArr.length) {
                int a = C4757r.C4759b.m21956a(objArr.length, i);
                this.f21579e = Arrays.copyOf(this.f21579e, a);
                this.f21580f = Arrays.copyOf(this.f21580f, a);
            }
        }

        /* renamed from: g */
        public C4792z<K, V> mo19922a() {
            int i = this.f21545c;
            if (i == 0) {
                return C4792z.m22122y(this.f21581g);
            }
            if (i == 1) {
                return C4792z.m22116H(this.f21581g, this.f21579e[0], this.f21580f[0]);
            }
            Object[] copyOf = Arrays.copyOf(this.f21579e, i);
            Arrays.sort(copyOf, this.f21581g);
            Object[] objArr = new Object[this.f21545c];
            for (int i2 = 0; i2 < this.f21545c; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.f21581g.compare(copyOf[i3], copyOf[i2]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + copyOf[i3] + " and " + copyOf[i2]);
                    }
                }
                objArr[Arrays.binarySearch(copyOf, this.f21579e[i2], this.f21581g)] = this.f21580f[i2];
            }
            return new C4792z<>(new C4775u0(C4766t.m21984t(copyOf), this.f21581g), C4766t.m21984t(objArr));
        }

        @CanIgnoreReturnValue
        /* renamed from: h */
        public C4796c<K, V> mo19923c(K k, V v) {
            m22147b(this.f21545c + 1);
            C10393j.m47929a(k, v);
            Object[] objArr = this.f21579e;
            int i = this.f21545c;
            objArr[i] = k;
            this.f21580f[i] = v;
            this.f21545c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public C4796c<K, V> mo19924d(Map.Entry<? extends K, ? extends V> entry) {
            super.mo19924d(entry);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: j */
        public C4796c<K, V> mo19925e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo19925e(iterable);
            return this;
        }

        private C4796c(Comparator<? super K> comparator, int i) {
            this.f21581g = (Comparator) C6073k.m26688k(comparator);
            this.f21579e = new Object[i];
            this.f21580f = new Object[i];
        }
    }

    /* renamed from: com.google.common.collect.z$d */
    /* compiled from: ImmutableSortedMap */
    private static class C4797d extends C4776v.C4778b {

        /* renamed from: d */
        private final Comparator<Object> f21582d;

        C4797d(C4792z<?, ?> zVar) {
            super(zVar);
            this.f21582d = zVar.comparator();
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return mo19927a(new C4796c(this.f21582d));
        }
    }

    C4792z(C4775u0<K> u0Var, C4766t<V> tVar) {
        this(u0Var, tVar, (C4792z) null);
    }

    /* renamed from: A */
    private static <K, V> C4792z<K, V> m22113A(Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i) {
        if (i == 0) {
            return m22122y(comparator);
        }
        if (i == 1) {
            return m22116H(comparator, entryArr[0].getKey(), entryArr[0].getValue());
        }
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                K key = entryArr[i2].getKey();
                V value = entryArr[i2].getValue();
                C10393j.m47929a(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i, new C4793a(comparator));
            K key2 = entryArr[0].getKey();
            objArr[0] = key2;
            objArr2[0] = entryArr[0].getValue();
            C10393j.m47929a(objArr[0], objArr2[0]);
            int i3 = 1;
            while (i3 < i) {
                K key3 = entryArr[i3].getKey();
                V value2 = entryArr[i3].getValue();
                C10393j.m47929a(key3, value2);
                objArr[i3] = key3;
                objArr2[i3] = value2;
                C4776v.m22046c(comparator.compare(key2, key3) != 0, "key", entryArr[i3 - 1], entryArr[i3]);
                i3++;
                key2 = key3;
            }
        }
        return new C4792z<>(new C4775u0(C4766t.m21984t(objArr), comparator), C4766t.m21984t(objArr2));
    }

    /* renamed from: B */
    private C4792z<K, V> m22114B(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return m22122y(comparator());
        }
        return new C4792z<>(this.f21573f.mo19895a0(i, i2), this.f21574g.subList(i, i2));
    }

    /* renamed from: G */
    public static <K, V> C4792z<K, V> m22115G() {
        return f21572j;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static <K, V> C4792z<K, V> m22116H(Comparator<? super K> comparator, K k, V v) {
        return new C4792z<>(new C4775u0(C4766t.m21979F(k), (Comparator) C6073k.m26688k(comparator)), C4766t.m21979F(v));
    }

    /* renamed from: u */
    public static <K, V> C4792z<K, V> m22120u(Map<? extends K, ? extends V> map) {
        return m22121v(map, (C4755p0) f21571i);
    }

    /* renamed from: v */
    private static <K, V> C4792z<K, V> m22121v(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean z = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                z = comparator.equals(comparator2);
            } else if (comparator == f21571i) {
                z = true;
            }
        }
        if (z && (map instanceof C4792z)) {
            C4792z<K, V> zVar = (C4792z) map;
            if (!zVar.mo19856m()) {
                return zVar;
            }
        }
        return m22123z(comparator, z, map.entrySet());
    }

    /* renamed from: y */
    static <K, V> C4792z<K, V> m22122y(Comparator<? super K> comparator) {
        if (C4755p0.m21938c().equals(comparator)) {
            return m22115G();
        }
        return new C4792z<>(C4684b0.m21668L(comparator), C4766t.m21978E());
    }

    /* renamed from: z */
    private static <K, V> C4792z<K, V> m22123z(Comparator<? super K> comparator, boolean z, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) C4706d0.m21759f(iterable, C4776v.f21539e);
        return m22113A(comparator, z, entryArr, entryArr.length);
    }

    /* renamed from: C */
    public C4792z<K, V> headMap(K k) {
        return headMap(k, false);
    }

    /* renamed from: D */
    public C4792z<K, V> headMap(K k, boolean z) {
        return m22114B(0, this.f21573f.mo19896c0(C6073k.m26688k(k), z));
    }

    /* renamed from: E */
    public C4684b0<K> mo19914n() {
        return this.f21573f;
    }

    /* renamed from: F */
    public C4684b0<K> navigableKeySet() {
        return this.f21573f;
    }

    /* renamed from: I */
    public C4792z<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    /* renamed from: J */
    public C4792z<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        C6073k.m26688k(k);
        C6073k.m26688k(k2);
        C6073k.m26685h(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    /* renamed from: K */
    public C4792z<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    /* renamed from: L */
    public C4792z<K, V> tailMap(K k, boolean z) {
        return m22114B(this.f21573f.mo19898d0(C6073k.m26688k(k), z), size());
    }

    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return C4718i0.m21799e(ceilingEntry(k));
    }

    public Comparator<? super K> comparator() {
        return mo19914n().comparator();
    }

    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo19839c().get(0);
    }

    public K firstKey() {
        return mo19914n().first();
    }

    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return C4718i0.m21799e(floorEntry(k));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C4789y<Map.Entry<K, V>> mo19852g() {
        return isEmpty() ? C4789y.m22097A() : new C4794b();
    }

    public V get(@NullableDecl Object obj) {
        int indexOf = this.f21573f.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.f21574g.get(indexOf);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C4789y<K> mo19854h() {
        throw new AssertionError("should never be called");
    }

    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return C4718i0.m21799e(higherEntry(k));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C4757r<V> mo19855i() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: j */
    public C4789y<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo19839c().get(size() - 1);
    }

    public K lastKey() {
        return mo19914n().last();
    }

    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return C4718i0.m21799e(lowerEntry(k));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo19856m() {
        return this.f21573f.mo19462q() || this.f21574g.mo19462q();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public C4757r<V> values() {
        return this.f21574g;
    }

    public int size() {
        return this.f21574g.size();
    }

    /* renamed from: w */
    public C4684b0<K> descendingKeySet() {
        return this.f21573f.descendingSet();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C4797d(this);
    }

    /* renamed from: x */
    public C4792z<K, V> descendingMap() {
        C4792z<K, V> zVar = this.f21575h;
        if (zVar != null) {
            return zVar;
        }
        if (isEmpty()) {
            return m22122y(C4755p0.m21937a(comparator()).mo19836f());
        }
        return new C4792z<>((C4775u0) this.f21573f.descendingSet(), this.f21574g.mo19867J(), this);
    }

    C4792z(C4775u0<K> u0Var, C4766t<V> tVar, C4792z<K, V> zVar) {
        this.f21573f = u0Var;
        this.f21574g = tVar;
        this.f21575h = zVar;
    }
}
