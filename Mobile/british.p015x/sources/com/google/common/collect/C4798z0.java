package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.z0 */
/* compiled from: Sets */
public final class C4798z0 {

    /* renamed from: com.google.common.collect.z0$a */
    /* compiled from: Sets */
    static class C4799a extends C4802c<E> {

        /* renamed from: b */
        final /* synthetic */ Set f21583b;

        /* renamed from: c */
        final /* synthetic */ Set f21584c;

        /* renamed from: com.google.common.collect.z0$a$a */
        /* compiled from: Sets */
        class C4800a extends C4681b<E> {

            /* renamed from: d */
            final Iterator<E> f21585d;

            C4800a() {
                this.f21585d = C4799a.this.f21583b.iterator();
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public E mo19468a() {
                while (this.f21585d.hasNext()) {
                    E next = this.f21585d.next();
                    if (C4799a.this.f21584c.contains(next)) {
                        return next;
                    }
                }
                return mo19469b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4799a(Set set, Set set2) {
            super((C10411y0) null);
            this.f21583b = set;
            this.f21584c = set2;
        }

        /* renamed from: c */
        public C10388e1<E> iterator() {
            return new C4800a();
        }

        public boolean contains(Object obj) {
            return this.f21583b.contains(obj) && this.f21584c.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f21583b.containsAll(collection) && this.f21584c.containsAll(collection);
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f21584c, this.f21583b);
        }

        public int size() {
            int i = 0;
            for (Object contains : this.f21583b) {
                if (this.f21584c.contains(contains)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: com.google.common.collect.z0$b */
    /* compiled from: Sets */
    static abstract class C4801b<E> extends AbstractSet<E> {
        C4801b() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C4798z0.m22162g(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C6073k.m26688k(collection));
        }
    }

    /* renamed from: com.google.common.collect.z0$c */
    /* compiled from: Sets */
    public static abstract class C4802c<E> extends AbstractSet<E> {
        /* synthetic */ C4802c(C10411y0 y0Var) {
            this();
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

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

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

        private C4802c() {
        }
    }

    /* renamed from: a */
    static boolean m22156a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    static int m22157b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    /* renamed from: c */
    public static <E> C4802c<E> m22158c(Set<E> set, Set<?> set2) {
        C6073k.m26689l(set, "set1");
        C6073k.m26689l(set2, "set2");
        return new C4799a(set, set2);
    }

    /* renamed from: d */
    public static <E> HashSet<E> m22159d() {
        return new HashSet<>();
    }

    /* renamed from: e */
    public static <E> HashSet<E> m22160e(int i) {
        return new HashSet<>(C4718i0.m21795a(i));
    }

    /* renamed from: f */
    public static <E> Set<E> m22161f() {
        return Collections.newSetFromMap(C4718i0.m21800f());
    }

    /* renamed from: g */
    static boolean m22162g(Set<?> set, Collection<?> collection) {
        C6073k.m26688k(collection);
        if (collection instanceof C10401m0) {
            collection = ((C10401m0) collection).elementSet();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m22163h(set, collection.iterator());
        }
        return C4708e0.m21770j(set.iterator(), collection);
    }

    /* renamed from: h */
    static boolean m22163h(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
