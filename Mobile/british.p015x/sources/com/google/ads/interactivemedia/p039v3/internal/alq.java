package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alq */
/* compiled from: IMASDK */
public final class alq {

    /* renamed from: a */
    public static final byte[] f15233a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f15234b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f15235c = new Object();

    /* renamed from: d */
    private static int[] f15236d = new int[10];

    /* renamed from: a */
    public static int m14048a(byte[] bArr, int i) {
        int i2;
        synchronized (f15235c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f15236d;
                    if (iArr.length <= i4) {
                        int length = iArr.length;
                        f15236d = Arrays.copyOf(iArr, length + length);
                    }
                    f15236d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f15236d[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0168  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p039v3.internal.alp m14049b(byte[] r22, int r23, int r24) {
        /*
            com.google.ads.interactivemedia.v3.internal.alx r0 = new com.google.ads.interactivemedia.v3.internal.alx
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo13971c(r1)
            int r2 = r0.mo13974f(r1)
            int r5 = r0.mo13974f(r1)
            int r6 = r0.mo13974f(r1)
            int r7 = r0.mo13976h()
            r3 = 138(0x8a, float:1.93E-43)
            r4 = 3
            r8 = 16
            r10 = 1
            r11 = 100
            if (r2 == r11) goto L_0x0052
            r11 = 110(0x6e, float:1.54E-43)
            if (r2 == r11) goto L_0x0052
            r11 = 122(0x7a, float:1.71E-43)
            if (r2 == r11) goto L_0x0052
            r11 = 244(0xf4, float:3.42E-43)
            if (r2 == r11) goto L_0x0052
            r11 = 44
            if (r2 == r11) goto L_0x0052
            r11 = 83
            if (r2 == r11) goto L_0x0052
            r11 = 86
            if (r2 == r11) goto L_0x0052
            r11 = 118(0x76, float:1.65E-43)
            if (r2 == r11) goto L_0x0052
            r11 = 128(0x80, float:1.794E-43)
            if (r2 == r11) goto L_0x0052
            if (r2 != r3) goto L_0x004f
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x0052
        L_0x004f:
            r3 = 1
            r11 = 0
            goto L_0x00a6
        L_0x0052:
            int r3 = r0.mo13976h()
            if (r3 != r4) goto L_0x005e
            boolean r11 = r0.mo13973e()
            r12 = 3
            goto L_0x0060
        L_0x005e:
            r12 = r3
            r11 = 0
        L_0x0060:
            r0.mo13976h()
            r0.mo13976h()
            r0.mo13970b()
            boolean r13 = r0.mo13973e()
            if (r13 == 0) goto L_0x00a6
            if (r12 == r4) goto L_0x0074
            r12 = 8
            goto L_0x0076
        L_0x0074:
            r12 = 12
        L_0x0076:
            r13 = 0
        L_0x0077:
            if (r13 >= r12) goto L_0x00a6
            boolean r14 = r0.mo13973e()
            if (r14 == 0) goto L_0x00a3
            r14 = 6
            if (r13 >= r14) goto L_0x0085
            r14 = 16
            goto L_0x0087
        L_0x0085:
            r14 = 64
        L_0x0087:
            r15 = 0
            r16 = 8
            r17 = 8
        L_0x008c:
            if (r15 >= r14) goto L_0x00a3
            if (r16 == 0) goto L_0x009c
            int r16 = r0.mo13977i()
            int r9 = r17 + r16
            int r9 = r9 + 256
            int r9 = r9 % 256
            r16 = r9
        L_0x009c:
            if (r16 == 0) goto L_0x00a0
            r17 = r16
        L_0x00a0:
            int r15 = r15 + 1
            goto L_0x008c
        L_0x00a3:
            int r13 = r13 + 1
            goto L_0x0077
        L_0x00a6:
            int r9 = r0.mo13976h()
            int r13 = r9 + 4
            int r9 = r0.mo13976h()
            if (r9 != 0) goto L_0x00bf
            int r12 = r0.mo13976h()
            int r12 = r12 + 4
            r24 = r2
            r14 = r9
            r15 = r12
        L_0x00bc:
            r16 = 0
            goto L_0x00e8
        L_0x00bf:
            if (r9 != r10) goto L_0x00e3
            boolean r9 = r0.mo13973e()
            r0.mo13977i()
            r0.mo13977i()
            int r12 = r0.mo13976h()
            long r14 = (long) r12
            r24 = r2
            r12 = 0
        L_0x00d3:
            long r1 = (long) r12
            int r16 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00de
            r0.mo13976h()
            int r12 = r12 + 1
            goto L_0x00d3
        L_0x00de:
            r16 = r9
            r14 = 1
            r15 = 0
            goto L_0x00e8
        L_0x00e3:
            r24 = r2
            r14 = r9
            r15 = 0
            goto L_0x00bc
        L_0x00e8:
            r0.mo13976h()
            r0.mo13970b()
            int r1 = r0.mo13976h()
            int r1 = r1 + r10
            int r2 = r0.mo13976h()
            boolean r12 = r0.mo13973e()
            int r9 = 2 - r12
            int r2 = r2 + r10
            int r2 = r2 * r9
            if (r12 != 0) goto L_0x0105
            r0.mo13970b()
        L_0x0105:
            r0.mo13970b()
            int r1 = r1 * 16
            int r2 = r2 * 16
            boolean r17 = r0.mo13973e()
            if (r17 == 0) goto L_0x013e
            int r17 = r0.mo13976h()
            int r18 = r0.mo13976h()
            int r19 = r0.mo13976h()
            int r20 = r0.mo13976h()
            if (r3 != 0) goto L_0x0125
            goto L_0x0132
        L_0x0125:
            r21 = 2
            if (r3 != r4) goto L_0x012b
            r4 = 1
            goto L_0x012c
        L_0x012b:
            r4 = 2
        L_0x012c:
            if (r3 != r10) goto L_0x012f
            r10 = 2
        L_0x012f:
            int r9 = r9 * r10
            r10 = r4
        L_0x0132:
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r1 = r1 - r17
            int r19 = r19 + r20
            int r19 = r19 * r9
            int r2 = r2 - r19
        L_0x013e:
            r9 = r2
            boolean r2 = r0.mo13973e()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x018a
            boolean r2 = r0.mo13973e()
            if (r2 == 0) goto L_0x018a
            r2 = 8
            int r2 = r0.mo13974f(r2)
            r4 = 255(0xff, float:3.57E-43)
            if (r2 != r4) goto L_0x0168
            int r2 = r0.mo13974f(r8)
            int r0 = r0.mo13974f(r8)
            if (r2 == 0) goto L_0x018a
            if (r0 == 0) goto L_0x018a
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r10 = r2
            goto L_0x018c
        L_0x0168:
            r0 = 17
            if (r2 >= r0) goto L_0x0172
            float[] r0 = f15234b
            r0 = r0[r2]
            r10 = r0
            goto L_0x018c
        L_0x0172:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r4 = 46
            r0.<init>(r4)
            java.lang.String r4 = "Unexpected aspect_ratio_idc value: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            android.util.Log.w(r2, r0)
        L_0x018a:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x018c:
            com.google.ads.interactivemedia.v3.internal.alp r0 = new com.google.ads.interactivemedia.v3.internal.alp
            r3 = r0
            r4 = r24
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.alq.m14049b(byte[], int, int):com.google.ads.interactivemedia.v3.internal.alp");
    }

    /* renamed from: c */
    public static int m14050c(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        int i3 = i2 - i;
        boolean z2 = false;
        aup.m14887r(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m14051d(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m14051d(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m14051d(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z = false;
            } else {
                z = true;
            }
            zArr[0] = z;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z2 = true;
            }
            zArr[2] = z2;
            return i2;
        } else {
            m14051d(zArr);
            return i - 1;
        }
    }

    /* renamed from: d */
    public static void m14051d(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: e */
    public static alo m14052e(byte[] bArr, int i) {
        alx alx = new alx(bArr, 3, i);
        alx.mo13971c(8);
        int h = alx.mo13976h();
        int h2 = alx.mo13976h();
        alx.mo13970b();
        return new alo(h, h2, alx.mo13973e());
    }
}
