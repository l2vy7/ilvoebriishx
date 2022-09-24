package com.google.ads.interactivemedia.p039v3.internal;

import android.annotation.SuppressLint;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avr */
/* compiled from: IMASDK */
public final class avr {
    /* renamed from: a */
    public static <E> HashSet<E> m14959a() {
        return new HashSet<>();
    }

    /* renamed from: b */
    public static <E> HashSet<E> m14960b(int i) {
        return new HashSet<>(m14968j(i));
    }

    /* renamed from: c */
    static int m14961c(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: d */
    static boolean m14962d(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        if (true != z) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    static boolean m14963e(Set<?> set, Collection<?> collection) {
        ars.m14627g(collection);
        if (collection instanceof avd) {
            collection = ((avd) collection).mo14604a();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m14962d(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        ars.m14627g(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: f */
    static <T> avp<T> m14964f(Class<T> cls, String str) {
        try {
            return new avp<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    static <T> T[] m14965g(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: h */
    static void m14966h(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("at index ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: i */
    public static <K, V> HashMap<K, V> m14967i(int i) {
        return new HashMap<>(m14968j(i));
    }

    /* renamed from: j */
    static int m14968j(int i) {
        if (i < 3) {
            aup.m14884o(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: k */
    public static <K, V> Map.Entry<K, V> m14969k(K k, V v) {
        return new atu(k, v);
    }

    /* renamed from: l */
    static <V> V m14970l(Map<?, V> map, Object obj) {
        ars.m14627g(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static int m14971m(int i) {
        return i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: n */
    public static int m14972n(int i) {
        return i & 7;
    }
}
