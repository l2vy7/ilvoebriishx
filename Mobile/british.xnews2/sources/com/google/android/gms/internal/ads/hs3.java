package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hs3 {

    /* renamed from: f */
    private static final hs3 f32835f = new hs3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f32836a;

    /* renamed from: b */
    private int[] f32837b;

    /* renamed from: c */
    private Object[] f32838c;

    /* renamed from: d */
    private int f32839d;

    /* renamed from: e */
    private boolean f32840e;

    private hs3() {
        this(0, new int[8], new Object[8], true);
    }

    private hs3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f32839d = -1;
        this.f32836a = i;
        this.f32837b = iArr;
        this.f32838c = objArr;
        this.f32840e = z;
    }

    /* renamed from: c */
    public static hs3 m32931c() {
        return f32835f;
    }

    /* renamed from: d */
    static hs3 m32932d(hs3 hs3, hs3 hs32) {
        int i = hs3.f32836a + hs32.f32836a;
        int[] copyOf = Arrays.copyOf(hs3.f32837b, i);
        System.arraycopy(hs32.f32837b, 0, copyOf, hs3.f32836a, hs32.f32836a);
        Object[] copyOf2 = Arrays.copyOf(hs3.f32838c, i);
        System.arraycopy(hs32.f32838c, 0, copyOf2, hs3.f32836a, hs32.f32836a);
        return new hs3(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static hs3 m32933e() {
        return new hs3(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo32444a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f32839d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f32836a; i6++) {
            int i7 = this.f32837b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f32838c[i6]).longValue();
                    i = ro3.m37151a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = ro3.m37151a(i8 << 3);
                    int q = ((eo3) this.f32838c[i6]).mo30457q();
                    i5 += a + ro3.m37151a(q) + q;
                } else if (i9 == 3) {
                    int D = ro3.m37150D(i8);
                    i3 = D + D;
                    i2 = ((hs3) this.f32838c[i6]).mo32444a();
                } else if (i9 == 5) {
                    ((Integer) this.f32838c[i6]).intValue();
                    i = ro3.m37151a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(wp3.m39222a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f32838c[i6]).longValue();
                i3 = ro3.m37151a(i8 << 3);
                i2 = ro3.m37152b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f32839d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo32445b() {
        int i = this.f32839d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32836a; i3++) {
            int i4 = this.f32837b[i3];
            int a = ro3.m37151a(8);
            int q = ((eo3) this.f32838c[i3]).mo30457q();
            i2 += a + a + ro3.m37151a(16) + ro3.m37151a(i4 >>> 3) + ro3.m37151a(24) + ro3.m37151a(q) + q;
        }
        this.f32839d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hs3)) {
            return false;
        }
        hs3 hs3 = (hs3) obj;
        int i = this.f32836a;
        if (i == hs3.f32836a) {
            int[] iArr = this.f32837b;
            int[] iArr2 = hs3.f32837b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f32838c;
                    Object[] objArr2 = hs3.f32838c;
                    int i3 = this.f32836a;
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
    public final void mo32447f() {
        this.f32840e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo32448g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f32836a; i2++) {
            wq3.m39237b(sb, i, String.valueOf(this.f32837b[i2] >>> 3), this.f32838c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo32449h(int i, Object obj) {
        if (this.f32840e) {
            int i2 = this.f32836a;
            int[] iArr = this.f32837b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f32837b = Arrays.copyOf(iArr, i3);
                this.f32838c = Arrays.copyOf(this.f32838c, i3);
            }
            int[] iArr2 = this.f32837b;
            int i4 = this.f32836a;
            iArr2[i4] = i;
            this.f32838c[i4] = obj;
            this.f32836a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f32836a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f32837b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f32838c;
        int i7 = this.f32836a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo32451i(so3 so3) throws IOException {
        if (this.f32836a != 0) {
            for (int i = 0; i < this.f32836a; i++) {
                int i2 = this.f32837b[i];
                Object obj = this.f32838c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    so3.mo34737E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    so3.mo34766x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    so3.mo34757o(i3, (eo3) obj);
                } else if (i4 == 3) {
                    so3.mo34748e(i3);
                    ((hs3) obj).mo32451i(so3);
                    so3.mo34761s(i3);
                } else if (i4 == 5) {
                    so3.mo34764v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(wp3.m39222a());
                }
            }
        }
    }
}
