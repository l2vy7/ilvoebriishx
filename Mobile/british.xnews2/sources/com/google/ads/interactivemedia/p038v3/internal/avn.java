package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avn */
/* compiled from: IMASDK */
final class avn extends avf<Comparable> implements Serializable {

    /* renamed from: a */
    static final avn f15809a = new avn();
    private static final long serialVersionUID = 0;

    private avn() {
    }

    private Object readResolve() {
        return f15809a;
    }

    /* renamed from: a */
    public final <S extends Comparable> avf<S> mo14605a() {
        return ave.f15786a;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        ars.m14627g(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
