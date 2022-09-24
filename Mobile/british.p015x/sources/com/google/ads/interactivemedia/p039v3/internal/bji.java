package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bji */
/* compiled from: IMASDK */
final class bji extends bje<Boolean> implements RandomAccess, blt {

    /* renamed from: a */
    private static final bji f16472a;

    /* renamed from: b */
    private boolean[] f16473b;

    /* renamed from: c */
    private int f16474c;

    static {
        bji bji = new bji(new boolean[0], 0);
        f16472a = bji;
        bji.mo15178b();
    }

    bji() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final void m16027f(int i) {
        if (i < 0 || i >= this.f16474c) {
            throw new IndexOutOfBoundsException(m16028g(i));
        }
    }

    /* renamed from: g */
    private final String m16028g(int i) {
        int i2 = this.f16474c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo15179c();
        if (i < 0 || i > (i2 = this.f16474c)) {
            throw new IndexOutOfBoundsException(m16028g(i));
        }
        boolean[] zArr = this.f16473b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f16473b, i, zArr2, i + 1, this.f16474c - i);
            this.f16473b = zArr2;
        }
        this.f16473b[i] = booleanValue;
        this.f16474c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo15179c();
        bkr.m16346i(collection);
        if (!(collection instanceof bji)) {
            return super.addAll(collection);
        }
        bji bji = (bji) collection;
        int i = bji.f16474c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16474c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f16473b;
            if (i3 > zArr.length) {
                this.f16473b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(bji.f16473b, 0, this.f16473b, this.f16474c, bji.f16474c);
            this.f16474c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo15189d(boolean z) {
        mo15179c();
        int i = this.f16474c;
        boolean[] zArr = this.f16473b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f16473b = zArr2;
        }
        boolean[] zArr3 = this.f16473b;
        int i2 = this.f16474c;
        this.f16474c = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bkq mo15190e(int i) {
        if (i >= this.f16474c) {
            return new bji(Arrays.copyOf(this.f16473b, i), this.f16474c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bji)) {
            return super.equals(obj);
        }
        bji bji = (bji) obj;
        if (this.f16474c != bji.f16474c) {
            return false;
        }
        boolean[] zArr = bji.f16473b;
        for (int i = 0; i < this.f16474c; i++) {
            if (this.f16473b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m16027f(i);
        return Boolean.valueOf(this.f16473b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16474c; i2++) {
            i = (i * 31) + bkr.m16341d(this.f16473b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f16474c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16473b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo15179c();
        m16027f(i);
        boolean[] zArr = this.f16473b;
        boolean z = zArr[i];
        int i2 = this.f16474c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f16474c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo15179c();
        if (i2 >= i) {
            boolean[] zArr = this.f16473b;
            System.arraycopy(zArr, i2, zArr, i, this.f16474c - i2);
            this.f16474c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo15179c();
        m16027f(i);
        boolean[] zArr = this.f16473b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f16474c;
    }

    private bji(boolean[] zArr, int i) {
        this.f16473b = zArr;
        this.f16474c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15189d(((Boolean) obj).booleanValue());
        return true;
    }
}
