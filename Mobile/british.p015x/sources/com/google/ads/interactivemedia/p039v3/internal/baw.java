package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.baw */
/* compiled from: IMASDK */
public final class baw extends bkl<baw, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final baw f15978e;

    /* renamed from: a */
    private int f15979a;

    static {
        baw baw = new baw();
        f15978e = baw;
        bkl.m16307an(baw.class, baw);
    }

    private baw() {
    }

    /* renamed from: c */
    public static baw m15433c() {
        return f15978e;
    }

    /* renamed from: a */
    public final int mo14819a() {
        return this.f15979a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15978e, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new baw();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (float[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15978e;
        }
    }
}
