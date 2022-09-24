package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.baz */
/* compiled from: IMASDK */
public final class baz extends bkl<baz, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final baz f15983f;

    /* renamed from: a */
    private int f15984a;

    /* renamed from: e */
    private int f15985e;

    static {
        baz baz = new baz();
        f15983f = baz;
        bkl.m16307an(baz.class, baz);
    }

    private baz() {
    }

    /* renamed from: c */
    public static baz m15447c(bjq bjq, bka bka) throws bkt {
        return (baz) bkl.m16313at(f15983f, bjq, bka);
    }

    /* renamed from: a */
    public final int mo14824a() {
        return this.f15984a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15983f, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new baz();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (byte[][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15983f;
        }
    }
}
