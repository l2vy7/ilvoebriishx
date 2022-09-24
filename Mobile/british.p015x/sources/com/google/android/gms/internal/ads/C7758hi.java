package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.hi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7758hi {

    /* renamed from: a */
    private static final int[] f32735a = {C7836jm.m33645g("isom"), C7836jm.m33645g("iso2"), C7836jm.m33645g("iso3"), C7836jm.m33645g("iso4"), C7836jm.m33645g("iso5"), C7836jm.m33645g("iso6"), C7836jm.m33645g("avc1"), C7836jm.m33645g("hvc1"), C7836jm.m33645g("hev1"), C7836jm.m33645g("mp41"), C7836jm.m33645g("mp42"), C7836jm.m33645g("3g2a"), C7836jm.m33645g("3g2b"), C7836jm.m33645g("3gr6"), C7836jm.m33645g("3gs6"), C7836jm.m33645g("3ge6"), C7836jm.m33645g("3gg6"), C7836jm.m33645g("M4V "), C7836jm.m33645g("M4A "), C7836jm.m33645g("f4v "), C7836jm.m33645g("kddi"), C7836jm.m33645g("M4VP"), C7836jm.m33645g("qt  "), C7836jm.m33645g("MSNV")};

    /* renamed from: a */
    public static boolean m32872a(C8121rg rgVar) throws IOException, InterruptedException {
        return m32874c(rgVar, true);
    }

    /* renamed from: b */
    public static boolean m32873b(C8121rg rgVar) throws IOException, InterruptedException {
        return m32874c(rgVar, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        r5 = true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m32874c(com.google.android.gms.internal.ads.C8121rg r16, boolean r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r0 = r16
            long r1 = r16.mo34533c()
            r3 = 4096(0x1000, double:2.0237E-320)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0012
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            int r2 = (int) r1
            com.google.android.gms.internal.ads.bm r1 = new com.google.android.gms.internal.ads.bm
            r3 = 64
            r1.<init>((int) r3)
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x001e:
            if (r4 >= r2) goto L_0x00b8
            r7 = 8
            r1.mo30722s(r7)
            byte[] r8 = r1.f30037a
            r0.mo34537g(r8, r3, r7, r3)
            long r8 = r1.mo30716m()
            int r10 = r1.mo30708e()
            r11 = 1
            r13 = 16
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x0047
            byte[] r8 = r1.f30037a
            r0.mo34537g(r8, r7, r7, r3)
            r1.mo30724u(r13)
            long r8 = r1.mo30717n()
            goto L_0x0049
        L_0x0047:
            r13 = 8
        L_0x0049:
            long r11 = (long) r13
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 >= 0) goto L_0x004f
            return r3
        L_0x004f:
            int r4 = r4 + r13
            int r13 = com.google.android.gms.internal.ads.C8086qh.f38044C
            if (r10 == r13) goto L_0x001e
            int r13 = com.google.android.gms.internal.ads.C8086qh.f38062L
            if (r10 == r13) goto L_0x00b6
            int r13 = com.google.android.gms.internal.ads.C8086qh.f38066N
            if (r10 != r13) goto L_0x005d
            goto L_0x00b6
        L_0x005d:
            long r13 = (long) r4
            long r13 = r13 + r8
            long r13 = r13 - r11
            long r6 = (long) r2
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 < 0) goto L_0x0066
            goto L_0x00b8
        L_0x0066:
            long r8 = r8 - r11
            int r6 = (int) r8
            int r4 = r4 + r6
            int r7 = com.google.android.gms.internal.ads.C8086qh.f38082b
            if (r10 != r7) goto L_0x00af
            r7 = 8
            if (r6 >= r7) goto L_0x0072
            return r3
        L_0x0072:
            r1.mo30722s(r6)
            byte[] r7 = r1.f30037a
            r0.mo34537g(r7, r3, r6, r3)
            int r6 = r6 >> 2
            r7 = 0
        L_0x007d:
            if (r7 >= r6) goto L_0x00aa
            r8 = 1
            if (r7 != r8) goto L_0x0087
            r8 = 4
            r1.mo30726w(r8)
            goto L_0x00a7
        L_0x0087:
            int r8 = r1.mo30708e()
            int r9 = r8 >>> 8
            java.lang.String r10 = "3gp"
            int r10 = com.google.android.gms.internal.ads.C7836jm.m33645g(r10)
            if (r9 != r10) goto L_0x0097
        L_0x0095:
            r5 = 1
            goto L_0x00aa
        L_0x0097:
            int[] r9 = f32735a
            int r10 = r9.length
            r10 = 0
        L_0x009b:
            r11 = 24
            if (r10 >= r11) goto L_0x00a7
            r11 = r9[r10]
            if (r11 != r8) goto L_0x00a4
            goto L_0x0095
        L_0x00a4:
            int r10 = r10 + 1
            goto L_0x009b
        L_0x00a7:
            int r7 = r7 + 1
            goto L_0x007d
        L_0x00aa:
            if (r5 == 0) goto L_0x00ae
            goto L_0x001e
        L_0x00ae:
            return r3
        L_0x00af:
            if (r6 == 0) goto L_0x001e
            r0.mo34536f(r6, r3)
            goto L_0x001e
        L_0x00b6:
            r8 = 1
            goto L_0x00b9
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            if (r5 == 0) goto L_0x00c1
            r0 = r17
            if (r0 != r8) goto L_0x00c1
            r0 = 1
            return r0
        L_0x00c1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7758hi.m32874c(com.google.android.gms.internal.ads.rg, boolean):boolean");
    }
}
