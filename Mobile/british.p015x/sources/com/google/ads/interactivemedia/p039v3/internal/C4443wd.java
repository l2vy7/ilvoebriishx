package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wd */
/* compiled from: IMASDK */
public final class C4443wd implements C4432vt {

    /* renamed from: a */
    private final C4457wr f19365a;

    /* renamed from: b */
    private String f19366b;

    /* renamed from: c */
    private C4327rw f19367c;

    /* renamed from: d */
    private C4442wc f19368d;

    /* renamed from: e */
    private boolean f19369e;

    /* renamed from: f */
    private final boolean[] f19370f = new boolean[3];

    /* renamed from: g */
    private final C4447wh f19371g = new C4447wh(32);

    /* renamed from: h */
    private final C4447wh f19372h = new C4447wh(33);

    /* renamed from: i */
    private final C4447wh f19373i = new C4447wh(34);

    /* renamed from: j */
    private final C4447wh f19374j = new C4447wh(39);

    /* renamed from: k */
    private final C4447wh f19375k = new C4447wh(40);

    /* renamed from: l */
    private long f19376l;

    /* renamed from: m */
    private long f19377m;

    /* renamed from: n */
    private final alw f19378n = new alw();

    public C4443wd(C4457wr wrVar) {
        this.f19365a = wrVar;
    }

    /* renamed from: f */
    private final void m19332f(byte[] bArr, int i, int i2) {
        this.f19368d.mo16739c(bArr, i, i2);
        if (!this.f19369e) {
            this.f19371g.mo16744d(bArr, i, i2);
            this.f19372h.mo16744d(bArr, i, i2);
            this.f19373i.mo16744d(bArr, i, i2);
        }
        this.f19374j.mo16744d(bArr, i, i2);
        this.f19375k.mo16744d(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo16707a() {
        this.f19376l = 0;
        alq.m14051d(this.f19370f);
        this.f19371g.mo16741a();
        this.f19372h.mo16741a();
        this.f19373i.mo16741a();
        this.f19374j.mo16741a();
        this.f19375k.mo16741a();
        C4442wc wcVar = this.f19368d;
        if (wcVar != null) {
            wcVar.mo16737a();
        }
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19366b = xcVar.mo16765c();
        C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 2);
        this.f19367c = ba;
        this.f19368d = new C4442wc(ba);
        this.f19365a.mo16757a(reVar, xcVar);
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19377m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0397  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16710d(com.google.ads.interactivemedia.p039v3.internal.alw r30) {
        /*
            r29 = this;
            r0 = r29
            com.google.ads.interactivemedia.v3.internal.rw r1 = r0.f19367c
            com.google.ads.interactivemedia.p039v3.internal.aup.m14889t(r1)
            int r1 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
        L_0x0009:
            int r1 = r30.mo13947e()
            if (r1 <= 0) goto L_0x03b0
            int r1 = r30.mo13950h()
            int r2 = r30.mo13948f()
            byte[] r3 = r30.mo13952j()
            long r4 = r0.f19376l
            int r6 = r30.mo13947e()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f19376l = r4
            com.google.ads.interactivemedia.v3.internal.rw r4 = r0.f19367c
            int r5 = r30.mo13947e()
            r6 = r30
            r4.mo13406d(r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.f19370f
            int r4 = com.google.ads.interactivemedia.p039v3.internal.alq.m14050c(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x03ad
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r1
            if (r9 <= 0) goto L_0x0049
            r0.m19332f(r3, r1, r4)
        L_0x0049:
            int r12 = r2 - r4
            long r10 = r0.f19376l
            long r13 = (long) r12
            long r10 = r10 - r13
            if (r9 >= 0) goto L_0x0053
            int r4 = -r9
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            long r13 = r0.f19377m
            com.google.ads.interactivemedia.v3.internal.wc r9 = r0.f19368d
            boolean r15 = r0.f19369e
            r9.mo16740d(r10, r12, r15)
            boolean r9 = r0.f19369e
            if (r9 != 0) goto L_0x0314
            com.google.ads.interactivemedia.v3.internal.wh r9 = r0.f19371g
            r9.mo16745e(r4)
            com.google.ads.interactivemedia.v3.internal.wh r9 = r0.f19372h
            r9.mo16745e(r4)
            com.google.ads.interactivemedia.v3.internal.wh r9 = r0.f19373i
            r9.mo16745e(r4)
            com.google.ads.interactivemedia.v3.internal.wh r9 = r0.f19371g
            boolean r9 = r9.mo16742b()
            if (r9 == 0) goto L_0x0314
            com.google.ads.interactivemedia.v3.internal.wh r9 = r0.f19372h
            boolean r9 = r9.mo16742b()
            if (r9 == 0) goto L_0x0314
            com.google.ads.interactivemedia.v3.internal.wh r9 = r0.f19373i
            boolean r9 = r9.mo16742b()
            if (r9 == 0) goto L_0x0314
            com.google.ads.interactivemedia.v3.internal.rw r9 = r0.f19367c
            java.lang.String r15 = r0.f19366b
            com.google.ads.interactivemedia.v3.internal.wh r8 = r0.f19371g
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19372h
            r17 = r5
            com.google.ads.interactivemedia.v3.internal.wh r5 = r0.f19373i
            int r6 = r8.f19419b
            r18 = r2
            int r2 = r1.f19419b
            int r2 = r2 + r6
            r19 = r3
            int r3 = r5.f19419b
            int r2 = r2 + r3
            byte[] r2 = new byte[r2]
            byte[] r3 = r8.f19418a
            r20 = r7
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r2, r7, r6)
            byte[] r3 = r1.f19418a
            int r6 = r8.f19419b
            r21 = r12
            int r12 = r1.f19419b
            java.lang.System.arraycopy(r3, r7, r2, r6, r12)
            byte[] r3 = r5.f19418a
            int r6 = r8.f19419b
            int r8 = r1.f19419b
            int r6 = r6 + r8
            int r5 = r5.f19419b
            java.lang.System.arraycopy(r3, r7, r2, r6, r5)
            com.google.ads.interactivemedia.v3.internal.alx r3 = new com.google.ads.interactivemedia.v3.internal.alx
            byte[] r5 = r1.f19418a
            int r6 = r1.f19419b
            r3.<init>(r5, r7, r6)
            r5 = 44
            r3.mo13971c(r5)
            r5 = 3
            int r7 = r3.mo13974f(r5)
            r3.mo13970b()
            r6 = 88
            r3.mo13971c(r6)
            r6 = 8
            r3.mo13971c(r6)
            r8 = 0
            r12 = 0
        L_0x00e3:
            if (r8 >= r7) goto L_0x00f8
            boolean r22 = r3.mo13973e()
            if (r22 == 0) goto L_0x00ed
            int r12 = r12 + 89
        L_0x00ed:
            boolean r22 = r3.mo13973e()
            if (r22 == 0) goto L_0x00f5
            int r12 = r12 + 8
        L_0x00f5:
            int r8 = r8 + 1
            goto L_0x00e3
        L_0x00f8:
            r3.mo13971c(r12)
            if (r7 <= 0) goto L_0x0103
            int r8 = 8 - r7
            int r8 = r8 + r8
            r3.mo13971c(r8)
        L_0x0103:
            r3.mo13976h()
            int r8 = r3.mo13976h()
            if (r8 != r5) goto L_0x0110
            r3.mo13970b()
            r8 = 3
        L_0x0110:
            int r12 = r3.mo13976h()
            int r22 = r3.mo13976h()
            boolean r23 = r3.mo13973e()
            r6 = 2
            if (r23 == 0) goto L_0x014b
            int r23 = r3.mo13976h()
            int r24 = r3.mo13976h()
            int r25 = r3.mo13976h()
            int r26 = r3.mo13976h()
            r5 = 1
            if (r8 == r5) goto L_0x0138
            if (r8 != r6) goto L_0x0135
            goto L_0x0138
        L_0x0135:
            r27 = 1
            goto L_0x013a
        L_0x0138:
            r27 = 2
        L_0x013a:
            if (r8 != r5) goto L_0x013e
            r5 = 2
            goto L_0x013f
        L_0x013e:
            r5 = 1
        L_0x013f:
            int r23 = r23 + r24
            int r27 = r27 * r23
            int r12 = r12 - r27
            int r25 = r25 + r26
            int r5 = r5 * r25
            int r22 = r22 - r5
        L_0x014b:
            r3.mo13976h()
            r3.mo13976h()
            int r5 = r3.mo13976h()
            boolean r8 = r3.mo13973e()
            r6 = 1
            if (r6 == r8) goto L_0x015e
            r6 = r7
            goto L_0x015f
        L_0x015e:
            r6 = 0
        L_0x015f:
            if (r6 > r7) goto L_0x016d
            r3.mo13976h()
            r3.mo13976h()
            r3.mo13976h()
            int r6 = r6 + 1
            goto L_0x015f
        L_0x016d:
            r3.mo13976h()
            r3.mo13976h()
            r3.mo13976h()
            r3.mo13976h()
            r3.mo13976h()
            r3.mo13976h()
            boolean r6 = r3.mo13973e()
            r7 = 4
            if (r6 == 0) goto L_0x01cf
            boolean r6 = r3.mo13973e()
            if (r6 == 0) goto L_0x01cf
            r6 = 0
        L_0x018d:
            if (r6 >= r7) goto L_0x01cf
            r8 = 0
        L_0x0190:
            r7 = 6
            if (r8 >= r7) goto L_0x01c8
            boolean r7 = r3.mo13973e()
            if (r7 != 0) goto L_0x01a0
            r3.mo13976h()
            r27 = r10
        L_0x019e:
            r7 = 3
            goto L_0x01bf
        L_0x01a0:
            r7 = 64
            int r25 = r6 + r6
            r24 = 4
            int r25 = r25 + 4
            r27 = r10
            r10 = 1
            int r11 = r10 << r25
            int r7 = java.lang.Math.min(r7, r11)
            if (r6 <= r10) goto L_0x01b6
            r3.mo13977i()
        L_0x01b6:
            r10 = 0
        L_0x01b7:
            if (r10 >= r7) goto L_0x019e
            r3.mo13977i()
            int r10 = r10 + 1
            goto L_0x01b7
        L_0x01bf:
            if (r6 != r7) goto L_0x01c3
            r10 = 3
            goto L_0x01c4
        L_0x01c3:
            r10 = 1
        L_0x01c4:
            int r8 = r8 + r10
            r10 = r27
            goto L_0x0190
        L_0x01c8:
            r27 = r10
            r7 = 3
            int r6 = r6 + 1
            r7 = 4
            goto L_0x018d
        L_0x01cf:
            r27 = r10
            r6 = 2
            r3.mo13971c(r6)
            boolean r6 = r3.mo13973e()
            if (r6 == 0) goto L_0x01e9
            r6 = 8
            r3.mo13971c(r6)
            r3.mo13976h()
            r3.mo13976h()
            r3.mo13970b()
        L_0x01e9:
            int r6 = r3.mo13976h()
            r7 = 0
            r8 = 0
            r10 = 0
        L_0x01f0:
            if (r7 >= r6) goto L_0x023d
            if (r7 == 0) goto L_0x01f8
            boolean r8 = r3.mo13973e()
        L_0x01f8:
            if (r8 == 0) goto L_0x0212
            r3.mo13970b()
            r3.mo13976h()
            r11 = 0
        L_0x0201:
            if (r11 > r10) goto L_0x020f
            boolean r25 = r3.mo13973e()
            if (r25 == 0) goto L_0x020c
            r3.mo13970b()
        L_0x020c:
            int r11 = r11 + 1
            goto L_0x0201
        L_0x020f:
            r26 = r6
            goto L_0x0238
        L_0x0212:
            int r10 = r3.mo13976h()
            int r11 = r3.mo13976h()
            int r25 = r10 + r11
            r26 = r6
            r6 = 0
        L_0x021f:
            if (r6 >= r10) goto L_0x022a
            r3.mo13976h()
            r3.mo13970b()
            int r6 = r6 + 1
            goto L_0x021f
        L_0x022a:
            r6 = 0
        L_0x022b:
            if (r6 >= r11) goto L_0x0236
            r3.mo13976h()
            r3.mo13970b()
            int r6 = r6 + 1
            goto L_0x022b
        L_0x0236:
            r10 = r25
        L_0x0238:
            int r7 = r7 + 1
            r6 = r26
            goto L_0x01f0
        L_0x023d:
            boolean r6 = r3.mo13973e()
            if (r6 == 0) goto L_0x0253
            r7 = 0
        L_0x0244:
            int r6 = r3.mo13976h()
            if (r7 >= r6) goto L_0x0253
            r6 = 5
            int r8 = r5 + 5
            r3.mo13971c(r8)
            int r7 = r7 + 1
            goto L_0x0244
        L_0x0253:
            r5 = 2
            r3.mo13971c(r5)
            boolean r5 = r3.mo13973e()
            r6 = 24
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x02d8
            boolean r5 = r3.mo13973e()
            if (r5 == 0) goto L_0x02a5
            r5 = 8
            int r5 = r3.mo13974f(r5)
            r8 = 255(0xff, float:3.57E-43)
            if (r5 != r8) goto L_0x0283
            r5 = 16
            int r8 = r3.mo13974f(r5)
            int r5 = r3.mo13974f(r5)
            if (r8 == 0) goto L_0x02a5
            if (r5 == 0) goto L_0x02a5
            float r7 = (float) r8
            float r5 = (float) r5
            float r7 = r7 / r5
            goto L_0x02a5
        L_0x0283:
            r8 = 17
            if (r5 >= r8) goto L_0x028d
            float[] r7 = com.google.ads.interactivemedia.p039v3.internal.alq.f15234b
            r5 = r7[r5]
            r7 = r5
            goto L_0x02a5
        L_0x028d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r10 = 46
            r8.<init>(r10)
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r8.append(r10)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.String r8 = "H265Reader"
            android.util.Log.w(r8, r5)
        L_0x02a5:
            boolean r5 = r3.mo13973e()
            if (r5 == 0) goto L_0x02ae
            r3.mo13970b()
        L_0x02ae:
            boolean r5 = r3.mo13973e()
            if (r5 == 0) goto L_0x02c1
            r5 = 4
            r3.mo13971c(r5)
            boolean r5 = r3.mo13973e()
            if (r5 == 0) goto L_0x02c1
            r3.mo13971c(r6)
        L_0x02c1:
            boolean r5 = r3.mo13973e()
            if (r5 == 0) goto L_0x02cd
            r3.mo13976h()
            r3.mo13976h()
        L_0x02cd:
            r3.mo13970b()
            boolean r5 = r3.mo13973e()
            if (r5 == 0) goto L_0x02d8
            int r22 = r22 + r22
        L_0x02d8:
            r5 = r22
            byte[] r8 = r1.f19418a
            int r1 = r1.f19419b
            r10 = 0
            r3.mo13969a(r8, r10, r1)
            r3.mo13971c(r6)
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.akt.m13976b(r3)
            com.google.ads.interactivemedia.v3.internal.kd r3 = new com.google.ads.interactivemedia.v3.internal.kd
            r3.<init>()
            r3.mo16107S(r15)
            java.lang.String r6 = "video/hevc"
            r3.mo16120ae(r6)
            r3.mo16097I(r1)
            r3.mo16125aj(r12)
            r3.mo16105Q(r5)
            r3.mo16116aa(r7)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r3.mo16108T(r1)
            com.google.ads.interactivemedia.v3.internal.ke r1 = r3.mo16115a()
            r9.mo13403a(r1)
            r1 = 1
            r0.f19369e = r1
            goto L_0x0320
        L_0x0314:
            r18 = r2
            r19 = r3
            r17 = r5
            r20 = r7
            r27 = r10
            r21 = r12
        L_0x0320:
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19374j
            boolean r1 = r1.mo16745e(r4)
            if (r1 == 0) goto L_0x0348
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19374j
            byte[] r2 = r1.f19418a
            int r1 = r1.f19419b
            int r1 = com.google.ads.interactivemedia.p039v3.internal.alq.m14048a(r2, r1)
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19378n
            com.google.ads.interactivemedia.v3.internal.wh r3 = r0.f19374j
            byte[] r3 = r3.f19418a
            r2.mo13945c(r3, r1)
            com.google.ads.interactivemedia.v3.internal.alw r1 = r0.f19378n
            r2 = 5
            r1.mo13954l(r2)
            com.google.ads.interactivemedia.v3.internal.wr r1 = r0.f19365a
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19378n
            r1.mo16758b(r13, r2)
        L_0x0348:
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19375k
            boolean r1 = r1.mo16745e(r4)
            if (r1 == 0) goto L_0x0370
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19375k
            byte[] r2 = r1.f19418a
            int r1 = r1.f19419b
            int r1 = com.google.ads.interactivemedia.p039v3.internal.alq.m14048a(r2, r1)
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19378n
            com.google.ads.interactivemedia.v3.internal.wh r3 = r0.f19375k
            byte[] r3 = r3.f19418a
            r2.mo13945c(r3, r1)
            com.google.ads.interactivemedia.v3.internal.alw r1 = r0.f19378n
            r2 = 5
            r1.mo13954l(r2)
            com.google.ads.interactivemedia.v3.internal.wr r1 = r0.f19365a
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19378n
            r1.mo16758b(r13, r2)
        L_0x0370:
            long r14 = r0.f19377m
            com.google.ads.interactivemedia.v3.internal.wc r9 = r0.f19368d
            boolean r1 = r0.f19369e
            r10 = r27
            r12 = r21
            r13 = r20
            r16 = r1
            r9.mo16738b(r10, r12, r13, r14, r16)
            boolean r1 = r0.f19369e
            if (r1 != 0) goto L_0x0397
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19371g
            r2 = r20
            r1.mo16743c(r2)
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19372h
            r1.mo16743c(r2)
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19373i
            r1.mo16743c(r2)
            goto L_0x0399
        L_0x0397:
            r2 = r20
        L_0x0399:
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19374j
            r1.mo16743c(r2)
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19375k
            r1.mo16743c(r2)
            r6 = r30
            r1 = r17
            r2 = r18
            r3 = r19
            goto L_0x0030
        L_0x03ad:
            r0.m19332f(r3, r1, r2)
        L_0x03b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4443wd.mo16710d(com.google.ads.interactivemedia.v3.internal.alw):void");
    }

    /* renamed from: e */
    public final void mo16711e() {
    }
}
