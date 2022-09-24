package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.rc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8720rc extends C8624lb<Integer> implements RandomAccess, C8781vc, C8495de {

    /* renamed from: e */
    private static final C8720rc f43955e;

    /* renamed from: c */
    private int[] f43956c;

    /* renamed from: d */
    private int f43957d;

    static {
        C8720rc rcVar = new C8720rc(new int[0], 0);
        f43955e = rcVar;
        rcVar.zzb();
    }

    C8720rc() {
        this(new int[10], 0);
    }

    /* renamed from: e */
    public static C8720rc m41273e() {
        return f43955e;
    }

    /* renamed from: h */
    private final void m41274h(int i) {
        if (i < 0 || i >= this.f43957d) {
            throw new IndexOutOfBoundsException(m41275i(i));
        }
    }

    /* renamed from: i */
    private final String m41275i(int i) {
        int i2 = this.f43957d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo36587c();
        if (i < 0 || i > (i2 = this.f43957d)) {
            throw new IndexOutOfBoundsException(m41275i(i));
        }
        int[] iArr = this.f43956c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f43956c, i, iArr2, i + 1, this.f43957d - i);
            this.f43956c = iArr2;
        }
        this.f43956c[i] = intValue;
        this.f43957d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo36587c();
        C8443ad.m40689a(collection);
        if (!(collection instanceof C8720rc)) {
            return super.addAll(collection);
        }
        C8720rc rcVar = (C8720rc) collection;
        int i = rcVar.f43957d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f43957d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f43956c;
            if (i3 > iArr.length) {
                this.f43956c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(rcVar.f43956c, 0, this.f43956c, this.f43957d, rcVar.f43957d);
            this.f43957d = i3;
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
        if (!(obj instanceof C8720rc)) {
            return super.equals(obj);
        }
        C8720rc rcVar = (C8720rc) obj;
        if (this.f43957d != rcVar.f43957d) {
            return false;
        }
        int[] iArr = rcVar.f43956c;
        for (int i = 0; i < this.f43957d; i++) {
            if (this.f43956c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo36701f(int i) {
        m41274h(i);
        return this.f43956c[i];
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m41274h(i);
        return Integer.valueOf(this.f43956c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f43957d; i2++) {
            i = (i * 31) + this.f43956c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f43957d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f43956c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo36704k(int i) {
        mo36587c();
        int i2 = this.f43957d;
        int[] iArr = this.f43956c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f43956c = iArr2;
        }
        int[] iArr3 = this.f43956c;
        int i3 = this.f43957d;
        this.f43957d = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: l */
    public final C8781vc mo36467p(int i) {
        if (i >= this.f43957d) {
            return new C8720rc(Arrays.copyOf(this.f43956c, i), this.f43957d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo36587c();
        m41274h(i);
        int[] iArr = this.f43956c;
        int i2 = iArr[i];
        int i3 = this.f43957d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f43957d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo36587c();
        if (i2 >= i) {
            int[] iArr = this.f43956c;
            System.arraycopy(iArr, i2, iArr, i, this.f43957d - i2);
            this.f43957d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo36587c();
        m41274h(i);
        int[] iArr = this.f43956c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f43957d;
    }

    private C8720rc(int[] iArr, int i) {
        this.f43956c = iArr;
        this.f43957d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo36704k(((Integer) obj).intValue());
        return true;
    }
}
