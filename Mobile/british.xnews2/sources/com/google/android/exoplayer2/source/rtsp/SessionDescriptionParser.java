package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.util.Assertions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class SessionDescriptionParser {
    private static final Pattern ATTRIBUTE_PATTERN = Pattern.compile("([0-9A-Za-z-]+)(?::(.*))?");
    private static final String ATTRIBUTE_TYPE = "a";
    private static final String BANDWIDTH_TYPE = "b";
    private static final String CONNECTION_TYPE = "c";
    private static final String CRLF = "\r\n";
    private static final String EMAIL_TYPE = "e";
    private static final String INFORMATION_TYPE = "i";
    private static final String KEY_TYPE = "k";
    private static final Pattern MEDIA_DESCRIPTION_PATTERN = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");
    private static final String MEDIA_TYPE = "m";
    private static final String ORIGIN_TYPE = "o";
    private static final String PHONE_NUMBER_TYPE = "p";
    private static final String REPEAT_TYPE = "r";
    private static final Pattern SDP_LINE_PATTERN = Pattern.compile("([a-z])=\\s?(.+)");
    private static final String SESSION_TYPE = "s";
    private static final String TIMING_TYPE = "t";
    private static final String URI_TYPE = "u";
    private static final String VERSION_TYPE = "v";
    private static final String ZONE_TYPE = "z";

    private SessionDescriptionParser() {
    }

    private static void addMediaDescriptionToSession(SessionDescription.Builder builder, MediaDescription.Builder builder2) throws ParserException {
        try {
            builder.addMediaDescription(builder2.build());
        } catch (IllegalStateException e) {
            throw new ParserException((Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d7, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.source.rtsp.SessionDescription parse(java.lang.String r12) throws com.google.android.exoplayer2.ParserException {
        /*
            com.google.android.exoplayer2.source.rtsp.SessionDescription$Builder r0 = new com.google.android.exoplayer2.source.rtsp.SessionDescription$Builder
            r0.<init>()
            java.lang.String r1 = "\r\n"
            java.lang.String[] r12 = com.google.android.exoplayer2.util.Util.split(r12, r1)
            int r1 = r12.length
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x000f:
            if (r4 >= r1) goto L_0x01db
            r5 = r12[r4]
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x001d
            goto L_0x01d7
        L_0x001d:
            java.util.regex.Pattern r6 = SDP_LINE_PATTERN
            java.util.regex.Matcher r6 = r6.matcher(r5)
            boolean r7 = r6.matches()
            if (r7 != 0) goto L_0x0046
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException
            java.lang.String r0 = "Malformed SDP line: "
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x003c
            java.lang.String r0 = r0.concat(r1)
            goto L_0x0042
        L_0x003c:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x0042:
            r12.<init>((java.lang.String) r0)
            throw r12
        L_0x0046:
            r7 = 1
            java.lang.String r8 = r6.group(r7)
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            java.lang.String r8 = (java.lang.String) r8
            r9 = 2
            java.lang.String r6 = r6.group(r9)
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            java.lang.String r6 = (java.lang.String) r6
            r10 = -1
            int r11 = r8.hashCode()
            switch(r11) {
                case 97: goto L_0x00fd;
                case 98: goto L_0x00f2;
                case 99: goto L_0x00e8;
                case 100: goto L_0x0064;
                case 101: goto L_0x00de;
                case 102: goto L_0x0064;
                case 103: goto L_0x0064;
                case 104: goto L_0x0064;
                case 105: goto L_0x00d4;
                case 106: goto L_0x0064;
                case 107: goto L_0x00c9;
                case 108: goto L_0x0064;
                case 109: goto L_0x00be;
                case 110: goto L_0x0064;
                case 111: goto L_0x00b4;
                case 112: goto L_0x00aa;
                case 113: goto L_0x0064;
                case 114: goto L_0x009f;
                case 115: goto L_0x0094;
                case 116: goto L_0x0088;
                case 117: goto L_0x007d;
                case 118: goto L_0x0072;
                case 119: goto L_0x0064;
                case 120: goto L_0x0064;
                case 121: goto L_0x0064;
                case 122: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x0107
        L_0x0066:
            java.lang.String r11 = "z"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 14
            goto L_0x0107
        L_0x0072:
            java.lang.String r11 = "v"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 0
            goto L_0x0107
        L_0x007d:
            java.lang.String r11 = "u"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 4
            goto L_0x0107
        L_0x0088:
            java.lang.String r11 = "t"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 9
            goto L_0x0107
        L_0x0094:
            java.lang.String r11 = "s"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 2
            goto L_0x0107
        L_0x009f:
            java.lang.String r11 = "r"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 13
            goto L_0x0107
        L_0x00aa:
            java.lang.String r11 = "p"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 6
            goto L_0x0107
        L_0x00b4:
            java.lang.String r11 = "o"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 1
            goto L_0x0107
        L_0x00be:
            java.lang.String r11 = "m"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 12
            goto L_0x0107
        L_0x00c9:
            java.lang.String r11 = "k"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 10
            goto L_0x0107
        L_0x00d4:
            java.lang.String r11 = "i"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 3
            goto L_0x0107
        L_0x00de:
            java.lang.String r11 = "e"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 5
            goto L_0x0107
        L_0x00e8:
            java.lang.String r11 = "c"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 7
            goto L_0x0107
        L_0x00f2:
            java.lang.String r11 = "b"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 8
            goto L_0x0107
        L_0x00fd:
            java.lang.String r11 = "a"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0107
            r10 = 11
        L_0x0107:
            switch(r10) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01ba;
                case 2: goto L_0x01b6;
                case 3: goto L_0x01ac;
                case 4: goto L_0x01a4;
                case 5: goto L_0x01a0;
                case 6: goto L_0x019c;
                case 7: goto L_0x0192;
                case 8: goto L_0x016f;
                case 9: goto L_0x016a;
                case 10: goto L_0x015e;
                case 11: goto L_0x0117;
                case 12: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x01d7
        L_0x010c:
            if (r3 == 0) goto L_0x0111
            addMediaDescriptionToSession(r0, r3)
        L_0x0111:
            com.google.android.exoplayer2.source.rtsp.MediaDescription$Builder r3 = parseMediaDescriptionLine(r6)
            goto L_0x01d7
        L_0x0117:
            java.util.regex.Pattern r8 = ATTRIBUTE_PATTERN
            java.util.regex.Matcher r6 = r8.matcher(r6)
            boolean r8 = r6.matches()
            if (r8 != 0) goto L_0x0140
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException
            java.lang.String r0 = "Malformed Attribute line: "
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0136
            java.lang.String r0 = r0.concat(r1)
            goto L_0x013c
        L_0x0136:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x013c:
            r12.<init>((java.lang.String) r0)
            throw r12
        L_0x0140:
            java.lang.String r5 = r6.group(r7)
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r6.group(r9)
            java.lang.String r6 = p148s6.C6075n.m26697c(r6)
            if (r3 != 0) goto L_0x0159
            r0.addAttribute(r5, r6)
            goto L_0x01d7
        L_0x0159:
            r3.addAttribute(r5, r6)
            goto L_0x01d7
        L_0x015e:
            if (r3 != 0) goto L_0x0165
            r0.setKey(r6)
            goto L_0x01d7
        L_0x0165:
            r3.setKey(r6)
            goto L_0x01d7
        L_0x016a:
            r0.setTiming(r6)
            goto L_0x01d7
        L_0x016f:
            java.lang.String r5 = ":\\s?"
            java.lang.String[] r5 = com.google.android.exoplayer2.util.Util.split(r6, r5)
            int r6 = r5.length
            if (r6 != r9) goto L_0x017a
            r6 = 1
            goto L_0x017b
        L_0x017a:
            r6 = 0
        L_0x017b:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r6)
            r5 = r5[r7]
            int r5 = java.lang.Integer.parseInt(r5)
            if (r3 != 0) goto L_0x018c
            int r5 = r5 * 1000
            r0.setBitrate(r5)
            goto L_0x01d7
        L_0x018c:
            int r5 = r5 * 1000
            r3.setBitrate(r5)
            goto L_0x01d7
        L_0x0192:
            if (r3 != 0) goto L_0x0198
            r0.setConnection(r6)
            goto L_0x01d7
        L_0x0198:
            r3.setConnection(r6)
            goto L_0x01d7
        L_0x019c:
            r0.setPhoneNumber(r6)
            goto L_0x01d7
        L_0x01a0:
            r0.setEmailAddress(r6)
            goto L_0x01d7
        L_0x01a4:
            android.net.Uri r5 = android.net.Uri.parse(r6)
            r0.setUri(r5)
            goto L_0x01d7
        L_0x01ac:
            if (r3 != 0) goto L_0x01b2
            r0.setSessionInfo(r6)
            goto L_0x01d7
        L_0x01b2:
            r3.setMediaTitle(r6)
            goto L_0x01d7
        L_0x01b6:
            r0.setSessionName(r6)
            goto L_0x01d7
        L_0x01ba:
            r0.setOrigin(r6)
            goto L_0x01d7
        L_0x01be:
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x01c7
            goto L_0x01d7
        L_0x01c7:
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r2] = r6
            java.lang.String r1 = "SDP version %s is not supported."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r12.<init>((java.lang.String) r0)
            throw r12
        L_0x01d7:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x01db:
            if (r3 == 0) goto L_0x01e0
            addMediaDescriptionToSession(r0, r3)
        L_0x01e0:
            com.google.android.exoplayer2.source.rtsp.SessionDescription r12 = r0.build()     // Catch:{ IllegalStateException -> 0x01e5 }
            return r12
        L_0x01e5:
            r12 = move-exception
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r0.<init>((java.lang.Throwable) r12)
            goto L_0x01ed
        L_0x01ec:
            throw r0
        L_0x01ed:
            goto L_0x01ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.SessionDescriptionParser.parse(java.lang.String):com.google.android.exoplayer2.source.rtsp.SessionDescription");
    }

    private static MediaDescription.Builder parseMediaDescriptionLine(String str) throws ParserException {
        Matcher matcher = MEDIA_DESCRIPTION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new ParserException(valueOf.length() != 0 ? "Malformed SDP media description line: ".concat(valueOf) : new String("Malformed SDP media description line: "));
        }
        try {
            return new MediaDescription.Builder((String) Assertions.checkNotNull(matcher.group(1)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))), (String) Assertions.checkNotNull(matcher.group(3)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4))));
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(str);
            throw new ParserException(valueOf2.length() != 0 ? "Malformed SDP media description line: ".concat(valueOf2) : new String("Malformed SDP media description line: "), e);
        }
    }
}
