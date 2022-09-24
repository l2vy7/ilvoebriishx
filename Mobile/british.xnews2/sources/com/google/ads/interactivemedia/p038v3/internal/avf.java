package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avf */
/* compiled from: IMASDK */
public abstract class avf<T> implements Comparator<T> {
    protected avf() {
    }

    /* renamed from: b */
    public static <C extends Comparable> avf<C> m14921b() {
        return ave.f15786a;
    }

    /* renamed from: c */
    public static <T> avf<T> m14922c(Comparator<T> comparator) {
        if (comparator instanceof avf) {
            return (avf) comparator;
        }
        return new atc(comparator);
    }

    /* renamed from: a */
    public <S extends T> avf<S> mo14605a() {
        return new avo(this);
    }

    public abstract int compare(T t, T t2);
}
