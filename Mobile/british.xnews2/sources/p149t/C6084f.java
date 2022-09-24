package p149t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: t.f */
/* compiled from: MapCollections */
abstract class C6084f<K, V> {

    /* renamed from: a */
    C6084f<K, V>.b f25292a;

    /* renamed from: b */
    C6084f<K, V>.c f25293b;

    /* renamed from: c */
    C6084f<K, V>.e f25294c;

    /* renamed from: t.f$a */
    /* compiled from: MapCollections */
    final class C6085a<T> implements Iterator<T> {

        /* renamed from: b */
        final int f25295b;

        /* renamed from: c */
        int f25296c;

        /* renamed from: d */
        int f25297d;

        /* renamed from: e */
        boolean f25298e = false;

        C6085a(int i) {
            this.f25295b = i;
            this.f25296c = C6084f.this.mo23268d();
        }

        public boolean hasNext() {
            return this.f25297d < this.f25296c;
        }

        public T next() {
            if (hasNext()) {
                T b = C6084f.this.mo23266b(this.f25297d, this.f25295b);
                this.f25297d++;
                this.f25298e = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f25298e) {
                int i = this.f25297d - 1;
                this.f25297d = i;
                this.f25296c--;
                this.f25298e = false;
                C6084f.this.mo23272h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: t.f$b */
    /* compiled from: MapCollections */
    final class C6086b implements Set<Map.Entry<K, V>> {
        C6086b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C6084f.this.mo23268d();
            for (Map.Entry entry : collection) {
                C6084f.this.mo23271g(entry.getKey(), entry.getValue());
            }
            return d != C6084f.this.mo23268d();
        }

        public void clear() {
            C6084f.this.mo23265a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C6084f.this.mo23269e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C6081c.m26733c(C6084f.this.mo23266b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C6084f.m26760k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = C6084f.this.mo23268d() - 1; d >= 0; d--) {
                Object b = C6084f.this.mo23266b(d, 0);
                Object b2 = C6084f.this.mo23266b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C6084f.this.mo23268d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6088d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C6084f.this.mo23268d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: t.f$c */
    /* compiled from: MapCollections */
    final class C6087c implements Set<K> {
        C6087c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C6084f.this.mo23265a();
        }

        public boolean contains(Object obj) {
            return C6084f.this.mo23269e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C6084f.m26759j(C6084f.this.mo23267c(), collection);
        }

        public boolean equals(Object obj) {
            return C6084f.m26760k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = C6084f.this.mo23268d() - 1; d >= 0; d--) {
                Object b = C6084f.this.mo23266b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C6084f.this.mo23268d() == 0;
        }

        public Iterator<K> iterator() {
            return new C6085a(0);
        }

        public boolean remove(Object obj) {
            int e = C6084f.this.mo23269e(obj);
            if (e < 0) {
                return false;
            }
            C6084f.this.mo23272h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C6084f.m26761o(C6084f.this.mo23267c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C6084f.m26762p(C6084f.this.mo23267c(), collection);
        }

        public int size() {
            return C6084f.this.mo23268d();
        }

        public Object[] toArray() {
            return C6084f.this.mo23320q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C6084f.this.mo23321r(tArr, 0);
        }
    }

    /* renamed from: t.f$d */
    /* compiled from: MapCollections */
    final class C6088d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        int f25302b;

        /* renamed from: c */
        int f25303c;

        /* renamed from: d */
        boolean f25304d = false;

        C6088d() {
            this.f25302b = C6084f.this.mo23268d() - 1;
            this.f25303c = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f25303c++;
                this.f25304d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f25304d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C6081c.m26733c(entry.getKey(), C6084f.this.mo23266b(this.f25303c, 0)) || !C6081c.m26733c(entry.getValue(), C6084f.this.mo23266b(this.f25303c, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f25304d) {
                return C6084f.this.mo23266b(this.f25303c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f25304d) {
                return C6084f.this.mo23266b(this.f25303c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f25303c < this.f25302b;
        }

        public int hashCode() {
            int i;
            if (this.f25304d) {
                int i2 = 0;
                Object b = C6084f.this.mo23266b(this.f25303c, 0);
                Object b2 = C6084f.this.mo23266b(this.f25303c, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f25304d) {
                C6084f.this.mo23272h(this.f25303c);
                this.f25303c--;
                this.f25302b--;
                this.f25304d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f25304d) {
                return C6084f.this.mo23273i(this.f25303c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: t.f$e */
    /* compiled from: MapCollections */
    final class C6089e implements Collection<V> {
        C6089e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C6084f.this.mo23265a();
        }

        public boolean contains(Object obj) {
            return C6084f.this.mo23270f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C6084f.this.mo23268d() == 0;
        }

        public Iterator<V> iterator() {
            return new C6085a(1);
        }

        public boolean remove(Object obj) {
            int f = C6084f.this.mo23270f(obj);
            if (f < 0) {
                return false;
            }
            C6084f.this.mo23272h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C6084f.this.mo23268d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C6084f.this.mo23266b(i, 1))) {
                    C6084f.this.mo23272h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C6084f.this.mo23268d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C6084f.this.mo23266b(i, 1))) {
                    C6084f.this.mo23272h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C6084f.this.mo23268d();
        }

        public Object[] toArray() {
            return C6084f.this.mo23320q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C6084f.this.mo23321r(tArr, 1);
        }
    }

    C6084f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m26759j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m26760k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m26761o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m26762p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23265a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo23266b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo23267c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo23268d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo23269e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo23270f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo23271g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo23272h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo23273i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo23317l() {
        if (this.f25292a == null) {
            this.f25292a = new C6086b();
        }
        return this.f25292a;
    }

    /* renamed from: m */
    public Set<K> mo23318m() {
        if (this.f25293b == null) {
            this.f25293b = new C6087c();
        }
        return this.f25293b;
    }

    /* renamed from: n */
    public Collection<V> mo23319n() {
        if (this.f25294c == null) {
            this.f25294c = new C6089e();
        }
        return this.f25294c;
    }

    /* renamed from: q */
    public Object[] mo23320q(int i) {
        int d = mo23268d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo23266b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo23321r(T[] tArr, int i) {
        int d = mo23268d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo23266b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
