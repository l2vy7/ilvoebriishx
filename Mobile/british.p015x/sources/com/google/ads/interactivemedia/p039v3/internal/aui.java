package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aui */
/* compiled from: IMASDK */
final class aui<K, V> extends att<V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final transient auj<K, V> f15761a;

    aui(auj<K, V> auj) {
        this.f15761a = auj;
    }

    /* renamed from: a */
    public final avu<V> iterator() {
        return new auf(this.f15761a);
    }

    public final boolean contains(Object obj) {
        return this.f15761a.mo14395v(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14504f() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo14505g(Object[] objArr, int i) {
        avv q = ((atz) this.f15761a.f15762b.values()).listIterator();
        while (q.hasNext()) {
            i = ((att) q.next()).mo14505g(objArr, i);
        }
        return i;
    }

    public final int size() {
        return this.f15761a.f15763c;
    }
}
