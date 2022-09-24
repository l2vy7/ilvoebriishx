package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.c1 */
/* compiled from: SortedIterables */
final class C10386c1 {
    /* renamed from: a */
    public static <E> Comparator<? super E> m47926a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? C4755p0.m21938c() : comparator;
    }

    /* renamed from: b */
    public static boolean m47927b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C6073k.m26688k(comparator);
        C6073k.m26688k(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m47926a((SortedSet) iterable);
        } else if (!(iterable instanceof C10384b1)) {
            return false;
        } else {
            comparator2 = ((C10384b1) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
