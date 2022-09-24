package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.v3 */
public final class C9018v3 {

    /* renamed from: f */
    private static final C9018v3 f44759f = new C9018v3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f44760a;

    /* renamed from: b */
    private int[] f44761b;

    /* renamed from: c */
    private Object[] f44762c;

    /* renamed from: d */
    private int f44763d;

    /* renamed from: e */
    private boolean f44764e;

    private C9018v3() {
        this(0, new int[8], new Object[8], true);
    }

    private C9018v3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f44763d = -1;
        this.f44760a = i;
        this.f44761b = iArr;
        this.f44762c = objArr;
        this.f44764e = z;
    }

    /* renamed from: a */
    static C9018v3 m42414a(C9018v3 v3Var, C9018v3 v3Var2) {
        int i = v3Var.f44760a + v3Var2.f44760a;
        int[] copyOf = Arrays.copyOf(v3Var.f44761b, i);
        System.arraycopy(v3Var2.f44761b, 0, copyOf, v3Var.f44760a, v3Var2.f44760a);
        Object[] copyOf2 = Arrays.copyOf(v3Var.f44762c, i);
        System.arraycopy(v3Var2.f44762c, 0, copyOf2, v3Var.f44760a, v3Var2.f44760a);
        return new C9018v3(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    private static void m42415f(int i, Object obj, C8977p4 p4Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            p4Var.mo37068a(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            p4Var.mo37075i(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            p4Var.mo37060H(i2, (C8847a0) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                p4Var.mo37061I(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C8941l1.m41911c());
        } else if (p4Var.mo37088v() == C8891f1.C8896e.f44529l) {
            p4Var.mo37063K(i2);
            ((C9018v3) obj).mo37197g(p4Var);
            p4Var.mo37058F(i2);
        } else {
            p4Var.mo37058F(i2);
            ((C9018v3) obj).mo37197g(p4Var);
            p4Var.mo37063K(i2);
        }
    }

    /* renamed from: h */
    public static C9018v3 m42416h() {
        return f44759f;
    }

    /* renamed from: i */
    static C9018v3 m42417i() {
        return new C9018v3();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37192b(C8977p4 p4Var) throws IOException {
        if (p4Var.mo37088v() == C8891f1.C8896e.f44530m) {
            for (int i = this.f44760a - 1; i >= 0; i--) {
                p4Var.mo37076j(this.f44761b[i] >>> 3, this.f44762c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f44760a; i2++) {
            p4Var.mo37076j(this.f44761b[i2] >>> 3, this.f44762c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo37193c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f44760a; i2++) {
            C8968o2.m42157c(sb, i, String.valueOf(this.f44761b[i2] >>> 3), this.f44762c[i2]);
        }
    }

    /* renamed from: d */
    public final int mo37194d() {
        int i;
        int i2 = this.f44763d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f44760a; i4++) {
            int i5 = this.f44761b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C8947m0.m41953d0(i6, ((Long) this.f44762c[i4]).longValue());
            } else if (i7 == 1) {
                i = C8947m0.m41960k0(i6, ((Long) this.f44762c[i4]).longValue());
            } else if (i7 == 2) {
                i = C8947m0.m41941N(i6, (C8847a0) this.f44762c[i4]);
            } else if (i7 == 3) {
                i = (C8947m0.m41928B0(i6) << 1) + ((C9018v3) this.f44762c[i4]).mo37194d();
            } else if (i7 == 5) {
                i = C8947m0.m41968t0(i6, ((Integer) this.f44762c[i4]).intValue());
            } else {
                throw new IllegalStateException(C8941l1.m41911c());
            }
            i3 += i;
        }
        this.f44763d = i3;
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo37195e(int i, Object obj) {
        if (this.f44764e) {
            int i2 = this.f44760a;
            int[] iArr = this.f44761b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f44761b = Arrays.copyOf(iArr, i3);
                this.f44762c = Arrays.copyOf(this.f44762c, i3);
            }
            int[] iArr2 = this.f44761b;
            int i4 = this.f44760a;
            iArr2[i4] = i;
            this.f44762c[i4] = obj;
            this.f44760a = i4 + 1;
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
        if (obj == null || !(obj instanceof C9018v3)) {
            return false;
        }
        C9018v3 v3Var = (C9018v3) obj;
        int i = this.f44760a;
        if (i == v3Var.f44760a) {
            int[] iArr = this.f44761b;
            int[] iArr2 = v3Var.f44761b;
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
                Object[] objArr = this.f44762c;
                Object[] objArr2 = v3Var.f44762c;
                int i3 = this.f44760a;
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

    /* renamed from: g */
    public final void mo37197g(C8977p4 p4Var) throws IOException {
        if (this.f44760a != 0) {
            if (p4Var.mo37088v() == C8891f1.C8896e.f44529l) {
                for (int i = 0; i < this.f44760a; i++) {
                    m42415f(this.f44761b[i], this.f44762c[i], p4Var);
                }
                return;
            }
            for (int i2 = this.f44760a - 1; i2 >= 0; i2--) {
                m42415f(this.f44761b[i2], this.f44762c[i2], p4Var);
            }
        }
    }

    public final int hashCode() {
        int i = this.f44760a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f44761b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f44762c;
        int i7 = this.f44760a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: j */
    public final int mo37199j() {
        int i = this.f44763d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f44760a; i3++) {
            i2 += C8947m0.m41948X(this.f44761b[i3] >>> 3, (C8847a0) this.f44762c[i3]);
        }
        this.f44763d = i2;
        return i2;
    }

    /* renamed from: k */
    public final void mo37200k() {
        this.f44764e = false;
    }
}
