package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.b1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8448b1<E> extends C4647y0<E> {

    /* renamed from: f */
    static final C4647y0<Object> f43281f = new C8448b1(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f43282d;

    /* renamed from: e */
    private final transient int f43283e;

    C8448b1(Object[] objArr, int i) {
        this.f43282d = objArr;
        this.f43283e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo19128c() {
        return this.f43282d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo19130e() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo19131f() {
        return this.f43283e;
    }

    public final E get(int i) {
        C4640o0.m21338a(i, this.f43283e, "index");
        return this.f43282d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo19104h(Object[] objArr, int i) {
        System.arraycopy(this.f43282d, 0, objArr, 0, this.f43283e);
        return this.f43283e;
    }

    public final int size() {
        return this.f43283e;
    }
}
