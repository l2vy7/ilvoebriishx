package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.s8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9346s8 extends C9099c7 implements RandomAccess, C9408w8, C9118da {

    /* renamed from: e */
    private static final C9346s8 f45443e;

    /* renamed from: c */
    private int[] f45444c;

    /* renamed from: d */
    private int f45445d;

    static {
        C9346s8 s8Var = new C9346s8(new int[0], 0);
        f45443e = s8Var;
        s8Var.zzb();
    }

    C9346s8() {
        this(new int[10], 0);
    }

    /* renamed from: g */
    public static C9346s8 m43620g() {
        return f45443e;
    }

    /* renamed from: h */
    private final String m43621h(int i) {
        int i2 = this.f45445d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: i */
    private final void m43622i(int i) {
        if (i < 0 || i >= this.f45445d) {
            throw new IndexOutOfBoundsException(m43621h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo37450c();
        if (i < 0 || i > (i2 = this.f45445d)) {
            throw new IndexOutOfBoundsException(m43621h(i));
        }
        int[] iArr = this.f45444c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f45444c, i, iArr2, i + 1, this.f45445d - i);
            this.f45444c = iArr2;
        }
        this.f45444c[i] = intValue;
        this.f45445d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo37450c();
        C9453z8.m43974e(collection);
        if (!(collection instanceof C9346s8)) {
            return super.addAll(collection);
        }
        C9346s8 s8Var = (C9346s8) collection;
        int i = s8Var.f45445d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45445d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f45444c;
            if (i3 > iArr.length) {
                this.f45444c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(s8Var.f45444c, 0, this.f45444c, this.f45445d, s8Var.f45445d);
            this.f45445d = i3;
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
        if (!(obj instanceof C9346s8)) {
            return super.equals(obj);
        }
        C9346s8 s8Var = (C9346s8) obj;
        if (this.f45445d != s8Var.f45445d) {
            return false;
        }
        int[] iArr = s8Var.f45444c;
        for (int i = 0; i < this.f45445d; i++) {
            if (this.f45444c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo38025f(int i) {
        m43622i(i);
        return this.f45444c[i];
    }

    public final /* synthetic */ Object get(int i) {
        m43622i(i);
        return Integer.valueOf(this.f45444c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45445d; i2++) {
            i = (i * 31) + this.f45444c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f45445d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45444c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final C9408w8 mo37416s(int i) {
        if (i >= this.f45445d) {
            return new C9346s8(Arrays.copyOf(this.f45444c, i), this.f45445d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public final void mo38029p(int i) {
        mo37450c();
        int i2 = this.f45445d;
        int[] iArr = this.f45444c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f45444c = iArr2;
        }
        int[] iArr3 = this.f45444c;
        int i3 = this.f45445d;
        this.f45445d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo37450c();
        m43622i(i);
        int[] iArr = this.f45444c;
        int i2 = iArr[i];
        int i3 = this.f45445d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f45445d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo37450c();
        if (i2 >= i) {
            int[] iArr = this.f45444c;
            System.arraycopy(iArr, i2, iArr, i, this.f45445d - i2);
            this.f45445d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo37450c();
        m43622i(i);
        int[] iArr = this.f45444c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f45445d;
    }

    private C9346s8(int[] iArr, int i) {
        this.f45444c = iArr;
        this.f45445d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo38029p(((Integer) obj).intValue());
        return true;
    }
}
