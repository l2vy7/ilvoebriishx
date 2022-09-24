package com.google.android.gms.internal.vision;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.vision.n5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9580n5 {

    /* renamed from: f */
    private static final C9580n5 f45751f = new C9580n5(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f45752a;

    /* renamed from: b */
    private int[] f45753b;

    /* renamed from: c */
    private Object[] f45754c;

    /* renamed from: d */
    private int f45755d;

    /* renamed from: e */
    private boolean f45756e;

    private C9580n5() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    static C9580n5 m44485a(C9580n5 n5Var, C9580n5 n5Var2) {
        int i = n5Var.f45752a + n5Var2.f45752a;
        int[] copyOf = Arrays.copyOf(n5Var.f45753b, i);
        System.arraycopy(n5Var2.f45753b, 0, copyOf, n5Var.f45752a, n5Var2.f45752a);
        Object[] copyOf2 = Arrays.copyOf(n5Var.f45754c, i);
        System.arraycopy(n5Var2.f45754c, 0, copyOf2, n5Var.f45752a, n5Var2.f45752a);
        return new C9580n5(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    private static void m44486e(int i, Object obj, C9540i6 i6Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            i6Var.mo38351a(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            i6Var.mo38359i(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            i6Var.mo38349M(i2, (C9552k1) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                i6Var.mo38375y(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C9513f3.m44258d());
        } else if (i6Var.mo38350N() == C9557k6.f45726a) {
            i6Var.mo38339C(i2);
            ((C9580n5) obj).mo38517f(i6Var);
            i6Var.mo38347K(i2);
        } else {
            i6Var.mo38347K(i2);
            ((C9580n5) obj).mo38517f(i6Var);
            i6Var.mo38339C(i2);
        }
    }

    /* renamed from: i */
    public static C9580n5 m44487i() {
        return f45751f;
    }

    /* renamed from: j */
    static C9580n5 m44488j() {
        return new C9580n5();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38513b(C9540i6 i6Var) throws IOException {
        if (i6Var.mo38350N() == C9557k6.f45727b) {
            for (int i = this.f45752a - 1; i >= 0; i--) {
                i6Var.mo38360j(this.f45753b[i] >>> 3, this.f45754c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f45752a; i2++) {
            i6Var.mo38360j(this.f45753b[i2] >>> 3, this.f45754c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo38514c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f45752a; i2++) {
            C9530h4.m44291c(sb, i, String.valueOf(this.f45753b[i2] >>> 3), this.f45754c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo38515d(int i, Object obj) {
        if (this.f45756e) {
            int i2 = this.f45752a;
            int[] iArr = this.f45753b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f45753b = Arrays.copyOf(iArr, i3);
                this.f45754c = Arrays.copyOf(this.f45754c, i3);
            }
            int[] iArr2 = this.f45753b;
            int i4 = this.f45752a;
            iArr2[i4] = i;
            this.f45754c[i4] = obj;
            this.f45752a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9580n5)) {
            return false;
        }
        C9580n5 n5Var = (C9580n5) obj;
        int i = this.f45752a;
        if (i == n5Var.f45752a) {
            int[] iArr = this.f45753b;
            int[] iArr2 = n5Var.f45753b;
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
                Object[] objArr = this.f45754c;
                Object[] objArr2 = n5Var.f45754c;
                int i3 = this.f45752a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    /* renamed from: f */
    public final void mo38517f(C9540i6 i6Var) throws IOException {
        if (this.f45752a != 0) {
            if (i6Var.mo38350N() == C9557k6.f45726a) {
                for (int i = 0; i < this.f45752a; i++) {
                    m44486e(this.f45753b[i], this.f45754c[i], i6Var);
                }
                return;
            }
            for (int i2 = this.f45752a - 1; i2 >= 0; i2--) {
                m44486e(this.f45753b[i2], this.f45754c[i2], i6Var);
            }
        }
    }

    /* renamed from: g */
    public final void mo38518g() {
        this.f45756e = false;
    }

    /* renamed from: h */
    public final int mo38519h() {
        int i;
        int i2 = this.f45755d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f45752a; i4++) {
            int i5 = this.f45753b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C9482c2.m44076Y(i6, ((Long) this.f45754c[i4]).longValue());
            } else if (i7 == 1) {
                i = C9482c2.m44081c0(i6, ((Long) this.f45754c[i4]).longValue());
            } else if (i7 == 2) {
                i = C9482c2.m44070Q(i6, (C9552k1) this.f45754c[i4]);
            } else if (i7 == 3) {
                i = (C9482c2.m44061H(i6) << 1) + ((C9580n5) this.f45754c[i4]).mo38519h();
            } else if (i7 == 5) {
                i = C9482c2.m44091q0(i6, ((Integer) this.f45754c[i4]).intValue());
            } else {
                throw new IllegalStateException(C9513f3.m44258d());
            }
            i3 += i;
        }
        this.f45755d = i3;
        return i3;
    }

    public final int hashCode() {
        int i = this.f45752a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f45753b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f45754c;
        int i7 = this.f45752a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: k */
    public final int mo38521k() {
        int i = this.f45755d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45752a; i3++) {
            i2 += C9482c2.m44074W(this.f45753b[i3] >>> 3, (C9552k1) this.f45754c[i3]);
        }
        this.f45755d = i2;
        return i2;
    }

    private C9580n5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f45755d = -1;
        this.f45752a = i;
        this.f45753b = iArr;
        this.f45754c = objArr;
        this.f45756e = z;
    }
}
