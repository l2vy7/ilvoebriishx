package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.u0 */
/* compiled from: RegularImmutableSortedSet */
final class C4775u0<E> extends C4684b0<E> {

    /* renamed from: g */
    static final C4775u0<Comparable> f21537g = new C4775u0<>(C4766t.m21978E(), C4755p0.m21938c());

    /* renamed from: f */
    final transient C4766t<E> f21538f;

    C4775u0(C4766t<E> tVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f21538f = tVar;
    }

    /* renamed from: e0 */
    private int m22028e0(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f21538f, obj, mo19900f0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public C4684b0<E> mo19472I() {
        Comparator<? super E> reverseOrder = Collections.reverseOrder(this.f21379d);
        if (isEmpty()) {
            return C4684b0.m21668L(reverseOrder);
        }
        return new C4775u0(this.f21538f.mo19867J(), reverseOrder);
    }

    /* renamed from: J */
    public C10388e1<E> descendingIterator() {
        return this.f21538f.mo19867J().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public C4684b0<E> mo19477O(E e, boolean z) {
        return mo19895a0(0, mo19896c0(e, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public C4684b0<E> mo19480S(E e, boolean z, E e2, boolean z2) {
        return mo19483W(e, z).mo19477O(e2, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public C4684b0<E> mo19483W(E e, boolean z) {
        return mo19895a0(mo19898d0(e, z), size());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C4775u0<E> mo19895a0(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C4775u0<>(this.f21538f.subList(i, i2), this.f21379d);
        }
        return C4684b0.m21668L(this.f21379d);
    }

    /* renamed from: c */
    public C4766t<E> mo19839c() {
        return this.f21538f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public int mo19896c0(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f21538f, C6073k.m26688k(e), comparator());
        if (binarySearch >= 0) {
            return z ? binarySearch + 1 : binarySearch;
        }
        return binarySearch ^ -1;
    }

    public E ceiling(E e) {
        int d0 = mo19898d0(e, true);
        if (d0 == size()) {
            return null;
        }
        return this.f21538f.get(d0);
    }

    public boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m22028e0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof C10401m0) {
            collection = ((C10401m0) collection).elementSet();
        }
        if (!C10386c1.m47927b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C10388e1 r = iterator();
        Iterator<?> it = collection.iterator();
        if (!r.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = r.next();
        while (true) {
            try {
                int X = mo19484X(next2, next);
                if (X < 0) {
                    if (!r.hasNext()) {
                        return false;
                    }
                    next2 = r.next();
                } else if (X == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (X > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public int mo19898d0(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f21538f, C6073k.m26688k(e), comparator());
        if (binarySearch >= 0) {
            return z ? binarySearch : binarySearch + 1;
        }
        return binarySearch ^ -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19459e(Object[] objArr, int i) {
        return this.f21538f.mo19459e(objArr, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator<? super E> r1 = r5.f21379d
            boolean r1 = com.google.common.collect.C10386c1.m47927b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            com.google.common.collect.e1 r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.mo19484X(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C4775u0.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo19841f() {
        return this.f21538f.mo19841f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public Comparator<Object> mo19900f0() {
        return this.f21379d;
    }

    public E first() {
        if (!isEmpty()) {
            return this.f21538f.get(0);
        }
        throw new NoSuchElementException();
    }

    public E floor(E e) {
        int c0 = mo19896c0(e, true) - 1;
        if (c0 == -1) {
            return null;
        }
        return this.f21538f.get(c0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo19842g() {
        return this.f21538f.mo19842g();
    }

    public E higher(E e) {
        int d0 = mo19898d0(e, false);
        if (d0 == size()) {
            return null;
        }
        return this.f21538f.get(d0);
    }

    /* access modifiers changed from: package-private */
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.f21538f, obj, mo19900f0());
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo19843j() {
        return this.f21538f.mo19843j();
    }

    public E last() {
        if (!isEmpty()) {
            return this.f21538f.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e) {
        int c0 = mo19896c0(e, false) - 1;
        if (c0 == -1) {
            return null;
        }
        return this.f21538f.get(c0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo19462q() {
        return this.f21538f.mo19462q();
    }

    /* renamed from: r */
    public C10388e1<E> iterator() {
        return this.f21538f.iterator();
    }

    public int size() {
        return this.f21538f.size();
    }
}
