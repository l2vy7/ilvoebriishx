package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbm */
/* compiled from: IMASDK */
public final class bbm extends bkl<bbm, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bbm f16014g;

    /* renamed from: a */
    private bbr f16015a;

    /* renamed from: e */
    private bbk f16016e;

    /* renamed from: f */
    private int f16017f;

    static {
        bbm bbm = new bbm();
        f16014g = bbm;
        bkl.m16307an(bbm.class, bbm);
    }

    private bbm() {
    }

    /* renamed from: e */
    public static bbm m15501e() {
        return f16014g;
    }

    /* renamed from: a */
    public final bbr mo14843a() {
        bbr bbr = this.f16015a;
        return bbr == null ? bbr.m15537e() : bbr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16014g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bbm();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (byte[][][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16014g;
        }
    }

    /* renamed from: c */
    public final bbk mo14844c() {
        bbk bbk = this.f16016e;
        return bbk == null ? bbk.m15493c() : bbk;
    }

    /* renamed from: d */
    public final bbj mo14845d() {
        bbj a = bbj.m15492a(this.f16017f);
        return a == null ? bbj.UNRECOGNIZED : a;
    }
}
