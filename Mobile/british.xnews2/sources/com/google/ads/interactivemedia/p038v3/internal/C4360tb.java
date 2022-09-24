package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tb */
/* compiled from: IMASDK */
final class C4360tb {

    /* renamed from: A */
    public int f18675A = 1000;

    /* renamed from: B */
    public int f18676B = 200;

    /* renamed from: C */
    public float f18677C = -1.0f;

    /* renamed from: D */
    public float f18678D = -1.0f;

    /* renamed from: E */
    public float f18679E = -1.0f;

    /* renamed from: F */
    public float f18680F = -1.0f;

    /* renamed from: G */
    public float f18681G = -1.0f;

    /* renamed from: H */
    public float f18682H = -1.0f;

    /* renamed from: I */
    public float f18683I = -1.0f;

    /* renamed from: J */
    public float f18684J = -1.0f;

    /* renamed from: K */
    public float f18685K = -1.0f;

    /* renamed from: L */
    public float f18686L = -1.0f;

    /* renamed from: M */
    public byte[] f18687M;

    /* renamed from: N */
    public int f18688N = 1;

    /* renamed from: O */
    public int f18689O = -1;

    /* renamed from: P */
    public int f18690P = 8000;

    /* renamed from: Q */
    public long f18691Q = 0;

    /* renamed from: R */
    public long f18692R = 0;

    /* renamed from: S */
    public C4361tc f18693S;

    /* renamed from: T */
    public boolean f18694T;

    /* renamed from: U */
    public boolean f18695U = true;

    /* renamed from: V */
    public C4327rw f18696V;

    /* renamed from: W */
    public int f18697W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f18698X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public String f18699Y = "eng";

    /* renamed from: a */
    public String f18700a;

    /* renamed from: b */
    public String f18701b;

    /* renamed from: c */
    public int f18702c;

    /* renamed from: d */
    public int f18703d;

    /* renamed from: e */
    public int f18704e;

    /* renamed from: f */
    public int f18705f;

    /* renamed from: g */
    public boolean f18706g;

    /* renamed from: h */
    public byte[] f18707h;

    /* renamed from: i */
    public C4326rv f18708i;

    /* renamed from: j */
    public byte[] f18709j;

    /* renamed from: k */
    public C4276pz f18710k;

    /* renamed from: l */
    public int f18711l = -1;

    /* renamed from: m */
    public int f18712m = -1;

    /* renamed from: n */
    public int f18713n = -1;

    /* renamed from: o */
    public int f18714o = -1;

    /* renamed from: p */
    public int f18715p = 0;

    /* renamed from: q */
    public int f18716q = -1;

    /* renamed from: r */
    public float f18717r = 0.0f;

    /* renamed from: s */
    public float f18718s = 0.0f;

    /* renamed from: t */
    public float f18719t = 0.0f;

    /* renamed from: u */
    public byte[] f18720u = null;

    /* renamed from: v */
    public int f18721v = -1;

    /* renamed from: w */
    public boolean f18722w = false;

    /* renamed from: x */
    public int f18723x = -1;

    /* renamed from: y */
    public int f18724y = -1;

    /* renamed from: z */
    public int f18725z = -1;

    private C4360tb() {
    }

    /* synthetic */ C4360tb(byte[] bArr) {
    }

    /* renamed from: f */
    private static Pair<String, List<byte[]>> m18912f(alw alw) throws C4144lb {
        try {
            alw.mo13954l(16);
            long v = alw.mo13964v();
            if (v == 1482049860) {
                return new Pair<>(MimeTypes.VIDEO_DIVX, (Object) null);
            }
            if (v == 859189832) {
                return new Pair<>(MimeTypes.VIDEO_H263, (Object) null);
            }
            if (v == 826496599) {
                int h = alw.mo13950h() + 20;
                byte[] j = alw.mo13952j();
                while (true) {
                    int length = j.length;
                    if (h >= length - 4) {
                        throw new C4144lb("Failed to find FourCC VC1 initialization data");
                    } else if (j[h] == 0 && j[h + 1] == 0 && j[h + 2] == 1 && j[h + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(j, h, length)));
                    } else {
                        h++;
                    }
                }
            } else {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C4144lb("Error parsing FourCC private data");
        }
    }

    /* renamed from: g */
    private static List<byte[]> m18913g(byte[] bArr) throws C4144lb {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i] & 255;
                    if (b != 255) {
                        break;
                    }
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3] & 255;
                    if (b2 != 255) {
                        break;
                    }
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + b2;
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            int length = bArr.length - i9;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i9, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C4144lb("Error parsing vorbis codec private");
                    }
                    throw new C4144lb("Error parsing vorbis codec private");
                }
                throw new C4144lb("Error parsing vorbis codec private");
            }
            throw new C4144lb("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C4144lb("Error parsing vorbis codec private");
        }
    }

    /* renamed from: h */
    private static boolean m18914h(alw alw) throws C4144lb {
        try {
            int q = alw.mo13959q();
            if (q == 1) {
                return true;
            }
            if (q == 65534) {
                alw.mo13951i(24);
                return alw.mo13967y() == C4362td.f18737e.getMostSignificantBits() && alw.mo13967y() == C4362td.f18737e.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C4144lb("Error parsing MS/ACM codec private");
        }
    }

    /* renamed from: i */
    private final byte[] m18915i(String str) throws C4144lb {
        byte[] bArr = this.f18709j;
        if (bArr != null) {
            return bArr;
        }
        String valueOf = String.valueOf(str);
        throw new C4144lb(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0249, code lost:
        r17 = com.google.android.exoplayer2.util.MimeTypes.AUDIO_UNKNOWN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024d, code lost:
        r1 = null;
        r2 = null;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02bc, code lost:
        r1 = null;
        r2 = null;
        r3 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0350, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0382, code lost:
        r3 = -1;
        r8 = -1;
        r19 = r2;
        r2 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a3, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a6, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a7, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a8, code lost:
        r4 = r0.f18687M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03aa, code lost:
        if (r4 == null) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03ac, code lost:
        r4 = com.google.ads.interactivemedia.p038v3.internal.amq.m14259a(new com.google.ads.interactivemedia.p038v3.internal.alw(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03b5, code lost:
        if (r4 == null) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03b7, code lost:
        r2 = r4.f15323a;
        r17 = com.google.android.exoplayer2.util.MimeTypes.VIDEO_DOLBY_VISION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03bb, code lost:
        r4 = r17;
        r7 = r0.f18695U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03c1, code lost:
        if (true == r0.f18694T) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c3, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03c5, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03c6, code lost:
        r7 = r7 | r11;
        r11 = new com.google.ads.interactivemedia.p038v3.internal.C4119kd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d0, code lost:
        if (com.google.ads.interactivemedia.p038v3.internal.aln.m14031a(r4) == false) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03d2, code lost:
        r11.mo16096H(r0.f18688N);
        r11.mo16121af(r0.f18690P);
        r11.mo16113Y(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03e5, code lost:
        if (com.google.ads.interactivemedia.p038v3.internal.aln.m14032b(r4) == false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03e9, code lost:
        if (r0.f18715p != 0) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03eb, code lost:
        r5 = r0.f18713n;
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03ee, code lost:
        if (r5 != -1) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03f0, code lost:
        r5 = r0.f18711l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03f2, code lost:
        r0.f18713n = r5;
        r5 = r0.f18714o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f6, code lost:
        if (r5 != -1) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03f8, code lost:
        r5 = r0.f18712m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03fa, code lost:
        r0.f18714o = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fd, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03fe, code lost:
        r5 = r0.f18713n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0402, code lost:
        if (r5 == r6) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0404, code lost:
        r10 = r0.f18714o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0406, code lost:
        if (r10 == r6) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0408, code lost:
        r5 = ((float) (r0.f18712m * r5)) / ((float) (r0.f18711l * r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0414, code lost:
        r5 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0418, code lost:
        if (r0.f18722w == false) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x041e, code lost:
        if (r0.f18677C == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0424, code lost:
        if (r0.f18678D == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x042a, code lost:
        if (r0.f18679E == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0430, code lost:
        if (r0.f18680F == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0436, code lost:
        if (r0.f18681G == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x043c, code lost:
        if (r0.f18682H == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0442, code lost:
        if (r0.f18683I == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0448, code lost:
        if (r0.f18684J == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x044e, code lost:
        if (r0.f18685K == -1.0f) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0454, code lost:
        if (r0.f18686L != -1.0f) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0458, code lost:
        r8 = new byte[25];
        r10 = java.nio.ByteBuffer.wrap(r8).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r10.put((byte) 0);
        r10.putShort((short) ((int) ((r0.f18677C * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r0.f18678D * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r0.f18679E * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r0.f18680F * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r0.f18681G * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r0.f18682H * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r0.f18683I * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) ((r0.f18684J * 50000.0f) + 0.5f)));
        r10.putShort((short) ((int) (r0.f18685K + 0.5f)));
        r10.putShort((short) ((int) (r0.f18686L + 0.5f)));
        r10.putShort((short) r0.f18675A);
        r10.putShort((short) r0.f18676B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04db, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04dd, code lost:
        r10 = new com.google.ads.interactivemedia.p038v3.internal.amp(r0.f18723x, r0.f18725z, r0.f18724y, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04e9, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ed, code lost:
        if (r0.f18700a == null) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04f9, code lost:
        if (com.google.ads.interactivemedia.p038v3.internal.C4362td.f18738f.containsKey(r0.f18700a) == false) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04fb, code lost:
        r6 = ((java.lang.Integer) com.google.ads.interactivemedia.p038v3.internal.C4362td.f18738f.get(r0.f18700a)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x050d, code lost:
        if (r0.f18716q != 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0516, code lost:
        if (java.lang.Float.compare(r0.f18717r, 0.0f) != 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x051e, code lost:
        if (java.lang.Float.compare(r0.f18718s, 0.0f) != 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0526, code lost:
        if (java.lang.Float.compare(r0.f18719t, 0.0f) != 0) goto L_0x0529;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0531, code lost:
        if (java.lang.Float.compare(r0.f18718s, 90.0f) != 0) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0533, code lost:
        r9 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x053e, code lost:
        if (java.lang.Float.compare(r0.f18718s, -180.0f) == 0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0548, code lost:
        if (java.lang.Float.compare(r0.f18718s, 180.0f) != 0) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0553, code lost:
        if (java.lang.Float.compare(r0.f18718s, -90.0f) != 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0555, code lost:
        r9 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0558, code lost:
        r9 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x055b, code lost:
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x055c, code lost:
        r11.mo16125aj(r0.f18711l);
        r11.mo16105Q(r0.f18712m);
        r11.mo16116aa(r5);
        r11.mo16119ad(r9);
        r11.mo16117ab(r0.f18720u);
        r11.mo16123ah(r0.f18721v);
        r11.mo16098J(r10);
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x057f, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(r4) != false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0585, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.TEXT_SSA.equals(r4) != false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x058b, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(r4) != false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0591, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_PGS.equals(r4) != false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0599, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(r4) == false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05a3, code lost:
        throw new com.google.ads.interactivemedia.p038v3.internal.C4144lb("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05a4, code lost:
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a7, code lost:
        if (r0.f18700a == null) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05b3, code lost:
        if (com.google.ads.interactivemedia.p038v3.internal.C4362td.f18738f.containsKey(r0.f18700a) != false) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05b5, code lost:
        r11.mo16109U(r0.f18700a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05ba, code lost:
        r11.mo16106R(r22);
        r11.mo16120ae(r4);
        r11.mo16111W(r3);
        r11.mo16110V(r0.f18699Y);
        r11.mo16122ag(r7);
        r11.mo16108T(r1);
        r11.mo16097I(r2);
        r11.mo16100L(r0.f18710k);
        r1 = r11.mo16115a();
        r2 = r21.mo13362ba(r0.f18702c, r5);
        r0.f18696V = r2;
        r2.mo13403a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05e9, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16641a(com.google.ads.interactivemedia.p038v3.internal.C4309re r21, int r22) throws com.google.ads.interactivemedia.p038v3.internal.C4144lb {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.f18701b
            int r2 = r1.hashCode()
            r4 = 16
            r5 = 1
            r7 = 8
            r8 = 4
            r9 = 0
            r10 = 3
            switch(r2) {
                case -2095576542: goto L_0x017a;
                case -2095575984: goto L_0x0170;
                case -1985379776: goto L_0x0165;
                case -1784763192: goto L_0x015a;
                case -1730367663: goto L_0x014f;
                case -1482641358: goto L_0x0144;
                case -1482641357: goto L_0x0139;
                case -1373388978: goto L_0x012e;
                case -933872740: goto L_0x0123;
                case -538363189: goto L_0x0118;
                case -538363109: goto L_0x010d;
                case -425012669: goto L_0x0101;
                case -356037306: goto L_0x00f5;
                case 62923557: goto L_0x00e9;
                case 62923603: goto L_0x00dd;
                case 62927045: goto L_0x00d1;
                case 82318131: goto L_0x00c6;
                case 82338133: goto L_0x00bb;
                case 82338134: goto L_0x00b0;
                case 99146302: goto L_0x00a4;
                case 444813526: goto L_0x0098;
                case 542569478: goto L_0x008c;
                case 635596514: goto L_0x0080;
                case 725948237: goto L_0x0074;
                case 725957860: goto L_0x0068;
                case 738597099: goto L_0x005c;
                case 855502857: goto L_0x0050;
                case 1422270023: goto L_0x0044;
                case 1809237540: goto L_0x0039;
                case 1950749482: goto L_0x002d;
                case 1950789798: goto L_0x0021;
                case 1951062397: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0184
        L_0x0015:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 12
            goto L_0x0185
        L_0x0021:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 22
            goto L_0x0185
        L_0x002d:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 17
            goto L_0x0185
        L_0x0039:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 3
            goto L_0x0185
        L_0x0044:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 27
            goto L_0x0185
        L_0x0050:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 8
            goto L_0x0185
        L_0x005c:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 28
            goto L_0x0185
        L_0x0068:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 24
            goto L_0x0185
        L_0x0074:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 25
            goto L_0x0185
        L_0x0080:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 26
            goto L_0x0185
        L_0x008c:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 20
            goto L_0x0185
        L_0x0098:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 10
            goto L_0x0185
        L_0x00a4:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 30
            goto L_0x0185
        L_0x00b0:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 1
            goto L_0x0185
        L_0x00bb:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 0
            goto L_0x0185
        L_0x00c6:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 2
            goto L_0x0185
        L_0x00d1:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 19
            goto L_0x0185
        L_0x00dd:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 16
            goto L_0x0185
        L_0x00e9:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 13
            goto L_0x0185
        L_0x00f5:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 21
            goto L_0x0185
        L_0x0101:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 29
            goto L_0x0185
        L_0x010d:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 7
            goto L_0x0185
        L_0x0118:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 5
            goto L_0x0185
        L_0x0123:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 31
            goto L_0x0185
        L_0x012e:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 9
            goto L_0x0185
        L_0x0139:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 15
            goto L_0x0185
        L_0x0144:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 14
            goto L_0x0185
        L_0x014f:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 11
            goto L_0x0185
        L_0x015a:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 18
            goto L_0x0185
        L_0x0165:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 23
            goto L_0x0185
        L_0x0170:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 4
            goto L_0x0185
        L_0x017a:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0184
            r2 = 6
            goto L_0x0185
        L_0x0184:
            r2 = -1
        L_0x0185:
            java.lang.String r12 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r13 = "application/pgs"
            java.lang.String r14 = "application/vobsub"
            java.lang.String r15 = "text/x-ssa"
            java.lang.String r6 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r3 = "MatroskaExtractor"
            java.lang.String r11 = "audio/x-unknown"
            r18 = 0
            switch(r2) {
                case 0: goto L_0x03a1;
                case 1: goto L_0x039e;
                case 2: goto L_0x039b;
                case 3: goto L_0x0398;
                case 4: goto L_0x038a;
                case 5: goto L_0x038a;
                case 6: goto L_0x038a;
                case 7: goto L_0x036b;
                case 8: goto L_0x0353;
                case 9: goto L_0x0339;
                case 10: goto L_0x0335;
                case 11: goto L_0x0323;
                case 12: goto L_0x02df;
                case 13: goto L_0x02c3;
                case 14: goto L_0x02ba;
                case 15: goto L_0x02b7;
                case 16: goto L_0x02b3;
                case 17: goto L_0x02af;
                case 18: goto L_0x02a4;
                case 19: goto L_0x02a0;
                case 20: goto L_0x02a0;
                case 21: goto L_0x029c;
                case 22: goto L_0x0290;
                case 23: goto L_0x0253;
                case 24: goto L_0x0226;
                case 25: goto L_0x01fc;
                case 26: goto L_0x01db;
                case 27: goto L_0x01d7;
                case 28: goto L_0x01c5;
                case 29: goto L_0x01b9;
                case 30: goto L_0x01b5;
                case 31: goto L_0x01a4;
                default: goto L_0x019c;
            }
        L_0x019c:
            com.google.ads.interactivemedia.v3.internal.lb r1 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01a4:
            byte[] r2 = new byte[r8]
            byte[] r1 = r0.m18915i(r1)
            java.lang.System.arraycopy(r1, r9, r2, r9, r8)
            com.google.ads.interactivemedia.v3.internal.atz r1 = com.google.ads.interactivemedia.p038v3.internal.atz.m14808j(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x0350
        L_0x01b5:
            r17 = r13
            goto L_0x03a3
        L_0x01b9:
            byte[] r1 = r0.m18915i(r1)
            com.google.ads.interactivemedia.v3.internal.atz r1 = com.google.ads.interactivemedia.p038v3.internal.atz.m14808j(r1)
            r17 = r14
            goto L_0x0350
        L_0x01c5:
            byte[] r1 = com.google.ads.interactivemedia.p038v3.internal.C4362td.f18735c
            java.lang.String r2 = r0.f18701b
            byte[] r2 = r0.m18915i(r2)
            com.google.ads.interactivemedia.v3.internal.atz r1 = com.google.ads.interactivemedia.p038v3.internal.atz.m14809k(r1, r2)
            r17 = r15
            goto L_0x0350
        L_0x01d7:
            r17 = r6
            goto L_0x03a3
        L_0x01db:
            int r1 = r0.f18689O
            r2 = 32
            if (r1 != r2) goto L_0x01e2
            goto L_0x024d
        L_0x01e2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 90
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported floating point PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1)
            goto L_0x0249
        L_0x01fc:
            int r1 = r0.f18689O
            if (r1 != r7) goto L_0x0207
            r1 = r18
            r2 = r1
            r3 = -1
            r8 = 3
            goto L_0x03a8
        L_0x0207:
            if (r1 != r4) goto L_0x020c
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x024d
        L_0x020c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 86
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported big endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1)
            goto L_0x0249
        L_0x0226:
            int r1 = r0.f18689O
            int r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14206W(r1)
            if (r8 != 0) goto L_0x024d
            int r1 = r0.f18689O
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 89
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported little endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1)
        L_0x0249:
            r17 = r11
            goto L_0x03a3
        L_0x024d:
            r1 = r18
            r2 = r1
            r3 = -1
            goto L_0x03a8
        L_0x0253:
            com.google.ads.interactivemedia.v3.internal.alw r2 = new com.google.ads.interactivemedia.v3.internal.alw
            byte[] r1 = r0.m18915i(r1)
            r2.<init>((byte[]) r1)
            boolean r1 = m18914h(r2)
            if (r1 == 0) goto L_0x0286
            int r1 = r0.f18689O
            int r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14206W(r1)
            if (r8 != 0) goto L_0x024d
            int r1 = r0.f18689O
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 75
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1)
            goto L_0x0249
        L_0x0286:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            java.lang.String r1 = r1.concat(r11)
            android.util.Log.w(r3, r1)
            goto L_0x0249
        L_0x0290:
            byte[] r1 = r0.m18915i(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x0350
        L_0x029c:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x03a3
        L_0x02a0:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x03a3
        L_0x02a4:
            com.google.ads.interactivemedia.v3.internal.tc r1 = new com.google.ads.interactivemedia.v3.internal.tc
            r1.<init>()
            r0.f18693S = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x03a3
        L_0x02af:
            java.lang.String r17 = "audio/eac3"
            goto L_0x03a3
        L_0x02b3:
            java.lang.String r17 = "audio/ac3"
            goto L_0x03a3
        L_0x02b7:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x02bc
        L_0x02ba:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x02bc:
            r1 = r18
            r2 = r1
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x03a7
        L_0x02c3:
            byte[] r1 = r0.m18915i(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.f18709j
            com.google.ads.interactivemedia.v3.internal.nh r2 = com.google.ads.interactivemedia.p038v3.internal.C4205ni.m18265a(r2)
            int r3 = r2.f18065a
            r0.f18690P = r3
            int r3 = r2.f18066b
            r0.f18688N = r3
            java.lang.String r2 = r2.f18067c
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x03a6
        L_0x02df:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            java.lang.String r2 = r0.f18701b
            byte[] r2 = r0.m18915i(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r11 = r0.f18691Q
            java.nio.ByteBuffer r2 = r2.putLong(r11)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.f18692R
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r17 = "audio/opus"
            r2 = r18
            r3 = 5760(0x1680, float:8.071E-42)
            goto L_0x03a7
        L_0x0323:
            byte[] r1 = r0.m18915i(r1)
            java.util.List r1 = m18913g(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r17 = "audio/vorbis"
            r2 = r18
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03a7
        L_0x0335:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x03a3
        L_0x0339:
            com.google.ads.interactivemedia.v3.internal.alw r2 = new com.google.ads.interactivemedia.v3.internal.alw
            byte[] r1 = r0.m18915i(r1)
            r2.<init>((byte[]) r1)
            android.util.Pair r1 = m18912f(r2)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x0350:
            r2 = r18
            goto L_0x03a6
        L_0x0353:
            com.google.ads.interactivemedia.v3.internal.alw r2 = new com.google.ads.interactivemedia.v3.internal.alw
            byte[] r1 = r0.m18915i(r1)
            r2.<init>((byte[]) r1)
            com.google.ads.interactivemedia.v3.internal.amv r1 = com.google.ads.interactivemedia.p038v3.internal.amv.m14278a(r2)
            java.util.List<byte[]> r2 = r1.f15346a
            int r3 = r1.f15347b
            r0.f18697W = r3
            java.lang.String r1 = r1.f15348c
            java.lang.String r17 = "video/hevc"
            goto L_0x0382
        L_0x036b:
            com.google.ads.interactivemedia.v3.internal.alw r2 = new com.google.ads.interactivemedia.v3.internal.alw
            byte[] r1 = r0.m18915i(r1)
            r2.<init>((byte[]) r1)
            com.google.ads.interactivemedia.v3.internal.amn r1 = com.google.ads.interactivemedia.p038v3.internal.amn.m14257a(r2)
            java.util.List<byte[]> r2 = r1.f15312a
            int r3 = r1.f15313b
            r0.f18697W = r3
            java.lang.String r1 = r1.f15317f
            java.lang.String r17 = "video/avc"
        L_0x0382:
            r3 = -1
            r8 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x03a8
        L_0x038a:
            byte[] r1 = r0.f18709j
            if (r1 != 0) goto L_0x0391
            r1 = r18
            goto L_0x0395
        L_0x0391:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0395:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x0350
        L_0x0398:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x03a3
        L_0x039b:
            java.lang.String r17 = "video/av01"
            goto L_0x03a3
        L_0x039e:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x03a3
        L_0x03a1:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x03a3:
            r1 = r18
            r2 = r1
        L_0x03a6:
            r3 = -1
        L_0x03a7:
            r8 = -1
        L_0x03a8:
            byte[] r4 = r0.f18687M
            if (r4 == 0) goto L_0x03bb
            com.google.ads.interactivemedia.v3.internal.alw r7 = new com.google.ads.interactivemedia.v3.internal.alw
            r7.<init>((byte[]) r4)
            com.google.ads.interactivemedia.v3.internal.amq r4 = com.google.ads.interactivemedia.p038v3.internal.amq.m14259a(r7)
            if (r4 == 0) goto L_0x03bb
            java.lang.String r2 = r4.f15323a
            java.lang.String r17 = "video/dolby-vision"
        L_0x03bb:
            r4 = r17
            boolean r7 = r0.f18695U
            boolean r11 = r0.f18694T
            if (r5 == r11) goto L_0x03c5
            r11 = 0
            goto L_0x03c6
        L_0x03c5:
            r11 = 2
        L_0x03c6:
            r7 = r7 | r11
            com.google.ads.interactivemedia.v3.internal.kd r11 = new com.google.ads.interactivemedia.v3.internal.kd
            r11.<init>()
            boolean r12 = com.google.ads.interactivemedia.p038v3.internal.aln.m14031a(r4)
            if (r12 == 0) goto L_0x03e1
            int r6 = r0.f18688N
            r11.mo16096H(r6)
            int r6 = r0.f18690P
            r11.mo16121af(r6)
            r11.mo16113Y(r8)
            goto L_0x05a5
        L_0x03e1:
            boolean r5 = com.google.ads.interactivemedia.p038v3.internal.aln.m14032b(r4)
            if (r5 == 0) goto L_0x057b
            int r5 = r0.f18715p
            if (r5 != 0) goto L_0x03fd
            int r5 = r0.f18713n
            r6 = -1
            if (r5 != r6) goto L_0x03f2
            int r5 = r0.f18711l
        L_0x03f2:
            r0.f18713n = r5
            int r5 = r0.f18714o
            if (r5 != r6) goto L_0x03fa
            int r5 = r0.f18712m
        L_0x03fa:
            r0.f18714o = r5
            goto L_0x03fe
        L_0x03fd:
            r6 = -1
        L_0x03fe:
            int r5 = r0.f18713n
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r5 == r6) goto L_0x0414
            int r10 = r0.f18714o
            if (r10 == r6) goto L_0x0414
            int r12 = r0.f18712m
            int r12 = r12 * r5
            float r5 = (float) r12
            int r12 = r0.f18711l
            int r12 = r12 * r10
            float r10 = (float) r12
            float r5 = r5 / r10
            goto L_0x0416
        L_0x0414:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0416:
            boolean r10 = r0.f18722w
            if (r10 == 0) goto L_0x04e9
            float r10 = r0.f18677C
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18678D
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18679E
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18680F
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18681G
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18682H
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18683I
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18684J
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18685K
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x04db
            float r10 = r0.f18686L
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0458
            goto L_0x04db
        L_0x0458:
            r8 = 25
            byte[] r8 = new byte[r8]
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r8)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r10 = r10.order(r12)
            r10.put(r9)
            float r12 = r0.f18677C
            r13 = 1195593728(0x47435000, float:50000.0)
            float r12 = r12 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18678D
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18679E
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18680F
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18681G
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18682H
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18683I
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18684J
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18685K
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            float r12 = r0.f18686L
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r10.putShort(r12)
            int r12 = r0.f18675A
            short r12 = (short) r12
            r10.putShort(r12)
            int r12 = r0.f18676B
            short r12 = (short) r12
            r10.putShort(r12)
            goto L_0x04dd
        L_0x04db:
            r8 = r18
        L_0x04dd:
            com.google.ads.interactivemedia.v3.internal.amp r10 = new com.google.ads.interactivemedia.v3.internal.amp
            int r12 = r0.f18723x
            int r13 = r0.f18725z
            int r14 = r0.f18724y
            r10.<init>(r12, r13, r14, r8)
            goto L_0x04eb
        L_0x04e9:
            r10 = r18
        L_0x04eb:
            java.lang.String r8 = r0.f18700a
            if (r8 == 0) goto L_0x050b
            java.util.Map r8 = com.google.ads.interactivemedia.p038v3.internal.C4362td.f18738f
            java.lang.String r12 = r0.f18700a
            boolean r8 = r8.containsKey(r12)
            if (r8 == 0) goto L_0x050b
            java.util.Map r6 = com.google.ads.interactivemedia.p038v3.internal.C4362td.f18738f
            java.lang.String r8 = r0.f18700a
            java.lang.Object r6 = r6.get(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        L_0x050b:
            int r8 = r0.f18716q
            if (r8 != 0) goto L_0x055b
            float r8 = r0.f18717r
            r12 = 0
            int r8 = java.lang.Float.compare(r8, r12)
            if (r8 != 0) goto L_0x055b
            float r8 = r0.f18718s
            int r8 = java.lang.Float.compare(r8, r12)
            if (r8 != 0) goto L_0x055b
            float r8 = r0.f18719t
            int r8 = java.lang.Float.compare(r8, r12)
            if (r8 != 0) goto L_0x0529
            goto L_0x055c
        L_0x0529:
            float r8 = r0.f18718s
            r9 = 1119092736(0x42b40000, float:90.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x0536
            r9 = 90
            goto L_0x055c
        L_0x0536:
            float r8 = r0.f18718s
            r9 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 == 0) goto L_0x0558
            float r8 = r0.f18718s
            r9 = 1127481344(0x43340000, float:180.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x054b
            goto L_0x0558
        L_0x054b:
            float r8 = r0.f18718s
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x055b
            r9 = 270(0x10e, float:3.78E-43)
            goto L_0x055c
        L_0x0558:
            r9 = 180(0xb4, float:2.52E-43)
            goto L_0x055c
        L_0x055b:
            r9 = r6
        L_0x055c:
            int r6 = r0.f18711l
            r11.mo16125aj(r6)
            int r6 = r0.f18712m
            r11.mo16105Q(r6)
            r11.mo16116aa(r5)
            r11.mo16119ad(r9)
            byte[] r5 = r0.f18720u
            r11.mo16117ab(r5)
            int r5 = r0.f18721v
            r11.mo16123ah(r5)
            r11.mo16098J(r10)
            r5 = 2
            goto L_0x05a5
        L_0x057b:
            boolean r5 = r6.equals(r4)
            if (r5 != 0) goto L_0x05a4
            boolean r5 = r15.equals(r4)
            if (r5 != 0) goto L_0x05a4
            boolean r5 = r14.equals(r4)
            if (r5 != 0) goto L_0x05a4
            boolean r5 = r13.equals(r4)
            if (r5 != 0) goto L_0x05a4
            java.lang.String r5 = "application/dvbsubs"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x059c
            goto L_0x05a4
        L_0x059c:
            com.google.ads.interactivemedia.v3.internal.lb r1 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05a4:
            r5 = 3
        L_0x05a5:
            java.lang.String r6 = r0.f18700a
            if (r6 == 0) goto L_0x05ba
            java.util.Map r6 = com.google.ads.interactivemedia.p038v3.internal.C4362td.f18738f
            java.lang.String r8 = r0.f18700a
            boolean r6 = r6.containsKey(r8)
            if (r6 != 0) goto L_0x05ba
            java.lang.String r6 = r0.f18700a
            r11.mo16109U(r6)
        L_0x05ba:
            r6 = r22
            r11.mo16106R(r6)
            r11.mo16120ae(r4)
            r11.mo16111W(r3)
            java.lang.String r3 = r0.f18699Y
            r11.mo16110V(r3)
            r11.mo16122ag(r7)
            r11.mo16108T(r1)
            r11.mo16097I(r2)
            com.google.ads.interactivemedia.v3.internal.pz r1 = r0.f18710k
            r11.mo16100L(r1)
            com.google.ads.interactivemedia.v3.internal.ke r1 = r11.mo16115a()
            int r2 = r0.f18702c
            r3 = r21
            com.google.ads.interactivemedia.v3.internal.rw r2 = r3.mo13362ba(r2, r5)
            r0.f18696V = r2
            r2.mo13403a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4360tb.mo16641a(com.google.ads.interactivemedia.v3.internal.re, int):void");
    }
}
