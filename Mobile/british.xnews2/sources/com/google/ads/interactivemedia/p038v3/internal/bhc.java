package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.Field;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhc */
/* compiled from: IMASDK */
public final class bhc implements bfj {

    /* renamed from: a */
    private final bfv f16338a;

    /* renamed from: b */
    private final bem f16339b;

    /* renamed from: c */
    private final bfx f16340c;

    /* renamed from: d */
    private final bgt f16341d;

    /* renamed from: e */
    private final bis f16342e = bis.m15933b();

    public bhc(bfv bfv, bem bem, bfx bfx, bgt bgt) {
        this.f16338a = bfv;
        this.f16339b = bem;
        this.f16340c = bfx;
        this.f16341d = bgt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.google.ads.interactivemedia.v3.internal.bhb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0198 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.google.ads.interactivemedia.p038v3.internal.bfi<T> mo14244a(com.google.ads.interactivemedia.p038v3.internal.bet r33, com.google.ads.interactivemedia.p038v3.internal.biu<T> r34) {
        /*
            r32 = this;
            r0 = r32
            r11 = r33
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            java.lang.Class r1 = r34.mo15133a()
            boolean r2 = r12.isAssignableFrom(r1)
            r13 = 0
            if (r2 != 0) goto L_0x0012
            return r13
        L_0x0012:
            com.google.ads.interactivemedia.v3.internal.bfv r2 = r0.f16338a
            r3 = r34
            com.google.ads.interactivemedia.v3.internal.bgj r14 = r2.mo15029a(r3)
            com.google.ads.interactivemedia.v3.internal.bha r15 = new com.google.ads.interactivemedia.v3.internal.bha
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L_0x002a
        L_0x0027:
            r13 = r10
            goto L_0x01fc
        L_0x002a:
            java.lang.reflect.Type r16 = r34.mo15134b()
            r9 = r1
            r17 = r3
        L_0x0031:
            if (r9 == r12) goto L_0x0027
            java.lang.reflect.Field[] r8 = r9.getDeclaredFields()
            int r7 = r8.length
            r6 = 0
            r5 = 0
        L_0x003a:
            if (r5 >= r7) goto L_0x01da
            r4 = r8[r5]
            r3 = 1
            boolean r1 = r0.mo15123b(r4, r3)
            boolean r2 = r0.mo15123b(r4, r6)
            if (r1 != 0) goto L_0x005d
            if (r2 != 0) goto L_0x005a
            r29 = r5
            r26 = r7
            r27 = r8
            r34 = r9
            r13 = r10
            r22 = r12
            r31 = 0
            goto L_0x0198
        L_0x005a:
            r18 = 1
            goto L_0x005f
        L_0x005d:
            r18 = r2
        L_0x005f:
            com.google.ads.interactivemedia.v3.internal.bis r2 = r0.f16342e
            r2.mo15132a(r4)
            java.lang.reflect.Type r2 = r17.mo15134b()
            java.lang.reflect.Type r6 = r4.getGenericType()
            java.lang.reflect.Type r19 = com.google.ads.interactivemedia.p038v3.internal.bfp.m15823j(r2, r9, r6)
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.bfl> r2 = com.google.ads.interactivemedia.p038v3.internal.bfl.class
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            com.google.ads.interactivemedia.v3.internal.bfl r2 = (com.google.ads.interactivemedia.p038v3.internal.bfl) r2
            if (r2 != 0) goto L_0x00a1
            com.google.ads.interactivemedia.v3.internal.bem r2 = r0.f16339b
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0098
            if (r2 == r3) goto L_0x0097
            r1 = 2
            if (r2 == r1) goto L_0x0096
            r1 = 3
            if (r2 == r1) goto L_0x0095
            r1 = 4
            if (r2 == r1) goto L_0x0094
            r1 = 5
            if (r2 == r1) goto L_0x0093
            throw r13
        L_0x0093:
            throw r13
        L_0x0094:
            throw r13
        L_0x0095:
            throw r13
        L_0x0096:
            throw r13
        L_0x0097:
            throw r13
        L_0x0098:
            java.lang.String r2 = r4.getName()
            java.util.List r2 = java.util.Collections.singletonList(r2)
            goto L_0x00b0
        L_0x00a1:
            java.lang.String r6 = r2.mo15011a()
            java.lang.String[] r2 = r2.mo15012b()
            int r13 = r2.length
            if (r13 != 0) goto L_0x00b4
            java.util.List r2 = java.util.Collections.singletonList(r6)
        L_0x00b0:
            r21 = r1
            r13 = r2
            goto L_0x00cc
        L_0x00b4:
            java.util.ArrayList r3 = new java.util.ArrayList
            r21 = r1
            int r1 = r13 + 1
            r3.<init>(r1)
            r3.add(r6)
            r1 = 0
        L_0x00c1:
            if (r1 >= r13) goto L_0x00cb
            r6 = r2[r1]
            r3.add(r6)
            int r1 = r1 + 1
            goto L_0x00c1
        L_0x00cb:
            r13 = r3
        L_0x00cc:
            int r6 = r13.size()
            r1 = r21
            r2 = 0
            r3 = 0
        L_0x00d4:
            if (r3 >= r6) goto L_0x0188
            java.lang.Object r21 = r13.get(r3)
            r22 = r12
            r12 = r21
            java.lang.String r12 = (java.lang.String) r12
            if (r3 == 0) goto L_0x00e5
            r21 = 0
            goto L_0x00e7
        L_0x00e5:
            r21 = 1
        L_0x00e7:
            r1 = r21 & r1
            r21 = r9
            com.google.ads.interactivemedia.v3.internal.biu r9 = com.google.ads.interactivemedia.p038v3.internal.biu.m15937c(r19)
            r23 = r2
            java.lang.Class r2 = r9.mo15133a()
            r24 = r3
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L_0x0104
            boolean r2 = r2.isPrimitive()
            if (r2 == 0) goto L_0x0104
            r25 = 1
            goto L_0x0106
        L_0x0104:
            r25 = 0
        L_0x0106:
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.bfk> r2 = com.google.ads.interactivemedia.p038v3.internal.bfk.class
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            com.google.ads.interactivemedia.v3.internal.bfk r2 = (com.google.ads.interactivemedia.p038v3.internal.bfk) r2
            if (r2 == 0) goto L_0x0117
            com.google.ads.interactivemedia.v3.internal.bfv r3 = r0.f16338a
            com.google.ads.interactivemedia.v3.internal.bfi r2 = com.google.ads.interactivemedia.p038v3.internal.bgt.m15866b(r3, r11, r9, r2)
            goto L_0x0118
        L_0x0117:
            r2 = 0
        L_0x0118:
            if (r2 == 0) goto L_0x011d
            r26 = 1
            goto L_0x011f
        L_0x011d:
            r26 = 0
        L_0x011f:
            if (r2 != 0) goto L_0x0125
            com.google.ads.interactivemedia.v3.internal.bfi r2 = r11.mo14965b(r9)
        L_0x0125:
            r27 = r2
            com.google.ads.interactivemedia.v3.internal.bhb r3 = new com.google.ads.interactivemedia.v3.internal.bhb
            r2 = 1
            if (r2 == r1) goto L_0x0131
            r28 = r1
            r20 = 0
            goto L_0x0135
        L_0x0131:
            r28 = r1
            r20 = 1
        L_0x0135:
            r1 = r3
            r0 = r23
            r23 = 1
            r2 = r12
            r11 = r3
            r23 = r24
            r24 = 1
            r3 = r20
            r20 = r4
            r4 = r18
            r29 = r5
            r5 = r20
            r30 = r6
            r31 = 0
            r6 = r26
            r26 = r7
            r7 = r27
            r27 = r8
            r8 = r33
            r34 = r21
            r21 = r13
            r13 = r10
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r13.put(r12, r11)
            r2 = r1
            com.google.ads.interactivemedia.v3.internal.bhb r2 = (com.google.ads.interactivemedia.p038v3.internal.bhb) r2
            if (r0 != 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r2 = r0
        L_0x016d:
            int r3 = r23 + 1
            r0 = r32
            r11 = r33
            r9 = r34
            r10 = r13
            r4 = r20
            r13 = r21
            r12 = r22
            r7 = r26
            r8 = r27
            r1 = r28
            r5 = r29
            r6 = r30
            goto L_0x00d4
        L_0x0188:
            r0 = r2
            r29 = r5
            r26 = r7
            r27 = r8
            r34 = r9
            r13 = r10
            r22 = r12
            r31 = 0
            if (r0 != 0) goto L_0x01ab
        L_0x0198:
            int r5 = r29 + 1
            r0 = r32
            r11 = r33
            r9 = r34
            r10 = r13
            r12 = r22
            r7 = r26
            r8 = r27
            r6 = 0
            r13 = 0
            goto L_0x003a
        L_0x01ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r16)
            java.lang.String r0 = r0.f16329a
            int r3 = r2.length()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 37
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r2)
            java.lang.String r2 = " declares multiple JSON fields named "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.<init>(r0)
            throw r1
        L_0x01da:
            r34 = r9
            r13 = r10
            r22 = r12
            java.lang.reflect.Type r0 = r17.mo15134b()
            java.lang.reflect.Type r1 = r34.getGenericSuperclass()
            r2 = r34
            java.lang.reflect.Type r0 = com.google.ads.interactivemedia.p038v3.internal.bfp.m15823j(r0, r2, r1)
            com.google.ads.interactivemedia.v3.internal.biu r17 = com.google.ads.interactivemedia.p038v3.internal.biu.m15937c(r0)
            java.lang.Class r9 = r17.mo15133a()
            r0 = r32
            r11 = r33
            r13 = 0
            goto L_0x0031
        L_0x01fc:
            r15.<init>(r14, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.bhc.mo14244a(com.google.ads.interactivemedia.v3.internal.bet, com.google.ads.interactivemedia.v3.internal.biu):com.google.ads.interactivemedia.v3.internal.bfi");
    }

    /* renamed from: b */
    public final boolean mo15123b(Field field, boolean z) {
        bfx bfx = this.f16340c;
        return !bfx.mo15034d(field.getType(), z) && !bfx.mo15032c(field, z);
    }
}
