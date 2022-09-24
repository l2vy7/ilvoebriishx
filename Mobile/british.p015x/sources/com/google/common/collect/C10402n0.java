package com.google.common.collect;

import java.io.Serializable;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.n0 */
/* compiled from: NaturalOrdering */
final class C10402n0 extends C4755p0<Comparable> implements Serializable {

    /* renamed from: b */
    static final C10402n0 f48810b = new C10402n0();

    private C10402n0() {
    }

    private Object readResolve() {
        return f48810b;
    }

    /* renamed from: f */
    public <S extends Comparable> C4755p0<S> mo19836f() {
        return C10407v0.f48815b;
    }

    /* renamed from: g */
    public int compare(Comparable comparable, Comparable comparable2) {
        C6073k.m26688k(comparable);
        C6073k.m26688k(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
