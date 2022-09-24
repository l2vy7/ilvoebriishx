package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class to3 extends mn3<Double> implements RandomAccess, cr3 {

    /* renamed from: e */
    private static final to3 f39479e;

    /* renamed from: c */
    private double[] f39480c;

    /* renamed from: d */
    private int f39481d;

    static {
        to3 to3 = new to3(new double[0], 0);
        f39479e = to3;
        to3.zzb();
    }

    to3() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m37929f(int i) {
        int i2 = this.f39481d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m37930k(int i) {
        if (i < 0 || i >= this.f39481d) {
            throw new IndexOutOfBoundsException(m37929f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo33571c();
        if (i < 0 || i > (i2 = this.f39481d)) {
            throw new IndexOutOfBoundsException(m37929f(i));
        }
        double[] dArr = this.f39480c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f39480c, i, dArr2, i + 1, this.f39481d - i);
            this.f39480c = dArr2;
        }
        this.f39480c[i] = doubleValue;
        this.f39481d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo33571c();
        up3.m38379e(collection);
        if (!(collection instanceof to3)) {
            return super.addAll(collection);
        }
        to3 to3 = (to3) collection;
        int i = to3.f39481d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39481d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f39480c;
            if (i3 > dArr.length) {
                this.f39480c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(to3.f39480c, 0, this.f39480c, this.f39481d, to3.f39481d);
            this.f39481d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo34998e(double d) {
        mo33571c();
        int i = this.f39481d;
        double[] dArr = this.f39480c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f39480c = dArr2;
        }
        double[] dArr3 = this.f39480c;
        int i2 = this.f39481d;
        this.f39481d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to3)) {
            return super.equals(obj);
        }
        to3 to3 = (to3) obj;
        if (this.f39481d != to3.f39481d) {
            return false;
        }
        double[] dArr = to3.f39480c;
        for (int i = 0; i < this.f39481d; i++) {
            if (Double.doubleToLongBits(this.f39480c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m37930k(i);
        return Double.valueOf(this.f39480c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39481d; i2++) {
            i = (i * 31) + up3.m38377c(Double.doubleToLongBits(this.f39480c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f39481d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39480c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33571c();
        m37930k(i);
        double[] dArr = this.f39480c;
        double d = dArr[i];
        int i2 = this.f39481d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f39481d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo33571c();
        if (i2 >= i) {
            double[] dArr = this.f39480c;
            System.arraycopy(dArr, i2, dArr, i, this.f39481d - i2);
            this.f39481d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ tp3 mo30784s(int i) {
        if (i >= this.f39481d) {
            return new to3(Arrays.copyOf(this.f39480c, i), this.f39481d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo33571c();
        m37930k(i);
        double[] dArr = this.f39480c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f39481d;
    }

    private to3(double[] dArr, int i) {
        this.f39480c = dArr;
        this.f39481d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo34998e(((Double) obj).doubleValue());
        return true;
    }
}
