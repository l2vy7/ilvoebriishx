package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbr */
/* compiled from: IMASDK */
public final class bbr extends bkl<bbr, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bbr f16027g;

    /* renamed from: a */
    private int f16028a;

    /* renamed from: e */
    private int f16029e;

    /* renamed from: f */
    private bjq f16030f = bjq.f16482b;

    static {
        bbr bbr = new bbr();
        f16027g = bbr;
        bkl.m16307an(bbr.class, bbr);
    }

    private bbr() {
    }

    /* renamed from: e */
    public static bbr m15537e() {
        return f16027g;
    }

    /* renamed from: a */
    public final bbs mo14860a() {
        bbs a = bbs.m15543a(this.f16028a);
        return a == null ? bbs.UNRECOGNIZED : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16027g, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bbr();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (char[][][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16027g;
        }
    }

    /* renamed from: c */
    public final bbt mo14861c() {
        bbt a = bbt.m15544a(this.f16029e);
        return a == null ? bbt.UNRECOGNIZED : a;
    }

    /* renamed from: d */
    public final bjq mo14862d() {
        return this.f16030f;
    }
}
