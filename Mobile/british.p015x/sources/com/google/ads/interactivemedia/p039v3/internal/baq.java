package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.baq */
/* compiled from: IMASDK */
public final class baq extends bkl<baq, bap> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final baq f15962g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15963a;

    /* renamed from: e */
    private bas f15964e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public bjq f15965f = bjq.f16482b;

    static {
        baq baq = new baq();
        f15962g = baq;
        bkl.m16307an(baq.class, baq);
    }

    private baq() {
    }

    /* renamed from: e */
    public static baq m15394e(bjq bjq, bka bka) throws bkt {
        return (baq) bkl.m16313at(f15962g, bjq, bka);
    }

    /* renamed from: f */
    public static bap m15395f() {
        return (bap) f15962g.mo15390aj();
    }

    /* renamed from: g */
    public static baq m15396g() {
        return f15962g;
    }

    /* renamed from: i */
    static /* synthetic */ void m15398i(baq baq, bas bas) {
        bas.getClass();
        baq.f15964e = bas;
    }

    /* renamed from: a */
    public final int mo14805a() {
        return this.f15963a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15962g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new baq();
        } else {
            if (i2 == 4) {
                return new bap((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15962g;
        }
    }

    /* renamed from: c */
    public final bas mo14806c() {
        bas bas = this.f15964e;
        return bas == null ? bas.m15411c() : bas;
    }

    /* renamed from: d */
    public final bjq mo14807d() {
        return this.f15965f;
    }
}
