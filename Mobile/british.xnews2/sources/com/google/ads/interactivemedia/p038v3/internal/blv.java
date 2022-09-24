package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.blv */
/* compiled from: IMASDK */
final class blv<E> extends bje<E> implements RandomAccess {

    /* renamed from: a */
    private static final blv<Object> f16666a;

    /* renamed from: b */
    private E[] f16667b;

    /* renamed from: c */
    private int f16668c;

    static {
        blv<Object> blv = new blv<>(new Object[0], 0);
        f16666a = blv;
        blv.mo15178b();
    }

    blv() {
        this(new Object[10], 0);
    }

    /* renamed from: d */
    public static <E> blv<E> m16506d() {
        return f16666a;
    }

    /* renamed from: f */
    private final void m16507f(int i) {
        if (i < 0 || i >= this.f16668c) {
            throw new IndexOutOfBoundsException(m16508g(i));
        }
    }

    /* renamed from: g */
    private final String m16508g(int i) {
        int i2 = this.f16668c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void add(int i, E e) {
        int i2;
        mo15179c();
        if (i < 0 || i > (i2 = this.f16668c)) {
            throw new IndexOutOfBoundsException(m16508g(i));
        }
        E[] eArr = this.f16667b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f16667b, i, eArr2, i + 1, this.f16668c - i);
            this.f16667b = eArr2;
        }
        this.f16667b[i] = e;
        this.f16668c++;
        this.modCount++;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bkq mo15190e(int i) {
        if (i >= this.f16668c) {
            return new blv(Arrays.copyOf(this.f16667b, i), this.f16668c);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        m16507f(i);
        return this.f16667b[i];
    }

    public final E remove(int i) {
        mo15179c();
        m16507f(i);
        E[] eArr = this.f16667b;
        E e = eArr[i];
        int i2 = this.f16668c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f16668c--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo15179c();
        m16507f(i);
        E[] eArr = this.f16667b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f16668c;
    }

    private blv(E[] eArr, int i) {
        this.f16667b = eArr;
        this.f16668c = i;
    }

    public final boolean add(E e) {
        mo15179c();
        int i = this.f16668c;
        E[] eArr = this.f16667b;
        if (i == eArr.length) {
            this.f16667b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f16667b;
        int i2 = this.f16668c;
        this.f16668c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
