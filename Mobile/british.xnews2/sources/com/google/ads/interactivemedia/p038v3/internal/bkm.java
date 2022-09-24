package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkm */
/* compiled from: IMASDK */
final class bkm extends bje<Integer> implements RandomAccess, bkp, blt {

    /* renamed from: a */
    private static final bkm f16596a;

    /* renamed from: b */
    private int[] f16597b;

    /* renamed from: c */
    private int f16598c;

    static {
        bkm bkm = new bkm(new int[0], 0);
        f16596a = bkm;
        bkm.mo15178b();
    }

    bkm() {
        this(new int[10], 0);
    }

    /* renamed from: d */
    public static bkm m16328d() {
        return f16596a;
    }

    /* renamed from: h */
    private final void m16329h(int i) {
        if (i < 0 || i >= this.f16598c) {
            throw new IndexOutOfBoundsException(m16330i(i));
        }
    }

    /* renamed from: i */
    private final String m16330i(int i) {
        int i2 = this.f16598c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo15179c();
        if (i < 0 || i > (i2 = this.f16598c)) {
            throw new IndexOutOfBoundsException(m16330i(i));
        }
        int[] iArr = this.f16597b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f16597b, i, iArr2, i + 1, this.f16598c - i);
            this.f16597b = iArr2;
        }
        this.f16597b[i] = intValue;
        this.f16598c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo15179c();
        bkr.m16346i(collection);
        if (!(collection instanceof bkm)) {
            return super.addAll(collection);
        }
        bkm bkm = (bkm) collection;
        int i = bkm.f16598c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16598c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f16597b;
            if (i3 > iArr.length) {
                this.f16597b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(bkm.f16597b, 0, this.f16597b, this.f16598c, bkm.f16598c);
            this.f16598c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bkq mo15190e(int i) {
        if (i >= this.f16598c) {
            return new bkm(Arrays.copyOf(this.f16597b, i), this.f16598c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkm)) {
            return super.equals(obj);
        }
        bkm bkm = (bkm) obj;
        if (this.f16598c != bkm.f16598c) {
            return false;
        }
        int[] iArr = bkm.f16597b;
        for (int i = 0; i < this.f16598c; i++) {
            if (this.f16597b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo15398f(int i) {
        m16329h(i);
        return this.f16597b[i];
    }

    /* renamed from: g */
    public final void mo15399g(int i) {
        mo15179c();
        int i2 = this.f16598c;
        int[] iArr = this.f16597b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f16597b = iArr2;
        }
        int[] iArr3 = this.f16597b;
        int i3 = this.f16598c;
        this.f16598c = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo15398f(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16598c; i2++) {
            i = (i * 31) + this.f16597b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f16598c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16597b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo15179c();
        m16329h(i);
        int[] iArr = this.f16597b;
        int i2 = iArr[i];
        int i3 = this.f16598c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f16598c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo15179c();
        if (i2 >= i) {
            int[] iArr = this.f16597b;
            System.arraycopy(iArr, i2, iArr, i, this.f16598c - i2);
            this.f16598c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo15179c();
        m16329h(i);
        int[] iArr = this.f16597b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f16598c;
    }

    private bkm(int[] iArr, int i) {
        this.f16597b = iArr;
        this.f16598c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15399g(((Integer) obj).intValue());
        return true;
    }
}
