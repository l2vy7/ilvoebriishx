package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j34 {

    /* renamed from: a */
    public final String f33740a;

    /* renamed from: b */
    public final String f33741b;

    /* renamed from: c */
    public final String f33742c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f33743d;

    /* renamed from: e */
    public final boolean f33744e;

    /* renamed from: f */
    public final boolean f33745f;

    /* renamed from: g */
    private final boolean f33746g;

    j34(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.f33740a = str;
        this.f33741b = str2;
        this.f33742c = str3;
        this.f33743d = codecCapabilities;
        this.f33744e = z4;
        this.f33745f = z6;
        this.f33746g = C7773hx.m32966h(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if ("Nexus 10".equals(r3) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.j34 m33517c(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.j34 r11 = new com.google.android.gms.internal.ads.j34
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L_0x003f
            int r3 = com.google.android.gms.internal.ads.d13.f20195a
            r5 = 19
            if (r3 < r5) goto L_0x003f
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x003f
            r5 = 22
            if (r3 > r5) goto L_0x003d
            java.lang.String r3 = com.google.android.gms.internal.ads.d13.f20198d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x003d
        L_0x002c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x003f
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r8 = 1
            goto L_0x0040
        L_0x003f:
            r8 = 0
        L_0x0040:
            r3 = 21
            if (r4 == 0) goto L_0x0052
            int r5 = com.google.android.gms.internal.ads.d13.f20195a
            if (r5 < r3) goto L_0x0052
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0052
            r9 = 1
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r20 != 0) goto L_0x0066
            if (r4 == 0) goto L_0x0064
            int r5 = com.google.android.gms.internal.ads.d13.f20195a
            if (r5 < r3) goto L_0x0064
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r10 = 0
            goto L_0x0067
        L_0x0066:
            r10 = 1
        L_0x0067:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j34.m33517c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.j34");
    }

    /* renamed from: h */
    private static Point m33518h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(d13.m20280K(i, widthAlignment) * widthAlignment, d13.m20280K(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: i */
    private final void m33519i(String str) {
        String str2 = this.f33740a;
        String str3 = this.f33741b;
        String str4 = d13.f20199e;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + str3.length() + String.valueOf(str4).length());
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

    /* renamed from: j */
    private static boolean m33520j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point h = m33518h(videoCapabilities, i, i2);
        int i3 = h.x;
        int i4 = h.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: a */
    public final Point mo32822a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f33743d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m33518h(videoCapabilities, i, i2);
    }

    /* renamed from: b */
    public final nd3 mo32823b(C8281w wVar, C8281w wVar2) {
        int i = true != d13.m20317p(wVar.f40619l, wVar2.f40619l) ? 8 : 0;
        if (this.f33746g) {
            if (wVar.f40627t != wVar2.f40627t) {
                i |= 1024;
            }
            if (!this.f33744e && !(wVar.f40624q == wVar2.f40624q && wVar.f40625r == wVar2.f40625r)) {
                i |= 512;
            }
            if (!d13.m20317p(wVar.f40631x, wVar2.f40631x)) {
                i |= 2048;
            }
            String str = this.f33740a;
            if (d13.f20198d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !wVar.mo35523d(wVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new nd3(this.f33740a, wVar, wVar2, true != wVar.mo35523d(wVar2) ? 2 : 3, 0);
            }
        } else {
            if (wVar.f40632y != wVar2.f40632y) {
                i |= 4096;
            }
            if (wVar.f40633z != wVar2.f40633z) {
                i |= 8192;
            }
            if (wVar.f40602A != wVar2.f40602A) {
                i |= 16384;
            }
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(this.f33741b)) {
                Pair<Integer, Integer> b = a44.m30226b(wVar);
                Pair<Integer, Integer> b2 = a44.m30226b(wVar2);
                if (!(b == null || b2 == null)) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new nd3(this.f33740a, wVar, wVar2, 3, 0);
                    }
                }
            }
            if (!wVar.mo35523d(wVar2)) {
                i |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.f33741b)) {
                i |= 2;
            }
            if (i == 0) {
                return new nd3(this.f33740a, wVar, wVar2, 1, 0);
            }
        }
        return new nd3(this.f33740a, wVar, wVar2, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        r7 = r7.getVideoCapabilities();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32824d(com.google.android.gms.internal.ads.C8281w r13) throws com.google.android.gms.internal.ads.u34 {
        /*
            r12 = this;
            java.lang.String r0 = r13.f40616i
            r1 = 16
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = com.google.android.gms.internal.ads.C7773hx.m32961c(r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x0131
        L_0x0010:
            java.lang.String r4 = r12.f33741b
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = ", "
            if (r4 != 0) goto L_0x0047
            java.lang.String r13 = r13.f40616i
            java.lang.String r1 = java.lang.String.valueOf(r13)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 13
            int r4 = r0.length()
            int r1 = r1 + r4
            r3.<init>(r1)
            java.lang.String r1 = "codec.mime "
            r3.append(r1)
            r3.append(r13)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r13 = r3.toString()
            r12.m33519i(r13)
            goto L_0x0130
        L_0x0047:
            android.util.Pair r4 = com.google.android.gms.internal.ads.a44.m30226b(r13)
            if (r4 == 0) goto L_0x0131
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            boolean r7 = r12.f33746g
            r8 = 42
            if (r7 != 0) goto L_0x0067
            if (r6 != r8) goto L_0x0131
            r6 = 42
        L_0x0067:
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r12.mo32827g()
            int r8 = com.google.android.gms.internal.ads.d13.f20195a
            r9 = 23
            if (r8 > r9) goto L_0x00f4
            java.lang.String r8 = r12.f33741b
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00f4
            int r8 = r7.length
            if (r8 != 0) goto L_0x00f4
            android.media.MediaCodecInfo$CodecCapabilities r7 = r12.f33743d
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
            java.lang.String r13 = r13.f40616i
            java.lang.String r1 = java.lang.String.valueOf(r13)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 22
            int r4 = r0.length()
            int r1 = r1 + r4
            r3.<init>(r1)
            java.lang.String r1 = "codec.profileLevel, "
            r3.append(r1)
            r3.append(r13)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r13 = r3.toString()
            r12.m33519i(r13)
        L_0x0130:
            return r2
        L_0x0131:
            boolean r0 = r12.f33746g
            r4 = 21
            if (r0 == 0) goto L_0x017b
            int r0 = r13.f40624q
            if (r0 <= 0) goto L_0x017a
            int r1 = r13.f40625r
            if (r1 > 0) goto L_0x0140
            goto L_0x017a
        L_0x0140:
            int r5 = com.google.android.gms.internal.ads.d13.f20195a
            if (r5 < r4) goto L_0x014c
            float r13 = r13.f40626s
            double r2 = (double) r13
            boolean r13 = r12.mo32826f(r0, r1, r2)
            return r13
        L_0x014c:
            int r0 = r0 * r1
            int r1 = com.google.android.gms.internal.ads.a44.m30225a()
            if (r0 > r1) goto L_0x0155
            r2 = 1
        L_0x0155:
            if (r2 != 0) goto L_0x0179
            int r0 = r13.f40624q
            int r13 = r13.f40625r
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
            r12.m33519i(r13)
        L_0x0179:
            return r2
        L_0x017a:
            return r3
        L_0x017b:
            int r0 = com.google.android.gms.internal.ads.d13.f20195a
            if (r0 < r4) goto L_0x02a5
            int r4 = r13.f40633z
            r5 = -1
            if (r4 == r5) goto L_0x01ba
            android.media.MediaCodecInfo$CodecCapabilities r6 = r12.f33743d
            if (r6 != 0) goto L_0x018f
            java.lang.String r13 = "sampleRate.caps"
            r12.m33519i(r13)
            goto L_0x02a6
        L_0x018f:
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L_0x019c
            java.lang.String r13 = "sampleRate.aCaps"
            r12.m33519i(r13)
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
            r12.m33519i(r13)
            goto L_0x02a6
        L_0x01ba:
            int r13 = r13.f40632y
            if (r13 == r5) goto L_0x02a5
            android.media.MediaCodecInfo$CodecCapabilities r4 = r12.f33743d
            if (r4 != 0) goto L_0x01c9
            java.lang.String r13 = "channelCount.caps"
            r12.m33519i(r13)
            goto L_0x02a4
        L_0x01c9:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x01d6
            java.lang.String r13 = "channelCount.aCaps"
            r12.m33519i(r13)
            goto L_0x02a4
        L_0x01d6:
            java.lang.String r5 = r12.f33740a
            java.lang.String r6 = r12.f33741b
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
            r12.m33519i(r13)
        L_0x02a4:
            return r2
        L_0x02a5:
            r2 = 1
        L_0x02a6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j34.mo32824d(com.google.android.gms.internal.ads.w):boolean");
    }

    /* renamed from: e */
    public final boolean mo32825e(C8281w wVar) {
        if (this.f33746g) {
            return this.f33744e;
        }
        Pair<Integer, Integer> b = a44.m30226b(wVar);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    /* renamed from: f */
    public final boolean mo32826f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f33743d;
        if (codecCapabilities == null) {
            m33519i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m33519i("sizeAndRate.vCaps");
            return false;
        } else if (m33520j(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f33740a) && "mcv5a".equals(d13.f20196b)) || !m33520j(videoCapabilities, i2, i, d))) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                m33519i(sb.toString());
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
            String str = this.f33740a;
            String str2 = this.f33741b;
            String str3 = d13.f20199e;
            int length = String.valueOf(str).length();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 25 + length + str2.length() + String.valueOf(str3).length());
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo32827g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f33743d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j34.mo32827g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public final String toString() {
        return this.f33740a;
    }
}
