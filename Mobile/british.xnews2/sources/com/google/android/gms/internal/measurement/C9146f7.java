package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.f7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9146f7 {
    /* renamed from: a */
    static int m42866a(byte[] bArr, int i, C9131e7 e7Var) throws C9085b9 {
        int j = m42875j(bArr, i, e7Var);
        int i2 = e7Var.f45005a;
        if (i2 < 0) {
            throw C9085b9.m42686d();
        } else if (i2 > bArr.length - j) {
            throw C9085b9.m42688f();
        } else if (i2 == 0) {
            e7Var.f45007c = C9329r7.f45419c;
            return j;
        } else {
            e7Var.f45007c = C9329r7.m43544t(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m42867b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m42868c(C9179ha haVar, byte[] bArr, int i, int i2, int i3, C9131e7 e7Var) throws IOException {
        C9454z9 z9Var = (C9454z9) haVar;
        Object zze = z9Var.zze();
        int A = z9Var.mo38222A(zze, bArr, i, i2, i3, e7Var);
        z9Var.mo37354a(zze);
        e7Var.f45007c = zze;
        return A;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m42869d(com.google.android.gms.internal.measurement.C9179ha r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.C9131e7 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m42876k(r8, r7, r0, r10)
            int r8 = r10.f45005a
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
            r0.mo37356c(r1, r2, r3, r4, r5)
            r6.mo37354a(r9)
            r10.f45007c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.b9 r6 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9146f7.m42869d(com.google.android.gms.internal.measurement.ha, byte[], int, int, com.google.android.gms.internal.measurement.e7):int");
    }

    /* renamed from: e */
    static int m42870e(C9179ha haVar, int i, byte[] bArr, int i2, int i3, C9438y8 y8Var, C9131e7 e7Var) throws IOException {
        int d = m42869d(haVar, bArr, i2, i3, e7Var);
        y8Var.add(e7Var.f45007c);
        while (d < i3) {
            int j = m42875j(bArr, d, e7Var);
            if (i != e7Var.f45005a) {
                break;
            }
            d = m42869d(haVar, bArr, j, i3, e7Var);
            y8Var.add(e7Var.f45007c);
        }
        return d;
    }

    /* renamed from: f */
    static int m42871f(byte[] bArr, int i, C9438y8 y8Var, C9131e7 e7Var) throws IOException {
        C9346s8 s8Var = (C9346s8) y8Var;
        int j = m42875j(bArr, i, e7Var);
        int i2 = e7Var.f45005a + j;
        while (j < i2) {
            j = m42875j(bArr, j, e7Var);
            s8Var.mo38029p(e7Var.f45005a);
        }
        if (j == i2) {
            return j;
        }
        throw C9085b9.m42688f();
    }

    /* renamed from: g */
    static int m42872g(byte[] bArr, int i, C9131e7 e7Var) throws C9085b9 {
        int j = m42875j(bArr, i, e7Var);
        int i2 = e7Var.f45005a;
        if (i2 < 0) {
            throw C9085b9.m42686d();
        } else if (i2 == 0) {
            e7Var.f45007c = "";
            return j;
        } else {
            e7Var.f45007c = new String(bArr, j, i2, C9453z8.f45543b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m42873h(byte[] bArr, int i, C9131e7 e7Var) throws C9085b9 {
        int j = m42875j(bArr, i, e7Var);
        int i2 = e7Var.f45005a;
        if (i2 < 0) {
            throw C9085b9.m42686d();
        } else if (i2 == 0) {
            e7Var.f45007c = "";
            return j;
        } else {
            e7Var.f45007c = C9240lb.m43187d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m42874i(int i, byte[] bArr, int i2, int i3, C9425xa xaVar, C9131e7 e7Var) throws C9085b9 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m42878m(bArr, i2, e7Var);
                xaVar.mo38172h(i, Long.valueOf(e7Var.f45006b));
                return m;
            } else if (i4 == 1) {
                xaVar.mo38172h(i, Long.valueOf(m42879n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m42875j(bArr, i2, e7Var);
                int i5 = e7Var.f45005a;
                if (i5 < 0) {
                    throw C9085b9.m42686d();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        xaVar.mo38172h(i, C9329r7.f45419c);
                    } else {
                        xaVar.mo38172h(i, C9329r7.m43544t(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw C9085b9.m42688f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C9425xa e = C9425xa.m43843e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m42875j(bArr, i2, e7Var);
                    int i8 = e7Var.f45005a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m42874i(i8, bArr, j2, i3, e, e7Var);
                }
                if (i2 > i3 || i7 != i6) {
                    throw C9085b9.m42687e();
                }
                xaVar.mo38172h(i, e);
                return i2;
            } else if (i4 == 5) {
                xaVar.mo38172h(i, Integer.valueOf(m42867b(bArr, i2)));
                return i2 + 4;
            } else {
                throw C9085b9.m42684b();
            }
        } else {
            throw C9085b9.m42684b();
        }
    }

    /* renamed from: j */
    static int m42875j(byte[] bArr, int i, C9131e7 e7Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m42876k(b, bArr, i2, e7Var);
        }
        e7Var.f45005a = b;
        return i2;
    }

    /* renamed from: k */
    static int m42876k(int i, byte[] bArr, int i2, C9131e7 e7Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            e7Var.f45005a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            e7Var.f45005a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            e7Var.f45005a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            e7Var.f45005a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                e7Var.f45005a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m42877l(int i, byte[] bArr, int i2, int i3, C9438y8 y8Var, C9131e7 e7Var) {
        C9346s8 s8Var = (C9346s8) y8Var;
        int j = m42875j(bArr, i2, e7Var);
        s8Var.mo38029p(e7Var.f45005a);
        while (j < i3) {
            int j2 = m42875j(bArr, j, e7Var);
            if (i != e7Var.f45005a) {
                break;
            }
            j = m42875j(bArr, j2, e7Var);
            s8Var.mo38029p(e7Var.f45005a);
        }
        return j;
    }

    /* renamed from: m */
    static int m42878m(byte[] bArr, int i, C9131e7 e7Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            e7Var.f45006b = j;
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
        e7Var.f45006b = j2;
        return i3;
    }

    /* renamed from: n */
    static long m42879n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
