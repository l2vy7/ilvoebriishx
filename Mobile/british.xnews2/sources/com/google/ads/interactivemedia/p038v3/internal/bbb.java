package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbb */
/* compiled from: IMASDK */
public final class bbb extends bkl<bbb, bba> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bbb f15988f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15989a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bjq f15990e = bjq.f16482b;

    static {
        bbb bbb = new bbb();
        f15988f = bbb;
        bkl.m16307an(bbb.class, bbb);
    }

    private bbb() {
    }

    /* renamed from: d */
    public static bbb m15453d(bjq bjq, bka bka) throws bkt {
        return (bbb) bkl.m16313at(f15988f, bjq, bka);
    }

    /* renamed from: e */
    public static bba m15454e() {
        return (bba) f15988f.mo15390aj();
    }

    /* renamed from: a */
    public final int mo14828a() {
        return this.f15989a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15988f, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bbb();
        } else {
            if (i2 == 4) {
                return new bba((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15988f;
        }
    }

    /* renamed from: c */
    public final bjq mo14829c() {
        return this.f15990e;
    }
}
