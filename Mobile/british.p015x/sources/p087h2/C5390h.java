package p087h2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p087h2.C5400m;

/* renamed from: h2.h */
/* compiled from: GroupedLinkedMap */
class C5390h<K extends C5400m, V> {

    /* renamed from: a */
    private final C5391a<K, V> f23675a = new C5391a<>();

    /* renamed from: b */
    private final Map<K, C5391a<K, V>> f23676b = new HashMap();

    /* renamed from: h2.h$a */
    /* compiled from: GroupedLinkedMap */
    private static class C5391a<K, V> {

        /* renamed from: a */
        final K f23677a;

        /* renamed from: b */
        private List<V> f23678b;

        /* renamed from: c */
        C5391a<K, V> f23679c;

        /* renamed from: d */
        C5391a<K, V> f23680d;

        C5391a() {
            this((Object) null);
        }

        /* renamed from: a */
        public void mo21836a(V v) {
            if (this.f23678b == null) {
                this.f23678b = new ArrayList();
            }
            this.f23678b.add(v);
        }

        /* renamed from: b */
        public V mo21837b() {
            int c = mo21838c();
            if (c > 0) {
                return this.f23678b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo21838c() {
            List<V> list = this.f23678b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C5391a(K k) {
            this.f23680d = this;
            this.f23679c = this;
            this.f23677a = k;
        }
    }

    C5390h() {
    }

    /* renamed from: b */
    private void m24243b(C5391a<K, V> aVar) {
        m24245e(aVar);
        C5391a<K, V> aVar2 = this.f23675a;
        aVar.f23680d = aVar2;
        aVar.f23679c = aVar2.f23679c;
        m24246g(aVar);
    }

    /* renamed from: c */
    private void m24244c(C5391a<K, V> aVar) {
        m24245e(aVar);
        C5391a<K, V> aVar2 = this.f23675a;
        aVar.f23680d = aVar2.f23680d;
        aVar.f23679c = aVar2;
        m24246g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m24245e(C5391a<K, V> aVar) {
        C5391a<K, V> aVar2 = aVar.f23680d;
        aVar2.f23679c = aVar.f23679c;
        aVar.f23679c.f23680d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m24246g(C5391a<K, V> aVar) {
        aVar.f23679c.f23680d = aVar;
        aVar.f23680d.f23679c = aVar;
    }

    /* renamed from: a */
    public V mo21832a(K k) {
        C5391a aVar = this.f23676b.get(k);
        if (aVar == null) {
            aVar = new C5391a(k);
            this.f23676b.put(k, aVar);
        } else {
            k.mo21815a();
        }
        m24243b(aVar);
        return aVar.mo21837b();
    }

    /* renamed from: d */
    public void mo21833d(K k, V v) {
        C5391a aVar = this.f23676b.get(k);
        if (aVar == null) {
            aVar = new C5391a(k);
            m24244c(aVar);
            this.f23676b.put(k, aVar);
        } else {
            k.mo21815a();
        }
        aVar.mo21836a(v);
    }

    /* renamed from: f */
    public V mo21834f() {
        for (C5391a<K, V> aVar = this.f23675a.f23680d; !aVar.equals(this.f23675a); aVar = aVar.f23680d) {
            V b = aVar.mo21837b();
            if (b != null) {
                return b;
            }
            m24245e(aVar);
            this.f23676b.remove(aVar.f23677a);
            ((C5400m) aVar.f23677a).mo21815a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C5391a<K, V> aVar = this.f23675a.f23679c; !aVar.equals(this.f23675a); aVar = aVar.f23679c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f23677a);
            sb.append(':');
            sb.append(aVar.mo21838c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
