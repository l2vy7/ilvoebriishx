package com.google.common.collect;

import com.google.common.collect.C4757r;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.t */
/* compiled from: ImmutableList */
public abstract class C4766t<E> extends C4757r<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private static final C10390f1<Object> f21524c = new C4769b(C10406r0.f48812f, 0);

    /* renamed from: com.google.common.collect.t$c */
    /* compiled from: ImmutableList */
    private static class C4767c<E> extends C4766t<E> {

        /* renamed from: d */
        private final transient C4766t<E> f21525d;

        C4767c(C4766t<E> tVar) {
            this.f21525d = tVar;
        }

        /* renamed from: N */
        private int m21998N(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: O */
        private int m21999O(int i) {
            return size() - i;
        }

        /* renamed from: J */
        public C4766t<E> mo19867J() {
            return this.f21525d;
        }

        /* renamed from: L */
        public C4766t<E> subList(int i, int i2) {
            C6073k.m26692o(i, i2, size());
            return this.f21525d.subList(m21999O(i2), m21999O(i)).mo19867J();
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f21525d.contains(obj);
        }

        public E get(int i) {
            C6073k.m26686i(i, size());
            return this.f21525d.get(m21998N(i));
        }

        public int indexOf(@NullableDecl Object obj) {
            int lastIndexOf = this.f21525d.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m21998N(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C4766t.super.iterator();
        }

        public int lastIndexOf(@NullableDecl Object obj) {
            int indexOf = this.f21525d.indexOf(obj);
            if (indexOf >= 0) {
                return m21998N(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C4766t.super.listIterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo19462q() {
            return this.f21525d.mo19462q();
        }

        public int size() {
            return this.f21525d.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C4766t.super.listIterator(i);
        }
    }

    /* renamed from: com.google.common.collect.t$a */
    /* compiled from: ImmutableList */
    public static final class C4768a<E> extends C4757r.C4758a<E> {
        public C4768a() {
            this(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C4768a<E> mo19883e(E e) {
            super.mo19849b(e);
            return this;
        }

        /* renamed from: f */
        public C4766t<E> mo19884f() {
            this.f21507c = true;
            return C4766t.m21985u(this.f21505a, this.f21506b);
        }

        C4768a(int i) {
            super(i);
        }
    }

    /* renamed from: com.google.common.collect.t$b */
    /* compiled from: ImmutableList */
    static class C4769b<E> extends C10382a<E> {

        /* renamed from: d */
        private final C4766t<E> f21526d;

        C4769b(C4766t<E> tVar, int i) {
            super(tVar.size(), i);
            this.f21526d = tVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo19669a(int i) {
            return this.f21526d.get(i);
        }
    }

    /* renamed from: com.google.common.collect.t$d */
    /* compiled from: ImmutableList */
    static class C4770d implements Serializable {

        /* renamed from: b */
        final Object[] f21527b;

        C4770d(Object[] objArr) {
            this.f21527b = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return C4766t.m21989z(this.f21527b);
        }
    }

    /* renamed from: com.google.common.collect.t$e */
    /* compiled from: ImmutableList */
    class C4771e extends C4766t<E> {

        /* renamed from: d */
        final transient int f21528d;

        /* renamed from: e */
        final transient int f21529e;

        C4771e(int i, int i2) {
            this.f21528d = i;
            this.f21529e = i2;
        }

        /* renamed from: L */
        public C4766t<E> subList(int i, int i2) {
            C6073k.m26692o(i, i2, this.f21529e);
            C4766t tVar = C4766t.this;
            int i3 = this.f21528d;
            return tVar.subList(i + i3, i2 + i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Object[] mo19841f() {
            return C4766t.this.mo19841f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo19842g() {
            return C4766t.this.mo19843j() + this.f21528d + this.f21529e;
        }

        public E get(int i) {
            C6073k.m26686i(i, this.f21529e);
            return C4766t.this.get(i + this.f21528d);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C4766t.super.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo19843j() {
            return C4766t.this.mo19843j() + this.f21528d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C4766t.super.listIterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo19462q() {
            return true;
        }

        public int size() {
            return this.f21529e;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C4766t.super.listIterator(i);
        }
    }

    C4766t() {
    }

    /* renamed from: E */
    public static <E> C4766t<E> m21978E() {
        return C10406r0.f48812f;
    }

    /* renamed from: F */
    public static <E> C4766t<E> m21979F(E e) {
        return m21987x(e);
    }

    /* renamed from: G */
    public static <E> C4766t<E> m21980G(E e, E e2) {
        return m21987x(e, e2);
    }

    /* renamed from: H */
    public static <E> C4766t<E> m21981H(E e, E e2, E e3, E e4, E e5) {
        return m21987x(e, e2, e3, e4, e5);
    }

    /* renamed from: I */
    public static <E> C4766t<E> m21982I(E e, E e2, E e3, E e4, E e5, E e6) {
        return m21987x(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: K */
    public static <E> C4766t<E> m21983K(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C6073k.m26688k(comparator);
        Object[] e = C4706d0.m21758e(iterable);
        C10404o0.m47947b(e);
        Arrays.sort(e, comparator);
        return m21984t(e);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: t */
    static <E> C4766t<E> m21984t(Object[] objArr) {
        return m21985u(objArr, objArr.length);
    }

    /* renamed from: u */
    static <E> C4766t<E> m21985u(Object[] objArr, int i) {
        if (i == 0) {
            return m21978E();
        }
        return new C10406r0(objArr, i);
    }

    /* renamed from: v */
    public static <E> C4768a<E> m21986v() {
        return new C4768a<>();
    }

    /* renamed from: x */
    private static <E> C4766t<E> m21987x(Object... objArr) {
        return m21984t(C10404o0.m47947b(objArr));
    }

    /* renamed from: y */
    public static <E> C4766t<E> m21988y(Collection<? extends E> collection) {
        if (!(collection instanceof C4757r)) {
            return m21987x(collection.toArray());
        }
        C4766t<E> c = ((C4757r) collection).mo19839c();
        return c.mo19462q() ? m21984t(c.toArray()) : c;
    }

    /* renamed from: z */
    public static <E> C4766t<E> m21989z(E[] eArr) {
        if (eArr.length == 0) {
            return m21978E();
        }
        return m21987x((Object[]) eArr.clone());
    }

    /* renamed from: A */
    public C10390f1<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: D */
    public C10390f1<E> listIterator(int i) {
        C6073k.m26690m(i, size());
        if (isEmpty()) {
            return f21524c;
        }
        return new C4769b(this, i);
    }

    /* renamed from: J */
    public C4766t<E> mo19867J() {
        return size() <= 1 ? this : new C4767c(this);
    }

    /* renamed from: L */
    public C4766t<E> subList(int i, int i2) {
        C6073k.m26692o(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m21978E();
        }
        return mo19869M(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public C4766t<E> mo19869M(int i, int i2) {
        return new C4771e(i, i2 - i);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final C4766t<E> mo19839c() {
        return this;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19459e(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(@NullableDecl Object obj) {
        return C4715g0.m21786a(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return C4715g0.m21787b(this, obj);
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return C4715g0.m21789d(this, obj);
    }

    /* renamed from: r */
    public C10388e1<E> iterator() {
        return listIterator();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C4770d(toArray());
    }
}
