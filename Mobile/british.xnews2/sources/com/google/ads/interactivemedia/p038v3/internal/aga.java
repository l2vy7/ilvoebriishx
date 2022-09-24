package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aga */
/* compiled from: IMASDK */
public final class aga extends C4544zx implements ahn {

    /* renamed from: a */
    private final afw f14621a;

    /* renamed from: b */
    private final C4128km f14622b;

    /* renamed from: c */
    private final C4286qi f14623c;

    /* renamed from: d */
    private final int f14624d;

    /* renamed from: e */
    private final aho f14625e;

    /* renamed from: f */
    private final long f14626f;

    /* renamed from: g */
    private final C4129kn f14627g;

    /* renamed from: h */
    private C4127kl f14628h;

    /* renamed from: i */
    private akp f14629i;

    /* renamed from: j */
    private final afm f14630j;

    /* renamed from: k */
    private final C4396uk f14631k;

    /* renamed from: l */
    private final aup f14632l;

    static {
        C4116ka.m17669b("goog.exo.hls");
    }

    /* synthetic */ aga(C4129kn knVar, afm afm, afw afw, C4396uk ukVar, C4286qi qiVar, aup aup, aho aho, long j, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C4128km kmVar = knVar.f17729b;
        aup.m14890u(kmVar);
        this.f14622b = kmVar;
        this.f14627g = knVar;
        this.f14628h = knVar.f17730c;
        this.f14630j = afm;
        this.f14621a = afw;
        this.f14631k = ukVar;
        this.f14623c = qiVar;
        this.f14632l = aup;
        this.f14625e = aho;
        this.f14626f = j;
        this.f14624d = i;
    }

    /* renamed from: U */
    public final C4129kn mo13273U() {
        return this.f14627g;
    }

    /* renamed from: V */
    public final void mo13274V(aaz aaz) {
        ((afy) aaz).mo13637j();
    }

    /* renamed from: W */
    public final aaz mo13275W(abb abb, ajl ajl, long j) {
        abj f = mo16938f(abb);
        return new afy(this.f14621a, this.f14625e, this.f14630j, this.f14629i, this.f14623c, mo16940h(abb), this.f14632l, f, ajl, this.f14631k, this.f14624d, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13254a(akp akp) {
        this.f14629i = akp;
        this.f14623c.mo16576c();
        this.f14625e.mo13703a(this.f14622b.f17720a, mo16938f((abb) null), this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo13256d() {
        this.f14625e.mo13704b();
        this.f14623c.mo16577d();
    }

    /* renamed from: u */
    public final void mo13257u() throws IOException {
        this.f14625e.mo13711i();
    }

    /* renamed from: y */
    public final void mo13646y(ahd ahd) {
        acl acl;
        long j;
        long j2;
        long j3;
        ahd ahd2 = ahd;
        long a = ahd2.f14804k ? C4083iv.m17451a(ahd2.f14796c) : -9223372036854775807L;
        int i = ahd2.f14794a;
        long j4 = (i == 2 || i == 1) ? a : -9223372036854775807L;
        long j5 = ahd2.f14795b;
        aup.m14890u(this.f14625e.mo13707e());
        age age = new age();
        if (this.f14625e.mo13714l()) {
            long b = ahd2.f14804k ? C4083iv.m17452b(amm.m14218ah(this.f14626f)) - ahd.mo13716b() : 0;
            long j6 = this.f14628h.f17715a;
            if (j6 != C6540C.TIME_UNSET) {
                j2 = C4083iv.m17452b(j6);
            } else {
                ahc ahc = ahd2.f14810q;
                long j7 = ahc.f14792d;
                if (j7 != C6540C.TIME_UNSET) {
                    long j8 = j7;
                    if (ahd2.f14802i != C6540C.TIME_UNSET) {
                        j = j8;
                        j2 = j + b;
                    }
                }
                j = ahc.f14791c;
                if (j == C6540C.TIME_UNSET) {
                    j = ahd2.f14801h * 3;
                }
                j2 = j + b;
            }
            long a2 = C4083iv.m17451a(amm.m14192I(j2, b, ahd2.f14809p + b));
            if (a2 != this.f14628h.f17715a) {
                C4124ki a3 = this.f14627g.mo16153a();
                a3.mo16140b(a2);
                this.f14628h = a3.mo16139a().f17730c;
            }
            long g = ahd2.f14796c - this.f14625e.mo13709g();
            long j9 = ahd2.f14803j ? ahd2.f14809p + g : C6540C.TIME_UNSET;
            if (!ahd2.f14806m.isEmpty()) {
                List<aha> list = ahd2.f14806m;
                int size = list.size() - 1;
                long b2 = (ahd2.f14809p + b) - C4083iv.m17452b(this.f14628h.f17715a);
                while (size > 0 && list.get(size).f14782g > b2) {
                    size--;
                }
                j3 = list.get(size).f14782g;
            } else {
                j3 = j5 == C6540C.TIME_UNSET ? 0 : j5;
            }
            acl = new acl(j4, a, j9, ahd2.f14809p, g, j3, true, !ahd2.f14803j, age, this.f14627g, this.f14628h);
        } else {
            long j10 = j5 == C6540C.TIME_UNSET ? 0 : j5;
            long j11 = ahd2.f14809p;
            acl = new acl(j4, a, j11, j11, 0, j10, true, false, age, this.f14627g, (C4127kl) null);
        }
        mo16937e(acl);
    }
}
