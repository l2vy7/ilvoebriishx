package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.g7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9161g7 extends C9099c7 implements RandomAccess, C9118da {

    /* renamed from: e */
    private static final C9161g7 f45043e;

    /* renamed from: c */
    private boolean[] f45044c;

    /* renamed from: d */
    private int f45045d;

    static {
        C9161g7 g7Var = new C9161g7(new boolean[0], 0);
        f45043e = g7Var;
        g7Var.zzb();
    }

    C9161g7() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m42931f(int i) {
        int i2 = this.f45045d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m42932k(int i) {
        if (i < 0 || i >= this.f45045d) {
            throw new IndexOutOfBoundsException(m42931f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo37450c();
        if (i < 0 || i > (i2 = this.f45045d)) {
            throw new IndexOutOfBoundsException(m42931f(i));
        }
        boolean[] zArr = this.f45044c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f45044c, i, zArr2, i + 1, this.f45045d - i);
            this.f45044c = zArr2;
        }
        this.f45044c[i] = booleanValue;
        this.f45045d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo37450c();
        C9453z8.m43974e(collection);
        if (!(collection instanceof C9161g7)) {
            return super.addAll(collection);
        }
        C9161g7 g7Var = (C9161g7) collection;
        int i = g7Var.f45045d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45045d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f45044c;
            if (i3 > zArr.length) {
                this.f45044c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(g7Var.f45044c, 0, this.f45044c, this.f45045d, g7Var.f45045d);
            this.f45045d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo37598e(boolean z) {
        mo37450c();
        int i = this.f45045d;
        boolean[] zArr = this.f45044c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f45044c = zArr2;
        }
        boolean[] zArr3 = this.f45044c;
        int i2 = this.f45045d;
        this.f45045d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9161g7)) {
            return super.equals(obj);
        }
        C9161g7 g7Var = (C9161g7) obj;
        if (this.f45045d != g7Var.f45045d) {
            return false;
        }
        boolean[] zArr = g7Var.f45044c;
        for (int i = 0; i < this.f45045d; i++) {
            if (this.f45044c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m42932k(i);
        return Boolean.valueOf(this.f45044c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45045d; i2++) {
            i = (i * 31) + C9453z8.m43970a(this.f45044c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f45045d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45044c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo37450c();
        m42932k(i);
        boolean[] zArr = this.f45044c;
        boolean z = zArr[i];
        int i2 = this.f45045d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f45045d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo37450c();
        if (i2 >= i) {
            boolean[] zArr = this.f45044c;
            System.arraycopy(zArr, i2, zArr, i, this.f45045d - i2);
            this.f45045d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C9438y8 mo37416s(int i) {
        if (i >= this.f45045d) {
            return new C9161g7(Arrays.copyOf(this.f45044c, i), this.f45045d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo37450c();
        m42932k(i);
        boolean[] zArr = this.f45044c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f45045d;
    }

    private C9161g7(boolean[] zArr, int i) {
        this.f45044c = zArr;
        this.f45045d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo37598e(((Boolean) obj).booleanValue());
        return true;
    }
}
