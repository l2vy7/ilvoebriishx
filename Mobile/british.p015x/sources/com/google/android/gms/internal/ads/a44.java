package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a44 {

    /* renamed from: a */
    private static final Pattern f29527a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<s34, List<j34>> f29528b = new HashMap<>();

    /* renamed from: c */
    private static int f29529c = -1;

    /* renamed from: d */
    public static final /* synthetic */ int f29530d = 0;

    /* renamed from: a */
    public static int m30225a() throws u34 {
        int i;
        if (f29529c == -1) {
            int i2 = 0;
            j34 c = m30227c(MimeTypes.VIDEO_H264, false, false);
            if (c != null) {
                MediaCodecInfo.CodecProfileLevel[] g = c.mo32827g();
                int length = g.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = g[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case C6540C.DEFAULT_BUFFER_SEGMENT_SIZE:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, d13.f20195a >= 21 ? 345600 : 172800);
            }
            f29529c = i2;
        }
        return f29529c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0301 A[Catch:{ NumberFormatException -> 0x0311 }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x078a  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x07a0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m30226b(com.google.android.gms.internal.ads.C8281w r17) {
        /*
            r0 = r17
            java.lang.String r1 = r0.f40616i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.f40619l
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r7 = 512(0x200, float:7.175E-43)
            r8 = 256(0x100, float:3.59E-43)
            r9 = 128(0x80, float:1.794E-43)
            r11 = 64
            r13 = 4096(0x1000, float:5.74E-42)
            r14 = 32
            r15 = 16
            r5 = 8
            r2 = 3
            r10 = 4
            r12 = 2
            java.lang.String r4 = "MediaCodecUtil"
            r6 = 1
            if (r3 == 0) goto L_0x0229
            java.lang.String r0 = r0.f40616i
            int r3 = r1.length
            if (r3 >= r2) goto L_0x004f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0044
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0049
        L_0x0044:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0049:
            android.util.Log.w(r4, r0)
        L_0x004c:
            r2 = 0
            goto L_0x0228
        L_0x004f:
            java.util.regex.Pattern r3 = f29527a
            r2 = r1[r6]
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0077
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x006e
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0073
        L_0x006e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0073:
            android.util.Log.w(r4, r0)
            goto L_0x004c
        L_0x0077:
            java.lang.String r0 = r2.group(r6)
            if (r0 != 0) goto L_0x0080
        L_0x007d:
            r2 = 0
            goto L_0x0125
        L_0x0080:
            int r2 = r0.hashCode()
            switch(r2) {
                case 1536: goto L_0x00e5;
                case 1537: goto L_0x00db;
                case 1538: goto L_0x00d1;
                case 1539: goto L_0x00c7;
                case 1540: goto L_0x00bd;
                case 1541: goto L_0x00b3;
                case 1542: goto L_0x00a9;
                case 1543: goto L_0x009f;
                case 1544: goto L_0x0094;
                case 1545: goto L_0x0089;
                default: goto L_0x0087;
            }
        L_0x0087:
            goto L_0x00ef
        L_0x0089:
            java.lang.String r2 = "09"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 9
            goto L_0x00f0
        L_0x0094:
            java.lang.String r2 = "08"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 8
            goto L_0x00f0
        L_0x009f:
            java.lang.String r2 = "07"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 7
            goto L_0x00f0
        L_0x00a9:
            java.lang.String r2 = "06"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 6
            goto L_0x00f0
        L_0x00b3:
            java.lang.String r2 = "05"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 5
            goto L_0x00f0
        L_0x00bd:
            java.lang.String r2 = "04"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 4
            goto L_0x00f0
        L_0x00c7:
            java.lang.String r2 = "03"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 3
            goto L_0x00f0
        L_0x00d1:
            java.lang.String r2 = "02"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 2
            goto L_0x00f0
        L_0x00db:
            java.lang.String r2 = "01"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 1
            goto L_0x00f0
        L_0x00e5:
            java.lang.String r2 = "00"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00ef
            r2 = 0
            goto L_0x00f0
        L_0x00ef:
            r2 = -1
        L_0x00f0:
            switch(r2) {
                case 0: goto L_0x0121;
                case 1: goto L_0x011c;
                case 2: goto L_0x0117;
                case 3: goto L_0x0112;
                case 4: goto L_0x010d;
                case 5: goto L_0x0108;
                case 6: goto L_0x0103;
                case 7: goto L_0x00fe;
                case 8: goto L_0x00f9;
                case 9: goto L_0x00f4;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            goto L_0x007d
        L_0x00f4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0125
        L_0x00f9:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x0125
        L_0x00fe:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x0125
        L_0x0103:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x0125
        L_0x0108:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x0125
        L_0x010d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x0125
        L_0x0112:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x0125
        L_0x0117:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x0125
        L_0x011c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x0125
        L_0x0121:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x0125:
            if (r2 != 0) goto L_0x0142
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0138
            java.lang.String r0 = r1.concat(r0)
            goto L_0x013d
        L_0x0138:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x013d:
            android.util.Log.w(r4, r0)
            goto L_0x004c
        L_0x0142:
            r0 = r1[r12]
            if (r0 != 0) goto L_0x0149
        L_0x0146:
            r1 = 0
            goto L_0x0205
        L_0x0149:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x01f9;
                case 1538: goto L_0x01ec;
                case 1539: goto L_0x01df;
                case 1540: goto L_0x01d2;
                case 1541: goto L_0x01c5;
                case 1542: goto L_0x01b8;
                case 1543: goto L_0x01ab;
                case 1544: goto L_0x019e;
                case 1545: goto L_0x0190;
                default: goto L_0x0150;
            }
        L_0x0150:
            switch(r1) {
                case 1567: goto L_0x0182;
                case 1568: goto L_0x0172;
                case 1569: goto L_0x0162;
                case 1570: goto L_0x0154;
                default: goto L_0x0153;
            }
        L_0x0153:
            goto L_0x0146
        L_0x0154:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x0205
        L_0x0162:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            r1 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0205
        L_0x0172:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0205
        L_0x0182:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x0205
        L_0x0190:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x0205
        L_0x019e:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x0205
        L_0x01ab:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0205
        L_0x01b8:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x0205
        L_0x01c5:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            goto L_0x0205
        L_0x01d2:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x0205
        L_0x01df:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x0205
        L_0x01ec:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L_0x0205
        L_0x01f9:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0146
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L_0x0205:
            if (r1 != 0) goto L_0x0222
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0218
            java.lang.String r0 = r1.concat(r0)
            goto L_0x021d
        L_0x0218:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x021d:
            android.util.Log.w(r4, r0)
            goto L_0x004c
        L_0x0222:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r2 = r0
        L_0x0228:
            return r2
        L_0x0229:
            r2 = 0
            r3 = r1[r2]
            int r2 = r3.hashCode()
            switch(r2) {
                case 3004662: goto L_0x0270;
                case 3006243: goto L_0x0266;
                case 3006244: goto L_0x025c;
                case 3199032: goto L_0x0252;
                case 3214780: goto L_0x0248;
                case 3356560: goto L_0x023e;
                case 3624515: goto L_0x0234;
                default: goto L_0x0233;
            }
        L_0x0233:
            goto L_0x027a
        L_0x0234:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x027a
            r2 = 2
            goto L_0x027b
        L_0x023e:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x027a
            r2 = 6
            goto L_0x027b
        L_0x0248:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x027a
            r2 = 4
            goto L_0x027b
        L_0x0252:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x027a
            r2 = 3
            goto L_0x027b
        L_0x025c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x027a
            r2 = 1
            goto L_0x027b
        L_0x0266:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x027a
            r2 = 0
            goto L_0x027b
        L_0x0270:
            java.lang.String r2 = "av01"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x027a
            r2 = 5
            goto L_0x027b
        L_0x027a:
            r2 = -1
        L_0x027b:
            r3 = 30
            r11 = 20
            switch(r2) {
                case 0: goto L_0x07cb;
                case 1: goto L_0x07cb;
                case 2: goto L_0x06d1;
                case 3: goto L_0x043f;
                case 4: goto L_0x043f;
                case 5: goto L_0x032e;
                case 6: goto L_0x0284;
                default: goto L_0x0282;
            }
        L_0x0282:
            r0 = 0
            return r0
        L_0x0284:
            java.lang.String r0 = r0.f40616i
            int r2 = r1.length
            r3 = 3
            if (r2 == r3) goto L_0x02a6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x029b
            java.lang.String r0 = r1.concat(r0)
            goto L_0x02a0
        L_0x029b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x02a0:
            android.util.Log.w(r4, r0)
        L_0x02a3:
            r2 = 0
            goto L_0x032d
        L_0x02a6:
            java.lang.String r2 = "audio/mp4a-latm"
            r3 = r1[r6]     // Catch:{ NumberFormatException -> 0x0311 }
            int r3 = java.lang.Integer.parseInt(r3, r15)     // Catch:{ NumberFormatException -> 0x0311 }
            java.lang.String r3 = com.google.android.gms.internal.ads.C7773hx.m32962d(r3)     // Catch:{ NumberFormatException -> 0x0311 }
            boolean r2 = r2.equals(r3)     // Catch:{ NumberFormatException -> 0x0311 }
            if (r2 == 0) goto L_0x02a3
            r1 = r1[r12]     // Catch:{ NumberFormatException -> 0x0311 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0311 }
            r2 = 17
            if (r1 == r2) goto L_0x02fc
            if (r1 == r11) goto L_0x02f8
            r2 = 23
            if (r1 == r2) goto L_0x02f5
            r2 = 29
            if (r1 == r2) goto L_0x02f2
            r2 = 39
            if (r1 == r2) goto L_0x02ef
            r2 = 42
            if (r1 == r2) goto L_0x02ec
            switch(r1) {
                case 1: goto L_0x02e9;
                case 2: goto L_0x02e6;
                case 3: goto L_0x02e3;
                case 4: goto L_0x02e0;
                case 5: goto L_0x02dd;
                case 6: goto L_0x02da;
                default: goto L_0x02d7;
            }     // Catch:{ NumberFormatException -> 0x0311 }
        L_0x02d7:
            r1 = -1
            r5 = -1
            goto L_0x02ff
        L_0x02da:
            r1 = -1
            r5 = 6
            goto L_0x02ff
        L_0x02dd:
            r1 = -1
            r5 = 5
            goto L_0x02ff
        L_0x02e0:
            r1 = -1
            r5 = 4
            goto L_0x02ff
        L_0x02e3:
            r1 = -1
            r5 = 3
            goto L_0x02ff
        L_0x02e6:
            r1 = -1
            r5 = 2
            goto L_0x02ff
        L_0x02e9:
            r1 = -1
            r5 = 1
            goto L_0x02ff
        L_0x02ec:
            r5 = 42
            goto L_0x02fe
        L_0x02ef:
            r5 = 39
            goto L_0x02fe
        L_0x02f2:
            r5 = 29
            goto L_0x02fe
        L_0x02f5:
            r5 = 23
            goto L_0x02fe
        L_0x02f8:
            r1 = -1
            r5 = 20
            goto L_0x02ff
        L_0x02fc:
            r5 = 17
        L_0x02fe:
            r1 = -1
        L_0x02ff:
            if (r5 == r1) goto L_0x02a3
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0311 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0311 }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0311 }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x0311 }
            r2 = r1
            goto L_0x032d
        L_0x0311:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0323
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0328
        L_0x0323:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0328:
            android.util.Log.w(r4, r0)
            goto L_0x02a3
        L_0x032d:
            return r2
        L_0x032e:
            java.lang.String r2 = r0.f40616i
            com.google.android.gms.internal.ads.z04 r0 = r0.f40631x
            int r11 = r1.length
            if (r11 >= r10) goto L_0x0351
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0346
            java.lang.String r0 = r1.concat(r0)
            goto L_0x034b
        L_0x0346:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x034b:
            android.util.Log.w(r4, r0)
        L_0x034e:
            r2 = 0
            goto L_0x043e
        L_0x0351:
            r11 = r1[r6]     // Catch:{ NumberFormatException -> 0x0422 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0422 }
            r15 = r1[r12]     // Catch:{ NumberFormatException -> 0x0422 }
            r8 = 0
            java.lang.String r8 = r15.substring(r8, r12)     // Catch:{ NumberFormatException -> 0x0422 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0422 }
            r15 = 3
            r1 = r1[r15]     // Catch:{ NumberFormatException -> 0x0422 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0422 }
            if (r11 == 0) goto L_0x0380
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            goto L_0x034e
        L_0x0380:
            if (r1 == r5) goto L_0x03b0
            r2 = 10
            if (r1 == r2) goto L_0x039d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 34
            r0.<init>(r2)
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            goto L_0x034e
        L_0x039d:
            if (r0 == 0) goto L_0x03ae
            byte[] r1 = r0.f21034d
            if (r1 != 0) goto L_0x03ab
            int r0 = r0.f21033c
            r1 = 7
            if (r0 == r1) goto L_0x03ab
            r1 = 6
            if (r0 != r1) goto L_0x03ae
        L_0x03ab:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x03b1
        L_0x03ae:
            r0 = 2
            goto L_0x03b1
        L_0x03b0:
            r0 = 1
        L_0x03b1:
            switch(r8) {
                case 0: goto L_0x03fa;
                case 1: goto L_0x03f8;
                case 2: goto L_0x03f6;
                case 3: goto L_0x03f3;
                case 4: goto L_0x03f0;
                case 5: goto L_0x03ed;
                case 6: goto L_0x03ea;
                case 7: goto L_0x03e7;
                case 8: goto L_0x03e4;
                case 9: goto L_0x03e1;
                case 10: goto L_0x03de;
                case 11: goto L_0x03db;
                case 12: goto L_0x03d8;
                case 13: goto L_0x03d5;
                case 14: goto L_0x03d2;
                case 15: goto L_0x03ce;
                case 16: goto L_0x03cb;
                case 17: goto L_0x03c8;
                case 18: goto L_0x03c5;
                case 19: goto L_0x03c2;
                case 20: goto L_0x03bf;
                case 21: goto L_0x03bc;
                case 22: goto L_0x03b9;
                case 23: goto L_0x03b6;
                default: goto L_0x03b4;
            }
        L_0x03b4:
            r1 = -1
            goto L_0x03fb
        L_0x03b6:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x03fb
        L_0x03b9:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x03fb
        L_0x03bc:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x03fb
        L_0x03bf:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x03fb
        L_0x03c2:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x03fb
        L_0x03c5:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x03fb
        L_0x03c8:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x03fb
        L_0x03cb:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x03fb
        L_0x03ce:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x03fb
        L_0x03d2:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x03fb
        L_0x03d5:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03fb
        L_0x03d8:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x03fb
        L_0x03db:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x03fb
        L_0x03de:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x03fb
        L_0x03e1:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x03fb
        L_0x03e4:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x03fb
        L_0x03e7:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x03fb
        L_0x03ea:
            r1 = 64
            goto L_0x03fb
        L_0x03ed:
            r1 = 32
            goto L_0x03fb
        L_0x03f0:
            r1 = 16
            goto L_0x03fb
        L_0x03f3:
            r1 = 8
            goto L_0x03fb
        L_0x03f6:
            r1 = 4
            goto L_0x03fb
        L_0x03f8:
            r1 = 2
            goto L_0x03fb
        L_0x03fa:
            r1 = 1
        L_0x03fb:
            r2 = -1
            if (r1 != r2) goto L_0x0414
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = "Unknown AV1 level: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            goto L_0x034e
        L_0x0414:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x043e
        L_0x0422:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0434
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0439
        L_0x0434:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0439:
            android.util.Log.w(r4, r0)
            goto L_0x034e
        L_0x043e:
            return r2
        L_0x043f:
            java.lang.String r0 = r0.f40616i
            int r2 = r1.length
            if (r2 >= r10) goto L_0x0460
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0455
            java.lang.String r0 = r1.concat(r0)
            goto L_0x045a
        L_0x0455:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x045a:
            android.util.Log.w(r4, r0)
        L_0x045d:
            r2 = 0
            goto L_0x06d0
        L_0x0460:
            java.util.regex.Pattern r2 = f29527a
            r3 = r1[r6]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0488
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x047f
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0484
        L_0x047f:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0484:
            android.util.Log.w(r4, r0)
            goto L_0x045d
        L_0x0488:
            java.lang.String r0 = r2.group(r6)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0497
            r0 = 1
        L_0x0495:
            r2 = 3
            goto L_0x04a1
        L_0x0497:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x06b5
            r0 = 2
            goto L_0x0495
        L_0x04a1:
            r1 = r1[r2]
            if (r1 != 0) goto L_0x04a8
        L_0x04a5:
            r2 = 0
            goto L_0x068d
        L_0x04a8:
            int r2 = r1.hashCode()
            switch(r2) {
                case 70821: goto L_0x05cc;
                case 70914: goto L_0x05c1;
                case 70917: goto L_0x05b6;
                case 71007: goto L_0x05ab;
                case 71010: goto L_0x05a0;
                case 74665: goto L_0x0596;
                case 74758: goto L_0x058c;
                case 74761: goto L_0x0582;
                case 74851: goto L_0x0578;
                case 74854: goto L_0x056e;
                case 2193639: goto L_0x0562;
                case 2193642: goto L_0x0556;
                case 2193732: goto L_0x054a;
                case 2193735: goto L_0x053e;
                case 2193738: goto L_0x0532;
                case 2193825: goto L_0x0526;
                case 2193828: goto L_0x051a;
                case 2193831: goto L_0x050e;
                case 2312803: goto L_0x0503;
                case 2312806: goto L_0x04f8;
                case 2312896: goto L_0x04ed;
                case 2312899: goto L_0x04e1;
                case 2312902: goto L_0x04d5;
                case 2312989: goto L_0x04c9;
                case 2312992: goto L_0x04bd;
                case 2312995: goto L_0x04b1;
                default: goto L_0x04af;
            }
        L_0x04af:
            goto L_0x05d7
        L_0x04b1:
            java.lang.String r2 = "L186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 12
            goto L_0x05d8
        L_0x04bd:
            java.lang.String r2 = "L183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 11
            goto L_0x05d8
        L_0x04c9:
            java.lang.String r2 = "L180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 10
            goto L_0x05d8
        L_0x04d5:
            java.lang.String r2 = "L156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 9
            goto L_0x05d8
        L_0x04e1:
            java.lang.String r2 = "L153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 8
            goto L_0x05d8
        L_0x04ed:
            java.lang.String r2 = "L150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 7
            goto L_0x05d8
        L_0x04f8:
            java.lang.String r2 = "L123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 6
            goto L_0x05d8
        L_0x0503:
            java.lang.String r2 = "L120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 5
            goto L_0x05d8
        L_0x050e:
            java.lang.String r2 = "H186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 25
            goto L_0x05d8
        L_0x051a:
            java.lang.String r2 = "H183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 24
            goto L_0x05d8
        L_0x0526:
            java.lang.String r2 = "H180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 23
            goto L_0x05d8
        L_0x0532:
            java.lang.String r2 = "H156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 22
            goto L_0x05d8
        L_0x053e:
            java.lang.String r2 = "H153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 21
            goto L_0x05d8
        L_0x054a:
            java.lang.String r2 = "H150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 20
            goto L_0x05d8
        L_0x0556:
            java.lang.String r2 = "H123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 19
            goto L_0x05d8
        L_0x0562:
            java.lang.String r2 = "H120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 18
            goto L_0x05d8
        L_0x056e:
            java.lang.String r2 = "L93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 4
            goto L_0x05d8
        L_0x0578:
            java.lang.String r2 = "L90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 3
            goto L_0x05d8
        L_0x0582:
            java.lang.String r2 = "L63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 2
            goto L_0x05d8
        L_0x058c:
            java.lang.String r2 = "L60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 1
            goto L_0x05d8
        L_0x0596:
            java.lang.String r2 = "L30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 0
            goto L_0x05d8
        L_0x05a0:
            java.lang.String r2 = "H93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 17
            goto L_0x05d8
        L_0x05ab:
            java.lang.String r2 = "H90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 16
            goto L_0x05d8
        L_0x05b6:
            java.lang.String r2 = "H63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 15
            goto L_0x05d8
        L_0x05c1:
            java.lang.String r2 = "H60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 14
            goto L_0x05d8
        L_0x05cc:
            java.lang.String r2 = "H30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x05d7
            r2 = 13
            goto L_0x05d8
        L_0x05d7:
            r2 = -1
        L_0x05d8:
            switch(r2) {
                case 0: goto L_0x0689;
                case 1: goto L_0x0684;
                case 2: goto L_0x067d;
                case 3: goto L_0x0676;
                case 4: goto L_0x066f;
                case 5: goto L_0x0668;
                case 6: goto L_0x0663;
                case 7: goto L_0x065c;
                case 8: goto L_0x0655;
                case 9: goto L_0x064e;
                case 10: goto L_0x0647;
                case 11: goto L_0x0640;
                case 12: goto L_0x0639;
                case 13: goto L_0x0634;
                case 14: goto L_0x062f;
                case 15: goto L_0x062a;
                case 16: goto L_0x0624;
                case 17: goto L_0x061e;
                case 18: goto L_0x0616;
                case 19: goto L_0x060e;
                case 20: goto L_0x0605;
                case 21: goto L_0x05fd;
                case 22: goto L_0x05f5;
                case 23: goto L_0x05ed;
                case 24: goto L_0x05e5;
                case 25: goto L_0x05dd;
                default: goto L_0x05db;
            }
        L_0x05db:
            goto L_0x04a5
        L_0x05dd:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x05e5:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x05ed:
            r2 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x05f5:
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x05fd:
            r2 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x0605:
            r2 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x060e:
            r2 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x0616:
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x061e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x068d
        L_0x0624:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x068d
        L_0x062a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x068d
        L_0x062f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x068d
        L_0x0634:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x068d
        L_0x0639:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x0640:
            r2 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x0647:
            r2 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x064e:
            r2 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x0655:
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x065c:
            r2 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x0663:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x068d
        L_0x0668:
            r8 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x068d
        L_0x066f:
            r15 = 256(0x100, float:3.59E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x068d
        L_0x0676:
            r16 = 64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            goto L_0x068d
        L_0x067d:
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x068d
        L_0x0684:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x068d
        L_0x0689:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x068d:
            if (r2 != 0) goto L_0x06aa
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Unknown HEVC level string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x06a0
            java.lang.String r0 = r1.concat(r0)
            goto L_0x06a5
        L_0x06a0:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x06a5:
            android.util.Log.w(r4, r0)
            goto L_0x045d
        L_0x06aa:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            r2 = r1
            goto L_0x06d0
        L_0x06b5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown HEVC profile string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x06c6
            java.lang.String r0 = r1.concat(r0)
            goto L_0x06cb
        L_0x06c6:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x06cb:
            android.util.Log.w(r4, r0)
            goto L_0x045d
        L_0x06d0:
            return r2
        L_0x06d1:
            r2 = 2048(0x800, float:2.87E-42)
            r15 = 256(0x100, float:3.59E-43)
            r16 = 64
            java.lang.String r0 = r0.f40616i
            int r8 = r1.length
            r2 = 3
            if (r8 >= r2) goto L_0x06f9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x06ee
            java.lang.String r0 = r1.concat(r0)
            goto L_0x06f3
        L_0x06ee:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x06f3:
            android.util.Log.w(r4, r0)
        L_0x06f6:
            r2 = 0
            goto L_0x07ca
        L_0x06f9:
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x07ae }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x07ae }
            r1 = r1[r12]     // Catch:{ NumberFormatException -> 0x07ae }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x07ae }
            if (r2 == 0) goto L_0x0717
            if (r2 == r6) goto L_0x0715
            if (r2 == r12) goto L_0x0713
            r1 = 3
            if (r2 == r1) goto L_0x0710
            r1 = -1
            goto L_0x0718
        L_0x0710:
            r1 = 8
            goto L_0x0718
        L_0x0713:
            r1 = 4
            goto L_0x0718
        L_0x0715:
            r1 = 2
            goto L_0x0718
        L_0x0717:
            r1 = 1
        L_0x0718:
            r8 = -1
            if (r1 != r8) goto L_0x0730
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r1 = "Unknown VP9 profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            goto L_0x06f6
        L_0x0730:
            r2 = 10
            if (r0 == r2) goto L_0x0787
            r2 = 11
            if (r0 == r2) goto L_0x0784
            if (r0 == r11) goto L_0x0781
            r2 = 21
            if (r0 == r2) goto L_0x077d
            if (r0 == r3) goto L_0x0779
            r2 = 31
            if (r0 == r2) goto L_0x0775
            r2 = 40
            if (r0 == r2) goto L_0x0771
            r2 = 41
            if (r0 == r2) goto L_0x076d
            r2 = 50
            if (r0 == r2) goto L_0x0769
            r2 = 51
            if (r0 == r2) goto L_0x0765
            switch(r0) {
                case 60: goto L_0x0761;
                case 61: goto L_0x075d;
                case 62: goto L_0x075a;
                default: goto L_0x0757;
            }
        L_0x0757:
            r2 = -1
            r6 = -1
            goto L_0x0788
        L_0x075a:
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0787
        L_0x075d:
            r2 = -1
            r6 = 4096(0x1000, float:5.74E-42)
            goto L_0x0788
        L_0x0761:
            r2 = -1
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0788
        L_0x0765:
            r2 = -1
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x0788
        L_0x0769:
            r2 = -1
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0788
        L_0x076d:
            r2 = -1
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x0788
        L_0x0771:
            r2 = -1
            r6 = 64
            goto L_0x0788
        L_0x0775:
            r2 = -1
            r6 = 32
            goto L_0x0788
        L_0x0779:
            r2 = -1
            r6 = 16
            goto L_0x0788
        L_0x077d:
            r2 = -1
            r6 = 8
            goto L_0x0788
        L_0x0781:
            r2 = -1
            r6 = 4
            goto L_0x0788
        L_0x0784:
            r2 = -1
            r6 = 2
            goto L_0x0788
        L_0x0787:
            r2 = -1
        L_0x0788:
            if (r6 != r2) goto L_0x07a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = "Unknown VP9 level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r4, r0)
            goto L_0x06f6
        L_0x07a0:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2.<init>(r0, r1)
            goto L_0x07ca
        L_0x07ae:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x07c0
            java.lang.String r0 = r1.concat(r0)
            goto L_0x07c5
        L_0x07c0:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x07c5:
            android.util.Log.w(r4, r0)
            goto L_0x06f6
        L_0x07ca:
            return r2
        L_0x07cb:
            r8 = 1024(0x400, float:1.435E-42)
            r15 = 256(0x100, float:3.59E-43)
            r16 = 64
            java.lang.String r0 = r0.f40616i
            int r2 = r1.length
            if (r2 >= r12) goto L_0x07f2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x07e7
            java.lang.String r0 = r1.concat(r0)
            goto L_0x07ec
        L_0x07e7:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x07ec:
            android.util.Log.w(r4, r0)
        L_0x07ef:
            r2 = 0
            goto L_0x0910
        L_0x07f2:
            r11 = r1[r6]     // Catch:{ NumberFormatException -> 0x08f4 }
            int r11 = r11.length()     // Catch:{ NumberFormatException -> 0x08f4 }
            r5 = 6
            if (r11 != r5) goto L_0x0813
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x08f4 }
            r5 = 0
            java.lang.String r2 = r2.substring(r5, r12)     // Catch:{ NumberFormatException -> 0x08f4 }
            r5 = 16
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch:{ NumberFormatException -> 0x08f4 }
            r1 = r1[r6]     // Catch:{ NumberFormatException -> 0x08f4 }
            java.lang.String r1 = r1.substring(r10)     // Catch:{ NumberFormatException -> 0x08f4 }
            int r0 = java.lang.Integer.parseInt(r1, r5)     // Catch:{ NumberFormatException -> 0x08f4 }
            goto L_0x0824
        L_0x0813:
            r5 = 16
            r11 = 3
            if (r2 < r11) goto L_0x08d8
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x08f4 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x08f4 }
            r1 = r1[r12]     // Catch:{ NumberFormatException -> 0x08f4 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x08f4 }
        L_0x0824:
            r1 = 66
            if (r2 == r1) goto L_0x0858
            r1 = 77
            if (r2 == r1) goto L_0x0856
            r1 = 88
            if (r2 == r1) goto L_0x0853
            r1 = 100
            if (r2 == r1) goto L_0x084f
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x084b
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 == r1) goto L_0x0847
            r1 = 244(0xf4, float:3.42E-43)
            if (r2 == r1) goto L_0x0843
            r1 = -1
            r12 = -1
            goto L_0x085a
        L_0x0843:
            r1 = -1
            r12 = 64
            goto L_0x085a
        L_0x0847:
            r1 = -1
            r12 = 32
            goto L_0x085a
        L_0x084b:
            r1 = -1
            r12 = 16
            goto L_0x085a
        L_0x084f:
            r1 = -1
            r12 = 8
            goto L_0x085a
        L_0x0853:
            r1 = -1
            r12 = 4
            goto L_0x085a
        L_0x0856:
            r1 = -1
            goto L_0x085a
        L_0x0858:
            r1 = -1
            r12 = 1
        L_0x085a:
            if (r12 != r1) goto L_0x0872
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r1 = "Unknown AVC profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            goto L_0x07ef
        L_0x0872:
            switch(r0) {
                case 10: goto L_0x08b0;
                case 11: goto L_0x08ae;
                case 12: goto L_0x08ab;
                case 13: goto L_0x08a8;
                default: goto L_0x0875;
            }
        L_0x0875:
            switch(r0) {
                case 20: goto L_0x08a5;
                case 21: goto L_0x08a2;
                case 22: goto L_0x089f;
                default: goto L_0x0878;
            }
        L_0x0878:
            switch(r0) {
                case 30: goto L_0x089c;
                case 31: goto L_0x0899;
                case 32: goto L_0x0896;
                default: goto L_0x087b;
            }
        L_0x087b:
            switch(r0) {
                case 40: goto L_0x0893;
                case 41: goto L_0x0890;
                case 42: goto L_0x088d;
                default: goto L_0x087e;
            }
        L_0x087e:
            switch(r0) {
                case 50: goto L_0x088a;
                case 51: goto L_0x0886;
                case 52: goto L_0x0883;
                default: goto L_0x0881;
            }
        L_0x0881:
            r1 = -1
            goto L_0x08b1
        L_0x0883:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x08b1
        L_0x0886:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x08b1
        L_0x088a:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x08b1
        L_0x088d:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x08b1
        L_0x0890:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x08b1
        L_0x0893:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x08b1
        L_0x0896:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x08b1
        L_0x0899:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x08b1
        L_0x089c:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x08b1
        L_0x089f:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x08b1
        L_0x08a2:
            r1 = 64
            goto L_0x08b1
        L_0x08a5:
            r1 = 32
            goto L_0x08b1
        L_0x08a8:
            r1 = 16
            goto L_0x08b1
        L_0x08ab:
            r1 = 8
            goto L_0x08b1
        L_0x08ae:
            r1 = 4
            goto L_0x08b1
        L_0x08b0:
            r1 = 1
        L_0x08b1:
            r2 = -1
            if (r1 != r2) goto L_0x08ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = "Unknown AVC level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r4, r0)
            goto L_0x07ef
        L_0x08ca:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x0910
        L_0x08d8:
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x08f4 }
            int r3 = r2.length()     // Catch:{ NumberFormatException -> 0x08f4 }
            if (r3 == 0) goto L_0x08e9
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NumberFormatException -> 0x08f4 }
            goto L_0x08ef
        L_0x08e9:
            java.lang.String r2 = new java.lang.String     // Catch:{ NumberFormatException -> 0x08f4 }
            r2.<init>(r1)     // Catch:{ NumberFormatException -> 0x08f4 }
            r1 = r2
        L_0x08ef:
            android.util.Log.w(r4, r1)     // Catch:{ NumberFormatException -> 0x08f4 }
            goto L_0x07ef
        L_0x08f4:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0906
            java.lang.String r0 = r1.concat(r0)
            goto L_0x090b
        L_0x0906:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x090b:
            android.util.Log.w(r4, r0)
            goto L_0x07ef
        L_0x0910:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a44.m30226b(com.google.android.gms.internal.ads.w):android.util.Pair");
    }

    /* renamed from: c */
    public static j34 m30227c(String str, boolean z, boolean z2) throws u34 {
        List<j34> e = m30229e(str, false, false);
        if (e.isEmpty()) {
            return null;
        }
        return e.get(0);
    }

    /* renamed from: d */
    public static j34 m30228d() throws u34 {
        return m30227c(MimeTypes.AUDIO_RAW, false, false);
    }

    /* renamed from: e */
    public static synchronized List<j34> m30229e(String str, boolean z, boolean z2) throws u34 {
        v34 v34;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (a44.class) {
            s34 s34 = new s34(str2, z3, z4);
            HashMap<s34, List<j34>> hashMap = f29528b;
            List<j34> list = hashMap.get(s34);
            if (list != null) {
                return list;
            }
            int i = d13.f20195a;
            if (i >= 21) {
                v34 = new y34(z3, z4);
            } else {
                v34 = new x34((w34) null);
            }
            ArrayList<j34> g = m30231g(s34, v34);
            if (z3 && g.isEmpty() && i >= 21 && i <= 23) {
                g = m30231g(s34, new x34((w34) null));
                if (!g.isEmpty()) {
                    String str3 = g.get(0).f33740a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str3).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str2);
                    sb.append(". Assuming: ");
                    sb.append(str3);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if (MimeTypes.AUDIO_RAW.equals(str2)) {
                if (i < 26 && d13.f20196b.equals("R9") && g.size() == 1 && g.get(0).f33740a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    g.add(j34.m33517c("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
                }
                m30232h(g, p34.f37323a);
            }
            if (i < 21 && g.size() > 1) {
                String str4 = g.get(0).f33740a;
                if ("OMX.SEC.mp3.dec".equals(str4) || "OMX.SEC.MP3.Decoder".equals(str4) || "OMX.brcm.audio.mp3.decoder".equals(str4)) {
                    m30232h(g, q34.f37851a);
                }
            }
            if (i < 32 && g.size() > 1 && "OMX.qti.audio.decoder.flac".equals(g.get(0).f33740a)) {
                g.add(g.remove(0));
            }
            List<j34> unmodifiableList = Collections.unmodifiableList(g);
            hashMap.put(s34, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: f */
    public static List<j34> m30230f(List<j34> list, C8281w wVar) {
        ArrayList arrayList = new ArrayList(list);
        m30232h(arrayList, new o34(wVar));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x019b, code lost:
        if ("SCV31".equals(r5) == false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d9, code lost:
        if (r8.startsWith("t0") == false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r12.endsWith(".secure") == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (r11.startsWith("HM") == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010f, code lost:
        if ("SO-02E".equals(r11) == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013b, code lost:
        if ("C1605".equals(r10) == false) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x032c A[SYNTHETIC, Splitter:B:213:0x032c] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0358 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.google.android.gms.internal.ads.j34> m30231g(com.google.android.gms.internal.ads.s34 r23, com.google.android.gms.internal.ads.v34 r24) throws com.google.android.gms.internal.ads.u34 {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0395 }
            r6.<init>()     // Catch:{ Exception -> 0x0395 }
            java.lang.String r15 = r1.f38864a     // Catch:{ Exception -> 0x0395 }
            int r14 = r24.zza()     // Catch:{ Exception -> 0x0395 }
            boolean r16 = r24.zze()     // Catch:{ Exception -> 0x0395 }
            r17 = 0
            r13 = 0
        L_0x001a:
            if (r13 >= r14) goto L_0x0394
            android.media.MediaCodecInfo r0 = r2.zzb(r13)     // Catch:{ Exception -> 0x0395 }
            int r7 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ Exception -> 0x0395 }
            r8 = 29
            if (r7 < r8) goto L_0x0033
            boolean r9 = r0.isAlias()     // Catch:{ Exception -> 0x0395 }
            if (r9 == 0) goto L_0x0033
        L_0x002c:
            r21 = r13
            r22 = r14
            r2 = r15
            goto L_0x038b
        L_0x0033:
            java.lang.String r12 = r0.getName()     // Catch:{ Exception -> 0x0395 }
            boolean r9 = r0.isEncoder()     // Catch:{ Exception -> 0x0395 }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = ".secure"
            if (r16 != 0) goto L_0x0047
            boolean r10 = r12.endsWith(r9)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
        L_0x0047:
            r10 = 21
            if (r7 >= r10) goto L_0x007b
            java.lang.String r10 = "CIPAACDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "CIPMP3Decoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "CIPVorbisDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "CIPAMRNBDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "AACDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "MP3Decoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
        L_0x007b:
            r10 = 18
            if (r7 >= r10) goto L_0x00a3
            java.lang.String r10 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r10 == 0) goto L_0x00a3
            java.lang.String r10 = "a70"
            java.lang.String r11 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0395 }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "Xiaomi"
            java.lang.String r5 = com.google.android.gms.internal.ads.d13.f20197c     // Catch:{ Exception -> 0x0395 }
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x00a3
            java.lang.String r5 = "HM"
            boolean r5 = r11.startsWith(r5)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x002c
        L_0x00a3:
            r5 = 16
            if (r7 != r5) goto L_0x0111
            java.lang.String r10 = "OMX.qcom.audio.decoder.mp3"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r10 == 0) goto L_0x0111
            java.lang.String r10 = "dlxu"
            java.lang.String r11 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0395 }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "protou"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "ville"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "villeplus"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "villec2"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "gee"
            boolean r10 = r11.startsWith(r10)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "C6602"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "C6603"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "C6606"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "C6616"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "L36h"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "SO-02E"
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
        L_0x0111:
            if (r7 != r5) goto L_0x013d
            java.lang.String r5 = "OMX.qcom.audio.decoder.aac"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x013d
            java.lang.String r5 = "C1504"
            java.lang.String r10 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0395 }
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "C1505"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "C1604"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "C1605"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x002c
        L_0x013d:
            r5 = 24
            java.lang.String r10 = "samsung"
            if (r7 >= r5) goto L_0x019d
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x0153
            java.lang.String r5 = "OMX.Exynos.AAC.Decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x019d
        L_0x0153:
            java.lang.String r5 = com.google.android.gms.internal.ads.d13.f20197c     // Catch:{ Exception -> 0x0395 }
            boolean r5 = r10.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x019d
            java.lang.String r5 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0395 }
            java.lang.String r11 = "zeroflte"
            boolean r11 = r5.startsWith(r11)     // Catch:{ Exception -> 0x0395 }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "zerolte"
            boolean r11 = r5.startsWith(r11)     // Catch:{ Exception -> 0x0395 }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "zenlte"
            boolean r11 = r5.startsWith(r11)     // Catch:{ Exception -> 0x0395 }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "SC-05G"
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "marinelteatt"
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "404SC"
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "SC-04G"
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "SCV31"
            boolean r5 = r11.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x002c
        L_0x019d:
            java.lang.String r5 = "jflte"
            r11 = 19
            if (r7 > r11) goto L_0x01db
            java.lang.String r8 = "OMX.SEC.vp8.dec"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r8 == 0) goto L_0x01db
            java.lang.String r8 = com.google.android.gms.internal.ads.d13.f20197c     // Catch:{ Exception -> 0x0395 }
            boolean r8 = r10.equals(r8)     // Catch:{ Exception -> 0x0395 }
            if (r8 == 0) goto L_0x01db
            java.lang.String r8 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0395 }
            java.lang.String r10 = "d2"
            boolean r10 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "serrano"
            boolean r10 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            boolean r10 = r8.startsWith(r5)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "santos"
            boolean r10 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0395 }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "t0"
            boolean r8 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0395 }
            if (r8 != 0) goto L_0x002c
        L_0x01db:
            if (r7 > r11) goto L_0x01ed
            java.lang.String r7 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0395 }
            boolean r5 = r7.startsWith(r5)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x01ed
            java.lang.String r5 = "OMX.qcom.video.decoder.vp8"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x002c
        L_0x01ed:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r5 = r5.equals(r15)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x01fd
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x002c
        L_0x01fd:
            java.lang.String[] r5 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x0395 }
            int r7 = r5.length     // Catch:{ Exception -> 0x0395 }
            r8 = 0
        L_0x0203:
            if (r8 >= r7) goto L_0x0212
            r10 = r5[r8]     // Catch:{ Exception -> 0x0395 }
            boolean r11 = r10.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x0395 }
            if (r11 == 0) goto L_0x020f
        L_0x020d:
            r5 = r10
            goto L_0x025f
        L_0x020f:
            int r8 = r8 + 1
            goto L_0x0203
        L_0x0212:
            java.lang.String r5 = "video/dolby-vision"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x0238
            java.lang.String r5 = "OMX.MS.HEVCDV.Decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x0225
            java.lang.String r10 = "video/hevcdv"
            goto L_0x020d
        L_0x0225:
            java.lang.String r5 = "OMX.RTK.video.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 != 0) goto L_0x0235
            java.lang.String r5 = "OMX.realtek.video.decoder.tunneled"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x025e
        L_0x0235:
            java.lang.String r10 = "video/dv_hevc"
            goto L_0x020d
        L_0x0238:
            java.lang.String r5 = "audio/alac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x024b
            java.lang.String r5 = "OMX.lge.alac.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x024b
            java.lang.String r10 = "audio/x-lg-alac"
            goto L_0x020d
        L_0x024b:
            java.lang.String r5 = "audio/flac"
            boolean r5 = r15.equals(r5)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x025e
            java.lang.String r5 = "OMX.lge.flac.decoder"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x0395 }
            if (r5 == 0) goto L_0x025e
            java.lang.String r10 = "audio/x-lg-flac"
            goto L_0x020d
        L_0x025e:
            r5 = 0
        L_0x025f:
            if (r5 == 0) goto L_0x002c
            android.media.MediaCodecInfo$CodecCapabilities r10 = r0.getCapabilitiesForType(r5)     // Catch:{ Exception -> 0x031c }
            boolean r7 = r2.mo18974a(r4, r5, r10)     // Catch:{ Exception -> 0x031c }
            boolean r8 = r2.mo18975b(r4, r5, r10)     // Catch:{ Exception -> 0x031c }
            boolean r11 = r1.f38866c     // Catch:{ Exception -> 0x031c }
            if (r11 != 0) goto L_0x0274
            if (r8 != 0) goto L_0x002c
            goto L_0x0278
        L_0x0274:
            if (r7 != 0) goto L_0x0278
            goto L_0x002c
        L_0x0278:
            boolean r7 = r2.mo18974a(r3, r5, r10)     // Catch:{ Exception -> 0x031c }
            boolean r8 = r2.mo18975b(r3, r5, r10)     // Catch:{ Exception -> 0x031c }
            boolean r11 = r1.f38865b     // Catch:{ Exception -> 0x031c }
            r19 = 1
            if (r11 != 0) goto L_0x0289
            if (r8 != 0) goto L_0x002c
            goto L_0x028c
        L_0x0289:
            if (r7 == 0) goto L_0x002c
            r7 = 1
        L_0x028c:
            int r8 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ Exception -> 0x031c }
            r11 = 29
            if (r8 < r11) goto L_0x0297
            boolean r11 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x031c }
            goto L_0x02a0
        L_0x0297:
            boolean r11 = m30233i(r0)     // Catch:{ Exception -> 0x031c }
            if (r11 != 0) goto L_0x029f
            r11 = 1
            goto L_0x02a0
        L_0x029f:
            r11 = 0
        L_0x02a0:
            boolean r20 = m30233i(r0)     // Catch:{ Exception -> 0x031c }
            r2 = 29
            if (r8 < r2) goto L_0x02ad
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x031c }
            goto L_0x02d0
        L_0x02ad:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x031c }
            java.lang.String r0 = com.google.android.gms.internal.ads.h33.m32792a(r0)     // Catch:{ Exception -> 0x031c }
            java.lang.String r2 = "omx.google."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x031c }
            if (r2 != 0) goto L_0x02cf
            java.lang.String r2 = "c2.android."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x031c }
            if (r2 != 0) goto L_0x02cf
            java.lang.String r2 = "c2.google."
            boolean r0 = r0.startsWith(r2)     // Catch:{ Exception -> 0x031c }
            if (r0 != 0) goto L_0x02cf
            r0 = 1
            goto L_0x02d0
        L_0x02cf:
            r0 = 0
        L_0x02d0:
            if (r16 == 0) goto L_0x02d6
            boolean r2 = r1.f38865b     // Catch:{ Exception -> 0x031c }
            if (r2 == r7) goto L_0x02dc
        L_0x02d6:
            if (r16 != 0) goto L_0x02fa
            boolean r2 = r1.f38865b     // Catch:{ Exception -> 0x031c }
            if (r2 != 0) goto L_0x02fa
        L_0x02dc:
            r2 = 0
            r18 = 0
            r7 = r12
            r8 = r15
            r9 = r5
            r19 = r12
            r12 = r20
            r21 = r13
            r13 = r0
            r22 = r14
            r14 = r2
            r2 = r15
            r15 = r18
            com.google.android.gms.internal.ads.j34 r0 = com.google.android.gms.internal.ads.j34.m33517c(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x02f8 }
            r6.add(r0)     // Catch:{ Exception -> 0x02f8 }
            goto L_0x038b
        L_0x02f8:
            r0 = move-exception
            goto L_0x0324
        L_0x02fa:
            r19 = r12
            r21 = r13
            r22 = r14
            r2 = r15
            if (r16 != 0) goto L_0x038b
            if (r7 == 0) goto L_0x038b
            java.lang.String r7 = java.lang.String.valueOf(r19)     // Catch:{ Exception -> 0x02f8 }
            java.lang.String r7 = r7.concat(r9)     // Catch:{ Exception -> 0x02f8 }
            r14 = 0
            r15 = 1
            r8 = r2
            r9 = r5
            r12 = r20
            r13 = r0
            com.google.android.gms.internal.ads.j34 r0 = com.google.android.gms.internal.ads.j34.m33517c(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x02f8 }
            r6.add(r0)     // Catch:{ Exception -> 0x02f8 }
            return r6
        L_0x031c:
            r0 = move-exception
            r19 = r12
            r21 = r13
            r22 = r14
            r2 = r15
        L_0x0324:
            int r7 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ Exception -> 0x0395 }
            r8 = 23
            java.lang.String r9 = "MediaCodecUtil"
            if (r7 > r8) goto L_0x0358
            boolean r7 = r6.isEmpty()     // Catch:{ Exception -> 0x0395 }
            if (r7 != 0) goto L_0x0358
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ Exception -> 0x0395 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0395 }
            int r0 = r0 + 46
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0395 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r0 = "Skipping codec "
            r5.append(r0)     // Catch:{ Exception -> 0x0395 }
            r7 = r19
            r5.append(r7)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r0 = " (failed to query capabilities)"
            r5.append(r0)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0395 }
            android.util.Log.e(r9, r0)     // Catch:{ Exception -> 0x0395 }
            goto L_0x038b
        L_0x0358:
            r7 = r19
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0395 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0395 }
            int r1 = r1 + 25
            int r2 = r5.length()     // Catch:{ Exception -> 0x0395 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0395 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x0395 }
            r2.append(r7)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0395 }
            r2.append(r5)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0395 }
            android.util.Log.e(r9, r1)     // Catch:{ Exception -> 0x0395 }
            throw r0     // Catch:{ Exception -> 0x0395 }
        L_0x038b:
            int r13 = r21 + 1
            r15 = r2
            r14 = r22
            r2 = r24
            goto L_0x001a
        L_0x0394:
            return r6
        L_0x0395:
            r0 = move-exception
            com.google.android.gms.internal.ads.u34 r1 = new com.google.android.gms.internal.ads.u34
            r2 = 0
            r1.<init>(r0, r2)
            goto L_0x039e
        L_0x039d:
            throw r1
        L_0x039e:
            goto L_0x039d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a44.m30231g(com.google.android.gms.internal.ads.s34, com.google.android.gms.internal.ads.v34):java.util.ArrayList");
    }

    /* renamed from: h */
    private static <T> void m30232h(List<T> list, z34<T> z34) {
        Collections.sort(list, new r34(z34));
    }

    /* renamed from: i */
    private static boolean m30233i(MediaCodecInfo mediaCodecInfo) {
        if (d13.f20195a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String a = h33.m32792a(mediaCodecInfo.getName());
        if (a.startsWith("arc.")) {
            return false;
        }
        if (a.startsWith("omx.google.") || a.startsWith("omx.ffmpeg.") || ((a.startsWith("omx.sec.") && a.contains(".sw.")) || a.equals("omx.qcom.video.decoder.hevcswvdec") || a.startsWith("c2.android.") || a.startsWith("c2.google.") || (!a.startsWith("omx.") && !a.startsWith("c2.")))) {
            return true;
        }
        return false;
    }
}
