package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.b8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9084b8 extends C9099c7 implements RandomAccess, C9118da {

    /* renamed from: e */
    private static final C9084b8 f44901e;

    /* renamed from: c */
    private double[] f44902c;

    /* renamed from: d */
    private int f44903d;

    static {
        C9084b8 b8Var = new C9084b8(new double[0], 0);
        f44901e = b8Var;
        b8Var.zzb();
    }

    C9084b8() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m42679f(int i) {
        int i2 = this.f44903d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m42680k(int i) {
        if (i < 0 || i >= this.f44903d) {
            throw new IndexOutOfBoundsException(m42679f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo37450c();
        if (i < 0 || i > (i2 = this.f44903d)) {
            throw new IndexOutOfBoundsException(m42679f(i));
        }
        double[] dArr = this.f44902c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f44902c, i, dArr2, i + 1, this.f44903d - i);
            this.f44902c = dArr2;
        }
        this.f44902c[i] = doubleValue;
        this.f44903d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo37450c();
        C9453z8.m43974e(collection);
        if (!(collection instanceof C9084b8)) {
            return super.addAll(collection);
        }
        C9084b8 b8Var = (C9084b8) collection;
        int i = b8Var.f44903d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44903d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f44902c;
            if (i3 > dArr.length) {
                this.f44902c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(b8Var.f44902c, 0, this.f44902c, this.f44903d, b8Var.f44903d);
            this.f44903d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo37409e(double d) {
        mo37450c();
        int i = this.f44903d;
        double[] dArr = this.f44902c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f44902c = dArr2;
        }
        double[] dArr3 = this.f44902c;
        int i2 = this.f44903d;
        this.f44903d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9084b8)) {
            return super.equals(obj);
        }
        C9084b8 b8Var = (C9084b8) obj;
        if (this.f44903d != b8Var.f44903d) {
            return false;
        }
        double[] dArr = b8Var.f44902c;
        for (int i = 0; i < this.f44903d; i++) {
            if (Double.doubleToLongBits(this.f44902c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m42680k(i);
        return Double.valueOf(this.f44902c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f44903d; i2++) {
            i = (i * 31) + C9453z8.m43972c(Double.doubleToLongBits(this.f44902c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f44903d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f44902c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo37450c();
        m42680k(i);
        double[] dArr = this.f44902c;
        double d = dArr[i];
        int i2 = this.f44903d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f44903d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo37450c();
        if (i2 >= i) {
            double[] dArr = this.f44902c;
            System.arraycopy(dArr, i2, dArr, i, this.f44903d - i2);
            this.f44903d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C9438y8 mo37416s(int i) {
        if (i >= this.f44903d) {
            return new C9084b8(Arrays.copyOf(this.f44902c, i), this.f44903d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo37450c();
        m42680k(i);
        double[] dArr = this.f44902c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f44903d;
    }

    private C9084b8(double[] dArr, int i) {
        this.f44902c = dArr;
        this.f44903d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo37409e(((Double) obj).doubleValue());
        return true;
    }
}
