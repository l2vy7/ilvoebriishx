package com.google.ads.interactivemedia.p038v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atz */
/* compiled from: IMASDK */
public abstract class atz<E> extends att<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    private static final avv<Object> f15745a = new atw(avg.f15787a, 0);

    atz() {
    }

    /* renamed from: i */
    public static <E> atz<E> m14807i() {
        return avg.f15787a;
    }

    /* renamed from: j */
    public static <E> atz<E> m14808j(E e) {
        return m14816t(e);
    }

    /* renamed from: k */
    public static <E> atz<E> m14809k(E e, E e2) {
        return m14816t(e, e2);
    }

    /* renamed from: l */
    public static <E> atz<E> m14810l(E e, E e2, E e3, E e4, E e5) {
        return m14816t(e, e2, e3, e4, e5);
    }

    /* renamed from: m */
    public static <E> atz<E> m14811m(Collection<? extends E> collection) {
        if (!(collection instanceof att)) {
            return m14816t(collection.toArray());
        }
        atz<E> e = ((att) collection).mo14503e();
        return e.mo14504f() ? m14813o(e.toArray()) : e;
    }

    /* renamed from: n */
    public static <E> atz<E> m14812n(E[] eArr) {
        if (eArr.length == 0) {
            return avg.f15787a;
        }
        return m14816t((Object[]) eArr.clone());
    }

    /* renamed from: o */
    static <E> atz<E> m14813o(Object[] objArr) {
        return m14814p(objArr, objArr.length);
    }

    /* renamed from: p */
    static <E> atz<E> m14814p(Object[] objArr, int i) {
        if (i == 0) {
            return avg.f15787a;
        }
        return new avg(objArr, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: s */
    public static <E> atv<E> m14815s() {
        return new atv<>();
    }

    /* renamed from: t */
    private static <E> atz<E> m14816t(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            avr.m14966h(objArr[i], i);
        }
        return m14813o(objArr);
    }

    /* renamed from: a */
    public final avu<E> mo14495a() {
        return listIterator();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: e */
    public final atz<E> mo14503e() {
        return this;
    }

    public final boolean equals(Object obj) {
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
                        if (arq.m14618b(get(i), list.get(i))) {
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
                            if (!arq.m14618b(it.next(), it2.next())) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo14505g(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: h */
    public atz<E> subList(int i, int i2) {
        ars.m14625e(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return avg.f15787a;
        }
        return new aty(this, i, i3);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
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

    public final int lastIndexOf(Object obj) {
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

    /* renamed from: q */
    public final avv<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: r */
    public final avv<E> listIterator(int i) {
        ars.m14628h(i, size());
        if (isEmpty()) {
            return f15745a;
        }
        return new atw(this, i);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new atx(toArray());
    }
}
