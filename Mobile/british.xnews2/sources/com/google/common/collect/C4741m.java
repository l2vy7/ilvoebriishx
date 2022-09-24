package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.m */
/* compiled from: ComparatorOrdering */
final class C4741m<T> extends C4755p0<T> implements Serializable {

    /* renamed from: b */
    final Comparator<T> f21466b;

    C4741m(Comparator<T> comparator) {
        this.f21466b = (Comparator) C6073k.m26688k(comparator);
    }

    public int compare(T t, T t2) {
        return this.f21466b.compare(t, t2);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4741m) {
            return this.f21466b.equals(((C4741m) obj).f21466b);
        }
        return false;
    }

    public int hashCode() {
        return this.f21466b.hashCode();
    }

    public String toString() {
        return this.f21466b.toString();
    }
}
