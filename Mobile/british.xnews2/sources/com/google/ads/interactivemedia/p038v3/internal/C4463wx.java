package com.google.ads.interactivemedia.p038v3.internal;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wx */
/* compiled from: IMASDK */
final class C4463wx implements C4455wp {

    /* renamed from: a */
    final /* synthetic */ C4464wy f19495a;

    /* renamed from: b */
    private final alv f19496b = new alv(new byte[5]);

    /* renamed from: c */
    private final SparseArray<C4470xd> f19497c = new SparseArray<>();

    /* renamed from: d */
    private final SparseIntArray f19498d = new SparseIntArray();

    /* renamed from: e */
    private final int f19499e;

    public C4463wx(C4464wy wyVar, int i) {
        this.f19495a = wyVar;
        this.f19499e = i;
    }

    /* renamed from: a */
    public final void mo16746a(amk amk, C4309re reVar, C4469xc xcVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0170, code lost:
        if (r27.mo13957o() == r14) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0249 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16747b(com.google.ads.interactivemedia.p038v3.internal.alw r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            int r2 = r27.mo13957o()
            r3 = 2
            if (r2 == r3) goto L_0x000c
            return
        L_0x000c:
            com.google.ads.interactivemedia.v3.internal.wy r2 = r0.f19495a
            int r2 = r2.f19501b
            r4 = 0
            r5 = 1
            if (r2 == r5) goto L_0x0046
            com.google.ads.interactivemedia.v3.internal.wy r2 = r0.f19495a
            int r2 = r2.f19501b
            if (r2 == r3) goto L_0x0046
            com.google.ads.interactivemedia.v3.internal.wy r2 = r0.f19495a
            int r2 = r2.f19513n
            if (r2 != r5) goto L_0x0027
            goto L_0x0046
        L_0x0027:
            com.google.ads.interactivemedia.v3.internal.amk r2 = new com.google.ads.interactivemedia.v3.internal.amk
            com.google.ads.interactivemedia.v3.internal.wy r6 = r0.f19495a
            java.util.List r6 = r6.f19503d
            java.lang.Object r6 = r6.get(r4)
            com.google.ads.interactivemedia.v3.internal.amk r6 = (com.google.ads.interactivemedia.p038v3.internal.amk) r6
            long r6 = r6.mo13994b()
            r2.<init>(r6)
            com.google.ads.interactivemedia.v3.internal.wy r6 = r0.f19495a
            java.util.List r6 = r6.f19503d
            r6.add(r2)
            goto L_0x0052
        L_0x0046:
            com.google.ads.interactivemedia.v3.internal.wy r2 = r0.f19495a
            java.util.List r2 = r2.f19503d
            java.lang.Object r2 = r2.get(r4)
            com.google.ads.interactivemedia.v3.internal.amk r2 = (com.google.ads.interactivemedia.p038v3.internal.amk) r2
        L_0x0052:
            int r6 = r27.mo13957o()
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x005b
            return
        L_0x005b:
            r1.mo13954l(r5)
            int r6 = r27.mo13958p()
            r7 = 3
            r1.mo13954l(r7)
            com.google.ads.interactivemedia.v3.internal.alv r8 = r0.f19496b
            r1.mo13955m(r8, r3)
            com.google.ads.interactivemedia.v3.internal.alv r8 = r0.f19496b
            r8.mo13925g(r7)
            com.google.ads.interactivemedia.v3.internal.wy r8 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.alv r9 = r0.f19496b
            r10 = 13
            int r9 = r9.mo13927i(r10)
            r8.f19519t = r9
            com.google.ads.interactivemedia.v3.internal.alv r8 = r0.f19496b
            r1.mo13955m(r8, r3)
            com.google.ads.interactivemedia.v3.internal.alv r8 = r0.f19496b
            r9 = 4
            r8.mo13925g(r9)
            com.google.ads.interactivemedia.v3.internal.alv r8 = r0.f19496b
            r11 = 12
            int r8 = r8.mo13927i(r11)
            r1.mo13954l(r8)
            com.google.ads.interactivemedia.v3.internal.wy r8 = r0.f19495a
            int r8 = r8.f19501b
            r12 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            r14 = 21
            if (r8 != r3) goto L_0x00d0
            com.google.ads.interactivemedia.v3.internal.wy r8 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.xd r8 = r8.f19517r
            if (r8 != 0) goto L_0x00d0
            com.google.ads.interactivemedia.v3.internal.xa r8 = new com.google.ads.interactivemedia.v3.internal.xa
            byte[] r15 = com.google.ads.interactivemedia.p038v3.internal.amm.f15303f
            r8.<init>(r14, r13, r13, r15)
            com.google.ads.interactivemedia.v3.internal.wy r15 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.xb r13 = r15.f19506g
            com.google.ads.interactivemedia.v3.internal.xd r8 = r13.mo16713b(r14, r8)
            r15.f19517r = r8
            com.google.ads.interactivemedia.v3.internal.wy r8 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.xd r8 = r8.f19517r
            com.google.ads.interactivemedia.v3.internal.wy r13 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.re r13 = r13.f19512m
            com.google.ads.interactivemedia.v3.internal.xc r15 = new com.google.ads.interactivemedia.v3.internal.xc
            r15.<init>(r6, r14, r12)
            r8.mo16748a(r2, r13, r15)
        L_0x00d0:
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.xd> r8 = r0.f19497c
            r8.clear()
            android.util.SparseIntArray r8 = r0.f19498d
            r8.clear()
            int r8 = r27.mo13947e()
        L_0x00de:
            if (r8 <= 0) goto L_0x0258
            com.google.ads.interactivemedia.v3.internal.alv r15 = r0.f19496b
            r13 = 5
            r1.mo13955m(r15, r13)
            com.google.ads.interactivemedia.v3.internal.alv r15 = r0.f19496b
            r5 = 8
            int r5 = r15.mo13927i(r5)
            com.google.ads.interactivemedia.v3.internal.alv r15 = r0.f19496b
            r15.mo13925g(r7)
            com.google.ads.interactivemedia.v3.internal.alv r15 = r0.f19496b
            int r15 = r15.mo13927i(r10)
            com.google.ads.interactivemedia.v3.internal.alv r10 = r0.f19496b
            r10.mo13925g(r9)
            com.google.ads.interactivemedia.v3.internal.alv r10 = r0.f19496b
            int r10 = r10.mo13927i(r11)
            int r11 = r27.mo13950h()
            int r12 = r11 + r10
            r3 = -1
            r17 = 0
            r18 = 0
        L_0x010f:
            int r4 = r27.mo13950h()
            if (r4 >= r12) goto L_0x01d2
            int r4 = r27.mo13957o()
            int r16 = r27.mo13957o()
            int r19 = r27.mo13950h()
            int r9 = r19 + r16
            if (r9 <= r12) goto L_0x0127
            goto L_0x01d2
        L_0x0127:
            r7 = 89
            r16 = 172(0xac, float:2.41E-43)
            r20 = 135(0x87, float:1.89E-43)
            r21 = 129(0x81, float:1.81E-43)
            if (r4 != r13) goto L_0x0159
            long r22 = r27.mo13963u()
            r24 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r4 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r4 != 0) goto L_0x013d
            goto L_0x015d
        L_0x013d:
            r24 = 1161904947(0x45414333, double:5.74057318E-315)
            int r4 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r4 != 0) goto L_0x0145
            goto L_0x0165
        L_0x0145:
            r20 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r4 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x014f
        L_0x014c:
            r3 = 172(0xac, float:2.41E-43)
            goto L_0x015f
        L_0x014f:
            r20 = 1212503619(0x48455643, double:5.990563836E-315)
            int r4 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x015f
            r3 = 36
            goto L_0x015f
        L_0x0159:
            r13 = 106(0x6a, float:1.49E-43)
            if (r4 != r13) goto L_0x0161
        L_0x015d:
            r3 = 129(0x81, float:1.81E-43)
        L_0x015f:
            r7 = 4
            goto L_0x01c3
        L_0x0161:
            r13 = 122(0x7a, float:1.71E-43)
            if (r4 != r13) goto L_0x0168
        L_0x0165:
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x015f
        L_0x0168:
            r13 = 127(0x7f, float:1.78E-43)
            if (r4 != r13) goto L_0x0173
            int r4 = r27.mo13957o()
            if (r4 != r14) goto L_0x015f
            goto L_0x014c
        L_0x0173:
            r13 = 123(0x7b, float:1.72E-43)
            if (r4 != r13) goto L_0x017a
            r3 = 138(0x8a, float:1.93E-43)
            goto L_0x015f
        L_0x017a:
            r13 = 10
            if (r4 != r13) goto L_0x0188
            r13 = 3
            java.lang.String r4 = r1.mo13937F(r13)
            java.lang.String r17 = r4.trim()
            goto L_0x015f
        L_0x0188:
            r13 = 3
            if (r4 != r7) goto L_0x01bc
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0190:
            int r4 = r27.mo13950h()
            if (r4 >= r9) goto L_0x01b6
            java.lang.String r4 = r1.mo13937F(r13)
            java.lang.String r4 = r4.trim()
            r27.mo13957o()
            r7 = 4
            byte[] r13 = new byte[r7]
            r14 = 0
            r1.mo13956n(r13, r14, r7)
            com.google.ads.interactivemedia.v3.internal.wz r14 = new com.google.ads.interactivemedia.v3.internal.wz
            r14.<init>(r4, r13)
            r3.add(r14)
            r7 = 89
            r13 = 3
            r14 = 21
            goto L_0x0190
        L_0x01b6:
            r7 = 4
            r18 = r3
            r3 = 89
            goto L_0x01c3
        L_0x01bc:
            r7 = 4
            r13 = 111(0x6f, float:1.56E-43)
            if (r4 != r13) goto L_0x01c3
            r3 = 257(0x101, float:3.6E-43)
        L_0x01c3:
            int r4 = r27.mo13950h()
            int r9 = r9 - r4
            r1.mo13954l(r9)
            r7 = 3
            r9 = 4
            r13 = 5
            r14 = 21
            goto L_0x010f
        L_0x01d2:
            r7 = 4
            r1.mo13951i(r12)
            com.google.ads.interactivemedia.v3.internal.xa r4 = new com.google.ads.interactivemedia.v3.internal.xa
            byte[] r9 = r27.mo13952j()
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r11, r12)
            r11 = r17
            r12 = r18
            r4.<init>(r3, r11, r12, r9)
            r3 = 6
            if (r5 == r3) goto L_0x01ed
            r3 = 5
            if (r5 != r3) goto L_0x01ef
        L_0x01ed:
            int r5 = r4.f19526a
        L_0x01ef:
            int r10 = r10 + 5
            int r8 = r8 - r10
            com.google.ads.interactivemedia.v3.internal.wy r3 = r0.f19495a
            int r3 = r3.f19501b
            r9 = 2
            if (r3 != r9) goto L_0x01fd
            r3 = r5
            goto L_0x01fe
        L_0x01fd:
            r3 = r15
        L_0x01fe:
            com.google.ads.interactivemedia.v3.internal.wy r10 = r0.f19495a
            android.util.SparseBooleanArray r10 = r10.f19508i
            boolean r10 = r10.get(r3)
            if (r10 == 0) goto L_0x020d
            r9 = 21
            goto L_0x0249
        L_0x020d:
            com.google.ads.interactivemedia.v3.internal.wy r10 = r0.f19495a
            int r10 = r10.f19501b
            if (r10 != r9) goto L_0x0220
            r9 = 21
            if (r5 != r9) goto L_0x0222
            com.google.ads.interactivemedia.v3.internal.wy r4 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.xd r4 = r4.f19517r
            goto L_0x022c
        L_0x0220:
            r9 = 21
        L_0x0222:
            com.google.ads.interactivemedia.v3.internal.wy r10 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.xb r10 = r10.f19506g
            com.google.ads.interactivemedia.v3.internal.xd r4 = r10.mo16713b(r5, r4)
        L_0x022c:
            com.google.ads.interactivemedia.v3.internal.wy r5 = r0.f19495a
            int r5 = r5.f19501b
            r10 = 2
            if (r5 != r10) goto L_0x023f
            android.util.SparseIntArray r5 = r0.f19498d
            r10 = 8192(0x2000, float:1.14794E-41)
            int r5 = r5.get(r3, r10)
            if (r15 >= r5) goto L_0x0249
        L_0x023f:
            android.util.SparseIntArray r5 = r0.f19498d
            r5.put(r3, r15)
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.xd> r5 = r0.f19497c
            r5.put(r3, r4)
        L_0x0249:
            r3 = 2
            r4 = 0
            r5 = 1
            r7 = 3
            r9 = 4
            r10 = 13
            r11 = 12
            r12 = 8192(0x2000, float:1.14794E-41)
            r14 = 21
            goto L_0x00de
        L_0x0258:
            android.util.SparseIntArray r1 = r0.f19498d
            int r1 = r1.size()
            r14 = 0
        L_0x025f:
            if (r14 >= r1) goto L_0x02b4
            android.util.SparseIntArray r3 = r0.f19498d
            int r3 = r3.keyAt(r14)
            android.util.SparseIntArray r4 = r0.f19498d
            int r4 = r4.valueAt(r14)
            com.google.ads.interactivemedia.v3.internal.wy r5 = r0.f19495a
            android.util.SparseBooleanArray r5 = r5.f19508i
            r7 = 1
            r5.put(r3, r7)
            com.google.ads.interactivemedia.v3.internal.wy r5 = r0.f19495a
            android.util.SparseBooleanArray r5 = r5.f19509j
            r5.put(r4, r7)
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.xd> r5 = r0.f19497c
            java.lang.Object r5 = r5.valueAt(r14)
            com.google.ads.interactivemedia.v3.internal.xd r5 = (com.google.ads.interactivemedia.p038v3.internal.C4470xd) r5
            if (r5 == 0) goto L_0x02af
            com.google.ads.interactivemedia.v3.internal.wy r7 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.xd r7 = r7.f19517r
            if (r5 == r7) goto L_0x02a3
            com.google.ads.interactivemedia.v3.internal.wy r7 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.re r7 = r7.f19512m
            com.google.ads.interactivemedia.v3.internal.xc r8 = new com.google.ads.interactivemedia.v3.internal.xc
            r9 = 8192(0x2000, float:1.14794E-41)
            r8.<init>(r6, r3, r9)
            r5.mo16748a(r2, r7, r8)
            goto L_0x02a5
        L_0x02a3:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x02a5:
            com.google.ads.interactivemedia.v3.internal.wy r3 = r0.f19495a
            android.util.SparseArray r3 = r3.f19507h
            r3.put(r4, r5)
            goto L_0x02b1
        L_0x02af:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x02b1:
            int r14 = r14 + 1
            goto L_0x025f
        L_0x02b4:
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            int r1 = r1.f19501b
            r2 = 2
            if (r1 != r2) goto L_0x02da
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            boolean r1 = r1.f19514o
            if (r1 != 0) goto L_0x0313
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.re r1 = r1.f19512m
            r1.mo13363bb()
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            r2 = 0
            r1.f19513n = r2
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            r1.f19514o = true
            return
        L_0x02da:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            android.util.SparseArray r1 = r1.f19507h
            int r3 = r0.f19499e
            r1.remove(r3)
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            int r3 = r1.f19501b
            r4 = 1
            if (r3 != r4) goto L_0x02f1
            r4 = 0
            goto L_0x02fa
        L_0x02f1:
            com.google.ads.interactivemedia.v3.internal.wy r2 = r0.f19495a
            int r2 = r2.f19513n
            r3 = -1
            int r4 = r2 + -1
        L_0x02fa:
            r1.f19513n = r4
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            int r1 = r1.f19513n
            if (r1 != 0) goto L_0x0313
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            com.google.ads.interactivemedia.v3.internal.re r1 = r1.f19512m
            r1.mo13363bb()
            com.google.ads.interactivemedia.v3.internal.wy r1 = r0.f19495a
            r1.f19514o = true
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4463wx.mo16747b(com.google.ads.interactivemedia.v3.internal.alw):void");
    }
}
