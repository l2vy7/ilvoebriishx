package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bar */
/* compiled from: IMASDK */
public final class bar extends bkl<bar, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bar f15966f;

    /* renamed from: a */
    private bas f15967a;

    /* renamed from: e */
    private int f15968e;

    static {
        bar bar = new bar();
        f15966f = bar;
        bkl.m16307an(bar.class, bar);
    }

    private bar() {
    }

    /* renamed from: d */
    public static bar m15405d(bjq bjq, bka bka) throws bkt {
        return (bar) bkl.m16313at(f15966f, bjq, bka);
    }

    /* renamed from: e */
    public static bar m15406e() {
        return f15966f;
    }

    /* renamed from: a */
    public final bas mo14808a() {
        bas bas = this.f15967a;
        return bas == null ? bas.m15411c() : bas;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15966f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bar();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (short[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15966f;
        }
    }

    /* renamed from: c */
    public final int mo14809c() {
        return this.f15968e;
    }
}
