package com.google.common.collect;

import java.io.Serializable;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.v0 */
/* compiled from: ReverseNaturalOrdering */
final class C10407v0 extends C4755p0<Comparable> implements Serializable {

    /* renamed from: b */
    static final C10407v0 f48815b = new C10407v0();

    private C10407v0() {
    }

    private Object readResolve() {
        return f48815b;
    }

    /* renamed from: f */
    public <S extends Comparable> C4755p0<S> mo19836f() {
        return C4755p0.m21938c();
    }

    /* renamed from: g */
    public int compare(Comparable comparable, Comparable comparable2) {
        C6073k.m26688k(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
