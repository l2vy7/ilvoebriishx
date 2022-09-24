package com.google.common.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6069h;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.g0 */
/* compiled from: Lists */
public final class C4715g0 {
    /* renamed from: a */
    static boolean m21786a(List<?> list, @NullableDecl Object obj) {
        if (obj == C6073k.m26688k(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C4708e0.m21763c(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C6069h.m26674a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static int m21787b(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return m21788c(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C6069h.m26674a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static int m21788c(List<?> list, @NullableDecl Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: d */
    static int m21789d(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return m21790e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C6069h.m26674a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m21790e(List<?> list, @NullableDecl Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static <E> ArrayList<E> m21791f() {
        return new ArrayList<>();
    }

    /* renamed from: g */
    public static <E> ArrayList<E> m21792g(Iterator<? extends E> it) {
        ArrayList<E> f = m21791f();
        C4708e0.m21761a(f, it);
        return f;
    }
}
