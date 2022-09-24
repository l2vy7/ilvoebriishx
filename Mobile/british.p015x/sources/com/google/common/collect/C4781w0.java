package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.w0 */
/* compiled from: ReverseOrdering */
final class C4781w0<T> extends C4755p0<T> implements Serializable {

    /* renamed from: b */
    final C4755p0<? super T> f21550b;

    C4781w0(C4755p0<? super T> p0Var) {
        this.f21550b = (C4755p0) C6073k.m26688k(p0Var);
    }

    public int compare(T t, T t2) {
        return this.f21550b.compare(t2, t);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4781w0) {
            return this.f21550b.equals(((C4781w0) obj).f21550b);
        }
        return false;
    }

    /* renamed from: f */
    public <S extends T> C4755p0<S> mo19836f() {
        return this.f21550b;
    }

    public int hashCode() {
        return -this.f21550b.hashCode();
    }

    public String toString() {
        return this.f21550b + ".reverse()";
    }
}
