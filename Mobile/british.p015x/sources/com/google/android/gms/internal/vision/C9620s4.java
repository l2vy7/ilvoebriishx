package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.s4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9620s4<E> extends C9492d1<E> implements RandomAccess {

    /* renamed from: e */
    private static final C9620s4<Object> f45853e;

    /* renamed from: c */
    private E[] f45854c;

    /* renamed from: d */
    private int f45855d;

    static {
        C9620s4<Object> s4Var = new C9620s4<>(new Object[0], 0);
        f45853e = s4Var;
        s4Var.mo38299T();
    }

    private C9620s4(E[] eArr, int i) {
        this.f45854c = eArr;
        this.f45855d = i;
    }

    /* renamed from: f */
    private final void m44574f(int i) {
        if (i < 0 || i >= this.f45855d) {
            throw new IndexOutOfBoundsException(m44575h(i));
        }
    }

    /* renamed from: h */
    private final String m44575h(int i) {
        int i2 = this.f45855d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: j */
    public static <E> C9620s4<E> m44576j() {
        return f45853e;
    }

    public final boolean add(E e) {
        mo38316c();
        int i = this.f45855d;
        E[] eArr = this.f45854c;
        if (i == eArr.length) {
            this.f45854c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f45854c;
        int i2 = this.f45855d;
        this.f45855d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final E get(int i) {
        m44574f(i);
        return this.f45854c[i];
    }

    public final E remove(int i) {
        mo38316c();
        m44574f(i);
        E[] eArr = this.f45854c;
        E e = eArr[i];
        int i2 = this.f45855d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f45855d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo38316c();
        m44574f(i);
        E[] eArr = this.f45854c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f45855d;
    }

    /* renamed from: w */
    public final /* synthetic */ C9485c3 mo38300w(int i) {
        if (i >= this.f45855d) {
            return new C9620s4(Arrays.copyOf(this.f45854c, i), this.f45855d);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        int i2;
        mo38316c();
        if (i < 0 || i > (i2 = this.f45855d)) {
            throw new IndexOutOfBoundsException(m44575h(i));
        }
        E[] eArr = this.f45854c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f45854c, i, eArr2, i + 1, this.f45855d - i);
            this.f45854c = eArr2;
        }
        this.f45854c[i] = e;
        this.f45855d++;
        this.modCount++;
    }
}
