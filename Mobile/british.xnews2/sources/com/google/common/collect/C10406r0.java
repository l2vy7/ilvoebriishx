package com.google.common.collect;

import p148s6.C6073k;

/* renamed from: com.google.common.collect.r0 */
/* compiled from: RegularImmutableList */
class C10406r0<E> extends C4766t<E> {

    /* renamed from: f */
    static final C4766t<Object> f48812f = new C10406r0(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f48813d;

    /* renamed from: e */
    private final transient int f48814e;

    C10406r0(Object[] objArr, int i) {
        this.f48813d = objArr;
        this.f48814e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19459e(Object[] objArr, int i) {
        System.arraycopy(this.f48813d, 0, objArr, i, this.f48814e);
        return i + this.f48814e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo19841f() {
        return this.f48813d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo19842g() {
        return this.f48814e;
    }

    public E get(int i) {
        C6073k.m26686i(i, this.f48814e);
        return this.f48813d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo19843j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo19462q() {
        return false;
    }

    public int size() {
        return this.f48814e;
    }
}
