package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.hx */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7773hx {

    /* renamed from: a */
    private static final ArrayList<C7697fv> f32868a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f32869b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: a */
    public static int m32959a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m32965g(str)) {
            return 1;
        }
        if (m32966h(str)) {
            return 2;
        }
        if ("text".equals(m32967i(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if ("image".equals(m32967i(str))) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        int size = f32868a.size();
        for (int i = 0; i < size; i++) {
            String str2 = f32868a.get(i).f31889a;
            if (str.equals((Object) null)) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: b */
    static C7734gw m32960b(String str) {
        Matcher matcher = f32869b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        String group2 = matcher.group(2);
        try {
            return new C7734gw(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m32961c(String str) {
        C7734gw b;
        String a = h33.m32792a(str.trim());
        if (a.startsWith("avc1") || a.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (a.startsWith("hev1") || a.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (a.startsWith("dvav") || a.startsWith("dva1") || a.startsWith("dvhe") || a.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (a.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (a.startsWith("vp9") || a.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (a.startsWith("vp8") || a.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        String str2 = null;
        if (a.startsWith("mp4a")) {
            if (a.startsWith("mp4a.") && (b = m32960b(a)) != null) {
                str2 = m32962d(b.f32482a);
            }
            return str2 == null ? MimeTypes.AUDIO_AAC : str2;
        } else if (a.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (a.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (a.startsWith("ac-3") || a.startsWith("dac3")) {
                return MimeTypes.AUDIO_AC3;
            }
            if (a.startsWith("ec-3") || a.startsWith("dec3")) {
                return MimeTypes.AUDIO_E_AC3;
            }
            if (a.startsWith("ec+3")) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if (a.startsWith("ac-4") || a.startsWith("dac4")) {
                return MimeTypes.AUDIO_AC4;
            }
            if (a.startsWith("dtsc")) {
                return MimeTypes.AUDIO_DTS;
            }
            if (a.startsWith("dtse")) {
                return MimeTypes.AUDIO_DTS_EXPRESS;
            }
            if (a.startsWith("dtsh") || a.startsWith("dtsl")) {
                return MimeTypes.AUDIO_DTS_HD;
            }
            if (a.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (a.startsWith("opus")) {
                return MimeTypes.AUDIO_OPUS;
            }
            if (a.startsWith("vorbis")) {
                return MimeTypes.AUDIO_VORBIS;
            }
            if (a.startsWith("flac")) {
                return MimeTypes.AUDIO_FLAC;
            }
            if (a.startsWith("stpp")) {
                return MimeTypes.APPLICATION_TTML;
            }
            if (a.startsWith("wvtt")) {
                return MimeTypes.TEXT_VTT;
            }
            if (a.contains("cea708")) {
                return MimeTypes.APPLICATION_CEA708;
            }
            if (a.contains("eia608") || a.contains("cea608")) {
                return MimeTypes.APPLICATION_CEA608;
            }
            int size = f32868a.size();
            for (int i = 0; i < size; i++) {
                String str3 = f32868a.get(i).f31890b;
                if (a.startsWith((String) null)) {
                    break;
                }
            }
            return null;
        }
    }

    /* renamed from: d */
    public static String m32962d(int i) {
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
                    case TsExtractor.TS_STREAM_TYPE_AC4:
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

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m32963e(java.lang.String r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7773hx.m32963e(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32964f(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r6.hashCode()
            r2 = 5
            r3 = 10
            r4 = 2
            r5 = 1
            switch(r1) {
                case -2123537834: goto L_0x0079;
                case -432837260: goto L_0x006f;
                case -432837259: goto L_0x0065;
                case -53558318: goto L_0x005a;
                case 187078296: goto L_0x0050;
                case 187094639: goto L_0x0046;
                case 1504578661: goto L_0x003b;
                case 1504619009: goto L_0x0031;
                case 1504831518: goto L_0x0027;
                case 1903231877: goto L_0x001d;
                case 1903589369: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0084
        L_0x0012:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 5
            goto L_0x0085
        L_0x001d:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 4
            goto L_0x0085
        L_0x0027:
            java.lang.String r1 = "audio/mpeg"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 0
            goto L_0x0085
        L_0x0031:
            java.lang.String r1 = "audio/flac"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 6
            goto L_0x0085
        L_0x003b:
            java.lang.String r1 = "audio/eac3"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 8
            goto L_0x0085
        L_0x0046:
            java.lang.String r1 = "audio/raw"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 3
            goto L_0x0085
        L_0x0050:
            java.lang.String r1 = "audio/ac3"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 7
            goto L_0x0085
        L_0x005a:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 10
            goto L_0x0085
        L_0x0065:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 2
            goto L_0x0085
        L_0x006f:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 1
            goto L_0x0085
        L_0x0079:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 9
            goto L_0x0085
        L_0x0084:
            r6 = -1
        L_0x0085:
            switch(r6) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00c1;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00c1;
                case 7: goto L_0x00c1;
                case 8: goto L_0x00c1;
                case 9: goto L_0x00c1;
                case 10: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            return r0
        L_0x0089:
            if (r7 != 0) goto L_0x008c
            return r0
        L_0x008c:
            com.google.android.gms.internal.ads.gw r6 = m32960b(r7)
            if (r6 != 0) goto L_0x0093
            return r0
        L_0x0093:
            int r6 = r6.f32483b
            r7 = 16
            if (r6 == r4) goto L_0x00bb
            if (r6 == r2) goto L_0x00b9
            r1 = 29
            if (r6 == r1) goto L_0x00b6
            r1 = 42
            if (r6 == r1) goto L_0x00b3
            r1 = 22
            if (r6 == r1) goto L_0x00b0
            r1 = 23
            if (r6 == r1) goto L_0x00ad
            r3 = 0
            goto L_0x00bb
        L_0x00ad:
            r3 = 15
            goto L_0x00bb
        L_0x00b0:
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x00bb
        L_0x00b3:
            r3 = 16
            goto L_0x00bb
        L_0x00b6:
            r3 = 12
            goto L_0x00bb
        L_0x00b9:
            r3 = 11
        L_0x00bb:
            if (r3 == 0) goto L_0x00c0
            if (r3 == r7) goto L_0x00c0
            return r5
        L_0x00c0:
            return r0
        L_0x00c1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7773hx.m32964f(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: g */
    public static boolean m32965g(String str) {
        return "audio".equals(m32967i(str));
    }

    /* renamed from: h */
    public static boolean m32966h(String str) {
        return "video".equals(m32967i(str));
    }

    /* renamed from: i */
    private static String m32967i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
