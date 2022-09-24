package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.g1 */
final class C8903g1 extends C9000t<Integer> implements RandomAccess {

    /* renamed from: e */
    private static final C8903g1 f44543e;

    /* renamed from: c */
    private int[] f44544c;

    /* renamed from: d */
    private int f44545d;

    static {
        C8903g1 g1Var = new C8903g1();
        f44543e = g1Var;
        g1Var.zzv();
    }

    C8903g1() {
        this(new int[10], 0);
    }

    private C8903g1(int[] iArr, int i) {
        this.f44544c = iArr;
        this.f44545d = i;
    }

    /* renamed from: i */
    private final String m41809i(int i) {
        int i2 = this.f44545d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: j */
    private final void m41810j(int i, int i2) {
        int i3;
        mo37158c();
        if (i < 0 || i > (i3 = this.f44545d)) {
            throw new IndexOutOfBoundsException(m41809i(i));
        }
        int[] iArr = this.f44544c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f44544c, i, iArr2, i + 1, this.f44545d - i);
            this.f44544c = iArr2;
        }
        this.f44544c[i] = i2;
        this.f44545d++;
        this.modCount++;
    }

    /* renamed from: k */
    private final void m41811k(int i) {
        if (i < 0 || i >= this.f44545d) {
            throw new IndexOutOfBoundsException(m41809i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m41810j(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo37158c();
        C8910h1.m41832a(collection);
        if (!(collection instanceof C8903g1)) {
            return super.addAll(collection);
        }
        C8903g1 g1Var = (C8903g1) collection;
        int i = g1Var.f44545d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44545d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f44544c;
            if (i3 > iArr.length) {
                this.f44544c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(g1Var.f44544c, 0, this.f44544c, this.f44545d, g1Var.f44545d);
            this.f44545d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8903g1)) {
            return super.equals(obj);
        }
        C8903g1 g1Var = (C8903g1) obj;
        if (this.f44545d != g1Var.f44545d) {
            return false;
        }
        int[] iArr = g1Var.f44544c;
        for (int i = 0; i < this.f44545d; i++) {
            if (this.f44544c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo36949f(int i) {
        m41811k(i);
        return this.f44544c[i];
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo36949f(i));
    }

    /* renamed from: h */
    public final void mo36951h(int i) {
        m41810j(this.f44545d, i);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f44545d; i2++) {
            i = (i * 31) + this.f44544c[i2];
        }
        return i;
    }

    /* renamed from: o */
    public final /* synthetic */ C8934k1 mo36878o(int i) {
        if (i >= this.f44545d) {
            return new C8903g1(Arrays.copyOf(this.f44544c, i), this.f44545d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        mo37158c();
        m41811k(i);
        int[] iArr = this.f44544c;
        int i2 = iArr[i];
        int i3 = this.f44545d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.f44545d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo37158c();
        for (int i = 0; i < this.f44545d; i++) {
            if (obj.equals(Integer.valueOf(this.f44544c[i]))) {
                int[] iArr = this.f44544c;
                System.arraycopy(iArr, i + 1, iArr, i, this.f44545d - i);
                this.f44545d--;
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
            int[] iArr = this.f44544c;
            System.arraycopy(iArr, i2, iArr, i, this.f44545d - i2);
            this.f44545d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo37158c();
        m41811k(i);
        int[] iArr = this.f44544c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f44545d;
    }
}
