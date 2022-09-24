package com.google.ads.interactivemedia.p039v3.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amm */
/* compiled from: IMASDK */
public final class amm {

    /* renamed from: a */
    public static final int f15298a;

    /* renamed from: b */
    public static final String f15299b;

    /* renamed from: c */
    public static final String f15300c;

    /* renamed from: d */
    public static final String f15301d;

    /* renamed from: e */
    public static final String f15302e;

    /* renamed from: f */
    public static final byte[] f15303f = new byte[0];

    /* renamed from: g */
    private static final Pattern f15304g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    private static final Pattern f15305h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    private static final Pattern f15306i = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");

    /* renamed from: j */
    private static HashMap<String, String> f15307j;

    /* renamed from: k */
    private static final String[] f15308k = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", TtmlNode.ATTR_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: l */
    private static final String[] f15309l = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: m */
    private static final int[] f15310m = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: n */
    private static final int[] f15311n = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, 136, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 244, 243};

    static {
        int i;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i = 31;
        } else {
            i = "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        }
        f15298a = i;
        String str2 = Build.DEVICE;
        f15299b = str2;
        String str3 = Build.MANUFACTURER;
        f15300c = str3;
        String str4 = Build.MODEL;
        f15301d = str4;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str4).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        f15302e = sb.toString();
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    /* renamed from: A */
    public static String[] m14184A(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: B */
    public static boolean m14185B(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: C */
    public static String m14186C(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    /* renamed from: D */
    public static String m14187D(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    /* renamed from: E */
    public static String m14188E(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: F */
    public static int m14189F(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: G */
    public static long m14190G(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: H */
    public static int m14191H(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: I */
    public static long m14192I(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: J */
    public static float m14193J(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: K */
    public static long m14194K(String str) {
        Matcher matcher = f15305h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d = Double.parseDouble(group6);
        }
        long j = (long) ((parseDouble5 + d) * 1000.0d);
        return isEmpty ? -j : j;
    }

    /* renamed from: L */
    public static long m14195L(String str) throws C4144lb {
        String str2;
        String str3;
        Matcher matcher = f15304g.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "Invalid date/time format: ".concat(valueOf);
            } else {
                str3 = new String("Invalid date/time format: ");
            }
            throw new C4144lb(str3);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i = -i;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf2 = String.valueOf(matcher.group(8));
            if (valueOf2.length() != 0) {
                str2 = "0.".concat(valueOf2);
            } else {
                str2 = new String("0.");
            }
            gregorianCalendar.set(14, new BigDecimal(str2).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
    }

    /* renamed from: M */
    public static long m14196M(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d = (double) j;
        double d2 = (double) j2;
        double d3 = (double) j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d);
        return (long) (d * (d2 / d3));
    }

    /* renamed from: N */
    public static long m14197N(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    /* renamed from: O */
    public static long m14198O(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: P */
    public static long m14199P(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: Q */
    public static long m14200Q(int i, int i2) {
        return m14199P(i2) | (m14199P(i) << 32);
    }

    /* renamed from: R */
    public static String m14201R(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: S */
    public static int m14202S(String str, int i) {
        int i2 = 0;
        for (String m : m14204U(str)) {
            if (i == aln.m14043m(m)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: T */
    public static String m14203T(String str, int i) {
        if (r0 == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : m14204U(str)) {
            if (i == aln.m14043m(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: U */
    public static String[] m14204U(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return m14256z(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: V */
    public static C4120ke m14205V(int i, int i2, int i3) {
        C4119kd kdVar = new C4119kd();
        kdVar.mo16120ae(MimeTypes.AUDIO_RAW);
        kdVar.mo16096H(i2);
        kdVar.mo16121af(i3);
        kdVar.mo16113Y(i);
        return kdVar.mo16115a();
    }

    /* renamed from: W */
    public static int m14206W(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i == 24) {
            return 536870912;
        }
        if (i != 32) {
            return 0;
        }
        return C6540C.ENCODING_PCM_32BIT;
    }

    /* renamed from: X */
    public static boolean m14207X(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: Y */
    public static boolean m14208Y(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: Z */
    public static int m14209Z(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f15298a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static byte[] m14210a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: aa */
    public static int m14211aa(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 + i2;
    }

    /* renamed from: ab */
    public static int m14212ab(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        String C = m14186C(path);
        if (!C.endsWith(".mpd")) {
            if (!C.endsWith(".m3u8")) {
                Matcher matcher = f15306i.matcher(C);
                if (!matcher.matches()) {
                    return 3;
                }
                String group = matcher.group(2);
                if (group == null) {
                    return 1;
                }
                if (!group.contains("format=mpd-time-csf")) {
                    if (group.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                    return 1;
                }
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: ac */
    public static int m14213ac(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* renamed from: ad */
    public static String m14214ad(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return m14187D(networkCountryIso);
            }
        }
        return m14187D(Locale.getDefault().getCountry());
    }

    /* renamed from: ae */
    public static String[] m14215ae() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f15298a >= 24) {
            strArr = m14256z(configuration.getLocales().toLanguageTags(), ",");
        } else {
            strArr = new String[]{m14251u(configuration.locale)};
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = m14252v(strArr[i]);
        }
        return strArr;
    }

    /* renamed from: af */
    public static boolean m14216af(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: ag */
    public static Point m14217ag(Context context) {
        String str;
        String str2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        aup.m14890u(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        int i = f15298a;
        if (i <= 29 && defaultDisplay.getDisplayId() == 0 && m14216af(context)) {
            if ("Sony".equals(f15300c) && f15301d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (i < 28) {
                str = m14230at("sys.display-size");
            } else {
                str = m14230at("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] z = m14256z(str.trim(), "x");
                    if (z.length == 2) {
                        int parseInt = Integer.parseInt(z[0]);
                        int parseInt2 = Integer.parseInt(z[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Invalid display size: ".concat(valueOf);
                } else {
                    str2 = new String("Invalid display size: ");
                }
                Log.e("Util", str2);
            }
        }
        Point point = new Point();
        int i2 = f15298a;
        if (i2 >= 23) {
            Display.Mode mode = defaultDisplay.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i2 >= 17) {
            defaultDisplay.getRealSize(point);
            return point;
        } else {
            defaultDisplay.getSize(point);
            return point;
        }
    }

    /* renamed from: ah */
    public static long m14218ah(long j) {
        if (j == C6540C.TIME_UNSET) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: ai */
    public static long m14219ai(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: aj */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14220aj(long[] r4, long r5, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0009
            r4 = r0 ^ -1
            goto L_0x0017
        L_0x0009:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0009
        L_0x0014:
            if (r7 != 0) goto L_0x0018
            r4 = r0
        L_0x0017:
            return r4
        L_0x0018:
            int r0 = r0 + -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.amm.m14220aj(long[], long, boolean):int");
    }

    /* renamed from: ak */
    public static <T extends Comparable<? super T>> int m14221ak(List<? extends Comparable<? super T>> list, T t, boolean z) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || ((Comparable) list.get(binarySearch)).compareTo(t) != 0) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (((Comparable) list.get(binarySearch)).compareTo(t) != 0);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: al */
    public static int m14222al(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0 || iArr[binarySearch] != i) {
            }
            binarySearch--;
            break;
        } while (iArr[binarySearch] != i);
        return binarySearch;
    }

    /* renamed from: am */
    public static int m14223am(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: an */
    public static int m14224an(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = f15310m[(i2 >>> 24) ^ (bArr[i3] & 255)] ^ (i2 << 8);
        }
        return i2;
    }

    /* renamed from: ao */
    public static int m14225ao(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            i3 = f15311n[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: ap */
    public static String m14226ap(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String str2 = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(55 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("IMA SDK ExoPlayer");
        sb.append("/");
        sb.append(str);
        sb.append(" (Linux;Android ");
        sb.append(str2);
        sb.append(") ExoPlayerLib/2.13.2");
        return sb.toString();
    }

    /* renamed from: aq */
    public static void m14227aq(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: ar */
    public static void m14228ar(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
        } else if (j >= 1000000 || 1000000 % j != 0) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < jArr.length) {
                double d3 = (double) jArr[i];
                Double.isNaN(d3);
                jArr[i] = (long) (d3 * d2);
                i++;
            }
        } else {
            long j3 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
        }
    }

    /* renamed from: as */
    public static long m14229as(long j, long j2) {
        long j3 = j - j2;
        if (((j ^ j3) & (j2 ^ j)) < 0) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    /* renamed from: at */
    private static String m14230at(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            ali.m14023b("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e);
            return null;
        }
    }

    /* renamed from: au */
    private static HashMap<String, String> m14231au() {
        int length = f15308k.length;
        HashMap<String, String> hashMap = new HashMap<>(r2 + 86);
        int i = 0;
        for (String str : Locale.getISOLanguages()) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f15308k;
            int length2 = strArr.length;
            if (i >= 86) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: b */
    public static boolean m14232b(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: c */
    public static boolean m14233c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m14234d(Object[] objArr, Object obj) {
        for (Object c : objArr) {
            if (m14233c(c, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static <T> void m14235e(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: f */
    public static <T> T m14236f(T t) {
        return t;
    }

    /* renamed from: g */
    public static <T> T[] m14237g(T[] tArr) {
        return tArr;
    }

    /* renamed from: h */
    public static <T> T[] m14238h(T[] tArr, int i) {
        aup.m14885p(i <= tArr.length);
        return Arrays.copyOf(tArr, i);
    }

    /* renamed from: i */
    public static <T> T[] m14239i(T[] tArr, T t) {
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        return copyOf;
    }

    /* renamed from: j */
    public static <T> T[] m14240j(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    /* renamed from: k */
    public static Handler m14241k() {
        return m14242l((Handler.Callback) null);
    }

    /* renamed from: l */
    public static Handler m14242l(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        aup.m14889t(myLooper);
        return m14244n(myLooper, callback);
    }

    /* renamed from: m */
    public static Handler m14243m() {
        return m14244n(m14245o(), (Handler.Callback) null);
    }

    /* renamed from: n */
    public static Handler m14244n(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: o */
    public static Looper m14245o() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    /* renamed from: p */
    public static ExecutorService m14246p(String str) {
        return Executors.newSingleThreadExecutor(new aml(str));
    }

    /* renamed from: q */
    public static void m14247q(ajg ajg) {
        if (ajg != null) {
            try {
                ajg.mo13299f();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: r */
    public static void m14248r(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: s */
    public static boolean m14249s(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: t */
    public static void m14250t(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: u */
    public static String m14251u(Locale locale) {
        if (f15298a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    /* renamed from: v */
    public static String m14252v(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !C6540C.LANGUAGE_UNDETERMINED.equals(replace)) {
            str = replace;
        }
        String C = m14186C(str);
        int i = 0;
        String str2 = m14184A(C, "-")[0];
        if (f15307j == null) {
            f15307j = m14231au();
        }
        String str3 = f15307j.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(C.substring(str2.length()));
            if (valueOf.length() != 0) {
                C = str3.concat(valueOf);
            } else {
                C = new String(str3);
            }
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return C;
        }
        while (true) {
            String[] strArr = f15309l;
            int length = strArr.length;
            if (i >= 18) {
                return C;
            }
            if (C.startsWith(strArr[i])) {
                String valueOf2 = String.valueOf(strArr[i + 1]);
                String valueOf3 = String.valueOf(C.substring(strArr[i].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i += 2;
        }
    }

    /* renamed from: w */
    public static String m14253w(byte[] bArr) {
        return new String(bArr, arm.f15614b);
    }

    /* renamed from: x */
    public static String m14254x(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, arm.f15614b);
    }

    /* renamed from: y */
    public static byte[] m14255y(String str) {
        return str.getBytes(arm.f15614b);
    }

    /* renamed from: z */
    public static String[] m14256z(String str, String str2) {
        return str.split(str2, -1);
    }
}
