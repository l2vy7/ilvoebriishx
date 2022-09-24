package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ave */
/* compiled from: IMASDK */
final class ave extends avf<Comparable> implements Serializable {

    /* renamed from: a */
    static final ave f15786a = new ave();
    private static final long serialVersionUID = 0;

    private ave() {
    }

    private Object readResolve() {
        return f15786a;
    }

    /* renamed from: a */
    public final <S extends Comparable> avf<S> mo14605a() {
        return avn.f15809a;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        ars.m14627g(comparable);
        ars.m14627g(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
