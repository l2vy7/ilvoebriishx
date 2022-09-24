package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.x */
/* compiled from: IMASDK */
public final class C4466x extends bkl<C4466x, C4439w> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C4466x f19522g;

    /* renamed from: a */
    private int f19523a;

    /* renamed from: e */
    private bjq f19524e;

    /* renamed from: f */
    private bjq f19525f;

    static {
        C4466x xVar = new C4466x();
        f19522g = xVar;
        bkl.m16307an(C4466x.class, xVar);
    }

    private C4466x() {
        bjq bjq = bjq.f16482b;
        this.f19524e = bjq;
        this.f19525f = bjq;
    }

    /* renamed from: a */
    public static C4439w m19426a() {
        return (C4439w) f19522g.mo15390aj();
    }

    /* renamed from: d */
    static /* synthetic */ void m19428d(C4466x xVar, bjq bjq) {
        xVar.f19523a |= 1;
        xVar.f19524e = bjq;
    }

    /* renamed from: e */
    static /* synthetic */ void m19429e(C4466x xVar, bjq bjq) {
        xVar.f19523a |= 2;
        xVar.f19525f = bjq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f19522g, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new C4466x();
        } else {
            if (i2 == 4) {
                return new C4439w((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f19522g;
        }
    }
}
