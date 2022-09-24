package com.startapp;

import java.util.Comparator;

/* renamed from: com.startapp.y1 */
/* compiled from: Sta */
public class C12441y1<T> implements Comparator<T> {

    /* renamed from: a */
    public final Comparator<T> f55150a;

    /* renamed from: b */
    public final Comparator<T> f55151b;

    public C12441y1(Comparator<T> comparator, Comparator<T> comparator2) {
        this.f55150a = comparator;
        this.f55151b = comparator2;
    }

    public int compare(T t, T t2) {
        int compare = this.f55150a.compare(t, t2);
        return compare == 0 ? this.f55151b.compare(t, t2) : compare;
    }
}
