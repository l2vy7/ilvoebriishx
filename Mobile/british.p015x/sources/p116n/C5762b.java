package p116n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.b */
/* compiled from: SafeIterableMap */
public class C5762b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    C5765c<K, V> f24435b;

    /* renamed from: c */
    private C5765c<K, V> f24436c;

    /* renamed from: d */
    private WeakHashMap<C5768f<K, V>, Boolean> f24437d = new WeakHashMap<>();

    /* renamed from: e */
    private int f24438e = 0;

    /* renamed from: n.b$a */
    /* compiled from: SafeIterableMap */
    static class C5763a<K, V> extends C5767e<K, V> {
        C5763a(C5765c<K, V> cVar, C5765c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5765c<K, V> mo22579b(C5765c<K, V> cVar) {
            return cVar.f24442e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5765c<K, V> mo22580c(C5765c<K, V> cVar) {
            return cVar.f24441d;
        }
    }

    /* renamed from: n.b$b */
    /* compiled from: SafeIterableMap */
    private static class C5764b<K, V> extends C5767e<K, V> {
        C5764b(C5765c<K, V> cVar, C5765c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5765c<K, V> mo22579b(C5765c<K, V> cVar) {
            return cVar.f24441d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5765c<K, V> mo22580c(C5765c<K, V> cVar) {
            return cVar.f24442e;
        }
    }

    /* renamed from: n.b$c */
    /* compiled from: SafeIterableMap */
    static class C5765c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        final K f24439b;

        /* renamed from: c */
        final V f24440c;

        /* renamed from: d */
        C5765c<K, V> f24441d;

        /* renamed from: e */
        C5765c<K, V> f24442e;

        C5765c(K k, V v) {
            this.f24439b = k;
            this.f24440c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5765c)) {
                return false;
            }
            C5765c cVar = (C5765c) obj;
            if (!this.f24439b.equals(cVar.f24439b) || !this.f24440c.equals(cVar.f24440c)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f24439b;
        }

        public V getValue() {
            return this.f24440c;
        }

        public int hashCode() {
            return this.f24439b.hashCode() ^ this.f24440c.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f24439b + "=" + this.f24440c;
        }
    }

    /* renamed from: n.b$d */
    /* compiled from: SafeIterableMap */
    private class C5766d implements Iterator<Map.Entry<K, V>>, C5768f<K, V> {

        /* renamed from: b */
        private C5765c<K, V> f24443b;

        /* renamed from: c */
        private boolean f24444c = true;

        C5766d() {
        }

        /* renamed from: a */
        public void mo22587a(C5765c<K, V> cVar) {
            C5765c<K, V> cVar2 = this.f24443b;
            if (cVar == cVar2) {
                C5765c<K, V> cVar3 = cVar2.f24442e;
                this.f24443b = cVar3;
                this.f24444c = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f24444c) {
                this.f24444c = false;
                this.f24443b = C5762b.this.f24435b;
            } else {
                C5765c<K, V> cVar = this.f24443b;
                this.f24443b = cVar != null ? cVar.f24441d : null;
            }
            return this.f24443b;
        }

        public boolean hasNext() {
            if (!this.f24444c) {
                C5765c<K, V> cVar = this.f24443b;
                if (cVar == null || cVar.f24441d == null) {
                    return false;
                }
                return true;
            } else if (C5762b.this.f24435b != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: n.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C5767e<K, V> implements Iterator<Map.Entry<K, V>>, C5768f<K, V> {

        /* renamed from: b */
        C5765c<K, V> f24446b;

        /* renamed from: c */
        C5765c<K, V> f24447c;

        C5767e(C5765c<K, V> cVar, C5765c<K, V> cVar2) {
            this.f24446b = cVar2;
            this.f24447c = cVar;
        }

        /* renamed from: f */
        private C5765c<K, V> m25523f() {
            C5765c<K, V> cVar = this.f24447c;
            C5765c<K, V> cVar2 = this.f24446b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo22580c(cVar);
        }

        /* renamed from: a */
        public void mo22587a(C5765c<K, V> cVar) {
            if (this.f24446b == cVar && cVar == this.f24447c) {
                this.f24447c = null;
                this.f24446b = null;
            }
            C5765c<K, V> cVar2 = this.f24446b;
            if (cVar2 == cVar) {
                this.f24446b = mo22579b(cVar2);
            }
            if (this.f24447c == cVar) {
                this.f24447c = m25523f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C5765c<K, V> mo22579b(C5765c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C5765c<K, V> mo22580c(C5765c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C5765c<K, V> cVar = this.f24447c;
            this.f24447c = m25523f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f24447c != null;
        }
    }

    /* renamed from: n.b$f */
    /* compiled from: SafeIterableMap */
    interface C5768f<K, V> {
        /* renamed from: a */
        void mo22587a(C5765c<K, V> cVar);
    }

    /* renamed from: c */
    public Map.Entry<K, V> mo22569c() {
        return this.f24435b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C5764b bVar = new C5764b(this.f24436c, this.f24435b);
        this.f24437d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C5765c<K, V> mo22565e(K k) {
        C5765c<K, V> cVar = this.f24435b;
        while (cVar != null && !cVar.f24439b.equals(k)) {
            cVar = cVar.f24441d;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5762b)) {
            return false;
        }
        C5762b bVar = (C5762b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C5762b<K, V>.d mo22572f() {
        C5762b<K, V>.d dVar = new C5766d();
        this.f24437d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: g */
    public Map.Entry<K, V> mo22573g() {
        return this.f24436c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C5765c<K, V> mo22574h(K k, V v) {
        C5765c<K, V> cVar = new C5765c<>(k, v);
        this.f24438e++;
        C5765c<K, V> cVar2 = this.f24436c;
        if (cVar2 == null) {
            this.f24435b = cVar;
            this.f24436c = cVar;
            return cVar;
        }
        cVar2.f24441d = cVar;
        cVar.f24442e = cVar2;
        this.f24436c = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public V mo22566i(K k, V v) {
        C5765c e = mo22565e(k);
        if (e != null) {
            return e.f24440c;
        }
        mo22574h(k, v);
        return null;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C5763a aVar = new C5763a(this.f24435b, this.f24436c);
        this.f24437d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public V mo22567j(K k) {
        C5765c e = mo22565e(k);
        if (e == null) {
            return null;
        }
        this.f24438e--;
        if (!this.f24437d.isEmpty()) {
            for (C5768f<K, V> a : this.f24437d.keySet()) {
                a.mo22587a(e);
            }
        }
        C5765c<K, V> cVar = e.f24442e;
        if (cVar != null) {
            cVar.f24441d = e.f24441d;
        } else {
            this.f24435b = e.f24441d;
        }
        C5765c<K, V> cVar2 = e.f24441d;
        if (cVar2 != null) {
            cVar2.f24442e = cVar;
        } else {
            this.f24436c = cVar;
        }
        e.f24441d = null;
        e.f24442e = null;
        return e.f24440c;
    }

    public int size() {
        return this.f24438e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
