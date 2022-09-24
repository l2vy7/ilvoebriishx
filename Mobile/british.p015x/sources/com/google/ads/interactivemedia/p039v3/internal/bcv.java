package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcv */
/* compiled from: IMASDK */
public final class bcv extends bkl<bcv, bcp> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final bcv f16131a;

    static {
        bcv bcv = new bcv();
        f16131a = bcv;
        bkl.m16307an(bcv.class, bcv);
    }

    private bcv() {
    }

    /* renamed from: a */
    public static bcv m15686a(bjq bjq, bka bka) throws bkt {
        return (bcv) bkl.m16313at(f16131a, bjq, bka);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16131a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bcv();
        }
        if (i2 == 4) {
            return new bcp((byte[]) null, (short[]) null);
        }
        if (i2 != 5) {
            return null;
        }
        return f16131a;
    }
}
