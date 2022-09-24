package com.google.common.collect;

import com.google.common.collect.C4757r;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.y */
/* compiled from: ImmutableSet */
public abstract class C4789y<E> extends C4757r<E> implements Set<E> {
    @NullableDecl
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient C4766t<E> f21567c;

    /* renamed from: com.google.common.collect.y$a */
    /* compiled from: ImmutableSet */
    public static class C4790a<E> extends C4757r.C4758a<E> {
        @NullableDecl

        /* renamed from: d */
        Object[] f21568d;

        /* renamed from: e */
        private int f21569e;

        public C4790a() {
            super(4);
        }

        /* renamed from: g */
        private void m22110g(E e) {
            int length = this.f21568d.length - 1;
            int hashCode = e.hashCode();
            int b = C4756q.m21944b(hashCode);
            while (true) {
                int i = b & length;
                Object[] objArr = this.f21568d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f21569e += hashCode;
                    super.mo19849b(e);
                    return;
                } else if (!obj.equals(e)) {
                    b = i + 1;
                } else {
                    return;
                }
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C4790a<E> mo19503e(E e) {
            C6073k.m26688k(e);
            if (this.f21568d == null || C4789y.m22102t(this.f21506b) > this.f21568d.length) {
                this.f21568d = null;
                super.mo19849b(e);
                return this;
            }
            m22110g(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public C4790a<E> mo19952f(E... eArr) {
            if (this.f21568d != null) {
                for (E e : eArr) {
                    mo19503e(e);
                }
            } else {
                super.mo19850c(eArr);
            }
            return this;
        }
    }

    /* renamed from: com.google.common.collect.y$b */
    /* compiled from: ImmutableSet */
    private static class C4791b implements Serializable {

        /* renamed from: b */
        final Object[] f21570b;

        C4791b(Object[] objArr) {
            this.f21570b = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return C4789y.m22105x(this.f21570b);
        }
    }

    C4789y() {
    }

    /* renamed from: A */
    public static <E> C4789y<E> m22097A() {
        return C4772t0.f21531i;
    }

    /* renamed from: D */
    public static <E> C4789y<E> m22098D(E e) {
        return new C4680a1(e);
    }

    /* renamed from: E */
    public static <E> C4789y<E> m22099E(E e, E e2) {
        return m22103u(2, e, e2);
    }

    /* renamed from: F */
    public static <E> C4789y<E> m22100F(E e, E e2, E e3) {
        return m22103u(3, e, e2, e3);
    }

    /* renamed from: G */
    private static boolean m22101G(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: t */
    static int m22102t(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C6073k.m26682e(z, "collection too large");
            return 1073741824;
        }
    }

    /* renamed from: u */
    private static <E> C4789y<E> m22103u(int i, Object... objArr) {
        if (i == 0) {
            return m22097A();
        }
        if (i == 1) {
            return m22098D(objArr[0]);
        }
        int t = m22102t(i);
        Object[] objArr2 = new Object[t];
        int i2 = t - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a = C10404o0.m47946a(objArr[i5], i5);
            int hashCode = a.hashCode();
            int b = C4756q.m21944b(hashCode);
            while (true) {
                int i6 = b & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    objArr[i4] = a;
                    objArr2[i6] = a;
                    i3 += hashCode;
                    i4++;
                    break;
                } else if (obj.equals(a)) {
                    break;
                } else {
                    b++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new C4680a1(objArr[0], i3);
        }
        if (m22102t(i4) < t / 2) {
            return m22103u(i4, objArr);
        }
        if (m22101G(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C4772t0(objArr, i3, objArr2, i2, i4);
    }

    /* renamed from: v */
    public static <E> C4789y<E> m22104v(Collection<? extends E> collection) {
        if ((collection instanceof C4789y) && !(collection instanceof SortedSet)) {
            C4789y<E> yVar = (C4789y) collection;
            if (!yVar.mo19462q()) {
                return yVar;
            }
        }
        Object[] array = collection.toArray();
        return m22103u(array.length, array);
    }

    /* renamed from: x */
    public static <E> C4789y<E> m22105x(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m22097A();
        }
        if (length != 1) {
            return m22103u(eArr.length, (Object[]) eArr.clone());
        }
        return m22098D(eArr[0]);
    }

    /* renamed from: c */
    public C4766t<E> mo19839c() {
        C4766t<E> tVar = this.f21567c;
        if (tVar != null) {
            return tVar;
        }
        C4766t<E> y = mo19466y();
        this.f21567c = y;
        return y;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4789y) || !mo19467z() || !((C4789y) obj).mo19467z() || hashCode() == obj.hashCode()) {
            return C4798z0.m22156a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C4798z0.m22157b(this);
    }

    /* renamed from: r */
    public abstract C10388e1<E> iterator();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C4791b(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C4766t<E> mo19466y() {
        return C4766t.m21984t(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo19467z() {
        return false;
    }
}
