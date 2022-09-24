package com.google.ads.interactivemedia.p038v3.internal;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xv */
/* compiled from: IMASDK */
public abstract class C4488xv extends C4082iu {

    /* renamed from: b */
    private static final byte[] f19598b = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private boolean f19599A;

    /* renamed from: B */
    private float f19600B;

    /* renamed from: C */
    private ArrayDeque<C4486xt> f19601C;

    /* renamed from: D */
    private C4487xu f19602D;

    /* renamed from: E */
    private C4486xt f19603E;

    /* renamed from: F */
    private int f19604F;

    /* renamed from: G */
    private boolean f19605G;

    /* renamed from: H */
    private boolean f19606H;

    /* renamed from: I */
    private boolean f19607I;

    /* renamed from: J */
    private boolean f19608J;

    /* renamed from: K */
    private boolean f19609K;

    /* renamed from: L */
    private boolean f19610L;

    /* renamed from: M */
    private boolean f19611M;

    /* renamed from: N */
    private boolean f19612N;

    /* renamed from: O */
    private boolean f19613O;

    /* renamed from: P */
    private boolean f19614P;

    /* renamed from: Q */
    private C4482xp f19615Q;

    /* renamed from: R */
    private long f19616R;

    /* renamed from: S */
    private int f19617S;

    /* renamed from: T */
    private int f19618T;

    /* renamed from: U */
    private ByteBuffer f19619U;

    /* renamed from: V */
    private boolean f19620V;

    /* renamed from: W */
    private boolean f19621W;

    /* renamed from: X */
    private boolean f19622X;

    /* renamed from: Y */
    private boolean f19623Y;

    /* renamed from: Z */
    private boolean f19624Z;

    /* renamed from: a */
    protected C4266pp f19625a;

    /* renamed from: aa */
    private boolean f19626aa;

    /* renamed from: ab */
    private int f19627ab;

    /* renamed from: ac */
    private int f19628ac;

    /* renamed from: ad */
    private int f19629ad;

    /* renamed from: ae */
    private boolean f19630ae;

    /* renamed from: af */
    private boolean f19631af;

    /* renamed from: ag */
    private boolean f19632ag;

    /* renamed from: ah */
    private long f19633ah;

    /* renamed from: ai */
    private long f19634ai;

    /* renamed from: aj */
    private boolean f19635aj;

    /* renamed from: ak */
    private boolean f19636ak;

    /* renamed from: al */
    private boolean f19637al;

    /* renamed from: am */
    private boolean f19638am;

    /* renamed from: an */
    private C4089ja f19639an;

    /* renamed from: ao */
    private long f19640ao;

    /* renamed from: ap */
    private long f19641ap;

    /* renamed from: aq */
    private int f19642aq;

    /* renamed from: ar */
    private C4504yk f19643ar;

    /* renamed from: c */
    private final C4483xq f19644c;

    /* renamed from: d */
    private final C4490xx f19645d;

    /* renamed from: e */
    private final float f19646e;

    /* renamed from: f */
    private final C4269ps f19647f = new C4269ps(0);

    /* renamed from: g */
    private final C4269ps f19648g = new C4269ps(0);

    /* renamed from: h */
    private final C4269ps f19649h = new C4269ps(2);

    /* renamed from: i */
    private final C4481xo f19650i;

    /* renamed from: j */
    private final amj<C4120ke> f19651j;

    /* renamed from: k */
    private final ArrayList<Long> f19652k;

    /* renamed from: l */
    private final MediaCodec.BufferInfo f19653l;

    /* renamed from: m */
    private final long[] f19654m;

    /* renamed from: n */
    private final long[] f19655n;

    /* renamed from: o */
    private final long[] f19656o;

    /* renamed from: p */
    private C4120ke f19657p;

    /* renamed from: q */
    private C4120ke f19658q;

    /* renamed from: r */
    private C4279qb f19659r;

    /* renamed from: s */
    private C4279qb f19660s;

    /* renamed from: t */
    private MediaCrypto f19661t;

    /* renamed from: u */
    private boolean f19662u;

    /* renamed from: v */
    private final long f19663v;

    /* renamed from: w */
    private float f19664w;

    /* renamed from: x */
    private float f19665x;

    /* renamed from: y */
    private C4120ke f19666y;

    /* renamed from: z */
    private MediaFormat f19667z;

    public C4488xv(int i, C4483xq xqVar, C4490xx xxVar, float f) {
        super(i);
        this.f19644c = xqVar;
        aup.m14890u(xxVar);
        this.f19645d = xxVar;
        this.f19646e = f;
        C4481xo xoVar = new C4481xo();
        this.f19650i = xoVar;
        this.f19651j = new amj<>();
        this.f19652k = new ArrayList<>();
        this.f19653l = new MediaCodec.BufferInfo();
        this.f19664w = 1.0f;
        this.f19665x = 1.0f;
        this.f19663v = C6540C.TIME_UNSET;
        this.f19654m = new long[10];
        this.f19655n = new long[10];
        this.f19656o = new long[10];
        this.f19640ao = C6540C.TIME_UNSET;
        this.f19641ap = C6540C.TIME_UNSET;
        xoVar.mo16520i(0);
        xoVar.f18397b.order(ByteOrder.nativeOrder());
        mo16791aq();
    }

    /* renamed from: Y */
    private final void mo16491Y() {
        this.f19624Z = false;
        this.f19650i.mo16508a();
        this.f19649h.mo16508a();
        this.f19623Y = false;
        this.f19622X = false;
    }

    /* renamed from: aA */
    private final boolean m19489aA(long j) {
        return true;
    }

    /* renamed from: aB */
    private final boolean m19490aB() {
        return this.f19618T >= 0;
    }

    /* renamed from: aC */
    private final void m19491aC() {
        this.f19617S = -1;
        this.f19648g.f18397b = null;
    }

    /* renamed from: aD */
    private final void m19492aD() {
        this.f19618T = -1;
        this.f19619U = null;
    }

    /* renamed from: aE */
    private final void m19493aE(C4279qb qbVar) {
        C4038hd.m17329o(this.f19660s, qbVar);
        this.f19660s = qbVar;
    }

    /* renamed from: aF */
    private final void m19494aF(C4279qb qbVar) {
        C4038hd.m17329o(this.f19659r, qbVar);
        this.f19659r = qbVar;
    }

    /* renamed from: aG */
    private final boolean m19495aG() throws C4089ja {
        C4504yk ykVar = this.f19643ar;
        if (ykVar == null || this.f19628ac == 2 || this.f19635aj) {
            return false;
        }
        if (this.f19617S < 0) {
            int b = ykVar.mo16813b();
            this.f19617S = b;
            if (b < 0) {
                return false;
            }
            this.f19648g.f18397b = this.f19643ar.mo16816e(b);
            this.f19648g.mo16508a();
        }
        if (this.f19628ac == 1) {
            if (!this.f19614P) {
                this.f19631af = true;
                this.f19643ar.mo16827p(this.f19617S, 0, 0, 4);
                m19491aC();
            }
            this.f19628ac = 2;
            return false;
        } else if (this.f19612N) {
            this.f19612N = false;
            this.f19648g.f18397b.put(f19598b);
            this.f19643ar.mo16827p(this.f19617S, 38, 0, 0);
            m19491aC();
            this.f19630ae = true;
            return true;
        } else {
            if (this.f19627ab == 1) {
                for (int i = 0; i < this.f19666y.f17683n.size(); i++) {
                    this.f19648g.f18397b.put(this.f19666y.f17683n.get(i));
                }
                this.f19627ab = 2;
            }
            int position = this.f19648g.f18397b.position();
            C4121kf A = mo15937A();
            try {
                int F = mo15942F(A, this.f19648g, 0);
                if (mo15954j()) {
                    this.f19634ai = this.f19633ah;
                }
                if (F == -3) {
                    return false;
                }
                if (F == -5) {
                    if (this.f19627ab == 2) {
                        this.f19648g.mo16508a();
                        this.f19627ab = 1;
                    }
                    mo14034W(A);
                    return true;
                } else if (this.f19648g.mo16510c()) {
                    if (this.f19627ab == 2) {
                        this.f19648g.mo16508a();
                        this.f19627ab = 1;
                    }
                    this.f19635aj = true;
                    if (!this.f19630ae) {
                        m19499aK();
                        return false;
                    }
                    try {
                        if (!this.f19614P) {
                            this.f19631af = true;
                            this.f19643ar.mo16827p(this.f19617S, 0, 0, 4);
                            m19491aC();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo15940D(e, this.f19657p);
                    }
                } else if (this.f19630ae || this.f19648g.mo16511d()) {
                    boolean j = this.f19648g.mo16521j();
                    if (j) {
                        this.f19648g.f18396a.mo16518c(position);
                    }
                    if (this.f19605G && !j) {
                        ByteBuffer byteBuffer = this.f19648g.f18397b;
                        byte[] bArr = alq.f15233a;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b2 = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (b2 == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b2 = 1;
                                }
                            } else if (b2 == 0) {
                                i3++;
                            }
                            if (b2 != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.f19648g.f18397b.position() == 0) {
                            return true;
                        }
                        this.f19605G = false;
                    }
                    C4269ps psVar = this.f19648g;
                    long j2 = psVar.f18399d;
                    C4482xp xpVar = this.f19615Q;
                    if (xpVar != null) {
                        j2 = xpVar.mo16777b(this.f19657p, psVar);
                    }
                    long j3 = j2;
                    if (this.f19648g.mo16509b()) {
                        this.f19652k.add(Long.valueOf(j3));
                    }
                    if (this.f19637al) {
                        this.f19651j.mo13988a(j3, this.f19657p);
                        this.f19637al = false;
                    }
                    if (this.f19615Q != null) {
                        this.f19633ah = Math.max(this.f19633ah, this.f19648g.f18399d);
                    } else {
                        this.f19633ah = Math.max(this.f19633ah, j3);
                    }
                    this.f19648g.mo16522k();
                    if (this.f19648g.mo16512e()) {
                        mo14052as(this.f19648g);
                    }
                    mo14037Z(this.f19648g);
                    if (j) {
                        try {
                            this.f19643ar.mo16828q(this.f19617S, this.f19648g.f18396a, j3);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo15940D(e2, this.f19657p);
                        }
                    } else {
                        this.f19643ar.mo16827p(this.f19617S, this.f19648g.f18397b.limit(), j3, 0);
                    }
                    m19491aC();
                    this.f19630ae = true;
                    this.f19627ab = 0;
                    this.f19625a.f18387c++;
                    return true;
                } else {
                    this.f19648g.mo16508a();
                    if (this.f19627ab == 2) {
                        this.f19627ab = 1;
                    }
                    return true;
                }
            } catch (C4268pr e3) {
                mo14033V(e3);
                throw mo15941E(mo14051ar(e3, this.f19603E), this.f19657p, false);
            }
        }
    }

    /* renamed from: aH */
    private final boolean m19496aH(C4120ke keVar) throws C4089ja {
        if (!(amm.f15298a < 23 || this.f19643ar == null || this.f19629ad == 3 || mo15952e() == 0)) {
            float ag = mo14047ag(this.f19665x, mo15938B());
            float f = this.f19600B;
            if (f == ag) {
                return true;
            }
            if (ag == -1.0f) {
                m19498aJ();
                return false;
            } else if (f == -1.0f && ag <= this.f19646e) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", ag);
                this.f19643ar.mo16824m(bundle);
                this.f19600B = ag;
            }
        }
        return true;
    }

    @TargetApi(23)
    /* renamed from: aI */
    private final boolean m19497aI() throws C4089ja {
        if (this.f19630ae) {
            this.f19628ac = 1;
            if (this.f19606H || this.f19608J) {
                this.f19629ad = 3;
                return false;
            }
            this.f19629ad = 2;
        } else {
            m19501aM();
        }
        return true;
    }

    /* renamed from: aJ */
    private final void m19498aJ() throws C4089ja {
        if (this.f19630ae) {
            this.f19628ac = 1;
            this.f19629ad = 3;
            return;
        }
        m19500aL();
    }

    @TargetApi(23)
    /* renamed from: aK */
    private final void m19499aK() throws C4089ja {
        int i = this.f19629ad;
        if (i == 1) {
            m19504ac();
        } else if (i == 2) {
            m19504ac();
            m19501aM();
        } else if (i != 3) {
            this.f19636ak = true;
            mo16492ab();
        } else {
            m19500aL();
        }
    }

    /* renamed from: aL */
    private final void m19500aL() throws C4089ja {
        mo16789an();
        mo16785ah();
    }

    /* renamed from: aM */
    private final void m19501aM() throws C4089ja {
        try {
            this.f19661t.setMediaDrmSession(m19502aN(this.f19660s).f18432c);
            m19494aF(this.f19660s);
            this.f19628ac = 0;
            this.f19629ad = 0;
        } catch (MediaCryptoException e) {
            throw mo15940D(e, this.f19657p);
        }
    }

    /* renamed from: aN */
    private static final C4290qm m19502aN(C4279qb qbVar) throws C4089ja {
        return (C4290qm) qbVar.mo16569e();
    }

    /* renamed from: aO */
    private static final boolean m19503aO(C4290qm qmVar, C4120ke keVar) {
        if (qmVar.f18433d) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(qmVar.f18431b, qmVar.f18432c);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(keVar.f17681l);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* renamed from: ac */
    private final void m19504ac() {
        try {
            this.f19643ar.mo16820i();
        } finally {
            mo14050ap();
        }
    }

    /* renamed from: ad */
    private final boolean m19505ad(int i) throws C4089ja {
        C4121kf A = mo15937A();
        this.f19647f.mo16508a();
        int F = mo15942F(A, this.f19647f, i | 4);
        if (F == -5) {
            mo14034W(A);
            return true;
        } else if (F != -4 || !this.f19647f.mo16510c()) {
            return false;
        } else {
            this.f19635aj = true;
            m19499aK();
            return false;
        }
    }

    /* renamed from: ax */
    protected static boolean m19506ax(C4120ke keVar) {
        Class<? extends C4289ql> cls = keVar.f17668E;
        return cls == null || C4290qm.class.equals(cls);
    }

    /* renamed from: I */
    public void mo14027I(float f, float f2) throws C4089ja {
        this.f19664w = f;
        this.f19665x = f2;
        m19496aH(this.f19666y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo13719J(long j, long j2) throws C4089ja {
        boolean z = true;
        if (this.f19641ap == C6540C.TIME_UNSET) {
            if (this.f19640ao != C6540C.TIME_UNSET) {
                z = false;
            }
            aup.m14887r(z);
            this.f19640ao = j;
            this.f19641ap = j2;
            return;
        }
        int i = this.f19642aq;
        if (i == 10) {
            long j3 = this.f19655n[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f19642aq = i + 1;
        }
        long[] jArr = this.f19654m;
        int i2 = this.f19642aq - 1;
        jArr[i2] = j;
        this.f19655n[i2] = j2;
        this.f19656o[i2] = this.f19633ah;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:157|158|159|160|161|(1:163)|164|165|229|(1:184)|188|190|191) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:86|87|(1:89)(0)|90|229|(1:184)|188|190|191) */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        m19499aK();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x029d, code lost:
        r15 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x029f, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02a1, code lost:
        if (r15.f19636ak != false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02a3, code lost:
        mo16789an();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02a6, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02a7, code lost:
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x034a, code lost:
        if (r2[0].getClassName().equals("android.media.MediaCodec") != false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e4, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0167, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        m19499aK();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016c, code lost:
        if (r15.f19636ak != false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016e, code lost:
        mo16789an();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0171, code lost:
        r2 = r12;
        r1 = r15;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x029a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0167 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c1 A[Catch:{ IllegalStateException -> 0x0327 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02f7 A[Catch:{ IllegalStateException -> 0x0325 }, LOOP:2: B:78:0x0150->B:182:0x02f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0300 A[Catch:{ IllegalStateException -> 0x0325 }, LOOP:4: B:184:0x0300->B:187:0x030a, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x02fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x02f6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017f A[Catch:{ IllegalStateException -> 0x0327 }] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13721L(long r25, long r27) throws com.google.ads.interactivemedia.p038v3.internal.C4089ja {
        /*
            r24 = this;
            r15 = r24
            boolean r0 = r15.f19638am
            r14 = 0
            if (r0 == 0) goto L_0x000c
            r15.f19638am = r14
            r24.m19499aK()
        L_0x000c:
            com.google.ads.interactivemedia.v3.internal.ja r0 = r15.f19639an
            r13 = 0
            if (r0 != 0) goto L_0x035d
            boolean r0 = r15.f19636ak     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 == 0) goto L_0x0019
            r24.mo16492ab()     // Catch:{ IllegalStateException -> 0x0327 }
            return
        L_0x0019:
            com.google.ads.interactivemedia.v3.internal.ke r0 = r15.f19657p     // Catch:{ IllegalStateException -> 0x0327 }
            r11 = 2
            if (r0 != 0) goto L_0x0026
            boolean r0 = r15.m19505ad(r11)     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            return
        L_0x0026:
            r24.mo16785ah()     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r0 = r15.f19622X     // Catch:{ IllegalStateException -> 0x0327 }
            r12 = 1
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "bypassRender"
            com.google.ads.interactivemedia.p038v3.internal.age.m13544b(r0)     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x0033:
            boolean r0 = r15.f19636ak     // Catch:{ IllegalStateException -> 0x0327 }
            r0 = r0 ^ r12
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r0)     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.xo r0 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r0 = r0.mo16774o()     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 == 0) goto L_0x0088
            com.google.ads.interactivemedia.v3.internal.xo r0 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            java.nio.ByteBuffer r7 = r0.f18397b     // Catch:{ IllegalStateException -> 0x0327 }
            int r8 = r15.f19618T     // Catch:{ IllegalStateException -> 0x0327 }
            int r10 = r0.mo16773n()     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.xo r0 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            long r4 = r0.f18399d     // Catch:{ IllegalStateException -> 0x0327 }
            r6 = 0
            r9 = 0
            boolean r0 = r0.mo16509b()     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.xo r1 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r16 = r1.mo16510c()     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.ke r11 = r15.f19658q     // Catch:{ IllegalStateException -> 0x0327 }
            r1 = r24
            r2 = r25
            r17 = r4
            r4 = r27
            r19 = r11
            r11 = r17
            r13 = r0
            r14 = r16
            r15 = r19
            boolean r0 = r1.mo14046af(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02aa }
            if (r0 == 0) goto L_0x0085
            r15 = r24
            com.google.ads.interactivemedia.v3.internal.xo r0 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            long r0 = r0.mo16772m()     // Catch:{ IllegalStateException -> 0x0327 }
            r15.mo14053at(r0)     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.xo r0 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            r0.mo16508a()     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x0088
        L_0x0085:
            r15 = r24
            goto L_0x008f
        L_0x0088:
            boolean r0 = r15.f19635aj     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 == 0) goto L_0x0092
            r0 = 1
            r15.f19636ak = r0     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x008f:
            r14 = 0
            goto L_0x0138
        L_0x0092:
            r0 = 1
            boolean r1 = r15.f19623Y     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x00a6
            com.google.ads.interactivemedia.v3.internal.xo r1 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.ps r2 = r15.f19649h     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r1 = r1.mo16775p(r2)     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r1)     // Catch:{ IllegalStateException -> 0x0327 }
            r14 = 0
            r15.f19623Y = r14     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x00a7
        L_0x00a6:
            r14 = 0
        L_0x00a7:
            boolean r1 = r15.f19624Z     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x00c4
            com.google.ads.interactivemedia.v3.internal.xo r1 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r1 = r1.mo16774o()     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 != 0) goto L_0x00c0
            r24.mo16491Y()     // Catch:{ IllegalStateException -> 0x0327 }
            r15.f19624Z = r14     // Catch:{ IllegalStateException -> 0x0327 }
            r24.mo16785ah()     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r1 = r15.f19622X     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x0138
            goto L_0x00c4
        L_0x00c0:
            r12 = 1
            r13 = 0
            goto L_0x0033
        L_0x00c4:
            boolean r1 = r15.f19635aj     // Catch:{ IllegalStateException -> 0x0327 }
            r1 = r1 ^ r0
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r1)     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.kf r1 = r24.mo15937A()     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.ps r2 = r15.f19649h     // Catch:{ IllegalStateException -> 0x0327 }
            r2.mo16508a()     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x00d3:
            com.google.ads.interactivemedia.v3.internal.ps r2 = r15.f19649h     // Catch:{ IllegalStateException -> 0x0327 }
            r2.mo16508a()     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.ps r2 = r15.f19649h     // Catch:{ IllegalStateException -> 0x0327 }
            int r2 = r15.mo15942F(r1, r2, r14)     // Catch:{ IllegalStateException -> 0x0327 }
            r3 = -5
            if (r2 == r3) goto L_0x0116
            r3 = -4
            if (r2 == r3) goto L_0x00e6
        L_0x00e4:
            r3 = 0
            goto L_0x011a
        L_0x00e6:
            com.google.ads.interactivemedia.v3.internal.ps r2 = r15.f19649h     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r2 = r2.mo16510c()     // Catch:{ IllegalStateException -> 0x0327 }
            if (r2 == 0) goto L_0x00f1
            r15.f19635aj = r0     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x00e4
        L_0x00f1:
            boolean r2 = r15.f19637al     // Catch:{ IllegalStateException -> 0x0327 }
            if (r2 == 0) goto L_0x0103
            com.google.ads.interactivemedia.v3.internal.ke r2 = r15.f19657p     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)     // Catch:{ IllegalStateException -> 0x0327 }
            r15.f19658q = r2     // Catch:{ IllegalStateException -> 0x0327 }
            r3 = 0
            r15.mo14035X(r2, r3)     // Catch:{ IllegalStateException -> 0x0327 }
            r15.f19637al = r14     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x0104
        L_0x0103:
            r3 = 0
        L_0x0104:
            com.google.ads.interactivemedia.v3.internal.ps r2 = r15.f19649h     // Catch:{ IllegalStateException -> 0x0327 }
            r2.mo16522k()     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.xo r2 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.ps r4 = r15.f19649h     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r2 = r2.mo16775p(r4)     // Catch:{ IllegalStateException -> 0x0327 }
            if (r2 != 0) goto L_0x00d3
            r15.f19623Y = r0     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x011a
        L_0x0116:
            r3 = 0
            r15.mo14034W(r1)     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x011a:
            com.google.ads.interactivemedia.v3.internal.xo r1 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r1 = r1.mo16774o()     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x0127
            com.google.ads.interactivemedia.v3.internal.xo r1 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            r1.mo16522k()     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x0127:
            com.google.ads.interactivemedia.v3.internal.xo r1 = r15.f19650i     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r1 = r1.mo16774o()     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 != 0) goto L_0x013e
            boolean r1 = r15.f19635aj     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 != 0) goto L_0x013e
            boolean r1 = r15.f19624Z     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x0138
            goto L_0x013e
        L_0x0138:
            com.google.ads.interactivemedia.p038v3.internal.age.m13545c()     // Catch:{ IllegalStateException -> 0x0327 }
            r1 = r15
            goto L_0x031f
        L_0x013e:
            r13 = r3
            r12 = 1
            goto L_0x0033
        L_0x0142:
            r0 = 1
            com.google.ads.interactivemedia.v3.internal.yk r1 = r15.f19643ar     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x0310
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0327 }
            java.lang.String r1 = "drainAndFeed"
            com.google.ads.interactivemedia.p038v3.internal.age.m13544b(r1)     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x0150:
            boolean r1 = r24.m19490aB()     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 != 0) goto L_0x025e
            boolean r1 = r15.f19609K     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x0175
            boolean r1 = r15.f19631af     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x0175
            com.google.ads.interactivemedia.v3.internal.yk r1 = r15.f19643ar     // Catch:{ IllegalStateException -> 0x0167 }
            android.media.MediaCodec$BufferInfo r2 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0167 }
            int r1 = r1.mo16814c(r2)     // Catch:{ IllegalStateException -> 0x0167 }
            goto L_0x017d
        L_0x0167:
            r24.m19499aK()     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r0 = r15.f19636ak     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 == 0) goto L_0x0171
            r24.mo16789an()     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x0171:
            r2 = r12
            r1 = r15
            goto L_0x0300
        L_0x0175:
            com.google.ads.interactivemedia.v3.internal.yk r1 = r15.f19643ar     // Catch:{ IllegalStateException -> 0x0327 }
            android.media.MediaCodec$BufferInfo r2 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0327 }
            int r1 = r1.mo16814c(r2)     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x017d:
            if (r1 >= 0) goto L_0x01c1
            r2 = -2
            if (r1 != r2) goto L_0x01b1
            r15.f19632ag = r0     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.yk r1 = r15.f19643ar     // Catch:{ IllegalStateException -> 0x0327 }
            android.media.MediaFormat r1 = r1.mo16815d()     // Catch:{ IllegalStateException -> 0x0327 }
            int r2 = r15.f19604F     // Catch:{ IllegalStateException -> 0x0327 }
            if (r2 == 0) goto L_0x01a3
            java.lang.String r2 = "width"
            int r2 = r1.getInteger(r2)     // Catch:{ IllegalStateException -> 0x0327 }
            r3 = 32
            if (r2 != r3) goto L_0x01a3
            java.lang.String r2 = "height"
            int r2 = r1.getInteger(r2)     // Catch:{ IllegalStateException -> 0x0327 }
            if (r2 != r3) goto L_0x01a3
            r15.f19613O = r0     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x01cc
        L_0x01a3:
            boolean r2 = r15.f19611M     // Catch:{ IllegalStateException -> 0x0327 }
            if (r2 == 0) goto L_0x01ac
            java.lang.String r2 = "channel-count"
            r1.setInteger(r2, r0)     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x01ac:
            r15.f19667z = r1     // Catch:{ IllegalStateException -> 0x0327 }
            r15.f19599A = r0     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x01cc
        L_0x01b1:
            boolean r0 = r15.f19614P     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 == 0) goto L_0x0171
            boolean r0 = r15.f19635aj     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 != 0) goto L_0x01bd
            int r0 = r15.f19628ac     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 != r11) goto L_0x0171
        L_0x01bd:
            r24.m19499aK()     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x0171
        L_0x01c1:
            boolean r2 = r15.f19613O     // Catch:{ IllegalStateException -> 0x0327 }
            if (r2 == 0) goto L_0x01d2
            r15.f19613O = r14     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.yk r2 = r15.f19643ar     // Catch:{ IllegalStateException -> 0x0327 }
            r2.mo16818g(r1, r14)     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x01cc:
            r2 = r12
            r1 = r15
            r21 = 2
            goto L_0x02f0
        L_0x01d2:
            android.media.MediaCodec$BufferInfo r2 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0327 }
            int r3 = r2.size     // Catch:{ IllegalStateException -> 0x0327 }
            if (r3 != 0) goto L_0x01e2
            int r2 = r2.flags     // Catch:{ IllegalStateException -> 0x0327 }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x01e2
            r24.m19499aK()     // Catch:{ IllegalStateException -> 0x0327 }
            goto L_0x0171
        L_0x01e2:
            r15.f19618T = r1     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.yk r2 = r15.f19643ar     // Catch:{ IllegalStateException -> 0x0327 }
            java.nio.ByteBuffer r1 = r2.mo16817f(r1)     // Catch:{ IllegalStateException -> 0x0327 }
            r15.f19619U = r1     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x0201
            android.media.MediaCodec$BufferInfo r2 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0327 }
            int r2 = r2.offset     // Catch:{ IllegalStateException -> 0x0327 }
            r1.position(r2)     // Catch:{ IllegalStateException -> 0x0327 }
            java.nio.ByteBuffer r1 = r15.f19619U     // Catch:{ IllegalStateException -> 0x0327 }
            android.media.MediaCodec$BufferInfo r2 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0327 }
            int r3 = r2.offset     // Catch:{ IllegalStateException -> 0x0327 }
            int r2 = r2.size     // Catch:{ IllegalStateException -> 0x0327 }
            int r3 = r3 + r2
            r1.limit(r3)     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x0201:
            boolean r1 = r15.f19610L     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x0222
            android.media.MediaCodec$BufferInfo r1 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0327 }
            long r2 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0327 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0222
            int r2 = r1.flags     // Catch:{ IllegalStateException -> 0x0327 }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0222
            long r2 = r15.f19633ah     // Catch:{ IllegalStateException -> 0x0327 }
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0222
            r1.presentationTimeUs = r2     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x0222:
            android.media.MediaCodec$BufferInfo r1 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0327 }
            long r1 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0327 }
            java.util.ArrayList<java.lang.Long> r3 = r15.f19652k     // Catch:{ IllegalStateException -> 0x0327 }
            int r3 = r3.size()     // Catch:{ IllegalStateException -> 0x0327 }
            r4 = 0
        L_0x022d:
            if (r4 >= r3) goto L_0x0249
            java.util.ArrayList<java.lang.Long> r5 = r15.f19652k     // Catch:{ IllegalStateException -> 0x0327 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ IllegalStateException -> 0x0327 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ IllegalStateException -> 0x0327 }
            long r5 = r5.longValue()     // Catch:{ IllegalStateException -> 0x0327 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0246
            java.util.ArrayList<java.lang.Long> r1 = r15.f19652k     // Catch:{ IllegalStateException -> 0x0327 }
            r1.remove(r4)     // Catch:{ IllegalStateException -> 0x0327 }
            r1 = 1
            goto L_0x024a
        L_0x0246:
            int r4 = r4 + 1
            goto L_0x022d
        L_0x0249:
            r1 = 0
        L_0x024a:
            r15.f19620V = r1     // Catch:{ IllegalStateException -> 0x0327 }
            long r1 = r15.f19634ai     // Catch:{ IllegalStateException -> 0x0327 }
            android.media.MediaCodec$BufferInfo r3 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0327 }
            long r3 = r3.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0327 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0258
            r1 = 1
            goto L_0x0259
        L_0x0258:
            r1 = 0
        L_0x0259:
            r15.f19621W = r1     // Catch:{ IllegalStateException -> 0x0327 }
            r15.mo16787al(r3)     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x025e:
            boolean r1 = r15.f19609K     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x02af
            boolean r1 = r15.f19631af     // Catch:{ IllegalStateException -> 0x0327 }
            if (r1 == 0) goto L_0x02af
            com.google.ads.interactivemedia.v3.internal.yk r6 = r15.f19643ar     // Catch:{ IllegalStateException -> 0x0298 }
            java.nio.ByteBuffer r7 = r15.f19619U     // Catch:{ IllegalStateException -> 0x0298 }
            int r8 = r15.f19618T     // Catch:{ IllegalStateException -> 0x0298 }
            android.media.MediaCodec$BufferInfo r1 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0298 }
            int r9 = r1.flags     // Catch:{ IllegalStateException -> 0x0298 }
            r10 = 1
            long r4 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0298 }
            boolean r2 = r15.f19620V     // Catch:{ IllegalStateException -> 0x0298 }
            boolean r3 = r15.f19621W     // Catch:{ IllegalStateException -> 0x0298 }
            com.google.ads.interactivemedia.v3.internal.ke r1 = r15.f19658q     // Catch:{ IllegalStateException -> 0x0298 }
            r16 = r1
            r1 = r24
            r17 = r2
            r18 = r3
            r2 = r25
            r19 = r4
            r4 = r27
            r22 = r12
            r21 = 2
            r11 = r19
            r13 = r17
            r14 = r18
            r15 = r16
            boolean r1 = r1.mo14046af(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x029a }
            goto L_0x02d4
        L_0x0298:
            r22 = r12
        L_0x029a:
            r24.m19499aK()     // Catch:{ IllegalStateException -> 0x02aa }
            r15 = r24
            boolean r0 = r15.f19636ak     // Catch:{ IllegalStateException -> 0x0327 }
            if (r0 == 0) goto L_0x02a6
            r24.mo16789an()     // Catch:{ IllegalStateException -> 0x0327 }
        L_0x02a6:
            r1 = r15
        L_0x02a7:
            r2 = r22
            goto L_0x0300
        L_0x02aa:
            r0 = move-exception
            r1 = r24
            goto L_0x0329
        L_0x02af:
            r22 = r12
            r21 = 2
            com.google.ads.interactivemedia.v3.internal.yk r6 = r15.f19643ar     // Catch:{ IllegalStateException -> 0x0327 }
            java.nio.ByteBuffer r7 = r15.f19619U     // Catch:{ IllegalStateException -> 0x0327 }
            int r8 = r15.f19618T     // Catch:{ IllegalStateException -> 0x0327 }
            android.media.MediaCodec$BufferInfo r1 = r15.f19653l     // Catch:{ IllegalStateException -> 0x0327 }
            int r9 = r1.flags     // Catch:{ IllegalStateException -> 0x0327 }
            r10 = 1
            long r11 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r13 = r15.f19620V     // Catch:{ IllegalStateException -> 0x0327 }
            boolean r14 = r15.f19621W     // Catch:{ IllegalStateException -> 0x0327 }
            com.google.ads.interactivemedia.v3.internal.ke r4 = r15.f19658q     // Catch:{ IllegalStateException -> 0x0327 }
            r1 = r24
            r2 = r25
            r16 = r4
            r4 = r27
            r15 = r16
            boolean r1 = r1.mo14046af(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02aa }
        L_0x02d4:
            if (r1 == 0) goto L_0x02fd
            r1 = r24
            android.media.MediaCodec$BufferInfo r2 = r1.f19653l     // Catch:{ IllegalStateException -> 0x0325 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0325 }
            r1.mo14053at(r2)     // Catch:{ IllegalStateException -> 0x0325 }
            android.media.MediaCodec$BufferInfo r2 = r1.f19653l     // Catch:{ IllegalStateException -> 0x0325 }
            int r2 = r2.flags     // Catch:{ IllegalStateException -> 0x0325 }
            r24.m19492aD()     // Catch:{ IllegalStateException -> 0x0325 }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x02ee
            r24.m19499aK()     // Catch:{ IllegalStateException -> 0x0325 }
            goto L_0x02a7
        L_0x02ee:
            r2 = r22
        L_0x02f0:
            boolean r4 = r1.m19489aA(r2)     // Catch:{ IllegalStateException -> 0x0325 }
            if (r4 != 0) goto L_0x02f7
            goto L_0x0300
        L_0x02f7:
            r15 = r1
            r12 = r2
            r11 = 2
            r14 = 0
            goto L_0x0150
        L_0x02fd:
            r1 = r24
            goto L_0x02a7
        L_0x0300:
            boolean r0 = r24.m19495aG()     // Catch:{ IllegalStateException -> 0x0325 }
            if (r0 == 0) goto L_0x030c
            boolean r0 = r1.m19489aA(r2)     // Catch:{ IllegalStateException -> 0x0325 }
            if (r0 != 0) goto L_0x0300
        L_0x030c:
            com.google.ads.interactivemedia.p038v3.internal.age.m13545c()     // Catch:{ IllegalStateException -> 0x0325 }
            goto L_0x031f
        L_0x0310:
            r1 = r15
            com.google.ads.interactivemedia.v3.internal.pp r2 = r1.f19625a     // Catch:{ IllegalStateException -> 0x0325 }
            int r3 = r2.f18388d     // Catch:{ IllegalStateException -> 0x0325 }
            int r4 = r24.mo15943G(r25)     // Catch:{ IllegalStateException -> 0x0325 }
            int r3 = r3 + r4
            r2.f18388d = r3     // Catch:{ IllegalStateException -> 0x0325 }
            r1.m19505ad(r0)     // Catch:{ IllegalStateException -> 0x0325 }
        L_0x031f:
            com.google.ads.interactivemedia.v3.internal.pp r0 = r1.f19625a     // Catch:{ IllegalStateException -> 0x0325 }
            r0.mo16519a()     // Catch:{ IllegalStateException -> 0x0325 }
            return
        L_0x0325:
            r0 = move-exception
            goto L_0x0329
        L_0x0327:
            r0 = move-exception
            r1 = r15
        L_0x0329:
            int r2 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            r3 = 21
            if (r2 < r3) goto L_0x0336
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException
            if (r2 != 0) goto L_0x0334
            goto L_0x0336
        L_0x0334:
            r3 = 0
            goto L_0x034c
        L_0x0336:
            java.lang.StackTraceElement[] r2 = r0.getStackTrace()
            int r3 = r2.length
            if (r3 <= 0) goto L_0x035c
            r3 = 0
            r2 = r2[r3]
            java.lang.String r2 = r2.getClassName()
            java.lang.String r4 = "android.media.MediaCodec"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x035c
        L_0x034c:
            r1.mo14033V(r0)
            com.google.ads.interactivemedia.v3.internal.xt r2 = r1.f19603E
            com.google.ads.interactivemedia.v3.internal.xs r0 = r1.mo14051ar(r0, r2)
            com.google.ads.interactivemedia.v3.internal.ke r2 = r1.f19657p
            com.google.ads.interactivemedia.v3.internal.ja r0 = r1.mo15941E(r0, r2, r3)
            throw r0
        L_0x035c:
            throw r0
        L_0x035d:
            r3 = r13
            r1 = r15
            r1.f19639an = r3
            goto L_0x0363
        L_0x0362:
            throw r0
        L_0x0363:
            goto L_0x0362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4488xv.mo13721L(long, long):void");
    }

    /* renamed from: M */
    public boolean mo13722M() {
        if (this.f19657p != null) {
            if (mo15944H() || m19490aB()) {
                return true;
            }
            if (this.f19616R == C6540C.TIME_UNSET || SystemClock.elapsedRealtime() >= this.f19616R) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public boolean mo13723N() {
        return this.f19636ak;
    }

    /* renamed from: O */
    public final int mo13724O(C4120ke keVar) throws C4089ja {
        try {
            return mo14028P(this.f19645d, keVar);
        } catch (C4496yc e) {
            throw mo15940D(e, keVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract int mo14028P(C4490xx xxVar, C4120ke keVar) throws C4496yc;

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract List<C4486xt> mo14029Q(C4490xx xxVar, C4120ke keVar, boolean z) throws C4496yc;

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public boolean mo16490R(C4120ke keVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public C4270pt mo14030S(C4486xt xtVar, C4120ke keVar, C4120ke keVar2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo14031T(String str, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo14032U(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo14033V(Exception exc) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (m19503aO(r2, r4) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (m19497aI() == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c1, code lost:
        if (m19497aI() == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d5, code lost:
        if (m19497aI() == false) goto L_0x00d7;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ads.interactivemedia.p038v3.internal.C4270pt mo14034W(com.google.ads.interactivemedia.p038v3.internal.C4121kf r13) throws com.google.ads.interactivemedia.p038v3.internal.C4089ja {
        /*
            r12 = this;
            r0 = 1
            r12.f19637al = r0
            com.google.ads.interactivemedia.v3.internal.ke r4 = r13.f17697b
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r4)
            java.lang.String r1 = r4.f17681l
            if (r1 == 0) goto L_0x0118
            com.google.ads.interactivemedia.v3.internal.qb r13 = r13.f17696a
            r12.m19493aE(r13)
            r12.f19657p = r4
            boolean r13 = r12.f19622X
            r1 = 0
            if (r13 == 0) goto L_0x001b
            r12.f19624Z = r0
            return r1
        L_0x001b:
            com.google.ads.interactivemedia.v3.internal.yk r13 = r12.f19643ar
            if (r13 != 0) goto L_0x0025
            r12.f19601C = r1
            r12.mo16785ah()
            return r1
        L_0x0025:
            com.google.ads.interactivemedia.v3.internal.xt r1 = r12.f19603E
            com.google.ads.interactivemedia.v3.internal.ke r3 = r12.f19666y
            com.google.ads.interactivemedia.v3.internal.qb r2 = r12.f19659r
            com.google.ads.interactivemedia.v3.internal.qb r5 = r12.f19660s
            r6 = 23
            if (r2 != r5) goto L_0x0032
            goto L_0x0064
        L_0x0032:
            if (r5 == 0) goto L_0x0109
            if (r2 != 0) goto L_0x0038
            goto L_0x0109
        L_0x0038:
            int r7 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            if (r7 < r6) goto L_0x0109
            java.util.UUID r7 = com.google.ads.interactivemedia.p038v3.internal.C4083iv.f17465e
            java.util.UUID r2 = r2.mo16568d()
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x0109
            java.util.UUID r2 = r5.mo16568d()
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x0109
            com.google.ads.interactivemedia.v3.internal.qm r2 = m19502aN(r5)
            if (r2 == 0) goto L_0x0109
            boolean r5 = r1.f19592f
            if (r5 != 0) goto L_0x0064
            boolean r2 = m19503aO(r2, r4)
            if (r2 == 0) goto L_0x0064
            goto L_0x0109
        L_0x0064:
            com.google.ads.interactivemedia.v3.internal.qb r2 = r12.f19660s
            com.google.ads.interactivemedia.v3.internal.qb r5 = r12.f19659r
            r7 = 0
            if (r2 == r5) goto L_0x0072
            int r8 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            if (r8 < r6) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r6 = 0
            goto L_0x0073
        L_0x0072:
            r6 = 1
        L_0x0073:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r6)
            com.google.ads.interactivemedia.v3.internal.pt r6 = r12.mo14030S(r1, r3, r4)
            int r8 = r6.f18405d
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00ee
            if (r8 == r0) goto L_0x00c4
            if (r8 == r11) goto L_0x0098
            boolean r0 = r12.m19496aH(r4)
            if (r0 != 0) goto L_0x008d
            goto L_0x00ca
        L_0x008d:
            r12.f19666y = r4
            if (r2 == r5) goto L_0x00f1
            boolean r0 = r12.m19497aI()
            if (r0 != 0) goto L_0x00f1
            goto L_0x00d7
        L_0x0098:
            boolean r8 = r12.m19496aH(r4)
            if (r8 != 0) goto L_0x009f
            goto L_0x00ca
        L_0x009f:
            r12.f19626aa = r0
            r12.f19627ab = r0
            int r8 = r12.f19604F
            if (r8 == r11) goto L_0x00b7
            if (r8 != r0) goto L_0x00b6
            int r8 = r4.f17686q
            int r10 = r3.f17686q
            if (r8 != r10) goto L_0x00b6
            int r8 = r4.f17687r
            int r10 = r3.f17687r
            if (r8 != r10) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            r12.f19612N = r0
            r12.f19666y = r4
            if (r2 == r5) goto L_0x00f1
            boolean r0 = r12.m19497aI()
            if (r0 != 0) goto L_0x00f1
            goto L_0x00d7
        L_0x00c4:
            boolean r8 = r12.m19496aH(r4)
            if (r8 != 0) goto L_0x00cd
        L_0x00ca:
            r7 = 16
            goto L_0x00f1
        L_0x00cd:
            r12.f19666y = r4
            if (r2 == r5) goto L_0x00d9
            boolean r0 = r12.m19497aI()
            if (r0 != 0) goto L_0x00f1
        L_0x00d7:
            r7 = 2
            goto L_0x00f1
        L_0x00d9:
            boolean r2 = r12.f19630ae
            if (r2 == 0) goto L_0x00f1
            r12.f19628ac = r0
            boolean r2 = r12.f19606H
            if (r2 != 0) goto L_0x00eb
            boolean r2 = r12.f19608J
            if (r2 == 0) goto L_0x00e8
            goto L_0x00eb
        L_0x00e8:
            r12.f19629ad = r0
            goto L_0x00f1
        L_0x00eb:
            r12.f19629ad = r9
            goto L_0x00d7
        L_0x00ee:
            r12.m19498aJ()
        L_0x00f1:
            int r0 = r6.f18405d
            if (r0 == 0) goto L_0x0108
            com.google.ads.interactivemedia.v3.internal.yk r0 = r12.f19643ar
            if (r0 != r13) goto L_0x00fd
            int r13 = r12.f19629ad
            if (r13 != r9) goto L_0x0108
        L_0x00fd:
            com.google.ads.interactivemedia.v3.internal.pt r13 = new com.google.ads.interactivemedia.v3.internal.pt
            java.lang.String r2 = r1.f19587a
            r5 = 0
            r1 = r13
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x0108:
            return r6
        L_0x0109:
            r12.m19498aJ()
            com.google.ads.interactivemedia.v3.internal.pt r13 = new com.google.ads.interactivemedia.v3.internal.pt
            java.lang.String r2 = r1.f19587a
            r5 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x0118:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            com.google.ads.interactivemedia.v3.internal.ja r13 = r12.mo15940D(r13, r4)
            goto L_0x0123
        L_0x0122:
            throw r13
        L_0x0123:
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4488xv.mo14034W(com.google.ads.interactivemedia.v3.internal.kf):com.google.ads.interactivemedia.v3.internal.pt");
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo14035X(C4120ke keVar, MediaFormat mediaFormat) throws C4089ja {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo14037Z(C4269ps psVar) throws C4089ja {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public void mo14042aa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public void mo16492ab() throws C4089ja {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public abstract void mo14045ae(C4486xt xtVar, C4504yk ykVar, C4120ke keVar, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public abstract boolean mo14046af(long j, long j2, C4504yk ykVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C4120ke keVar) throws C4089ja;

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public float mo14047ag(float f, C4120ke[] keVarArr) {
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: boolean} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0273, code lost:
        if ("OMX.SEC.avc.dec.secure".equals(r0) == false) goto L_0x0275;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0258 A[Catch:{ Exception -> 0x03e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x025a A[Catch:{ Exception -> 0x03e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0263 A[Catch:{ Exception -> 0x03e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a1 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a3 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a8 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02b5 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02e5 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02e7 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0346 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0348 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0351 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0392 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0393 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03a7 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03b5 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03de A[Catch:{ Exception -> 0x03e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0411 A[Catch:{ yc -> 0x0129, xu -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0414 A[Catch:{ yc -> 0x0129, xu -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0426 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0422 A[SYNTHETIC] */
    /* renamed from: ah */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16785ah() throws com.google.ads.interactivemedia.p038v3.internal.C4089ja {
        /*
            r20 = this;
            r7 = r20
            com.google.ads.interactivemedia.v3.internal.yk r0 = r7.f19643ar
            if (r0 != 0) goto L_0x0441
            boolean r0 = r7.f19622X
            if (r0 != 0) goto L_0x0441
            com.google.ads.interactivemedia.v3.internal.ke r0 = r7.f19657p
            if (r0 != 0) goto L_0x0010
            goto L_0x0441
        L_0x0010:
            com.google.ads.interactivemedia.v3.internal.qb r1 = r7.f19660s
            r8 = 1
            if (r1 != 0) goto L_0x004a
            boolean r0 = r7.mo16490R(r0)
            if (r0 == 0) goto L_0x004a
            com.google.ads.interactivemedia.v3.internal.ke r0 = r7.f19657p
            r20.mo16491Y()
            java.lang.String r0 = r0.f17681l
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0040
            com.google.ads.interactivemedia.v3.internal.xo r0 = r7.f19650i
            r0.mo16771l(r8)
            goto L_0x0047
        L_0x0040:
            com.google.ads.interactivemedia.v3.internal.xo r0 = r7.f19650i
            r1 = 32
            r0.mo16771l(r1)
        L_0x0047:
            r7.f19622X = r8
            return
        L_0x004a:
            com.google.ads.interactivemedia.v3.internal.qb r0 = r7.f19660s
            r7.m19494aF(r0)
            com.google.ads.interactivemedia.v3.internal.ke r0 = r7.f19657p
            java.lang.String r0 = r0.f17681l
            com.google.ads.interactivemedia.v3.internal.qb r1 = r7.f19659r
            r9 = 0
            if (r1 == 0) goto L_0x00ad
            android.media.MediaCrypto r2 = r7.f19661t
            if (r2 != 0) goto L_0x008f
            com.google.ads.interactivemedia.v3.internal.qm r1 = m19502aN(r1)
            if (r1 != 0) goto L_0x006c
            com.google.ads.interactivemedia.v3.internal.qb r0 = r7.f19659r
            com.google.ads.interactivemedia.v3.internal.qa r0 = r0.mo16567c()
            if (r0 == 0) goto L_0x006b
            goto L_0x008f
        L_0x006b:
            return
        L_0x006c:
            android.media.MediaCrypto r2 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x0087 }
            java.util.UUID r3 = r1.f18431b     // Catch:{ MediaCryptoException -> 0x0087 }
            byte[] r4 = r1.f18432c     // Catch:{ MediaCryptoException -> 0x0087 }
            r2.<init>(r3, r4)     // Catch:{ MediaCryptoException -> 0x0087 }
            r7.f19661t = r2     // Catch:{ MediaCryptoException -> 0x0087 }
            boolean r1 = r1.f18433d
            if (r1 != 0) goto L_0x0083
            boolean r0 = r2.requiresSecureDecoderComponent(r0)
            if (r0 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            r7.f19662u = r0
            goto L_0x008f
        L_0x0087:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.ke r1 = r7.f19657p
            com.google.ads.interactivemedia.v3.internal.ja r0 = r7.mo15940D(r0, r1)
            throw r0
        L_0x008f:
            boolean r0 = com.google.ads.interactivemedia.p038v3.internal.C4290qm.f18430a
            if (r0 == 0) goto L_0x00ad
            com.google.ads.interactivemedia.v3.internal.qb r0 = r7.f19659r
            int r0 = r0.mo16565a()
            if (r0 == r8) goto L_0x00a0
            r1 = 4
            if (r0 != r1) goto L_0x009f
            goto L_0x00ad
        L_0x009f:
            return
        L_0x00a0:
            com.google.ads.interactivemedia.v3.internal.qb r0 = r7.f19659r
            com.google.ads.interactivemedia.v3.internal.qa r0 = r0.mo16567c()
            com.google.ads.interactivemedia.v3.internal.ke r1 = r7.f19657p
            com.google.ads.interactivemedia.v3.internal.ja r0 = r7.mo15940D(r0, r1)
            throw r0
        L_0x00ad:
            android.media.MediaCrypto r10 = r7.f19661t     // Catch:{ xu -> 0x0439 }
            boolean r11 = r7.f19662u     // Catch:{ xu -> 0x0439 }
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.xt> r0 = r7.f19601C     // Catch:{ xu -> 0x0439 }
            java.lang.String r12 = "MediaCodecRenderer"
            r13 = 0
            if (r0 != 0) goto L_0x0135
            com.google.ads.interactivemedia.v3.internal.xx r0 = r7.f19645d     // Catch:{ yc -> 0x0129 }
            com.google.ads.interactivemedia.v3.internal.ke r1 = r7.f19657p     // Catch:{ yc -> 0x0129 }
            java.util.List r0 = r7.mo14029Q(r0, r1, r11)     // Catch:{ yc -> 0x0129 }
            boolean r1 = r0.isEmpty()     // Catch:{ yc -> 0x0129 }
            if (r1 == 0) goto L_0x010e
            if (r11 == 0) goto L_0x010e
            com.google.ads.interactivemedia.v3.internal.xx r0 = r7.f19645d     // Catch:{ yc -> 0x0129 }
            com.google.ads.interactivemedia.v3.internal.ke r1 = r7.f19657p     // Catch:{ yc -> 0x0129 }
            java.util.List r0 = r7.mo14029Q(r0, r1, r9)     // Catch:{ yc -> 0x0129 }
            boolean r1 = r0.isEmpty()     // Catch:{ yc -> 0x0129 }
            if (r1 != 0) goto L_0x010e
            com.google.ads.interactivemedia.v3.internal.ke r1 = r7.f19657p     // Catch:{ yc -> 0x0129 }
            java.lang.String r1 = r1.f17681l     // Catch:{ yc -> 0x0129 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ yc -> 0x0129 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ yc -> 0x0129 }
            int r3 = r3.length()     // Catch:{ yc -> 0x0129 }
            int r3 = r3 + 99
            int r4 = r2.length()     // Catch:{ yc -> 0x0129 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ yc -> 0x0129 }
            r4.<init>(r3)     // Catch:{ yc -> 0x0129 }
            java.lang.String r3 = "Drm session requires secure decoder for "
            r4.append(r3)     // Catch:{ yc -> 0x0129 }
            r4.append(r1)     // Catch:{ yc -> 0x0129 }
            java.lang.String r1 = ", but no secure decoder available. Trying to proceed with "
            r4.append(r1)     // Catch:{ yc -> 0x0129 }
            r4.append(r2)     // Catch:{ yc -> 0x0129 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ yc -> 0x0129 }
            java.lang.String r1 = r4.toString()     // Catch:{ yc -> 0x0129 }
            android.util.Log.w(r12, r1)     // Catch:{ yc -> 0x0129 }
        L_0x010e:
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ yc -> 0x0129 }
            r1.<init>()     // Catch:{ yc -> 0x0129 }
            r7.f19601C = r1     // Catch:{ yc -> 0x0129 }
            boolean r1 = r0.isEmpty()     // Catch:{ yc -> 0x0129 }
            if (r1 != 0) goto L_0x0126
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.xt> r1 = r7.f19601C     // Catch:{ yc -> 0x0129 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ yc -> 0x0129 }
            com.google.ads.interactivemedia.v3.internal.xt r0 = (com.google.ads.interactivemedia.p038v3.internal.C4486xt) r0     // Catch:{ yc -> 0x0129 }
            r1.add(r0)     // Catch:{ yc -> 0x0129 }
        L_0x0126:
            r7.f19602D = r13     // Catch:{ yc -> 0x0129 }
            goto L_0x0135
        L_0x0129:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.xu r1 = new com.google.ads.interactivemedia.v3.internal.xu     // Catch:{ xu -> 0x0439 }
            com.google.ads.interactivemedia.v3.internal.ke r2 = r7.f19657p     // Catch:{ xu -> 0x0439 }
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.ads.interactivemedia.p038v3.internal.C4120ke) r2, (java.lang.Throwable) r0, (boolean) r11, (int) r3)     // Catch:{ xu -> 0x0439 }
            throw r1     // Catch:{ xu -> 0x0439 }
        L_0x0135:
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.xt> r0 = r7.f19601C     // Catch:{ xu -> 0x0439 }
            boolean r0 = r0.isEmpty()     // Catch:{ xu -> 0x0439 }
            if (r0 != 0) goto L_0x042d
        L_0x013d:
            com.google.ads.interactivemedia.v3.internal.yk r0 = r7.f19643ar     // Catch:{ xu -> 0x0439 }
            if (r0 != 0) goto L_0x0429
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.xt> r0 = r7.f19601C     // Catch:{ xu -> 0x0439 }
            java.lang.Object r0 = r0.peekFirst()     // Catch:{ xu -> 0x0439 }
            r14 = r0
            com.google.ads.interactivemedia.v3.internal.xt r14 = (com.google.ads.interactivemedia.p038v3.internal.C4486xt) r14     // Catch:{ xu -> 0x0439 }
            boolean r0 = r7.mo14048ai(r14)     // Catch:{ xu -> 0x0439 }
            if (r0 != 0) goto L_0x0151
            return
        L_0x0151:
            java.lang.String r0 = r14.f19587a     // Catch:{ Exception -> 0x03e2 }
            int r15 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a     // Catch:{ Exception -> 0x03e2 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 23
            if (r15 >= r6) goto L_0x015e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0168
        L_0x015e:
            float r2 = r7.f19665x     // Catch:{ Exception -> 0x03e2 }
            com.google.ads.interactivemedia.v3.internal.ke[] r3 = r20.mo15938B()     // Catch:{ Exception -> 0x03e2 }
            float r2 = r7.mo14047ag(r2, r3)     // Catch:{ Exception -> 0x03e2 }
        L_0x0168:
            float r3 = r7.f19646e     // Catch:{ Exception -> 0x03e2 }
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0171
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0172
        L_0x0171:
            r5 = r2
        L_0x0172:
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03da }
            java.lang.String r1 = "createCodec:"
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x03da }
            int r3 = r2.length()     // Catch:{ Exception -> 0x03da }
            if (r3 == 0) goto L_0x0187
            java.lang.String r1 = r1.concat(r2)     // Catch:{ Exception -> 0x03da }
            goto L_0x018d
        L_0x0187:
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x03da }
            r2.<init>(r1)     // Catch:{ Exception -> 0x03da }
            r1 = r2
        L_0x018d:
            com.google.ads.interactivemedia.p038v3.internal.age.m13544b(r1)     // Catch:{ Exception -> 0x03da }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x03da }
            com.google.ads.interactivemedia.v3.internal.yk r4 = new com.google.ads.interactivemedia.v3.internal.yk     // Catch:{ Exception -> 0x03da }
            r4.<init>(r1)     // Catch:{ Exception -> 0x03da }
            com.google.ads.interactivemedia.p038v3.internal.age.m13545c()     // Catch:{ Exception -> 0x03d6 }
            java.lang.String r1 = "configureCodec"
            com.google.ads.interactivemedia.p038v3.internal.age.m13544b(r1)     // Catch:{ Exception -> 0x03d6 }
            com.google.ads.interactivemedia.v3.internal.ke r3 = r7.f19657p     // Catch:{ Exception -> 0x03d6 }
            r1 = r20
            r2 = r14
            r18 = r3
            r3 = r4
            r19 = r4
            r4 = r18
            r18 = r5
            r5 = r10
            r9 = 23
            r6 = r18
            r1.mo14045ae(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x03d2 }
            com.google.ads.interactivemedia.p038v3.internal.age.m13545c()     // Catch:{ Exception -> 0x03d2 }
            java.lang.String r1 = "startCodec"
            com.google.ads.interactivemedia.p038v3.internal.age.m13544b(r1)     // Catch:{ Exception -> 0x03d2 }
            r19.mo16812a()     // Catch:{ Exception -> 0x03d2 }
            com.google.ads.interactivemedia.p038v3.internal.age.m13545c()     // Catch:{ Exception -> 0x03d2 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03d2 }
            r1 = r19
            r7.f19643ar = r1     // Catch:{ Exception -> 0x03e2 }
            r7.f19603E = r14     // Catch:{ Exception -> 0x03e2 }
            r1 = r18
            r7.f19600B = r1     // Catch:{ Exception -> 0x03e2 }
            com.google.ads.interactivemedia.v3.internal.ke r1 = r7.f19657p     // Catch:{ Exception -> 0x03e2 }
            r7.f19666y = r1     // Catch:{ Exception -> 0x03e2 }
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r2 = 25
            if (r15 > r2) goto L_0x0207
            boolean r6 = r1.equals(r0)     // Catch:{ Exception -> 0x03e2 }
            if (r6 == 0) goto L_0x0207
            java.lang.String r6 = com.google.ads.interactivemedia.p038v3.internal.amm.f15301d     // Catch:{ Exception -> 0x03e2 }
            java.lang.String r13 = "SM-T585"
            boolean r13 = r6.startsWith(r13)     // Catch:{ Exception -> 0x03e2 }
            if (r13 != 0) goto L_0x0205
            java.lang.String r13 = "SM-A510"
            boolean r13 = r6.startsWith(r13)     // Catch:{ Exception -> 0x03e2 }
            if (r13 != 0) goto L_0x0205
            java.lang.String r13 = "SM-A520"
            boolean r13 = r6.startsWith(r13)     // Catch:{ Exception -> 0x03e2 }
            if (r13 != 0) goto L_0x0205
            java.lang.String r13 = "SM-J700"
            boolean r6 = r6.startsWith(r13)     // Catch:{ Exception -> 0x03e2 }
            if (r6 == 0) goto L_0x0207
        L_0x0205:
            r6 = 2
            goto L_0x0240
        L_0x0207:
            r6 = 24
            if (r15 >= r6) goto L_0x023f
            java.lang.String r6 = "OMX.Nvidia.h264.decode"
            boolean r6 = r6.equals(r0)     // Catch:{ Exception -> 0x03e2 }
            if (r6 != 0) goto L_0x021b
            java.lang.String r6 = "OMX.Nvidia.h264.decode.secure"
            boolean r6 = r6.equals(r0)     // Catch:{ Exception -> 0x03e2 }
            if (r6 == 0) goto L_0x023f
        L_0x021b:
            java.lang.String r6 = "flounder"
            java.lang.String r13 = com.google.ads.interactivemedia.p038v3.internal.amm.f15299b     // Catch:{ Exception -> 0x03e2 }
            boolean r6 = r6.equals(r13)     // Catch:{ Exception -> 0x03e2 }
            if (r6 != 0) goto L_0x023d
            java.lang.String r6 = "flounder_lte"
            boolean r6 = r6.equals(r13)     // Catch:{ Exception -> 0x03e2 }
            if (r6 != 0) goto L_0x023d
            java.lang.String r6 = "grouper"
            boolean r6 = r6.equals(r13)     // Catch:{ Exception -> 0x03e2 }
            if (r6 != 0) goto L_0x023d
            java.lang.String r6 = "tilapia"
            boolean r6 = r6.equals(r13)     // Catch:{ Exception -> 0x03e2 }
            if (r6 == 0) goto L_0x023f
        L_0x023d:
            r6 = 1
            goto L_0x0240
        L_0x023f:
            r6 = 0
        L_0x0240:
            r7.f19604F = r6     // Catch:{ Exception -> 0x03e2 }
            com.google.ads.interactivemedia.v3.internal.ke r6 = r7.f19666y     // Catch:{ Exception -> 0x03e2 }
            r13 = 21
            if (r15 >= r13) goto L_0x025a
            java.util.List<byte[]> r6 = r6.f17683n     // Catch:{ Exception -> 0x03e2 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x03e2 }
            if (r6 == 0) goto L_0x025a
            java.lang.String r6 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r6 = r6.equals(r0)     // Catch:{ Exception -> 0x03e2 }
            if (r6 == 0) goto L_0x025a
            r6 = 1
            goto L_0x025b
        L_0x025a:
            r6 = 0
        L_0x025b:
            r7.f19605G = r6     // Catch:{ Exception -> 0x03e2 }
            r6 = 19
            r5 = 18
            if (r15 < r5) goto L_0x0292
            if (r15 != r5) goto L_0x0275
            java.lang.String r2 = "OMX.SEC.avc.dec"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03e2 }
            if (r2 != 0) goto L_0x0293
            java.lang.String r2 = "OMX.SEC.avc.dec.secure"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03e2 }
            if (r2 != 0) goto L_0x0293
        L_0x0275:
            if (r15 != r6) goto L_0x0290
            java.lang.String r2 = com.google.ads.interactivemedia.p038v3.internal.amm.f15301d     // Catch:{ Exception -> 0x03e2 }
            java.lang.String r8 = "SM-G800"
            boolean r2 = r2.startsWith(r8)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x0290
            java.lang.String r2 = "OMX.Exynos.avc.dec"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r2 != 0) goto L_0x0292
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r1 == 0) goto L_0x0290
            goto L_0x0292
        L_0x0290:
            r8 = 0
            goto L_0x0293
        L_0x0292:
            r8 = 1
        L_0x0293:
            r7.f19606H = r8     // Catch:{ Exception -> 0x03cf }
            r1 = 29
            if (r15 != r1) goto L_0x02a3
            java.lang.String r2 = "c2.android.aac.decoder"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x02a3
            r2 = 1
            goto L_0x02a4
        L_0x02a3:
            r2 = 0
        L_0x02a4:
            r7.f19607I = r2     // Catch:{ Exception -> 0x03cf }
            if (r15 > r9) goto L_0x02b3
            java.lang.String r2 = "OMX.google.vorbis.decoder"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r2 != 0) goto L_0x02b1
            goto L_0x02b3
        L_0x02b1:
            r2 = 1
            goto L_0x02d9
        L_0x02b3:
            if (r15 > r6) goto L_0x02d8
            java.lang.String r2 = "hb2000"
            java.lang.String r6 = com.google.ads.interactivemedia.p038v3.internal.amm.f15299b     // Catch:{ Exception -> 0x03cf }
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x03cf }
            if (r2 != 0) goto L_0x02c7
            java.lang.String r2 = "stvm8"
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x02d8
        L_0x02c7:
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r2 != 0) goto L_0x02b1
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x02d8
            goto L_0x02b1
        L_0x02d8:
            r2 = 0
        L_0x02d9:
            r7.f19608J = r2     // Catch:{ Exception -> 0x03cf }
            if (r15 != r13) goto L_0x02e7
            java.lang.String r2 = "OMX.google.aac.decoder"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x02e7
            r2 = 1
            goto L_0x02e8
        L_0x02e7:
            r2 = 0
        L_0x02e8:
            r7.f19609K = r2     // Catch:{ Exception -> 0x03cf }
            if (r15 >= r13) goto L_0x0332
            java.lang.String r2 = "OMX.SEC.mp3.dec"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x0332
            java.lang.String r2 = "samsung"
            java.lang.String r6 = com.google.ads.interactivemedia.p038v3.internal.amm.f15300c     // Catch:{ Exception -> 0x03cf }
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x0332
            java.lang.String r2 = com.google.ads.interactivemedia.p038v3.internal.amm.f15299b     // Catch:{ Exception -> 0x03cf }
            java.lang.String r6 = "baffin"
            boolean r6 = r2.startsWith(r6)     // Catch:{ Exception -> 0x03cf }
            if (r6 != 0) goto L_0x0330
            java.lang.String r6 = "grand"
            boolean r6 = r2.startsWith(r6)     // Catch:{ Exception -> 0x03cf }
            if (r6 != 0) goto L_0x0330
            java.lang.String r6 = "fortuna"
            boolean r6 = r2.startsWith(r6)     // Catch:{ Exception -> 0x03cf }
            if (r6 != 0) goto L_0x0330
            java.lang.String r6 = "gprimelte"
            boolean r6 = r2.startsWith(r6)     // Catch:{ Exception -> 0x03cf }
            if (r6 != 0) goto L_0x0330
            java.lang.String r6 = "j2y18lte"
            boolean r6 = r2.startsWith(r6)     // Catch:{ Exception -> 0x03cf }
            if (r6 != 0) goto L_0x0330
            java.lang.String r6 = "ms01"
            boolean r2 = r2.startsWith(r6)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x0332
        L_0x0330:
            r2 = 1
            goto L_0x0333
        L_0x0332:
            r2 = 0
        L_0x0333:
            r7.f19610L = r2     // Catch:{ Exception -> 0x03cf }
            com.google.ads.interactivemedia.v3.internal.ke r2 = r7.f19666y     // Catch:{ Exception -> 0x03cf }
            if (r15 > r5) goto L_0x0348
            int r2 = r2.f17694y     // Catch:{ Exception -> 0x03cf }
            r5 = 1
            if (r2 != r5) goto L_0x0348
            java.lang.String r2 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r2 = r2.equals(r0)     // Catch:{ Exception -> 0x03cf }
            if (r2 == 0) goto L_0x0348
            r5 = 1
            goto L_0x0349
        L_0x0348:
            r5 = 0
        L_0x0349:
            r7.f19611M = r5     // Catch:{ Exception -> 0x03cf }
            java.lang.String r2 = r14.f19587a     // Catch:{ Exception -> 0x03cf }
            r5 = 25
            if (r15 > r5) goto L_0x035c
            java.lang.String r5 = "OMX.rk.video_decoder.avc"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x03cf }
            if (r5 != 0) goto L_0x035a
            goto L_0x035c
        L_0x035a:
            r5 = 1
            goto L_0x039b
        L_0x035c:
            r5 = 17
            if (r15 > r5) goto L_0x0368
            java.lang.String r5 = "OMX.allwinner.video.decoder.avc"
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x03cf }
            if (r5 != 0) goto L_0x035a
        L_0x0368:
            if (r15 > r1) goto L_0x037a
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03cf }
            if (r1 != 0) goto L_0x035a
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03cf }
            if (r1 != 0) goto L_0x035a
        L_0x037a:
            java.lang.String r1 = "Amazon"
            java.lang.String r2 = com.google.ads.interactivemedia.p038v3.internal.amm.f15300c     // Catch:{ Exception -> 0x03cf }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03cf }
            if (r1 == 0) goto L_0x0393
            java.lang.String r1 = "AFTS"
            java.lang.String r2 = com.google.ads.interactivemedia.p038v3.internal.amm.f15301d     // Catch:{ Exception -> 0x03cf }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03cf }
            if (r1 == 0) goto L_0x0393
            boolean r1 = r14.f19592f     // Catch:{ Exception -> 0x03cf }
            if (r1 == 0) goto L_0x0393
            goto L_0x035a
        L_0x0393:
            boolean r1 = r20.mo14049aj()     // Catch:{ Exception -> 0x03cf }
            if (r1 == 0) goto L_0x039a
            goto L_0x035a
        L_0x039a:
            r5 = 0
        L_0x039b:
            r7.f19614P = r5     // Catch:{ Exception -> 0x03cf }
            java.lang.String r1 = "c2.android.mp3.decoder"
            java.lang.String r2 = r14.f19587a     // Catch:{ Exception -> 0x03cf }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x03cf }
            if (r1 == 0) goto L_0x03ae
            com.google.ads.interactivemedia.v3.internal.xp r1 = new com.google.ads.interactivemedia.v3.internal.xp     // Catch:{ Exception -> 0x03cf }
            r1.<init>()     // Catch:{ Exception -> 0x03cf }
            r7.f19615Q = r1     // Catch:{ Exception -> 0x03cf }
        L_0x03ae:
            int r1 = r20.mo15952e()     // Catch:{ Exception -> 0x03cf }
            r2 = 2
            if (r1 != r2) goto L_0x03be
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x03cf }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r5
            r7.f19616R = r1     // Catch:{ Exception -> 0x03cf }
        L_0x03be:
            com.google.ads.interactivemedia.v3.internal.pp r1 = r7.f19625a     // Catch:{ Exception -> 0x03cf }
            int r2 = r1.f18385a     // Catch:{ Exception -> 0x03cf }
            r8 = 1
            int r2 = r2 + r8
            r1.f18385a = r2     // Catch:{ Exception -> 0x03e2 }
            long r5 = r3 - r16
            r1 = r20
            r2 = r0
            r1.mo14031T(r2, r3, r5)     // Catch:{ Exception -> 0x03e2 }
            goto L_0x0422
        L_0x03cf:
            r0 = move-exception
            r8 = 1
            goto L_0x03e3
        L_0x03d2:
            r0 = move-exception
            r1 = r19
            goto L_0x03d8
        L_0x03d6:
            r0 = move-exception
            r1 = r4
        L_0x03d8:
            r4 = r1
            goto L_0x03dc
        L_0x03da:
            r0 = move-exception
            r4 = 0
        L_0x03dc:
            if (r4 == 0) goto L_0x03e1
            r4.mo16821j()     // Catch:{ Exception -> 0x03e2 }
        L_0x03e1:
            throw r0     // Catch:{ Exception -> 0x03e2 }
        L_0x03e2:
            r0 = move-exception
        L_0x03e3:
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ xu -> 0x0439 }
            int r2 = r1.length()     // Catch:{ xu -> 0x0439 }
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ xu -> 0x0439 }
            r3.<init>(r2)     // Catch:{ xu -> 0x0439 }
            java.lang.String r2 = "Failed to initialize decoder: "
            r3.append(r2)     // Catch:{ xu -> 0x0439 }
            r3.append(r1)     // Catch:{ xu -> 0x0439 }
            java.lang.String r1 = r3.toString()     // Catch:{ xu -> 0x0439 }
            com.google.ads.interactivemedia.p038v3.internal.ali.m14022a(r12, r1, r0)     // Catch:{ xu -> 0x0439 }
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.xt> r1 = r7.f19601C     // Catch:{ xu -> 0x0439 }
            r1.removeFirst()     // Catch:{ xu -> 0x0439 }
            com.google.ads.interactivemedia.v3.internal.xu r1 = new com.google.ads.interactivemedia.v3.internal.xu     // Catch:{ xu -> 0x0439 }
            com.google.ads.interactivemedia.v3.internal.ke r2 = r7.f19657p     // Catch:{ xu -> 0x0439 }
            r1.<init>((com.google.ads.interactivemedia.p038v3.internal.C4120ke) r2, (java.lang.Throwable) r0, (boolean) r11, (com.google.ads.interactivemedia.p038v3.internal.C4486xt) r14)     // Catch:{ xu -> 0x0439 }
            com.google.ads.interactivemedia.v3.internal.xu r0 = r7.f19602D     // Catch:{ xu -> 0x0439 }
            if (r0 != 0) goto L_0x0414
            r7.f19602D = r1     // Catch:{ xu -> 0x0439 }
            goto L_0x041a
        L_0x0414:
            com.google.ads.interactivemedia.v3.internal.xu r0 = com.google.ads.interactivemedia.p038v3.internal.C4487xu.m19487a(r0, r1)     // Catch:{ xu -> 0x0439 }
            r7.f19602D = r0     // Catch:{ xu -> 0x0439 }
        L_0x041a:
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.xt> r0 = r7.f19601C     // Catch:{ xu -> 0x0439 }
            boolean r0 = r0.isEmpty()     // Catch:{ xu -> 0x0439 }
            if (r0 != 0) goto L_0x0426
        L_0x0422:
            r9 = 0
            r13 = 0
            goto L_0x013d
        L_0x0426:
            com.google.ads.interactivemedia.v3.internal.xu r0 = r7.f19602D     // Catch:{ xu -> 0x0439 }
            throw r0     // Catch:{ xu -> 0x0439 }
        L_0x0429:
            r1 = r13
            r7.f19601C = r1     // Catch:{ xu -> 0x0439 }
            return
        L_0x042d:
            com.google.ads.interactivemedia.v3.internal.xu r0 = new com.google.ads.interactivemedia.v3.internal.xu     // Catch:{ xu -> 0x0439 }
            com.google.ads.interactivemedia.v3.internal.ke r1 = r7.f19657p     // Catch:{ xu -> 0x0439 }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r3 = 0
            r0.<init>((com.google.ads.interactivemedia.p038v3.internal.C4120ke) r1, (java.lang.Throwable) r3, (boolean) r11, (int) r2)     // Catch:{ xu -> 0x0439 }
            throw r0     // Catch:{ xu -> 0x0439 }
        L_0x0439:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.ke r1 = r7.f19657p
            com.google.ads.interactivemedia.v3.internal.ja r0 = r7.mo15940D(r0, r1)
            throw r0
        L_0x0441:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4488xv.mo16785ah():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public boolean mo14048ai(C4486xt xtVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aj */
    public boolean mo14049aj() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public final void mo16786ak(C4089ja jaVar) {
        this.f19639an = jaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public final void mo16787al(long j) throws C4089ja {
        C4120ke e = this.f19651j.mo13992e(j);
        if (e == null && this.f19599A) {
            e = this.f19651j.mo13991d();
        }
        if (e != null) {
            this.f19658q = e;
        } else if (!this.f19599A || this.f19658q == null) {
            return;
        }
        mo14035X(this.f19658q, this.f19667z);
        this.f19599A = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public final C4486xt mo16788am() {
        return this.f19603E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public final void mo16789an() {
        try {
            C4504yk ykVar = this.f19643ar;
            if (ykVar != null) {
                ykVar.mo16821j();
                this.f19625a.f18386b++;
                mo14032U(this.f19603E.f19587a);
            }
            this.f19643ar = null;
            try {
                MediaCrypto mediaCrypto = this.f19661t;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f19661t = null;
                m19494aF((C4279qb) null);
                mo16791aq();
            }
        } catch (Throwable th) {
            this.f19643ar = null;
            MediaCrypto mediaCrypto2 = this.f19661t;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.f19661t = null;
            m19494aF((C4279qb) null);
            mo16791aq();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ao */
    public final boolean mo16790ao() {
        if (this.f19643ar == null) {
            return false;
        }
        if (this.f19629ad == 3 || this.f19606H || ((this.f19607I && !this.f19632ag) || (this.f19608J && this.f19631af))) {
            mo16789an();
            return true;
        }
        m19504ac();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public void mo14050ap() {
        m19491aC();
        m19492aD();
        this.f19616R = C6540C.TIME_UNSET;
        this.f19631af = false;
        this.f19630ae = false;
        this.f19612N = false;
        this.f19613O = false;
        this.f19620V = false;
        this.f19621W = false;
        this.f19652k.clear();
        this.f19633ah = C6540C.TIME_UNSET;
        this.f19634ai = C6540C.TIME_UNSET;
        C4482xp xpVar = this.f19615Q;
        if (xpVar != null) {
            xpVar.mo16776a();
        }
        this.f19628ac = 0;
        this.f19629ad = 0;
        this.f19627ab = this.f19626aa ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aq */
    public final void mo16791aq() {
        mo14050ap();
        this.f19639an = null;
        this.f19615Q = null;
        this.f19601C = null;
        this.f19603E = null;
        this.f19666y = null;
        this.f19667z = null;
        this.f19599A = false;
        this.f19632ag = false;
        this.f19600B = -1.0f;
        this.f19604F = 0;
        this.f19605G = false;
        this.f19606H = false;
        this.f19607I = false;
        this.f19608J = false;
        this.f19609K = false;
        this.f19610L = false;
        this.f19611M = false;
        this.f19614P = false;
        this.f19626aa = false;
        this.f19627ab = 0;
        this.f19662u = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public C4485xs mo14051ar(Throwable th, C4486xt xtVar) {
        return new C4485xs(th, xtVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public void mo14052as(C4269ps psVar) throws C4089ja {
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public void mo14053at(long j) {
        while (true) {
            int i = this.f19642aq;
            if (i != 0 && j >= this.f19656o[0]) {
                long[] jArr = this.f19654m;
                this.f19640ao = jArr[0];
                this.f19641ap = this.f19655n[0];
                int i2 = i - 1;
                this.f19642aq = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f19655n;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f19642aq);
                long[] jArr3 = this.f19656o;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f19642aq);
                mo14042aa();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: au */
    public final float mo16792au() {
        return this.f19664w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: av */
    public final void mo16793av() {
        this.f19638am = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aw */
    public final long mo16794aw() {
        return this.f19641ap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public final C4504yk mo16795ay() {
        return this.f19643ar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public final void mo16796az() throws C4089ja {
        if (mo16790ao()) {
            mo16785ah();
        }
    }

    /* renamed from: s */
    public final int mo15963s() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo14055u(boolean z, boolean z2) throws C4089ja {
        this.f19625a = new C4266pp();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo13726v(long j, boolean z) throws C4089ja {
        this.f19635aj = false;
        this.f19636ak = false;
        this.f19638am = false;
        if (this.f19622X) {
            this.f19650i.mo16508a();
            this.f19649h.mo16508a();
            this.f19623Y = false;
        } else {
            mo16796az();
        }
        if (this.f19651j.mo13990c() > 0) {
            this.f19637al = true;
        }
        this.f19651j.mo13989b();
        int i = this.f19642aq;
        if (i != 0) {
            int i2 = i - 1;
            this.f19641ap = this.f19655n[i2];
            this.f19640ao = this.f19654m[i2];
            this.f19642aq = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo13727y() {
        this.f19657p = null;
        this.f19640ao = C6540C.TIME_UNSET;
        this.f19641ap = C6540C.TIME_UNSET;
        this.f19642aq = 0;
        if (this.f19660s == null && this.f19659r == null) {
            mo16790ao();
        } else {
            mo14058z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo14058z() {
        try {
            mo16491Y();
            mo16789an();
        } finally {
            m19493aE((C4279qb) null);
        }
    }
}
