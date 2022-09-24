package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ep3 extends mn3<Float> implements RandomAccess, cr3 {

    /* renamed from: e */
    private static final ep3 f31456e;

    /* renamed from: c */
    private float[] f31457c;

    /* renamed from: d */
    private int f31458d;

    static {
        ep3 ep3 = new ep3(new float[0], 0);
        f31456e = ep3;
        ep3.zzb();
    }

    ep3() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m31904f(int i) {
        int i2 = this.f31458d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m31905k(int i) {
        if (i < 0 || i >= this.f31458d) {
            throw new IndexOutOfBoundsException(m31904f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo33571c();
        if (i < 0 || i > (i2 = this.f31458d)) {
            throw new IndexOutOfBoundsException(m31904f(i));
        }
        float[] fArr = this.f31457c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f31457c, i, fArr2, i + 1, this.f31458d - i);
            this.f31457c = fArr2;
        }
        this.f31457c[i] = floatValue;
        this.f31458d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo33571c();
        up3.m38379e(collection);
        if (!(collection instanceof ep3)) {
            return super.addAll(collection);
        }
        ep3 ep3 = (ep3) collection;
        int i = ep3.f31458d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31458d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f31457c;
            if (i3 > fArr.length) {
                this.f31457c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(ep3.f31457c, 0, this.f31457c, this.f31458d, ep3.f31458d);
            this.f31458d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo31629e(float f) {
        mo33571c();
        int i = this.f31458d;
        float[] fArr = this.f31457c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f31457c = fArr2;
        }
        float[] fArr3 = this.f31457c;
        int i2 = this.f31458d;
        this.f31458d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep3)) {
            return super.equals(obj);
        }
        ep3 ep3 = (ep3) obj;
        if (this.f31458d != ep3.f31458d) {
            return false;
        }
        float[] fArr = ep3.f31457c;
        for (int i = 0; i < this.f31458d; i++) {
            if (Float.floatToIntBits(this.f31457c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m31905k(i);
        return Float.valueOf(this.f31457c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31458d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f31457c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f31458d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31457c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33571c();
        m31905k(i);
        float[] fArr = this.f31457c;
        float f = fArr[i];
        int i2 = this.f31458d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f31458d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo33571c();
        if (i2 >= i) {
            float[] fArr = this.f31457c;
            System.arraycopy(fArr, i2, fArr, i, this.f31458d - i2);
            this.f31458d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ tp3 mo30784s(int i) {
        if (i >= this.f31458d) {
            return new ep3(Arrays.copyOf(this.f31457c, i), this.f31458d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo33571c();
        m31905k(i);
        float[] fArr = this.f31457c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f31458d;
    }

    private ep3(float[] fArr, int i) {
        this.f31457c = fArr;
        this.f31458d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo31629e(((Float) obj).floatValue());
        return true;
    }
}
