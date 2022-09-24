package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C10388e1;
import com.google.common.collect.C4766t;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p148s6.C11001d;
import p148s6.C11003g;

final class RtspMessageUtil {
    private static final Pattern CONTENT_LENGTH_HEADER_PATTERN = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    public static final long DEFAULT_RTSP_TIMEOUT_MS = 60000;
    private static final Pattern REQUEST_LINE_PATTERN = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    private static final String RTSP_VERSION = "RTSP/1.0";
    private static final Pattern SESSION_HEADER_PATTERN = Pattern.compile("(\\w+)(?:;\\s?timeout=(\\d+))?");
    private static final Pattern STATUS_LINE_PATTERN = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    public static final class RtspSessionHeader {
        public final String sessionId;
        public final long timeoutMs;

        public RtspSessionHeader(String str, long j) {
            this.sessionId = str;
            this.timeoutMs = j;
        }
    }

    private RtspMessageUtil() {
    }

    public static byte[] convertMessageToByteArray(List<String> list) {
        return C11003g.m49350e("\r\n").mo43294c(list).getBytes(C11001d.f49947c);
    }

    private static String getRtspStatusReasonPhrase(int i) {
        if (i == 200) {
            return "OK";
        }
        if (i == 461) {
            return "Unsupported Transport";
        }
        if (i == 500) {
            return "Internal Server Error";
        }
        if (i == 505) {
            return "RTSP Version Not Supported";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 401) {
            return "Unauthorized";
        }
        if (i == 404) {
            return "Not Found";
        }
        if (i == 405) {
            return "Method Not Allowed";
        }
        switch (i) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static boolean isRtspStartLine(String str) {
        return REQUEST_LINE_PATTERN.matcher(str).matches() || STATUS_LINE_PATTERN.matcher(str).matches();
    }

    public static long parseContentLengthHeader(String str) throws ParserException {
        try {
            Matcher matcher = CONTENT_LENGTH_HEADER_PATTERN.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        } catch (NumberFormatException e) {
            throw new ParserException((Throwable) e);
        }
    }

    public static int parseInt(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new ParserException((Throwable) e);
        }
    }

    private static int parseMethodString(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c = 8;
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c = 9;
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c = 10;
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case 8:
                return 5;
            case 9:
                return 10;
            case 10:
                return 1;
            case 11:
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static C4766t<Integer> parsePublicHeader(String str) {
        if (str == null) {
            return C4766t.m21978E();
        }
        C4766t.C4768a aVar = new C4766t.C4768a();
        for (String parseMethodString : Util.split(str, ",\\s?")) {
            aVar.mo19883e(Integer.valueOf(parseMethodString(parseMethodString)));
        }
        return aVar.mo19884f();
    }

    public static RtspRequest parseRequest(List<String> list) {
        boolean z = false;
        Matcher matcher = REQUEST_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int parseMethodString = parseMethodString((String) Assertions.checkNotNull(matcher.group(1)));
        Uri parse = Uri.parse((String) Assertions.checkNotNull(matcher.group(2)));
        int indexOf = list.indexOf("");
        if (indexOf > 0) {
            z = true;
        }
        Assertions.checkArgument(z);
        return new RtspRequest(parse, parseMethodString, new RtspHeaders.Builder().addAll(list.subList(1, indexOf)).build(), C11003g.m49350e("\r\n").mo43294c(list.subList(indexOf + 1, list.size())));
    }

    public static RtspResponse parseResponse(List<String> list) {
        boolean z = false;
        Matcher matcher = STATUS_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
        int indexOf = list.indexOf("");
        if (indexOf > 0) {
            z = true;
        }
        Assertions.checkArgument(z);
        return new RtspResponse(parseInt, new RtspHeaders.Builder().addAll(list.subList(1, indexOf)).build(), C11003g.m49350e("\r\n").mo43294c(list.subList(indexOf + 1, list.size())));
    }

    public static RtspSessionHeader parseSessionHeader(String str) throws ParserException {
        Matcher matcher = SESSION_HEADER_PATTERN.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(1));
            long j = 60000;
            String group = matcher.group(2);
            if (group != null) {
                try {
                    j = ((long) Integer.parseInt(group)) * 1000;
                } catch (NumberFormatException e) {
                    throw new ParserException((Throwable) e);
                }
            }
            return new RtspSessionHeader(str2, j);
        }
        throw new ParserException(str);
    }

    public static Uri removeUserInfo(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) Assertions.checkNotNull(uri.getAuthority());
        Assertions.checkArgument(str.contains("@"));
        return uri.buildUpon().encodedAuthority(Util.split(str, "@")[1]).build();
    }

    public static C4766t<String> serializeRequest(RtspRequest rtspRequest) {
        C4766t.C4768a aVar = new C4766t.C4768a();
        aVar.mo19883e(Util.formatInvariant("%s %s %s", toMethodString(rtspRequest.method), rtspRequest.uri, RTSP_VERSION));
        C10388e1<String> r = rtspRequest.headers.asMap().keySet().iterator();
        while (r.hasNext()) {
            String next = r.next();
            aVar.mo19883e(Util.formatInvariant("%s: %s", next, Assertions.checkNotNull(rtspRequest.headers.get(next))));
        }
        aVar.mo19883e("");
        aVar.mo19883e(rtspRequest.messageBody);
        return aVar.mo19884f();
    }

    public static C4766t<String> serializeResponse(RtspResponse rtspResponse) {
        C4766t.C4768a aVar = new C4766t.C4768a();
        aVar.mo19883e(Util.formatInvariant("%s %s %s", RTSP_VERSION, Integer.valueOf(rtspResponse.status), getRtspStatusReasonPhrase(rtspResponse.status)));
        C10388e1<String> r = rtspResponse.headers.asMap().keySet().iterator();
        while (r.hasNext()) {
            String next = r.next();
            aVar.mo19883e(Util.formatInvariant("%s: %s", next, Assertions.checkNotNull(rtspResponse.headers.get(next))));
        }
        aVar.mo19883e("");
        aVar.mo19883e(rtspResponse.messageBody);
        return aVar.mo19884f();
    }

    public static String toMethodString(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
