package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uo */
/* compiled from: IMASDK */
public final class C4400uo {

    /* renamed from: a */
    public final boolean f19054a;

    /* renamed from: b */
    public final String f19055b;

    /* renamed from: c */
    public final C4326rv f19056c;

    /* renamed from: d */
    public final int f19057d;

    /* renamed from: e */
    public final byte[] f19058e;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r6.equals(com.google.android.exoplayer2.C6540C.CENC_TYPE_cenc) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4400uo(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r11 != 0) goto L_0x000e
            r3 = 1
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            r2 = r2 ^ r3
            com.google.ads.interactivemedia.p038v3.internal.aup.m14885p(r2)
            r4.f19054a = r5
            r4.f19055b = r6
            r4.f19057d = r7
            r4.f19058e = r11
            com.google.ads.interactivemedia.v3.internal.rv r5 = new com.google.ads.interactivemedia.v3.internal.rv
            r7 = 2
            if (r6 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L_0x0047;
                case 3046671: goto L_0x003d;
                case 3049879: goto L_0x0034;
                case 3049895: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0051
        L_0x002a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0034:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x0051
            goto L_0x0052
        L_0x003d:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x0051
            r0 = 3
            goto L_0x0052
        L_0x0047:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x0051
            r0 = 2
            goto L_0x0052
        L_0x0051:
            r0 = -1
        L_0x0052:
            if (r0 == 0) goto L_0x007d
            if (r0 == r1) goto L_0x007d
            if (r0 == r7) goto L_0x007c
            if (r0 == r2) goto L_0x007c
            int r7 = r6.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r7 = r7 + 68
            r11.<init>(r7)
            java.lang.String r7 = "Unsupported protection scheme type '"
            r11.append(r7)
            r11.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L_0x007d
        L_0x007c:
            r1 = 2
        L_0x007d:
            r5.<init>(r1, r8, r9, r10)
            r4.f19056c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4400uo.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
