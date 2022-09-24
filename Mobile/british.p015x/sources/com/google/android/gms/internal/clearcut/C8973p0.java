package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.p0 */
final class C8973p0 extends C9000t<Double> implements RandomAccess {

    /* renamed from: e */
    private static final C8973p0 f44697e;

    /* renamed from: c */
    private double[] f44698c;

    /* renamed from: d */
    private int f44699d;

    static {
        C8973p0 p0Var = new C8973p0();
        f44697e = p0Var;
        p0Var.zzv();
    }

    C8973p0() {
        this(new double[10], 0);
    }

    private C8973p0(double[] dArr, int i) {
        this.f44698c = dArr;
        this.f44699d = i;
    }

    /* renamed from: f */
    private final void m42176f(int i, double d) {
        int i2;
        mo37158c();
        if (i < 0 || i > (i2 = this.f44699d)) {
            throw new IndexOutOfBoundsException(m42177h(i));
        }
        double[] dArr = this.f44698c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f44698c, i, dArr2, i + 1, this.f44699d - i);
            this.f44698c = dArr2;
        }
        this.f44698c[i] = d;
        this.f44699d++;
        this.modCount++;
    }

    /* renamed from: h */
    private final String m42177h(int i) {
        int i2 = this.f44699d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m42178k(int i) {
        if (i < 0 || i >= this.f44699d) {
            throw new IndexOutOfBoundsException(m42177h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m42176f(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo37158c();
        C8910h1.m41832a(collection);
        if (!(collection instanceof C8973p0)) {
            return super.addAll(collection);
        }
        C8973p0 p0Var = (C8973p0) collection;
        int i = p0Var.f44699d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44699d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f44698c;
            if (i3 > dArr.length) {
                this.f44698c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(p0Var.f44698c, 0, this.f44698c, this.f44699d, p0Var.f44699d);
            this.f44699d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: e */
    public final void mo37110e(double d) {
        m42176f(this.f44699d, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8973p0)) {
            return super.equals(obj);
        }
        C8973p0 p0Var = (C8973p0) obj;
        if (this.f44699d != p0Var.f44699d) {
            return false;
        }
        double[] dArr = p0Var.f44698c;
        for (int i = 0; i < this.f44699d; i++) {
            if (this.f44698c[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m42178k(i);
        return Double.valueOf(this.f44698c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f44699d; i2++) {
            i = (i * 31) + C8910h1.m41841j(Double.doubleToLongBits(this.f44698c[i2]));
        }
        return i;
    }

    /* renamed from: o */
    public final /* synthetic */ C8934k1 mo36878o(int i) {
        if (i >= this.f44699d) {
            return new C8973p0(Arrays.copyOf(this.f44698c, i), this.f44699d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        mo37158c();
        m42178k(i);
        double[] dArr = this.f44698c;
        double d = dArr[i];
        int i2 = this.f44699d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.f44699d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo37158c();
        for (int i = 0; i < this.f44699d; i++) {
            if (obj.equals(Double.valueOf(this.f44698c[i]))) {
                double[] dArr = this.f44698c;
                System.arraycopy(dArr, i + 1, dArr, i, this.f44699d - i);
                this.f44699d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo37158c();
        if (i2 >= i) {
            double[] dArr = this.f44698c;
            System.arraycopy(dArr, i2, dArr, i, this.f44699d - i2);
            this.f44699d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo37158c();
        m42178k(i);
        double[] dArr = this.f44698c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f44699d;
    }
}
