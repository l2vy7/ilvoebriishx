package com.google.common.collect;

import com.google.common.collect.C4789y;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.b0 */
/* compiled from: ImmutableSortedSet */
public abstract class C4684b0<E> extends C10385c0<E> implements NavigableSet<E>, C10384b1<E> {

    /* renamed from: d */
    final transient Comparator<? super E> f21379d;
    @LazyInit

    /* renamed from: e */
    transient C4684b0<E> f21380e;

    /* renamed from: com.google.common.collect.b0$a */
    /* compiled from: ImmutableSortedSet */
    public static final class C4685a<E> extends C4789y.C4790a<E> {

        /* renamed from: f */
        private final Comparator<? super E> f21381f;

        public C4685a(Comparator<? super E> comparator) {
            this.f21381f = (Comparator) C6073k.m26688k(comparator);
        }

        @CanIgnoreReturnValue
        /* renamed from: h */
        public C4685a<E> mo19503e(E e) {
            super.mo19503e(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public C4685a<E> mo19505i(E... eArr) {
            super.mo19952f(eArr);
            return this;
        }

        /* renamed from: j */
        public C4684b0<E> mo19506j() {
            C4684b0<E> H = C4684b0.m21667H(this.f21381f, this.f21506b, this.f21505a);
            this.f21506b = H.size();
            this.f21507c = true;
            return H;
        }
    }

    /* renamed from: com.google.common.collect.b0$b */
    /* compiled from: ImmutableSortedSet */
    private static class C4686b<E> implements Serializable {

        /* renamed from: b */
        final Comparator<? super E> f21382b;

        /* renamed from: c */
        final Object[] f21383c;

        public C4686b(Comparator<? super E> comparator, Object[] objArr) {
            this.f21382b = comparator;
            this.f21383c = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new C4685a(this.f21382b).mo19505i(this.f21383c).mo19506j();
        }
    }

    C4684b0(Comparator<? super E> comparator) {
        this.f21379d = comparator;
    }

    /* renamed from: H */
    static <E> C4684b0<E> m21667H(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return m21668L(comparator);
        }
        C10404o0.m47948c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator.compare(e, eArr[i2 - 1]) != 0) {
                eArr[i2] = e;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new C4775u0(C4766t.m21985u(eArr, i2), comparator);
    }

    /* renamed from: L */
    static <E> C4775u0<E> m21668L(Comparator<? super E> comparator) {
        if (C4755p0.m21938c().equals(comparator)) {
            return C4775u0.f21537g;
        }
        return new C4775u0<>(C4766t.m21978E(), comparator);
    }

    /* renamed from: Z */
    static int m21669Z(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public abstract C4684b0<E> mo19472I();

    /* renamed from: J */
    public abstract C10388e1<E> descendingIterator();

    /* renamed from: K */
    public C4684b0<E> descendingSet() {
        C4684b0<E> b0Var = this.f21380e;
        if (b0Var != null) {
            return b0Var;
        }
        C4684b0<E> I = mo19472I();
        this.f21380e = I;
        I.f21380e = this;
        return I;
    }

    /* renamed from: M */
    public C4684b0<E> headSet(E e) {
        return headSet(e, false);
    }

    /* renamed from: N */
    public C4684b0<E> headSet(E e, boolean z) {
        return mo19477O(C6073k.m26688k(e), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public abstract C4684b0<E> mo19477O(E e, boolean z);

    /* renamed from: P */
    public C4684b0<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    /* renamed from: Q */
    public C4684b0<E> subSet(E e, boolean z, E e2, boolean z2) {
        C6073k.m26688k(e);
        C6073k.m26688k(e2);
        C6073k.m26681d(this.f21379d.compare(e, e2) <= 0);
        return mo19480S(e, z, e2, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public abstract C4684b0<E> mo19480S(E e, boolean z, E e2, boolean z2);

    /* renamed from: U */
    public C4684b0<E> tailSet(E e) {
        return tailSet(e, true);
    }

    /* renamed from: V */
    public C4684b0<E> tailSet(E e, boolean z) {
        return mo19483W(C6073k.m26688k(e), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public abstract C4684b0<E> mo19483W(E e, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public int mo19484X(Object obj, Object obj2) {
        return m21669Z(this.f21379d, obj, obj2);
    }

    public E ceiling(E e) {
        return C4706d0.m21755b(tailSet(e, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.f21379d;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return C4708e0.m21768h(headSet(e, true).descendingIterator(), null);
    }

    public E higher(E e) {
        return C4706d0.m21755b(tailSet(e, false), null);
    }

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e) {
        return C4708e0.m21768h(headSet(e, false).descendingIterator(), null);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: r */
    public abstract C10388e1<E> iterator();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C4686b(this.f21379d, toArray());
    }
}
