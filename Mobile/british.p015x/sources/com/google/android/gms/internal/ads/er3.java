package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class er3<E> extends mn3<E> implements RandomAccess {

    /* renamed from: e */
    private static final er3<Object> f31487e;

    /* renamed from: c */
    private E[] f31488c;

    /* renamed from: d */
    private int f31489d;

    static {
        er3<Object> er3 = new er3<>(new Object[0], 0);
        f31487e = er3;
        er3.zzb();
    }

    private er3(E[] eArr, int i) {
        this.f31488c = eArr;
        this.f31489d = i;
    }

    /* renamed from: e */
    public static <E> er3<E> m31921e() {
        return f31487e;
    }

    /* renamed from: f */
    private final String m31922f(int i) {
        int i2 = this.f31489d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m31923k(int i) {
        if (i < 0 || i >= this.f31489d) {
            throw new IndexOutOfBoundsException(m31922f(i));
        }
    }

    public final void add(int i, E e) {
        int i2;
        mo33571c();
        if (i < 0 || i > (i2 = this.f31489d)) {
            throw new IndexOutOfBoundsException(m31922f(i));
        }
        E[] eArr = this.f31488c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f31488c, i, eArr2, i + 1, this.f31489d - i);
            this.f31488c = eArr2;
        }
        this.f31488c[i] = e;
        this.f31489d++;
        this.modCount++;
    }

    public final E get(int i) {
        m31923k(i);
        return this.f31488c[i];
    }

    public final E remove(int i) {
        mo33571c();
        m31923k(i);
        E[] eArr = this.f31488c;
        E e = eArr[i];
        int i2 = this.f31489d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f31489d--;
        this.modCount++;
        return e;
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ tp3 mo30784s(int i) {
        if (i >= this.f31489d) {
            return new er3(Arrays.copyOf(this.f31488c, i), this.f31489d);
        }
        throw new IllegalArgumentException();
    }

    public final E set(int i, E e) {
        mo33571c();
        m31923k(i);
        E[] eArr = this.f31488c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f31489d;
    }

    public final boolean add(E e) {
        mo33571c();
        int i = this.f31489d;
        E[] eArr = this.f31488c;
        if (i == eArr.length) {
            this.f31488c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f31488c;
        int i2 = this.f31489d;
        this.f31489d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
