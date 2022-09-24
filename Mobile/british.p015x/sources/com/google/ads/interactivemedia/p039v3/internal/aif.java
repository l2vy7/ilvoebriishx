package com.google.ads.interactivemedia.p039v3.internal;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aif */
/* compiled from: IMASDK */
public final class aif extends aio {

    /* renamed from: a */
    public static final /* synthetic */ int f14979a = 0;

    /* renamed from: b */
    private static final int[] f14980b = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final avf<Integer> f14981c = avf.m14922c(ahw.f14889a);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final avf<Integer> f14982d = avf.m14922c(ahw.f14891c);

    /* renamed from: e */
    private final AtomicReference<ahz> f14983e;

    /* renamed from: f */
    private final aht f14984f;

    @Deprecated
    public aif() {
        ahz ahz = ahz.f14909a;
        throw null;
    }

    /* renamed from: a */
    protected static boolean m13762a(int i, boolean z) {
        int n = avr.m14972n(i);
        return n == 4 || (z && n == 3);
    }

    /* renamed from: b */
    protected static String m13763b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C6540C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    protected static int m13764c(C4120ke keVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(keVar.f17672c)) {
            return 4;
        }
        String b = m13763b(str);
        String b2 = m13763b(keVar.f17672c);
        if (b2 == null || b == null) {
            if (!z || b2 != null) {
                return 0;
            }
            return 1;
        } else if (b2.startsWith(b) || b.startsWith(b2)) {
            return 3;
        } else {
            if (amm.m14184A(b2, "-")[0].equals(amm.m14184A(b, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: j */
    private static boolean m13767j(C4120ke keVar, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((keVar.f17674e & 16384) != 0 || !m13762a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !amm.m14233c(keVar.f17681l, str)) {
            return false;
        }
        int i11 = keVar.f17686q;
        if (i11 != -1 && (i7 > i11 || i11 > i3)) {
            return false;
        }
        int i12 = keVar.f17687r;
        if (i12 != -1 && (i8 > i12 || i12 > i4)) {
            return false;
        }
        float f = keVar.f17688s;
        if (f != -1.0f && (((float) i9) > f || f > ((float) i5))) {
            return false;
        }
        int i13 = keVar.f17677h;
        if (i13 != -1) {
            return i10 <= i13 && i13 <= i6;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.Integer> m13768k(com.google.ads.interactivemedia.p039v3.internal.aco r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f14188a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            int r3 = r12.f14188a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00a3
            if (r14 == r2) goto L_0x00a3
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0022:
            int r5 = r12.f14188a
            if (r3 >= r5) goto L_0x007d
            com.google.ads.interactivemedia.v3.internal.ke r5 = r12.mo13445a(r3)
            int r6 = r5.f17686q
            if (r6 <= 0) goto L_0x007a
            int r7 = r5.f17687r
            if (r7 <= 0) goto L_0x007a
            if (r15 == 0) goto L_0x0042
            r8 = 1
            if (r6 > r7) goto L_0x0039
            r9 = 0
            goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            if (r13 > r14) goto L_0x003d
            r8 = 0
        L_0x003d:
            if (r9 == r8) goto L_0x0042
            r8 = r13
            r9 = r14
            goto L_0x0044
        L_0x0042:
            r9 = r13
            r8 = r14
        L_0x0044:
            int r10 = r6 * r8
            int r11 = r7 * r9
            if (r10 < r11) goto L_0x0054
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = com.google.ads.interactivemedia.p039v3.internal.amm.m14189F(r11, r6)
            r7.<init>(r9, r6)
            goto L_0x005e
        L_0x0054:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.google.ads.interactivemedia.p039v3.internal.amm.m14189F(r10, r7)
            r6.<init>(r7, r8)
            r7 = r6
        L_0x005e:
            int r6 = r5.f17686q
            int r5 = r5.f17687r
            int r8 = r6 * r5
            int r9 = r7.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r6 < r9) goto L_0x007a
            int r6 = r7.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x007a
            if (r8 >= r4) goto L_0x007a
            r4 = r8
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x007d:
            if (r4 == r2) goto L_0x00a3
            int r13 = r0.size()
            r14 = -1
            int r13 = r13 + r14
        L_0x0085:
            if (r13 < 0) goto L_0x00a3
            java.lang.Object r15 = r0.get(r13)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            com.google.ads.interactivemedia.v3.internal.ke r15 = r12.mo13445a(r15)
            int r15 = r15.mo16129d()
            if (r15 == r14) goto L_0x009d
            if (r15 <= r4) goto L_0x00a0
        L_0x009d:
            r0.remove(r13)
        L_0x00a0:
            int r13 = r13 + -1
            goto L_0x0085
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aif.m13768k(com.google.ads.interactivemedia.v3.internal.aco, int, int, boolean):java.util.List");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x015b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0161 A[LOOP:1: B:21:0x004a->B:63:0x0161, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x020f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.ads.interactivemedia.p039v3.internal.C4158lp[], com.google.ads.interactivemedia.p039v3.internal.aih[]> mo13772f(com.google.ads.interactivemedia.p039v3.internal.aij r45, int[][][] r46, int[] r47) throws com.google.ads.interactivemedia.p039v3.internal.C4089ja {
        /*
            r44 = this;
            r0 = r44
            r1 = r45
            java.util.concurrent.atomic.AtomicReference<com.google.ads.interactivemedia.v3.internal.ahz> r2 = r0.f14983e
            java.lang.Object r2 = r2.get()
            com.google.ads.interactivemedia.v3.internal.ahz r2 = (com.google.ads.interactivemedia.p039v3.internal.ahz) r2
            int r3 = r45.mo13773a()
            int r4 = r45.mo13773a()
            com.google.ads.interactivemedia.v3.internal.aig[] r5 = new com.google.ads.interactivemedia.p039v3.internal.aig[r4]
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0019:
            r10 = 2
            r13 = 1
            if (r7 >= r4) goto L_0x0248
            int r14 = r1.mo13774b(r7)
            if (r14 != r10) goto L_0x022f
            if (r8 != 0) goto L_0x0215
            com.google.ads.interactivemedia.v3.internal.acq r8 = r1.mo13775c(r7)
            r14 = r46[r7]
            r15 = r47[r7]
            boolean r12 = r2.f14937y
            if (r12 != 0) goto L_0x017c
            boolean r12 = r2.f14936x
            if (r12 != 0) goto L_0x017c
            boolean r12 = r2.f14924l
            if (r13 == r12) goto L_0x003c
            r12 = 16
            goto L_0x003e
        L_0x003c:
            r12 = 24
        L_0x003e:
            boolean r6 = r2.f14923k
            if (r6 == 0) goto L_0x0048
            r6 = r15 & r12
            if (r6 == 0) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            r15 = 0
        L_0x004a:
            int r13 = r8.f14193b
            if (r15 >= r13) goto L_0x017c
            com.google.ads.interactivemedia.v3.internal.aco r13 = r8.mo13453a(r15)
            r30 = r14[r15]
            int r11 = r2.f14914b
            int r10 = r2.f14915c
            int r0 = r2.f14916d
            r31 = r3
            int r3 = r2.f14917e
            r32 = r4
            int r4 = r2.f14918f
            r33 = r9
            int r9 = r2.f14919g
            int r1 = r2.f14920h
            r34 = r5
            int r5 = r2.f14921i
            r35 = r7
            int r7 = r2.f14925m
            r36 = r14
            int r14 = r2.f14926n
            r37 = r8
            boolean r8 = r2.f14927o
            r38 = r2
            int r2 = r13.f14188a
            r39 = r15
            r15 = 2
            if (r2 >= r15) goto L_0x0087
            int[] r0 = f14980b
        L_0x0083:
            r40 = r6
            goto L_0x0158
        L_0x0087:
            java.util.List r2 = m13768k(r13, r7, r14, r8)
            int r7 = r2.size()
            if (r7 >= r15) goto L_0x0094
            int[] r0 = f14980b
            goto L_0x0083
        L_0x0094:
            if (r6 != 0) goto L_0x010e
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r40 = r6
            r8 = 0
            r14 = 0
            r15 = 0
        L_0x00a0:
            int r6 = r2.size()
            if (r14 >= r6) goto L_0x010b
            java.lang.Object r6 = r2.get(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.ads.interactivemedia.v3.internal.ke r6 = r13.mo13445a(r6)
            java.lang.String r6 = r6.f17681l
            boolean r17 = r7.add(r6)
            if (r17 == 0) goto L_0x00fe
            r41 = r7
            r42 = r8
            r43 = r14
            r7 = 0
            r8 = 0
        L_0x00c4:
            int r14 = r2.size()
            if (r7 >= r14) goto L_0x00f9
            java.lang.Object r14 = r2.get(r7)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.google.ads.interactivemedia.v3.internal.ke r17 = r13.mo13445a(r14)
            r19 = r30[r14]
            r18 = r6
            r20 = r12
            r21 = r11
            r22 = r10
            r23 = r0
            r24 = r3
            r25 = r4
            r26 = r9
            r27 = r1
            r28 = r5
            boolean r14 = m13767j(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r14 == 0) goto L_0x00f6
            int r8 = r8 + 1
        L_0x00f6:
            int r7 = r7 + 1
            goto L_0x00c4
        L_0x00f9:
            if (r8 <= r15) goto L_0x0104
            r15 = r8
            r8 = r6
            goto L_0x0106
        L_0x00fe:
            r41 = r7
            r42 = r8
            r43 = r14
        L_0x0104:
            r8 = r42
        L_0x0106:
            int r14 = r43 + 1
            r7 = r41
            goto L_0x00a0
        L_0x010b:
            r42 = r8
            goto L_0x0112
        L_0x010e:
            r40 = r6
            r42 = 0
        L_0x0112:
            int r6 = r2.size()
            r7 = -1
            int r6 = r6 + r7
        L_0x0118:
            if (r6 < 0) goto L_0x014a
            java.lang.Object r7 = r2.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.google.ads.interactivemedia.v3.internal.ke r17 = r13.mo13445a(r7)
            r19 = r30[r7]
            r18 = r42
            r20 = r12
            r21 = r11
            r22 = r10
            r23 = r0
            r24 = r3
            r25 = r4
            r26 = r9
            r27 = r1
            r28 = r5
            boolean r7 = m13767j(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r7 != 0) goto L_0x0147
            r2.remove(r6)
        L_0x0147:
            int r6 = r6 + -1
            goto L_0x0118
        L_0x014a:
            int r0 = r2.size()
            r1 = 2
            if (r0 >= r1) goto L_0x0154
            int[] r0 = f14980b
            goto L_0x0158
        L_0x0154:
            int[] r0 = com.google.ads.interactivemedia.p039v3.internal.awa.m14989a(r2)
        L_0x0158:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0161
            com.google.ads.interactivemedia.v3.internal.aig r1 = new com.google.ads.interactivemedia.v3.internal.aig
            r1.<init>(r13, r0)
            goto L_0x018d
        L_0x0161:
            int r15 = r39 + 1
            r0 = r44
            r1 = r45
            r3 = r31
            r4 = r32
            r9 = r33
            r5 = r34
            r7 = r35
            r14 = r36
            r8 = r37
            r2 = r38
            r6 = r40
            r10 = 2
            goto L_0x004a
        L_0x017c:
            r38 = r2
            r31 = r3
            r32 = r4
            r34 = r5
            r35 = r7
            r37 = r8
            r33 = r9
            r36 = r14
            r1 = 0
        L_0x018d:
            if (r1 != 0) goto L_0x0202
            r3 = r37
            r0 = 0
            r1 = 0
            r2 = 0
            r11 = -1
        L_0x0195:
            int r4 = r3.f14193b
            if (r2 >= r4) goto L_0x01f0
            com.google.ads.interactivemedia.v3.internal.aco r4 = r3.mo13453a(r2)
            r5 = r38
            int r6 = r5.f14925m
            int r7 = r5.f14926n
            boolean r8 = r5.f14927o
            java.util.List r6 = m13768k(r4, r6, r7, r8)
            r7 = r36[r2]
            r8 = 0
        L_0x01ac:
            int r9 = r4.f14188a
            if (r8 >= r9) goto L_0x01eb
            com.google.ads.interactivemedia.v3.internal.ke r9 = r4.mo13445a(r8)
            int r10 = r9.f17674e
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01bb
            goto L_0x01e8
        L_0x01bb:
            r10 = r7[r8]
            boolean r12 = r5.f14938z
            boolean r10 = m13762a(r10, r12)
            if (r10 == 0) goto L_0x01e8
            com.google.ads.interactivemedia.v3.internal.aie r10 = new com.google.ads.interactivemedia.v3.internal.aie
            r12 = r7[r8]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r13 = r6.contains(r13)
            r10.<init>(r9, r5, r12, r13)
            boolean r9 = r10.f14972a
            if (r9 != 0) goto L_0x01dd
            boolean r9 = r5.f14922j
            if (r9 != 0) goto L_0x01dd
            goto L_0x01e8
        L_0x01dd:
            if (r1 == 0) goto L_0x01e5
            int r9 = r10.compareTo(r1)
            if (r9 <= 0) goto L_0x01e8
        L_0x01e5:
            r0 = r4
            r11 = r8
            r1 = r10
        L_0x01e8:
            int r8 = r8 + 1
            goto L_0x01ac
        L_0x01eb:
            int r2 = r2 + 1
            r38 = r5
            goto L_0x0195
        L_0x01f0:
            r5 = r38
            if (r0 != 0) goto L_0x01f6
            r12 = 0
            goto L_0x0205
        L_0x01f6:
            com.google.ads.interactivemedia.v3.internal.aig r12 = new com.google.ads.interactivemedia.v3.internal.aig
            r1 = 1
            int[] r2 = new int[r1]
            r1 = 0
            r2[r1] = r11
            r12.<init>(r0, r2)
            goto L_0x0205
        L_0x0202:
            r5 = r38
            r12 = r1
        L_0x0205:
            r34[r35] = r12
            if (r12 == 0) goto L_0x020f
            r0 = r45
            r6 = r35
            r8 = 1
            goto L_0x0221
        L_0x020f:
            r0 = r45
            r6 = r35
            r8 = 0
            goto L_0x0221
        L_0x0215:
            r31 = r3
            r32 = r4
            r34 = r5
            r33 = r9
            r5 = r2
            r0 = r45
            r6 = r7
        L_0x0221:
            com.google.ads.interactivemedia.v3.internal.acq r1 = r0.mo13775c(r6)
            int r1 = r1.f14193b
            if (r1 <= 0) goto L_0x022b
            r13 = 1
            goto L_0x022c
        L_0x022b:
            r13 = 0
        L_0x022c:
            r9 = r33 | r13
            goto L_0x023a
        L_0x022f:
            r0 = r1
            r31 = r3
            r32 = r4
            r34 = r5
            r6 = r7
            r33 = r9
            r5 = r2
        L_0x023a:
            int r7 = r6 + 1
            r1 = r0
            r2 = r5
            r3 = r31
            r4 = r32
            r5 = r34
            r0 = r44
            goto L_0x0019
        L_0x0248:
            r0 = r1
            r31 = r3
            r34 = r5
            r33 = r9
            r5 = r2
            r1 = 0
            r2 = 0
            r3 = -1
            r6 = 0
        L_0x0254:
            if (r2 >= r4) goto L_0x03bd
            int r7 = r0.mo13774b(r2)
            r8 = 1
            if (r7 != r8) goto L_0x03a9
            boolean r7 = r5.f14911B
            if (r7 != 0) goto L_0x0266
            if (r33 != 0) goto L_0x0264
            goto L_0x0266
        L_0x0264:
            r7 = 0
            goto L_0x0267
        L_0x0266:
            r7 = 1
        L_0x0267:
            com.google.ads.interactivemedia.v3.internal.acq r8 = r0.mo13775c(r2)
            r9 = r46[r2]
            r10 = r47[r2]
            r10 = 0
            r11 = 0
            r12 = -1
            r13 = -1
        L_0x0273:
            int r14 = r8.f14193b
            if (r11 >= r14) goto L_0x02c8
            com.google.ads.interactivemedia.v3.internal.aco r14 = r8.mo13453a(r11)
            r15 = r9[r11]
            r17 = r12
            r18 = r13
            r12 = 0
        L_0x0282:
            int r13 = r14.f14188a
            if (r12 >= r13) goto L_0x02bf
            r13 = r15[r12]
            r19 = r6
            boolean r6 = r5.f14938z
            boolean r6 = m13762a(r13, r6)
            if (r6 == 0) goto L_0x02b6
            com.google.ads.interactivemedia.v3.internal.ke r6 = r14.mo13445a(r12)
            com.google.ads.interactivemedia.v3.internal.ahx r13 = new com.google.ads.interactivemedia.v3.internal.ahx
            r20 = r14
            r14 = r15[r12]
            r13.<init>(r6, r5, r14)
            boolean r6 = r13.f14893a
            if (r6 != 0) goto L_0x02a8
            boolean r6 = r5.f14931s
            if (r6 != 0) goto L_0x02a8
            goto L_0x02b8
        L_0x02a8:
            if (r10 == 0) goto L_0x02b0
            int r6 = r13.compareTo(r10)
            if (r6 <= 0) goto L_0x02b8
        L_0x02b0:
            r17 = r11
            r18 = r12
            r10 = r13
            goto L_0x02b8
        L_0x02b6:
            r20 = r14
        L_0x02b8:
            int r12 = r12 + 1
            r6 = r19
            r14 = r20
            goto L_0x0282
        L_0x02bf:
            r19 = r6
            int r11 = r11 + 1
            r12 = r17
            r13 = r18
            goto L_0x0273
        L_0x02c8:
            r19 = r6
            r6 = -1
            if (r12 != r6) goto L_0x02d6
            r17 = r2
            r32 = r4
            r38 = r5
            r0 = 0
            goto L_0x0379
        L_0x02d6:
            com.google.ads.interactivemedia.v3.internal.aco r6 = r8.mo13453a(r12)
            boolean r8 = r5.f14937y
            if (r8 != 0) goto L_0x035e
            boolean r8 = r5.f14936x
            if (r8 != 0) goto L_0x035e
            if (r7 == 0) goto L_0x035e
            r7 = r9[r12]
            int r8 = r5.f14930r
            boolean r9 = r5.f14932t
            boolean r11 = r5.f14933u
            boolean r12 = r5.f14934v
            com.google.ads.interactivemedia.v3.internal.ke r14 = r6.mo13445a(r13)
            int r15 = r6.f14188a
            int[] r15 = new int[r15]
            r32 = r4
            r38 = r5
            r0 = 0
            r5 = 0
        L_0x02fc:
            int r4 = r6.f14188a
            if (r5 >= r4) goto L_0x034e
            if (r5 == r13) goto L_0x033e
            com.google.ads.interactivemedia.v3.internal.ke r4 = r6.mo13445a(r5)
            r17 = r2
            r2 = r7[r5]
            r18 = r7
            r7 = 0
            boolean r2 = m13762a(r2, r7)
            if (r2 == 0) goto L_0x0347
            int r2 = r4.f17677h
            r7 = -1
            if (r2 == r7) goto L_0x0347
            if (r2 > r8) goto L_0x0347
            if (r12 != 0) goto L_0x0324
            int r2 = r4.f17694y
            if (r2 == r7) goto L_0x0347
            int r7 = r14.f17694y
            if (r2 != r7) goto L_0x0347
        L_0x0324:
            if (r9 != 0) goto L_0x0332
            java.lang.String r2 = r4.f17681l
            if (r2 == 0) goto L_0x0347
            java.lang.String r7 = r14.f17681l
            boolean r2 = android.text.TextUtils.equals(r2, r7)
            if (r2 == 0) goto L_0x0347
        L_0x0332:
            if (r11 != 0) goto L_0x0342
            int r2 = r4.f17695z
            r4 = -1
            if (r2 == r4) goto L_0x0347
            int r4 = r14.f17695z
            if (r2 != r4) goto L_0x0347
            goto L_0x0342
        L_0x033e:
            r17 = r2
            r18 = r7
        L_0x0342:
            int r2 = r0 + 1
            r15[r0] = r5
            r0 = r2
        L_0x0347:
            int r5 = r5 + 1
            r2 = r17
            r7 = r18
            goto L_0x02fc
        L_0x034e:
            r17 = r2
            int[] r0 = java.util.Arrays.copyOf(r15, r0)
            int r2 = r0.length
            r4 = 1
            if (r2 <= r4) goto L_0x0365
            com.google.ads.interactivemedia.v3.internal.aig r2 = new com.google.ads.interactivemedia.v3.internal.aig
            r2.<init>(r6, r0)
            goto L_0x0366
        L_0x035e:
            r17 = r2
            r32 = r4
            r38 = r5
            r4 = 1
        L_0x0365:
            r2 = 0
        L_0x0366:
            if (r2 != 0) goto L_0x0372
            com.google.ads.interactivemedia.v3.internal.aig r2 = new com.google.ads.interactivemedia.v3.internal.aig
            int[] r0 = new int[r4]
            r4 = 0
            r0[r4] = r13
            r2.<init>(r6, r0)
        L_0x0372:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r10)
            android.util.Pair r0 = android.util.Pair.create(r2, r10)
        L_0x0379:
            if (r0 == 0) goto L_0x03b1
            if (r1 == 0) goto L_0x0387
            java.lang.Object r2 = r0.second
            com.google.ads.interactivemedia.v3.internal.ahx r2 = (com.google.ads.interactivemedia.p039v3.internal.ahx) r2
            int r2 = r2.compareTo(r1)
            if (r2 <= 0) goto L_0x03b1
        L_0x0387:
            r1 = -1
            if (r3 == r1) goto L_0x038d
            r1 = 0
            r34[r3] = r1
        L_0x038d:
            java.lang.Object r1 = r0.first
            com.google.ads.interactivemedia.v3.internal.aig r1 = (com.google.ads.interactivemedia.p039v3.internal.aig) r1
            r34[r17] = r1
            com.google.ads.interactivemedia.v3.internal.aco r2 = r1.f14985a
            int[] r1 = r1.f14986b
            r3 = 0
            r1 = r1[r3]
            com.google.ads.interactivemedia.v3.internal.ke r1 = r2.mo13445a(r1)
            java.lang.String r1 = r1.f17672c
            java.lang.Object r0 = r0.second
            com.google.ads.interactivemedia.v3.internal.ahx r0 = (com.google.ads.interactivemedia.p039v3.internal.ahx) r0
            r6 = r1
            r3 = r17
            r1 = r0
            goto L_0x03b3
        L_0x03a9:
            r17 = r2
            r32 = r4
            r38 = r5
            r19 = r6
        L_0x03b1:
            r6 = r19
        L_0x03b3:
            int r2 = r17 + 1
            r0 = r45
            r4 = r32
            r5 = r38
            goto L_0x0254
        L_0x03bd:
            r38 = r5
            r19 = r6
            r2 = r4
            r0 = 0
            r1 = 0
            r7 = -1
        L_0x03c5:
            if (r1 >= r2) goto L_0x04e8
            r3 = r45
            int r4 = r3.mo13774b(r1)
            r5 = 1
            if (r4 == r5) goto L_0x04dc
            r5 = 2
            if (r4 == r5) goto L_0x04dc
            r5 = 3
            if (r4 == r5) goto L_0x0441
            com.google.ads.interactivemedia.v3.internal.acq r4 = r3.mo13775c(r1)
            r5 = r46[r1]
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x03e0:
            int r11 = r4.f14193b
            if (r9 >= r11) goto L_0x042a
            com.google.ads.interactivemedia.v3.internal.aco r11 = r4.mo13453a(r9)
            r12 = r5[r9]
            r13 = 0
        L_0x03eb:
            int r14 = r11.f14188a
            if (r13 >= r14) goto L_0x0421
            r14 = r12[r13]
            r47 = r4
            r15 = r38
            boolean r4 = r15.f14938z
            boolean r4 = m13762a(r14, r4)
            if (r4 == 0) goto L_0x0416
            com.google.ads.interactivemedia.v3.internal.ke r4 = r11.mo13445a(r13)
            com.google.ads.interactivemedia.v3.internal.ahy r14 = new com.google.ads.interactivemedia.v3.internal.ahy
            r17 = r5
            r5 = r12[r13]
            r14.<init>(r4, r5)
            if (r8 == 0) goto L_0x0412
            int r4 = r14.compareTo(r8)
            if (r4 <= 0) goto L_0x0418
        L_0x0412:
            r6 = r11
            r10 = r13
            r8 = r14
            goto L_0x0418
        L_0x0416:
            r17 = r5
        L_0x0418:
            int r13 = r13 + 1
            r4 = r47
            r38 = r15
            r5 = r17
            goto L_0x03eb
        L_0x0421:
            r47 = r4
            r17 = r5
            r15 = r38
            int r9 = r9 + 1
            goto L_0x03e0
        L_0x042a:
            r15 = r38
            if (r6 != 0) goto L_0x0430
            r4 = 0
            goto L_0x043b
        L_0x0430:
            com.google.ads.interactivemedia.v3.internal.aig r4 = new com.google.ads.interactivemedia.v3.internal.aig
            r5 = 1
            int[] r8 = new int[r5]
            r5 = 0
            r8[r5] = r10
            r4.<init>(r6, r8)
        L_0x043b:
            r34[r1] = r4
            r11 = r19
            goto L_0x04e0
        L_0x0441:
            r15 = r38
            com.google.ads.interactivemedia.v3.internal.acq r4 = r3.mo13775c(r1)
            r5 = r46[r1]
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = -1
        L_0x044d:
            int r11 = r4.f14193b
            if (r9 >= r11) goto L_0x04a4
            com.google.ads.interactivemedia.v3.internal.aco r11 = r4.mo13453a(r9)
            r12 = r5[r9]
            r13 = 0
        L_0x0458:
            int r14 = r11.f14188a
            if (r13 >= r14) goto L_0x049b
            r14 = r12[r13]
            r47 = r4
            boolean r4 = r15.f14938z
            boolean r4 = m13762a(r14, r4)
            if (r4 == 0) goto L_0x048a
            com.google.ads.interactivemedia.v3.internal.ke r4 = r11.mo13445a(r13)
            com.google.ads.interactivemedia.v3.internal.aid r14 = new com.google.ads.interactivemedia.v3.internal.aid
            r17 = r5
            r5 = r12[r13]
            r18 = r11
            r11 = r19
            r14.<init>(r4, r15, r5, r11)
            boolean r4 = r14.f14963a
            if (r4 == 0) goto L_0x0490
            if (r8 == 0) goto L_0x0485
            int r4 = r14.compareTo(r8)
            if (r4 <= 0) goto L_0x0490
        L_0x0485:
            r10 = r13
            r8 = r14
            r6 = r18
            goto L_0x0490
        L_0x048a:
            r17 = r5
            r18 = r11
            r11 = r19
        L_0x0490:
            int r13 = r13 + 1
            r4 = r47
            r19 = r11
            r5 = r17
            r11 = r18
            goto L_0x0458
        L_0x049b:
            r47 = r4
            r17 = r5
            r11 = r19
            int r9 = r9 + 1
            goto L_0x044d
        L_0x04a4:
            r11 = r19
            if (r6 != 0) goto L_0x04aa
            r4 = 0
            goto L_0x04bc
        L_0x04aa:
            com.google.ads.interactivemedia.v3.internal.aig r4 = new com.google.ads.interactivemedia.v3.internal.aig
            r5 = 1
            int[] r9 = new int[r5]
            r5 = 0
            r9[r5] = r10
            r4.<init>(r6, r9)
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r8)
            android.util.Pair r4 = android.util.Pair.create(r4, r8)
        L_0x04bc:
            if (r4 == 0) goto L_0x04e0
            if (r0 == 0) goto L_0x04ca
            java.lang.Object r5 = r4.second
            com.google.ads.interactivemedia.v3.internal.aid r5 = (com.google.ads.interactivemedia.p039v3.internal.aid) r5
            int r5 = r5.compareTo(r0)
            if (r5 <= 0) goto L_0x04e0
        L_0x04ca:
            r0 = -1
            if (r7 == r0) goto L_0x04d0
            r0 = 0
            r34[r7] = r0
        L_0x04d0:
            java.lang.Object r0 = r4.first
            com.google.ads.interactivemedia.v3.internal.aig r0 = (com.google.ads.interactivemedia.p039v3.internal.aig) r0
            r34[r1] = r0
            java.lang.Object r0 = r4.second
            com.google.ads.interactivemedia.v3.internal.aid r0 = (com.google.ads.interactivemedia.p039v3.internal.aid) r0
            r7 = r1
            goto L_0x04e0
        L_0x04dc:
            r11 = r19
            r15 = r38
        L_0x04e0:
            int r1 = r1 + 1
            r19 = r11
            r38 = r15
            goto L_0x03c5
        L_0x04e8:
            r3 = r45
            r15 = r38
            r0 = r31
            r1 = 0
        L_0x04ef:
            if (r1 >= r0) goto L_0x0522
            boolean r4 = r15.mo13753b(r1)
            if (r4 == 0) goto L_0x04fb
            r4 = 0
            r34[r1] = r4
            goto L_0x051f
        L_0x04fb:
            r4 = 0
            com.google.ads.interactivemedia.v3.internal.acq r5 = r3.mo13775c(r1)
            boolean r6 = r15.mo13754c(r1, r5)
            if (r6 == 0) goto L_0x051f
            com.google.ads.interactivemedia.v3.internal.aic r6 = r15.mo13755d(r1, r5)
            if (r6 != 0) goto L_0x050e
            r7 = r4
            goto L_0x051d
        L_0x050e:
            com.google.ads.interactivemedia.v3.internal.aig r7 = new com.google.ads.interactivemedia.v3.internal.aig
            int r8 = r6.f14959a
            com.google.ads.interactivemedia.v3.internal.aco r5 = r5.mo13453a(r8)
            int[] r8 = r6.f14960b
            int r6 = r6.f14962d
            r7.<init>(r5, r8, r6)
        L_0x051d:
            r34[r1] = r7
        L_0x051f:
            int r1 = r1 + 1
            goto L_0x04ef
        L_0x0522:
            r1 = r44
            r4 = 0
            com.google.ads.interactivemedia.v3.internal.aht r11 = r1.f14984f
            com.google.ads.interactivemedia.v3.internal.aiz r12 = r44.mo13778g()
            com.google.ads.interactivemedia.v3.internal.atz r13 = com.google.ads.interactivemedia.p039v3.internal.ahu.m13724i(r34)
            com.google.ads.interactivemedia.v3.internal.aih[] r14 = new com.google.ads.interactivemedia.p039v3.internal.aih[r2]
            r10 = 0
        L_0x0532:
            if (r10 >= r2) goto L_0x0573
            r5 = r34[r10]
            if (r5 == 0) goto L_0x056c
            int[] r7 = r5.f14986b
            int r6 = r7.length
            if (r6 != 0) goto L_0x053e
            goto L_0x056c
        L_0x053e:
            r8 = 1
            if (r6 != r8) goto L_0x0551
            com.google.ads.interactivemedia.v3.internal.aii r6 = new com.google.ads.interactivemedia.v3.internal.aii
            com.google.ads.interactivemedia.v3.internal.aco r8 = r5.f14985a
            r16 = 0
            r7 = r7[r16]
            int r5 = r5.f14987c
            r6.<init>(r8, r7, r5)
            r29 = r10
            goto L_0x0569
        L_0x0551:
            r16 = 0
            com.google.ads.interactivemedia.v3.internal.aco r6 = r5.f14985a
            int r8 = r5.f14987c
            java.lang.Object r5 = r13.get(r10)
            r17 = r5
            com.google.ads.interactivemedia.v3.internal.atz r17 = (com.google.ads.interactivemedia.p039v3.internal.atz) r17
            r5 = r11
            r9 = r12
            r29 = r10
            r10 = r17
            com.google.ads.interactivemedia.v3.internal.ahu r6 = r5.mo13730a(r6, r7, r8, r9, r10)
        L_0x0569:
            r14[r29] = r6
            goto L_0x0570
        L_0x056c:
            r29 = r10
            r16 = 0
        L_0x0570:
            int r10 = r29 + 1
            goto L_0x0532
        L_0x0573:
            r16 = 0
            com.google.ads.interactivemedia.v3.internal.lp[] r2 = new com.google.ads.interactivemedia.p039v3.internal.C4158lp[r0]
            r5 = 0
        L_0x0578:
            if (r5 >= r0) goto L_0x0594
            boolean r6 = r15.mo13753b(r5)
            if (r6 != 0) goto L_0x058e
            int r6 = r3.mo13774b(r5)
            r7 = 7
            if (r6 == r7) goto L_0x058b
            r6 = r14[r5]
            if (r6 == 0) goto L_0x058e
        L_0x058b:
            com.google.ads.interactivemedia.v3.internal.lp r6 = com.google.ads.interactivemedia.p039v3.internal.C4158lp.f17851a
            goto L_0x058f
        L_0x058e:
            r6 = r4
        L_0x058f:
            r2[r5] = r6
            int r5 = r5 + 1
            goto L_0x0578
        L_0x0594:
            boolean r0 = r15.f14910A
            if (r0 == 0) goto L_0x0602
            r0 = 0
            r4 = -1
            r7 = -1
        L_0x059b:
            int r5 = r45.mo13773a()
            if (r0 >= r5) goto L_0x05ec
            int r15 = r3.mo13774b(r0)
            r5 = r14[r0]
            r6 = 1
            if (r15 == r6) goto L_0x05af
            r6 = 2
            if (r15 != r6) goto L_0x05e8
            r15 = 2
            goto L_0x05b0
        L_0x05af:
            r6 = 2
        L_0x05b0:
            if (r5 == 0) goto L_0x05e8
            r8 = r46[r0]
            com.google.ads.interactivemedia.v3.internal.acq r9 = r3.mo13775c(r0)
            com.google.ads.interactivemedia.v3.internal.aco r10 = r5.mo13737j()
            int r9 = r9.mo13454b(r10)
            r10 = 0
        L_0x05c1:
            int r11 = r5.mo13738k()
            if (r10 >= r11) goto L_0x05d8
            r11 = r8[r9]
            int r12 = r5.mo13740m(r10)
            r11 = r11[r12]
            r12 = 32
            r11 = r11 & r12
            if (r11 == r12) goto L_0x05d5
            goto L_0x05e8
        L_0x05d5:
            int r10 = r10 + 1
            goto L_0x05c1
        L_0x05d8:
            r10 = 1
            if (r15 != r10) goto L_0x05e1
            r5 = -1
            if (r4 == r5) goto L_0x05df
            goto L_0x05e4
        L_0x05df:
            r4 = r0
            goto L_0x05e9
        L_0x05e1:
            r5 = -1
            if (r7 == r5) goto L_0x05e6
        L_0x05e4:
            r0 = 0
            goto L_0x05ee
        L_0x05e6:
            r7 = r0
            goto L_0x05e9
        L_0x05e8:
            r5 = -1
        L_0x05e9:
            int r0 = r0 + 1
            goto L_0x059b
        L_0x05ec:
            r5 = -1
            r0 = 1
        L_0x05ee:
            if (r4 == r5) goto L_0x05f4
            if (r7 == r5) goto L_0x05f4
            r6 = 1
            goto L_0x05f5
        L_0x05f4:
            r6 = 0
        L_0x05f5:
            r0 = r0 & r6
            if (r0 == 0) goto L_0x0602
            com.google.ads.interactivemedia.v3.internal.lp r0 = new com.google.ads.interactivemedia.v3.internal.lp
            r3 = 1
            r0.<init>(r3)
            r2[r4] = r0
            r2[r7] = r0
        L_0x0602:
            android.util.Pair r0 = android.util.Pair.create(r2, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aif.mo13772f(com.google.ads.interactivemedia.v3.internal.aij, int[][][], int[]):android.util.Pair");
    }

    public aif(ahz ahz, aht aht) {
        super((byte[]) null);
        this.f14984f = aht;
        this.f14983e = new AtomicReference<>(ahz);
    }
}
