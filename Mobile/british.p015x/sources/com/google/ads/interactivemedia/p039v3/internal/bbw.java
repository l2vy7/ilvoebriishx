package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbw */
/* compiled from: IMASDK */
public final class bbw extends bkl<bbw, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bbw f16052g;

    /* renamed from: a */
    private bbx f16053a;

    /* renamed from: e */
    private int f16054e;

    /* renamed from: f */
    private int f16055f;

    static {
        bbw bbw = new bbw();
        f16052g = bbw;
        bkl.m16307an(bbw.class, bbw);
    }

    private bbw() {
    }

    /* renamed from: d */
    public static bbw m15559d(bjq bjq, bka bka) throws bkt {
        return (bbw) bkl.m16313at(f16052g, bjq, bka);
    }

    /* renamed from: e */
    public static bbw m15560e() {
        return f16052g;
    }

    /* renamed from: a */
    public final bbx mo14871a() {
        bbx bbx = this.f16053a;
        return bbx == null ? bbx.m15565d() : bbx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16052g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bbw();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (short[][][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16052g;
        }
    }

    /* renamed from: c */
    public final int mo14872c() {
        return this.f16054e;
    }
}
