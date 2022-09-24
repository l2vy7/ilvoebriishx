package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.y2 */
final class C9038y2<E> extends C9000t<E> {

    /* renamed from: d */
    private static final C9038y2<Object> f44799d;

    /* renamed from: c */
    private final List<E> f44800c;

    static {
        C9038y2<Object> y2Var = new C9038y2<>();
        f44799d = y2Var;
        y2Var.zzv();
    }

    C9038y2() {
        this(new ArrayList(10));
    }

    private C9038y2(List<E> list) {
        this.f44800c = list;
    }

    /* renamed from: e */
    public static <E> C9038y2<E> m42505e() {
        return f44799d;
    }

    public final void add(int i, E e) {
        mo37158c();
        this.f44800c.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f44800c.get(i);
    }

    /* renamed from: o */
    public final /* synthetic */ C8934k1 mo36878o(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f44800c);
            return new C9038y2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo37158c();
        E remove = this.f44800c.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo37158c();
        E e2 = this.f44800c.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f44800c.size();
    }
}
