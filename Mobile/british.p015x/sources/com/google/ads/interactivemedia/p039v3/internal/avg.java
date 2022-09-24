package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avg */
/* compiled from: IMASDK */
final class avg<E> extends atz<E> {

    /* renamed from: a */
    static final atz<Object> f15787a = new avg(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f15788b;

    /* renamed from: c */
    private final transient int f15789c;

    avg(Object[] objArr, int i) {
        this.f15788b = objArr;
        this.f15789c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo14498b() {
        return this.f15788b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo14499c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo14502d() {
        return this.f15789c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14504f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo14505g(Object[] objArr, int i) {
        System.arraycopy(this.f15788b, 0, objArr, i, this.f15789c);
        return i + this.f15789c;
    }

    public final E get(int i) {
        ars.m14626f(i, this.f15789c);
        return this.f15788b[i];
    }

    public final int size() {
        return this.f15789c;
    }
}
