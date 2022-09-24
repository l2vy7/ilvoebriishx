package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.vision.c2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public abstract class C9482c2 extends C9560l1 {

    /* renamed from: b */
    private static final Logger f45598b = Logger.getLogger(C9482c2.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f45599c = C9652v5.m44699u();

    /* renamed from: a */
    C9502e2 f45600a;

    /* renamed from: com.google.android.gms.internal.vision.c2$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static class C9483a extends IOException {
        C9483a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C9483a(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9482c2.C9483a.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.c2$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private static class C9484b extends C9482c2 {

        /* renamed from: d */
        private final byte[] f45601d;

        /* renamed from: e */
        private final int f45602e;

        /* renamed from: f */
        private final int f45603f;

        /* renamed from: g */
        private int f45604g;

        C9484b(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            if ((i2 | 0 | (bArr.length - i2)) >= 0) {
                this.f45601d = bArr;
                this.f45602e = 0;
                this.f45604g = 0;
                this.f45603f = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
        }

        /* renamed from: F0 */
        private final void m44139F0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f45601d, this.f45604g, i2);
                this.f45604g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C9483a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45604g), Integer.valueOf(this.f45603f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: A0 */
        public final void mo38265A0(String str) throws IOException {
            int i = this.f45604g;
            try {
                int J = C9482c2.m44063J(str.length() * 3);
                int J2 = C9482c2.m44063J(str.length());
                if (J2 == J) {
                    int i2 = i + J2;
                    this.f45604g = i2;
                    int b = C9676x5.m44823b(str, this.f45601d, i2, mo38275d0());
                    this.f45604g = i;
                    mo38269E((b - i) - J2);
                    this.f45604g = b;
                    return;
                }
                mo38269E(C9676x5.m44822a(str));
                this.f45604g = C9676x5.m44823b(str, this.f45601d, this.f45604g, mo38275d0());
            } catch (C9477b6 e) {
                this.f45604g = i;
                mo38292p(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C9483a(e2);
            }
        }

        /* renamed from: B */
        public final void mo38266B(int i, C9552k1 k1Var) throws IOException {
            mo38274b(1, 3);
            mo38282i0(2, i);
            mo38283j(3, k1Var);
            mo38274b(1, 4);
        }

        /* renamed from: C */
        public final void mo38267C(C9522g4 g4Var) throws IOException {
            mo38269E(g4Var.mo38402b());
            g4Var.mo38404g(this);
        }

        /* renamed from: D */
        public final void mo38268D(int i) throws IOException {
            if (i >= 0) {
                mo38269E(i);
            } else {
                mo38294u0((long) i);
            }
        }

        /* renamed from: E */
        public final void mo38269E(int i) throws IOException {
            if (!C9482c2.f45599c || C9519g1.m44268a() || mo38275d0() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f45601d;
                    int i2 = this.f45604g;
                    this.f45604g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f45601d;
                    int i3 = this.f45604g;
                    this.f45604g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C9483a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45604g), Integer.valueOf(this.f45603f), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f45601d;
                int i4 = this.f45604g;
                this.f45604g = i4 + 1;
                C9652v5.m44686h(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f45601d;
                int i5 = this.f45604g;
                this.f45604g = i5 + 1;
                C9652v5.m44686h(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f45601d;
                    int i7 = this.f45604g;
                    this.f45604g = i7 + 1;
                    C9652v5.m44686h(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f45601d;
                int i8 = this.f45604g;
                this.f45604g = i8 + 1;
                C9652v5.m44686h(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f45601d;
                    int i10 = this.f45604g;
                    this.f45604g = i10 + 1;
                    C9652v5.m44686h(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f45601d;
                int i11 = this.f45604g;
                this.f45604g = i11 + 1;
                C9652v5.m44686h(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f45601d;
                    int i13 = this.f45604g;
                    this.f45604g = i13 + 1;
                    C9652v5.m44686h(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f45601d;
                int i14 = this.f45604g;
                this.f45604g = i14 + 1;
                C9652v5.m44686h(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f45601d;
                int i15 = this.f45604g;
                this.f45604g = i15 + 1;
                C9652v5.m44686h(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: G */
        public final void mo38271G(int i) throws IOException {
            try {
                byte[] bArr = this.f45601d;
                int i2 = this.f45604g;
                int i3 = i2 + 1;
                this.f45604g = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.f45604g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.f45604g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f45604g = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C9483a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45604g), Integer.valueOf(this.f45603f), 1}), e);
            }
        }

        /* renamed from: T */
        public final void mo38272T(byte b) throws IOException {
            try {
                byte[] bArr = this.f45601d;
                int i = this.f45604g;
                this.f45604g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C9483a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45604g), Integer.valueOf(this.f45603f), 1}), e);
            }
        }

        /* renamed from: U */
        public final void mo38273U(int i, long j) throws IOException {
            mo38274b(i, 1);
            mo38296x0(j);
        }

        /* renamed from: a */
        public final void mo38297a(byte[] bArr, int i, int i2) throws IOException {
            m44139F0(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo38274b(int i, int i2) throws IOException {
            mo38269E((i << 3) | i2);
        }

        /* renamed from: d0 */
        public final int mo38275d0() {
            return this.f45603f - this.f45604g;
        }

        /* renamed from: h0 */
        public final void mo38280h0(int i, int i2) throws IOException {
            mo38274b(i, 0);
            mo38268D(i2);
        }

        /* renamed from: i */
        public final void mo38281i(int i, long j) throws IOException {
            mo38274b(i, 0);
            mo38294u0(j);
        }

        /* renamed from: i0 */
        public final void mo38282i0(int i, int i2) throws IOException {
            mo38274b(i, 0);
            mo38269E(i2);
        }

        /* renamed from: j */
        public final void mo38283j(int i, C9552k1 k1Var) throws IOException {
            mo38274b(i, 2);
            mo38291o(k1Var);
        }

        /* renamed from: k */
        public final void mo38285k(int i, C9522g4 g4Var) throws IOException {
            mo38274b(1, 3);
            mo38282i0(2, i);
            mo38274b(3, 2);
            mo38267C(g4Var);
            mo38274b(1, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public final void mo38286l(int i, C9522g4 g4Var, C9664w4 w4Var) throws IOException {
            mo38274b(i, 2);
            C9687z0 z0Var = (C9687z0) g4Var;
            int i2 = z0Var.mo38610i();
            if (i2 == -1) {
                i2 = w4Var.mo38448g(z0Var);
                z0Var.mo38608f(i2);
            }
            mo38269E(i2);
            w4Var.mo38450i(g4Var, this.f45600a);
        }

        /* renamed from: m */
        public final void mo38288m(int i, String str) throws IOException {
            mo38274b(i, 2);
            mo38265A0(str);
        }

        /* renamed from: m0 */
        public final void mo38289m0(int i, int i2) throws IOException {
            mo38274b(i, 5);
            mo38271G(i2);
        }

        /* renamed from: n */
        public final void mo38290n(int i, boolean z) throws IOException {
            mo38274b(i, 0);
            mo38272T(z ? (byte) 1 : 0);
        }

        /* renamed from: o */
        public final void mo38291o(C9552k1 k1Var) throws IOException {
            mo38269E(k1Var.size());
            k1Var.mo38456e(this);
        }

        /* renamed from: u0 */
        public final void mo38294u0(long j) throws IOException {
            if (!C9482c2.f45599c || mo38275d0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f45601d;
                    int i = this.f45604g;
                    this.f45604g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f45601d;
                    int i2 = this.f45604g;
                    this.f45604g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C9483a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45604g), Integer.valueOf(this.f45603f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f45601d;
                    int i3 = this.f45604g;
                    this.f45604g = i3 + 1;
                    C9652v5.m44686h(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f45601d;
                int i4 = this.f45604g;
                this.f45604g = i4 + 1;
                C9652v5.m44686h(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: x0 */
        public final void mo38296x0(long j) throws IOException {
            try {
                byte[] bArr = this.f45601d;
                int i = this.f45604g;
                int i2 = i + 1;
                this.f45604g = i2;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                this.f45604g = i3;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                this.f45604g = i4;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                this.f45604g = i5;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                this.f45604g = i6;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                this.f45604g = i7;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                this.f45604g = i8;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.f45604g = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C9483a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45604g), Integer.valueOf(this.f45603f), 1}), e);
            }
        }
    }

    private C9482c2() {
    }

    /* renamed from: B0 */
    public static int m44057B0(long j) {
        return m44105z0(m44090q(j));
    }

    /* renamed from: C0 */
    public static int m44058C0(String str) {
        int i;
        try {
            i = C9676x5.m44822a(str);
        } catch (C9477b6 unused) {
            i = str.getBytes(C9662w2.f45956a).length;
        }
        return m44063J(i) + i;
    }

    /* renamed from: D0 */
    public static int m44059D0(long j) {
        return 8;
    }

    /* renamed from: E0 */
    public static int m44060E0(long j) {
        return 8;
    }

    /* renamed from: H */
    public static int m44061H(int i) {
        return m44063J(i << 3);
    }

    /* renamed from: I */
    public static int m44062I(int i) {
        if (i >= 0) {
            return m44063J(i);
        }
        return 10;
    }

    /* renamed from: J */
    public static int m44063J(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: K */
    public static int m44064K(int i) {
        return m44063J(m44068O(i));
    }

    /* renamed from: L */
    public static int m44065L(int i) {
        return 4;
    }

    /* renamed from: M */
    public static int m44066M(int i) {
        return 4;
    }

    /* renamed from: N */
    public static int m44067N(int i) {
        return m44062I(i);
    }

    /* renamed from: O */
    private static int m44068O(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: P */
    public static int m44069P(int i) {
        return m44063J(i);
    }

    /* renamed from: Q */
    public static int m44070Q(int i, C9552k1 k1Var) {
        int J = m44063J(i << 3);
        int size = k1Var.size();
        return J + m44063J(size) + size;
    }

    @Deprecated
    /* renamed from: R */
    static int m44071R(int i, C9522g4 g4Var, C9664w4 w4Var) {
        int J = m44063J(i << 3) << 1;
        C9687z0 z0Var = (C9687z0) g4Var;
        int i2 = z0Var.mo38610i();
        if (i2 == -1) {
            i2 = w4Var.mo38448g(z0Var);
            z0Var.mo38608f(i2);
        }
        return J + i2;
    }

    /* renamed from: S */
    public static int m44072S(C9522g4 g4Var) {
        int b = g4Var.mo38402b();
        return m44063J(b) + b;
    }

    /* renamed from: V */
    public static int m44073V(int i, long j) {
        return m44063J(i << 3) + m44105z0(j);
    }

    /* renamed from: W */
    public static int m44074W(int i, C9552k1 k1Var) {
        return (m44063J(8) << 1) + m44088o0(2, i) + m44070Q(3, k1Var);
    }

    @Deprecated
    /* renamed from: X */
    public static int m44075X(C9522g4 g4Var) {
        return g4Var.mo38402b();
    }

    /* renamed from: Y */
    public static int m44076Y(int i, long j) {
        return m44063J(i << 3) + m44105z0(j);
    }

    /* renamed from: Z */
    public static C9482c2 m44077Z(byte[] bArr) {
        return new C9484b(bArr, 0, bArr.length);
    }

    /* renamed from: a0 */
    public static int m44078a0(int i, long j) {
        return m44063J(i << 3) + m44105z0(m44090q(j));
    }

    /* renamed from: b0 */
    public static int m44079b0(byte[] bArr) {
        int length = bArr.length;
        return m44063J(length) + length;
    }

    /* renamed from: c */
    public static int m44080c(int i, C9554k3 k3Var) {
        int J = m44063J(i << 3);
        int b = k3Var.mo38483b();
        return J + m44063J(b) + b;
    }

    /* renamed from: c0 */
    public static int m44081c0(int i, long j) {
        return m44063J(i << 3) + 8;
    }

    /* renamed from: d */
    public static int m44082d(C9554k3 k3Var) {
        int b = k3Var.mo38483b();
        return m44063J(b) + b;
    }

    /* renamed from: e */
    static int m44083e(C9522g4 g4Var, C9664w4 w4Var) {
        C9687z0 z0Var = (C9687z0) g4Var;
        int i = z0Var.mo38610i();
        if (i == -1) {
            i = w4Var.mo38448g(z0Var);
            z0Var.mo38608f(i);
        }
        return m44063J(i) + i;
    }

    /* renamed from: g0 */
    public static int m44085g0(int i, long j) {
        return m44063J(i << 3) + 8;
    }

    /* renamed from: k0 */
    public static int m44086k0(boolean z) {
        return 1;
    }

    /* renamed from: n0 */
    public static int m44087n0(int i, int i2) {
        return m44063J(i << 3) + m44062I(i2);
    }

    /* renamed from: o0 */
    public static int m44088o0(int i, int i2) {
        return m44063J(i << 3) + m44063J(i2);
    }

    /* renamed from: p0 */
    public static int m44089p0(int i, int i2) {
        return m44063J(i << 3) + m44063J(m44068O(i2));
    }

    /* renamed from: q */
    private static long m44090q(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: q0 */
    public static int m44091q0(int i, int i2) {
        return m44063J(i << 3) + 4;
    }

    /* renamed from: r */
    public static int m44092r(double d) {
        return 8;
    }

    /* renamed from: r0 */
    public static int m44093r0(int i, int i2) {
        return m44063J(i << 3) + 4;
    }

    /* renamed from: s */
    public static int m44094s(int i, double d) {
        return m44063J(i << 3) + 8;
    }

    /* renamed from: s0 */
    public static int m44095s0(int i, int i2) {
        return m44063J(i << 3) + m44062I(i2);
    }

    /* renamed from: t */
    public static int m44096t(int i, float f) {
        return m44063J(i << 3) + 4;
    }

    /* renamed from: u */
    public static int m44097u(int i, C9554k3 k3Var) {
        return (m44063J(8) << 1) + m44088o0(2, i) + m44080c(3, k3Var);
    }

    /* renamed from: v */
    public static int m44098v(int i, C9522g4 g4Var) {
        return (m44063J(8) << 1) + m44088o0(2, i) + m44063J(24) + m44072S(g4Var);
    }

    /* renamed from: v0 */
    public static int m44099v0(float f) {
        return 4;
    }

    /* renamed from: w */
    static int m44100w(int i, C9522g4 g4Var, C9664w4 w4Var) {
        return m44063J(i << 3) + m44083e(g4Var, w4Var);
    }

    /* renamed from: x */
    public static int m44101x(int i, String str) {
        return m44063J(i << 3) + m44058C0(str);
    }

    /* renamed from: y */
    public static int m44102y(int i, boolean z) {
        return m44063J(i << 3) + 1;
    }

    /* renamed from: y0 */
    public static int m44103y0(long j) {
        return m44105z0(j);
    }

    /* renamed from: z */
    public static int m44104z(C9552k1 k1Var) {
        int size = k1Var.size();
        return m44063J(size) + size;
    }

    /* renamed from: z0 */
    public static int m44105z0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: A */
    public final void mo38264A(int i, long j) throws IOException {
        mo38281i(i, m44090q(j));
    }

    /* renamed from: A0 */
    public abstract void mo38265A0(String str) throws IOException;

    /* renamed from: B */
    public abstract void mo38266B(int i, C9552k1 k1Var) throws IOException;

    /* renamed from: C */
    public abstract void mo38267C(C9522g4 g4Var) throws IOException;

    /* renamed from: D */
    public abstract void mo38268D(int i) throws IOException;

    /* renamed from: E */
    public abstract void mo38269E(int i) throws IOException;

    /* renamed from: F */
    public final void mo38270F(int i) throws IOException {
        mo38269E(m44068O(i));
    }

    /* renamed from: G */
    public abstract void mo38271G(int i) throws IOException;

    /* renamed from: T */
    public abstract void mo38272T(byte b) throws IOException;

    /* renamed from: U */
    public abstract void mo38273U(int i, long j) throws IOException;

    /* renamed from: b */
    public abstract void mo38274b(int i, int i2) throws IOException;

    /* renamed from: d0 */
    public abstract int mo38275d0();

    /* renamed from: e0 */
    public final void mo38276e0() {
        if (mo38275d0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: f */
    public final void mo38277f(double d) throws IOException {
        mo38296x0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: g */
    public final void mo38278g(int i, double d) throws IOException {
        mo38273U(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: h */
    public final void mo38279h(int i, float f) throws IOException {
        mo38289m0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: h0 */
    public abstract void mo38280h0(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo38281i(int i, long j) throws IOException;

    /* renamed from: i0 */
    public abstract void mo38282i0(int i, int i2) throws IOException;

    /* renamed from: j */
    public abstract void mo38283j(int i, C9552k1 k1Var) throws IOException;

    /* renamed from: j0 */
    public final void mo38284j0(boolean z) throws IOException {
        mo38272T(z ? (byte) 1 : 0);
    }

    /* renamed from: k */
    public abstract void mo38285k(int i, C9522g4 g4Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract void mo38286l(int i, C9522g4 g4Var, C9664w4 w4Var) throws IOException;

    /* renamed from: l0 */
    public final void mo38287l0(int i, int i2) throws IOException {
        mo38282i0(i, m44068O(i2));
    }

    /* renamed from: m */
    public abstract void mo38288m(int i, String str) throws IOException;

    /* renamed from: m0 */
    public abstract void mo38289m0(int i, int i2) throws IOException;

    /* renamed from: n */
    public abstract void mo38290n(int i, boolean z) throws IOException;

    /* renamed from: o */
    public abstract void mo38291o(C9552k1 k1Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo38292p(String str, C9477b6 b6Var) throws IOException {
        f45598b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", b6Var);
        byte[] bytes = str.getBytes(C9662w2.f45956a);
        try {
            mo38269E(bytes.length);
            mo38297a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C9483a(e);
        } catch (C9483a e2) {
            throw e2;
        }
    }

    /* renamed from: t0 */
    public final void mo38293t0(float f) throws IOException {
        mo38271G(Float.floatToRawIntBits(f));
    }

    /* renamed from: u0 */
    public abstract void mo38294u0(long j) throws IOException;

    /* renamed from: w0 */
    public final void mo38295w0(long j) throws IOException {
        mo38294u0(m44090q(j));
    }

    /* renamed from: x0 */
    public abstract void mo38296x0(long j) throws IOException;
}
