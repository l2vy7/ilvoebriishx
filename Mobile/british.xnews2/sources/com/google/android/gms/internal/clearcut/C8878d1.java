package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.d1 */
final class C8878d1 extends C9000t<Float> implements RandomAccess {

    /* renamed from: e */
    private static final C8878d1 f44492e;

    /* renamed from: c */
    private float[] f44493c;

    /* renamed from: d */
    private int f44494d;

    static {
        C8878d1 d1Var = new C8878d1();
        f44492e = d1Var;
        d1Var.zzv();
    }

    C8878d1() {
        this(new float[10], 0);
    }

    private C8878d1(float[] fArr, int i) {
        this.f44493c = fArr;
        this.f44494d = i;
    }

    /* renamed from: f */
    private final void m41660f(int i, float f) {
        int i2;
        mo37158c();
        if (i < 0 || i > (i2 = this.f44494d)) {
            throw new IndexOutOfBoundsException(m41661h(i));
        }
        float[] fArr = this.f44493c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f44493c, i, fArr2, i + 1, this.f44494d - i);
            this.f44493c = fArr2;
        }
        this.f44493c[i] = f;
        this.f44494d++;
        this.modCount++;
    }

    /* renamed from: h */
    private final String m41661h(int i) {
        int i2 = this.f44494d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m41662k(int i) {
        if (i < 0 || i >= this.f44494d) {
            throw new IndexOutOfBoundsException(m41661h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m41660f(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo37158c();
        C8910h1.m41832a(collection);
        if (!(collection instanceof C8878d1)) {
            return super.addAll(collection);
        }
        C8878d1 d1Var = (C8878d1) collection;
        int i = d1Var.f44494d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44494d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f44493c;
            if (i3 > fArr.length) {
                this.f44493c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(d1Var.f44493c, 0, this.f44493c, this.f44494d, d1Var.f44494d);
            this.f44494d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: e */
    public final void mo36874e(float f) {
        m41660f(this.f44494d, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8878d1)) {
            return super.equals(obj);
        }
        C8878d1 d1Var = (C8878d1) obj;
        if (this.f44494d != d1Var.f44494d) {
            return false;
        }
        float[] fArr = d1Var.f44493c;
        for (int i = 0; i < this.f44494d; i++) {
            if (this.f44493c[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m41662k(i);
        return Float.valueOf(this.f44493c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f44494d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f44493c[i2]);
        }
        return i;
    }

    /* renamed from: o */
    public final /* synthetic */ C8934k1 mo36878o(int i) {
        if (i >= this.f44494d) {
            return new C8878d1(Arrays.copyOf(this.f44493c, i), this.f44494d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        mo37158c();
        m41662k(i);
        float[] fArr = this.f44493c;
        float f = fArr[i];
        int i2 = this.f44494d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, i2 - i);
        }
        this.f44494d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo37158c();
        for (int i = 0; i < this.f44494d; i++) {
            if (obj.equals(Float.valueOf(this.f44493c[i]))) {
                float[] fArr = this.f44493c;
                System.arraycopy(fArr, i + 1, fArr, i, this.f44494d - i);
                this.f44494d--;
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
            float[] fArr = this.f44493c;
            System.arraycopy(fArr, i2, fArr, i, this.f44494d - i2);
            this.f44494d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo37158c();
        m41662k(i);
        float[] fArr = this.f44493c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f44494d;
    }
}
