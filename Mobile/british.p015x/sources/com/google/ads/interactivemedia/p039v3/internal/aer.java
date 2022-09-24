package com.google.ads.interactivemedia.p039v3.internal;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p289c.C11539d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aer */
/* compiled from: IMASDK */
public final class aer extends DefaultHandler implements akk<aep> {

    /* renamed from: a */
    private static final Pattern f14457a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: b */
    private static final Pattern f14458b = Pattern.compile("CC([1-4])=.*");

    /* renamed from: c */
    private static final Pattern f14459c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: d */
    private static final int[] f14460d = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: e */
    private final XmlPullParserFactory f14461e;

    public aer() {
        try {
            this.f14461e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: A */
    private static int m13365A(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        aup.m14887r(i == i2);
        return i;
    }

    /* renamed from: B */
    private static long m13366B(long j, long j2) {
        if (j2 != C6540C.TIME_UNSET) {
            j = j2;
        }
        return j == Long.MAX_VALUE ? C6540C.TIME_UNSET : j;
    }

    /* renamed from: C */
    private static final long m13367C(List<afd> list, long j, long j2, int i, long j3) {
        int G = i >= 0 ? i + 1 : (int) amm.m14190G(j3 - j, j2);
        for (int i2 = 0; i2 < G; i2++) {
            list.add(new afd(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: h */
    public static void m13368h(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (arh.m14601h(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (arh.m14601h(xmlPullParser)) {
                    i++;
                } else if (arh.m14599f(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* renamed from: i */
    protected static aes m13369i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String o = m13375o(xmlPullParser, "schemeIdUri", "");
        String o2 = m13375o(xmlPullParser, "value", (String) null);
        String o3 = m13375o(xmlPullParser, TtmlNode.ATTR_ID, (String) null);
        do {
            xmlPullParser.next();
        } while (!arh.m14598e(xmlPullParser, str));
        return new aes(o, o2, o3);
    }

    /* renamed from: j */
    protected static float m13370j(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f14457a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    /* renamed from: k */
    protected static long m13371k(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return amm.m14194K(attributeValue);
    }

    /* renamed from: l */
    protected static String m13372l(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m13368h(xmlPullParser);
            }
        } while (!arh.m14598e(xmlPullParser, str));
        return str2;
    }

    /* renamed from: m */
    protected static int m13373m(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return i;
        }
        return Integer.parseInt(attributeValue);
    }

    /* renamed from: n */
    protected static long m13374n(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return Long.parseLong(attributeValue);
    }

    /* renamed from: o */
    protected static String m13375o(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r0.equals("4000") != false) goto L_0x0085;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final int m13376p(org.xmlpull.v1.XmlPullParser r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = m13375o(r8, r0, r1)
            int r2 = r0.hashCode()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = -1
            switch(r2) {
                case -1352850286: goto L_0x0032;
                case -1138141449: goto L_0x0028;
                case -986633423: goto L_0x001e;
                case 2036691300: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x003c
        L_0x0014:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003c
            r0 = 3
            goto L_0x003d
        L_0x001e:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x0028:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003c
            r0 = 2
            goto L_0x003d
        L_0x0032:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003c
            r0 = 0
            goto L_0x003d
        L_0x003c:
            r0 = -1
        L_0x003d:
            java.lang.String r2 = "value"
            if (r0 == 0) goto L_0x00a5
            if (r0 == r6) goto L_0x0095
            if (r0 == r5) goto L_0x004a
            if (r0 == r4) goto L_0x004a
        L_0x0047:
            r5 = -1
            goto L_0x00a9
        L_0x004a:
            java.lang.String r0 = r8.getAttributeValue(r1, r2)
            java.lang.String r0 = com.google.ads.interactivemedia.p039v3.internal.amm.m14186C(r0)
            if (r0 != 0) goto L_0x0055
            goto L_0x0047
        L_0x0055:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1596796: goto L_0x007b;
                case 2937391: goto L_0x0071;
                case 3094035: goto L_0x0067;
                case 3133436: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x0084
        L_0x005d:
            java.lang.String r1 = "fa01"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0084
            r3 = 3
            goto L_0x0085
        L_0x0067:
            java.lang.String r1 = "f801"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0084
            r3 = 2
            goto L_0x0085
        L_0x0071:
            java.lang.String r1 = "a000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0084
            r3 = 1
            goto L_0x0085
        L_0x007b:
            java.lang.String r1 = "4000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r3 = -1
        L_0x0085:
            if (r3 == 0) goto L_0x0093
            if (r3 == r6) goto L_0x00a9
            if (r3 == r5) goto L_0x0091
            if (r3 == r4) goto L_0x008e
            goto L_0x0047
        L_0x008e:
            r5 = 8
            goto L_0x00a9
        L_0x0091:
            r5 = 6
            goto L_0x00a9
        L_0x0093:
            r5 = 1
            goto L_0x00a9
        L_0x0095:
            int r0 = m13373m(r8, r2, r7)
            if (r0 < 0) goto L_0x0047
            int[] r1 = f14460d
            int r2 = r1.length
            r2 = 21
            if (r0 >= r2) goto L_0x0047
            r5 = r1[r0]
            goto L_0x00a9
        L_0x00a5:
            int r5 = m13373m(r8, r2, r7)
        L_0x00a9:
            r8.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r8, r0)
            if (r0 == 0) goto L_0x00a9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aer.m13376p(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: q */
    protected static final long m13377q(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: r */
    protected static final String m13378r(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return arh.m14606m(str, m13372l(xmlPullParser, "BaseURL"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final android.util.Pair<java.lang.String, com.google.ads.interactivemedia.p039v3.internal.C4275py> m13379s(org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.amm.m14186C(r1)
            int r3 = r1.hashCode()
            r4 = 489446379(0x1d2c5beb, float:2.281153E-21)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L_0x0038
            r4 = 755418770(0x2d06c692, float:7.66111E-12)
            if (r3 == r4) goto L_0x002e
            r4 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            if (r3 == r4) goto L_0x0024
            goto L_0x0042
        L_0x0024:
            java.lang.String r3 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            r1 = 0
            goto L_0x0043
        L_0x002e:
            java.lang.String r3 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            r1 = 2
            goto L_0x0043
        L_0x0038:
            java.lang.String r3 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            r1 = 1
            goto L_0x0043
        L_0x0042:
            r1 = -1
        L_0x0043:
            if (r1 == 0) goto L_0x0051
            if (r1 == r6) goto L_0x004d
            if (r1 == r5) goto L_0x004a
            goto L_0x0091
        L_0x004a:
            java.util.UUID r1 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.f17464d
            goto L_0x004f
        L_0x004d:
            java.util.UUID r1 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.f17465e
        L_0x004f:
            r3 = r0
            goto L_0x0093
        L_0x0051:
            java.lang.String r1 = "value"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            java.lang.String r3 = com.google.ads.interactivemedia.p039v3.internal.arh.m14603j(r10)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x008c
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x008c
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L_0x0073:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x0081
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0073
        L_0x0081:
            java.util.UUID r3 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.f17462b
            byte[] r4 = com.google.ads.interactivemedia.p039v3.internal.C4396uk.m19133b(r3, r4, r0)
            r5 = r0
            r9 = r3
            r3 = r1
            r1 = r9
            goto L_0x0095
        L_0x008c:
            r4 = r0
            r5 = r4
            r3 = r1
            r1 = r5
            goto L_0x0095
        L_0x0091:
            r1 = r0
            r3 = r1
        L_0x0093:
            r4 = r3
            r5 = r4
        L_0x0095:
            r10.next()
            java.lang.String r6 = "ms:laurl"
            boolean r6 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r10, r6)
            if (r6 == 0) goto L_0x00a7
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r10.getAttributeValue(r0, r5)
            goto L_0x00fa
        L_0x00a7:
            r6 = 4
            if (r4 != 0) goto L_0x00d2
            boolean r7 = com.google.ads.interactivemedia.p039v3.internal.arh.m14604k(r10)
            if (r7 == 0) goto L_0x00d2
            int r7 = r10.next()
            if (r7 != r6) goto L_0x00d2
            java.lang.String r1 = r10.getText()
            byte[] r1 = android.util.Base64.decode(r1, r2)
            java.util.UUID r4 = com.google.ads.interactivemedia.p039v3.internal.C4396uk.m19134c(r1)
            if (r4 != 0) goto L_0x00ce
            java.lang.String r1 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r1, r6)
            r1 = r4
            r4 = r0
            goto L_0x00fa
        L_0x00ce:
            r9 = r4
            r4 = r1
            r1 = r9
            goto L_0x00fa
        L_0x00d2:
            if (r4 != 0) goto L_0x00f7
            java.util.UUID r7 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.f17465e
            boolean r8 = r7.equals(r1)
            if (r8 == 0) goto L_0x00f7
            java.lang.String r8 = "mspr:pro"
            boolean r8 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r10, r8)
            if (r8 == 0) goto L_0x00f7
            int r8 = r10.next()
            if (r8 != r6) goto L_0x00f7
            java.lang.String r4 = r10.getText()
            byte[] r4 = android.util.Base64.decode(r4, r2)
            byte[] r4 = com.google.ads.interactivemedia.p039v3.internal.C4396uk.m19132a(r7, r4)
            goto L_0x00fa
        L_0x00f7:
            m13368h(r10)
        L_0x00fa:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r10, r6)
            if (r6 == 0) goto L_0x0095
            if (r1 == 0) goto L_0x010b
            com.google.ads.interactivemedia.v3.internal.py r0 = new com.google.ads.interactivemedia.v3.internal.py
            java.lang.String r10 = "video/mp4"
            r0.<init>(r1, r5, r10, r4)
        L_0x010b:
            android.util.Pair r10 = android.util.Pair.create(r3, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aer.m13379s(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: t */
    protected static final int m13380t(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if (!"text".equals(attributeValue)) {
            return -1;
        }
        return 3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final int m13381u(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r6.hashCode()
            r2 = 2
            r3 = 8
            r4 = 4
            r5 = 1
            switch(r1) {
                case -2060497896: goto L_0x007a;
                case -1724546052: goto L_0x006f;
                case -1580883024: goto L_0x0064;
                case -1408024454: goto L_0x005a;
                case 99825: goto L_0x0050;
                case 3343801: goto L_0x0046;
                case 3530173: goto L_0x003b;
                case 552573414: goto L_0x0031;
                case 899152809: goto L_0x0027;
                case 1629013393: goto L_0x001d;
                case 1855372047: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0084
        L_0x0012:
            java.lang.String r1 = "supplementary"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 2
            goto L_0x0085
        L_0x001d:
            java.lang.String r1 = "emergency"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 5
            goto L_0x0085
        L_0x0027:
            java.lang.String r1 = "commentary"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 3
            goto L_0x0085
        L_0x0031:
            java.lang.String r1 = "caption"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 6
            goto L_0x0085
        L_0x003b:
            java.lang.String r1 = "sign"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 8
            goto L_0x0085
        L_0x0046:
            java.lang.String r1 = "main"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 0
            goto L_0x0085
        L_0x0050:
            java.lang.String r1 = "dub"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 4
            goto L_0x0085
        L_0x005a:
            java.lang.String r1 = "alternate"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 1
            goto L_0x0085
        L_0x0064:
            java.lang.String r1 = "enhanced-audio-intelligibility"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 10
            goto L_0x0085
        L_0x006f:
            java.lang.String r1 = "description"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 9
            goto L_0x0085
        L_0x007a:
            java.lang.String r1 = "subtitle"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 7
            goto L_0x0085
        L_0x0084:
            r6 = -1
        L_0x0085:
            switch(r6) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x00a0;
                case 2: goto L_0x009f;
                case 3: goto L_0x009e;
                case 4: goto L_0x009b;
                case 5: goto L_0x0098;
                case 6: goto L_0x0095;
                case 7: goto L_0x0092;
                case 8: goto L_0x008f;
                case 9: goto L_0x008c;
                case 10: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            return r0
        L_0x0089:
            r6 = 2048(0x800, float:2.87E-42)
            return r6
        L_0x008c:
            r6 = 512(0x200, float:7.175E-43)
            return r6
        L_0x008f:
            r6 = 256(0x100, float:3.59E-43)
            return r6
        L_0x0092:
            r6 = 128(0x80, float:1.794E-43)
            return r6
        L_0x0095:
            r6 = 64
            return r6
        L_0x0098:
            r6 = 32
            return r6
        L_0x009b:
            r6 = 16
            return r6
        L_0x009e:
            return r3
        L_0x009f:
            return r4
        L_0x00a0:
            return r2
        L_0x00a1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aer.m13381u(java.lang.String):int");
    }

    /* renamed from: v */
    protected static long m13382v(XmlPullParser xmlPullParser, String str) throws C4144lb {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return C6540C.TIME_UNSET;
        }
        return amm.m14195L(attributeValue);
    }

    /* renamed from: w */
    protected static float m13383w(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return -3.4028235E38f;
        }
        return Float.parseFloat(attributeValue);
    }

    /* renamed from: x */
    protected static final aew m13384x(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return new aew(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return new aew(attributeValue, j2, j);
    }

    /* renamed from: y */
    protected static final int m13385y(List<aes> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if ("http://dashif.org/guidelines/trickmode".equalsIgnoreCase(list.get(i2).f14462a)) {
                i |= 16384;
            }
        }
        return i;
    }

    /* renamed from: z */
    protected static final afi m13386z(XmlPullParser xmlPullParser, String str, afi afi) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? afi.m13447a(attributeValue) : afi;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0a62 A[Catch:{ XmlPullParserException -> 0x13b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0aa6  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0ada A[Catch:{ XmlPullParserException -> 0x13b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0b00 A[Catch:{ XmlPullParserException -> 0x13b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0bb7 A[Catch:{ XmlPullParserException -> 0x13b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0bc9 A[Catch:{ XmlPullParserException -> 0x13b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0ca0 A[Catch:{ XmlPullParserException -> 0x13b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0ca3 A[Catch:{ XmlPullParserException -> 0x13b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0cf3 A[Catch:{ XmlPullParserException -> 0x13b2 }, LOOP:5: B:142:0x067b->B:333:0x0cf3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0fa0 A[Catch:{ XmlPullParserException -> 0x13b2 }, LOOP:4: B:94:0x03ae->B:405:0x0fa0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x12f4 A[Catch:{ XmlPullParserException -> 0x13b2 }, LOOP:3: B:83:0x0295->B:476:0x12f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x138f A[Catch:{ XmlPullParserException -> 0x13b2 }, LOOP:0: B:25:0x00c9->B:496:0x138f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x134f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x023b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x1295 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x0eaa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0a11 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0acb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0246 A[Catch:{ XmlPullParserException -> 0x13b2 }, LOOP:2: B:64:0x01e9->B:74:0x0246, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p039v3.internal.aep mo13517a(android.net.Uri r142, java.io.InputStream r143) throws java.io.IOException {
        /*
            r141 = this;
            r15 = r141
            java.lang.String r14 = "Period"
            java.lang.String r12 = "ServiceDescription"
            java.lang.String r13 = "ProgramInformation"
            java.lang.String r10 = "MPD"
            java.lang.String r11 = "SupplementalProperty"
            java.lang.String r8 = "EssentialProperty"
            java.lang.String r9 = "id"
            java.lang.String r6 = "BaseURL"
            org.xmlpull.v1.XmlPullParserFactory r1 = r15.f14461e     // Catch:{ XmlPullParserException -> 0x13b2 }
            org.xmlpull.v1.XmlPullParser r7 = r1.newPullParser()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r4 = 0
            r1 = r143
            r7.setInput(r1, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r1 = r7.next()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r2 = 2
            if (r1 != r2) goto L_0x13aa
            java.lang.String r1 = r7.getName()     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x13aa
            java.lang.String r1 = r142.toString()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "availabilityStartTime"
            long r17 = m13382v(r7, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "mediaPresentationDuration"
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r19 = m13371k(r7, r2, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "minBufferTime"
            long r21 = m13371k(r7, r2, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "dynamic"
            java.lang.String r3 = "type"
            r4 = 0
            java.lang.String r3 = r7.getAttributeValue(r4, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r4 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r4 == 0) goto L_0x006b
            java.lang.String r2 = "minimumUpdatePeriod"
            r23 = r10
            r24 = r11
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r2 = m13371k(r7, r2, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r25 = r2
            goto L_0x0076
        L_0x006b:
            r23 = r10
            r24 = r11
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = r10
        L_0x0076:
            if (r4 == 0) goto L_0x0081
            java.lang.String r2 = "timeShiftBufferDepth"
            long r2 = m13371k(r7, r2, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r27 = r2
            goto L_0x0083
        L_0x0081:
            r27 = r10
        L_0x0083:
            if (r4 == 0) goto L_0x008e
            java.lang.String r2 = "suggestedPresentationDelay"
            long r2 = m13371k(r7, r2, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r29 = r2
            goto L_0x0093
        L_0x008e:
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0093:
            java.lang.String r2 = "publishTime"
            long r31 = m13382v(r7, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r5 = 1
            if (r5 == r4) goto L_0x00a2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00a4
        L_0x00a2:
            r2 = 0
        L_0x00a4:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r10 = 1
            if (r10 == r4) goto L_0x00af
            r36 = 0
            goto L_0x00b4
        L_0x00af:
            r36 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00b4:
            r33 = 0
            r11 = r1
            r40 = r4
            r41 = r5
            r4 = r36
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r42 = 0
            r43 = 0
        L_0x00c9:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r6)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0129
            if (r42 != 0) goto L_0x0102
            long r1 = m13377q(r7, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = m13378r(r7, r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r45 = r1
            r11 = r3
            r76 = r6
            r15 = r7
            r78 = r8
            r79 = r12
            r74 = r13
            r1 = r14
            r132 = r23
            r77 = r24
            r44 = r40
            r2 = r41
            r42 = 1
        L_0x00f3:
            r64 = 0
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r70 = 0
            r83 = 1
            r24 = r9
            goto L_0x1347
        L_0x0102:
            r45 = r2
            r76 = r6
            r15 = r7
            r78 = r8
            r79 = r12
            r74 = r13
            r1 = r14
            r132 = r23
            r77 = r24
            r44 = r40
            r2 = r41
            r64 = 0
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r70 = 0
            r83 = 1
            r40 = r4
            r24 = r9
            r23 = r11
            goto L_0x1343
        L_0x0129:
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r10 = "lang"
            if (r1 == 0) goto L_0x0189
            java.lang.String r1 = "moreInformationURL"
            r45 = r2
            r2 = 0
            java.lang.String r51 = m13375o(r7, r1, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r52 = m13375o(r7, r10, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0141:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r10 = "Title"
            boolean r10 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r10 == 0) goto L_0x0151
            java.lang.String r3 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x016e
        L_0x0151:
            java.lang.String r10 = "Source"
            boolean r10 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r10 == 0) goto L_0x015e
            java.lang.String r1 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x016e
        L_0x015e:
            java.lang.String r10 = "Copyright"
            boolean r10 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r10 == 0) goto L_0x016b
            java.lang.String r2 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x016e
        L_0x016b:
            m13368h(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x016e:
            boolean r10 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r7, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r10 == 0) goto L_0x0141
            com.google.ads.interactivemedia.v3.internal.aev r10 = new com.google.ads.interactivemedia.v3.internal.aev     // Catch:{ XmlPullParserException -> 0x13b2 }
            r47 = r10
            r48 = r3
            r49 = r1
            r50 = r2
            r47.<init>(r48, r49, r50, r51, r52)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r76 = r6
            r15 = r7
            r78 = r8
            r36 = r10
            goto L_0x01bf
        L_0x0189:
            r45 = r2
            java.lang.String r1 = "UTCTiming"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = "value"
            java.lang.String r2 = "schemeIdUri"
            if (r1 == 0) goto L_0x01a8
            r1 = 0
            java.lang.String r2 = r7.getAttributeValue(r1, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = r7.getAttributeValue(r1, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.afj r1 = new com.google.ads.interactivemedia.v3.internal.afj     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1.<init>(r2, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r37 = r1
            goto L_0x01ba
        L_0x01a8:
            java.lang.String r1 = "Location"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x01ce
            java.lang.String r1 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r38 = r1
        L_0x01ba:
            r76 = r6
            r15 = r7
            r78 = r8
        L_0x01bf:
            r79 = r12
            r74 = r13
            r1 = r14
            r132 = r23
            r77 = r24
            r44 = r40
            r2 = r41
            goto L_0x00f3
        L_0x01ce:
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0251
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r47 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r51 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01e9:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = "Latency"
            boolean r3 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x020f
            java.lang.String r3 = "target"
            r10 = r1
            r39 = r2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r47 = m13374n(r7, r3, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = "min"
            long r49 = m13374n(r7, r3, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = "max"
            long r51 = m13374n(r7, r3, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x022b
        L_0x020f:
            r10 = r1
            r39 = r2
            java.lang.String r1 = "PlaybackRate"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x022b
            java.lang.String r1 = "min"
            float r1 = m13383w(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "max"
            float r2 = m13383w(r7, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r60 = r1
            r61 = r2
            goto L_0x022f
        L_0x022b:
            r60 = r10
            r61 = r39
        L_0x022f:
            r54 = r47
            r56 = r49
            r58 = r51
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r7, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0246
            com.google.ads.interactivemedia.v3.internal.afg r1 = new com.google.ads.interactivemedia.v3.internal.afg     // Catch:{ XmlPullParserException -> 0x13b2 }
            r53 = r1
            r53.<init>(r54, r56, r58, r60, r61)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r39 = r1
            goto L_0x01ba
        L_0x0246:
            r47 = r54
            r49 = r56
            r51 = r58
            r1 = r60
            r2 = r61
            goto L_0x01e9
        L_0x0251:
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x131d
            if (r43 != 0) goto L_0x131d
            r1 = 0
            java.lang.String r48 = r7.getAttributeValue(r1, r9)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r1 = "start"
            long r49 = m13371k(r7, r1, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r51 = r4
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0272
            long r53 = r17 + r49
            goto L_0x0274
        L_0x0272:
            r53 = r4
        L_0x0274:
            java.lang.String r1 = "duration"
            long r55 = m13371k(r7, r1, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r47 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r14.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r58 = r4
            r61 = r12
            r62 = r13
            r142 = r14
            r12 = r45
            r57 = 0
            r60 = 0
            r14 = r11
        L_0x0295:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r63 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r6)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r63 == 0) goto L_0x0308
            if (r60 != 0) goto L_0x02d7
            long r12 = m13377q(r7, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r14 = m13378r(r7, r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r16 = r142
            r69 = r1
            r66 = r2
            r35 = r3
            r67 = r4
            r76 = r6
            r15 = r7
            r78 = r8
            r34 = r10
            r132 = r23
            r77 = r24
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r79 = r61
            r74 = r62
            r60 = 1
            r64 = 0
            r70 = 0
            r83 = 1
            r24 = r9
            r23 = r11
            goto L_0x128d
        L_0x02d7:
            r16 = r142
            r69 = r1
            r66 = r2
            r35 = r3
            r67 = r4
            r76 = r6
            r15 = r7
            r78 = r8
            r34 = r10
            r132 = r23
            r77 = r24
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r79 = r61
            r74 = r62
            r64 = 0
            r70 = 0
            r83 = 1
            r24 = r9
            r23 = r11
            r61 = r12
            r47 = r14
            goto L_0x1289
        L_0x0308:
            java.lang.String r4 = "AdaptationSet"
            boolean r4 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r5 = "SegmentTemplate"
            r143 = r14
            java.lang.String r14 = "SegmentList"
            r65 = r12
            java.lang.String r12 = "SegmentBase"
            if (r4 == 0) goto L_0x0fef
            r13 = -1
            int r68 = m13373m(r7, r9, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r4 = m13380t(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r13 = "mimeType"
            r69 = r1
            r1 = 0
            java.lang.String r13 = r7.getAttributeValue(r1, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r70 = r2
            java.lang.String r2 = "codecs"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r1 = "width"
            r71 = r3
            r3 = -1
            int r1 = m13373m(r7, r1, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r72 = r4
            java.lang.String r4 = "height"
            int r4 = m13373m(r7, r4, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = m13370j(r7, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r73 = r5
            java.lang.String r5 = "audioSamplingRate"
            r74 = r11
            r11 = -1
            int r5 = m13373m(r7, r5, r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r11 = 0
            java.lang.String r75 = r7.getAttributeValue(r11, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r76 = r14
            java.lang.String r14 = "label"
            java.lang.String r14 = r7.getAttributeValue(r11, r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r77 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r14.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r78 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r14.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r79 = r12
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r12.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r80 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r81 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r86 = r1
            r85 = r2
            r83 = r4
            r90 = r13
            r87 = r57
            r88 = r58
            r1 = r65
            r4 = r75
            r82 = r77
            r75 = 0
            r84 = 0
            r13 = r143
            r77 = r3
            r3 = r72
            r72 = -1
        L_0x03ae:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r91 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r6)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r91 == 0) goto L_0x046b
            if (r84 != 0) goto L_0x0414
            long r1 = m13377q(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r13 = m13378r(r7, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r134 = r142
            r125 = r4
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r23 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r52 = r80
            r71 = r81
            r5 = r82
            r51 = r83
            r70 = r85
            r69 = r86
            r35 = -1
            r83 = 1
            r84 = 1
        L_0x03fb:
            r47 = r143
            r76 = r6
            r78 = r8
            r73 = r14
            r77 = r24
            r79 = r61
            r74 = r62
            r61 = r65
            r65 = r90
            r66 = r12
            r24 = r15
            r15 = r7
            goto L_0x0ea2
        L_0x0414:
            r134 = r142
            r16 = r3
            r125 = r4
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r67 = r13
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r23 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r52 = r80
            r71 = r81
            r51 = r83
            r70 = r85
            r69 = r86
            r35 = -1
            r83 = 1
            r47 = r143
            r85 = r1
            r76 = r6
            r78 = r8
            r73 = r14
            r77 = r24
            r79 = r61
            r74 = r62
            r61 = r65
            r1 = r88
        L_0x0462:
            r65 = r90
            r66 = r12
            r24 = r15
            r15 = r7
            goto L_0x0e98
        L_0x046b:
            r91 = r1
            java.lang.String r1 = "ContentProtection"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x04c6
            android.util.Pair r1 = m13379s(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Object r2 = r1.first     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x0481
            r75 = r2
            java.lang.String r75 = (java.lang.String) r75     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0481:
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x048a
            com.google.ads.interactivemedia.v3.internal.py r1 = (com.google.ads.interactivemedia.p039v3.internal.C4275py) r1     // Catch:{ XmlPullParserException -> 0x13b2 }
            r11.add(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x048a:
            r134 = r142
        L_0x048c:
            r125 = r4
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r23 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r52 = r80
            r71 = r81
            r5 = r82
            r51 = r83
            r70 = r85
            r69 = r86
            r1 = r91
            r35 = -1
            r83 = 1
            goto L_0x03fb
        L_0x04c6:
            java.lang.String r1 = "ContentComponent"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x04ed
            r1 = 0
            java.lang.String r2 = r7.getAttributeValue(r1, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r4 != 0) goto L_0x04d7
            r4 = r2
            goto L_0x04e1
        L_0x04d7:
            if (r2 != 0) goto L_0x04da
            goto L_0x04e1
        L_0x04da:
            boolean r1 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x04e1:
            int r1 = m13380t(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r1 = m13365A(r3, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r134 = r142
            r3 = r1
            goto L_0x048c
        L_0x04ed:
            java.lang.String r1 = "Role"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x054e
            java.lang.String r1 = "Role"
            com.google.ads.interactivemedia.v3.internal.aes r1 = m13369i(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r15.add(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x04fe:
            r134 = r142
            r16 = r3
            r125 = r4
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r67 = r13
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r23 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r52 = r80
            r71 = r81
            r51 = r83
            r70 = r85
            r69 = r86
            r1 = r88
            r85 = r91
            r35 = -1
            r83 = 1
            r47 = r143
            r76 = r6
            r78 = r8
            r73 = r14
            r77 = r24
            r79 = r61
            r74 = r62
            r61 = r65
            goto L_0x0462
        L_0x054e:
            java.lang.String r1 = "AudioChannelConfiguration"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0560
            int r1 = m13376p(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r134 = r142
            r72 = r1
            goto L_0x048c
        L_0x0560:
            java.lang.String r1 = "Accessibility"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0572
            java.lang.String r1 = "Accessibility"
            com.google.ads.interactivemedia.v3.internal.aes r1 = m13369i(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r14.add(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x04fe
        L_0x0572:
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r8)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0581
            com.google.ads.interactivemedia.v3.internal.aes r1 = m13369i(r7, r8)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r12.add(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x04fe
        L_0x0581:
            r2 = r24
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x05e7
            com.google.ads.interactivemedia.v3.internal.aes r1 = m13369i(r7, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r5.add(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r134 = r142
            r16 = r3
            r125 = r4
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r67 = r13
            r24 = r15
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r23 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r52 = r80
            r71 = r81
            r51 = r83
            r70 = r85
            r69 = r86
            r85 = r91
            r35 = -1
            r83 = 1
            r47 = r143
            r77 = r2
            r76 = r6
            r15 = r7
            r78 = r8
            r73 = r14
            r79 = r61
            r74 = r62
            r61 = r65
            r1 = r88
            r65 = r90
            r66 = r12
            goto L_0x0e98
        L_0x05e7:
            java.lang.String r1 = "Representation"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r24 = r15
            java.lang.String r15 = "InbandEventStream"
            if (r1 == 0) goto L_0x0d60
            r16 = r15
            r1 = 0
            java.lang.String r15 = r7.getAttributeValue(r1, r9)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r1 = "bandwidth"
            r93 = r13
            r13 = -1
            int r1 = m13373m(r7, r1, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r13 = "mimeType"
            r94 = r14
            r14 = r90
            java.lang.String r13 = m13375o(r7, r13, r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r90 = r1
            java.lang.String r1 = "codecs"
            r95 = r2
            r2 = r85
            java.lang.String r1 = m13375o(r7, r1, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r85 = r1
            java.lang.String r1 = "width"
            r96 = r2
            r2 = r86
            int r1 = m13373m(r7, r1, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r86 = r1
            java.lang.String r1 = "height"
            r97 = r4
            r4 = r83
            int r1 = m13373m(r7, r1, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r83 = r3
            r3 = r81
            r81 = r15
            float r15 = m13370j(r7, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r98 = r1
            java.lang.String r1 = "audioSamplingRate"
            r99 = r4
            r4 = r80
            int r1 = m13373m(r7, r1, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r80 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r105 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r106 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r15.<init>(r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r100 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r15.<init>(r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r110 = r1
            r109 = r2
            r111 = r12
            r103 = r14
            r104 = r15
            r107 = r72
            r108 = r87
            r1 = r88
            r14 = r91
            r12 = r93
            r101 = 0
            r102 = 0
        L_0x067b:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r112 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r6)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r112 == 0) goto L_0x0764
            if (r102 != 0) goto L_0x06fc
            long r14 = m13377q(r7, r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r12 = m13378r(r7, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r134 = r142
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r23 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r133 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r67 = r93
            r70 = r96
            r125 = r97
            r118 = r98
            r51 = r99
            r5 = r101
            r9 = r107
            r69 = r109
            r119 = r110
            r35 = -1
            r102 = 1
            r47 = r143
            r71 = r3
            r52 = r4
            r76 = r6
            r93 = r12
            r73 = r13
            r77 = r14
            r3 = r16
        L_0x06e0:
            r79 = r61
            r74 = r62
            r61 = r65
            r90 = r85
            r85 = r91
            r12 = r95
        L_0x06ec:
            r65 = r103
            r4 = r105
            r6 = r106
            r66 = r111
            r15 = r7
            r14 = r8
            r7 = r100
            r8 = r104
            goto L_0x0a09
        L_0x06fc:
            r134 = r142
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r23 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r133 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r67 = r93
            r70 = r96
            r125 = r97
            r118 = r98
            r51 = r99
            r69 = r109
            r119 = r110
            r35 = -1
            r47 = r143
            r71 = r3
            r52 = r4
            r76 = r6
            r93 = r12
            r73 = r13
            r77 = r14
            r3 = r16
            r79 = r61
            r74 = r62
            r61 = r65
            r90 = r85
            r85 = r91
            r12 = r95
            r65 = r103
            r4 = r105
            r6 = r106
            r66 = r111
            r15 = r7
            r14 = r8
            r7 = r100
            r8 = r104
            goto L_0x0a05
        L_0x0764:
            r112 = r3
            java.lang.String r3 = "AudioChannelConfiguration"
            boolean r3 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x07c4
            int r107 = m13376p(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r134 = r142
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r3 = r16
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r23 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r133 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r67 = r93
            r70 = r96
            r125 = r97
            r118 = r98
            r51 = r99
            r5 = r101
            r9 = r107
            r69 = r109
            r119 = r110
            r71 = r112
            r35 = -1
            r47 = r143
            r52 = r4
            r76 = r6
            r93 = r12
            r73 = r13
            r77 = r14
            goto L_0x06e0
        L_0x07c4:
            r3 = r79
            boolean r79 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r79 == 0) goto L_0x083d
            r79 = r3
            r3 = r108
            com.google.ads.interactivemedia.v3.internal.afe r3 = (com.google.ads.interactivemedia.p039v3.internal.afe) r3     // Catch:{ XmlPullParserException -> 0x0838 }
            r113 = r12
            r12 = r141
            com.google.ads.interactivemedia.v3.internal.afe r108 = r12.mo13570c(r7, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r134 = r142
            r64 = r5
            r128 = r9
            r34 = r10
            r130 = r11
            r3 = r16
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r23 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r133 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r67 = r93
            r12 = r95
            r70 = r96
            r125 = r97
            r118 = r98
            r51 = r99
            r5 = r101
            r9 = r107
            r69 = r109
            r119 = r110
            r71 = r112
            r93 = r113
            r35 = -1
            r47 = r143
            r52 = r4
            r76 = r6
            r73 = r13
            r77 = r14
            r79 = r61
            r74 = r62
            r61 = r65
            r90 = r85
            r85 = r91
            goto L_0x06ec
        L_0x0838:
            r0 = move-exception
            r12 = r141
            goto L_0x13b3
        L_0x083d:
            r79 = r3
            r113 = r12
            r12 = r141
            r3 = r76
            boolean r76 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r7, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r76 == 0) goto L_0x08e3
            long r114 = m13377q(r7, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r76 = r108
            com.google.ads.interactivemedia.v3.internal.afb r76 = (com.google.ads.interactivemedia.p039v3.internal.afb) r76     // Catch:{ XmlPullParserException -> 0x13b2 }
            r2 = r69
            r117 = r86
            r116 = r90
            r118 = r98
            r69 = r109
            r119 = r110
            r90 = r85
            r85 = r91
            r91 = 0
            r1 = r141
            r120 = r2
            r121 = r70
            r92 = r95
            r70 = r96
            r2 = r7
            r124 = r71
            r122 = r77
            r123 = r83
            r71 = r112
            r77 = r3
            r3 = r76
            r64 = r5
            r44 = r40
            r63 = r41
            r40 = r51
            r126 = r73
            r125 = r97
            r51 = r99
            r52 = r4
            r4 = r53
            r76 = r6
            r127 = r7
            r6 = r55
            r129 = r8
            r128 = r9
            r8 = r14
            r34 = r10
            r130 = r11
            r132 = r23
            r23 = r74
            r131 = r92
            r10 = r114
            r73 = r13
            r74 = r62
            r133 = r79
            r67 = r93
            r93 = r113
            r35 = -1
            r79 = r61
            r61 = r65
            r65 = r103
            r66 = r111
            r12 = r27
            com.google.ads.interactivemedia.v3.internal.afb r108 = r1.mo13571d(r2, r3, r4, r6, r8, r10, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r134 = r142
            r3 = r16
            r136 = r47
            r137 = r77
            r135 = r78
            r7 = r100
            r5 = r101
            r8 = r104
            r4 = r105
            r6 = r106
            r9 = r107
            r1 = r114
            r12 = r131
            r47 = r143
            r77 = r14
            r15 = r127
            r14 = r129
            goto L_0x0a09
        L_0x08e3:
            r64 = r5
            r76 = r6
            r129 = r8
            r128 = r9
            r34 = r10
            r130 = r11
            r132 = r23
            r44 = r40
            r63 = r41
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r23 = r74
            r122 = r77
            r133 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r67 = r93
            r131 = r95
            r70 = r96
            r125 = r97
            r118 = r98
            r51 = r99
            r69 = r109
            r119 = r110
            r71 = r112
            r93 = r113
            r35 = -1
            r77 = r3
            r52 = r4
            r73 = r13
            r79 = r61
            r74 = r62
            r61 = r65
            r90 = r85
            r85 = r91
            r65 = r103
            r66 = r111
            r13 = r7
            r11 = r126
            boolean r3 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r13, r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0980
            long r91 = m13377q(r13, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r108
            com.google.ads.interactivemedia.v3.internal.afc r3 = (com.google.ads.interactivemedia.p039v3.internal.afc) r3     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1 = r141
            r2 = r13
            r4 = r64
            r5 = r53
            r7 = r55
            r9 = r14
            r95 = r14
            r15 = r11
            r11 = r91
            r134 = r142
            r126 = r15
            r136 = r47
            r137 = r77
            r135 = r78
            r77 = r95
            r47 = r143
            r15 = r13
            r13 = r27
            com.google.ads.interactivemedia.v3.internal.afc r108 = r1.mo13572e(r2, r3, r4, r5, r7, r9, r11, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r16
            r1 = r91
            r7 = r100
            r5 = r101
            r8 = r104
            r4 = r105
        L_0x0976:
            r6 = r106
            r9 = r107
            r14 = r129
            r12 = r131
            goto L_0x0a09
        L_0x0980:
            r134 = r142
            r126 = r11
            r136 = r47
            r137 = r77
            r135 = r78
            r47 = r143
            r77 = r14
            r15 = r13
            java.lang.String r3 = "ContentProtection"
            boolean r3 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x09ba
            android.util.Pair r3 = m13379s(r15)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Object r4 = r3.first     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r4 == 0) goto L_0x09a3
            r101 = r4
            java.lang.String r101 = (java.lang.String) r101     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x09a3:
            java.lang.Object r3 = r3.second     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x09af
            com.google.ads.interactivemedia.v3.internal.py r3 = (com.google.ads.interactivemedia.p039v3.internal.C4275py) r3     // Catch:{ XmlPullParserException -> 0x13b2 }
            r4 = r105
            r4.add(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x09b1
        L_0x09af:
            r4 = r105
        L_0x09b1:
            r3 = r16
            r7 = r100
            r5 = r101
            r8 = r104
            goto L_0x0976
        L_0x09ba:
            r4 = r105
            r3 = r16
            boolean r5 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r5 == 0) goto L_0x09d6
            com.google.ads.interactivemedia.v3.internal.aes r5 = m13369i(r15, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r6 = r106
            r6.add(r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r7 = r100
            r8 = r104
            r14 = r129
        L_0x09d3:
            r12 = r131
            goto L_0x0a05
        L_0x09d6:
            r6 = r106
            r14 = r129
            boolean r5 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r5 == 0) goto L_0x09ec
            com.google.ads.interactivemedia.v3.internal.aes r5 = m13369i(r15, r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r7 = r100
            r7.add(r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r8 = r104
            goto L_0x09d3
        L_0x09ec:
            r7 = r100
            r12 = r131
            boolean r5 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r5 == 0) goto L_0x0a00
            com.google.ads.interactivemedia.v3.internal.aes r5 = m13369i(r15, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r8 = r104
            r8.add(r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0a05
        L_0x0a00:
            r8 = r104
            m13368h(r15)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0a05:
            r5 = r101
            r9 = r107
        L_0x0a09:
            java.lang.String r10 = "Representation"
            boolean r10 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r15, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r10 == 0) goto L_0x0cf3
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14031a(r73)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0a1e
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14038h(r90)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0a1b:
            r10 = r73
            goto L_0x0a5a
        L_0x0a1e:
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14032b(r73)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0a29
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14035e(r90)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0a1b
        L_0x0a29:
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14033c(r73)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0a40
            java.lang.String r1 = "application/x-rawcc"
            r10 = r73
            boolean r1 = r1.equals(r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0a3e
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14039i(r90)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0a5a
        L_0x0a3e:
            r1 = r10
            goto L_0x0a5a
        L_0x0a40:
            r10 = r73
            java.lang.String r1 = "application/mp4"
            boolean r1 = r1.equals(r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0a59
            java.lang.String r1 = com.google.ads.interactivemedia.p039v3.internal.aln.m14040j(r90)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "text/vtt"
            boolean r2 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x0a5a
            java.lang.String r1 = "application/x-mp4-vtt"
            goto L_0x0a5a
        L_0x0a59:
            r1 = 0
        L_0x0a5a:
            java.lang.String r2 = "audio/eac3"
            boolean r2 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x0a9d
            r1 = 0
        L_0x0a63:
            int r2 = r8.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 >= r2) goto L_0x0a9b
            java.lang.Object r2 = r8.get(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.aes r2 = (com.google.ads.interactivemedia.p039v3.internal.aes) r2     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = r2.f14462a     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r11 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r11 = r11.equals(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r11 == 0) goto L_0x0a83
            java.lang.String r11 = "JOC"
            java.lang.String r13 = r2.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r11 = r11.equals(r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r11 != 0) goto L_0x0a95
        L_0x0a83:
            java.lang.String r11 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r3 = r11.equals(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0a98
            java.lang.String r3 = "ec+3"
            java.lang.String r2 = r2.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r2 = r3.equals(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x0a98
        L_0x0a95:
            java.lang.String r1 = "audio/eac3-joc"
            goto L_0x0a9d
        L_0x0a98:
            int r1 = r1 + 1
            goto L_0x0a63
        L_0x0a9b:
            java.lang.String r1 = "audio/eac3"
        L_0x0a9d:
            r2 = 0
        L_0x0a9e:
            int r3 = r24.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r11 = "urn:mpeg:dash:role:2011"
            if (r2 >= r3) goto L_0x0acb
            r13 = r24
            java.lang.Object r3 = r13.get(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.aes r3 = (com.google.ads.interactivemedia.p039v3.internal.aes) r3     // Catch:{ XmlPullParserException -> 0x13b2 }
            r131 = r12
            java.lang.String r12 = r3.f14462a     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r12 = r11.equalsIgnoreCase(r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r12 == 0) goto L_0x0ac4
            java.lang.String r12 = "main"
            java.lang.String r3 = r3.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r3 = r12.equals(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0ac4
            r2 = 1
            goto L_0x0ad0
        L_0x0ac4:
            int r2 = r2 + 1
            r24 = r13
            r12 = r131
            goto L_0x0a9e
        L_0x0acb:
            r131 = r12
            r13 = r24
            r2 = 0
        L_0x0ad0:
            r129 = r14
            r3 = 0
            r12 = 0
        L_0x0ad4:
            int r14 = r13.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 >= r14) goto L_0x0af6
            java.lang.Object r14 = r13.get(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.aes r14 = (com.google.ads.interactivemedia.p039v3.internal.aes) r14     // Catch:{ XmlPullParserException -> 0x13b2 }
            r24 = r13
            java.lang.String r13 = r14.f14462a     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r13 = r11.equalsIgnoreCase(r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r13 == 0) goto L_0x0af1
            java.lang.String r13 = r14.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r13 = m13381u(r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r12 = r12 | r13
        L_0x0af1:
            int r3 = r3 + 1
            r13 = r24
            goto L_0x0ad4
        L_0x0af6:
            r24 = r13
            r3 = 0
            r13 = 0
        L_0x0afa:
            int r14 = r94.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 >= r14) goto L_0x0b7a
            r14 = r94
            java.lang.Object r16 = r14.get(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r127 = r15
            r15 = r16
            com.google.ads.interactivemedia.v3.internal.aes r15 = (com.google.ads.interactivemedia.p039v3.internal.aes) r15     // Catch:{ XmlPullParserException -> 0x13b2 }
            r106 = r6
            java.lang.String r6 = r15.f14462a     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r6 = r11.equalsIgnoreCase(r6)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x0b20
            java.lang.String r6 = r15.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r6 = m13381u(r6)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r13 = r13 | r6
            r142 = r11
            goto L_0x0b6f
        L_0x0b20:
            java.lang.String r6 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            r142 = r11
            java.lang.String r11 = r15.f14462a     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r6 = r6.equalsIgnoreCase(r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x0b6f
            java.lang.String r6 = r15.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 != 0) goto L_0x0b32
        L_0x0b30:
            r6 = 0
            goto L_0x0b6e
        L_0x0b32:
            int r11 = r6.hashCode()     // Catch:{ XmlPullParserException -> 0x13b2 }
            switch(r11) {
                case 49: goto L_0x0b64;
                case 50: goto L_0x0b59;
                case 51: goto L_0x0b4f;
                case 52: goto L_0x0b44;
                case 53: goto L_0x0b39;
                case 54: goto L_0x0b3a;
                default: goto L_0x0b39;
            }     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0b39:
            goto L_0x0b30
        L_0x0b3a:
            java.lang.String r11 = "6"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x0b30
            r6 = 1
            goto L_0x0b6e
        L_0x0b44:
            java.lang.String r11 = "4"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x0b30
            r6 = 8
            goto L_0x0b6e
        L_0x0b4f:
            java.lang.String r11 = "3"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x0b30
            r6 = 4
            goto L_0x0b6e
        L_0x0b59:
            java.lang.String r11 = "2"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x0b30
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0b6e
        L_0x0b64:
            java.lang.String r11 = "1"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x0b30
            r6 = 512(0x200, float:7.175E-43)
        L_0x0b6e:
            r13 = r13 | r6
        L_0x0b6f:
            int r3 = r3 + 1
            r11 = r142
            r94 = r14
            r6 = r106
            r15 = r127
            goto L_0x0afa
        L_0x0b7a:
            r106 = r6
            r127 = r15
            r14 = r94
            r3 = r12 | r13
            int r6 = m13385y(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r3 | r6
            int r6 = m13385y(r8)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r3 | r6
            com.google.ads.interactivemedia.v3.internal.kd r6 = new com.google.ads.interactivemedia.v3.internal.kd     // Catch:{ XmlPullParserException -> 0x13b2 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r11 = r81
            r6.mo16107S(r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r6.mo16099K(r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r6.mo16120ae(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r12 = r90
            r6.mo16097I(r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r13 = r116
            r6.mo16114Z(r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r6.mo16122ag(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r6.mo16118ac(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r15 = r125
            r6.mo16110V(r15)     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.aln.m14032b(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x0bc9
            r2 = r117
            r6.mo16125aj(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1 = r118
            r6.mo16105Q(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1 = r80
            r6.mo16104P(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0bc6:
            r7 = 1
            goto L_0x0c9a
        L_0x0bc9:
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.aln.m14031a(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x0bd8
            r6.mo16096H(r9)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1 = r119
            r6.mo16121af(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0bc6
        L_0x0bd8:
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.aln.m14033c(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x0bc6
            java.lang.String r2 = "application/cea-608"
            boolean r2 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x0c3d
            r1 = 0
        L_0x0be7:
            int r2 = r14.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 >= r2) goto L_0x0c3b
            java.lang.Object r2 = r14.get(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.aes r2 = (com.google.ads.interactivemedia.p039v3.internal.aes) r2     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = "urn:scte:dash:cc:cea-608:2015"
            java.lang.String r7 = r2.f14462a     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r3 = r3.equals(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0c37
            java.lang.String r3 = r2.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0c37
            java.util.regex.Pattern r7 = f14458b     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.util.regex.Matcher r3 = r7.matcher(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r7 = r3.matches()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r7 == 0) goto L_0x0c18
            r7 = 1
            java.lang.String r1 = r3.group(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r13 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0c97
        L_0x0c18:
            r7 = 1
            java.lang.String r3 = "MpdParser"
            java.lang.String r8 = "Unable to parse CEA-608 channel number from: "
            java.lang.String r2 = r2.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r9 = r2.length()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r9 == 0) goto L_0x0c2e
            java.lang.String r2 = r8.concat(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0c33
        L_0x0c2e:
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x13b2 }
            r2.<init>(r8)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0c33:
            android.util.Log.w(r3, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0c38
        L_0x0c37:
            r7 = 1
        L_0x0c38:
            int r1 = r1 + 1
            goto L_0x0be7
        L_0x0c3b:
            r7 = 1
            goto L_0x0c96
        L_0x0c3d:
            r7 = 1
            java.lang.String r2 = "application/cea-708"
            boolean r1 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0c96
            r1 = 0
        L_0x0c47:
            int r2 = r14.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 >= r2) goto L_0x0c96
            java.lang.Object r2 = r14.get(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.aes r2 = (com.google.ads.interactivemedia.p039v3.internal.aes) r2     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r3 = "urn:scte:dash:cc:cea-708:2015"
            java.lang.String r8 = r2.f14462a     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r3 = r3.equals(r8)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0c93
            java.lang.String r3 = r2.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0c93
            java.util.regex.Pattern r8 = f14459c     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.util.regex.Matcher r3 = r8.matcher(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r8 = r3.matches()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r8 == 0) goto L_0x0c76
            java.lang.String r1 = r3.group(r7)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r13 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0c97
        L_0x0c76:
            java.lang.String r3 = "MpdParser"
            java.lang.String r8 = "Unable to parse CEA-708 service block number from: "
            java.lang.String r2 = r2.f14463b     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r9 = r2.length()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r9 == 0) goto L_0x0c8b
            java.lang.String r2 = r8.concat(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0c90
        L_0x0c8b:
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x13b2 }
            r2.<init>(r8)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0c90:
            android.util.Log.w(r3, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0c93:
            int r1 = r1 + 1
            goto L_0x0c47
        L_0x0c96:
            r13 = -1
        L_0x0c97:
            r6.mo16094F(r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0c9a:
            com.google.ads.interactivemedia.v3.internal.ke r101 = r6.mo16115a()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r108 == 0) goto L_0x0ca3
            r103 = r108
            goto L_0x0cb6
        L_0x0ca3:
            com.google.ads.interactivemedia.v3.internal.afe r1 = new com.google.ads.interactivemedia.v3.internal.afe     // Catch:{ XmlPullParserException -> 0x13b2 }
            r110 = 0
            r111 = 1
            r113 = 0
            r115 = 0
            r117 = 0
            r109 = r1
            r109.<init>(r110, r111, r113, r115, r117)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r103 = r1
        L_0x0cb6:
            com.google.ads.interactivemedia.v3.internal.aeq r1 = new com.google.ads.interactivemedia.v3.internal.aeq     // Catch:{ XmlPullParserException -> 0x13b2 }
            r100 = r1
            r102 = r93
            r104 = r5
            r105 = r4
            r100.<init>(r101, r102, r103, r104, r105, r106)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.ke r2 = r1.f14450a     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = r2.f17681l     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r2 = com.google.ads.interactivemedia.p039v3.internal.aln.m14042l(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r6 = r123
            int r2 = m13365A(r6, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r122
            r3.add(r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r122 = r3
            r73 = r14
            r125 = r15
            r13 = r67
            r5 = r82
            r140 = r126
            r15 = r127
            r78 = r129
            r77 = r131
            r139 = r133
            r4 = r135
            r138 = r137
            r83 = 1
            r3 = r2
            goto L_0x0ea0
        L_0x0cf3:
            r127 = r15
            r16 = r3
            r105 = r4
            r101 = r5
            r106 = r6
            r100 = r7
            r104 = r8
            r107 = r9
            r95 = r12
            r8 = r14
            r10 = r34
            r143 = r47
            r99 = r51
            r4 = r52
            r5 = r64
            r103 = r65
            r111 = r66
            r109 = r69
            r96 = r70
            r3 = r71
            r13 = r73
            r6 = r76
            r14 = r77
            r91 = r85
            r85 = r90
            r12 = r93
            r90 = r116
            r86 = r117
            r98 = r118
            r110 = r119
            r69 = r120
            r70 = r121
            r77 = r122
            r83 = r123
            r71 = r124
            r97 = r125
            r73 = r126
            r7 = r127
            r9 = r128
            r11 = r130
            r142 = r134
            r78 = r135
            r47 = r136
            r76 = r137
            r51 = r40
            r40 = r44
            r65 = r61
            r41 = r63
            r93 = r67
            r62 = r74
            r61 = r79
            r79 = r133
            r74 = r23
            r23 = r132
            goto L_0x067b
        L_0x0d60:
            r134 = r142
            r131 = r2
            r64 = r5
            r129 = r8
            r128 = r9
            r34 = r10
            r130 = r11
            r67 = r13
            r132 = r23
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r23 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r133 = r79
            r52 = r80
            r71 = r81
            r51 = r83
            r70 = r85
            r69 = r86
            r85 = r91
            r35 = -1
            r83 = 1
            r47 = r143
            r76 = r6
            r79 = r61
            r74 = r62
            r61 = r65
            r65 = r90
            r6 = r3
            r66 = r12
            r3 = r15
            r15 = r4
            r12 = r7
            r13 = r133
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r12, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0ddf
            r1 = r87
            com.google.ads.interactivemedia.v3.internal.afe r1 = (com.google.ads.interactivemedia.p039v3.internal.afe) r1     // Catch:{ XmlPullParserException -> 0x0dda }
            r10 = r141
            com.google.ads.interactivemedia.v3.internal.afe r87 = r10.mo13570c(r12, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r6
            r139 = r13
            r73 = r14
            r125 = r15
            r13 = r67
            r5 = r82
            r1 = r85
            r140 = r126
            r78 = r129
            r77 = r131
            r4 = r135
            r138 = r137
            r15 = r12
            goto L_0x0ea2
        L_0x0dda:
            r0 = move-exception
            r10 = r141
            goto L_0x13b3
        L_0x0ddf:
            r10 = r141
            r11 = r137
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r12, r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x0e22
            r1 = r88
            long r88 = m13377q(r12, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r87
            com.google.ads.interactivemedia.v3.internal.afb r3 = (com.google.ads.interactivemedia.p039v3.internal.afb) r3     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1 = r141
            r2 = r12
            r4 = r53
            r16 = r6
            r6 = r55
            r8 = r85
            r138 = r11
            r125 = r15
            r15 = r10
            r10 = r88
            r15 = r12
            r139 = r13
            r77 = r131
            r12 = r27
            com.google.ads.interactivemedia.v3.internal.afb r87 = r1.mo13571d(r2, r3, r4, r6, r8, r10, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r73 = r14
            r3 = r16
            r13 = r67
            r5 = r82
            r1 = r85
            r140 = r126
            r78 = r129
        L_0x0e1e:
            r4 = r135
            goto L_0x0ea2
        L_0x0e22:
            r16 = r6
            r138 = r11
            r139 = r13
            r125 = r15
            r1 = r88
            r77 = r131
            r15 = r12
            r13 = r126
            boolean r4 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r4 == 0) goto L_0x0e61
            long r88 = m13377q(r15, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r87
            com.google.ads.interactivemedia.v3.internal.afc r3 = (com.google.ads.interactivemedia.p039v3.internal.afc) r3     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1 = r141
            r2 = r15
            r4 = r64
            r5 = r53
            r7 = r55
            r9 = r85
            r11 = r88
            r140 = r13
            r73 = r14
            r78 = r129
            r13 = r27
            com.google.ads.interactivemedia.v3.internal.afc r87 = r1.mo13572e(r2, r3, r4, r5, r7, r9, r11, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = r16
            r13 = r67
            r5 = r82
            r1 = r85
            goto L_0x0e1e
        L_0x0e61:
            r140 = r13
            r73 = r14
            r78 = r129
            boolean r4 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r4 == 0) goto L_0x0e77
            com.google.ads.interactivemedia.v3.internal.aes r3 = m13369i(r15, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r4 = r135
            r4.add(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0e98
        L_0x0e77:
            r4 = r135
            java.lang.String r3 = "Label"
            boolean r3 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0e8f
            java.lang.String r3 = "Label"
            java.lang.String r3 = m13372l(r15, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r88 = r1
            r5 = r3
            r3 = r16
            r13 = r67
            goto L_0x0ea0
        L_0x0e8f:
            boolean r3 = com.google.ads.interactivemedia.p039v3.internal.arh.m14601h(r15)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r3 == 0) goto L_0x0e98
            m13368h(r15)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0e98:
            r88 = r1
            r3 = r16
            r13 = r67
            r5 = r82
        L_0x0ea0:
            r1 = r85
        L_0x0ea2:
            java.lang.String r6 = "AdaptationSet"
            boolean r6 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r15, r6)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x0fa0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r2 = r122.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r2 = 0
        L_0x0eb4:
            int r6 = r122.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 >= r6) goto L_0x0f75
            r6 = r122
            java.lang.Object r7 = r6.get(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.aeq r7 = (com.google.ads.interactivemedia.p039v3.internal.aeq) r7     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.ke r8 = r7.f14450a     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.kd r8 = r8.mo16126a()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r5 == 0) goto L_0x0ecd
            r8.mo16109U(r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0ecd:
            java.lang.String r9 = r7.f14453d     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r9 != 0) goto L_0x0ed3
            r9 = r75
        L_0x0ed3:
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.py> r10 = r7.f14454e     // Catch:{ XmlPullParserException -> 0x13b2 }
            r11 = r130
            r10.addAll(r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r12 = r10.isEmpty()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r12 != 0) goto L_0x0f3a
            int r12 = r10.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r12 = r12 + -1
        L_0x0ee6:
            if (r12 < 0) goto L_0x0f2d
            java.lang.Object r13 = r10.get(r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.py r13 = (com.google.ads.interactivemedia.p039v3.internal.C4275py) r13     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r14 = r13.mo16533b()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r142 = r5
            if (r14 != 0) goto L_0x0f24
            r14 = 0
        L_0x0ef7:
            int r5 = r10.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r14 >= r5) goto L_0x0f24
            java.lang.Object r5 = r10.get(r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.py r5 = (com.google.ads.interactivemedia.p039v3.internal.C4275py) r5     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r16 = r5.mo16533b()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r16 == 0) goto L_0x0f1d
            boolean r16 = r13.mo16533b()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r16 != 0) goto L_0x0f1d
            r122 = r6
            java.util.UUID r6 = r13.f18412a     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r5 = r5.mo16532a(r6)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r5 == 0) goto L_0x0f1f
            r10.remove(r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0f26
        L_0x0f1d:
            r122 = r6
        L_0x0f1f:
            int r14 = r14 + 1
            r6 = r122
            goto L_0x0ef7
        L_0x0f24:
            r122 = r6
        L_0x0f26:
            int r12 = r12 + -1
            r5 = r142
            r6 = r122
            goto L_0x0ee6
        L_0x0f2d:
            r142 = r5
            r122 = r6
            com.google.ads.interactivemedia.v3.internal.pz r5 = new com.google.ads.interactivemedia.v3.internal.pz     // Catch:{ XmlPullParserException -> 0x13b2 }
            r5.<init>((java.lang.String) r9, (java.util.List<com.google.ads.interactivemedia.p039v3.internal.C4275py>) r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r8.mo16100L(r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0f3e
        L_0x0f3a:
            r142 = r5
            r122 = r6
        L_0x0f3e:
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.aes> r5 = r7.f14455f     // Catch:{ XmlPullParserException -> 0x13b2 }
            r5.addAll(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.ke r6 = r8.mo16115a()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r8 = r7.f14451b     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.aff r7 = r7.f14452c     // Catch:{ XmlPullParserException -> 0x13b2 }
            boolean r9 = r7 instanceof com.google.ads.interactivemedia.p039v3.internal.afe     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r9 == 0) goto L_0x0f57
            com.google.ads.interactivemedia.v3.internal.aey r9 = new com.google.ads.interactivemedia.v3.internal.aey     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.afe r7 = (com.google.ads.interactivemedia.p039v3.internal.afe) r7     // Catch:{ XmlPullParserException -> 0x13b2 }
            r9.<init>(r6, r8, r7, r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x0f62
        L_0x0f57:
            boolean r9 = r7 instanceof com.google.ads.interactivemedia.p039v3.internal.afa     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r9 == 0) goto L_0x0f6d
            com.google.ads.interactivemedia.v3.internal.aex r9 = new com.google.ads.interactivemedia.v3.internal.aex     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.afa r7 = (com.google.ads.interactivemedia.p039v3.internal.afa) r7     // Catch:{ XmlPullParserException -> 0x13b2 }
            r9.<init>(r6, r8, r7, r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0f62:
            r1.add(r9)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r2 = r2 + 1
            r5 = r142
            r130 = r11
            goto L_0x0eb4
        L_0x0f6d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x0f75:
            com.google.ads.interactivemedia.v3.internal.aeo r2 = new com.google.ads.interactivemedia.v3.internal.aeo     // Catch:{ XmlPullParserException -> 0x13b2 }
            r67 = r2
            r69 = r3
            r70 = r1
            r71 = r73
            r72 = r66
            r73 = r64
            r67.<init>(r68, r69, r70, r71, r72, r73)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r14 = r120
            r14.add(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r69 = r14
            r66 = r121
            r35 = r124
            r24 = r128
            r16 = r134
            r64 = 0
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r70 = 0
            goto L_0x1289
        L_0x0fa0:
            r142 = r5
            r82 = r142
            r7 = r15
            r15 = r24
            r10 = r34
            r143 = r47
            r83 = r51
            r80 = r52
            r5 = r64
            r90 = r65
            r12 = r66
            r86 = r69
            r85 = r70
            r81 = r71
            r14 = r73
            r6 = r76
            r24 = r77
            r8 = r78
            r69 = r120
            r70 = r121
            r77 = r122
            r71 = r124
            r9 = r128
            r11 = r130
            r142 = r134
            r47 = r136
            r76 = r138
            r73 = r140
            r78 = r4
            r51 = r40
            r40 = r44
            r65 = r61
            r41 = r63
            r62 = r74
            r61 = r79
            r4 = r125
            r79 = r139
            r74 = r23
            r23 = r132
            goto L_0x03ae
        L_0x0fef:
            r134 = r142
            r121 = r2
            r124 = r3
            r140 = r5
            r76 = r6
            r15 = r7
            r78 = r8
            r128 = r9
            r34 = r10
            r139 = r12
            r138 = r14
            r132 = r23
            r77 = r24
            r44 = r40
            r63 = r41
            r136 = r47
            r40 = r51
            r79 = r61
            r74 = r62
            r61 = r65
            r83 = 1
            r47 = r143
            r14 = r1
            r23 = r11
            java.lang.String r1 = "EventStream"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x11d0
            java.lang.String r1 = ""
            r12 = r121
            java.lang.String r1 = m13375o(r15, r12, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = ""
            r13 = r124
            java.lang.String r10 = m13375o(r15, r13, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "timescale"
            r3 = 1
            long r51 = m13374n(r15, r2, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13b2 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ XmlPullParserException -> 0x13b2 }
            r2 = 512(0x200, float:7.175E-43)
            r9.<init>(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x1049:
            r15.next()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "Event"
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x1167
            r7 = r128
            r5 = 0
            long r70 = m13374n(r15, r7, r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "duration"
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r64 = m13374n(r15, r2, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "presentationTime"
            long r72 = m13374n(r15, r2, r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r66 = 1000(0x3e8, double:4.94E-321)
            r68 = r51
            long r80 = com.google.ads.interactivemedia.p039v3.internal.amm.m14196M(r64, r66, r68)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r66 = 1000000(0xf4240, double:4.940656E-318)
            r64 = r72
            r68 = r51
            long r64 = com.google.ads.interactivemedia.p039v3.internal.amm.m14196M(r64, r66, r68)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "messageData"
            r8 = 0
            java.lang.String r2 = m13375o(r15, r2, r8)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r9.reset()     // Catch:{ XmlPullParserException -> 0x13b2 }
            org.xmlpull.v1.XmlSerializer r3 = android.util.Xml.newSerializer()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.nio.charset.Charset r4 = com.google.ads.interactivemedia.p039v3.internal.arm.f15614b     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r4 = r4.name()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.setOutput(r9, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r15.nextToken()     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x109a:
            java.lang.String r4 = "Event"
            boolean r4 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r15, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r4 != 0) goto L_0x1127
            int r4 = r15.getEventType()     // Catch:{ XmlPullParserException -> 0x13b2 }
            switch(r4) {
                case 0: goto L_0x111a;
                case 1: goto L_0x1115;
                case 2: goto L_0x10f0;
                case 3: goto L_0x10e4;
                case 4: goto L_0x10dc;
                case 5: goto L_0x10d4;
                case 6: goto L_0x10cc;
                case 7: goto L_0x10c4;
                case 8: goto L_0x10bc;
                case 9: goto L_0x10b4;
                case 10: goto L_0x10ab;
                default: goto L_0x10a9;
            }     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x10a9:
            goto L_0x1120
        L_0x10ab:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.docdecl(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1120
        L_0x10b4:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.comment(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1120
        L_0x10bc:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.processingInstruction(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1120
        L_0x10c4:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.ignorableWhitespace(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1120
        L_0x10cc:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.entityRef(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1120
        L_0x10d4:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.cdsect(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1120
        L_0x10dc:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.text(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1120
        L_0x10e4:
            java.lang.String r4 = r15.getNamespace()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r5 = r15.getName()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.endTag(r4, r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1120
        L_0x10f0:
            java.lang.String r4 = r15.getNamespace()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r5 = r15.getName()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.startTag(r4, r5)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r4 = 0
        L_0x10fc:
            int r5 = r15.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r4 >= r5) goto L_0x1120
            java.lang.String r5 = r15.getAttributeNamespace(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r6 = r15.getAttributeName(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r8 = r15.getAttributeValue(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.attribute(r5, r6, r8)     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r4 = r4 + 1
            r8 = 0
            goto L_0x10fc
        L_0x1115:
            r3.endDocument()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r8 = 0
            goto L_0x1120
        L_0x111a:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x13b2 }
            r8 = 0
            r3.startDocument(r8, r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x1120:
            r15.nextToken()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r5 = 0
            goto L_0x109a
        L_0x1127:
            r3.flush()     // Catch:{ XmlPullParserException -> 0x13b2 }
            byte[] r3 = r9.toByteArray()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r64)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x113b
            byte[] r2 = com.google.ads.interactivemedia.p039v3.internal.amm.m14255y(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r16 = r2
            goto L_0x113d
        L_0x113b:
            r16 = r3
        L_0x113d:
            com.google.ads.interactivemedia.v3.internal.yq r6 = new com.google.ads.interactivemedia.v3.internal.yq     // Catch:{ XmlPullParserException -> 0x13b2 }
            r2 = r6
            r121 = r12
            r124 = r13
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r1
            r4 = r10
            r12 = r5
            r13 = r6
            r64 = 0
            r5 = r80
            r24 = r7
            r69 = r14
            r14 = r8
            r7 = r70
            r35 = r9
            r9 = r16
            r2.<init>(r3, r4, r5, r7, r9)     // Catch:{ XmlPullParserException -> 0x13b2 }
            android.util.Pair r2 = android.util.Pair.create(r12, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r11.add(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1177
        L_0x1167:
            r35 = r9
            r121 = r12
            r124 = r13
            r69 = r14
            r24 = r128
            r14 = 0
            r64 = 0
            m13368h(r15)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x1177:
            java.lang.String r2 = "EventStream"
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r15, r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x11c4
            int r2 = r11.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            long[] r2 = new long[r2]     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r3 = r11.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.yq[] r3 = new com.google.ads.interactivemedia.p039v3.internal.C4510yq[r3]     // Catch:{ XmlPullParserException -> 0x13b2 }
            r4 = 0
        L_0x118c:
            int r5 = r11.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r4 >= r5) goto L_0x11ab
            java.lang.Object r5 = r11.get(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Object r6 = r5.first     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ XmlPullParserException -> 0x13b2 }
            long r6 = r6.longValue()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r2[r4] = r6     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Object r5 = r5.second     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.yq r5 = (com.google.ads.interactivemedia.p039v3.internal.C4510yq) r5     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3[r4] = r5     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r4 = r4 + 1
            goto L_0x118c
        L_0x11ab:
            com.google.ads.interactivemedia.v3.internal.aet r4 = new com.google.ads.interactivemedia.v3.internal.aet     // Catch:{ XmlPullParserException -> 0x13b2 }
            r4.<init>(r1, r10, r2, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r12 = r134
            r12.add(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r16 = r12
            r70 = r14
            r66 = r121
            r35 = r124
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x1289
        L_0x11c4:
            r128 = r24
            r9 = r35
            r14 = r69
            r12 = r121
            r13 = r124
            goto L_0x1049
        L_0x11d0:
            r69 = r14
            r24 = r128
            r12 = r134
            r14 = 0
            r64 = 0
            r1 = r139
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x11fe
            r13 = r15
            r15 = r141
            com.google.ads.interactivemedia.v3.internal.afe r1 = r15.mo13570c(r13, r14)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r57 = r1
            r16 = r12
            r15 = r13
            r70 = r14
            r14 = r47
            r12 = r61
            r66 = r121
            r35 = r124
        L_0x11f7:
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x128d
        L_0x11fe:
            r13 = r15
            r15 = r141
            r1 = r138
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r13, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x1238
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r51 = m13377q(r13, r10)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = 0
            r1 = r141
            r2 = r13
            r4 = r53
            r6 = r55
            r8 = r61
            r57 = r10
            r10 = r51
            r16 = r12
            r15 = r13
            r66 = r121
            r35 = r124
            r12 = r27
            com.google.ads.interactivemedia.v3.internal.afb r1 = r1.mo13571d(r2, r3, r4, r6, r8, r10, r12)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r57 = r1
            r70 = r14
            r14 = r47
            r58 = r51
            r12 = r61
            goto L_0x11f7
        L_0x1238:
            r16 = r12
            r15 = r13
            r66 = r121
            r35 = r124
            r1 = r140
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x1271
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r51 = m13377q(r15, r11)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3 = 0
            com.google.ads.interactivemedia.v3.internal.atz r4 = com.google.ads.interactivemedia.p039v3.internal.atz.m14807i()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1 = r141
            r2 = r15
            r5 = r53
            r7 = r55
            r9 = r61
            r67 = r11
            r11 = r51
            r70 = r14
            r13 = r27
            com.google.ads.interactivemedia.v3.internal.afc r1 = r1.mo13572e(r2, r3, r4, r5, r7, r9, r11, r13)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r57 = r1
            r14 = r47
            r58 = r51
            goto L_0x128b
        L_0x1271:
            r70 = r14
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r1 = "AssetIdentifier"
            boolean r1 = com.google.ads.interactivemedia.p039v3.internal.arh.m14600g(r15, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 == 0) goto L_0x1286
            java.lang.String r1 = "AssetIdentifier"
            m13369i(r15, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            goto L_0x1289
        L_0x1286:
            m13368h(r15)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x1289:
            r14 = r47
        L_0x128b:
            r12 = r61
        L_0x128d:
            r1 = r136
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r15, r1)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r2 == 0) goto L_0x12f4
            com.google.ads.interactivemedia.v3.internal.aeu r2 = new com.google.ads.interactivemedia.v3.internal.aeu     // Catch:{ XmlPullParserException -> 0x13b2 }
            r47 = r2
            r51 = r69
            r52 = r16
            r47.<init>(r48, r49, r51, r52)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r55)     // Catch:{ XmlPullParserException -> 0x13b2 }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Object r3 = r2.first     // Catch:{ XmlPullParserException -> 0x13b2 }
            com.google.ads.interactivemedia.v3.internal.aeu r3 = (com.google.ads.interactivemedia.p039v3.internal.aeu) r3     // Catch:{ XmlPullParserException -> 0x13b2 }
            long r4 = r3.f14470b     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r6 = (r4 > r67 ? 1 : (r4 == r67 ? 0 : -1))
            if (r6 != 0) goto L_0x12d8
            if (r44 == 0) goto L_0x12bb
            r4 = r40
            r2 = r63
            r43 = 1
            goto L_0x12f1
        L_0x12bb:
            com.google.ads.interactivemedia.v3.internal.lb r1 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r2 = r63.size()     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x13b2 }
            r4 = 47
            r3.<init>(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r4 = "Unable to determine start of period "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x13b2 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x13b2 }
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x12d8:
            java.lang.Object r2 = r2.second     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ XmlPullParserException -> 0x13b2 }
            long r4 = r2.longValue()     // Catch:{ XmlPullParserException -> 0x13b2 }
            int r2 = (r4 > r67 ? 1 : (r4 == r67 ? 0 : -1))
            if (r2 != 0) goto L_0x12e9
            r2 = r63
            r4 = r67
            goto L_0x12ee
        L_0x12e9:
            long r6 = r3.f14470b     // Catch:{ XmlPullParserException -> 0x13b2 }
            long r4 = r4 + r6
            r2 = r63
        L_0x12ee:
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x12f1:
            r11 = r23
            goto L_0x1347
        L_0x12f4:
            r47 = r1
            r7 = r15
            r142 = r16
            r11 = r23
            r9 = r24
            r10 = r34
            r3 = r35
            r51 = r40
            r40 = r44
            r41 = r63
            r2 = r66
            r4 = r67
            r1 = r69
            r62 = r74
            r6 = r76
            r24 = r77
            r8 = r78
            r61 = r79
            r23 = r132
            r15 = r141
            goto L_0x0295
        L_0x131d:
            r76 = r6
            r15 = r7
            r78 = r8
            r79 = r12
            r74 = r13
            r1 = r14
            r132 = r23
            r77 = r24
            r44 = r40
            r2 = r41
            r64 = 0
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r70 = 0
            r83 = 1
            r40 = r4
            r24 = r9
            r23 = r11
            m13368h(r15)     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x1343:
            r11 = r23
            r4 = r40
        L_0x1347:
            r3 = r132
            boolean r6 = com.google.ads.interactivemedia.p039v3.internal.arh.m14598e(r15, r3)     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r6 == 0) goto L_0x138f
            int r1 = (r19 > r67 ? 1 : (r19 == r67 ? 0 : -1))
            if (r1 != 0) goto L_0x1365
            int r1 = (r4 > r67 ? 1 : (r4 == r67 ? 0 : -1))
            if (r1 == 0) goto L_0x135a
            r19 = r4
            goto L_0x1365
        L_0x135a:
            if (r44 == 0) goto L_0x135d
            goto L_0x1365
        L_0x135d:
            com.google.ads.interactivemedia.v3.internal.lb r1 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "Unable to determine duration of static manifest."
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x1365:
            boolean r1 = r2.isEmpty()     // Catch:{ XmlPullParserException -> 0x13b2 }
            if (r1 != 0) goto L_0x1387
            com.google.ads.interactivemedia.v3.internal.aep r1 = new com.google.ads.interactivemedia.v3.internal.aep     // Catch:{ XmlPullParserException -> 0x13b2 }
            r16 = r1
            r23 = r44
            r24 = r25
            r26 = r27
            r28 = r29
            r30 = r31
            r32 = r36
            r33 = r37
            r34 = r39
            r35 = r38
            r36 = r2
            r16.<init>(r17, r19, r21, r23, r24, r26, r28, r30, r32, r33, r34, r35, r36)     // Catch:{ XmlPullParserException -> 0x13b2 }
            return r1
        L_0x1387:
            com.google.ads.interactivemedia.v3.internal.lb r1 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "No periods found."
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x138f:
            r14 = r1
            r41 = r2
            r23 = r3
            r7 = r15
            r9 = r24
            r40 = r44
            r2 = r45
            r13 = r74
            r6 = r76
            r24 = r77
            r8 = r78
            r12 = r79
            r10 = 1
            r15 = r141
            goto L_0x00c9
        L_0x13aa:
            com.google.ads.interactivemedia.v3.internal.lb r1 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch:{ XmlPullParserException -> 0x13b2 }
            java.lang.String r2 = "inputStream does not contain a valid media presentation description"
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x13b2 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13b2 }
        L_0x13b2:
            r0 = move-exception
        L_0x13b3:
            r1 = r0
            com.google.ads.interactivemedia.v3.internal.lb r2 = new com.google.ads.interactivemedia.v3.internal.lb
            r2.<init>((java.lang.Throwable) r1)
            goto L_0x13bb
        L_0x13ba:
            throw r2
        L_0x13bb:
            goto L_0x13ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aer.mo13517a(android.net.Uri, java.io.InputStream):com.google.ads.interactivemedia.v3.internal.aep");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final afe mo13570c(XmlPullParser xmlPullParser, afe afe) throws XmlPullParserException, IOException {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        afe afe2 = afe;
        long n = m13374n(xmlPullParser2, "timescale", afe2 != null ? afe2.f14508i : 1);
        long j3 = 0;
        long n2 = m13374n(xmlPullParser2, "presentationTimeOffset", afe2 != null ? afe2.f14509j : 0);
        long j4 = afe2 != null ? afe2.f14505a : 0;
        if (afe2 != null) {
            j3 = afe2.f14506b;
        }
        aew aew = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j3;
            j2 = j4;
        }
        if (afe2 != null) {
            aew = afe2.f14507h;
        }
        do {
            xmlPullParser.next();
            if (arh.m14600g(xmlPullParser2, "Initialization")) {
                aew = mo13574g(xmlPullParser);
            } else {
                m13368h(xmlPullParser);
            }
        } while (!arh.m14598e(xmlPullParser2, "SegmentBase"));
        return new afe(aew, n, n2, j2, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final afb mo13571d(XmlPullParser xmlPullParser, afb afb, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        afb afb2 = afb;
        long j6 = 1;
        long n = m13374n(xmlPullParser2, "timescale", afb2 != null ? afb2.f14508i : 1);
        long n2 = m13374n(xmlPullParser2, "presentationTimeOffset", afb2 != null ? afb2.f14509j : 0);
        long n3 = m13374n(xmlPullParser2, IronSourceConstants.EVENTS_DURATION, afb2 != null ? afb2.f14494b : C6540C.TIME_UNSET);
        if (afb2 != null) {
            j6 = afb2.f14493a;
        }
        long n4 = m13374n(xmlPullParser2, "startNumber", j6);
        long B = m13366B(j3, j4);
        List<afd> list = null;
        List list2 = null;
        aew aew = null;
        do {
            xmlPullParser.next();
            if (arh.m14600g(xmlPullParser2, "Initialization")) {
                aew = mo13574g(xmlPullParser);
            } else if (arh.m14600g(xmlPullParser2, "SegmentTimeline")) {
                list = mo13573f(xmlPullParser, n, j2);
            } else if (arh.m14600g(xmlPullParser2, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(m13384x(xmlPullParser2, "media", "mediaRange"));
            } else {
                m13368h(xmlPullParser);
            }
        } while (!arh.m14598e(xmlPullParser2, "SegmentList"));
        if (afb2 != null) {
            if (aew == null) {
                aew = afb2.f14507h;
            }
            if (list == null) {
                list = afb2.f14495c;
            }
            if (list2 == null) {
                list2 = afb2.f14499e;
            }
        }
        return new afb(aew, n, n2, n4, n3, list, B, list2, C4083iv.m17452b(j5), C4083iv.m17452b(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final afc mo13572e(XmlPullParser xmlPullParser, afc afc, List<aes> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        afc afc2 = afc;
        long j7 = 1;
        long n = m13374n(xmlPullParser2, "timescale", afc2 != null ? afc2.f14508i : 1);
        long n2 = m13374n(xmlPullParser2, "presentationTimeOffset", afc2 != null ? afc2.f14509j : 0);
        long n3 = m13374n(xmlPullParser2, IronSourceConstants.EVENTS_DURATION, afc2 != null ? afc2.f14494b : C6540C.TIME_UNSET);
        if (afc2 != null) {
            j7 = afc2.f14493a;
        }
        long n4 = m13374n(xmlPullParser2, "startNumber", j7);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            aes aes = list.get(i);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(aes.f14462a)) {
                j6 = Long.parseLong(aes.f14463b);
                break;
            }
            i++;
        }
        long j8 = j6;
        long B = m13366B(j3, j4);
        List<afd> list2 = null;
        afi z = m13386z(xmlPullParser2, "media", afc2 != null ? afc2.f14501f : null);
        afi z2 = m13386z(xmlPullParser2, "initialization", afc2 != null ? afc2.f14500e : null);
        aew aew = null;
        do {
            xmlPullParser.next();
            if (arh.m14600g(xmlPullParser2, "Initialization")) {
                aew = mo13574g(xmlPullParser);
            } else if (arh.m14600g(xmlPullParser2, "SegmentTimeline")) {
                list2 = mo13573f(xmlPullParser, n, j2);
            } else {
                m13368h(xmlPullParser);
            }
        } while (!arh.m14598e(xmlPullParser2, "SegmentTemplate"));
        if (afc2 != null) {
            if (aew == null) {
                aew = afc2.f14507h;
            }
            if (list2 == null) {
                list2 = afc2.f14495c;
            }
        }
        return new afc(aew, n, n2, n4, j8, n3, list2, B, z2, z, C4083iv.m17452b(j5), C4083iv.m17452b(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<afd> mo13573f(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (arh.m14600g(xmlPullParser2, "S")) {
                long n = m13374n(xmlPullParser2, "t", C6540C.TIME_UNSET);
                if (z) {
                    j3 = m13367C(arrayList, j3, j4, i, n);
                }
                if (n == C6540C.TIME_UNSET) {
                    n = j3;
                }
                j4 = m13374n(xmlPullParser2, C11539d.f51879a, C6540C.TIME_UNSET);
                i = m13373m(xmlPullParser2, "r", 0);
                j3 = n;
                z = true;
            } else {
                m13368h(xmlPullParser);
            }
        } while (!arh.m14598e(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            m13367C(arrayList, j3, j4, i, amm.m14196M(j2, j, 1000));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final aew mo13574g(XmlPullParser xmlPullParser) {
        return m13384x(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
    }
}
