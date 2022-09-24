package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.l8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9237l8 extends C9099c7 implements RandomAccess, C9118da {

    /* renamed from: e */
    private static final C9237l8 f45187e;

    /* renamed from: c */
    private float[] f45188c;

    /* renamed from: d */
    private int f45189d;

    static {
        C9237l8 l8Var = new C9237l8(new float[0], 0);
        f45187e = l8Var;
        l8Var.zzb();
    }

    C9237l8() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m43178f(int i) {
        int i2 = this.f45189d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m43179k(int i) {
        if (i < 0 || i >= this.f45189d) {
            throw new IndexOutOfBoundsException(m43178f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo37450c();
        if (i < 0 || i > (i2 = this.f45189d)) {
            throw new IndexOutOfBoundsException(m43178f(i));
        }
        float[] fArr = this.f45188c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f45188c, i, fArr2, i + 1, this.f45189d - i);
            this.f45188c = fArr2;
        }
        this.f45188c[i] = floatValue;
        this.f45189d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo37450c();
        C9453z8.m43974e(collection);
        if (!(collection instanceof C9237l8)) {
            return super.addAll(collection);
        }
        C9237l8 l8Var = (C9237l8) collection;
        int i = l8Var.f45189d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45189d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f45188c;
            if (i3 > fArr.length) {
                this.f45188c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(l8Var.f45188c, 0, this.f45188c, this.f45189d, l8Var.f45189d);
            this.f45189d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo37711e(float f) {
        mo37450c();
        int i = this.f45189d;
        float[] fArr = this.f45188c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f45188c = fArr2;
        }
        float[] fArr3 = this.f45188c;
        int i2 = this.f45189d;
        this.f45189d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9237l8)) {
            return super.equals(obj);
        }
        C9237l8 l8Var = (C9237l8) obj;
        if (this.f45189d != l8Var.f45189d) {
            return false;
        }
        float[] fArr = l8Var.f45188c;
        for (int i = 0; i < this.f45189d; i++) {
            if (Float.floatToIntBits(this.f45188c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m43179k(i);
        return Float.valueOf(this.f45188c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45189d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f45188c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f45189d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45188c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo37450c();
        m43179k(i);
        float[] fArr = this.f45188c;
        float f = fArr[i];
        int i2 = this.f45189d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f45189d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo37450c();
        if (i2 >= i) {
            float[] fArr = this.f45188c;
            System.arraycopy(fArr, i2, fArr, i, this.f45189d - i2);
            this.f45189d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C9438y8 mo37416s(int i) {
        if (i >= this.f45189d) {
            return new C9237l8(Arrays.copyOf(this.f45188c, i), this.f45189d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo37450c();
        m43179k(i);
        float[] fArr = this.f45188c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f45189d;
    }

    private C9237l8(float[] fArr, int i) {
        this.f45188c = fArr;
        this.f45189d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo37711e(((Float) obj).floatValue());
        return true;
    }
}
