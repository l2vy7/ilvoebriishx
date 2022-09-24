package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afx */
/* compiled from: IMASDK */
final class afx extends adl {

    /* renamed from: p */
    private static final AtomicInteger f14563p = new AtomicInteger();

    /* renamed from: A */
    private final boolean f14564A;

    /* renamed from: B */
    private final boolean f14565B;

    /* renamed from: C */
    private agi f14566C;

    /* renamed from: D */
    private int f14567D;

    /* renamed from: E */
    private boolean f14568E;

    /* renamed from: F */
    private volatile boolean f14569F;

    /* renamed from: G */
    private boolean f14570G;

    /* renamed from: H */
    private atz<Integer> f14571H;

    /* renamed from: I */
    private boolean f14572I;

    /* renamed from: J */
    private boolean f14573J;

    /* renamed from: K */
    private final afl f14574K;

    /* renamed from: L */
    private afl f14575L;

    /* renamed from: a */
    public final int f14576a;

    /* renamed from: b */
    public final int f14577b;

    /* renamed from: m */
    public final Uri f14578m;

    /* renamed from: n */
    public final boolean f14579n;

    /* renamed from: o */
    public final int f14580o;

    /* renamed from: q */
    private final ajg f14581q;

    /* renamed from: r */
    private final ajk f14582r;

    /* renamed from: s */
    private final boolean f14583s;

    /* renamed from: t */
    private final boolean f14584t;

    /* renamed from: u */
    private final amk f14585u;

    /* renamed from: v */
    private final afw f14586v;

    /* renamed from: w */
    private final List<C4120ke> f14587w;

    /* renamed from: x */
    private final C4276pz f14588x;

    /* renamed from: y */
    private final C4529zi f14589y;

    /* renamed from: z */
    private final alw f14590z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private afx(afw afw, ajg ajg, ajk ajk, C4120ke keVar, boolean z, ajg ajg2, ajk ajk2, boolean z2, Uri uri, List list, int i, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, amk amk, C4276pz pzVar, afl afl, C4529zi ziVar, alw alw, boolean z6) {
        super(ajg, ajk, keVar, i, j, j2, j3);
        ajk ajk3 = ajk2;
        this.f14564A = z;
        this.f14580o = i2;
        this.f14573J = z3;
        this.f14577b = i3;
        this.f14582r = ajk3;
        this.f14581q = ajg2;
        this.f14568E = ajk3 != null;
        this.f14565B = z2;
        this.f14578m = uri;
        this.f14583s = z5;
        this.f14585u = amk;
        this.f14584t = z4;
        this.f14586v = afw;
        this.f14587w = list;
        this.f14588x = pzVar;
        this.f14574K = afl;
        this.f14589y = ziVar;
        this.f14590z = alw;
        this.f14579n = z6;
        this.f14571H = atz.m14807i();
        this.f14576a = f14563p.getAndIncrement();
    }

    /* renamed from: m */
    public static afx m13491m(afw afw, ajg ajg, C4120ke keVar, long j, ahd ahd, afu afu, Uri uri, List<C4120ke> list, int i, boolean z, agn agn, afx afx, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        boolean z2;
        ajk ajk;
        ajg ajg2;
        boolean z3;
        alw alw;
        C4529zi ziVar;
        afl afl;
        boolean z4;
        byte[] bArr4;
        ajg ajg3 = ajg;
        ahd ahd2 = ahd;
        afu afu2 = afu;
        afx afx2 = afx;
        byte[] bArr5 = bArr;
        byte[] bArr6 = bArr2;
        ahb ahb = afu2.f14540a;
        ajj ajj = new ajj();
        ajj.mo13811f(arh.m14605l(ahd2.f14811r, ahb.f14778c));
        ajj.mo13810e(ahb.f14786k);
        ajj.mo13809d(ahb.f14787l);
        ajj.mo13807b(true != afu2.f14543d ? 0 : 8);
        ajk a = ajj.mo13806a();
        boolean z5 = bArr5 != null;
        if (z5) {
            String str = ahb.f14785j;
            aup.m14890u(str);
            bArr3 = m13494p(str);
        } else {
            bArr3 = null;
        }
        ajg q = m13495q(ajg3, bArr5, bArr3);
        aha aha = ahb.f14779d;
        if (aha != null) {
            boolean z6 = bArr6 != null;
            if (z6) {
                String str2 = aha.f14785j;
                aup.m14890u(str2);
                bArr4 = m13494p(str2);
            } else {
                bArr4 = null;
            }
            ajk ajk2 = new ajk(arh.m14605l(ahd2.f14811r, aha.f14778c), aha.f14786k, aha.f14787l);
            z2 = z6;
            ajg2 = m13495q(ajg3, bArr6, bArr4);
            ajk = ajk2;
        } else {
            ajg2 = null;
            ajk = null;
            z2 = false;
        }
        long j2 = j + ahb.f14782g;
        long j3 = j2 + ahb.f14780e;
        int i2 = ahd2.f14798e + ahb.f14781f;
        if (afx2 != null) {
            boolean z7 = uri.equals(afx2.f14578m) && afx2.f14570G;
            C4529zi ziVar2 = afx2.f14589y;
            alw alw2 = afx2.f14590z;
            ahb ahb2 = afu2.f14540a;
            if (ahb2 instanceof agy) {
                z4 = ((agy) ahb2).f14766a || (afu2.f14542c == 0 && ahd2.f14813t);
            } else {
                z4 = ahd2.f14813t;
            }
            boolean z8 = !z7 && (!z4 || j2 < afx2.f14245j);
            afl = (!z7 || afx2.f14572I || afx2.f14577b != i2) ? null : afx2.f14575L;
            ziVar = ziVar2;
            alw = alw2;
            z3 = z8;
        } else {
            Uri uri2 = uri;
            ziVar = new C4529zi((C4527zg) null);
            afl = null;
            alw = new alw(10);
            z3 = false;
        }
        return new afx(afw, q, a, keVar, z5, ajg2, ajk, z2, uri, list, i, j2, j3, afu2.f14541b, afu2.f14542c, !afu2.f14543d, i2, ahb.f14788m, z, agn.mo13687a(i2), ahb.f14783h, afl, ziVar, alw, z3);
    }

    /* renamed from: n */
    private final void m13492n(ajg ajg, ajk ajk, boolean z) throws IOException {
        ajg ajg2;
        ajk ajk2;
        C4302qy qyVar;
        long l;
        long j;
        afl afl;
        long j2;
        ajk ajk3 = ajk;
        boolean z2 = false;
        if (z) {
            if (this.f14567D != 0) {
                z2 = true;
            }
            ajg2 = ajg;
            ajk2 = ajk3;
        } else {
            ajk2 = ajk3.mo13813c((long) this.f14567D);
            ajg2 = ajg;
        }
        try {
            ajg ajg3 = ajg;
            C4302qy qyVar2 = new C4302qy(ajg3, ajk2.f15060e, ajg2.mo13296c(ajk2));
            if (this.f14575L == null) {
                long o = m13493o(qyVar2);
                qyVar2.mo16603j();
                afl afl2 = this.f14574K;
                if (afl2 != null) {
                    afl = afl2.mo13605c();
                    qyVar = qyVar2;
                } else {
                    afw afw = this.f14586v;
                    afn afn = (afn) afw;
                    qyVar = qyVar2;
                    afl = afn.mo13607a(ajk2.f15056a, this.f14241f, this.f14587w, this.f14585u, ajg.mo13298e(), qyVar);
                }
                this.f14575L = afl;
                C4306rb rbVar = afl.f14527a;
                if (!(rbVar instanceof C4427vo) && !(rbVar instanceof C4421vi) && !(rbVar instanceof C4424vl)) {
                    if (!(rbVar instanceof C4369tk)) {
                        this.f14566C.mo13656D(0);
                        this.f14566C.mo13655C();
                        afl afl3 = this.f14575L;
                        afl3.f14527a.mo13690e(this.f14566C);
                    }
                }
                agi agi = this.f14566C;
                if (o != C6540C.TIME_UNSET) {
                    j2 = this.f14585u.mo13998f(o);
                } else {
                    j2 = this.f14244i;
                }
                agi.mo13656D(j2);
                this.f14566C.mo13655C();
                afl afl32 = this.f14575L;
                afl32.f14527a.mo13690e(this.f14566C);
            } else {
                qyVar = qyVar2;
            }
            this.f14566C.mo13657E(this.f14588x);
            if (z2) {
                qyVar.mo16597d(this.f14567D);
            }
            do {
                if (this.f14569F || !this.f14575L.mo13603a(qyVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f14575L.mo13603a(qyVar));
            break;
            l = qyVar.mo16605l();
            j = ajk3.f15060e;
        } catch (EOFException e) {
            if ((this.f14241f.f17674e & 16384) != 0) {
                this.f14575L.f14527a.mo13692g(0, 0);
                l = qyVar.mo16605l();
                j = ajk3.f15060e;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            amm.m14247q(ajg);
            throw th;
        }
        this.f14567D = (int) (l - j);
        amm.m14247q(ajg);
    }

    /* renamed from: o */
    private final long m13493o(C4307rc rcVar) throws IOException {
        rcVar.mo16603j();
        try {
            this.f14590z.mo13943a(10);
            rcVar.mo16600g(this.f14590z.mo13952j(), 0, 10);
            if (this.f14590z.mo13961s() != 4801587) {
                return C6540C.TIME_UNSET;
            }
            this.f14590z.mo13954l(3);
            int B = this.f14590z.mo13933B();
            int i = B + 10;
            if (i > this.f14590z.mo13953k()) {
                byte[] j = this.f14590z.mo13952j();
                this.f14590z.mo13943a(i);
                System.arraycopy(j, 0, this.f14590z.mo13952j(), 0, 10);
            }
            rcVar.mo16600g(this.f14590z.mo13952j(), 10, B);
            C4507yn c = this.f14589y.mo16896c(this.f14590z.mo13952j(), B);
            if (c == null) {
                return C6540C.TIME_UNSET;
            }
            int a = c.mo16831a();
            for (int i2 = 0; i2 < a; i2++) {
                C4506ym b = c.mo16832b(i2);
                if (b instanceof C4533zm) {
                    C4533zm zmVar = (C4533zm) b;
                    if (HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(zmVar.f19762a)) {
                        System.arraycopy(zmVar.f19763b, 0, this.f14590z.mo13952j(), 0, 8);
                        this.f14590z.mo13951i(0);
                        this.f14590z.mo13949g(8);
                        return this.f14590z.mo13967y() & 8589934591L;
                    }
                }
            }
            return C6540C.TIME_UNSET;
        } catch (EOFException unused) {
        }
    }

    /* renamed from: p */
    private static byte[] m13494p(String str) {
        if (amm.m14186C(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length;
        int i = length > 16 ? length - 16 : 0;
        System.arraycopy(byteArray, i, bArr, (16 - length) + i, length - i);
        return bArr;
    }

    /* renamed from: q */
    private static ajg m13495q(ajg ajg, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return ajg;
        }
        aup.m14890u(bArr2);
        return new afk(ajg, bArr, bArr2);
    }

    /* renamed from: a */
    public final void mo13632a(agi agi, atz<Integer> atz) {
        this.f14566C = agi;
        this.f14571H = atz;
    }

    /* renamed from: b */
    public final void mo13355b() {
        this.f14569F = true;
    }

    /* renamed from: c */
    public final void mo13356c() throws IOException {
        afl afl;
        aup.m14890u(this.f14566C);
        if (this.f14575L == null && (afl = this.f14574K) != null && afl.mo13604b()) {
            this.f14575L = this.f14574K;
            this.f14568E = false;
        }
        if (this.f14568E) {
            aup.m14890u(this.f14581q);
            aup.m14890u(this.f14582r);
            m13492n(this.f14581q, this.f14582r, this.f14565B);
            this.f14567D = 0;
            this.f14568E = false;
        }
        if (!this.f14569F) {
            if (!this.f14584t) {
                try {
                    this.f14585u.mo13993a(this.f14583s, this.f14244i);
                    m13492n(this.f14246k, this.f14239d, this.f14564A);
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            }
            this.f14570G = !this.f14569F;
        }
    }

    /* renamed from: d */
    public final int mo13633d(int i) {
        aup.m14887r(!this.f14579n);
        if (i >= this.f14571H.size()) {
            return 0;
        }
        return this.f14571H.get(i).intValue();
    }

    /* renamed from: e */
    public final void mo13634e() {
        this.f14572I = true;
    }

    /* renamed from: j */
    public final boolean mo13503j() {
        return this.f14570G;
    }

    /* renamed from: k */
    public final boolean mo13635k() {
        return this.f14573J;
    }

    /* renamed from: l */
    public final void mo13636l() {
        this.f14573J = true;
    }
}
