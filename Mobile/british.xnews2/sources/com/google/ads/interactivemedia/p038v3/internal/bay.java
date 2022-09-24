package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bay */
/* compiled from: IMASDK */
public final class bay extends bkl<bay, bax> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bay f15980f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15981a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bjq f15982e = bjq.f16482b;

    static {
        bay bay = new bay();
        f15980f = bay;
        bkl.m16307an(bay.class, bay);
    }

    private bay() {
    }

    /* renamed from: d */
    public static bay m15439d(bjq bjq, bka bka) throws bkt {
        return (bay) bkl.m16313at(f15980f, bjq, bka);
    }

    /* renamed from: e */
    public static bax m15440e() {
        return (bax) f15980f.mo15390aj();
    }

    /* renamed from: a */
    public final int mo14822a() {
        return this.f15981a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15980f, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bay();
        } else {
            if (i2 == 4) {
                return new bax((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15980f;
        }
    }

    /* renamed from: c */
    public final bjq mo14823c() {
        return this.f15982e;
    }
}
