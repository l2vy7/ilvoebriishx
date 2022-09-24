package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bal */
/* compiled from: IMASDK */
public final class bal extends bkl<bal, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final bal f15953e;

    /* renamed from: a */
    private int f15954a;

    static {
        bal bal = new bal();
        f15953e = bal;
        bkl.m16307an(bal.class, bal);
    }

    private bal() {
    }

    /* renamed from: c */
    public static bal m15369c() {
        return f15953e;
    }

    /* renamed from: a */
    public final int mo14793a() {
        return this.f15954a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15953e, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bal();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15953e;
        }
    }
}
