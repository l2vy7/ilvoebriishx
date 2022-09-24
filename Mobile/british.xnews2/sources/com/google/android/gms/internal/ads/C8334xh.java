package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8334xh {

    /* renamed from: a */
    private static final int f41159a = C7836jm.m33645g("vide");

    /* renamed from: b */
    private static final int f41160b = C7836jm.m33645g("soun");

    /* renamed from: c */
    private static final int f41161c = C7836jm.m33645g("text");

    /* renamed from: d */
    private static final int f41162d = C7836jm.m33645g("sbtl");

    /* renamed from: e */
    private static final int f41163e = C7836jm.m33645g("subt");

    /* renamed from: f */
    private static final int f41164f = C7836jm.m33645g("clcp");

    /* renamed from: g */
    private static final int f41165g = C7836jm.m33645g(C6540C.CENC_TYPE_cenc);

    /* renamed from: h */
    private static final int f41166h = C7836jm.m33645g("meta");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v11, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x056a: MOVE  (r6v19 java.lang.String) = (r45v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0838  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0841 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0842  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c3  */
    /* renamed from: a */
    public static com.google.android.gms.internal.ads.C7796ii m39468a(com.google.android.gms.internal.ads.C8015oh r51, com.google.android.gms.internal.ads.C8050ph r52, long r53, com.google.android.gms.internal.ads.zzarf r55, boolean r56) throws com.google.android.gms.internal.ads.C8153se {
        /*
            r0 = r51
            r15 = r55
            int r1 = com.google.android.gms.internal.ads.C8086qh.f38050F
            com.google.android.gms.internal.ads.oh r1 = r0.mo33898d(r1)
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38074T
            com.google.android.gms.internal.ads.ph r2 = r1.mo33899e(r2)
            com.google.android.gms.internal.ads.bm r2 = r2.f37635P0
            r14 = 16
            r2.mo30725v(r14)
            int r2 = r2.mo30708e()
            int r3 = f41160b
            r4 = 4
            r12 = 3
            r11 = -1
            if (r2 != r3) goto L_0x0024
            r10 = 1
            goto L_0x0044
        L_0x0024:
            int r3 = f41159a
            if (r2 != r3) goto L_0x002a
            r10 = 2
            goto L_0x0044
        L_0x002a:
            int r3 = f41161c
            if (r2 == r3) goto L_0x0043
            int r3 = f41162d
            if (r2 == r3) goto L_0x0043
            int r3 = f41163e
            if (r2 == r3) goto L_0x0043
            int r3 = f41164f
            if (r2 != r3) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            int r3 = f41166h
            if (r2 != r3) goto L_0x0041
            r10 = 4
            goto L_0x0044
        L_0x0041:
            r10 = -1
            goto L_0x0044
        L_0x0043:
            r10 = 3
        L_0x0044:
            r8 = 0
            if (r10 != r11) goto L_0x0048
            return r8
        L_0x0048:
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38070P
            com.google.android.gms.internal.ads.ph r2 = r0.mo33899e(r2)
            com.google.android.gms.internal.ads.bm r2 = r2.f37635P0
            r7 = 8
            r2.mo30725v(r7)
            int r3 = r2.mo30708e()
            int r3 = com.google.android.gms.internal.ads.C8086qh.m36472b(r3)
            if (r3 != 0) goto L_0x0062
            r5 = 8
            goto L_0x0064
        L_0x0062:
            r5 = 16
        L_0x0064:
            r2.mo30726w(r5)
            int r5 = r2.mo30708e()
            r2.mo30726w(r4)
            int r6 = r2.mo30706c()
            if (r3 != 0) goto L_0x0076
            r13 = 4
            goto L_0x0078
        L_0x0076:
            r13 = 8
        L_0x0078:
            r9 = 0
        L_0x0079:
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= r13) goto L_0x009e
            byte[] r8 = r2.f30037a
            int r24 = r6 + r9
            byte r8 = r8[r24]
            if (r8 == r11) goto L_0x009a
            if (r3 != 0) goto L_0x0091
            long r8 = r2.mo30716m()
            goto L_0x0095
        L_0x0091:
            long r8 = r2.mo30717n()
        L_0x0095:
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x00a3
            goto L_0x00a1
        L_0x009a:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x0079
        L_0x009e:
            r2.mo30726w(r13)
        L_0x00a1:
            r8 = r21
        L_0x00a3:
            r2.mo30726w(r14)
            int r3 = r2.mo30708e()
            int r6 = r2.mo30708e()
            r2.mo30726w(r4)
            int r13 = r2.mo30708e()
            int r2 = r2.mo30708e()
            r4 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00d3
            if (r6 != r4) goto L_0x00d2
            if (r13 != r14) goto L_0x00ce
            if (r2 != 0) goto L_0x00c8
            r2 = 90
            goto L_0x00f3
        L_0x00c8:
            r3 = 0
            r6 = 65536(0x10000, float:9.18355E-41)
            r13 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00d3
        L_0x00ce:
            r3 = 0
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            if (r3 != 0) goto L_0x00e6
            if (r6 != r14) goto L_0x00e3
            if (r13 != r4) goto L_0x00de
            if (r2 != 0) goto L_0x00df
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00f3
        L_0x00de:
            r4 = r13
        L_0x00df:
            r3 = 0
            r6 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00e7
        L_0x00e3:
            r4 = r13
            r3 = 0
            goto L_0x00e7
        L_0x00e6:
            r4 = r13
        L_0x00e7:
            if (r3 != r14) goto L_0x00f2
            if (r6 != 0) goto L_0x00f2
            if (r4 != 0) goto L_0x00f2
            if (r2 != r14) goto L_0x00f2
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00f3
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            com.google.android.gms.internal.ads.wh r14 = new com.google.android.gms.internal.ads.wh
            r14.<init>(r5, r8, r2)
            int r2 = (r53 > r21 ? 1 : (r53 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x0105
            long r2 = r14.f40785b
            r26 = r2
            r2 = r52
            goto L_0x0109
        L_0x0105:
            r2 = r52
            r26 = r53
        L_0x0109:
            com.google.android.gms.internal.ads.bm r2 = r2.f37635P0
            r2.mo30725v(r7)
            int r3 = r2.mo30708e()
            int r3 = com.google.android.gms.internal.ads.C8086qh.m36472b(r3)
            if (r3 != 0) goto L_0x011b
            r3 = 8
            goto L_0x011d
        L_0x011b:
            r3 = 16
        L_0x011d:
            r2.mo30726w(r3)
            long r32 = r2.mo30716m()
            int r2 = (r26 > r21 ? 1 : (r26 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x012b
            r26 = r21
            goto L_0x0136
        L_0x012b:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r32
            long r2 = com.google.android.gms.internal.ads.C7836jm.m33648j(r26, r28, r30)
            r26 = r2
        L_0x0136:
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38052G
            com.google.android.gms.internal.ads.oh r2 = r1.mo33898d(r2)
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38054H
            com.google.android.gms.internal.ads.oh r2 = r2.mo33898d(r3)
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38073S
            com.google.android.gms.internal.ads.ph r1 = r1.mo33899e(r3)
            com.google.android.gms.internal.ads.bm r1 = r1.f37635P0
            r1.mo30725v(r7)
            int r3 = r1.mo30708e()
            int r3 = com.google.android.gms.internal.ads.C8086qh.m36472b(r3)
            if (r3 != 0) goto L_0x015a
            r4 = 8
            goto L_0x015c
        L_0x015a:
            r4 = 16
        L_0x015c:
            r1.mo30726w(r4)
            long r4 = r1.mo30716m()
            if (r3 != 0) goto L_0x0167
            r3 = 4
            goto L_0x0169
        L_0x0167:
            r3 = 8
        L_0x0169:
            r1.mo30726w(r3)
            int r1 = r1.mo30713j()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r12)
            int r6 = r1 >> 10
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r3.append(r6)
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r3.append(r6)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r3.append(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r3 = r3.toString()
            android.util.Pair r13 = android.util.Pair.create(r1, r3)
            int r1 = com.google.android.gms.internal.ads.C8086qh.f38075U
            com.google.android.gms.internal.ads.ph r1 = r2.mo33899e(r1)
            com.google.android.gms.internal.ads.bm r9 = r1.f37635P0
            int r21 = r14.f40784a
            int r22 = r14.f40786c
            java.lang.Object r1 = r13.second
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r1 = 12
            r9.mo30725v(r1)
            int r6 = r9.mo30708e()
            com.google.android.gms.internal.ads.th r5 = new com.google.android.gms.internal.ads.th
            r5.<init>(r6)
            r4 = 0
        L_0x01c1:
            if (r4 >= r6) goto L_0x07ca
            int r3 = r9.mo30706c()
            int r2 = r9.mo30708e()
            if (r2 <= 0) goto L_0x01cf
            r1 = 1
            goto L_0x01d0
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            java.lang.String r12 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.C8195tl.m37899d(r1, r12)
            int r1 = r9.mo30708e()
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38084c
            if (r1 == r7) goto L_0x05cb
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38086d
            if (r1 == r7) goto L_0x05cb
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38081a0
            if (r1 == r7) goto L_0x05cb
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38103l0
            if (r1 == r7) goto L_0x05cb
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38088e
            if (r1 == r7) goto L_0x05cb
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38090f
            if (r1 == r7) goto L_0x05cb
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38092g
            if (r1 == r7) goto L_0x05cb
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38061K0
            if (r1 == r7) goto L_0x05cb
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38063L0
            if (r1 != r7) goto L_0x01ff
            goto L_0x05cb
        L_0x01ff:
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38098j
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38083b0
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38108o
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38112q
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38116s
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38122v
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38118t
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38120u
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38129y0
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38131z0
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38104m
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38106n
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38100k
            if (r1 == r7) goto L_0x0310
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38069O0
            if (r1 != r7) goto L_0x0239
            goto L_0x0310
        L_0x0239:
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38101k0
            if (r1 == r7) goto L_0x0274
            int r12 = com.google.android.gms.internal.ads.C8086qh.f38121u0
            if (r1 == r12) goto L_0x0274
            int r12 = com.google.android.gms.internal.ads.C8086qh.f38123v0
            if (r1 == r12) goto L_0x0274
            int r12 = com.google.android.gms.internal.ads.C8086qh.f38125w0
            if (r1 == r12) goto L_0x0274
            int r12 = com.google.android.gms.internal.ads.C8086qh.f38127x0
            if (r1 != r12) goto L_0x024e
            goto L_0x0274
        L_0x024e:
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38067N0
            if (r1 != r7) goto L_0x025f
            java.lang.String r1 = java.lang.Integer.toString(r21)
            java.lang.String r7 = "application/x-camera-motion"
            r12 = 0
            com.google.android.gms.internal.ads.zzapg r1 = com.google.android.gms.internal.ads.zzapg.m40615k(r1, r7, r12, r11, r15)
            r5.f39426b = r1
        L_0x025f:
            r35 = r2
            r24 = r3
            r36 = r4
            r0 = r5
            r31 = r6
            r34 = r8
            r50 = r9
            r18 = r10
            r47 = r13
            r16 = r14
            goto L_0x0373
        L_0x0274:
            r12 = 0
            int r11 = r3 + 16
            r9.mo30725v(r11)
            java.lang.String r11 = "application/ttml+xml"
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 != r7) goto L_0x028a
            r7 = r11
            r17 = r12
        L_0x0286:
            r11 = 1
            r18 = 0
            goto L_0x02c2
        L_0x028a:
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38121u0
            if (r1 != r7) goto L_0x029f
            int r1 = r2 + -16
            byte[] r7 = new byte[r1]
            r11 = 0
            r9.mo30720q(r7, r11, r1)
            java.util.List r1 = java.util.Collections.singletonList(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r17 = r1
            goto L_0x0286
        L_0x029f:
            r18 = 0
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38123v0
            if (r1 != r7) goto L_0x02ac
            java.lang.String r1 = "application/x-mp4-vtt"
            r7 = r1
            r17 = r12
        L_0x02aa:
            r11 = 1
            goto L_0x02c2
        L_0x02ac:
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38125w0
            if (r1 != r7) goto L_0x02b6
            r7 = r11
            r17 = r12
            r29 = r19
            goto L_0x02aa
        L_0x02b6:
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38127x0
            if (r1 != r7) goto L_0x030a
            r11 = 1
            r5.f39428d = r11
            java.lang.String r1 = "application/x-mp4-cea-608"
            r7 = r1
            r17 = r12
        L_0x02c2:
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r31 = 0
            r34 = -1
            r35 = 0
            r36 = -1
            r52 = r13
            r13 = r2
            r2 = r7
            r7 = r3
            r3 = r31
            r37 = r4
            r4 = r34
            r38 = r5
            r5 = r35
            r31 = r6
            r6 = r8
            r39 = r7
            r7 = r36
            r40 = r8
            r8 = r55
            r41 = r9
            r18 = r10
            r9 = r29
            r0 = 1
            r11 = r17
            com.google.android.gms.internal.ads.zzapg r1 = com.google.android.gms.internal.ads.zzapg.m40616l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r11 = r38
            r11.f39426b = r1
            r47 = r52
            r0 = r11
            r35 = r13
            r16 = r14
            r36 = r37
            r24 = r39
            r34 = r40
            r50 = r41
            goto L_0x0373
        L_0x030a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0310:
            r39 = r3
            r37 = r4
            r11 = r5
            r31 = r6
            r40 = r8
            r41 = r9
            r18 = r10
            r52 = r13
            r0 = 1
            r10 = 0
            r13 = r2
            r9 = r39
            int r3 = r9 + 16
            r8 = r41
            r8.mo30725v(r3)
            r2 = 6
            if (r56 == 0) goto L_0x0338
            int r3 = r8.mo30713j()
            r8.mo30726w(r2)
            r7 = 8
            goto L_0x033e
        L_0x0338:
            r7 = 8
            r8.mo30726w(r7)
            r3 = 0
        L_0x033e:
            if (r3 == 0) goto L_0x037d
            if (r3 != r0) goto L_0x0343
            goto L_0x037d
        L_0x0343:
            r6 = 2
            if (r3 != r6) goto L_0x0364
            r2 = 16
            r8.mo30726w(r2)
            long r2 = r8.mo30715l()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            long r2 = java.lang.Math.round(r2)
            int r3 = (int) r2
            int r2 = r8.mo30712i()
            r4 = 20
            r8.mo30726w(r4)
            r5 = 16
            goto L_0x0395
        L_0x0364:
            r47 = r52
            r50 = r8
            r24 = r9
            r0 = r11
            r35 = r13
            r16 = r14
            r36 = r37
            r34 = r40
        L_0x0373:
            r23 = 3
            r25 = 16
            r28 = -1
            r29 = 0
            goto L_0x07ab
        L_0x037d:
            r6 = 2
            int r4 = r8.mo30713j()
            r8.mo30726w(r2)
            int r2 = r8.mo30711h()
            if (r3 != r0) goto L_0x0391
            r5 = 16
            r8.mo30726w(r5)
            goto L_0x0393
        L_0x0391:
            r5 = 16
        L_0x0393:
            r3 = r2
            r2 = r4
        L_0x0395:
            int r4 = r8.mo30706c()
            int r5 = com.google.android.gms.internal.ads.C8086qh.f38083b0
            if (r1 != r5) goto L_0x03a7
            r5 = r37
            int r1 = m39472e(r8, r9, r13, r11, r5)
            r8.mo30725v(r4)
            goto L_0x03a9
        L_0x03a7:
            r5 = r37
        L_0x03a9:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38108o
            java.lang.String r0 = "audio/raw"
            if (r1 != r6) goto L_0x03b2
            java.lang.String r1 = "audio/ac3"
            goto L_0x03fb
        L_0x03b2:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38112q
            if (r1 != r6) goto L_0x03b9
            java.lang.String r1 = "audio/eac3"
            goto L_0x03fb
        L_0x03b9:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38116s
            if (r1 != r6) goto L_0x03c0
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x03fb
        L_0x03c0:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38118t
            if (r1 == r6) goto L_0x03f9
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38120u
            if (r1 != r6) goto L_0x03c9
            goto L_0x03f9
        L_0x03c9:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38122v
            if (r1 != r6) goto L_0x03d0
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03fb
        L_0x03d0:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38129y0
            if (r1 != r6) goto L_0x03d7
            java.lang.String r1 = "audio/3gpp"
            goto L_0x03fb
        L_0x03d7:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38131z0
            if (r1 != r6) goto L_0x03de
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x03fb
        L_0x03de:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38104m
            if (r1 == r6) goto L_0x03f7
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38106n
            if (r1 != r6) goto L_0x03e7
            goto L_0x03f7
        L_0x03e7:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38100k
            if (r1 != r6) goto L_0x03ee
            java.lang.String r1 = "audio/mpeg"
            goto L_0x03fb
        L_0x03ee:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38069O0
            if (r1 != r6) goto L_0x03f5
            java.lang.String r1 = "audio/alac"
            goto L_0x03fb
        L_0x03f5:
            r1 = r10
            goto L_0x03fb
        L_0x03f7:
            r1 = r0
            goto L_0x03fb
        L_0x03f9:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x03fb:
            r6 = r1
            r28 = r2
            r29 = r3
            r30 = r10
        L_0x0402:
            int r1 = r4 - r9
            if (r1 >= r13) goto L_0x0554
            r8.mo30725v(r4)
            int r3 = r8.mo30708e()
            if (r3 <= 0) goto L_0x0411
            r1 = 1
            goto L_0x0412
        L_0x0411:
            r1 = 0
        L_0x0412:
            com.google.android.gms.internal.ads.C8195tl.m37899d(r1, r12)
            int r1 = r8.mo30708e()
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38060K
            if (r1 == r2) goto L_0x04d3
            if (r56 == 0) goto L_0x0425
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38102l
            if (r1 != r7) goto L_0x0425
            goto L_0x04d3
        L_0x0425:
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38110p
            if (r1 != r2) goto L_0x044d
            int r1 = r4 + 8
            r8.mo30725v(r1)
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r7 = r40
            com.google.android.gms.internal.ads.zzapg r1 = com.google.android.gms.internal.ads.C7537bf.m30690b(r8, r1, r7, r15)
            r11.f39426b = r1
        L_0x043a:
            r44 = r5
            r45 = r6
            r34 = r7
            r15 = r8
            r46 = r9
            r35 = r13
            r16 = 2
            r25 = 16
            r13 = r11
        L_0x044a:
            r11 = 0
            goto L_0x04ce
        L_0x044d:
            r7 = r40
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38114r
            if (r1 != r2) goto L_0x0463
            int r1 = r4 + 8
            r8.mo30725v(r1)
            java.lang.String r1 = java.lang.Integer.toString(r21)
            com.google.android.gms.internal.ads.zzapg r1 = com.google.android.gms.internal.ads.C7537bf.m30691c(r8, r1, r7, r15)
            r11.f39426b = r1
            goto L_0x043a
        L_0x0463:
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38124w
            if (r1 != r2) goto L_0x04a7
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r34 = 0
            r35 = -1
            r36 = -1
            r37 = 0
            r38 = 0
            r2 = r6
            r42 = r3
            r3 = r34
            r43 = r4
            r4 = r35
            r44 = r5
            r25 = 16
            r5 = r36
            r45 = r6
            r16 = 2
            r6 = r28
            r34 = r7
            r7 = r29
            r15 = r8
            r8 = r37
            r46 = r9
            r9 = r55
            r10 = r38
            r35 = r13
            r13 = r11
            r11 = r34
            com.google.android.gms.internal.ads.zzapg r1 = com.google.android.gms.internal.ads.zzapg.m40612h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.f39426b = r1
        L_0x04a2:
            r3 = r42
            r4 = r43
            goto L_0x044a
        L_0x04a7:
            r42 = r3
            r43 = r4
            r44 = r5
            r45 = r6
            r34 = r7
            r15 = r8
            r46 = r9
            r35 = r13
            r16 = 2
            r25 = 16
            r13 = r11
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38069O0
            if (r1 != r2) goto L_0x04a2
            r3 = r42
            byte[] r1 = new byte[r3]
            r4 = r43
            r15.mo30725v(r4)
            r11 = 0
            r15.mo30720q(r1, r11, r3)
            r30 = r1
        L_0x04ce:
            r6 = r45
            r10 = -1
            goto L_0x0542
        L_0x04d3:
            r44 = r5
            r45 = r6
            r15 = r8
            r46 = r9
            r35 = r13
            r34 = r40
            r16 = 2
            r25 = 16
            r13 = r11
            r11 = 0
            if (r1 != r2) goto L_0x04e9
            r1 = r4
        L_0x04e7:
            r10 = -1
            goto L_0x050c
        L_0x04e9:
            int r1 = r15.mo30706c()
        L_0x04ed:
            int r2 = r1 - r4
            if (r2 >= r3) goto L_0x050a
            r15.mo30725v(r1)
            int r2 = r15.mo30708e()
            if (r2 <= 0) goto L_0x04fc
            r9 = 1
            goto L_0x04fd
        L_0x04fc:
            r9 = 0
        L_0x04fd:
            com.google.android.gms.internal.ads.C8195tl.m37899d(r9, r12)
            int r5 = r15.mo30708e()
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38060K
            if (r5 == r6) goto L_0x04e7
            int r1 = r1 + r2
            goto L_0x04ed
        L_0x050a:
            r1 = -1
            goto L_0x04e7
        L_0x050c:
            if (r1 == r10) goto L_0x0540
            android.util.Pair r1 = m39473f(r15, r1)
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.second
            r30 = r1
            byte[] r30 = (byte[]) r30
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x053e
            android.util.Pair r1 = com.google.android.gms.internal.ads.C8231ul.m38359a(r30)
            java.lang.Object r5 = r1.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r28 = r1
            r6 = r2
            r29 = r5
            goto L_0x0542
        L_0x053e:
            r6 = r2
            goto L_0x0542
        L_0x0540:
            r6 = r45
        L_0x0542:
            int r4 = r4 + r3
            r11 = r13
            r8 = r15
            r40 = r34
            r13 = r35
            r5 = r44
            r9 = r46
            r7 = 8
            r10 = 0
            r15 = r55
            goto L_0x0402
        L_0x0554:
            r44 = r5
            r45 = r6
            r15 = r8
            r46 = r9
            r35 = r13
            r34 = r40
            r10 = -1
            r16 = 2
            r25 = 16
            r13 = r11
            r11 = 0
            com.google.android.gms.internal.ads.zzapg r1 = r13.f39426b
            if (r1 != 0) goto L_0x05b8
            r6 = r45
            if (r6 == 0) goto L_0x05b8
            boolean r0 = r0.equals(r6)
            r1 = 1
            if (r1 == r0) goto L_0x0577
            r8 = -1
            goto L_0x0578
        L_0x0577:
            r8 = 2
        L_0x0578:
            java.lang.String r1 = java.lang.Integer.toString(r21)
            if (r30 != 0) goto L_0x0580
            r0 = 0
            goto L_0x0584
        L_0x0580:
            java.util.List r0 = java.util.Collections.singletonList(r30)
        L_0x0584:
            r3 = 0
            r4 = -1
            r5 = -1
            r9 = -1
            r12 = -1
            r23 = 0
            r30 = 0
            r2 = r6
            r6 = r28
            r7 = r29
            r28 = -1
            r10 = r12
            r29 = 0
            r11 = r0
            r0 = 3
            r12 = r55
            r47 = r52
            r0 = r13
            r48 = r35
            r13 = r23
            r16 = r14
            r14 = r34
            r49 = r15
            r15 = r30
            com.google.android.gms.internal.ads.zzapg r1 = com.google.android.gms.internal.ads.zzapg.m40613i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f39426b = r1
            r36 = r44
            r24 = r46
            r50 = r49
            goto L_0x07a7
        L_0x05b8:
            r47 = r52
            r0 = r13
            r16 = r14
            r28 = -1
            r29 = 0
            r50 = r15
            r36 = r44
            r24 = r46
            r23 = 3
            goto L_0x07ab
        L_0x05cb:
            r48 = r2
            r46 = r3
            r44 = r4
            r0 = r5
            r31 = r6
            r34 = r8
            r49 = r9
            r18 = r10
            r47 = r13
            r16 = r14
            r28 = -1
            r29 = 0
            r15 = r46
            int r3 = r15 + 16
            r14 = r49
            r14.mo30725v(r3)
            r13 = 16
            r14.mo30726w(r13)
            int r6 = r14.mo30713j()
            int r7 = r14.mo30713j()
            r2 = 50
            r14.mo30726w(r2)
            int r2 = r14.mo30706c()
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38081a0
            if (r1 != r3) goto L_0x0611
            r11 = r44
            r10 = r48
            int r1 = m39472e(r14, r15, r10, r0, r11)
            r14.mo30725v(r2)
            goto L_0x0615
        L_0x0611:
            r11 = r44
            r10 = r48
        L_0x0615:
            r3 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 0
            r9 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r30 = -1
        L_0x0620:
            int r5 = r2 - r15
            if (r5 >= r10) goto L_0x0769
            r14.mo30725v(r2)
            int r5 = r14.mo30706c()
            int r8 = r14.mo30708e()
            if (r8 != 0) goto L_0x063b
            int r8 = r14.mo30706c()
            int r8 = r8 - r15
            if (r8 != r10) goto L_0x063a
            goto L_0x0769
        L_0x063a:
            r8 = 0
        L_0x063b:
            if (r8 <= 0) goto L_0x063f
            r13 = 1
            goto L_0x0640
        L_0x063f:
            r13 = 0
        L_0x0640:
            com.google.android.gms.internal.ads.C8195tl.m37899d(r13, r12)
            int r13 = r14.mo30708e()
            r48 = r10
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38056I
            if (r13 != r10) goto L_0x066d
            if (r3 != 0) goto L_0x0651
            r9 = 1
            goto L_0x0652
        L_0x0651:
            r9 = 0
        L_0x0652:
            com.google.android.gms.internal.ads.C8195tl.m37900e(r9)
            int r5 = r5 + 8
            r14.mo30725v(r5)
            com.google.android.gms.internal.ads.km r3 = com.google.android.gms.internal.ads.C7872km.m33984a(r14)
            java.util.List<byte[]> r9 = r3.f34371a
            int r5 = r3.f34372b
            r0.f39427c = r5
            if (r4 != 0) goto L_0x066a
            float r3 = r3.f34373c
            r23 = r3
        L_0x066a:
            java.lang.String r3 = "video/avc"
            goto L_0x068a
        L_0x066d:
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38058J
            if (r13 != r10) goto L_0x0690
            if (r3 != 0) goto L_0x0675
            r9 = 1
            goto L_0x0676
        L_0x0675:
            r9 = 0
        L_0x0676:
            com.google.android.gms.internal.ads.C8195tl.m37900e(r9)
            int r5 = r5 + 8
            r14.mo30725v(r5)
            com.google.android.gms.internal.ads.om r3 = com.google.android.gms.internal.ads.C8020om.m35760a(r14)
            java.util.List<byte[]> r9 = r3.f36532a
            int r3 = r3.f36533b
            r0.f39427c = r3
            java.lang.String r3 = "video/hevc"
        L_0x068a:
            r35 = r1
        L_0x068c:
            r10 = 2
            r13 = 3
            goto L_0x0760
        L_0x0690:
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38065M0
            if (r13 != r10) goto L_0x06a6
            if (r3 != 0) goto L_0x0698
            r3 = 1
            goto L_0x0699
        L_0x0698:
            r3 = 0
        L_0x0699:
            com.google.android.gms.internal.ads.C8195tl.m37900e(r3)
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38061K0
            if (r1 != r3) goto L_0x06a3
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x068a
        L_0x06a3:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x068a
        L_0x06a6:
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38094h
            if (r13 != r10) goto L_0x06b5
            if (r3 != 0) goto L_0x06ae
            r3 = 1
            goto L_0x06af
        L_0x06ae:
            r3 = 0
        L_0x06af:
            com.google.android.gms.internal.ads.C8195tl.m37900e(r3)
            java.lang.String r3 = "video/3gpp"
            goto L_0x068a
        L_0x06b5:
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38060K
            if (r13 != r10) goto L_0x06d5
            if (r3 != 0) goto L_0x06bd
            r9 = 1
            goto L_0x06be
        L_0x06bd:
            r9 = 0
        L_0x06be:
            com.google.android.gms.internal.ads.C8195tl.m37900e(r9)
            android.util.Pair r3 = m39473f(r14, r5)
            java.lang.Object r5 = r3.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.second
            byte[] r3 = (byte[]) r3
            java.util.List r9 = java.util.Collections.singletonList(r3)
            r35 = r1
            r3 = r5
            goto L_0x068c
        L_0x06d5:
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38099j0
            if (r13 != r10) goto L_0x06ee
            int r5 = r5 + 8
            r14.mo30725v(r5)
            int r4 = r14.mo30712i()
            float r4 = (float) r4
            int r5 = r14.mo30712i()
            float r5 = (float) r5
            float r23 = r4 / r5
            r35 = r1
            r4 = 1
            goto L_0x068c
        L_0x06ee:
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38057I0
            if (r13 != r10) goto L_0x0724
            int r10 = r5 + 8
        L_0x06f4:
            int r13 = r10 - r5
            if (r13 >= r8) goto L_0x0719
            r14.mo30725v(r10)
            int r13 = r14.mo30708e()
            r35 = r1
            int r1 = r14.mo30708e()
            r52 = r4
            int r4 = com.google.android.gms.internal.ads.C8086qh.f38059J0
            if (r1 != r4) goto L_0x0713
            byte[] r1 = r14.f30037a
            int r13 = r13 + r10
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r10, r13)
            goto L_0x071e
        L_0x0713:
            int r10 = r10 + r13
            r4 = r52
            r1 = r35
            goto L_0x06f4
        L_0x0719:
            r35 = r1
            r52 = r4
            r1 = 0
        L_0x071e:
            r4 = r52
            r25 = r1
            goto L_0x068c
        L_0x0724:
            r35 = r1
            r52 = r4
            int r1 = com.google.android.gms.internal.ads.C8086qh.f38055H0
            if (r13 != r1) goto L_0x075c
            int r1 = r14.mo30710g()
            r13 = 3
            r14.mo30726w(r13)
            if (r1 != 0) goto L_0x075a
            int r1 = r14.mo30710g()
            if (r1 == 0) goto L_0x0754
            r4 = 1
            r10 = 2
            if (r1 == r4) goto L_0x074f
            if (r1 == r10) goto L_0x074a
            if (r1 == r13) goto L_0x0745
            goto L_0x075e
        L_0x0745:
            r4 = r52
            r30 = 3
            goto L_0x0760
        L_0x074a:
            r4 = r52
            r30 = 2
            goto L_0x0760
        L_0x074f:
            r4 = r52
            r30 = 1
            goto L_0x0760
        L_0x0754:
            r10 = 2
            r4 = r52
            r30 = 0
            goto L_0x0760
        L_0x075a:
            r10 = 2
            goto L_0x075e
        L_0x075c:
            r10 = 2
            r13 = 3
        L_0x075e:
            r4 = r52
        L_0x0760:
            int r2 = r2 + r8
            r1 = r35
            r10 = r48
            r13 = 16
            goto L_0x0620
        L_0x0769:
            r48 = r10
            r10 = 2
            r13 = 3
            if (r3 == 0) goto L_0x079f
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r4 = 0
            r5 = -1
            r8 = -1
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r8 = r12
            r35 = r48
            r12 = 2
            r10 = r22
            r36 = r11
            r11 = r23
            r12 = r25
            r23 = 3
            r25 = 16
            r13 = r30
            r50 = r14
            r14 = r24
            r24 = r15
            r15 = r55
            com.google.android.gms.internal.ads.zzapg r1 = com.google.android.gms.internal.ads.zzapg.m40617m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f39426b = r1
            goto L_0x07ab
        L_0x079f:
            r36 = r11
            r50 = r14
            r24 = r15
            r35 = r48
        L_0x07a7:
            r23 = 3
            r25 = 16
        L_0x07ab:
            int r3 = r24 + r35
            r1 = r50
            r1.mo30725v(r3)
            int r4 = r36 + 1
            r15 = r55
            r5 = r0
            r9 = r1
            r14 = r16
            r10 = r18
            r6 = r31
            r8 = r34
            r13 = r47
            r7 = 8
            r11 = -1
            r12 = 3
            r0 = r51
            goto L_0x01c1
        L_0x07ca:
            r0 = r5
            r18 = r10
            r47 = r13
            r16 = r14
            r29 = 0
            int r1 = com.google.android.gms.internal.ads.C8086qh.f38071Q
            r2 = r51
            com.google.android.gms.internal.ads.oh r1 = r2.mo33898d(r1)
            if (r1 == 0) goto L_0x0838
            int r2 = com.google.android.gms.internal.ads.C8086qh.f38072R
            com.google.android.gms.internal.ads.ph r1 = r1.mo33899e(r2)
            if (r1 != 0) goto L_0x07e6
            goto L_0x0838
        L_0x07e6:
            com.google.android.gms.internal.ads.bm r1 = r1.f37635P0
            r2 = 8
            r1.mo30725v(r2)
            int r2 = r1.mo30708e()
            int r2 = com.google.android.gms.internal.ads.C8086qh.m36472b(r2)
            int r3 = r1.mo30712i()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r9 = 0
        L_0x07fe:
            if (r9 >= r3) goto L_0x0831
            r6 = 1
            if (r2 != r6) goto L_0x0808
            long r7 = r1.mo30717n()
            goto L_0x080c
        L_0x0808:
            long r7 = r1.mo30716m()
        L_0x080c:
            r4[r9] = r7
            if (r2 != r6) goto L_0x0815
            long r7 = r1.mo30715l()
            goto L_0x081a
        L_0x0815:
            int r7 = r1.mo30708e()
            long r7 = (long) r7
        L_0x081a:
            r5[r9] = r7
            short r7 = r1.mo30719p()
            if (r7 != r6) goto L_0x0829
            r7 = 2
            r1.mo30726w(r7)
            int r9 = r9 + 1
            goto L_0x07fe
        L_0x0829:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0831:
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            r2 = r1
            r1 = 0
            goto L_0x083d
        L_0x0838:
            r1 = 0
            android.util.Pair r2 = android.util.Pair.create(r1, r1)
        L_0x083d:
            com.google.android.gms.internal.ads.zzapg r3 = r0.f39426b
            if (r3 != 0) goto L_0x0842
            return r1
        L_0x0842:
            com.google.android.gms.internal.ads.ii r1 = new com.google.android.gms.internal.ads.ii
            int r16 = r16.f40784a
            r3 = r47
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.google.android.gms.internal.ads.zzapg r5 = r0.f39426b
            int r6 = r0.f39428d
            com.google.android.gms.internal.ads.ji[] r7 = r0.f39425a
            int r0 = r0.f39427c
            java.lang.Object r8 = r2.first
            r28 = r8
            long[] r28 = (long[]) r28
            java.lang.Object r2 = r2.second
            r29 = r2
            long[] r29 = (long[]) r29
            r15 = r1
            r17 = r18
            r18 = r3
            r20 = r32
            r22 = r26
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8334xh.m39468a(com.google.android.gms.internal.ads.oh, com.google.android.gms.internal.ads.ph, long, com.google.android.gms.internal.ads.zzarf, boolean):com.google.android.gms.internal.ads.ii");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0174 A[LOOP:5: B:57:0x0174->B:58:0x0176, LOOP_START, PHI: r14 r15 r22 r25 
      PHI: (r14v4 int) = (r14v2 int), (r14v11 int) binds: [B:56:0x0172, B:58:0x0176] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v5 int) = (r15v3 int), (r15v11 int) binds: [B:56:0x0172, B:58:0x0176] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v6 int) = (r22v5 int), (r22v9 int) binds: [B:56:0x0172, B:58:0x0176] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v4 long) = (r25v3 long), (r25v6 long) binds: [B:56:0x0172, B:58:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0238  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C7942mi m39469b(com.google.android.gms.internal.ads.C7796ii r42, com.google.android.gms.internal.ads.C8015oh r43, com.google.android.gms.internal.ads.C8297wg r44) throws com.google.android.gms.internal.ads.C8153se {
        /*
            r0 = r42
            r1 = r43
            r2 = r44
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38113q0
            com.google.android.gms.internal.ads.ph r3 = r1.mo33899e(r3)
            if (r3 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.uh r4 = new com.google.android.gms.internal.ads.uh
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = com.google.android.gms.internal.ads.C8086qh.f38115r0
            com.google.android.gms.internal.ads.ph r3 = r1.mo33899e(r3)
            if (r3 == 0) goto L_0x04d1
            com.google.android.gms.internal.ads.vh r4 = new com.google.android.gms.internal.ads.vh
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.zza()
            r5 = 0
            if (r3 != 0) goto L_0x0038
            com.google.android.gms.internal.ads.mi r0 = new com.google.android.gms.internal.ads.mi
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            r9 = 0
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0038:
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38117s0
            com.google.android.gms.internal.ads.ph r6 = r1.mo33899e(r6)
            if (r6 != 0) goto L_0x0048
            int r6 = com.google.android.gms.internal.ads.C8086qh.f38119t0
            com.google.android.gms.internal.ads.ph r6 = r1.mo33899e(r6)
            r8 = 1
            goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            com.google.android.gms.internal.ads.bm r6 = r6.f37635P0
            int r9 = com.google.android.gms.internal.ads.C8086qh.f38111p0
            com.google.android.gms.internal.ads.ph r9 = r1.mo33899e(r9)
            com.google.android.gms.internal.ads.bm r9 = r9.f37635P0
            int r10 = com.google.android.gms.internal.ads.C8086qh.f38105m0
            com.google.android.gms.internal.ads.ph r10 = r1.mo33899e(r10)
            com.google.android.gms.internal.ads.bm r10 = r10.f37635P0
            int r11 = com.google.android.gms.internal.ads.C8086qh.f38107n0
            com.google.android.gms.internal.ads.ph r11 = r1.mo33899e(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.bm r11 = r11.f37635P0
            goto L_0x0068
        L_0x0067:
            r11 = r12
        L_0x0068:
            int r13 = com.google.android.gms.internal.ads.C8086qh.f38109o0
            com.google.android.gms.internal.ads.ph r1 = r1.mo33899e(r13)
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.internal.ads.bm r1 = r1.f37635P0
            goto L_0x0074
        L_0x0073:
            r1 = r12
        L_0x0074:
            com.google.android.gms.internal.ads.rh r13 = new com.google.android.gms.internal.ads.rh
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo30725v(r6)
            int r8 = r10.mo30712i()
            r9 = -1
            int r8 = r8 + r9
            int r14 = r10.mo30712i()
            int r15 = r10.mo30712i()
            if (r1 == 0) goto L_0x0096
            r1.mo30725v(r6)
            int r16 = r1.mo30712i()
            goto L_0x0098
        L_0x0096:
            r16 = 0
        L_0x0098:
            if (r11 == 0) goto L_0x00ab
            r11.mo30725v(r6)
            int r6 = r11.mo30712i()
            if (r6 <= 0) goto L_0x00a9
            int r12 = r11.mo30712i()
            int r12 = r12 + r9
            goto L_0x00ad
        L_0x00a9:
            r11 = r12
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            r12 = -1
        L_0x00ad:
            boolean r17 = r4.zzc()
            r18 = 0
            if (r17 == 0) goto L_0x015c
            com.google.android.gms.internal.ads.zzapg r5 = r0.f33249f
            java.lang.String r5 = r5.f42870g
            java.lang.String r9 = "audio/raw"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x015c
            if (r8 != 0) goto L_0x015c
            if (r16 != 0) goto L_0x015b
            if (r6 != 0) goto L_0x015b
            int r1 = r13.f38677a
            long[] r5 = new long[r1]
            int[] r6 = new int[r1]
        L_0x00cd:
            boolean r8 = r13.mo34542a()
            if (r8 == 0) goto L_0x00de
            int r8 = r13.f38678b
            long r9 = r13.f38680d
            r5[r8] = r9
            int r9 = r13.f38679c
            r6[r8] = r9
            goto L_0x00cd
        L_0x00de:
            int r4 = r4.zzb()
            long r8 = (long) r15
            r10 = 8192(0x2000, float:1.14794E-41)
            int r10 = r10 / r4
            r11 = 0
            r12 = 0
        L_0x00e8:
            if (r11 >= r1) goto L_0x00f4
            r13 = r6[r11]
            int r13 = com.google.android.gms.internal.ads.C7836jm.m33642d(r13, r10)
            int r12 = r12 + r13
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f4:
            long[] r11 = new long[r12]
            int[] r13 = new int[r12]
            long[] r14 = new long[r12]
            int[] r12 = new int[r12]
            r15 = 0
            r16 = 0
            r20 = 0
            r21 = 0
        L_0x0103:
            if (r15 >= r1) goto L_0x0152
            r22 = r6[r15]
            r23 = r5[r15]
            r7 = r16
            r40 = r20
            r20 = r1
            r1 = r40
            r41 = r22
            r22 = r5
            r5 = r41
        L_0x0117:
            if (r5 <= 0) goto L_0x0143
            int r16 = java.lang.Math.min(r10, r5)
            r11[r21] = r23
            r25 = r6
            int r6 = r4 * r16
            r13[r21] = r6
            int r7 = java.lang.Math.max(r7, r6)
            r26 = r7
            long r6 = (long) r1
            long r6 = r6 * r8
            r14[r21] = r6
            r6 = 1
            r12[r21] = r6
            r6 = r13[r21]
            long r6 = (long) r6
            long r23 = r23 + r6
            int r1 = r1 + r16
            int r5 = r5 - r16
            int r21 = r21 + 1
            r6 = r25
            r7 = r26
            goto L_0x0117
        L_0x0143:
            r25 = r6
            int r15 = r15 + 1
            r16 = r7
            r5 = r22
            r40 = r20
            r20 = r1
            r1 = r40
            goto L_0x0103
        L_0x0152:
            r4 = r0
            r15 = r12
            r12 = r13
            r13 = r16
            r27 = r18
            goto L_0x02a2
        L_0x015b:
            r8 = 0
        L_0x015c:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r9 = new long[r3]
            r20 = r6
            int[] r6 = new int[r3]
            r25 = r18
            r27 = r25
            r0 = 0
            r2 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0172:
            if (r2 >= r3) goto L_0x0214
        L_0x0174:
            if (r22 != 0) goto L_0x018e
            boolean r22 = r13.mo34542a()
            com.google.android.gms.internal.ads.C8195tl.m37900e(r22)
            r24 = r14
            r29 = r15
            long r14 = r13.f38680d
            r25 = r14
            int r14 = r13.f38679c
            r22 = r14
            r14 = r24
            r15 = r29
            goto L_0x0174
        L_0x018e:
            r24 = r14
            r29 = r15
            if (r1 == 0) goto L_0x01aa
        L_0x0194:
            if (r21 != 0) goto L_0x01a7
            if (r16 <= 0) goto L_0x01a3
            int r21 = r1.mo30712i()
            int r23 = r1.mo30708e()
            int r16 = r16 + -1
            goto L_0x0194
        L_0x01a3:
            r14 = -1
            r21 = 0
            goto L_0x01a8
        L_0x01a7:
            r14 = -1
        L_0x01a8:
            int r21 = r21 + -1
        L_0x01aa:
            r14 = r23
            r5[r2] = r25
            int r15 = r4.zzb()
            r7[r2] = r15
            if (r15 <= r0) goto L_0x01bb
            r23 = r5
            r0 = r15
            r15 = r4
            goto L_0x01be
        L_0x01bb:
            r15 = r4
            r23 = r5
        L_0x01be:
            long r4 = (long) r14
            long r4 = r27 + r4
            r9[r2] = r4
            if (r11 != 0) goto L_0x01c7
            r4 = 1
            goto L_0x01c8
        L_0x01c7:
            r4 = 0
        L_0x01c8:
            r6[r2] = r4
            if (r2 != r12) goto L_0x01da
            r4 = 1
            r6[r2] = r4
            int r20 = r20 + -1
            if (r20 <= 0) goto L_0x01da
            int r4 = r11.mo30712i()
            r5 = -1
            int r4 = r4 + r5
            r12 = r4
        L_0x01da:
            r4 = r29
            r29 = r6
            long r5 = (long) r4
            long r27 = r27 + r5
            int r5 = r24 + -1
            if (r5 != 0) goto L_0x01f5
            if (r8 <= 0) goto L_0x01f2
            int r4 = r10.mo30712i()
            int r5 = r10.mo30712i()
            int r8 = r8 + -1
            goto L_0x01fa
        L_0x01f2:
            r5 = r4
            r4 = 0
            goto L_0x01fa
        L_0x01f5:
            r40 = r5
            r5 = r4
            r4 = r40
        L_0x01fa:
            r6 = r7[r2]
            r24 = r4
            r30 = r5
            long r4 = (long) r6
            long r25 = r25 + r4
            int r22 = r22 + -1
            int r2 = r2 + 1
            r4 = r15
            r5 = r23
            r6 = r29
            r15 = r30
            r23 = r14
            r14 = r24
            goto L_0x0172
        L_0x0214:
            r23 = r5
            r29 = r6
            r24 = r14
            if (r21 != 0) goto L_0x021e
            r2 = 1
            goto L_0x021f
        L_0x021e:
            r2 = 0
        L_0x021f:
            com.google.android.gms.internal.ads.C8195tl.m37898c(r2)
        L_0x0222:
            if (r16 <= 0) goto L_0x0236
            int r2 = r1.mo30712i()
            if (r2 != 0) goto L_0x022c
            r2 = 1
            goto L_0x022d
        L_0x022c:
            r2 = 0
        L_0x022d:
            com.google.android.gms.internal.ads.C8195tl.m37898c(r2)
            r1.mo30708e()
            int r16 = r16 + -1
            goto L_0x0222
        L_0x0236:
            if (r20 != 0) goto L_0x0258
            if (r24 != 0) goto L_0x024f
            if (r22 != 0) goto L_0x0248
            if (r8 == 0) goto L_0x0244
            r1 = 0
            r2 = 0
            r4 = r42
            r5 = r0
            goto L_0x0256
        L_0x0244:
            r4 = r42
            r5 = r0
            goto L_0x029b
        L_0x0248:
            r1 = 0
            r4 = r42
            r5 = r0
            r2 = r22
            goto L_0x0256
        L_0x024f:
            r4 = r42
            r5 = r0
            r2 = r22
            r1 = r24
        L_0x0256:
            r0 = 0
            goto L_0x0261
        L_0x0258:
            r4 = r42
            r5 = r0
            r0 = r20
            r2 = r22
            r1 = r24
        L_0x0261:
            int r6 = r4.f33244a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 215(0xd7, float:3.01E-43)
            r10.<init>(r11)
            java.lang.String r11 = "Inconsistent stbl box for track "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r6 = ": remainingSynchronizationSamples "
            r10.append(r6)
            r10.append(r0)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = "AtomParsers"
            android.util.Log.w(r1, r0)
        L_0x029b:
            r13 = r5
            r12 = r7
            r14 = r9
            r11 = r23
            r15 = r29
        L_0x02a2:
            long[] r0 = r4.f33252i
            if (r0 == 0) goto L_0x04b8
            boolean r0 = r44.mo35615a()
            if (r0 == 0) goto L_0x02ae
            goto L_0x04b8
        L_0x02ae:
            long[] r0 = r4.f33252i
            int r5 = r0.length
            r6 = 1
            if (r5 != r6) goto L_0x033a
            int r5 = r4.f33245b
            if (r5 != r6) goto L_0x033a
            int r5 = r14.length
            r6 = 2
            if (r5 < r6) goto L_0x033a
            long[] r6 = r4.f33253j
            r7 = 0
            r8 = r6[r7]
            r29 = r0[r7]
            long r1 = r4.f33246c
            r22 = r8
            long r7 = r4.f33247d
            r31 = r1
            r33 = r7
            long r0 = com.google.android.gms.internal.ads.C7836jm.m33648j(r29, r31, r33)
            long r8 = r22 + r0
            r0 = 0
            r1 = r14[r0]
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 > 0) goto L_0x033a
            r0 = 1
            r6 = r14[r0]
            int r0 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x033a
            r0 = -1
            int r5 = r5 + r0
            r5 = r14[r5]
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x033a
            int r0 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x033a
            long r29 = r22 - r1
            com.google.android.gms.internal.ads.zzapg r0 = r4.f33249f
            int r0 = r0.f42883t
            long r0 = (long) r0
            long r5 = r4.f33246c
            r31 = r0
            r33 = r5
            long r0 = com.google.android.gms.internal.ads.C7836jm.m33648j(r29, r31, r33)
            long r29 = r27 - r8
            com.google.android.gms.internal.ads.zzapg r2 = r4.f33249f
            int r2 = r2.f42883t
            long r5 = (long) r2
            long r7 = r4.f33246c
            r31 = r5
            r33 = r7
            long r5 = com.google.android.gms.internal.ads.C7836jm.m33648j(r29, r31, r33)
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x0317
            int r2 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x033a
        L_0x0317:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x033a
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0323
            goto L_0x033a
        L_0x0323:
            int r1 = (int) r0
            r0 = r44
            r0.f40780a = r1
            int r1 = (int) r5
            r0.f40781b = r1
            long r0 = r4.f33246c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.C7836jm.m33652n(r14, r2, r0)
            com.google.android.gms.internal.ads.mi r0 = new com.google.android.gms.internal.ads.mi
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x033a:
            long[] r0 = r4.f33252i
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x036d
            r17 = 0
            r1 = r0[r17]
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036d
            r0 = 0
        L_0x0349:
            int r1 = r14.length
            if (r0 >= r1) goto L_0x0366
            r1 = r14[r0]
            long[] r3 = r4.f33253j
            r5 = r3[r17]
            long r18 = r1 - r5
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r4.f33246c
            r22 = r1
            long r1 = com.google.android.gms.internal.ads.C7836jm.m33648j(r18, r20, r22)
            r14[r0] = r1
            int r0 = r0 + 1
            r17 = 0
            goto L_0x0349
        L_0x0366:
            com.google.android.gms.internal.ads.mi r0 = new com.google.android.gms.internal.ads.mi
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x036d:
            int r0 = r4.f33245b
            r1 = 1
            if (r0 != r1) goto L_0x0374
            r6 = 1
            goto L_0x0375
        L_0x0374:
            r6 = 0
        L_0x0375:
            r0 = 0
            r1 = 0
            r2 = 0
            r7 = 0
        L_0x0379:
            long[] r5 = r4.f33252i
            int r8 = r5.length
            r9 = -1
            if (r7 >= r8) goto L_0x03bb
            long[] r8 = r4.f33253j
            r43 = r12
            r16 = r13
            r12 = r8[r7]
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x03b2
            r25 = r5[r7]
            long r8 = r4.f33246c
            r5 = r11
            long r10 = r4.f33247d
            r27 = r8
            r29 = r10
            long r8 = com.google.android.gms.internal.ads.C7836jm.m33648j(r25, r27, r29)
            r10 = 1
            int r11 = com.google.android.gms.internal.ads.C7836jm.m33640b(r14, r12, r10, r10)
            long r12 = r12 + r8
            r8 = 0
            int r9 = com.google.android.gms.internal.ads.C7836jm.m33640b(r14, r12, r6, r8)
            int r8 = r9 - r11
            int r0 = r0 + r8
            if (r1 == r11) goto L_0x03ad
            r1 = 1
            goto L_0x03ae
        L_0x03ad:
            r1 = 0
        L_0x03ae:
            r1 = r1 | r2
            r2 = r1
            r1 = r9
            goto L_0x03b3
        L_0x03b2:
            r5 = r11
        L_0x03b3:
            int r7 = r7 + 1
            r12 = r43
            r11 = r5
            r13 = r16
            goto L_0x0379
        L_0x03bb:
            r5 = r11
            r43 = r12
            r16 = r13
            if (r0 == r3) goto L_0x03c4
            r1 = 1
            goto L_0x03c5
        L_0x03c4:
            r1 = 0
        L_0x03c5:
            r1 = r1 | r2
            if (r1 == 0) goto L_0x03cb
            long[] r2 = new long[r0]
            goto L_0x03cc
        L_0x03cb:
            r2 = r5
        L_0x03cc:
            if (r1 == 0) goto L_0x03d1
            int[] r3 = new int[r0]
            goto L_0x03d3
        L_0x03d1:
            r3 = r43
        L_0x03d3:
            r7 = 1
            if (r7 != r1) goto L_0x03d8
            r13 = 0
            goto L_0x03da
        L_0x03d8:
            r13 = r16
        L_0x03da:
            if (r1 == 0) goto L_0x03df
            int[] r7 = new int[r0]
            goto L_0x03e0
        L_0x03df:
            r7 = r15
        L_0x03e0:
            long[] r0 = new long[r0]
            r28 = r13
            r12 = r18
            r8 = 0
            r11 = 0
        L_0x03e8:
            long[] r9 = r4.f33252i
            int r10 = r9.length
            if (r8 >= r10) goto L_0x048d
            long[] r10 = r4.f33253j
            r29 = r12
            r12 = r10[r8]
            r31 = r9[r8]
            r9 = -1
            int r16 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x0475
            long r9 = r4.f33246c
            r16 = r7
            r24 = r8
            long r7 = r4.f33247d
            r18 = r31
            r20 = r9
            r22 = r7
            long r7 = com.google.android.gms.internal.ads.C7836jm.m33648j(r18, r20, r22)
            r9 = 1
            int r10 = com.google.android.gms.internal.ads.C7836jm.m33640b(r14, r12, r9, r9)
            long r7 = r7 + r12
            r9 = 0
            int r7 = com.google.android.gms.internal.ads.C7836jm.m33640b(r14, r7, r6, r9)
            if (r1 == 0) goto L_0x042c
            int r8 = r7 - r10
            java.lang.System.arraycopy(r5, r10, r2, r11, r8)
            r9 = r43
            java.lang.System.arraycopy(r9, r10, r3, r11, r8)
            r27 = r6
            r6 = r16
            java.lang.System.arraycopy(r15, r10, r6, r11, r8)
            goto L_0x0432
        L_0x042c:
            r9 = r43
            r27 = r6
            r6 = r16
        L_0x0432:
            r8 = r28
        L_0x0434:
            if (r10 >= r7) goto L_0x046e
            r20 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r5
            r16 = r6
            long r5 = r4.f33247d
            r18 = r29
            r22 = r5
            long r5 = com.google.android.gms.internal.ads.C7836jm.m33648j(r18, r20, r22)
            r18 = r14[r10]
            long r34 = r18 - r12
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r43 = r12
            long r12 = r4.f33246c
            r38 = r12
            long r12 = com.google.android.gms.internal.ads.C7836jm.m33648j(r34, r36, r38)
            long r5 = r5 + r12
            r0[r11] = r5
            if (r1 == 0) goto L_0x0463
            r5 = r3[r11]
            if (r5 <= r8) goto L_0x0463
            r8 = r9[r10]
        L_0x0463:
            int r11 = r11 + 1
            int r10 = r10 + 1
            r12 = r43
            r6 = r16
            r5 = r33
            goto L_0x0434
        L_0x046e:
            r33 = r5
            r16 = r6
            r28 = r8
            goto L_0x047f
        L_0x0475:
            r9 = r43
            r33 = r5
            r27 = r6
            r16 = r7
            r24 = r8
        L_0x047f:
            long r12 = r29 + r31
            int r8 = r24 + 1
            r43 = r9
            r7 = r16
            r6 = r27
            r5 = r33
            goto L_0x03e8
        L_0x048d:
            r15 = r7
            r5 = 0
            r17 = 0
        L_0x0491:
            int r1 = r15.length
            if (r5 >= r1) goto L_0x049e
            if (r17 != 0) goto L_0x04a0
            r1 = r15[r5]
            r4 = 1
            r17 = r1 & 1
            int r5 = r5 + 1
            goto L_0x0491
        L_0x049e:
            if (r17 == 0) goto L_0x04b0
        L_0x04a0:
            com.google.android.gms.internal.ads.mi r1 = new com.google.android.gms.internal.ads.mi
            r25 = r1
            r26 = r2
            r27 = r3
            r29 = r0
            r30 = r15
            r25.<init>(r26, r27, r28, r29, r30)
            return r1
        L_0x04b0:
            com.google.android.gms.internal.ads.se r0 = new com.google.android.gms.internal.ads.se
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>(r1)
            throw r0
        L_0x04b8:
            r33 = r11
            r9 = r12
            r16 = r13
            long r0 = r4.f33246c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.C7836jm.m33652n(r14, r2, r0)
            com.google.android.gms.internal.ads.mi r0 = new com.google.android.gms.internal.ads.mi
            r10 = r0
            r11 = r33
            r12 = r9
            r13 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x04d1:
            com.google.android.gms.internal.ads.se r0 = new com.google.android.gms.internal.ads.se
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            goto L_0x04da
        L_0x04d9:
            throw r0
        L_0x04da:
            goto L_0x04d9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8334xh.m39469b(com.google.android.gms.internal.ads.ii, com.google.android.gms.internal.ads.oh, com.google.android.gms.internal.ads.wg):com.google.android.gms.internal.ads.mi");
    }

    /* renamed from: c */
    public static zzatr m39470c(C8050ph phVar, boolean z) {
        if (z) {
            return null;
        }
        C7544bm bmVar = phVar.f37635P0;
        bmVar.mo30725v(8);
        while (bmVar.mo30704a() >= 8) {
            int c = bmVar.mo30706c();
            int e = bmVar.mo30708e();
            if (bmVar.mo30708e() == C8086qh.f38043B0) {
                bmVar.mo30725v(c);
                int i = c + e;
                bmVar.mo30726w(12);
                while (bmVar.mo30706c() < i) {
                    int c2 = bmVar.mo30706c();
                    int e2 = bmVar.mo30708e();
                    if (bmVar.mo30708e() == C8086qh.f38045C0) {
                        bmVar.mo30725v(c2);
                        int i2 = c2 + e2;
                        bmVar.mo30726w(8);
                        ArrayList arrayList = new ArrayList();
                        while (bmVar.mo30706c() < i2) {
                            zzatq a = C7610di.m31408a(bmVar);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzatr((List<? extends zzatq>) arrayList);
                    }
                    bmVar.mo30726w(e2 - 8);
                }
                return null;
            }
            bmVar.mo30726w(e - 8);
        }
        return null;
    }

    /* renamed from: d */
    private static int m39471d(C7544bm bmVar) {
        int g = bmVar.mo30710g();
        int i = g & 127;
        while ((g & 128) == 128) {
            g = bmVar.mo30710g();
            i = (i << 7) | (g & 127);
        }
        return i;
    }

    /* renamed from: e */
    private static int m39472e(C7544bm bmVar, int i, int i2, C8191th thVar, int i3) {
        C7544bm bmVar2 = bmVar;
        int c = bmVar.mo30706c();
        while (true) {
            boolean z = false;
            if (c - i >= i2) {
                return 0;
            }
            bmVar.mo30725v(c);
            int e = bmVar.mo30708e();
            C8195tl.m37899d(e > 0, "childAtomSize should be positive");
            if (bmVar.mo30708e() == C8086qh.f38077W) {
                int i4 = c + 8;
                Pair pair = null;
                Integer num = null;
                C7832ji jiVar = null;
                boolean z2 = false;
                while (i4 - c < e) {
                    bmVar.mo30725v(i4);
                    int e2 = bmVar.mo30708e();
                    int e3 = bmVar.mo30708e();
                    if (e3 == C8086qh.f38085c0) {
                        num = Integer.valueOf(bmVar.mo30708e());
                    } else if (e3 == C8086qh.f38078X) {
                        bmVar.mo30726w(4);
                        z2 = bmVar.mo30708e() == f41165g;
                    } else if (e3 == C8086qh.f38079Y) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= e2) {
                                jiVar = null;
                                break;
                            }
                            bmVar.mo30725v(i5);
                            int e4 = bmVar.mo30708e();
                            if (bmVar.mo30708e() == C8086qh.f38080Z) {
                                bmVar.mo30726w(6);
                                boolean z3 = bmVar.mo30710g() == 1;
                                int g = bmVar.mo30710g();
                                byte[] bArr = new byte[16];
                                bmVar.mo30720q(bArr, 0, 16);
                                jiVar = new C7832ji(z3, g, bArr);
                            } else {
                                i5 += e4;
                            }
                        }
                    }
                    i4 += e2;
                }
                if (z2) {
                    C8195tl.m37899d(num != null, "frma atom is mandatory");
                    if (jiVar != null) {
                        z = true;
                    }
                    C8195tl.m37899d(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, jiVar);
                }
                if (pair != null) {
                    thVar.f39425a[i3] = (C7832ji) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            C8191th thVar2 = thVar;
            c += e;
        }
    }

    /* renamed from: f */
    private static Pair<String, byte[]> m39473f(C7544bm bmVar, int i) {
        bmVar.mo30725v(i + 12);
        bmVar.mo30726w(1);
        m39471d(bmVar);
        bmVar.mo30726w(2);
        int g = bmVar.mo30710g();
        if ((g & 128) != 0) {
            bmVar.mo30726w(2);
        }
        if ((g & 64) != 0) {
            bmVar.mo30726w(bmVar.mo30713j());
        }
        if ((g & 32) != 0) {
            bmVar.mo30726w(2);
        }
        bmVar.mo30726w(1);
        m39471d(bmVar);
        int g2 = bmVar.mo30710g();
        String str = null;
        if (g2 == 32) {
            str = MimeTypes.VIDEO_MP4V;
        } else if (g2 == 33) {
            str = MimeTypes.VIDEO_H264;
        } else if (g2 != 35) {
            if (g2 != 64) {
                if (g2 == 107) {
                    return Pair.create(MimeTypes.AUDIO_MPEG, (Object) null);
                }
                if (g2 == 165) {
                    str = MimeTypes.AUDIO_AC3;
                } else if (g2 != 166) {
                    switch (g2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g2) {
                                case 169:
                                case TsExtractor.TS_STREAM_TYPE_AC4:
                                    return Pair.create(MimeTypes.AUDIO_DTS, (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create(MimeTypes.AUDIO_DTS_HD, (Object) null);
                            }
                    }
                } else {
                    str = MimeTypes.AUDIO_E_AC3;
                }
            }
            str = MimeTypes.AUDIO_AAC;
        } else {
            str = MimeTypes.VIDEO_H265;
        }
        bmVar.mo30726w(12);
        bmVar.mo30726w(1);
        int d = m39471d(bmVar);
        byte[] bArr = new byte[d];
        bmVar.mo30720q(bArr, 0, d);
        return Pair.create(str, bArr);
    }
}
