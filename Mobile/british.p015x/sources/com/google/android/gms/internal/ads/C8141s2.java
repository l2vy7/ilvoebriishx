package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.s2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8141s2 implements C8071q2 {

    /* renamed from: q */
    private static final double[] f38837q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f38838a;

    /* renamed from: b */
    private ad4 f38839b;

    /* renamed from: c */
    private final C7743h4 f38840c;

    /* renamed from: d */
    private final uq2 f38841d;

    /* renamed from: e */
    private final C7706g3 f38842e;

    /* renamed from: f */
    private final boolean[] f38843f = new boolean[4];

    /* renamed from: g */
    private final C8107r2 f38844g = new C8107r2(128);

    /* renamed from: h */
    private long f38845h;

    /* renamed from: i */
    private boolean f38846i;

    /* renamed from: j */
    private boolean f38847j;

    /* renamed from: k */
    private long f38848k;

    /* renamed from: l */
    private long f38849l;

    /* renamed from: m */
    private long f38850m;

    /* renamed from: n */
    private long f38851n;

    /* renamed from: o */
    private boolean f38852o;

    /* renamed from: p */
    private boolean f38853p;

    C8141s2(C7743h4 h4Var) {
        uq2 uq2;
        this.f38840c = h4Var;
        if (h4Var != null) {
            this.f38842e = new C7706g3(178, 128);
            uq2 = new uq2();
        } else {
            uq2 = null;
            this.f38842e = null;
        }
        this.f38841d = uq2;
        this.f38849l = C6540C.TIME_UNSET;
        this.f38851n = C6540C.TIME_UNSET;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18072a(com.google.android.gms.internal.ads.uq2 r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.ad4 r1 = r0.f38839b
            com.google.android.gms.internal.ads.nu1.m20743b(r1)
            int r1 = r20.mo35241k()
            int r2 = r20.mo35242l()
            byte[] r3 = r20.mo35238h()
            long r4 = r0.f38845h
            int r6 = r20.mo35239i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f38845h = r4
            com.google.android.gms.internal.ads.ad4 r4 = r0.f38839b
            int r5 = r20.mo35239i()
            r6 = r20
            com.google.android.gms.internal.ads.yc4.m39857b(r4, r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f38843f
            int r4 = com.google.android.gms.internal.ads.kh2.m33958a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f38847j
            if (r4 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.r2 r4 = r0.f38844g
            r4.mo34495a(r3, r1, r2)
        L_0x0039:
            com.google.android.gms.internal.ads.g3 r4 = r0.f38842e
            if (r4 == 0) goto L_0x0040
            r4.mo31999a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            int r5 = r4 + 3
            byte[] r7 = r20.mo35238h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f38847j
            if (r9 != 0) goto L_0x0136
            if (r8 <= 0) goto L_0x0058
            com.google.android.gms.internal.ads.r2 r9 = r0.f38844g
            r9.mo34495a(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.r2 r12 = r0.f38844g
            boolean r9 = r12.mo34497c(r7, r9)
            if (r9 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.r2 r9 = r0.f38844g
            java.lang.String r12 = r0.f38838a
            java.util.Objects.requireNonNull(r12)
            byte[] r13 = r9.f38506d
            int r14 = r9.f38504b
            byte[] r13 = java.util.Arrays.copyOf(r13, r14)
            r14 = 4
            byte r15 = r13[r14]
            r16 = 5
            byte r10 = r13[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r14
            int r17 = r10 >> 4
            r15 = r15 | r17
            r10 = r10 & 15
            r11 = 8
            int r10 = r10 << r11
            r18 = 6
            byte r11 = r13[r18]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10 = r10 | r11
            r11 = 7
            byte r14 = r13[r11]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            r11 = 4
            int r14 = r14 >> r11
            r11 = 2
            if (r14 == r11) goto L_0x00af
            r11 = 3
            if (r14 == r11) goto L_0x00a9
            r11 = 4
            if (r14 == r11) goto L_0x00a3
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b6
        L_0x00a3:
            int r11 = r10 * 121
            float r11 = (float) r11
            int r14 = r15 * 100
            goto L_0x00b4
        L_0x00a9:
            int r11 = r10 * 16
            float r11 = (float) r11
            int r14 = r15 * 9
            goto L_0x00b4
        L_0x00af:
            int r11 = r10 * 4
            float r11 = (float) r11
            int r14 = r15 * 3
        L_0x00b4:
            float r14 = (float) r14
            float r11 = r11 / r14
        L_0x00b6:
            com.google.android.gms.internal.ads.ge4 r14 = new com.google.android.gms.internal.ads.ge4
            r14.<init>()
            r14.mo32081h(r12)
            java.lang.String r12 = "video/mpeg2"
            r14.mo32093s(r12)
            r14.mo32098x(r15)
            r14.mo32077f(r10)
            r14.mo32090p(r11)
            java.util.List r10 = java.util.Collections.singletonList(r13)
            r14.mo32083i(r10)
            com.google.android.gms.internal.ads.w r10 = r14.mo32099y()
            r11 = 7
            byte r11 = r13[r11]
            r11 = r11 & 15
            int r11 = r11 + -1
            r14 = 0
            if (r11 < 0) goto L_0x0115
            r12 = 8
            if (r11 >= r12) goto L_0x0115
            double[] r12 = f38837q
            r11 = r12[r11]
            int r9 = r9.f38505c
            int r9 = r9 + 9
            byte r9 = r13[r9]
            r13 = r9 & 96
            int r13 = r13 >> 5
            r9 = r9 & 31
            if (r13 == r9) goto L_0x010b
            double r13 = (double) r13
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r13)
            double r13 = r13 + r15
            int r9 = r9 + 1
            r16 = r5
            double r5 = (double) r9
            java.lang.Double.isNaN(r5)
            double r13 = r13 / r5
            double r11 = r11 * r13
            goto L_0x010d
        L_0x010b:
            r16 = r5
        L_0x010d:
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r5 = r5 / r11
            long r14 = (long) r5
            goto L_0x0117
        L_0x0115:
            r16 = r5
        L_0x0117:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            android.util.Pair r5 = android.util.Pair.create(r10, r5)
            com.google.android.gms.internal.ads.ad4 r6 = r0.f38839b
            java.lang.Object r9 = r5.first
            com.google.android.gms.internal.ads.w r9 = (com.google.android.gms.internal.ads.C8281w) r9
            r6.mo30354a(r9)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0.f38848k = r5
            r5 = 1
            r0.f38847j = r5
            goto L_0x0138
        L_0x0136:
            r16 = r5
        L_0x0138:
            com.google.android.gms.internal.ads.g3 r5 = r0.f38842e
            r6 = 178(0xb2, float:2.5E-43)
            if (r5 == 0) goto L_0x0180
            if (r8 <= 0) goto L_0x0145
            r5.mo31999a(r3, r1, r4)
            r1 = 0
            goto L_0x0146
        L_0x0145:
            int r1 = -r8
        L_0x0146:
            com.google.android.gms.internal.ads.g3 r5 = r0.f38842e
            boolean r1 = r5.mo32002d(r1)
            if (r1 == 0) goto L_0x016c
            com.google.android.gms.internal.ads.g3 r1 = r0.f38842e
            byte[] r5 = r1.f32121d
            int r1 = r1.f32122e
            int r1 = com.google.android.gms.internal.ads.kh2.m33959b(r5, r1)
            com.google.android.gms.internal.ads.uq2 r5 = r0.f38841d
            int r8 = com.google.android.gms.internal.ads.d13.f20195a
            com.google.android.gms.internal.ads.g3 r8 = r0.f38842e
            byte[] r8 = r8.f32121d
            r5.mo35234d(r8, r1)
            com.google.android.gms.internal.ads.h4 r1 = r0.f38840c
            long r8 = r0.f38851n
            com.google.android.gms.internal.ads.uq2 r5 = r0.f38841d
            r1.mo32328a(r8, r5)
        L_0x016c:
            if (r7 != r6) goto L_0x0180
            byte[] r1 = r20.mo35238h()
            int r5 = r4 + 2
            byte r1 = r1[r5]
            r5 = 1
            if (r1 != r5) goto L_0x017e
            com.google.android.gms.internal.ads.g3 r1 = r0.f38842e
            r1.mo32001c(r6)
        L_0x017e:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x0180:
            if (r7 == 0) goto L_0x018f
            r1 = 179(0xb3, float:2.51E-43)
            if (r7 != r1) goto L_0x0187
            goto L_0x018f
        L_0x0187:
            r1 = 184(0xb8, float:2.58E-43)
            if (r7 != r1) goto L_0x01ea
            r1 = 1
            r0.f38852o = r1
            goto L_0x01ea
        L_0x018f:
            int r1 = r2 - r4
            boolean r4 = r0.f38853p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x01b5
            boolean r4 = r0.f38847j
            if (r4 == 0) goto L_0x01b5
            long r9 = r0.f38851n
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01b5
            boolean r11 = r0.f38852o
            long r12 = r0.f38845h
            long r14 = r0.f38850m
            com.google.android.gms.internal.ads.ad4 r8 = r0.f38839b
            long r12 = r12 - r14
            int r4 = (int) r12
            int r12 = r4 - r1
            r14 = 0
            r13 = r1
            r8.mo30358e(r9, r11, r12, r13, r14)
        L_0x01b5:
            boolean r4 = r0.f38846i
            if (r4 == 0) goto L_0x01c1
            boolean r4 = r0.f38853p
            if (r4 == 0) goto L_0x01be
            goto L_0x01c1
        L_0x01be:
            r1 = 0
            r4 = 1
            goto L_0x01e3
        L_0x01c1:
            long r8 = r0.f38845h
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.f38850m = r8
            long r8 = r0.f38849l
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01ce
            goto L_0x01d9
        L_0x01ce:
            long r8 = r0.f38851n
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01d8
            long r10 = r0.f38848k
            long r8 = r8 + r10
            goto L_0x01d9
        L_0x01d8:
            r8 = r5
        L_0x01d9:
            r0.f38851n = r8
            r1 = 0
            r0.f38852o = r1
            r0.f38849l = r5
            r4 = 1
            r0.f38846i = r4
        L_0x01e3:
            if (r7 != 0) goto L_0x01e7
            r10 = 1
            goto L_0x01e8
        L_0x01e7:
            r10 = 0
        L_0x01e8:
            r0.f38853p = r10
        L_0x01ea:
            r6 = r20
            r1 = r16
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8141s2.mo18072a(com.google.android.gms.internal.ads.uq2):void");
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f38838a = e4Var.mo31470b();
        this.f38839b = yb4.mo18211m(e4Var.mo31469a(), 2);
        C7743h4 h4Var = this.f38840c;
        if (h4Var != null) {
            h4Var.mo32329b(yb4, e4Var);
        }
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        this.f38849l = j;
    }

    public final void zzc() {
    }

    public final void zze() {
        kh2.m33962e(this.f38843f);
        this.f38844g.mo34496b();
        C7706g3 g3Var = this.f38842e;
        if (g3Var != null) {
            g3Var.mo32000b();
        }
        this.f38845h = 0;
        this.f38846i = false;
        this.f38849l = C6540C.TIME_UNSET;
        this.f38851n = C6540C.TIME_UNSET;
    }
}
