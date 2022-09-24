package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.cast.u0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C4645u0<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    private static final Object[] f21201b = new Object[0];

    C4645u0() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: c */
    public Object[] mo19128c() {
        return null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19130e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo19131f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public abstract C4647y0<E> mo19100g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo19104h(Object[] objArr, int i);

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f21201b);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] c = mo19128c();
            if (c != null) {
                return Arrays.copyOfRange(c, mo19130e(), mo19131f(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo19104h(tArr, 0);
        return tArr;
    }
}
