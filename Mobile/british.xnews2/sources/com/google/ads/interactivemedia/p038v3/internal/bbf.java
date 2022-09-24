package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbf */
/* compiled from: IMASDK */
public final class bbf extends bkl<bbf, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final bbf f15997e;

    /* renamed from: a */
    private int f15998a;

    static {
        bbf bbf = new bbf();
        f15997e = bbf;
        bkl.m16307an(bbf.class, bbf);
    }

    private bbf() {
    }

    /* renamed from: c */
    public static bbf m15475c(bjq bjq, bka bka) throws bkt {
        return (bbf) bkl.m16313at(f15997e, bjq, bka);
    }

    /* renamed from: a */
    public final int mo14835a() {
        return this.f15998a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15997e, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bbf();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (short[][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15997e;
        }
    }
}
