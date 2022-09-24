package com.google.ads.interactivemedia.p038v3.internal;

import java.util.List;

@Deprecated
/* renamed from: com.google.ads.interactivemedia.v3.internal.bcs */
/* compiled from: IMASDK */
public final class bcs extends bkl<bcs, bcp> implements blo {

    /* renamed from: a */
    public static final /* synthetic */ int f16124a = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final bcs f16125g;

    /* renamed from: e */
    private String f16126e = "";

    /* renamed from: f */
    private bkq<bcd> f16127f = bkl.m16311ar();

    static {
        bcs bcs = new bcs();
        f16125g = bcs;
        bkl.m16307an(bcs.class, bcs);
    }

    private bcs() {
    }

    /* renamed from: c */
    public static bcs m15672c() {
        return f16125g;
    }

    /* renamed from: a */
    public final List<bcd> mo14926a() {
        return this.f16127f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16125g, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"e", "f", bcd.class});
        } else if (i2 == 3) {
            return new bcs();
        } else {
            if (i2 == 4) {
                return new bcp((byte[]) null, (char[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16125g;
        }
    }
}
