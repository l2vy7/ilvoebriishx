package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avk */
/* compiled from: IMASDK */
final class avk extends atz<Object> {

    /* renamed from: a */
    private final transient Object[] f15796a;

    /* renamed from: b */
    private final transient int f15797b;

    /* renamed from: c */
    private final transient int f15798c;

    avk(Object[] objArr, int i, int i2) {
        this.f15796a = objArr;
        this.f15797b = i;
        this.f15798c = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14504f() {
        return true;
    }

    public final Object get(int i) {
        ars.m14626f(i, this.f15798c);
        return this.f15796a[i + i + this.f15797b];
    }

    public final int size() {
        return this.f15798c;
    }
}
