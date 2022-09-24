package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nm */
/* compiled from: IMASDK */
public final class C4209nm {

    /* renamed from: a */
    public static final /* synthetic */ int f18086a = 0;

    /* renamed from: b */
    private static final int[] f18087b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r10 != 11) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r10 != 11) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        if (r10 != 8) goto L_0x0096;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p038v3.internal.C4208nl m18276a(com.google.ads.interactivemedia.p038v3.internal.alv r10) {
        /*
            r0 = 16
            int r1 = r10.mo13927i(r0)
            int r0 = r10.mo13927i(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.mo13927i(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r3 = r10.mo13927i(r1)
            r4 = 3
            if (r3 != r4) goto L_0x0032
        L_0x0029:
            r10.mo13927i(r1)
            boolean r3 = r10.mo13926h()
            if (r3 != 0) goto L_0x0029
        L_0x0032:
            r3 = 10
            int r3 = r10.mo13927i(r3)
            boolean r5 = r10.mo13926h()
            if (r5 == 0) goto L_0x0047
            int r5 = r10.mo13927i(r4)
            if (r5 <= 0) goto L_0x0047
            r10.mo13925g(r1)
        L_0x0047:
            boolean r5 = r10.mo13926h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 1
            if (r8 == r5) goto L_0x0058
            r5 = 44100(0xac44, float:6.1797E-41)
            goto L_0x005b
        L_0x0058:
            r5 = 48000(0xbb80, float:6.7262E-41)
        L_0x005b:
            int r10 = r10.mo13927i(r2)
            r9 = 0
            if (r5 != r6) goto L_0x006b
            r6 = 13
            if (r10 != r6) goto L_0x006b
            int[] r10 = f18087b
            r9 = r10[r6]
            goto L_0x0096
        L_0x006b:
            if (r5 != r7) goto L_0x0096
            r6 = 14
            if (r10 >= r6) goto L_0x0096
            int[] r6 = f18087b
            r9 = r6[r10]
            int r3 = r3 % 5
            r6 = 8
            if (r3 == r8) goto L_0x0090
            r7 = 11
            if (r3 == r1) goto L_0x008b
            if (r3 == r4) goto L_0x0090
            if (r3 == r2) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            if (r10 == r4) goto L_0x0094
            if (r10 == r6) goto L_0x0094
            if (r10 != r7) goto L_0x0096
            goto L_0x0094
        L_0x008b:
            if (r10 == r6) goto L_0x0094
            if (r10 != r7) goto L_0x0096
            goto L_0x0094
        L_0x0090:
            if (r10 == r4) goto L_0x0094
            if (r10 != r6) goto L_0x0096
        L_0x0094:
            int r9 = r9 + 1
        L_0x0096:
            com.google.ads.interactivemedia.v3.internal.nl r10 = new com.google.ads.interactivemedia.v3.internal.nl
            r10.<init>(r5, r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4209nm.m18276a(com.google.ads.interactivemedia.v3.internal.alv):com.google.ads.interactivemedia.v3.internal.nl");
    }

    /* renamed from: b */
    public static void m18277b(int i, alw alw) {
        alw.mo13943a(7);
        byte[] j = alw.mo13952j();
        j[0] = -84;
        j[1] = 64;
        j[2] = -1;
        j[3] = -1;
        j[4] = (byte) ((i >> 16) & 255);
        j[5] = (byte) ((i >> 8) & 255);
        j[6] = (byte) (i & 255);
    }
}
