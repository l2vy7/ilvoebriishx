package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.z1 */
final class C9044z1 extends C9000t<Long> implements RandomAccess {

    /* renamed from: e */
    private static final C9044z1 f44802e;

    /* renamed from: c */
    private long[] f44803c;

    /* renamed from: d */
    private int f44804d;

    static {
        C9044z1 z1Var = new C9044z1();
        f44802e = z1Var;
        z1Var.zzv();
    }

    C9044z1() {
        this(new long[10], 0);
    }

    private C9044z1(long[] jArr, int i) {
        this.f44803c = jArr;
        this.f44804d = i;
    }

    /* renamed from: h */
    private final String m42526h(int i) {
        int i2 = this.f44804d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: i */
    private final void m42527i(int i, long j) {
        int i2;
        mo37158c();
        if (i < 0 || i > (i2 = this.f44804d)) {
            throw new IndexOutOfBoundsException(m42526h(i));
        }
        long[] jArr = this.f44803c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f44803c, i, jArr2, i + 1, this.f44804d - i);
            this.f44803c = jArr2;
        }
        this.f44803c[i] = j;
        this.f44804d++;
        this.modCount++;
    }

    /* renamed from: k */
    private final void m42528k(int i) {
        if (i < 0 || i >= this.f44804d) {
            throw new IndexOutOfBoundsException(m42526h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m42527i(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo37158c();
        C8910h1.m41832a(collection);
        if (!(collection instanceof C9044z1)) {
            return super.addAll(collection);
        }
        C9044z1 z1Var = (C9044z1) collection;
        int i = z1Var.f44804d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44804d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f44803c;
            if (i3 > jArr.length) {
                this.f44803c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(z1Var.f44803c, 0, this.f44803c, this.f44804d, z1Var.f44804d);
            this.f44804d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9044z1)) {
            return super.equals(obj);
        }
        C9044z1 z1Var = (C9044z1) obj;
        if (this.f44804d != z1Var.f44804d) {
            return false;
        }
        long[] jArr = z1Var.f44803c;
        for (int i = 0; i < this.f44804d; i++) {
            if (this.f44803c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long mo37244f(int i) {
        m42528k(i);
        return this.f44803c[i];
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo37244f(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f44804d; i2++) {
            i = (i * 31) + C8910h1.m41841j(this.f44803c[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public final void mo37246j(long j) {
        m42527i(this.f44804d, j);
    }

    /* renamed from: o */
    public final /* synthetic */ C8934k1 mo36878o(int i) {
        if (i >= this.f44804d) {
            return new C9044z1(Arrays.copyOf(this.f44803c, i), this.f44804d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        mo37158c();
        m42528k(i);
        long[] jArr = this.f44803c;
        long j = jArr[i];
        int i2 = this.f44804d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.f44804d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo37158c();
        for (int i = 0; i < this.f44804d; i++) {
            if (obj.equals(Long.valueOf(this.f44803c[i]))) {
                long[] jArr = this.f44803c;
                System.arraycopy(jArr, i + 1, jArr, i, this.f44804d - i);
                this.f44804d--;
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
            long[] jArr = this.f44803c;
            System.arraycopy(jArr, i2, jArr, i, this.f44804d - i2);
            this.f44804d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo37158c();
        m42528k(i);
        long[] jArr = this.f44803c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f44804d;
    }
}
