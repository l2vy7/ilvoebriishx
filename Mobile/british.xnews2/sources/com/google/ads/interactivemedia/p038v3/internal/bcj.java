package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcj */
/* compiled from: IMASDK */
public final class bcj extends bkl<bcj, bcg> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bcj f16102f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f16103a;

    /* renamed from: e */
    private bkq<bci> f16104e = bkl.m16311ar();

    static {
        bcj bcj = new bcj();
        f16102f = bcj;
        bkl.m16307an(bcj.class, bcj);
    }

    private bcj() {
    }

    /* renamed from: a */
    public static bcg m15633a() {
        return (bcg) f16102f.mo15390aj();
    }

    /* renamed from: e */
    static /* synthetic */ void m15636e(bcj bcj, bci bci) {
        bci.getClass();
        bcj.m15637f();
        bcj.f16104e.add(bci);
    }

    /* renamed from: f */
    private final void m15637f() {
        bkq<bci> bkq = this.f16104e;
        if (!bkq.mo15173a()) {
            this.f16104e = bkl.m16312as(bkq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16102f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "e", bci.class});
        } else if (i2 == 3) {
            return new bcj();
        } else {
            if (i2 == 4) {
                return new bcg((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16102f;
        }
    }
}
