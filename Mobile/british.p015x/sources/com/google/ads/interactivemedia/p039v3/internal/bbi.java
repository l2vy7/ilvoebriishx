package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbi */
/* compiled from: IMASDK */
public final class bbi extends bkl<bbi, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final bbi f16002a;

    static {
        bbi bbi = new bbi();
        f16002a = bbi;
        bkl.m16307an(bbi.class, bbi);
    }

    private bbi() {
    }

    /* renamed from: a */
    public static bbi m15489a(bjq bjq, bka bka) throws bkt {
        return (bbi) bkl.m16313at(f16002a, bjq, bka);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16002a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bbi();
        }
        if (i2 == 4) {
            return new bak((byte[]) null, (int[][]) null);
        }
        if (i2 != 5) {
            return null;
        }
        return f16002a;
    }
}
