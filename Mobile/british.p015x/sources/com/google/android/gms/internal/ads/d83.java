package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class d83<T> implements Comparator<T> {
    protected d83() {
    }

    /* renamed from: b */
    public static <T> d83<T> m31323b(Comparator<T> comparator) {
        if (comparator instanceof d83) {
            return (d83) comparator;
        }
        return new a63(comparator);
    }

    /* renamed from: c */
    public static <C extends Comparable> d83<C> m31324c() {
        return b83.f29930b;
    }

    /* renamed from: a */
    public <S extends T> d83<S> mo18552a() {
        return new m83(this);
    }

    public abstract int compare(T t, T t2);
}
