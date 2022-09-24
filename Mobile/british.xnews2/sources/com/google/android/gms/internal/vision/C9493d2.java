package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.d2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9493d2 extends C9492d1<Double> implements C9612r4, RandomAccess {

    /* renamed from: e */
    private static final C9493d2 f45628e;

    /* renamed from: c */
    private double[] f45629c;

    /* renamed from: d */
    private int f45630d;

    static {
        C9493d2 d2Var = new C9493d2(new double[0], 0);
        f45628e = d2Var;
        d2Var.mo38299T();
    }

    C9493d2() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final void m44180f(int i) {
        if (i < 0 || i >= this.f45630d) {
            throw new IndexOutOfBoundsException(m44181h(i));
        }
    }

    /* renamed from: h */
    private final String m44181h(int i) {
        int i2 = this.f45630d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo38316c();
        if (i < 0 || i > (i2 = this.f45630d)) {
            throw new IndexOutOfBoundsException(m44181h(i));
        }
        double[] dArr = this.f45629c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f45629c, i, dArr2, i + 1, this.f45630d - i);
            this.f45629c = dArr2;
        }
        this.f45629c[i] = doubleValue;
        this.f45630d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo38316c();
        C9662w2.m44747a(collection);
        if (!(collection instanceof C9493d2)) {
            return super.addAll(collection);
        }
        C9493d2 d2Var = (C9493d2) collection;
        int i = d2Var.f45630d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45630d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f45629c;
            if (i3 > dArr.length) {
                this.f45629c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(d2Var.f45629c, 0, this.f45629c, this.f45630d, d2Var.f45630d);
            this.f45630d = i3;
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
        if (!(obj instanceof C9493d2)) {
            return super.equals(obj);
        }
        C9493d2 d2Var = (C9493d2) obj;
        if (this.f45630d != d2Var.f45630d) {
            return false;
        }
        double[] dArr = d2Var.f45629c;
        for (int i = 0; i < this.f45630d; i++) {
            if (Double.doubleToLongBits(this.f45629c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m44180f(i);
        return Double.valueOf(this.f45629c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45630d; i2++) {
            i = (i * 31) + C9662w2.m44751e(Double.doubleToLongBits(this.f45629c[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final void mo38326i(double d) {
        mo38316c();
        int i = this.f45630d;
        double[] dArr = this.f45629c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f45629c = dArr2;
        }
        double[] dArr3 = this.f45629c;
        int i2 = this.f45630d;
        this.f45630d = i2 + 1;
        dArr3[i2] = d;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f45629c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        mo38316c();
        for (int i = 0; i < this.f45630d; i++) {
            if (obj.equals(Double.valueOf(this.f45629c[i]))) {
                double[] dArr = this.f45629c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f45630d - i) - 1);
                this.f45630d--;
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
            double[] dArr = this.f45629c;
            System.arraycopy(dArr, i2, dArr, i, this.f45630d - i2);
            this.f45630d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo38316c();
        m44180f(i);
        double[] dArr = this.f45629c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f45630d;
    }

    /* renamed from: w */
    public final /* synthetic */ C9485c3 mo38300w(int i) {
        if (i >= this.f45630d) {
            return new C9493d2(Arrays.copyOf(this.f45629c, i), this.f45630d);
        }
        throw new IllegalArgumentException();
    }

    private C9493d2(double[] dArr, int i) {
        this.f45629c = dArr;
        this.f45630d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo38316c();
        m44180f(i);
        double[] dArr = this.f45629c;
        double d = dArr[i];
        int i2 = this.f45630d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f45630d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo38326i(((Double) obj).doubleValue());
        return true;
    }
}
