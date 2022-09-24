package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bav */
/* compiled from: IMASDK */
public final class bav extends bkl<bav, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bav f15975f;

    /* renamed from: a */
    private baw f15976a;

    /* renamed from: e */
    private int f15977e;

    static {
        bav bav = new bav();
        f15975f = bav;
        bkl.m16307an(bav.class, bav);
    }

    private bav() {
    }

    /* renamed from: d */
    public static bav m15428d(bjq bjq, bka bka) throws bkt {
        return (bav) bkl.m16313at(f15975f, bjq, bka);
    }

    /* renamed from: a */
    public final baw mo14817a() {
        baw baw = this.f15976a;
        return baw == null ? baw.m15433c() : baw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15975f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bav();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (boolean[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15975f;
        }
    }

    /* renamed from: c */
    public final int mo14818c() {
        return this.f15977e;
    }
}
