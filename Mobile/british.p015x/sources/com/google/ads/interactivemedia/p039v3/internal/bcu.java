package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcu */
/* compiled from: IMASDK */
public final class bcu extends bkl<bcu, bct> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bcu f16128f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f16129a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bjq f16130e = bjq.f16482b;

    static {
        bcu bcu = new bcu();
        f16128f = bcu;
        bkl.m16307an(bcu.class, bcu);
    }

    private bcu() {
    }

    /* renamed from: d */
    public static bcu m15678d(bjq bjq, bka bka) throws bkt {
        return (bcu) bkl.m16313at(f16128f, bjq, bka);
    }

    /* renamed from: e */
    public static bct m15679e() {
        return (bct) f16128f.mo15390aj();
    }

    /* renamed from: a */
    public final int mo14929a() {
        return this.f16129a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16128f, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bcu();
        } else {
            if (i2 == 4) {
                return new bct((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16128f;
        }
    }

    /* renamed from: c */
    public final bjq mo14930c() {
        return this.f16130e;
    }
}
