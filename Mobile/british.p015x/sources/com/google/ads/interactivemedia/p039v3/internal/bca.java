package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bca */
/* compiled from: IMASDK */
public final class bca extends bkl<bca, bby> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bca f16068g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f16069a = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bjq f16070e = bjq.f16482b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f16071f;

    static {
        bca bca = new bca();
        f16068g = bca;
        bkl.m16307an(bca.class, bca);
    }

    private bca() {
    }

    /* renamed from: e */
    public static bby m15583e() {
        return (bby) f16068g.mo15390aj();
    }

    /* renamed from: f */
    public static bca m15584f() {
        return f16068g;
    }

    /* renamed from: a */
    public final String mo14887a() {
        return this.f16069a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16068g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bca();
        } else {
            if (i2 == 4) {
                return new bby((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16068g;
        }
    }

    /* renamed from: c */
    public final bjq mo14888c() {
        return this.f16070e;
    }

    /* renamed from: d */
    public final bbz mo14889d() {
        bbz b = bbz.m15573b(this.f16071f);
        return b == null ? bbz.UNRECOGNIZED : b;
    }
}
