package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbh */
/* compiled from: IMASDK */
public final class bbh extends bkl<bbh, bbg> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bbh f15999f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f16000a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bjq f16001e = bjq.f16482b;

    static {
        bbh bbh = new bbh();
        f15999f = bbh;
        bkl.m16307an(bbh.class, bbh);
    }

    private bbh() {
    }

    /* renamed from: d */
    public static bbh m15481d(bjq bjq, bka bka) throws bkt {
        return (bbh) bkl.m16313at(f15999f, bjq, bka);
    }

    /* renamed from: e */
    public static bbg m15482e() {
        return (bbg) f15999f.mo15390aj();
    }

    /* renamed from: a */
    public final int mo14838a() {
        return this.f16000a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15999f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bbh();
        } else {
            if (i2 == 4) {
                return new bbg((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15999f;
        }
    }

    /* renamed from: c */
    public final bjq mo14839c() {
        return this.f16001e;
    }
}
