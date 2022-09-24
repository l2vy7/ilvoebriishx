package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.v2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8249v2 implements C8071q2 {

    /* renamed from: l */
    private static final float[] f40251l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C7743h4 f40252a;

    /* renamed from: b */
    private final uq2 f40253b = new uq2();

    /* renamed from: c */
    private final boolean[] f40254c = new boolean[4];

    /* renamed from: d */
    private final C8176t2 f40255d = new C8176t2(128);

    /* renamed from: e */
    private final C7706g3 f40256e = new C7706g3(178, 128);

    /* renamed from: f */
    private C8212u2 f40257f;

    /* renamed from: g */
    private long f40258g;

    /* renamed from: h */
    private String f40259h;

    /* renamed from: i */
    private ad4 f40260i;

    /* renamed from: j */
    private boolean f40261j;

    /* renamed from: k */
    private long f40262k = C6540C.TIME_UNSET;

    C8249v2(C7743h4 h4Var) {
        this.f40252a = h4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ce A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18072a(com.google.android.gms.internal.ads.uq2 r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.u2 r1 = r0.f40257f
            com.google.android.gms.internal.ads.nu1.m20743b(r1)
            com.google.android.gms.internal.ads.ad4 r1 = r0.f40260i
            com.google.android.gms.internal.ads.nu1.m20743b(r1)
            int r1 = r19.mo35241k()
            int r2 = r19.mo35242l()
            byte[] r3 = r19.mo35238h()
            long r4 = r0.f40258g
            int r6 = r19.mo35239i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f40258g = r4
            com.google.android.gms.internal.ads.ad4 r4 = r0.f40260i
            int r5 = r19.mo35239i()
            r6 = r19
            com.google.android.gms.internal.ads.yc4.m39857b(r4, r6, r5)
        L_0x002d:
            boolean[] r4 = r0.f40254c
            int r4 = com.google.android.gms.internal.ads.kh2.m33958a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.f40261j
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.t2 r4 = r0.f40255d
            r4.mo34852a(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.u2 r4 = r0.f40257f
            r4.mo35088a(r3, r1, r2)
            com.google.android.gms.internal.ads.g3 r4 = r0.f40256e
            r4.mo31999a(r3, r1, r2)
            return
        L_0x0049:
            int r5 = r4 + 3
            byte[] r7 = r19.mo35238h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f40261j
            if (r9 != 0) goto L_0x0181
            if (r8 <= 0) goto L_0x0060
            com.google.android.gms.internal.ads.t2 r9 = r0.f40255d
            r9.mo34852a(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.android.gms.internal.ads.t2 r12 = r0.f40255d
            boolean r9 = r12.mo34854c(r7, r9)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.internal.ads.ad4 r9 = r0.f40260i
            com.google.android.gms.internal.ads.t2 r12 = r0.f40255d
            int r13 = r12.f39250d
            java.lang.String r14 = r0.f40259h
            java.util.Objects.requireNonNull(r14)
            byte[] r15 = r12.f39251e
            int r12 = r12.f39249c
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.tp2 r15 = new com.google.android.gms.internal.ads.tp2
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.mo35016k(r13)
            r10 = 4
            r15.mo35016k(r10)
            r15.mo35014i()
            r13 = 8
            r15.mo35015j(r13)
            boolean r16 = r15.mo35017l()
            r11 = 3
            if (r16 == 0) goto L_0x00a2
            r15.mo35015j(r10)
            r15.mo35015j(r11)
        L_0x00a2:
            int r10 = r15.mo35008c(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r17 = r5
            r5 = 15
            if (r10 != r5) goto L_0x00c7
            r5 = 8
            int r10 = r15.mo35008c(r5)
            int r5 = r15.mo35008c(r5)
            if (r5 != 0) goto L_0x00c2
            android.util.Log.w(r13, r11)
            goto L_0x00d4
        L_0x00c2:
            float r10 = (float) r10
            float r5 = (float) r5
            float r16 = r10 / r5
            goto L_0x00ce
        L_0x00c7:
            r5 = 7
            if (r10 >= r5) goto L_0x00d1
            float[] r5 = f40251l
            r16 = r5[r10]
        L_0x00ce:
            r5 = r16
            goto L_0x00d6
        L_0x00d1:
            android.util.Log.w(r13, r11)
        L_0x00d4:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00d6:
            boolean r10 = r15.mo35017l()
            r11 = 2
            if (r10 == 0) goto L_0x0110
            r15.mo35015j(r11)
            r10 = 1
            r15.mo35015j(r10)
            boolean r10 = r15.mo35017l()
            if (r10 == 0) goto L_0x0110
            r10 = 15
            r15.mo35015j(r10)
            r15.mo35014i()
            r15.mo35015j(r10)
            r15.mo35014i()
            r15.mo35015j(r10)
            r15.mo35014i()
            r11 = 3
            r15.mo35015j(r11)
            r11 = 11
            r15.mo35015j(r11)
            r15.mo35014i()
            r15.mo35015j(r10)
            r15.mo35014i()
        L_0x0110:
            r10 = 2
            int r10 = r15.mo35008c(r10)
            if (r10 == 0) goto L_0x011c
            java.lang.String r10 = "Unhandled video object layer shape"
            android.util.Log.w(r13, r10)
        L_0x011c:
            r15.mo35014i()
            r10 = 16
            int r10 = r15.mo35008c(r10)
            r15.mo35014i()
            boolean r11 = r15.mo35017l()
            if (r11 == 0) goto L_0x0143
            if (r10 != 0) goto L_0x0136
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r13, r10)
            goto L_0x0143
        L_0x0136:
            int r10 = r10 + -1
            r11 = 0
        L_0x0139:
            if (r10 <= 0) goto L_0x0140
            int r11 = r11 + 1
            int r10 = r10 >> 1
            goto L_0x0139
        L_0x0140:
            r15.mo35015j(r11)
        L_0x0143:
            r15.mo35014i()
            r10 = 13
            int r11 = r15.mo35008c(r10)
            r15.mo35014i()
            int r10 = r15.mo35008c(r10)
            r15.mo35014i()
            r15.mo35014i()
            com.google.android.gms.internal.ads.ge4 r13 = new com.google.android.gms.internal.ads.ge4
            r13.<init>()
            r13.mo32081h(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.mo32093s(r14)
            r13.mo32098x(r11)
            r13.mo32077f(r10)
            r13.mo32090p(r5)
            java.util.List r5 = java.util.Collections.singletonList(r12)
            r13.mo32083i(r5)
            com.google.android.gms.internal.ads.w r5 = r13.mo32099y()
            r9.mo30354a(r5)
            r5 = 1
            r0.f40261j = r5
            goto L_0x0183
        L_0x0181:
            r17 = r5
        L_0x0183:
            com.google.android.gms.internal.ads.u2 r5 = r0.f40257f
            r5.mo35088a(r3, r1, r4)
            com.google.android.gms.internal.ads.g3 r5 = r0.f40256e
            if (r8 <= 0) goto L_0x0191
            r5.mo31999a(r3, r1, r4)
            r10 = 0
            goto L_0x0192
        L_0x0191:
            int r10 = -r8
        L_0x0192:
            com.google.android.gms.internal.ads.g3 r1 = r0.f40256e
            boolean r1 = r1.mo32002d(r10)
            if (r1 == 0) goto L_0x01b8
            com.google.android.gms.internal.ads.g3 r1 = r0.f40256e
            byte[] r5 = r1.f32121d
            int r1 = r1.f32122e
            int r1 = com.google.android.gms.internal.ads.kh2.m33959b(r5, r1)
            com.google.android.gms.internal.ads.uq2 r5 = r0.f40253b
            int r8 = com.google.android.gms.internal.ads.d13.f20195a
            com.google.android.gms.internal.ads.g3 r8 = r0.f40256e
            byte[] r8 = r8.f32121d
            r5.mo35234d(r8, r1)
            com.google.android.gms.internal.ads.h4 r1 = r0.f40252a
            long r8 = r0.f40262k
            com.google.android.gms.internal.ads.uq2 r5 = r0.f40253b
            r1.mo32328a(r8, r5)
        L_0x01b8:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x01ce
            byte[] r5 = r19.mo35238h()
            int r7 = r4 + 2
            byte r5 = r5[r7]
            r7 = 1
            if (r5 != r7) goto L_0x01cc
            com.google.android.gms.internal.ads.g3 r5 = r0.f40256e
            r5.mo32001c(r1)
        L_0x01cc:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x01ce:
            int r1 = r2 - r4
            long r4 = r0.f40258g
            com.google.android.gms.internal.ads.u2 r8 = r0.f40257f
            long r9 = (long) r1
            long r4 = r4 - r9
            boolean r9 = r0.f40261j
            r8.mo35089b(r4, r1, r9)
            com.google.android.gms.internal.ads.u2 r1 = r0.f40257f
            long r4 = r0.f40262k
            r1.mo35090c(r7, r4)
            r1 = r17
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8249v2.mo18072a(com.google.android.gms.internal.ads.uq2):void");
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f40259h = e4Var.mo31470b();
        ad4 m = yb4.mo18211m(e4Var.mo31469a(), 2);
        this.f40260i = m;
        this.f40257f = new C8212u2(m);
        this.f40252a.mo32329b(yb4, e4Var);
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if (j != C6540C.TIME_UNSET) {
            this.f40262k = j;
        }
    }

    public final void zzc() {
    }

    public final void zze() {
        kh2.m33962e(this.f40254c);
        this.f40255d.mo34853b();
        C8212u2 u2Var = this.f40257f;
        if (u2Var != null) {
            u2Var.mo35091d();
        }
        this.f40256e.mo32000b();
        this.f40258g = 0;
        this.f40262k = C6540C.TIME_UNSET;
    }
}
