package com.google.ads.interactivemedia.p038v3.internal;

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
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amz */
/* compiled from: IMASDK */
public final class amz extends C4488xv {

    /* renamed from: c */
    private static final int[] f15354c = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: d */
    private static boolean f15355d;

    /* renamed from: e */
    private static boolean f15356e;

    /* renamed from: A */
    private long f15357A;

    /* renamed from: B */
    private long f15358B;

    /* renamed from: C */
    private int f15359C;

    /* renamed from: D */
    private int f15360D = -1;

    /* renamed from: E */
    private int f15361E = -1;

    /* renamed from: F */
    private int f15362F;

    /* renamed from: G */
    private float f15363G = -1.0f;

    /* renamed from: H */
    private int f15364H;

    /* renamed from: I */
    private int f15365I;

    /* renamed from: J */
    private int f15366J;

    /* renamed from: K */
    private float f15367K;

    /* renamed from: L */
    private boolean f15368L;

    /* renamed from: M */
    private int f15369M = 0;

    /* renamed from: N */
    private ana f15370N;

    /* renamed from: b */
    amy f15371b;

    /* renamed from: f */
    private final Context f15372f;

    /* renamed from: g */
    private final and f15373g;

    /* renamed from: h */
    private final ann f15374h;

    /* renamed from: i */
    private final boolean f15375i = "NVIDIA".equals(amm.f15300c);

    /* renamed from: j */
    private amx f15376j;

    /* renamed from: k */
    private boolean f15377k;

    /* renamed from: l */
    private boolean f15378l;

    /* renamed from: m */
    private Surface f15379m;

    /* renamed from: n */
    private Surface f15380n;

    /* renamed from: o */
    private boolean f15381o;

    /* renamed from: p */
    private int f15382p = 1;

    /* renamed from: q */
    private boolean f15383q;

    /* renamed from: r */
    private boolean f15384r;

    /* renamed from: s */
    private boolean f15385s;

    /* renamed from: t */
    private long f15386t;

    /* renamed from: u */
    private long f15387u = C6540C.TIME_UNSET;

    /* renamed from: v */
    private long f15388v;

    /* renamed from: w */
    private int f15389w;

    /* renamed from: x */
    private int f15390x;

    /* renamed from: y */
    private int f15391y;

    /* renamed from: z */
    private long f15392z;

    public amz(Context context, C4483xq xqVar, C4490xx xxVar, Handler handler, ano ano) {
        super(2, xqVar, xxVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f15372f = applicationContext;
        this.f15373g = new and(applicationContext);
        this.f15374h = new ann(handler, ano);
        m14290aN();
    }

    /* renamed from: aB */
    protected static int m14281aB(C4486xt xtVar, C4120ke keVar) {
        if (keVar.f17682m == -1) {
            return m14295aS(xtVar, keVar.f17681l, keVar.f17686q, keVar.f17687r);
        }
        int size = keVar.f17683n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += keVar.f17683n.get(i2).length;
        }
        return keVar.f17682m + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0351, code lost:
        if (r1.equals("602LV") != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x074d, code lost:
        if (r7 != 2) goto L_0x074f;
     */
    /* renamed from: aE */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean m14284aE(java.lang.String r13) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r13 = r13.startsWith(r0)
            r0 = 0
            if (r13 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.amz> r13 = com.google.ads.interactivemedia.p038v3.internal.amz.class
            monitor-enter(r13)
            boolean r1 = f15355d     // Catch:{ all -> 0x0757 }
            if (r1 != 0) goto L_0x0753
            int r1 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a     // Catch:{ all -> 0x0757 }
            r2 = 4
            r3 = 5
            r4 = 3
            r5 = 6
            r6 = 28
            r7 = -1
            r8 = 2
            r9 = 1
            if (r1 > r6) goto L_0x0076
            java.lang.String r10 = com.google.ads.interactivemedia.p038v3.internal.amm.f15299b     // Catch:{ all -> 0x0757 }
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
            java.lang.String r12 = com.google.ads.interactivemedia.p038v3.internal.amm.f15299b     // Catch:{ all -> 0x0757 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0757 }
            if (r11 == 0) goto L_0x0085
            goto L_0x0073
        L_0x0085:
            r11 = 26
            if (r1 > r11) goto L_0x074f
            java.lang.String r1 = com.google.ads.interactivemedia.p038v3.internal.amm.f15299b     // Catch:{ all -> 0x0757 }
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
            java.lang.String r1 = com.google.ads.interactivemedia.p038v3.internal.amm.f15301d     // Catch:{ all -> 0x0757 }
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
            f15356e = r0     // Catch:{ all -> 0x0757 }
            f15355d = r9     // Catch:{ all -> 0x0757 }
        L_0x0753:
            monitor-exit(r13)     // Catch:{ all -> 0x0757 }
            boolean r13 = f15356e
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.amz.m14284aE(java.lang.String):boolean");
    }

    /* renamed from: aI */
    private static List<C4486xt> m14285aI(C4490xx xxVar, C4120ke keVar, boolean z, boolean z2) throws C4496yc {
        Pair<Integer, Integer> e;
        String str = keVar.f17681l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<C4486xt> c = C4501yh.m19578c(xxVar.mo16797a(str, z, z2), keVar);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str) && (e = C4501yh.m19580e(keVar)) != null) {
            int intValue = ((Integer) e.first).intValue();
            if (intValue == 16 || intValue == 256) {
                c.addAll(xxVar.mo16797a(MimeTypes.VIDEO_H265, z, z2));
            } else if (intValue == 512) {
                c.addAll(xxVar.mo16797a(MimeTypes.VIDEO_H264, z, z2));
            }
        }
        return Collections.unmodifiableList(c);
    }

    /* renamed from: aJ */
    private final void m14286aJ(long j, long j2, C4120ke keVar) {
        ana ana = this.f15370N;
        if (ana != null) {
            ana.mo14066a();
        }
    }

    /* renamed from: aK */
    private final boolean m14287aK(C4486xt xtVar) {
        if (amm.f15298a < 23 || this.f15368L || m14284aE(xtVar.f19587a) || (xtVar.f19592f && !ams.m14262a(this.f15372f))) {
            return false;
        }
        return true;
    }

    /* renamed from: aL */
    private final void m14288aL() {
        this.f15387u = SystemClock.elapsedRealtime() + DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    }

    /* renamed from: aM */
    private final void m14289aM() {
        C4504yk ay;
        this.f15383q = false;
        if (amm.f15298a >= 23 && this.f15368L && (ay = mo16795ay()) != null) {
            this.f15371b = new amy(this, ay);
        }
    }

    /* renamed from: aN */
    private final void m14290aN() {
        this.f15364H = -1;
        this.f15365I = -1;
        this.f15367K = -1.0f;
        this.f15366J = -1;
    }

    /* renamed from: aO */
    private final void m14291aO() {
        int i = this.f15360D;
        if (i != -1 || this.f15361E != -1) {
            if (this.f15364H != i || this.f15365I != this.f15361E || this.f15366J != this.f15362F || this.f15367K != this.f15363G) {
                this.f15374h.mo14102f(i, this.f15361E, this.f15362F, this.f15363G);
                this.f15364H = this.f15360D;
                this.f15365I = this.f15361E;
                this.f15366J = this.f15362F;
                this.f15367K = this.f15363G;
            }
        }
    }

    /* renamed from: aP */
    private final void m14292aP() {
        int i = this.f15364H;
        if (i != -1 || this.f15365I != -1) {
            this.f15374h.mo14102f(i, this.f15365I, this.f15366J, this.f15367K);
        }
    }

    /* renamed from: aQ */
    private final void m14293aQ() {
        if (this.f15389w > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f15374h.mo14100d(this.f15389w, elapsedRealtime - this.f15388v);
            this.f15389w = 0;
            this.f15388v = elapsedRealtime;
        }
    }

    /* renamed from: aR */
    private static boolean m14294aR(long j) {
        return j < -30000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: aS */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14295aS(com.google.ads.interactivemedia.p038v3.internal.C4486xt r7, java.lang.String r8, int r9, int r10) {
        /*
            r0 = -1
            if (r9 == r0) goto L_0x00a1
            if (r10 != r0) goto L_0x0007
            goto L_0x00a1
        L_0x0007:
            int r1 = r8.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 0
            goto L_0x0051
        L_0x0050:
            r8 = -1
        L_0x0051:
            if (r8 == 0) goto L_0x0099
            if (r8 == r3) goto L_0x0099
            if (r8 == r6) goto L_0x0061
            if (r8 == r5) goto L_0x0099
            if (r8 == r4) goto L_0x005e
            if (r8 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r9 = r9 * r10
            goto L_0x009c
        L_0x0061:
            java.lang.String r8 = com.google.ads.interactivemedia.p038v3.internal.amm.f15301d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0098
            java.lang.String r1 = com.google.ads.interactivemedia.p038v3.internal.amm.f15300c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0098
            java.lang.String r1 = "AFTS"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0089
            boolean r7 = r7.f19592f
            if (r7 != 0) goto L_0x0098
        L_0x0089:
            r7 = 16
            int r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14189F(r9, r7)
            int r7 = com.google.ads.interactivemedia.p038v3.internal.amm.m14189F(r10, r7)
            int r8 = r8 * r7
            int r9 = r8 * 256
            goto L_0x009b
        L_0x0098:
            return r0
        L_0x0099:
            int r9 = r9 * r10
        L_0x009b:
            r4 = 2
        L_0x009c:
            int r9 = r9 * 3
            int r4 = r4 + r4
            int r9 = r9 / r4
            return r9
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.amz.m14295aS(com.google.ads.interactivemedia.v3.internal.xt, java.lang.String, int, int):int");
    }

    /* renamed from: I */
    public final void mo14027I(float f, float f2) throws C4089ja {
        super.mo14027I(f, f2);
        this.f15373g.mo14080e(f);
    }

    /* renamed from: K */
    public final String mo13720K() {
        return "MediaCodecVideoRenderer";
    }

    /* renamed from: M */
    public final boolean mo13722M() {
        Surface surface;
        if (super.mo13722M() && (this.f15383q || (((surface = this.f15380n) != null && this.f15379m == surface) || mo16795ay() == null || this.f15368L))) {
            this.f15387u = C6540C.TIME_UNSET;
            return true;
        } else if (this.f15387u == C6540C.TIME_UNSET) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f15387u) {
                return true;
            }
            this.f15387u = C6540C.TIME_UNSET;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final int mo14028P(C4490xx xxVar, C4120ke keVar) throws C4496yc {
        int i = 0;
        if (!aln.m14032b(keVar.f17681l)) {
            return avr.m14971m(0);
        }
        boolean z = keVar.f17684o != null;
        List<C4486xt> aI = m14285aI(xxVar, keVar, z, false);
        if (z && aI.isEmpty()) {
            aI = m14285aI(xxVar, keVar, false, false);
        }
        if (aI.isEmpty()) {
            return avr.m14971m(1);
        }
        if (!C4488xv.m19506ax(keVar)) {
            return avr.m14971m(2);
        }
        C4486xt xtVar = aI.get(0);
        boolean b = xtVar.mo16779b(keVar);
        int i2 = true != xtVar.mo16780c(keVar) ? 8 : 16;
        if (b) {
            List<C4486xt> aI2 = m14285aI(xxVar, keVar, z, true);
            if (!aI2.isEmpty()) {
                C4486xt xtVar2 = aI2.get(0);
                if (xtVar2.mo16779b(keVar) && xtVar2.mo16780c(keVar)) {
                    i = 32;
                }
            }
        }
        return (true != b ? 3 : 4) | i2 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final List<C4486xt> mo14029Q(C4490xx xxVar, C4120ke keVar, boolean z) throws C4496yc {
        return m14285aI(xxVar, keVar, z, this.f15368L);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final C4270pt mo14030S(C4486xt xtVar, C4120ke keVar, C4120ke keVar2) {
        int i;
        int i2;
        C4270pt d = xtVar.mo16781d(keVar, keVar2);
        int i3 = d.f18406e;
        int i4 = keVar2.f17686q;
        amx amx = this.f15376j;
        if (i4 > amx.f15349a || keVar2.f17687r > amx.f15350b) {
            i3 |= 256;
        }
        if (m14281aB(xtVar, keVar2) > this.f15376j.f15351c) {
            i3 |= 64;
        }
        String str = xtVar.f19587a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = d.f18405d;
            i = 0;
        }
        return new C4270pt(str, keVar, keVar2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo14031T(String str, long j, long j2) {
        this.f15374h.mo14098b(str, j, j2);
        this.f15377k = m14284aE(str);
        C4486xt am = mo16788am();
        aup.m14890u(am);
        boolean z = false;
        if (amm.f15298a >= 29 && MimeTypes.VIDEO_VP9.equals(am.f19588b)) {
            MediaCodecInfo.CodecProfileLevel[] a = am.mo16778a();
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (a[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f15378l = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo14032U(String str) {
        this.f15374h.mo14104h(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo14033V(Exception exc) {
        ali.m14023b("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f15374h.mo14106j(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final C4270pt mo14034W(C4121kf kfVar) throws C4089ja {
        C4270pt W = super.mo14034W(kfVar);
        this.f15374h.mo14099c(kfVar.f17697b, W);
        return W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo14035X(C4120ke keVar, MediaFormat mediaFormat) {
        int i;
        int i2;
        C4504yk ay = mo16795ay();
        if (ay != null) {
            ay.mo16825n(this.f15382p);
        }
        if (this.f15368L) {
            this.f15360D = keVar.f17686q;
            this.f15361E = keVar.f17687r;
        } else {
            aup.m14890u(mediaFormat);
            boolean z = false;
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            }
            if (z) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.f15360D = i;
            if (z) {
                i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.f15361E = i2;
        }
        float f = keVar.f17690u;
        this.f15363G = f;
        if (amm.f15298a >= 21) {
            int i3 = keVar.f17689t;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f15360D;
                this.f15360D = this.f15361E;
                this.f15361E = i4;
                this.f15363G = 1.0f / f;
            }
        } else {
            this.f15362F = keVar.f17689t;
        }
        this.f15373g.mo14081f(keVar.f17688s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo14036Y(long j) throws C4089ja {
        mo16787al(j);
        m14291aO();
        this.f19625a.f18389e++;
        mo14038aA();
        mo14053at(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo14037Z(C4269ps psVar) throws C4089ja {
        boolean z = this.f15368L;
        if (!z) {
            this.f15391y++;
        }
        if (amm.f15298a < 23 && z) {
            mo14036Y(psVar.f18399d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aA */
    public final void mo14038aA() {
        this.f15385s = true;
        if (!this.f15383q) {
            this.f15383q = true;
            this.f15374h.mo14103g(this.f15379m);
            this.f15381o = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aF */
    public final void mo14039aF(C4504yk ykVar, int i) {
        m14291aO();
        age.m13544b("releaseOutputBuffer");
        ykVar.mo16818g(i, true);
        age.m13545c();
        this.f15357A = SystemClock.elapsedRealtime() * 1000;
        this.f19625a.f18389e++;
        this.f15390x = 0;
        mo14038aA();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aG */
    public final void mo14040aG(C4504yk ykVar, int i, long j) {
        m14291aO();
        age.m13544b("releaseOutputBuffer");
        ykVar.mo16819h(i, j);
        age.m13545c();
        this.f15357A = SystemClock.elapsedRealtime() * 1000;
        this.f19625a.f18389e++;
        this.f15390x = 0;
        mo14038aA();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aH */
    public final void mo14041aH(C4504yk ykVar, int i) {
        age.m13544b("skipVideoBuffer");
        ykVar.mo16818g(i, false);
        age.m13545c();
        this.f19625a.f18390f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo14042aa() {
        m14289aM();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo14043ac(int i) {
        C4266pp ppVar = this.f19625a;
        ppVar.f18391g += i;
        this.f15389w += i;
        int i2 = this.f15390x + i;
        this.f15390x = i2;
        ppVar.f18392h = Math.max(i2, ppVar.f18392h);
        if (this.f15389w >= 50) {
            m14293aQ();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public final void mo14044ad(long j) {
        C4266pp ppVar = this.f19625a;
        ppVar.f18394j += j;
        ppVar.f18395k++;
        this.f15358B += j;
        this.f15359C++;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        r21 = r10;
        r22 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024e  */
    /* renamed from: ae */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14045ae(com.google.ads.interactivemedia.p038v3.internal.C4486xt r24, com.google.ads.interactivemedia.p038v3.internal.C4504yk r25, com.google.ads.interactivemedia.p038v3.internal.C4120ke r26, android.media.MediaCrypto r27, float r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r28
            java.lang.String r5 = r1.f19589c
            com.google.ads.interactivemedia.v3.internal.ke[] r6 = r23.mo15938B()
            int r7 = r3.f17686q
            int r8 = r3.f17687r
            int r9 = m14281aB(r1, r3)
            int r10 = r6.length
            r11 = -1
            r13 = 1
            if (r10 != r13) goto L_0x003e
            if (r9 == r11) goto L_0x0035
            java.lang.String r6 = r3.f17681l
            int r10 = r3.f17686q
            int r14 = r3.f17687r
            int r6 = m14295aS(r1, r6, r10, r14)
            if (r6 == r11) goto L_0x0035
            float r9 = (float) r9
            r10 = 1069547520(0x3fc00000, float:1.5)
            float r9 = r9 * r10
            int r9 = (int) r9
            int r9 = java.lang.Math.min(r9, r6)
        L_0x0035:
            com.google.ads.interactivemedia.v3.internal.amx r6 = new com.google.ads.interactivemedia.v3.internal.amx
            r6.<init>(r7, r8, r9)
            r16 = r5
            goto L_0x0180
        L_0x003e:
            r14 = 0
            r15 = 0
        L_0x0040:
            if (r14 >= r10) goto L_0x0090
            r13 = r6[r14]
            com.google.ads.interactivemedia.v3.internal.amp r12 = r3.f17693x
            if (r12 == 0) goto L_0x0059
            com.google.ads.interactivemedia.v3.internal.amp r12 = r13.f17693x
            if (r12 != 0) goto L_0x0059
            com.google.ads.interactivemedia.v3.internal.kd r12 = r13.mo16126a()
            com.google.ads.interactivemedia.v3.internal.amp r13 = r3.f17693x
            r12.mo16098J(r13)
            com.google.ads.interactivemedia.v3.internal.ke r13 = r12.mo16115a()
        L_0x0059:
            com.google.ads.interactivemedia.v3.internal.pt r12 = r1.mo16781d(r3, r13)
            int r12 = r12.f18405d
            if (r12 == 0) goto L_0x0088
            int r12 = r13.f17686q
            if (r12 == r11) goto L_0x006e
            r16 = r6
            int r6 = r13.f17687r
            if (r6 != r11) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            r6 = 0
            goto L_0x0071
        L_0x006e:
            r16 = r6
        L_0x0070:
            r6 = 1
        L_0x0071:
            r15 = r15 | r6
            int r6 = java.lang.Math.max(r7, r12)
            int r7 = r13.f17687r
            int r7 = java.lang.Math.max(r8, r7)
            int r8 = m14281aB(r1, r13)
            int r8 = java.lang.Math.max(r9, r8)
            r9 = r8
            r8 = r7
            r7 = r6
            goto L_0x008a
        L_0x0088:
            r16 = r6
        L_0x008a:
            int r14 = r14 + 1
            r6 = r16
            r13 = 1
            goto L_0x0040
        L_0x0090:
            if (r15 == 0) goto L_0x0179
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r10 = 66
            r6.<init>(r10)
            java.lang.String r10 = "Resolutions unknown. Codec max resolution: "
            r6.append(r10)
            r6.append(r7)
            java.lang.String r10 = "x"
            r6.append(r10)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r11 = "MediaCodecVideoRenderer"
            android.util.Log.w(r11, r6)
            int r6 = r3.f17687r
            int r12 = r3.f17686q
            if (r6 <= r12) goto L_0x00ba
            r13 = r6
            goto L_0x00bb
        L_0x00ba:
            r13 = r12
        L_0x00bb:
            if (r6 > r12) goto L_0x00bf
            r14 = r6
            goto L_0x00c0
        L_0x00bf:
            r14 = r12
        L_0x00c0:
            float r15 = (float) r14
            float r2 = (float) r13
            float r15 = r15 / r2
            int[] r2 = f15354c
            r16 = r5
            r4 = 0
        L_0x00c8:
            r5 = 9
            r17 = 0
            if (r4 >= r5) goto L_0x013a
            r5 = r2[r4]
            r18 = r2
            float r2 = (float) r5
            float r2 = r2 * r15
            int r2 = (int) r2
            if (r5 <= r13) goto L_0x013a
            if (r2 > r14) goto L_0x00dc
            goto L_0x013a
        L_0x00dc:
            r19 = r13
            int r13 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            r20 = r14
            r14 = 21
            if (r13 < r14) goto L_0x0104
            if (r6 > r12) goto L_0x00ea
            r13 = r5
            goto L_0x00eb
        L_0x00ea:
            r13 = r2
        L_0x00eb:
            if (r6 > r12) goto L_0x00ee
            r5 = r2
        L_0x00ee:
            android.graphics.Point r2 = r1.mo16783f(r13, r5)
            float r5 = r3.f17688s
            int r13 = r2.x
            int r14 = r2.y
            r21 = r10
            r22 = r11
            double r10 = (double) r5
            boolean r5 = r1.mo16782e(r13, r14, r10)
            if (r5 == 0) goto L_0x012d
            goto L_0x0140
        L_0x0104:
            r21 = r10
            r22 = r11
            r10 = 16
            int r5 = com.google.ads.interactivemedia.p038v3.internal.amm.m14189F(r5, r10)     // Catch:{ yc -> 0x013e }
            int r5 = r5 * 16
            int r2 = com.google.ads.interactivemedia.p038v3.internal.amm.m14189F(r2, r10)     // Catch:{ yc -> 0x013e }
            int r2 = r2 * 16
            int r10 = r5 * r2
            int r11 = com.google.ads.interactivemedia.p038v3.internal.C4501yh.m19579d()     // Catch:{ yc -> 0x013e }
            if (r10 > r11) goto L_0x012d
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ yc -> 0x013e }
            if (r6 > r12) goto L_0x0124
            r10 = r5
            goto L_0x0125
        L_0x0124:
            r10 = r2
        L_0x0125:
            if (r6 > r12) goto L_0x0128
            r5 = r2
        L_0x0128:
            r4.<init>(r10, r5)     // Catch:{ yc -> 0x013e }
            r2 = r4
            goto L_0x0140
        L_0x012d:
            int r4 = r4 + 1
            r2 = r18
            r13 = r19
            r14 = r20
            r10 = r21
            r11 = r22
            goto L_0x00c8
        L_0x013a:
            r21 = r10
            r22 = r11
        L_0x013e:
            r2 = r17
        L_0x0140:
            if (r2 == 0) goto L_0x017b
            int r4 = r2.x
            int r7 = java.lang.Math.max(r7, r4)
            int r2 = r2.y
            int r8 = java.lang.Math.max(r8, r2)
            java.lang.String r2 = r3.f17681l
            int r2 = m14295aS(r1, r2, r7, r8)
            int r9 = java.lang.Math.max(r9, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 57
            r2.<init>(r4)
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r2.append(r4)
            r2.append(r7)
            r4 = r21
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r4 = r22
            android.util.Log.w(r4, r2)
            goto L_0x017b
        L_0x0179:
            r16 = r5
        L_0x017b:
            com.google.ads.interactivemedia.v3.internal.amx r6 = new com.google.ads.interactivemedia.v3.internal.amx
            r6.<init>(r7, r8, r9)
        L_0x0180:
            r0.f15376j = r6
            boolean r2 = r0.f15375i
            boolean r4 = r0.f15368L
            if (r4 == 0) goto L_0x018b
            int r4 = r0.f15369M
            goto L_0x018c
        L_0x018b:
            r4 = 0
        L_0x018c:
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r7 = "mime"
            r8 = r16
            r5.setString(r7, r8)
            int r7 = r3.f17686q
            java.lang.String r8 = "width"
            r5.setInteger(r8, r7)
            int r7 = r3.f17687r
            java.lang.String r8 = "height"
            r5.setInteger(r8, r7)
            java.util.List<byte[]> r7 = r3.f17683n
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19138g(r5, r7)
            float r7 = r3.f17688s
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x01b8
            java.lang.String r9 = "frame-rate"
            r5.setFloat(r9, r7)
        L_0x01b8:
            int r7 = r3.f17689t
            java.lang.String r9 = "rotation-degrees"
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19139h(r5, r9, r7)
            com.google.ads.interactivemedia.v3.internal.amp r7 = r3.f17693x
            if (r7 == 0) goto L_0x01e5
            int r9 = r7.f15320c
            java.lang.String r10 = "color-transfer"
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19139h(r5, r10, r9)
            int r9 = r7.f15318a
            java.lang.String r10 = "color-standard"
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19139h(r5, r10, r9)
            int r9 = r7.f15319b
            java.lang.String r10 = "color-range"
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19139h(r5, r10, r9)
            byte[] r7 = r7.f15321d
            if (r7 == 0) goto L_0x01e5
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            java.lang.String r9 = "hdr-static-info"
            r5.setByteBuffer(r9, r7)
        L_0x01e5:
            java.lang.String r7 = r3.f17681l
            java.lang.String r9 = "video/dolby-vision"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0202
            android.util.Pair r3 = com.google.ads.interactivemedia.p038v3.internal.C4501yh.m19580e(r26)
            if (r3 == 0) goto L_0x0202
            java.lang.Object r3 = r3.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r7 = "profile"
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19139h(r5, r7, r3)
        L_0x0202:
            int r3 = r6.f15349a
            java.lang.String r7 = "max-width"
            r5.setInteger(r7, r3)
            int r3 = r6.f15350b
            java.lang.String r7 = "max-height"
            r5.setInteger(r7, r3)
            int r3 = r6.f15351c
            java.lang.String r6 = "max-input-size"
            com.google.ads.interactivemedia.p038v3.internal.C4396uk.m19139h(r5, r6, r3)
            int r3 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            r6 = 23
            if (r3 < r6) goto L_0x022e
            java.lang.String r7 = "priority"
            r9 = 0
            r5.setInteger(r7, r9)
            r7 = r28
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x022e
            java.lang.String r8 = "operating-rate"
            r5.setFloat(r8, r7)
        L_0x022e:
            if (r2 == 0) goto L_0x023d
            java.lang.String r2 = "no-post-process"
            r7 = 1
            r5.setInteger(r2, r7)
            java.lang.String r2 = "auto-frc"
            r8 = 0
            r5.setInteger(r2, r8)
            goto L_0x023e
        L_0x023d:
            r7 = 1
        L_0x023e:
            if (r4 == 0) goto L_0x024a
            java.lang.String r2 = "tunneled-playback"
            r5.setFeatureEnabled(r2, r7)
            java.lang.String r2 = "audio-session-id"
            r5.setInteger(r2, r4)
        L_0x024a:
            android.view.Surface r2 = r0.f15379m
            if (r2 != 0) goto L_0x026d
            boolean r2 = r23.m14287aK(r24)
            if (r2 == 0) goto L_0x0267
            android.view.Surface r2 = r0.f15380n
            if (r2 != 0) goto L_0x0262
            android.content.Context r2 = r0.f15372f
            boolean r1 = r1.f19592f
            com.google.ads.interactivemedia.v3.internal.ams r1 = com.google.ads.interactivemedia.p038v3.internal.ams.m14263b(r2, r1)
            r0.f15380n = r1
        L_0x0262:
            android.view.Surface r1 = r0.f15380n
            r0.f15379m = r1
            goto L_0x026d
        L_0x0267:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x026d:
            android.view.Surface r1 = r0.f15379m
            r2 = r25
            r4 = r27
            r2.mo16826o(r5, r1, r4)
            if (r3 < r6) goto L_0x0283
            boolean r1 = r0.f15368L
            if (r1 == 0) goto L_0x0283
            com.google.ads.interactivemedia.v3.internal.amy r1 = new com.google.ads.interactivemedia.v3.internal.amy
            r1.<init>(r0, r2)
            r0.f15371b = r1
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.amz.mo14045ae(com.google.ads.interactivemedia.v3.internal.xt, com.google.ads.interactivemedia.v3.internal.yk, com.google.ads.interactivemedia.v3.internal.ke, android.media.MediaCrypto, float):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo14046af(long j, long j2, C4504yk ykVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C4120ke keVar) throws C4089ja {
        boolean z3;
        int G;
        long j4 = j;
        C4504yk ykVar2 = ykVar;
        int i4 = i;
        long j5 = j3;
        aup.m14890u(ykVar);
        if (this.f15386t == C6540C.TIME_UNSET) {
            this.f15386t = j4;
        }
        if (j5 != this.f15392z) {
            this.f15373g.mo14082g(j5);
            this.f15392z = j5;
        }
        long aw = mo16794aw();
        long j6 = j5 - aw;
        if (!z || z2) {
            float au = mo16792au();
            int e = mo15952e();
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            double d = (double) (j5 - j4);
            double d2 = (double) au;
            Double.isNaN(d);
            Double.isNaN(d2);
            long j7 = (long) (d / d2);
            if (e == 2) {
                j7 -= elapsedRealtime - j2;
            }
            if (this.f15379m != this.f15380n) {
                long j8 = elapsedRealtime - this.f15357A;
                boolean z4 = this.f15385s ? !this.f15383q : !(e != 2 && !this.f15384r);
                if (this.f15387u == C6540C.TIME_UNSET && j4 >= aw && (z4 || (e == 2 && m14294aR(j7) && j8 > 100000))) {
                    long nanoTime = System.nanoTime();
                    m14286aJ(j6, nanoTime, keVar);
                    if (amm.f15298a >= 21) {
                        mo14040aG(ykVar2, i4, nanoTime);
                    } else {
                        mo14039aF(ykVar2, i4);
                    }
                    mo14044ad(j7);
                    return true;
                } else if (e != 2 || j4 == this.f15386t) {
                    return false;
                } else {
                    long nanoTime2 = System.nanoTime();
                    long j9 = this.f15373g.mo14085j((j7 * 1000) + nanoTime2);
                    long j10 = (j9 - nanoTime2) / 1000;
                    long j11 = this.f15387u;
                    if (j10 < -500000 && !z2 && (G = mo15943G(j)) != 0) {
                        C4266pp ppVar = this.f19625a;
                        ppVar.f18393i++;
                        int i5 = this.f15391y + G;
                        if (j11 != C6540C.TIME_UNSET) {
                            ppVar.f18390f += i5;
                        } else {
                            mo14043ac(i5);
                        }
                        mo16796az();
                        return false;
                    } else if (m14294aR(j10) && !z2) {
                        if (j11 != C6540C.TIME_UNSET) {
                            mo14041aH(ykVar2, i4);
                            z3 = true;
                        } else {
                            age.m13544b("dropVideoBuffer");
                            ykVar2.mo16818g(i4, false);
                            age.m13545c();
                            z3 = true;
                            mo14043ac(1);
                        }
                        mo14044ad(j10);
                        return z3;
                    } else if (amm.f15298a >= 21) {
                        if (j10 >= 50000) {
                            return false;
                        }
                        m14286aJ(j6, j9, keVar);
                        mo14040aG(ykVar2, i4, j9);
                        mo14044ad(j10);
                        return true;
                    } else if (j10 >= 30000) {
                        return false;
                    } else {
                        if (j10 > 11000) {
                            try {
                                Thread.sleep((-10000 + j10) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        m14286aJ(j6, j9, keVar);
                        mo14039aF(ykVar2, i4);
                        mo14044ad(j10);
                        return true;
                    }
                }
            } else if (!m14294aR(j7)) {
                return false;
            } else {
                mo14041aH(ykVar2, i4);
                mo14044ad(j7);
                return true;
            }
        } else {
            mo14041aH(ykVar2, i4);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public final float mo14047ag(float f, C4120ke[] keVarArr) {
        float f2 = -1.0f;
        for (C4120ke keVar : keVarArr) {
            float f3 = keVar.f17688s;
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
    /* renamed from: ai */
    public final boolean mo14048ai(C4486xt xtVar) {
        return this.f15379m != null || m14287aK(xtVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aj */
    public final boolean mo14049aj() {
        return this.f15368L && amm.f15298a < 23;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public final void mo14050ap() {
        super.mo14050ap();
        this.f15391y = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public final C4485xs mo14051ar(Throwable th, C4486xt xtVar) {
        return new amw(th, xtVar, this.f15379m);
    }

    /* access modifiers changed from: protected */
    @TargetApi(29)
    /* renamed from: as */
    public final void mo14052as(C4269ps psVar) throws C4089ja {
        if (this.f15378l) {
            ByteBuffer byteBuffer = psVar.f18400e;
            aup.m14890u(byteBuffer);
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
                    C4504yk ay = mo16795ay();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    ay.mo16824m(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public final void mo14053at(long j) {
        super.mo14053at(j);
        if (!this.f15368L) {
            this.f15391y--;
        }
    }

    /* renamed from: t */
    public final void mo14054t(int i, Object obj) throws C4089ja {
        int intValue;
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f15380n;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    C4486xt am = mo16788am();
                    if (am != null && m14287aK(am)) {
                        surface = ams.m14263b(this.f15372f, am.f19592f);
                        this.f15380n = surface;
                    }
                }
            }
            if (this.f15379m != surface) {
                this.f15379m = surface;
                this.f15373g.mo14078c(surface);
                this.f15381o = false;
                int e = mo15952e();
                C4504yk ay = mo16795ay();
                if (ay != null) {
                    if (amm.f15298a < 23 || surface == null || this.f15377k) {
                        mo16789an();
                        mo16785ah();
                    } else {
                        ay.mo16823l(surface);
                    }
                }
                if (surface == null || surface == this.f15380n) {
                    m14290aN();
                    m14289aM();
                    return;
                }
                m14292aP();
                m14289aM();
                if (e == 2) {
                    m14288aL();
                }
            } else if (surface != null && surface != this.f15380n) {
                m14292aP();
                if (this.f15381o) {
                    this.f15374h.mo14103g(this.f15379m);
                }
            }
        } else if (i == 4) {
            this.f15382p = ((Integer) obj).intValue();
            C4504yk ay2 = mo16795ay();
            if (ay2 != null) {
                ay2.mo16825n(this.f15382p);
            }
        } else if (i == 6) {
            this.f15370N = (ana) obj;
        } else if (i == 102 && this.f15369M != (intValue = ((Integer) obj).intValue())) {
            this.f15369M = intValue;
            if (this.f15368L) {
                mo16789an();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo14055u(boolean z, boolean z2) throws C4089ja {
        super.mo14055u(z, z2);
        boolean z3 = mo15939C().f17852b;
        boolean z4 = true;
        if (z3 && this.f15369M == 0) {
            z4 = false;
        }
        aup.m14887r(z4);
        if (this.f15368L != z3) {
            this.f15368L = z3;
            mo16789an();
        }
        this.f15374h.mo14097a(this.f19625a);
        this.f15373g.mo14076a();
        this.f15384r = z2;
        this.f15385s = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo13726v(long j, boolean z) throws C4089ja {
        super.mo13726v(j, z);
        m14289aM();
        this.f15373g.mo14079d();
        this.f15392z = C6540C.TIME_UNSET;
        this.f15386t = C6540C.TIME_UNSET;
        this.f15390x = 0;
        if (z) {
            m14288aL();
        } else {
            this.f15387u = C6540C.TIME_UNSET;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo14056w() {
        this.f15389w = 0;
        this.f15388v = SystemClock.elapsedRealtime();
        this.f15357A = SystemClock.elapsedRealtime() * 1000;
        this.f15358B = 0;
        this.f15359C = 0;
        this.f15373g.mo14077b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo14057x() {
        this.f15387u = C6540C.TIME_UNSET;
        m14293aQ();
        int i = this.f15359C;
        if (i != 0) {
            this.f15374h.mo14101e(this.f15358B, i);
            this.f15358B = 0;
            this.f15359C = 0;
        }
        this.f15373g.mo14083h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo13727y() {
        m14290aN();
        m14289aM();
        this.f15381o = false;
        this.f15373g.mo14084i();
        this.f15371b = null;
        try {
            super.mo13727y();
        } finally {
            this.f15374h.mo14105i(this.f19625a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo14058z() {
        try {
            super.mo14058z();
        } finally {
            Surface surface = this.f15380n;
            if (surface != null) {
                if (this.f15379m == surface) {
                    this.f15379m = null;
                }
                surface.release();
                this.f15380n = null;
            }
        }
    }
}
