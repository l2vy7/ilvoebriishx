package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jq3 extends mn3<Long> implements RandomAccess, sp3, cr3 {

    /* renamed from: e */
    private static final jq3 f33987e;

    /* renamed from: c */
    private long[] f33988c;

    /* renamed from: d */
    private int f33989d;

    static {
        jq3 jq3 = new jq3(new long[0], 0);
        f33987e = jq3;
        jq3.zzb();
    }

    jq3() {
        this(new long[10], 0);
    }

    /* renamed from: g */
    public static jq3 m33683g() {
        return f33987e;
    }

    /* renamed from: i */
    private final String m33684i(int i) {
        int i2 = this.f33989d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: j */
    private final void m33685j(int i) {
        if (i < 0 || i >= this.f33989d) {
            throw new IndexOutOfBoundsException(m33684i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo33571c();
        if (i < 0 || i > (i2 = this.f33989d)) {
            throw new IndexOutOfBoundsException(m33684i(i));
        }
        long[] jArr = this.f33988c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f33988c, i, jArr2, i + 1, this.f33989d - i);
            this.f33988c = jArr2;
        }
        this.f33988c[i] = longValue;
        this.f33989d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo33571c();
        up3.m38379e(collection);
        if (!(collection instanceof jq3)) {
            return super.addAll(collection);
        }
        jq3 jq3 = (jq3) collection;
        int i = jq3.f33989d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f33989d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f33988c;
            if (i3 > jArr.length) {
                this.f33988c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(jq3.f33988c, 0, this.f33988c, this.f33989d, jq3.f33989d);
            this.f33989d = i3;
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
        if (!(obj instanceof jq3)) {
            return super.equals(obj);
        }
        jq3 jq3 = (jq3) obj;
        if (this.f33989d != jq3.f33989d) {
            return false;
        }
        long[] jArr = jq3.f33988c;
        for (int i = 0; i < this.f33989d; i++) {
            if (this.f33988c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long mo32931f(int i) {
        m33685j(i);
        return this.f33988c[i];
    }

    public final /* synthetic */ Object get(int i) {
        m33685j(i);
        return Long.valueOf(this.f33988c[i]);
    }

    /* renamed from: h */
    public final void mo32933h(long j) {
        mo33571c();
        int i = this.f33989d;
        long[] jArr = this.f33988c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f33988c = jArr2;
        }
        long[] jArr3 = this.f33988c;
        int i2 = this.f33989d;
        this.f33989d = i2 + 1;
        jArr3[i2] = j;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33989d; i2++) {
            i = (i * 31) + up3.m38377c(this.f33988c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f33989d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f33988c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final sp3 mo30784s(int i) {
        if (i >= this.f33989d) {
            return new jq3(Arrays.copyOf(this.f33988c, i), this.f33989d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33571c();
        m33685j(i);
        long[] jArr = this.f33988c;
        long j = jArr[i];
        int i2 = this.f33989d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f33989d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo33571c();
        if (i2 >= i) {
            long[] jArr = this.f33988c;
            System.arraycopy(jArr, i2, jArr, i, this.f33989d - i2);
            this.f33989d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo33571c();
        m33685j(i);
        long[] jArr = this.f33988c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f33989d;
    }

    private jq3(long[] jArr, int i) {
        this.f33988c = jArr;
        this.f33989d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo32933h(((Long) obj).longValue());
        return true;
    }
}
