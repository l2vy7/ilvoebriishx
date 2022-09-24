package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6068f;

/* renamed from: com.google.common.collect.p0 */
/* compiled from: Ordering */
public abstract class C4755p0<T> implements Comparator<T> {
    protected C4755p0() {
    }

    /* renamed from: a */
    public static <T> C4755p0<T> m21937a(Comparator<T> comparator) {
        return comparator instanceof C4755p0 ? (C4755p0) comparator : new C4741m(comparator);
    }

    /* renamed from: c */
    public static <C extends Comparable> C4755p0<C> m21938c() {
        return C10402n0.f48810b;
    }

    /* renamed from: b */
    public <E extends T> C4766t<E> mo19833b(Iterable<E> iterable) {
        return C4766t.m21983K(this, iterable);
    }

    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public <T2 extends T> C4755p0<Map.Entry<T2, ?>> mo19834d() {
        return mo19835e(C4718i0.m21798d());
    }

    /* renamed from: e */
    public <F> C4755p0<F> mo19835e(C6068f<F, ? extends T> fVar) {
        return new C4717i(fVar, this);
    }

    /* renamed from: f */
    public <S extends T> C4755p0<S> mo19836f() {
        return new C4781w0(this);
    }
}
