package p166w;

import p161v.C6213d;

/* renamed from: w.b */
/* compiled from: Chain */
class C6241b {
    /* renamed from: a */
    static void m27344a(C6249f fVar, C6213d dVar, int i) {
        C6242c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            int i4 = fVar.f25827Q0;
            cVarArr = fVar.f25830T0;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            i2 = fVar.f25828R0;
            cVarArr = fVar.f25829S0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C6242c cVar = cVarArr[i5];
            cVar.mo23765a();
            m27345b(fVar, dVar, i, i3, cVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: w.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: v.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: v.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: w.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: v.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: w.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: v.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: w.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: w.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: v.i} */
    /* JADX WARNING: type inference failed for: r5v10, types: [v.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r8 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r8 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04cd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0507 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x039b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:317:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m27345b(p166w.C6249f r37, p161v.C6213d r38, int r39, int r40, p166w.C6242c r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            w.e r10 = r1.f25687a
            w.e r11 = r1.f25689c
            w.e r12 = r1.f25688b
            w.e r13 = r1.f25690d
            w.e r2 = r1.f25691e
            float r3 = r1.f25697k
            w.e$b[] r4 = r0.f25747O
            r4 = r4[r39]
            w.e$b r5 = p166w.C6246e.C6248b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r39 != 0) goto L_0x0030
            int r8 = r2.f25804w0
            if (r8 != 0) goto L_0x0027
            r14 = 1
            goto L_0x0028
        L_0x0027:
            r14 = 0
        L_0x0028:
            if (r8 != r7) goto L_0x002c
            r15 = 1
            goto L_0x002d
        L_0x002c:
            r15 = 0
        L_0x002d:
            if (r8 != r5) goto L_0x0040
            goto L_0x003e
        L_0x0030:
            int r8 = r2.f25806x0
            if (r8 != 0) goto L_0x0036
            r14 = 1
            goto L_0x0037
        L_0x0036:
            r14 = 0
        L_0x0037:
            if (r8 != r7) goto L_0x003b
            r15 = 1
            goto L_0x003c
        L_0x003b:
            r15 = 0
        L_0x003c:
            if (r8 != r5) goto L_0x0040
        L_0x003e:
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            r7 = r10
            r8 = 0
        L_0x0043:
            r21 = 0
            if (r8 != 0) goto L_0x0127
            w.d[] r6 = r7.f25744L
            r6 = r6[r40]
            if (r5 == 0) goto L_0x0050
            r19 = 1
            goto L_0x0052
        L_0x0050:
            r19 = 4
        L_0x0052:
            int r22 = r6.mo23768c()
            r23 = r3
            w.e$b[] r3 = r7.f25747O
            r3 = r3[r39]
            r24 = r8
            w.e$b r8 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x006c
            int[] r3 = r7.f25785n
            r3 = r3[r39]
            if (r3 != 0) goto L_0x006c
            r25 = r15
            r3 = 1
            goto L_0x006f
        L_0x006c:
            r25 = r15
            r3 = 0
        L_0x006f:
            w.d r15 = r6.f25712d
            if (r15 == 0) goto L_0x007b
            if (r7 == r10) goto L_0x007b
            int r15 = r15.mo23768c()
            int r22 = r22 + r15
        L_0x007b:
            r15 = r22
            if (r5 == 0) goto L_0x0088
            if (r7 == r10) goto L_0x0088
            if (r7 == r12) goto L_0x0088
            r22 = r14
            r19 = 5
            goto L_0x008a
        L_0x0088:
            r22 = r14
        L_0x008a:
            w.d r14 = r6.f25712d
            if (r14 == 0) goto L_0x00bc
            if (r7 != r12) goto L_0x009d
            r26 = r2
            v.i r2 = r6.f25715g
            v.i r14 = r14.f25715g
            r27 = r10
            r10 = 6
            r9.mo23702h(r2, r14, r15, r10)
            goto L_0x00aa
        L_0x009d:
            r26 = r2
            r27 = r10
            v.i r2 = r6.f25715g
            v.i r10 = r14.f25715g
            r14 = 8
            r9.mo23702h(r2, r10, r15, r14)
        L_0x00aa:
            if (r3 == 0) goto L_0x00b0
            if (r5 != 0) goto L_0x00b0
            r2 = 5
            goto L_0x00b2
        L_0x00b0:
            r2 = r19
        L_0x00b2:
            v.i r3 = r6.f25715g
            w.d r6 = r6.f25712d
            v.i r6 = r6.f25715g
            r9.mo23699e(r3, r6, r15, r2)
            goto L_0x00c0
        L_0x00bc:
            r26 = r2
            r27 = r10
        L_0x00c0:
            if (r4 == 0) goto L_0x00f4
            int r2 = r7.mo23807P()
            r3 = 8
            if (r2 == r3) goto L_0x00e2
            w.e$b[] r2 = r7.f25747O
            r2 = r2[r39]
            if (r2 != r8) goto L_0x00e2
            w.d[] r2 = r7.f25744L
            int r3 = r40 + 1
            r3 = r2[r3]
            v.i r3 = r3.f25715g
            r2 = r2[r40]
            v.i r2 = r2.f25715g
            r6 = 5
            r8 = 0
            r9.mo23702h(r3, r2, r8, r6)
            goto L_0x00e3
        L_0x00e2:
            r8 = 0
        L_0x00e3:
            w.d[] r2 = r7.f25744L
            r2 = r2[r40]
            v.i r2 = r2.f25715g
            w.d[] r3 = r0.f25744L
            r3 = r3[r40]
            v.i r3 = r3.f25715g
            r6 = 8
            r9.mo23702h(r2, r3, r8, r6)
        L_0x00f4:
            w.d[] r2 = r7.f25744L
            int r3 = r40 + 1
            r2 = r2[r3]
            w.d r2 = r2.f25712d
            if (r2 == 0) goto L_0x0113
            w.e r2 = r2.f25710b
            w.d[] r3 = r2.f25744L
            r6 = r3[r40]
            w.d r6 = r6.f25712d
            if (r6 == 0) goto L_0x0113
            r3 = r3[r40]
            w.d r3 = r3.f25712d
            w.e r3 = r3.f25710b
            if (r3 == r7) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r21 = r2
        L_0x0113:
            if (r21 == 0) goto L_0x011a
            r7 = r21
            r8 = r24
            goto L_0x011b
        L_0x011a:
            r8 = 1
        L_0x011b:
            r14 = r22
            r3 = r23
            r15 = r25
            r2 = r26
            r10 = r27
            goto L_0x0043
        L_0x0127:
            r26 = r2
            r23 = r3
            r27 = r10
            r22 = r14
            r25 = r15
            if (r13 == 0) goto L_0x0194
            w.d[] r2 = r11.f25744L
            int r3 = r40 + 1
            r2 = r2[r3]
            w.d r2 = r2.f25712d
            if (r2 == 0) goto L_0x0194
            w.d[] r2 = r13.f25744L
            r2 = r2[r3]
            w.e$b[] r6 = r13.f25747O
            r6 = r6[r39]
            w.e$b r7 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0151
            int[] r6 = r13.f25785n
            r6 = r6[r39]
            if (r6 != 0) goto L_0x0151
            r6 = 1
            goto L_0x0152
        L_0x0151:
            r6 = 0
        L_0x0152:
            if (r6 == 0) goto L_0x016a
            if (r5 != 0) goto L_0x016a
            w.d r6 = r2.f25712d
            w.e r7 = r6.f25710b
            if (r7 != r0) goto L_0x016a
            v.i r7 = r2.f25715g
            v.i r6 = r6.f25715g
            int r8 = r2.mo23768c()
            int r8 = -r8
            r10 = 5
            r9.mo23699e(r7, r6, r8, r10)
            goto L_0x0180
        L_0x016a:
            r10 = 5
            if (r5 == 0) goto L_0x0180
            w.d r6 = r2.f25712d
            w.e r7 = r6.f25710b
            if (r7 != r0) goto L_0x0180
            v.i r7 = r2.f25715g
            v.i r6 = r6.f25715g
            int r8 = r2.mo23768c()
            int r8 = -r8
            r14 = 4
            r9.mo23699e(r7, r6, r8, r14)
        L_0x0180:
            v.i r6 = r2.f25715g
            w.d[] r7 = r11.f25744L
            r3 = r7[r3]
            w.d r3 = r3.f25712d
            v.i r3 = r3.f25715g
            int r2 = r2.mo23768c()
            int r2 = -r2
            r7 = 6
            r9.mo23704j(r6, r3, r2, r7)
            goto L_0x0195
        L_0x0194:
            r10 = 5
        L_0x0195:
            if (r4 == 0) goto L_0x01b0
            w.d[] r0 = r0.f25744L
            int r2 = r40 + 1
            r0 = r0[r2]
            v.i r0 = r0.f25715g
            w.d[] r3 = r11.f25744L
            r4 = r3[r2]
            v.i r4 = r4.f25715g
            r2 = r3[r2]
            int r2 = r2.mo23768c()
            r3 = 8
            r9.mo23702h(r0, r4, r2, r3)
        L_0x01b0:
            java.util.ArrayList<w.e> r0 = r1.f25694h
            if (r0 == 0) goto L_0x0256
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0256
            boolean r4 = r1.f25704r
            if (r4 == 0) goto L_0x01c7
            boolean r4 = r1.f25706t
            if (r4 != 0) goto L_0x01c7
            int r4 = r1.f25696j
            float r4 = (float) r4
            goto L_0x01c9
        L_0x01c7:
            r4 = r23
        L_0x01c9:
            r6 = 0
            r7 = r21
            r8 = 0
            r29 = 0
        L_0x01cf:
            if (r8 >= r2) goto L_0x0256
            java.lang.Object r14 = r0.get(r8)
            w.e r14 = (p166w.C6246e) r14
            float[] r15 = r14.f25729A0
            r15 = r15[r39]
            int r16 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x01fa
            boolean r15 = r1.f25706t
            if (r15 == 0) goto L_0x01f6
            w.d[] r14 = r14.f25744L
            int r15 = r40 + 1
            r15 = r14[r15]
            v.i r15 = r15.f25715g
            r14 = r14[r40]
            v.i r14 = r14.f25715g
            r3 = 0
            r10 = 4
            r9.mo23699e(r15, r14, r3, r10)
            r6 = 0
            goto L_0x0211
        L_0x01f6:
            r10 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01fb
        L_0x01fa:
            r10 = 4
        L_0x01fb:
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0214
            w.d[] r3 = r14.f25744L
            int r14 = r40 + 1
            r14 = r3[r14]
            v.i r14 = r14.f25715g
            r3 = r3[r40]
            v.i r3 = r3.f25715g
            r6 = 0
            r15 = 8
            r9.mo23699e(r14, r3, r6, r15)
        L_0x0211:
            r17 = r0
            goto L_0x024d
        L_0x0214:
            r6 = 0
            if (r7 == 0) goto L_0x0248
            w.d[] r3 = r7.f25744L
            r7 = r3[r40]
            v.i r7 = r7.f25715g
            int r17 = r40 + 1
            r3 = r3[r17]
            v.i r3 = r3.f25715g
            w.d[] r6 = r14.f25744L
            r10 = r6[r40]
            v.i r10 = r10.f25715g
            r6 = r6[r17]
            v.i r6 = r6.f25715g
            r17 = r0
            v.b r0 = r38.mo23710r()
            r28 = r0
            r30 = r4
            r31 = r15
            r32 = r7
            r33 = r3
            r34 = r10
            r35 = r6
            r28.mo23680l(r29, r30, r31, r32, r33, r34, r35)
            r9.mo23698d(r0)
            goto L_0x024a
        L_0x0248:
            r17 = r0
        L_0x024a:
            r7 = r14
            r29 = r15
        L_0x024d:
            int r8 = r8 + 1
            r0 = r17
            r3 = 1
            r6 = 0
            r10 = 5
            goto L_0x01cf
        L_0x0256:
            if (r12 == 0) goto L_0x02ad
            if (r12 == r13) goto L_0x025c
            if (r5 == 0) goto L_0x02ad
        L_0x025c:
            r10 = r27
            w.d[] r0 = r10.f25744L
            r0 = r0[r40]
            w.d[] r1 = r11.f25744L
            int r2 = r40 + 1
            r1 = r1[r2]
            w.d r0 = r0.f25712d
            if (r0 == 0) goto L_0x0270
            v.i r0 = r0.f25715g
            r3 = r0
            goto L_0x0272
        L_0x0270:
            r3 = r21
        L_0x0272:
            w.d r0 = r1.f25712d
            if (r0 == 0) goto L_0x027a
            v.i r0 = r0.f25715g
            r5 = r0
            goto L_0x027c
        L_0x027a:
            r5 = r21
        L_0x027c:
            w.d[] r0 = r12.f25744L
            r0 = r0[r40]
            w.d[] r1 = r13.f25744L
            r1 = r1[r2]
            if (r3 == 0) goto L_0x04cb
            if (r5 == 0) goto L_0x04cb
            if (r39 != 0) goto L_0x028f
            r2 = r26
            float r2 = r2.f25766d0
            goto L_0x0293
        L_0x028f:
            r2 = r26
            float r2 = r2.f25768e0
        L_0x0293:
            r4 = r2
            int r6 = r0.mo23768c()
            int r7 = r1.mo23768c()
            v.i r2 = r0.f25715g
            v.i r8 = r1.f25715g
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo23697c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04cb
        L_0x02ad:
            r10 = r27
            if (r22 == 0) goto L_0x039f
            if (r12 == 0) goto L_0x039f
            int r0 = r1.f25696j
            if (r0 <= 0) goto L_0x02be
            int r1 = r1.f25695i
            if (r1 != r0) goto L_0x02be
            r16 = 1
            goto L_0x02c0
        L_0x02be:
            r16 = 0
        L_0x02c0:
            r14 = r12
            r15 = r14
        L_0x02c2:
            if (r14 == 0) goto L_0x04cb
            w.e[] r0 = r14.f25733C0
            r0 = r0[r39]
            r8 = r0
        L_0x02c9:
            if (r8 == 0) goto L_0x02d8
            int r0 = r8.mo23807P()
            r6 = 8
            if (r0 != r6) goto L_0x02da
            w.e[] r0 = r8.f25733C0
            r8 = r0[r39]
            goto L_0x02c9
        L_0x02d8:
            r6 = 8
        L_0x02da:
            if (r8 != 0) goto L_0x02e3
            if (r14 != r13) goto L_0x02df
            goto L_0x02e3
        L_0x02df:
            r17 = r8
            goto L_0x0392
        L_0x02e3:
            w.d[] r0 = r14.f25744L
            r0 = r0[r40]
            v.i r1 = r0.f25715g
            w.d r2 = r0.f25712d
            if (r2 == 0) goto L_0x02f0
            v.i r2 = r2.f25715g
            goto L_0x02f2
        L_0x02f0:
            r2 = r21
        L_0x02f2:
            if (r15 == r14) goto L_0x02fd
            w.d[] r2 = r15.f25744L
            int r3 = r40 + 1
            r2 = r2[r3]
            v.i r2 = r2.f25715g
            goto L_0x0312
        L_0x02fd:
            if (r14 != r12) goto L_0x0312
            if (r15 != r14) goto L_0x0312
            w.d[] r2 = r10.f25744L
            r3 = r2[r40]
            w.d r3 = r3.f25712d
            if (r3 == 0) goto L_0x0310
            r2 = r2[r40]
            w.d r2 = r2.f25712d
            v.i r2 = r2.f25715g
            goto L_0x0312
        L_0x0310:
            r2 = r21
        L_0x0312:
            int r0 = r0.mo23768c()
            w.d[] r3 = r14.f25744L
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.mo23768c()
            if (r8 == 0) goto L_0x0334
            w.d[] r5 = r8.f25744L
            r5 = r5[r40]
            v.i r7 = r5.f25715g
            w.d[] r6 = r14.f25744L
            r6 = r6[r4]
            v.i r6 = r6.f25715g
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x0347
        L_0x0334:
            w.d[] r5 = r11.f25744L
            r5 = r5[r4]
            w.d r5 = r5.f25712d
            if (r5 == 0) goto L_0x033f
            v.i r6 = r5.f25715g
            goto L_0x0341
        L_0x033f:
            r6 = r21
        L_0x0341:
            w.d[] r7 = r14.f25744L
            r7 = r7[r4]
            v.i r7 = r7.f25715g
        L_0x0347:
            if (r5 == 0) goto L_0x034e
            int r5 = r5.mo23768c()
            int r3 = r3 + r5
        L_0x034e:
            if (r15 == 0) goto L_0x0359
            w.d[] r5 = r15.f25744L
            r5 = r5[r4]
            int r5 = r5.mo23768c()
            int r0 = r0 + r5
        L_0x0359:
            if (r1 == 0) goto L_0x02df
            if (r2 == 0) goto L_0x02df
            if (r6 == 0) goto L_0x02df
            if (r7 == 0) goto L_0x02df
            if (r14 != r12) goto L_0x036b
            w.d[] r0 = r12.f25744L
            r0 = r0[r40]
            int r0 = r0.mo23768c()
        L_0x036b:
            r5 = r0
            if (r14 != r13) goto L_0x0379
            w.d[] r0 = r13.f25744L
            r0 = r0[r4]
            int r0 = r0.mo23768c()
            r17 = r0
            goto L_0x037b
        L_0x0379:
            r17 = r3
        L_0x037b:
            if (r16 == 0) goto L_0x0380
            r18 = 8
            goto L_0x0382
        L_0x0380:
            r18 = 5
        L_0x0382:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r18
            r0.mo23697c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0392:
            int r0 = r14.mo23807P()
            r8 = 8
            if (r0 == r8) goto L_0x039b
            r15 = r14
        L_0x039b:
            r14 = r17
            goto L_0x02c2
        L_0x039f:
            r8 = 8
            if (r25 == 0) goto L_0x04cb
            if (r12 == 0) goto L_0x04cb
            int r0 = r1.f25696j
            if (r0 <= 0) goto L_0x03b0
            int r1 = r1.f25695i
            if (r1 != r0) goto L_0x03b0
            r16 = 1
            goto L_0x03b2
        L_0x03b0:
            r16 = 0
        L_0x03b2:
            r14 = r12
            r15 = r14
        L_0x03b4:
            if (r14 == 0) goto L_0x046d
            w.e[] r0 = r14.f25733C0
            r0 = r0[r39]
        L_0x03ba:
            if (r0 == 0) goto L_0x03c7
            int r1 = r0.mo23807P()
            if (r1 != r8) goto L_0x03c7
            w.e[] r0 = r0.f25733C0
            r0 = r0[r39]
            goto L_0x03ba
        L_0x03c7:
            if (r14 == r12) goto L_0x0458
            if (r14 == r13) goto L_0x0458
            if (r0 == 0) goto L_0x0458
            if (r0 != r13) goto L_0x03d2
            r7 = r21
            goto L_0x03d3
        L_0x03d2:
            r7 = r0
        L_0x03d3:
            w.d[] r0 = r14.f25744L
            r0 = r0[r40]
            v.i r1 = r0.f25715g
            w.d r2 = r0.f25712d
            if (r2 == 0) goto L_0x03df
            v.i r2 = r2.f25715g
        L_0x03df:
            w.d[] r2 = r15.f25744L
            int r3 = r40 + 1
            r2 = r2[r3]
            v.i r2 = r2.f25715g
            int r0 = r0.mo23768c()
            w.d[] r4 = r14.f25744L
            r4 = r4[r3]
            int r4 = r4.mo23768c()
            if (r7 == 0) goto L_0x0405
            w.d[] r5 = r7.f25744L
            r5 = r5[r40]
            v.i r6 = r5.f25715g
            w.d r8 = r5.f25712d
            if (r8 == 0) goto L_0x0402
            v.i r8 = r8.f25715g
            goto L_0x0416
        L_0x0402:
            r8 = r21
            goto L_0x0416
        L_0x0405:
            w.d[] r5 = r13.f25744L
            r5 = r5[r40]
            if (r5 == 0) goto L_0x040e
            v.i r6 = r5.f25715g
            goto L_0x0410
        L_0x040e:
            r6 = r21
        L_0x0410:
            w.d[] r8 = r14.f25744L
            r8 = r8[r3]
            v.i r8 = r8.f25715g
        L_0x0416:
            if (r5 == 0) goto L_0x041d
            int r5 = r5.mo23768c()
            int r4 = r4 + r5
        L_0x041d:
            r17 = r4
            w.d[] r4 = r15.f25744L
            r3 = r4[r3]
            int r3 = r3.mo23768c()
            int r3 = r3 + r0
            if (r16 == 0) goto L_0x042d
            r18 = 8
            goto L_0x042f
        L_0x042d:
            r18 = 4
        L_0x042f:
            if (r1 == 0) goto L_0x044d
            if (r2 == 0) goto L_0x044d
            if (r6 == 0) goto L_0x044d
            if (r8 == 0) goto L_0x044d
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r19 = 4
            r6 = r8
            r20 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r18
            r0.mo23697c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0455
        L_0x044d:
            r20 = r7
            r17 = r15
            r15 = 8
            r19 = 4
        L_0x0455:
            r0 = r20
            goto L_0x045e
        L_0x0458:
            r17 = r15
            r15 = 8
            r19 = 4
        L_0x045e:
            int r1 = r14.mo23807P()
            if (r1 == r15) goto L_0x0465
            goto L_0x0467
        L_0x0465:
            r14 = r17
        L_0x0467:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x03b4
        L_0x046d:
            w.d[] r0 = r12.f25744L
            r0 = r0[r40]
            w.d[] r1 = r10.f25744L
            r1 = r1[r40]
            w.d r1 = r1.f25712d
            w.d[] r2 = r13.f25744L
            int r3 = r40 + 1
            r10 = r2[r3]
            w.d[] r2 = r11.f25744L
            r2 = r2[r3]
            w.d r14 = r2.f25712d
            if (r1 == 0) goto L_0x04ba
            if (r12 == r13) goto L_0x0494
            v.i r2 = r0.f25715g
            v.i r1 = r1.f25715g
            int r0 = r0.mo23768c()
            r15 = 5
            r9.mo23699e(r2, r1, r0, r15)
            goto L_0x04bb
        L_0x0494:
            r15 = 5
            if (r14 == 0) goto L_0x04bb
            v.i r2 = r0.f25715g
            v.i r3 = r1.f25715g
            int r4 = r0.mo23768c()
            r5 = 1056964608(0x3f000000, float:0.5)
            v.i r6 = r10.f25715g
            v.i r7 = r14.f25715g
            int r8 = r10.mo23768c()
            r16 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.mo23697c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04bb
        L_0x04ba:
            r15 = 5
        L_0x04bb:
            if (r14 == 0) goto L_0x04cb
            if (r12 == r13) goto L_0x04cb
            v.i r0 = r10.f25715g
            v.i r1 = r14.f25715g
            int r2 = r10.mo23768c()
            int r2 = -r2
            r9.mo23699e(r0, r1, r2, r15)
        L_0x04cb:
            if (r22 != 0) goto L_0x04cf
            if (r25 == 0) goto L_0x0527
        L_0x04cf:
            if (r12 == 0) goto L_0x0527
            if (r12 == r13) goto L_0x0527
            w.d[] r0 = r12.f25744L
            r1 = r0[r40]
            w.d[] r2 = r13.f25744L
            int r3 = r40 + 1
            r2 = r2[r3]
            w.d r4 = r1.f25712d
            if (r4 == 0) goto L_0x04e4
            v.i r4 = r4.f25715g
            goto L_0x04e6
        L_0x04e4:
            r4 = r21
        L_0x04e6:
            w.d r5 = r2.f25712d
            if (r5 == 0) goto L_0x04ed
            v.i r5 = r5.f25715g
            goto L_0x04ef
        L_0x04ed:
            r5 = r21
        L_0x04ef:
            if (r11 == r13) goto L_0x04ff
            w.d[] r5 = r11.f25744L
            r5 = r5[r3]
            w.d r5 = r5.f25712d
            if (r5 == 0) goto L_0x04fd
            v.i r5 = r5.f25715g
            r21 = r5
        L_0x04fd:
            r5 = r21
        L_0x04ff:
            if (r12 != r13) goto L_0x0505
            r1 = r0[r40]
            r2 = r0[r3]
        L_0x0505:
            if (r4 == 0) goto L_0x0527
            if (r5 == 0) goto L_0x0527
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.mo23768c()
            w.d[] r0 = r13.f25744L
            r0 = r0[r3]
            int r8 = r0.mo23768c()
            v.i r1 = r1.f25715g
            v.i r10 = r2.f25715g
            r11 = 5
            r0 = r38
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.mo23697c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0527:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p166w.C6241b.m27345b(w.f, v.d, int, int, w.c):void");
    }
}
