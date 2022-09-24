package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.C4776v;
import java.util.Map;
import p149s6.C10995b;

public final class RtpPayloadFormat {
    private static final String RTP_MEDIA_AC3 = "AC3";
    private static final String RTP_MEDIA_H264 = "H264";
    private static final String RTP_MEDIA_MPEG4_GENERIC = "MPEG4-GENERIC";
    public final int clockRate;
    public final C4776v<String, String> fmtpParameters;
    public final Format format;
    public final int rtpPayloadType;

    public RtpPayloadFormat(Format format2, int i, int i2, Map<String, String> map) {
        this.rtpPayloadType = i;
        this.clockRate = i2;
        this.format = format2;
        this.fmtpParameters = C4776v.m22049f(map);
    }

    public static String getMimeTypeFromRtpMediaType(String str) {
        String f = C10995b.m49339f(str);
        f.hashCode();
        char c = 65535;
        switch (f.hashCode()) {
            case -1922091719:
                if (f.equals(RTP_MEDIA_MPEG4_GENERIC)) {
                    c = 0;
                    break;
                }
                break;
            case 64593:
                if (f.equals(RTP_MEDIA_AC3)) {
                    c = 1;
                    break;
                }
                break;
            case 2194728:
                if (f.equals(RTP_MEDIA_H264)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return MimeTypes.AUDIO_AAC;
            case 1:
                return MimeTypes.AUDIO_AC3;
            case 2:
                return MimeTypes.VIDEO_H264;
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static boolean isFormatSupported(MediaDescription mediaDescription) {
        String f = C10995b.m49339f(mediaDescription.rtpMapAttribute.mediaEncoding);
        f.hashCode();
        char c = 65535;
        switch (f.hashCode()) {
            case -1922091719:
                if (f.equals(RTP_MEDIA_MPEG4_GENERIC)) {
                    c = 0;
                    break;
                }
                break;
            case 64593:
                if (f.equals(RTP_MEDIA_AC3)) {
                    c = 1;
                    break;
                }
                break;
            case 2194728:
                if (f.equals(RTP_MEDIA_H264)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RtpPayloadFormat.class != obj.getClass()) {
            return false;
        }
        RtpPayloadFormat rtpPayloadFormat = (RtpPayloadFormat) obj;
        if (this.rtpPayloadType != rtpPayloadFormat.rtpPayloadType || this.clockRate != rtpPayloadFormat.clockRate || !this.format.equals(rtpPayloadFormat.format) || !this.fmtpParameters.equals(rtpPayloadFormat.fmtpParameters)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((217 + this.rtpPayloadType) * 31) + this.clockRate) * 31) + this.format.hashCode()) * 31) + this.fmtpParameters.hashCode();
    }
}
