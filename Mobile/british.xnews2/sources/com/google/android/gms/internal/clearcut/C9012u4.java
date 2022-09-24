package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.u4 */
public final class C9012u4 implements Cloneable {

    /* renamed from: f */
    private static final C9019v4 f44750f = new C9019v4();

    /* renamed from: b */
    private boolean f44751b;

    /* renamed from: c */
    private int[] f44752c;

    /* renamed from: d */
    private C9019v4[] f44753d;

    /* renamed from: e */
    private int f44754e;

    C9012u4() {
        this(10);
    }

    private C9012u4(int i) {
        this.f44751b = false;
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f44752c = new int[i5];
        this.f44753d = new C9019v4[i5];
        this.f44754e = 0;
    }

    /* renamed from: a */
    public final boolean mo37183a() {
        return this.f44754e == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo37184b() {
        return this.f44754e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C9019v4 mo37185c(int i) {
        return this.f44753d[i];
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f44754e;
        C9012u4 u4Var = new C9012u4(i);
        System.arraycopy(this.f44752c, 0, u4Var.f44752c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C9019v4[] v4VarArr = this.f44753d;
            if (v4VarArr[i2] != null) {
                u4Var.f44753d[i2] = (C9019v4) v4VarArr[i2].clone();
            }
        }
        u4Var.f44754e = i;
        return u4Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9012u4)) {
            return false;
        }
        C9012u4 u4Var = (C9012u4) obj;
        int i = this.f44754e;
        if (i != u4Var.f44754e) {
            return false;
        }
        int[] iArr = this.f44752c;
        int[] iArr2 = u4Var.f44752c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C9019v4[] v4VarArr = this.f44753d;
            C9019v4[] v4VarArr2 = u4Var.f44753d;
            int i3 = this.f44754e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!v4VarArr[i4].equals(v4VarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f44754e; i2++) {
            i = (((i * 31) + this.f44752c[i2]) * 31) + this.f44753d[i2].hashCode();
        }
        return i;
    }
}
