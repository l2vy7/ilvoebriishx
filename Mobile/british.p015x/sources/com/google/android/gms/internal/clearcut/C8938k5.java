package com.google.android.gms.internal.clearcut;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.k5 */
public final class C8938k5 extends C8998s4<C8938k5> implements Cloneable {

    /* renamed from: d */
    private String[] f44588d;

    /* renamed from: e */
    private String[] f44589e;

    /* renamed from: f */
    private int[] f44590f = C8852a5.f44385a;

    /* renamed from: g */
    private long[] f44591g;

    /* renamed from: h */
    private long[] f44592h;

    public C8938k5() {
        String[] strArr = C8852a5.f44390f;
        this.f44588d = strArr;
        this.f44589e = strArr;
        long[] jArr = C8852a5.f44386b;
        this.f44591g = jArr;
        this.f44592h = jArr;
        this.f44739c = null;
        this.f44796b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C8938k5 clone() {
        try {
            C8938k5 k5Var = (C8938k5) super.clone();
            String[] strArr = this.f44588d;
            if (strArr != null && strArr.length > 0) {
                k5Var.f44588d = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f44589e;
            if (strArr2 != null && strArr2.length > 0) {
                k5Var.f44589e = (String[]) strArr2.clone();
            }
            int[] iArr = this.f44590f;
            if (iArr != null && iArr.length > 0) {
                k5Var.f44590f = (int[]) iArr.clone();
            }
            long[] jArr = this.f44591g;
            if (jArr != null && jArr.length > 0) {
                k5Var.f44591g = (long[]) jArr.clone();
            }
            long[] jArr2 = this.f44592h;
            if (jArr2 != null && jArr2.length > 0) {
                k5Var.f44592h = (long[]) jArr2.clone();
            }
            return k5Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo36988a(C8984q4 q4Var) throws IOException {
        String[] strArr = this.f44588d;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f44588d;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    q4Var.mo37122c(1, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.f44589e;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f44589e;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    q4Var.mo37122c(2, str2);
                }
                i3++;
            }
        }
        int[] iArr = this.f44590f;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f44590f;
                if (i4 >= iArr2.length) {
                    break;
                }
                q4Var.mo37126l(3, iArr2[i4]);
                i4++;
            }
        }
        long[] jArr = this.f44591g;
        if (jArr != null && jArr.length > 0) {
            int i5 = 0;
            while (true) {
                long[] jArr2 = this.f44591g;
                if (i5 >= jArr2.length) {
                    break;
                }
                q4Var.mo37129u(4, jArr2[i5]);
                i5++;
            }
        }
        long[] jArr3 = this.f44592h;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f44592h;
                if (i >= jArr4.length) {
                    break;
                }
                q4Var.mo37129u(5, jArr4[i]);
                i++;
            }
        }
        super.mo36988a(q4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo36990d() {
        long[] jArr;
        int[] iArr;
        int d = super.mo36990d();
        String[] strArr = this.f44588d;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f44588d;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += C8984q4.m42297r(str);
                }
                i2++;
            }
            d = d + i3 + (i4 * 1);
        }
        String[] strArr3 = this.f44589e;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.f44589e;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += C8984q4.m42297r(str2);
                }
                i5++;
            }
            d = d + i6 + (i7 * 1);
        }
        int[] iArr2 = this.f44590f;
        if (iArr2 != null && iArr2.length > 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iArr = this.f44590f;
                if (i8 >= iArr.length) {
                    break;
                }
                i9 += C8984q4.m42303z(iArr[i8]);
                i8++;
            }
            d = d + i9 + (iArr.length * 1);
        }
        long[] jArr2 = this.f44591g;
        if (jArr2 != null && jArr2.length > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                jArr = this.f44591g;
                if (i10 >= jArr.length) {
                    break;
                }
                i11 += C8984q4.m42301x(jArr[i10]);
                i10++;
            }
            d = d + i11 + (jArr.length * 1);
        }
        long[] jArr3 = this.f44592h;
        if (jArr3 == null || jArr3.length <= 0) {
            return d;
        }
        int i12 = 0;
        while (true) {
            long[] jArr4 = this.f44592h;
            if (i >= jArr4.length) {
                return d + i12 + (jArr4.length * 1);
            }
            i12 += C8984q4.m42301x(jArr4[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8938k5)) {
            return false;
        }
        C8938k5 k5Var = (C8938k5) obj;
        if (!C9026w4.m42467c(this.f44588d, k5Var.f44588d) || !C9026w4.m42467c(this.f44589e, k5Var.f44589e) || !C9026w4.m42465a(this.f44590f, k5Var.f44590f) || !C9026w4.m42466b(this.f44591g, k5Var.f44591g) || !C9026w4.m42466b(this.f44592h, k5Var.f44592h)) {
            return false;
        }
        C9012u4 u4Var = this.f44739c;
        if (u4Var != null && !u4Var.mo37183a()) {
            return this.f44739c.equals(k5Var.f44739c);
        }
        C9012u4 u4Var2 = k5Var.f44739c;
        return u4Var2 == null || u4Var2.mo37183a();
    }

    /* renamed from: g */
    public final /* synthetic */ C9033x4 mo36992g() throws CloneNotSupportedException {
        return (C8938k5) clone();
    }

    /* renamed from: h */
    public final /* synthetic */ C8998s4 mo36993h() throws CloneNotSupportedException {
        return (C8938k5) clone();
    }

    public final int hashCode() {
        int hashCode = (((((((((((C8938k5.class.getName().hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + C9026w4.m42470f(this.f44588d)) * 31) + C9026w4.m42470f(this.f44589e)) * 31) + C9026w4.m42468d(this.f44590f)) * 31) + C9026w4.m42469e(this.f44591g)) * 31) + C9026w4.m42469e(this.f44592h)) * 31;
        C9012u4 u4Var = this.f44739c;
        return hashCode + ((u4Var == null || u4Var.mo37183a()) ? 0 : this.f44739c.hashCode());
    }
}
