package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pn3 {
    /* renamed from: a */
    static int m36144a(byte[] bArr, int i, on3 on3) throws wp3 {
        int j = m36153j(bArr, i, on3);
        int i2 = on3.f36557a;
        if (i2 < 0) {
            throw wp3.m39227f();
        } else if (i2 > bArr.length - j) {
            throw wp3.m39230j();
        } else if (i2 == 0) {
            on3.f36559c = eo3.f31444c;
            return j;
        } else {
            on3.f36559c = eo3.m31874M(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m36145b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m36146c(or3 or3, byte[] bArr, int i, int i2, int i3, on3 on3) throws IOException {
        xq3 xq3 = (xq3) or3;
        Object zze = xq3.zze();
        int F = xq3.mo35788F(zze, bArr, i, i2, i3, on3);
        xq3.mo33996a(zze);
        on3.f36559c = zze;
        return F;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m36147d(com.google.android.gms.internal.ads.or3 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.on3 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m36154k(r8, r7, r0, r10)
            int r8 = r10.f36557a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zze()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo34001g(r1, r2, r3, r4, r5)
            r6.mo33996a(r9)
            r10.f36559c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.wp3 r6 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pn3.m36147d(com.google.android.gms.internal.ads.or3, byte[], int, int, com.google.android.gms.internal.ads.on3):int");
    }

    /* renamed from: e */
    static int m36148e(or3<?> or3, int i, byte[] bArr, int i2, int i3, tp3<?> tp3, on3 on3) throws IOException {
        int d = m36147d(or3, bArr, i2, i3, on3);
        tp3.add(on3.f36559c);
        while (d < i3) {
            int j = m36153j(bArr, d, on3);
            if (i != on3.f36557a) {
                break;
            }
            d = m36147d(or3, bArr, j, i3, on3);
            tp3.add(on3.f36559c);
        }
        return d;
    }

    /* renamed from: f */
    static int m36149f(byte[] bArr, int i, tp3<?> tp3, on3 on3) throws IOException {
        lp3 lp3 = (lp3) tp3;
        int j = m36153j(bArr, i, on3);
        int i2 = on3.f36557a + j;
        while (j < i2) {
            j = m36153j(bArr, j, on3);
            lp3.mo33382p(on3.f36557a);
        }
        if (j == i2) {
            return j;
        }
        throw wp3.m39230j();
    }

    /* renamed from: g */
    static int m36150g(byte[] bArr, int i, on3 on3) throws wp3 {
        int j = m36153j(bArr, i, on3);
        int i2 = on3.f36557a;
        if (i2 < 0) {
            throw wp3.m39227f();
        } else if (i2 == 0) {
            on3.f36559c = "";
            return j;
        } else {
            on3.f36559c = new String(bArr, j, i2, up3.f39919b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m36151h(byte[] bArr, int i, on3 on3) throws wp3 {
        int j = m36153j(bArr, i, on3);
        int i2 = on3.f36557a;
        if (i2 < 0) {
            throw wp3.m39227f();
        } else if (i2 == 0) {
            on3.f36559c = "";
            return j;
        } else {
            on3.f36559c = vs3.m38945h(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m36152i(int i, byte[] bArr, int i2, int i3, hs3 hs3, on3 on3) throws wp3 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m36156m(bArr, i2, on3);
                hs3.mo32449h(i, Long.valueOf(on3.f36558b));
                return m;
            } else if (i4 == 1) {
                hs3.mo32449h(i, Long.valueOf(m36157n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m36153j(bArr, i2, on3);
                int i5 = on3.f36557a;
                if (i5 < 0) {
                    throw wp3.m39227f();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        hs3.mo32449h(i, eo3.f31444c);
                    } else {
                        hs3.mo32449h(i, eo3.m31874M(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw wp3.m39230j();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                hs3 e = hs3.m32933e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m36153j(bArr, i2, on3);
                    int i8 = on3.f36557a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m36152i(i8, bArr, j2, i3, e, on3);
                }
                if (i2 > i3 || i7 != i6) {
                    throw wp3.m39228g();
                }
                hs3.mo32449h(i, e);
                return i2;
            } else if (i4 == 5) {
                hs3.mo32449h(i, Integer.valueOf(m36145b(bArr, i2)));
                return i2 + 4;
            } else {
                throw wp3.m39224c();
            }
        } else {
            throw wp3.m39224c();
        }
    }

    /* renamed from: j */
    static int m36153j(byte[] bArr, int i, on3 on3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m36154k(b, bArr, i2, on3);
        }
        on3.f36557a = b;
        return i2;
    }

    /* renamed from: k */
    static int m36154k(int i, byte[] bArr, int i2, on3 on3) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            on3.f36557a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            on3.f36557a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            on3.f36557a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            on3.f36557a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                on3.f36557a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m36155l(int i, byte[] bArr, int i2, int i3, tp3<?> tp3, on3 on3) {
        lp3 lp3 = (lp3) tp3;
        int j = m36153j(bArr, i2, on3);
        lp3.mo33382p(on3.f36557a);
        while (j < i3) {
            int j2 = m36153j(bArr, j, on3);
            if (i != on3.f36557a) {
                break;
            }
            j = m36153j(bArr, j2, on3);
            lp3.mo33382p(on3.f36557a);
        }
        return j;
    }

    /* renamed from: m */
    static int m36156m(byte[] bArr, int i, on3 on3) {
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
            on3.f36558b = j2;
            return i3;
        }
        on3.f36558b = j;
        return i2;
    }

    /* renamed from: n */
    static long m36157n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
