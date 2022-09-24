package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k34 extends Exception {

    /* renamed from: b */
    public final String f34137b;

    /* renamed from: c */
    public final boolean f34138c;

    /* renamed from: d */
    public final j34 f34139d;

    /* renamed from: e */
    public final String f34140e;

    /* renamed from: f */
    public final k34 f34141f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k34(com.google.android.gms.internal.ads.C8281w r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r0 = r13.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 36
            r1.<init>(r0)
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r5 = r11.f40619l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 75
            r13.<init>(r14)
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r1.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k34.<init>(com.google.android.gms.internal.ads.w, java.lang.Throwable, boolean, int):void");
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ k34 m33833a(k34 k34, k34 k342) {
        return new k34(k34.getMessage(), k34.getCause(), k34.f34137b, false, k34.f34139d, k34.f34140e, k342);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k34(com.google.android.gms.internal.ads.C8281w r9, java.lang.Throwable r10, boolean r11, com.google.android.gms.internal.ads.j34 r12) {
        /*
            r8 = this;
            java.lang.String r0 = r12.f33740a
            java.lang.String r1 = java.lang.String.valueOf(r9)
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
            java.lang.String r3 = r9.f40619l
            int r0 = com.google.android.gms.internal.ads.d13.f20195a
            r4 = 0
            r6 = 21
            if (r0 < r6) goto L_0x0044
            boolean r0 = r10 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x0044
            r0 = r10
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
            r6 = r0
            goto L_0x0045
        L_0x0044:
            r6 = r4
        L_0x0045:
            r4 = 0
            r7 = 0
            r0 = r8
            r2 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k34.<init>(com.google.android.gms.internal.ads.w, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.j34):void");
    }

    private k34(String str, Throwable th, String str2, boolean z, j34 j34, String str3, k34 k34) {
        super(str, th);
        this.f34137b = str2;
        this.f34138c = false;
        this.f34139d = j34;
        this.f34140e = str3;
        this.f34141f = k34;
    }
}
