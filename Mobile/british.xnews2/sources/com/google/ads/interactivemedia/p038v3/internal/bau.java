package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bau */
/* compiled from: IMASDK */
public final class bau extends bkl<bau, bat> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bau f15971g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15972a;

    /* renamed from: e */
    private baw f15973e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public bjq f15974f = bjq.f16482b;

    static {
        bau bau = new bau();
        f15971g = bau;
        bkl.m16307an(bau.class, bau);
    }

    private bau() {
    }

    /* renamed from: e */
    public static bau m15418e(bjq bjq, bka bka) throws bkt {
        return (bau) bkl.m16313at(f15971g, bjq, bka);
    }

    /* renamed from: f */
    public static bat m15419f() {
        return (bat) f15971g.mo15390aj();
    }

    /* renamed from: h */
    static /* synthetic */ void m15421h(bau bau, baw baw) {
        baw.getClass();
        bau.f15973e = baw;
    }

    /* renamed from: a */
    public final int mo14814a() {
        return this.f15972a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15971g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bau();
        } else {
            if (i2 == 4) {
                return new bat((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15971g;
        }
    }

    /* renamed from: c */
    public final baw mo14815c() {
        baw baw = this.f15973e;
        return baw == null ? baw.m15433c() : baw;
    }

    /* renamed from: d */
    public final bjq mo14816d() {
        return this.f15974f;
    }
}
