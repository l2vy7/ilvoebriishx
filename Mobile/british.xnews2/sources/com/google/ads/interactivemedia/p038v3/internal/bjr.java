package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjr */
/* compiled from: IMASDK */
public /* synthetic */ class bjr {
    /* renamed from: a */
    public static bjq m16069a(bjw bjw, byte[] bArr) {
        bjw.mo15294V();
        return new bjo(bArr);
    }

    /* renamed from: b */
    public static bjw m16070b(bjw bjw) {
        return bjw;
    }

    /* renamed from: c */
    static int m16071c(byte[] bArr, int i, bjg bjg) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m16072d(b, bArr, i2, bjg);
        }
        bjg.f16468a = b;
        return i2;
    }

    /* renamed from: d */
    static int m16072d(int i, byte[] bArr, int i2, bjg bjg) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            bjg.f16468a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            bjg.f16468a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            bjg.f16468a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            bjg.f16468a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                bjg.f16468a = i11;
                return i12;
            }
        }
    }

    /* renamed from: e */
    static int m16073e(byte[] bArr, int i, bjg bjg) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
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
            bjg.f16469b = j2;
            return i3;
        }
        bjg.f16469b = j;
        return i2;
    }

    /* renamed from: f */
    static int m16074f(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: g */
    static long m16075g(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: h */
    static double m16076h(byte[] bArr, int i) {
        return Double.longBitsToDouble(m16075g(bArr, i));
    }

    /* renamed from: i */
    static float m16077i(byte[] bArr, int i) {
        return Float.intBitsToFloat(m16074f(bArr, i));
    }

    /* renamed from: j */
    static int m16078j(byte[] bArr, int i, bjg bjg) throws bkt {
        int c = m16071c(bArr, i, bjg);
        int i2 = bjg.f16468a;
        if (i2 < 0) {
            throw bkt.m16349b();
        } else if (i2 == 0) {
            bjg.f16470c = "";
            return c;
        } else {
            bjg.f16470c = new String(bArr, c, i2, bkr.f16599a);
            return c + i2;
        }
    }

    /* renamed from: k */
    static int m16079k(byte[] bArr, int i, bjg bjg) throws bkt {
        int c = m16071c(bArr, i, bjg);
        int i2 = bjg.f16468a;
        if (i2 < 0) {
            throw bkt.m16349b();
        } else if (i2 == 0) {
            bjg.f16470c = "";
            return c;
        } else {
            bjg.f16470c = bna.m16781e(bArr, c, i2);
            return c + i2;
        }
    }

    /* renamed from: l */
    static int m16080l(byte[] bArr, int i, bjg bjg) throws bkt {
        int c = m16071c(bArr, i, bjg);
        int i2 = bjg.f16468a;
        if (i2 < 0) {
            throw bkt.m16349b();
        } else if (i2 > bArr.length - c) {
            throw bkt.m16348a();
        } else if (i2 == 0) {
            bjg.f16470c = bjq.f16482b;
            return c;
        } else {
            bjg.f16470c = bjq.m16050m(bArr, c, i2);
            return c + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m16081m(com.google.ads.interactivemedia.p038v3.internal.bly r6, byte[] r7, int r8, int r9, com.google.ads.interactivemedia.p038v3.internal.bjg r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m16072d(r8, r7, r0, r10)
            int r8 = r10.f16468a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo15447a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo15455j(r1, r2, r3, r4, r5)
            r6.mo15456k(r9)
            r10.f16470c = r9
            return r8
        L_0x0025:
            com.google.ads.interactivemedia.v3.internal.bkt r6 = com.google.ads.interactivemedia.p038v3.internal.bkt.m16348a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.bjr.m16081m(com.google.ads.interactivemedia.v3.internal.bly, byte[], int, int, com.google.ads.interactivemedia.v3.internal.bjg):int");
    }

    /* renamed from: n */
    static int m16082n(bly bly, byte[] bArr, int i, int i2, int i3, bjg bjg) throws IOException {
        blp blp = (blp) bly;
        Object a = blp.mo15447a();
        int i4 = blp.mo15454i(a, bArr, i, i2, i3, bjg);
        blp.mo15456k(a);
        bjg.f16470c = a;
        return i4;
    }

    /* renamed from: o */
    static int m16083o(int i, byte[] bArr, int i2, int i3, bkq<?> bkq, bjg bjg) {
        bkm bkm = (bkm) bkq;
        int c = m16071c(bArr, i2, bjg);
        bkm.mo15399g(bjg.f16468a);
        while (c < i3) {
            int c2 = m16071c(bArr, c, bjg);
            if (i != bjg.f16468a) {
                break;
            }
            c = m16071c(bArr, c2, bjg);
            bkm.mo15399g(bjg.f16468a);
        }
        return c;
    }

    /* renamed from: p */
    static int m16084p(byte[] bArr, int i, bkq<?> bkq, bjg bjg) throws IOException {
        bkm bkm = (bkm) bkq;
        int c = m16071c(bArr, i, bjg);
        int i2 = bjg.f16468a + c;
        while (c < i2) {
            c = m16071c(bArr, c, bjg);
            bkm.mo15399g(bjg.f16468a);
        }
        if (c == i2) {
            return c;
        }
        throw bkt.m16348a();
    }

    /* renamed from: q */
    static int m16085q(bly<?> bly, int i, byte[] bArr, int i2, int i3, bkq<?> bkq, bjg bjg) throws IOException {
        int m = m16081m(bly, bArr, i2, i3, bjg);
        bkq.add(bjg.f16470c);
        while (m < i3) {
            int c = m16071c(bArr, m, bjg);
            if (i != bjg.f16468a) {
                break;
            }
            m = m16081m(bly, bArr, c, i3, bjg);
            bkq.add(bjg.f16470c);
        }
        return m;
    }

    /* renamed from: r */
    static int m16086r(int i, byte[] bArr, int i2, int i3, bmn bmn, bjg bjg) throws bkt {
        if (bnd.m16788b(i) != 0) {
            int a = bnd.m16787a(i);
            if (a == 0) {
                int e = m16073e(bArr, i2, bjg);
                bmn.mo15514i(i, Long.valueOf(bjg.f16469b));
                return e;
            } else if (a == 1) {
                bmn.mo15514i(i, Long.valueOf(m16075g(bArr, i2)));
                return i2 + 8;
            } else if (a == 2) {
                int c = m16071c(bArr, i2, bjg);
                int i4 = bjg.f16468a;
                if (i4 < 0) {
                    throw bkt.m16349b();
                } else if (i4 <= bArr.length - c) {
                    if (i4 == 0) {
                        bmn.mo15514i(i, bjq.f16482b);
                    } else {
                        bmn.mo15514i(i, bjq.m16050m(bArr, c, i4));
                    }
                    return c + i4;
                } else {
                    throw bkt.m16348a();
                }
            } else if (a == 3) {
                int i5 = (i & -8) | 4;
                bmn b = bmn.m16672b();
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int c2 = m16071c(bArr, i2, bjg);
                    int i7 = bjg.f16468a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = c2;
                        break;
                    }
                    i6 = i7;
                    i2 = m16086r(i7, bArr, c2, i3, b, bjg);
                }
                if (i2 > i3 || i6 != i5) {
                    throw bkt.m16354g();
                }
                bmn.mo15514i(i, b);
                return i2;
            } else if (a == 5) {
                bmn.mo15514i(i, Integer.valueOf(m16074f(bArr, i2)));
                return i2 + 4;
            } else {
                throw bkt.m16351d();
            }
        } else {
            throw bkt.m16351d();
        }
    }

    /* renamed from: s */
    static int m16087s(int i, byte[] bArr, int i2, int i3, bjg bjg) throws bkt {
        if (bnd.m16788b(i) != 0) {
            int a = bnd.m16787a(i);
            if (a == 0) {
                return m16073e(bArr, i2, bjg);
            }
            if (a == 1) {
                return i2 + 8;
            }
            if (a == 2) {
                return m16071c(bArr, i2, bjg) + bjg.f16468a;
            }
            if (a == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = m16071c(bArr, i2, bjg);
                    i5 = bjg.f16468a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = m16087s(i5, bArr, i2, i3, bjg);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw bkt.m16354g();
            } else if (a == 5) {
                return i2 + 4;
            } else {
                throw bkt.m16351d();
            }
        } else {
            throw bkt.m16351d();
        }
    }
}
