package com.google.ads.interactivemedia.p039v3.internal;

import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.startapp.C12425x3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.td */
/* compiled from: IMASDK */
public final class C4362td implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f18733a = 0;

    /* renamed from: b */
    private static final byte[] f18734b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final byte[] f18735c = amm.m14255y("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d */
    private static final byte[] f18736d = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final UUID f18737e = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Map<String, Integer> f18738f;

    /* renamed from: A */
    private boolean f18739A;

    /* renamed from: B */
    private int f18740B;

    /* renamed from: C */
    private long f18741C;

    /* renamed from: D */
    private boolean f18742D;

    /* renamed from: E */
    private long f18743E;

    /* renamed from: F */
    private long f18744F;

    /* renamed from: G */
    private long f18745G;

    /* renamed from: H */
    private alj f18746H;

    /* renamed from: I */
    private alj f18747I;

    /* renamed from: J */
    private boolean f18748J;

    /* renamed from: K */
    private boolean f18749K;

    /* renamed from: L */
    private int f18750L;

    /* renamed from: M */
    private long f18751M;

    /* renamed from: N */
    private long f18752N;

    /* renamed from: O */
    private int f18753O;

    /* renamed from: P */
    private int f18754P;

    /* renamed from: Q */
    private int[] f18755Q;

    /* renamed from: R */
    private int f18756R;

    /* renamed from: S */
    private int f18757S;

    /* renamed from: T */
    private int f18758T;

    /* renamed from: U */
    private int f18759U;

    /* renamed from: V */
    private boolean f18760V;

    /* renamed from: W */
    private int f18761W;

    /* renamed from: X */
    private int f18762X;

    /* renamed from: Y */
    private int f18763Y;

    /* renamed from: Z */
    private boolean f18764Z;

    /* renamed from: aa */
    private boolean f18765aa;

    /* renamed from: ab */
    private boolean f18766ab;

    /* renamed from: ac */
    private int f18767ac;

    /* renamed from: ad */
    private byte f18768ad;

    /* renamed from: ae */
    private boolean f18769ae;

    /* renamed from: af */
    private C4309re f18770af;

    /* renamed from: ag */
    private final C4355sx f18771ag;

    /* renamed from: g */
    private final C4364tf f18772g;

    /* renamed from: h */
    private final SparseArray<C4360tb> f18773h;

    /* renamed from: i */
    private final boolean f18774i;

    /* renamed from: j */
    private final alw f18775j;

    /* renamed from: k */
    private final alw f18776k;

    /* renamed from: l */
    private final alw f18777l;

    /* renamed from: m */
    private final alw f18778m;

    /* renamed from: n */
    private final alw f18779n;

    /* renamed from: o */
    private final alw f18780o;

    /* renamed from: p */
    private final alw f18781p;

    /* renamed from: q */
    private final alw f18782q;

    /* renamed from: r */
    private final alw f18783r;

    /* renamed from: s */
    private final alw f18784s;

    /* renamed from: t */
    private ByteBuffer f18785t;

    /* renamed from: u */
    private long f18786u;

    /* renamed from: v */
    private long f18787v;

    /* renamed from: w */
    private long f18788w;

    /* renamed from: x */
    private long f18789x;

    /* renamed from: y */
    private long f18790y;

    /* renamed from: z */
    private C4360tb f18791z;

    static {
        int i = C4357sz.f18665b;
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f18738f = Collections.unmodifiableMap(hashMap);
    }

    public C4362td() {
        this(0);
    }

    /* renamed from: A */
    private static int[] m18921A(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: B */
    private final void m18922B() {
        aup.m14889t(this.f18770af);
    }

    /* renamed from: o */
    private final void m18926o(int i) throws C4144lb {
        if (this.f18791z == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a TrackEntry");
            throw new C4144lb(sb.toString());
        }
    }

    /* renamed from: p */
    private final void m18927p(int i) throws C4144lb {
        if (this.f18746H == null || this.f18747I == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw new C4144lb(sb.toString());
        }
    }

    /* renamed from: q */
    private final C4360tb m18928q(int i) throws C4144lb {
        m18926o(i);
        return this.f18791z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9 A[EDGE_INSN: B:49:0x00b9->B:38:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18929r(com.google.ads.interactivemedia.p039v3.internal.C4360tb r17, long r18, int r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            com.google.ads.interactivemedia.v3.internal.tc r1 = r2.f18693S
            r8 = 1
            if (r1 == 0) goto L_0x0018
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r1.mo16644c(r2, r3, r5, r6, r7)
            goto L_0x00fa
        L_0x0018:
            java.lang.String r1 = r2.f18701b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r1 = r3.equals(r1)
            java.lang.String r4 = "S_TEXT/ASS"
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r2.f18701b
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0048
        L_0x002c:
            int r1 = r0.f18754P
            java.lang.String r5 = "MatroskaExtractor"
            if (r1 <= r8) goto L_0x0038
            java.lang.String r1 = "Skipping subtitle sample in laced block."
            android.util.Log.w(r5, r1)
            goto L_0x0048
        L_0x0038:
            long r6 = r0.f18752N
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "Skipping subtitle sample with no duration."
            android.util.Log.w(r5, r1)
        L_0x0048:
            r1 = r21
            goto L_0x00cc
        L_0x004c:
            java.lang.String r1 = r2.f18701b
            com.google.ads.interactivemedia.v3.internal.alw r5 = r0.f18781p
            byte[] r5 = r5.mo13952j()
            int r9 = r1.hashCode()
            r10 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r11 = 0
            if (r9 == r10) goto L_0x006c
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r9 == r4) goto L_0x0064
            goto L_0x0074
        L_0x0064:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            r1 = 0
            goto L_0x0075
        L_0x006c:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0074
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r1 = -1
        L_0x0075:
            if (r1 == 0) goto L_0x008a
            if (r1 != r8) goto L_0x0084
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r1 = "%01d:%02d:%02d:%02d"
            byte[] r1 = m18935x(r6, r1, r3)
            r3 = 21
            goto L_0x0094
        L_0x0084:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x008a:
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r1 = "%02d:%02d:%02d,%03d"
            byte[] r1 = m18935x(r6, r1, r3)
            r3 = 19
        L_0x0094:
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r11, r5, r3, r4)
            com.google.ads.interactivemedia.v3.internal.alw r1 = r0.f18781p
            int r1 = r1.mo13950h()
        L_0x009e:
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18781p
            int r3 = r3.mo13948f()
            if (r1 >= r3) goto L_0x00b9
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18781p
            byte[] r3 = r3.mo13952j()
            byte r3 = r3[r1]
            if (r3 != 0) goto L_0x00b6
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18781p
            r3.mo13949g(r1)
            goto L_0x00b9
        L_0x00b6:
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00b9:
            com.google.ads.interactivemedia.v3.internal.rw r1 = r2.f18696V
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18781p
            int r4 = r3.mo13948f()
            r1.mo13406d(r3, r4)
            com.google.ads.interactivemedia.v3.internal.alw r1 = r0.f18781p
            int r1 = r1.mo13948f()
            int r1 = r21 + r1
        L_0x00cc:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r20 & r3
            if (r3 == 0) goto L_0x00ec
            int r3 = r0.f18754P
            if (r3 <= r8) goto L_0x00de
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r3 = r20 & r3
            r13 = r1
            r12 = r3
            goto L_0x00ef
        L_0x00de:
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18784s
            int r3 = r3.mo13948f()
            com.google.ads.interactivemedia.v3.internal.rw r4 = r2.f18696V
            com.google.ads.interactivemedia.v3.internal.alw r5 = r0.f18784s
            r4.mo13408f(r5, r3)
            int r1 = r1 + r3
        L_0x00ec:
            r12 = r20
            r13 = r1
        L_0x00ef:
            com.google.ads.interactivemedia.v3.internal.rw r9 = r2.f18696V
            com.google.ads.interactivemedia.v3.internal.rv r15 = r2.f18708i
            r10 = r18
            r14 = r22
            r9.mo13404b(r10, r12, r13, r14, r15)
        L_0x00fa:
            r0.f18749K = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4362td.m18929r(com.google.ads.interactivemedia.v3.internal.tb, long, int, int, int):void");
    }

    /* renamed from: s */
    private final void m18930s(C4307rc rcVar, int i) throws IOException {
        if (this.f18777l.mo13948f() < i) {
            if (this.f18777l.mo13953k() < i) {
                alw alw = this.f18777l;
                int k = alw.mo13953k();
                alw.mo13946d(Math.max(k + k, i));
            }
            rcVar.mo16596c(this.f18777l.mo13952j(), this.f18777l.mo13948f(), i - this.f18777l.mo13948f());
            this.f18777l.mo13949g(i);
        }
    }

    /* renamed from: t */
    private final int m18931t(C4307rc rcVar, C4360tb tbVar, int i) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(tbVar.f18701b)) {
            m18934w(rcVar, f18734b, i);
            return m18932u();
        } else if ("S_TEXT/ASS".equals(tbVar.f18701b)) {
            m18934w(rcVar, f18736d, i);
            return m18932u();
        } else {
            C4327rw rwVar = tbVar.f18696V;
            boolean z = true;
            if (!this.f18764Z) {
                if (tbVar.f18706g) {
                    this.f18758T &= -1073741825;
                    int i3 = 128;
                    if (!this.f18765aa) {
                        rcVar.mo16596c(this.f18777l.mo13952j(), 0, 1);
                        this.f18761W++;
                        if ((this.f18777l.mo13952j()[0] & C12425x3.f55111d) != 128) {
                            this.f18768ad = this.f18777l.mo13952j()[0];
                            this.f18765aa = true;
                        } else {
                            throw new C4144lb("Extension bit is set in signal byte");
                        }
                    }
                    byte b = this.f18768ad;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.f18758T |= 1073741824;
                        if (!this.f18769ae) {
                            rcVar.mo16596c(this.f18782q.mo13952j(), 0, 8);
                            this.f18761W += 8;
                            this.f18769ae = true;
                            byte[] j = this.f18777l.mo13952j();
                            if (b2 != 2) {
                                i3 = 0;
                            }
                            j[0] = (byte) (i3 | 8);
                            this.f18777l.mo13951i(0);
                            rwVar.mo13408f(this.f18777l, 1);
                            this.f18762X++;
                            this.f18782q.mo13951i(0);
                            rwVar.mo13408f(this.f18782q, 8);
                            this.f18762X += 8;
                        }
                        if (b2 == 2) {
                            if (!this.f18766ab) {
                                rcVar.mo16596c(this.f18777l.mo13952j(), 0, 1);
                                this.f18761W++;
                                this.f18777l.mo13951i(0);
                                this.f18767ac = this.f18777l.mo13957o();
                                this.f18766ab = true;
                            }
                            int i4 = this.f18767ac * 4;
                            this.f18777l.mo13943a(i4);
                            rcVar.mo16596c(this.f18777l.mo13952j(), 0, i4);
                            this.f18761W += i4;
                            int i5 = (this.f18767ac >> 1) + 1;
                            int i6 = (i5 * 6) + 2;
                            ByteBuffer byteBuffer = this.f18785t;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.f18785t = ByteBuffer.allocate(i6);
                            }
                            this.f18785t.position(0);
                            this.f18785t.putShort((short) i5);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i2 = this.f18767ac;
                                if (i7 >= i2) {
                                    break;
                                }
                                int C = this.f18777l.mo13934C();
                                if (i7 % 2 == 0) {
                                    this.f18785t.putShort((short) (C - i8));
                                } else {
                                    this.f18785t.putInt(C - i8);
                                }
                                i7++;
                                i8 = C;
                            }
                            int i9 = (i - this.f18761W) - i8;
                            if ((i2 & 1) == 1) {
                                this.f18785t.putInt(i9);
                            } else {
                                this.f18785t.putShort((short) i9);
                                this.f18785t.putInt(0);
                            }
                            this.f18783r.mo13945c(this.f18785t.array(), i6);
                            rwVar.mo13408f(this.f18783r, i6);
                            this.f18762X += i6;
                        }
                    }
                } else {
                    byte[] bArr = tbVar.f18707h;
                    if (bArr != null) {
                        this.f18780o.mo13945c(bArr, bArr.length);
                    }
                }
                if (tbVar.f18705f > 0) {
                    this.f18758T |= 268435456;
                    this.f18784s.mo13943a(0);
                    this.f18777l.mo13943a(4);
                    this.f18777l.mo13952j()[0] = (byte) ((i >> 24) & 255);
                    this.f18777l.mo13952j()[1] = (byte) ((i >> 16) & 255);
                    this.f18777l.mo13952j()[2] = (byte) ((i >> 8) & 255);
                    this.f18777l.mo13952j()[3] = (byte) (i & 255);
                    rwVar.mo13408f(this.f18777l, 4);
                    this.f18762X += 4;
                }
                this.f18764Z = true;
            }
            int f = i + this.f18780o.mo13948f();
            if (!"V_MPEG4/ISO/AVC".equals(tbVar.f18701b) && !"V_MPEGH/ISO/HEVC".equals(tbVar.f18701b)) {
                if (tbVar.f18693S != null) {
                    if (this.f18780o.mo13948f() != 0) {
                        z = false;
                    }
                    aup.m14887r(z);
                    tbVar.f18693S.mo16643b(rcVar);
                }
                while (true) {
                    int i10 = this.f18761W;
                    if (i10 >= f) {
                        break;
                    }
                    int y = m18936y(rcVar, rwVar, f - i10);
                    this.f18761W += y;
                    this.f18762X += y;
                }
            } else {
                byte[] j2 = this.f18776k.mo13952j();
                j2[0] = 0;
                j2[1] = 0;
                j2[2] = 0;
                int i11 = tbVar.f18697W;
                int i12 = 4 - i11;
                while (this.f18761W < f) {
                    int i13 = this.f18763Y;
                    if (i13 == 0) {
                        int min = Math.min(i11, this.f18780o.mo13947e());
                        rcVar.mo16596c(j2, i12 + min, i11 - min);
                        if (min > 0) {
                            this.f18780o.mo13956n(j2, i12, min);
                        }
                        this.f18761W += i11;
                        this.f18776k.mo13951i(0);
                        this.f18763Y = this.f18776k.mo13934C();
                        this.f18775j.mo13951i(0);
                        rwVar.mo13406d(this.f18775j, 4);
                        this.f18762X += 4;
                    } else {
                        int y2 = m18936y(rcVar, rwVar, i13);
                        this.f18761W += y2;
                        this.f18762X += y2;
                        this.f18763Y -= y2;
                    }
                }
            }
            if ("A_VORBIS".equals(tbVar.f18701b)) {
                this.f18778m.mo13951i(0);
                rwVar.mo13406d(this.f18778m, 4);
                this.f18762X += 4;
            }
            return m18932u();
        }
    }

    /* renamed from: u */
    private final int m18932u() {
        int i = this.f18762X;
        m18933v();
        return i;
    }

    /* renamed from: v */
    private final void m18933v() {
        this.f18761W = 0;
        this.f18762X = 0;
        this.f18763Y = 0;
        this.f18764Z = false;
        this.f18765aa = false;
        this.f18766ab = false;
        this.f18767ac = 0;
        this.f18768ad = 0;
        this.f18769ae = false;
        this.f18780o.mo13943a(0);
    }

    /* renamed from: w */
    private final void m18934w(C4307rc rcVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.f18781p.mo13953k() < i2) {
            this.f18781p.mo13944b(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.f18781p.mo13952j(), 0, length);
        }
        rcVar.mo16596c(this.f18781p.mo13952j(), length, i);
        this.f18781p.mo13951i(0);
        this.f18781p.mo13949g(i2);
    }

    /* renamed from: x */
    private static byte[] m18935x(long j, String str, long j2) {
        aup.m14885p(j != C6540C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return amm.m14255y(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: y */
    private final int m18936y(C4307rc rcVar, C4327rw rwVar, int i) throws IOException {
        int e = this.f18780o.mo13947e();
        if (e <= 0) {
            return rwVar.mo13405c(rcVar, i, false);
        }
        int min = Math.min(i, e);
        rwVar.mo13406d(this.f18780o, min);
        return min;
    }

    /* renamed from: z */
    private final long m18937z(long j) throws C4144lb {
        long j2 = this.f18788w;
        if (j2 != C6540C.TIME_UNSET) {
            return amm.m14196M(j, j2, 1000);
        }
        throw new C4144lb("Can't scale timecode prior to timecodeScale being set.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16646a(int i, long j, long j2) throws C4144lb {
        m18922B();
        if (i == 160) {
            this.f18760V = false;
        } else if (i == 174) {
            this.f18791z = new C4360tb((byte[]) null);
        } else if (i == 187) {
            this.f18748J = false;
        } else if (i == 19899) {
            this.f18740B = -1;
            this.f18741C = -1;
        } else if (i == 20533) {
            m18928q(i).f18706g = true;
        } else if (i == 21968) {
            m18928q(i).f18722w = true;
        } else if (i == 408125543) {
            long j3 = this.f18787v;
            if (j3 == -1 || j3 == j) {
                this.f18787v = j;
                this.f18786u = j2;
                return;
            }
            throw new C4144lb("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f18746H = new alj();
            this.f18747I = new alj();
        } else if (i != 524531317 || this.f18739A) {
        } else {
            if (!this.f18774i || this.f18743E == -1) {
                this.f18770af.mo13364bc(new C4323rs(this.f18790y));
                this.f18739A = true;
                return;
            }
            this.f18742D = true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0248, code lost:
        if (r1.equals("V_AV1") != false) goto L_0x0300;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16647b(int r19) throws com.google.ads.interactivemedia.p039v3.internal.C4144lb {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r18.m18922B()
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 2
            r8 = 1
            r9 = 0
            if (r0 == r1) goto L_0x031d
            r1 = 174(0xae, float:2.44E-43)
            r3 = -1
            r4 = 0
            if (r0 == r1) goto L_0x017f
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r5 = -1
            r2 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0168
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x0138
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0122
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x010a
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00f4
            if (r0 == r2) goto L_0x0038
            goto L_0x0176
        L_0x0038:
            boolean r0 = r7.f18739A
            if (r0 != 0) goto L_0x00ef
            com.google.ads.interactivemedia.v3.internal.re r0 = r7.f18770af
            com.google.ads.interactivemedia.v3.internal.alj r1 = r7.f18746H
            com.google.ads.interactivemedia.v3.internal.alj r2 = r7.f18747I
            long r12 = r7.f18787v
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x00e3
            long r5 = r7.f18790y
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00e3
            if (r1 == 0) goto L_0x00e3
            int r5 = r1.mo13911c()
            if (r5 == 0) goto L_0x00e3
            if (r2 == 0) goto L_0x00e3
            int r5 = r2.mo13911c()
            int r6 = r1.mo13911c()
            if (r5 == r6) goto L_0x0064
            goto L_0x00e3
        L_0x0064:
            int r5 = r1.mo13911c()
            int[] r6 = new int[r5]
            long[] r10 = new long[r5]
            long[] r11 = new long[r5]
            long[] r12 = new long[r5]
            r13 = 0
        L_0x0071:
            if (r13 >= r5) goto L_0x0086
            long r14 = r1.mo13910b(r13)
            r12[r13] = r14
            long r14 = r7.f18787v
            long r16 = r2.mo13910b(r13)
            long r14 = r14 + r16
            r10[r13] = r14
            int r13 = r13 + 1
            goto L_0x0071
        L_0x0086:
            int r1 = r5 + -1
            if (r9 >= r1) goto L_0x009d
            int r1 = r9 + 1
            r13 = r10[r1]
            r15 = r10[r9]
            long r13 = r13 - r15
            int r2 = (int) r13
            r6[r9] = r2
            r13 = r12[r1]
            r15 = r12[r9]
            long r13 = r13 - r15
            r11[r9] = r13
            r9 = r1
            goto L_0x0086
        L_0x009d:
            long r2 = r7.f18787v
            long r13 = r7.f18786u
            long r2 = r2 + r13
            r13 = r10[r1]
            long r2 = r2 - r13
            int r3 = (int) r2
            r6[r1] = r3
            long r2 = r7.f18790y
            r13 = r12[r1]
            long r2 = r2 - r13
            r11[r1] = r2
            r13 = 0
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x00dd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r9 = 72
            r5.<init>(r9)
            java.lang.String r9 = "Discarding last cue point with unexpected duration: "
            r5.append(r9)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "MatroskaExtractor"
            android.util.Log.w(r3, r2)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r10 = java.util.Arrays.copyOf(r10, r1)
            long[] r11 = java.util.Arrays.copyOf(r11, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
        L_0x00dd:
            com.google.ads.interactivemedia.v3.internal.qw r1 = new com.google.ads.interactivemedia.v3.internal.qw
            r1.<init>(r6, r10, r11, r12)
            goto L_0x00ea
        L_0x00e3:
            com.google.ads.interactivemedia.v3.internal.rs r1 = new com.google.ads.interactivemedia.v3.internal.rs
            long r2 = r7.f18790y
            r1.<init>(r2)
        L_0x00ea:
            r0.mo13364bc(r1)
            r7.f18739A = r8
        L_0x00ef:
            r7.f18746H = r4
            r7.f18747I = r4
            return
        L_0x00f4:
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.tb> r0 = r7.f18773h
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0102
            com.google.ads.interactivemedia.v3.internal.re r0 = r7.f18770af
            r0.mo13363bb()
            return
        L_0x0102:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "No valid tracks were found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x010a:
            long r0 = r7.f18788w
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0115
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.f18788w = r0
        L_0x0115:
            long r0 = r7.f18789x
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0176
            long r0 = r7.m18937z(r0)
            r7.f18790y = r0
            return
        L_0x0122:
            r18.m18926o(r19)
            com.google.ads.interactivemedia.v3.internal.tb r0 = r7.f18791z
            boolean r1 = r0.f18706g
            if (r1 == 0) goto L_0x0176
            byte[] r0 = r0.f18707h
            if (r0 != 0) goto L_0x0130
            goto L_0x0176
        L_0x0130:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "Combining encryption and compression is not supported"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0138:
            r18.m18926o(r19)
            com.google.ads.interactivemedia.v3.internal.tb r0 = r7.f18791z
            boolean r1 = r0.f18706g
            if (r1 == 0) goto L_0x0176
            com.google.ads.interactivemedia.v3.internal.rv r1 = r0.f18708i
            if (r1 == 0) goto L_0x0160
            com.google.ads.interactivemedia.v3.internal.pz r1 = new com.google.ads.interactivemedia.v3.internal.pz
            com.google.ads.interactivemedia.v3.internal.py[] r2 = new com.google.ads.interactivemedia.p039v3.internal.C4275py[r8]
            com.google.ads.interactivemedia.v3.internal.py r3 = new com.google.ads.interactivemedia.v3.internal.py
            java.util.UUID r5 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.f17461a
            com.google.ads.interactivemedia.v3.internal.tb r6 = r7.f18791z
            com.google.ads.interactivemedia.v3.internal.rv r6 = r6.f18708i
            byte[] r6 = r6.f18542b
            java.lang.String r8 = "video/webm"
            r3.<init>(r5, r8, r6)
            r2[r9] = r3
            r1.<init>((java.lang.String) r4, (com.google.ads.interactivemedia.p039v3.internal.C4275py[]) r2)
            r0.f18710k = r1
            return
        L_0x0160:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "Encrypted Track found but ContentEncKeyID was not found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0168:
            int r0 = r7.f18740B
            if (r0 == r3) goto L_0x0177
            long r3 = r7.f18741C
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0177
            if (r0 != r2) goto L_0x0176
            r7.f18743E = r3
        L_0x0176:
            return
        L_0x0177:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "Mandatory element SeekID or SeekPosition not found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x017f:
            com.google.ads.interactivemedia.v3.internal.tb r0 = r7.f18791z
            com.google.ads.interactivemedia.p039v3.internal.aup.m14889t(r0)
            java.lang.String r1 = r0.f18701b
            if (r1 == 0) goto L_0x0315
            int r5 = r1.hashCode()
            switch(r5) {
                case -2095576542: goto L_0x02f5;
                case -2095575984: goto L_0x02eb;
                case -1985379776: goto L_0x02e0;
                case -1784763192: goto L_0x02d5;
                case -1730367663: goto L_0x02ca;
                case -1482641358: goto L_0x02bf;
                case -1482641357: goto L_0x02b4;
                case -1373388978: goto L_0x02a9;
                case -933872740: goto L_0x029e;
                case -538363189: goto L_0x0293;
                case -538363109: goto L_0x0288;
                case -425012669: goto L_0x027c;
                case -356037306: goto L_0x0270;
                case 62923557: goto L_0x0264;
                case 62923603: goto L_0x0258;
                case 62927045: goto L_0x024c;
                case 82318131: goto L_0x0242;
                case 82338133: goto L_0x0237;
                case 82338134: goto L_0x022c;
                case 99146302: goto L_0x0220;
                case 444813526: goto L_0x0214;
                case 542569478: goto L_0x0208;
                case 635596514: goto L_0x01fc;
                case 725948237: goto L_0x01f0;
                case 725957860: goto L_0x01e4;
                case 738597099: goto L_0x01d8;
                case 855502857: goto L_0x01cc;
                case 1422270023: goto L_0x01c0;
                case 1809237540: goto L_0x01b5;
                case 1950749482: goto L_0x01a9;
                case 1950789798: goto L_0x019d;
                case 1951062397: goto L_0x0191;
                default: goto L_0x018f;
            }
        L_0x018f:
            goto L_0x02ff
        L_0x0191:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 11
            goto L_0x0300
        L_0x019d:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 22
            goto L_0x0300
        L_0x01a9:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 17
            goto L_0x0300
        L_0x01b5:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 3
            goto L_0x0300
        L_0x01c0:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 27
            goto L_0x0300
        L_0x01cc:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 8
            goto L_0x0300
        L_0x01d8:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 28
            goto L_0x0300
        L_0x01e4:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 24
            goto L_0x0300
        L_0x01f0:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 25
            goto L_0x0300
        L_0x01fc:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 26
            goto L_0x0300
        L_0x0208:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 20
            goto L_0x0300
        L_0x0214:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 10
            goto L_0x0300
        L_0x0220:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 30
            goto L_0x0300
        L_0x022c:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 1
            goto L_0x0300
        L_0x0237:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 0
            goto L_0x0300
        L_0x0242:
            java.lang.String r5 = "V_AV1"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x02ff
            goto L_0x0300
        L_0x024c:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 19
            goto L_0x0300
        L_0x0258:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 16
            goto L_0x0300
        L_0x0264:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 13
            goto L_0x0300
        L_0x0270:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 21
            goto L_0x0300
        L_0x027c:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 29
            goto L_0x0300
        L_0x0288:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 7
            goto L_0x0300
        L_0x0293:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 5
            goto L_0x0300
        L_0x029e:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 31
            goto L_0x0300
        L_0x02a9:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 9
            goto L_0x0300
        L_0x02b4:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 15
            goto L_0x0300
        L_0x02bf:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 14
            goto L_0x0300
        L_0x02ca:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 12
            goto L_0x0300
        L_0x02d5:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 18
            goto L_0x0300
        L_0x02e0:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 23
            goto L_0x0300
        L_0x02eb:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 4
            goto L_0x0300
        L_0x02f5:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ff
            r2 = 6
            goto L_0x0300
        L_0x02ff:
            r2 = -1
        L_0x0300:
            switch(r2) {
                case 0: goto L_0x0304;
                case 1: goto L_0x0304;
                case 2: goto L_0x0304;
                case 3: goto L_0x0304;
                case 4: goto L_0x0304;
                case 5: goto L_0x0304;
                case 6: goto L_0x0304;
                case 7: goto L_0x0304;
                case 8: goto L_0x0304;
                case 9: goto L_0x0304;
                case 10: goto L_0x0304;
                case 11: goto L_0x0304;
                case 12: goto L_0x0304;
                case 13: goto L_0x0304;
                case 14: goto L_0x0304;
                case 15: goto L_0x0304;
                case 16: goto L_0x0304;
                case 17: goto L_0x0304;
                case 18: goto L_0x0304;
                case 19: goto L_0x0304;
                case 20: goto L_0x0304;
                case 21: goto L_0x0304;
                case 22: goto L_0x0304;
                case 23: goto L_0x0304;
                case 24: goto L_0x0304;
                case 25: goto L_0x0304;
                case 26: goto L_0x0304;
                case 27: goto L_0x0304;
                case 28: goto L_0x0304;
                case 29: goto L_0x0304;
                case 30: goto L_0x0304;
                case 31: goto L_0x0304;
                default: goto L_0x0303;
            }
        L_0x0303:
            goto L_0x0312
        L_0x0304:
            com.google.ads.interactivemedia.v3.internal.re r1 = r7.f18770af
            int r2 = r0.f18702c
            r0.mo16641a(r1, r2)
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.tb> r1 = r7.f18773h
            int r2 = r0.f18702c
            r1.put(r2, r0)
        L_0x0312:
            r7.f18791z = r4
            return
        L_0x0315:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x031d:
            int r0 = r7.f18750L
            if (r0 != r2) goto L_0x036d
            r0 = 0
            r1 = 0
        L_0x0323:
            int r2 = r7.f18754P
            if (r0 >= r2) goto L_0x032f
            int[] r2 = r7.f18755Q
            r2 = r2[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L_0x0323
        L_0x032f:
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.tb> r0 = r7.f18773h
            int r2 = r7.f18756R
            java.lang.Object r0 = r0.get(r2)
            r10 = r0
            com.google.ads.interactivemedia.v3.internal.tb r10 = (com.google.ads.interactivemedia.p039v3.internal.C4360tb) r10
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r10.f18696V)
            r0 = 0
        L_0x033e:
            int r2 = r7.f18754P
            if (r0 >= r2) goto L_0x036b
            long r2 = r7.f18751M
            int r4 = r10.f18704e
            int r4 = r4 * r0
            int r4 = r4 / 1000
            long r4 = (long) r4
            long r2 = r2 + r4
            int r4 = r7.f18758T
            if (r0 != 0) goto L_0x0359
            boolean r0 = r7.f18760V
            if (r0 != 0) goto L_0x0357
            r0 = r4 | 1
            r4 = r0
        L_0x0357:
            r11 = 0
            goto L_0x035a
        L_0x0359:
            r11 = r0
        L_0x035a:
            int[] r0 = r7.f18755Q
            r5 = r0[r11]
            int r12 = r1 - r5
            r0 = r18
            r1 = r10
            r6 = r12
            r0.m18929r(r1, r2, r4, r5, r6)
            int r0 = r11 + 1
            r1 = r12
            goto L_0x033e
        L_0x036b:
            r7.f18750L = r9
        L_0x036d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4362td.mo16647b(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16648c(int i, long j) throws C4144lb {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m18928q(i).f18703d = (int) j;
                        return;
                    case 136:
                        C4360tb q = m18928q(i);
                        if (j == 1) {
                            z = true;
                        }
                        q.f18695U = z;
                        return;
                    case 155:
                        this.f18752N = m18937z(j);
                        return;
                    case 159:
                        m18928q(i).f18688N = (int) j;
                        return;
                    case 176:
                        m18928q(i).f18711l = (int) j;
                        return;
                    case 179:
                        m18927p(i);
                        this.f18746H.mo13909a(m18937z(j));
                        return;
                    case 186:
                        m18928q(i).f18712m = (int) j;
                        return;
                    case 215:
                        m18928q(i).f18702c = (int) j;
                        return;
                    case 231:
                        this.f18745G = m18937z(j);
                        return;
                    case 238:
                        this.f18759U = (int) j;
                        return;
                    case 241:
                        if (!this.f18748J) {
                            m18927p(i);
                            this.f18747I.mo13909a(j);
                            this.f18748J = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f18760V = true;
                        return;
                    case 16871:
                        m18928q(i).f18698X = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new C4144lb(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new C4144lb(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new C4144lb(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new C4144lb(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new C4144lb(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.f18741C = j + this.f18787v;
                        return;
                    case 21432:
                        m18926o(i);
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f18791z.f18721v = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f18791z.f18721v = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f18791z.f18721v = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f18791z.f18721v = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m18928q(i).f18713n = (int) j;
                        return;
                    case 21682:
                        m18928q(i).f18715p = (int) j;
                        return;
                    case 21690:
                        m18928q(i).f18714o = (int) j;
                        return;
                    case 21930:
                        C4360tb q2 = m18928q(i);
                        if (j == 1) {
                            z = true;
                        }
                        q2.f18694T = z;
                        return;
                    case 21998:
                        m18928q(i).f18705f = (int) j;
                        return;
                    case 22186:
                        m18928q(i).f18691Q = j;
                        return;
                    case 22203:
                        m18928q(i).f18692R = j;
                        return;
                    case 25188:
                        m18928q(i).f18689O = (int) j;
                        return;
                    case 30321:
                        m18926o(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f18791z.f18716q = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f18791z.f18716q = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f18791z.f18716q = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f18791z.f18716q = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m18928q(i).f18704e = (int) j;
                        return;
                    case 2807729:
                        this.f18788w = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m18926o(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f18791z.f18725z = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f18791z.f18725z = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m18926o(i);
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.f18791z.f18724y = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.f18791z.f18724y = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.f18791z.f18724y = 3;
                                return;
                            case 21947:
                                m18926o(i);
                                C4360tb tbVar = this.f18791z;
                                tbVar.f18722w = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    tbVar.f18723x = 1;
                                    return;
                                } else if (i6 == 9) {
                                    tbVar.f18723x = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    tbVar.f18723x = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                m18928q(i).f18675A = (int) j;
                                return;
                            case 21949:
                                m18928q(i).f18676B = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new C4144lb(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new C4144lb(sb7.toString());
        }
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        return new C4363te().mo16652a(rcVar);
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f18770af = reVar;
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        this.f18749K = false;
        while (!this.f18749K) {
            if (this.f18771ag.mo16640c(rcVar)) {
                long l = rcVar.mo16605l();
                if (this.f18742D) {
                    this.f18744F = l;
                    rqVar.f18533a = this.f18743E;
                    this.f18742D = false;
                    return 1;
                } else if (this.f18739A) {
                    long j = this.f18744F;
                    if (j != -1) {
                        rqVar.f18533a = j;
                        this.f18744F = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.f18773h.size(); i++) {
                    C4360tb valueAt = this.f18773h.valueAt(i);
                    aup.m14890u(valueAt.f18696V);
                    C4361tc tcVar = valueAt.f18693S;
                    if (tcVar != null) {
                        tcVar.mo16645d(valueAt);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        this.f18745G = C6540C.TIME_UNSET;
        this.f18750L = 0;
        this.f18771ag.mo16639b();
        this.f18772g.mo16653a();
        m18933v();
        for (int i = 0; i < this.f18773h.size(); i++) {
            C4361tc tcVar = this.f18773h.valueAt(i).f18693S;
            if (tcVar != null) {
                tcVar.mo16642a();
            }
        }
    }

    /* renamed from: h */
    public final void mo13693h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo16649i(int i, double d) throws C4144lb {
        if (i == 181) {
            m18928q(i).f18690P = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m18928q(i).f18677C = (float) d;
                    return;
                case 21970:
                    m18928q(i).f18678D = (float) d;
                    return;
                case 21971:
                    m18928q(i).f18679E = (float) d;
                    return;
                case 21972:
                    m18928q(i).f18680F = (float) d;
                    return;
                case 21973:
                    m18928q(i).f18681G = (float) d;
                    return;
                case 21974:
                    m18928q(i).f18682H = (float) d;
                    return;
                case 21975:
                    m18928q(i).f18683I = (float) d;
                    return;
                case 21976:
                    m18928q(i).f18684J = (float) d;
                    return;
                case 21977:
                    m18928q(i).f18685K = (float) d;
                    return;
                case 21978:
                    m18928q(i).f18686L = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m18928q(i).f18717r = (float) d;
                            return;
                        case 30324:
                            m18928q(i).f18718s = (float) d;
                            return;
                        case 30325:
                            m18928q(i).f18719t = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f18789x = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo16650j(int i, String str) throws C4144lb {
        if (i == 134) {
            m18928q(i).f18701b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m18928q(i).f18700a = str;
            } else if (i == 2274716) {
                m18928q(i).f18699Y = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new C4144lb(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo16651k(int i, int i2, C4307rc rcVar) throws IOException {
        int i3;
        long j;
        int i4;
        byte b;
        int i5;
        int i6 = i;
        int i7 = i2;
        C4307rc rcVar2 = rcVar;
        int i8 = 4;
        int i9 = 1;
        int i10 = 0;
        if (i6 == 161 || i6 == 163) {
            if (this.f18750L == 0) {
                this.f18756R = (int) this.f18772g.mo16654b(rcVar2, false, true, 8);
                this.f18757S = this.f18772g.mo16655c();
                this.f18752N = C6540C.TIME_UNSET;
                this.f18750L = 1;
                this.f18777l.mo13943a(0);
            }
            C4360tb tbVar = this.f18773h.get(this.f18756R);
            if (tbVar == null) {
                rcVar2.mo16597d(i7 - this.f18757S);
                this.f18750L = 0;
                return;
            }
            aup.m14890u(tbVar.f18696V);
            if (this.f18750L == 1) {
                m18930s(rcVar2, 3);
                int i11 = (this.f18777l.mo13952j()[2] & 6) >> 1;
                byte b2 = 255;
                if (i11 == 0) {
                    this.f18754P = 1;
                    int[] A = m18921A(this.f18755Q, 1);
                    this.f18755Q = A;
                    A[0] = (i7 - this.f18757S) - 3;
                } else {
                    m18930s(rcVar2, 4);
                    int i12 = (this.f18777l.mo13952j()[3] & 255) + 1;
                    this.f18754P = i12;
                    int[] A2 = m18921A(this.f18755Q, i12);
                    this.f18755Q = A2;
                    if (i11 == 2) {
                        int i13 = this.f18757S;
                        int i14 = this.f18754P;
                        Arrays.fill(A2, 0, i14, ((i7 - i13) - 4) / i14);
                    } else if (i11 == 1) {
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i4 = this.f18754P - 1;
                            if (i15 >= i4) {
                                break;
                            }
                            this.f18755Q[i15] = 0;
                            do {
                                i8++;
                                m18930s(rcVar2, i8);
                                b = this.f18777l.mo13952j()[i8 - 1] & 255;
                                int[] iArr = this.f18755Q;
                                i5 = iArr[i15] + b;
                                iArr[i15] = i5;
                            } while (b == 255);
                            i16 += i5;
                            i15++;
                        }
                        this.f18755Q[i4] = ((i7 - this.f18757S) - i8) - i16;
                    } else if (i11 == 3) {
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            int i19 = this.f18754P - 1;
                            if (i17 >= i19) {
                                this.f18755Q[i19] = ((i7 - this.f18757S) - i8) - i18;
                                break;
                            }
                            this.f18755Q[i17] = i10;
                            i8++;
                            m18930s(rcVar2, i8);
                            int i20 = i8 - 1;
                            if (this.f18777l.mo13952j()[i20] != 0) {
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= 8) {
                                        j = 0;
                                        break;
                                    }
                                    int i22 = i9 << (7 - i21);
                                    if ((this.f18777l.mo13952j()[i20] & i22) != 0) {
                                        i8 += i21;
                                        m18930s(rcVar2, i8);
                                        int i23 = i20 + 1;
                                        j = (long) (this.f18777l.mo13952j()[i20] & b2 & (i22 ^ -1));
                                        while (i23 < i8) {
                                            j = (j << 8) | ((long) (this.f18777l.mo13952j()[i23] & b2));
                                            i23++;
                                            b2 = 255;
                                        }
                                        if (i17 > 0) {
                                            j -= (1 << ((i21 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i21++;
                                        i9 = 1;
                                        b2 = 255;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i24 = (int) j;
                                    int[] iArr2 = this.f18755Q;
                                    if (i17 != 0) {
                                        i24 += iArr2[i17 - 1];
                                    }
                                    iArr2[i17] = i24;
                                    i18 += i24;
                                    i17++;
                                    i9 = 1;
                                    i10 = 0;
                                    b2 = 255;
                                }
                            } else {
                                throw new C4144lb("No valid varint length mask found");
                            }
                        }
                        throw new C4144lb("EBML lacing sample size out of range.");
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(2);
                        throw new C4144lb(sb.toString());
                    }
                }
                this.f18751M = this.f18745G + m18937z((long) ((this.f18777l.mo13952j()[0] << 8) | (this.f18777l.mo13952j()[1] & 255)));
                if (tbVar.f18703d != 2) {
                    if (i6 == 163) {
                        if ((this.f18777l.mo13952j()[2] & C12425x3.f55111d) == 128) {
                            i6 = 163;
                        } else {
                            i6 = 163;
                        }
                    }
                    i3 = 0;
                    this.f18758T = i3;
                    this.f18750L = 2;
                    this.f18753O = 0;
                }
                i3 = 1;
                this.f18758T = i3;
                this.f18750L = 2;
                this.f18753O = 0;
            }
            if (i6 == 163) {
                while (true) {
                    int i25 = this.f18753O;
                    if (i25 < this.f18754P) {
                        m18929r(tbVar, ((long) ((this.f18753O * tbVar.f18704e) / 1000)) + this.f18751M, this.f18758T, m18931t(rcVar2, tbVar, this.f18755Q[i25]), 0);
                        this.f18753O++;
                    } else {
                        this.f18750L = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i26 = this.f18753O;
                    if (i26 < this.f18754P) {
                        int[] iArr3 = this.f18755Q;
                        iArr3[i26] = m18931t(rcVar2, tbVar, iArr3[i26]);
                        this.f18753O++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i6 != 165) {
            if (i6 == 16877) {
                C4360tb q = m18928q(i);
                if (q.f18698X == 1685485123 || q.f18698X == 1685480259) {
                    byte[] bArr = new byte[i7];
                    q.f18687M = bArr;
                    rcVar2.mo16596c(bArr, 0, i7);
                    return;
                }
                rcVar2.mo16597d(i7);
            } else if (i6 == 16981) {
                m18926o(i);
                byte[] bArr2 = new byte[i7];
                this.f18791z.f18707h = bArr2;
                rcVar2.mo16596c(bArr2, 0, i7);
            } else if (i6 == 18402) {
                byte[] bArr3 = new byte[i7];
                rcVar2.mo16596c(bArr3, 0, i7);
                m18928q(i).f18708i = new C4326rv(1, bArr3, 0, 0);
            } else if (i6 == 21419) {
                Arrays.fill(this.f18779n.mo13952j(), (byte) 0);
                rcVar2.mo16596c(this.f18779n.mo13952j(), 4 - i7, i7);
                this.f18779n.mo13951i(0);
                this.f18740B = (int) this.f18779n.mo13963u();
            } else if (i6 == 25506) {
                m18926o(i);
                byte[] bArr4 = new byte[i7];
                this.f18791z.f18709j = bArr4;
                rcVar2.mo16596c(bArr4, 0, i7);
            } else if (i6 == 30322) {
                m18926o(i);
                byte[] bArr5 = new byte[i7];
                this.f18791z.f18720u = bArr5;
                rcVar2.mo16596c(bArr5, 0, i7);
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(i6);
                throw new C4144lb(sb2.toString());
            }
        } else if (this.f18750L == 2) {
            C4360tb tbVar2 = this.f18773h.get(this.f18756R);
            if (this.f18759U != 4 || !"V_VP9".equals(tbVar2.f18701b)) {
                rcVar2.mo16597d(i7);
                return;
            }
            this.f18784s.mo13943a(i7);
            rcVar2.mo16596c(this.f18784s.mo13952j(), 0, i7);
        }
    }

    public C4362td(int i) {
        C4355sx sxVar = new C4355sx();
        this.f18787v = -1;
        this.f18788w = C6540C.TIME_UNSET;
        this.f18789x = C6540C.TIME_UNSET;
        this.f18790y = C6540C.TIME_UNSET;
        this.f18743E = -1;
        this.f18744F = -1;
        this.f18745G = C6540C.TIME_UNSET;
        this.f18771ag = sxVar;
        sxVar.mo16638a(new C4359ta(this));
        this.f18774i = 1 == (i ^ 1);
        this.f18772g = new C4364tf();
        this.f18773h = new SparseArray<>();
        this.f18777l = new alw(4);
        this.f18778m = new alw(ByteBuffer.allocate(4).putInt(-1).array());
        this.f18779n = new alw(4);
        this.f18775j = new alw(alq.f15233a);
        this.f18776k = new alw(4);
        this.f18780o = new alw();
        this.f18781p = new alw();
        this.f18782q = new alw(8);
        this.f18783r = new alw();
        this.f18784s = new alw();
        this.f18755Q = new int[1];
    }
}
