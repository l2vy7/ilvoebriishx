package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9149fa extends C9099c7 implements RandomAccess {

    /* renamed from: e */
    private static final C9149fa f45027e;

    /* renamed from: c */
    private Object[] f45028c;

    /* renamed from: d */
    private int f45029d;

    static {
        C9149fa faVar = new C9149fa(new Object[0], 0);
        f45027e = faVar;
        faVar.zzb();
    }

    private C9149fa(Object[] objArr, int i) {
        this.f45028c = objArr;
        this.f45029d = i;
    }

    /* renamed from: e */
    public static C9149fa m42884e() {
        return f45027e;
    }

    /* renamed from: f */
    private final String m42885f(int i) {
        int i2 = this.f45029d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m42886k(int i) {
        if (i < 0 || i >= this.f45029d) {
            throw new IndexOutOfBoundsException(m42885f(i));
        }
    }

    public final void add(int i, Object obj) {
        int i2;
        mo37450c();
        if (i < 0 || i > (i2 = this.f45029d)) {
            throw new IndexOutOfBoundsException(m42885f(i));
        }
        Object[] objArr = this.f45028c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f45028c, i, objArr2, i + 1, this.f45029d - i);
            this.f45028c = objArr2;
        }
        this.f45028c[i] = obj;
        this.f45029d++;
        this.modCount++;
    }

    public final Object get(int i) {
        m42886k(i);
        return this.f45028c[i];
    }

    public final Object remove(int i) {
        mo37450c();
        m42886k(i);
        Object[] objArr = this.f45028c;
        Object obj = objArr[i];
        int i2 = this.f45029d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f45029d--;
        this.modCount++;
        return obj;
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C9438y8 mo37416s(int i) {
        if (i >= this.f45029d) {
            return new C9149fa(Arrays.copyOf(this.f45028c, i), this.f45029d);
        }
        throw new IllegalArgumentException();
    }

    public final Object set(int i, Object obj) {
        mo37450c();
        m42886k(i);
        Object[] objArr = this.f45028c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f45029d;
    }

    public final boolean add(Object obj) {
        mo37450c();
        int i = this.f45029d;
        Object[] objArr = this.f45028c;
        if (i == objArr.length) {
            this.f45028c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f45028c;
        int i2 = this.f45029d;
        this.f45029d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
