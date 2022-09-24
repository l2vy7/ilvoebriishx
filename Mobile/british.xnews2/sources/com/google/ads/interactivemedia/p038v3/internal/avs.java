package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avs */
/* compiled from: IMASDK */
final class avs<E> extends aul<E> {

    /* renamed from: a */
    final transient E f15812a;

    /* renamed from: b */
    private transient int f15813b;

    avs(E e) {
        ars.m14627g(e);
        this.f15812a = e;
    }

    /* renamed from: a */
    public final avu<E> iterator() {
        return new aum(this.f15812a);
    }

    public final boolean contains(Object obj) {
        return this.f15812a.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14504f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo14505g(Object[] objArr, int i) {
        objArr[i] = this.f15812a;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.f15813b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f15812a.hashCode();
        this.f15813b = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo14572l() {
        return this.f15813b != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final atz<E> mo14573m() {
        return atz.m14808j(this.f15812a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f15812a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    avs(E e, int i) {
        this.f15812a = e;
        this.f15813b = i;
    }
}
