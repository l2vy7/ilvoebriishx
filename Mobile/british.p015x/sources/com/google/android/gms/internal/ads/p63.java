package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class p63<E> extends k63<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private static final t83<Object> f20648c = new n63(e83.f31267f, 0);

    p63() {
    }

    /* renamed from: A */
    public static <E> p63<E> m20814A() {
        return e83.f31267f;
    }

    /* renamed from: D */
    public static <E> p63<E> m20815D(E e) {
        Object[] objArr = {e};
        c83.m20256b(objArr, 1);
        return m20822v(objArr, 1);
    }

    /* renamed from: E */
    public static <E> p63<E> m20816E(E e, E e2) {
        Object[] objArr = {e, e2};
        c83.m20256b(objArr, 2);
        return m20822v(objArr, 2);
    }

    /* renamed from: F */
    public static <E> p63<E> m20817F(E e, E e2, E e3) {
        Object[] objArr = {"2011", "1009", "3010"};
        c83.m20256b(objArr, 3);
        return m20822v(objArr, 3);
    }

    /* renamed from: G */
    public static <E> p63<E> m20818G(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        c83.m20256b(objArr, 5);
        return m20822v(objArr, 5);
    }

    /* renamed from: H */
    public static <E> p63<E> m20819H(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        c83.m20256b(objArr, 6);
        return m20822v(objArr, 6);
    }

    /* renamed from: t */
    public static <E> m63<E> m20820t() {
        return new m63<>(4);
    }

    /* renamed from: u */
    static <E> p63<E> m20821u(Object[] objArr) {
        return m20822v(objArr, objArr.length);
    }

    /* renamed from: v */
    static <E> p63<E> m20822v(Object[] objArr, int i) {
        if (i == 0) {
            return e83.f31267f;
        }
        return new e83(objArr, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Collection, java.lang.Iterable<? extends E>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E> com.google.android.gms.internal.ads.p63<E> m20823x(java.lang.Iterable<? extends E> r0) {
        /*
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.p63 r0 = m20824y(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p63.m20823x(java.lang.Iterable):com.google.android.gms.internal.ads.p63");
    }

    /* renamed from: y */
    public static <E> p63<E> m20824y(Collection<? extends E> collection) {
        if (collection instanceof k63) {
            p63<E> f = ((k63) collection).mo18099f();
            if (!f.mo18466j()) {
                return f;
            }
            Object[] array = f.toArray();
            return m20822v(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        c83.m20256b(array2, length);
        return m20822v(array2, length);
    }

    /* renamed from: z */
    public static <E> p63<E> m20825z(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        c83.m20256b(objArr, length);
        return m20822v(objArr, length);
    }

    /* renamed from: I */
    public final t83<E> listIterator(int i) {
        b43.m20205b(i, size(), "index");
        if (isEmpty()) {
            return f20648c;
        }
        return new n63(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo18346a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (x33.m21118a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!x33.m21118a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public final p63<E> mo18099f() {
        return this;
    }

    /* renamed from: g */
    public final s83<E> mo18100g() {
        return listIterator(0);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: r */
    public p63<E> subList(int i, int i2) {
        b43.m20209f(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return e83.f31267f;
        }
        return new o63(this, i, i3);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
