package com.google.common.collect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.t0 */
/* compiled from: RegularImmutableSet */
final class C4772t0<E> extends C4789y<E> {

    /* renamed from: i */
    static final C4772t0<Object> f21531i = new C4772t0(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: d */
    final transient Object[] f21532d;

    /* renamed from: e */
    final transient Object[] f21533e;

    /* renamed from: f */
    private final transient int f21534f;

    /* renamed from: g */
    private final transient int f21535g;

    /* renamed from: h */
    private final transient int f21536h;

    C4772t0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f21532d = objArr;
        this.f21533e = objArr2;
        this.f21534f = i2;
        this.f21535g = i;
        this.f21536h = i3;
    }

    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f21533e;
        if (obj == null || objArr == null) {
            return false;
        }
        int c = C4756q.m21945c(obj);
        while (true) {
            int i = c & this.f21534f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19459e(Object[] objArr, int i) {
        System.arraycopy(this.f21532d, 0, objArr, i, this.f21536h);
        return i + this.f21536h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo19841f() {
        return this.f21532d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo19842g() {
        return this.f21536h;
    }

    public int hashCode() {
        return this.f21535g;
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

    /* renamed from: r */
    public C10388e1<E> iterator() {
        return mo19839c().iterator();
    }

    public int size() {
        return this.f21536h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C4766t<E> mo19466y() {
        return C4766t.m21985u(this.f21532d, this.f21536h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo19467z() {
        return true;
    }
}
