package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.kd */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8610kd extends C8624lb<Long> implements RandomAccess, C8813xc, C8495de {

    /* renamed from: e */
    private static final C8610kd f43644e;

    /* renamed from: c */
    private long[] f43645c;

    /* renamed from: d */
    private int f43646d;

    static {
        C8610kd kdVar = new C8610kd(new long[0], 0);
        f43644e = kdVar;
        kdVar.zzb();
    }

    C8610kd() {
        this(new long[10], 0);
    }

    /* renamed from: e */
    public static C8610kd m41098e() {
        return f43644e;
    }

    /* renamed from: h */
    private final void m41099h(int i) {
        if (i < 0 || i >= this.f43646d) {
            throw new IndexOutOfBoundsException(m41100i(i));
        }
    }

    /* renamed from: i */
    private final String m41100i(int i) {
        int i2 = this.f43646d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo36587c();
        if (i < 0 || i > (i2 = this.f43646d)) {
            throw new IndexOutOfBoundsException(m41100i(i));
        }
        long[] jArr = this.f43645c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f43645c, i, jArr2, i + 1, this.f43646d - i);
            this.f43645c = jArr2;
        }
        this.f43645c[i] = longValue;
        this.f43646d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo36587c();
        C8443ad.m40689a(collection);
        if (!(collection instanceof C8610kd)) {
            return super.addAll(collection);
        }
        C8610kd kdVar = (C8610kd) collection;
        int i = kdVar.f43646d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f43646d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f43645c;
            if (i3 > jArr.length) {
                this.f43645c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(kdVar.f43645c, 0, this.f43645c, this.f43646d, kdVar.f43646d);
            this.f43646d = i3;
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
        if (!(obj instanceof C8610kd)) {
            return super.equals(obj);
        }
        C8610kd kdVar = (C8610kd) obj;
        if (this.f43646d != kdVar.f43646d) {
            return false;
        }
        long[] jArr = kdVar.f43645c;
        for (int i = 0; i < this.f43646d; i++) {
            if (this.f43645c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long mo36576f(int i) {
        m41099h(i);
        return this.f43645c[i];
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m41099h(i);
        return Long.valueOf(this.f43645c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f43646d; i2++) {
            i = (i * 31) + C8443ad.m40693e(this.f43645c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f43646d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f43645c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C8843zc mo36467p(int i) {
        if (i >= this.f43646d) {
            return new C8610kd(Arrays.copyOf(this.f43645c, i), this.f43646d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo36587c();
        m41099h(i);
        long[] jArr = this.f43645c;
        long j = jArr[i];
        int i2 = this.f43646d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f43646d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo36587c();
        if (i2 >= i) {
            long[] jArr = this.f43645c;
            System.arraycopy(jArr, i2, jArr, i, this.f43646d - i2);
            this.f43646d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo36587c();
        m41099h(i);
        long[] jArr = this.f43645c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f43646d;
    }

    private C8610kd(long[] jArr, int i) {
        this.f43645c = jArr;
        this.f43646d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        mo36587c();
        int i = this.f43646d;
        long[] jArr = this.f43645c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f43645c = jArr2;
        }
        long[] jArr3 = this.f43645c;
        int i2 = this.f43646d;
        this.f43646d = i2 + 1;
        jArr3[i2] = longValue;
        return true;
    }
}
