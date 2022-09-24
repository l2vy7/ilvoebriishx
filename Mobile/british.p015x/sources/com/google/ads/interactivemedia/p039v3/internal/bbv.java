package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbv */
/* compiled from: IMASDK */
public final class bbv extends bkl<bbv, bbu> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bbv f16048g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f16049a;

    /* renamed from: e */
    private bbx f16050e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public bjq f16051f = bjq.f16482b;

    static {
        bbv bbv = new bbv();
        f16048g = bbv;
        bkl.m16307an(bbv.class, bbv);
    }

    private bbv() {
    }

    /* renamed from: e */
    public static bbv m15548e(bjq bjq, bka bka) throws bkt {
        return (bbv) bkl.m16313at(f16048g, bjq, bka);
    }

    /* renamed from: f */
    public static bbu m15549f() {
        return (bbu) f16048g.mo15390aj();
    }

    /* renamed from: g */
    public static bbv m15550g() {
        return f16048g;
    }

    /* renamed from: i */
    static /* synthetic */ void m15552i(bbv bbv, bbx bbx) {
        bbx.getClass();
        bbv.f16050e = bbx;
    }

    /* renamed from: a */
    public final int mo14868a() {
        return this.f16049a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16048g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bbv();
        } else {
            if (i2 == 4) {
                return new bbu((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16048g;
        }
    }

    /* renamed from: c */
    public final bbx mo14869c() {
        bbx bbx = this.f16050e;
        return bbx == null ? bbx.m15565d() : bbx;
    }

    /* renamed from: d */
    public final bjq mo14870d() {
        return this.f16051f;
    }
}
