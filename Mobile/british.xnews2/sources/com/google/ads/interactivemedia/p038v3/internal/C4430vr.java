package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vr */
/* compiled from: IMASDK */
public final class C4430vr implements C4432vt {

    /* renamed from: a */
    private final alw f19238a = new alw(new byte[18]);

    /* renamed from: b */
    private final String f19239b;

    /* renamed from: c */
    private String f19240c;

    /* renamed from: d */
    private C4327rw f19241d;

    /* renamed from: e */
    private int f19242e = 0;

    /* renamed from: f */
    private int f19243f;

    /* renamed from: g */
    private int f19244g;

    /* renamed from: h */
    private long f19245h;

    /* renamed from: i */
    private C4120ke f19246i;

    /* renamed from: j */
    private int f19247j;

    /* renamed from: k */
    private long f19248k;

    public C4430vr(String str) {
        this.f19239b = str;
    }

    /* renamed from: a */
    public final void mo16707a() {
        this.f19242e = 0;
        this.f19243f = 0;
        this.f19244g = 0;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19240c = xcVar.mo16765c();
        this.f19241d = reVar.mo13362ba(xcVar.mo16764b(), 1);
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19248k = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0009 A[EDGE_INSN: B:55:0x0009->B:49:0x0009 ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16710d(com.google.ads.interactivemedia.p038v3.internal.alw r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.ads.interactivemedia.v3.internal.rw r2 = r0.f19241d
            com.google.ads.interactivemedia.p038v3.internal.aup.m14889t(r2)
        L_0x0009:
            int r2 = r18.mo13947e()
            if (r2 <= 0) goto L_0x0187
            int r2 = r0.f19242e
            r3 = 8
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 4
            if (r2 == 0) goto L_0x0135
            if (r2 == r7) goto L_0x004b
            int r2 = r18.mo13947e()
            int r3 = r0.f19247j
            int r4 = r0.f19243f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.google.ads.interactivemedia.v3.internal.rw r3 = r0.f19241d
            r3.mo13406d(r1, r2)
            int r3 = r0.f19243f
            int r3 = r3 + r2
            r0.f19243f = r3
            int r11 = r0.f19247j
            if (r3 != r11) goto L_0x0009
            com.google.ads.interactivemedia.v3.internal.rw r7 = r0.f19241d
            long r8 = r0.f19248k
            r10 = 1
            r12 = 0
            r13 = 0
            r7.mo13404b(r8, r10, r11, r12, r13)
            long r2 = r0.f19248k
            long r4 = r0.f19245h
            long r2 = r2 + r4
            r0.f19248k = r2
            r0.f19242e = r6
            goto L_0x0009
        L_0x004b:
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19238a
            byte[] r2 = r2.mo13952j()
            int r9 = r18.mo13947e()
            int r10 = r0.f19243f
            r11 = 18
            int r10 = 18 - r10
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r0.f19243f
            r1.mo13956n(r2, r10, r9)
            int r2 = r0.f19243f
            int r2 = r2 + r9
            r0.f19243f = r2
            if (r2 != r11) goto L_0x0009
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19238a
            byte[] r2 = r2.mo13952j()
            com.google.ads.interactivemedia.v3.internal.ke r9 = r0.f19246i
            if (r9 != 0) goto L_0x0084
            java.lang.String r9 = r0.f19240c
            java.lang.String r10 = r0.f19239b
            com.google.ads.interactivemedia.v3.internal.ke r9 = com.google.ads.interactivemedia.p038v3.internal.C4251pa.m18468a(r2, r9, r10)
            r0.f19246i = r9
            com.google.ads.interactivemedia.v3.internal.rw r10 = r0.f19241d
            r10.mo13403a(r9)
        L_0x0084:
            int r9 = com.google.ads.interactivemedia.p038v3.internal.C4251pa.f18293a
            byte r9 = r2[r6]
            r10 = 31
            r12 = -1
            r13 = -2
            r14 = 5
            r15 = 6
            r16 = 7
            if (r9 == r13) goto L_0x00cc
            if (r9 == r12) goto L_0x00b6
            if (r9 == r10) goto L_0x00a4
            byte r3 = r2[r14]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            byte r4 = r2[r16]
            goto L_0x00d9
        L_0x00a4:
            byte r9 = r2[r15]
            r4 = r4 & r9
            int r4 = r4 << 12
            byte r9 = r2[r16]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r8
            r4 = r4 | r9
            byte r3 = r2[r3]
            r3 = r3 & 60
            int r3 = r3 >> r5
            r3 = r3 | r4
            goto L_0x00c9
        L_0x00b6:
            byte r3 = r2[r16]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            r4 = 9
            byte r4 = r2[r4]
            r4 = r4 & 60
            int r4 = r4 >> r5
            r3 = r3 | r4
        L_0x00c9:
            int r3 = r3 + r7
            r4 = 1
            goto L_0x00df
        L_0x00cc:
            byte r3 = r2[r8]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r16]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            byte r4 = r2[r15]
        L_0x00d9:
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> r8
            r3 = r3 | r4
            int r3 = r3 + r7
            r4 = 0
        L_0x00df:
            if (r4 == 0) goto L_0x00e5
            int r3 = r3 * 16
            int r3 = r3 / 14
        L_0x00e5:
            r0.f19247j = r3
            byte r3 = r2[r6]
            if (r3 == r13) goto L_0x0108
            if (r3 == r12) goto L_0x00fe
            if (r3 == r10) goto L_0x00f6
            byte r3 = r2[r8]
            r3 = r3 & r7
            int r3 = r3 << r15
            byte r2 = r2[r14]
            goto L_0x010e
        L_0x00f6:
            byte r3 = r2[r14]
            r3 = r3 & 7
            int r3 = r3 << r8
            byte r2 = r2[r15]
            goto L_0x0105
        L_0x00fe:
            byte r3 = r2[r8]
            r3 = r3 & 7
            int r3 = r3 << r8
            byte r2 = r2[r16]
        L_0x0105:
            r2 = r2 & 60
            goto L_0x0110
        L_0x0108:
            byte r3 = r2[r14]
            r3 = r3 & r7
            int r3 = r3 << r15
            byte r2 = r2[r8]
        L_0x010e:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x0110:
            int r2 = r2 >> r5
            r2 = r2 | r3
            int r2 = r2 + r7
            int r2 = r2 * 32
            long r2 = (long) r2
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r7
            com.google.ads.interactivemedia.v3.internal.ke r4 = r0.f19246i
            int r4 = r4.f17695z
            long r7 = (long) r4
            long r2 = r2 / r7
            int r3 = (int) r2
            long r2 = (long) r3
            r0.f19245h = r2
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19238a
            r2.mo13951i(r6)
            com.google.ads.interactivemedia.v3.internal.rw r2 = r0.f19241d
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19238a
            r2.mo13406d(r3, r11)
            r0.f19242e = r5
            goto L_0x0009
        L_0x0135:
            int r2 = r18.mo13947e()
            if (r2 <= 0) goto L_0x0009
            int r2 = r0.f19244g
            int r2 = r2 << r3
            r0.f19244g = r2
            int r9 = r18.mo13957o()
            r2 = r2 | r9
            r0.f19244g = r2
            int r9 = com.google.ads.interactivemedia.p038v3.internal.C4251pa.f18293a
            r9 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r9) goto L_0x015d
            r9 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r9) goto L_0x015d
            r9 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r9) goto L_0x015d
            r9 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r9) goto L_0x0135
        L_0x015d:
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19238a
            byte[] r2 = r2.mo13952j()
            int r3 = r0.f19244g
            int r9 = r3 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            int r9 = r3 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r7] = r9
            int r9 = r3 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r5] = r9
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2[r4] = r3
            r0.f19243f = r8
            r0.f19244g = r6
            r0.f19242e = r7
            goto L_0x0009
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4430vr.mo16710d(com.google.ads.interactivemedia.v3.internal.alw):void");
    }

    /* renamed from: e */
    public final void mo16711e() {
    }
}
