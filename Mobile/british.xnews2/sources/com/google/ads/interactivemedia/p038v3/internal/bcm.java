package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcm */
/* compiled from: IMASDK */
public final class bcm extends bkl<bcm, bcp> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final bcm f16108e;

    /* renamed from: a */
    private String f16109a = "";

    static {
        bcm bcm = new bcm();
        f16108e = bcm;
        bkl.m16307an(bcm.class, bcm);
    }

    private bcm() {
    }

    /* renamed from: c */
    public static bcm m15649c(bjq bjq, bka bka) throws bkt {
        return (bcm) bkl.m16313at(f16108e, bjq, bka);
    }

    /* renamed from: d */
    public static bcm m15650d() {
        return f16108e;
    }

    /* renamed from: a */
    public final String mo14917a() {
        return this.f16109a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16108e, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bcm();
        } else {
            if (i2 == 4) {
                return new bcp((byte[]) null, (byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16108e;
        }
    }
}
