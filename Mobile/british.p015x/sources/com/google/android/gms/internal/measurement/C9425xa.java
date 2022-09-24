package com.google.android.gms.internal.measurement;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.xa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9425xa {

    /* renamed from: f */
    private static final C9425xa f45515f = new C9425xa(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f45516a;

    /* renamed from: b */
    private int[] f45517b;

    /* renamed from: c */
    private Object[] f45518c;

    /* renamed from: d */
    private int f45519d;

    /* renamed from: e */
    private boolean f45520e;

    private C9425xa() {
        this(0, new int[8], new Object[8], true);
    }

    private C9425xa(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f45519d = -1;
        this.f45516a = i;
        this.f45517b = iArr;
        this.f45518c = objArr;
        this.f45520e = z;
    }

    /* renamed from: c */
    public static C9425xa m43841c() {
        return f45515f;
    }

    /* renamed from: d */
    static C9425xa m43842d(C9425xa xaVar, C9425xa xaVar2) {
        int i = xaVar.f45516a + xaVar2.f45516a;
        int[] copyOf = Arrays.copyOf(xaVar.f45517b, i);
        System.arraycopy(xaVar2.f45517b, 0, copyOf, xaVar.f45516a, xaVar2.f45516a);
        Object[] copyOf2 = Arrays.copyOf(xaVar.f45518c, i);
        System.arraycopy(xaVar2.f45518c, 0, copyOf2, xaVar.f45516a, xaVar2.f45516a);
        return new C9425xa(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static C9425xa m43843e() {
        return new C9425xa(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo38167a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f45519d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f45516a; i6++) {
            int i7 = this.f45517b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f45518c[i6]).longValue();
                    i = C9452z7.m43944a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = C9452z7.m43944a(i8 << 3);
                    int c = ((C9329r7) this.f45518c[i6]).mo37731c();
                    i5 += a + C9452z7.m43944a(c) + c;
                } else if (i9 == 3) {
                    int D = C9452z7.m43943D(i8);
                    i3 = D + D;
                    i2 = ((C9425xa) this.f45518c[i6]).mo38167a();
                } else if (i9 == 5) {
                    ((Integer) this.f45518c[i6]).intValue();
                    i = C9452z7.m43944a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(C9085b9.m42683a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f45518c[i6]).longValue();
                i3 = C9452z7.m43944a(i8 << 3);
                i2 = C9452z7.m43945b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f45519d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo38168b() {
        int i = this.f45519d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45516a; i3++) {
            int i4 = this.f45517b[i3];
            int a = C9452z7.m43944a(8);
            int c = ((C9329r7) this.f45518c[i3]).mo37731c();
            i2 += a + a + C9452z7.m43944a(16) + C9452z7.m43944a(i4 >>> 3) + C9452z7.m43944a(24) + C9452z7.m43944a(c) + c;
        }
        this.f45519d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9425xa)) {
            return false;
        }
        C9425xa xaVar = (C9425xa) obj;
        int i = this.f45516a;
        if (i == xaVar.f45516a) {
            int[] iArr = this.f45517b;
            int[] iArr2 = xaVar.f45517b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f45518c;
                    Object[] objArr2 = xaVar.f45518c;
                    int i3 = this.f45516a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo38170f() {
        this.f45520e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo38171g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f45516a; i2++) {
            C9439y9.m43878b(sb, i, String.valueOf(this.f45517b[i2] >>> 3), this.f45518c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo38172h(int i, Object obj) {
        if (this.f45520e) {
            int i2 = this.f45516a;
            int[] iArr = this.f45517b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f45517b = Arrays.copyOf(iArr, i3);
                this.f45518c = Arrays.copyOf(this.f45518c, i3);
            }
            int[] iArr2 = this.f45517b;
            int i4 = this.f45516a;
            iArr2[i4] = i;
            this.f45518c[i4] = obj;
            this.f45516a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f45516a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f45517b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f45518c;
        int i7 = this.f45516a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo38174i(C9069a8 a8Var) throws IOException {
        if (this.f45516a != 0) {
            for (int i = 0; i < this.f45516a; i++) {
                int i2 = this.f45517b[i];
                Object obj = this.f45518c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    a8Var.mo37322E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    a8Var.mo37351x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    a8Var.mo37342o(i3, (C9329r7) obj);
                } else if (i4 == 3) {
                    a8Var.mo37333e(i3);
                    ((C9425xa) obj).mo38174i(a8Var);
                    a8Var.mo37346s(i3);
                } else if (i4 == 5) {
                    a8Var.mo37349v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(C9085b9.m42683a());
                }
            }
        }
    }
}
