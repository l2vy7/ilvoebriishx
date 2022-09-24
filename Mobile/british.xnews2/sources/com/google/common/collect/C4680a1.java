package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.a1 */
/* compiled from: SingletonImmutableSet */
final class C4680a1<E> extends C4789y<E> {

    /* renamed from: d */
    final transient E f21369d;
    @LazyInit

    /* renamed from: e */
    private transient int f21370e;

    C4680a1(E e) {
        this.f21369d = C6073k.m26688k(e);
    }

    public boolean contains(Object obj) {
        return this.f21369d.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19459e(Object[] objArr, int i) {
        objArr[i] = this.f21369d;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.f21370e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f21369d.hashCode();
        this.f21370e = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo19462q() {
        return false;
    }

    /* renamed from: r */
    public C10388e1<E> iterator() {
        return C4708e0.m21771k(this.f21369d);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return '[' + this.f21369d.toString() + ']';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C4766t<E> mo19466y() {
        return C4766t.m21979F(this.f21369d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo19467z() {
        return this.f21370e != 0;
    }

    C4680a1(E e, int i) {
        this.f21369d = e;
        this.f21370e = i;
    }
}
