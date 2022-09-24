package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.h1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7740h1 {

    /* renamed from: a */
    private static final int[] f32572a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m32775a(wb4 wb4) throws IOException {
        return m32777c(wb4, true, false);
    }

    /* renamed from: b */
    public static boolean m32776b(wb4 wb4, boolean z) throws IOException {
        return m32777c(wb4, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        r9 = true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m32777c(com.google.android.gms.internal.ads.wb4 r21, boolean r22, boolean r23) throws java.io.IOException {
        /*
            r0 = r21
            long r1 = r21.zzc()
            r3 = 4096(0x1000, double:2.0237E-320)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0014
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            int r4 = (int) r3
            com.google.android.gms.internal.ads.uq2 r3 = new com.google.android.gms.internal.ads.uq2
            r7 = 64
            r3.<init>((int) r7)
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x001f:
            r10 = 1
            if (r8 >= r4) goto L_0x00ff
            r11 = 8
            r3.mo35233c(r11)
            byte[] r12 = r3.mo35238h()
            boolean r12 = r0.mo33311e(r12, r7, r11, r10)
            if (r12 != 0) goto L_0x0033
            goto L_0x00ff
        L_0x0033:
            long r12 = r3.mo35223A()
            int r14 = r3.mo35243m()
            r15 = 1
            r10 = 16
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0052
            byte[] r12 = r3.mo35238h()
            r0.mo33313g(r12, r11, r11)
            r3.mo35235e(r10)
            long r12 = r3.mo35256z()
            goto L_0x006a
        L_0x0052:
            r15 = 0
            int r10 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r10 != 0) goto L_0x0068
            long r15 = r21.zzc()
            int r10 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0068
            long r12 = r21.zzd()
            long r15 = r15 - r12
            r12 = 8
            long r12 = r12 + r15
        L_0x0068:
            r10 = 8
        L_0x006a:
            long r5 = (long) r10
            int r17 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r17 >= 0) goto L_0x0070
            return r7
        L_0x0070:
            int r8 = r8 + r10
            r10 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r14 != r10) goto L_0x0086
            int r5 = (int) r12
            int r4 = r4 + r5
            r15 = -1
            int r5 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x0084
            long r5 = (long) r4
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0084
            int r4 = (int) r1
        L_0x0084:
            r5 = r15
            goto L_0x001f
        L_0x0086:
            r15 = -1
            r10 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r14 == r10) goto L_0x00fd
            r10 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r14 != r10) goto L_0x0094
            goto L_0x00fd
        L_0x0094:
            r17 = r1
            long r1 = (long) r8
            long r1 = r1 + r12
            long r1 = r1 - r5
            r19 = r8
            long r7 = (long) r4
            int r20 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r20 < 0) goto L_0x00a1
            goto L_0x00ff
        L_0x00a1:
            long r12 = r12 - r5
            int r1 = (int) r12
            int r8 = r19 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r14 != r2) goto L_0x00f2
            if (r1 >= r11) goto L_0x00ae
            r2 = 0
            return r2
        L_0x00ae:
            r2 = 0
            r3.mo35233c(r1)
            byte[] r5 = r3.mo35238h()
            r0.mo33313g(r5, r2, r1)
            int r1 = r1 >> 2
            r2 = 0
        L_0x00bc:
            if (r2 >= r1) goto L_0x00ed
            r5 = 1
            if (r2 != r5) goto L_0x00c6
            r5 = 4
            r3.mo35237g(r5)
            goto L_0x00ea
        L_0x00c6:
            int r5 = r3.mo35243m()
            int r6 = r5 >>> 8
            r7 = 3368816(0x336770, float:4.720717E-39)
            if (r6 != r7) goto L_0x00d3
        L_0x00d1:
            r9 = 1
            goto L_0x00ed
        L_0x00d3:
            r6 = 1751476579(0x68656963, float:4.333464E24)
            if (r5 != r6) goto L_0x00db
            r5 = 1751476579(0x68656963, float:4.333464E24)
        L_0x00db:
            int[] r6 = f32572a
            r7 = 0
        L_0x00de:
            r11 = 29
            if (r7 >= r11) goto L_0x00ea
            r11 = r6[r7]
            if (r11 != r5) goto L_0x00e7
            goto L_0x00d1
        L_0x00e7:
            int r7 = r7 + 1
            goto L_0x00de
        L_0x00ea:
            int r2 = r2 + 1
            goto L_0x00bc
        L_0x00ed:
            if (r9 == 0) goto L_0x00f0
            goto L_0x00f7
        L_0x00f0:
            r1 = 0
            return r1
        L_0x00f2:
            if (r1 == 0) goto L_0x00f7
            r0.zzf(r1)
        L_0x00f7:
            r5 = r15
            r1 = r17
            r7 = 0
            goto L_0x001f
        L_0x00fd:
            r2 = 1
            goto L_0x0100
        L_0x00ff:
            r2 = 0
        L_0x0100:
            if (r9 == 0) goto L_0x0108
            r0 = r22
            if (r0 != r2) goto L_0x0108
            r0 = 1
            return r0
        L_0x0108:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7740h1.m32777c(com.google.android.gms.internal.ads.wb4, boolean, boolean):boolean");
    }
}
