package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.x */
final class C9028x extends C9000t<Boolean> implements RandomAccess {

    /* renamed from: e */
    private static final C9028x f44787e;

    /* renamed from: c */
    private boolean[] f44788c;

    /* renamed from: d */
    private int f44789d;

    static {
        C9028x xVar = new C9028x();
        f44787e = xVar;
        xVar.zzv();
    }

    C9028x() {
        this(new boolean[10], 0);
    }

    private C9028x(boolean[] zArr, int i) {
        this.f44788c = zArr;
        this.f44789d = i;
    }

    /* renamed from: f */
    private final void m42480f(int i, boolean z) {
        int i2;
        mo37158c();
        if (i < 0 || i > (i2 = this.f44789d)) {
            throw new IndexOutOfBoundsException(m42481h(i));
        }
        boolean[] zArr = this.f44788c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f44788c, i, zArr2, i + 1, this.f44789d - i);
            this.f44788c = zArr2;
        }
        this.f44788c[i] = z;
        this.f44789d++;
        this.modCount++;
    }

    /* renamed from: h */
    private final String m42481h(int i) {
        int i2 = this.f44789d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: k */
    private final void m42482k(int i) {
        if (i < 0 || i >= this.f44789d) {
            throw new IndexOutOfBoundsException(m42481h(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m42480f(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo37158c();
        C8910h1.m41832a(collection);
        if (!(collection instanceof C9028x)) {
            return super.addAll(collection);
        }
        C9028x xVar = (C9028x) collection;
        int i = xVar.f44789d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44789d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f44788c;
            if (i3 > zArr.length) {
                this.f44788c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(xVar.f44788c, 0, this.f44788c, this.f44789d, xVar.f44789d);
            this.f44789d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: e */
    public final void mo37220e(boolean z) {
        m42480f(this.f44789d, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9028x)) {
            return super.equals(obj);
        }
        C9028x xVar = (C9028x) obj;
        if (this.f44789d != xVar.f44789d) {
            return false;
        }
        boolean[] zArr = xVar.f44788c;
        for (int i = 0; i < this.f44789d; i++) {
            if (this.f44788c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m42482k(i);
        return Boolean.valueOf(this.f44788c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f44789d; i2++) {
            i = (i * 31) + C8910h1.m41837f(this.f44788c[i2]);
        }
        return i;
    }

    /* renamed from: o */
    public final /* synthetic */ C8934k1 mo36878o(int i) {
        if (i >= this.f44789d) {
            return new C9028x(Arrays.copyOf(this.f44788c, i), this.f44789d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        mo37158c();
        m42482k(i);
        boolean[] zArr = this.f44788c;
        boolean z = zArr[i];
        int i2 = this.f44789d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.f44789d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo37158c();
        for (int i = 0; i < this.f44789d; i++) {
            if (obj.equals(Boolean.valueOf(this.f44788c[i]))) {
                boolean[] zArr = this.f44788c;
                System.arraycopy(zArr, i + 1, zArr, i, this.f44789d - i);
                this.f44789d--;
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
            boolean[] zArr = this.f44788c;
            System.arraycopy(zArr, i2, zArr, i, this.f44789d - i2);
            this.f44789d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo37158c();
        m42482k(i);
        boolean[] zArr = this.f44788c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f44789d;
    }
}
