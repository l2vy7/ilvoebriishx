package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.ads.interactivemedia.v3.internal.blc */
/* compiled from: IMASDK */
final class blc extends bje<Long> implements RandomAccess, blt {

    /* renamed from: a */
    private static final blc f16622a;

    /* renamed from: b */
    private long[] f16623b;

    /* renamed from: c */
    private int f16624c;

    static {
        blc blc = new blc(new long[0], 0);
        f16622a = blc;
        blc.mo15178b();
    }

    blc() {
        this(new long[10], 0);
    }

    /* renamed from: g */
    private final void m16385g(int i) {
        if (i < 0 || i >= this.f16624c) {
            throw new IndexOutOfBoundsException(m16386h(i));
        }
    }

    /* renamed from: h */
    private final String m16386h(int i) {
        int i2 = this.f16624c;
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
        mo15179c();
        if (i < 0 || i > (i2 = this.f16624c)) {
            throw new IndexOutOfBoundsException(m16386h(i));
        }
        long[] jArr = this.f16623b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f16623b, i, jArr2, i + 1, this.f16624c - i);
            this.f16623b = jArr2;
        }
        this.f16623b[i] = longValue;
        this.f16624c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo15179c();
        bkr.m16346i(collection);
        if (!(collection instanceof blc)) {
            return super.addAll(collection);
        }
        blc blc = (blc) collection;
        int i = blc.f16624c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16624c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f16623b;
            if (i3 > jArr.length) {
                this.f16623b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(blc.f16623b, 0, this.f16623b, this.f16624c, blc.f16624c);
            this.f16624c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final long mo15424d(int i) {
        m16385g(i);
        return this.f16623b[i];
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bkq mo15190e(int i) {
        if (i >= this.f16624c) {
            return new blc(Arrays.copyOf(this.f16623b, i), this.f16624c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blc)) {
            return super.equals(obj);
        }
        blc blc = (blc) obj;
        if (this.f16624c != blc.f16624c) {
            return false;
        }
        long[] jArr = blc.f16623b;
        for (int i = 0; i < this.f16624c; i++) {
            if (this.f16623b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo15425f(long j) {
        mo15179c();
        int i = this.f16624c;
        long[] jArr = this.f16623b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f16623b = jArr2;
        }
        long[] jArr3 = this.f16623b;
        int i2 = this.f16624c;
        this.f16624c = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(mo15424d(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16624c; i2++) {
            i = (i * 31) + bkr.m16340c(this.f16623b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f16624c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16623b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo15179c();
        m16385g(i);
        long[] jArr = this.f16623b;
        long j = jArr[i];
        int i2 = this.f16624c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f16624c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo15179c();
        if (i2 >= i) {
            long[] jArr = this.f16623b;
            System.arraycopy(jArr, i2, jArr, i, this.f16624c - i2);
            this.f16624c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo15179c();
        m16385g(i);
        long[] jArr = this.f16623b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f16624c;
    }

    private blc(long[] jArr, int i) {
        this.f16623b = jArr;
        this.f16624c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15425f(((Long) obj).longValue());
        return true;
    }
}
