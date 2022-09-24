package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.d0 */
/* compiled from: Iterables */
public final class C4706d0 {
    /* renamed from: a */
    private static <E> Collection<E> m21754a(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C4715g0.m21792g(iterable.iterator());
    }

    @NullableDecl
    /* renamed from: b */
    public static <T> T m21755b(Iterable<? extends T> iterable, @NullableDecl T t) {
        return C4708e0.m21768h(iterable.iterator(), t);
    }

    /* renamed from: c */
    public static <T> T m21756c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return C4708e0.m21767g(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m21757d(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    private static <T> T m21757d(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: e */
    static Object[] m21758e(Iterable<?> iterable) {
        return m21754a(iterable).toArray();
    }

    /* renamed from: f */
    static <T> T[] m21759f(Iterable<? extends T> iterable, T[] tArr) {
        return m21754a(iterable).toArray(tArr);
    }

    /* renamed from: g */
    public static String m21760g(Iterable<?> iterable) {
        return C4708e0.m21772l(iterable.iterator());
    }
}
