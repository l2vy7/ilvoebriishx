package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.startapp.C12425x3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.lh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7904lh implements C8155sg {

    /* renamed from: Z */
    public static final C8226ug f35031Z = new C7683fh();

    /* renamed from: a0 */
    private static final byte[] f35032a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: b0 */
    private static final byte[] f35033b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static final UUID f35034c0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private C8302wl f35035A;

    /* renamed from: B */
    private C8302wl f35036B;

    /* renamed from: C */
    private boolean f35037C;

    /* renamed from: D */
    private int f35038D;

    /* renamed from: E */
    private long f35039E;

    /* renamed from: F */
    private long f35040F;

    /* renamed from: G */
    private int f35041G;

    /* renamed from: H */
    private int f35042H;

    /* renamed from: I */
    private int[] f35043I;

    /* renamed from: J */
    private int f35044J;

    /* renamed from: K */
    private int f35045K;

    /* renamed from: L */
    private int f35046L;

    /* renamed from: M */
    private int f35047M;

    /* renamed from: N */
    private boolean f35048N;

    /* renamed from: O */
    private boolean f35049O;

    /* renamed from: P */
    private boolean f35050P;

    /* renamed from: Q */
    private boolean f35051Q;

    /* renamed from: R */
    private byte f35052R;

    /* renamed from: S */
    private int f35053S;

    /* renamed from: T */
    private int f35054T;

    /* renamed from: U */
    private int f35055U;

    /* renamed from: V */
    private boolean f35056V;

    /* renamed from: W */
    private boolean f35057W;

    /* renamed from: X */
    private C8190tg f35058X;

    /* renamed from: Y */
    private final C7646eh f35059Y;

    /* renamed from: a */
    private final C7979nh f35060a;

    /* renamed from: b */
    private final SparseArray<C7867kh> f35061b;

    /* renamed from: c */
    private final boolean f35062c;

    /* renamed from: d */
    private final C7544bm f35063d;

    /* renamed from: e */
    private final C7544bm f35064e;

    /* renamed from: f */
    private final C7544bm f35065f;

    /* renamed from: g */
    private final C7544bm f35066g;

    /* renamed from: h */
    private final C7544bm f35067h;

    /* renamed from: i */
    private final C7544bm f35068i;

    /* renamed from: j */
    private final C7544bm f35069j;

    /* renamed from: k */
    private final C7544bm f35070k;

    /* renamed from: l */
    private final C7544bm f35071l;

    /* renamed from: m */
    private ByteBuffer f35072m;

    /* renamed from: n */
    private long f35073n;

    /* renamed from: o */
    private long f35074o = -1;

    /* renamed from: p */
    private long f35075p = C6540C.TIME_UNSET;

    /* renamed from: q */
    private long f35076q = C6540C.TIME_UNSET;

    /* renamed from: r */
    private long f35077r = C6540C.TIME_UNSET;

    /* renamed from: s */
    private C7867kh f35078s;

    /* renamed from: t */
    private boolean f35079t;

    /* renamed from: u */
    private int f35080u;

    /* renamed from: v */
    private long f35081v;

    /* renamed from: w */
    private boolean f35082w;

    /* renamed from: x */
    private long f35083x = -1;

    /* renamed from: y */
    private long f35084y = -1;

    /* renamed from: z */
    private long f35085z = C6540C.TIME_UNSET;

    public C7904lh(int i) {
        C7646eh ehVar = new C7646eh();
        this.f35059Y = ehVar;
        ehVar.mo31575b(new C7757hh(this, (C7720gh) null));
        this.f35062c = true;
        this.f35060a = new C7979nh();
        this.f35061b = new SparseArray<>();
        this.f35065f = new C7544bm(4);
        this.f35066g = new C7544bm(ByteBuffer.allocate(4).putInt(-1).array());
        this.f35067h = new C7544bm(4);
        this.f35063d = new C7544bm(C8410zl.f42494a);
        this.f35064e = new C7544bm(4);
        this.f35068i = new C7544bm();
        this.f35069j = new C7544bm();
        this.f35070k = new C7544bm(8);
        this.f35071l = new C7544bm();
    }

    /* renamed from: l */
    static final int m34447l(int i) {
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
            case 241:
            case 251:
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
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    static final boolean m34448m(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: n */
    private final long m34449n(long j) throws C8153se {
        long j2 = this.f35075p;
        if (j2 != C6540C.TIME_UNSET) {
            return C7836jm.m33648j(j, j2, 1000);
        }
        throw new C8153se("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: o */
    private final void m34450o(C7867kh khVar, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(khVar.f34307a)) {
            byte[] bArr2 = this.f35069j.f30037a;
            long j2 = this.f35040F;
            if (j2 == C6540C.TIME_UNSET) {
                bArr = f35033b0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = C7836jm.m33655q(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (i3 * 1000000))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C7539bh bhVar = khVar.f34305O;
            C7544bm bmVar = this.f35069j;
            bhVar.mo30673b(bmVar, bmVar.mo30707d());
            this.f35055U += this.f35069j.mo30707d();
        }
        khVar.f34305O.mo30674c(j, this.f35046L, this.f35055U, 0, khVar.f34313g);
        this.f35056V = true;
        m34451p();
    }

    /* renamed from: p */
    private final void m34451p() {
        this.f35047M = 0;
        this.f35055U = 0;
        this.f35054T = 0;
        this.f35048N = false;
        this.f35049O = false;
        this.f35051Q = false;
        this.f35053S = 0;
        this.f35052R = 0;
        this.f35050P = false;
        this.f35068i.mo30721r();
    }

    /* renamed from: q */
    private static int[] m34452q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: r */
    private final int m34453r(C8121rg rgVar, C7539bh bhVar, int i) throws IOException, InterruptedException {
        int i2;
        int a = this.f35068i.mo30704a();
        if (a > 0) {
            i2 = Math.min(i, a);
            bhVar.mo30673b(this.f35068i, i2);
        } else {
            i2 = bhVar.mo30675d(rgVar, i, false);
        }
        this.f35047M += i2;
        this.f35055U += i2;
        return i2;
    }

    /* renamed from: s */
    private final void m34454s(C8121rg rgVar, int i) throws IOException, InterruptedException {
        if (this.f35065f.mo30707d() < i) {
            if (this.f35065f.mo30705b() < i) {
                C7544bm bmVar = this.f35065f;
                byte[] bArr = bmVar.f30037a;
                int length = bArr.length;
                bmVar.mo30723t(Arrays.copyOf(bArr, Math.max(length + length, i)), this.f35065f.mo30707d());
            }
            C7544bm bmVar2 = this.f35065f;
            rgVar.mo34538h(bmVar2.f30037a, bmVar2.mo30707d(), i - this.f35065f.mo30707d(), false);
            this.f35065f.mo30724u(i);
        }
    }

    /* renamed from: t */
    private final void m34455t(C8121rg rgVar, C7867kh khVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(khVar.f34307a)) {
            int i3 = i + 32;
            if (this.f35069j.mo30705b() < i3) {
                this.f35069j.f30037a = Arrays.copyOf(f35032a0, i3 + i);
            }
            rgVar.mo34538h(this.f35069j.f30037a, 32, i, false);
            this.f35069j.mo30725v(0);
            this.f35069j.mo30724u(i3);
            return;
        }
        C7539bh bhVar = khVar.f34305O;
        if (!this.f35048N) {
            if (khVar.f34311e) {
                this.f35046L &= -1073741825;
                int i4 = 128;
                if (!this.f35049O) {
                    rgVar.mo34538h(this.f35065f.f30037a, 0, 1, false);
                    this.f35047M++;
                    byte b = this.f35065f.f30037a[0];
                    if ((b & C12425x3.f55111d) != 128) {
                        this.f35052R = b;
                        this.f35049O = true;
                    } else {
                        throw new C8153se("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.f35052R;
                if ((b2 & 1) == 1) {
                    byte b3 = b2 & 2;
                    this.f35046L |= 1073741824;
                    if (!this.f35050P) {
                        rgVar.mo34538h(this.f35070k.f30037a, 0, 8, false);
                        this.f35047M += 8;
                        this.f35050P = true;
                        C7544bm bmVar = this.f35065f;
                        byte[] bArr = bmVar.f30037a;
                        if (b3 != 2) {
                            i4 = 0;
                        }
                        bArr[0] = (byte) (i4 | 8);
                        bmVar.mo30725v(0);
                        bhVar.mo30673b(this.f35065f, 1);
                        this.f35055U++;
                        this.f35070k.mo30725v(0);
                        bhVar.mo30673b(this.f35070k, 8);
                        this.f35055U += 8;
                    }
                    if (b3 == 2) {
                        if (!this.f35051Q) {
                            rgVar.mo34538h(this.f35065f.f30037a, 0, 1, false);
                            this.f35047M++;
                            this.f35065f.mo30725v(0);
                            this.f35053S = this.f35065f.mo30710g();
                            this.f35051Q = true;
                        }
                        int i5 = this.f35053S * 4;
                        this.f35065f.mo30722s(i5);
                        rgVar.mo34538h(this.f35065f.f30037a, 0, i5, false);
                        this.f35047M += i5;
                        int i6 = (this.f35053S >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.f35072m;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f35072m = ByteBuffer.allocate(i7);
                        }
                        this.f35072m.position(0);
                        this.f35072m.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f35053S;
                            if (i8 >= i2) {
                                break;
                            }
                            int i10 = this.f35065f.mo30712i();
                            if (i8 % 2 == 0) {
                                this.f35072m.putShort((short) (i10 - i9));
                            } else {
                                this.f35072m.putInt(i10 - i9);
                            }
                            i8++;
                            i9 = i10;
                        }
                        int i11 = (i - this.f35047M) - i9;
                        if ((i2 & 1) == 1) {
                            this.f35072m.putInt(i11);
                        } else {
                            this.f35072m.putShort((short) i11);
                            this.f35072m.putInt(0);
                        }
                        this.f35071l.mo30723t(this.f35072m.array(), i7);
                        bhVar.mo30673b(this.f35071l, i7);
                        this.f35055U += i7;
                    }
                }
            } else {
                byte[] bArr2 = khVar.f34312f;
                if (bArr2 != null) {
                    this.f35068i.mo30723t(bArr2, bArr2.length);
                }
            }
            this.f35048N = true;
        }
        int d = i + this.f35068i.mo30707d();
        if (!"V_MPEG4/ISO/AVC".equals(khVar.f34307a) && !"V_MPEGH/ISO/HEVC".equals(khVar.f34307a)) {
            while (true) {
                int i12 = this.f35047M;
                if (i12 >= d) {
                    break;
                }
                m34453r(rgVar, bhVar, d - i12);
            }
        } else {
            byte[] bArr3 = this.f35064e.f30037a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = khVar.f34306P;
            int i14 = 4 - i13;
            while (this.f35047M < d) {
                int i15 = this.f35054T;
                if (i15 == 0) {
                    int min = Math.min(i13, this.f35068i.mo30704a());
                    rgVar.mo34538h(bArr3, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.f35068i.mo30720q(bArr3, i14, min);
                    }
                    this.f35047M += i13;
                    this.f35064e.mo30725v(0);
                    this.f35054T = this.f35064e.mo30712i();
                    this.f35063d.mo30725v(0);
                    bhVar.mo30673b(this.f35063d, 4);
                    this.f35055U += 4;
                } else {
                    this.f35054T = i15 - m34453r(rgVar, bhVar, i15);
                }
            }
        }
        if ("A_VORBIS".equals(khVar.f34307a)) {
            this.f35066g.mo30725v(0);
            bhVar.mo30673b(this.f35066g, 4);
            this.f35055U += 4;
        }
    }

    /* renamed from: b */
    public final boolean mo30928b(C8121rg rgVar) throws IOException, InterruptedException {
        return new C7941mh().mo33542a(rgVar);
    }

    /* renamed from: c */
    public final void mo30929c(C8190tg tgVar) {
        this.f35058X = tgVar;
    }

    /* renamed from: d */
    public final void mo30930d(long j, long j2) {
        this.f35085z = C6540C.TIME_UNSET;
        this.f35038D = 0;
        this.f35059Y.mo31574a();
        this.f35060a.mo33699d();
        m34451p();
    }

    /* renamed from: e */
    public final int mo30931e(C8121rg rgVar, C8333xg xgVar) throws IOException, InterruptedException {
        this.f35056V = false;
        while (!this.f35056V) {
            if (!this.f35059Y.mo31576c(rgVar)) {
                return -1;
            }
            long d = rgVar.mo34534d();
            if (this.f35082w) {
                this.f35084y = d;
                xgVar.f41156a = this.f35083x;
                this.f35082w = false;
                return 1;
            } else if (this.f35079t) {
                long j = this.f35084y;
                if (j != -1) {
                    xgVar.f41156a = j;
                    this.f35084y = -1;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo33329f(int i) throws C8153se {
        C8405zg zgVar;
        C8302wl wlVar;
        C8302wl wlVar2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.f35078s.f34307a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    C7867kh khVar = this.f35078s;
                    khVar.mo33086b(this.f35058X, khVar.f34308b);
                    SparseArray<C7867kh> sparseArray = this.f35061b;
                    C7867kh khVar2 = this.f35078s;
                    sparseArray.put(khVar2.f34308b, khVar2);
                }
                this.f35078s = null;
            } else if (i == 19899) {
                int i4 = this.f35080u;
                if (i4 != -1) {
                    long j = this.f35081v;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.f35083x = j;
                            return;
                        }
                        return;
                    }
                }
                throw new C8153se("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                C7867kh khVar3 = this.f35078s;
                if (!khVar3.f34311e) {
                    return;
                }
                if (khVar3.f34313g != null) {
                    khVar3.f34315i = new zzarf(new zzare(C7500ae.f29613b, MimeTypes.VIDEO_WEBM, this.f35078s.f34313g.f29639b, false));
                    return;
                }
                throw new C8153se("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                C7867kh khVar4 = this.f35078s;
                if (khVar4.f34311e && khVar4.f34312f != null) {
                    throw new C8153se("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f35075p == C6540C.TIME_UNSET) {
                    this.f35075p = 1000000;
                }
                long j2 = this.f35076q;
                if (j2 != C6540C.TIME_UNSET) {
                    this.f35077r = m34449n(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f35079t) {
                    C8190tg tgVar = this.f35058X;
                    if (this.f35074o == -1 || this.f35077r == C6540C.TIME_UNSET || (wlVar = this.f35035A) == null || wlVar.mo35644a() == 0 || (wlVar2 = this.f35036B) == null || wlVar2.mo35644a() != this.f35035A.mo35644a()) {
                        this.f35035A = null;
                        this.f35036B = null;
                        zgVar = new C8369yg(this.f35077r);
                    } else {
                        int a = this.f35035A.mo35644a();
                        int[] iArr = new int[a];
                        long[] jArr = new long[a];
                        long[] jArr2 = new long[a];
                        long[] jArr3 = new long[a];
                        for (int i5 = 0; i5 < a; i5++) {
                            jArr3[i5] = this.f35035A.mo35645b(i5);
                            jArr[i5] = this.f35074o + this.f35036B.mo35645b(i5);
                        }
                        while (true) {
                            i2 = a - 1;
                            if (i3 >= i2) {
                                break;
                            }
                            int i6 = i3 + 1;
                            iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                            jArr2[i3] = jArr3[i6] - jArr3[i3];
                            i3 = i6;
                        }
                        iArr[i2] = (int) ((this.f35074o + this.f35073n) - jArr[i2]);
                        jArr2[i2] = this.f35077r - jArr3[i2];
                        this.f35035A = null;
                        this.f35036B = null;
                        zgVar = new C8085qg(iArr, jArr, jArr2, jArr3);
                    }
                    tgVar.mo33909g(zgVar);
                    this.f35079t = true;
                }
            } else if (this.f35061b.size() != 0) {
                this.f35058X.zzb();
            } else {
                throw new C8153se("No valid tracks were found");
            }
        } else if (this.f35038D == 2) {
            if (!this.f35057W) {
                this.f35046L |= 1;
            }
            m34450o(this.f35061b.get(this.f35044J), this.f35039E);
            this.f35038D = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo33330g(int i, double d) {
        if (i == 181) {
            this.f35078s.f34299I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f35078s.f34329w = (float) d;
                    return;
                case 21970:
                    this.f35078s.f34330x = (float) d;
                    return;
                case 21971:
                    this.f35078s.f34331y = (float) d;
                    return;
                case 21972:
                    this.f35078s.f34332z = (float) d;
                    return;
                case 21973:
                    this.f35078s.f34291A = (float) d;
                    return;
                case 21974:
                    this.f35078s.f34292B = (float) d;
                    return;
                case 21975:
                    this.f35078s.f34293C = (float) d;
                    return;
                case 21976:
                    this.f35078s.f34294D = (float) d;
                    return;
                case 21977:
                    this.f35078s.f34295E = (float) d;
                    return;
                case 21978:
                    this.f35078s.f34296F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f35076q = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo33331h(int i, long j) throws C8153se {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f35078s.f34309c = (int) j;
                        return;
                    case 136:
                        C7867kh khVar = this.f35078s;
                        if (j == 1) {
                            z = true;
                        }
                        khVar.f34302L = z;
                        return;
                    case 155:
                        this.f35040F = m34449n(j);
                        return;
                    case 159:
                        this.f35078s.f34297G = (int) j;
                        return;
                    case 176:
                        this.f35078s.f34316j = (int) j;
                        return;
                    case 179:
                        this.f35035A.mo35646c(m34449n(j));
                        return;
                    case 186:
                        this.f35078s.f34317k = (int) j;
                        return;
                    case 215:
                        this.f35078s.f34308b = (int) j;
                        return;
                    case 231:
                        this.f35085z = m34449n(j);
                        return;
                    case 241:
                        if (!this.f35037C) {
                            this.f35036B.mo35646c(j);
                            this.f35037C = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f35057W = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new C8153se(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new C8153se(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new C8153se(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new C8153se(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new C8153se(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.f35081v = j + this.f35074o;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f35078s.f34322p = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f35078s.f34322p = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f35078s.f34322p = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f35078s.f34322p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f35078s.f34318l = (int) j;
                        return;
                    case 21682:
                        this.f35078s.f34320n = (int) j;
                        return;
                    case 21690:
                        this.f35078s.f34319m = (int) j;
                        return;
                    case 21930:
                        C7867kh khVar2 = this.f35078s;
                        if (j == 1) {
                            z = true;
                        }
                        khVar2.f34303M = z;
                        return;
                    case 22186:
                        this.f35078s.f34300J = j;
                        return;
                    case 22203:
                        this.f35078s.f34301K = j;
                        return;
                    case 25188:
                        this.f35078s.f34298H = (int) j;
                        return;
                    case 2352003:
                        this.f35078s.f34310d = (int) j;
                        return;
                    case 2807729:
                        this.f35075p = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.f35078s.f34326t = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.f35078s.f34326t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.f35078s.f34325s = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.f35078s.f34325s = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.f35078s.f34325s = 3;
                                return;
                            case 21947:
                                C7867kh khVar3 = this.f35078s;
                                khVar3.f34323q = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    khVar3.f34324r = 1;
                                    return;
                                } else if (i5 == 9) {
                                    khVar3.f34324r = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    khVar3.f34324r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f35078s.f34327u = (int) j;
                                return;
                            case 21949:
                                this.f35078s.f34328v = (int) j;
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
                throw new C8153se(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new C8153se(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo33332i(int i, long j, long j2) throws C8153se {
        if (i == 160) {
            this.f35057W = false;
        } else if (i == 174) {
            this.f35078s = new C7867kh((C7795ih) null);
        } else if (i == 187) {
            this.f35037C = false;
        } else if (i == 19899) {
            this.f35080u = -1;
            this.f35081v = -1;
        } else if (i == 20533) {
            this.f35078s.f34311e = true;
        } else if (i == 21968) {
            this.f35078s.f34323q = true;
        } else if (i == 408125543) {
            long j3 = this.f35074o;
            if (j3 == -1 || j3 == j) {
                this.f35074o = j;
                this.f35073n = j2;
                return;
            }
            throw new C8153se("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f35035A = new C8302wl(32);
            this.f35036B = new C8302wl(32);
        } else if (i != 524531317 || this.f35079t) {
        } else {
            if (!this.f35062c || this.f35083x == -1) {
                this.f35058X.mo33909g(new C8369yg(this.f35077r));
                this.f35079t = true;
                return;
            }
            this.f35082w = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo33333j(int i, String str) throws C8153se {
        if (i == 134) {
            this.f35078s.f34307a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.f35078s.f34304N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new C8153se(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01eb, code lost:
        throw new com.google.android.gms.internal.ads.C8153se("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33334k(int r19, int r20, com.google.android.gms.internal.ads.C8121rg r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r7 = 0
            if (r1 == r4) goto L_0x008b
            if (r1 == r5) goto L_0x008b
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0081
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0072
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0053
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0049
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0030
            com.google.android.gms.internal.ads.kh r1 = r0.f35078s
            byte[] r4 = new byte[r2]
            r1.f34321o = r4
            r3.mo34538h(r4, r7, r2, r7)
            return
        L_0x0030:
            com.google.android.gms.internal.ads.se r2 = new com.google.android.gms.internal.ads.se
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 26
            r3.<init>(r4)
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0049:
            com.google.android.gms.internal.ads.kh r1 = r0.f35078s
            byte[] r4 = new byte[r2]
            r1.f34314h = r4
            r3.mo34538h(r4, r7, r2, r7)
            return
        L_0x0053:
            com.google.android.gms.internal.ads.bm r1 = r0.f35067h
            byte[] r1 = r1.f30037a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.bm r1 = r0.f35067h
            byte[] r1 = r1.f30037a
            int r4 = 4 - r2
            r3.mo34538h(r1, r4, r2, r7)
            com.google.android.gms.internal.ads.bm r1 = r0.f35067h
            r1.mo30725v(r7)
            com.google.android.gms.internal.ads.bm r1 = r0.f35067h
            long r1 = r1.mo30716m()
            int r2 = (int) r1
            r0.f35080u = r2
            return
        L_0x0072:
            byte[] r1 = new byte[r2]
            r3.mo34538h(r1, r7, r2, r7)
            com.google.android.gms.internal.ads.kh r2 = r0.f35078s
            com.google.android.gms.internal.ads.ah r3 = new com.google.android.gms.internal.ads.ah
            r3.<init>(r6, r1)
            r2.f34313g = r3
            return
        L_0x0081:
            com.google.android.gms.internal.ads.kh r1 = r0.f35078s
            byte[] r4 = new byte[r2]
            r1.f34312f = r4
            r3.mo34538h(r4, r7, r2, r7)
            return
        L_0x008b:
            int r4 = r0.f35038D
            r8 = 8
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.ads.nh r4 = r0.f35060a
            long r9 = r4.mo33700e(r3, r7, r6, r8)
            int r4 = (int) r9
            r0.f35044J = r4
            com.google.android.gms.internal.ads.nh r4 = r0.f35060a
            int r4 = r4.mo33698a()
            r0.f35045K = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f35040F = r9
            r0.f35038D = r6
            com.google.android.gms.internal.ads.bm r4 = r0.f35065f
            r4.mo30721r()
        L_0x00b0:
            android.util.SparseArray<com.google.android.gms.internal.ads.kh> r4 = r0.f35061b
            int r9 = r0.f35044J
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.internal.ads.kh r4 = (com.google.android.gms.internal.ads.C7867kh) r4
            if (r4 != 0) goto L_0x00c6
            int r1 = r0.f35045K
            int r1 = r2 - r1
            r3.mo34539i(r1, r7)
            r0.f35038D = r7
            return
        L_0x00c6:
            int r9 = r0.f35038D
            if (r9 != r6) goto L_0x0255
            r9 = 3
            r0.m34454s(r3, r9)
            com.google.android.gms.internal.ads.bm r10 = r0.f35065f
            byte[] r10 = r10.f30037a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r6
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00ef
            r0.f35042H = r6
            int[] r9 = r0.f35043I
            int[] r9 = m34452q(r9, r6)
            r0.f35043I = r9
            int r10 = r0.f35045K
            int r2 = r2 - r10
            int r2 = r2 + -3
            r9[r7] = r2
            goto L_0x01fd
        L_0x00ef:
            if (r1 != r5) goto L_0x024d
            r13 = 4
            r0.m34454s(r3, r13)
            com.google.android.gms.internal.ads.bm r14 = r0.f35065f
            byte[] r14 = r14.f30037a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r6
            r0.f35042H = r14
            int[] r15 = r0.f35043I
            int[] r14 = m34452q(r15, r14)
            r0.f35043I = r14
            if (r10 != r11) goto L_0x0116
            int r9 = r0.f35045K
            int r10 = r0.f35042H
            int r2 = r2 - r9
            int r2 = r2 + -4
            int r2 = r2 / r10
            java.util.Arrays.fill(r14, r7, r10, r2)
            goto L_0x01fd
        L_0x0116:
            if (r10 != r6) goto L_0x014b
            r9 = 0
            r10 = 0
        L_0x011a:
            int r14 = r0.f35042H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x0140
            int[] r14 = r0.f35043I
            r14[r9] = r7
        L_0x0124:
            int r13 = r13 + r6
            r0.m34454s(r3, r13)
            com.google.android.gms.internal.ads.bm r14 = r0.f35065f
            byte[] r14 = r14.f30037a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.f35043I
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0124
            int r10 = r10 + r16
            int r9 = r9 + 1
            goto L_0x011a
        L_0x0140:
            int[] r9 = r0.f35043I
            int r15 = r0.f35045K
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x01fd
        L_0x014b:
            if (r10 != r9) goto L_0x0245
            r9 = 0
            r10 = 0
        L_0x014f:
            int r14 = r0.f35042H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x01f4
            int[] r14 = r0.f35043I
            r14[r9] = r7
            int r13 = r13 + 1
            r0.m34454s(r3, r13)
            int r14 = r13 + -1
            com.google.android.gms.internal.ads.bm r15 = r0.f35065f
            byte[] r15 = r15.f30037a
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x01ec
            r15 = 0
        L_0x0169:
            if (r15 >= r8) goto L_0x01bc
            int r16 = 7 - r15
            int r16 = r6 << r16
            com.google.android.gms.internal.ads.bm r5 = r0.f35065f
            byte[] r5 = r5.f30037a
            byte r5 = r5[r14]
            r5 = r5 & r16
            if (r5 == 0) goto L_0x01b2
            int r13 = r13 + r15
            r0.m34454s(r3, r13)
            int r5 = r14 + 1
            com.google.android.gms.internal.ads.bm r11 = r0.f35065f
            byte[] r11 = r11.f30037a
            byte r11 = r11[r14]
            r11 = r11 & r12
            r14 = r16 ^ -1
            r11 = r11 & r14
            long r6 = (long) r11
        L_0x018a:
            if (r5 >= r13) goto L_0x01a0
            int r11 = r5 + 1
            long r6 = r6 << r8
            com.google.android.gms.internal.ads.bm r14 = r0.f35065f
            byte[] r14 = r14.f30037a
            byte r5 = r14[r5]
            r5 = r5 & r12
            r17 = r13
            long r12 = (long) r5
            long r6 = r6 | r12
            r5 = r11
            r13 = r17
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x018a
        L_0x01a0:
            r17 = r13
            if (r9 <= 0) goto L_0x01af
            r11 = 1
            int r15 = r15 * 7
            int r15 = r15 + 6
            long r11 = r11 << r15
            r13 = -1
            long r11 = r11 + r13
            long r6 = r6 - r11
        L_0x01af:
            r13 = r17
            goto L_0x01be
        L_0x01b2:
            int r15 = r15 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r7 = 0
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0169
        L_0x01bc:
            r6 = 0
        L_0x01be:
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x01e4
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x01e4
            int r5 = (int) r6
            int[] r6 = r0.f35043I
            if (r9 == 0) goto L_0x01d6
            int r7 = r9 + -1
            r7 = r6[r7]
            int r5 = r5 + r7
        L_0x01d6:
            r6[r9] = r5
            int r10 = r10 + r5
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r7 = 0
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x014f
        L_0x01e4:
            com.google.android.gms.internal.ads.se r1 = new com.google.android.gms.internal.ads.se
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            com.google.android.gms.internal.ads.se r1 = new com.google.android.gms.internal.ads.se
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01f4:
            int[] r5 = r0.f35043I
            int r6 = r0.f35045K
            int r2 = r2 - r6
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x01fd:
            com.google.android.gms.internal.ads.bm r2 = r0.f35065f
            byte[] r2 = r2.f30037a
            r5 = 0
            byte r6 = r2[r5]
            r5 = 1
            byte r2 = r2[r5]
            long r9 = r0.f35085z
            int r5 = r6 << 8
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = (long) r2
            long r5 = r0.m34449n(r5)
            long r9 = r9 + r5
            r0.f35039E = r9
            com.google.android.gms.internal.ads.bm r2 = r0.f35065f
            byte[] r2 = r2.f30037a
            r5 = 2
            byte r2 = r2[r5]
            r6 = r2 & 8
            int r7 = r4.f34309c
            if (r7 == r5) goto L_0x0234
            r5 = 163(0xa3, float:2.28E-43)
            if (r1 != r5) goto L_0x0232
            r1 = 128(0x80, float:1.794E-43)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0230
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x0234
        L_0x0230:
            r1 = 163(0xa3, float:2.28E-43)
        L_0x0232:
            r2 = 0
            goto L_0x0235
        L_0x0234:
            r2 = 1
        L_0x0235:
            if (r6 != r8) goto L_0x023a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x023b
        L_0x023a:
            r5 = 0
        L_0x023b:
            r2 = r2 | r5
            r0.f35046L = r2
            r2 = 2
            r0.f35038D = r2
            r2 = 0
            r0.f35041G = r2
            goto L_0x0255
        L_0x0245:
            com.google.android.gms.internal.ads.se r1 = new com.google.android.gms.internal.ads.se
            java.lang.String r2 = "Unexpected lacing value: 2"
            r1.<init>(r2)
            throw r1
        L_0x024d:
            com.google.android.gms.internal.ads.se r1 = new com.google.android.gms.internal.ads.se
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0255:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x0280
        L_0x0259:
            int r1 = r0.f35041G
            int r2 = r0.f35042H
            if (r1 >= r2) goto L_0x027c
            int[] r2 = r0.f35043I
            r1 = r2[r1]
            r0.m34455t(r3, r4, r1)
            long r1 = r0.f35039E
            int r5 = r0.f35041G
            int r6 = r4.f34310d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.m34450o(r4, r1)
            int r1 = r0.f35041G
            r2 = 1
            int r1 = r1 + r2
            r0.f35041G = r1
            goto L_0x0259
        L_0x027c:
            r1 = 0
            r0.f35038D = r1
            return
        L_0x0280:
            r1 = 0
            int[] r2 = r0.f35043I
            r1 = r2[r1]
            r0.m34455t(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7904lh.mo33334k(int, int, com.google.android.gms.internal.ads.rg):void");
    }
}
