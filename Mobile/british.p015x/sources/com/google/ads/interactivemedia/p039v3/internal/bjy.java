package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjy */
/* compiled from: IMASDK */
final class bjy extends bje<Double> implements RandomAccess, blt {

    /* renamed from: a */
    private static final bjy f16507a;

    /* renamed from: b */
    private double[] f16508b;

    /* renamed from: c */
    private int f16509c;

    static {
        bjy bjy = new bjy(new double[0], 0);
        f16507a = bjy;
        bjy.mo15178b();
    }

    bjy() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final void m16271f(int i) {
        if (i < 0 || i >= this.f16509c) {
            throw new IndexOutOfBoundsException(m16272g(i));
        }
    }

    /* renamed from: g */
    private final String m16272g(int i) {
        int i2 = this.f16509c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo15179c();
        if (i < 0 || i > (i2 = this.f16509c)) {
            throw new IndexOutOfBoundsException(m16272g(i));
        }
        double[] dArr = this.f16508b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f16508b, i, dArr2, i + 1, this.f16509c - i);
            this.f16508b = dArr2;
        }
        this.f16508b[i] = doubleValue;
        this.f16509c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo15179c();
        bkr.m16346i(collection);
        if (!(collection instanceof bjy)) {
            return super.addAll(collection);
        }
        bjy bjy = (bjy) collection;
        int i = bjy.f16509c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16509c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f16508b;
            if (i3 > dArr.length) {
                this.f16508b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(bjy.f16508b, 0, this.f16508b, this.f16509c, bjy.f16509c);
            this.f16509c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo15359d(double d) {
        mo15179c();
        int i = this.f16509c;
        double[] dArr = this.f16508b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f16508b = dArr2;
        }
        double[] dArr3 = this.f16508b;
        int i2 = this.f16509c;
        this.f16509c = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bkq mo15190e(int i) {
        if (i >= this.f16509c) {
            return new bjy(Arrays.copyOf(this.f16508b, i), this.f16509c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjy)) {
            return super.equals(obj);
        }
        bjy bjy = (bjy) obj;
        if (this.f16509c != bjy.f16509c) {
            return false;
        }
        double[] dArr = bjy.f16508b;
        for (int i = 0; i < this.f16509c; i++) {
            if (Double.doubleToLongBits(this.f16508b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m16271f(i);
        return Double.valueOf(this.f16508b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16509c; i2++) {
            i = (i * 31) + bkr.m16340c(Double.doubleToLongBits(this.f16508b[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f16509c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16508b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo15179c();
        m16271f(i);
        double[] dArr = this.f16508b;
        double d = dArr[i];
        int i2 = this.f16509c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f16509c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo15179c();
        if (i2 >= i) {
            double[] dArr = this.f16508b;
            System.arraycopy(dArr, i2, dArr, i, this.f16509c - i2);
            this.f16509c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo15179c();
        m16271f(i);
        double[] dArr = this.f16508b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f16509c;
    }

    private bjy(double[] dArr, int i) {
        this.f16508b = dArr;
        this.f16509c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15359d(((Double) obj).doubleValue());
        return true;
    }
}
