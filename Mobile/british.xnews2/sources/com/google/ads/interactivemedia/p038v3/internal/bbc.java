package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbc */
/* compiled from: IMASDK */
public final class bbc extends bkl<bbc, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bbc f15991f;

    /* renamed from: a */
    private int f15992a;

    /* renamed from: e */
    private int f15993e;

    static {
        bbc bbc = new bbc();
        f15991f = bbc;
        bkl.m16307an(bbc.class, bbc);
    }

    private bbc() {
    }

    /* renamed from: c */
    public static bbc m15461c(bjq bjq, bka bka) throws bkt {
        return (bbc) bkl.m16313at(f15991f, bjq, bka);
    }

    /* renamed from: a */
    public final int mo14830a() {
        return this.f15992a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15991f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"e", "a"});
        } else if (i2 == 3) {
            return new bbc();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (char[][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15991f;
        }
    }
}
