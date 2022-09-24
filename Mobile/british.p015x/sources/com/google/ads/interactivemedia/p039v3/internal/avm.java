package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avm */
/* compiled from: IMASDK */
final class avm<E> extends aul<E> {

    /* renamed from: a */
    static final avm<Object> f15803a = new avm(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: b */
    final transient Object[] f15804b;

    /* renamed from: c */
    final transient Object[] f15805c;

    /* renamed from: d */
    private final transient int f15806d;

    /* renamed from: e */
    private final transient int f15807e;

    /* renamed from: f */
    private final transient int f15808f;

    avm(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f15804b = objArr;
        this.f15805c = objArr2;
        this.f15806d = i2;
        this.f15807e = i;
        this.f15808f = i3;
    }

    /* renamed from: a */
    public final avu<E> iterator() {
        return mo14503e().listIterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo14498b() {
        return this.f15804b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo14499c() {
        return 0;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f15805c;
        if (obj == null || objArr == null) {
            return false;
        }
        int d = aup.m14873d(obj);
        while (true) {
            int i = d & this.f15806d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            d = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo14502d() {
        return this.f15808f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14504f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo14505g(Object[] objArr, int i) {
        System.arraycopy(this.f15804b, 0, objArr, i, this.f15808f);
        return i + this.f15808f;
    }

    public final int hashCode() {
        return this.f15807e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo14572l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final atz<E> mo14573m() {
        return atz.m14814p(this.f15804b, this.f15808f);
    }

    public final int size() {
        return this.f15808f;
    }
}
