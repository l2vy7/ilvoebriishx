package com.google.android.gms.internal.vision;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.vision.f1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9510f1 {
    /* renamed from: a */
    static int m44235a(int i, byte[] bArr, int i2, int i3, C9527h1 h1Var) throws C9513f3 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m44245k(bArr, i2, h1Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m44243i(bArr, i2, h1Var) + h1Var.f45653a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m44243i(bArr, i2, h1Var);
                    i6 = h1Var.f45653a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m44235a(i6, bArr, i2, i3, h1Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C9513f3.m44259e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C9513f3.m44257c();
            }
        } else {
            throw C9513f3.m44257c();
        }
    }

    /* renamed from: b */
    static int m44236b(int i, byte[] bArr, int i2, int i3, C9485c3<?> c3Var, C9527h1 h1Var) {
        C9673x2 x2Var = (C9673x2) c3Var;
        int i4 = m44243i(bArr, i2, h1Var);
        x2Var.mo38643j(h1Var.f45653a);
        while (i4 < i3) {
            int i5 = m44243i(bArr, i4, h1Var);
            if (i != h1Var.f45653a) {
                break;
            }
            i4 = m44243i(bArr, i5, h1Var);
            x2Var.mo38643j(h1Var.f45653a);
        }
        return i4;
    }

    /* renamed from: c */
    static int m44237c(int i, byte[] bArr, int i2, int i3, C9580n5 n5Var, C9527h1 h1Var) throws C9513f3 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int k = m44245k(bArr, i2, h1Var);
                n5Var.mo38515d(i, Long.valueOf(h1Var.f45654b));
                return k;
            } else if (i4 == 1) {
                n5Var.mo38515d(i, Long.valueOf(m44246l(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int i5 = m44243i(bArr, i2, h1Var);
                int i6 = h1Var.f45653a;
                if (i6 < 0) {
                    throw C9513f3.m44256b();
                } else if (i6 <= bArr.length - i5) {
                    if (i6 == 0) {
                        n5Var.mo38515d(i, C9552k1.f45714c);
                    } else {
                        n5Var.mo38515d(i, C9552k1.m44403b(bArr, i5, i6));
                    }
                    return i5 + i6;
                } else {
                    throw C9513f3.m44255a();
                }
            } else if (i4 == 3) {
                C9580n5 j = C9580n5.m44488j();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i9 = m44243i(bArr, i2, h1Var);
                    int i10 = h1Var.f45653a;
                    i8 = i10;
                    if (i10 == i7) {
                        i2 = i9;
                        break;
                    }
                    int c = m44237c(i8, bArr, i9, i3, j, h1Var);
                    i8 = i10;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw C9513f3.m44259e();
                }
                n5Var.mo38515d(i, j);
                return i2;
            } else if (i4 == 5) {
                n5Var.mo38515d(i, Integer.valueOf(m44242h(bArr, i2)));
                return i2 + 4;
            } else {
                throw C9513f3.m44257c();
            }
        } else {
            throw C9513f3.m44257c();
        }
    }

    /* renamed from: d */
    static int m44238d(int i, byte[] bArr, int i2, C9527h1 h1Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            h1Var.f45653a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            h1Var.f45653a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            h1Var.f45653a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            h1Var.f45653a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                h1Var.f45653a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: e */
    static int m44239e(C9664w4<?> w4Var, int i, byte[] bArr, int i2, int i3, C9485c3<?> c3Var, C9527h1 h1Var) throws IOException {
        int g = m44241g(w4Var, bArr, i2, i3, h1Var);
        c3Var.add(h1Var.f45655c);
        while (g < i3) {
            int i4 = m44243i(bArr, g, h1Var);
            if (i != h1Var.f45653a) {
                break;
            }
            g = m44241g(w4Var, bArr, i4, i3, h1Var);
            c3Var.add(h1Var.f45655c);
        }
        return g;
    }

    /* renamed from: f */
    static int m44240f(C9664w4 w4Var, byte[] bArr, int i, int i2, int i3, C9527h1 h1Var) throws IOException {
        C9546j4 j4Var = (C9546j4) w4Var;
        Object c = j4Var.mo38444c();
        int n = j4Var.mo38451n(c, bArr, i, i2, i3, h1Var);
        j4Var.mo38443b(c);
        h1Var.f45655c = c;
        return n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m44241g(com.google.android.gms.internal.vision.C9664w4 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.vision.C9527h1 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m44238d(r8, r7, r0, r10)
            int r8 = r10.f45653a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo38444c()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo38449h(r1, r2, r3, r4, r5)
            r6.mo38443b(r9)
            r10.f45655c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.vision.f3 r6 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9510f1.m44241g(com.google.android.gms.internal.vision.w4, byte[], int, int, com.google.android.gms.internal.vision.h1):int");
    }

    /* renamed from: h */
    static int m44242h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    static int m44243i(byte[] bArr, int i, C9527h1 h1Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m44238d(b, bArr, i2, h1Var);
        }
        h1Var.f45653a = b;
        return i2;
    }

    /* renamed from: j */
    static int m44244j(byte[] bArr, int i, C9485c3<?> c3Var, C9527h1 h1Var) throws IOException {
        C9673x2 x2Var = (C9673x2) c3Var;
        int i2 = m44243i(bArr, i, h1Var);
        int i3 = h1Var.f45653a + i2;
        while (i2 < i3) {
            i2 = m44243i(bArr, i2, h1Var);
            x2Var.mo38643j(h1Var.f45653a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw C9513f3.m44255a();
    }

    /* renamed from: k */
    static int m44245k(byte[] bArr, int i, C9527h1 h1Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            h1Var.f45654b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        h1Var.f45654b = j2;
        return i3;
    }

    /* renamed from: l */
    static long m44246l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: m */
    static double m44247m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m44246l(bArr, i));
    }

    /* renamed from: n */
    static int m44248n(byte[] bArr, int i, C9527h1 h1Var) throws C9513f3 {
        int i2 = m44243i(bArr, i, h1Var);
        int i3 = h1Var.f45653a;
        if (i3 < 0) {
            throw C9513f3.m44256b();
        } else if (i3 == 0) {
            h1Var.f45655c = "";
            return i2;
        } else {
            h1Var.f45655c = new String(bArr, i2, i3, C9662w2.f45956a);
            return i2 + i3;
        }
    }

    /* renamed from: o */
    static float m44249o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m44242h(bArr, i));
    }

    /* renamed from: p */
    static int m44250p(byte[] bArr, int i, C9527h1 h1Var) throws C9513f3 {
        int i2 = m44243i(bArr, i, h1Var);
        int i3 = h1Var.f45653a;
        if (i3 < 0) {
            throw C9513f3.m44256b();
        } else if (i3 == 0) {
            h1Var.f45655c = "";
            return i2;
        } else {
            h1Var.f45655c = C9676x5.m44831j(bArr, i2, i3);
            return i2 + i3;
        }
    }

    /* renamed from: q */
    static int m44251q(byte[] bArr, int i, C9527h1 h1Var) throws C9513f3 {
        int i2 = m44243i(bArr, i, h1Var);
        int i3 = h1Var.f45653a;
        if (i3 < 0) {
            throw C9513f3.m44256b();
        } else if (i3 > bArr.length - i2) {
            throw C9513f3.m44255a();
        } else if (i3 == 0) {
            h1Var.f45655c = C9552k1.f45714c;
            return i2;
        } else {
            h1Var.f45655c = C9552k1.m44403b(bArr, i2, i3);
            return i2 + i3;
        }
    }
}
