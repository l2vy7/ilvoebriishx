package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.p */
/* compiled from: IMASDK */
public final class C4250p extends bkl<C4250p, C4331s> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C4250p f18289g;

    /* renamed from: a */
    private int f18290a;

    /* renamed from: e */
    private int f18291e;

    /* renamed from: f */
    private long f18292f = -1;

    static {
        C4250p pVar = new C4250p();
        f18289g = pVar;
        bkl.m16307an(C4250p.class, pVar);
    }

    private C4250p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f18289g, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "e", C4196n.m18126c(), "f"});
        } else if (i2 == 3) {
            return new C4250p();
        } else {
            if (i2 == 4) {
                return new C4331s((byte[]) null, (byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f18289g;
        }
    }
}
