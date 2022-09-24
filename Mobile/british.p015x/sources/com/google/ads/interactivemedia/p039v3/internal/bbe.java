package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbe */
/* compiled from: IMASDK */
public final class bbe extends bkl<bbe, bbd> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bbe f15994f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15995a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bjq f15996e = bjq.f16482b;

    static {
        bbe bbe = new bbe();
        f15994f = bbe;
        bkl.m16307an(bbe.class, bbe);
    }

    private bbe() {
    }

    /* renamed from: d */
    public static bbe m15467d(bjq bjq, bka bka) throws bkt {
        return (bbe) bkl.m16313at(f15994f, bjq, bka);
    }

    /* renamed from: e */
    public static bbd m15468e() {
        return (bbd) f15994f.mo15390aj();
    }

    /* renamed from: a */
    public final int mo14833a() {
        return this.f15995a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15994f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bbe();
        } else {
            if (i2 == 4) {
                return new bbd((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15994f;
        }
    }

    /* renamed from: c */
    public final bjq mo14834c() {
        return this.f15996e;
    }
}
