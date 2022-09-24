package com.google.ads.interactivemedia.p039v3.internal;

import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aln */
/* compiled from: IMASDK */
public final class aln {

    /* renamed from: a */
    private static final ArrayList<all> f15215a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f15216b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: a */
    public static boolean m14031a(String str) {
        return "audio".equals(m14047q(str));
    }

    /* renamed from: b */
    public static boolean m14032b(String str) {
        return "video".equals(m14047q(str));
    }

    /* renamed from: c */
    public static boolean m14033c(String str) {
        return "text".equals(m14047q(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008f, code lost:
        r3 = com.google.ads.interactivemedia.p039v3.internal.C4205ni.m18267c((r3 = m14046p(r4)).f15214b);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m14034d(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L_0x0075;
                case -432837260: goto L_0x006b;
                case -432837259: goto L_0x0061;
                case -53558318: goto L_0x0056;
                case 187078296: goto L_0x004c;
                case 187094639: goto L_0x0042;
                case 1504578661: goto L_0x0037;
                case 1504619009: goto L_0x002d;
                case 1504831518: goto L_0x0023;
                case 1903231877: goto L_0x0019;
                case 1903589369: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0080
        L_0x000e:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 5
            goto L_0x0081
        L_0x0019:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 4
            goto L_0x0081
        L_0x0023:
            java.lang.String r1 = "audio/mpeg"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 0
            goto L_0x0081
        L_0x002d:
            java.lang.String r1 = "audio/flac"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 6
            goto L_0x0081
        L_0x0037:
            java.lang.String r1 = "audio/eac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 8
            goto L_0x0081
        L_0x0042:
            java.lang.String r1 = "audio/raw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 3
            goto L_0x0081
        L_0x004c:
            java.lang.String r1 = "audio/ac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 7
            goto L_0x0081
        L_0x0056:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 10
            goto L_0x0081
        L_0x0061:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 2
            goto L_0x0081
        L_0x006b:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 1
            goto L_0x0081
        L_0x0075:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 9
            goto L_0x0081
        L_0x0080:
            r3 = -1
        L_0x0081:
            switch(r3) {
                case 0: goto L_0x009d;
                case 1: goto L_0x009d;
                case 2: goto L_0x009d;
                case 3: goto L_0x009d;
                case 4: goto L_0x009d;
                case 5: goto L_0x009d;
                case 6: goto L_0x009d;
                case 7: goto L_0x009d;
                case 8: goto L_0x009d;
                case 9: goto L_0x009d;
                case 10: goto L_0x0085;
                default: goto L_0x0084;
            }
        L_0x0084:
            return r0
        L_0x0085:
            if (r4 != 0) goto L_0x0088
            return r0
        L_0x0088:
            com.google.ads.interactivemedia.v3.internal.alm r3 = m14046p(r4)
            if (r3 != 0) goto L_0x008f
            return r0
        L_0x008f:
            int r3 = r3.f15214b
            int r3 = com.google.ads.interactivemedia.p039v3.internal.C4205ni.m18267c(r3)
            if (r3 == 0) goto L_0x009c
            r4 = 16
            if (r3 == r4) goto L_0x009c
            return r2
        L_0x009c:
            return r0
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aln.m14034d(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: e */
    public static String m14035e(String str) {
        if (str == null) {
            return null;
        }
        for (String j : amm.m14204U(str)) {
            String j2 = m14040j(j);
            if (j2 != null && m14032b(j2)) {
                return j2;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m14036f(String str, String str2) {
        return m14037g(str, str2) != null;
    }

    /* renamed from: g */
    public static String m14037g(String str, String str2) {
        if (!(str == null || str2 == null)) {
            String[] U = amm.m14204U(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : U) {
                if (str2.equals(m14040j(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: h */
    public static String m14038h(String str) {
        if (str == null) {
            return null;
        }
        for (String j : amm.m14204U(str)) {
            String j2 = m14040j(j);
            if (j2 != null && m14031a(j2)) {
                return j2;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static String m14039i(String str) {
        if (str == null) {
            return null;
        }
        for (String j : amm.m14204U(str)) {
            String j2 = m14040j(j);
            if (j2 != null && m14033c(j2)) {
                return j2;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m14040j(String str) {
        alm p;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String C = amm.m14186C(str.trim());
        if (C.startsWith("avc1") || C.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (C.startsWith("hev1") || C.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (C.startsWith("dvav") || C.startsWith("dva1") || C.startsWith("dvhe") || C.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (C.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (C.startsWith("vp9") || C.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (C.startsWith("vp8") || C.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (C.startsWith("mp4a")) {
            if (C.startsWith("mp4a.") && (p = m14046p(C)) != null) {
                str2 = m14041k(p.f15213a);
            }
            return str2 == null ? MimeTypes.AUDIO_AAC : str2;
        } else if (C.startsWith("ac-3") || C.startsWith("dac3")) {
            return MimeTypes.AUDIO_AC3;
        } else {
            if (C.startsWith("ec-3") || C.startsWith("dec3")) {
                return MimeTypes.AUDIO_E_AC3;
            }
            if (C.startsWith("ec+3")) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if (C.startsWith("ac-4") || C.startsWith("dac4")) {
                return MimeTypes.AUDIO_AC4;
            }
            if (C.startsWith("dtsc") || C.startsWith("dtse")) {
                return MimeTypes.AUDIO_DTS;
            }
            if (C.startsWith("dtsh") || C.startsWith("dtsl")) {
                return MimeTypes.AUDIO_DTS_HD;
            }
            if (C.startsWith("opus")) {
                return MimeTypes.AUDIO_OPUS;
            }
            if (C.startsWith("vorbis")) {
                return MimeTypes.AUDIO_VORBIS;
            }
            if (C.startsWith("flac")) {
                return MimeTypes.AUDIO_FLAC;
            }
            if (C.startsWith("stpp")) {
                return MimeTypes.APPLICATION_TTML;
            }
            if (C.startsWith("wvtt")) {
                return MimeTypes.TEXT_VTT;
            }
            if (C.contains("cea708")) {
                return MimeTypes.APPLICATION_CEA708;
            }
            if (C.contains("eia608") || C.contains("cea608")) {
                return MimeTypes.APPLICATION_CEA608;
            }
            int size = f15215a.size();
            for (int i = 0; i < size; i++) {
                String str3 = f15215a.get(i).f15211b;
                if (C.startsWith((String) null)) {
                    break;
                }
            }
            return null;
        }
    }

    /* renamed from: k */
    public static String m14041k(int i) {
        if (i == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            default:
                switch (i) {
                    case 169:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /*172*/:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return MimeTypes.AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: l */
    public static int m14042l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m14031a(str)) {
            return 1;
        }
        if (m14032b(str)) {
            return 2;
        }
        if (m14033c(str)) {
            return 3;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        int size = f15215a.size();
        for (int i = 0; i < size; i++) {
            String str2 = f15215a.get(i).f15210a;
            if (str.equals((Object) null)) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static int m14043m(String str) {
        return m14042l(m14040j(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14044n(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r0 == r1) goto L_0x0020
            r1 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            if (r0 == r2) goto L_0x003c
            return r4
        L_0x003c:
            java.lang.String r4 = "audio/wav"
            return r4
        L_0x003f:
            java.lang.String r4 = "audio/mpeg"
            return r4
        L_0x0042:
            java.lang.String r4 = "audio/flac"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aln.m14044n(java.lang.String):java.lang.String");
    }

    /* renamed from: o */
    public static boolean m14045o(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM) || str.startsWith(MimeTypes.VIDEO_MATROSKA) || str.startsWith(MimeTypes.AUDIO_MATROSKA) || str.startsWith(MimeTypes.APPLICATION_MATROSKA)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    static alm m14046p(String str) {
        Matcher matcher = f15216b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        aup.m14890u(group);
        String group2 = matcher.group(2);
        try {
            return new alm(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: q */
    private static String m14047q(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
