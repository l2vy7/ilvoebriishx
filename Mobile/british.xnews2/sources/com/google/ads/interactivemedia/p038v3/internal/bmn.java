package com.google.ads.interactivemedia.p038v3.internal;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmn */
/* compiled from: IMASDK */
public final class bmn {

    /* renamed from: a */
    private static final bmn f16697a = new bmn(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f16698b;

    /* renamed from: c */
    private int[] f16699c;

    /* renamed from: d */
    private Object[] f16700d;

    /* renamed from: e */
    private int f16701e;

    /* renamed from: f */
    private boolean f16702f;

    private bmn() {
        this(0, new int[8], new Object[8], true);
    }

    private bmn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f16701e = -1;
        this.f16698b = i;
        this.f16699c = iArr;
        this.f16700d = objArr;
        this.f16702f = z;
    }

    /* renamed from: a */
    public static bmn m16671a() {
        return f16697a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public static bmn m16672b() {
        return new bmn(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    static bmn m16673c(bmn bmn, bmn bmn2) {
        int i = bmn.f16698b + bmn2.f16698b;
        int[] copyOf = Arrays.copyOf(bmn.f16699c, i);
        System.arraycopy(bmn2.f16699c, 0, copyOf, bmn.f16698b, bmn2.f16698b);
        Object[] copyOf2 = Arrays.copyOf(bmn.f16700d, i);
        System.arraycopy(bmn2.f16700d, 0, copyOf2, bmn.f16698b, bmn2.f16698b);
        return new bmn(i, copyOf, copyOf2, true);
    }

    /* renamed from: j */
    private static void m16674j(int i, Object obj, bne bne) throws IOException {
        int b = bnd.m16788b(i);
        int a = bnd.m16787a(i);
        if (a == 0) {
            bne.mo15334c(b, ((Long) obj).longValue());
        } else if (a == 1) {
            bne.mo15341j(b, ((Long) obj).longValue());
        } else if (a == 2) {
            bne.mo15345n(b, (bjq) obj);
        } else if (a == 3) {
            bne.mo15351t(b);
            ((bmn) obj).mo15508e(bne);
            bne.mo15352u(b);
        } else if (a == 5) {
            bne.mo15342k(b, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(bkt.m16353f());
        }
    }

    /* renamed from: d */
    public final void mo15507d() {
        this.f16702f = false;
    }

    /* renamed from: e */
    public final void mo15508e(bne bne) throws IOException {
        if (this.f16698b != 0) {
            for (int i = 0; i < this.f16698b; i++) {
                m16674j(this.f16699c[i], this.f16700d[i], bne);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bmn)) {
            return false;
        }
        bmn bmn = (bmn) obj;
        int i = this.f16698b;
        if (i == bmn.f16698b) {
            int[] iArr = this.f16699c;
            int[] iArr2 = bmn.f16699c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f16700d;
                    Object[] objArr2 = bmn.f16700d;
                    int i3 = this.f16698b;
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
    public final int mo15510f() {
        int i = this.f16701e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16698b; i3++) {
            int i4 = this.f16699c[i3];
            int I = bjw.m16181I(1);
            i2 += I + I + bjw.m16205z(2, bnd.m16788b(i4)) + bjw.m16179G(3, (bjq) this.f16700d[i3]);
        }
        this.f16701e = i2;
        return i2;
    }

    /* renamed from: g */
    public final int mo15511g() {
        int i;
        int i2 = this.f16701e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f16698b; i4++) {
            int i5 = this.f16699c[i4];
            int b = bnd.m16788b(i5);
            int a = bnd.m16787a(i5);
            if (a == 0) {
                i = bjw.m16175C(b, ((Long) this.f16700d[i4]).longValue());
            } else if (a == 1) {
                ((Long) this.f16700d[i4]).longValue();
                i = bjw.m16200ax(b);
            } else if (a == 2) {
                i = bjw.m16179G(b, (bjq) this.f16700d[i4]);
            } else if (a == 3) {
                int I = bjw.m16181I(b);
                i = I + I + ((bmn) this.f16700d[i4]).mo15511g();
            } else if (a == 5) {
                ((Integer) this.f16700d[i4]).intValue();
                i = bjw.m16199aw(b);
            } else {
                throw new IllegalStateException(bkt.m16353f());
            }
            i3 += i;
        }
        this.f16701e = i3;
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo15512h(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f16698b; i2++) {
            blr.m16498c(sb, i, String.valueOf(bnd.m16788b(this.f16699c[i2])), this.f16700d[i2]);
        }
    }

    public final int hashCode() {
        int i = this.f16698b;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f16699c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f16700d;
        int i7 = this.f16698b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo15514i(int i, Object obj) {
        if (this.f16702f) {
            int i2 = this.f16698b;
            int[] iArr = this.f16699c;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f16699c = Arrays.copyOf(iArr, i3);
                this.f16700d = Arrays.copyOf(this.f16700d, i3);
            }
            int[] iArr2 = this.f16699c;
            int i4 = this.f16698b;
            iArr2[i4] = i;
            this.f16700d[i4] = obj;
            this.f16698b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
