package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.d2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4611d2 extends C4607b2 {

    /* renamed from: n */
    private C7560c2 f20210n;

    /* renamed from: o */
    private int f20211o;

    /* renamed from: p */
    private boolean f20212p;

    /* renamed from: q */
    private ed4 f20213q;

    /* renamed from: r */
    private cd4 f20214r;

    C4611d2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo18108a(uq2 uq2) {
        int i;
        int i2 = 0;
        if ((uq2.mo35238h()[0] & 1) == 1) {
            return -1;
        }
        byte b = uq2.mo35238h()[0];
        C7560c2 c2Var = this.f20210n;
        nu1.m20743b(c2Var);
        if (!c2Var.f30206d[(b >> 1) & (255 >>> (8 - c2Var.f30207e))].f30723a) {
            i = c2Var.f30203a.f31328e;
        } else {
            i = c2Var.f30203a.f31329f;
        }
        if (this.f20212p) {
            i2 = (this.f20211o + i) / 4;
        }
        long j = (long) i2;
        if (uq2.mo35240j() < uq2.mo35242l() + 4) {
            byte[] copyOf = Arrays.copyOf(uq2.mo35238h(), uq2.mo35242l() + 4);
            uq2.mo35234d(copyOf, copyOf.length);
        } else {
            uq2.mo35235e(uq2.mo35242l() + 4);
        }
        byte[] h = uq2.mo35238h();
        h[uq2.mo35242l() - 4] = (byte) ((int) (j & 255));
        h[uq2.mo35242l() - 3] = (byte) ((int) ((j >>> 8) & 255));
        h[uq2.mo35242l() - 2] = (byte) ((int) ((j >>> 16) & 255));
        h[uq2.mo35242l() - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f20212p = true;
        this.f20211o = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18109b(boolean z) {
        super.mo18109b(z);
        if (z) {
            this.f20210n = null;
            this.f20213q = null;
            this.f20214r = null;
        }
        this.f20211o = 0;
        this.f20212p = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x040c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x040e  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18110c(com.google.android.gms.internal.ads.uq2 r26, long r27, com.google.android.gms.internal.ads.C8318x1 r29) throws java.io.IOException {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r29
            com.google.android.gms.internal.ads.c2 r3 = r0.f20210n
            r4 = 0
            if (r3 == 0) goto L_0x0011
            com.google.android.gms.internal.ads.w r1 = r2.f40980a
            java.util.Objects.requireNonNull(r1)
            return r4
        L_0x0011:
            com.google.android.gms.internal.ads.ed4 r6 = r0.f20213q
            r5 = 4
            r11 = 1
            if (r6 != 0) goto L_0x0084
            com.google.android.gms.internal.ads.fd4.m32129c(r11, r1, r4)
            int r13 = r26.mo35246p()
            int r14 = r26.mo35249s()
            int r15 = r26.mo35246p()
            int r6 = r26.mo35245o()
            if (r6 > 0) goto L_0x002f
            r16 = -1
            goto L_0x0031
        L_0x002f:
            r16 = r6
        L_0x0031:
            int r6 = r26.mo35245o()
            if (r6 > 0) goto L_0x003a
            r17 = -1
            goto L_0x003c
        L_0x003a:
            r17 = r6
        L_0x003c:
            int r6 = r26.mo35245o()
            if (r6 > 0) goto L_0x0045
            r18 = -1
            goto L_0x0047
        L_0x0045:
            r18 = r6
        L_0x0047:
            int r3 = r26.mo35249s()
            r6 = r3 & 15
            double r8 = (double) r6
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r11, r8)
            int r6 = (int) r8
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> r5
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r11, r8)
            int r3 = (int) r8
            int r5 = r26.mo35249s()
            byte[] r8 = r26.mo35238h()
            int r1 = r26.mo35242l()
            byte[] r22 = java.util.Arrays.copyOf(r8, r1)
            com.google.android.gms.internal.ads.ed4 r1 = new com.google.android.gms.internal.ads.ed4
            r8 = 1
            r5 = r5 & r8
            if (r8 == r5) goto L_0x0077
            r21 = 0
            goto L_0x0079
        L_0x0077:
            r21 = 1
        L_0x0079:
            r12 = r1
            r19 = r6
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.f20213q = r1
            goto L_0x008f
        L_0x0084:
            com.google.android.gms.internal.ads.cd4 r8 = r0.f20214r
            if (r8 != 0) goto L_0x0092
            r9 = 1
            com.google.android.gms.internal.ads.cd4 r1 = com.google.android.gms.internal.ads.fd4.m32128b(r1, r9, r9)
            r0.f20214r = r1
        L_0x008f:
            r7 = 0
            goto L_0x0408
        L_0x0092:
            int r9 = r26.mo35242l()
            byte[] r9 = new byte[r9]
            byte[] r10 = r26.mo35238h()
            int r11 = r26.mo35242l()
            java.lang.System.arraycopy(r10, r4, r9, r4, r11)
            int r10 = r6.f31324a
            r11 = 5
            com.google.android.gms.internal.ads.fd4.m32129c(r11, r1, r4)
            int r12 = r26.mo35249s()
            r13 = 1
            int r12 = r12 + r13
            com.google.android.gms.internal.ads.bd4 r13 = new com.google.android.gms.internal.ads.bd4
            byte[] r14 = r26.mo35238h()
            r13.<init>(r14)
            int r1 = r26.mo35241k()
            r14 = 8
            int r1 = r1 * 8
            r13.mo30663c(r1)
            r1 = 0
        L_0x00c4:
            r15 = 24
            r3 = 16
            if (r1 >= r12) goto L_0x01e6
            int r14 = r13.mo30662b(r15)
            r7 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r7) goto L_0x01c9
            int r3 = r13.mo30662b(r3)
            int r7 = r13.mo30662b(r15)
            long[] r14 = new long[r7]
            boolean r15 = r13.mo30664d()
            r18 = 0
            if (r15 != 0) goto L_0x0122
            boolean r15 = r13.mo30664d()
            r4 = 0
        L_0x00ea:
            if (r4 >= r7) goto L_0x011f
            if (r15 == 0) goto L_0x010a
            boolean r21 = r13.mo30664d()
            if (r21 == 0) goto L_0x0102
            int r21 = r13.mo30662b(r11)
            r22 = 1
            int r5 = r21 + 1
            r23 = r12
            long r11 = (long) r5
            r14[r4] = r11
            goto L_0x0108
        L_0x0102:
            r23 = r12
            r22 = 1
            r14[r4] = r18
        L_0x0108:
            r5 = 5
            goto L_0x0118
        L_0x010a:
            r23 = r12
            r5 = 5
            r22 = 1
            int r11 = r13.mo30662b(r5)
            int r11 = r11 + 1
            long r11 = (long) r11
            r14[r4] = r11
        L_0x0118:
            int r4 = r4 + 1
            r12 = r23
            r5 = 4
            r11 = 5
            goto L_0x00ea
        L_0x011f:
            r23 = r12
            goto L_0x015a
        L_0x0122:
            r23 = r12
            r5 = 5
            r22 = 1
            int r4 = r13.mo30662b(r5)
            int r4 = r4 + 1
            r5 = 0
        L_0x012e:
            if (r5 >= r7) goto L_0x015a
            int r11 = r7 - r5
            int r11 = com.google.android.gms.internal.ads.fd4.m32127a(r11)
            int r11 = r13.mo30662b(r11)
            r12 = 0
        L_0x013b:
            if (r12 >= r11) goto L_0x014f
            if (r5 >= r7) goto L_0x014f
            r22 = r8
            r24 = r9
            long r8 = (long) r4
            r14[r5] = r8
            int r5 = r5 + 1
            int r12 = r12 + 1
            r8 = r22
            r9 = r24
            goto L_0x013b
        L_0x014f:
            r22 = r8
            r24 = r9
            int r4 = r4 + 1
            r8 = r22
            r9 = r24
            goto L_0x012e
        L_0x015a:
            r22 = r8
            r24 = r9
            r4 = 4
            int r5 = r13.mo30662b(r4)
            r8 = 2
            if (r5 > r8) goto L_0x01b0
            r9 = 1
            if (r5 == r9) goto L_0x016c
            if (r5 != r8) goto L_0x01a1
            r5 = 2
        L_0x016c:
            r8 = 32
            r13.mo30663c(r8)
            r13.mo30663c(r8)
            int r8 = r13.mo30662b(r4)
            int r8 = r8 + r9
            r13.mo30663c(r9)
            if (r5 != r9) goto L_0x0196
            if (r3 == 0) goto L_0x019a
            long r4 = (long) r7
            double r4 = (double) r4
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r14 = (long) r3
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r11 = r11 / r14
            double r3 = java.lang.Math.pow(r4, r11)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            r18 = r3
            goto L_0x019a
        L_0x0196:
            long r4 = (long) r7
            long r11 = (long) r3
            long r18 = r4 * r11
        L_0x019a:
            long r3 = (long) r8
            long r3 = r3 * r18
            int r4 = (int) r3
            r13.mo30663c(r4)
        L_0x01a1:
            int r1 = r1 + 1
            r8 = r22
            r12 = r23
            r9 = r24
            r4 = 0
            r5 = 4
            r11 = 5
            r14 = 8
            goto L_0x00c4
        L_0x01b0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 53
            r1.<init>(r2)
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x01c9:
            r2 = 0
            int r1 = r13.mo30661a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 66
            r3.<init>(r4)
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x01e6:
            r22 = r8
            r24 = r9
            r1 = 6
            int r4 = r13.mo30662b(r1)
            r5 = 1
            int r4 = r4 + r5
            r5 = 0
        L_0x01f2:
            if (r5 >= r4) goto L_0x0205
            int r7 = r13.mo30662b(r3)
            if (r7 != 0) goto L_0x01fd
            int r5 = r5 + 1
            goto L_0x01f2
        L_0x01fd:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x0205:
            int r4 = r13.mo30662b(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x020c:
            r8 = 3
            r9 = 52
            if (r7 >= r4) goto L_0x02c8
            int r11 = r13.mo30662b(r3)
            if (r11 == 0) goto L_0x029c
            if (r11 != r5) goto L_0x0285
            r5 = 5
            int r9 = r13.mo30662b(r5)
            int[] r5 = new int[r9]
            r11 = 0
            r12 = -1
        L_0x0222:
            if (r11 >= r9) goto L_0x0233
            r14 = 4
            int r15 = r13.mo30662b(r14)
            r5[r11] = r15
            if (r15 <= r12) goto L_0x022e
            r12 = r15
        L_0x022e:
            int r11 = r11 + 1
            r15 = 24
            goto L_0x0222
        L_0x0233:
            int r12 = r12 + 1
            int[] r11 = new int[r12]
            r14 = 0
        L_0x0238:
            if (r14 >= r12) goto L_0x0267
            int r15 = r13.mo30662b(r8)
            r19 = 1
            int r15 = r15 + 1
            r11[r14] = r15
            r15 = 2
            int r23 = r13.mo30662b(r15)
            if (r23 <= 0) goto L_0x0251
            r15 = 8
            r13.mo30663c(r15)
            goto L_0x0253
        L_0x0251:
            r15 = 8
        L_0x0253:
            r8 = 0
        L_0x0254:
            int r1 = r19 << r23
            if (r8 >= r1) goto L_0x0262
            r13.mo30663c(r15)
            int r8 = r8 + 1
            r15 = 8
            r19 = 1
            goto L_0x0254
        L_0x0262:
            int r14 = r14 + 1
            r1 = 6
            r8 = 3
            goto L_0x0238
        L_0x0267:
            r1 = 2
            r13.mo30663c(r1)
            r1 = 4
            int r8 = r13.mo30662b(r1)
            r1 = 0
            r12 = 0
            r14 = 0
        L_0x0273:
            if (r1 >= r9) goto L_0x02c0
            r15 = r5[r1]
            r15 = r11[r15]
            int r12 = r12 + r15
        L_0x027a:
            if (r14 >= r12) goto L_0x0282
            r13.mo30663c(r8)
            int r14 = r14 + 1
            goto L_0x027a
        L_0x0282:
            int r1 = r1 + 1
            goto L_0x0273
        L_0x0285:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x029c:
            r1 = 8
            r13.mo30663c(r1)
            r13.mo30663c(r3)
            r13.mo30663c(r3)
            r5 = 6
            r13.mo30663c(r5)
            r13.mo30663c(r1)
            r5 = 4
            int r8 = r13.mo30662b(r5)
            r5 = 1
            int r8 = r8 + r5
            r5 = 0
        L_0x02b6:
            if (r5 >= r8) goto L_0x02c0
            r13.mo30663c(r1)
            int r5 = r5 + 1
            r1 = 8
            goto L_0x02b6
        L_0x02c0:
            int r7 = r7 + 1
            r1 = 6
            r5 = 1
            r15 = 24
            goto L_0x020c
        L_0x02c8:
            int r4 = r13.mo30662b(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x02cf:
            if (r7 >= r4) goto L_0x033d
            int r8 = r13.mo30662b(r3)
            r11 = 2
            if (r8 > r11) goto L_0x0335
            r8 = 24
            r13.mo30663c(r8)
            r13.mo30663c(r8)
            r13.mo30663c(r8)
            int r11 = r13.mo30662b(r1)
            int r11 = r11 + r5
            r1 = 8
            r13.mo30663c(r1)
            int[] r5 = new int[r11]
            r12 = 0
        L_0x02f0:
            if (r12 >= r11) goto L_0x0311
            r14 = 3
            int r15 = r13.mo30662b(r14)
            boolean r18 = r13.mo30664d()
            if (r18 == 0) goto L_0x0303
            r8 = 5
            int r19 = r13.mo30662b(r8)
            goto L_0x0306
        L_0x0303:
            r8 = 5
            r19 = 0
        L_0x0306:
            int r19 = r19 * 8
            int r19 = r19 + r15
            r5[r12] = r19
            int r12 = r12 + 1
            r8 = 24
            goto L_0x02f0
        L_0x0311:
            r8 = 5
            r14 = 3
            r12 = 0
        L_0x0314:
            if (r12 >= r11) goto L_0x0330
            r15 = 0
        L_0x0317:
            if (r15 >= r1) goto L_0x032b
            r19 = r5[r12]
            r21 = 1
            int r23 = r21 << r15
            r19 = r19 & r23
            if (r19 == 0) goto L_0x0326
            r13.mo30663c(r1)
        L_0x0326:
            int r15 = r15 + 1
            r1 = 8
            goto L_0x0317
        L_0x032b:
            int r12 = r12 + 1
            r1 = 8
            goto L_0x0314
        L_0x0330:
            int r7 = r7 + 1
            r1 = 6
            r5 = 1
            goto L_0x02cf
        L_0x0335:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x033d:
            int r4 = r13.mo30662b(r1)
            r1 = 1
            int r4 = r4 + r1
            r1 = 0
        L_0x0344:
            if (r1 >= r4) goto L_0x03c9
            int r5 = r13.mo30662b(r3)
            if (r5 == 0) goto L_0x0365
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            java.lang.String r8 = "mapping type other than 0 not supported: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "VorbisUtil"
            android.util.Log.e(r7, r5)
            r5 = 2
            r11 = 4
            goto L_0x03be
        L_0x0365:
            boolean r5 = r13.mo30664d()
            if (r5 == 0) goto L_0x0373
            r5 = 4
            int r7 = r13.mo30662b(r5)
            r5 = 1
            int r7 = r7 + r5
            goto L_0x0375
        L_0x0373:
            r5 = 1
            r7 = 1
        L_0x0375:
            boolean r8 = r13.mo30664d()
            if (r8 == 0) goto L_0x0398
            r8 = 8
            int r11 = r13.mo30662b(r8)
            int r11 = r11 + r5
            r5 = 0
        L_0x0383:
            if (r5 >= r11) goto L_0x0398
            int r8 = r10 + -1
            int r12 = com.google.android.gms.internal.ads.fd4.m32127a(r8)
            r13.mo30663c(r12)
            int r8 = com.google.android.gms.internal.ads.fd4.m32127a(r8)
            r13.mo30663c(r8)
            int r5 = r5 + 1
            goto L_0x0383
        L_0x0398:
            r5 = 2
            int r8 = r13.mo30662b(r5)
            if (r8 != 0) goto L_0x03c1
            r8 = 1
            if (r7 <= r8) goto L_0x03ac
            r8 = 0
        L_0x03a3:
            if (r8 >= r10) goto L_0x03ac
            r11 = 4
            r13.mo30663c(r11)
            int r8 = r8 + 1
            goto L_0x03a3
        L_0x03ac:
            r11 = 4
            r8 = 0
        L_0x03ae:
            if (r8 >= r7) goto L_0x03be
            r12 = 8
            r13.mo30663c(r12)
            r13.mo30663c(r12)
            r13.mo30663c(r12)
            int r8 = r8 + 1
            goto L_0x03ae
        L_0x03be:
            int r1 = r1 + 1
            goto L_0x0344
        L_0x03c1:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x03c9:
            r1 = 6
            int r1 = r13.mo30662b(r1)
            r4 = 1
            int r1 = r1 + r4
            com.google.android.gms.internal.ads.dd4[] r9 = new com.google.android.gms.internal.ads.dd4[r1]
            r4 = 0
        L_0x03d3:
            if (r4 >= r1) goto L_0x03f1
            boolean r5 = r13.mo30664d()
            int r7 = r13.mo30662b(r3)
            int r8 = r13.mo30662b(r3)
            r10 = 8
            int r11 = r13.mo30662b(r10)
            com.google.android.gms.internal.ads.dd4 r12 = new com.google.android.gms.internal.ads.dd4
            r12.<init>(r5, r7, r8, r11)
            r9[r4] = r12
            int r4 = r4 + 1
            goto L_0x03d3
        L_0x03f1:
            boolean r3 = r13.mo30664d()
            if (r3 == 0) goto L_0x0448
            com.google.android.gms.internal.ads.c2 r3 = new com.google.android.gms.internal.ads.c2
            r4 = -1
            int r1 = r1 + r4
            int r10 = com.google.android.gms.internal.ads.fd4.m32127a(r1)
            r5 = r3
            r7 = r22
            r8 = r24
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = r3
        L_0x0408:
            r0.f20210n = r7
            if (r7 != 0) goto L_0x040e
            r1 = 1
            return r1
        L_0x040e:
            com.google.android.gms.internal.ads.ed4 r1 = r7.f30203a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = r1.f31330g
            r3.add(r4)
            byte[] r4 = r7.f30205c
            r3.add(r4)
            com.google.android.gms.internal.ads.ge4 r4 = new com.google.android.gms.internal.ads.ge4
            r4.<init>()
            java.lang.String r5 = "audio/vorbis"
            r4.mo32093s(r5)
            int r5 = r1.f31327d
            r4.mo32074d0(r5)
            int r5 = r1.f31326c
            r4.mo32089o(r5)
            int r5 = r1.f31324a
            r4.mo32076e0(r5)
            int r1 = r1.f31325b
            r4.mo32094t(r1)
            r4.mo32083i(r3)
            com.google.android.gms.internal.ads.w r1 = r4.mo32099y()
            r2.f40980a = r1
            r1 = 1
            return r1
        L_0x0448:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            goto L_0x0451
        L_0x0450:
            throw r1
        L_0x0451:
            goto L_0x0450
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4611d2.mo18110c(com.google.android.gms.internal.ads.uq2, long, com.google.android.gms.internal.ads.x1):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo18115h(long j) {
        super.mo18115h(j);
        int i = 0;
        this.f20212p = j != 0;
        ed4 ed4 = this.f20213q;
        if (ed4 != null) {
            i = ed4.f31328e;
        }
        this.f20211o = i;
    }
}
