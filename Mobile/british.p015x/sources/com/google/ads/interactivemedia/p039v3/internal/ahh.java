package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Base64;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahh */
/* compiled from: IMASDK */
public final class ahh implements akk<ahe> {

    /* renamed from: A */
    private static final Pattern f14817A = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: B */
    private static final Pattern f14818B = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: C */
    private static final Pattern f14819C = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: D */
    private static final Pattern f14820D = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: E */
    private static final Pattern f14821E = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: F */
    private static final Pattern f14822F = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: G */
    private static final Pattern f14823G = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: H */
    private static final Pattern f14824H = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: I */
    private static final Pattern f14825I = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f14826J = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: K */
    private static final Pattern f14827K = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: L */
    private static final Pattern f14828L = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: M */
    private static final Pattern f14829M = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: N */
    private static final Pattern f14830N = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: O */
    private static final Pattern f14831O = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f14832P = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: Q */
    private static final Pattern f14833Q = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: R */
    private static final Pattern f14834R = m13690p("AUTOSELECT");

    /* renamed from: S */
    private static final Pattern f14835S = m13690p("DEFAULT");

    /* renamed from: T */
    private static final Pattern f14836T = m13690p("FORCED");

    /* renamed from: U */
    private static final Pattern f14837U = m13690p("INDEPENDENT");

    /* renamed from: V */
    private static final Pattern f14838V = m13690p("GAP");

    /* renamed from: W */
    private static final Pattern f14839W = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: X */
    private static final Pattern f14840X = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: Y */
    private static final Pattern f14841Y = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: a */
    private static final Pattern f14842a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    private static final Pattern f14843b = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: c */
    private static final Pattern f14844c = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: d */
    private static final Pattern f14845d = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f14846e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f14847f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: g */
    private static final Pattern f14848g = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f14849h = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: i */
    private static final Pattern f14850i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: j */
    private static final Pattern f14851j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: k */
    private static final Pattern f14852k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: l */
    private static final Pattern f14853l = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f14854m = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: n */
    private static final Pattern f14855n = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: o */
    private static final Pattern f14856o = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: p */
    private static final Pattern f14857p = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: q */
    private static final Pattern f14858q = m13690p("CAN-SKIP-DATERANGES");

    /* renamed from: r */
    private static final Pattern f14859r = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: s */
    private static final Pattern f14860s = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: t */
    private static final Pattern f14861t = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: u */
    private static final Pattern f14862u = m13690p("CAN-BLOCK-RELOAD");

    /* renamed from: v */
    private static final Pattern f14863v = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: w */
    private static final Pattern f14864w = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: x */
    private static final Pattern f14865x = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: y */
    private static final Pattern f14866y = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: z */
    private static final Pattern f14867z = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: Z */
    private final agx f14868Z;

    /* renamed from: aa */
    private final ahd f14869aa;

    public ahh() {
        agx agx = agx.f14757a;
        throw null;
    }

    public ahh(agx agx, ahd ahd) {
        this.f14868Z = agx;
        this.f14869aa = ahd;
    }

    /* renamed from: b */
    private static int m13676b(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !amm.m14185B(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.ads.interactivemedia.p039v3.internal.agx m13677c(com.google.ads.interactivemedia.p039v3.internal.ahg r36, java.lang.String r37) throws java.io.IOException {
        /*
            r1 = r37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
            r13 = 0
        L_0x0036:
            boolean r14 = r36.mo13717a()
            java.lang.String r15 = "application/x-mpegURL"
            if (r14 == 0) goto L_0x0213
            java.lang.String r14 = r36.mo13718b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r14.startsWith(r9)
            if (r9 == 0) goto L_0x004d
            r8.add(r14)
        L_0x004d:
            java.lang.String r9 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r9 = r14.startsWith(r9)
            r19 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x006d
            java.util.regex.Pattern r9 = f14830N
            java.lang.String r9 = m13686l(r14, r9, r11)
            java.util.regex.Pattern r10 = f14839W
            java.lang.String r10 = m13686l(r14, r10, r11)
            r11.put(r9, r10)
            goto L_0x00cf
        L_0x006d:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x0087
            r1 = r0
            r34 = r3
            r31 = r4
            r32 = r5
            r33 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = 1
            goto L_0x01f8
        L_0x0087:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x0093
            r3.add(r14)
            goto L_0x00cf
        L_0x0093:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x00c3
            java.util.regex.Pattern r9 = f14823G
            java.lang.String r10 = "identity"
            java.lang.String r9 = m13688n(r14, r9, r10, r11)
            com.google.ads.interactivemedia.v3.internal.py r9 = m13680f(r14, r9, r11)
            if (r9 == 0) goto L_0x00cf
            java.util.regex.Pattern r10 = f14822F
            java.lang.String r10 = m13686l(r14, r10, r11)
            java.lang.String r10 = m13681g(r10)
            com.google.ads.interactivemedia.v3.internal.pz r14 = new com.google.ads.interactivemedia.v3.internal.pz
            r15 = 1
            com.google.ads.interactivemedia.v3.internal.py[] r15 = new com.google.ads.interactivemedia.p039v3.internal.C4275py[r15]
            r16 = 0
            r15[r16] = r9
            r14.<init>((java.lang.String) r10, (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r15)
            r12.add(r14)
            goto L_0x00cf
        L_0x00c3:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r14.startsWith(r10)
            if (r10 != 0) goto L_0x00e2
            if (r9 == 0) goto L_0x00cf
            r9 = 1
            goto L_0x00e2
        L_0x00cf:
            r1 = r0
            r34 = r3
            r31 = r4
            r32 = r5
            r33 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = r19
            goto L_0x01f8
        L_0x00e2:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r14.contains(r10)
            r13 = r13 | r10
            r10 = 1
            if (r10 == r9) goto L_0x00f0
            r20 = r13
            r10 = 0
            goto L_0x00f4
        L_0x00f0:
            r10 = 16384(0x4000, float:2.2959E-41)
            r20 = r13
        L_0x00f4:
            java.util.regex.Pattern r13 = f14847f
            int r13 = m13682h(r14, r13)
            r28 = r12
            java.util.regex.Pattern r12 = f14842a
            r29 = r7
            r7 = -1
            int r12 = m13683i(r14, r12, r7)
            java.util.regex.Pattern r7 = f14849h
            java.lang.String r7 = m13687m(r14, r7, r11)
            r30 = r8
            java.util.regex.Pattern r8 = f14850i
            java.lang.String r8 = m13687m(r14, r8, r11)
            if (r8 == 0) goto L_0x013c
            r31 = r4
            java.lang.String r4 = "x"
            java.lang.String[] r4 = com.google.ads.interactivemedia.p039v3.internal.amm.m14256z(r8, r4)
            r8 = 0
            r21 = r4[r8]
            int r8 = java.lang.Integer.parseInt(r21)
            r18 = 1
            r4 = r4[r18]
            int r4 = java.lang.Integer.parseInt(r4)
            if (r8 <= 0) goto L_0x0134
            if (r4 > 0) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            r17 = r4
            goto L_0x0137
        L_0x0134:
            r8 = -1
            r17 = -1
        L_0x0137:
            r32 = r5
            r4 = r17
            goto L_0x0142
        L_0x013c:
            r31 = r4
            r32 = r5
            r4 = -1
            r8 = -1
        L_0x0142:
            java.util.regex.Pattern r5 = f14851j
            java.lang.String r5 = m13687m(r14, r5, r11)
            if (r5 == 0) goto L_0x014f
            float r5 = java.lang.Float.parseFloat(r5)
            goto L_0x0151
        L_0x014f:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0151:
            r33 = r6
            java.util.regex.Pattern r6 = f14843b
            java.lang.String r6 = m13687m(r14, r6, r11)
            r34 = r3
            java.util.regex.Pattern r3 = f14844c
            java.lang.String r3 = m13687m(r14, r3, r11)
            r35 = r0
            java.util.regex.Pattern r0 = f14845d
            java.lang.String r0 = m13687m(r14, r0, r11)
            r17 = r0
            java.util.regex.Pattern r0 = f14846e
            java.lang.String r0 = m13687m(r14, r0, r11)
            if (r9 == 0) goto L_0x017e
            java.util.regex.Pattern r9 = f14825I
            java.lang.String r9 = m13686l(r14, r9, r11)
            android.net.Uri r9 = com.google.ads.interactivemedia.p039v3.internal.arh.m14605l(r1, r9)
            goto L_0x0190
        L_0x017e:
            boolean r9 = r36.mo13717a()
            if (r9 == 0) goto L_0x020b
            java.lang.String r9 = r36.mo13718b()
            java.lang.String r9 = m13689o(r9, r11)
            android.net.Uri r9 = com.google.ads.interactivemedia.p039v3.internal.arh.m14605l(r1, r9)
        L_0x0190:
            com.google.ads.interactivemedia.v3.internal.kd r14 = new com.google.ads.interactivemedia.v3.internal.kd
            r14.<init>()
            int r1 = r2.size()
            r14.mo16106R(r1)
            r14.mo16099K(r15)
            r14.mo16097I(r7)
            r14.mo16095G(r12)
            r14.mo16114Z(r13)
            r14.mo16125aj(r8)
            r14.mo16105Q(r4)
            r14.mo16104P(r5)
            r14.mo16118ac(r10)
            com.google.ads.interactivemedia.v3.internal.ke r23 = r14.mo16115a()
            com.google.ads.interactivemedia.v3.internal.agw r1 = new com.google.ads.interactivemedia.v3.internal.agw
            r21 = r1
            r22 = r9
            r24 = r6
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            r1 = r35
            java.lang.Object r4 = r1.get(r9)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x01de
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.put(r9, r4)
        L_0x01de:
            com.google.ads.interactivemedia.v3.internal.agk r5 = new com.google.ads.interactivemedia.v3.internal.agk
            r21 = r5
            r22 = r12
            r23 = r13
            r24 = r6
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r4.add(r5)
            r10 = r19
            r13 = r20
        L_0x01f8:
            r0 = r1
            r12 = r28
            r7 = r29
            r8 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r3 = r34
            r1 = r37
            goto L_0x0036
        L_0x020b:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "#EXT-X-STREAM-INF must be followed by another line"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0213:
            r1 = r0
            r34 = r3
            r31 = r4
            r32 = r5
            r33 = r6
            r29 = r7
            r30 = r8
            r19 = r10
            r28 = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L_0x022f:
            int r5 = r2.size()
            r6 = 0
            if (r4 >= r5) goto L_0x0299
            java.lang.Object r5 = r2.get(r4)
            com.google.ads.interactivemedia.v3.internal.agw r5 = (com.google.ads.interactivemedia.p039v3.internal.agw) r5
            android.net.Uri r7 = r5.f14751a
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L_0x0296
            com.google.ads.interactivemedia.v3.internal.ke r7 = r5.f14752b
            com.google.ads.interactivemedia.v3.internal.yn r7 = r7.f17679j
            if (r7 != 0) goto L_0x024c
            r7 = 1
            goto L_0x024d
        L_0x024c:
            r7 = 0
        L_0x024d:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r7)
            com.google.ads.interactivemedia.v3.internal.agl r7 = new com.google.ads.interactivemedia.v3.internal.agl
            android.net.Uri r8 = r5.f14751a
            java.lang.Object r8 = r1.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r8)
            r7.<init>(r6, r6, r8)
            com.google.ads.interactivemedia.v3.internal.yn r6 = new com.google.ads.interactivemedia.v3.internal.yn
            r8 = 1
            com.google.ads.interactivemedia.v3.internal.ym[] r9 = new com.google.ads.interactivemedia.p039v3.internal.C4506ym[r8]
            r8 = 0
            r9[r8] = r7
            r6.<init>((com.google.ads.interactivemedia.p039v3.internal.C4506ym[]) r9)
            com.google.ads.interactivemedia.v3.internal.ke r7 = r5.f14752b
            com.google.ads.interactivemedia.v3.internal.kd r7 = r7.mo16126a()
            r7.mo16112X(r6)
            com.google.ads.interactivemedia.v3.internal.ke r22 = r7.mo16115a()
            com.google.ads.interactivemedia.v3.internal.agw r6 = new com.google.ads.interactivemedia.v3.internal.agw
            android.net.Uri r7 = r5.f14751a
            java.lang.String r8 = r5.f14753c
            java.lang.String r9 = r5.f14754d
            java.lang.String r10 = r5.f14755e
            java.lang.String r5 = r5.f14756f
            r20 = r6
            r21 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r3.add(r6)
        L_0x0296:
            int r4 = r4 + 1
            goto L_0x022f
        L_0x0299:
            r1 = r6
            r8 = r1
            r0 = 0
        L_0x029c:
            int r4 = r34.size()
            if (r0 >= r4) goto L_0x0558
            r4 = r34
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r7 = f14831O
            java.lang.String r7 = m13686l(r5, r7, r11)
            java.util.regex.Pattern r9 = f14830N
            java.lang.String r9 = m13686l(r5, r9, r11)
            com.google.ads.interactivemedia.v3.internal.kd r10 = new com.google.ads.interactivemedia.v3.internal.kd
            r10.<init>()
            int r12 = r7.length()
            int r14 = r9.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r18 = 1
            int r12 = r12 + 1
            int r12 = r12 + r14
            r6.<init>(r12)
            r6.append(r7)
            java.lang.String r12 = ":"
            r6.append(r12)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r10.mo16107S(r6)
            r10.mo16109U(r9)
            r10.mo16099K(r15)
            java.util.regex.Pattern r6 = f14835S
            boolean r6 = m13691q(r5, r6)
            java.util.regex.Pattern r12 = f14836T
            boolean r12 = m13691q(r5, r12)
            if (r12 == 0) goto L_0x02f5
            r6 = r6 | 2
        L_0x02f5:
            java.util.regex.Pattern r12 = f14834R
            boolean r12 = m13691q(r5, r12)
            if (r12 == 0) goto L_0x02ff
            r6 = r6 | 4
        L_0x02ff:
            r10.mo16122ag(r6)
            java.util.regex.Pattern r6 = f14832P
            java.lang.String r6 = m13687m(r5, r6, r11)
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x0310
            r6 = 0
            goto L_0x0343
        L_0x0310:
            java.lang.String r12 = ","
            java.lang.String[] r6 = com.google.ads.interactivemedia.p039v3.internal.amm.m14256z(r6, r12)
            java.lang.String r12 = "public.accessibility.describes-video"
            boolean r12 = com.google.ads.interactivemedia.p039v3.internal.amm.m14234d(r6, r12)
            r14 = 1
            if (r14 == r12) goto L_0x0321
            r12 = 0
            goto L_0x0323
        L_0x0321:
            r12 = 512(0x200, float:7.175E-43)
        L_0x0323:
            java.lang.String r14 = "public.accessibility.transcribes-spoken-dialog"
            boolean r14 = com.google.ads.interactivemedia.p039v3.internal.amm.m14234d(r6, r14)
            if (r14 == 0) goto L_0x032d
            r12 = r12 | 4096(0x1000, float:5.74E-42)
        L_0x032d:
            java.lang.String r14 = "public.accessibility.describes-music-and-sound"
            boolean r14 = com.google.ads.interactivemedia.p039v3.internal.amm.m14234d(r6, r14)
            if (r14 == 0) goto L_0x0337
            r12 = r12 | 1024(0x400, float:1.435E-42)
        L_0x0337:
            java.lang.String r14 = "public.easy-to-read"
            boolean r6 = com.google.ads.interactivemedia.p039v3.internal.amm.m14234d(r6, r14)
            if (r6 == 0) goto L_0x0342
            r6 = r12 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0343
        L_0x0342:
            r6 = r12
        L_0x0343:
            r10.mo16118ac(r6)
            java.util.regex.Pattern r6 = f14829M
            java.lang.String r6 = m13687m(r5, r6, r11)
            r10.mo16110V(r6)
            java.util.regex.Pattern r6 = f14825I
            java.lang.String r6 = m13687m(r5, r6, r11)
            if (r6 != 0) goto L_0x035b
            r12 = r37
            r6 = 0
            goto L_0x0361
        L_0x035b:
            r12 = r37
            android.net.Uri r6 = com.google.ads.interactivemedia.p039v3.internal.arh.m14605l(r12, r6)
        L_0x0361:
            com.google.ads.interactivemedia.v3.internal.yn r14 = new com.google.ads.interactivemedia.v3.internal.yn
            r34 = r4
            r4 = 1
            com.google.ads.interactivemedia.v3.internal.ym[] r12 = new com.google.ads.interactivemedia.p039v3.internal.C4506ym[r4]
            com.google.ads.interactivemedia.v3.internal.agl r4 = new com.google.ads.interactivemedia.v3.internal.agl
            r20 = r15
            java.util.List r15 = java.util.Collections.emptyList()
            r4.<init>(r7, r9, r15)
            r15 = 0
            r12[r15] = r4
            r14.<init>((com.google.ads.interactivemedia.p039v3.internal.C4506ym[]) r12)
            java.util.regex.Pattern r4 = f14827K
            java.lang.String r4 = m13686l(r5, r4, r11)
            int r12 = r4.hashCode()
            r15 = 2
            switch(r12) {
                case -959297733: goto L_0x03a6;
                case -333210994: goto L_0x039c;
                case 62628790: goto L_0x0392;
                case 81665115: goto L_0x0388;
                default: goto L_0x0387;
            }
        L_0x0387:
            goto L_0x03b0
        L_0x0388:
            java.lang.String r12 = "VIDEO"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x03b0
            r4 = 0
            goto L_0x03b1
        L_0x0392:
            java.lang.String r12 = "AUDIO"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x03b0
            r4 = 1
            goto L_0x03b1
        L_0x039c:
            java.lang.String r12 = "CLOSED-CAPTIONS"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x03b0
            r4 = 3
            goto L_0x03b1
        L_0x03a6:
            java.lang.String r12 = "SUBTITLES"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x03b0
            r4 = 2
            goto L_0x03b1
        L_0x03b0:
            r4 = -1
        L_0x03b1:
            if (r4 == 0) goto L_0x04ec
            r12 = 1
            if (r4 == r12) goto L_0x0463
            if (r4 == r15) goto L_0x0409
            r12 = 3
            if (r4 == r12) goto L_0x03c7
            r21 = r1
            r4 = r31
            r5 = r32
            r12 = r33
        L_0x03c3:
            r16 = 0
            goto L_0x0549
        L_0x03c7:
            java.util.regex.Pattern r4 = f14833Q
            java.lang.String r4 = m13686l(r5, r4, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x03e0
            java.lang.String r4 = r4.substring(r15)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-608"
            goto L_0x03eb
        L_0x03e0:
            r5 = 7
            java.lang.String r4 = r4.substring(r5)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-708"
        L_0x03eb:
            if (r1 != 0) goto L_0x03f2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x03f2:
            r10.mo16120ae(r5)
            r10.mo16094F(r4)
            com.google.ads.interactivemedia.v3.internal.ke r4 = r10.mo16115a()
            r1.add(r4)
            r4 = r31
            r5 = r32
            r12 = r33
            r16 = 0
            goto L_0x054b
        L_0x0409:
            r4 = 0
        L_0x040a:
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x0422
            java.lang.Object r5 = r2.get(r4)
            com.google.ads.interactivemedia.v3.internal.agw r5 = (com.google.ads.interactivemedia.p039v3.internal.agw) r5
            java.lang.String r12 = r5.f14755e
            boolean r12 = r7.equals(r12)
            if (r12 == 0) goto L_0x041f
            goto L_0x0423
        L_0x041f:
            int r4 = r4 + 1
            goto L_0x040a
        L_0x0422:
            r5 = 0
        L_0x0423:
            if (r5 == 0) goto L_0x0436
            com.google.ads.interactivemedia.v3.internal.ke r4 = r5.f14752b
            java.lang.String r4 = r4.f17678i
            r5 = 3
            java.lang.String r4 = com.google.ads.interactivemedia.p039v3.internal.amm.m14203T(r4, r5)
            r10.mo16097I(r4)
            java.lang.String r4 = com.google.ads.interactivemedia.p039v3.internal.aln.m14040j(r4)
            goto L_0x0437
        L_0x0436:
            r4 = 0
        L_0x0437:
            if (r4 != 0) goto L_0x043b
            java.lang.String r4 = "text/vtt"
        L_0x043b:
            r10.mo16120ae(r4)
            r10.mo16112X(r14)
            if (r6 == 0) goto L_0x0452
            com.google.ads.interactivemedia.v3.internal.agv r4 = new com.google.ads.interactivemedia.v3.internal.agv
            com.google.ads.interactivemedia.v3.internal.ke r5 = r10.mo16115a()
            r4.<init>(r6, r5, r9)
            r12 = r33
            r12.add(r4)
            goto L_0x045b
        L_0x0452:
            r12 = r33
            java.lang.String r4 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            android.util.Log.w(r4, r5)
        L_0x045b:
            r21 = r1
            r4 = r31
            r5 = r32
            goto L_0x03c3
        L_0x0463:
            r12 = r33
            r4 = 0
        L_0x0466:
            int r15 = r2.size()
            if (r4 >= r15) goto L_0x0482
            java.lang.Object r15 = r2.get(r4)
            com.google.ads.interactivemedia.v3.internal.agw r15 = (com.google.ads.interactivemedia.p039v3.internal.agw) r15
            r21 = r1
            java.lang.String r1 = r15.f14754d
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x047d
            goto L_0x0485
        L_0x047d:
            int r4 = r4 + 1
            r1 = r21
            goto L_0x0466
        L_0x0482:
            r21 = r1
            r15 = 0
        L_0x0485:
            if (r15 == 0) goto L_0x0498
            com.google.ads.interactivemedia.v3.internal.ke r1 = r15.f14752b
            java.lang.String r1 = r1.f17678i
            r4 = 1
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.amm.m14203T(r1, r4)
            r10.mo16097I(r1)
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14040j(r1)
            goto L_0x049a
        L_0x0498:
            r4 = 1
            r1 = 0
        L_0x049a:
            java.util.regex.Pattern r7 = f14848g
            java.lang.String r5 = m13687m(r5, r7, r11)
            if (r5 == 0) goto L_0x04c6
            java.lang.String r7 = "/"
            java.lang.String[] r7 = com.google.ads.interactivemedia.p039v3.internal.amm.m14184A(r5, r7)
            r16 = 0
            r7 = r7[r16]
            int r7 = java.lang.Integer.parseInt(r7)
            r10.mo16096H(r7)
            java.lang.String r7 = "audio/eac3"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x04c8
            java.lang.String r7 = "/JOC"
            boolean r5 = r5.endsWith(r7)
            if (r5 == 0) goto L_0x04c8
            java.lang.String r1 = "audio/eac3-joc"
            goto L_0x04c8
        L_0x04c6:
            r16 = 0
        L_0x04c8:
            r10.mo16120ae(r1)
            if (r6 == 0) goto L_0x04df
            r10.mo16112X(r14)
            com.google.ads.interactivemedia.v3.internal.agv r1 = new com.google.ads.interactivemedia.v3.internal.agv
            com.google.ads.interactivemedia.v3.internal.ke r5 = r10.mo16115a()
            r1.<init>(r6, r5, r9)
            r5 = r32
            r5.add(r1)
            goto L_0x0535
        L_0x04df:
            r5 = r32
            if (r15 == 0) goto L_0x0535
            com.google.ads.interactivemedia.v3.internal.ke r8 = r10.mo16115a()
            r1 = r21
            r4 = r31
            goto L_0x054b
        L_0x04ec:
            r21 = r1
            r5 = r32
            r12 = r33
            r16 = 0
            r1 = 0
        L_0x04f5:
            int r4 = r2.size()
            if (r1 >= r4) goto L_0x050e
            java.lang.Object r4 = r2.get(r1)
            com.google.ads.interactivemedia.v3.internal.agw r4 = (com.google.ads.interactivemedia.p039v3.internal.agw) r4
            java.lang.String r15 = r4.f14753c
            boolean r15 = r7.equals(r15)
            if (r15 == 0) goto L_0x050a
            goto L_0x050f
        L_0x050a:
            int r1 = r1 + 1
            r15 = 2
            goto L_0x04f5
        L_0x050e:
            r4 = 0
        L_0x050f:
            if (r4 == 0) goto L_0x0533
            com.google.ads.interactivemedia.v3.internal.ke r1 = r4.f14752b
            java.lang.String r4 = r1.f17678i
            r7 = 2
            java.lang.String r4 = com.google.ads.interactivemedia.p039v3.internal.amm.m14203T(r4, r7)
            r10.mo16097I(r4)
            java.lang.String r4 = com.google.ads.interactivemedia.p039v3.internal.aln.m14040j(r4)
            r10.mo16120ae(r4)
            int r4 = r1.f17686q
            r10.mo16125aj(r4)
            int r4 = r1.f17687r
            r10.mo16105Q(r4)
            float r1 = r1.f17688s
            r10.mo16104P(r1)
        L_0x0533:
            if (r6 != 0) goto L_0x0538
        L_0x0535:
            r4 = r31
            goto L_0x0549
        L_0x0538:
            r10.mo16112X(r14)
            com.google.ads.interactivemedia.v3.internal.agv r1 = new com.google.ads.interactivemedia.v3.internal.agv
            com.google.ads.interactivemedia.v3.internal.ke r4 = r10.mo16115a()
            r1.<init>(r6, r4, r9)
            r4 = r31
            r4.add(r1)
        L_0x0549:
            r1 = r21
        L_0x054b:
            int r0 = r0 + 1
            r31 = r4
            r32 = r5
            r33 = r12
            r15 = r20
            r6 = 0
            goto L_0x029c
        L_0x0558:
            r21 = r1
            r4 = r31
            r5 = r32
            r12 = r33
            if (r13 == 0) goto L_0x0568
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x056a
        L_0x0568:
            r9 = r21
        L_0x056a:
            com.google.ads.interactivemedia.v3.internal.agx r13 = new com.google.ads.interactivemedia.v3.internal.agx
            r0 = r13
            r1 = r37
            r2 = r30
            r6 = r12
            r7 = r29
            r10 = r19
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.ahh.m13677c(com.google.ads.interactivemedia.v3.internal.ahg, java.lang.String):com.google.ads.interactivemedia.v3.internal.agx");
    }

    /* renamed from: d */
    private static C4276pz m13678d(String str, C4275py[] pyVarArr) {
        C4275py[] pyVarArr2 = new C4275py[pyVarArr.length];
        for (int i = 0; i < pyVarArr.length; i++) {
            pyVarArr2[i] = pyVarArr[i].mo16534c((byte[]) null);
        }
        return new C4276pz(str, pyVarArr2);
    }

    /* renamed from: e */
    private static String m13679e(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* renamed from: f */
    private static C4275py m13680f(String str, String str2, Map<String, String> map) throws C4144lb {
        String n = m13688n(str, f14824H, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String l = m13686l(str, f14825I, map);
            return new C4275py(C4083iv.f17464d, MimeTypes.VIDEO_MP4, Base64.decode(l.substring(l.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new C4275py(C4083iv.f17464d, "hls", amm.m14255y(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(n)) {
                return null;
            }
            String l2 = m13686l(str, f14825I, map);
            byte[] decode = Base64.decode(l2.substring(l2.indexOf(44)), 0);
            UUID uuid = C4083iv.f17465e;
            return new C4275py(uuid, MimeTypes.VIDEO_MP4, C4396uk.m19132a(uuid, decode));
        }
    }

    /* renamed from: g */
    private static String m13681g(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? C6540C.CENC_TYPE_cenc : C6540C.CENC_TYPE_cbcs;
    }

    /* renamed from: h */
    private static int m13682h(String str, Pattern pattern) throws C4144lb {
        return Integer.parseInt(m13686l(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: i */
    private static int m13683i(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return i;
        }
        String group = matcher.group(1);
        aup.m14890u(group);
        return Integer.parseInt(group);
    }

    /* renamed from: j */
    private static long m13684j(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return j;
        }
        String group = matcher.group(1);
        aup.m14890u(group);
        return Long.parseLong(group);
    }

    /* renamed from: k */
    private static double m13685k(String str, Pattern pattern) throws C4144lb {
        return Double.parseDouble(m13686l(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: l */
    private static String m13686l(String str, Pattern pattern, Map<String, String> map) throws C4144lb {
        String m = m13687m(str, pattern, map);
        if (m != null) {
            return m;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(pattern2).length() + 19 + String.valueOf(str).length());
        sb.append("Couldn't match ");
        sb.append(pattern2);
        sb.append(" in ");
        sb.append(str);
        throw new C4144lb(sb.toString());
    }

    /* renamed from: m */
    private static String m13687m(String str, Pattern pattern, Map<String, String> map) {
        return m13688n(str, pattern, (String) null, map);
    }

    /* renamed from: n */
    private static String m13688n(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            aup.m14890u(str2);
        }
        return (map.isEmpty() || str2 == null) ? str2 : m13689o(str2, map);
    }

    /* renamed from: o */
    private static String m13689o(String str, Map<String, String> map) {
        Matcher matcher = f14841Y.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: p */
    private static Pattern m13690p(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append(str);
        sb.append("=(NO|YES)");
        return Pattern.compile(sb.toString());
    }

    /* renamed from: q */
    private static boolean m13691q(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* renamed from: r */
    private static double m13692r(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        aup.m14890u(group);
        return Double.parseDouble(group);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02a1, code lost:
        if (r6.length <= 1) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a3, code lost:
        r46 = java.lang.Long.parseLong(r6[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a9, code lost:
        r52 = r46;
        r54 = r66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ad, code lost:
        if (r10 == null) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02af, code lost:
        if (r11 == null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b9, code lost:
        throw new com.google.ads.interactivemedia.p039v3.internal.C4144lb("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ba, code lost:
        r50 = new com.google.ads.interactivemedia.p039v3.internal.aha(r51, r52, r54, r10, r11);
        r46 = 0;
        r12 = r97;
        r6 = r98;
        r7 = r99;
        r66 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d5, code lost:
        if (r12.startsWith(r2) == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d7, code lost:
        r37 = 1000000 * ((long) m13682h(r12, f14852k));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e9, code lost:
        if (r12.startsWith(r15) == false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02eb, code lost:
        r88 = java.lang.Long.parseLong(m13686l(r12, f14863v, java.util.Collections.emptyMap()));
        r34 = r88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0303, code lost:
        if (r12.startsWith("#EXT-X-VERSION") == false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0305, code lost:
        r36 = m13682h(r12, f14855n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0313, code lost:
        if (r12.startsWith("#EXT-X-DEFINE") == false) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0315, code lost:
        r6 = m13687m(r12, f14840X, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x031b, code lost:
        if (r6 == null) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x031d, code lost:
        r7 = r5.f14764h.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0325, code lost:
        if (r7 == null) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0327, code lost:
        r1.put(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x032a, code lost:
        r12 = r112;
        r107 = r0;
        r108 = r1;
        r100 = r2;
        r0 = r3;
        r102 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0337, code lost:
        r1.put(m13686l(r12, f14830N, r1), m13686l(r12, f14839W, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x034b, code lost:
        if (r12.startsWith(r14) == false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x034d, code lost:
        r100 = r2;
        r49 = m13688n(r12, f14865x, r9, r1);
        r95 = (long) (m13685k(r12, f14864w) * 1000000.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0360, code lost:
        r12 = r97;
        r6 = r98;
        r7 = r99;
        r2 = r100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x036a, code lost:
        r100 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0374, code lost:
        if (r12.startsWith("#EXT-X-SKIP") == false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0376, code lost:
        r2 = m13682h(r12, f14859r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x037c, code lost:
        if (r8 == null) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0382, code lost:
        if (r3.isEmpty() == false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0384, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0386, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0387, code lost:
        com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r6);
        r7 = (int) (r34 - r8.f14799f);
        r2 = r2 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0390, code lost:
        if (r7 < 0) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0398, code lost:
        if (r2 > r8.f14806m.size()) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x039a, code lost:
        if (r7 >= r2) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x039c, code lost:
        r6 = r8.f14806m.get(r7);
        r101 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03aa, code lost:
        if (r34 == r8.f14799f) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03ac, code lost:
        r9 = (r8.f14798e - r33) + r6.f14781f;
        r10 = new java.util.ArrayList();
        r54 = r2;
        r50 = r86;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03c3, code lost:
        if (r12 >= r6.f14777b.size()) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03c5, code lost:
        r2 = r6.f14777b.get(r12);
        r107 = r0;
        r0 = r10;
        r0.add(new com.google.ads.interactivemedia.p039v3.internal.agy(r2.f14778c, r2.f14779d, r2.f14780e, r9, r50, r2.f14783h, r2.f14784i, r2.f14785j, r2.f14786k, r2.f14787l, r2.f14788m, r2.f14766a, r2.f14767b));
        r50 = r50 + r2.f14780e;
        r12 = r12 + 1;
        r10 = r0;
        r6 = r6;
        r11 = r11;
        r7 = r7;
        r5 = r5;
        r8 = r8;
        r14 = r14;
        r15 = r15;
        r4 = r4;
        r0 = r107;
        r1 = r1;
        r13 = r13;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0448, code lost:
        r107 = r0;
        r108 = r1;
        r106 = r4;
        r102 = r5;
        r18 = r6;
        r56 = r7;
        r103 = r8;
        r55 = r11;
        r109 = r13;
        r104 = r14;
        r105 = r15;
        r6 = new com.google.ads.interactivemedia.p039v3.internal.aha(r6.f14778c, r6.f14779d, r6.f14776a, r6.f14780e, r9, r86, r6.f14783h, r6.f14784i, r6.f14785j, r6.f14786k, r6.f14787l, r6.f14788m, r10);
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x049a, code lost:
        r107 = r0;
        r108 = r1;
        r54 = r2;
        r106 = r4;
        r102 = r5;
        r56 = r7;
        r103 = r8;
        r55 = r11;
        r109 = r13;
        r104 = r14;
        r105 = r15;
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04b1, code lost:
        r0.add(r6);
        r86 = r86 + r6.f14780e;
        r1 = r6.f14787l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04be, code lost:
        if (r1 == -1) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04c0, code lost:
        r46 = r6.f14786k + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04c5, code lost:
        r1 = r6.f14781f;
        r2 = r6.f14779d;
        r3 = r6.f14783h;
        r10 = r6.f14784i;
        r4 = r6.f14785j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04cf, code lost:
        if (r4 == null) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04d9, code lost:
        if (r4.equals(java.lang.Long.toHexString(r88)) != false) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04dc, code lost:
        r11 = r55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04df, code lost:
        r11 = r6.f14785j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04e2, code lost:
        r88 = r88 + 1;
        r7 = r56 + 1;
        r18 = r1;
        r92 = r2;
        r48 = r3;
        r2 = r54;
        r58 = r86;
        r9 = r101;
        r5 = r102;
        r8 = r103;
        r14 = r104;
        r15 = r105;
        r4 = r106;
        r1 = r108;
        r13 = r109;
        r3 = r0;
        r0 = r107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0505, code lost:
        r55 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x050e, code lost:
        throw new com.google.ads.interactivemedia.p039v3.internal.ahf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x050f, code lost:
        r107 = r0;
        r108 = r1;
        r0 = r3;
        r106 = r4;
        r102 = r5;
        r103 = r8;
        r101 = r9;
        r104 = r14;
        r105 = r15;
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0525, code lost:
        if (r12.startsWith(r1) == false) goto L_0x0593;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0527, code lost:
        r3 = r108;
        r2 = m13686l(r12, f14822F, r3);
        r5 = r107;
        r4 = m13688n(r12, f14823G, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x053d, code lost:
        if ("NONE".equals(r2) == false) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x053f, code lost:
        r106.clear();
        r10 = null;
        r11 = null;
        r48 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0547, code lost:
        r12 = r97;
        r8 = r106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x054c, code lost:
        r6 = m13687m(r12, f14826J, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0556, code lost:
        if (r5.equals(r4) == false) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x055e, code lost:
        if ("AES-128".equals(r2) == false) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0560, code lost:
        r10 = m13686l(r12, f14825I, r3);
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0569, code lost:
        r11 = r6;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x056d, code lost:
        if (r97 != null) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x056f, code lost:
        r2 = m13681g(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (com.google.ads.interactivemedia.p039v3.internal.amm.m14185B(m13676b(r3, false, r5)) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0574, code lost:
        r2 = r97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0576, code lost:
        r7 = m13680f(r12, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x057a, code lost:
        if (r7 == null) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x057c, code lost:
        r8 = r106;
        r8.put(r4, r7);
        r12 = r2;
        r11 = r6;
        r10 = null;
        r48 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0588, code lost:
        r8 = r106;
        r12 = r2;
        r11 = r6;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x058e, code lost:
        r13 = r1;
        r1 = r3;
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0593, code lost:
        r8 = r106;
        r5 = r107;
        r3 = r108;
        r2 = r90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x059f, code lost:
        if (r12.startsWith(r2) == false) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x05a1, code lost:
        r4 = com.google.ads.interactivemedia.p039v3.internal.amm.m14256z(m13686l(r12, f14818B, r3), "@");
        r66 = java.lang.Long.parseLong(r4[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05b4, code lost:
        if (r4.length <= 1) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r5 = r3.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x05b6, code lost:
        r46 = java.lang.Long.parseLong(r4[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05bc, code lost:
        r13 = r1;
        r90 = r2;
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05c1, code lost:
        r4 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05c9, code lost:
        if (r12.startsWith(r4) == false) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05cb, code lost:
        r33 = java.lang.Integer.parseInt(r12.substring(r12.indexOf(58) + 1));
        r13 = r1;
        r90 = r2;
        r1 = r3;
        r23 = r4;
        r4 = r8;
        r12 = r97;
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r8 = r103;
        r14 = r104;
        r15 = r105;
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05f3, code lost:
        r6 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05f9, code lost:
        if (r12.equals(r6) == false) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05fb, code lost:
        r18 = r18 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05fd, code lost:
        r13 = r1;
        r90 = r2;
        r1 = r3;
        r23 = r4;
        r24 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0605, code lost:
        r4 = r8;
        r12 = r97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r5 == null) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0608, code lost:
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r8 = r103;
        r14 = r104;
        r15 = r105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0616, code lost:
        r3 = r0;
        r0 = r5;
        r5 = r102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0622, code lost:
        if (r12.startsWith("#EXT-X-PROGRAM-DATE-TIME") == false) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0626, code lost:
        if (r30 != 0) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0628, code lost:
        r30 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(com.google.ads.interactivemedia.p039v3.internal.amm.m14195L(r12.substring(r12.indexOf(58) + 1))) - r86;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x063d, code lost:
        r12 = r112;
        r109 = r1;
        r90 = r2;
        r108 = r3;
        r23 = r4;
        r107 = r5;
        r24 = r6;
        r13 = r19;
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x064f, code lost:
        r9 = r63;
        r2 = r65;
        r14 = r88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0655, code lost:
        r4 = r97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r5 = r5.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0662, code lost:
        if (r12.equals("#EXT-X-GAP") == false) goto L_0x0680;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0664, code lost:
        r13 = r1;
        r90 = r2;
        r1 = r3;
        r23 = r4;
        r24 = r6;
        r4 = r8;
        r12 = r97;
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r8 = r103;
        r14 = r104;
        r15 = r105;
        r62 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0686, code lost:
        if (r12.equals("#EXT-X-INDEPENDENT-SEGMENTS") == false) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0688, code lost:
        r13 = r1;
        r90 = r2;
        r1 = r3;
        r23 = r4;
        r24 = r6;
        r4 = r8;
        r12 = r97;
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r8 = r103;
        r14 = r104;
        r15 = r105;
        r39 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x06a5, code lost:
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x06ab, code lost:
        if (r12.equals(r9) == false) goto L_0x06cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x06ad, code lost:
        r13 = r1;
        r90 = r2;
        r1 = r3;
        r23 = r4;
        r24 = r6;
        r4 = r8;
        r20 = r9;
        r12 = r97;
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r8 = r103;
        r14 = r104;
        r15 = r105;
        r44 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r5.isEmpty() != false) goto L_0x0a17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06d2, code lost:
        if (r12.startsWith("#EXT-X-RENDITION-REPORT") == false) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06d4, code lost:
        r109 = r1;
        r90 = r2;
        r1 = m13684j(r12, f14866y, (r34 + ((long) r0.size())) - (r63.isEmpty() ? 1 : 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x06ef, code lost:
        if (r63.isEmpty() == false) goto L_0x06fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x06f1, code lost:
        r7 = ((com.google.ads.interactivemedia.p039v3.internal.aha) com.google.ads.interactivemedia.p039v3.internal.art.m14630a(r0)).f14777b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06fa, code lost:
        r7 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x06fc, code lost:
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06ff, code lost:
        if (r42 == com.google.android.exoplayer2.C6540C.TIME_UNSET) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0701, code lost:
        r13 = -1 + r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0706, code lost:
        r7 = m13683i(r12, f14867z, r13);
        r13 = r19;
        r12 = android.net.Uri.parse(com.google.ads.interactivemedia.p039v3.internal.arh.m14606m(r13, m13686l(r12, f14825I, r3)));
        r14 = new com.google.ads.interactivemedia.p039v3.internal.agz(r1, r7);
        r1 = r40;
        r1.put(r12, r14);
        r12 = r112;
        r108 = r3;
        r23 = r4;
        r107 = r5;
        r24 = r6;
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0734, code lost:
        r109 = r1;
        r90 = r2;
        r13 = r19;
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0742, code lost:
        if (r12.startsWith("#EXT-X-PRELOAD-HINT") == false) goto L_0x07fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0744, code lost:
        r2 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0746, code lost:
        if (r2 != null) goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0754, code lost:
        if ("PART".equals(m13686l(r12, f14828L, r3)) == false) goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0756, code lost:
        r69 = m13686l(r12, f14825I, r3);
        r19 = m13684j(r12, f14820D, -1);
        r81 = m13684j(r12, f14821E, -1);
        r14 = r88;
        r78 = m13679e(r14, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0770, code lost:
        if (r48 != null) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0776, code lost:
        if (r8.isEmpty() != false) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r5.startsWith("#EXT-X-STREAM-INF") == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0778, code lost:
        r2 = (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r8.values().toArray(new com.google.ads.interactivemedia.p039v3.internal.C4275py[0]);
        r12 = r97;
        r7 = new com.google.ads.interactivemedia.p039v3.internal.C4276pz(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x078c, code lost:
        if (r45 != null) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x078e, code lost:
        r45 = m13678d(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0792, code lost:
        r48 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0795, code lost:
        r12 = r97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x079b, code lost:
        if (r19 == -1) goto L_0x07a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x079f, code lost:
        if (r81 == -1) goto L_0x07a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        r4.add(r5);
        r0 = m13677c(new com.google.ads.interactivemedia.p039v3.internal.ahg(r4, r3), r112.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x07a2, code lost:
        r65 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x07a9, code lost:
        if (r19 == -1) goto L_0x07ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x07ab, code lost:
        r79 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x07ae, code lost:
        r79 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x07b0, code lost:
        r65 = new com.google.ads.interactivemedia.p039v3.internal.agy(r69, r92, 0, r18, r58, r48, r10, r78, r79, r81, false, false, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x07c9, code lost:
        r40 = r1;
        r1 = r3;
        r23 = r4;
        r24 = r6;
        r4 = r8;
        r20 = r9;
        r19 = r13;
        r88 = r14;
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r8 = r103;
        r14 = r104;
        r15 = r105;
        r13 = r109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x07e9, code lost:
        r14 = r88;
        r12 = r112;
        r108 = r3;
        r23 = r4;
        r107 = r5;
        r24 = r6;
        r20 = r9;
        r9 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x07fb, code lost:
        r23 = r4;
        r107 = r5;
        r2 = r65;
        r14 = r88;
        r4 = r97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x080b, code lost:
        if (r12.startsWith("#EXT-X-PART") == false) goto L_0x08d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        com.google.ads.interactivemedia.p039v3.internal.amm.m14248r(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x080d, code lost:
        r78 = m13679e(r14, r10, r11);
        r69 = m13686l(r12, f14825I, r3);
        r24 = r6;
        r5 = (long) (m13685k(r12, f14853l) * 1000000.0d);
        r20 = r9;
        r9 = m13691q(r12, f14837U);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x082a, code lost:
        if (r39 == false) goto L_0x0835;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0830, code lost:
        if (r63.isEmpty() == false) goto L_0x0835;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0832, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0835, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0837, code lost:
        r84 = r9 | r19;
        r83 = m13691q(r12, f14838V);
        r9 = m13687m(r12, f14819C, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0845, code lost:
        if (r9 == null) goto L_0x085d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0847, code lost:
        r7 = com.google.ads.interactivemedia.p039v3.internal.amm.m14256z(r9, "@");
        r50 = java.lang.Long.parseLong(r7[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0854, code lost:
        if (r7.length <= 1) goto L_0x0860;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0856, code lost:
        r93 = java.lang.Long.parseLong(r7[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x085d, code lost:
        r50 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0864, code lost:
        if (r50 != -1) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0866, code lost:
        r93 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0868, code lost:
        if (r48 != null) goto L_0x088a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x086e, code lost:
        if (r8.isEmpty() != false) goto L_0x088a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0870, code lost:
        r7 = (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r8.values().toArray(new com.google.ads.interactivemedia.p039v3.internal.C4275py[0]);
        r9 = new com.google.ads.interactivemedia.p039v3.internal.C4276pz(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0882, code lost:
        if (r45 != null) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0884, code lost:
        r45 = m13678d(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0888, code lost:
        r48 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x088a, code lost:
        r9 = r63;
        r9.add(new com.google.ads.interactivemedia.p039v3.internal.agy(r69, r92, r5, r18, r58, r48, r10, r78, r93, r50, r83, r84, false));
        r58 = r58 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x08ae, code lost:
        if (r50 == -1) goto L_0x08b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x08b0, code lost:
        r93 = r93 + r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x08b2, code lost:
        r40 = r1;
        r65 = r2;
        r1 = r3;
        r12 = r4;
        r4 = r8;
        r63 = r9;
        r19 = r13;
        r88 = r14;
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r5 = r102;
        r8 = r103;
        r14 = r104;
        r15 = r105;
        r13 = r109;
        r3 = r0;
        r0 = r107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x08d6, code lost:
        r24 = r6;
        r20 = r9;
        r9 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x08e3, code lost:
        if (r12.startsWith("#") != false) goto L_0x09a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x08e5, code lost:
        r6 = m13679e(r14, r10, r11);
        r88 = r14 + 1;
        r7 = m13689o(r12, r3);
        r12 = r112;
        r14 = (com.google.ads.interactivemedia.p039v3.internal.aha) r12.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x08fb, code lost:
        if (r66 != -1) goto L_0x0900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        r13 = "#EXT-X-KEY";
        r14 = "#EXTINF";
        r15 = "#EXT-X-MEDIA-SEQUENCE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x08fd, code lost:
        r68 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0900, code lost:
        if (r91 == false) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0902, code lost:
        if (r92 != null) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0904, code lost:
        if (r14 != null) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0906, code lost:
        r50 = new com.google.ads.interactivemedia.p039v3.internal.aha(r7, 0, r46, (java.lang.String) null, (java.lang.String) null);
        r12.put(r7, r50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x091a, code lost:
        r68 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x091c, code lost:
        if (r48 != null) goto L_0x093f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0922, code lost:
        if (r8.isEmpty() != false) goto L_0x093f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0924, code lost:
        r108 = r3;
        r3 = (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r8.values().toArray(new com.google.ads.interactivemedia.p039v3.internal.C4275py[0]);
        r15 = new com.google.ads.interactivemedia.p039v3.internal.C4276pz(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r5.startsWith(r2) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0938, code lost:
        if (r45 != null) goto L_0x0944;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x093a, code lost:
        r45 = m13678d(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x093f, code lost:
        r108 = r3;
        r15 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0946, code lost:
        if (r92 == null) goto L_0x094b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0948, code lost:
        r48 = r92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x094b, code lost:
        r48 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x094d, code lost:
        r0.add(new com.google.ads.interactivemedia.p039v3.internal.aha(r7, r48, r49, r95, r18, r86, r15, r10, r6, r68, r66, r62, r9));
        r58 = r86 + r95;
        r63 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0974, code lost:
        if (r66 == -1) goto L_0x0978;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0976, code lost:
        r68 = r68 + r66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0978, code lost:
        r46 = r68;
        r3 = r0;
        r40 = r1;
        r65 = r2;
        r66 = -1;
        r112 = r12;
        r19 = r13;
        r48 = r15;
        r95 = 0;
        r86 = r58;
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r49 = r9;
        r5 = r102;
        r14 = r104;
        r15 = r105;
        r0 = r107;
        r1 = r108;
        r13 = r109;
        r62 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x09a4, code lost:
        r12 = r112;
        r108 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x09aa, code lost:
        r3 = r0;
        r40 = r1;
        r65 = r2;
        r63 = r9;
        r112 = r12;
        r19 = r13;
        r88 = r14;
        r6 = r98;
        r7 = r99;
        r2 = r100;
        r9 = r101;
        r5 = r102;
        r14 = r104;
        r15 = r105;
        r0 = r107;
        r1 = r108;
        r13 = r109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x09cb, code lost:
        r12 = r4;
        r4 = r8;
        r8 = r103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x09d1, code lost:
        r0 = r3;
        r99 = r7;
        r13 = r19;
        r1 = r40;
        r9 = r63;
        r2 = r65;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x09dd, code lost:
        if (r2 == null) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x09df, code lost:
        r9.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x09e6, code lost:
        if (r30 == 0) goto L_0x09e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x09e8, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x09e9, code lost:
        r16 = new com.google.ads.interactivemedia.p039v3.internal.ahd(r17, r13, r99, r28, r30, r32, r33, r34, r36, r37, r42, r39, r44, r5, r45, r0, r9, r64, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0a12, code lost:
        com.google.ads.interactivemedia.p039v3.internal.amm.m14248r(r41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0a17, code lost:
        r1 = r111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0a1b, code lost:
        com.google.ads.interactivemedia.p039v3.internal.amm.m14248r(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0a27, code lost:
        throw new com.google.ads.interactivemedia.p039v3.internal.C4144lb("Failed to parse the playlist, could not identify any tags.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0a30, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (r5.startsWith(r15) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (r5.startsWith(r14) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        if (r5.startsWith(r13) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        if (r5.startsWith("#EXT-X-BYTERANGE") != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (r5.equals("#EXT-X-DISCONTINUITY") != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        if (r5.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c4, code lost:
        if (r5.equals("#EXT-X-ENDLIST") == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        r4.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r4.add(r5);
        r5 = r1.f14868Z;
        r8 = r1.f14869aa;
        r6 = new com.google.ads.interactivemedia.p039v3.internal.ahg(r4, r3);
        r4 = r112.toString();
        r7 = r5.f14813t;
        r1 = new java.util.HashMap();
        r17 = r7;
        r7 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        r41 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r3 = new java.util.ArrayList();
        r18 = new java.util.ArrayList();
        r112 = r7;
        r40 = new java.util.HashMap();
        r7 = new java.util.ArrayList();
        r19 = new com.google.ads.interactivemedia.p039v3.internal.ahc(com.google.android.exoplayer2.C6540C.TIME_UNSET, false, com.google.android.exoplayer2.C6540C.TIME_UNSET, com.google.android.exoplayer2.C6540C.TIME_UNSET, false);
        r19 = r4;
        r4 = new java.util.TreeMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0124, code lost:
        r20 = "#EXT-X-ENDLIST";
        r9 = "";
        r23 = "#EXT-X-DISCONTINUITY-SEQUENCE";
        r24 = "#EXT-X-DISCONTINUITY";
        r49 = r9;
        r90 = "#EXT-X-BYTERANGE";
        r39 = r17;
        r63 = r18;
        r37 = -9223372036854775807L;
        r42 = -9223372036854775807L;
        r10 = null;
        r11 = null;
        r12 = null;
        r45 = null;
        r48 = null;
        r65 = null;
        r92 = null;
        r30 = 0;
        r34 = 0;
        r46 = 0;
        r58 = 0;
        r86 = 0;
        r88 = 0;
        r93 = 0;
        r95 = 0;
        r64 = r19;
        r17 = 0;
        r18 = 0;
        r32 = false;
        r33 = 0;
        r36 = 1;
        r44 = false;
        r62 = false;
        r66 = -1;
        r91 = false;
        r28 = -9223372036854775807L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0177, code lost:
        if (r6.mo13717a() == false) goto L_0x09d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0179, code lost:
        r97 = r12;
        r12 = r6.mo13718b();
        r98 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0187, code lost:
        if (r12.startsWith("#EXT") == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0189, code lost:
        r7.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0192, code lost:
        if (r12.startsWith("#EXT-X-PLAYLIST-TYPE") == false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0194, code lost:
        r6 = m13686l(r12, f14856o, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a0, code lost:
        if ("VOD".equals(r6) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a2, code lost:
        r12 = r97;
        r6 = r98;
        r17 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01af, code lost:
        if ("EVENT".equals(r6) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b1, code lost:
        r17 = 2;
        r12 = r97;
        r6 = r98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b8, code lost:
        r12 = r112;
        r107 = r0;
        r108 = r1;
        r100 = r2;
        r0 = r3;
        r102 = r5;
        r99 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c5, code lost:
        r103 = r8;
        r101 = r9;
        r109 = r13;
        r104 = r14;
        r105 = r15;
        r13 = r19;
        r1 = r40;
        r9 = r63;
        r2 = r65;
        r14 = r88;
        r8 = r4;
        r4 = r97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e7, code lost:
        if (r12.equals("#EXT-X-I-FRAMES-ONLY") == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e9, code lost:
        r12 = r97;
        r6 = r98;
        r91 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01fb, code lost:
        if (r12.startsWith("#EXT-X-START") == false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fd, code lost:
        r99 = r7;
        r28 = (long) (m13685k(r12, f14817A) * 1000000.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020a, code lost:
        r12 = r97;
        r6 = r98;
        r7 = r99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0212, code lost:
        r99 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021a, code lost:
        if (r12.startsWith("#EXT-X-SERVER-CONTROL") == false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021c, code lost:
        r6 = m13692r(r12, f14857p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0226, code lost:
        if (r6 != -9.223372036854776E18d) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0228, code lost:
        r69 = -9223372036854775807L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x022b, code lost:
        r69 = (long) (r6 * 1000000.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0230, code lost:
        r71 = m13691q(r12, f14858q);
        r6 = m13692r(r12, f14860s);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x023e, code lost:
        if (r6 != -9.223372036854776E18d) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0240, code lost:
        r72 = -9223372036854775807L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0243, code lost:
        r72 = (long) (r6 * 1000000.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0248, code lost:
        r6 = m13692r(r12, f14861t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0250, code lost:
        if (r6 != -9.223372036854776E18d) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0252, code lost:
        r74 = -9223372036854775807L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0255, code lost:
        r74 = (long) (r6 * 1000000.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x025a, code lost:
        r68 = new com.google.ads.interactivemedia.p039v3.internal.ahc(r69, r71, r72, r74, m13691q(r12, f14862u));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026e, code lost:
        if (r12.startsWith("#EXT-X-PART-INF") == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0270, code lost:
        r42 = (long) (m13685k(r12, f14854m) * 1000000.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0284, code lost:
        if (r12.startsWith("#EXT-X-MAP") == false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r51 = m13686l(r12, f14825I, r1);
        r6 = m13687m(r12, f14819C, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0292, code lost:
        if (r6 == null) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0294, code lost:
        r6 = com.google.ads.interactivemedia.p039v3.internal.amm.m14256z(r6, "@");
        r66 = java.lang.Long.parseLong(r6[0]);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo13517a(android.net.Uri r112, java.io.InputStream r113) throws java.io.IOException {
        /*
            r111 = this;
            r1 = r111
            java.lang.String r0 = "identity"
            java.lang.String r2 = "#EXT-X-TARGETDURATION"
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r5 = r113
            r4.<init>(r5)
            r3.<init>(r4)
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            int r5 = r3.read()     // Catch:{ all -> 0x0a32 }
            r6 = 239(0xef, float:3.35E-43)
            if (r5 != r6) goto L_0x0038
            int r5 = r3.read()     // Catch:{ all -> 0x0a32 }
            r6 = 187(0xbb, float:2.62E-43)
            if (r5 != r6) goto L_0x0034
            int r5 = r3.read()     // Catch:{ all -> 0x0a32 }
            r6 = 191(0xbf, float:2.68E-43)
            if (r5 != r6) goto L_0x0034
            int r5 = r3.read()     // Catch:{ all -> 0x0a32 }
            goto L_0x0038
        L_0x0034:
            r41 = r3
            goto L_0x0a28
        L_0x0038:
            r6 = 1
            int r5 = m13676b(r3, r6, r5)     // Catch:{ all -> 0x0a32 }
            r7 = 0
            r8 = 0
        L_0x003f:
            r9 = 7
            if (r8 >= r9) goto L_0x0051
            java.lang.String r9 = "#EXTM3U"
            char r9 = r9.charAt(r8)     // Catch:{ all -> 0x0a32 }
            if (r5 != r9) goto L_0x0034
            int r5 = r3.read()     // Catch:{ all -> 0x0a32 }
            int r8 = r8 + 1
            goto L_0x003f
        L_0x0051:
            int r5 = m13676b(r3, r7, r5)     // Catch:{ all -> 0x0a32 }
            boolean r5 = com.google.ads.interactivemedia.p039v3.internal.amm.m14185B(r5)     // Catch:{ all -> 0x0a32 }
            if (r5 == 0) goto L_0x0034
        L_0x005b:
            java.lang.String r5 = r3.readLine()     // Catch:{ all -> 0x0a32 }
            if (r5 == 0) goto L_0x0a1b
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0a32 }
            boolean r8 = r5.isEmpty()     // Catch:{ all -> 0x0a32 }
            if (r8 != 0) goto L_0x0a17
            java.lang.String r8 = "#EXT-X-STREAM-INF"
            boolean r8 = r5.startsWith(r8)     // Catch:{ all -> 0x0a32 }
            if (r8 == 0) goto L_0x0088
            r4.add(r5)     // Catch:{ all -> 0x0a32 }
            com.google.ads.interactivemedia.v3.internal.ahg r0 = new com.google.ads.interactivemedia.v3.internal.ahg     // Catch:{ all -> 0x0a32 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x0a32 }
            java.lang.String r2 = r112.toString()     // Catch:{ all -> 0x0a32 }
            com.google.ads.interactivemedia.v3.internal.agx r0 = m13677c(r0, r2)     // Catch:{ all -> 0x0a32 }
            com.google.ads.interactivemedia.p039v3.internal.amm.m14248r(r3)
            goto L_0x0a16
        L_0x0088:
            boolean r8 = r5.startsWith(r2)     // Catch:{ all -> 0x0a32 }
            java.lang.String r9 = "#EXT-X-ENDLIST"
            java.lang.String r10 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            java.lang.String r11 = "#EXT-X-DISCONTINUITY"
            java.lang.String r12 = "#EXT-X-BYTERANGE"
            java.lang.String r13 = "#EXT-X-KEY"
            java.lang.String r14 = "#EXTINF"
            java.lang.String r15 = "#EXT-X-MEDIA-SEQUENCE"
            if (r8 != 0) goto L_0x00cb
            boolean r8 = r5.startsWith(r15)     // Catch:{ all -> 0x0a32 }
            if (r8 != 0) goto L_0x00cb
            boolean r8 = r5.startsWith(r14)     // Catch:{ all -> 0x0a32 }
            if (r8 != 0) goto L_0x00cb
            boolean r8 = r5.startsWith(r13)     // Catch:{ all -> 0x0a32 }
            if (r8 != 0) goto L_0x00cb
            boolean r8 = r5.startsWith(r12)     // Catch:{ all -> 0x0a32 }
            if (r8 != 0) goto L_0x00cb
            boolean r8 = r5.equals(r11)     // Catch:{ all -> 0x0a32 }
            if (r8 != 0) goto L_0x00cb
            boolean r8 = r5.equals(r10)     // Catch:{ all -> 0x0a32 }
            if (r8 != 0) goto L_0x00cb
            boolean r8 = r5.equals(r9)     // Catch:{ all -> 0x0a32 }
            if (r8 == 0) goto L_0x00c7
            goto L_0x00cb
        L_0x00c7:
            r4.add(r5)     // Catch:{ all -> 0x0a32 }
            goto L_0x005b
        L_0x00cb:
            r4.add(r5)     // Catch:{ all -> 0x0a32 }
            com.google.ads.interactivemedia.v3.internal.agx r5 = r1.f14868Z     // Catch:{ all -> 0x0a32 }
            com.google.ads.interactivemedia.v3.internal.ahd r8 = r1.f14869aa     // Catch:{ all -> 0x0a32 }
            com.google.ads.interactivemedia.v3.internal.ahg r6 = new com.google.ads.interactivemedia.v3.internal.ahg     // Catch:{ all -> 0x0a32 }
            r6.<init>(r4, r3)     // Catch:{ all -> 0x0a32 }
            java.lang.String r4 = r112.toString()     // Catch:{ all -> 0x0a32 }
            boolean r7 = r5.f14813t     // Catch:{ all -> 0x0a32 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0a32 }
            r1.<init>()     // Catch:{ all -> 0x0a32 }
            r17 = r7
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0a32 }
            r7.<init>()     // Catch:{ all -> 0x0a32 }
            r41 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0a30 }
            r3.<init>()     // Catch:{ all -> 0x0a30 }
            java.util.ArrayList r18 = new java.util.ArrayList     // Catch:{ all -> 0x0a30 }
            r18.<init>()     // Catch:{ all -> 0x0a30 }
            r112 = r7
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0a30 }
            r7.<init>()     // Catch:{ all -> 0x0a30 }
            r40 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0a30 }
            r7.<init>()     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.ahc r28 = new com.google.ads.interactivemedia.v3.internal.ahc     // Catch:{ all -> 0x0a30 }
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r22 = 0
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = 0
            r19 = r28
            r19.<init>(r20, r22, r23, r25, r27)     // Catch:{ all -> 0x0a30 }
            r19 = r4
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ all -> 0x0a30 }
            r4.<init>()     // Catch:{ all -> 0x0a30 }
            r20 = r9
            java.lang.String r9 = ""
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r23 = r10
            r24 = r11
            r25 = 0
            r26 = 0
            r49 = r9
            r90 = r12
            r39 = r17
            r63 = r18
            r37 = r21
            r42 = r37
            r10 = r25
            r11 = r10
            r12 = r11
            r45 = r12
            r48 = r45
            r65 = r48
            r92 = r65
            r30 = r26
            r34 = r30
            r46 = r34
            r58 = r46
            r86 = r58
            r88 = r86
            r93 = r88
            r95 = r93
            r64 = r28
            r17 = 0
            r18 = 0
            r32 = 0
            r33 = 0
            r36 = 1
            r44 = 0
            r62 = 0
            r66 = -1
            r91 = 0
            r28 = r42
        L_0x0173:
            boolean r50 = r6.mo13717a()     // Catch:{ all -> 0x0a30 }
            if (r50 == 0) goto L_0x09d1
            r97 = r12
            java.lang.String r12 = r6.mo13718b()     // Catch:{ all -> 0x0a30 }
            r98 = r6
            java.lang.String r6 = "#EXT"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x018c
            r7.add(r12)     // Catch:{ all -> 0x0a30 }
        L_0x018c:
            java.lang.String r6 = "#EXT-X-PLAYLIST-TYPE"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x01e1
            java.util.regex.Pattern r6 = f14856o     // Catch:{ all -> 0x0a30 }
            java.lang.String r6 = m13686l(r12, r6, r1)     // Catch:{ all -> 0x0a30 }
            java.lang.String r12 = "VOD"
            boolean r12 = r12.equals(r6)     // Catch:{ all -> 0x0a30 }
            if (r12 == 0) goto L_0x01a9
            r12 = r97
            r6 = r98
            r17 = 1
            goto L_0x0173
        L_0x01a9:
            java.lang.String r12 = "EVENT"
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x01b8
            r17 = 2
            r12 = r97
            r6 = r98
            goto L_0x0173
        L_0x01b8:
            r12 = r112
            r107 = r0
            r108 = r1
            r100 = r2
            r0 = r3
            r102 = r5
            r99 = r7
        L_0x01c5:
            r103 = r8
            r101 = r9
            r109 = r13
            r104 = r14
            r105 = r15
            r13 = r19
            r1 = r40
            r9 = r63
            r2 = r65
            r14 = r88
            r5 = 0
            r6 = -1
            r8 = r4
            r4 = r97
            goto L_0x09aa
        L_0x01e1:
            java.lang.String r6 = "#EXT-X-I-FRAMES-ONLY"
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x01f0
            r12 = r97
            r6 = r98
            r91 = 1
            goto L_0x0173
        L_0x01f0:
            java.lang.String r6 = "#EXT-X-START"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            r50 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r6 == 0) goto L_0x0212
            java.util.regex.Pattern r6 = f14817A     // Catch:{ all -> 0x0a30 }
            double r28 = m13685k(r12, r6)     // Catch:{ all -> 0x0a30 }
            r99 = r7
            double r6 = r28 * r50
            long r6 = (long) r6     // Catch:{ all -> 0x0a30 }
            r28 = r6
        L_0x020a:
            r12 = r97
            r6 = r98
            r7 = r99
            goto L_0x0173
        L_0x0212:
            r99 = r7
            java.lang.String r6 = "#EXT-X-SERVER-CONTROL"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x0268
            java.util.regex.Pattern r6 = f14857p     // Catch:{ all -> 0x0a30 }
            double r6 = m13692r(r12, r6)     // Catch:{ all -> 0x0a30 }
            r52 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r54 = (r6 > r52 ? 1 : (r6 == r52 ? 0 : -1))
            if (r54 != 0) goto L_0x022b
            r69 = r21
            goto L_0x0230
        L_0x022b:
            double r6 = r6 * r50
            long r6 = (long) r6     // Catch:{ all -> 0x0a30 }
            r69 = r6
        L_0x0230:
            java.util.regex.Pattern r6 = f14858q     // Catch:{ all -> 0x0a30 }
            boolean r71 = m13691q(r12, r6)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r6 = f14860s     // Catch:{ all -> 0x0a30 }
            double r6 = m13692r(r12, r6)     // Catch:{ all -> 0x0a30 }
            int r54 = (r6 > r52 ? 1 : (r6 == r52 ? 0 : -1))
            if (r54 != 0) goto L_0x0243
            r72 = r21
            goto L_0x0248
        L_0x0243:
            double r6 = r6 * r50
            long r6 = (long) r6     // Catch:{ all -> 0x0a30 }
            r72 = r6
        L_0x0248:
            java.util.regex.Pattern r6 = f14861t     // Catch:{ all -> 0x0a30 }
            double r6 = m13692r(r12, r6)     // Catch:{ all -> 0x0a30 }
            int r54 = (r6 > r52 ? 1 : (r6 == r52 ? 0 : -1))
            if (r54 != 0) goto L_0x0255
            r74 = r21
            goto L_0x025a
        L_0x0255:
            double r6 = r6 * r50
            long r6 = (long) r6     // Catch:{ all -> 0x0a30 }
            r74 = r6
        L_0x025a:
            java.util.regex.Pattern r6 = f14862u     // Catch:{ all -> 0x0a30 }
            boolean r76 = m13691q(r12, r6)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.ahc r64 = new com.google.ads.interactivemedia.v3.internal.ahc     // Catch:{ all -> 0x0a30 }
            r68 = r64
            r68.<init>(r69, r71, r72, r74, r76)     // Catch:{ all -> 0x0a30 }
            goto L_0x020a
        L_0x0268:
            java.lang.String r6 = "#EXT-X-PART-INF"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x027c
            java.util.regex.Pattern r6 = f14854m     // Catch:{ all -> 0x0a30 }
            double r6 = m13685k(r12, r6)     // Catch:{ all -> 0x0a30 }
            double r6 = r6 * r50
            long r6 = (long) r6     // Catch:{ all -> 0x0a30 }
            r42 = r6
            goto L_0x020a
        L_0x027c:
            java.lang.String r6 = "#EXT-X-MAP"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            java.lang.String r7 = "@"
            if (r6 == 0) goto L_0x02d1
            java.util.regex.Pattern r6 = f14825I     // Catch:{ all -> 0x0a30 }
            java.lang.String r51 = m13686l(r12, r6, r1)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r6 = f14819C     // Catch:{ all -> 0x0a30 }
            java.lang.String r6 = m13687m(r12, r6, r1)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x02a9
            java.lang.String[] r6 = com.google.ads.interactivemedia.p039v3.internal.amm.m14256z(r6, r7)     // Catch:{ all -> 0x0a30 }
            r7 = 0
            r12 = r6[r7]     // Catch:{ all -> 0x0a30 }
            long r66 = java.lang.Long.parseLong(r12)     // Catch:{ all -> 0x0a30 }
            int r7 = r6.length     // Catch:{ all -> 0x0a30 }
            r12 = 1
            if (r7 <= r12) goto L_0x02a9
            r6 = r6[r12]     // Catch:{ all -> 0x0a30 }
            long r46 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0a30 }
        L_0x02a9:
            r52 = r46
            r54 = r66
            if (r10 == 0) goto L_0x02ba
            if (r11 == 0) goto L_0x02b2
            goto L_0x02ba
        L_0x02b2:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch:{ all -> 0x0a30 }
            java.lang.String r1 = "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0a30 }
            throw r0     // Catch:{ all -> 0x0a30 }
        L_0x02ba:
            com.google.ads.interactivemedia.v3.internal.aha r92 = new com.google.ads.interactivemedia.v3.internal.aha     // Catch:{ all -> 0x0a30 }
            r50 = r92
            r56 = r10
            r57 = r11
            r50.<init>(r51, r52, r54, r56, r57)     // Catch:{ all -> 0x0a30 }
            r46 = r26
            r12 = r97
            r6 = r98
            r7 = r99
            r66 = -1
            goto L_0x0173
        L_0x02d1:
            boolean r6 = r12.startsWith(r2)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x02e5
            java.util.regex.Pattern r6 = f14852k     // Catch:{ all -> 0x0a30 }
            int r6 = m13682h(r12, r6)     // Catch:{ all -> 0x0a30 }
            long r6 = (long) r6     // Catch:{ all -> 0x0a30 }
            r37 = 1000000(0xf4240, double:4.940656E-318)
            long r37 = r37 * r6
            goto L_0x020a
        L_0x02e5:
            boolean r6 = r12.startsWith(r15)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x02fd
            java.util.regex.Pattern r6 = f14863v     // Catch:{ all -> 0x0a30 }
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0a30 }
            java.lang.String r6 = m13686l(r12, r6, r7)     // Catch:{ all -> 0x0a30 }
            long r88 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0a30 }
            r34 = r88
            goto L_0x020a
        L_0x02fd:
            java.lang.String r6 = "#EXT-X-VERSION"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x030d
            java.util.regex.Pattern r6 = f14855n     // Catch:{ all -> 0x0a30 }
            int r36 = m13682h(r12, r6)     // Catch:{ all -> 0x0a30 }
            goto L_0x020a
        L_0x030d:
            java.lang.String r6 = "#EXT-X-DEFINE"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x0347
            java.util.regex.Pattern r6 = f14840X     // Catch:{ all -> 0x0a30 }
            java.lang.String r6 = m13687m(r12, r6, r1)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x0337
            java.util.Map<java.lang.String, java.lang.String> r7 = r5.f14764h     // Catch:{ all -> 0x0a30 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0a30 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a30 }
            if (r7 == 0) goto L_0x032a
            r1.put(r6, r7)     // Catch:{ all -> 0x0a30 }
        L_0x032a:
            r12 = r112
            r107 = r0
            r108 = r1
            r100 = r2
            r0 = r3
            r102 = r5
            goto L_0x01c5
        L_0x0337:
            java.util.regex.Pattern r6 = f14830N     // Catch:{ all -> 0x0a30 }
            java.lang.String r6 = m13686l(r12, r6, r1)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r7 = f14839W     // Catch:{ all -> 0x0a30 }
            java.lang.String r7 = m13686l(r12, r7, r1)     // Catch:{ all -> 0x0a30 }
            r1.put(r6, r7)     // Catch:{ all -> 0x0a30 }
            goto L_0x032a
        L_0x0347:
            boolean r6 = r12.startsWith(r14)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x036a
            java.util.regex.Pattern r6 = f14864w     // Catch:{ all -> 0x0a30 }
            double r6 = m13685k(r12, r6)     // Catch:{ all -> 0x0a30 }
            double r6 = r6 * r50
            long r6 = (long) r6     // Catch:{ all -> 0x0a30 }
            r100 = r2
            java.util.regex.Pattern r2 = f14865x     // Catch:{ all -> 0x0a30 }
            java.lang.String r49 = m13688n(r12, r2, r9, r1)     // Catch:{ all -> 0x0a30 }
            r95 = r6
        L_0x0360:
            r12 = r97
            r6 = r98
            r7 = r99
            r2 = r100
            goto L_0x0173
        L_0x036a:
            r100 = r2
            java.lang.String r2 = "#EXT-X-SKIP"
            boolean r2 = r12.startsWith(r2)     // Catch:{ all -> 0x0a30 }
            r52 = 1
            if (r2 == 0) goto L_0x050f
            java.util.regex.Pattern r2 = f14859r     // Catch:{ all -> 0x0a30 }
            int r2 = m13682h(r12, r2)     // Catch:{ all -> 0x0a30 }
            if (r8 == 0) goto L_0x0386
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x0386
            r6 = 1
            goto L_0x0387
        L_0x0386:
            r6 = 0
        L_0x0387:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r6)     // Catch:{ all -> 0x0a30 }
            long r6 = r8.f14799f     // Catch:{ all -> 0x0a30 }
            long r6 = r34 - r6
            int r7 = (int) r6     // Catch:{ all -> 0x0a30 }
            int r2 = r2 + r7
            if (r7 < 0) goto L_0x0509
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r6 = r8.f14806m     // Catch:{ all -> 0x0a30 }
            int r6 = r6.size()     // Catch:{ all -> 0x0a30 }
            if (r2 > r6) goto L_0x0509
        L_0x039a:
            if (r7 >= r2) goto L_0x0505
            java.util.List<com.google.ads.interactivemedia.v3.internal.aha> r6 = r8.f14806m     // Catch:{ all -> 0x0a30 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.aha r6 = (com.google.ads.interactivemedia.p039v3.internal.aha) r6     // Catch:{ all -> 0x0a30 }
            r101 = r9
            long r9 = r8.f14799f     // Catch:{ all -> 0x0a30 }
            int r12 = (r34 > r9 ? 1 : (r34 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x049a
            int r9 = r8.f14798e     // Catch:{ all -> 0x0a30 }
            int r9 = r9 - r33
            int r10 = r6.f14781f     // Catch:{ all -> 0x0a30 }
            int r9 = r9 + r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0a30 }
            r10.<init>()     // Catch:{ all -> 0x0a30 }
            r54 = r2
            r50 = r86
            r12 = 0
        L_0x03bd:
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r2 = r6.f14777b     // Catch:{ all -> 0x0a30 }
            int r2 = r2.size()     // Catch:{ all -> 0x0a30 }
            if (r12 >= r2) goto L_0x0448
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r2 = r6.f14777b     // Catch:{ all -> 0x0a30 }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.agy r2 = (com.google.ads.interactivemedia.p039v3.internal.agy) r2     // Catch:{ all -> 0x0a30 }
            r102 = r5
            com.google.ads.interactivemedia.v3.internal.agy r5 = new com.google.ads.interactivemedia.v3.internal.agy     // Catch:{ all -> 0x0a30 }
            r103 = r8
            java.lang.String r8 = r2.f14778c     // Catch:{ all -> 0x0a30 }
            r55 = r11
            com.google.ads.interactivemedia.v3.internal.aha r11 = r2.f14779d     // Catch:{ all -> 0x0a30 }
            r104 = r14
            r105 = r15
            long r14 = r2.f14780e     // Catch:{ all -> 0x0a30 }
            r106 = r4
            com.google.ads.interactivemedia.v3.internal.pz r4 = r2.f14783h     // Catch:{ all -> 0x0a30 }
            r107 = r0
            java.lang.String r0 = r2.f14784i     // Catch:{ all -> 0x0a30 }
            r108 = r1
            java.lang.String r1 = r2.f14785j     // Catch:{ all -> 0x0a30 }
            r18 = r6
            r56 = r7
            long r6 = r2.f14786k     // Catch:{ all -> 0x0a30 }
            r48 = r12
            r109 = r13
            long r12 = r2.f14787l     // Catch:{ all -> 0x0a30 }
            r110 = r3
            boolean r3 = r2.f14788m     // Catch:{ all -> 0x0a30 }
            r57 = r10
            boolean r10 = r2.f14766a     // Catch:{ all -> 0x0a30 }
            r58 = r10
            boolean r10 = r2.f14767b     // Catch:{ all -> 0x0a30 }
            r68 = r5
            r69 = r8
            r70 = r11
            r71 = r14
            r73 = r9
            r74 = r50
            r76 = r4
            r77 = r0
            r78 = r1
            r79 = r6
            r81 = r12
            r83 = r3
            r84 = r58
            r85 = r10
            r68.<init>(r69, r70, r71, r73, r74, r76, r77, r78, r79, r81, r83, r84, r85)     // Catch:{ all -> 0x0a30 }
            r0 = r57
            r0.add(r5)     // Catch:{ all -> 0x0a30 }
            long r1 = r2.f14780e     // Catch:{ all -> 0x0a30 }
            long r50 = r50 + r1
            int r12 = r48 + 1
            r10 = r0
            r6 = r18
            r11 = r55
            r7 = r56
            r5 = r102
            r8 = r103
            r14 = r104
            r15 = r105
            r4 = r106
            r0 = r107
            r1 = r108
            r13 = r109
            r3 = r110
            goto L_0x03bd
        L_0x0448:
            r107 = r0
            r108 = r1
            r110 = r3
            r106 = r4
            r102 = r5
            r18 = r6
            r56 = r7
            r103 = r8
            r0 = r10
            r55 = r11
            r109 = r13
            r104 = r14
            r105 = r15
            com.google.ads.interactivemedia.v3.internal.aha r1 = new com.google.ads.interactivemedia.v3.internal.aha     // Catch:{ all -> 0x0a30 }
            java.lang.String r2 = r6.f14778c     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.aha r3 = r6.f14779d     // Catch:{ all -> 0x0a30 }
            java.lang.String r4 = r6.f14776a     // Catch:{ all -> 0x0a30 }
            long r7 = r6.f14780e     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.pz r5 = r6.f14783h     // Catch:{ all -> 0x0a30 }
            java.lang.String r10 = r6.f14784i     // Catch:{ all -> 0x0a30 }
            java.lang.String r11 = r6.f14785j     // Catch:{ all -> 0x0a30 }
            long r12 = r6.f14786k     // Catch:{ all -> 0x0a30 }
            long r14 = r6.f14787l     // Catch:{ all -> 0x0a30 }
            boolean r6 = r6.f14788m     // Catch:{ all -> 0x0a30 }
            r68 = r1
            r69 = r2
            r70 = r3
            r71 = r4
            r72 = r7
            r74 = r9
            r75 = r86
            r77 = r5
            r78 = r10
            r79 = r11
            r80 = r12
            r82 = r14
            r84 = r6
            r85 = r0
            r68.<init>(r69, r70, r71, r72, r74, r75, r77, r78, r79, r80, r82, r84, r85)     // Catch:{ all -> 0x0a30 }
            r6 = r1
            r0 = r110
            goto L_0x04b1
        L_0x049a:
            r107 = r0
            r108 = r1
            r54 = r2
            r106 = r4
            r102 = r5
            r56 = r7
            r103 = r8
            r55 = r11
            r109 = r13
            r104 = r14
            r105 = r15
            r0 = r3
        L_0x04b1:
            r0.add(r6)     // Catch:{ all -> 0x0a30 }
            long r1 = r6.f14780e     // Catch:{ all -> 0x0a30 }
            long r86 = r86 + r1
            long r1 = r6.f14787l     // Catch:{ all -> 0x0a30 }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x04c5
            long r3 = r6.f14786k     // Catch:{ all -> 0x0a30 }
            long r3 = r3 + r1
            r46 = r3
        L_0x04c5:
            int r1 = r6.f14781f     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.aha r2 = r6.f14779d     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.pz r3 = r6.f14783h     // Catch:{ all -> 0x0a30 }
            java.lang.String r10 = r6.f14784i     // Catch:{ all -> 0x0a30 }
            java.lang.String r4 = r6.f14785j     // Catch:{ all -> 0x0a30 }
            if (r4 == 0) goto L_0x04df
            java.lang.String r5 = java.lang.Long.toHexString(r88)     // Catch:{ all -> 0x0a30 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0a30 }
            if (r4 != 0) goto L_0x04dc
            goto L_0x04df
        L_0x04dc:
            r11 = r55
            goto L_0x04e2
        L_0x04df:
            java.lang.String r4 = r6.f14785j     // Catch:{ all -> 0x0a30 }
            r11 = r4
        L_0x04e2:
            long r88 = r88 + r52
            int r7 = r56 + 1
            r18 = r1
            r92 = r2
            r48 = r3
            r2 = r54
            r58 = r86
            r9 = r101
            r5 = r102
            r8 = r103
            r14 = r104
            r15 = r105
            r4 = r106
            r1 = r108
            r13 = r109
            r3 = r0
            r0 = r107
            goto L_0x039a
        L_0x0505:
            r55 = r11
            goto L_0x0360
        L_0x0509:
            com.google.ads.interactivemedia.v3.internal.ahf r0 = new com.google.ads.interactivemedia.v3.internal.ahf     // Catch:{ all -> 0x0a30 }
            r0.<init>()     // Catch:{ all -> 0x0a30 }
            throw r0     // Catch:{ all -> 0x0a30 }
        L_0x050f:
            r107 = r0
            r108 = r1
            r0 = r3
            r106 = r4
            r102 = r5
            r103 = r8
            r101 = r9
            r104 = r14
            r105 = r15
            r1 = r13
            boolean r2 = r12.startsWith(r1)     // Catch:{ all -> 0x0a30 }
            if (r2 == 0) goto L_0x0593
            java.util.regex.Pattern r2 = f14822F     // Catch:{ all -> 0x0a30 }
            r3 = r108
            java.lang.String r2 = m13686l(r12, r2, r3)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r4 = f14823G     // Catch:{ all -> 0x0a30 }
            r5 = r107
            java.lang.String r4 = m13688n(r12, r4, r5, r3)     // Catch:{ all -> 0x0a30 }
            java.lang.String r6 = "NONE"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0a30 }
            if (r6 == 0) goto L_0x054c
            r106.clear()     // Catch:{ all -> 0x0a30 }
            r10 = r25
            r11 = r10
            r48 = r11
        L_0x0547:
            r12 = r97
            r8 = r106
            goto L_0x058e
        L_0x054c:
            java.util.regex.Pattern r6 = f14826J     // Catch:{ all -> 0x0a30 }
            java.lang.String r6 = m13687m(r12, r6, r3)     // Catch:{ all -> 0x0a30 }
            boolean r7 = r5.equals(r4)     // Catch:{ all -> 0x0a30 }
            if (r7 == 0) goto L_0x056d
            java.lang.String r4 = "AES-128"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0a30 }
            if (r2 == 0) goto L_0x0569
            java.util.regex.Pattern r2 = f14825I     // Catch:{ all -> 0x0a30 }
            java.lang.String r2 = m13686l(r12, r2, r3)     // Catch:{ all -> 0x0a30 }
            r10 = r2
            r11 = r6
            goto L_0x0547
        L_0x0569:
            r11 = r6
            r10 = r25
            goto L_0x0547
        L_0x056d:
            if (r97 != 0) goto L_0x0574
            java.lang.String r2 = m13681g(r2)     // Catch:{ all -> 0x0a30 }
            goto L_0x0576
        L_0x0574:
            r2 = r97
        L_0x0576:
            com.google.ads.interactivemedia.v3.internal.py r7 = m13680f(r12, r4, r3)     // Catch:{ all -> 0x0a30 }
            if (r7 == 0) goto L_0x0588
            r8 = r106
            r8.put(r4, r7)     // Catch:{ all -> 0x0a30 }
            r12 = r2
            r11 = r6
            r10 = r25
            r48 = r10
            goto L_0x058e
        L_0x0588:
            r8 = r106
            r12 = r2
            r11 = r6
            r10 = r25
        L_0x058e:
            r13 = r1
            r1 = r3
            r4 = r8
            goto L_0x0608
        L_0x0593:
            r8 = r106
            r5 = r107
            r3 = r108
            r2 = r90
            boolean r4 = r12.startsWith(r2)     // Catch:{ all -> 0x0a30 }
            if (r4 == 0) goto L_0x05c1
            java.util.regex.Pattern r4 = f14818B     // Catch:{ all -> 0x0a30 }
            java.lang.String r4 = m13686l(r12, r4, r3)     // Catch:{ all -> 0x0a30 }
            java.lang.String[] r4 = com.google.ads.interactivemedia.p039v3.internal.amm.m14256z(r4, r7)     // Catch:{ all -> 0x0a30 }
            r6 = 0
            r7 = r4[r6]     // Catch:{ all -> 0x0a30 }
            long r66 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x0a30 }
            int r6 = r4.length     // Catch:{ all -> 0x0a30 }
            r7 = 1
            if (r6 <= r7) goto L_0x05bc
            r4 = r4[r7]     // Catch:{ all -> 0x0a30 }
            long r46 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0a30 }
        L_0x05bc:
            r13 = r1
            r90 = r2
            r1 = r3
            goto L_0x0605
        L_0x05c1:
            r4 = r23
            boolean r6 = r12.startsWith(r4)     // Catch:{ all -> 0x0a30 }
            r9 = 58
            if (r6 == 0) goto L_0x05f3
            int r6 = r12.indexOf(r9)     // Catch:{ all -> 0x0a30 }
            r7 = 1
            int r6 = r6 + r7
            java.lang.String r6 = r12.substring(r6)     // Catch:{ all -> 0x0a30 }
            int r33 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x0a30 }
            r13 = r1
            r90 = r2
            r1 = r3
            r23 = r4
            r4 = r8
            r12 = r97
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r8 = r103
            r14 = r104
            r15 = r105
            r32 = 1
            goto L_0x0616
        L_0x05f3:
            r6 = r24
            boolean r13 = r12.equals(r6)     // Catch:{ all -> 0x0a30 }
            if (r13 == 0) goto L_0x061c
            int r18 = r18 + 1
        L_0x05fd:
            r13 = r1
            r90 = r2
            r1 = r3
            r23 = r4
            r24 = r6
        L_0x0605:
            r4 = r8
            r12 = r97
        L_0x0608:
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r8 = r103
            r14 = r104
            r15 = r105
        L_0x0616:
            r3 = r0
            r0 = r5
            r5 = r102
            goto L_0x0173
        L_0x061c:
            java.lang.String r13 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r13 = r12.startsWith(r13)     // Catch:{ all -> 0x0a30 }
            if (r13 == 0) goto L_0x065c
            int r7 = (r30 > r26 ? 1 : (r30 == r26 ? 0 : -1))
            if (r7 != 0) goto L_0x063d
            int r7 = r12.indexOf(r9)     // Catch:{ all -> 0x0a30 }
            r9 = 1
            int r7 = r7 + r9
            java.lang.String r7 = r12.substring(r7)     // Catch:{ all -> 0x0a30 }
            long r12 = com.google.ads.interactivemedia.p039v3.internal.amm.m14195L(r7)     // Catch:{ all -> 0x0a30 }
            long r12 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r12)     // Catch:{ all -> 0x0a30 }
            long r30 = r12 - r86
            goto L_0x05fd
        L_0x063d:
            r12 = r112
            r109 = r1
            r90 = r2
            r108 = r3
            r23 = r4
            r107 = r5
            r24 = r6
            r13 = r19
            r1 = r40
        L_0x064f:
            r9 = r63
            r2 = r65
            r14 = r88
        L_0x0655:
            r4 = r97
        L_0x0657:
            r5 = 0
            r6 = -1
            goto L_0x09aa
        L_0x065c:
            java.lang.String r9 = "#EXT-X-GAP"
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a30 }
            if (r9 == 0) goto L_0x0680
            r13 = r1
            r90 = r2
            r1 = r3
            r23 = r4
            r24 = r6
            r4 = r8
            r12 = r97
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r8 = r103
            r14 = r104
            r15 = r105
            r62 = 1
            goto L_0x0616
        L_0x0680:
            java.lang.String r9 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a30 }
            if (r9 == 0) goto L_0x06a5
            r13 = r1
            r90 = r2
            r1 = r3
            r23 = r4
            r24 = r6
            r4 = r8
            r12 = r97
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r8 = r103
            r14 = r104
            r15 = r105
            r39 = 1
            goto L_0x0616
        L_0x06a5:
            r9 = r20
            boolean r13 = r12.equals(r9)     // Catch:{ all -> 0x0a30 }
            if (r13 == 0) goto L_0x06cc
            r13 = r1
            r90 = r2
            r1 = r3
            r23 = r4
            r24 = r6
            r4 = r8
            r20 = r9
            r12 = r97
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r8 = r103
            r14 = r104
            r15 = r105
            r44 = 1
            goto L_0x0616
        L_0x06cc:
            java.lang.String r13 = "#EXT-X-RENDITION-REPORT"
            boolean r13 = r12.startsWith(r13)     // Catch:{ all -> 0x0a30 }
            if (r13 == 0) goto L_0x0734
            int r7 = r0.size()     // Catch:{ all -> 0x0a30 }
            long r13 = (long) r7     // Catch:{ all -> 0x0a30 }
            long r13 = r34 + r13
            boolean r7 = r63.isEmpty()     // Catch:{ all -> 0x0a30 }
            r109 = r1
            r90 = r2
            long r1 = (long) r7     // Catch:{ all -> 0x0a30 }
            long r13 = r13 - r1
            java.util.regex.Pattern r1 = f14866y     // Catch:{ all -> 0x0a30 }
            long r1 = m13684j(r12, r1, r13)     // Catch:{ all -> 0x0a30 }
            boolean r7 = r63.isEmpty()     // Catch:{ all -> 0x0a30 }
            if (r7 == 0) goto L_0x06fa
            java.lang.Object r7 = com.google.ads.interactivemedia.p039v3.internal.art.m14630a(r0)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.aha r7 = (com.google.ads.interactivemedia.p039v3.internal.aha) r7     // Catch:{ all -> 0x0a30 }
            java.util.List<com.google.ads.interactivemedia.v3.internal.agy> r7 = r7.f14777b     // Catch:{ all -> 0x0a30 }
            goto L_0x06fc
        L_0x06fa:
            r7 = r63
        L_0x06fc:
            r13 = -1
            int r14 = (r42 > r21 ? 1 : (r42 == r21 ? 0 : -1))
            if (r14 == 0) goto L_0x0706
            int r7 = r7.size()     // Catch:{ all -> 0x0a30 }
            int r13 = r13 + r7
        L_0x0706:
            java.util.regex.Pattern r7 = f14867z     // Catch:{ all -> 0x0a30 }
            int r7 = m13683i(r12, r7, r13)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r13 = f14825I     // Catch:{ all -> 0x0a30 }
            java.lang.String r12 = m13686l(r12, r13, r3)     // Catch:{ all -> 0x0a30 }
            r13 = r19
            java.lang.String r12 = com.google.ads.interactivemedia.p039v3.internal.arh.m14606m(r13, r12)     // Catch:{ all -> 0x0a30 }
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.agz r14 = new com.google.ads.interactivemedia.v3.internal.agz     // Catch:{ all -> 0x0a30 }
            r14.<init>(r1, r7)     // Catch:{ all -> 0x0a30 }
            r1 = r40
            r1.put(r12, r14)     // Catch:{ all -> 0x0a30 }
            r12 = r112
            r108 = r3
            r23 = r4
            r107 = r5
            r24 = r6
            r20 = r9
            goto L_0x064f
        L_0x0734:
            r109 = r1
            r90 = r2
            r13 = r19
            r1 = r40
            java.lang.String r2 = "#EXT-X-PRELOAD-HINT"
            boolean r2 = r12.startsWith(r2)     // Catch:{ all -> 0x0a30 }
            if (r2 == 0) goto L_0x07fb
            r2 = r65
            if (r2 != 0) goto L_0x07e9
            java.lang.String r7 = "PART"
            java.util.regex.Pattern r14 = f14828L     // Catch:{ all -> 0x0a30 }
            java.lang.String r14 = m13686l(r12, r14, r3)     // Catch:{ all -> 0x0a30 }
            boolean r7 = r7.equals(r14)     // Catch:{ all -> 0x0a30 }
            if (r7 == 0) goto L_0x07e9
            java.util.regex.Pattern r2 = f14825I     // Catch:{ all -> 0x0a30 }
            java.lang.String r69 = m13686l(r12, r2, r3)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r2 = f14820D     // Catch:{ all -> 0x0a30 }
            r14 = -1
            long r19 = m13684j(r12, r2, r14)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r2 = f14821E     // Catch:{ all -> 0x0a30 }
            long r81 = m13684j(r12, r2, r14)     // Catch:{ all -> 0x0a30 }
            r14 = r88
            java.lang.String r78 = m13679e(r14, r10, r11)     // Catch:{ all -> 0x0a30 }
            if (r48 != 0) goto L_0x0795
            boolean r2 = r8.isEmpty()     // Catch:{ all -> 0x0a30 }
            if (r2 != 0) goto L_0x0795
            java.util.Collection r2 = r8.values()     // Catch:{ all -> 0x0a30 }
            r7 = 0
            com.google.ads.interactivemedia.v3.internal.py[] r12 = new com.google.ads.interactivemedia.p039v3.internal.C4275py[r7]     // Catch:{ all -> 0x0a30 }
            java.lang.Object[] r2 = r2.toArray(r12)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.py[] r2 = (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r2     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.pz r7 = new com.google.ads.interactivemedia.v3.internal.pz     // Catch:{ all -> 0x0a30 }
            r12 = r97
            r7.<init>((java.lang.String) r12, (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r2)     // Catch:{ all -> 0x0a30 }
            if (r45 != 0) goto L_0x0792
            com.google.ads.interactivemedia.v3.internal.pz r45 = m13678d(r12, r2)     // Catch:{ all -> 0x0a30 }
        L_0x0792:
            r48 = r7
            goto L_0x0797
        L_0x0795:
            r12 = r97
        L_0x0797:
            r23 = -1
            int r2 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x07a5
            int r2 = (r81 > r23 ? 1 : (r81 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x07a2
            goto L_0x07a5
        L_0x07a2:
            r65 = r25
            goto L_0x07c9
        L_0x07a5:
            com.google.ads.interactivemedia.v3.internal.agy r2 = new com.google.ads.interactivemedia.v3.internal.agy     // Catch:{ all -> 0x0a30 }
            int r7 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r7 == 0) goto L_0x07ae
            r79 = r19
            goto L_0x07b0
        L_0x07ae:
            r79 = r26
        L_0x07b0:
            r71 = 0
            r83 = 0
            r84 = 0
            r85 = 1
            r68 = r2
            r70 = r92
            r73 = r18
            r74 = r58
            r76 = r48
            r77 = r10
            r68.<init>(r69, r70, r71, r73, r74, r76, r77, r78, r79, r81, r83, r84, r85)     // Catch:{ all -> 0x0a30 }
            r65 = r2
        L_0x07c9:
            r40 = r1
            r1 = r3
            r23 = r4
            r24 = r6
            r4 = r8
            r20 = r9
            r19 = r13
            r88 = r14
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r8 = r103
            r14 = r104
            r15 = r105
            r13 = r109
            goto L_0x0616
        L_0x07e9:
            r14 = r88
            r12 = r112
            r108 = r3
            r23 = r4
            r107 = r5
            r24 = r6
            r20 = r9
            r9 = r63
            goto L_0x0655
        L_0x07fb:
            r23 = r4
            r107 = r5
            r2 = r65
            r14 = r88
            r4 = r97
            java.lang.String r5 = "#EXT-X-PART"
            boolean r5 = r12.startsWith(r5)     // Catch:{ all -> 0x0a30 }
            if (r5 == 0) goto L_0x08d6
            java.lang.String r78 = m13679e(r14, r10, r11)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r5 = f14825I     // Catch:{ all -> 0x0a30 }
            java.lang.String r69 = m13686l(r12, r5, r3)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r5 = f14853l     // Catch:{ all -> 0x0a30 }
            double r19 = m13685k(r12, r5)     // Catch:{ all -> 0x0a30 }
            r24 = r6
            double r5 = r19 * r50
            long r5 = (long) r5     // Catch:{ all -> 0x0a30 }
            r20 = r9
            java.util.regex.Pattern r9 = f14837U     // Catch:{ all -> 0x0a30 }
            boolean r9 = m13691q(r12, r9)     // Catch:{ all -> 0x0a30 }
            if (r39 == 0) goto L_0x0835
            boolean r19 = r63.isEmpty()     // Catch:{ all -> 0x0a30 }
            if (r19 == 0) goto L_0x0835
            r19 = 1
            goto L_0x0837
        L_0x0835:
            r19 = 0
        L_0x0837:
            r84 = r9 | r19
            java.util.regex.Pattern r9 = f14838V     // Catch:{ all -> 0x0a30 }
            boolean r83 = m13691q(r12, r9)     // Catch:{ all -> 0x0a30 }
            java.util.regex.Pattern r9 = f14819C     // Catch:{ all -> 0x0a30 }
            java.lang.String r9 = m13687m(r12, r9, r3)     // Catch:{ all -> 0x0a30 }
            if (r9 == 0) goto L_0x085d
            java.lang.String[] r7 = com.google.ads.interactivemedia.p039v3.internal.amm.m14256z(r9, r7)     // Catch:{ all -> 0x0a30 }
            r9 = 0
            r12 = r7[r9]     // Catch:{ all -> 0x0a30 }
            long r50 = java.lang.Long.parseLong(r12)     // Catch:{ all -> 0x0a30 }
            int r9 = r7.length     // Catch:{ all -> 0x0a30 }
            r12 = 1
            if (r9 <= r12) goto L_0x0860
            r7 = r7[r12]     // Catch:{ all -> 0x0a30 }
            long r93 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x0a30 }
            goto L_0x0860
        L_0x085d:
            r12 = 1
            r50 = -1
        L_0x0860:
            r52 = -1
            int r7 = (r50 > r52 ? 1 : (r50 == r52 ? 0 : -1))
            if (r7 != 0) goto L_0x0868
            r93 = r26
        L_0x0868:
            if (r48 != 0) goto L_0x088a
            boolean r7 = r8.isEmpty()     // Catch:{ all -> 0x0a30 }
            if (r7 != 0) goto L_0x088a
            java.util.Collection r7 = r8.values()     // Catch:{ all -> 0x0a30 }
            r9 = 0
            com.google.ads.interactivemedia.v3.internal.py[] r12 = new com.google.ads.interactivemedia.p039v3.internal.C4275py[r9]     // Catch:{ all -> 0x0a30 }
            java.lang.Object[] r7 = r7.toArray(r12)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.py[] r7 = (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r7     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.pz r9 = new com.google.ads.interactivemedia.v3.internal.pz     // Catch:{ all -> 0x0a30 }
            r9.<init>((java.lang.String) r4, (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r7)     // Catch:{ all -> 0x0a30 }
            if (r45 != 0) goto L_0x0888
            com.google.ads.interactivemedia.v3.internal.pz r45 = m13678d(r4, r7)     // Catch:{ all -> 0x0a30 }
        L_0x0888:
            r48 = r9
        L_0x088a:
            com.google.ads.interactivemedia.v3.internal.agy r7 = new com.google.ads.interactivemedia.v3.internal.agy     // Catch:{ all -> 0x0a30 }
            r85 = 0
            r68 = r7
            r70 = r92
            r71 = r5
            r73 = r18
            r74 = r58
            r76 = r48
            r77 = r10
            r79 = r93
            r81 = r50
            r68.<init>(r69, r70, r71, r73, r74, r76, r77, r78, r79, r81, r83, r84, r85)     // Catch:{ all -> 0x0a30 }
            r9 = r63
            r9.add(r7)     // Catch:{ all -> 0x0a30 }
            long r58 = r58 + r5
            r5 = -1
            int r7 = (r50 > r5 ? 1 : (r50 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x08b2
            long r93 = r93 + r50
        L_0x08b2:
            r40 = r1
            r65 = r2
            r1 = r3
            r12 = r4
            r4 = r8
            r63 = r9
            r19 = r13
            r88 = r14
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r5 = r102
            r8 = r103
            r14 = r104
            r15 = r105
            r13 = r109
            r3 = r0
            r0 = r107
            goto L_0x0173
        L_0x08d6:
            r24 = r6
            r20 = r9
            r9 = r63
            r5 = 1
            java.lang.String r6 = "#"
            boolean r6 = r12.startsWith(r6)     // Catch:{ all -> 0x0a30 }
            if (r6 != 0) goto L_0x09a4
            java.lang.String r6 = m13679e(r14, r10, r11)     // Catch:{ all -> 0x0a30 }
            long r88 = r14 + r52
            java.lang.String r7 = m13689o(r12, r3)     // Catch:{ all -> 0x0a30 }
            r12 = r112
            java.lang.Object r14 = r12.get(r7)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.aha r14 = (com.google.ads.interactivemedia.p039v3.internal.aha) r14     // Catch:{ all -> 0x0a30 }
            r50 = -1
            int r15 = (r66 > r50 ? 1 : (r66 == r50 ? 0 : -1))
            if (r15 != 0) goto L_0x0900
            r68 = r26
            goto L_0x091c
        L_0x0900:
            if (r91 == 0) goto L_0x091a
            if (r92 != 0) goto L_0x091a
            if (r14 != 0) goto L_0x091a
            com.google.ads.interactivemedia.v3.internal.aha r14 = new com.google.ads.interactivemedia.v3.internal.aha     // Catch:{ all -> 0x0a30 }
            r52 = 0
            r56 = 0
            r57 = 0
            r50 = r14
            r51 = r7
            r54 = r46
            r50.<init>(r51, r52, r54, r56, r57)     // Catch:{ all -> 0x0a30 }
            r12.put(r7, r14)     // Catch:{ all -> 0x0a30 }
        L_0x091a:
            r68 = r46
        L_0x091c:
            if (r48 != 0) goto L_0x093f
            boolean r15 = r8.isEmpty()     // Catch:{ all -> 0x0a30 }
            if (r15 != 0) goto L_0x093f
            java.util.Collection r15 = r8.values()     // Catch:{ all -> 0x0a30 }
            r108 = r3
            r5 = 0
            com.google.ads.interactivemedia.v3.internal.py[] r3 = new com.google.ads.interactivemedia.p039v3.internal.C4275py[r5]     // Catch:{ all -> 0x0a30 }
            java.lang.Object[] r3 = r15.toArray(r3)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.py[] r3 = (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r3     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.v3.internal.pz r15 = new com.google.ads.interactivemedia.v3.internal.pz     // Catch:{ all -> 0x0a30 }
            r15.<init>((java.lang.String) r4, (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r3)     // Catch:{ all -> 0x0a30 }
            if (r45 != 0) goto L_0x0944
            com.google.ads.interactivemedia.v3.internal.pz r45 = m13678d(r4, r3)     // Catch:{ all -> 0x0a30 }
            goto L_0x0944
        L_0x093f:
            r108 = r3
            r5 = 0
            r15 = r48
        L_0x0944:
            com.google.ads.interactivemedia.v3.internal.aha r3 = new com.google.ads.interactivemedia.v3.internal.aha     // Catch:{ all -> 0x0a30 }
            if (r92 == 0) goto L_0x094b
            r48 = r92
            goto L_0x094d
        L_0x094b:
            r48 = r14
        L_0x094d:
            r46 = r3
            r47 = r7
            r50 = r95
            r52 = r18
            r53 = r86
            r55 = r15
            r56 = r10
            r57 = r6
            r58 = r68
            r60 = r66
            r63 = r9
            r46.<init>(r47, r48, r49, r50, r52, r53, r55, r56, r57, r58, r60, r62, r63)     // Catch:{ all -> 0x0a30 }
            r0.add(r3)     // Catch:{ all -> 0x0a30 }
            long r58 = r86 + r95
            java.util.ArrayList r63 = new java.util.ArrayList     // Catch:{ all -> 0x0a30 }
            r63.<init>()     // Catch:{ all -> 0x0a30 }
            r6 = -1
            int r3 = (r66 > r6 ? 1 : (r66 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0978
            long r68 = r68 + r66
        L_0x0978:
            r46 = r68
            r3 = r0
            r40 = r1
            r65 = r2
            r66 = r6
            r112 = r12
            r19 = r13
            r48 = r15
            r95 = r26
            r86 = r58
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r49 = r9
            r5 = r102
            r14 = r104
            r15 = r105
            r0 = r107
            r1 = r108
            r13 = r109
            r62 = 0
            goto L_0x09cb
        L_0x09a4:
            r12 = r112
            r108 = r3
            goto L_0x0657
        L_0x09aa:
            r3 = r0
            r40 = r1
            r65 = r2
            r63 = r9
            r112 = r12
            r19 = r13
            r88 = r14
            r6 = r98
            r7 = r99
            r2 = r100
            r9 = r101
            r5 = r102
            r14 = r104
            r15 = r105
            r0 = r107
            r1 = r108
            r13 = r109
        L_0x09cb:
            r12 = r4
            r4 = r8
            r8 = r103
            goto L_0x0173
        L_0x09d1:
            r0 = r3
            r99 = r7
            r13 = r19
            r1 = r40
            r9 = r63
            r2 = r65
            r5 = 0
            if (r2 == 0) goto L_0x09e2
            r9.add(r2)     // Catch:{ all -> 0x0a30 }
        L_0x09e2:
            com.google.ads.interactivemedia.v3.internal.ahd r2 = new com.google.ads.interactivemedia.v3.internal.ahd     // Catch:{ all -> 0x0a30 }
            int r3 = (r30 > r26 ? 1 : (r30 == r26 ? 0 : -1))
            if (r3 == 0) goto L_0x09e9
            r5 = 1
        L_0x09e9:
            r16 = r2
            r18 = r13
            r19 = r99
            r20 = r28
            r22 = r30
            r24 = r32
            r25 = r33
            r26 = r34
            r28 = r36
            r29 = r37
            r31 = r42
            r33 = r39
            r34 = r44
            r35 = r5
            r36 = r45
            r37 = r0
            r38 = r9
            r39 = r64
            r40 = r1
            r16.<init>(r17, r18, r19, r20, r22, r24, r25, r26, r28, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0a30 }
            com.google.ads.interactivemedia.p039v3.internal.amm.m14248r(r41)
            r0 = r2
        L_0x0a16:
            return r0
        L_0x0a17:
            r1 = r111
            goto L_0x005b
        L_0x0a1b:
            r41 = r3
            com.google.ads.interactivemedia.p039v3.internal.amm.m14248r(r41)
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "Failed to parse the playlist, could not identify any tags."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0a28:
            com.google.ads.interactivemedia.v3.internal.acr r0 = new com.google.ads.interactivemedia.v3.internal.acr     // Catch:{ all -> 0x0a30 }
            java.lang.String r1 = "Input does not start with the #EXTM3U header."
            r0.<init>(r1)     // Catch:{ all -> 0x0a30 }
            throw r0     // Catch:{ all -> 0x0a30 }
        L_0x0a30:
            r0 = move-exception
            goto L_0x0a35
        L_0x0a32:
            r0 = move-exception
            r41 = r3
        L_0x0a35:
            com.google.ads.interactivemedia.p039v3.internal.amm.m14248r(r41)
            goto L_0x0a3a
        L_0x0a39:
            throw r0
        L_0x0a3a:
            goto L_0x0a39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.ahh.mo13517a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
