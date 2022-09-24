package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bce */
/* compiled from: IMASDK */
public final class bce extends bkl<bce, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final bce f16089h;

    /* renamed from: a */
    private bca f16090a;

    /* renamed from: e */
    private int f16091e;

    /* renamed from: f */
    private int f16092f;

    /* renamed from: g */
    private int f16093g;

    static {
        bce bce = new bce();
        f16089h = bce;
        bkl.m16307an(bce.class, bce);
    }

    private bce() {
    }

    /* renamed from: a */
    public final boolean mo14899a() {
        return this.f16090a != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16089h, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bce();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16089h;
        }
    }

    /* renamed from: c */
    public final bca mo14900c() {
        bca bca = this.f16090a;
        return bca == null ? bca.m15584f() : bca;
    }

    /* renamed from: d */
    public final bcb mo14901d() {
        bcb b = bcb.m15593b(this.f16091e);
        return b == null ? bcb.UNRECOGNIZED : b;
    }

    /* renamed from: e */
    public final int mo14902e() {
        return this.f16092f;
    }

    /* renamed from: f */
    public final bcr mo14903f() {
        bcr b = bcr.m15670b(this.f16093g);
        return b == null ? bcr.UNRECOGNIZED : b;
    }
}
