package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class k63<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    private static final Object[] f20473b = new Object[0];

    k63() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo18346a(Object[] objArr, int i) {
        throw null;
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
    /* renamed from: c */
    public int mo18463c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@CheckForNull Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo18465e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public p63<E> mo18099f() {
        if (isEmpty()) {
            return p63.m20814A();
        }
        return p63.m20821u(toArray(f20473b));
    }

    /* renamed from: g */
    public abstract s83<E> iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo18466j();

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: q */
    public Object[] mo18467q() {
        return null;
    }

    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
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
        return toArray(f20473b);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] q = mo18467q();
            if (q != null) {
                return Arrays.copyOfRange(q, mo18465e(), mo18463c(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo18346a(tArr, 0);
        return tArr;
    }
}
