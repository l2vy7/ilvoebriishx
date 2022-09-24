package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bco */
/* compiled from: IMASDK */
public final class bco extends bkl<bco, bcn> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bco f16110f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f16111a;

    /* renamed from: e */
    private bcq f16112e;

    static {
        bco bco = new bco();
        f16110f = bco;
        bkl.m16307an(bco.class, bco);
    }

    private bco() {
    }

    /* renamed from: d */
    public static bco m15656d(bjq bjq, bka bka) throws bkt {
        return (bco) bkl.m16313at(f16110f, bjq, bka);
    }

    /* renamed from: e */
    public static bcn m15657e() {
        return (bcn) f16110f.mo15390aj();
    }

    /* renamed from: g */
    static /* synthetic */ void m15659g(bco bco, bcq bcq) {
        bcq.getClass();
        bco.f16112e = bcq;
    }

    /* renamed from: a */
    public final int mo14920a() {
        return this.f16111a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16110f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bco();
        } else {
            if (i2 == 4) {
                return new bcn((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16110f;
        }
    }

    /* renamed from: c */
    public final bcq mo14921c() {
        bcq bcq = this.f16112e;
        return bcq == null ? bcq.m15665e() : bcq;
    }
}
