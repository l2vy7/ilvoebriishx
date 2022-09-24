package com.google.common.collect;

import com.google.common.collect.C4766t;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.r */
/* compiled from: ImmutableCollection */
public abstract class C4757r<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    private static final Object[] f21504b = new Object[0];

    /* renamed from: com.google.common.collect.r$a */
    /* compiled from: ImmutableCollection */
    static abstract class C4758a<E> extends C4759b<E> {

        /* renamed from: a */
        Object[] f21505a;

        /* renamed from: b */
        int f21506b = 0;

        /* renamed from: c */
        boolean f21507c;

        C4758a(int i) {
            C10393j.m47930b(i, "initialCapacity");
            this.f21505a = new Object[i];
        }

        /* renamed from: d */
        private void m21953d(int i) {
            Object[] objArr = this.f21505a;
            if (objArr.length < i) {
                this.f21505a = Arrays.copyOf(objArr, C4759b.m21956a(objArr.length, i));
                this.f21507c = false;
            } else if (this.f21507c) {
                this.f21505a = (Object[]) objArr.clone();
                this.f21507c = false;
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C4758a<E> mo19849b(E e) {
            C6073k.m26688k(e);
            m21953d(this.f21506b + 1);
            Object[] objArr = this.f21505a;
            int i = this.f21506b;
            this.f21506b = i + 1;
            objArr[i] = e;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C4759b<E> mo19850c(E... eArr) {
            C10404o0.m47947b(eArr);
            m21953d(this.f21506b + eArr.length);
            System.arraycopy(eArr, 0, this.f21505a, this.f21506b, eArr.length);
            this.f21506b += eArr.length;
            return this;
        }
    }

    /* renamed from: com.google.common.collect.r$b */
    /* compiled from: ImmutableCollection */
    public static abstract class C4759b<E> {
        C4759b() {
        }

        /* renamed from: a */
        static int m21956a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    C4757r() {
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public C4766t<E> mo19839c() {
        return isEmpty() ? C4766t.m21978E() : C4766t.m21984t(toArray());
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: e */
    public int mo19459e(Object[] objArr, int i) {
        C10388e1 r = iterator();
        while (r.hasNext()) {
            objArr[i] = r.next();
            i++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo19841f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo19842g() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo19843j() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo19462q();

    /* renamed from: r */
    public abstract C10388e1<E> iterator();

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f21504b);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C4766t.C4770d(toArray());
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        C6073k.m26688k(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] f = mo19841f();
            if (f != null) {
                return C10405q0.m47950a(f, mo19843j(), mo19842g(), tArr);
            }
            tArr = C10404o0.m47949d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo19459e(tArr, 0);
        return tArr;
    }
}
