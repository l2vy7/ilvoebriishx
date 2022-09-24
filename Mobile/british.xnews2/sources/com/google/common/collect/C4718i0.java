package com.google.common.collect;

import com.google.common.collect.C4798z0;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6068f;
import p148s6.C6069h;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.i0 */
/* compiled from: Maps */
public final class C4718i0 {

    /* renamed from: com.google.common.collect.i0$e */
    /* compiled from: Maps */
    static class C4719e<K, V> extends AbstractCollection<V> {
        @Weak

        /* renamed from: b */
        final Map<K, V> f21434b;

        C4719e(Map<K, V> map) {
            this.f21434b = (Map) C6073k.m26688k(map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final Map<K, V> mo19693c() {
            return this.f21434b;
        }

        public void clear() {
            mo19693c().clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            return mo19693c().containsValue(obj);
        }

        public boolean isEmpty() {
            return mo19693c().isEmpty();
        }

        public Iterator<V> iterator() {
            return C4718i0.m21806l(mo19693c().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : mo19693c().entrySet()) {
                    if (C6069h.m26674a(obj, entry.getValue())) {
                        mo19693c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C6073k.m26688k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d = C4798z0.m22159d();
                for (Map.Entry entry : mo19693c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d.add(entry.getKey());
                    }
                }
                return mo19693c().keySet().removeAll(d);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C6073k.m26688k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d = C4798z0.m22159d();
                for (Map.Entry entry : mo19693c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d.add(entry.getKey());
                    }
                }
                return mo19693c().keySet().retainAll(d);
            }
        }

        public int size() {
            return mo19693c().size();
        }
    }

    /* renamed from: com.google.common.collect.i0$f */
    /* compiled from: Maps */
    static abstract class C4720f<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: b */
        private transient Set<Map.Entry<K, V>> f21435b;
        @MonotonicNonNullDecl

        /* renamed from: c */
        private transient Collection<V> f21436c;

        C4720f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Set<Map.Entry<K, V>> mo19530b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<V> mo19702c() {
            return new C4719e(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f21435b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> b = mo19530b();
            this.f21435b = b;
            return b;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f21436c;
            if (collection != null) {
                return collection;
            }
            Collection<V> c = mo19702c();
            this.f21436c = c;
            return c;
        }
    }

    /* renamed from: com.google.common.collect.i0$a */
    /* compiled from: Maps */
    static class C4721a extends C10387d1<Map.Entry<K, V>, V> {
        C4721a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public V mo19705a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: com.google.common.collect.i0$b */
    /* compiled from: Maps */
    private enum C4722b implements C6068f<Map.Entry<?, ?>, Object> {
        KEY {
            @NullableDecl
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            @NullableDecl
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: com.google.common.collect.i0$c */
    /* compiled from: Maps */
    static abstract class C4725c<K, V> extends C4798z0.C4801b<Map.Entry<K, V>> {
        C4725c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Map<K, V> mo19547c();

        public void clear() {
            mo19547c().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return mo19547c().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C6073k.m26688k(collection));
            } catch (UnsupportedOperationException unused) {
                return C4798z0.m22163h(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C6073k.m26688k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet e = C4798z0.m22160e(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        e.add(((Map.Entry) next).getKey());
                    }
                }
                return mo19547c().keySet().retainAll(e);
            }
        }

        public int size() {
            return mo19547c().size();
        }
    }

    /* renamed from: com.google.common.collect.i0$d */
    /* compiled from: Maps */
    static class C4726d<K, V> extends C4798z0.C4801b<K> {
        @Weak

        /* renamed from: b */
        final Map<K, V> f21440b;

        C4726d(Map<K, V> map) {
            this.f21440b = (Map) C6073k.m26688k(map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map<K, V> mo19715c() {
            return this.f21440b;
        }

        public boolean contains(Object obj) {
            return mo19715c().containsKey(obj);
        }

        public boolean isEmpty() {
            return mo19715c().isEmpty();
        }

        public int size() {
            return mo19715c().size();
        }
    }

    /* renamed from: a */
    static int m21795a(int i) {
        if (i < 3) {
            C10393j.m47930b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: b */
    static boolean m21796b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: c */
    public static <K, V> Map.Entry<K, V> m21797c(@NullableDecl K k, @NullableDecl V v) {
        return new C4760s(k, v);
    }

    /* renamed from: d */
    static <K> C6068f<Map.Entry<K, ?>, K> m21798d() {
        return C4722b.KEY;
    }

    @NullableDecl
    /* renamed from: e */
    static <K> K m21799e(@NullableDecl Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: f */
    public static <K, V> IdentityHashMap<K, V> m21800f() {
        return new IdentityHashMap<>();
    }

    /* renamed from: g */
    static boolean m21801g(Map<?, ?> map, Object obj) {
        C6073k.m26688k(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: h */
    static <V> V m21802h(Map<?, V> map, @NullableDecl Object obj) {
        C6073k.m26688k(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static <V> V m21803i(Map<?, V> map, Object obj) {
        C6073k.m26688k(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: j */
    static String m21804j(Map<?, ?> map) {
        StringBuilder a = C4728k.m21819a(map.size());
        a.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            a.append(next.getKey());
            a.append('=');
            a.append(next.getValue());
        }
        a.append('}');
        return a.toString();
    }

    /* renamed from: k */
    static <V> C6068f<Map.Entry<?, V>, V> m21805k() {
        return C4722b.VALUE;
    }

    /* renamed from: l */
    static <K, V> Iterator<V> m21806l(Iterator<Map.Entry<K, V>> it) {
        return new C4721a(it);
    }
}
