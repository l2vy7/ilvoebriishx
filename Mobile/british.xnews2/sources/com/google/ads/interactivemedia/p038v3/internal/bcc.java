package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcc */
/* compiled from: IMASDK */
public final class bcc extends bkl<bcc, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bcc f16079g;

    /* renamed from: a */
    private String f16080a = "";

    /* renamed from: e */
    private bjq f16081e = bjq.f16482b;

    /* renamed from: f */
    private int f16082f;

    static {
        bcc bcc = new bcc();
        f16079g = bcc;
        bkl.m16307an(bcc.class, bcc);
    }

    private bcc() {
    }

    /* renamed from: d */
    public static bcc m15595d() {
        return f16079g;
    }

    /* renamed from: a */
    public final String mo14892a() {
        return this.f16080a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16079g, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new bcc();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (boolean[][][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16079g;
        }
    }

    /* renamed from: c */
    public final bjq mo14893c() {
        return this.f16081e;
    }
}
