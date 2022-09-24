package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z94 extends l34 {

    /* renamed from: s1 */
    private static final int[] f42352s1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: t1 */
    private static boolean f42353t1;

    /* renamed from: u1 */
    private static boolean f42354u1;

    /* renamed from: N0 */
    private final Context f42355N0;

    /* renamed from: O0 */
    private final ia4 f42356O0;

    /* renamed from: P0 */
    private final ta4 f42357P0;

    /* renamed from: Q0 */
    private final boolean f42358Q0 = "NVIDIA".equals(d13.f20197c);

    /* renamed from: R0 */
    private y94 f42359R0;

    /* renamed from: S0 */
    private boolean f42360S0;

    /* renamed from: T0 */
    private boolean f42361T0;

    /* renamed from: U0 */
    private Surface f42362U0;

    /* renamed from: V0 */
    private zzuq f42363V0;

    /* renamed from: W0 */
    private boolean f42364W0;

    /* renamed from: X0 */
    private int f42365X0 = 1;

    /* renamed from: Y0 */
    private boolean f42366Y0;

    /* renamed from: Z0 */
    private boolean f42367Z0;

    /* renamed from: a1 */
    private boolean f42368a1;

    /* renamed from: b1 */
    private long f42369b1;

    /* renamed from: c1 */
    private long f42370c1 = C6540C.TIME_UNSET;

    /* renamed from: d1 */
    private long f42371d1;

    /* renamed from: e1 */
    private int f42372e1;

    /* renamed from: f1 */
    private int f42373f1;

    /* renamed from: g1 */
    private int f42374g1;

    /* renamed from: h1 */
    private long f42375h1;

    /* renamed from: i1 */
    private long f42376i1;

    /* renamed from: j1 */
    private long f42377j1;

    /* renamed from: k1 */
    private int f42378k1;

    /* renamed from: l1 */
    private int f42379l1 = -1;

    /* renamed from: m1 */
    private int f42380m1 = -1;

    /* renamed from: n1 */
    private int f42381n1;

    /* renamed from: o1 */
    private float f42382o1 = -1.0f;

    /* renamed from: p1 */
    private ky0 f42383p1 = null;

    /* renamed from: q1 */
    private int f42384q1 = 0;

    /* renamed from: r1 */
    private aa4 f42385r1;

    public z94(Context context, g34 g34, n34 n34, long j, boolean z, Handler handler, ua4 ua4, int i) {
        super(2, g34, n34, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f42355N0 = applicationContext;
        this.f42356O0 = new ia4(applicationContext);
        this.f42357P0 = new ta4(handler, ua4);
    }

    /* renamed from: A0 */
    private static boolean m40207A0(long j) {
        return j < -30000;
    }

    /* renamed from: B0 */
    private final boolean m40208B0(j34 j34) {
        if (d13.f20195a < 23 || m40209H0(j34.f33740a) || (j34.f33745f && !zzuq.m40665b(this.f42355N0))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0351, code lost:
        if (r1.equals("602LV") != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x074d, code lost:
        if (r7 != 2) goto L_0x074f;
     */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean m40209H0(java.lang.String r13) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r13 = r13.startsWith(r0)
            r0 = 0
            if (r13 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.android.gms.internal.ads.z94> r13 = com.google.android.gms.internal.ads.z94.class
            monitor-enter(r13)
            boolean r1 = f42353t1     // Catch:{ all -> 0x0757 }
            if (r1 != 0) goto L_0x0753
            int r1 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ all -> 0x0757 }
            r2 = 4
            r3 = 5
            r4 = 3
            r5 = 6
            r6 = 28
            r7 = -1
            r8 = 2
            r9 = 1
            if (r1 > r6) goto L_0x0076
            java.lang.String r10 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ all -> 0x0757 }
            int r11 = r10.hashCode()     // Catch:{ all -> 0x0757 }
            switch(r11) {
                case -1339091551: goto L_0x0064;
                case -1220081023: goto L_0x005a;
                case -1220066608: goto L_0x0050;
                case -1012436106: goto L_0x0046;
                case -64886864: goto L_0x003c;
                case 3415681: goto L_0x0032;
                case 825323514: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x006e
        L_0x0028:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 4
            goto L_0x006f
        L_0x0032:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 5
            goto L_0x006f
        L_0x003c:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 3
            goto L_0x006f
        L_0x0046:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 6
            goto L_0x006f
        L_0x0050:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x005a:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 2
            goto L_0x006f
        L_0x0064:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 0
            goto L_0x006f
        L_0x006e:
            r10 = -1
        L_0x006f:
            switch(r10) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0073;
                case 2: goto L_0x0073;
                case 3: goto L_0x0073;
                case 4: goto L_0x0073;
                case 5: goto L_0x0073;
                case 6: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0076
        L_0x0073:
            r0 = 1
            goto L_0x074f
        L_0x0076:
            r10 = 27
            if (r1 > r10) goto L_0x0085
            java.lang.String r11 = "HWEML"
            java.lang.String r12 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ all -> 0x0757 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0757 }
            if (r11 == 0) goto L_0x0085
            goto L_0x0073
        L_0x0085:
            r11 = 26
            if (r1 > r11) goto L_0x074f
            java.lang.String r1 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ all -> 0x0757 }
            int r12 = r1.hashCode()     // Catch:{ all -> 0x0757 }
            switch(r12) {
                case -2144781245: goto L_0x0707;
                case -2144781185: goto L_0x06fc;
                case -2144781160: goto L_0x06f1;
                case -2097309513: goto L_0x06e6;
                case -2022874474: goto L_0x06db;
                case -1978993182: goto L_0x06d0;
                case -1978990237: goto L_0x06c5;
                case -1936688988: goto L_0x06ba;
                case -1936688066: goto L_0x06af;
                case -1936688065: goto L_0x06a3;
                case -1931988508: goto L_0x0697;
                case -1885099851: goto L_0x068b;
                case -1696512866: goto L_0x067f;
                case -1680025915: goto L_0x0673;
                case -1615810839: goto L_0x0667;
                case -1600724499: goto L_0x065b;
                case -1554255044: goto L_0x064f;
                case -1481772737: goto L_0x0643;
                case -1481772730: goto L_0x0637;
                case -1481772729: goto L_0x062b;
                case -1320080169: goto L_0x061f;
                case -1217592143: goto L_0x0613;
                case -1180384755: goto L_0x0607;
                case -1139198265: goto L_0x05fb;
                case -1052835013: goto L_0x05ef;
                case -993250464: goto L_0x05e4;
                case -993250458: goto L_0x05d9;
                case -965403638: goto L_0x05cd;
                case -958336948: goto L_0x05c1;
                case -879245230: goto L_0x05b5;
                case -842500323: goto L_0x05a9;
                case -821392978: goto L_0x059d;
                case -797483286: goto L_0x0591;
                case -794946968: goto L_0x0585;
                case -788334647: goto L_0x0579;
                case -782144577: goto L_0x056d;
                case -575125681: goto L_0x0561;
                case -521118391: goto L_0x0555;
                case -430914369: goto L_0x0549;
                case -290434366: goto L_0x053d;
                case -282781963: goto L_0x0531;
                case -277133239: goto L_0x0525;
                case -173639913: goto L_0x0519;
                case -56598463: goto L_0x050d;
                case 2126: goto L_0x0501;
                case 2564: goto L_0x04f5;
                case 2715: goto L_0x04e9;
                case 2719: goto L_0x04dd;
                case 3091: goto L_0x04d1;
                case 3483: goto L_0x04c5;
                case 73405: goto L_0x04b9;
                case 75537: goto L_0x04ad;
                case 75739: goto L_0x04a1;
                case 76779: goto L_0x0495;
                case 78669: goto L_0x0489;
                case 79305: goto L_0x047d;
                case 80618: goto L_0x0471;
                case 88274: goto L_0x0465;
                case 98846: goto L_0x0459;
                case 98848: goto L_0x044d;
                case 99329: goto L_0x0441;
                case 101481: goto L_0x0435;
                case 1513190: goto L_0x042a;
                case 1514184: goto L_0x041f;
                case 1514185: goto L_0x0414;
                case 2133089: goto L_0x0408;
                case 2133091: goto L_0x03fc;
                case 2133120: goto L_0x03f0;
                case 2133151: goto L_0x03e4;
                case 2133182: goto L_0x03d8;
                case 2133184: goto L_0x03cc;
                case 2436959: goto L_0x03c0;
                case 2463773: goto L_0x03b4;
                case 2464648: goto L_0x03a8;
                case 2689555: goto L_0x039c;
                case 3154429: goto L_0x0390;
                case 3284551: goto L_0x0384;
                case 3351335: goto L_0x0378;
                case 3386211: goto L_0x036c;
                case 41325051: goto L_0x0360;
                case 51349633: goto L_0x0355;
                case 51350594: goto L_0x034b;
                case 55178625: goto L_0x033f;
                case 61542055: goto L_0x0334;
                case 65355429: goto L_0x0328;
                case 66214468: goto L_0x031c;
                case 66214470: goto L_0x0310;
                case 66214473: goto L_0x0304;
                case 66215429: goto L_0x02f8;
                case 66215431: goto L_0x02ec;
                case 66215433: goto L_0x02e0;
                case 66216390: goto L_0x02d4;
                case 76402249: goto L_0x02c8;
                case 76404105: goto L_0x02bc;
                case 76404911: goto L_0x02b0;
                case 80963634: goto L_0x02a4;
                case 82882791: goto L_0x0298;
                case 98715550: goto L_0x028c;
                case 101370885: goto L_0x0280;
                case 102844228: goto L_0x0274;
                case 165221241: goto L_0x0268;
                case 182191441: goto L_0x025c;
                case 245388979: goto L_0x0250;
                case 287431619: goto L_0x0244;
                case 307593612: goto L_0x0238;
                case 308517133: goto L_0x022c;
                case 316215098: goto L_0x0220;
                case 316215116: goto L_0x0214;
                case 316246811: goto L_0x0208;
                case 316246818: goto L_0x01fc;
                case 407160593: goto L_0x01f0;
                case 507412548: goto L_0x01e4;
                case 793982701: goto L_0x01d8;
                case 794038622: goto L_0x01cc;
                case 794040393: goto L_0x01c0;
                case 835649806: goto L_0x01b4;
                case 917340916: goto L_0x01a8;
                case 958008161: goto L_0x019c;
                case 1060579533: goto L_0x0190;
                case 1150207623: goto L_0x0184;
                case 1176899427: goto L_0x0178;
                case 1280332038: goto L_0x016c;
                case 1306947716: goto L_0x0160;
                case 1349174697: goto L_0x0154;
                case 1522194893: goto L_0x0148;
                case 1691543273: goto L_0x013c;
                case 1691544261: goto L_0x0130;
                case 1709443163: goto L_0x0124;
                case 1865889110: goto L_0x0118;
                case 1906253259: goto L_0x010c;
                case 1977196784: goto L_0x0100;
                case 2006372676: goto L_0x00f4;
                case 2019281702: goto L_0x00e8;
                case 2029784656: goto L_0x00dc;
                case 2030379515: goto L_0x00d0;
                case 2033393791: goto L_0x00c4;
                case 2047190025: goto L_0x00b8;
                case 2047252157: goto L_0x00ac;
                case 2048319463: goto L_0x00a0;
                case 2048855701: goto L_0x0094;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x0712
        L_0x0094:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 66
            goto L_0x0713
        L_0x00a0:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 65
            goto L_0x0713
        L_0x00ac:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 33
            goto L_0x0713
        L_0x00b8:
            java.lang.String r2 = "ELUGA_Note"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 32
            goto L_0x0713
        L_0x00c4:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 14
            goto L_0x0713
        L_0x00d0:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 64
            goto L_0x0713
        L_0x00dc:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 63
            goto L_0x0713
        L_0x00e8:
            java.lang.String r2 = "DM-01K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 29
            goto L_0x0713
        L_0x00f4:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 19
            goto L_0x0713
        L_0x0100:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 69
            goto L_0x0713
        L_0x010c:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 100
            goto L_0x0713
        L_0x0118:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x0713
        L_0x0124:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 68
            goto L_0x0713
        L_0x0130:
            java.lang.String r2 = "CPH1715"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 24
            goto L_0x0713
        L_0x013c:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 23
            goto L_0x0713
        L_0x0148:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 133(0x85, float:1.86E-43)
            goto L_0x0713
        L_0x0154:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 61
            goto L_0x0713
        L_0x0160:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 35
            goto L_0x0713
        L_0x016c:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 62
            goto L_0x0713
        L_0x0178:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 71
            goto L_0x0713
        L_0x0184:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 78
            goto L_0x0713
        L_0x0190:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 96
            goto L_0x0713
        L_0x019c:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 72
            goto L_0x0713
        L_0x01a8:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 10
            goto L_0x0713
        L_0x01b4:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 81
            goto L_0x0713
        L_0x01c0:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 59
            goto L_0x0713
        L_0x01cc:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 58
            goto L_0x0713
        L_0x01d8:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 57
            goto L_0x0713
        L_0x01e4:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x0713
        L_0x01f0:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x0713
        L_0x01fc:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 125(0x7d, float:1.75E-43)
            goto L_0x0713
        L_0x0208:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x0713
        L_0x0214:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x0713
        L_0x0220:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x0713
        L_0x022c:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 12
            goto L_0x0713
        L_0x0238:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 11
            goto L_0x0713
        L_0x0244:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 60
            goto L_0x0713
        L_0x0250:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 82
            goto L_0x0713
        L_0x025c:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 25
            goto L_0x0713
        L_0x0268:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 8
            goto L_0x0713
        L_0x0274:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 77
            goto L_0x0713
        L_0x0280:
            java.lang.String r2 = "l5460"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 76
            goto L_0x0713
        L_0x028c:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 67
            goto L_0x0713
        L_0x0298:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 135(0x87, float:1.89E-43)
            goto L_0x0713
        L_0x02a4:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x0713
        L_0x02b0:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0713
        L_0x02bc:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x0713
        L_0x02c8:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x0713
        L_0x02d4:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 48
            goto L_0x0713
        L_0x02e0:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 47
            goto L_0x0713
        L_0x02ec:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 46
            goto L_0x0713
        L_0x02f8:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 45
            goto L_0x0713
        L_0x0304:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 44
            goto L_0x0713
        L_0x0310:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 43
            goto L_0x0713
        L_0x031c:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 42
            goto L_0x0713
        L_0x0328:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 30
            goto L_0x0713
        L_0x0334:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 7
            goto L_0x0713
        L_0x033f:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 15
            goto L_0x0713
        L_0x034b:
            java.lang.String r3 = "602LV"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0712
            goto L_0x0713
        L_0x0355:
            java.lang.String r2 = "601LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 3
            goto L_0x0713
        L_0x0360:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 83
            goto L_0x0713
        L_0x036c:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 92
            goto L_0x0713
        L_0x0378:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 85
            goto L_0x0713
        L_0x0384:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 75
            goto L_0x0713
        L_0x0390:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 50
            goto L_0x0713
        L_0x039c:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 136(0x88, float:1.9E-43)
            goto L_0x0713
        L_0x03a8:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0713
        L_0x03b4:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x0713
        L_0x03c0:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 93
            goto L_0x0713
        L_0x03cc:
            java.lang.String r2 = "F04J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 41
            goto L_0x0713
        L_0x03d8:
            java.lang.String r2 = "F04H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 40
            goto L_0x0713
        L_0x03e4:
            java.lang.String r2 = "F03H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 39
            goto L_0x0713
        L_0x03f0:
            java.lang.String r2 = "F02H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 38
            goto L_0x0713
        L_0x03fc:
            java.lang.String r2 = "F01J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 37
            goto L_0x0713
        L_0x0408:
            java.lang.String r2 = "F01H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 36
            goto L_0x0713
        L_0x0414:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 2
            goto L_0x0713
        L_0x041f:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 1
            goto L_0x0713
        L_0x042a:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 0
            goto L_0x0713
        L_0x0435:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 49
            goto L_0x0713
        L_0x0441:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 28
            goto L_0x0713
        L_0x044d:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 27
            goto L_0x0713
        L_0x0459:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 26
            goto L_0x0713
        L_0x0465:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 139(0x8b, float:1.95E-43)
            goto L_0x0713
        L_0x0471:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x0713
        L_0x047d:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x0713
        L_0x0489:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 94
            goto L_0x0713
        L_0x0495:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 86
            goto L_0x0713
        L_0x04a1:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 80
            goto L_0x0713
        L_0x04ad:
            java.lang.String r2 = "M04"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 79
            goto L_0x0713
        L_0x04b9:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 73
            goto L_0x0713
        L_0x04c5:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 84
            goto L_0x0713
        L_0x04d1:
            java.lang.String r2 = "b5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 16
            goto L_0x0713
        L_0x04dd:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 129(0x81, float:1.81E-43)
            goto L_0x0713
        L_0x04e9:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x0713
        L_0x04f5:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0713
        L_0x0501:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 20
            goto L_0x0713
        L_0x050d:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 134(0x86, float:1.88E-43)
            goto L_0x0713
        L_0x0519:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 31
            goto L_0x0713
        L_0x0525:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x0713
        L_0x0531:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 17
            goto L_0x0713
        L_0x053d:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0713
        L_0x0549:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x0713
        L_0x0555:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 53
            goto L_0x0713
        L_0x0561:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 51
            goto L_0x0713
        L_0x056d:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 91
            goto L_0x0713
        L_0x0579:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 132(0x84, float:1.85E-43)
            goto L_0x0713
        L_0x0585:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 131(0x83, float:1.84E-43)
            goto L_0x0713
        L_0x0591:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x0713
        L_0x059d:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 9
            goto L_0x0713
        L_0x05a9:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 88
            goto L_0x0713
        L_0x05b5:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 126(0x7e, float:1.77E-43)
            goto L_0x0713
        L_0x05c1:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 34
            goto L_0x0713
        L_0x05cd:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x0713
        L_0x05d9:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 6
            goto L_0x0713
        L_0x05e4:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 5
            goto L_0x0713
        L_0x05ef:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 87
            goto L_0x0713
        L_0x05fb:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x0713
        L_0x0607:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 70
            goto L_0x0713
        L_0x0613:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 18
            goto L_0x0713
        L_0x061f:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 52
            goto L_0x0713
        L_0x062b:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 99
            goto L_0x0713
        L_0x0637:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 98
            goto L_0x0713
        L_0x0643:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 97
            goto L_0x0713
        L_0x064f:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0713
        L_0x065b:
            java.lang.String r2 = "pacificrim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 95
            goto L_0x0713
        L_0x0667:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x0713
        L_0x0673:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 21
            goto L_0x0713
        L_0x067f:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 137(0x89, float:1.92E-43)
            goto L_0x0713
        L_0x068b:
            java.lang.String r2 = "RAIJIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x0713
        L_0x0697:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 13
            goto L_0x0713
        L_0x06a3:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x0713
        L_0x06af:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x0713
        L_0x06ba:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x0713
        L_0x06c5:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 90
            goto L_0x0713
        L_0x06d0:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 89
            goto L_0x0713
        L_0x06db:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 22
            goto L_0x0713
        L_0x06e6:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 74
            goto L_0x0713
        L_0x06f1:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 56
            goto L_0x0713
        L_0x06fc:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 55
            goto L_0x0713
        L_0x0707:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 54
            goto L_0x0713
        L_0x0712:
            r2 = -1
        L_0x0713:
            switch(r2) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0073;
                case 2: goto L_0x0073;
                case 3: goto L_0x0073;
                case 4: goto L_0x0073;
                case 5: goto L_0x0073;
                case 6: goto L_0x0073;
                case 7: goto L_0x0073;
                case 8: goto L_0x0073;
                case 9: goto L_0x0073;
                case 10: goto L_0x0073;
                case 11: goto L_0x0073;
                case 12: goto L_0x0073;
                case 13: goto L_0x0073;
                case 14: goto L_0x0073;
                case 15: goto L_0x0073;
                case 16: goto L_0x0073;
                case 17: goto L_0x0073;
                case 18: goto L_0x0073;
                case 19: goto L_0x0073;
                case 20: goto L_0x0073;
                case 21: goto L_0x0073;
                case 22: goto L_0x0073;
                case 23: goto L_0x0073;
                case 24: goto L_0x0073;
                case 25: goto L_0x0073;
                case 26: goto L_0x0073;
                case 27: goto L_0x0073;
                case 28: goto L_0x0073;
                case 29: goto L_0x0073;
                case 30: goto L_0x0073;
                case 31: goto L_0x0073;
                case 32: goto L_0x0073;
                case 33: goto L_0x0073;
                case 34: goto L_0x0073;
                case 35: goto L_0x0073;
                case 36: goto L_0x0073;
                case 37: goto L_0x0073;
                case 38: goto L_0x0073;
                case 39: goto L_0x0073;
                case 40: goto L_0x0073;
                case 41: goto L_0x0073;
                case 42: goto L_0x0073;
                case 43: goto L_0x0073;
                case 44: goto L_0x0073;
                case 45: goto L_0x0073;
                case 46: goto L_0x0073;
                case 47: goto L_0x0073;
                case 48: goto L_0x0073;
                case 49: goto L_0x0073;
                case 50: goto L_0x0073;
                case 51: goto L_0x0073;
                case 52: goto L_0x0073;
                case 53: goto L_0x0073;
                case 54: goto L_0x0073;
                case 55: goto L_0x0073;
                case 56: goto L_0x0073;
                case 57: goto L_0x0073;
                case 58: goto L_0x0073;
                case 59: goto L_0x0073;
                case 60: goto L_0x0073;
                case 61: goto L_0x0073;
                case 62: goto L_0x0073;
                case 63: goto L_0x0073;
                case 64: goto L_0x0073;
                case 65: goto L_0x0073;
                case 66: goto L_0x0073;
                case 67: goto L_0x0073;
                case 68: goto L_0x0073;
                case 69: goto L_0x0073;
                case 70: goto L_0x0073;
                case 71: goto L_0x0073;
                case 72: goto L_0x0073;
                case 73: goto L_0x0073;
                case 74: goto L_0x0073;
                case 75: goto L_0x0073;
                case 76: goto L_0x0073;
                case 77: goto L_0x0073;
                case 78: goto L_0x0073;
                case 79: goto L_0x0073;
                case 80: goto L_0x0073;
                case 81: goto L_0x0073;
                case 82: goto L_0x0073;
                case 83: goto L_0x0073;
                case 84: goto L_0x0073;
                case 85: goto L_0x0073;
                case 86: goto L_0x0073;
                case 87: goto L_0x0073;
                case 88: goto L_0x0073;
                case 89: goto L_0x0073;
                case 90: goto L_0x0073;
                case 91: goto L_0x0073;
                case 92: goto L_0x0073;
                case 93: goto L_0x0073;
                case 94: goto L_0x0073;
                case 95: goto L_0x0073;
                case 96: goto L_0x0073;
                case 97: goto L_0x0073;
                case 98: goto L_0x0073;
                case 99: goto L_0x0073;
                case 100: goto L_0x0073;
                case 101: goto L_0x0073;
                case 102: goto L_0x0073;
                case 103: goto L_0x0073;
                case 104: goto L_0x0073;
                case 105: goto L_0x0073;
                case 106: goto L_0x0073;
                case 107: goto L_0x0073;
                case 108: goto L_0x0073;
                case 109: goto L_0x0073;
                case 110: goto L_0x0073;
                case 111: goto L_0x0073;
                case 112: goto L_0x0073;
                case 113: goto L_0x0073;
                case 114: goto L_0x0073;
                case 115: goto L_0x0073;
                case 116: goto L_0x0073;
                case 117: goto L_0x0073;
                case 118: goto L_0x0073;
                case 119: goto L_0x0073;
                case 120: goto L_0x0073;
                case 121: goto L_0x0073;
                case 122: goto L_0x0073;
                case 123: goto L_0x0073;
                case 124: goto L_0x0073;
                case 125: goto L_0x0073;
                case 126: goto L_0x0073;
                case 127: goto L_0x0073;
                case 128: goto L_0x0073;
                case 129: goto L_0x0073;
                case 130: goto L_0x0073;
                case 131: goto L_0x0073;
                case 132: goto L_0x0073;
                case 133: goto L_0x0073;
                case 134: goto L_0x0073;
                case 135: goto L_0x0073;
                case 136: goto L_0x0073;
                case 137: goto L_0x0073;
                case 138: goto L_0x0073;
                case 139: goto L_0x0073;
                default: goto L_0x0716;
            }
        L_0x0716:
            java.lang.String r1 = com.google.android.gms.internal.ads.d13.f20198d     // Catch:{ all -> 0x0757 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0757 }
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r2 == r3) goto L_0x0740
            r3 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r3) goto L_0x0736
            r3 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r3) goto L_0x072c
            goto L_0x0749
        L_0x072c:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0749
            r7 = 1
            goto L_0x0749
        L_0x0736:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0749
            r7 = 0
            goto L_0x0749
        L_0x0740:
            java.lang.String r2 = "JSN-L21"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0749
            r7 = 2
        L_0x0749:
            if (r7 == 0) goto L_0x0073
            if (r7 == r9) goto L_0x0073
            if (r7 == r8) goto L_0x0073
        L_0x074f:
            f42354u1 = r0     // Catch:{ all -> 0x0757 }
            f42353t1 = r9     // Catch:{ all -> 0x0757 }
        L_0x0753:
            monitor-exit(r13)     // Catch:{ all -> 0x0757 }
            boolean r13 = f42354u1
            return r13
        L_0x0757:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0757 }
            goto L_0x075b
        L_0x075a:
            throw r0
        L_0x075b:
            goto L_0x075a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z94.m40209H0(java.lang.String):boolean");
    }

    /* renamed from: u0 */
    protected static int m40210u0(j34 j34, C8281w wVar) {
        if (wVar.f40620m == -1) {
            return m40211v0(j34, wVar);
        }
        int size = wVar.f40621n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += wVar.f40621n.get(i2).length;
        }
        return wVar.f40620m + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r12 = ((java.lang.Integer) r12.first).intValue();
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m40211v0(com.google.android.gms.internal.ads.j34 r11, com.google.android.gms.internal.ads.C8281w r12) {
        /*
            int r0 = r12.f40624q
            int r1 = r12.f40625r
            r2 = -1
            if (r0 == r2) goto L_0x00c8
            if (r1 != r2) goto L_0x000b
            goto L_0x00c8
        L_0x000b:
            java.lang.String r3 = r12.f40619l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r12 = com.google.android.gms.internal.ads.a44.m30226b(r12)
            if (r12 == 0) goto L_0x0033
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r12 == r3) goto L_0x0031
            if (r12 == r7) goto L_0x0031
            if (r12 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            int r12 = r3.hashCode()
            r4 = 5
            r9 = 4
            r10 = 3
            switch(r12) {
                case -1664118616: goto L_0x006d;
                case -1662541442: goto L_0x0065;
                case 1187890754: goto L_0x005b;
                case 1331836730: goto L_0x0053;
                case 1599127256: goto L_0x0049;
                case 1599127257: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0077
        L_0x003f:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 5
            goto L_0x0078
        L_0x0049:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 3
            goto L_0x0078
        L_0x0053:
            boolean r12 = r3.equals(r5)
            if (r12 == 0) goto L_0x0077
            r12 = 2
            goto L_0x0078
        L_0x005b:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 1
            goto L_0x0078
        L_0x0065:
            boolean r12 = r3.equals(r6)
            if (r12 == 0) goto L_0x0077
            r12 = 4
            goto L_0x0078
        L_0x006d:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 0
            goto L_0x0078
        L_0x0077:
            r12 = -1
        L_0x0078:
            if (r12 == 0) goto L_0x00c1
            if (r12 == r7) goto L_0x00c1
            if (r12 == r8) goto L_0x0089
            if (r12 == r10) goto L_0x00c1
            if (r12 == r9) goto L_0x0085
            if (r12 == r4) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = r0 * r1
            r8 = 4
            goto L_0x00c3
        L_0x0089:
            java.lang.String r12 = com.google.android.gms.internal.ads.d13.f20198d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = com.google.android.gms.internal.ads.d13.f20197c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b1
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = "AFTS"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b1
            boolean r11 = r11.f33745f
            if (r11 != 0) goto L_0x00c0
        L_0x00b1:
            r11 = 16
            int r12 = com.google.android.gms.internal.ads.d13.m20280K(r0, r11)
            int r11 = com.google.android.gms.internal.ads.d13.m20280K(r1, r11)
            int r12 = r12 * r11
            int r0 = r12 * 256
            goto L_0x00c3
        L_0x00c0:
            return r2
        L_0x00c1:
            int r0 = r0 * r1
        L_0x00c3:
            int r0 = r0 * 3
            int r8 = r8 + r8
            int r0 = r0 / r8
            return r0
        L_0x00c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z94.m40211v0(com.google.android.gms.internal.ads.j34, com.google.android.gms.internal.ads.w):int");
    }

    /* renamed from: w0 */
    private static List<j34> m40212w0(n34 n34, C8281w wVar, boolean z, boolean z2) throws u34 {
        Pair<Integer, Integer> b;
        String str = wVar.f40619l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<j34> f = a44.m30230f(a44.m30229e(str, z, z2), wVar);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str) && (b = a44.m30226b(wVar)) != null) {
            int intValue = ((Integer) b.first).intValue();
            if (intValue == 16 || intValue == 256) {
                f.addAll(a44.m30229e(MimeTypes.VIDEO_H265, z, z2));
            } else if (intValue == 512) {
                f.addAll(a44.m30229e(MimeTypes.VIDEO_H264, z, z2));
            }
        }
        return Collections.unmodifiableList(f);
    }

    /* renamed from: x0 */
    private final void m40213x0() {
        int i = this.f42379l1;
        if (i == -1) {
            if (this.f42380m1 != -1) {
                i = -1;
            } else {
                return;
            }
        }
        ky0 ky0 = this.f42383p1;
        if (ky0 == null || ky0.f34738a != i || ky0.f34739b != this.f42380m1 || ky0.f34740c != this.f42381n1 || ky0.f34741d != this.f42382o1) {
            ky0 ky02 = new ky0(i, this.f42380m1, this.f42381n1, this.f42382o1);
            this.f42383p1 = ky02;
            this.f42357P0.mo34900t(ky02);
        }
    }

    /* renamed from: y0 */
    private final void m40214y0() {
        ky0 ky0 = this.f42383p1;
        if (ky0 != null) {
            this.f42357P0.mo34900t(ky0);
        }
    }

    /* renamed from: z0 */
    private final void m40215z0() {
        Surface surface = this.f42362U0;
        zzuq zzuq = this.f42363V0;
        if (surface == zzuq) {
            this.f42362U0 = null;
        }
        zzuq.release();
        this.f42363V0 = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo33297A() {
        this.f42372e1 = 0;
        this.f42371d1 = SystemClock.elapsedRealtime();
        this.f42376i1 = SystemClock.elapsedRealtime() * 1000;
        this.f42377j1 = 0;
        this.f42378k1 = 0;
        this.f42356O0.mo32590i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo33298B() {
        this.f42370c1 = C6540C.TIME_UNSET;
        if (this.f42372e1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f42357P0.mo34884d(this.f42372e1, elapsedRealtime - this.f42371d1);
            this.f42372e1 = 0;
            this.f42371d1 = elapsedRealtime;
        }
        int i = this.f42378k1;
        if (i != 0) {
            this.f42357P0.mo34898r(this.f42377j1, i);
            this.f42377j1 = 0;
            this.f42378k1 = 0;
        }
        this.f42356O0.mo32591j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final void mo36022C0(h34 h34, int i, long j) {
        m40213x0();
        bz2.m30876a("releaseOutputBuffer");
        h34.mo31104e(i, true);
        bz2.m30877b();
        this.f42376i1 = SystemClock.elapsedRealtime() * 1000;
        this.f34832G0.f35488e++;
        this.f42373f1 = 0;
        mo36027I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final float mo33245D(float f, C8281w wVar, C8281w[] wVarArr) {
        float f2 = -1.0f;
        for (C8281w wVar2 : wVarArr) {
            float f3 = wVar2.f40626s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public final void mo36023D0(h34 h34, int i, long j, long j2) {
        m40213x0();
        bz2.m30876a("releaseOutputBuffer");
        h34.mo31106g(i, j2);
        bz2.m30877b();
        this.f42376i1 = SystemClock.elapsedRealtime() * 1000;
        this.f34832G0.f35488e++;
        this.f42373f1 = 0;
        mo36027I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo33246E(n34 n34, C8281w wVar) throws u34 {
        int i = 0;
        if (!C7773hx.m32966h(wVar.f40619l)) {
            return 0;
        }
        boolean z = wVar.f40622o != null;
        List<j34> w0 = m40212w0(n34, wVar, z, false);
        if (z && w0.isEmpty()) {
            w0 = m40212w0(n34, wVar, false, false);
        }
        if (w0.isEmpty()) {
            return 1;
        }
        if (!l34.m34293o0(wVar)) {
            return 2;
        }
        j34 j34 = w0.get(0);
        boolean d = j34.mo32824d(wVar);
        int i2 = true != j34.mo32825e(wVar) ? 8 : 16;
        if (d) {
            List<j34> w02 = m40212w0(n34, wVar, z, true);
            if (!w02.isEmpty()) {
                j34 j342 = w02.get(0);
                if (j342.mo32824d(wVar) && j342.mo32825e(wVar)) {
                    i = 32;
                }
            }
        }
        return (true != d ? 3 : 4) | i2 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E0 */
    public final void mo36024E0(h34 h34, int i, long j) {
        bz2.m30876a("skipVideoBuffer");
        h34.mo31104e(i, false);
        bz2.m30877b();
        this.f34832G0.f35489f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final nd3 mo33247F(j34 j34, C8281w wVar, C8281w wVar2) {
        int i;
        int i2;
        nd3 b = j34.mo32823b(wVar, wVar2);
        int i3 = b.f35987e;
        int i4 = wVar2.f40624q;
        y94 y94 = this.f42359R0;
        if (i4 > y94.f41756a || wVar2.f40625r > y94.f41757b) {
            i3 |= 256;
        }
        if (m40210u0(j34, wVar2) > this.f42359R0.f41758c) {
            i3 |= 64;
        }
        String str = j34.f33740a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = b.f35986d;
            i = 0;
        }
        return new nd3(str, wVar, wVar2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public final void mo36025F0(int i) {
        mc3 mc3 = this.f34832G0;
        mc3.f35490g += i;
        this.f42372e1 += i;
        int i2 = this.f42373f1 + i;
        this.f42373f1 = i2;
        mc3.f35491h = Math.max(i2, mc3.f35491h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final nd3 mo33248G(mw3 mw3) throws vk3 {
        nd3 G = super.mo33248G(mw3);
        this.f42357P0.mo34886f(mw3.f35636a, G);
        return G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final void mo36026G0(long j) {
        mc3 mc3 = this.f34832G0;
        mc3.f35493j += j;
        mc3.f35494k++;
        this.f42377j1 += j;
        this.f42378k1++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo36027I() {
        this.f42368a1 = true;
        if (!this.f42366Y0) {
            this.f42366Y0 = true;
            this.f42357P0.mo34897q(this.f42362U0);
            this.f42364W0 = true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0131, code lost:
        r20 = r9;
        r21 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023a  */
    @android.annotation.TargetApi(17)
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.f34 mo33249J(com.google.android.gms.internal.ads.j34 r23, com.google.android.gms.internal.ads.C8281w r24, android.media.MediaCrypto r25, float r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            com.google.android.gms.internal.ads.zzuq r4 = r0.f42363V0
            if (r4 == 0) goto L_0x0015
            boolean r4 = r4.f43068b
            boolean r5 = r1.f33745f
            if (r4 == r5) goto L_0x0015
            r22.m40215z0()
        L_0x0015:
            java.lang.String r4 = r1.f33742c
            com.google.android.gms.internal.ads.w[] r5 = r22.mo33300n()
            int r6 = r2.f40624q
            int r7 = r2.f40625r
            int r8 = m40210u0(r23, r24)
            int r9 = r5.length
            r10 = -1
            r13 = 1
            if (r9 != r13) goto L_0x0043
            if (r8 == r10) goto L_0x003a
            int r5 = m40211v0(r23, r24)
            if (r5 == r10) goto L_0x003a
            float r8 = (float) r8
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r5)
        L_0x003a:
            com.google.android.gms.internal.ads.y94 r5 = new com.google.android.gms.internal.ads.y94
            r5.<init>(r6, r7, r8)
            r16 = r4
            goto L_0x0182
        L_0x0043:
            r14 = 0
            r15 = 0
        L_0x0045:
            if (r14 >= r9) goto L_0x0089
            r11 = r5[r14]
            com.google.android.gms.internal.ads.z04 r13 = r2.f40631x
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.ads.z04 r13 = r11.f40631x
            if (r13 != 0) goto L_0x005e
            com.google.android.gms.internal.ads.ge4 r11 = r11.mo35521b()
            com.google.android.gms.internal.ads.z04 r13 = r2.f40631x
            r11.mo32080g0(r13)
            com.google.android.gms.internal.ads.w r11 = r11.mo32099y()
        L_0x005e:
            com.google.android.gms.internal.ads.nd3 r13 = r1.mo32823b(r2, r11)
            int r13 = r13.f35986d
            if (r13 == 0) goto L_0x0085
            int r13 = r11.f40624q
            if (r13 == r10) goto L_0x0071
            int r12 = r11.f40625r
            if (r12 != r10) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r12 = 0
            goto L_0x0072
        L_0x0071:
            r12 = 1
        L_0x0072:
            r15 = r15 | r12
            int r6 = java.lang.Math.max(r6, r13)
            int r12 = r11.f40625r
            int r7 = java.lang.Math.max(r7, r12)
            int r11 = m40210u0(r1, r11)
            int r8 = java.lang.Math.max(r8, r11)
        L_0x0085:
            int r14 = r14 + 1
            r13 = 1
            goto L_0x0045
        L_0x0089:
            if (r15 == 0) goto L_0x017b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r9 = 66
            r5.<init>(r9)
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            r5.append(r9)
            r5.append(r6)
            java.lang.String r9 = "x"
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "MediaCodecVideoRenderer"
            android.util.Log.w(r10, r5)
            int r5 = r2.f40625r
            int r11 = r2.f40624q
            if (r5 <= r11) goto L_0x00b3
            r12 = r5
            goto L_0x00b4
        L_0x00b3:
            r12 = r11
        L_0x00b4:
            if (r5 > r11) goto L_0x00b8
            r13 = r5
            goto L_0x00b9
        L_0x00b8:
            r13 = r11
        L_0x00b9:
            float r14 = (float) r13
            float r15 = (float) r12
            float r14 = r14 / r15
            int[] r15 = f42352s1
            r16 = r4
            r3 = 0
        L_0x00c1:
            r4 = 9
            if (r3 >= r4) goto L_0x0131
            r4 = r15[r3]
            r17 = r15
            float r15 = (float) r4
            float r15 = r15 * r14
            int r15 = (int) r15
            if (r4 <= r12) goto L_0x0131
            if (r15 > r13) goto L_0x00d3
            goto L_0x0131
        L_0x00d3:
            r18 = r12
            int r12 = com.google.android.gms.internal.ads.d13.f20195a
            r19 = r13
            r13 = 21
            if (r12 < r13) goto L_0x00fb
            if (r5 > r11) goto L_0x00e1
            r12 = r4
            goto L_0x00e2
        L_0x00e1:
            r12 = r15
        L_0x00e2:
            if (r5 > r11) goto L_0x00e5
            r4 = r15
        L_0x00e5:
            android.graphics.Point r4 = r1.mo32822a(r12, r4)
            float r12 = r2.f40626s
            int r13 = r4.x
            int r15 = r4.y
            r20 = r9
            r21 = r10
            double r9 = (double) r12
            boolean r9 = r1.mo32826f(r13, r15, r9)
            if (r9 == 0) goto L_0x0124
            goto L_0x0136
        L_0x00fb:
            r20 = r9
            r21 = r10
            r9 = 16
            int r4 = com.google.android.gms.internal.ads.d13.m20280K(r4, r9)     // Catch:{ u34 -> 0x0135 }
            int r4 = r4 * 16
            int r10 = com.google.android.gms.internal.ads.d13.m20280K(r15, r9)     // Catch:{ u34 -> 0x0135 }
            int r10 = r10 * 16
            int r9 = r4 * r10
            int r12 = com.google.android.gms.internal.ads.a44.m30225a()     // Catch:{ u34 -> 0x0135 }
            if (r9 > r12) goto L_0x0124
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ u34 -> 0x0135 }
            if (r5 > r11) goto L_0x011b
            r9 = r4
            goto L_0x011c
        L_0x011b:
            r9 = r10
        L_0x011c:
            if (r5 > r11) goto L_0x011f
            r4 = r10
        L_0x011f:
            r3.<init>(r9, r4)     // Catch:{ u34 -> 0x0135 }
            r4 = r3
            goto L_0x0136
        L_0x0124:
            int r3 = r3 + 1
            r15 = r17
            r12 = r18
            r13 = r19
            r9 = r20
            r10 = r21
            goto L_0x00c1
        L_0x0131:
            r20 = r9
            r21 = r10
        L_0x0135:
            r4 = 0
        L_0x0136:
            if (r4 == 0) goto L_0x017d
            int r3 = r4.x
            int r6 = java.lang.Math.max(r6, r3)
            int r3 = r4.y
            int r7 = java.lang.Math.max(r7, r3)
            com.google.android.gms.internal.ads.ge4 r3 = r24.mo35521b()
            r3.mo32098x(r6)
            r3.mo32077f(r7)
            com.google.android.gms.internal.ads.w r3 = r3.mo32099y()
            int r3 = m40211v0(r1, r3)
            int r8 = java.lang.Math.max(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 57
            r3.<init>(r4)
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r3.append(r4)
            r3.append(r6)
            r4 = r20
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r4 = r21
            android.util.Log.w(r4, r3)
            goto L_0x017d
        L_0x017b:
            r16 = r4
        L_0x017d:
            com.google.android.gms.internal.ads.y94 r5 = new com.google.android.gms.internal.ads.y94
            r5.<init>(r6, r7, r8)
        L_0x0182:
            r0.f42359R0 = r5
            boolean r3 = r0.f42358Q0
            android.media.MediaFormat r4 = new android.media.MediaFormat
            r4.<init>()
            java.lang.String r6 = "mime"
            r7 = r16
            r4.setString(r6, r7)
            int r6 = r2.f40624q
            java.lang.String r7 = "width"
            r4.setInteger(r7, r6)
            int r6 = r2.f40625r
            java.lang.String r7 = "height"
            r4.setInteger(r7, r6)
            java.util.List<byte[]> r6 = r2.f40621n
            com.google.android.gms.internal.ads.he2.m32864b(r4, r6)
            float r6 = r2.f40626s
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            java.lang.String r8 = "frame-rate"
            r4.setFloat(r8, r6)
        L_0x01b2:
            int r6 = r2.f40627t
            java.lang.String r8 = "rotation-degrees"
            com.google.android.gms.internal.ads.he2.m32863a(r4, r8, r6)
            com.google.android.gms.internal.ads.z04 r6 = r2.f40631x
            if (r6 == 0) goto L_0x01df
            int r8 = r6.f21033c
            java.lang.String r9 = "color-transfer"
            com.google.android.gms.internal.ads.he2.m32863a(r4, r9, r8)
            int r8 = r6.f21031a
            java.lang.String r9 = "color-standard"
            com.google.android.gms.internal.ads.he2.m32863a(r4, r9, r8)
            int r8 = r6.f21032b
            java.lang.String r9 = "color-range"
            com.google.android.gms.internal.ads.he2.m32863a(r4, r9, r8)
            byte[] r6 = r6.f21034d
            if (r6 == 0) goto L_0x01df
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r8 = "hdr-static-info"
            r4.setByteBuffer(r8, r6)
        L_0x01df:
            java.lang.String r6 = r2.f40619l
            java.lang.String r8 = "video/dolby-vision"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01fc
            android.util.Pair r6 = com.google.android.gms.internal.ads.a44.m30226b(r24)
            if (r6 == 0) goto L_0x01fc
            java.lang.Object r6 = r6.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r8 = "profile"
            com.google.android.gms.internal.ads.he2.m32863a(r4, r8, r6)
        L_0x01fc:
            int r6 = r5.f41756a
            java.lang.String r8 = "max-width"
            r4.setInteger(r8, r6)
            int r6 = r5.f41757b
            java.lang.String r8 = "max-height"
            r4.setInteger(r8, r6)
            int r5 = r5.f41758c
            java.lang.String r6 = "max-input-size"
            com.google.android.gms.internal.ads.he2.m32863a(r4, r6, r5)
            int r5 = com.google.android.gms.internal.ads.d13.f20195a
            r6 = 23
            if (r5 < r6) goto L_0x0228
            java.lang.String r5 = "priority"
            r6 = 0
            r4.setInteger(r5, r6)
            r5 = r26
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0228
            java.lang.String r6 = "operating-rate"
            r4.setFloat(r6, r5)
        L_0x0228:
            if (r3 == 0) goto L_0x0236
            java.lang.String r3 = "no-post-process"
            r5 = 1
            r4.setInteger(r3, r5)
            java.lang.String r3 = "auto-frc"
            r5 = 0
            r4.setInteger(r3, r5)
        L_0x0236:
            android.view.Surface r3 = r0.f42362U0
            if (r3 != 0) goto L_0x0259
            boolean r3 = r22.m40208B0(r23)
            if (r3 == 0) goto L_0x0253
            com.google.android.gms.internal.ads.zzuq r3 = r0.f42363V0
            if (r3 != 0) goto L_0x024e
            android.content.Context r3 = r0.f42355N0
            boolean r5 = r1.f33745f
            com.google.android.gms.internal.ads.zzuq r3 = com.google.android.gms.internal.ads.zzuq.m40664a(r3, r5)
            r0.f42363V0 = r3
        L_0x024e:
            com.google.android.gms.internal.ads.zzuq r3 = r0.f42363V0
            r0.f42362U0 = r3
            goto L_0x0259
        L_0x0253:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0259:
            android.view.Surface r3 = r0.f42362U0
            r5 = 0
            com.google.android.gms.internal.ads.f34 r1 = com.google.android.gms.internal.ads.f34.m32023b(r1, r4, r2, r3, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z94.mo33249J(com.google.android.gms.internal.ads.j34, com.google.android.gms.internal.ads.w, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.f34");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final List<j34> mo33250K(n34 n34, C8281w wVar, boolean z) throws u34 {
        return m40212w0(n34, wVar, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final void mo33251L(Exception exc) {
        fc2.m20475a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f42357P0.mo34899s(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo33252M(String str, long j, long j2) {
        this.f42357P0.mo34881a(str, j, j2);
        this.f42360S0 = m40209H0(str);
        j34 e0 = mo33264e0();
        Objects.requireNonNull(e0);
        boolean z = false;
        if (d13.f20195a >= 29 && MimeTypes.VIDEO_VP9.equals(e0.f33741b)) {
            MediaCodecInfo.CodecProfileLevel[] g = e0.mo32827g();
            int length = g.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (g[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f42361T0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void mo33253N(String str) {
        this.f42357P0.mo34882b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo33254O(C8281w wVar, MediaFormat mediaFormat) {
        int i;
        int i2;
        h34 c0 = mo33262c0();
        if (c0 != null) {
            c0.mo31103d(this.f42365X0);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f42379l1 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f42380m1 = i2;
        float f = wVar.f40628u;
        this.f42382o1 = f;
        if (d13.f20195a >= 21) {
            int i3 = wVar.f40627t;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f42379l1;
                this.f42379l1 = i2;
                this.f42380m1 = i4;
                this.f42382o1 = 1.0f / f;
            }
        } else {
            this.f42381n1 = wVar.f40627t;
        }
        this.f42356O0.mo32586e(wVar.f40626s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo33255V() {
        this.f42366Y0 = false;
        int i = d13.f20195a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo33256W(s51 s51) throws vk3 {
        this.f42374g1++;
        int i = d13.f20195a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final boolean mo33258Y(long j, long j2, h34 h34, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C8281w wVar) throws vk3 {
        boolean z3;
        int s;
        long j4 = j;
        h34 h342 = h34;
        int i4 = i;
        long j5 = j3;
        Objects.requireNonNull(h34);
        if (this.f42369b1 == C6540C.TIME_UNSET) {
            this.f42369b1 = j4;
        }
        if (j5 != this.f42375h1) {
            this.f42356O0.mo32587f(j5);
            this.f42375h1 = j5;
        }
        long b0 = mo33261b0();
        long j6 = j5 - b0;
        if (!z || z2) {
            float a0 = mo33260a0();
            int l = mo32481l();
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            double d = (double) (j5 - j4);
            double d2 = (double) a0;
            Double.isNaN(d);
            Double.isNaN(d2);
            long j7 = (long) (d / d2);
            if (l == 2) {
                j7 -= elapsedRealtime - j2;
            }
            if (this.f42362U0 != this.f42363V0) {
                long j8 = elapsedRealtime - this.f42376i1;
                boolean z4 = this.f42368a1 ? !this.f42366Y0 : !(l != 2 && !this.f42367Z0);
                if (this.f42370c1 == C6540C.TIME_UNSET && j4 >= b0 && (z4 || (l == 2 && m40207A0(j7) && j8 > 100000))) {
                    long nanoTime = System.nanoTime();
                    if (d13.f20195a >= 21) {
                        mo36023D0(h34, i, j6, nanoTime);
                    } else {
                        mo36022C0(h342, i4, j6);
                    }
                    mo36026G0(j7);
                    return true;
                } else if (l != 2 || j4 == this.f42369b1) {
                    return false;
                } else {
                    long nanoTime2 = System.nanoTime();
                    long a = this.f42356O0.mo32583a((j7 * 1000) + nanoTime2);
                    long j9 = (a - nanoTime2) / 1000;
                    long j10 = this.f42370c1;
                    if (j9 < -500000 && !z2 && (s = mo33303s(j)) != 0) {
                        mc3 mc3 = this.f34832G0;
                        mc3.f35492i++;
                        int i5 = this.f42374g1 + s;
                        if (j10 != C6540C.TIME_UNSET) {
                            mc3.f35489f += i5;
                        } else {
                            mo36025F0(i5);
                        }
                        mo33271l0();
                        return false;
                    } else if (m40207A0(j9) && !z2) {
                        if (j10 != C6540C.TIME_UNSET) {
                            mo36024E0(h342, i4, j6);
                            z3 = true;
                        } else {
                            bz2.m30876a("dropVideoBuffer");
                            h342.mo31104e(i4, false);
                            bz2.m30877b();
                            z3 = true;
                            mo36025F0(1);
                        }
                        mo36026G0(j9);
                        return z3;
                    } else if (d13.f20195a >= 21) {
                        if (j9 >= 50000) {
                            return false;
                        }
                        mo36023D0(h34, i, j6, a);
                        mo36026G0(j9);
                        return true;
                    } else if (j9 >= 30000) {
                        return false;
                    } else {
                        if (j9 > 11000) {
                            try {
                                Thread.sleep((-10000 + j9) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        mo36022C0(h342, i4, j6);
                        mo36026G0(j9);
                        return true;
                    }
                }
            } else if (!m40207A0(j7)) {
                return false;
            } else {
                mo36024E0(h342, i4, j6);
                mo36026G0(j7);
                return true;
            }
        } else {
            mo36024E0(h342, i4, j6);
            return true;
        }
    }

    /* renamed from: c */
    public final void mo32474c(float f, float f2) throws vk3 {
        super.mo32474c(f, f2);
        this.f42356O0.mo32588g(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public final i34 mo33263d0(Throwable th, j34 j34) {
        return new x94(th, j34, this.f42362U0);
    }

    /* access modifiers changed from: protected */
    @TargetApi(29)
    /* renamed from: f0 */
    public final void mo33265f0(s51 s51) throws vk3 {
        if (this.f42361T0) {
            ByteBuffer byteBuffer = s51.f20813f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    h34 c0 = mo33262c0();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    c0.mo31107i(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public final void mo33267h0(long j) {
        super.mo33267h0(j);
        this.f42374g1--;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31428j(int r6, java.lang.Object r7) throws com.google.android.gms.internal.ads.vk3 {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r0) goto L_0x0044
            r0 = 7
            if (r6 == r0) goto L_0x003f
            r0 = 10
            if (r6 == r0) goto L_0x0032
            r0 = 4
            if (r6 == r0) goto L_0x001e
            r0 = 5
            if (r6 == r0) goto L_0x0012
            goto L_0x00cc
        L_0x0012:
            com.google.android.gms.internal.ads.ia4 r6 = r5.f42356O0
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.mo32593l(r7)
            return
        L_0x001e:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.f42365X0 = r6
            com.google.android.gms.internal.ads.h34 r6 = r5.mo33262c0()
            if (r6 == 0) goto L_0x00cc
            int r7 = r5.f42365X0
            r6.mo31103d(r7)
            return
        L_0x0032:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r7 = r5.f42384q1
            if (r7 == r6) goto L_0x00cc
            r5.f42384q1 = r6
            return
        L_0x003f:
            com.google.android.gms.internal.ads.aa4 r7 = (com.google.android.gms.internal.ads.aa4) r7
            r5.f42385r1 = r7
            return
        L_0x0044:
            boolean r6 = r7 instanceof android.view.Surface
            r0 = 0
            if (r6 == 0) goto L_0x004c
            android.view.Surface r7 = (android.view.Surface) r7
            goto L_0x004d
        L_0x004c:
            r7 = r0
        L_0x004d:
            if (r7 != 0) goto L_0x006b
            com.google.android.gms.internal.ads.zzuq r6 = r5.f42363V0
            if (r6 == 0) goto L_0x0055
            r7 = r6
            goto L_0x006b
        L_0x0055:
            com.google.android.gms.internal.ads.j34 r6 = r5.mo33264e0()
            if (r6 == 0) goto L_0x006b
            boolean r1 = r5.m40208B0(r6)
            if (r1 == 0) goto L_0x006b
            android.content.Context r7 = r5.f42355N0
            boolean r6 = r6.f33745f
            com.google.android.gms.internal.ads.zzuq r7 = com.google.android.gms.internal.ads.zzuq.m40664a(r7, r6)
            r5.f42363V0 = r7
        L_0x006b:
            android.view.Surface r6 = r5.f42362U0
            if (r6 == r7) goto L_0x00b8
            r5.f42362U0 = r7
            com.google.android.gms.internal.ads.ia4 r6 = r5.f42356O0
            r6.mo32592k(r7)
            r6 = 0
            r5.f42364W0 = r6
            int r1 = r5.mo32481l()
            com.google.android.gms.internal.ads.h34 r2 = r5.mo33262c0()
            if (r2 == 0) goto L_0x0099
            int r3 = com.google.android.gms.internal.ads.d13.f20195a
            r4 = 23
            if (r3 < r4) goto L_0x0093
            if (r7 == 0) goto L_0x0093
            boolean r3 = r5.f42360S0
            if (r3 != 0) goto L_0x0093
            r2.mo31101b(r7)
            goto L_0x0099
        L_0x0093:
            r5.mo33268i0()
            r5.mo33266g0()
        L_0x0099:
            if (r7 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.zzuq r2 = r5.f42363V0
            if (r7 == r2) goto L_0x00b1
            r5.m40214y0()
            r5.f42366Y0 = r6
            int r6 = com.google.android.gms.internal.ads.d13.f20195a
            r6 = 2
            if (r1 != r6) goto L_0x00cc
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f42370c1 = r6
            return
        L_0x00b1:
            r5.f42383p1 = r0
            r5.f42366Y0 = r6
            int r6 = com.google.android.gms.internal.ads.d13.f20195a
            return
        L_0x00b8:
            if (r7 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.zzuq r6 = r5.f42363V0
            if (r7 == r6) goto L_0x00cc
            r5.m40214y0()
            boolean r6 = r5.f42364W0
            if (r6 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.ta4 r6 = r5.f42357P0
            android.view.Surface r7 = r5.f42362U0
            r6.mo34897q(r7)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z94.mo31428j(int, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final void mo33269j0() {
        super.mo33269j0();
        this.f42374g1 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final boolean mo33273n0(j34 j34) {
        return this.f42362U0 != null || m40208B0(j34);
    }

    /* renamed from: u */
    public final boolean mo32483u() {
        zzuq zzuq;
        if (super.mo32483u() && (this.f42366Y0 || (((zzuq = this.f42363V0) != null && this.f42362U0 == zzuq) || mo33262c0() == null))) {
            this.f42370c1 = C6540C.TIME_UNSET;
            return true;
        } else if (this.f42370c1 == C6540C.TIME_UNSET) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f42370c1) {
                return true;
            }
            this.f42370c1 = C6540C.TIME_UNSET;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo33274w() {
        this.f42383p1 = null;
        this.f42366Y0 = false;
        int i = d13.f20195a;
        this.f42364W0 = false;
        this.f42356O0.mo32584c();
        try {
            super.mo33274w();
        } finally {
            this.f42357P0.mo34883c(this.f34832G0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo33275x(boolean z, boolean z2) throws vk3 {
        super.mo33275x(z, z2);
        mo33305v();
        this.f42357P0.mo34885e(this.f34832G0);
        this.f42356O0.mo32585d();
        this.f42367Z0 = z2;
        this.f42368a1 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo33276y(long j, boolean z) throws vk3 {
        super.mo33276y(j, z);
        this.f42366Y0 = false;
        int i = d13.f20195a;
        this.f42356O0.mo32589h();
        this.f42375h1 = C6540C.TIME_UNSET;
        this.f42369b1 = C6540C.TIME_UNSET;
        this.f42373f1 = 0;
        this.f42370c1 = C6540C.TIME_UNSET;
    }

    /* access modifiers changed from: protected */
    @TargetApi(17)
    /* renamed from: z */
    public final void mo33277z() {
        try {
            super.mo33277z();
            if (this.f42363V0 != null) {
                m40215z0();
            }
        } catch (Throwable th) {
            if (this.f42363V0 != null) {
                m40215z0();
            }
            throw th;
        }
    }

    public final String zzJ() {
        return "MediaCodecVideoRenderer";
    }
}
