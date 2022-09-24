package p145s0;

import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: s0.a */
/* compiled from: ExifInterface */
public class C6008a {

    /* renamed from: A */
    static final String[] f25006A = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: B */
    static final int[] f25007B = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: C */
    static final byte[] f25008C = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: D */
    private static final C6011c[] f25009D;

    /* renamed from: E */
    private static final C6011c[] f25010E;

    /* renamed from: F */
    private static final C6011c[] f25011F;

    /* renamed from: G */
    private static final C6011c[] f25012G;

    /* renamed from: H */
    private static final C6011c[] f25013H;

    /* renamed from: I */
    private static final C6011c f25014I = new C6011c("StripOffsets", 273, 3);

    /* renamed from: J */
    private static final C6011c[] f25015J;

    /* renamed from: K */
    private static final C6011c[] f25016K;

    /* renamed from: L */
    private static final C6011c[] f25017L;

    /* renamed from: M */
    private static final C6011c[] f25018M;

    /* renamed from: N */
    static final C6011c[][] f25019N;

    /* renamed from: O */
    private static final C6011c[] f25020O = {new C6011c("SubIFDPointer", 330, 4), new C6011c("ExifIFDPointer", 34665, 4), new C6011c("GPSInfoIFDPointer", 34853, 4), new C6011c("InteroperabilityIFDPointer", 40965, 4), new C6011c("CameraSettingsIFDPointer", 8224, 1), new C6011c("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: P */
    private static final C6011c f25021P = new C6011c("JPEGInterchangeFormat", 513, 4);

    /* renamed from: Q */
    private static final C6011c f25022Q = new C6011c("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4);

    /* renamed from: R */
    private static final HashMap<Integer, C6011c>[] f25023R;

    /* renamed from: S */
    private static final HashMap<String, C6011c>[] f25024S;

    /* renamed from: T */
    private static final HashSet<String> f25025T = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: U */
    private static final HashMap<Integer, Integer> f25026U = new HashMap<>();

    /* renamed from: V */
    static final Charset f25027V;

    /* renamed from: W */
    static final byte[] f25028W;

    /* renamed from: X */
    private static final Pattern f25029X = Pattern.compile(".*[1-9].*");

    /* renamed from: Y */
    private static final Pattern f25030Y = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: r */
    private static final List<Integer> f25031r = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: s */
    private static final List<Integer> f25032s = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: t */
    public static final int[] f25033t = {8, 8, 8};

    /* renamed from: u */
    public static final int[] f25034u = {4};

    /* renamed from: v */
    public static final int[] f25035v = {8};

    /* renamed from: w */
    static final byte[] f25036w = {-1, -40, -1};

    /* renamed from: x */
    private static final byte[] f25037x = {79, 76, 89, 77, 80, 0};

    /* renamed from: y */
    private static final byte[] f25038y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: z */
    private static SimpleDateFormat f25039z;

    /* renamed from: a */
    private final String f25040a;

    /* renamed from: b */
    private final AssetManager.AssetInputStream f25041b;

    /* renamed from: c */
    private int f25042c;

    /* renamed from: d */
    private final HashMap<String, C6010b>[] f25043d;

    /* renamed from: e */
    private Set<Integer> f25044e;

    /* renamed from: f */
    private ByteOrder f25045f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g */
    private boolean f25046g;

    /* renamed from: h */
    private int f25047h;

    /* renamed from: i */
    private int f25048i;

    /* renamed from: j */
    private byte[] f25049j;

    /* renamed from: k */
    private int f25050k;

    /* renamed from: l */
    private int f25051l;

    /* renamed from: m */
    private int f25052m;

    /* renamed from: n */
    private int f25053n;

    /* renamed from: o */
    private int f25054o;

    /* renamed from: p */
    private int f25055p;

    /* renamed from: q */
    private boolean f25056q;

    /* renamed from: s0.a$b */
    /* compiled from: ExifInterface */
    private static class C6010b {

        /* renamed from: a */
        public final int f25063a;

        /* renamed from: b */
        public final int f25064b;

        /* renamed from: c */
        public final byte[] f25065c;

        C6010b(int i, int i2, byte[] bArr) {
            this.f25063a = i;
            this.f25064b = i2;
            this.f25065c = bArr;
        }

        /* renamed from: a */
        public static C6010b m26470a(String str) {
            byte[] bytes = (str + 0).getBytes(C6008a.f25027V);
            return new C6010b(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C6010b m26471b(long j, ByteOrder byteOrder) {
            return m26472c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C6010b m26472c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C6008a.f25007B[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C6010b(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C6010b m26473d(C6012d dVar, ByteOrder byteOrder) {
            return m26474e(new C6012d[]{dVar}, byteOrder);
        }

        /* renamed from: e */
        public static C6010b m26474e(C6012d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C6008a.f25007B[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (C6012d dVar : dVarArr) {
                wrap.putInt((int) dVar.f25070a);
                wrap.putInt((int) dVar.f25071b);
            }
            return new C6010b(5, dVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C6010b m26475f(int i, ByteOrder byteOrder) {
            return m26476g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C6010b m26476g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C6008a.f25007B[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C6010b(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double mo23127h(ByteOrder byteOrder) {
            Object k = mo23130k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof C6012d[]) {
                    C6012d[] dVarArr = (C6012d[]) k;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].mo23133a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: i */
        public int mo23128i(ByteOrder byteOrder) {
            Object k = mo23130k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: j */
        public String mo23129j(ByteOrder byteOrder) {
            Object k = mo23130k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof C6012d[])) {
                return null;
            } else {
                C6012d[] dVarArr = (C6012d[]) k;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].f25070a);
                    sb.append('/');
                    sb.append(dVarArr[i].f25071b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x019f A[SYNTHETIC, Splitter:B:164:0x019f] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo23130k(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                s0.a$a r3 = new s0.a$a     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                byte[] r4 = r10.f25065c     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                r3.mo23109f(r11)     // Catch:{ IOException -> 0x0185 }
                int r11 = r10.f25063a     // Catch:{ IOException -> 0x0185 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0185 }
            L_0x0016:
                goto L_0x017c
            L_0x0018:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x001c:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0036:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0185 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                s0.a$d[] r11 = new p145s0.C6008a.C6012d[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0051:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0185 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0185 }
                s0.a$d r4 = new s0.a$d     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0076:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0090:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                s0.a$d[] r11 = new p145s0.C6008a.C6012d[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00aa:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo23107d()     // Catch:{ IOException -> 0x0185 }
                long r8 = r3.mo23107d()     // Catch:{ IOException -> 0x0185 }
                s0.a$d r4 = new s0.a$d     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00cd:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo23107d()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00e7:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                byte[] r6 = p145s0.C6008a.f25008C     // Catch:{ IOException -> 0x0185 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0185 }
                if (r11 < r6) goto L_0x011a
                r11 = 0
            L_0x0105:
                byte[] r6 = p145s0.C6008a.f25008C     // Catch:{ IOException -> 0x0185 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0185 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f25065c     // Catch:{ IOException -> 0x0185 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0185 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0185 }
                if (r7 == r8) goto L_0x0114
                r4 = 0
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0185 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0185 }
                r11.<init>()     // Catch:{ IOException -> 0x0185 }
            L_0x011f:
                int r4 = r10.f25064b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.f25065c     // Catch:{ IOException -> 0x0185 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0185 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0185 }
                r11.append(r4)     // Catch:{ IOException -> 0x0185 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0185 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f25065c     // Catch:{ IOException -> 0x0185 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0185 }
                if (r6 != r4) goto L_0x016c
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                if (r6 < 0) goto L_0x016c
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                if (r6 > r4) goto L_0x016c
                java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0185 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0185 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch:{ IOException -> 0x0185 }
                r4[r5] = r11     // Catch:{ IOException -> 0x0185 }
                r6.<init>(r4)     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0167 }
                goto L_0x016b
            L_0x0167:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x016b:
                return r6
            L_0x016c:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0185 }
                java.nio.charset.Charset r5 = p145s0.C6008a.f25027V     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0177 }
                goto L_0x017b
            L_0x0177:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x017b:
                return r4
            L_0x017c:
                r3.close()     // Catch:{ IOException -> 0x0180 }
                goto L_0x0184
            L_0x0180:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0184:
                return r2
            L_0x0185:
                r11 = move-exception
                goto L_0x018b
            L_0x0187:
                r11 = move-exception
                goto L_0x019d
            L_0x0189:
                r11 = move-exception
                r3 = r2
            L_0x018b:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019b }
                if (r3 == 0) goto L_0x019a
                r3.close()     // Catch:{ IOException -> 0x0196 }
                goto L_0x019a
            L_0x0196:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019a:
                return r2
            L_0x019b:
                r11 = move-exception
                r2 = r3
            L_0x019d:
                if (r2 == 0) goto L_0x01a7
                r2.close()     // Catch:{ IOException -> 0x01a3 }
                goto L_0x01a7
            L_0x01a3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01a7:
                goto L_0x01a9
            L_0x01a8:
                throw r11
            L_0x01a9:
                goto L_0x01a8
            */
            throw new UnsupportedOperationException("Method not decompiled: p145s0.C6008a.C6010b.mo23130k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C6008a.f25006A[this.f25063a] + ", data length:" + this.f25065c.length + ")";
        }
    }

    /* renamed from: s0.a$d */
    /* compiled from: ExifInterface */
    private static class C6012d {

        /* renamed from: a */
        public final long f25070a;

        /* renamed from: b */
        public final long f25071b;

        C6012d(long j, long j2) {
            if (j2 == 0) {
                this.f25070a = 0;
                this.f25071b = 1;
                return;
            }
            this.f25070a = j;
            this.f25071b = j2;
        }

        /* renamed from: a */
        public double mo23133a() {
            double d = (double) this.f25070a;
            double d2 = (double) this.f25071b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.f25070a + "/" + this.f25071b;
        }
    }

    static {
        C6011c[] cVarArr = {new C6011c("NewSubfileType", 254, 4), new C6011c("SubfileType", 255, 4), new C6011c("ImageWidth", 256, 3, 4), new C6011c("ImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new C6011c("BitsPerSample", 258, 3), new C6011c("Compression", 259, 3), new C6011c("PhotometricInterpretation", 262, 3), new C6011c("ImageDescription", 270, 2), new C6011c("Make", 271, 2), new C6011c("Model", 272, 2), new C6011c("StripOffsets", 273, 3, 4), new C6011c("Orientation", 274, 3), new C6011c("SamplesPerPixel", 277, 3), new C6011c("RowsPerStrip", 278, 3, 4), new C6011c("StripByteCounts", 279, 3, 4), new C6011c("XResolution", 282, 5), new C6011c("YResolution", 283, 5), new C6011c("PlanarConfiguration", 284, 3), new C6011c("ResolutionUnit", 296, 3), new C6011c("TransferFunction", 301, 3), new C6011c("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new C6011c("DateTime", 306, 2), new C6011c("Artist", 315, 2), new C6011c("WhitePoint", 318, 5), new C6011c("PrimaryChromaticities", 319, 5), new C6011c("SubIFDPointer", 330, 4), new C6011c("JPEGInterchangeFormat", 513, 4), new C6011c("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new C6011c("YCbCrCoefficients", 529, 5), new C6011c("YCbCrSubSampling", 530, 3), new C6011c("YCbCrPositioning", 531, 3), new C6011c("ReferenceBlackWhite", 532, 5), new C6011c("Copyright", 33432, 2), new C6011c("ExifIFDPointer", 34665, 4), new C6011c("GPSInfoIFDPointer", 34853, 4), new C6011c("SensorTopBorder", 4, 4), new C6011c("SensorLeftBorder", 5, 4), new C6011c("SensorBottomBorder", 6, 4), new C6011c("SensorRightBorder", 7, 4), new C6011c("ISO", 23, 3), new C6011c("JpgFromRaw", 46, 7)};
        f25009D = cVarArr;
        C6011c[] cVarArr2 = {new C6011c("ExposureTime", 33434, 5), new C6011c("FNumber", 33437, 5), new C6011c("ExposureProgram", 34850, 3), new C6011c("SpectralSensitivity", 34852, 2), new C6011c("PhotographicSensitivity", 34855, 3), new C6011c("OECF", 34856, 7), new C6011c("ExifVersion", 36864, 2), new C6011c("DateTimeOriginal", 36867, 2), new C6011c("DateTimeDigitized", 36868, 2), new C6011c("ComponentsConfiguration", 37121, 7), new C6011c("CompressedBitsPerPixel", 37122, 5), new C6011c("ShutterSpeedValue", 37377, 10), new C6011c("ApertureValue", 37378, 5), new C6011c("BrightnessValue", 37379, 10), new C6011c("ExposureBiasValue", 37380, 10), new C6011c("MaxApertureValue", 37381, 5), new C6011c("SubjectDistance", 37382, 5), new C6011c("MeteringMode", 37383, 3), new C6011c("LightSource", 37384, 3), new C6011c("Flash", 37385, 3), new C6011c("FocalLength", 37386, 5), new C6011c("SubjectArea", 37396, 3), new C6011c("MakerNote", 37500, 7), new C6011c("UserComment", 37510, 7), new C6011c("SubSecTime", 37520, 2), new C6011c("SubSecTimeOriginal", 37521, 2), new C6011c("SubSecTimeDigitized", 37522, 2), new C6011c("FlashpixVersion", 40960, 7), new C6011c("ColorSpace", 40961, 3), new C6011c("PixelXDimension", 40962, 3, 4), new C6011c("PixelYDimension", 40963, 3, 4), new C6011c("RelatedSoundFile", 40964, 2), new C6011c("InteroperabilityIFDPointer", 40965, 4), new C6011c("FlashEnergy", 41483, 5), new C6011c("SpatialFrequencyResponse", 41484, 7), new C6011c("FocalPlaneXResolution", 41486, 5), new C6011c("FocalPlaneYResolution", 41487, 5), new C6011c("FocalPlaneResolutionUnit", 41488, 3), new C6011c("SubjectLocation", 41492, 3), new C6011c("ExposureIndex", 41493, 5), new C6011c("SensingMethod", 41495, 3), new C6011c("FileSource", 41728, 7), new C6011c("SceneType", 41729, 7), new C6011c("CFAPattern", 41730, 7), new C6011c("CustomRendered", 41985, 3), new C6011c("ExposureMode", 41986, 3), new C6011c("WhiteBalance", 41987, 3), new C6011c("DigitalZoomRatio", 41988, 5), new C6011c("FocalLengthIn35mmFilm", 41989, 3), new C6011c("SceneCaptureType", 41990, 3), new C6011c("GainControl", 41991, 3), new C6011c("Contrast", 41992, 3), new C6011c("Saturation", 41993, 3), new C6011c("Sharpness", 41994, 3), new C6011c("DeviceSettingDescription", 41995, 7), new C6011c("SubjectDistanceRange", 41996, 3), new C6011c("ImageUniqueID", 42016, 2), new C6011c("DNGVersion", 50706, 1), new C6011c("DefaultCropSize", 50720, 3, 4)};
        f25010E = cVarArr2;
        C6011c[] cVarArr3 = {new C6011c("GPSVersionID", 0, 1), new C6011c("GPSLatitudeRef", 1, 2), new C6011c("GPSLatitude", 2, 5), new C6011c("GPSLongitudeRef", 3, 2), new C6011c("GPSLongitude", 4, 5), new C6011c("GPSAltitudeRef", 5, 1), new C6011c("GPSAltitude", 6, 5), new C6011c("GPSTimeStamp", 7, 5), new C6011c("GPSSatellites", 8, 2), new C6011c("GPSStatus", 9, 2), new C6011c("GPSMeasureMode", 10, 2), new C6011c("GPSDOP", 11, 5), new C6011c("GPSSpeedRef", 12, 2), new C6011c("GPSSpeed", 13, 5), new C6011c("GPSTrackRef", 14, 2), new C6011c("GPSTrack", 15, 5), new C6011c("GPSImgDirectionRef", 16, 2), new C6011c("GPSImgDirection", 17, 5), new C6011c("GPSMapDatum", 18, 2), new C6011c("GPSDestLatitudeRef", 19, 2), new C6011c("GPSDestLatitude", 20, 5), new C6011c("GPSDestLongitudeRef", 21, 2), new C6011c("GPSDestLongitude", 22, 5), new C6011c("GPSDestBearingRef", 23, 2), new C6011c("GPSDestBearing", 24, 5), new C6011c("GPSDestDistanceRef", 25, 2), new C6011c("GPSDestDistance", 26, 5), new C6011c("GPSProcessingMethod", 27, 7), new C6011c("GPSAreaInformation", 28, 7), new C6011c("GPSDateStamp", 29, 2), new C6011c("GPSDifferential", 30, 3)};
        f25011F = cVarArr3;
        C6011c[] cVarArr4 = {new C6011c("InteroperabilityIndex", 1, 2)};
        f25012G = cVarArr4;
        C6011c[] cVarArr5 = {new C6011c("NewSubfileType", 254, 4), new C6011c("SubfileType", 255, 4), new C6011c("ThumbnailImageWidth", 256, 3, 4), new C6011c("ThumbnailImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new C6011c("BitsPerSample", 258, 3), new C6011c("Compression", 259, 3), new C6011c("PhotometricInterpretation", 262, 3), new C6011c("ImageDescription", 270, 2), new C6011c("Make", 271, 2), new C6011c("Model", 272, 2), new C6011c("StripOffsets", 273, 3, 4), new C6011c("Orientation", 274, 3), new C6011c("SamplesPerPixel", 277, 3), new C6011c("RowsPerStrip", 278, 3, 4), new C6011c("StripByteCounts", 279, 3, 4), new C6011c("XResolution", 282, 5), new C6011c("YResolution", 283, 5), new C6011c("PlanarConfiguration", 284, 3), new C6011c("ResolutionUnit", 296, 3), new C6011c("TransferFunction", 301, 3), new C6011c("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new C6011c("DateTime", 306, 2), new C6011c("Artist", 315, 2), new C6011c("WhitePoint", 318, 5), new C6011c("PrimaryChromaticities", 319, 5), new C6011c("SubIFDPointer", 330, 4), new C6011c("JPEGInterchangeFormat", 513, 4), new C6011c("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new C6011c("YCbCrCoefficients", 529, 5), new C6011c("YCbCrSubSampling", 530, 3), new C6011c("YCbCrPositioning", 531, 3), new C6011c("ReferenceBlackWhite", 532, 5), new C6011c("Copyright", 33432, 2), new C6011c("ExifIFDPointer", 34665, 4), new C6011c("GPSInfoIFDPointer", 34853, 4), new C6011c("DNGVersion", 50706, 1), new C6011c("DefaultCropSize", 50720, 3, 4)};
        f25013H = cVarArr5;
        C6011c[] cVarArr6 = {new C6011c("ThumbnailImage", 256, 7), new C6011c("CameraSettingsIFDPointer", 8224, 4), new C6011c("ImageProcessingIFDPointer", 8256, 4)};
        f25015J = cVarArr6;
        C6011c[] cVarArr7 = {new C6011c("PreviewImageStart", TsExtractor.TS_STREAM_TYPE_AIT, 4), new C6011c("PreviewImageLength", 258, 4)};
        f25016K = cVarArr7;
        C6011c[] cVarArr8 = {new C6011c("AspectFrame", 4371, 3)};
        f25017L = cVarArr8;
        C6011c[] cVarArr9 = {new C6011c("ColorSpace", 55, 3)};
        f25018M = cVarArr9;
        C6011c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        f25019N = cVarArr10;
        f25023R = new HashMap[cVarArr10.length];
        f25024S = new HashMap[cVarArr10.length];
        Charset forName = Charset.forName(C6540C.ASCII_NAME);
        f25027V = forName;
        f25028W = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f25039z = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C6011c[][] cVarArr11 = f25019N;
            if (i < cVarArr11.length) {
                f25023R[i] = new HashMap<>();
                f25024S[i] = new HashMap<>();
                for (C6011c cVar : cVarArr11[i]) {
                    f25023R[i].put(Integer.valueOf(cVar.f25066a), cVar);
                    f25024S[i].put(cVar.f25067b, cVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f25026U;
                C6011c[] cVarArr12 = f25020O;
                hashMap.put(Integer.valueOf(cVarArr12[0].f25066a), 5);
                hashMap.put(Integer.valueOf(cVarArr12[1].f25066a), 1);
                hashMap.put(Integer.valueOf(cVarArr12[2].f25066a), 2);
                hashMap.put(Integer.valueOf(cVarArr12[3].f25066a), 3);
                hashMap.put(Integer.valueOf(cVarArr12[4].f25066a), 7);
                hashMap.put(Integer.valueOf(cVarArr12[5].f25066a), 8);
                return;
            }
        }
    }

    public C6008a(InputStream inputStream) throws IOException {
        C6011c[][] cVarArr = f25019N;
        this.f25043d = new HashMap[cVarArr.length];
        this.f25044e = new HashSet(cVarArr.length);
        if (inputStream != null) {
            this.f25040a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f25041b = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.f25041b = null;
            }
            m26457t(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    /* renamed from: A */
    private void m26437A(int i, int i2) throws IOException {
        if (!this.f25043d[i].isEmpty() && !this.f25043d[i2].isEmpty()) {
            C6010b bVar = this.f25043d[i].get("ImageLength");
            C6010b bVar2 = this.f25043d[i].get("ImageWidth");
            C6010b bVar3 = this.f25043d[i2].get("ImageLength");
            C6010b bVar4 = this.f25043d[i2].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int i3 = bVar.mo23128i(this.f25045f);
                int i4 = bVar2.mo23128i(this.f25045f);
                int i5 = bVar3.mo23128i(this.f25045f);
                int i6 = bVar4.mo23128i(this.f25045f);
                if (i3 < i5 && i4 < i6) {
                    HashMap<String, C6010b>[] hashMapArr = this.f25043d;
                    HashMap<String, C6010b> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: B */
    private void m26438B(C6009a aVar, int i) throws IOException {
        C6010b bVar;
        C6010b bVar2;
        C6010b bVar3 = this.f25043d[i].get("DefaultCropSize");
        C6010b bVar4 = this.f25043d[i].get("SensorTopBorder");
        C6010b bVar5 = this.f25043d[i].get("SensorLeftBorder");
        C6010b bVar6 = this.f25043d[i].get("SensorBottomBorder");
        C6010b bVar7 = this.f25043d[i].get("SensorRightBorder");
        if (bVar3 != null) {
            if (bVar3.f25063a == 5) {
                C6012d[] dVarArr = (C6012d[]) bVar3.mo23130k(this.f25045f);
                if (dVarArr == null || dVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                    return;
                }
                bVar2 = C6010b.m26473d(dVarArr[0], this.f25045f);
                bVar = C6010b.m26473d(dVarArr[1], this.f25045f);
            } else {
                int[] iArr = (int[]) bVar3.mo23130k(this.f25045f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                bVar2 = C6010b.m26475f(iArr[0], this.f25045f);
                bVar = C6010b.m26475f(iArr[1], this.f25045f);
            }
            this.f25043d[i].put("ImageWidth", bVar2);
            this.f25043d[i].put("ImageLength", bVar);
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            m26462y(aVar, i);
        } else {
            int i2 = bVar4.mo23128i(this.f25045f);
            int i3 = bVar6.mo23128i(this.f25045f);
            int i4 = bVar7.mo23128i(this.f25045f);
            int i5 = bVar5.mo23128i(this.f25045f);
            if (i3 > i2 && i4 > i5) {
                C6010b f = C6010b.m26475f(i3 - i2, this.f25045f);
                C6010b f2 = C6010b.m26475f(i4 - i5, this.f25045f);
                this.f25043d[i].put("ImageLength", f);
                this.f25043d[i].put("ImageWidth", f2);
            }
        }
    }

    /* renamed from: C */
    private void m26439C(InputStream inputStream) throws IOException {
        m26437A(0, 5);
        m26437A(0, 4);
        m26437A(5, 4);
        C6010b bVar = this.f25043d[1].get("PixelXDimension");
        C6010b bVar2 = this.f25043d[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f25043d[0].put("ImageWidth", bVar);
            this.f25043d[0].put("ImageLength", bVar2);
        }
        if (this.f25043d[4].isEmpty() && m26456s(this.f25043d[5])) {
            HashMap<String, C6010b>[] hashMapArr = this.f25043d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m26456s(this.f25043d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: a */
    private void m26440a() {
        String c = mo23103c("DateTimeOriginal");
        if (c != null && mo23103c("DateTime") == null) {
            this.f25043d[0].put("DateTime", C6010b.m26470a(c));
        }
        if (mo23103c("ImageWidth") == null) {
            this.f25043d[0].put("ImageWidth", C6010b.m26471b(0, this.f25045f));
        }
        if (mo23103c("ImageLength") == null) {
            this.f25043d[0].put("ImageLength", C6010b.m26471b(0, this.f25045f));
        }
        if (mo23103c("Orientation") == null) {
            this.f25043d[0].put("Orientation", C6010b.m26471b(0, this.f25045f));
        }
        if (mo23103c("LightSource") == null) {
            this.f25043d[1].put("LightSource", C6010b.m26471b(0, this.f25045f));
        }
    }

    /* renamed from: b */
    private static long[] m26441b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: e */
    private C6010b m26442e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f25019N.length; i++) {
            C6010b bVar = this.f25043d[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26443f(p145s0.C6008a.C6009a r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.mo23109f(r0)
            long r0 = (long) r11
            r10.mo23108e(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, s0.a$b>[] r0 = r9.f25043d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f25045f
            s0.a$b r5 = p145s0.C6008a.C6010b.m26471b(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, s0.a$b>[] r0 = r9.f25043d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f25045f
            s0.a$b r5 = p145s0.C6008a.C6010b.m26471b(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.mo23103c(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, s0.a$b>[] r5 = r9.f25043d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = f25027V
            r7.<init>(r0, r8)
            s0.a$b r0 = p145s0.C6008a.C6010b.m26470a(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = f25028W
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.f25051l = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.m26460w(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f25045f
            r10.mo23109f(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            goto L_0x016f
        L_0x016e:
            throw r10
        L_0x016f:
            goto L_0x016e
        */
        throw new UnsupportedOperationException("Method not decompiled: p145s0.C6008a.m26443f(s0.a$a, int, int):void");
    }

    /* renamed from: g */
    private int m26444g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m26451n(bArr)) {
            return 4;
        }
        if (m26453p(bArr)) {
            return 9;
        }
        if (m26452o(bArr)) {
            return 7;
        }
        return m26454q(bArr) ? 10 : 0;
    }

    /* renamed from: h */
    private void m26445h(C6009a aVar) throws IOException {
        m26447j(aVar);
        C6010b bVar = this.f25043d[1].get("MakerNote");
        if (bVar != null) {
            C6009a aVar2 = new C6009a(bVar.f25065c);
            aVar2.mo23109f(this.f25045f);
            byte[] bArr = f25037x;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.mo23108e(0);
            byte[] bArr3 = f25038y;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.mo23108e(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.mo23108e(12);
            }
            m26461x(aVar2, 6);
            C6010b bVar2 = this.f25043d[7].get("PreviewImageStart");
            C6010b bVar3 = this.f25043d[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                this.f25043d[5].put("JPEGInterchangeFormat", bVar2);
                this.f25043d[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            C6010b bVar4 = this.f25043d[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.mo23130k(this.f25045f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C6010b f = C6010b.m26475f(i, this.f25045f);
                    C6010b f2 = C6010b.m26475f(i2, this.f25045f);
                    this.f25043d[0].put("ImageWidth", f);
                    this.f25043d[0].put("ImageLength", f2);
                }
            }
        }
    }

    /* renamed from: i */
    private void m26446i(C6009a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m26443f(aVar, i, 5);
        aVar.mo23108e((long) i2);
        aVar.mo23109f(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f25014I.f25066a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C6010b f = C6010b.m26475f(readShort, this.f25045f);
                C6010b f2 = C6010b.m26475f(readShort2, this.f25045f);
                this.f25043d[0].put("ImageLength", f);
                this.f25043d[0].put("ImageWidth", f2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: j */
    private void m26447j(C6009a aVar) throws IOException {
        C6010b bVar;
        m26458u(aVar, aVar.available());
        m26461x(aVar, 0);
        m26438B(aVar, 0);
        m26438B(aVar, 5);
        m26438B(aVar, 4);
        m26439C(aVar);
        if (this.f25042c == 8 && (bVar = this.f25043d[1].get("MakerNote")) != null) {
            C6009a aVar2 = new C6009a(bVar.f25065c);
            aVar2.mo23109f(this.f25045f);
            aVar2.mo23108e(6);
            m26461x(aVar2, 9);
            C6010b bVar2 = this.f25043d[9].get("ColorSpace");
            if (bVar2 != null) {
                this.f25043d[1].put("ColorSpace", bVar2);
            }
        }
    }

    /* renamed from: k */
    private void m26448k(C6009a aVar) throws IOException {
        m26447j(aVar);
        if (this.f25043d[0].get("JpgFromRaw") != null) {
            m26443f(aVar, this.f25055p, 5);
        }
        C6010b bVar = this.f25043d[0].get("ISO");
        C6010b bVar2 = this.f25043d[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.f25043d[1].put("PhotographicSensitivity", bVar);
        }
    }

    /* renamed from: l */
    private void m26449l(C6009a aVar, HashMap hashMap) throws IOException {
        int i;
        C6010b bVar = (C6010b) hashMap.get("JPEGInterchangeFormat");
        C6010b bVar2 = (C6010b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int i2 = bVar.mo23128i(this.f25045f);
            int min = Math.min(bVar2.mo23128i(this.f25045f), aVar.available() - i2);
            int i3 = this.f25042c;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i = this.f25051l;
            } else {
                if (i3 == 7) {
                    i = this.f25052m;
                }
                if (i2 > 0 && min > 0) {
                    this.f25046g = true;
                    this.f25047h = i2;
                    this.f25048i = min;
                    if (this.f25040a == null && this.f25041b == null) {
                        byte[] bArr = new byte[min];
                        aVar.mo23108e((long) i2);
                        aVar.readFully(bArr);
                        this.f25049j = bArr;
                        return;
                    }
                    return;
                }
            }
            i2 += i;
            if (i2 > 0) {
            }
        }
    }

    /* renamed from: m */
    private void m26450m(C6009a aVar, HashMap hashMap) throws IOException {
        C6010b bVar = (C6010b) hashMap.get("StripOffsets");
        C6010b bVar2 = (C6010b) hashMap.get("StripByteCounts");
        if (bVar != null && bVar2 != null) {
            long[] b = m26441b(bVar.mo23130k(this.f25045f));
            long[] b2 = m26441b(bVar2.mo23130k(this.f25045f));
            if (b == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
            } else if (b2 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
            } else {
                long j = 0;
                for (long j2 : b2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < b.length; i4++) {
                    int i5 = (int) b[i4];
                    int i6 = (int) b2[i4];
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    aVar.mo23108e((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    aVar.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f25046g = true;
                this.f25049j = bArr;
                this.f25048i = i;
            }
        }
    }

    /* renamed from: n */
    private static boolean m26451n(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f25036w;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: o */
    private boolean m26452o(byte[] bArr) throws IOException {
        C6009a aVar = new C6009a(bArr);
        ByteOrder v = m26459v(aVar);
        this.f25045f = v;
        aVar.mo23109f(v);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: p */
    private boolean m26453p(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private boolean m26454q(byte[] bArr) throws IOException {
        C6009a aVar = new C6009a(bArr);
        ByteOrder v = m26459v(aVar);
        this.f25045f = v;
        aVar.mo23109f(v);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* renamed from: r */
    private boolean m26455r(HashMap hashMap) throws IOException {
        C6010b bVar;
        C6010b bVar2 = (C6010b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.mo23130k(this.f25045f);
        int[] iArr2 = f25033t;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f25042c != 3 || (bVar = (C6010b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i = bVar.mo23128i(this.f25045f);
        if ((i != 1 || !Arrays.equals(iArr, f25035v)) && (i != 6 || !Arrays.equals(iArr, iArr2))) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private boolean m26456s(HashMap hashMap) throws IOException {
        C6010b bVar = (C6010b) hashMap.get("ImageLength");
        C6010b bVar2 = (C6010b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.mo23128i(this.f25045f) <= 512 && bVar2.mo23128i(this.f25045f) <= 512;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f25056q = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        m26440a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26457t(java.io.InputStream r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            s0.a$c[][] r2 = f25019N     // Catch:{ IOException -> 0x0047 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0047 }
            if (r1 >= r2) goto L_0x0013
            java.util.HashMap<java.lang.String, s0.a$b>[] r2 = r4.f25043d     // Catch:{ IOException -> 0x0047 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0047 }
            r3.<init>()     // Catch:{ IOException -> 0x0047 }
            r2[r1] = r3     // Catch:{ IOException -> 0x0047 }
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0013:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0047 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x0047 }
            int r5 = r4.m26444g(r1)     // Catch:{ IOException -> 0x0047 }
            r4.f25042c = r5     // Catch:{ IOException -> 0x0047 }
            s0.a$a r5 = new s0.a$a     // Catch:{ IOException -> 0x0047 }
            r5.<init>((java.io.InputStream) r1)     // Catch:{ IOException -> 0x0047 }
            int r1 = r4.f25042c     // Catch:{ IOException -> 0x0047 }
            switch(r1) {
                case 0: goto L_0x003b;
                case 1: goto L_0x003b;
                case 2: goto L_0x003b;
                case 3: goto L_0x003b;
                case 4: goto L_0x0037;
                case 5: goto L_0x003b;
                case 6: goto L_0x003b;
                case 7: goto L_0x0033;
                case 8: goto L_0x003b;
                case 9: goto L_0x002f;
                case 10: goto L_0x002b;
                case 11: goto L_0x003b;
                default: goto L_0x002a;
            }     // Catch:{ IOException -> 0x0047 }
        L_0x002a:
            goto L_0x003e
        L_0x002b:
            r4.m26448k(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x002f:
            r4.m26446i(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0033:
            r4.m26445h(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0037:
            r4.m26443f(r5, r0, r0)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x003b:
            r4.m26447j(r5)     // Catch:{ IOException -> 0x0047 }
        L_0x003e:
            r4.m26463z(r5)     // Catch:{ IOException -> 0x0047 }
            r5 = 1
            r4.f25056q = r5     // Catch:{ IOException -> 0x0047 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            goto L_0x004d
        L_0x0047:
            r4.f25056q = r0     // Catch:{ all -> 0x0045 }
        L_0x0049:
            r4.m26440a()
            return
        L_0x004d:
            r4.m26440a()
            goto L_0x0052
        L_0x0051:
            throw r5
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: p145s0.C6008a.m26457t(java.io.InputStream):void");
    }

    /* renamed from: u */
    private void m26458u(C6009a aVar, int i) throws IOException {
        ByteOrder v = m26459v(aVar);
        this.f25045f = v;
        aVar.mo23109f(v);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f25042c;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && aVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: v */
    private ByteOrder m26459v(C6009a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: w */
    private void m26460w(byte[] bArr, int i) throws IOException {
        C6009a aVar = new C6009a(bArr);
        m26458u(aVar, bArr.length);
        m26461x(aVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26461x(p145s0.C6008a.C6009a r25, int r26) throws java.io.IOException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.Set<java.lang.Integer> r3 = r0.f25044e
            int r4 = r1.f25062e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f25062e
            int r3 = r3 + 2
            int r4 = r1.f25061d
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r25.readShort()
            int r4 = r1.f25062e
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.f25061d
            if (r4 > r5) goto L_0x0327
            if (r3 > 0) goto L_0x002b
            goto L_0x0327
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r9 = "ExifInterface"
            if (r5 >= r3) goto L_0x02b7
            int r10 = r25.readUnsignedShort()
            int r11 = r25.readUnsignedShort()
            int r12 = r25.readInt()
            int r13 = r25.mo23106c()
            long r13 = (long) r13
            r15 = 4
            long r13 = r13 + r15
            java.util.HashMap<java.lang.Integer, s0.a$c>[] r17 = f25023R
            r4 = r17[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r8)
            s0.a$c r4 = (p145s0.C6008a.C6011c) r4
            r8 = 7
            if (r4 != 0) goto L_0x006e
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "Skip the tag entry since tag number is not defined: "
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = r15.toString()
            android.util.Log.w(r9, r6)
        L_0x0069:
            r16 = r5
            r7 = r9
            goto L_0x00e8
        L_0x006e:
            if (r11 <= 0) goto L_0x00d1
            int[] r6 = f25007B
            int r7 = r6.length
            if (r11 < r7) goto L_0x0076
            goto L_0x00d1
        L_0x0076:
            boolean r7 = r4.mo23132a(r11)
            if (r7 != 0) goto L_0x009f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = f25006A
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.f25067b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r9, r6)
            goto L_0x0069
        L_0x009f:
            if (r11 != r8) goto L_0x00a3
            int r11 = r4.f25068c
        L_0x00a3:
            r7 = r9
            long r8 = (long) r12
            r6 = r6[r11]
            r16 = r5
            long r5 = (long) r6
            long r5 = r5 * r8
            r8 = 0
            int r20 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r20 < 0) goto L_0x00bc
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r20 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r20 <= 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r8 = 1
            goto L_0x00eb
        L_0x00bc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r7, r8)
            goto L_0x00ea
        L_0x00d1:
            r16 = r5
            r7 = r9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Skip the tag entry since data format is invalid: "
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r7, r5)
        L_0x00e8:
            r5 = 0
        L_0x00ea:
            r8 = 0
        L_0x00eb:
            if (r8 != 0) goto L_0x00f4
            r1.mo23108e(r13)
            r19 = r3
            goto L_0x02b0
        L_0x00f4:
            java.lang.String r8 = "Compression"
            r18 = 4
            int r9 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x01a8
            int r9 = r25.readInt()
            int r15 = r0.f25042c
            r19 = r3
            r3 = 7
            if (r15 != r3) goto L_0x0166
            java.lang.String r3 = r4.f25067b
            java.lang.String r15 = "MakerNote"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x0114
            r0.f25052m = r9
            goto L_0x015f
        L_0x0114:
            r3 = 6
            if (r2 != r3) goto L_0x015f
            java.lang.String r15 = r4.f25067b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x015f
            r0.f25053n = r9
            r0.f25054o = r12
            java.nio.ByteOrder r3 = r0.f25045f
            r15 = 6
            s0.a$b r3 = p145s0.C6008a.C6010b.m26475f(r15, r3)
            int r15 = r0.f25053n
            r20 = r11
            r18 = r12
            long r11 = (long) r15
            java.nio.ByteOrder r15 = r0.f25045f
            s0.a$b r11 = p145s0.C6008a.C6010b.m26471b(r11, r15)
            int r12 = r0.f25054o
            r21 = r13
            long r12 = (long) r12
            java.nio.ByteOrder r14 = r0.f25045f
            s0.a$b r12 = p145s0.C6008a.C6010b.m26471b(r12, r14)
            java.util.HashMap<java.lang.String, s0.a$b>[] r13 = r0.f25043d
            r14 = 4
            r13 = r13[r14]
            r13.put(r8, r3)
            java.util.HashMap<java.lang.String, s0.a$b>[] r3 = r0.f25043d
            r3 = r3[r14]
            java.lang.String r13 = "JPEGInterchangeFormat"
            r3.put(r13, r11)
            java.util.HashMap<java.lang.String, s0.a$b>[] r3 = r0.f25043d
            r3 = r3[r14]
            java.lang.String r11 = "JPEGInterchangeFormatLength"
            r3.put(r11, r12)
            goto L_0x017c
        L_0x015f:
            r20 = r11
            r18 = r12
            r21 = r13
            goto L_0x017c
        L_0x0166:
            r20 = r11
            r18 = r12
            r21 = r13
            r3 = 10
            if (r15 != r3) goto L_0x017c
            java.lang.String r3 = r4.f25067b
            java.lang.String r11 = "JpgFromRaw"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x017c
            r0.f25055p = r9
        L_0x017c:
            long r11 = (long) r9
            long r13 = r11 + r5
            int r3 = r1.f25061d
            r15 = r4
            long r3 = (long) r3
            int r23 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r23 > 0) goto L_0x018d
            r1.mo23108e(r11)
            r13 = r21
            goto L_0x01af
        L_0x018d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data offset is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r7, r3)
            r13 = r21
            r1.mo23108e(r13)
            goto L_0x02b0
        L_0x01a8:
            r19 = r3
            r15 = r4
            r20 = r11
            r18 = r12
        L_0x01af:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = f25026U
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 8
            r9 = 3
            if (r3 == 0) goto L_0x0248
            r5 = -1
            r11 = r20
            if (r11 == r9) goto L_0x01e5
            r8 = 4
            if (r11 == r8) goto L_0x01e0
            if (r11 == r4) goto L_0x01db
            r4 = 9
            if (r11 == r4) goto L_0x01d6
            r4 = 13
            if (r11 == r4) goto L_0x01d6
        L_0x01d3:
            r8 = 0
            goto L_0x01eb
        L_0x01d6:
            int r4 = r25.readInt()
            goto L_0x01e9
        L_0x01db:
            short r4 = r25.readShort()
            goto L_0x01e9
        L_0x01e0:
            long r5 = r25.mo23107d()
            goto L_0x01d3
        L_0x01e5:
            int r4 = r25.readUnsignedShort()
        L_0x01e9:
            long r5 = (long) r4
            goto L_0x01d3
        L_0x01eb:
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0230
            int r4 = r1.f25061d
            long r8 = (long) r4
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0230
            java.util.Set<java.lang.Integer> r4 = r0.f25044e
            int r8 = (int) r5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L_0x020e
            r1.mo23108e(r5)
            int r3 = r3.intValue()
            r0.m26461x(r1, r3)
            goto L_0x0244
        L_0x020e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r4.append(r8)
            r4.append(r3)
            java.lang.String r3 = " (at "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r7, r3)
            goto L_0x0244
        L_0x0230:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r7, r3)
        L_0x0244:
            r1.mo23108e(r13)
            goto L_0x02b0
        L_0x0248:
            r11 = r20
            int r3 = (int) r5
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            s0.a$b r5 = new s0.a$b
            r6 = r18
            r5.<init>(r11, r6, r3)
            java.util.HashMap<java.lang.String, s0.a$b>[] r3 = r0.f25043d
            r3 = r3[r2]
            r6 = r15
            java.lang.String r7 = r6.f25067b
            r3.put(r7, r5)
            java.lang.String r3 = r6.f25067b
            java.lang.String r7 = "DNGVersion"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x026d
            r0.f25042c = r9
        L_0x026d:
            java.lang.String r3 = r6.f25067b
            java.lang.String r7 = "Make"
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L_0x0281
            java.lang.String r3 = r6.f25067b
            java.lang.String r7 = "Model"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x028f
        L_0x0281:
            java.nio.ByteOrder r3 = r0.f25045f
            java.lang.String r3 = r5.mo23129j(r3)
            java.lang.String r7 = "PENTAX"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x02a2
        L_0x028f:
            java.lang.String r3 = r6.f25067b
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x02a4
            java.nio.ByteOrder r3 = r0.f25045f
            int r3 = r5.mo23128i(r3)
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r5) goto L_0x02a4
        L_0x02a2:
            r0.f25042c = r4
        L_0x02a4:
            int r3 = r25.mo23106c()
            long r3 = (long) r3
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x02b0
            r1.mo23108e(r13)
        L_0x02b0:
            int r5 = r16 + 1
            short r5 = (short) r5
            r3 = r19
            goto L_0x002c
        L_0x02b7:
            r7 = r9
            int r2 = r25.mo23106c()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f25061d
            if (r2 > r3) goto L_0x0327
            int r2 = r25.readInt()
            long r3 = (long) r2
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0313
            int r5 = r1.f25061d
            if (r2 >= r5) goto L_0x0313
            java.util.Set<java.lang.Integer> r5 = r0.f25044e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02fe
            r1.mo23108e(r3)
            java.util.HashMap<java.lang.String, s0.a$b>[] r2 = r0.f25043d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02ef
            r0.m26461x(r1, r3)
            goto L_0x0327
        L_0x02ef:
            java.util.HashMap<java.lang.String, s0.a$b>[] r2 = r0.f25043d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0327
            r0.m26461x(r1, r3)
            goto L_0x0327
        L_0x02fe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r7, r1)
            goto L_0x0327
        L_0x0313:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r7, r1)
        L_0x0327:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145s0.C6008a.m26461x(s0.a$a, int):void");
    }

    /* renamed from: y */
    private void m26462y(C6009a aVar, int i) throws IOException {
        C6010b bVar;
        C6010b bVar2 = this.f25043d[i].get("ImageLength");
        C6010b bVar3 = this.f25043d[i].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f25043d[i].get("JPEGInterchangeFormat")) != null) {
            m26443f(aVar, bVar.mo23128i(this.f25045f), i);
        }
    }

    /* renamed from: z */
    private void m26463z(C6009a aVar) throws IOException {
        HashMap<String, C6010b> hashMap = this.f25043d[4];
        C6010b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int i = bVar.mo23128i(this.f25045f);
            this.f25050k = i;
            if (i != 1) {
                if (i == 6) {
                    m26449l(aVar, hashMap);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (m26455r(hashMap)) {
                m26450m(aVar, hashMap);
                return;
            }
            return;
        }
        this.f25050k = 6;
        m26449l(aVar, hashMap);
    }

    /* renamed from: c */
    public String mo23103c(String str) {
        C6010b e = m26442e(str);
        if (e != null) {
            if (!f25025T.contains(str)) {
                return e.mo23129j(this.f25045f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = e.f25063a;
                if (i == 5 || i == 10) {
                    C6012d[] dVarArr = (C6012d[]) e.mo23130k(this.f25045f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].f25070a) / ((float) dVarArr[0].f25071b))), Integer.valueOf((int) (((float) dVarArr[1].f25070a) / ((float) dVarArr[1].f25071b))), Integer.valueOf((int) (((float) dVarArr[2].f25070a) / ((float) dVarArr[2].f25071b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + e.f25063a);
                return null;
            }
            try {
                return Double.toString(e.mo23127h(this.f25045f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public int mo23104d(String str, int i) {
        C6010b e = m26442e(str);
        if (e == null) {
            return i;
        }
        try {
            return e.mo23128i(this.f25045f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: s0.a$a */
    /* compiled from: ExifInterface */
    private static class C6009a extends InputStream implements DataInput {

        /* renamed from: f */
        private static final ByteOrder f25057f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g */
        private static final ByteOrder f25058g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b */
        private DataInputStream f25059b;

        /* renamed from: c */
        private ByteOrder f25060c;

        /* renamed from: d */
        final int f25061d;

        /* renamed from: e */
        int f25062e;

        public C6009a(InputStream inputStream) throws IOException {
            this.f25060c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f25059b = dataInputStream;
            int available = dataInputStream.available();
            this.f25061d = available;
            this.f25062e = 0;
            this.f25059b.mark(available);
        }

        public int available() throws IOException {
            return this.f25059b.available();
        }

        /* renamed from: c */
        public int mo23106c() {
            return this.f25062e;
        }

        /* renamed from: d */
        public long mo23107d() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: e */
        public void mo23108e(long j) throws IOException {
            int i = this.f25062e;
            if (((long) i) > j) {
                this.f25062e = 0;
                this.f25059b.reset();
                this.f25059b.mark(this.f25061d);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: f */
        public void mo23109f(ByteOrder byteOrder) {
            this.f25060c = byteOrder;
        }

        public int read() throws IOException {
            this.f25062e++;
            return this.f25059b.read();
        }

        public boolean readBoolean() throws IOException {
            this.f25062e++;
            return this.f25059b.readBoolean();
        }

        public byte readByte() throws IOException {
            int i = this.f25062e + 1;
            this.f25062e = i;
            if (i <= this.f25061d) {
                int read = this.f25059b.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f25062e += 2;
            return this.f25059b.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f25062e + i2;
            this.f25062e = i3;
            if (i3 > this.f25061d) {
                throw new EOFException();
            } else if (this.f25059b.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i = this.f25062e + 4;
            this.f25062e = i;
            if (i <= this.f25061d) {
                int read = this.f25059b.read();
                int read2 = this.f25059b.read();
                int read3 = this.f25059b.read();
                int read4 = this.f25059b.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f25060c;
                    if (byteOrder == f25057f) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f25058g) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f25060c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            int i = this.f25062e + 8;
            this.f25062e = i;
            if (i <= this.f25061d) {
                int read = this.f25059b.read();
                int read2 = this.f25059b.read();
                int read3 = this.f25059b.read();
                int read4 = this.f25059b.read();
                int read5 = this.f25059b.read();
                int read6 = this.f25059b.read();
                int read7 = this.f25059b.read();
                int read8 = this.f25059b.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f25060c;
                    if (byteOrder == f25057f) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f25058g) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f25060c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.f25062e + 2;
            this.f25062e = i;
            if (i <= this.f25061d) {
                int read = this.f25059b.read();
                int read2 = this.f25059b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f25060c;
                    if (byteOrder == f25057f) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f25058g) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f25060c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f25062e += 2;
            return this.f25059b.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f25062e++;
            return this.f25059b.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i = this.f25062e + 2;
            this.f25062e = i;
            if (i <= this.f25061d) {
                int read = this.f25059b.read();
                int read2 = this.f25059b.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f25060c;
                    if (byteOrder == f25057f) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f25058g) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f25060c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f25061d - this.f25062e);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f25059b.skipBytes(min - i2);
            }
            this.f25062e += i2;
            return i2;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f25059b.read(bArr, i, i2);
            this.f25062e += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f25062e + bArr.length;
            this.f25062e = length;
            if (length > this.f25061d) {
                throw new EOFException();
            } else if (this.f25059b.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C6009a(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: s0.a$c */
    /* compiled from: ExifInterface */
    static class C6011c {

        /* renamed from: a */
        public final int f25066a;

        /* renamed from: b */
        public final String f25067b;

        /* renamed from: c */
        public final int f25068c;

        /* renamed from: d */
        public final int f25069d;

        C6011c(String str, int i, int i2) {
            this.f25067b = str;
            this.f25066a = i;
            this.f25068c = i2;
            this.f25069d = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo23132a(int i) {
            int i2;
            int i3 = this.f25068c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f25069d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        C6011c(String str, int i, int i2, int i3) {
            this.f25067b = str;
            this.f25066a = i;
            this.f25068c = i2;
            this.f25069d = i3;
        }
    }
}
