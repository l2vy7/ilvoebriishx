package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbq */
/* compiled from: IMASDK */
public final class bbq extends bkl<bbq, bbp> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final bbq f16022h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f16023a;

    /* renamed from: e */
    private bbm f16024e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public bjq f16025f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public bjq f16026g;

    static {
        bbq bbq = new bbq();
        f16022h = bbq;
        bkl.m16307an(bbq.class, bbq);
    }

    private bbq() {
        bjq bjq = bjq.f16482b;
        this.f16025f = bjq;
        this.f16026g = bjq;
    }

    /* renamed from: f */
    public static bbq m15524f(bjq bjq, bka bka) throws bkt {
        return (bbq) bkl.m16313at(f16022h, bjq, bka);
    }

    /* renamed from: g */
    public static bbp m15525g() {
        return (bbp) f16022h.mo15390aj();
    }

    /* renamed from: h */
    public static bbq m15526h() {
        return f16022h;
    }

    /* renamed from: j */
    static /* synthetic */ void m15528j(bbq bbq, bbm bbm) {
        bbm.getClass();
        bbq.f16024e = bbm;
    }

    /* renamed from: a */
    public final int mo14856a() {
        return this.f16023a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16022h, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bbq();
        } else {
            if (i2 == 4) {
                return new bbp((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16022h;
        }
    }

    /* renamed from: c */
    public final bbm mo14857c() {
        bbm bbm = this.f16024e;
        return bbm == null ? bbm.m15501e() : bbm;
    }

    /* renamed from: d */
    public final bjq mo14858d() {
        return this.f16025f;
    }

    /* renamed from: e */
    public final bjq mo14859e() {
        return this.f16026g;
    }
}
