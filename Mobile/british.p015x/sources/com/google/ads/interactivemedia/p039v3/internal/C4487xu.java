package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xu */
/* compiled from: IMASDK */
public final class C4487xu extends Exception {

    /* renamed from: a */
    public final String f19594a;

    /* renamed from: b */
    public final boolean f19595b;

    /* renamed from: c */
    public final C4486xt f19596c;

    /* renamed from: d */
    public final String f19597d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4487xu(com.google.ads.interactivemedia.p039v3.internal.C4120ke r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 36
            r2.<init>(r1)
            java.lang.String r1 = "Decoder init failed: ["
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = "], "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r11.f17681l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r0 = 75
            r14.<init>(r0)
            java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
            r14.append(r0)
            java.lang.String r0 = "neg_"
            r14.append(r0)
            r14.append(r11)
            java.lang.String r9 = r14.toString()
            r8 = 0
            r3 = r10
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4487xu.<init>(com.google.ads.interactivemedia.v3.internal.ke, java.lang.Throwable, boolean, int):void");
    }

    /* renamed from: a */
    static /* synthetic */ C4487xu m19487a(C4487xu xuVar, C4487xu xuVar2) {
        return new C4487xu(xuVar.getMessage(), xuVar.getCause(), xuVar.f19594a, xuVar.f19595b, xuVar.f19596c, xuVar.f19597d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4487xu(com.google.ads.interactivemedia.p039v3.internal.C4120ke r8, java.lang.Throwable r9, boolean r10, com.google.ads.interactivemedia.p039v3.internal.C4486xt r11) {
        /*
            r7 = this;
            java.lang.String r0 = r11.f19587a
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r4 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 23
            int r3 = r3 + r4
            r6.<init>(r3)
            java.lang.String r3 = "Decoder init failed: "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = r8.f17681l
            int r0 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            r4 = 0
            r6 = 21
            if (r0 < r6) goto L_0x0044
            boolean r0 = r9 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x0044
            r0 = r9
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
            r6 = r0
            goto L_0x0045
        L_0x0044:
            r6 = r4
        L_0x0045:
            r0 = r7
            r2 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4487xu.<init>(com.google.ads.interactivemedia.v3.internal.ke, java.lang.Throwable, boolean, com.google.ads.interactivemedia.v3.internal.xt):void");
    }

    private C4487xu(String str, Throwable th, String str2, boolean z, C4486xt xtVar, String str3) {
        super(str, th);
        this.f19594a = str2;
        this.f19595b = z;
        this.f19596c = xtVar;
        this.f19597d = str3;
    }
}
