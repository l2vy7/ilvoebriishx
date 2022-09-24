package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.internal.ads.s */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4622s {

    /* renamed from: A */
    public int f20751A = -1;

    /* renamed from: B */
    public int f20752B = 1000;

    /* renamed from: C */
    public int f20753C = 200;

    /* renamed from: D */
    public float f20754D = -1.0f;

    /* renamed from: E */
    public float f20755E = -1.0f;

    /* renamed from: F */
    public float f20756F = -1.0f;

    /* renamed from: G */
    public float f20757G = -1.0f;

    /* renamed from: H */
    public float f20758H = -1.0f;

    /* renamed from: I */
    public float f20759I = -1.0f;

    /* renamed from: J */
    public float f20760J = -1.0f;

    /* renamed from: K */
    public float f20761K = -1.0f;

    /* renamed from: L */
    public float f20762L = -1.0f;

    /* renamed from: M */
    public float f20763M = -1.0f;

    /* renamed from: N */
    public byte[] f20764N;

    /* renamed from: O */
    public int f20765O = 1;

    /* renamed from: P */
    public int f20766P = -1;

    /* renamed from: Q */
    public int f20767Q = 8000;

    /* renamed from: R */
    public long f20768R = 0;

    /* renamed from: S */
    public long f20769S = 0;

    /* renamed from: T */
    public C4625t f20770T;

    /* renamed from: U */
    public boolean f20771U;

    /* renamed from: V */
    public boolean f20772V = true;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f20773W = "eng";

    /* renamed from: X */
    public ad4 f20774X;

    /* renamed from: Y */
    public int f20775Y;

    /* renamed from: a */
    public String f20776a;

    /* renamed from: b */
    public String f20777b;

    /* renamed from: c */
    public int f20778c;

    /* renamed from: d */
    public int f20779d;

    /* renamed from: e */
    public int f20780e;

    /* renamed from: f */
    public int f20781f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f20782g;

    /* renamed from: h */
    public boolean f20783h;

    /* renamed from: i */
    public byte[] f20784i;

    /* renamed from: j */
    public zc4 f20785j;

    /* renamed from: k */
    public byte[] f20786k;

    /* renamed from: l */
    public zzs f20787l;

    /* renamed from: m */
    public int f20788m = -1;

    /* renamed from: n */
    public int f20789n = -1;

    /* renamed from: o */
    public int f20790o = -1;

    /* renamed from: p */
    public int f20791p = -1;

    /* renamed from: q */
    public int f20792q = 0;

    /* renamed from: r */
    public int f20793r = -1;

    /* renamed from: s */
    public float f20794s = 0.0f;

    /* renamed from: t */
    public float f20795t = 0.0f;

    /* renamed from: u */
    public float f20796u = 0.0f;

    /* renamed from: v */
    public byte[] f20797v = null;

    /* renamed from: w */
    public int f20798w = -1;

    /* renamed from: x */
    public boolean f20799x = false;

    /* renamed from: y */
    public int f20800y = -1;

    /* renamed from: z */
    public int f20801z = -1;

    private C4622s() {
    }

    /* synthetic */ C4622s(C8104r rVar) {
    }

    /* renamed from: f */
    private static Pair<String, List<byte[]>> m21003f(uq2 uq2) throws C7811iy {
        try {
            uq2.mo35237g(16);
            long y = uq2.mo35255y();
            if (y == 1482049860) {
                return new Pair<>(MimeTypes.VIDEO_DIVX, (Object) null);
            }
            if (y == 859189832) {
                return new Pair<>(MimeTypes.VIDEO_H263, (Object) null);
            }
            if (y == 826496599) {
                int k = uq2.mo35241k() + 20;
                byte[] h = uq2.mo35238h();
                while (true) {
                    int length = h.length;
                    if (k >= length - 4) {
                        throw C7811iy.m33482a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    } else if (h[k] == 0 && h[k + 1] == 0 && h[k + 2] == 1 && h[k + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(h, k, length)));
                    } else {
                        k++;
                    }
                }
            } else {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C7811iy.m33482a("Error parsing FourCC private data", (Throwable) null);
        }
    }

    /* renamed from: g */
    private static List<byte[]> m21004g(byte[] bArr) throws C7811iy {
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
                        throw C7811iy.m33482a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw C7811iy.m33482a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw C7811iy.m33482a("Error parsing vorbis codec private", (Throwable) null);
            }
            throw C7811iy.m33482a("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C7811iy.m33482a("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    /* renamed from: h */
    private static boolean m21005h(uq2 uq2) throws C7811iy {
        try {
            int q = uq2.mo35247q();
            if (q == 1) {
                return true;
            }
            if (q == 65534) {
                uq2.mo35236f(24);
                return uq2.mo35256z() == C4626u.f20850f0.getMostSignificantBits() && uq2.mo35256z() == C4626u.f20850f0.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C7811iy.m33482a("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    /* renamed from: i */
    private final byte[] m21006i(String str) throws C7811iy {
        byte[] bArr = this.f20786k;
        if (bArr != null) {
            return bArr;
        }
        String valueOf = String.valueOf(str);
        throw C7811iy.m33482a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024e, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024f, code lost:
        r1 = null;
        r2 = null;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028c, code lost:
        r17 = com.google.android.exoplayer2.util.MimeTypes.AUDIO_UNKNOWN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02bc, code lost:
        r1 = null;
        r2 = null;
        r3 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x037c, code lost:
        r3 = -1;
        r10 = -1;
        r19 = r2;
        r2 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x039d, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x039e, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x039f, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a0, code lost:
        r7 = r0.f20764N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a2, code lost:
        if (r7 == null) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03a4, code lost:
        r7 = com.google.android.gms.internal.ads.sb4.m37371a(new com.google.android.gms.internal.ads.uq2(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03ad, code lost:
        if (r7 == null) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03af, code lost:
        r2 = r7.f38944a;
        r17 = com.google.android.exoplayer2.util.MimeTypes.VIDEO_DOLBY_VISION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03b3, code lost:
        r7 = r17;
        r11 = r0.f20772V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03b9, code lost:
        if (true == r0.f20771U) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03bb, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03bd, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03be, code lost:
        r11 = r11 | r12;
        r12 = new com.google.android.gms.internal.ads.ge4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c8, code lost:
        if (com.google.android.gms.internal.ads.C7773hx.m32965g(r7) == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03ca, code lost:
        r12.mo32076e0(r0.f20765O);
        r12.mo32094t(r0.f20767Q);
        r12.mo32088n(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03dd, code lost:
        if (com.google.android.gms.internal.ads.C7773hx.m32966h(r7) == false) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03e1, code lost:
        if (r0.f20792q != 0) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03e3, code lost:
        r4 = r0.f20790o;
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03e6, code lost:
        if (r4 != -1) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03e8, code lost:
        r4 = r0.f20788m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03ea, code lost:
        r0.f20790o = r4;
        r4 = r0.f20791p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ee, code lost:
        if (r4 != -1) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03f0, code lost:
        r4 = r0.f20789n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03f2, code lost:
        r0.f20791p = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03f5, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03f6, code lost:
        r4 = r0.f20790o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03fa, code lost:
        if (r4 == r5) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03fc, code lost:
        r10 = r0.f20791p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03fe, code lost:
        if (r10 == r5) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0400, code lost:
        r4 = ((float) (r0.f20789n * r4)) / ((float) (r0.f20788m * r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x040c, code lost:
        r4 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0410, code lost:
        if (r0.f20799x == false) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0416, code lost:
        if (r0.f20754D == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x041c, code lost:
        if (r0.f20755E == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0422, code lost:
        if (r0.f20756F == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0428, code lost:
        if (r0.f20757G == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x042e, code lost:
        if (r0.f20758H == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0434, code lost:
        if (r0.f20759I == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x043a, code lost:
        if (r0.f20760J == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0440, code lost:
        if (r0.f20761K == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0446, code lost:
        if (r0.f20762L == -1.0f) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x044c, code lost:
        if (r0.f20763M != -1.0f) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0450, code lost:
        r6 = new byte[25];
        r8 = java.nio.ByteBuffer.wrap(r6).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r8.put((byte) 0);
        r8.putShort((short) ((int) ((r0.f20754D * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f20755E * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f20756F * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f20757G * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f20758H * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f20759I * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f20760J * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f20761K * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) (r0.f20762L + 0.5f)));
        r8.putShort((short) ((int) (r0.f20763M + 0.5f)));
        r8.putShort((short) r0.f20752B);
        r8.putShort((short) r0.f20753C);
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04d4, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04d5, code lost:
        r6 = new com.google.android.gms.internal.ads.z04(r0.f20800y, r0.f20751A, r0.f20801z, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04e1, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04e4, code lost:
        if (r0.f20776a == null) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04f0, code lost:
        if (com.google.android.gms.internal.ads.C4626u.m21041b().containsKey(r0.f20776a) == false) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04f2, code lost:
        r5 = ((java.lang.Integer) com.google.android.gms.internal.ads.C4626u.m21041b().get(r0.f20776a)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0504, code lost:
        if (r0.f20793r != 0) goto L_0x0552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x050d, code lost:
        if (java.lang.Float.compare(r0.f20794s, 0.0f) != 0) goto L_0x0552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0515, code lost:
        if (java.lang.Float.compare(r0.f20795t, 0.0f) != 0) goto L_0x0552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x051d, code lost:
        if (java.lang.Float.compare(r0.f20796u, 0.0f) != 0) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0528, code lost:
        if (java.lang.Float.compare(r0.f20795t, 90.0f) != 0) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x052a, code lost:
        r9 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0535, code lost:
        if (java.lang.Float.compare(r0.f20795t, -180.0f) == 0) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x053f, code lost:
        if (java.lang.Float.compare(r0.f20795t, 180.0f) != 0) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x054a, code lost:
        if (java.lang.Float.compare(r0.f20795t, -90.0f) != 0) goto L_0x0552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x054c, code lost:
        r9 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x054f, code lost:
        r9 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0552, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0553, code lost:
        r12.mo32098x(r0.f20788m);
        r12.mo32077f(r0.f20789n);
        r12.mo32090p(r4);
        r12.mo32092r(r9);
        r12.mo32091q(r0.f20797v);
        r12.mo32096v(r0.f20798w);
        r12.mo32080g0(r6);
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0576, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(r7) != false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x057c, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.TEXT_SSA.equals(r7) != false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0582, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(r7) != false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0588, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_PGS.equals(r7) != false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0590, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(r7) == false) goto L_0x0593;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x059a, code lost:
        throw com.google.android.gms.internal.ads.C7811iy.m33482a("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x059b, code lost:
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x059e, code lost:
        if (r0.f20776a == null) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05aa, code lost:
        if (com.google.android.gms.internal.ads.C4626u.m21041b().containsKey(r0.f20776a) != false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05ac, code lost:
        r12.mo32084j(r0.f20776a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05b1, code lost:
        r12.mo32079g(r22);
        r12.mo32093s(r7);
        r12.mo32086l(r3);
        r12.mo32085k(r0.f20773W);
        r12.mo32095u(r11);
        r12.mo32083i(r1);
        r12.mo32078f0(r2);
        r12.mo32070b(r0.f20787l);
        r1 = r12.mo32099y();
        r2 = r21.mo18211m(r0.f20778c, r5);
        r0.f20774X = r2;
        r2.mo30354a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05e0, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18821e(com.google.android.gms.internal.ads.yb4 r21, int r22) throws com.google.android.gms.internal.ads.C7811iy {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.f20777b
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
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r3 = "MatroskaExtractor"
            switch(r2) {
                case 0: goto L_0x039a;
                case 1: goto L_0x0397;
                case 2: goto L_0x0394;
                case 3: goto L_0x0391;
                case 4: goto L_0x0384;
                case 5: goto L_0x0384;
                case 6: goto L_0x0384;
                case 7: goto L_0x0365;
                case 8: goto L_0x034d;
                case 9: goto L_0x0335;
                case 10: goto L_0x0332;
                case 11: goto L_0x0321;
                case 12: goto L_0x02de;
                case 13: goto L_0x02c2;
                case 14: goto L_0x02ba;
                case 15: goto L_0x02b7;
                case 16: goto L_0x02b3;
                case 17: goto L_0x02af;
                case 18: goto L_0x02a4;
                case 19: goto L_0x02a0;
                case 20: goto L_0x02a0;
                case 21: goto L_0x029c;
                case 22: goto L_0x0290;
                case 23: goto L_0x0254;
                case 24: goto L_0x022a;
                case 25: goto L_0x0200;
                case 26: goto L_0x01d9;
                case 27: goto L_0x01d5;
                case 28: goto L_0x01c3;
                case 29: goto L_0x01b7;
                case 30: goto L_0x01b3;
                case 31: goto L_0x01a2;
                default: goto L_0x019a;
            }
        L_0x019a:
            java.lang.String r1 = "Unrecognized codec identifier."
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x01a2:
            byte[] r2 = new byte[r8]
            byte[] r1 = r0.m21006i(r1)
            java.lang.System.arraycopy(r1, r9, r2, r9, r8)
            com.google.android.gms.internal.ads.p63 r1 = com.google.android.gms.internal.ads.p63.m20815D(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x039d
        L_0x01b3:
            r17 = r13
            goto L_0x039c
        L_0x01b7:
            byte[] r1 = r0.m21006i(r1)
            com.google.android.gms.internal.ads.p63 r1 = com.google.android.gms.internal.ads.p63.m20815D(r1)
            r17 = r14
            goto L_0x039d
        L_0x01c3:
            byte[] r1 = com.google.android.gms.internal.ads.C4626u.f20848d0
            java.lang.String r2 = r0.f20777b
            byte[] r2 = r0.m21006i(r2)
            com.google.android.gms.internal.ads.p63 r1 = com.google.android.gms.internal.ads.p63.m20816E(r1, r2)
            r17 = r15
            goto L_0x039d
        L_0x01d5:
            r17 = r6
            goto L_0x039c
        L_0x01d9:
            int r1 = r0.f20766P
            r2 = 32
            if (r1 != r2) goto L_0x01e5
            r1 = 0
            r2 = 0
            r3 = -1
            r10 = 4
            goto L_0x03a0
        L_0x01e5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 90
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported floating point PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1)
            goto L_0x028c
        L_0x0200:
            int r1 = r0.f20766P
            if (r1 != r7) goto L_0x0205
            goto L_0x024f
        L_0x0205:
            if (r1 != r4) goto L_0x0210
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = 0
            r2 = 0
            r3 = -1
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a0
        L_0x0210:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 86
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported big endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1)
            goto L_0x028c
        L_0x022a:
            int r1 = r0.f20766P
            int r8 = com.google.android.gms.internal.ads.d13.m20287R(r1)
            if (r8 != 0) goto L_0x024e
            int r1 = r0.f20766P
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 89
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported little endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1)
            goto L_0x028c
        L_0x024e:
            r10 = r8
        L_0x024f:
            r1 = 0
            r2 = 0
            r3 = -1
            goto L_0x03a0
        L_0x0254:
            com.google.android.gms.internal.ads.uq2 r2 = new com.google.android.gms.internal.ads.uq2
            byte[] r1 = r0.m21006i(r1)
            r2.<init>((byte[]) r1)
            boolean r1 = m21005h(r2)
            if (r1 == 0) goto L_0x0287
            int r1 = r0.f20766P
            int r8 = com.google.android.gms.internal.ads.d13.m20287R(r1)
            if (r8 != 0) goto L_0x024e
            int r1 = r0.f20766P
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 75
            r2.<init>(r4)
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1)
            goto L_0x028c
        L_0x0287:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            android.util.Log.w(r3, r1)
        L_0x028c:
            r17 = r18
            goto L_0x039c
        L_0x0290:
            byte[] r1 = r0.m21006i(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x039d
        L_0x029c:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x039c
        L_0x02a0:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x039c
        L_0x02a4:
            com.google.android.gms.internal.ads.t r1 = new com.google.android.gms.internal.ads.t
            r1.<init>()
            r0.f20770T = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x039c
        L_0x02af:
            java.lang.String r17 = "audio/eac3"
            goto L_0x039c
        L_0x02b3:
            java.lang.String r17 = "audio/ac3"
            goto L_0x039c
        L_0x02b7:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x02bc
        L_0x02ba:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x02bc:
            r1 = 0
            r2 = 0
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x039f
        L_0x02c2:
            byte[] r1 = r0.m21006i(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.f20786k
            com.google.android.gms.internal.ads.wa4 r2 = com.google.android.gms.internal.ads.xa4.m39418a(r2)
            int r3 = r2.f40746a
            r0.f20767Q = r3
            int r3 = r2.f40747b
            r0.f20765O = r3
            java.lang.String r2 = r2.f40748c
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x039e
        L_0x02de:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            java.lang.String r2 = r0.f20777b
            byte[] r2 = r0.m21006i(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r10 = r0.f20768R
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r10 = r0.f20769S
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r17 = "audio/opus"
            r2 = 0
            r3 = 5760(0x1680, float:8.071E-42)
            goto L_0x039f
        L_0x0321:
            byte[] r1 = r0.m21006i(r1)
            java.util.List r1 = m21004g(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r17 = "audio/vorbis"
            r2 = 0
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x039f
        L_0x0332:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x039c
        L_0x0335:
            com.google.android.gms.internal.ads.uq2 r2 = new com.google.android.gms.internal.ads.uq2
            byte[] r1 = r0.m21006i(r1)
            r2.<init>((byte[]) r1)
            android.util.Pair r1 = m21003f(r2)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
            goto L_0x039d
        L_0x034d:
            com.google.android.gms.internal.ads.uq2 r2 = new com.google.android.gms.internal.ads.uq2
            byte[] r1 = r0.m21006i(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.nc4 r1 = com.google.android.gms.internal.ads.nc4.m35132a(r2)
            java.util.List<byte[]> r2 = r1.f35974a
            int r3 = r1.f35975b
            r0.f20775Y = r3
            java.lang.String r1 = r1.f35977d
            java.lang.String r17 = "video/hevc"
            goto L_0x037c
        L_0x0365:
            com.google.android.gms.internal.ads.uq2 r2 = new com.google.android.gms.internal.ads.uq2
            byte[] r1 = r0.m21006i(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.eb4 r1 = com.google.android.gms.internal.ads.eb4.m31766a(r2)
            java.util.List<byte[]> r2 = r1.f31299a
            int r3 = r1.f31300b
            r0.f20775Y = r3
            java.lang.String r1 = r1.f31304f
            java.lang.String r17 = "video/avc"
        L_0x037c:
            r3 = -1
            r10 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x03a0
        L_0x0384:
            byte[] r1 = r0.f20786k
            if (r1 != 0) goto L_0x038a
            r1 = 0
            goto L_0x038e
        L_0x038a:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x038e:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x039d
        L_0x0391:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x039c
        L_0x0394:
            java.lang.String r17 = "video/av01"
            goto L_0x039c
        L_0x0397:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x039c
        L_0x039a:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x039c:
            r1 = 0
        L_0x039d:
            r2 = 0
        L_0x039e:
            r3 = -1
        L_0x039f:
            r10 = -1
        L_0x03a0:
            byte[] r7 = r0.f20764N
            if (r7 == 0) goto L_0x03b3
            com.google.android.gms.internal.ads.uq2 r11 = new com.google.android.gms.internal.ads.uq2
            r11.<init>((byte[]) r7)
            com.google.android.gms.internal.ads.sb4 r7 = com.google.android.gms.internal.ads.sb4.m37371a(r11)
            if (r7 == 0) goto L_0x03b3
            java.lang.String r2 = r7.f38944a
            java.lang.String r17 = "video/dolby-vision"
        L_0x03b3:
            r7 = r17
            boolean r11 = r0.f20772V
            boolean r12 = r0.f20771U
            if (r5 == r12) goto L_0x03bd
            r12 = 0
            goto L_0x03be
        L_0x03bd:
            r12 = 2
        L_0x03be:
            r11 = r11 | r12
            com.google.android.gms.internal.ads.ge4 r12 = new com.google.android.gms.internal.ads.ge4
            r12.<init>()
            boolean r16 = com.google.android.gms.internal.ads.C7773hx.m32965g(r7)
            if (r16 == 0) goto L_0x03d9
            int r4 = r0.f20765O
            r12.mo32076e0(r4)
            int r4 = r0.f20767Q
            r12.mo32094t(r4)
            r12.mo32088n(r10)
            goto L_0x059c
        L_0x03d9:
            boolean r5 = com.google.android.gms.internal.ads.C7773hx.m32966h(r7)
            if (r5 == 0) goto L_0x0572
            int r4 = r0.f20792q
            if (r4 != 0) goto L_0x03f5
            int r4 = r0.f20790o
            r5 = -1
            if (r4 != r5) goto L_0x03ea
            int r4 = r0.f20788m
        L_0x03ea:
            r0.f20790o = r4
            int r4 = r0.f20791p
            if (r4 != r5) goto L_0x03f2
            int r4 = r0.f20789n
        L_0x03f2:
            r0.f20791p = r4
            goto L_0x03f6
        L_0x03f5:
            r5 = -1
        L_0x03f6:
            int r4 = r0.f20790o
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 == r5) goto L_0x040c
            int r10 = r0.f20791p
            if (r10 == r5) goto L_0x040c
            int r13 = r0.f20789n
            int r13 = r13 * r4
            float r4 = (float) r13
            int r13 = r0.f20788m
            int r13 = r13 * r10
            float r10 = (float) r13
            float r4 = r4 / r10
            goto L_0x040e
        L_0x040c:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x040e:
            boolean r10 = r0.f20799x
            if (r10 == 0) goto L_0x04e1
            float r10 = r0.f20754D
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20755E
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20756F
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20757G
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20758H
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20759I
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20760J
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20761K
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20762L
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d4
            float r10 = r0.f20763M
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0450
            goto L_0x04d4
        L_0x0450:
            r6 = 25
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r6)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r8 = r8.order(r10)
            r8.put(r9)
            float r10 = r0.f20754D
            r13 = 1195593728(0x47435000, float:50000.0)
            float r10 = r10 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20755E
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20756F
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20757G
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20758H
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20759I
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20760J
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20761K
            float r10 = r10 * r13
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20762L
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            float r10 = r0.f20763M
            float r10 = r10 + r14
            int r10 = (int) r10
            short r10 = (short) r10
            r8.putShort(r10)
            int r10 = r0.f20752B
            short r10 = (short) r10
            r8.putShort(r10)
            int r10 = r0.f20753C
            short r10 = (short) r10
            r8.putShort(r10)
            r8 = r6
            goto L_0x04d5
        L_0x04d4:
            r8 = 0
        L_0x04d5:
            com.google.android.gms.internal.ads.z04 r6 = new com.google.android.gms.internal.ads.z04
            int r10 = r0.f20800y
            int r13 = r0.f20751A
            int r14 = r0.f20801z
            r6.<init>(r10, r13, r14, r8)
            goto L_0x04e2
        L_0x04e1:
            r6 = 0
        L_0x04e2:
            java.lang.String r8 = r0.f20776a
            if (r8 == 0) goto L_0x0502
            java.util.Map r8 = com.google.android.gms.internal.ads.C4626u.f20851g0
            java.lang.String r10 = r0.f20776a
            boolean r8 = r8.containsKey(r10)
            if (r8 == 0) goto L_0x0502
            java.util.Map r5 = com.google.android.gms.internal.ads.C4626u.f20851g0
            java.lang.String r8 = r0.f20776a
            java.lang.Object r5 = r5.get(r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x0502:
            int r8 = r0.f20793r
            if (r8 != 0) goto L_0x0552
            float r8 = r0.f20794s
            r10 = 0
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0552
            float r8 = r0.f20795t
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0552
            float r8 = r0.f20796u
            int r8 = java.lang.Float.compare(r8, r10)
            if (r8 != 0) goto L_0x0520
            goto L_0x0553
        L_0x0520:
            float r8 = r0.f20795t
            r9 = 1119092736(0x42b40000, float:90.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x052d
            r9 = 90
            goto L_0x0553
        L_0x052d:
            float r8 = r0.f20795t
            r9 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 == 0) goto L_0x054f
            float r8 = r0.f20795t
            r9 = 1127481344(0x43340000, float:180.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x0542
            goto L_0x054f
        L_0x0542:
            float r8 = r0.f20795t
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r8 = java.lang.Float.compare(r8, r9)
            if (r8 != 0) goto L_0x0552
            r9 = 270(0x10e, float:3.78E-43)
            goto L_0x0553
        L_0x054f:
            r9 = 180(0xb4, float:2.52E-43)
            goto L_0x0553
        L_0x0552:
            r9 = r5
        L_0x0553:
            int r5 = r0.f20788m
            r12.mo32098x(r5)
            int r5 = r0.f20789n
            r12.mo32077f(r5)
            r12.mo32090p(r4)
            r12.mo32092r(r9)
            byte[] r4 = r0.f20797v
            r12.mo32091q(r4)
            int r4 = r0.f20798w
            r12.mo32096v(r4)
            r12.mo32080g0(r6)
            r5 = 2
            goto L_0x059c
        L_0x0572:
            boolean r5 = r6.equals(r7)
            if (r5 != 0) goto L_0x059b
            boolean r5 = r15.equals(r7)
            if (r5 != 0) goto L_0x059b
            boolean r5 = r14.equals(r7)
            if (r5 != 0) goto L_0x059b
            boolean r5 = r13.equals(r7)
            if (r5 != 0) goto L_0x059b
            java.lang.String r5 = "application/dvbsubs"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0593
            goto L_0x059b
        L_0x0593:
            java.lang.String r1 = "Unexpected MIME type."
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x059b:
            r5 = 3
        L_0x059c:
            java.lang.String r4 = r0.f20776a
            if (r4 == 0) goto L_0x05b1
            java.util.Map r4 = com.google.android.gms.internal.ads.C4626u.f20851g0
            java.lang.String r6 = r0.f20776a
            boolean r4 = r4.containsKey(r6)
            if (r4 != 0) goto L_0x05b1
            java.lang.String r4 = r0.f20776a
            r12.mo32084j(r4)
        L_0x05b1:
            r4 = r22
            r12.mo32079g(r4)
            r12.mo32093s(r7)
            r12.mo32086l(r3)
            java.lang.String r3 = r0.f20773W
            r12.mo32085k(r3)
            r12.mo32095u(r11)
            r12.mo32083i(r1)
            r12.mo32078f0(r2)
            com.google.android.gms.internal.ads.zzs r1 = r0.f20787l
            r12.mo32070b(r1)
            com.google.android.gms.internal.ads.w r1 = r12.mo32099y()
            int r2 = r0.f20778c
            r3 = r21
            com.google.android.gms.internal.ads.ad4 r2 = r3.mo18211m(r2, r5)
            r0.f20774X = r2
            r2.mo30354a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4622s.mo18821e(com.google.android.gms.internal.ads.yb4, int):void");
    }
}
