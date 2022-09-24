package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.x2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9673x2 extends C9492d1<Integer> implements C9612r4, RandomAccess {

    /* renamed from: e */
    private static final C9673x2 f45984e;

    /* renamed from: c */
    private int[] f45985c;

    /* renamed from: d */
    private int f45986d;

    static {
        C9673x2 x2Var = new C9673x2(new int[0], 0);
        f45984e = x2Var;
        x2Var.mo38299T();
    }

    C9673x2() {
        this(new int[10], 0);
    }

    /* renamed from: h */
    private final void m44799h(int i) {
        if (i < 0 || i >= this.f45986d) {
            throw new IndexOutOfBoundsException(m44800i(i));
        }
    }

    /* renamed from: i */
    private final String m44800i(int i) {
        int i2 = this.f45986d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: q */
    public static C9673x2 m44801q() {
        return f45984e;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo38316c();
        if (i < 0 || i > (i2 = this.f45986d)) {
            throw new IndexOutOfBoundsException(m44800i(i));
        }
        int[] iArr = this.f45985c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f45985c, i, iArr2, i + 1, this.f45986d - i);
            this.f45985c = iArr2;
        }
        this.f45985c[i] = intValue;
        this.f45986d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo38316c();
        C9662w2.m44747a(collection);
        if (!(collection instanceof C9673x2)) {
            return super.addAll(collection);
        }
        C9673x2 x2Var = (C9673x2) collection;
        int i = x2Var.f45986d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45986d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f45985c;
            if (i3 > iArr.length) {
                this.f45985c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(x2Var.f45985c, 0, this.f45985c, this.f45986d, x2Var.f45986d);
            this.f45986d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9673x2)) {
            return super.equals(obj);
        }
        C9673x2 x2Var = (C9673x2) obj;
        if (this.f45986d != x2Var.f45986d) {
            return false;
        }
        int[] iArr = x2Var.f45985c;
        for (int i = 0; i < this.f45986d; i++) {
            if (this.f45985c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo38640f(int i) {
        m44799h(i);
        return this.f45985c[i];
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo38640f(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45986d; i2++) {
            i = (i * 31) + this.f45985c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f45985c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo38643j(int i) {
        mo38316c();
        int i2 = this.f45986d;
        int[] iArr = this.f45985c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f45985c = iArr2;
        }
        int[] iArr3 = this.f45985c;
        int i3 = this.f45986d;
        this.f45986d = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean remove(Object obj) {
        mo38316c();
        for (int i = 0; i < this.f45986d; i++) {
            if (obj.equals(Integer.valueOf(this.f45985c[i]))) {
                int[] iArr = this.f45985c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f45986d - i) - 1);
                this.f45986d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo38316c();
        if (i2 >= i) {
            int[] iArr = this.f45985c;
            System.arraycopy(iArr, i2, iArr, i, this.f45986d - i2);
            this.f45986d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo38316c();
        m44799h(i);
        int[] iArr = this.f45985c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f45986d;
    }

    /* renamed from: w */
    public final /* synthetic */ C9485c3 mo38300w(int i) {
        if (i >= this.f45986d) {
            return new C9673x2(Arrays.copyOf(this.f45985c, i), this.f45986d);
        }
        throw new IllegalArgumentException();
    }

    private C9673x2(int[] iArr, int i) {
        this.f45985c = iArr;
        this.f45986d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo38316c();
        m44799h(i);
        int[] iArr = this.f45985c;
        int i2 = iArr[i];
        int i3 = this.f45986d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f45986d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo38643j(((Integer) obj).intValue());
        return true;
    }
}
