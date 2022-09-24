package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avj */
/* compiled from: IMASDK */
final class avj<K> extends aul<K> {

    /* renamed from: a */
    private final transient aue<K, ?> f15794a;

    /* renamed from: b */
    private final transient atz<K> f15795b;

    avj(aue<K, ?> aue, atz<K> atz) {
        this.f15794a = aue;
        this.f15795b = atz;
    }

    /* renamed from: a */
    public final avu<K> iterator() {
        return this.f15795b.listIterator();
    }

    public final boolean contains(Object obj) {
        return this.f15794a.get(obj) != null;
    }

    /* renamed from: e */
    public final atz<K> mo14503e() {
        return this.f15795b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14504f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo14505g(Object[] objArr, int i) {
        return this.f15795b.mo14505g(objArr, i);
    }

    public final int size() {
        return this.f15794a.size();
    }
}
