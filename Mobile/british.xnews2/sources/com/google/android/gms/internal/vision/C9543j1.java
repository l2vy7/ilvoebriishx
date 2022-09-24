package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.j1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9543j1 extends C9492d1<Boolean> implements C9612r4, RandomAccess {

    /* renamed from: e */
    private static final C9543j1 f45677e;

    /* renamed from: c */
    private boolean[] f45678c;

    /* renamed from: d */
    private int f45679d;

    static {
        C9543j1 j1Var = new C9543j1(new boolean[0], 0);
        f45677e = j1Var;
        j1Var.mo38299T();
    }

    C9543j1() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final void m44340f(int i) {
        if (i < 0 || i >= this.f45679d) {
            throw new IndexOutOfBoundsException(m44341h(i));
        }
    }

    /* renamed from: h */
    private final String m44341h(int i) {
        int i2 = this.f45679d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo38316c();
        if (i < 0 || i > (i2 = this.f45679d)) {
            throw new IndexOutOfBoundsException(m44341h(i));
        }
        boolean[] zArr = this.f45678c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f45678c, i, zArr2, i + 1, this.f45679d - i);
            this.f45678c = zArr2;
        }
        this.f45678c[i] = booleanValue;
        this.f45679d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo38316c();
        C9662w2.m44747a(collection);
        if (!(collection instanceof C9543j1)) {
            return super.addAll(collection);
        }
        C9543j1 j1Var = (C9543j1) collection;
        int i = j1Var.f45679d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45679d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f45678c;
            if (i3 > zArr.length) {
                this.f45678c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(j1Var.f45678c, 0, this.f45678c, this.f45679d, j1Var.f45679d);
            this.f45679d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo38435e(boolean z) {
        mo38316c();
        int i = this.f45679d;
        boolean[] zArr = this.f45678c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f45678c = zArr2;
        }
        boolean[] zArr3 = this.f45678c;
        int i2 = this.f45679d;
        this.f45679d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9543j1)) {
            return super.equals(obj);
        }
        C9543j1 j1Var = (C9543j1) obj;
        if (this.f45679d != j1Var.f45679d) {
            return false;
        }
        boolean[] zArr = j1Var.f45678c;
        for (int i = 0; i < this.f45679d; i++) {
            if (this.f45678c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m44340f(i);
        return Boolean.valueOf(this.f45678c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45679d; i2++) {
            i = (i * 31) + C9662w2.m44756j(this.f45678c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f45678c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        mo38316c();
        for (int i = 0; i < this.f45679d; i++) {
            if (obj.equals(Boolean.valueOf(this.f45678c[i]))) {
                boolean[] zArr = this.f45678c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f45679d - i) - 1);
                this.f45679d--;
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
            boolean[] zArr = this.f45678c;
            System.arraycopy(zArr, i2, zArr, i, this.f45679d - i2);
            this.f45679d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo38316c();
        m44340f(i);
        boolean[] zArr = this.f45678c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f45679d;
    }

    /* renamed from: w */
    public final /* synthetic */ C9485c3 mo38300w(int i) {
        if (i >= this.f45679d) {
            return new C9543j1(Arrays.copyOf(this.f45678c, i), this.f45679d);
        }
        throw new IllegalArgumentException();
    }

    private C9543j1(boolean[] zArr, int i) {
        this.f45678c = zArr;
        this.f45679d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo38316c();
        m44340f(i);
        boolean[] zArr = this.f45678c;
        boolean z = zArr[i];
        int i2 = this.f45679d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f45679d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo38435e(((Boolean) obj).booleanValue());
        return true;
    }
}
