package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vy */
/* compiled from: IMASDK */
public final class C4437vy implements C4432vt {

    /* renamed from: a */
    private static final float[] f19291a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: b */
    private final C4471xe f19292b;

    /* renamed from: c */
    private final alw f19293c;

    /* renamed from: d */
    private final boolean[] f19294d;

    /* renamed from: e */
    private final C4435vw f19295e;

    /* renamed from: f */
    private final C4447wh f19296f;

    /* renamed from: g */
    private C4436vx f19297g;

    /* renamed from: h */
    private long f19298h;

    /* renamed from: i */
    private String f19299i;

    /* renamed from: j */
    private C4327rw f19300j;

    /* renamed from: k */
    private boolean f19301k;

    /* renamed from: l */
    private long f19302l;

    public C4437vy() {
        this((C4471xe) null);
    }

    /* renamed from: a */
    public final void mo16707a() {
        alq.m14051d(this.f19294d);
        this.f19295e.mo16717a();
        C4436vx vxVar = this.f19297g;
        if (vxVar != null) {
            vxVar.mo16720a();
        }
        this.f19296f.mo16741a();
        this.f19298h = 0;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19299i = xcVar.mo16765c();
        C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 2);
        this.f19300j = ba;
        this.f19297g = new C4436vx(ba);
        this.f19292b.mo16766a(reVar, xcVar);
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19302l = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cd A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16710d(com.google.ads.interactivemedia.p039v3.internal.alw r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.ads.interactivemedia.v3.internal.vx r1 = r0.f19297g
            com.google.ads.interactivemedia.p039v3.internal.aup.m14889t(r1)
            com.google.ads.interactivemedia.v3.internal.rw r1 = r0.f19300j
            com.google.ads.interactivemedia.p039v3.internal.aup.m14889t(r1)
            int r1 = r19.mo13950h()
            int r2 = r19.mo13948f()
            byte[] r3 = r19.mo13952j()
            long r4 = r0.f19298h
            int r6 = r19.mo13947e()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f19298h = r4
            com.google.ads.interactivemedia.v3.internal.rw r4 = r0.f19300j
            int r5 = r19.mo13947e()
            r6 = r19
            r4.mo13406d(r6, r5)
        L_0x002d:
            boolean[] r4 = r0.f19294d
            int r4 = com.google.ads.interactivemedia.p039v3.internal.alq.m14050c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.f19301k
            if (r4 != 0) goto L_0x003e
            com.google.ads.interactivemedia.v3.internal.vw r4 = r0.f19295e
            r4.mo16719c(r3, r1, r2)
        L_0x003e:
            com.google.ads.interactivemedia.v3.internal.vx r4 = r0.f19297g
            r4.mo16722c(r3, r1, r2)
            com.google.ads.interactivemedia.v3.internal.wh r4 = r0.f19296f
            r4.mo16744d(r3, r1, r2)
            return
        L_0x0049:
            int r5 = r4 + 3
            byte[] r7 = r19.mo13952j()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f19301k
            if (r9 != 0) goto L_0x0180
            if (r8 <= 0) goto L_0x0060
            com.google.ads.interactivemedia.v3.internal.vw r9 = r0.f19295e
            r9.mo16719c(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.ads.interactivemedia.v3.internal.vw r12 = r0.f19295e
            boolean r9 = r12.mo16718b(r7, r9)
            if (r9 == 0) goto L_0x0180
            com.google.ads.interactivemedia.v3.internal.rw r9 = r0.f19300j
            com.google.ads.interactivemedia.v3.internal.vw r12 = r0.f19295e
            int r13 = r12.f19279b
            java.lang.String r14 = r0.f19299i
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r14)
            byte[] r15 = r12.f19280c
            int r12 = r12.f19278a
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.ads.interactivemedia.v3.internal.alv r15 = new com.google.ads.interactivemedia.v3.internal.alv
            r15.<init>(r12)
            r15.mo13929k(r13)
            r13 = 4
            r15.mo13929k(r13)
            r15.mo13924f()
            r10 = 8
            r15.mo13925g(r10)
            boolean r16 = r15.mo13926h()
            r11 = 3
            if (r16 == 0) goto L_0x00a1
            r15.mo13925g(r13)
            r15.mo13925g(r11)
        L_0x00a1:
            int r13 = r15.mo13927i(r13)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r10 = "H263Reader"
            r17 = r5
            r5 = 15
            if (r13 != r5) goto L_0x00c6
            r5 = 8
            int r13 = r15.mo13927i(r5)
            int r5 = r15.mo13927i(r5)
            if (r5 != 0) goto L_0x00c1
            android.util.Log.w(r10, r11)
            goto L_0x00d3
        L_0x00c1:
            float r11 = (float) r13
            float r5 = (float) r5
            float r16 = r11 / r5
            goto L_0x00cd
        L_0x00c6:
            r5 = 7
            if (r13 >= r5) goto L_0x00d0
            float[] r5 = f19291a
            r16 = r5[r13]
        L_0x00cd:
            r5 = r16
            goto L_0x00d5
        L_0x00d0:
            android.util.Log.w(r10, r11)
        L_0x00d3:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00d5:
            boolean r11 = r15.mo13926h()
            r13 = 2
            if (r11 == 0) goto L_0x010f
            r15.mo13925g(r13)
            r11 = 1
            r15.mo13925g(r11)
            boolean r11 = r15.mo13926h()
            if (r11 == 0) goto L_0x010f
            r11 = 15
            r15.mo13925g(r11)
            r15.mo13924f()
            r15.mo13925g(r11)
            r15.mo13924f()
            r15.mo13925g(r11)
            r15.mo13924f()
            r13 = 3
            r15.mo13925g(r13)
            r13 = 11
            r15.mo13925g(r13)
            r15.mo13924f()
            r15.mo13925g(r11)
            r15.mo13924f()
        L_0x010f:
            r11 = 2
            int r11 = r15.mo13927i(r11)
            if (r11 == 0) goto L_0x011b
            java.lang.String r11 = "Unhandled video object layer shape"
            android.util.Log.w(r10, r11)
        L_0x011b:
            r15.mo13924f()
            r11 = 16
            int r11 = r15.mo13927i(r11)
            r15.mo13924f()
            boolean r13 = r15.mo13926h()
            if (r13 == 0) goto L_0x0142
            if (r11 != 0) goto L_0x0135
            java.lang.String r11 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r10, r11)
            goto L_0x0142
        L_0x0135:
            int r11 = r11 + -1
            r10 = 0
        L_0x0138:
            if (r11 <= 0) goto L_0x013f
            int r10 = r10 + 1
            int r11 = r11 >> 1
            goto L_0x0138
        L_0x013f:
            r15.mo13925g(r10)
        L_0x0142:
            r15.mo13924f()
            r10 = 13
            int r11 = r15.mo13927i(r10)
            r15.mo13924f()
            int r10 = r15.mo13927i(r10)
            r15.mo13924f()
            r15.mo13924f()
            com.google.ads.interactivemedia.v3.internal.kd r13 = new com.google.ads.interactivemedia.v3.internal.kd
            r13.<init>()
            r13.mo16107S(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.mo16120ae(r14)
            r13.mo16125aj(r11)
            r13.mo16105Q(r10)
            r13.mo16116aa(r5)
            java.util.List r5 = java.util.Collections.singletonList(r12)
            r13.mo16108T(r5)
            com.google.ads.interactivemedia.v3.internal.ke r5 = r13.mo16115a()
            r9.mo13403a(r5)
            r5 = 1
            r0.f19301k = r5
            goto L_0x0182
        L_0x0180:
            r17 = r5
        L_0x0182:
            com.google.ads.interactivemedia.v3.internal.vx r5 = r0.f19297g
            r5.mo16722c(r3, r1, r4)
            com.google.ads.interactivemedia.v3.internal.wh r5 = r0.f19296f
            if (r8 <= 0) goto L_0x0190
            r5.mo16744d(r3, r1, r4)
            r10 = 0
            goto L_0x0191
        L_0x0190:
            int r10 = -r8
        L_0x0191:
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19296f
            boolean r1 = r1.mo16745e(r10)
            if (r1 == 0) goto L_0x01b7
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19296f
            byte[] r5 = r1.f19418a
            int r1 = r1.f19419b
            int r1 = com.google.ads.interactivemedia.p039v3.internal.alq.m14048a(r5, r1)
            com.google.ads.interactivemedia.v3.internal.alw r5 = r0.f19293c
            int r8 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            com.google.ads.interactivemedia.v3.internal.wh r8 = r0.f19296f
            byte[] r8 = r8.f19418a
            r5.mo13945c(r8, r1)
            com.google.ads.interactivemedia.v3.internal.xe r1 = r0.f19292b
            long r8 = r0.f19302l
            com.google.ads.interactivemedia.v3.internal.alw r5 = r0.f19293c
            r1.mo16767b(r8, r5)
        L_0x01b7:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x01cd
            byte[] r5 = r19.mo13952j()
            int r7 = r4 + 2
            byte r5 = r5[r7]
            r7 = 1
            if (r5 != r7) goto L_0x01cb
            com.google.ads.interactivemedia.v3.internal.wh r5 = r0.f19296f
            r5.mo16743c(r1)
        L_0x01cb:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x01cd:
            int r1 = r2 - r4
            long r4 = r0.f19298h
            com.google.ads.interactivemedia.v3.internal.vx r8 = r0.f19297g
            long r9 = (long) r1
            long r4 = r4 - r9
            boolean r9 = r0.f19301k
            r8.mo16723d(r4, r1, r9)
            com.google.ads.interactivemedia.v3.internal.vx r1 = r0.f19297g
            long r4 = r0.f19302l
            r1.mo16721b(r7, r4)
            r1 = r17
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4437vy.mo16710d(com.google.ads.interactivemedia.v3.internal.alw):void");
    }

    /* renamed from: e */
    public final void mo16711e() {
    }

    C4437vy(C4471xe xeVar) {
        this.f19292b = xeVar;
        this.f19294d = new boolean[4];
        this.f19295e = new C4435vw();
        this.f19296f = new C4447wh(178);
        this.f19293c = new alw();
    }
}
