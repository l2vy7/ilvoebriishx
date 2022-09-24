package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkh */
/* compiled from: IMASDK */
final class bkh extends bje<Float> implements RandomAccess, blt {

    /* renamed from: a */
    private static final bkh f16586a;

    /* renamed from: b */
    private float[] f16587b;

    /* renamed from: c */
    private int f16588c;

    static {
        bkh bkh = new bkh(new float[0], 0);
        f16586a = bkh;
        bkh.mo15178b();
    }

    bkh() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final void m16290f(int i) {
        if (i < 0 || i >= this.f16588c) {
            throw new IndexOutOfBoundsException(m16291g(i));
        }
    }

    /* renamed from: g */
    private final String m16291g(int i) {
        int i2 = this.f16588c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo15179c();
        if (i < 0 || i > (i2 = this.f16588c)) {
            throw new IndexOutOfBoundsException(m16291g(i));
        }
        float[] fArr = this.f16587b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f16587b, i, fArr2, i + 1, this.f16588c - i);
            this.f16587b = fArr2;
        }
        this.f16587b[i] = floatValue;
        this.f16588c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo15179c();
        bkr.m16346i(collection);
        if (!(collection instanceof bkh)) {
            return super.addAll(collection);
        }
        bkh bkh = (bkh) collection;
        int i = bkh.f16588c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16588c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f16587b;
            if (i3 > fArr.length) {
                this.f16587b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(bkh.f16587b, 0, this.f16587b, this.f16588c, bkh.f16588c);
            this.f16588c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo15377d(float f) {
        mo15179c();
        int i = this.f16588c;
        float[] fArr = this.f16587b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f16587b = fArr2;
        }
        float[] fArr3 = this.f16587b;
        int i2 = this.f16588c;
        this.f16588c = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bkq mo15190e(int i) {
        if (i >= this.f16588c) {
            return new bkh(Arrays.copyOf(this.f16587b, i), this.f16588c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkh)) {
            return super.equals(obj);
        }
        bkh bkh = (bkh) obj;
        if (this.f16588c != bkh.f16588c) {
            return false;
        }
        float[] fArr = bkh.f16587b;
        for (int i = 0; i < this.f16588c; i++) {
            if (Float.floatToIntBits(this.f16587b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m16290f(i);
        return Float.valueOf(this.f16587b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16588c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f16587b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f16588c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16587b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo15179c();
        m16290f(i);
        float[] fArr = this.f16587b;
        float f = fArr[i];
        int i2 = this.f16588c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f16588c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo15179c();
        if (i2 >= i) {
            float[] fArr = this.f16587b;
            System.arraycopy(fArr, i2, fArr, i, this.f16588c - i2);
            this.f16588c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo15179c();
        m16290f(i);
        float[] fArr = this.f16587b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f16588c;
    }

    private bkh(float[] fArr, int i) {
        this.f16587b = fArr;
        this.f16588c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15377d(((Float) obj).floatValue());
        return true;
    }
}
