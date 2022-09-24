package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.ads.c3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4609c3 implements C8071q2 {

    /* renamed from: a */
    private final C8142s3 f20159a;

    /* renamed from: b */
    private String f20160b;

    /* renamed from: c */
    private ad4 f20161c;

    /* renamed from: d */
    private C7525b3 f20162d;

    /* renamed from: e */
    private boolean f20163e;

    /* renamed from: f */
    private final boolean[] f20164f = new boolean[3];

    /* renamed from: g */
    private final C7706g3 f20165g = new C7706g3(32, 128);

    /* renamed from: h */
    private final C7706g3 f20166h = new C7706g3(33, 128);

    /* renamed from: i */
    private final C7706g3 f20167i = new C7706g3(34, 128);

    /* renamed from: j */
    private final C7706g3 f20168j = new C7706g3(39, 128);

    /* renamed from: k */
    private final C7706g3 f20169k = new C7706g3(40, 128);

    /* renamed from: l */
    private long f20170l;

    /* renamed from: m */
    private long f20171m = C6540C.TIME_UNSET;

    /* renamed from: n */
    private final uq2 f20172n = new uq2();

    public C4609c3(C8142s3 s3Var) {
        this.f20159a = s3Var;
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: d */
    private final void m20248d(byte[] bArr, int i, int i2) {
        this.f20162d.mo30611b(bArr, i, i2);
        if (!this.f20163e) {
            this.f20165g.mo31999a(bArr, i, i2);
            this.f20166h.mo31999a(bArr, i, i2);
            this.f20167i.mo31999a(bArr, i, i2);
        }
        this.f20168j.mo31999a(bArr, i, i2);
        this.f20169k.mo31999a(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18072a(com.google.android.gms.internal.ads.uq2 r37) {
        /*
            r36 = this;
            r0 = r36
            com.google.android.gms.internal.ads.ad4 r1 = r0.f20161c
            com.google.android.gms.internal.ads.nu1.m20743b(r1)
            int r1 = com.google.android.gms.internal.ads.d13.f20195a
        L_0x0009:
            int r1 = r37.mo35239i()
            if (r1 <= 0) goto L_0x03e4
            int r1 = r37.mo35241k()
            int r2 = r37.mo35242l()
            byte[] r3 = r37.mo35238h()
            long r4 = r0.f20170l
            int r6 = r37.mo35239i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f20170l = r4
            com.google.android.gms.internal.ads.ad4 r4 = r0.f20161c
            int r5 = r37.mo35239i()
            r6 = r37
            com.google.android.gms.internal.ads.yc4.m39857b(r4, r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.f20164f
            int r4 = com.google.android.gms.internal.ads.kh2.m33958a(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x03e1
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r1
            if (r9 <= 0) goto L_0x0049
            r0.m20248d(r3, r1, r4)
        L_0x0049:
            int r12 = r2 - r4
            long r10 = r0.f20170l
            long r13 = (long) r12
            long r10 = r10 - r13
            if (r9 >= 0) goto L_0x0053
            int r4 = -r9
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            long r13 = r0.f20171m
            com.google.android.gms.internal.ads.b3 r9 = r0.f20162d
            boolean r15 = r0.f20163e
            r9.mo30610a(r10, r12, r15)
            boolean r9 = r0.f20163e
            if (r9 != 0) goto L_0x0341
            com.google.android.gms.internal.ads.g3 r9 = r0.f20165g
            r9.mo32002d(r4)
            com.google.android.gms.internal.ads.g3 r9 = r0.f20166h
            r9.mo32002d(r4)
            com.google.android.gms.internal.ads.g3 r9 = r0.f20167i
            r9.mo32002d(r4)
            com.google.android.gms.internal.ads.g3 r9 = r0.f20165g
            boolean r9 = r9.mo32003e()
            if (r9 == 0) goto L_0x0341
            com.google.android.gms.internal.ads.g3 r9 = r0.f20166h
            boolean r9 = r9.mo32003e()
            if (r9 == 0) goto L_0x0341
            com.google.android.gms.internal.ads.g3 r9 = r0.f20167i
            boolean r9 = r9.mo32003e()
            if (r9 == 0) goto L_0x0341
            com.google.android.gms.internal.ads.ad4 r9 = r0.f20161c
            java.lang.String r8 = r0.f20160b
            com.google.android.gms.internal.ads.g3 r15 = r0.f20165g
            com.google.android.gms.internal.ads.g3 r1 = r0.f20166h
            r18 = r5
            com.google.android.gms.internal.ads.g3 r5 = r0.f20167i
            int r6 = r15.f32122e
            r19 = r2
            int r2 = r1.f32122e
            int r2 = r2 + r6
            r20 = r3
            int r3 = r5.f32122e
            int r2 = r2 + r3
            byte[] r2 = new byte[r2]
            byte[] r3 = r15.f32121d
            r21 = r7
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r2, r7, r6)
            byte[] r3 = r1.f32121d
            int r6 = r15.f32122e
            r17 = r12
            int r12 = r1.f32122e
            java.lang.System.arraycopy(r3, r7, r2, r6, r12)
            byte[] r3 = r5.f32121d
            int r6 = r15.f32122e
            int r12 = r1.f32122e
            int r6 = r6 + r12
            int r5 = r5.f32122e
            java.lang.System.arraycopy(r3, r7, r2, r6, r5)
            com.google.android.gms.internal.ads.vr2 r3 = new com.google.android.gms.internal.ads.vr2
            byte[] r5 = r1.f32121d
            int r1 = r1.f32122e
            r3.<init>(r5, r7, r1)
            r1 = 44
            r3.mo35479e(r1)
            r1 = 3
            int r5 = r3.mo35475a(r1)
            r3.mo35478d()
            r6 = 2
            int r22 = r3.mo35475a(r6)
            boolean r23 = r3.mo35480f()
            r12 = 5
            int r24 = r3.mo35475a(r12)
            r12 = 0
            r25 = 0
        L_0x00e8:
            r15 = 32
            if (r12 >= r15) goto L_0x00fa
            boolean r15 = r3.mo35480f()
            if (r15 == 0) goto L_0x00f7
            r15 = 1
            int r26 = r15 << r12
            r25 = r25 | r26
        L_0x00f7:
            int r12 = r12 + 1
            goto L_0x00e8
        L_0x00fa:
            r12 = 6
            int[] r15 = new int[r12]
        L_0x00fd:
            r6 = 8
            if (r7 >= r12) goto L_0x010a
            int r6 = r3.mo35475a(r6)
            r15[r7] = r6
            int r7 = r7 + 1
            goto L_0x00fd
        L_0x010a:
            int r7 = r3.mo35475a(r6)
            r6 = 0
            r12 = 0
        L_0x0110:
            if (r6 >= r5) goto L_0x0125
            boolean r29 = r3.mo35480f()
            if (r29 == 0) goto L_0x011a
            int r12 = r12 + 89
        L_0x011a:
            boolean r29 = r3.mo35480f()
            if (r29 == 0) goto L_0x0122
            int r12 = r12 + 8
        L_0x0122:
            int r6 = r6 + 1
            goto L_0x0110
        L_0x0125:
            r3.mo35479e(r12)
            if (r5 <= 0) goto L_0x0130
            int r6 = 8 - r5
            int r6 = r6 + r6
            r3.mo35479e(r6)
        L_0x0130:
            r3.mo35477c()
            int r6 = r3.mo35477c()
            if (r6 != r1) goto L_0x013d
            r3.mo35478d()
            r6 = 3
        L_0x013d:
            int r12 = r3.mo35477c()
            int r29 = r3.mo35477c()
            boolean r30 = r3.mo35480f()
            if (r30 == 0) goto L_0x017f
            int r30 = r3.mo35477c()
            int r31 = r3.mo35477c()
            int r32 = r3.mo35477c()
            int r33 = r3.mo35477c()
            r1 = 1
            if (r6 == r1) goto L_0x016a
            r1 = 2
            if (r6 != r1) goto L_0x0166
            r34 = r10
            r1 = 2
            r6 = 2
            goto L_0x016d
        L_0x0166:
            r34 = r10
            r1 = 1
            goto L_0x016d
        L_0x016a:
            r34 = r10
            r1 = 2
        L_0x016d:
            r10 = 1
            if (r6 != r10) goto L_0x0172
            r6 = 2
            goto L_0x0173
        L_0x0172:
            r6 = 1
        L_0x0173:
            int r30 = r30 + r31
            int r1 = r1 * r30
            int r12 = r12 - r1
            int r32 = r32 + r33
            int r6 = r6 * r32
            int r29 = r29 - r6
            goto L_0x0181
        L_0x017f:
            r34 = r10
        L_0x0181:
            r3.mo35477c()
            r3.mo35477c()
            int r1 = r3.mo35477c()
            boolean r6 = r3.mo35480f()
            r10 = 1
            if (r10 == r6) goto L_0x0194
            r6 = r5
            goto L_0x0195
        L_0x0194:
            r6 = 0
        L_0x0195:
            if (r6 > r5) goto L_0x01a3
            r3.mo35477c()
            r3.mo35477c()
            r3.mo35477c()
            int r6 = r6 + 1
            goto L_0x0195
        L_0x01a3:
            r3.mo35477c()
            r3.mo35477c()
            r3.mo35477c()
            r3.mo35477c()
            r3.mo35477c()
            r3.mo35477c()
            boolean r5 = r3.mo35480f()
            r6 = 4
            if (r5 == 0) goto L_0x0204
            boolean r5 = r3.mo35480f()
            if (r5 == 0) goto L_0x0204
            r5 = 0
        L_0x01c3:
            if (r5 >= r6) goto L_0x0204
            r10 = 0
        L_0x01c6:
            r11 = 6
            if (r10 >= r11) goto L_0x01fd
            boolean r28 = r3.mo35480f()
            if (r28 != 0) goto L_0x01d6
            r3.mo35477c()
            r32 = r13
        L_0x01d4:
            r6 = 3
            goto L_0x01f3
        L_0x01d6:
            r11 = 64
            int r30 = r5 + r5
            int r30 = r30 + 4
            r32 = r13
            r6 = 1
            int r13 = r6 << r30
            int r11 = java.lang.Math.min(r11, r13)
            if (r5 <= r6) goto L_0x01ea
            r3.mo35476b()
        L_0x01ea:
            r6 = 0
        L_0x01eb:
            if (r6 >= r11) goto L_0x01d4
            r3.mo35476b()
            int r6 = r6 + 1
            goto L_0x01eb
        L_0x01f3:
            if (r5 != r6) goto L_0x01f7
            r11 = 3
            goto L_0x01f8
        L_0x01f7:
            r11 = 1
        L_0x01f8:
            int r10 = r10 + r11
            r13 = r32
            r6 = 4
            goto L_0x01c6
        L_0x01fd:
            r32 = r13
            r6 = 3
            int r5 = r5 + 1
            r6 = 4
            goto L_0x01c3
        L_0x0204:
            r32 = r13
            r5 = 2
            r3.mo35479e(r5)
            boolean r5 = r3.mo35480f()
            if (r5 == 0) goto L_0x021e
            r5 = 8
            r3.mo35479e(r5)
            r3.mo35477c()
            r3.mo35477c()
            r3.mo35478d()
        L_0x021e:
            int r5 = r3.mo35477c()
            r6 = 0
            r10 = 0
            r11 = 0
        L_0x0225:
            if (r6 >= r5) goto L_0x0271
            if (r6 == 0) goto L_0x022d
            boolean r10 = r3.mo35480f()
        L_0x022d:
            if (r10 == 0) goto L_0x0247
            r3.mo35478d()
            r3.mo35477c()
            r13 = 0
        L_0x0236:
            if (r13 > r11) goto L_0x0244
            boolean r14 = r3.mo35480f()
            if (r14 == 0) goto L_0x0241
            r3.mo35478d()
        L_0x0241:
            int r13 = r13 + 1
            goto L_0x0236
        L_0x0244:
            r28 = r5
            goto L_0x026c
        L_0x0247:
            int r11 = r3.mo35477c()
            int r13 = r3.mo35477c()
            int r14 = r11 + r13
            r28 = r5
            r5 = 0
        L_0x0254:
            if (r5 >= r11) goto L_0x025f
            r3.mo35477c()
            r3.mo35478d()
            int r5 = r5 + 1
            goto L_0x0254
        L_0x025f:
            r5 = 0
        L_0x0260:
            if (r5 >= r13) goto L_0x026b
            r3.mo35477c()
            r3.mo35478d()
            int r5 = r5 + 1
            goto L_0x0260
        L_0x026b:
            r11 = r14
        L_0x026c:
            int r6 = r6 + 1
            r5 = r28
            goto L_0x0225
        L_0x0271:
            boolean r5 = r3.mo35480f()
            if (r5 == 0) goto L_0x0287
            r5 = 0
        L_0x0278:
            int r6 = r3.mo35477c()
            if (r5 >= r6) goto L_0x0287
            r6 = 5
            int r10 = r1 + 5
            r3.mo35479e(r10)
            int r5 = r5 + 1
            goto L_0x0278
        L_0x0287:
            r1 = 2
            r3.mo35479e(r1)
            boolean r1 = r3.mo35480f()
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x030c
            boolean r1 = r3.mo35480f()
            if (r1 == 0) goto L_0x02d7
            r1 = 8
            int r1 = r3.mo35475a(r1)
            r6 = 255(0xff, float:3.57E-43)
            if (r1 != r6) goto L_0x02b5
            r1 = 16
            int r6 = r3.mo35475a(r1)
            int r1 = r3.mo35475a(r1)
            if (r6 == 0) goto L_0x02d7
            if (r1 == 0) goto L_0x02d7
            float r5 = (float) r6
            float r1 = (float) r1
            float r5 = r5 / r1
            goto L_0x02d7
        L_0x02b5:
            r6 = 17
            if (r1 >= r6) goto L_0x02bf
            float[] r5 = com.google.android.gms.internal.ads.kh2.f34334b
            r1 = r5[r1]
            r5 = r1
            goto L_0x02d7
        L_0x02bf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r10 = 46
            r6.<init>(r10)
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r6.append(r10)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r6 = "H265Reader"
            android.util.Log.w(r6, r1)
        L_0x02d7:
            boolean r1 = r3.mo35480f()
            if (r1 == 0) goto L_0x02e0
            r3.mo35478d()
        L_0x02e0:
            boolean r1 = r3.mo35480f()
            if (r1 == 0) goto L_0x02f5
            r1 = 4
            r3.mo35479e(r1)
            boolean r1 = r3.mo35480f()
            if (r1 == 0) goto L_0x02f5
            r1 = 24
            r3.mo35479e(r1)
        L_0x02f5:
            boolean r1 = r3.mo35480f()
            if (r1 == 0) goto L_0x0301
            r3.mo35477c()
            r3.mo35477c()
        L_0x0301:
            r3.mo35478d()
            boolean r1 = r3.mo35480f()
            if (r1 == 0) goto L_0x030c
            int r29 = r29 + r29
        L_0x030c:
            r1 = r29
            r26 = r15
            r27 = r7
            java.lang.String r3 = com.google.android.gms.internal.ads.qw1.m36769b(r22, r23, r24, r25, r26, r27)
            com.google.android.gms.internal.ads.ge4 r6 = new com.google.android.gms.internal.ads.ge4
            r6.<init>()
            r6.mo32081h(r8)
            java.lang.String r7 = "video/hevc"
            r6.mo32093s(r7)
            r6.mo32078f0(r3)
            r6.mo32098x(r12)
            r6.mo32077f(r1)
            r6.mo32090p(r5)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r6.mo32083i(r1)
            com.google.android.gms.internal.ads.w r1 = r6.mo32099y()
            r9.mo30354a(r1)
            r1 = 1
            r0.f20163e = r1
            goto L_0x034f
        L_0x0341:
            r19 = r2
            r20 = r3
            r18 = r5
            r21 = r7
            r34 = r10
            r17 = r12
            r32 = r13
        L_0x034f:
            com.google.android.gms.internal.ads.g3 r1 = r0.f20168j
            boolean r1 = r1.mo32002d(r4)
            if (r1 == 0) goto L_0x037a
            com.google.android.gms.internal.ads.g3 r1 = r0.f20168j
            byte[] r2 = r1.f32121d
            int r1 = r1.f32122e
            int r1 = com.google.android.gms.internal.ads.kh2.m33959b(r2, r1)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20172n
            com.google.android.gms.internal.ads.g3 r3 = r0.f20168j
            byte[] r3 = r3.f32121d
            r2.mo35234d(r3, r1)
            com.google.android.gms.internal.ads.uq2 r1 = r0.f20172n
            r2 = 5
            r1.mo35237g(r2)
            com.google.android.gms.internal.ads.s3 r1 = r0.f20159a
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20172n
            r5 = r32
            r1.mo34654a(r5, r2)
            goto L_0x037c
        L_0x037a:
            r5 = r32
        L_0x037c:
            com.google.android.gms.internal.ads.g3 r1 = r0.f20169k
            boolean r1 = r1.mo32002d(r4)
            if (r1 == 0) goto L_0x03a4
            com.google.android.gms.internal.ads.g3 r1 = r0.f20169k
            byte[] r2 = r1.f32121d
            int r1 = r1.f32122e
            int r1 = com.google.android.gms.internal.ads.kh2.m33959b(r2, r1)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20172n
            com.google.android.gms.internal.ads.g3 r3 = r0.f20169k
            byte[] r3 = r3.f32121d
            r2.mo35234d(r3, r1)
            com.google.android.gms.internal.ads.uq2 r1 = r0.f20172n
            r2 = 5
            r1.mo35237g(r2)
            com.google.android.gms.internal.ads.s3 r1 = r0.f20159a
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20172n
            r1.mo34654a(r5, r2)
        L_0x03a4:
            long r14 = r0.f20171m
            com.google.android.gms.internal.ads.b3 r9 = r0.f20162d
            boolean r1 = r0.f20163e
            r10 = r34
            r12 = r17
            r13 = r21
            r16 = r1
            r9.mo30613d(r10, r12, r13, r14, r16)
            boolean r1 = r0.f20163e
            if (r1 != 0) goto L_0x03cb
            com.google.android.gms.internal.ads.g3 r1 = r0.f20165g
            r2 = r21
            r1.mo32001c(r2)
            com.google.android.gms.internal.ads.g3 r1 = r0.f20166h
            r1.mo32001c(r2)
            com.google.android.gms.internal.ads.g3 r1 = r0.f20167i
            r1.mo32001c(r2)
            goto L_0x03cd
        L_0x03cb:
            r2 = r21
        L_0x03cd:
            com.google.android.gms.internal.ads.g3 r1 = r0.f20168j
            r1.mo32001c(r2)
            com.google.android.gms.internal.ads.g3 r1 = r0.f20169k
            r1.mo32001c(r2)
            r6 = r37
            r1 = r18
            r2 = r19
            r3 = r20
            goto L_0x0030
        L_0x03e1:
            r0.m20248d(r3, r1, r2)
        L_0x03e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4609c3.mo18072a(com.google.android.gms.internal.ads.uq2):void");
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f20160b = e4Var.mo31470b();
        ad4 m = yb4.mo18211m(e4Var.mo31469a(), 2);
        this.f20161c = m;
        this.f20162d = new C7525b3(m);
        this.f20159a.mo34655b(yb4, e4Var);
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if (j != C6540C.TIME_UNSET) {
            this.f20171m = j;
        }
    }

    public final void zzc() {
    }

    public final void zze() {
        this.f20170l = 0;
        this.f20171m = C6540C.TIME_UNSET;
        kh2.m33962e(this.f20164f);
        this.f20165g.mo32000b();
        this.f20166h.mo32000b();
        this.f20167i.mo32000b();
        this.f20168j.mo32000b();
        this.f20169k.mo32000b();
        C7525b3 b3Var = this.f20162d;
        if (b3Var != null) {
            b3Var.mo30612c();
        }
    }
}
