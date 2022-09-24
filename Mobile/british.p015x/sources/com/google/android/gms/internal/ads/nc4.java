package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nc4 {

    /* renamed from: a */
    public final List<byte[]> f35974a;

    /* renamed from: b */
    public final int f35975b;

    /* renamed from: c */
    public final float f35976c;

    /* renamed from: d */
    public final String f35977d;

    private nc4(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f35974a = list;
        this.f35975b = i;
        this.f35976c = f;
        this.f35977d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x029a A[Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a3 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02b8 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c7 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0120 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.nc4 m35132a(com.google.android.gms.internal.ads.uq2 r30) throws com.google.android.gms.internal.ads.C7811iy {
        /*
            r0 = r30
            r1 = 21
            r0.mo35237g(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r1 = r30.mo35249s()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r2 = 3
            r1 = r1 & r2
            int r3 = r30.mo35249s()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r4 = r30.mo35241k()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0018:
            r8 = 1
            if (r6 >= r3) goto L_0x0035
            r0.mo35237g(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r8 = r30.mo35253w()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r9 = 0
        L_0x0023:
            if (r9 >= r8) goto L_0x0032
            int r10 = r30.mo35253w()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r11 = r10 + 4
            int r7 = r7 + r11
            r0.mo35237g(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r9 = r9 + 1
            goto L_0x0023
        L_0x0032:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x0035:
            r0.mo35236f(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            byte[] r4 = new byte[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r6 = 0
            r9 = -1
            r17 = r6
            r6 = 0
            r9 = 0
            r14 = -1
            r15 = -1
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x0044:
            if (r6 >= r3) goto L_0x02f8
            int r11 = r30.mo35249s()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r11 = r11 & 127(0x7f, float:1.78E-43)
            int r12 = r30.mo35253w()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13 = 0
        L_0x0051:
            if (r13 >= r12) goto L_0x02ef
            int r10 = r30.mo35253w()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            byte[] r8 = com.google.android.gms.internal.ads.kh2.f34333a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r2 = 4
            java.lang.System.arraycopy(r8, r5, r4, r9, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r9 = r9 + 4
            byte[] r8 = r30.mo35238h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r5 = r30.mo35241k()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            java.lang.System.arraycopy(r8, r5, r4, r9, r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r5 = 33
            if (r11 != r5) goto L_0x02d8
            if (r13 != 0) goto L_0x02d8
            int r5 = r9 + r10
            int r8 = r9 + 2
            com.google.android.gms.internal.ads.vr2 r13 = new com.google.android.gms.internal.ads.vr2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.<init>(r4, r8, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35479e(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r5 = 3
            int r8 = r13.mo35475a(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r5 = 2
            int r18 = r13.mo35475a(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            boolean r19 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r14 = 5
            int r20 = r13.mo35475a(r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r15 = 0
            r21 = 0
        L_0x0095:
            r14 = 32
            if (r15 >= r14) goto L_0x00a7
            boolean r14 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r14 == 0) goto L_0x00a4
            r14 = 1
            int r17 = r14 << r15
            r21 = r21 | r17
        L_0x00a4:
            int r15 = r15 + 1
            goto L_0x0095
        L_0x00a7:
            r14 = 6
            int[] r15 = new int[r14]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r2 = 0
        L_0x00ab:
            r5 = 8
            if (r2 >= r14) goto L_0x00b8
            int r5 = r13.mo35475a(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r15[r2] = r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r2 = r2 + 1
            goto L_0x00ab
        L_0x00b8:
            int r23 = r13.mo35475a(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r2 = 0
            r5 = 0
        L_0x00be:
            if (r2 >= r8) goto L_0x00d3
            boolean r24 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r24 == 0) goto L_0x00c8
            int r5 = r5 + 89
        L_0x00c8:
            boolean r24 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r24 == 0) goto L_0x00d0
            int r5 = r5 + 8
        L_0x00d0:
            int r2 = r2 + 1
            goto L_0x00be
        L_0x00d3:
            r13.mo35479e(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r8 <= 0) goto L_0x00de
            int r2 = 8 - r8
            int r2 = r2 + r2
            r13.mo35479e(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x00de:
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r5 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r2 = 3
            if (r5 != r2) goto L_0x00ec
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r5 = 3
        L_0x00ec:
            int r2 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r24 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            boolean r25 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r25 == 0) goto L_0x012f
            int r25 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r26 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r27 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r28 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r14 = 1
            if (r5 == r14) goto L_0x011a
            r14 = 2
            if (r5 != r14) goto L_0x0115
            r29 = r3
            r3 = 1
            r5 = 2
            goto L_0x011d
        L_0x0115:
            r29 = r3
            r3 = 1
            r14 = 1
            goto L_0x011e
        L_0x011a:
            r29 = r3
            r3 = 1
        L_0x011d:
            r14 = 2
        L_0x011e:
            if (r5 != r3) goto L_0x0122
            r3 = 2
            goto L_0x0123
        L_0x0122:
            r3 = 1
        L_0x0123:
            int r25 = r25 + r26
            int r14 = r14 * r25
            int r2 = r2 - r14
            int r27 = r27 + r28
            int r3 = r3 * r27
            int r24 = r24 - r3
            goto L_0x0131
        L_0x012f:
            r29 = r3
        L_0x0131:
            r14 = r2
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r2 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            boolean r3 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r5 = 1
            if (r5 == r3) goto L_0x0145
            r3 = r8
            goto L_0x0146
        L_0x0145:
            r3 = 0
        L_0x0146:
            if (r3 > r8) goto L_0x0154
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r3 = r3 + 1
            goto L_0x0146
        L_0x0154:
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            boolean r3 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r3 == 0) goto L_0x01bd
            boolean r3 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r3 == 0) goto L_0x01bd
            r3 = 0
        L_0x0173:
            r5 = 4
            if (r3 >= r5) goto L_0x01bd
            r5 = 0
        L_0x0177:
            r8 = 6
            if (r5 >= r8) goto L_0x01b5
            boolean r25 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r25 != 0) goto L_0x0189
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r26 = r11
            r27 = r12
        L_0x0187:
            r8 = 3
            goto L_0x01aa
        L_0x0189:
            r8 = 64
            int r25 = r3 + r3
            r22 = 4
            int r25 = r25 + 4
            r26 = r11
            r27 = r12
            r11 = 1
            int r12 = r11 << r25
            int r8 = java.lang.Math.min(r8, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r3 <= r11) goto L_0x01a1
            r13.mo35476b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x01a1:
            r11 = 0
        L_0x01a2:
            if (r11 >= r8) goto L_0x0187
            r13.mo35476b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r11 = r11 + 1
            goto L_0x01a2
        L_0x01aa:
            if (r3 != r8) goto L_0x01ae
            r11 = 3
            goto L_0x01af
        L_0x01ae:
            r11 = 1
        L_0x01af:
            int r5 = r5 + r11
            r11 = r26
            r12 = r27
            goto L_0x0177
        L_0x01b5:
            r26 = r11
            r27 = r12
            r8 = 3
            int r3 = r3 + 1
            goto L_0x0173
        L_0x01bd:
            r26 = r11
            r27 = r12
            r8 = 3
            r3 = 2
            r13.mo35479e(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            boolean r3 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r3 == 0) goto L_0x01da
            r3 = 8
            r13.mo35479e(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x01da:
            int r3 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r5 = 0
            r11 = 0
            r12 = 0
        L_0x01e1:
            if (r5 >= r3) goto L_0x022f
            if (r5 == 0) goto L_0x01e9
            boolean r11 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x01e9:
            if (r11 == 0) goto L_0x0203
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r8 = 0
        L_0x01f2:
            if (r8 > r12) goto L_0x0200
            boolean r25 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r25 == 0) goto L_0x01fd
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x01fd:
            int r8 = r8 + 1
            goto L_0x01f2
        L_0x0200:
            r28 = r3
            goto L_0x0229
        L_0x0203:
            int r8 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r12 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r25 = r8 + r12
            r28 = r3
            r3 = 0
        L_0x0210:
            if (r3 >= r8) goto L_0x021b
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r3 = r3 + 1
            goto L_0x0210
        L_0x021b:
            r3 = 0
        L_0x021c:
            if (r3 >= r12) goto L_0x0227
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r3 = r3 + 1
            goto L_0x021c
        L_0x0227:
            r12 = r25
        L_0x0229:
            int r5 = r5 + 1
            r3 = r28
            r8 = 3
            goto L_0x01e1
        L_0x022f:
            boolean r3 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r3 == 0) goto L_0x0245
            r3 = 0
        L_0x0236:
            int r5 = r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r3 >= r5) goto L_0x0245
            r5 = 5
            int r8 = r2 + 5
            r13.mo35479e(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r3 = r3 + 1
            goto L_0x0236
        L_0x0245:
            r2 = 2
            r13.mo35479e(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            boolean r2 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r2 == 0) goto L_0x02ca
            boolean r2 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r2 == 0) goto L_0x0292
            r2 = 8
            int r2 = r13.mo35475a(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r3 = 255(0xff, float:3.57E-43)
            if (r2 != r3) goto L_0x0271
            r2 = 16
            int r3 = r13.mo35475a(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            int r2 = r13.mo35475a(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r3 == 0) goto L_0x0292
            if (r2 == 0) goto L_0x0292
            float r3 = (float) r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            float r2 = (float) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            float r3 = r3 / r2
            goto L_0x0294
        L_0x0271:
            r3 = 17
            if (r2 >= r3) goto L_0x027a
            float[] r3 = com.google.android.gms.internal.ads.kh2.f34334b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r3 = r3[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            goto L_0x0294
        L_0x027a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r5 = 46
            r3.<init>(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            java.lang.String r5 = "Unexpected aspect_ratio_idc value: "
            r3.append(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r3.append(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            java.lang.String r2 = "NalUnitUtil"
            java.lang.String r3 = r3.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            android.util.Log.w(r2, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x0292:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0294:
            boolean r2 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r2 == 0) goto L_0x029d
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x029d:
            boolean r2 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r2 == 0) goto L_0x02b2
            r2 = 4
            r13.mo35479e(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            boolean r2 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r2 == 0) goto L_0x02b2
            r2 = 24
            r13.mo35479e(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x02b2:
            boolean r2 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r2 == 0) goto L_0x02be
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r13.mo35477c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x02be:
            r13.mo35478d()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            boolean r2 = r13.mo35480f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            if (r2 == 0) goto L_0x02cc
            int r24 = r24 + r24
            goto L_0x02cc
        L_0x02ca:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x02cc:
            r22 = r15
            java.lang.String r17 = com.google.android.gms.internal.ads.qw1.m36769b(r18, r19, r20, r21, r22, r23)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r16 = r3
            r15 = r24
            r13 = 0
            goto L_0x02de
        L_0x02d8:
            r29 = r3
            r26 = r11
            r27 = r12
        L_0x02de:
            int r9 = r9 + r10
            r0.mo35237g(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r2 = 1
            int r13 = r13 + r2
            r11 = r26
            r12 = r27
            r3 = r29
            r2 = 3
            r5 = 0
            r8 = 1
            goto L_0x0051
        L_0x02ef:
            r29 = r3
            int r6 = r6 + 1
            r2 = 3
            r5 = 0
            r8 = 1
            goto L_0x0044
        L_0x02f8:
            if (r7 != 0) goto L_0x02ff
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            goto L_0x0303
        L_0x02ff:
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
        L_0x0303:
            r12 = r0
            com.google.android.gms.internal.ads.nc4 r0 = new com.google.android.gms.internal.ads.nc4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            r2 = 1
            int r13 = r1 + 1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x030e }
            return r0
        L_0x030e:
            r0 = move-exception
            java.lang.String r1 = "Error parsing HEVC config"
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r0)
            goto L_0x0317
        L_0x0316:
            throw r0
        L_0x0317:
            goto L_0x0316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nc4.m35132a(com.google.android.gms.internal.ads.uq2):com.google.android.gms.internal.ads.nc4");
    }
}
