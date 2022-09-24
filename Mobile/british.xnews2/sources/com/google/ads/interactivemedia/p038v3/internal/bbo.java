package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbo */
/* compiled from: IMASDK */
public final class bbo extends bkl<bbo, bbn> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bbo f16018g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f16019a;

    /* renamed from: e */
    private bbq f16020e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public bjq f16021f = bjq.f16482b;

    static {
        bbo bbo = new bbo();
        f16018g = bbo;
        bkl.m16307an(bbo.class, bbo);
    }

    private bbo() {
    }

    /* renamed from: e */
    public static bbo m15510e(bjq bjq, bka bka) throws bkt {
        return (bbo) bkl.m16313at(f16018g, bjq, bka);
    }

    /* renamed from: f */
    public static bbn m15511f() {
        return (bbn) f16018g.mo15390aj();
    }

    /* renamed from: h */
    static /* synthetic */ void m15513h(bbo bbo, bbq bbq) {
        bbq.getClass();
        bbo.f16020e = bbq;
    }

    /* renamed from: a */
    public final int mo14849a() {
        return this.f16019a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16018g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bbo();
        } else {
            if (i2 == 4) {
                return new bbn((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16018g;
        }
    }

    /* renamed from: c */
    public final bbq mo14850c() {
        bbq bbq = this.f16020e;
        return bbq == null ? bbq.m15526h() : bbq;
    }

    /* renamed from: d */
    public final bjq mo14851d() {
        return this.f16021f;
    }
}
