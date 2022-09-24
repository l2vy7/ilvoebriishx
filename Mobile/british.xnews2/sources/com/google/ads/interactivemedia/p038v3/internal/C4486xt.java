package com.google.ads.interactivemedia.p038v3.internal;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xt */
/* compiled from: IMASDK */
public final class C4486xt {

    /* renamed from: a */
    public final String f19587a;

    /* renamed from: b */
    public final String f19588b;

    /* renamed from: c */
    public final String f19589c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f19590d;

    /* renamed from: e */
    public final boolean f19591e;

    /* renamed from: f */
    public final boolean f19592f;

    /* renamed from: g */
    private final boolean f19593g;

    C4486xt(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        aup.m14890u(str);
        this.f19587a = str;
        this.f19588b = str2;
        this.f19589c = str3;
        this.f19590d = codecCapabilities;
        this.f19591e = z;
        this.f19592f = z2;
        this.f19593g = aln.m14032b(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if ("Nexus 10".equals(r0) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r7) == false) goto L_0x003b;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p038v3.internal.C4486xt m19477g(java.lang.String r7, java.lang.String r8, java.lang.String r9, android.media.MediaCodecInfo.CodecCapabilities r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            com.google.ads.interactivemedia.v3.internal.xt r11 = new com.google.ads.interactivemedia.v3.internal.xt
            r12 = 1
            r13 = 0
            if (r10 == 0) goto L_0x003d
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            r1 = 19
            if (r0 < r1) goto L_0x003d
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L_0x003d
            r1 = 22
            if (r0 > r1) goto L_0x003b
            java.lang.String r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15301d
            java.lang.String r1 = "ODROID-XU3"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = "Nexus 10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
        L_0x002a:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r5 = 1
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            r0 = 21
            if (r10 == 0) goto L_0x004b
            int r1 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            if (r1 < r0) goto L_0x004b
            java.lang.String r1 = "tunneled-playback"
            r10.isFeatureSupported(r1)
        L_0x004b:
            if (r14 != 0) goto L_0x005e
            if (r10 == 0) goto L_0x005c
            int r14 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            if (r14 < r0) goto L_0x005c
            java.lang.String r14 = "secure-playback"
            boolean r14 = r10.isFeatureSupported(r14)
            if (r14 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r6 = 0
            goto L_0x005f
        L_0x005e:
            r6 = 1
        L_0x005f:
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4486xt.m19477g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.google.ads.interactivemedia.v3.internal.xt");
    }

    /* renamed from: h */
    private final void m19478h(String str) {
        String str2 = this.f19587a;
        String str3 = this.f19588b;
        String str4 = amm.f15302e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + str3.length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb.toString());
    }

    /* renamed from: i */
    private static boolean m19479i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point j = m19480j(videoCapabilities, i, i2);
        int i3 = j.x;
        int i4 = j.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: j */
    private static Point m19480j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(amm.m14189F(i, widthAlignment) * widthAlignment, amm.m14189F(i2, heightAlignment) * heightAlignment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo16778a() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f19590d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4486xt.mo16778a():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        r7 = r7.getVideoCapabilities();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16779b(com.google.ads.interactivemedia.p038v3.internal.C4120ke r13) throws com.google.ads.interactivemedia.p038v3.internal.C4496yc {
        /*
            r12 = this;
            java.lang.String r0 = r13.f17678i
            r1 = 16
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = com.google.ads.interactivemedia.p038v3.internal.aln.m14040j(r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x0131
        L_0x0010:
            java.lang.String r4 = r12.f19588b
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = ", "
            if (r4 != 0) goto L_0x0047
            java.lang.String r13 = r13.f17678i
            java.lang.String r1 = java.lang.String.valueOf(r13)
            int r1 = r1.length()
            int r3 = r0.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + 13
            int r1 = r1 + r3
            r4.<init>(r1)
            java.lang.String r1 = "codec.mime "
            r4.append(r1)
            r4.append(r13)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r13 = r4.toString()
            r12.m19478h(r13)
            goto L_0x0130
        L_0x0047:
            android.util.Pair r4 = com.google.ads.interactivemedia.p038v3.internal.C4501yh.m19580e(r13)
            if (r4 == 0) goto L_0x0131
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            boolean r7 = r12.f19593g
            r8 = 42
            if (r7 != 0) goto L_0x0067
            if (r6 != r8) goto L_0x0131
            r6 = 42
        L_0x0067:
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r12.mo16778a()
            int r8 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            r9 = 23
            if (r8 > r9) goto L_0x00f4
            java.lang.String r8 = r12.f19588b
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00f4
            int r8 = r7.length
            if (r8 != 0) goto L_0x00f4
            android.media.MediaCodecInfo$CodecCapabilities r7 = r12.f19590d
            if (r7 == 0) goto L_0x0097
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()
            if (r7 == 0) goto L_0x0097
            android.util.Range r7 = r7.getBitrateRange()
            java.lang.Comparable r7 = r7.getUpper()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L_0x0098
        L_0x0097:
            r7 = 0
        L_0x0098:
            r8 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r7 < r8) goto L_0x00a0
            r7 = 1024(0x400, float:1.435E-42)
            goto L_0x00e7
        L_0x00a0:
            r8 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r7 < r8) goto L_0x00a8
            r7 = 512(0x200, float:7.175E-43)
            goto L_0x00e7
        L_0x00a8:
            r8 = 60000000(0x3938700, float:8.670878E-37)
            if (r7 < r8) goto L_0x00b0
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x00e7
        L_0x00b0:
            r8 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r7 < r8) goto L_0x00b8
            r7 = 128(0x80, float:1.794E-43)
            goto L_0x00e7
        L_0x00b8:
            r8 = 18000000(0x112a880, float:2.6936858E-38)
            if (r7 < r8) goto L_0x00c0
            r7 = 64
            goto L_0x00e7
        L_0x00c0:
            r8 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r7 < r8) goto L_0x00c8
            r7 = 32
            goto L_0x00e7
        L_0x00c8:
            r8 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r7 < r8) goto L_0x00d0
            r7 = 16
            goto L_0x00e7
        L_0x00d0:
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            if (r7 < r8) goto L_0x00d8
            r7 = 8
            goto L_0x00e7
        L_0x00d8:
            r8 = 1800000(0x1b7740, float:2.522337E-39)
            if (r7 < r8) goto L_0x00df
            r7 = 4
            goto L_0x00e7
        L_0x00df:
            r8 = 800000(0xc3500, float:1.121039E-39)
            if (r7 < r8) goto L_0x00e6
            r7 = 2
            goto L_0x00e7
        L_0x00e6:
            r7 = 1
        L_0x00e7:
            android.media.MediaCodecInfo$CodecProfileLevel r8 = new android.media.MediaCodecInfo$CodecProfileLevel
            r8.<init>()
            r8.profile = r3
            r8.level = r7
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r7[r2] = r8
        L_0x00f4:
            int r8 = r7.length
            r9 = 0
        L_0x00f6:
            if (r9 >= r8) goto L_0x0105
            r10 = r7[r9]
            int r11 = r10.profile
            if (r11 != r6) goto L_0x0102
            int r10 = r10.level
            if (r10 >= r4) goto L_0x0131
        L_0x0102:
            int r9 = r9 + 1
            goto L_0x00f6
        L_0x0105:
            java.lang.String r13 = r13.f17678i
            java.lang.String r1 = java.lang.String.valueOf(r13)
            int r1 = r1.length()
            int r3 = r0.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + 22
            int r1 = r1 + r3
            r4.<init>(r1)
            java.lang.String r1 = "codec.profileLevel, "
            r4.append(r1)
            r4.append(r13)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r13 = r4.toString()
            r12.m19478h(r13)
        L_0x0130:
            return r2
        L_0x0131:
            boolean r0 = r12.f19593g
            r4 = 21
            if (r0 == 0) goto L_0x017b
            int r0 = r13.f17686q
            if (r0 <= 0) goto L_0x017a
            int r1 = r13.f17687r
            if (r1 > 0) goto L_0x0140
            goto L_0x017a
        L_0x0140:
            int r5 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            if (r5 < r4) goto L_0x014c
            float r13 = r13.f17688s
            double r2 = (double) r13
            boolean r13 = r12.mo16782e(r0, r1, r2)
            return r13
        L_0x014c:
            int r0 = r0 * r1
            int r1 = com.google.ads.interactivemedia.p038v3.internal.C4501yh.m19579d()
            if (r0 > r1) goto L_0x0155
            r2 = 1
        L_0x0155:
            if (r2 != 0) goto L_0x0179
            int r0 = r13.f17686q
            int r13 = r13.f17687r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 40
            r1.<init>(r3)
            java.lang.String r3 = "legacyFrameSize, "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = "x"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r12.m19478h(r13)
        L_0x0179:
            return r2
        L_0x017a:
            return r3
        L_0x017b:
            int r0 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            if (r0 < r4) goto L_0x02a5
            int r4 = r13.f17695z
            r5 = -1
            if (r4 == r5) goto L_0x01ba
            android.media.MediaCodecInfo$CodecCapabilities r6 = r12.f19590d
            if (r6 != 0) goto L_0x018f
            java.lang.String r13 = "sampleRate.caps"
            r12.m19478h(r13)
            goto L_0x02a6
        L_0x018f:
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L_0x019c
            java.lang.String r13 = "sampleRate.aCaps"
            r12.m19478h(r13)
            goto L_0x02a6
        L_0x019c:
            boolean r6 = r6.isSampleRateSupported(r4)
            if (r6 != 0) goto L_0x01ba
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 31
            r13.<init>(r0)
            java.lang.String r0 = "sampleRate.support, "
            r13.append(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.m19478h(r13)
            goto L_0x02a6
        L_0x01ba:
            int r13 = r13.f17694y
            if (r13 == r5) goto L_0x02a5
            android.media.MediaCodecInfo$CodecCapabilities r4 = r12.f19590d
            if (r4 != 0) goto L_0x01c9
            java.lang.String r13 = "channelCount.caps"
            r12.m19478h(r13)
            goto L_0x02a4
        L_0x01c9:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x01d6
            java.lang.String r13 = "channelCount.aCaps"
            r12.m19478h(r13)
            goto L_0x02a4
        L_0x01d6:
            java.lang.String r5 = r12.f19587a
            java.lang.String r6 = r12.f19588b
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r3) goto L_0x028c
            r7 = 26
            if (r0 < r7) goto L_0x01e8
            if (r4 <= 0) goto L_0x01e8
            goto L_0x028c
        L_0x01e8:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0241
            goto L_0x028c
        L_0x0241:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x024b
            r1 = 6
            goto L_0x0256
        L_0x024b:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0254
            goto L_0x0256
        L_0x0254:
            r1 = 30
        L_0x0256:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r0 = r0 + 59
            r6.<init>(r0)
            java.lang.String r0 = "AssumedMaxChannelAdjustment: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", ["
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " to "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "]"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r4 = "MediaCodecInfo"
            android.util.Log.w(r4, r0)
            r4 = r1
        L_0x028c:
            if (r4 >= r13) goto L_0x02a5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 33
            r0.<init>(r1)
            java.lang.String r1 = "channelCount.support, "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.m19478h(r13)
        L_0x02a4:
            return r2
        L_0x02a5:
            r2 = 1
        L_0x02a6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4486xt.mo16779b(com.google.ads.interactivemedia.v3.internal.ke):boolean");
    }

    /* renamed from: c */
    public final boolean mo16780c(C4120ke keVar) {
        if (this.f19593g) {
            return this.f19591e;
        }
        Pair<Integer, Integer> e = C4501yh.m19580e(keVar);
        return e != null && ((Integer) e.first).intValue() == 42;
    }

    /* renamed from: d */
    public final C4270pt mo16781d(C4120ke keVar, C4120ke keVar2) {
        int i = true != amm.m14233c(keVar.f17681l, keVar2.f17681l) ? 8 : 0;
        if (this.f19593g) {
            if (keVar.f17689t != keVar2.f17689t) {
                i |= 1024;
            }
            if (!this.f19591e && !(keVar.f17686q == keVar2.f17686q && keVar.f17687r == keVar2.f17687r)) {
                i |= 512;
            }
            if (!amm.m14233c(keVar.f17693x, keVar2.f17693x)) {
                i |= 2048;
            }
            String str = this.f19587a;
            if (amm.f15301d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !keVar.mo16131e(keVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C4270pt(this.f19587a, keVar, keVar2, true != keVar.mo16131e(keVar2) ? 2 : 3, 0);
            }
        } else {
            if (keVar.f17694y != keVar2.f17694y) {
                i |= 4096;
            }
            if (keVar.f17695z != keVar2.f17695z) {
                i |= 8192;
            }
            if (keVar.f17664A != keVar2.f17664A) {
                i |= 16384;
            }
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(this.f19588b)) {
                Pair<Integer, Integer> e = C4501yh.m19580e(keVar);
                Pair<Integer, Integer> e2 = C4501yh.m19580e(keVar2);
                if (!(e == null || e2 == null)) {
                    int intValue = ((Integer) e.first).intValue();
                    int intValue2 = ((Integer) e2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C4270pt(this.f19587a, keVar, keVar2, 3, 0);
                    }
                }
            }
            if (!keVar.mo16131e(keVar2)) {
                i |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.f19588b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C4270pt(this.f19587a, keVar, keVar2, 1, 0);
            }
        }
        return new C4270pt(this.f19587a, keVar, keVar2, 0, i);
    }

    /* renamed from: e */
    public final boolean mo16782e(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19590d;
        if (codecCapabilities == null) {
            m19478h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m19478h("sizeAndRate.vCaps");
            return false;
        } else if (m19479i(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f19587a) && "mcv5a".equals(amm.f15299b)) || !m19479i(videoCapabilities, i2, i, d))) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                m19478h(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d);
            String sb3 = sb2.toString();
            String str = this.f19587a;
            String str2 = this.f19588b;
            String str3 = amm.f15302e;
            int length = String.valueOf(sb3).length();
            int length2 = String.valueOf(str).length();
            StringBuilder sb4 = new StringBuilder(length + 25 + length2 + str2.length() + String.valueOf(str3).length());
            sb4.append("AssumedSupport [");
            sb4.append(sb3);
            sb4.append("] [");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(str2);
            sb4.append("] [");
            sb4.append(str3);
            sb4.append("]");
            Log.d(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb4.toString());
            return true;
        }
    }

    /* renamed from: f */
    public final Point mo16783f(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19590d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m19480j(videoCapabilities, i, i2);
    }

    public final String toString() {
        return this.f19587a;
    }
}
