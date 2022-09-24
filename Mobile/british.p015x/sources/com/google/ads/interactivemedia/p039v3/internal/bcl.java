package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcl */
/* compiled from: IMASDK */
public final class bcl extends bkl<bcl, bck> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bcl f16105f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f16106a;

    /* renamed from: e */
    private bcm f16107e;

    static {
        bcl bcl = new bcl();
        f16105f = bcl;
        bkl.m16307an(bcl.class, bcl);
    }

    private bcl() {
    }

    /* renamed from: d */
    public static bcl m15641d(bjq bjq, bka bka) throws bkt {
        return (bcl) bkl.m16313at(f16105f, bjq, bka);
    }

    /* renamed from: e */
    public static bck m15642e() {
        return (bck) f16105f.mo15390aj();
    }

    /* renamed from: g */
    static /* synthetic */ void m15644g(bcl bcl, bcm bcm) {
        bcm.getClass();
        bcl.f16107e = bcm;
    }

    /* renamed from: a */
    public final int mo14915a() {
        return this.f16106a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16105f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bcl();
        } else {
            if (i2 == 4) {
                return new bck((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16105f;
        }
    }

    /* renamed from: c */
    public final bcm mo14916c() {
        bcm bcm = this.f16107e;
        return bcm == null ? bcm.m15650d() : bcm;
    }
}
