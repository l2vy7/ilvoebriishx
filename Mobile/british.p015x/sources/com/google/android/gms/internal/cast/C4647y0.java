package com.google.android.gms.internal.cast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.cast.y0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C4647y0<E> extends C4645u0<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private static final C8581j1<Object> f21213c = new C8785w0(C8448b1.f43281f, 0);

    C4647y0() {
    }

    /* renamed from: j */
    static <E> C4647y0<E> m21386j(Object[] objArr) {
        return m21387q(objArr, objArr.length);
    }

    /* renamed from: q */
    static <E> C4647y0<E> m21387q(Object[] objArr, int i) {
        if (i == 0) {
            return C8448b1.f43281f;
        }
        return new C8448b1(objArr, i);
    }

    /* renamed from: t */
    public static <E> C8770v0<E> m21388t() {
        return new C8770v0<>(4);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@NullableDecl Object obj) {
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
                        if (C4637l0.m21333a(get(i), list.get(i))) {
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
                            if (!C4637l0.m21333a(it.next(), it2.next())) {
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

    /* renamed from: g */
    public final C4647y0<E> mo19100g() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo19104h(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public C4647y0<E> subList(int i, int i2) {
        C4640o0.m21340c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C8448b1.f43281f;
        }
        return new C8801x0(this, i, i3);
    }

    public final int indexOf(@NullableDecl Object obj) {
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

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@NullableDecl Object obj) {
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

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: r */
    public final C8581j1<E> listIterator(int i) {
        C4640o0.m21339b(i, size(), "index");
        if (isEmpty()) {
            return f21213c;
        }
        return new C8785w0(this, i);
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
