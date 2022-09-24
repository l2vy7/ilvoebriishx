package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.u3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9635u3 extends C9492d1<Long> implements C9612r4, RandomAccess {

    /* renamed from: e */
    private static final C9635u3 f45890e;

    /* renamed from: c */
    private long[] f45891c;

    /* renamed from: d */
    private int f45892d;

    static {
        C9635u3 u3Var = new C9635u3(new long[0], 0);
        f45890e = u3Var;
        u3Var.mo38299T();
    }

    C9635u3() {
        this(new long[10], 0);
    }

    /* renamed from: h */
    private final void m44600h(int i) {
        if (i < 0 || i >= this.f45892d) {
            throw new IndexOutOfBoundsException(m44601i(i));
        }
    }

    /* renamed from: i */
    private final String m44601i(int i) {
        int i2 = this.f45892d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo38316c();
        if (i < 0 || i > (i2 = this.f45892d)) {
            throw new IndexOutOfBoundsException(m44601i(i));
        }
        long[] jArr = this.f45891c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f45891c, i, jArr2, i + 1, this.f45892d - i);
            this.f45891c = jArr2;
        }
        this.f45891c[i] = longValue;
        this.f45892d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo38316c();
        C9662w2.m44747a(collection);
        if (!(collection instanceof C9635u3)) {
            return super.addAll(collection);
        }
        C9635u3 u3Var = (C9635u3) collection;
        int i = u3Var.f45892d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45892d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f45891c;
            if (i3 > jArr.length) {
                this.f45891c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(u3Var.f45891c, 0, this.f45891c, this.f45892d, u3Var.f45892d);
            this.f45892d = i3;
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
        if (!(obj instanceof C9635u3)) {
            return super.equals(obj);
        }
        C9635u3 u3Var = (C9635u3) obj;
        if (this.f45892d != u3Var.f45892d) {
            return false;
        }
        long[] jArr = u3Var.f45891c;
        for (int i = 0; i < this.f45892d; i++) {
            if (this.f45891c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long mo38594f(int i) {
        m44600h(i);
        return this.f45891c[i];
    }

    /* renamed from: g */
    public final void mo38595g(long j) {
        mo38316c();
        int i = this.f45892d;
        long[] jArr = this.f45891c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f45891c = jArr2;
        }
        long[] jArr3 = this.f45891c;
        int i2 = this.f45892d;
        this.f45892d = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo38594f(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45892d; i2++) {
            i = (i * 31) + C9662w2.m44751e(this.f45891c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f45891c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        mo38316c();
        for (int i = 0; i < this.f45892d; i++) {
            if (obj.equals(Long.valueOf(this.f45891c[i]))) {
                long[] jArr = this.f45891c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f45892d - i) - 1);
                this.f45892d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo38316c();
        if (i2 >= i) {
            long[] jArr = this.f45891c;
            System.arraycopy(jArr, i2, jArr, i, this.f45892d - i2);
            this.f45892d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo38316c();
        m44600h(i);
        long[] jArr = this.f45891c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f45892d;
    }

    /* renamed from: w */
    public final /* synthetic */ C9485c3 mo38300w(int i) {
        if (i >= this.f45892d) {
            return new C9635u3(Arrays.copyOf(this.f45891c, i), this.f45892d);
        }
        throw new IllegalArgumentException();
    }

    private C9635u3(long[] jArr, int i) {
        this.f45891c = jArr;
        this.f45892d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo38316c();
        m44600h(i);
        long[] jArr = this.f45891c;
        long j = jArr[i];
        int i2 = this.f45892d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f45892d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo38595g(((Long) obj).longValue());
        return true;
    }
}
