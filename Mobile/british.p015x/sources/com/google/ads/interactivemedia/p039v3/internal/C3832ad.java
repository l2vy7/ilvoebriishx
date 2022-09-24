package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ad */
/* compiled from: IMASDK */
public final class C3832ad extends bkl<C3832ad, C4331s> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C3832ad f14233h;

    /* renamed from: a */
    private int f14234a;

    /* renamed from: e */
    private long f14235e;

    /* renamed from: f */
    private String f14236f = "";

    /* renamed from: g */
    private bjq f14237g = bjq.f16482b;

    static {
        C3832ad adVar = new C3832ad();
        f14233h = adVar;
        bkl.m16307an(C3832ad.class, adVar);
    }

    private C3832ad() {
    }

    /* renamed from: d */
    public static C3832ad m13133d() {
        return f14233h;
    }

    /* renamed from: a */
    public final boolean mo13479a() {
        return (this.f14234a & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f14233h, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"a", "e", "f", "g"});
        } else if (i2 == 3) {
            return new C3832ad();
        } else {
            if (i2 == 4) {
                return new C4331s((byte[]) null, (short[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f14233h;
        }
    }

    /* renamed from: c */
    public final long mo13481c() {
        return this.f14235e;
    }
}
