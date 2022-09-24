package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.startapp.C12425x3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.ads.u */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4626u implements vb4 {

    /* renamed from: b0 */
    public static final cc4 f20846b0 = C7997o.f36207b;

    /* renamed from: c0 */
    private static final byte[] f20847c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final byte[] f20848d0 = d13.m20324w("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    private static final byte[] f20849e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public static final UUID f20850f0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public static final Map<String, Integer> f20851g0;

    /* renamed from: A */
    private long f20852A = C6540C.TIME_UNSET;

    /* renamed from: B */
    private gd2 f20853B;

    /* renamed from: C */
    private gd2 f20854C;

    /* renamed from: D */
    private boolean f20855D;

    /* renamed from: E */
    private boolean f20856E;

    /* renamed from: F */
    private int f20857F;

    /* renamed from: G */
    private long f20858G;

    /* renamed from: H */
    private long f20859H;

    /* renamed from: I */
    private int f20860I;

    /* renamed from: J */
    private int f20861J;

    /* renamed from: K */
    private int[] f20862K;

    /* renamed from: L */
    private int f20863L;

    /* renamed from: M */
    private int f20864M;

    /* renamed from: N */
    private int f20865N;

    /* renamed from: O */
    private int f20866O;

    /* renamed from: P */
    private boolean f20867P;

    /* renamed from: Q */
    private int f20868Q;

    /* renamed from: R */
    private int f20869R;

    /* renamed from: S */
    private int f20870S;

    /* renamed from: T */
    private boolean f20871T;

    /* renamed from: U */
    private boolean f20872U;

    /* renamed from: V */
    private boolean f20873V;

    /* renamed from: W */
    private int f20874W;

    /* renamed from: X */
    private byte f20875X;

    /* renamed from: Y */
    private boolean f20876Y;

    /* renamed from: Z */
    private yb4 f20877Z;

    /* renamed from: a */
    private final C8316x f20878a;

    /* renamed from: a0 */
    private final C7923m f20879a0;

    /* renamed from: b */
    private final SparseArray<C4622s> f20880b;

    /* renamed from: c */
    private final boolean f20881c;

    /* renamed from: d */
    private final uq2 f20882d;

    /* renamed from: e */
    private final uq2 f20883e;

    /* renamed from: f */
    private final uq2 f20884f;

    /* renamed from: g */
    private final uq2 f20885g;

    /* renamed from: h */
    private final uq2 f20886h;

    /* renamed from: i */
    private final uq2 f20887i;

    /* renamed from: j */
    private final uq2 f20888j;

    /* renamed from: k */
    private final uq2 f20889k;

    /* renamed from: l */
    private final uq2 f20890l;

    /* renamed from: m */
    private final uq2 f20891m;

    /* renamed from: n */
    private ByteBuffer f20892n;

    /* renamed from: o */
    private long f20893o;

    /* renamed from: p */
    private long f20894p = -1;

    /* renamed from: q */
    private long f20895q = C6540C.TIME_UNSET;

    /* renamed from: r */
    private long f20896r = C6540C.TIME_UNSET;

    /* renamed from: s */
    private long f20897s = C6540C.TIME_UNSET;

    /* renamed from: t */
    private C4622s f20898t;

    /* renamed from: u */
    private boolean f20899u;

    /* renamed from: v */
    private int f20900v;

    /* renamed from: w */
    private long f20901w;

    /* renamed from: x */
    private boolean f20902x;

    /* renamed from: y */
    private long f20903y = -1;

    /* renamed from: z */
    private long f20904z = -1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f20851g0 = Collections.unmodifiableMap(hashMap);
    }

    public C4626u(int i) {
        C7923m mVar = new C7923m();
        this.f20879a0 = mVar;
        mVar.mo33443a(new C8069q(this, (C8032p) null));
        this.f20881c = true;
        this.f20878a = new C8316x();
        this.f20880b = new SparseArray<>();
        this.f20884f = new uq2(4);
        this.f20885g = new uq2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f20886h = new uq2(4);
        this.f20882d = new uq2(kh2.f34333a);
        this.f20883e = new uq2(4);
        this.f20887i = new uq2();
        this.f20888j = new uq2();
        this.f20889k = new uq2(8);
        this.f20890l = new uq2();
        this.f20891m = new uq2();
        this.f20862K = new int[1];
    }

    /* renamed from: n */
    protected static final int m21044n(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /*134*/:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: o */
    protected static final boolean m21045o(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: p */
    private final int m21046p(wb4 wb4, C4622s sVar, int i) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(sVar.f20777b)) {
            m21054x(wb4, f20847c0, i);
            int i3 = this.f20869R;
            m21053w();
            return i3;
        } else if ("S_TEXT/ASS".equals(sVar.f20777b)) {
            m21054x(wb4, f20849e0, i);
            int i4 = this.f20869R;
            m21053w();
            return i4;
        } else {
            ad4 ad4 = sVar.f20774X;
            boolean z = true;
            if (!this.f20871T) {
                if (sVar.f20783h) {
                    this.f20865N &= -1073741825;
                    int i5 = 128;
                    if (!this.f20872U) {
                        ((qb4) wb4).mo33310d(this.f20884f.mo35238h(), 0, 1, false);
                        this.f20868Q++;
                        if ((this.f20884f.mo35238h()[0] & C12425x3.f55111d) != 128) {
                            this.f20875X = this.f20884f.mo35238h()[0];
                            this.f20872U = true;
                        } else {
                            throw C7811iy.m33482a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.f20875X;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.f20865N |= 1073741824;
                        if (!this.f20876Y) {
                            ((qb4) wb4).mo33310d(this.f20889k.mo35238h(), 0, 8, false);
                            this.f20868Q += 8;
                            this.f20876Y = true;
                            byte[] h = this.f20884f.mo35238h();
                            if (b2 != 2) {
                                i5 = 0;
                            }
                            h[0] = (byte) (i5 | 8);
                            this.f20884f.mo35236f(0);
                            ad4.mo30359f(this.f20884f, 1, 1);
                            this.f20869R++;
                            this.f20889k.mo35236f(0);
                            ad4.mo30359f(this.f20889k, 8, 1);
                            this.f20869R += 8;
                        }
                        if (b2 == 2) {
                            if (!this.f20873V) {
                                ((qb4) wb4).mo33310d(this.f20884f.mo35238h(), 0, 1, false);
                                this.f20868Q++;
                                this.f20884f.mo35236f(0);
                                this.f20874W = this.f20884f.mo35249s();
                                this.f20873V = true;
                            }
                            int i6 = this.f20874W * 4;
                            this.f20884f.mo35233c(i6);
                            ((qb4) wb4).mo33310d(this.f20884f.mo35238h(), 0, i6, false);
                            this.f20868Q += i6;
                            int i7 = (this.f20874W >> 1) + 1;
                            int i8 = (i7 * 6) + 2;
                            ByteBuffer byteBuffer = this.f20892n;
                            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                                this.f20892n = ByteBuffer.allocate(i8);
                            }
                            this.f20892n.position(0);
                            this.f20892n.putShort((short) i7);
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                i2 = this.f20874W;
                                if (i9 >= i2) {
                                    break;
                                }
                                int v = this.f20884f.mo35252v();
                                if (i9 % 2 == 0) {
                                    this.f20892n.putShort((short) (v - i10));
                                } else {
                                    this.f20892n.putInt(v - i10);
                                }
                                i9++;
                                i10 = v;
                            }
                            int i11 = (i - this.f20868Q) - i10;
                            if ((i2 & 1) == 1) {
                                this.f20892n.putInt(i11);
                            } else {
                                this.f20892n.putShort((short) i11);
                                this.f20892n.putInt(0);
                            }
                            this.f20890l.mo35234d(this.f20892n.array(), i8);
                            ad4.mo30359f(this.f20890l, i8, 1);
                            this.f20869R += i8;
                        }
                    }
                } else {
                    byte[] bArr = sVar.f20784i;
                    if (bArr != null) {
                        this.f20887i.mo35234d(bArr, bArr.length);
                    }
                }
                if (sVar.f20781f > 0) {
                    this.f20865N |= 268435456;
                    this.f20891m.mo35233c(0);
                    this.f20884f.mo35233c(4);
                    this.f20884f.mo35238h()[0] = (byte) ((i >> 24) & 255);
                    this.f20884f.mo35238h()[1] = (byte) ((i >> 16) & 255);
                    this.f20884f.mo35238h()[2] = (byte) ((i >> 8) & 255);
                    this.f20884f.mo35238h()[3] = (byte) (i & 255);
                    ad4.mo30359f(this.f20884f, 4, 2);
                    this.f20869R += 4;
                }
                this.f20871T = true;
            }
            int l = i + this.f20887i.mo35242l();
            if (!"V_MPEG4/ISO/AVC".equals(sVar.f20777b) && !"V_MPEGH/ISO/HEVC".equals(sVar.f20777b)) {
                if (sVar.f20770T != null) {
                    if (this.f20887i.mo35242l() != 0) {
                        z = false;
                    }
                    nu1.m20747f(z);
                    sVar.f20770T.mo18834d(wb4);
                }
                while (true) {
                    int i12 = this.f20868Q;
                    if (i12 >= l) {
                        break;
                    }
                    int q = m21047q(wb4, ad4, l - i12);
                    this.f20868Q += q;
                    this.f20869R += q;
                }
            } else {
                byte[] h2 = this.f20883e.mo35238h();
                h2[0] = 0;
                h2[1] = 0;
                h2[2] = 0;
                int i13 = sVar.f20775Y;
                int i14 = 4 - i13;
                while (this.f20868Q < l) {
                    int i15 = this.f20870S;
                    if (i15 == 0) {
                        int min = Math.min(i13, this.f20887i.mo35239i());
                        ((qb4) wb4).mo33310d(h2, i14 + min, i13 - min, false);
                        if (min > 0) {
                            this.f20887i.mo35232b(h2, i14, min);
                        }
                        this.f20868Q += i13;
                        this.f20883e.mo35236f(0);
                        this.f20870S = this.f20883e.mo35252v();
                        this.f20882d.mo35236f(0);
                        yc4.m39857b(ad4, this.f20882d, 4);
                        this.f20869R += 4;
                    } else {
                        int q2 = m21047q(wb4, ad4, i15);
                        this.f20868Q += q2;
                        this.f20869R += q2;
                        this.f20870S -= q2;
                    }
                }
            }
            if ("A_VORBIS".equals(sVar.f20777b)) {
                this.f20885g.mo35236f(0);
                yc4.m39857b(ad4, this.f20885g, 4);
                this.f20869R += 4;
            }
            int i16 = this.f20869R;
            m21053w();
            return i16;
        }
    }

    /* renamed from: q */
    private final int m21047q(wb4 wb4, ad4 ad4, int i) throws IOException {
        int i2 = this.f20887i.mo35239i();
        if (i2 <= 0) {
            return yc4.m39856a(ad4, wb4, i, false);
        }
        int min = Math.min(i, i2);
        yc4.m39857b(ad4, this.f20887i, min);
        return min;
    }

    /* renamed from: r */
    private final long m21048r(long j) throws C7811iy {
        long j2 = this.f20895q;
        if (j2 != C6540C.TIME_UNSET) {
            return d13.m20295Z(j, j2, 1000);
        }
        throw C7811iy.m33482a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: s */
    private final void m21049s(int i) throws C7811iy {
        if (this.f20853B == null || this.f20854C == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw C7811iy.m33482a(sb.toString(), (Throwable) null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: t */
    private final void m21050t(int i) throws C7811iy {
        if (this.f20898t == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a TrackEntry");
            throw C7811iy.m33482a(sb.toString(), (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9 A[EDGE_INSN: B:49:0x00b9->B:38:0x00b9 ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21051u(com.google.android.gms.internal.ads.C4622s r17, long r18, int r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            com.google.android.gms.internal.ads.t r1 = r2.f20770T
            r8 = 1
            if (r1 == 0) goto L_0x0018
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r1.mo18833c(r2, r3, r5, r6, r7)
            goto L_0x00fb
        L_0x0018:
            java.lang.String r1 = r2.f20777b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r1 = r3.equals(r1)
            java.lang.String r4 = "S_TEXT/ASS"
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r2.f20777b
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0048
        L_0x002c:
            int r1 = r0.f20861J
            java.lang.String r5 = "MatroskaExtractor"
            if (r1 <= r8) goto L_0x0038
            java.lang.String r1 = "Skipping subtitle sample in laced block."
            android.util.Log.w(r5, r1)
            goto L_0x0048
        L_0x0038:
            long r6 = r0.f20859H
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "Skipping subtitle sample with no duration."
            android.util.Log.w(r5, r1)
        L_0x0048:
            r1 = r21
            goto L_0x00cc
        L_0x004c:
            java.lang.String r1 = r2.f20777b
            com.google.android.gms.internal.ads.uq2 r5 = r0.f20888j
            byte[] r5 = r5.mo35238h()
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
            byte[] r1 = m21055y(r6, r1, r3)
            r3 = 21
            goto L_0x0094
        L_0x0084:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x008a:
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r1 = "%02d:%02d:%02d,%03d"
            byte[] r1 = m21055y(r6, r1, r3)
            r3 = 19
        L_0x0094:
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r11, r5, r3, r4)
            com.google.android.gms.internal.ads.uq2 r1 = r0.f20888j
            int r1 = r1.mo35241k()
        L_0x009e:
            com.google.android.gms.internal.ads.uq2 r3 = r0.f20888j
            int r3 = r3.mo35242l()
            if (r1 >= r3) goto L_0x00b9
            com.google.android.gms.internal.ads.uq2 r3 = r0.f20888j
            byte[] r3 = r3.mo35238h()
            byte r3 = r3[r1]
            if (r3 != 0) goto L_0x00b6
            com.google.android.gms.internal.ads.uq2 r3 = r0.f20888j
            r3.mo35235e(r1)
            goto L_0x00b9
        L_0x00b6:
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00b9:
            com.google.android.gms.internal.ads.ad4 r1 = r2.f20774X
            com.google.android.gms.internal.ads.uq2 r3 = r0.f20888j
            int r4 = r3.mo35242l()
            com.google.android.gms.internal.ads.yc4.m39857b(r1, r3, r4)
            com.google.android.gms.internal.ads.uq2 r1 = r0.f20888j
            int r1 = r1.mo35242l()
            int r1 = r21 + r1
        L_0x00cc:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r20 & r3
            if (r3 == 0) goto L_0x00ed
            int r3 = r0.f20861J
            if (r3 <= r8) goto L_0x00de
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r3 = r20 & r3
            r13 = r1
            r12 = r3
            goto L_0x00f0
        L_0x00de:
            com.google.android.gms.internal.ads.uq2 r3 = r0.f20891m
            int r3 = r3.mo35242l()
            com.google.android.gms.internal.ads.ad4 r4 = r2.f20774X
            com.google.android.gms.internal.ads.uq2 r5 = r0.f20891m
            r6 = 2
            r4.mo30359f(r5, r3, r6)
            int r1 = r1 + r3
        L_0x00ed:
            r12 = r20
            r13 = r1
        L_0x00f0:
            com.google.android.gms.internal.ads.ad4 r9 = r2.f20774X
            com.google.android.gms.internal.ads.zc4 r15 = r2.f20785j
            r10 = r18
            r14 = r22
            r9.mo30358e(r10, r12, r13, r14, r15)
        L_0x00fb:
            r0.f20856E = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4626u.m21051u(com.google.android.gms.internal.ads.s, long, int, int, int):void");
    }

    /* renamed from: v */
    private final void m21052v(wb4 wb4, int i) throws IOException {
        if (this.f20884f.mo35242l() < i) {
            if (this.f20884f.mo35240j() < i) {
                uq2 uq2 = this.f20884f;
                int j = uq2.mo35240j();
                uq2.mo35230H(Math.max(j + j, i));
            }
            ((qb4) wb4).mo33310d(this.f20884f.mo35238h(), this.f20884f.mo35242l(), i - this.f20884f.mo35242l(), false);
            this.f20884f.mo35235e(i);
        }
    }

    /* renamed from: w */
    private final void m21053w() {
        this.f20868Q = 0;
        this.f20869R = 0;
        this.f20870S = 0;
        this.f20871T = false;
        this.f20872U = false;
        this.f20873V = false;
        this.f20874W = 0;
        this.f20875X = 0;
        this.f20876Y = false;
        this.f20887i.mo35233c(0);
    }

    /* renamed from: x */
    private final void m21054x(wb4 wb4, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = i + 32;
        if (this.f20888j.mo35240j() < i2) {
            uq2 uq2 = this.f20888j;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            uq2.mo35234d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f20888j.mo35238h(), 0, 32);
        }
        ((qb4) wb4).mo33310d(this.f20888j.mo35238h(), 32, i, false);
        this.f20888j.mo35236f(0);
        this.f20888j.mo35235e(i2);
    }

    /* renamed from: y */
    private static byte[] m21055y(long j, String str, long j2) {
        nu1.m20745d(j != C6540C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return d13.m20324w(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: z */
    private static int[] m21056z(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        return new C8246v().mo35342a(wb4);
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        this.f20856E = false;
        while (!this.f20856E) {
            if (this.f20879a0.mo33445c(wb4)) {
                long zze = wb4.zze();
                if (this.f20902x) {
                    this.f20904z = zze;
                    tc4.f39386a = this.f20903y;
                    this.f20902x = false;
                    return 1;
                } else if (this.f20899u) {
                    long j = this.f20904z;
                    if (j != -1) {
                        tc4.f39386a = j;
                        this.f20904z = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.f20880b.size(); i++) {
                    C4622s valueAt = this.f20880b.valueAt(i);
                    Objects.requireNonNull(valueAt.f20774X);
                    C4625t tVar = valueAt.f20770T;
                    if (tVar != null) {
                        tVar.mo18831a(valueAt);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f20877Z = yb4;
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        this.f20852A = C6540C.TIME_UNSET;
        this.f20857F = 0;
        this.f20879a0.mo33444b();
        this.f20878a.mo35702e();
        m21053w();
        for (int i = 0; i < this.f20880b.size(); i++) {
            C4625t tVar = this.f20880b.valueAt(i).f20770T;
            if (tVar != null) {
                tVar.mo18832b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0284, code lost:
        throw com.google.android.gms.internal.ads.C7811iy.m33482a("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18859g(int r19, int r20, com.google.android.gms.internal.ads.wb4 r21) throws java.io.IOException {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            r8 = r21
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x0114
            if (r0 == r5) goto L_0x0114
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00de
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00b4
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x00a4
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x008f
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0069
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0059
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0041
            r18.m21050t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f20898t
            byte[] r2 = new byte[r1]
            r0.f20797v = r2
            r0 = r8
            com.google.android.gms.internal.ads.qb4 r0 = (com.google.android.gms.internal.ads.qb4) r0
            r0.mo33310d(r2, r10, r1, r10)
            return
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 26
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r3)
            throw r0
        L_0x0059:
            r18.m21050t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f20898t
            byte[] r2 = new byte[r1]
            r0.f20786k = r2
            r0 = r8
            com.google.android.gms.internal.ads.qb4 r0 = (com.google.android.gms.internal.ads.qb4) r0
            r0.mo33310d(r2, r10, r1, r10)
            return
        L_0x0069:
            com.google.android.gms.internal.ads.uq2 r0 = r7.f20886h
            byte[] r0 = r0.mo35238h()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.uq2 r0 = r7.f20886h
            byte[] r0 = r0.mo35238h()
            r2 = r8
            com.google.android.gms.internal.ads.qb4 r2 = (com.google.android.gms.internal.ads.qb4) r2
            int r3 = 4 - r1
            r2.mo33310d(r0, r3, r1, r10)
            com.google.android.gms.internal.ads.uq2 r0 = r7.f20886h
            r0.mo35236f(r10)
            com.google.android.gms.internal.ads.uq2 r0 = r7.f20886h
            long r0 = r0.mo35223A()
            int r1 = (int) r0
            r7.f20900v = r1
            return
        L_0x008f:
            byte[] r2 = new byte[r1]
            r3 = r8
            com.google.android.gms.internal.ads.qb4 r3 = (com.google.android.gms.internal.ads.qb4) r3
            r3.mo33310d(r2, r10, r1, r10)
            r18.m21050t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f20898t
            com.google.android.gms.internal.ads.zc4 r1 = new com.google.android.gms.internal.ads.zc4
            r1.<init>(r9, r2, r10, r10)
            r0.f20785j = r1
            return
        L_0x00a4:
            r18.m21050t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f20898t
            byte[] r2 = new byte[r1]
            r0.f20784i = r2
            r0 = r8
            com.google.android.gms.internal.ads.qb4 r0 = (com.google.android.gms.internal.ads.qb4) r0
            r0.mo33310d(r2, r10, r1, r10)
            return
        L_0x00b4:
            r18.m21050t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f20898t
            int r2 = r0.f20782g
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00d3
            int r2 = r0.f20782g
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00cc
            goto L_0x00d3
        L_0x00cc:
            r0 = r8
            com.google.android.gms.internal.ads.qb4 r0 = (com.google.android.gms.internal.ads.qb4) r0
            r0.mo34305k(r1, r10)
            return
        L_0x00d3:
            byte[] r2 = new byte[r1]
            r0.f20764N = r2
            r0 = r8
            com.google.android.gms.internal.ads.qb4 r0 = (com.google.android.gms.internal.ads.qb4) r0
            r0.mo33310d(r2, r10, r1, r10)
            return
        L_0x00de:
            int r0 = r7.f20857F
            if (r0 == r6) goto L_0x00e3
            return
        L_0x00e3:
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r0 = r7.f20880b
            int r2 = r7.f20863L
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.s r0 = (com.google.android.gms.internal.ads.C4622s) r0
            int r2 = r7.f20866O
            if (r2 != r4) goto L_0x010d
            java.lang.String r0 = r0.f20777b
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.internal.ads.uq2 r0 = r7.f20891m
            r0.mo35233c(r1)
            com.google.android.gms.internal.ads.uq2 r0 = r7.f20891m
            byte[] r0 = r0.mo35238h()
            r2 = r8
            com.google.android.gms.internal.ads.qb4 r2 = (com.google.android.gms.internal.ads.qb4) r2
            r2.mo33310d(r0, r10, r1, r10)
            return
        L_0x010d:
            r0 = r8
            com.google.android.gms.internal.ads.qb4 r0 = (com.google.android.gms.internal.ads.qb4) r0
            r0.mo34305k(r1, r10)
            return
        L_0x0114:
            int r2 = r7.f20857F
            r11 = 8
            if (r2 != 0) goto L_0x0139
            com.google.android.gms.internal.ads.x r2 = r7.f20878a
            long r12 = r2.mo35701d(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.f20863L = r2
            com.google.android.gms.internal.ads.x r2 = r7.f20878a
            int r2 = r2.mo35700a()
            r7.f20864M = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f20859H = r12
            r7.f20857F = r9
            com.google.android.gms.internal.ads.uq2 r2 = r7.f20884f
            r2.mo35233c(r10)
        L_0x0139:
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r2 = r7.f20880b
            int r12 = r7.f20863L
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.s r12 = (com.google.android.gms.internal.ads.C4622s) r12
            if (r12 != 0) goto L_0x0153
            int r0 = r7.f20864M
            r2 = r8
            com.google.android.gms.internal.ads.qb4 r2 = (com.google.android.gms.internal.ads.qb4) r2
            int r0 = r1 - r0
            r2.mo34305k(r0, r10)
            r7.f20857F = r10
            return
        L_0x0153:
            java.util.Objects.requireNonNull(r12.f20774X)
            int r2 = r7.f20857F
            if (r2 != r9) goto L_0x02e5
            r2 = 3
            r7.m21052v(r8, r2)
            com.google.android.gms.internal.ads.uq2 r13 = r7.f20884f
            byte[] r13 = r13.mo35238h()
            byte r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L_0x0180
            r7.f20861J = r9
            int[] r2 = r7.f20862K
            int[] r2 = m21056z(r2, r9)
            r7.f20862K = r2
            int r3 = r7.f20864M
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x0295
        L_0x0180:
            r7.m21052v(r8, r4)
            com.google.android.gms.internal.ads.uq2 r15 = r7.f20884f
            byte[] r15 = r15.mo35238h()
            byte r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.f20861J = r15
            int[] r4 = r7.f20862K
            int[] r4 = m21056z(r4, r15)
            r7.f20862K = r4
            if (r13 != r6) goto L_0x01a6
            int r2 = r7.f20864M
            int r3 = r7.f20861J
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r1 = r1 / r3
            java.util.Arrays.fill(r4, r10, r3, r1)
            goto L_0x0295
        L_0x01a6:
            if (r13 != r9) goto L_0x01de
            r2 = 0
            r3 = 0
            r4 = 4
        L_0x01ab:
            int r13 = r7.f20861J
            int r13 = r13 + -1
            if (r2 >= r13) goto L_0x01d3
            int[] r13 = r7.f20862K
            r13[r2] = r10
        L_0x01b5:
            int r4 = r4 + r9
            r7.m21052v(r8, r4)
            com.google.android.gms.internal.ads.uq2 r13 = r7.f20884f
            byte[] r13 = r13.mo35238h()
            int r15 = r4 + -1
            byte r13 = r13[r15]
            r13 = r13 & r14
            int[] r15 = r7.f20862K
            r16 = r15[r2]
            int r16 = r16 + r13
            r15[r2] = r16
            if (r13 == r14) goto L_0x01b5
            int r3 = r3 + r16
            int r2 = r2 + 1
            goto L_0x01ab
        L_0x01d3:
            int[] r2 = r7.f20862K
            int r15 = r7.f20864M
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L_0x0295
        L_0x01de:
            if (r13 != r2) goto L_0x02de
            r2 = 0
            r4 = 4
            r13 = 0
        L_0x01e3:
            int r15 = r7.f20861J
            int r15 = r15 + -1
            if (r2 >= r15) goto L_0x028c
            int[] r15 = r7.f20862K
            r15[r2] = r10
            int r4 = r4 + 1
            r7.m21052v(r8, r4)
            int r15 = r4 + -1
            com.google.android.gms.internal.ads.uq2 r5 = r7.f20884f
            byte[] r5 = r5.mo35238h()
            byte r5 = r5[r15]
            if (r5 == 0) goto L_0x0285
            r5 = 0
        L_0x01ff:
            if (r5 >= r11) goto L_0x0254
            int r17 = 7 - r5
            int r17 = r9 << r17
            com.google.android.gms.internal.ads.uq2 r6 = r7.f20884f
            byte[] r6 = r6.mo35238h()
            byte r6 = r6[r15]
            r6 = r6 & r17
            if (r6 == 0) goto L_0x024a
            int r4 = r4 + r5
            r7.m21052v(r8, r4)
            int r6 = r15 + 1
            com.google.android.gms.internal.ads.uq2 r9 = r7.f20884f
            byte[] r9 = r9.mo35238h()
            byte r9 = r9[r15]
            r9 = r9 & r14
            r15 = r17 ^ -1
            r9 = r9 & r15
            long r14 = (long) r9
        L_0x0224:
            if (r6 >= r4) goto L_0x023b
            int r9 = r6 + 1
            long r14 = r14 << r11
            com.google.android.gms.internal.ads.uq2 r11 = r7.f20884f
            byte[] r11 = r11.mo35238h()
            byte r6 = r11[r6]
            r11 = 255(0xff, float:3.57E-43)
            r6 = r6 & r11
            long r10 = (long) r6
            long r14 = r14 | r10
            r6 = r9
            r10 = 0
            r11 = 8
            goto L_0x0224
        L_0x023b:
            if (r2 <= 0) goto L_0x0256
            r9 = 1
            int r5 = r5 * 7
            int r5 = r5 + 6
            long r5 = r9 << r5
            r9 = -1
            long r5 = r5 + r9
            long r14 = r14 - r5
            goto L_0x0256
        L_0x024a:
            int r5 = r5 + 1
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01ff
        L_0x0254:
            r14 = 0
        L_0x0256:
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x027e
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x027e
            int r5 = (int) r14
            int[] r6 = r7.f20862K
            if (r2 == 0) goto L_0x026e
            int r9 = r2 + -1
            r9 = r6[r9]
            int r5 = r5 + r9
        L_0x026e:
            r6[r2] = r5
            int r13 = r13 + r5
            int r2 = r2 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01e3
        L_0x027e:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r3)
            throw r0
        L_0x0285:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r3)
            throw r0
        L_0x028c:
            int[] r2 = r7.f20862K
            int r3 = r7.f20864M
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L_0x0295:
            com.google.android.gms.internal.ads.uq2 r1 = r7.f20884f
            byte[] r1 = r1.mo35238h()
            r2 = 0
            byte r1 = r1[r2]
            com.google.android.gms.internal.ads.uq2 r2 = r7.f20884f
            byte[] r2 = r2.mo35238h()
            r3 = 1
            byte r2 = r2[r3]
            long r3 = r7.f20852A
            r5 = 8
            int r1 = r1 << r5
            r5 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.m21048r(r1)
            long r3 = r3 + r1
            r7.f20858G = r3
            int r1 = r12.f20779d
            r2 = 2
            if (r1 == r2) goto L_0x02d5
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02d3
            com.google.android.gms.internal.ads.uq2 r0 = r7.f20884f
            byte[] r0 = r0.mo35238h()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02d1
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02d5
        L_0x02d1:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02d3:
            r1 = 0
            goto L_0x02d6
        L_0x02d5:
            r1 = 1
        L_0x02d6:
            r7.f20865N = r1
            r7.f20857F = r2
            r1 = 0
            r7.f20860I = r1
            goto L_0x02e5
        L_0x02de:
            java.lang.String r0 = "Unexpected lacing value: 2"
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r3)
            throw r0
        L_0x02e5:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0317
        L_0x02e9:
            int r0 = r7.f20860I
            int r1 = r7.f20861J
            if (r0 >= r1) goto L_0x0313
            int[] r1 = r7.f20862K
            r0 = r1[r0]
            int r5 = r7.m21046p(r8, r12, r0)
            long r0 = r7.f20858G
            int r2 = r7.f20860I
            int r3 = r12.f20780e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f20865N
            r6 = 0
            r0 = r18
            r1 = r12
            r0.m21051u(r1, r2, r4, r5, r6)
            int r0 = r7.f20860I
            r1 = 1
            int r0 = r0 + r1
            r7.f20860I = r0
            goto L_0x02e9
        L_0x0313:
            r0 = 0
            r7.f20857F = r0
            return
        L_0x0317:
            int r0 = r7.f20860I
            int r1 = r7.f20861J
            if (r0 >= r1) goto L_0x032e
            int[] r1 = r7.f20862K
            r2 = r1[r0]
            int r2 = r7.m21046p(r8, r12, r2)
            r1[r0] = r2
            int r0 = r7.f20860I
            r1 = 1
            int r0 = r0 + r1
            r7.f20860I = r0
            goto L_0x0317
        L_0x032e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4626u.mo18859g(int, int, com.google.android.gms.internal.ads.wb4):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0252, code lost:
        if (r3.equals("V_AV1") != false) goto L_0x030a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18860h(int r22) throws com.google.android.gms.internal.ads.C7811iy {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.yb4 r1 = r7.f20877Z
            com.google.android.gms.internal.ads.nu1.m20743b(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 2
            if (r0 == r1) goto L_0x0329
            r1 = 174(0xae, float:2.44E-43)
            r3 = -1
            if (r0 == r1) goto L_0x0188
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r5 = -1
            r2 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0170
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x013d
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0127
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x010f
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00f9
            if (r0 == r2) goto L_0x0037
            goto L_0x017f
        L_0x0037:
            boolean r0 = r7.f20899u
            if (r0 != 0) goto L_0x00f3
            com.google.android.gms.internal.ads.yb4 r0 = r7.f20877Z
            com.google.android.gms.internal.ads.gd2 r1 = r7.f20853B
            com.google.android.gms.internal.ads.gd2 r2 = r7.f20854C
            long r12 = r7.f20894p
            r14 = 0
            int r16 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r16 == 0) goto L_0x00e6
            long r5 = r7.f20897s
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00e6
            if (r1 == 0) goto L_0x00e6
            int r5 = r1.mo32066a()
            if (r5 == 0) goto L_0x00e6
            if (r2 == 0) goto L_0x00e6
            int r5 = r2.mo32066a()
            int r6 = r1.mo32066a()
            if (r5 == r6) goto L_0x0065
            goto L_0x00e6
        L_0x0065:
            int r5 = r1.mo32066a()
            int[] r6 = new int[r5]
            long[] r10 = new long[r5]
            long[] r11 = new long[r5]
            long[] r12 = new long[r5]
            r13 = 0
        L_0x0072:
            if (r13 >= r5) goto L_0x0087
            long r16 = r1.mo32067b(r13)
            r12[r13] = r16
            long r8 = r7.f20894p
            long r18 = r2.mo32067b(r13)
            long r8 = r8 + r18
            r10[r13] = r8
            int r13 = r13 + 1
            goto L_0x0072
        L_0x0087:
            r9 = 0
        L_0x0088:
            int r1 = r5 + -1
            if (r9 >= r1) goto L_0x00a2
            int r1 = r9 + 1
            r17 = r10[r1]
            r19 = r10[r9]
            long r3 = r17 - r19
            int r2 = (int) r3
            r6[r9] = r2
            r2 = r12[r1]
            r17 = r12[r9]
            long r2 = r2 - r17
            r11[r9] = r2
            r9 = r1
            r3 = -1
            goto L_0x0088
        L_0x00a2:
            long r2 = r7.f20894p
            long r4 = r7.f20893o
            long r2 = r2 + r4
            r4 = r10[r1]
            long r2 = r2 - r4
            int r3 = (int) r2
            r6[r1] = r3
            long r2 = r7.f20897s
            r4 = r12[r1]
            long r2 = r2 - r4
            r11[r1] = r2
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x00e0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 72
            r4.<init>(r5)
            java.lang.String r5 = "Discarding last cue point with unexpected duration: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "MatroskaExtractor"
            android.util.Log.w(r3, r2)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r10 = java.util.Arrays.copyOf(r10, r1)
            long[] r11 = java.util.Arrays.copyOf(r11, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
        L_0x00e0:
            com.google.android.gms.internal.ads.ob4 r1 = new com.google.android.gms.internal.ads.ob4
            r1.<init>(r6, r10, r11, r12)
            goto L_0x00ed
        L_0x00e6:
            com.google.android.gms.internal.ads.vc4 r1 = new com.google.android.gms.internal.ads.vc4
            long r2 = r7.f20897s
            r1.<init>(r2, r14)
        L_0x00ed:
            r0.mo18210l(r1)
            r0 = 1
            r7.f20899u = r0
        L_0x00f3:
            r0 = 0
            r7.f20853B = r0
            r7.f20854C = r0
            return
        L_0x00f9:
            r0 = 0
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r1 = r7.f20880b
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0108
            com.google.android.gms.internal.ads.yb4 r0 = r7.f20877Z
            r0.zzB()
            return
        L_0x0108:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r0)
            throw r0
        L_0x010f:
            long r0 = r7.f20895q
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x011a
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.f20895q = r0
        L_0x011a:
            long r0 = r7.f20896r
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x017f
            long r0 = r7.m21048r(r0)
            r7.f20897s = r0
            return
        L_0x0127:
            r21.m21050t(r22)
            com.google.android.gms.internal.ads.s r0 = r7.f20898t
            boolean r1 = r0.f20783h
            if (r1 == 0) goto L_0x017f
            byte[] r0 = r0.f20784i
            if (r0 != 0) goto L_0x0135
            goto L_0x017f
        L_0x0135:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r1)
            throw r0
        L_0x013d:
            r21.m21050t(r22)
            com.google.android.gms.internal.ads.s r0 = r7.f20898t
            boolean r1 = r0.f20783h
            if (r1 == 0) goto L_0x017f
            com.google.android.gms.internal.ads.zc4 r1 = r0.f20785j
            if (r1 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.zzs r1 = new com.google.android.gms.internal.ads.zzs
            r2 = 1
            com.google.android.gms.internal.ads.zzr[] r2 = new com.google.android.gms.internal.ads.zzr[r2]
            com.google.android.gms.internal.ads.zzr r3 = new com.google.android.gms.internal.ads.zzr
            java.util.UUID r4 = com.google.android.gms.internal.ads.xy3.f41582a
            com.google.android.gms.internal.ads.s r5 = r7.f20898t
            com.google.android.gms.internal.ads.zc4 r5 = r5.f20785j
            byte[] r5 = r5.f42425b
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.f20787l = r1
            return
        L_0x0168:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r8)
            throw r0
        L_0x0170:
            int r0 = r7.f20900v
            r1 = -1
            if (r0 == r1) goto L_0x0180
            long r3 = r7.f20901w
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0180
            if (r0 != r2) goto L_0x017f
            r7.f20903y = r3
        L_0x017f:
            return
        L_0x0180:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r1)
            throw r0
        L_0x0188:
            r1 = -1
            com.google.android.gms.internal.ads.s r0 = r7.f20898t
            com.google.android.gms.internal.ads.nu1.m20743b(r0)
            java.lang.String r3 = r0.f20777b
            if (r3 == 0) goto L_0x0321
            int r4 = r3.hashCode()
            switch(r4) {
                case -2095576542: goto L_0x02ff;
                case -2095575984: goto L_0x02f5;
                case -1985379776: goto L_0x02ea;
                case -1784763192: goto L_0x02df;
                case -1730367663: goto L_0x02d4;
                case -1482641358: goto L_0x02c9;
                case -1482641357: goto L_0x02be;
                case -1373388978: goto L_0x02b3;
                case -933872740: goto L_0x02a8;
                case -538363189: goto L_0x029d;
                case -538363109: goto L_0x0292;
                case -425012669: goto L_0x0286;
                case -356037306: goto L_0x027a;
                case 62923557: goto L_0x026e;
                case 62923603: goto L_0x0262;
                case 62927045: goto L_0x0256;
                case 82318131: goto L_0x024c;
                case 82338133: goto L_0x0241;
                case 82338134: goto L_0x0236;
                case 99146302: goto L_0x022a;
                case 444813526: goto L_0x021e;
                case 542569478: goto L_0x0212;
                case 635596514: goto L_0x0206;
                case 725948237: goto L_0x01fa;
                case 725957860: goto L_0x01ee;
                case 738597099: goto L_0x01e2;
                case 855502857: goto L_0x01d6;
                case 1422270023: goto L_0x01ca;
                case 1809237540: goto L_0x01bf;
                case 1950749482: goto L_0x01b3;
                case 1950789798: goto L_0x01a7;
                case 1951062397: goto L_0x019b;
                default: goto L_0x0199;
            }
        L_0x0199:
            goto L_0x0309
        L_0x019b:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 11
            goto L_0x030a
        L_0x01a7:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 22
            goto L_0x030a
        L_0x01b3:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 17
            goto L_0x030a
        L_0x01bf:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 3
            goto L_0x030a
        L_0x01ca:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 27
            goto L_0x030a
        L_0x01d6:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 8
            goto L_0x030a
        L_0x01e2:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 28
            goto L_0x030a
        L_0x01ee:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 24
            goto L_0x030a
        L_0x01fa:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 25
            goto L_0x030a
        L_0x0206:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 26
            goto L_0x030a
        L_0x0212:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 20
            goto L_0x030a
        L_0x021e:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 10
            goto L_0x030a
        L_0x022a:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 30
            goto L_0x030a
        L_0x0236:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 1
            goto L_0x030a
        L_0x0241:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 0
            goto L_0x030a
        L_0x024c:
            java.lang.String r4 = "V_AV1"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0309
            goto L_0x030a
        L_0x0256:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 19
            goto L_0x030a
        L_0x0262:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 16
            goto L_0x030a
        L_0x026e:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 13
            goto L_0x030a
        L_0x027a:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 21
            goto L_0x030a
        L_0x0286:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 29
            goto L_0x030a
        L_0x0292:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 7
            goto L_0x030a
        L_0x029d:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 5
            goto L_0x030a
        L_0x02a8:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 31
            goto L_0x030a
        L_0x02b3:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 9
            goto L_0x030a
        L_0x02be:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 15
            goto L_0x030a
        L_0x02c9:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 14
            goto L_0x030a
        L_0x02d4:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 12
            goto L_0x030a
        L_0x02df:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 18
            goto L_0x030a
        L_0x02ea:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 23
            goto L_0x030a
        L_0x02f5:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 4
            goto L_0x030a
        L_0x02ff:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 6
            goto L_0x030a
        L_0x0309:
            r2 = -1
        L_0x030a:
            switch(r2) {
                case 0: goto L_0x030f;
                case 1: goto L_0x030f;
                case 2: goto L_0x030f;
                case 3: goto L_0x030f;
                case 4: goto L_0x030f;
                case 5: goto L_0x030f;
                case 6: goto L_0x030f;
                case 7: goto L_0x030f;
                case 8: goto L_0x030f;
                case 9: goto L_0x030f;
                case 10: goto L_0x030f;
                case 11: goto L_0x030f;
                case 12: goto L_0x030f;
                case 13: goto L_0x030f;
                case 14: goto L_0x030f;
                case 15: goto L_0x030f;
                case 16: goto L_0x030f;
                case 17: goto L_0x030f;
                case 18: goto L_0x030f;
                case 19: goto L_0x030f;
                case 20: goto L_0x030f;
                case 21: goto L_0x030f;
                case 22: goto L_0x030f;
                case 23: goto L_0x030f;
                case 24: goto L_0x030f;
                case 25: goto L_0x030f;
                case 26: goto L_0x030f;
                case 27: goto L_0x030f;
                case 28: goto L_0x030f;
                case 29: goto L_0x030f;
                case 30: goto L_0x030f;
                case 31: goto L_0x030f;
                default: goto L_0x030d;
            }
        L_0x030d:
            r0 = 0
            goto L_0x031e
        L_0x030f:
            com.google.android.gms.internal.ads.yb4 r1 = r7.f20877Z
            int r2 = r0.f20778c
            r0.mo18821e(r1, r2)
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r1 = r7.f20880b
            int r2 = r0.f20778c
            r1.put(r2, r0)
            goto L_0x030d
        L_0x031e:
            r7.f20898t = r0
            return
        L_0x0321:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r0)
            throw r0
        L_0x0329:
            int r0 = r7.f20857F
            if (r0 != r2) goto L_0x037e
            r0 = 0
            r4 = 0
        L_0x032f:
            int r1 = r7.f20861J
            if (r4 >= r1) goto L_0x033b
            int[] r1 = r7.f20862K
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x032f
        L_0x033b:
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r1 = r7.f20880b
            int r2 = r7.f20863L
            java.lang.Object r1 = r1.get(r2)
            r8 = r1
            com.google.android.gms.internal.ads.s r8 = (com.google.android.gms.internal.ads.C4622s) r8
            java.util.Objects.requireNonNull(r8.f20774X)
            r4 = 0
        L_0x034a:
            int r1 = r7.f20861J
            if (r4 >= r1) goto L_0x037b
            long r1 = r7.f20858G
            int r3 = r8.f20780e
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r5 = r5 + r1
            int r1 = r7.f20865N
            if (r4 != 0) goto L_0x0365
            boolean r2 = r7.f20867P
            if (r2 != 0) goto L_0x0362
            r1 = r1 | 1
        L_0x0362:
            r4 = r1
            r9 = 0
            goto L_0x0367
        L_0x0365:
            r9 = r4
            r4 = r1
        L_0x0367:
            int[] r1 = r7.f20862K
            r10 = r1[r9]
            int r11 = r0 - r10
            r0 = r21
            r1 = r8
            r2 = r5
            r5 = r10
            r6 = r11
            r0.m21051u(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r11
            goto L_0x034a
        L_0x037b:
            r1 = 0
            r7.f20857F = r1
        L_0x037e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4626u.mo18860h(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18861i(int i, double d) throws C7811iy {
        if (i == 181) {
            m21050t(i);
            this.f20898t.f20767Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m21050t(i);
                    this.f20898t.f20754D = (float) d;
                    return;
                case 21970:
                    m21050t(i);
                    this.f20898t.f20755E = (float) d;
                    return;
                case 21971:
                    m21050t(i);
                    this.f20898t.f20756F = (float) d;
                    return;
                case 21972:
                    m21050t(i);
                    this.f20898t.f20757G = (float) d;
                    return;
                case 21973:
                    m21050t(i);
                    this.f20898t.f20758H = (float) d;
                    return;
                case 21974:
                    m21050t(i);
                    this.f20898t.f20759I = (float) d;
                    return;
                case 21975:
                    m21050t(i);
                    this.f20898t.f20760J = (float) d;
                    return;
                case 21976:
                    m21050t(i);
                    this.f20898t.f20761K = (float) d;
                    return;
                case 21977:
                    m21050t(i);
                    this.f20898t.f20762L = (float) d;
                    return;
                case 21978:
                    m21050t(i);
                    this.f20898t.f20763M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m21050t(i);
                            this.f20898t.f20794s = (float) d;
                            return;
                        case 30324:
                            m21050t(i);
                            this.f20898t.f20795t = (float) d;
                            return;
                        case 30325:
                            m21050t(i);
                            this.f20898t.f20796u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f20896r = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18862j(int i, long j) throws C7811iy {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m21050t(i);
                        this.f20898t.f20779d = (int) j;
                        return;
                    case 136:
                        m21050t(i);
                        C4622s sVar = this.f20898t;
                        if (j == 1) {
                            z = true;
                        }
                        sVar.f20772V = z;
                        return;
                    case 155:
                        this.f20859H = m21048r(j);
                        return;
                    case 159:
                        m21050t(i);
                        this.f20898t.f20765O = (int) j;
                        return;
                    case 176:
                        m21050t(i);
                        this.f20898t.f20788m = (int) j;
                        return;
                    case 179:
                        m21049s(i);
                        this.f20853B.mo32068c(m21048r(j));
                        return;
                    case 186:
                        m21050t(i);
                        this.f20898t.f20789n = (int) j;
                        return;
                    case 215:
                        m21050t(i);
                        this.f20898t.f20778c = (int) j;
                        return;
                    case 231:
                        this.f20852A = m21048r(j);
                        return;
                    case 238:
                        this.f20866O = (int) j;
                        return;
                    case 241:
                        if (!this.f20855D) {
                            m21049s(i);
                            this.f20854C.mo32068c(j);
                            this.f20855D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f20867P = true;
                        return;
                    case 16871:
                        m21050t(i);
                        this.f20898t.f20782g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw C7811iy.m33482a(sb.toString(), (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw C7811iy.m33482a(sb2.toString(), (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw C7811iy.m33482a(sb3.toString(), (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw C7811iy.m33482a(sb4.toString(), (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw C7811iy.m33482a(sb5.toString(), (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f20901w = j + this.f20894p;
                        return;
                    case 21432:
                        m21050t(i);
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f20898t.f20798w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f20898t.f20798w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f20898t.f20798w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f20898t.f20798w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m21050t(i);
                        this.f20898t.f20790o = (int) j;
                        return;
                    case 21682:
                        m21050t(i);
                        this.f20898t.f20792q = (int) j;
                        return;
                    case 21690:
                        m21050t(i);
                        this.f20898t.f20791p = (int) j;
                        return;
                    case 21930:
                        m21050t(i);
                        C4622s sVar2 = this.f20898t;
                        if (j == 1) {
                            z = true;
                        }
                        sVar2.f20771U = z;
                        return;
                    case 21998:
                        m21050t(i);
                        this.f20898t.f20781f = (int) j;
                        return;
                    case 22186:
                        m21050t(i);
                        this.f20898t.f20768R = j;
                        return;
                    case 22203:
                        m21050t(i);
                        this.f20898t.f20769S = j;
                        return;
                    case 25188:
                        m21050t(i);
                        this.f20898t.f20766P = (int) j;
                        return;
                    case 30321:
                        m21050t(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f20898t.f20793r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f20898t.f20793r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f20898t.f20793r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f20898t.f20793r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m21050t(i);
                        this.f20898t.f20780e = (int) j;
                        return;
                    case 2807729:
                        this.f20895q = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m21050t(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f20898t.f20751A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f20898t.f20751A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m21050t(i);
                                int b = z04.m21253b((int) j);
                                if (b != -1) {
                                    this.f20898t.f20801z = b;
                                    return;
                                }
                                return;
                            case 21947:
                                m21050t(i);
                                this.f20898t.f20799x = true;
                                int a = z04.m21252a((int) j);
                                if (a != -1) {
                                    this.f20898t.f20800y = a;
                                    return;
                                }
                                return;
                            case 21948:
                                m21050t(i);
                                this.f20898t.f20752B = (int) j;
                                return;
                            case 21949:
                                m21050t(i);
                                this.f20898t.f20753C = (int) j;
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
                throw C7811iy.m33482a(sb6.toString(), (Throwable) null);
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw C7811iy.m33482a(sb7.toString(), (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo18863k(int i, long j, long j2) throws C7811iy {
        nu1.m20743b(this.f20877Z);
        if (i == 160) {
            this.f20867P = false;
        } else if (i == 174) {
            this.f20898t = new C4622s((C8104r) null);
        } else if (i == 187) {
            this.f20855D = false;
        } else if (i == 19899) {
            this.f20900v = -1;
            this.f20901w = -1;
        } else if (i == 20533) {
            m21050t(i);
            this.f20898t.f20783h = true;
        } else if (i == 21968) {
            m21050t(i);
            this.f20898t.f20799x = true;
        } else if (i == 408125543) {
            long j3 = this.f20894p;
            if (j3 == -1 || j3 == j) {
                this.f20894p = j;
                this.f20893o = j2;
                return;
            }
            throw C7811iy.m33482a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.f20853B = new gd2(32);
            this.f20854C = new gd2(32);
        } else if (i != 524531317 || this.f20899u) {
        } else {
            if (!this.f20881c || this.f20903y == -1) {
                this.f20877Z.mo18210l(new vc4(this.f20897s, 0));
                this.f20899u = true;
                return;
            }
            this.f20902x = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo18864l(int i, String str) throws C7811iy {
        if (i == 134) {
            m21050t(i);
            this.f20898t.f20777b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m21050t(i);
                this.f20898t.f20776a = str;
            } else if (i == 2274716) {
                m21050t(i);
                this.f20898t.f20773W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw C7811iy.m33482a(sb.toString(), (Throwable) null);
        }
    }
}
