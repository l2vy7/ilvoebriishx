package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bas */
/* compiled from: IMASDK */
public final class bas extends bkl<bas, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final bas f15969e;

    /* renamed from: a */
    private int f15970a;

    static {
        bas bas = new bas();
        f15969e = bas;
        bkl.m16307an(bas.class, bas);
    }

    private bas() {
    }

    /* renamed from: c */
    public static bas m15411c() {
        return f15969e;
    }

    /* renamed from: a */
    public final int mo14810a() {
        return this.f15970a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15969e, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bas();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (int[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15969e;
        }
    }
}
