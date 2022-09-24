package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avy */
/* compiled from: IMASDK */
public final class avy {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r4 > 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r11 > 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r11 < 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r10 != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m14981a(long r10, java.math.RoundingMode r12) {
        /*
            com.google.ads.interactivemedia.p039v3.internal.ars.m14627g(r12)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r10 / r0
            long r4 = r2 * r0
            long r4 = r10 - r4
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0012
            return r2
        L_0x0012:
            long r10 = r10 ^ r0
            r8 = 63
            long r10 = r10 >> r8
            int r11 = (int) r10
            r10 = 1
            r11 = r11 | r10
            int[] r8 = com.google.ads.interactivemedia.p039v3.internal.avx.f15817a
            int r9 = r12.ordinal()
            r8 = r8[r9]
            r9 = 0
            switch(r8) {
                case 1: goto L_0x0064;
                case 2: goto L_0x0068;
                case 3: goto L_0x005b;
                case 4: goto L_0x0061;
                case 5: goto L_0x0058;
                case 6: goto L_0x002b;
                case 7: goto L_0x002b;
                case 8: goto L_0x002b;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L_0x002b:
            long r4 = java.lang.Math.abs(r4)
            long r0 = java.lang.Math.abs(r0)
            long r0 = r0 - r4
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0053
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r12 != r0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r1) goto L_0x0046
            r12 = 1
            goto L_0x0047
        L_0x0046:
            r12 = 0
        L_0x0047:
            r4 = 1
            long r4 = r4 & r2
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r10 = 0
        L_0x0050:
            r10 = r10 & r12
            r10 = r10 | r0
            goto L_0x005f
        L_0x0053:
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x005e
            goto L_0x005f
        L_0x0058:
            if (r11 <= 0) goto L_0x005e
            goto L_0x005f
        L_0x005b:
            if (r11 >= 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            if (r10 == 0) goto L_0x0068
        L_0x0061:
            long r10 = (long) r11
            long r2 = r2 + r10
            return r2
        L_0x0064:
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0069
        L_0x0068:
            return r2
        L_0x0069:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "mode was UNNECESSARY, but rounding was necessary"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.avy.m14981a(long, java.math.RoundingMode):long");
    }
}
