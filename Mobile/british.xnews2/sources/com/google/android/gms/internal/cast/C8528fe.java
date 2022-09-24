package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.fe */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8528fe<E> extends C8624lb<E> implements RandomAccess {

    /* renamed from: e */
    private static final C8528fe<Object> f43473e;

    /* renamed from: c */
    private E[] f43474c;

    /* renamed from: d */
    private int f43475d;

    static {
        C8528fe<Object> feVar = new C8528fe<>(new Object[0], 0);
        f43473e = feVar;
        feVar.zzb();
    }

    private C8528fe(E[] eArr, int i) {
        this.f43474c = eArr;
        this.f43475d = i;
    }

    /* renamed from: e */
    public static <E> C8528fe<E> m40899e() {
        return f43473e;
    }

    /* renamed from: f */
    private final void m40900f(int i) {
        if (i < 0 || i >= this.f43475d) {
            throw new IndexOutOfBoundsException(m40901h(i));
        }
    }

    /* renamed from: h */
    private final String m40901h(int i) {
        int i2 = this.f43475d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void add(int i, E e) {
        int i2;
        mo36587c();
        if (i < 0 || i > (i2 = this.f43475d)) {
            throw new IndexOutOfBoundsException(m40901h(i));
        }
        E[] eArr = this.f43474c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f43474c, i, eArr2, i + 1, this.f43475d - i);
            this.f43474c = eArr2;
        }
        this.f43474c[i] = e;
        this.f43475d++;
        this.modCount++;
    }

    public final E get(int i) {
        m40900f(i);
        return this.f43474c[i];
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C8843zc mo36467p(int i) {
        if (i >= this.f43475d) {
            return new C8528fe(Arrays.copyOf(this.f43474c, i), this.f43475d);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo36587c();
        m40900f(i);
        E[] eArr = this.f43474c;
        E e = eArr[i];
        int i2 = this.f43475d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f43475d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo36587c();
        m40900f(i);
        E[] eArr = this.f43474c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f43475d;
    }

    public final boolean add(E e) {
        mo36587c();
        int i = this.f43475d;
        E[] eArr = this.f43474c;
        if (i == eArr.length) {
            this.f43474c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f43474c;
        int i2 = this.f43475d;
        this.f43475d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
