package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.r */
/* compiled from: IMASDK */
public final class C4304r extends bkl<C4304r, C4277q> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final C4304r f18479z;

    /* renamed from: a */
    private int f18480a;

    /* renamed from: e */
    private long f18481e = -1;

    /* renamed from: f */
    private long f18482f = -1;

    /* renamed from: g */
    private long f18483g = -1;

    /* renamed from: h */
    private long f18484h = -1;

    /* renamed from: i */
    private long f18485i = -1;

    /* renamed from: j */
    private long f18486j = -1;

    /* renamed from: k */
    private int f18487k = 1000;

    /* renamed from: l */
    private long f18488l = -1;

    /* renamed from: m */
    private long f18489m = -1;

    /* renamed from: n */
    private long f18490n = -1;

    /* renamed from: o */
    private int f18491o = 1000;

    /* renamed from: p */
    private long f18492p = -1;

    /* renamed from: q */
    private long f18493q = -1;

    /* renamed from: r */
    private long f18494r = -1;

    /* renamed from: s */
    private long f18495s = -1;

    /* renamed from: t */
    private long f18496t;

    /* renamed from: u */
    private long f18497u;

    /* renamed from: v */
    private long f18498v = -1;

    /* renamed from: w */
    private long f18499w = -1;

    /* renamed from: x */
    private long f18500x = -1;

    /* renamed from: y */
    private long f18501y = -1;

    static {
        C4304r rVar = new C4304r();
        f18479z = rVar;
        bkl.m16307an(C4304r.class, rVar);
    }

    private C4304r() {
    }

    /* renamed from: a */
    public static C4277q m18721a() {
        return (C4277q) f18479z.mo15390aj();
    }

    /* renamed from: d */
    static /* synthetic */ void m18723d(C4304r rVar, long j) {
        rVar.f18480a |= 1;
        rVar.f18481e = j;
    }

    /* renamed from: e */
    static /* synthetic */ void m18724e(C4304r rVar, long j) {
        rVar.f18480a |= 2;
        rVar.f18482f = j;
    }

    /* renamed from: f */
    static /* synthetic */ void m18725f(C4304r rVar, long j) {
        rVar.f18480a |= 4;
        rVar.f18483g = j;
    }

    /* renamed from: g */
    static /* synthetic */ void m18726g(C4304r rVar, long j) {
        rVar.f18480a |= 8;
        rVar.f18484h = j;
    }

    /* renamed from: h */
    static /* synthetic */ void m18727h(C4304r rVar) {
        rVar.f18480a &= -9;
        rVar.f18484h = -1;
    }

    /* renamed from: i */
    static /* synthetic */ void m18728i(C4304r rVar, long j) {
        rVar.f18480a |= 16;
        rVar.f18485i = j;
    }

    /* renamed from: j */
    static /* synthetic */ void m18729j(C4304r rVar, long j) {
        rVar.f18480a |= 32;
        rVar.f18486j = j;
    }

    /* renamed from: k */
    static /* synthetic */ void m18730k(C4304r rVar, C3830ab abVar) {
        rVar.f18487k = abVar.mo13309a();
        rVar.f18480a |= 64;
    }

    /* renamed from: l */
    static /* synthetic */ void m18731l(C4304r rVar, long j) {
        rVar.f18480a |= 128;
        rVar.f18488l = j;
    }

    /* renamed from: m */
    static /* synthetic */ void m18732m(C4304r rVar, long j) {
        rVar.f18480a |= 256;
        rVar.f18489m = j;
    }

    /* renamed from: n */
    static /* synthetic */ void m18733n(C4304r rVar, long j) {
        rVar.f18480a |= 512;
        rVar.f18490n = j;
    }

    /* renamed from: o */
    static /* synthetic */ void m18734o(C4304r rVar, C3830ab abVar) {
        rVar.f18491o = abVar.mo13309a();
        rVar.f18480a |= 1024;
    }

    /* renamed from: p */
    static /* synthetic */ void m18735p(C4304r rVar, long j) {
        rVar.f18480a |= 2048;
        rVar.f18492p = j;
    }

    /* renamed from: q */
    static /* synthetic */ void m18736q(C4304r rVar, long j) {
        rVar.f18480a |= 4096;
        rVar.f18493q = j;
    }

    /* renamed from: r */
    static /* synthetic */ void m18737r(C4304r rVar, long j) {
        rVar.f18480a |= 8192;
        rVar.f18494r = j;
    }

    /* renamed from: s */
    static /* synthetic */ void m18738s(C4304r rVar, long j) {
        rVar.f18480a |= 16384;
        rVar.f18495s = j;
    }

    /* renamed from: t */
    static /* synthetic */ void m18739t(C4304r rVar, long j) {
        rVar.f18480a |= 32768;
        rVar.f18496t = j;
    }

    /* renamed from: u */
    static /* synthetic */ void m18740u(C4304r rVar, long j) {
        rVar.f18480a |= C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
        rVar.f18497u = j;
    }

    /* renamed from: v */
    static /* synthetic */ void m18741v(C4304r rVar, long j) {
        rVar.f18480a |= 131072;
        rVar.f18498v = j;
    }

    /* renamed from: w */
    static /* synthetic */ void m18742w(C4304r rVar, long j) {
        rVar.f18480a |= 262144;
        rVar.f18499w = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f18479z, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"a", "e", "f", "g", "h", "i", "j", "k", C3830ab.m12868c(), "l", "m", "n", "o", C3830ab.m12868c(), TtmlNode.TAG_P, "q", "r", "s", "t", "u", "v", "w", "x", "y"});
        } else if (i2 == 3) {
            return new C4304r();
        } else {
            if (i2 == 4) {
                return new C4277q((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f18479z;
        }
    }
}
