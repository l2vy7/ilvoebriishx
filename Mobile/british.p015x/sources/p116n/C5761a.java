package p116n;

import java.util.HashMap;
import java.util.Map;
import p116n.C5762b;

/* renamed from: n.a */
/* compiled from: FastSafeIterableMap */
public class C5761a<K, V> extends C5762b<K, V> {

    /* renamed from: f */
    private HashMap<K, C5762b.C5765c<K, V>> f24434f = new HashMap<>();

    public boolean contains(K k) {
        return this.f24434f.containsKey(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C5762b.C5765c<K, V> mo22565e(K k) {
        return this.f24434f.get(k);
    }

    /* renamed from: i */
    public V mo22566i(K k, V v) {
        C5762b.C5765c e = mo22565e(k);
        if (e != null) {
            return e.f24440c;
        }
        this.f24434f.put(k, mo22574h(k, v));
        return null;
    }

    /* renamed from: j */
    public V mo22567j(K k) {
        V j = super.mo22567j(k);
        this.f24434f.remove(k);
        return j;
    }

    /* renamed from: q */
    public Map.Entry<K, V> mo22568q(K k) {
        if (contains(k)) {
            return this.f24434f.get(k).f24442e;
        }
        return null;
    }
}
