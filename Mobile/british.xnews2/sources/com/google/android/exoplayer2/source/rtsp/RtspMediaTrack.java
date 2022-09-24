package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4766t;
import com.google.common.collect.C4776v;

final class RtspMediaTrack {
    private static final String AAC_CODECS_PREFIX = "mp4a.40.";
    private static final String H264_CODECS_PREFIX = "avc1.";
    private static final String PARAMETER_PROFILE_LEVEL_ID = "profile-level-id";
    private static final String PARAMETER_SPROP_PARAMS = "sprop-parameter-sets";
    public final RtpPayloadFormat payloadFormat;
    public final Uri uri;

    public RtspMediaTrack(MediaDescription mediaDescription, Uri uri2) {
        Assertions.checkArgument(mediaDescription.attributes.containsKey(SessionDescription.ATTR_CONTROL));
        this.payloadFormat = generatePayloadFormat(mediaDescription);
        this.uri = uri2.buildUpon().appendEncodedPath((String) Util.castNonNull(mediaDescription.attributes.get(SessionDescription.ATTR_CONTROL))).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        if (r1.equals(com.google.android.exoplayer2.util.MimeTypes.AUDIO_AC3) != false) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat generatePayloadFormat(com.google.android.exoplayer2.source.rtsp.MediaDescription r11) {
        /*
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            int r1 = r11.bitrate
            if (r1 <= 0) goto L_0x000c
            r0.setAverageBitrate(r1)
        L_0x000c:
            com.google.common.collect.v<java.lang.String, java.lang.String> r1 = r11.attributes
            java.lang.String r2 = "rtpmap"
            boolean r1 = r1.containsKey(r2)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            com.google.common.collect.v<java.lang.String, java.lang.String> r1 = r11.attributes
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = " "
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.split(r1, r2)
            int r1 = r1.length
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0033
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            com.google.android.exoplayer2.source.rtsp.MediaDescription$RtpMapAttribute r1 = r11.rtpMapAttribute
            int r5 = r1.payloadType
            java.lang.String r1 = r1.mediaEncoding
            java.lang.String r1 = com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat.getMimeTypeFromRtpMediaType(r1)
            r0.setSampleMimeType(r1)
            com.google.android.exoplayer2.source.rtsp.MediaDescription$RtpMapAttribute r6 = r11.rtpMapAttribute
            int r6 = r6.clockRate
            java.lang.String r7 = r11.mediaType
            java.lang.String r8 = "audio"
            boolean r7 = r8.equals(r7)
            r8 = -1
            if (r7 == 0) goto L_0x0063
            com.google.android.exoplayer2.source.rtsp.MediaDescription$RtpMapAttribute r7 = r11.rtpMapAttribute
            int r7 = r7.encodingParameters
            int r7 = inferChannelCount(r7, r1)
            com.google.android.exoplayer2.Format$Builder r9 = r0.setSampleRate(r6)
            r9.setChannelCount(r7)
            goto L_0x0064
        L_0x0063:
            r7 = -1
        L_0x0064:
            com.google.common.collect.v r11 = r11.getFmtpParametersAsMap()
            int r9 = r1.hashCode()
            r10 = -53558318(0xfffffffffccec3d2, float:-8.588679E36)
            if (r9 == r10) goto L_0x008f
            r10 = 187078296(0xb269698, float:3.208373E-32)
            if (r9 == r10) goto L_0x0086
            r2 = 1331836730(0x4f62373a, float:3.79527014E9)
            if (r9 == r2) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            java.lang.String r2 = "video/avc"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0099
            r2 = 1
            goto L_0x009a
        L_0x0086:
            java.lang.String r9 = "audio/ac3"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0099
            goto L_0x009a
        L_0x008f:
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0099
            r2 = 0
            goto L_0x009a
        L_0x0099:
            r2 = -1
        L_0x009a:
            if (r2 == 0) goto L_0x00ab
            if (r2 == r4) goto L_0x009f
            goto L_0x00be
        L_0x009f:
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r4
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            processH264FmtpAttribute(r0, r11)
            goto L_0x00be
        L_0x00ab:
            if (r7 == r8) goto L_0x00af
            r1 = 1
            goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r4
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            processAacFmtpAttribute(r0, r11, r7, r6)
        L_0x00be:
            if (r6 <= 0) goto L_0x00c2
            r1 = 1
            goto L_0x00c3
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            r1 = 96
            if (r5 < r1) goto L_0x00cb
            r3 = 1
        L_0x00cb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat r1 = new com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat
            com.google.android.exoplayer2.Format r0 = r0.build()
            r1.<init>(r0, r5, r6, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtspMediaTrack.generatePayloadFormat(com.google.android.exoplayer2.source.rtsp.MediaDescription):com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat");
    }

    private static byte[] getH264InitializationDataFromParameterSet(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bArr = NalUnitUtil.NAL_START_CODE;
        byte[] bArr2 = new byte[(length + bArr.length)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        return bArr2;
    }

    private static int inferChannelCount(int i, String str) {
        if (i != -1) {
            return i;
        }
        return str.equals(MimeTypes.AUDIO_AC3) ? 6 : 1;
    }

    private static void processAacFmtpAttribute(Format.Builder builder, C4776v<String, String> vVar, int i, int i2) {
        Assertions.checkArgument(vVar.containsKey(PARAMETER_PROFILE_LEVEL_ID));
        String valueOf = String.valueOf((String) Assertions.checkNotNull(vVar.get(PARAMETER_PROFILE_LEVEL_ID)));
        builder.setCodecs(valueOf.length() != 0 ? AAC_CODECS_PREFIX.concat(valueOf) : new String(AAC_CODECS_PREFIX));
        builder.setInitializationData(C4766t.m21979F(AacUtil.buildAacLcAudioSpecificConfig(i2, i)));
    }

    private static void processH264FmtpAttribute(Format.Builder builder, C4776v<String, String> vVar) {
        Assertions.checkArgument(vVar.containsKey(PARAMETER_PROFILE_LEVEL_ID));
        String valueOf = String.valueOf((String) Assertions.checkNotNull(vVar.get(PARAMETER_PROFILE_LEVEL_ID)));
        builder.setCodecs(valueOf.length() != 0 ? H264_CODECS_PREFIX.concat(valueOf) : new String(H264_CODECS_PREFIX));
        Assertions.checkArgument(vVar.containsKey(PARAMETER_SPROP_PARAMS));
        String[] split = Util.split((String) Assertions.checkNotNull(vVar.get(PARAMETER_SPROP_PARAMS)), ",");
        Assertions.checkArgument(split.length == 2);
        C4766t G = C4766t.m21980G(getH264InitializationDataFromParameterSet(split[0]), getH264InitializationDataFromParameterSet(split[1]));
        builder.setInitializationData(G);
        byte[] bArr = (byte[]) G.get(0);
        NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit(bArr, NalUnitUtil.NAL_START_CODE.length, bArr.length);
        builder.setPixelWidthHeightRatio(parseSpsNalUnit.pixelWidthAspectRatio);
        builder.setHeight(parseSpsNalUnit.height);
        builder.setWidth(parseSpsNalUnit.width);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RtspMediaTrack.class != obj.getClass()) {
            return false;
        }
        RtspMediaTrack rtspMediaTrack = (RtspMediaTrack) obj;
        if (!this.payloadFormat.equals(rtspMediaTrack.payloadFormat) || !this.uri.equals(rtspMediaTrack.uri)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((217 + this.payloadFormat.hashCode()) * 31) + this.uri.hashCode();
    }
}
