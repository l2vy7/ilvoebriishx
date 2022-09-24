package p149t;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: t.a */
/* compiled from: ArrayMap */
public class C6077a<K, V> extends C6090g<K, V> implements Map<K, V> {

    /* renamed from: i */
    C6084f<K, V> f25263i;

    /* renamed from: t.a$a */
    /* compiled from: ArrayMap */
    class C6078a extends C6084f<K, V> {
        C6078a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo23265a() {
            C6077a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo23266b(int i, int i2) {
            return C6077a.this.f25312c[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<K, V> mo23267c() {
            return C6077a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo23268d() {
            return C6077a.this.f25313d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo23269e(Object obj) {
            return C6077a.this.mo23384g(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo23270f(Object obj) {
            return C6077a.this.mo23388i(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo23271g(K k, V v) {
            C6077a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo23272h(int i) {
            C6077a.this.mo159m(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public V mo23273i(int i, V v) {
            return C6077a.this.mo160n(i, v);
        }
    }

    public C6077a() {
    }

    /* renamed from: p */
    private C6084f<K, V> m26703p() {
        if (this.f25263i == null) {
            this.f25263i = new C6078a();
        }
        return this.f25263i;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m26703p().mo23317l();
    }

    public Set<K> keySet() {
        return m26703p().mo23318m();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo23381d(this.f25313d + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: q */
    public boolean mo23263q(Collection<?> collection) {
        return C6084f.m26762p(this, collection);
    }

    public Collection<V> values() {
        return m26703p().mo23319n();
    }

    public C6077a(int i) {
        super(i);
    }

    public C6077a(C6090g gVar) {
        super(gVar);
    }
}
