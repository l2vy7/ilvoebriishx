package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.q2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9601q2 extends C9492d1<Float> implements C9612r4, RandomAccess {

    /* renamed from: e */
    private static final C9601q2 f45835e;

    /* renamed from: c */
    private float[] f45836c;

    /* renamed from: d */
    private int f45837d;

    static {
        C9601q2 q2Var = new C9601q2(new float[0], 0);
        f45835e = q2Var;
        q2Var.mo38299T();
    }

    C9601q2() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final void m44533f(int i) {
        if (i < 0 || i >= this.f45837d) {
            throw new IndexOutOfBoundsException(m44534h(i));
        }
    }

    /* renamed from: h */
    private final String m44534h(int i) {
        int i2 = this.f45837d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo38316c();
        if (i < 0 || i > (i2 = this.f45837d)) {
            throw new IndexOutOfBoundsException(m44534h(i));
        }
        float[] fArr = this.f45836c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f45836c, i, fArr2, i + 1, this.f45837d - i);
            this.f45836c = fArr2;
        }
        this.f45836c[i] = floatValue;
        this.f45837d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo38316c();
        C9662w2.m44747a(collection);
        if (!(collection instanceof C9601q2)) {
            return super.addAll(collection);
        }
        C9601q2 q2Var = (C9601q2) collection;
        int i = q2Var.f45837d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45837d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f45836c;
            if (i3 > fArr.length) {
                this.f45836c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(q2Var.f45836c, 0, this.f45836c, this.f45837d, q2Var.f45837d);
            this.f45837d = i3;
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
        if (!(obj instanceof C9601q2)) {
            return super.equals(obj);
        }
        C9601q2 q2Var = (C9601q2) obj;
        if (this.f45837d != q2Var.f45837d) {
            return false;
        }
        float[] fArr = q2Var.f45836c;
        for (int i = 0; i < this.f45837d; i++) {
            if (Float.floatToIntBits(this.f45836c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m44533f(i);
        return Float.valueOf(this.f45836c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45837d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f45836c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo38555i(float f) {
        mo38316c();
        int i = this.f45837d;
        float[] fArr = this.f45836c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f45836c = fArr2;
        }
        float[] fArr3 = this.f45836c;
        int i2 = this.f45837d;
        this.f45837d = i2 + 1;
        fArr3[i2] = f;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f45836c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        mo38316c();
        for (int i = 0; i < this.f45837d; i++) {
            if (obj.equals(Float.valueOf(this.f45836c[i]))) {
                float[] fArr = this.f45836c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f45837d - i) - 1);
                this.f45837d--;
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
            float[] fArr = this.f45836c;
            System.arraycopy(fArr, i2, fArr, i, this.f45837d - i2);
            this.f45837d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo38316c();
        m44533f(i);
        float[] fArr = this.f45836c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f45837d;
    }

    /* renamed from: w */
    public final /* synthetic */ C9485c3 mo38300w(int i) {
        if (i >= this.f45837d) {
            return new C9601q2(Arrays.copyOf(this.f45836c, i), this.f45837d);
        }
        throw new IllegalArgumentException();
    }

    private C9601q2(float[] fArr, int i) {
        this.f45836c = fArr;
        this.f45837d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo38316c();
        m44533f(i);
        float[] fArr = this.f45836c;
        float f = fArr[i];
        int i2 = this.f45837d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f45837d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo38555i(((Float) obj).floatValue());
        return true;
    }
}
