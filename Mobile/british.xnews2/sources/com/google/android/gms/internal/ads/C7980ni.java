package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.ni */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7980ni {

    /* renamed from: a */
    public final String f36018a;

    /* renamed from: b */
    public final boolean f36019b;

    /* renamed from: c */
    public final boolean f36020c;

    /* renamed from: d */
    public final boolean f36021d;

    /* renamed from: e */
    private final String f36022e;

    /* renamed from: f */
    private final MediaCodecInfo.CodecCapabilities f36023f;

    private C7980ni(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.f36018a = str;
        this.f36022e = str2;
        this.f36023f = codecCapabilities;
        boolean z3 = true;
        this.f36019b = !z && codecCapabilities != null && C7836jm.f33934a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f36020c = codecCapabilities != null && C7836jm.f33934a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || C7836jm.f33934a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.f36021d = z3;
    }

    /* renamed from: a */
    public static C7980ni m35163a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C7980ni(str, str2, codecCapabilities, z, z2);
    }

    /* renamed from: b */
    public static C7980ni m35164b(String str) {
        return new C7980ni("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    /* renamed from: h */
    private final void m35165h(String str) {
        String str2 = this.f36018a;
        String str3 = this.f36022e;
        String str4 = C7836jm.f33938e;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 20 + length + length2 + String.valueOf(str4).length());
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

    @TargetApi(21)
    /* renamed from: i */
    private static boolean m35166i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    @TargetApi(21)
    /* renamed from: c */
    public final boolean mo33701c(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f36023f;
        if (codecCapabilities == null) {
            m35165h("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m35165h("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("channelCount.support, ");
            sb.append(i);
            m35165h(sb.toString());
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: d */
    public final boolean mo33702d(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f36023f;
        if (codecCapabilities == null) {
            m35165h("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m35165h("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("sampleRate.support, ");
            sb.append(i);
            m35165h(sb.toString());
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo33703e(String str) {
        if (str == null || this.f36022e == null) {
            return true;
        }
        String trim = str.trim();
        String str2 = (trim.startsWith("avc1") || trim.startsWith("avc3")) ? MimeTypes.VIDEO_H264 : (trim.startsWith("hev1") || trim.startsWith("hvc1")) ? MimeTypes.VIDEO_H265 : trim.startsWith("vp9") ? MimeTypes.VIDEO_VP9 : trim.startsWith("vp8") ? MimeTypes.VIDEO_VP8 : trim.startsWith("mp4a") ? MimeTypes.AUDIO_AAC : (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? MimeTypes.AUDIO_AC3 : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? MimeTypes.AUDIO_E_AC3 : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? MimeTypes.AUDIO_DTS : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? MimeTypes.AUDIO_DTS_HD : trim.startsWith("opus") ? MimeTypes.AUDIO_OPUS : trim.startsWith("vorbis") ? MimeTypes.AUDIO_VORBIS : null;
        if (str2 == null) {
            return true;
        }
        if (!this.f36022e.equals(str2)) {
            StringBuilder sb = new StringBuilder(str.length() + 13 + str2.length());
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            m35165h(sb.toString());
            return false;
        }
        Pair<Integer, Integer> b = C8407zi.m40354b(str);
        if (b == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo33705g()) {
            if (codecProfileLevel.profile == ((Integer) b.first).intValue() && codecProfileLevel.level >= ((Integer) b.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22 + str2.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        m35165h(sb2.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: f */
    public final boolean mo33704f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f36023f;
        if (codecCapabilities == null) {
            m35165h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m35165h("sizeAndRate.vCaps");
            return false;
        } else if (m35166i(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m35166i(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                m35165h(sb.toString());
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
            String str = this.f36018a;
            String str2 = this.f36022e;
            String str3 = C7836jm.f33938e;
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(str2).length();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 25 + length + length2 + String.valueOf(str3).length());
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
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo33705g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f36023f
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7980ni.mo33705g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}
