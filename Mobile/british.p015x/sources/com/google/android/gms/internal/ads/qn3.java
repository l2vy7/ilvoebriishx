package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qn3 extends mn3<Boolean> implements RandomAccess, cr3 {

    /* renamed from: e */
    private static final qn3 f38202e;

    /* renamed from: c */
    private boolean[] f38203c;

    /* renamed from: d */
    private int f38204d;

    static {
        qn3 qn3 = new qn3(new boolean[0], 0);
        f38202e = qn3;
        qn3.zzb();
    }

    qn3() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m36554f(int i) {
        int i2 = this.f38204d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m36555k(int i) {
        if (i < 0 || i >= this.f38204d) {
            throw new IndexOutOfBoundsException(m36554f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo33571c();
        if (i < 0 || i > (i2 = this.f38204d)) {
            throw new IndexOutOfBoundsException(m36554f(i));
        }
        boolean[] zArr = this.f38203c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f38203c, i, zArr2, i + 1, this.f38204d - i);
            this.f38203c = zArr2;
        }
        this.f38203c[i] = booleanValue;
        this.f38204d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo33571c();
        up3.m38379e(collection);
        if (!(collection instanceof qn3)) {
            return super.addAll(collection);
        }
        qn3 qn3 = (qn3) collection;
        int i = qn3.f38204d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f38204d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f38203c;
            if (i3 > zArr.length) {
                this.f38203c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(qn3.f38203c, 0, this.f38203c, this.f38204d, qn3.f38204d);
            this.f38204d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo34365e(boolean z) {
        mo33571c();
        int i = this.f38204d;
        boolean[] zArr = this.f38203c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f38203c = zArr2;
        }
        boolean[] zArr3 = this.f38203c;
        int i2 = this.f38204d;
        this.f38204d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn3)) {
            return super.equals(obj);
        }
        qn3 qn3 = (qn3) obj;
        if (this.f38204d != qn3.f38204d) {
            return false;
        }
        boolean[] zArr = qn3.f38203c;
        for (int i = 0; i < this.f38204d; i++) {
            if (this.f38203c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m36555k(i);
        return Boolean.valueOf(this.f38203c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f38204d; i2++) {
            i = (i * 31) + up3.m38375a(this.f38203c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f38204d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f38203c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo33571c();
        m36555k(i);
        boolean[] zArr = this.f38203c;
        boolean z = zArr[i];
        int i2 = this.f38204d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f38204d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo33571c();
        if (i2 >= i) {
            boolean[] zArr = this.f38203c;
            System.arraycopy(zArr, i2, zArr, i, this.f38204d - i2);
            this.f38204d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ tp3 mo30784s(int i) {
        if (i >= this.f38204d) {
            return new qn3(Arrays.copyOf(this.f38203c, i), this.f38204d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo33571c();
        m36555k(i);
        boolean[] zArr = this.f38203c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f38204d;
    }

    private qn3(boolean[] zArr, int i) {
        this.f38203c = zArr;
        this.f38204d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo34365e(((Boolean) obj).booleanValue());
        return true;
    }
}
