package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.k9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9223k9 extends C9099c7 implements RandomAccess, C9423x8, C9118da {

    /* renamed from: e */
    private static final C9223k9 f45176e;

    /* renamed from: c */
    private long[] f45177c;

    /* renamed from: d */
    private int f45178d;

    static {
        C9223k9 k9Var = new C9223k9(new long[0], 0);
        f45176e = k9Var;
        k9Var.zzb();
    }

    C9223k9() {
        this(new long[10], 0);
    }

    /* renamed from: e */
    public static C9223k9 m43150e() {
        return f45176e;
    }

    /* renamed from: h */
    private final String m43151h(int i) {
        int i2 = this.f45178d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: i */
    private final void m43152i(int i) {
        if (i < 0 || i >= this.f45178d) {
            throw new IndexOutOfBoundsException(m43151h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo37450c();
        if (i < 0 || i > (i2 = this.f45178d)) {
            throw new IndexOutOfBoundsException(m43151h(i));
        }
        long[] jArr = this.f45177c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f45177c, i, jArr2, i + 1, this.f45178d - i);
            this.f45177c = jArr2;
        }
        this.f45177c[i] = longValue;
        this.f45178d++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo37450c();
        C9453z8.m43974e(collection);
        if (!(collection instanceof C9223k9)) {
            return super.addAll(collection);
        }
        C9223k9 k9Var = (C9223k9) collection;
        int i = k9Var.f45178d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45178d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f45177c;
            if (i3 > jArr.length) {
                this.f45177c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(k9Var.f45177c, 0, this.f45177c, this.f45178d, k9Var.f45178d);
            this.f45178d = i3;
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
        if (!(obj instanceof C9223k9)) {
            return super.equals(obj);
        }
        C9223k9 k9Var = (C9223k9) obj;
        if (this.f45178d != k9Var.f45178d) {
            return false;
        }
        long[] jArr = k9Var.f45177c;
        for (int i = 0; i < this.f45178d; i++) {
            if (this.f45177c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo37685f(long j) {
        mo37450c();
        int i = this.f45178d;
        long[] jArr = this.f45177c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f45177c = jArr2;
        }
        long[] jArr3 = this.f45177c;
        int i2 = this.f45178d;
        this.f45178d = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        m43152i(i);
        return Long.valueOf(this.f45177c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45178d; i2++) {
            i = (i * 31) + C9453z8.m43972c(this.f45177c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f45178d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45177c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final C9423x8 mo37416s(int i) {
        if (i >= this.f45178d) {
            return new C9223k9(Arrays.copyOf(this.f45177c, i), this.f45178d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public final long mo37689m(int i) {
        m43152i(i);
        return this.f45177c[i];
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo37450c();
        m43152i(i);
        long[] jArr = this.f45177c;
        long j = jArr[i];
        int i2 = this.f45178d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f45178d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo37450c();
        if (i2 >= i) {
            long[] jArr = this.f45177c;
            System.arraycopy(jArr, i2, jArr, i, this.f45178d - i2);
            this.f45178d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo37450c();
        m43152i(i);
        long[] jArr = this.f45177c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f45178d;
    }

    private C9223k9(long[] jArr, int i) {
        this.f45177c = jArr;
        this.f45178d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo37685f(((Long) obj).longValue());
        return true;
    }
}
