package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vv */
/* compiled from: IMASDK */
public final class C4434vv implements C4432vt {

    /* renamed from: c */
    private static final double[] f19260c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f19261a;

    /* renamed from: b */
    private C4327rw f19262b;

    /* renamed from: d */
    private final C4471xe f19263d;

    /* renamed from: e */
    private final alw f19264e;

    /* renamed from: f */
    private final C4447wh f19265f;

    /* renamed from: g */
    private final boolean[] f19266g;

    /* renamed from: h */
    private final C4433vu f19267h;

    /* renamed from: i */
    private long f19268i;

    /* renamed from: j */
    private boolean f19269j;

    /* renamed from: k */
    private boolean f19270k;

    /* renamed from: l */
    private long f19271l;

    /* renamed from: m */
    private long f19272m;

    /* renamed from: n */
    private long f19273n;

    /* renamed from: o */
    private long f19274o;

    /* renamed from: p */
    private boolean f19275p;

    /* renamed from: q */
    private boolean f19276q;

    public C4434vv() {
        this((C4471xe) null);
    }

    /* renamed from: a */
    public final void mo16707a() {
        alq.m14051d(this.f19266g);
        this.f19267h.mo16714a();
        C4447wh whVar = this.f19265f;
        if (whVar != null) {
            whVar.mo16741a();
        }
        this.f19268i = 0;
        this.f19269j = false;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19261a = xcVar.mo16765c();
        this.f19262b = reVar.mo13362ba(xcVar.mo16764b(), 2);
        C4471xe xeVar = this.f19263d;
        if (xeVar != null) {
            xeVar.mo16766a(reVar, xcVar);
        }
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19272m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16710d(com.google.ads.interactivemedia.p039v3.internal.alw r21) {
        /*
            r20 = this;
            r0 = r20
            com.google.ads.interactivemedia.v3.internal.rw r1 = r0.f19262b
            com.google.ads.interactivemedia.p039v3.internal.aup.m14889t(r1)
            int r1 = r21.mo13950h()
            int r2 = r21.mo13948f()
            byte[] r3 = r21.mo13952j()
            long r4 = r0.f19268i
            int r6 = r21.mo13947e()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f19268i = r4
            com.google.ads.interactivemedia.v3.internal.rw r4 = r0.f19262b
            int r5 = r21.mo13947e()
            r6 = r21
            r4.mo13406d(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f19266g
            int r4 = com.google.ads.interactivemedia.p039v3.internal.alq.m14050c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f19270k
            if (r4 != 0) goto L_0x0039
            com.google.ads.interactivemedia.v3.internal.vu r4 = r0.f19267h
            r4.mo16716c(r3, r1, r2)
        L_0x0039:
            com.google.ads.interactivemedia.v3.internal.wh r4 = r0.f19265f
            if (r4 == 0) goto L_0x0040
            r4.mo16744d(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            int r5 = r4 + 3
            byte[] r7 = r21.mo13952j()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f19270k
            if (r9 != 0) goto L_0x012f
            if (r8 <= 0) goto L_0x0058
            com.google.ads.interactivemedia.v3.internal.vu r9 = r0.f19267h
            r9.mo16716c(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.ads.interactivemedia.v3.internal.vu r14 = r0.f19267h
            boolean r9 = r14.mo16715b(r7, r9)
            if (r9 == 0) goto L_0x012f
            com.google.ads.interactivemedia.v3.internal.vu r9 = r0.f19267h
            java.lang.String r14 = r0.f19261a
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r14)
            byte[] r15 = r9.f19258c
            int r10 = r9.f19256a
            byte[] r10 = java.util.Arrays.copyOf(r15, r10)
            r11 = 4
            byte r15 = r10[r11]
            r16 = 5
            byte r12 = r10[r16]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r11
            int r17 = r12 >> 4
            r15 = r15 | r17
            r12 = r12 & 15
            r13 = 8
            int r12 = r12 << r13
            r18 = 6
            byte r13 = r10[r18]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r12 = r12 | r13
            r13 = 7
            byte r11 = r10[r13]
            r11 = r11 & 240(0xf0, float:3.36E-43)
            r13 = 4
            int r11 = r11 >> r13
            r13 = 2
            if (r11 == r13) goto L_0x00af
            r13 = 3
            if (r11 == r13) goto L_0x00a9
            r13 = 4
            if (r11 == r13) goto L_0x00a3
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b6
        L_0x00a3:
            int r11 = r12 * 121
            float r11 = (float) r11
            int r13 = r15 * 100
            goto L_0x00b4
        L_0x00a9:
            int r11 = r12 * 16
            float r11 = (float) r11
            int r13 = r15 * 9
            goto L_0x00b4
        L_0x00af:
            int r11 = r12 * 4
            float r11 = (float) r11
            int r13 = r15 * 3
        L_0x00b4:
            float r13 = (float) r13
            float r11 = r11 / r13
        L_0x00b6:
            com.google.ads.interactivemedia.v3.internal.kd r13 = new com.google.ads.interactivemedia.v3.internal.kd
            r13.<init>()
            r13.mo16107S(r14)
            java.lang.String r14 = "video/mpeg2"
            r13.mo16120ae(r14)
            r13.mo16125aj(r15)
            r13.mo16105Q(r12)
            r13.mo16116aa(r11)
            java.util.List r11 = java.util.Collections.singletonList(r10)
            r13.mo16108T(r11)
            com.google.ads.interactivemedia.v3.internal.ke r11 = r13.mo16115a()
            r12 = 7
            byte r12 = r10[r12]
            r12 = r12 & 15
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x010f
            r13 = 8
            if (r12 >= r13) goto L_0x010f
            double[] r13 = f19260c
            r12 = r13[r12]
            int r9 = r9.f19257b
            int r9 = r9 + 9
            byte r9 = r10[r9]
            r10 = r9 & 96
            int r10 = r10 >> 5
            r9 = r9 & 31
            if (r10 == r9) goto L_0x0107
            double r14 = (double) r10
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r14)
            double r14 = r14 + r18
            int r9 = r9 + 1
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            double r14 = r14 / r9
            double r12 = r12 * r14
        L_0x0107:
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r9 = r9 / r12
            long r9 = (long) r9
            goto L_0x0111
        L_0x010f:
            r9 = 0
        L_0x0111:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r11, r9)
            com.google.ads.interactivemedia.v3.internal.rw r10 = r0.f19262b
            java.lang.Object r11 = r9.first
            com.google.ads.interactivemedia.v3.internal.ke r11 = (com.google.ads.interactivemedia.p039v3.internal.C4120ke) r11
            r10.mo13403a(r11)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            r0.f19271l = r9
            r9 = 1
            r0.f19270k = r9
        L_0x012f:
            com.google.ads.interactivemedia.v3.internal.wh r9 = r0.f19265f
            r10 = 178(0xb2, float:2.5E-43)
            if (r9 == 0) goto L_0x0177
            if (r8 <= 0) goto L_0x013c
            r9.mo16744d(r3, r1, r4)
            r1 = 0
            goto L_0x013d
        L_0x013c:
            int r1 = -r8
        L_0x013d:
            com.google.ads.interactivemedia.v3.internal.wh r8 = r0.f19265f
            boolean r1 = r8.mo16745e(r1)
            if (r1 == 0) goto L_0x0163
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19265f
            byte[] r8 = r1.f19418a
            int r1 = r1.f19419b
            int r1 = com.google.ads.interactivemedia.p039v3.internal.alq.m14048a(r8, r1)
            com.google.ads.interactivemedia.v3.internal.alw r8 = r0.f19264e
            int r9 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            com.google.ads.interactivemedia.v3.internal.wh r9 = r0.f19265f
            byte[] r9 = r9.f19418a
            r8.mo13945c(r9, r1)
            com.google.ads.interactivemedia.v3.internal.xe r1 = r0.f19263d
            long r8 = r0.f19274o
            com.google.ads.interactivemedia.v3.internal.alw r11 = r0.f19264e
            r1.mo16767b(r8, r11)
        L_0x0163:
            if (r7 != r10) goto L_0x0177
            byte[] r1 = r21.mo13952j()
            int r7 = r4 + 2
            byte r1 = r1[r7]
            r7 = 1
            if (r1 != r7) goto L_0x0175
            com.google.ads.interactivemedia.v3.internal.wh r1 = r0.f19265f
            r1.mo16743c(r10)
        L_0x0175:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x0177:
            if (r7 == 0) goto L_0x0186
            r1 = 179(0xb3, float:2.51E-43)
            if (r7 != r1) goto L_0x017e
            goto L_0x0186
        L_0x017e:
            r1 = 184(0xb8, float:2.58E-43)
            if (r7 != r1) goto L_0x01e5
            r1 = 1
            r0.f19275p = r1
            goto L_0x01e5
        L_0x0186:
            int r1 = r2 - r4
            boolean r4 = r0.f19269j
            if (r4 == 0) goto L_0x01ac
            boolean r4 = r0.f19276q
            if (r4 == 0) goto L_0x01ac
            boolean r4 = r0.f19270k
            if (r4 == 0) goto L_0x01ac
            boolean r11 = r0.f19275p
            long r8 = r0.f19268i
            long r12 = r0.f19273n
            com.google.ads.interactivemedia.v3.internal.rw r4 = r0.f19262b
            long r14 = r0.f19274o
            long r8 = r8 - r12
            int r9 = (int) r8
            int r12 = r9 - r1
            r16 = 0
            r8 = r4
            r9 = r14
            r13 = r1
            r14 = r16
            r8.mo13404b(r9, r11, r12, r13, r14)
        L_0x01ac:
            boolean r4 = r0.f19269j
            if (r4 == 0) goto L_0x01b8
            boolean r8 = r0.f19276q
            if (r8 == 0) goto L_0x01b5
            goto L_0x01b8
        L_0x01b5:
            r1 = 0
            r4 = 1
            goto L_0x01de
        L_0x01b8:
            long r8 = r0.f19268i
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.f19273n = r8
            long r8 = r0.f19272m
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x01ca
            goto L_0x01d4
        L_0x01ca:
            if (r4 == 0) goto L_0x01d2
            long r8 = r0.f19274o
            long r12 = r0.f19271l
            long r8 = r8 + r12
            goto L_0x01d4
        L_0x01d2:
            r8 = 0
        L_0x01d4:
            r0.f19274o = r8
            r1 = 0
            r0.f19275p = r1
            r0.f19272m = r10
            r4 = 1
            r0.f19269j = r4
        L_0x01de:
            if (r7 != 0) goto L_0x01e2
            r12 = 1
            goto L_0x01e3
        L_0x01e2:
            r12 = 0
        L_0x01e3:
            r0.f19276q = r12
        L_0x01e5:
            r1 = r5
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4434vv.mo16710d(com.google.ads.interactivemedia.v3.internal.alw):void");
    }

    /* renamed from: e */
    public final void mo16711e() {
    }

    C4434vv(C4471xe xeVar) {
        alw alw;
        this.f19263d = xeVar;
        this.f19266g = new boolean[4];
        this.f19267h = new C4433vu();
        if (xeVar != null) {
            this.f19265f = new C4447wh(178);
            alw = new alw();
        } else {
            alw = null;
            this.f19265f = null;
        }
        this.f19264e = alw;
    }
}
