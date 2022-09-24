package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bai */
/* compiled from: IMASDK */
public final class bai extends bkl<bai, bah> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bai f15946g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15947a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bjq f15948e = bjq.f16482b;

    /* renamed from: f */
    private bal f15949f;

    static {
        bai bai = new bai();
        f15946g = bai;
        bkl.m16307an(bai.class, bai);
    }

    private bai() {
    }

    /* renamed from: e */
    public static bai m15354e(bjq bjq, bka bka) throws bkt {
        return (bai) bkl.m16313at(f15946g, bjq, bka);
    }

    /* renamed from: f */
    public static bah m15355f() {
        return (bah) f15946g.mo15390aj();
    }

    /* renamed from: i */
    static /* synthetic */ void m15358i(bai bai, bal bal) {
        bal.getClass();
        bai.f15949f = bal;
    }

    /* renamed from: a */
    public final int mo14788a() {
        return this.f15947a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15946g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bai();
        } else {
            if (i2 == 4) {
                return new bah((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15946g;
        }
    }

    /* renamed from: c */
    public final bjq mo14789c() {
        return this.f15948e;
    }

    /* renamed from: d */
    public final bal mo14790d() {
        bal bal = this.f15949f;
        return bal == null ? bal.m15369c() : bal;
    }
}
