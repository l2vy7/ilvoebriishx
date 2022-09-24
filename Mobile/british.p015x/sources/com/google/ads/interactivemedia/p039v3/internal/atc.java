package com.google.ads.interactivemedia.p039v3.internal;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atc */
/* compiled from: IMASDK */
final class atc<T> extends avf<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator<T> f15695a;

    atc(Comparator<T> comparator) {
        ars.m14627g(comparator);
        this.f15695a = comparator;
    }

    public final int compare(T t, T t2) {
        return this.f15695a.compare(t, t2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atc) {
            return this.f15695a.equals(((atc) obj).f15695a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15695a.hashCode();
    }

    public final String toString() {
        return this.f15695a.toString();
    }
}
