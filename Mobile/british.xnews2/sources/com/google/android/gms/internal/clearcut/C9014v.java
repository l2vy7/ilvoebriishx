package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.v */
final class C9014v {
    /* renamed from: a */
    static int m42393a(int i, byte[] bArr, int i2, int i3, C9021w wVar) throws C8941l1 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m42399g(bArr, i2, wVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m42397e(bArr, i2, wVar) + wVar.f44768a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m42397e(bArr, i2, wVar);
                    i6 = wVar.f44768a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m42393a(i6, bArr, i2, i3, wVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C8941l1.m41912d();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C8941l1.m41910b();
            }
        } else {
            throw C8941l1.m41910b();
        }
    }

    /* renamed from: b */
    static int m42394b(int i, byte[] bArr, int i2, int i3, C8934k1<?> k1Var, C9021w wVar) {
        C8903g1 g1Var = (C8903g1) k1Var;
        int e = m42397e(bArr, i2, wVar);
        while (true) {
            g1Var.mo36951h(wVar.f44768a);
            if (e >= i3) {
                break;
            }
            int e2 = m42397e(bArr, e, wVar);
            if (i != wVar.f44768a) {
                break;
            }
            e = m42397e(bArr, e2, wVar);
        }
        return e;
    }

    /* renamed from: c */
    static int m42395c(int i, byte[] bArr, int i2, int i3, C9018v3 v3Var, C9021w wVar) throws IOException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int g = m42399g(bArr, i2, wVar);
                v3Var.mo37195e(i, Long.valueOf(wVar.f44769b));
                return g;
            } else if (i4 == 1) {
                v3Var.mo37195e(i, Long.valueOf(m42403k(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int e = m42397e(bArr, i2, wVar);
                int i5 = wVar.f44768a;
                v3Var.mo37195e(i, i5 == 0 ? C8847a0.f44287c : C8847a0.m41490i(bArr, e, i5));
                return e + i5;
            } else if (i4 == 3) {
                C9018v3 i6 = C9018v3.m42417i();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int e2 = m42397e(bArr, i2, wVar);
                    int i9 = wVar.f44768a;
                    i8 = i9;
                    if (i9 == i7) {
                        i2 = e2;
                        break;
                    }
                    int c = m42395c(i8, bArr, e2, i3, i6, wVar);
                    i8 = i9;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw C8941l1.m41912d();
                }
                v3Var.mo37195e(i, i6);
                return i2;
            } else if (i4 == 5) {
                v3Var.mo37195e(i, Integer.valueOf(m42400h(bArr, i2)));
                return i2 + 4;
            } else {
                throw C8941l1.m41910b();
            }
        } else {
            throw C8941l1.m41910b();
        }
    }

    /* renamed from: d */
    static int m42396d(int i, byte[] bArr, int i2, C9021w wVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                wVar.f44768a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            wVar.f44768a = i7 | i3;
            return i8;
        }
        wVar.f44768a = i5 | i4;
        return i6;
    }

    /* renamed from: e */
    static int m42397e(byte[] bArr, int i, C9021w wVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m42396d(b, bArr, i2, wVar);
        }
        wVar.f44768a = b;
        return i2;
    }

    /* renamed from: f */
    static int m42398f(byte[] bArr, int i, C8934k1<?> k1Var, C9021w wVar) throws IOException {
        C8903g1 g1Var = (C8903g1) k1Var;
        int e = m42397e(bArr, i, wVar);
        int i2 = wVar.f44768a + e;
        while (e < i2) {
            e = m42397e(bArr, e, wVar);
            g1Var.mo36951h(wVar.f44768a);
        }
        if (e == i2) {
            return e;
        }
        throw C8941l1.m41909a();
    }

    /* renamed from: g */
    static int m42399g(byte[] bArr, int i, C9021w wVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            wVar.f44769b = j;
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
        wVar.f44769b = j2;
        return i3;
    }

    /* renamed from: h */
    static int m42400h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    static int m42401i(byte[] bArr, int i, C9021w wVar) {
        int e = m42397e(bArr, i, wVar);
        int i2 = wVar.f44768a;
        if (i2 == 0) {
            wVar.f44770c = "";
            return e;
        }
        wVar.f44770c = new String(bArr, e, i2, C8910h1.f44548a);
        return e + i2;
    }

    /* renamed from: j */
    static int m42402j(byte[] bArr, int i, C9021w wVar) throws IOException {
        int e = m42397e(bArr, i, wVar);
        int i2 = wVar.f44768a;
        if (i2 == 0) {
            wVar.f44770c = "";
            return e;
        }
        int i3 = e + i2;
        if (C8881d4.m41676i(bArr, e, i3)) {
            wVar.f44770c = new String(bArr, e, i2, C8910h1.f44548a);
            return i3;
        }
        throw C8941l1.m41913e();
    }

    /* renamed from: k */
    static long m42403k(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: l */
    static double m42404l(byte[] bArr, int i) {
        return Double.longBitsToDouble(m42403k(bArr, i));
    }

    /* renamed from: m */
    static int m42405m(byte[] bArr, int i, C9021w wVar) {
        int e = m42397e(bArr, i, wVar);
        int i2 = wVar.f44768a;
        if (i2 == 0) {
            wVar.f44770c = C8847a0.f44287c;
            return e;
        }
        wVar.f44770c = C8847a0.m41490i(bArr, e, i2);
        return e + i2;
    }

    /* renamed from: n */
    static float m42406n(byte[] bArr, int i) {
        return Float.intBitsToFloat(m42400h(bArr, i));
    }
}
