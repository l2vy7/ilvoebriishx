package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s74 extends w74 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final d83<Integer> f38899f = d83.m31323b(f74.f31662b);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final d83<Integer> f38900g = d83.m31323b(g74.f32182b);

    /* renamed from: h */
    public static final /* synthetic */ int f38901h = 0;

    /* renamed from: d */
    private final AtomicReference<l74> f38902d;

    /* renamed from: e */
    private final b74 f38903e;

    public s74(Context context) {
        b74 b74 = new b74();
        l74 c = l74.m34375c(context);
        this.f38903e = b74;
        this.f38902d = new AtomicReference<>(c);
    }

    /* renamed from: g */
    protected static int m37352g(C8281w wVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(wVar.f40610c)) {
            return 4;
        }
        String k = m37355k(str);
        String k2 = m37355k(wVar.f40610c);
        if (k2 == null || k == null) {
            if (!z || k2 != null) {
                return 0;
            }
            return 1;
        } else if (k2.startsWith(k) || k.startsWith(k2)) {
            return 3;
        } else {
            if (d13.m20274E(k2, "-")[0].equals(d13.m20274E(k, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: k */
    protected static String m37355k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C6540C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    /* renamed from: m */
    protected static boolean m37356m(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: com.google.android.gms.internal.ads.e74[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.google.android.gms.internal.ads.c74} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: com.google.android.gms.internal.ads.u74} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: com.google.android.gms.internal.ads.u74} */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.ads.jx3[], com.google.android.gms.internal.ads.e74[]> mo34677f(com.google.android.gms.internal.ads.v74 r28, int[][][] r29, int[] r30, com.google.android.gms.internal.ads.c54 r31, com.google.android.gms.internal.ads.gi0 r32) throws com.google.android.gms.internal.ads.vk3 {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.l74> r2 = r0.f38902d
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.l74 r2 = (com.google.android.gms.internal.ads.l74) r2
            r3 = 2
            com.google.android.gms.internal.ads.t74[] r4 = new com.google.android.gms.internal.ads.t74[r3]
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0012:
            r11 = 1
            if (r6 >= r3) goto L_0x01cb
            int r12 = r1.mo35379a(r6)
            if (r12 != r3) goto L_0x01bb
            if (r7 != 0) goto L_0x01a6
            com.google.android.gms.internal.ads.cm0 r7 = r1.mo35381c(r6)
            r12 = r29[r6]
            r13 = r30[r6]
            boolean r13 = r2.f32444v
            r13 = 0
        L_0x0028:
            int r14 = r7.f30418a
            if (r13 >= r14) goto L_0x0037
            com.google.android.gms.internal.ads.ck0 r14 = r7.mo30958b(r13)
            r15 = r12[r13]
            int r14 = r14.f30405a
            int r13 = r13 + 1
            goto L_0x0028
        L_0x0037:
            r13 = 0
            r14 = 0
            r15 = -1
            r16 = 0
        L_0x003c:
            int r10 = r7.f30418a
            if (r13 >= r10) goto L_0x0181
            com.google.android.gms.internal.ads.ck0 r10 = r7.mo30958b(r13)
            int r3 = r2.f32431i
            int r5 = r2.f32432j
            boolean r9 = r2.f32433k
            r17 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r10.f30405a
            r7.<init>(r11)
            r0 = 0
        L_0x0054:
            if (r0 > 0) goto L_0x0061
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r7.add(r11)
            int r0 = r0 + 1
            r11 = 1
            goto L_0x0054
        L_0x0061:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r0) goto L_0x012a
            if (r5 != r0) goto L_0x006a
            goto L_0x012a
        L_0x006a:
            r11 = 0
        L_0x006b:
            if (r11 > 0) goto L_0x00fa
            r19 = r8
            com.google.android.gms.internal.ads.w r8 = r10.mo30944b(r11)
            int r1 = r8.f40624q
            if (r1 <= 0) goto L_0x00de
            r20 = r4
            int r4 = r8.f40625r
            if (r4 <= 0) goto L_0x00db
            if (r9 == 0) goto L_0x0099
            if (r1 > r4) goto L_0x0085
            r21 = r9
            r9 = 0
            goto L_0x0088
        L_0x0085:
            r21 = r9
            r9 = 1
        L_0x0088:
            if (r3 > r5) goto L_0x008e
            r22 = r3
            r3 = 0
            goto L_0x0091
        L_0x008e:
            r22 = r3
            r3 = 1
        L_0x0091:
            if (r9 == r3) goto L_0x009d
            r9 = r5
            r23 = r9
            r3 = r22
            goto L_0x00a2
        L_0x0099:
            r22 = r3
            r21 = r9
        L_0x009d:
            r3 = r5
            r23 = r3
            r9 = r22
        L_0x00a2:
            int r5 = r1 * r3
            r24 = r6
            int r6 = r4 * r9
            if (r5 < r6) goto L_0x00b4
            android.graphics.Point r3 = new android.graphics.Point
            int r1 = com.google.android.gms.internal.ads.d13.m20280K(r6, r1)
            r3.<init>(r9, r1)
            goto L_0x00be
        L_0x00b4:
            android.graphics.Point r1 = new android.graphics.Point
            int r4 = com.google.android.gms.internal.ads.d13.m20280K(r5, r4)
            r1.<init>(r4, r3)
            r3 = r1
        L_0x00be:
            int r1 = r8.f40624q
            int r4 = r8.f40625r
            int r5 = r1 * r4
            int r6 = r3.x
            float r6 = (float) r6
            r8 = 1065017672(0x3f7ae148, float:0.98)
            float r6 = r6 * r8
            int r6 = (int) r6
            if (r1 < r6) goto L_0x00e8
            int r1 = r3.y
            float r1 = (float) r1
            float r1 = r1 * r8
            int r1 = (int) r1
            if (r4 < r1) goto L_0x00e8
            if (r5 >= r0) goto L_0x00e8
            r0 = r5
            goto L_0x00e8
        L_0x00db:
            r22 = r3
            goto L_0x00e2
        L_0x00de:
            r22 = r3
            r20 = r4
        L_0x00e2:
            r23 = r5
            r24 = r6
            r21 = r9
        L_0x00e8:
            int r11 = r11 + 1
            r1 = r28
            r8 = r19
            r4 = r20
            r9 = r21
            r3 = r22
            r5 = r23
            r6 = r24
            goto L_0x006b
        L_0x00fa:
            r20 = r4
            r24 = r6
            r19 = r8
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x0130
            int r1 = r7.size()
            r3 = -1
            int r1 = r1 + r3
        L_0x010b:
            if (r1 < 0) goto L_0x0130
            java.lang.Object r4 = r7.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.w r4 = r10.mo30944b(r4)
            int r4 = r4.mo35520a()
            if (r4 == r3) goto L_0x0123
            if (r4 <= r0) goto L_0x0126
        L_0x0123:
            r7.remove(r1)
        L_0x0126:
            int r1 = r1 + -1
            r3 = -1
            goto L_0x010b
        L_0x012a:
            r20 = r4
            r24 = r6
            r19 = r8
        L_0x0130:
            r0 = r12[r13]
            r1 = r16
            r3 = 0
        L_0x0135:
            if (r3 > 0) goto L_0x016d
            com.google.android.gms.internal.ads.w r4 = r10.mo30944b(r3)
            int r5 = r4.f40612e
            r5 = r0[r3]
            boolean r6 = r2.f34939J
            boolean r5 = m37356m(r5, r6)
            if (r5 == 0) goto L_0x016a
            com.google.android.gms.internal.ads.r74 r5 = new com.google.android.gms.internal.ads.r74
            r6 = r0[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r8 = r7.contains(r8)
            r5.<init>(r4, r2, r6, r8)
            boolean r4 = r5.f38564b
            if (r4 != 0) goto L_0x015f
            boolean r4 = r2.f34932C
            if (r4 != 0) goto L_0x015f
            goto L_0x016a
        L_0x015f:
            if (r1 == 0) goto L_0x0167
            int r4 = r5.compareTo(r1)
            if (r4 <= 0) goto L_0x016a
        L_0x0167:
            r15 = r3
            r1 = r5
            r14 = r10
        L_0x016a:
            int r3 = r3 + 1
            goto L_0x0135
        L_0x016d:
            int r13 = r13 + 1
            r0 = r27
            r16 = r1
            r7 = r17
            r8 = r19
            r4 = r20
            r6 = r24
            r3 = 2
            r11 = 1
            r1 = r28
            goto L_0x003c
        L_0x0181:
            r20 = r4
            r24 = r6
            r19 = r8
            if (r14 != 0) goto L_0x018b
            r10 = 0
            goto L_0x0196
        L_0x018b:
            com.google.android.gms.internal.ads.t74 r10 = new com.google.android.gms.internal.ads.t74
            r0 = 1
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r15
            r10.<init>(r14, r1, r0)
        L_0x0196:
            r20[r24] = r10
            if (r10 == 0) goto L_0x01a0
            r0 = r28
            r5 = r24
            r7 = 1
            goto L_0x01ad
        L_0x01a0:
            r0 = r28
            r5 = r24
            r7 = 0
            goto L_0x01ad
        L_0x01a6:
            r20 = r4
            r19 = r8
            r0 = r28
            r5 = r6
        L_0x01ad:
            com.google.android.gms.internal.ads.cm0 r1 = r0.mo35381c(r5)
            int r1 = r1.f30418a
            if (r1 <= 0) goto L_0x01b7
            r11 = 1
            goto L_0x01b8
        L_0x01b7:
            r11 = 0
        L_0x01b8:
            r8 = r19 | r11
            goto L_0x01c1
        L_0x01bb:
            r0 = r1
            r20 = r4
            r5 = r6
            r19 = r8
        L_0x01c1:
            int r6 = r5 + 1
            r1 = r0
            r4 = r20
            r3 = 2
            r0 = r27
            goto L_0x0012
        L_0x01cb:
            r0 = r1
            r20 = r4
            r19 = r8
            r1 = 0
            r3 = -1
            r4 = 0
            r5 = 0
        L_0x01d4:
            r6 = 2
            if (r4 >= r6) goto L_0x02ea
            int r6 = r0.mo35379a(r4)
            r7 = 1
            if (r6 != r7) goto L_0x02e6
            boolean r6 = r2.f34941L
            if (r6 != 0) goto L_0x01e7
            if (r19 != 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r6 = 0
            goto L_0x01e8
        L_0x01e7:
            r6 = 1
        L_0x01e8:
            com.google.android.gms.internal.ads.cm0 r7 = r0.mo35381c(r4)
            r8 = r29[r4]
            r9 = r30[r4]
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
        L_0x01f4:
            int r13 = r7.f30418a
            if (r10 >= r13) goto L_0x023b
            com.google.android.gms.internal.ads.ck0 r13 = r7.mo30958b(r10)
            r14 = r8[r10]
            r16 = r11
            r15 = 0
        L_0x0201:
            int r11 = r13.f30405a
            if (r15 > 0) goto L_0x0234
            r11 = r14[r15]
            r17 = r12
            boolean r12 = r2.f34939J
            boolean r11 = m37356m(r11, r12)
            if (r11 == 0) goto L_0x022b
            com.google.android.gms.internal.ads.w r11 = r13.mo30944b(r15)
            com.google.android.gms.internal.ads.h74 r12 = new com.google.android.gms.internal.ads.h74
            r18 = r13
            r13 = r14[r15]
            r12.<init>(r11, r2, r13)
            if (r9 == 0) goto L_0x0226
            int r11 = r12.compareTo(r9)
            if (r11 <= 0) goto L_0x022d
        L_0x0226:
            r16 = r10
            r9 = r12
            r12 = r15
            goto L_0x022f
        L_0x022b:
            r18 = r13
        L_0x022d:
            r12 = r17
        L_0x022f:
            int r15 = r15 + 1
            r13 = r18
            goto L_0x0201
        L_0x0234:
            r17 = r12
            int r10 = r10 + 1
            r11 = r16
            goto L_0x01f4
        L_0x023b:
            r10 = -1
            if (r11 != r10) goto L_0x0241
            r6 = 0
            goto L_0x02b8
        L_0x0241:
            com.google.android.gms.internal.ads.ck0 r7 = r7.mo30958b(r11)
            if (r6 == 0) goto L_0x02a3
            r6 = r8[r11]
            com.google.android.gms.internal.ads.w r8 = r7.mo30944b(r12)
            r10 = 1
            int[] r11 = new int[r10]
            r10 = 0
            r13 = 0
        L_0x0252:
            if (r10 > 0) goto L_0x0294
            if (r10 == r12) goto L_0x0288
            com.google.android.gms.internal.ads.w r14 = r7.mo30944b(r10)
            r15 = r6[r10]
            r16 = r6
            r6 = 0
            boolean r15 = m37356m(r15, r6)
            if (r15 == 0) goto L_0x028f
            int r6 = r14.f40615h
            r15 = -1
            if (r6 == r15) goto L_0x028f
            int r6 = r14.f40632y
            if (r6 == r15) goto L_0x028f
            int r15 = r8.f40632y
            if (r6 != r15) goto L_0x028f
            java.lang.String r6 = r14.f40619l
            if (r6 == 0) goto L_0x028f
            java.lang.String r15 = r8.f40619l
            boolean r6 = android.text.TextUtils.equals(r6, r15)
            if (r6 == 0) goto L_0x028f
            int r6 = r14.f40633z
            r14 = -1
            if (r6 == r14) goto L_0x028f
            int r14 = r8.f40633z
            if (r6 != r14) goto L_0x028f
            goto L_0x028a
        L_0x0288:
            r16 = r6
        L_0x028a:
            int r6 = r13 + 1
            r11[r13] = r10
            r13 = r6
        L_0x028f:
            int r10 = r10 + 1
            r6 = r16
            goto L_0x0252
        L_0x0294:
            int[] r6 = java.util.Arrays.copyOf(r11, r13)
            int r8 = r6.length
            r10 = 1
            if (r8 <= r10) goto L_0x02a4
            com.google.android.gms.internal.ads.t74 r8 = new com.google.android.gms.internal.ads.t74
            r11 = 0
            r8.<init>(r7, r6, r11)
            goto L_0x02a6
        L_0x02a3:
            r10 = 1
        L_0x02a4:
            r11 = 0
            r8 = 0
        L_0x02a6:
            if (r8 != 0) goto L_0x02b1
            com.google.android.gms.internal.ads.t74 r8 = new com.google.android.gms.internal.ads.t74
            int[] r6 = new int[r10]
            r6[r11] = r12
            r8.<init>(r7, r6, r11)
        L_0x02b1:
            java.util.Objects.requireNonNull(r9)
            android.util.Pair r6 = android.util.Pair.create(r8, r9)
        L_0x02b8:
            if (r6 == 0) goto L_0x02e6
            if (r1 == 0) goto L_0x02c6
            java.lang.Object r7 = r6.second
            com.google.android.gms.internal.ads.h74 r7 = (com.google.android.gms.internal.ads.h74) r7
            int r7 = r7.compareTo(r1)
            if (r7 <= 0) goto L_0x02e6
        L_0x02c6:
            r1 = -1
            if (r3 == r1) goto L_0x02cc
            r1 = 0
            r20[r3] = r1
        L_0x02cc:
            java.lang.Object r1 = r6.first
            com.google.android.gms.internal.ads.t74 r1 = (com.google.android.gms.internal.ads.t74) r1
            r20[r4] = r1
            com.google.android.gms.internal.ads.ck0 r3 = r1.f39319a
            int[] r1 = r1.f39320b
            r5 = 0
            r1 = r1[r5]
            com.google.android.gms.internal.ads.w r1 = r3.mo30944b(r1)
            java.lang.String r1 = r1.f40610c
            java.lang.Object r3 = r6.second
            com.google.android.gms.internal.ads.h74 r3 = (com.google.android.gms.internal.ads.h74) r3
            r5 = r1
            r1 = r3
            r3 = r4
        L_0x02e6:
            int r4 = r4 + 1
            goto L_0x01d4
        L_0x02ea:
            r1 = 0
            r3 = -1
            r4 = 0
        L_0x02ed:
            if (r4 >= r6) goto L_0x03ea
            int r7 = r0.mo35379a(r4)
            r8 = 1
            if (r7 == r8) goto L_0x03e4
            if (r7 == r6) goto L_0x03e4
            r6 = 3
            if (r7 == r6) goto L_0x035c
            com.google.android.gms.internal.ads.cm0 r6 = r0.mo35381c(r4)
            r7 = r29[r4]
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0305:
            int r12 = r6.f30418a
            if (r10 >= r12) goto L_0x0349
            com.google.android.gms.internal.ads.ck0 r12 = r6.mo30958b(r10)
            r13 = r7[r10]
            r14 = 0
        L_0x0310:
            int r15 = r12.f30405a
            if (r14 > 0) goto L_0x0342
            r15 = r13[r14]
            r30 = r6
            boolean r6 = r2.f34939J
            boolean r6 = m37356m(r15, r6)
            if (r6 == 0) goto L_0x0339
            com.google.android.gms.internal.ads.w r6 = r12.mo30944b(r14)
            com.google.android.gms.internal.ads.i74 r15 = new com.google.android.gms.internal.ads.i74
            r16 = r7
            r7 = r13[r14]
            r15.<init>(r6, r7)
            if (r9 == 0) goto L_0x0335
            int r6 = r15.compareTo(r9)
            if (r6 <= 0) goto L_0x033b
        L_0x0335:
            r8 = r12
            r11 = r14
            r9 = r15
            goto L_0x033b
        L_0x0339:
            r16 = r7
        L_0x033b:
            int r14 = r14 + 1
            r6 = r30
            r7 = r16
            goto L_0x0310
        L_0x0342:
            r30 = r6
            r16 = r7
            int r10 = r10 + 1
            goto L_0x0305
        L_0x0349:
            if (r8 != 0) goto L_0x034d
            r6 = 0
            goto L_0x0358
        L_0x034d:
            com.google.android.gms.internal.ads.t74 r6 = new com.google.android.gms.internal.ads.t74
            r7 = 1
            int[] r9 = new int[r7]
            r7 = 0
            r9[r7] = r11
            r6.<init>(r8, r9, r7)
        L_0x0358:
            r20[r4] = r6
            goto L_0x03e4
        L_0x035c:
            com.google.android.gms.internal.ads.cm0 r6 = r0.mo35381c(r4)
            r7 = r29[r4]
            r8 = 0
            r9 = 0
            r10 = -1
            r11 = 0
        L_0x0366:
            int r12 = r6.f30418a
            if (r11 >= r12) goto L_0x03ae
            com.google.android.gms.internal.ads.ck0 r12 = r6.mo30958b(r11)
            r13 = r7[r11]
            r14 = 0
        L_0x0371:
            int r15 = r12.f30405a
            if (r14 > 0) goto L_0x03a7
            r15 = r13[r14]
            r30 = r6
            boolean r6 = r2.f34939J
            boolean r6 = m37356m(r15, r6)
            if (r6 == 0) goto L_0x039e
            com.google.android.gms.internal.ads.w r6 = r12.mo30944b(r14)
            com.google.android.gms.internal.ads.q74 r15 = new com.google.android.gms.internal.ads.q74
            r16 = r7
            r7 = r13[r14]
            r15.<init>(r6, r2, r7, r5)
            boolean r6 = r15.f37924b
            if (r6 == 0) goto L_0x03a0
            if (r9 == 0) goto L_0x039a
            int r6 = r15.compareTo(r9)
            if (r6 <= 0) goto L_0x03a0
        L_0x039a:
            r8 = r12
            r10 = r14
            r9 = r15
            goto L_0x03a0
        L_0x039e:
            r16 = r7
        L_0x03a0:
            int r14 = r14 + 1
            r6 = r30
            r7 = r16
            goto L_0x0371
        L_0x03a7:
            r30 = r6
            r16 = r7
            int r11 = r11 + 1
            goto L_0x0366
        L_0x03ae:
            if (r8 != 0) goto L_0x03b2
            r6 = 0
            goto L_0x03c4
        L_0x03b2:
            com.google.android.gms.internal.ads.t74 r6 = new com.google.android.gms.internal.ads.t74
            r7 = 1
            int[] r11 = new int[r7]
            r7 = 0
            r11[r7] = r10
            r6.<init>(r8, r11, r7)
            java.util.Objects.requireNonNull(r9)
            android.util.Pair r6 = android.util.Pair.create(r6, r9)
        L_0x03c4:
            if (r6 == 0) goto L_0x03e4
            if (r1 == 0) goto L_0x03d2
            java.lang.Object r7 = r6.second
            com.google.android.gms.internal.ads.q74 r7 = (com.google.android.gms.internal.ads.q74) r7
            int r7 = r7.compareTo(r1)
            if (r7 <= 0) goto L_0x03e4
        L_0x03d2:
            r7 = -1
            if (r3 == r7) goto L_0x03d8
            r1 = 0
            r20[r3] = r1
        L_0x03d8:
            java.lang.Object r1 = r6.first
            com.google.android.gms.internal.ads.t74 r1 = (com.google.android.gms.internal.ads.t74) r1
            r20[r4] = r1
            java.lang.Object r1 = r6.second
            com.google.android.gms.internal.ads.q74 r1 = (com.google.android.gms.internal.ads.q74) r1
            r3 = r4
            goto L_0x03e5
        L_0x03e4:
            r7 = -1
        L_0x03e5:
            int r4 = r4 + 1
            r6 = 2
            goto L_0x02ed
        L_0x03ea:
            r1 = 0
        L_0x03eb:
            r3 = 2
            if (r1 >= r3) goto L_0x0467
            r3 = r20[r1]
            int r4 = r0.mo35379a(r1)
            boolean r5 = r2.mo33288f(r1)
            if (r5 != 0) goto L_0x0460
            com.google.android.gms.internal.ads.a73<java.lang.Integer> r5 = r2.f32446x
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x0409
        L_0x0406:
            r3 = 0
            r6 = 0
            goto L_0x0462
        L_0x0409:
            com.google.android.gms.internal.ads.cm0 r4 = r0.mo35381c(r1)
            boolean r5 = r2.mo33289g(r1, r4)
            if (r5 == 0) goto L_0x0426
            com.google.android.gms.internal.ads.p74 r3 = r2.mo33287e(r1, r4)
            if (r3 != 0) goto L_0x041a
            goto L_0x0406
        L_0x041a:
            com.google.android.gms.internal.ads.t74 r3 = new com.google.android.gms.internal.ads.t74
            r5 = 0
            com.google.android.gms.internal.ads.ck0 r4 = r4.mo30958b(r5)
            r6 = 0
            r3.<init>(r4, r6, r5)
            goto L_0x0462
        L_0x0426:
            r6 = 0
            r5 = 0
        L_0x0428:
            int r7 = r4.f30418a
            if (r5 >= r7) goto L_0x0462
            com.google.android.gms.internal.ads.ck0 r7 = r4.mo30958b(r5)
            com.google.android.gms.internal.ads.t63<com.google.android.gms.internal.ads.ck0, com.google.android.gms.internal.ads.fr0> r8 = r2.f32445w
            java.lang.Object r8 = r8.get(r7)
            com.google.android.gms.internal.ads.fr0 r8 = (com.google.android.gms.internal.ads.fr0) r8
            if (r8 == 0) goto L_0x045d
            com.google.android.gms.internal.ads.t74 r3 = new com.google.android.gms.internal.ads.t74
            com.google.android.gms.internal.ads.a73<java.lang.Integer> r4 = r8.f31846a
            java.lang.Object[] r4 = r4.toArray()
            int r5 = r4.length
            int[] r8 = new int[r5]
            r9 = 0
        L_0x0446:
            if (r9 >= r5) goto L_0x0458
            r10 = r4[r9]
            java.util.Objects.requireNonNull(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0446
        L_0x0458:
            r9 = 0
            r3.<init>(r7, r8, r9)
            goto L_0x0462
        L_0x045d:
            int r5 = r5 + 1
            goto L_0x0428
        L_0x0460:
            r6 = 0
            r3 = r6
        L_0x0462:
            r20[r1] = r3
            int r1 = r1 + 1
            goto L_0x03eb
        L_0x0467:
            r1 = r27
            r6 = 0
            com.google.android.gms.internal.ads.b74 r3 = r1.f38903e
            com.google.android.gms.internal.ads.i84 r4 = r27.mo35884c()
            com.google.android.gms.internal.ads.p63 r5 = com.google.android.gms.internal.ads.c74.m30911e(r20)
            r7 = 2
            com.google.android.gms.internal.ads.e74[] r13 = new com.google.android.gms.internal.ads.e74[r7]
            r14 = 0
        L_0x0478:
            if (r14 >= r7) goto L_0x04b9
            r7 = r20[r14]
            if (r7 == 0) goto L_0x04b2
            int[] r9 = r7.f39320b
            int r8 = r9.length
            if (r8 != 0) goto L_0x0484
            goto L_0x04b2
        L_0x0484:
            r15 = 1
            if (r8 != r15) goto L_0x049d
            com.google.android.gms.internal.ads.u74 r8 = new com.google.android.gms.internal.ads.u74
            com.google.android.gms.internal.ads.ck0 r7 = r7.f39319a
            r16 = 0
            r23 = r9[r16]
            r24 = 0
            r25 = 0
            r26 = 0
            r21 = r8
            r22 = r7
            r21.<init>(r22, r23, r24, r25, r26)
            goto L_0x04af
        L_0x049d:
            r16 = 0
            com.google.android.gms.internal.ads.ck0 r8 = r7.f39319a
            r10 = 0
            java.lang.Object r7 = r5.get(r14)
            r12 = r7
            com.google.android.gms.internal.ads.p63 r12 = (com.google.android.gms.internal.ads.p63) r12
            r7 = r3
            r11 = r4
            com.google.android.gms.internal.ads.c74 r8 = r7.mo30635a(r8, r9, r10, r11, r12)
        L_0x04af:
            r13[r14] = r8
            goto L_0x04b5
        L_0x04b2:
            r15 = 1
            r16 = 0
        L_0x04b5:
            int r14 = r14 + 1
            r7 = 2
            goto L_0x0478
        L_0x04b9:
            r16 = 0
            com.google.android.gms.internal.ads.jx3[] r3 = new com.google.android.gms.internal.ads.jx3[r7]
            r5 = 0
        L_0x04be:
            if (r5 >= r7) goto L_0x04eb
            int r4 = r0.mo35379a(r5)
            boolean r8 = r2.mo33288f(r5)
            if (r8 != 0) goto L_0x04e5
            com.google.android.gms.internal.ads.a73<java.lang.Integer> r8 = r2.f32446x
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x04d7
            goto L_0x04e5
        L_0x04d7:
            int r4 = r0.mo35379a(r5)
            r8 = -2
            if (r4 == r8) goto L_0x04e2
            r4 = r13[r5]
            if (r4 == 0) goto L_0x04e5
        L_0x04e2:
            com.google.android.gms.internal.ads.jx3 r4 = com.google.android.gms.internal.ads.jx3.f34072a
            goto L_0x04e6
        L_0x04e5:
            r4 = r6
        L_0x04e6:
            r3[r5] = r4
            int r5 = r5 + 1
            goto L_0x04be
        L_0x04eb:
            boolean r0 = r2.f34940K
            android.util.Pair r0 = android.util.Pair.create(r3, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s74.mo34677f(com.google.android.gms.internal.ads.v74, int[][][], int[], com.google.android.gms.internal.ads.c54, com.google.android.gms.internal.ads.gi0):android.util.Pair");
    }

    /* renamed from: h */
    public final l74 mo34678h() {
        return this.f38902d.get();
    }

    /* renamed from: l */
    public final void mo34679l(n74 n74) {
        l74 l74 = new l74(n74);
        if (!this.f38902d.getAndSet(l74).equals(l74)) {
            mo35886e();
        }
    }
}
