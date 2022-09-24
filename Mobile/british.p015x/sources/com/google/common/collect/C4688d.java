package com.google.common.collect;

import com.google.common.collect.C4712f;
import com.google.common.collect.C4718i0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p099k.C5521a;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.d */
/* compiled from: AbstractMapBasedMultimap */
abstract class C4688d<K, V> extends C4712f<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public transient Map<K, Collection<V>> f21384f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public transient int f21385g;

    /* renamed from: com.google.common.collect.d$c */
    /* compiled from: AbstractMapBasedMultimap */
    private class C4689c extends C4718i0.C4720f<K, Collection<V>> {

        /* renamed from: d */
        final transient Map<K, Collection<V>> f21386d;

        /* renamed from: com.google.common.collect.d$c$b */
        /* compiled from: AbstractMapBasedMultimap */
        class C4690b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b */
            final Iterator<Map.Entry<K, Collection<V>>> f21388b;
            @NullableDecl

            /* renamed from: c */
            Collection<V> f21389c;

            C4690b() {
                this.f21388b = C4689c.this.f21386d.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f21388b.next();
                this.f21389c = (Collection) next.getValue();
                return C4689c.this.mo19536f(next);
            }

            public boolean hasNext() {
                return this.f21388b.hasNext();
            }

            public void remove() {
                C10393j.m47931c(this.f21389c != null);
                this.f21388b.remove();
                C4688d dVar = C4688d.this;
                int unused = dVar.f21385g = dVar.f21385g - this.f21389c.size();
                this.f21389c.clear();
                this.f21389c = null;
            }
        }

        /* renamed from: com.google.common.collect.d$c$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C4691a extends C4718i0.C4725c<K, Collection<V>> {
            C4691a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public Map<K, Collection<V>> mo19547c() {
                return C4689c.this;
            }

            public boolean contains(Object obj) {
                return C4728k.m21820b(C4689c.this.f21386d.entrySet(), obj);
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C4690b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C4688d.this.m21700y(((Map.Entry) obj).getKey());
                return true;
            }
        }

        C4689c(Map<K, Collection<V>> map) {
            this.f21386d = map;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Set<Map.Entry<K, Collection<V>>> mo19530b() {
            return new C4691a();
        }

        public void clear() {
            if (this.f21386d == C4688d.this.f21384f) {
                C4688d.this.clear();
            } else {
                C4708e0.m21762b(new C4690b());
            }
        }

        public boolean containsKey(Object obj) {
            return C4718i0.m21801g(this.f21386d, obj);
        }

        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C4718i0.m21802h(this.f21386d, obj);
            if (collection == null) {
                return null;
            }
            return C4688d.this.mo19509B(obj, collection);
        }

        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f21386d.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> t = C4688d.this.mo19524t();
            t.addAll(remove);
            C4688d dVar = C4688d.this;
            int unused = dVar.f21385g = dVar.f21385g - remove.size();
            remove.clear();
            return t;
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f21386d.equals(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map.Entry<K, Collection<V>> mo19536f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C4718i0.m21797c(key, C4688d.this.mo19509B(key, entry.getValue()));
        }

        public int hashCode() {
            return this.f21386d.hashCode();
        }

        public Set<K> keySet() {
            return C4688d.this.mo19678j();
        }

        public int size() {
            return this.f21386d.size();
        }

        public String toString() {
            return this.f21386d.toString();
        }
    }

    /* renamed from: com.google.common.collect.d$d */
    /* compiled from: AbstractMapBasedMultimap */
    private abstract class C4692d<T> implements Iterator<T> {

        /* renamed from: b */
        final Iterator<Map.Entry<K, Collection<V>>> f21392b;
        @NullableDecl

        /* renamed from: c */
        K f21393c = null;
        @MonotonicNonNullDecl

        /* renamed from: d */
        Collection<V> f21394d = null;

        /* renamed from: e */
        Iterator<V> f21395e = C4708e0.m21766f();

        C4692d() {
            this.f21392b = C4688d.this.f21384f.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo19551a(K k, V v);

        public boolean hasNext() {
            return this.f21392b.hasNext() || this.f21395e.hasNext();
        }

        public T next() {
            if (!this.f21395e.hasNext()) {
                Map.Entry next = this.f21392b.next();
                this.f21393c = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f21394d = collection;
                this.f21395e = collection.iterator();
            }
            return mo19551a(this.f21393c, this.f21395e.next());
        }

        public void remove() {
            this.f21395e.remove();
            if (this.f21394d.isEmpty()) {
                this.f21392b.remove();
            }
            C4688d.m21697q(C4688d.this);
        }
    }

    /* renamed from: com.google.common.collect.d$e */
    /* compiled from: AbstractMapBasedMultimap */
    private class C4693e extends C4718i0.C4726d<K, Collection<V>> {

        /* renamed from: com.google.common.collect.d$e$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C4694a implements Iterator<K> {
            @NullableDecl

            /* renamed from: b */
            Map.Entry<K, Collection<V>> f21398b;

            /* renamed from: c */
            final /* synthetic */ Iterator f21399c;

            C4694a(Iterator it) {
                this.f21399c = it;
            }

            public boolean hasNext() {
                return this.f21399c.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f21399c.next();
                this.f21398b = entry;
                return entry.getKey();
            }

            public void remove() {
                C10393j.m47931c(this.f21398b != null);
                Collection value = this.f21398b.getValue();
                this.f21399c.remove();
                C4688d dVar = C4688d.this;
                int unused = dVar.f21385g = dVar.f21385g - value.size();
                value.clear();
                this.f21398b = null;
            }
        }

        C4693e(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            C4708e0.m21762b(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo19715c().keySet().containsAll(collection);
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || mo19715c().keySet().equals(obj);
        }

        public int hashCode() {
            return mo19715c().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C4694a(mo19715c().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo19715c().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C4688d dVar = C4688d.this;
                int unused = dVar.f21385g = dVar.f21385g - i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.d$h */
    /* compiled from: AbstractMapBasedMultimap */
    private class C4695h extends C4688d<K, V>.l implements RandomAccess {
        C4695h(@NullableDecl K k, List<V> list, @NullableDecl C4688d<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    /* renamed from: com.google.common.collect.d$i */
    /* compiled from: AbstractMapBasedMultimap */
    private class C4696i extends C4688d<K, V>.c implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl

        /* renamed from: f */
        SortedSet<K> f21402f;

        C4696i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo19569i().comparator();
        }

        public K firstKey() {
            return mo19569i().firstKey();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public SortedSet<K> mo19566g() {
            return new C4705j(mo19569i());
        }

        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f21402f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> g = mo19566g();
            this.f21402f = g;
            return g;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C4696i(mo19569i().headMap(k));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public SortedMap<K, Collection<V>> mo19569i() {
            return (SortedMap) this.f21386d;
        }

        public K lastKey() {
            return mo19569i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C4696i(mo19569i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C4696i(mo19569i().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.d$a */
    /* compiled from: AbstractMapBasedMultimap */
    class C4701a extends C4688d<K, V>.d<V> {
        C4701a() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public V mo19551a(K k, V v) {
            return v;
        }
    }

    /* renamed from: com.google.common.collect.d$b */
    /* compiled from: AbstractMapBasedMultimap */
    class C4702b extends C4688d<K, V>.d<Map.Entry<K, V>> {
        C4702b() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map.Entry<K, V> mo19551a(K k, V v) {
            return C4718i0.m21797c(k, v);
        }
    }

    /* renamed from: com.google.common.collect.d$f */
    /* compiled from: AbstractMapBasedMultimap */
    class C4703f extends C4688d<K, V>.i implements NavigableMap<K, Collection<V>> {
        C4703f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = mo19569i().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo19536f(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return mo19569i().ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C4703f(mo19569i().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo19569i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo19536f(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = mo19569i().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo19536f(floorEntry);
        }

        public K floorKey(K k) {
            return mo19569i().floorKey(k);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = mo19569i().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo19536f(higherEntry);
        }

        public K higherKey(K k) {
            return mo19569i().higherKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public NavigableSet<K> mo19566g() {
            return new C4704g(mo19569i());
        }

        /* renamed from: l */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo19569i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo19536f(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = mo19569i().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo19536f(lowerEntry);
        }

        public K lowerKey(K k) {
            return mo19569i().lowerKey(k);
        }

        /* renamed from: m */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public Map.Entry<K, Collection<V>> mo19631n(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection t = C4688d.this.mo19524t();
            t.addAll((Collection) next.getValue());
            it.remove();
            return C4718i0.m21797c(next.getKey(), C4688d.this.mo19508A(t));
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> mo19569i() {
            return (NavigableMap) super.mo19569i();
        }

        /* renamed from: p */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return mo19631n(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return mo19631n(descendingMap().entrySet().iterator());
        }

        /* renamed from: q */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C4703f(mo19569i().headMap(k, z));
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C4703f(mo19569i().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C4703f(mo19569i().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.d$g */
    /* compiled from: AbstractMapBasedMultimap */
    class C4704g extends C4688d<K, V>.j implements NavigableSet<K> {
        C4704g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k) {
            return mo19643e().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new C4704g(mo19643e().descendingMap());
        }

        /* renamed from: f */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public K floor(K k) {
            return mo19643e().floorKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public NavigableMap<K, Collection<V>> mo19643e() {
            return (NavigableMap) super.mo19643e();
        }

        /* renamed from: h */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public K higher(K k) {
            return mo19643e().higherKey(k);
        }

        /* renamed from: i */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public K lower(K k) {
            return mo19643e().lowerKey(k);
        }

        public K pollFirst() {
            return C4708e0.m21769i(iterator());
        }

        public K pollLast() {
            return C4708e0.m21769i(descendingIterator());
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new C4704g(mo19643e().headMap(k, z));
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C4704g(mo19643e().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C4704g(mo19643e().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.d$j */
    /* compiled from: AbstractMapBasedMultimap */
    private class C4705j extends C4688d<K, V>.e implements SortedSet<K> {
        C4705j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo19643e().comparator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public SortedMap<K, Collection<V>> mo19643e() {
            return (SortedMap) super.mo19715c();
        }

        public K first() {
            return mo19643e().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C4705j(mo19643e().headMap(k));
        }

        public K last() {
            return mo19643e().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C4705j(mo19643e().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C4705j(mo19643e().tailMap(k));
        }
    }

    protected C4688d(Map<K, Collection<V>> map) {
        C6073k.m26681d(map.isEmpty());
        this.f21384f = map;
    }

    /* renamed from: p */
    static /* synthetic */ int m21696p(C4688d dVar) {
        int i = dVar.f21385g;
        dVar.f21385g = i + 1;
        return i;
    }

    /* renamed from: q */
    static /* synthetic */ int m21697q(C4688d dVar) {
        int i = dVar.f21385g;
        dVar.f21385g = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static <E> Iterator<E> m21699x(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m21700y(Object obj) {
        Collection collection = (Collection) C4718i0.m21803i(this.f21384f, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f21385g -= size;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public abstract <E> Collection<E> mo19508A(Collection<E> collection);

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public abstract Collection<V> mo19509B(@NullableDecl K k, Collection<V> collection);

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final List<V> mo19515C(@NullableDecl K k, List<V> list, @NullableDecl C4688d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new C4695h(k, list, kVar) : new C4699l(k, list, kVar);
    }

    /* renamed from: a */
    public Collection<Map.Entry<K, V>> mo19516a() {
        return super.mo19516a();
    }

    public void clear() {
        for (Collection<V> clear : this.f21384f.values()) {
            clear.clear();
        }
        this.f21384f.clear();
        this.f21385g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Collection<Map.Entry<K, V>> mo19518f() {
        return new C4712f.C4714a();
    }

    public Collection<V> get(@NullableDecl K k) {
        Collection collection = this.f21384f.get(k);
        if (collection == null) {
            collection = mo19525u(k);
        }
        return mo19509B(k, collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Collection<V> mo19519h() {
        return new C4712f.C4713b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Iterator<Map.Entry<K, V>> mo19520i() {
        return new C4702b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Iterator<V> mo19521k() {
        return new C4701a();
    }

    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.f21384f.get(k);
        if (collection == null) {
            Collection u = mo19525u(k);
            if (u.add(v)) {
                this.f21385g++;
                this.f21384f.put(k, u);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f21385g++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Map<K, Collection<V>> mo19522s() {
        return this.f21384f;
    }

    public int size() {
        return this.f21385g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract Collection<V> mo19524t();

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Collection<V> mo19525u(@NullableDecl K k) {
        return mo19524t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final Map<K, Collection<V>> mo19526v() {
        Map<K, Collection<V>> map = this.f21384f;
        if (map instanceof NavigableMap) {
            return new C4703f((NavigableMap) this.f21384f);
        }
        if (map instanceof SortedMap) {
            return new C4696i((SortedMap) this.f21384f);
        }
        return new C4689c(this.f21384f);
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final Set<K> mo19528w() {
        Map<K, Collection<V>> map = this.f21384f;
        if (map instanceof NavigableMap) {
            return new C4704g((NavigableMap) this.f21384f);
        }
        if (map instanceof SortedMap) {
            return new C4705j((SortedMap) this.f21384f);
        }
        return new C4693e(this.f21384f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo19529z(Map<K, Collection<V>> map) {
        this.f21384f = map;
        this.f21385g = 0;
        for (Collection next : map.values()) {
            C6073k.m26681d(!next.isEmpty());
            this.f21385g += next.size();
        }
    }

    /* renamed from: com.google.common.collect.d$k */
    /* compiled from: AbstractMapBasedMultimap */
    class C4697k extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: b */
        final K f21404b;

        /* renamed from: c */
        Collection<V> f21405c;
        @NullableDecl

        /* renamed from: d */
        final C4688d<K, V>.k f21406d;
        @NullableDecl

        /* renamed from: e */
        final Collection<V> f21407e;

        C4697k(@NullableDecl K k, Collection<V> collection, @NullableDecl C4688d<K, V>.k kVar) {
            Collection<V> collection2;
            this.f21404b = k;
            this.f21405c = collection;
            this.f21406d = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.mo19581f();
            }
            this.f21407e = collection2;
        }

        public boolean add(V v) {
            mo19585j();
            boolean isEmpty = this.f21405c.isEmpty();
            boolean add = this.f21405c.add(v);
            if (add) {
                C4688d.m21696p(C4688d.this);
                if (isEmpty) {
                    mo19575c();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f21405c.addAll(collection);
            if (addAll) {
                int size2 = this.f21405c.size();
                C4688d dVar = C4688d.this;
                int unused = dVar.f21385g = dVar.f21385g + (size2 - size);
                if (size == 0) {
                    mo19575c();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo19575c() {
            C4688d<K, V>.k kVar = this.f21406d;
            if (kVar != null) {
                kVar.mo19575c();
            } else {
                C4688d.this.f21384f.put(this.f21404b, this.f21405c);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f21405c.clear();
                C4688d dVar = C4688d.this;
                int unused = dVar.f21385g = dVar.f21385g - size;
                mo19586q();
            }
        }

        public boolean contains(Object obj) {
            mo19585j();
            return this.f21405c.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo19585j();
            return this.f21405c.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C4688d<K, V>.k mo19579e() {
            return this.f21406d;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            mo19585j();
            return this.f21405c.equals(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Collection<V> mo19581f() {
            return this.f21405c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public K mo19582g() {
            return this.f21404b;
        }

        public int hashCode() {
            mo19585j();
            return this.f21405c.hashCode();
        }

        public Iterator<V> iterator() {
            mo19585j();
            return new C4698a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo19585j() {
            Collection<V> collection;
            C4688d<K, V>.k kVar = this.f21406d;
            if (kVar != null) {
                kVar.mo19585j();
                if (this.f21406d.mo19581f() != this.f21407e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f21405c.isEmpty() && (collection = (Collection) C4688d.this.f21384f.get(this.f21404b)) != null) {
                this.f21405c = collection;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo19586q() {
            C4688d<K, V>.k kVar = this.f21406d;
            if (kVar != null) {
                kVar.mo19586q();
            } else if (this.f21405c.isEmpty()) {
                C4688d.this.f21384f.remove(this.f21404b);
            }
        }

        public boolean remove(Object obj) {
            mo19585j();
            boolean remove = this.f21405c.remove(obj);
            if (remove) {
                C4688d.m21697q(C4688d.this);
                mo19586q();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f21405c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f21405c.size();
                C4688d dVar = C4688d.this;
                int unused = dVar.f21385g = dVar.f21385g + (size2 - size);
                mo19586q();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            C6073k.m26688k(collection);
            int size = size();
            boolean retainAll = this.f21405c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f21405c.size();
                C4688d dVar = C4688d.this;
                int unused = dVar.f21385g = dVar.f21385g + (size2 - size);
                mo19586q();
            }
            return retainAll;
        }

        public int size() {
            mo19585j();
            return this.f21405c.size();
        }

        public String toString() {
            mo19585j();
            return this.f21405c.toString();
        }

        /* renamed from: com.google.common.collect.d$k$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C4698a implements Iterator<V> {

            /* renamed from: b */
            final Iterator<V> f21409b;

            /* renamed from: c */
            final Collection<V> f21410c;

            C4698a() {
                Collection<V> collection = C4697k.this.f21405c;
                this.f21410c = collection;
                this.f21409b = C4688d.m21699x(collection);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public Iterator<V> mo19592a() {
                mo19593b();
                return this.f21409b;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo19593b() {
                C4697k.this.mo19585j();
                if (C4697k.this.f21405c != this.f21410c) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo19593b();
                return this.f21409b.hasNext();
            }

            public V next() {
                mo19593b();
                return this.f21409b.next();
            }

            public void remove() {
                this.f21409b.remove();
                C4688d.m21697q(C4688d.this);
                C4697k.this.mo19586q();
            }

            C4698a(Iterator<V> it) {
                this.f21410c = C4697k.this.f21405c;
                this.f21409b = it;
            }
        }
    }

    /* renamed from: com.google.common.collect.d$l */
    /* compiled from: AbstractMapBasedMultimap */
    class C4699l extends C4688d<K, V>.k implements List<V> {

        /* renamed from: com.google.common.collect.d$l$a */
        /* compiled from: AbstractMapBasedMultimap */
        private class C4700a extends C4688d<K, V>.C5521a implements ListIterator<V> {
            C4700a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.d$k$a, com.google.common.collect.d$l$a] */
            /* renamed from: c */
            private ListIterator<V> m21734c() {
                return (ListIterator) mo19592a();
            }

            public void add(V v) {
                boolean isEmpty = C4699l.this.isEmpty();
                m21734c().add(v);
                C4688d.m21696p(C4688d.this);
                if (isEmpty) {
                    C4699l.this.mo19575c();
                }
            }

            public boolean hasPrevious() {
                return m21734c().hasPrevious();
            }

            public int nextIndex() {
                return m21734c().nextIndex();
            }

            public V previous() {
                return m21734c().previous();
            }

            public int previousIndex() {
                return m21734c().previousIndex();
            }

            public void set(V v) {
                m21734c().set(v);
            }

            public C4700a(int i) {
                super(C4699l.this.mo19604r().listIterator(i));
            }
        }

        C4699l(@NullableDecl K k, List<V> list, @NullableDecl C4688d<K, V>.k kVar) {
            super(k, list, kVar);
        }

        public void add(int i, V v) {
            mo19585j();
            boolean isEmpty = mo19581f().isEmpty();
            mo19604r().add(i, v);
            C4688d.m21696p(C4688d.this);
            if (isEmpty) {
                mo19575c();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo19604r().addAll(i, collection);
            if (addAll) {
                int size2 = mo19581f().size();
                C4688d dVar = C4688d.this;
                int unused = dVar.f21385g = dVar.f21385g + (size2 - size);
                if (size == 0) {
                    mo19575c();
                }
            }
            return addAll;
        }

        public V get(int i) {
            mo19585j();
            return mo19604r().get(i);
        }

        public int indexOf(Object obj) {
            mo19585j();
            return mo19604r().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo19585j();
            return mo19604r().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo19585j();
            return new C4700a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public List<V> mo19604r() {
            return (List) mo19581f();
        }

        public V remove(int i) {
            mo19585j();
            V remove = mo19604r().remove(i);
            C4688d.m21697q(C4688d.this);
            mo19586q();
            return remove;
        }

        public V set(int i, V v) {
            mo19585j();
            return mo19604r().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo19585j();
            return C4688d.this.mo19515C(mo19582g(), mo19604r().subList(i, i2), mo19579e() == null ? this : mo19579e());
        }

        public ListIterator<V> listIterator(int i) {
            mo19585j();
            return new C4700a(i);
        }
    }
}
