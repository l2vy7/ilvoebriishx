package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbl */
/* compiled from: IMASDK */
public final class bbl extends bkl<bbl, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final bbl f16012e;

    /* renamed from: a */
    private bbm f16013a;

    static {
        bbl bbl = new bbl();
        f16012e = bbl;
        bkl.m16307an(bbl.class, bbl);
    }

    private bbl() {
    }

    /* renamed from: c */
    public static bbl m15497c(bjq bjq, bka bka) throws bkt {
        return (bbl) bkl.m16313at(f16012e, bjq, bka);
    }

    /* renamed from: a */
    public final bbm mo14842a() {
        bbm bbm = this.f16013a;
        return bbm == null ? bbm.m15501e() : bbm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16012e, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bbl();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (float[][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16012e;
        }
    }
}
