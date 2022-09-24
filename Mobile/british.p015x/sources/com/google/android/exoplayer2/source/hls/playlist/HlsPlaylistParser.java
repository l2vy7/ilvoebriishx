package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4706d0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMasterPlaylist masterPlaylist;
    private final HlsMediaPlaylist previousMediaPlaylist;

    private static class LineIterator {
        private final Queue<String> extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws IOException {
            String trim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String readLine = this.reader.readLine();
                this.next = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.next = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (hasNext()) {
                String str = this.next;
                this.next = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class DeltaUpdateException extends IOException {
    }

    public HlsPlaylistParser() {
        this(HlsMasterPlaylist.EMPTY, (HlsMediaPlaylist) null);
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int skipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (skipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i)) {
                return false;
            }
            skipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, skipIgnorableWhitespace));
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
        sb.append(str);
        sb.append("=(");
        sb.append(BOOLEAN_FALSE);
        sb.append("|");
        sb.append(BOOLEAN_TRUE);
        sb.append(")");
        return Pattern.compile(sb.toString());
    }

    private static DrmInitData getPlaylistProtectionSchemes(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData((byte[]) null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String getSegmentEncryptionIV(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    private static HlsMasterPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMasterPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMasterPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String parseStringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C6540C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0));
        } else if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C6540C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        } else {
            if (!KEYFORMAT_PLAYREADY.equals(str2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(parseOptionalStringAttr)) {
                return null;
            }
            String parseStringAttr2 = parseStringAttr(str, REGEX_URI, map);
            byte[] decode = Base64.decode(parseStringAttr2.substring(parseStringAttr2.indexOf(44)), 0);
            UUID uuid = C6540C.PLAYREADY_UUID;
            return new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, PsshAtomUtil.buildPsshAtom(uuid, decode));
        }
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? C6540C.CENC_TYPE_cenc : C6540C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x046b, code lost:
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x04b3, code lost:
        r0 = r0 + 1;
        r31 = r6;
        r32 = r8;
        r33 = r14;
        r15 = r20;
        r8 = r22;
        r6 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist parseMasterPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator r36, java.lang.String r37) throws java.io.IOException {
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
            boolean r14 = r36.hasNext()
            java.lang.String r15 = "application/x-mpegURL"
            if (r14 == 0) goto L_0x021f
            java.lang.String r14 = r36.next()
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
            java.util.regex.Pattern r9 = REGEX_NAME
            java.lang.String r9 = parseStringAttr(r14, r9, r11)
            java.util.regex.Pattern r10 = REGEX_VALUE
            java.lang.String r10 = parseStringAttr(r14, r10, r11)
            r11.put(r9, r10)
            goto L_0x00ce
        L_0x006d:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x0087
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = 1
            goto L_0x0204
        L_0x0087:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x0093
            r3.add(r14)
            goto L_0x00ce
        L_0x0093:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x00c3
            java.util.regex.Pattern r9 = REGEX_KEYFORMAT
            java.lang.String r10 = "identity"
            java.lang.String r9 = parseOptionalStringAttr(r14, r9, r10, r11)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r9 = parseDrmSchemeData(r14, r9, r11)
            if (r9 == 0) goto L_0x00ce
            java.util.regex.Pattern r10 = REGEX_METHOD
            java.lang.String r10 = parseStringAttr(r14, r10, r11)
            java.lang.String r10 = parseEncryptionScheme(r10)
            com.google.android.exoplayer2.drm.DrmInitData r14 = new com.google.android.exoplayer2.drm.DrmInitData
            r15 = 1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r15 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r15]
            r16 = 0
            r15[r16] = r9
            r14.<init>((java.lang.String) r10, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r15)
            r12.add(r14)
            goto L_0x00ce
        L_0x00c3:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r14.startsWith(r10)
            if (r10 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00ce
            goto L_0x00e1
        L_0x00ce:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = r19
            goto L_0x0204
        L_0x00e1:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r14.contains(r10)
            r13 = r13 | r10
            if (r9 == 0) goto L_0x00ef
            r10 = 16384(0x4000, float:2.2959E-41)
            r20 = r13
            goto L_0x00f2
        L_0x00ef:
            r20 = r13
            r10 = 0
        L_0x00f2:
            java.util.regex.Pattern r13 = REGEX_BANDWIDTH
            int r13 = parseIntAttr(r14, r13)
            r28 = r12
            java.util.regex.Pattern r12 = REGEX_AVERAGE_BANDWIDTH
            r29 = r7
            r7 = -1
            int r12 = parseOptionalIntAttr(r14, r12, r7)
            java.util.regex.Pattern r7 = REGEX_CODECS
            java.lang.String r7 = parseOptionalStringAttr(r14, r7, r11)
            r30 = r8
            java.util.regex.Pattern r8 = REGEX_RESOLUTION
            java.lang.String r8 = parseOptionalStringAttr(r14, r8, r11)
            if (r8 == 0) goto L_0x0139
            r31 = r6
            java.lang.String r6 = "x"
            java.lang.String[] r6 = com.google.android.exoplayer2.util.Util.split(r8, r6)
            r8 = 0
            r21 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r21)
            r18 = 1
            r6 = r6[r18]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r8 <= 0) goto L_0x0132
            if (r6 > 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r17 = r8
            goto L_0x0135
        L_0x0132:
            r6 = -1
            r17 = -1
        L_0x0135:
            r8 = r6
            r6 = r17
            goto L_0x013d
        L_0x0139:
            r31 = r6
            r6 = -1
            r8 = -1
        L_0x013d:
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            r32 = r5
            java.util.regex.Pattern r5 = REGEX_FRAME_RATE
            java.lang.String r5 = parseOptionalStringAttr(r14, r5, r11)
            if (r5 == 0) goto L_0x0152
            float r17 = java.lang.Float.parseFloat(r5)
            r33 = r4
            r5 = r17
            goto L_0x0156
        L_0x0152:
            r33 = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0156:
            java.util.regex.Pattern r4 = REGEX_VIDEO
            java.lang.String r4 = parseOptionalStringAttr(r14, r4, r11)
            r34 = r3
            java.util.regex.Pattern r3 = REGEX_AUDIO
            java.lang.String r3 = parseOptionalStringAttr(r14, r3, r11)
            r35 = r0
            java.util.regex.Pattern r0 = REGEX_SUBTITLES
            java.lang.String r0 = parseOptionalStringAttr(r14, r0, r11)
            r17 = r0
            java.util.regex.Pattern r0 = REGEX_CLOSED_CAPTIONS
            java.lang.String r0 = parseOptionalStringAttr(r14, r0, r11)
            if (r9 == 0) goto L_0x0181
            java.util.regex.Pattern r9 = REGEX_URI
            java.lang.String r9 = parseStringAttr(r14, r9, r11)
            android.net.Uri r9 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r1, r9)
            goto L_0x0193
        L_0x0181:
            boolean r9 = r36.hasNext()
            if (r9 == 0) goto L_0x0217
            java.lang.String r9 = r36.next()
            java.lang.String r9 = replaceVariableReferences(r9, r11)
            android.net.Uri r9 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r1, r9)
        L_0x0193:
            com.google.android.exoplayer2.Format$Builder r14 = new com.google.android.exoplayer2.Format$Builder
            r14.<init>()
            int r1 = r2.size()
            com.google.android.exoplayer2.Format$Builder r1 = r14.setId((int) r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setContainerMimeType(r15)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r12)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r13)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setWidth(r6)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r8)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setFrameRate(r5)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRoleFlags(r10)
            com.google.android.exoplayer2.Format r23 = r1.build()
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Variant r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Variant
            r21 = r1
            r22 = r9
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            r1 = r35
            java.lang.Object r5 = r1.get(r9)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x01ea
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r9, r5)
        L_0x01ea:
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo r6 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo
            r21 = r6
            r22 = r12
            r23 = r13
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r6)
            r10 = r19
            r13 = r20
        L_0x0204:
            r0 = r1
            r12 = r28
            r7 = r29
            r8 = r30
            r6 = r31
            r5 = r32
            r4 = r33
            r3 = r34
            r1 = r37
            goto L_0x0036
        L_0x0217:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "#EXT-X-STREAM-INF must be followed by another line"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x021f:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r19 = r10
            r28 = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L_0x023b:
            int r5 = r2.size()
            r6 = 0
            if (r4 >= r5) goto L_0x0292
            java.lang.Object r5 = r2.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Variant r5 = (com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.Variant) r5
            android.net.Uri r7 = r5.url
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L_0x028f
            com.google.android.exoplayer2.Format r7 = r5.format
            com.google.android.exoplayer2.metadata.Metadata r7 = r7.metadata
            if (r7 != 0) goto L_0x0258
            r7 = 1
            goto L_0x0259
        L_0x0258:
            r7 = 0
        L_0x0259:
            com.google.android.exoplayer2.util.Assertions.checkState(r7)
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r7 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            android.net.Uri r8 = r5.url
            java.lang.Object r8 = r1.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            java.util.List r8 = (java.util.List) r8
            r7.<init>(r6, r6, r8)
            com.google.android.exoplayer2.metadata.Metadata r6 = new com.google.android.exoplayer2.metadata.Metadata
            r8 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r9 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r8]
            r8 = 0
            r9[r8] = r7
            r6.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r9)
            com.google.android.exoplayer2.Format r7 = r5.format
            com.google.android.exoplayer2.Format$Builder r7 = r7.buildUpon()
            com.google.android.exoplayer2.Format$Builder r6 = r7.setMetadata(r6)
            com.google.android.exoplayer2.Format r6 = r6.build()
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Variant r5 = r5.copyWithFormat(r6)
            r3.add(r5)
        L_0x028f:
            int r4 = r4 + 1
            goto L_0x023b
        L_0x0292:
            r1 = r6
            r8 = r1
            r0 = 0
        L_0x0295:
            int r4 = r34.size()
            if (r0 >= r4) goto L_0x04c2
            r4 = r34
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r7 = REGEX_GROUP_ID
            java.lang.String r7 = parseStringAttr(r5, r7, r11)
            java.util.regex.Pattern r9 = REGEX_NAME
            java.lang.String r9 = parseStringAttr(r5, r9, r11)
            com.google.android.exoplayer2.Format$Builder r10 = new com.google.android.exoplayer2.Format$Builder
            r10.<init>()
            java.lang.String r12 = java.lang.String.valueOf(r7)
            int r12 = r12.length()
            r14 = 1
            int r12 = r12 + r14
            java.lang.String r14 = java.lang.String.valueOf(r9)
            int r14 = r14.length()
            int r12 = r12 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r12)
            r14.append(r7)
            java.lang.String r12 = ":"
            r14.append(r12)
            r14.append(r9)
            java.lang.String r12 = r14.toString()
            com.google.android.exoplayer2.Format$Builder r10 = r10.setId((java.lang.String) r12)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setLabel(r9)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setContainerMimeType(r15)
            int r12 = parseSelectionFlags(r5)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setSelectionFlags(r12)
            int r12 = parseRoleFlags(r5, r11)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setRoleFlags(r12)
            java.util.regex.Pattern r12 = REGEX_LANGUAGE
            java.lang.String r12 = parseOptionalStringAttr(r5, r12, r11)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setLanguage(r12)
            java.util.regex.Pattern r12 = REGEX_URI
            java.lang.String r12 = parseOptionalStringAttr(r5, r12, r11)
            r14 = r37
            if (r12 != 0) goto L_0x030d
            r12 = r6
            goto L_0x0311
        L_0x030d:
            android.net.Uri r12 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r14, r12)
        L_0x0311:
            com.google.android.exoplayer2.metadata.Metadata r6 = new com.google.android.exoplayer2.metadata.Metadata
            r34 = r4
            r4 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r14 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r4]
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r4 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            r20 = r15
            java.util.List r15 = java.util.Collections.emptyList()
            r4.<init>(r7, r9, r15)
            r15 = 0
            r14[r15] = r4
            r6.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r14)
            java.util.regex.Pattern r4 = REGEX_TYPE
            java.lang.String r4 = parseStringAttr(r5, r4, r11)
            r4.hashCode()
            int r14 = r4.hashCode()
            r15 = 2
            switch(r14) {
                case -959297733: goto L_0x035d;
                case -333210994: goto L_0x0352;
                case 62628790: goto L_0x0347;
                case 81665115: goto L_0x033c;
                default: goto L_0x033a;
            }
        L_0x033a:
            r4 = -1
            goto L_0x0367
        L_0x033c:
            java.lang.String r14 = "VIDEO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0345
            goto L_0x033a
        L_0x0345:
            r4 = 3
            goto L_0x0367
        L_0x0347:
            java.lang.String r14 = "AUDIO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0350
            goto L_0x033a
        L_0x0350:
            r4 = 2
            goto L_0x0367
        L_0x0352:
            java.lang.String r14 = "CLOSED-CAPTIONS"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x035b
            goto L_0x033a
        L_0x035b:
            r4 = 1
            goto L_0x0367
        L_0x035d:
            java.lang.String r14 = "SUBTITLES"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0366
            goto L_0x033a
        L_0x0366:
            r4 = 0
        L_0x0367:
            switch(r4) {
                case 0: goto L_0x046e;
                case 1: goto L_0x042a;
                case 2: goto L_0x03bc;
                case 3: goto L_0x0376;
                default: goto L_0x036a;
            }
        L_0x036a:
            r22 = r8
            r6 = r31
            r8 = r32
            r14 = r33
        L_0x0372:
            r16 = 0
            goto L_0x04b3
        L_0x0376:
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Variant r4 = getVariantWithVideoGroup(r2, r7)
            if (r4 == 0) goto L_0x03a1
            com.google.android.exoplayer2.Format r4 = r4.format
            java.lang.String r5 = r4.codecs
            java.lang.String r5 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r5, r15)
            com.google.android.exoplayer2.Format$Builder r14 = r10.setCodecs(r5)
            java.lang.String r5 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r5)
            com.google.android.exoplayer2.Format$Builder r5 = r14.setSampleMimeType(r5)
            int r14 = r4.width
            com.google.android.exoplayer2.Format$Builder r5 = r5.setWidth(r14)
            int r14 = r4.height
            com.google.android.exoplayer2.Format$Builder r5 = r5.setHeight(r14)
            float r4 = r4.frameRate
            r5.setFrameRate(r4)
        L_0x03a1:
            if (r12 != 0) goto L_0x03a4
            goto L_0x036a
        L_0x03a4:
            r10.setMetadata(r6)
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Rendition r4 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Rendition
            com.google.android.exoplayer2.Format r5 = r10.build()
            r4.<init>(r12, r5, r7, r9)
            r14 = r33
            r14.add(r4)
            r22 = r8
            r6 = r31
            r8 = r32
            goto L_0x0372
        L_0x03bc:
            r14 = r33
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Variant r4 = getVariantWithAudioGroup(r2, r7)
            if (r4 == 0) goto L_0x03d7
            com.google.android.exoplayer2.Format r15 = r4.format
            java.lang.String r15 = r15.codecs
            r22 = r8
            r8 = 1
            java.lang.String r15 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r15, r8)
            r10.setCodecs(r15)
            java.lang.String r15 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r15)
            goto L_0x03da
        L_0x03d7:
            r22 = r8
            r15 = 0
        L_0x03da:
            java.util.regex.Pattern r8 = REGEX_CHANNELS
            java.lang.String r5 = parseOptionalStringAttr(r5, r8, r11)
            if (r5 == 0) goto L_0x0406
            java.lang.String r8 = "/"
            java.lang.String[] r8 = com.google.android.exoplayer2.util.Util.splitAtFirst(r5, r8)
            r16 = 0
            r8 = r8[r16]
            int r8 = java.lang.Integer.parseInt(r8)
            r10.setChannelCount(r8)
            java.lang.String r8 = "audio/eac3"
            boolean r8 = r8.equals(r15)
            if (r8 == 0) goto L_0x0408
            java.lang.String r8 = "/JOC"
            boolean r5 = r5.endsWith(r8)
            if (r5 == 0) goto L_0x0408
            java.lang.String r15 = "audio/eac3-joc"
            goto L_0x0408
        L_0x0406:
            r16 = 0
        L_0x0408:
            r10.setSampleMimeType(r15)
            if (r12 == 0) goto L_0x041f
            r10.setMetadata(r6)
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Rendition r4 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Rendition
            com.google.android.exoplayer2.Format r5 = r10.build()
            r4.<init>(r12, r5, r7, r9)
            r8 = r32
            r8.add(r4)
            goto L_0x046b
        L_0x041f:
            r8 = r32
            if (r4 == 0) goto L_0x046b
            com.google.android.exoplayer2.Format r4 = r10.build()
            r22 = r4
            goto L_0x046b
        L_0x042a:
            r22 = r8
            r8 = r32
            r14 = r33
            r16 = 0
            java.util.regex.Pattern r4 = REGEX_INSTREAM_ID
            java.lang.String r4 = parseStringAttr(r5, r4, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x044b
            java.lang.String r4 = r4.substring(r15)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-608"
            goto L_0x0456
        L_0x044b:
            r5 = 7
            java.lang.String r4 = r4.substring(r5)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-708"
        L_0x0456:
            if (r1 != 0) goto L_0x045d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x045d:
            com.google.android.exoplayer2.Format$Builder r5 = r10.setSampleMimeType(r5)
            r5.setAccessibilityChannel(r4)
            com.google.android.exoplayer2.Format r4 = r10.build()
            r1.add(r4)
        L_0x046b:
            r6 = r31
            goto L_0x04b3
        L_0x046e:
            r22 = r8
            r8 = r32
            r14 = r33
            r16 = 0
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Variant r4 = getVariantWithSubtitleGroup(r2, r7)
            if (r4 == 0) goto L_0x048d
            com.google.android.exoplayer2.Format r4 = r4.format
            java.lang.String r4 = r4.codecs
            r5 = 3
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r4, r5)
            r10.setCodecs(r4)
            java.lang.String r4 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r4)
            goto L_0x048e
        L_0x048d:
            r4 = 0
        L_0x048e:
            if (r4 != 0) goto L_0x0492
            java.lang.String r4 = "text/vtt"
        L_0x0492:
            com.google.android.exoplayer2.Format$Builder r4 = r10.setSampleMimeType(r4)
            r4.setMetadata(r6)
            if (r12 == 0) goto L_0x04aa
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Rendition r4 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$Rendition
            com.google.android.exoplayer2.Format r5 = r10.build()
            r4.<init>(r12, r5, r7, r9)
            r6 = r31
            r6.add(r4)
            goto L_0x04b3
        L_0x04aa:
            r6 = r31
            java.lang.String r4 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            com.google.android.exoplayer2.util.Log.m19797w(r4, r5)
        L_0x04b3:
            int r0 = r0 + 1
            r31 = r6
            r32 = r8
            r33 = r14
            r15 = r20
            r8 = r22
            r6 = 0
            goto L_0x0295
        L_0x04c2:
            r22 = r8
            r6 = r31
            r8 = r32
            r14 = r33
            if (r13 == 0) goto L_0x04d2
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x04d3
        L_0x04d2:
            r9 = r1
        L_0x04d3:
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist r13 = new com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist
            r0 = r13
            r1 = r37
            r2 = r30
            r4 = r14
            r5 = r8
            r7 = r29
            r8 = r22
            r10 = r19
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseMasterPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist");
    }

    private static HlsMediaPlaylist parseMediaPlaylist(HlsMasterPlaylist hlsMasterPlaylist, HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) throws IOException {
        HashMap hashMap;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList;
        boolean z;
        long j;
        long j2;
        HlsMediaPlaylist.Segment segment;
        DrmInitData drmInitData;
        long j3;
        ArrayList arrayList2;
        boolean z2;
        String str8;
        String str9;
        HlsMasterPlaylist hlsMasterPlaylist2 = hlsMasterPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        boolean z3 = hlsMasterPlaylist2.hasIndependentSegments;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl = new HlsMediaPlaylist.ServerControl(C6540C.TIME_UNSET, false, C6540C.TIME_UNSET, C6540C.TIME_UNSET, false);
        TreeMap treeMap = new TreeMap();
        String str10 = "";
        char c = 0;
        boolean z4 = z3;
        HlsMediaPlaylist.ServerControl serverControl2 = serverControl;
        String str11 = str10;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        boolean z5 = false;
        int i = 0;
        long j12 = C6540C.TIME_UNSET;
        int i2 = 0;
        int i3 = 1;
        long j13 = C6540C.TIME_UNSET;
        long j14 = C6540C.TIME_UNSET;
        boolean z6 = false;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        boolean z7 = false;
        HlsMediaPlaylist.Part part = null;
        String str12 = null;
        long j15 = -1;
        String str13 = null;
        String str14 = null;
        int i4 = 0;
        boolean z8 = false;
        HlsMediaPlaylist.Segment segment2 = null;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList5.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                String parseStringAttr = parseStringAttr(next, REGEX_PLAYLIST_TYPE, hashMap2);
                if ("VOD".equals(parseStringAttr)) {
                    i = 1;
                } else if ("EVENT".equals(parseStringAttr)) {
                    i = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                z8 = true;
            } else if (next.startsWith(TAG_START)) {
                j12 = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
            } else if (next.startsWith(TAG_SERVER_CONTROL)) {
                serverControl2 = parseServerControl(next);
            } else if (next.startsWith(TAG_PART_INF)) {
                j14 = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
            } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                String parseStringAttr2 = parseStringAttr(next, REGEX_URI, hashMap2);
                String parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap2);
                if (parseOptionalStringAttr != null) {
                    String[] split = Util.split(parseOptionalStringAttr, "@");
                    j15 = Long.parseLong(split[c]);
                    if (split.length > 1) {
                        j6 = Long.parseLong(split[1]);
                    }
                }
                if (j15 == -1) {
                    j6 = 0;
                }
                String str15 = str12;
                String str16 = str13;
                if (str15 == null || str16 != null) {
                    segment2 = new HlsMediaPlaylist.Segment(parseStringAttr2, j6, j15, str15, str16);
                    if (j15 != -1) {
                        j6 += j15;
                    }
                    str13 = str16;
                    str12 = str15;
                    j15 = -1;
                } else {
                    throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                }
            } else {
                String str17 = str12;
                String str18 = str13;
                if (next.startsWith(TAG_TARGET_DURATION)) {
                    j13 = 1000000 * ((long) parseIntAttr(next, REGEX_TARGET_DURATION));
                } else if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                    j9 = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                    str12 = str17;
                    j5 = j9;
                    str8 = str18;
                    c = 0;
                } else if (next.startsWith(TAG_VERSION)) {
                    i3 = parseIntAttr(next, REGEX_VERSION);
                } else {
                    if (next.startsWith(TAG_DEFINE)) {
                        String parseOptionalStringAttr2 = parseOptionalStringAttr(next, REGEX_IMPORT, hashMap2);
                        if (parseOptionalStringAttr2 != null) {
                            String str19 = hlsMasterPlaylist2.variableDefinitions.get(parseOptionalStringAttr2);
                            if (str19 != null) {
                                hashMap2.put(parseOptionalStringAttr2, str19);
                            }
                        } else {
                            hashMap2.put(parseStringAttr(next, REGEX_NAME, hashMap2), parseStringAttr(next, REGEX_VALUE, hashMap2));
                        }
                        z = z5;
                        str2 = str10;
                        hashMap = hashMap4;
                        str5 = str14;
                        j = j9;
                        str4 = str18;
                        arrayList = arrayList5;
                    } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                        str11 = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str10, hashMap2);
                        hlsMasterPlaylist2 = hlsMasterPlaylist;
                        j10 = (long) (parseDoubleAttr(next, REGEX_MEDIA_DURATION) * 1000000.0d);
                    } else {
                        if (next.startsWith(TAG_SKIP)) {
                            int parseIntAttr = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                            Assertions.checkState(hlsMediaPlaylist2 != null && arrayList3.isEmpty());
                            int i5 = (int) (j5 - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist)).mediaSequence);
                            int i6 = parseIntAttr + i5;
                            if (i5 < 0 || i6 > hlsMediaPlaylist2.segments.size()) {
                                throw new DeltaUpdateException();
                            }
                            String str20 = str10;
                            long j16 = j8;
                            str8 = str18;
                            while (i5 < i6) {
                                HlsMediaPlaylist.Segment segment3 = hlsMediaPlaylist2.segments.get(i5);
                                HashMap hashMap5 = hashMap4;
                                if (j5 != hlsMediaPlaylist2.mediaSequence) {
                                    segment3 = segment3.copyWith(j16, (hlsMediaPlaylist2.discontinuitySequence - i2) + segment3.relativeDiscontinuitySequence);
                                }
                                arrayList3.add(segment3);
                                j16 += segment3.durationUs;
                                long j17 = segment3.byteRangeLength;
                                int i7 = i6;
                                if (j17 != -1) {
                                    j6 = segment3.byteRangeOffset + j17;
                                }
                                int i8 = segment3.relativeDiscontinuitySequence;
                                HlsMediaPlaylist.Segment segment4 = segment3.initializationSegment;
                                DrmInitData drmInitData4 = segment3.drmInitData;
                                String str21 = segment3.fullSegmentEncryptionKeyUri;
                                int i9 = i8;
                                String str22 = segment3.encryptionIV;
                                HlsMediaPlaylist.Segment segment5 = segment4;
                                if (str22 == null || !str22.equals(Long.toHexString(j9))) {
                                    str8 = segment3.encryptionIV;
                                }
                                j9++;
                                i5++;
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                j7 = j16;
                                i4 = i9;
                                i6 = i7;
                                segment2 = segment5;
                                drmInitData3 = drmInitData4;
                                str17 = str21;
                                hashMap4 = hashMap5;
                            }
                            hlsMasterPlaylist2 = hlsMasterPlaylist;
                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                            j8 = j16;
                            str12 = str17;
                            str10 = str20;
                        } else {
                            str2 = str10;
                            hashMap = hashMap4;
                            if (next.startsWith(TAG_KEY)) {
                                String parseStringAttr3 = parseStringAttr(next, REGEX_METHOD, hashMap2);
                                String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, hashMap2);
                                if (METHOD_NONE.equals(parseStringAttr3)) {
                                    treeMap.clear();
                                    str9 = null;
                                    drmInitData3 = null;
                                    str13 = null;
                                } else {
                                    String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_IV, hashMap2);
                                    if (!KEYFORMAT_IDENTITY.equals(parseOptionalStringAttr3)) {
                                        String str23 = str14;
                                        str14 = str23 == null ? parseEncryptionScheme(parseStringAttr3) : str23;
                                        DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr3, hashMap2);
                                        if (parseDrmSchemeData != null) {
                                            treeMap.put(parseOptionalStringAttr3, parseDrmSchemeData);
                                            str13 = parseOptionalStringAttr4;
                                            str9 = null;
                                            drmInitData3 = null;
                                        }
                                    } else if (METHOD_AES_128.equals(parseStringAttr3)) {
                                        str9 = parseStringAttr(next, REGEX_URI, hashMap2);
                                        str13 = parseOptionalStringAttr4;
                                    }
                                    str13 = parseOptionalStringAttr4;
                                    str9 = null;
                                }
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                str12 = str9;
                                str10 = str2;
                                hashMap4 = hashMap;
                                c = 0;
                                hlsMasterPlaylist2 = hlsMasterPlaylist;
                            } else {
                                str5 = str14;
                                if (next.startsWith(TAG_BYTERANGE)) {
                                    String[] split2 = Util.split(parseStringAttr(next, REGEX_BYTERANGE, hashMap2), "@");
                                    j15 = Long.parseLong(split2[0]);
                                    if (split2.length > 1) {
                                        j6 = Long.parseLong(split2[1]);
                                    }
                                } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                    i2 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                    str14 = str5;
                                    str12 = str17;
                                    str8 = str18;
                                    str10 = str2;
                                    hashMap4 = hashMap;
                                    z5 = true;
                                } else if (next.equals(TAG_DISCONTINUITY)) {
                                    i4++;
                                } else if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                    if (j4 == 0) {
                                        j4 = C6540C.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j8;
                                    } else {
                                        z = z5;
                                        arrayList = arrayList5;
                                        j = j9;
                                        str4 = str18;
                                    }
                                } else if (next.equals(TAG_GAP)) {
                                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                    str14 = str5;
                                    str12 = str17;
                                    str13 = str18;
                                    str10 = str2;
                                    hashMap4 = hashMap;
                                    c = 0;
                                    z7 = true;
                                } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                    str14 = str5;
                                    str12 = str17;
                                    str13 = str18;
                                    str10 = str2;
                                    hashMap4 = hashMap;
                                    c = 0;
                                    z4 = true;
                                } else if (next.equals(TAG_ENDLIST)) {
                                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                    str14 = str5;
                                    str12 = str17;
                                    str13 = str18;
                                    str10 = str2;
                                    hashMap4 = hashMap;
                                    c = 0;
                                    z6 = true;
                                } else {
                                    if (next.startsWith(TAG_RENDITION_REPORT)) {
                                        long parseOptionalLongAttr = parseOptionalLongAttr(next, REGEX_LAST_MSN, (j5 + ((long) arrayList3.size())) - (arrayList4.isEmpty() ? 1 : 0));
                                        int parseOptionalIntAttr = parseOptionalIntAttr(next, REGEX_LAST_PART, j14 != C6540C.TIME_UNSET ? (arrayList4.isEmpty() ? ((HlsMediaPlaylist.Segment) C4706d0.m21756c(arrayList3)).parts : arrayList4).size() - 1 : -1);
                                        Uri parse = Uri.parse(UriUtil.resolve(str, parseStringAttr(next, REGEX_URI, hashMap2)));
                                        hashMap.put(parse, new HlsMediaPlaylist.RenditionReport(parse, parseOptionalLongAttr, parseOptionalIntAttr));
                                    } else {
                                        String str24 = str;
                                        HashMap hashMap6 = hashMap;
                                        if (next.startsWith(TAG_PRELOAD_HINT)) {
                                            HlsMediaPlaylist.Part part2 = part;
                                            if (part2 == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, hashMap2))) {
                                                String parseStringAttr4 = parseStringAttr(next, REGEX_URI, hashMap2);
                                                hashMap = hashMap6;
                                                part = part2;
                                                long parseOptionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1);
                                                long parseOptionalLongAttr3 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1);
                                                long j18 = j9;
                                                str4 = str18;
                                                String segmentEncryptionIV = getSegmentEncryptionIV(j18, str17, str4);
                                                if (drmInitData3 != null || treeMap.isEmpty()) {
                                                    z2 = z5;
                                                    arrayList2 = arrayList5;
                                                } else {
                                                    z2 = z5;
                                                    arrayList2 = arrayList5;
                                                    DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData5 = new DrmInitData(str5, schemeDataArr);
                                                    if (drmInitData2 == null) {
                                                        drmInitData2 = getPlaylistProtectionSchemes(str5, schemeDataArr);
                                                    }
                                                    drmInitData3 = drmInitData5;
                                                }
                                                if (parseOptionalLongAttr2 == -1 || parseOptionalLongAttr3 != -1) {
                                                    part = new HlsMediaPlaylist.Part(parseStringAttr4, segment2, 0, i4, j7, drmInitData3, str17, segmentEncryptionIV, parseOptionalLongAttr2 != -1 ? parseOptionalLongAttr2 : 0, parseOptionalLongAttr3, false, false, true);
                                                }
                                                j9 = j18;
                                                str3 = str17;
                                                z5 = z2;
                                                arrayList5 = arrayList2;
                                                c = 0;
                                                hlsMasterPlaylist2 = hlsMasterPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                str6 = str5;
                                                str7 = str4;
                                                str10 = str2;
                                                hashMap4 = hashMap;
                                            } else {
                                                hashMap = hashMap6;
                                                part = part2;
                                            }
                                        } else {
                                            hashMap = hashMap6;
                                            z = z5;
                                            arrayList = arrayList5;
                                            long j19 = j9;
                                            str4 = str18;
                                            if (next.startsWith(TAG_PART)) {
                                                String segmentEncryptionIV2 = getSegmentEncryptionIV(j19, str17, str4);
                                                String parseStringAttr5 = parseStringAttr(next, REGEX_URI, hashMap2);
                                                long j20 = j19;
                                                long parseDoubleAttr = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                                boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z4 && arrayList4.isEmpty());
                                                boolean parseOptionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                                String parseOptionalStringAttr5 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap2);
                                                if (parseOptionalStringAttr5 != null) {
                                                    String[] split3 = Util.split(parseOptionalStringAttr5, "@");
                                                    j3 = Long.parseLong(split3[0]);
                                                    if (split3.length > 1) {
                                                        j11 = Long.parseLong(split3[1]);
                                                    }
                                                } else {
                                                    j3 = -1;
                                                }
                                                if (j3 == -1) {
                                                    j11 = 0;
                                                }
                                                if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData6 = new DrmInitData(str5, schemeDataArr2);
                                                    if (drmInitData2 == null) {
                                                        drmInitData2 = getPlaylistProtectionSchemes(str5, schemeDataArr2);
                                                    }
                                                    drmInitData3 = drmInitData6;
                                                }
                                                arrayList4.add(new HlsMediaPlaylist.Part(parseStringAttr5, segment2, parseDoubleAttr, i4, j7, drmInitData3, str17, segmentEncryptionIV2, j11, j3, parseOptionalBooleanAttribute2, parseOptionalBooleanAttribute, false));
                                                j7 += parseDoubleAttr;
                                                if (j3 != -1) {
                                                    j11 += j3;
                                                }
                                                hlsMasterPlaylist2 = hlsMasterPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                str3 = str17;
                                                j9 = j20;
                                                z5 = z;
                                                arrayList5 = arrayList;
                                                c = 0;
                                                str6 = str5;
                                                str7 = str4;
                                                str10 = str2;
                                                hashMap4 = hashMap;
                                            } else {
                                                long j21 = j19;
                                                if (!next.startsWith("#")) {
                                                    long j22 = j21;
                                                    String segmentEncryptionIV3 = getSegmentEncryptionIV(j22, str17, str4);
                                                    j9 = j22 + 1;
                                                    String replaceVariableReferences = replaceVariableReferences(next, hashMap2);
                                                    HlsMediaPlaylist.Segment segment6 = (HlsMediaPlaylist.Segment) hashMap3.get(replaceVariableReferences);
                                                    if (j15 == -1) {
                                                        j2 = 0;
                                                    } else {
                                                        if (z8 && segment2 == null && segment6 == null) {
                                                            segment6 = new HlsMediaPlaylist.Segment(replaceVariableReferences, 0, j6, (String) null, (String) null);
                                                            hashMap3.put(replaceVariableReferences, segment6);
                                                        }
                                                        j2 = j6;
                                                    }
                                                    if (drmInitData3 != null || treeMap.isEmpty()) {
                                                        segment = segment6;
                                                        drmInitData = drmInitData3;
                                                    } else {
                                                        segment = segment6;
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData = new DrmInitData(str5, schemeDataArr3);
                                                        if (drmInitData2 == null) {
                                                            drmInitData2 = getPlaylistProtectionSchemes(str5, schemeDataArr3);
                                                        }
                                                    }
                                                    arrayList3.add(new HlsMediaPlaylist.Segment(replaceVariableReferences, segment2 != null ? segment2 : segment, str11, j10, i4, j8, drmInitData, str17, segmentEncryptionIV3, j2, j15, z7, arrayList4));
                                                    j7 = j8 + j10;
                                                    arrayList4 = new ArrayList();
                                                    if (j15 != -1) {
                                                        j2 += j15;
                                                    }
                                                    j6 = j2;
                                                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    drmInitData3 = drmInitData;
                                                    str3 = str17;
                                                    j10 = 0;
                                                    j15 = -1;
                                                    j8 = j7;
                                                    z5 = z;
                                                    arrayList5 = arrayList;
                                                    str11 = str2;
                                                    c = 0;
                                                    z7 = false;
                                                    str6 = str5;
                                                    str7 = str4;
                                                    str10 = str11;
                                                    hashMap4 = hashMap;
                                                } else {
                                                    j = j21;
                                                }
                                            }
                                        }
                                    }
                                    z = z5;
                                    arrayList = arrayList5;
                                    j = j9;
                                    str4 = str18;
                                }
                                hlsMasterPlaylist2 = hlsMasterPlaylist;
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                str14 = str5;
                                str12 = str17;
                                str8 = str18;
                                str10 = str2;
                                hashMap4 = hashMap;
                            }
                        }
                        c = 0;
                    }
                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                    j9 = j;
                    str3 = str17;
                    z5 = z;
                    arrayList5 = arrayList;
                    c = 0;
                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                    str6 = str5;
                    str7 = str4;
                    str10 = str2;
                    hashMap4 = hashMap;
                }
                str12 = str17;
                str8 = str18;
                c = 0;
            }
        }
        boolean z9 = z5;
        ArrayList arrayList6 = arrayList5;
        HashMap hashMap7 = hashMap4;
        if (part != null) {
            arrayList4.add(part);
        }
        return new HlsMediaPlaylist(i, str, arrayList6, j12, j4, z9, i2, j5, i3, j13, j14, z4, z6, j4 != 0, drmInitData2, arrayList3, arrayList4, serverControl2, hashMap7);
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? BOOLEAN_TRUE.equals(matcher.group(1)) : z;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1))) : d;
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))) : i;
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) : j;
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, (String) null, map);
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        int i = 0;
        if (TextUtils.isEmpty(parseOptionalStringAttr)) {
            return 0;
        }
        String[] split = Util.split(parseOptionalStringAttr, ",");
        if (Util.contains(split, "public.accessibility.describes-video")) {
            i = 512;
        }
        if (Util.contains(split, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.contains(split, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return Util.contains(split, "public.easy-to-read") ? i | 8192 : i;
    }

    private static int parseSelectionFlags(String str) {
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            parseOptionalBooleanAttribute |= true;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? parseOptionalBooleanAttribute | true ? 1 : 0 : parseOptionalBooleanAttribute ? 1 : 0;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        String str2 = str;
        double parseOptionalDoubleAttr = parseOptionalDoubleAttr(str2, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j = C6540C.TIME_UNSET;
        long j2 = parseOptionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr * 1000000.0d);
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str2, REGEX_CAN_SKIP_DATE_RANGES, false);
        double parseOptionalDoubleAttr2 = parseOptionalDoubleAttr(str2, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j3 = parseOptionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr2 * 1000000.0d);
        double parseOptionalDoubleAttr3 = parseOptionalDoubleAttr(str2, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        if (parseOptionalDoubleAttr3 != -9.223372036854776E18d) {
            j = (long) (parseOptionalDoubleAttr3 * 1000000.0d);
        }
        return new HlsMediaPlaylist.ServerControl(j2, parseOptionalBooleanAttribute, j3, j, parseOptionalBooleanAttribute(str2, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (parseOptionalStringAttr != null) {
            return parseOptionalStringAttr;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(pattern2).length() + 19 + String.valueOf(str).length());
        sb.append("Couldn't match ");
        sb.append(pattern2);
        sb.append(" in ");
        sb.append(str);
        throw new ParserException(sb.toString());
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
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

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    public HlsPlaylistParser(HlsMasterPlaylist hlsMasterPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.masterPlaylist = hlsMasterPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String parseOptionalStringAttr(java.lang.String r0, java.util.regex.Pattern r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x0016
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0016:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0023
            if (r2 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            java.lang.String r2 = replaceVariableReferences(r2, r3)
        L_0x0023:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.parseOptionalStringAttr(java.lang.String, java.util.regex.Pattern, java.lang.String, java.util.Map):java.lang.String");
    }

    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (checkPlaylistHeader(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith(TAG_STREAM_INF)) {
                                if (trim.startsWith(TAG_TARGET_DURATION) || trim.startsWith(TAG_MEDIA_SEQUENCE) || trim.startsWith(TAG_MEDIA_DURATION) || trim.startsWith(TAG_KEY) || trim.startsWith(TAG_BYTERANGE) || trim.equals(TAG_DISCONTINUITY) || trim.equals(TAG_DISCONTINUITY_SEQUENCE)) {
                                    break;
                                } else if (trim.equals(TAG_ENDLIST)) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                HlsMasterPlaylist parseMasterPlaylist = parseMasterPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                                Util.closeQuietly((Closeable) bufferedReader);
                                return parseMasterPlaylist;
                            }
                        }
                    } else {
                        Util.closeQuietly((Closeable) bufferedReader);
                        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return parseMediaPlaylist(this.masterPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
            }
            throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
        } finally {
            Util.closeQuietly((Closeable) bufferedReader);
        }
    }
}
