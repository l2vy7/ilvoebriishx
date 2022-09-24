package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lp3 extends mn3<Integer> implements RandomAccess, pp3, cr3 {

    /* renamed from: e */
    private static final lp3 f35179e;

    /* renamed from: c */
    private int[] f35180c;

    /* renamed from: d */
    private int f35181d;

    static {
        lp3 lp3 = new lp3(new int[0], 0);
        f35179e = lp3;
        lp3.zzb();
    }

    lp3() {
        this(new int[10], 0);
    }

    /* renamed from: g */
    public static lp3 m34523g() {
        return f35179e;
    }

    /* renamed from: h */
    private final String m34524h(int i) {
        int i2 = this.f35181d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: i */
    private final void m34525i(int i) {
        if (i < 0 || i >= this.f35181d) {
            throw new IndexOutOfBoundsException(m34524h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo33571c();
        if (i < 0 || i > (i2 = this.f35181d)) {
            throw new IndexOutOfBoundsException(m34524h(i));
        }
        int[] iArr = this.f35180c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f35180c, i, iArr2, i + 1, this.f35181d - i);
            this.f35180c = iArr2;
        }
        this.f35180c[i] = intValue;
        this.f35181d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo33571c();
        up3.m38379e(collection);
        if (!(collection instanceof lp3)) {
            return super.addAll(collection);
        }
        lp3 lp3 = (lp3) collection;
        int i = lp3.f35181d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35181d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f35180c;
            if (i3 > iArr.length) {
                this.f35180c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(lp3.f35180c, 0, this.f35180c, this.f35181d, lp3.f35181d);
            this.f35181d = i3;
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
        if (!(obj instanceof lp3)) {
            return super.equals(obj);
        }
        lp3 lp3 = (lp3) obj;
        if (this.f35181d != lp3.f35181d) {
            return false;
        }
        int[] iArr = lp3.f35180c;
        for (int i = 0; i < this.f35181d; i++) {
            if (this.f35180c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo33378f(int i) {
        m34525i(i);
        return this.f35180c[i];
    }

    public final /* synthetic */ Object get(int i) {
        m34525i(i);
        return Integer.valueOf(this.f35180c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35181d; i2++) {
            i = (i * 31) + this.f35180c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f35181d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f35180c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final pp3 mo30784s(int i) {
        if (i >= this.f35181d) {
            return new lp3(Arrays.copyOf(this.f35180c, i), this.f35181d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public final void mo33382p(int i) {
        mo33571c();
        int i2 = this.f35181d;
        int[] iArr = this.f35180c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f35180c = iArr2;
        }
        int[] iArr3 = this.f35180c;
        int i3 = this.f35181d;
        this.f35181d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33571c();
        m34525i(i);
        int[] iArr = this.f35180c;
        int i2 = iArr[i];
        int i3 = this.f35181d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f35181d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo33571c();
        if (i2 >= i) {
            int[] iArr = this.f35180c;
            System.arraycopy(iArr, i2, iArr, i, this.f35181d - i2);
            this.f35181d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo33571c();
        m34525i(i);
        int[] iArr = this.f35180c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f35181d;
    }

    private lp3(int[] iArr, int i) {
        this.f35180c = iArr;
        this.f35181d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo33382p(((Integer) obj).intValue());
        return true;
    }
}
