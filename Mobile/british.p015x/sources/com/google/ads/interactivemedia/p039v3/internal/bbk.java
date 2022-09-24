package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbk */
/* compiled from: IMASDK */
public final class bbk extends bkl<bbk, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final bbk f16010e;

    /* renamed from: a */
    private bcc f16011a;

    static {
        bbk bbk = new bbk();
        f16010e = bbk;
        bkl.m16307an(bbk.class, bbk);
    }

    private bbk() {
    }

    /* renamed from: c */
    public static bbk m15493c() {
        return f16010e;
    }

    /* renamed from: a */
    public final bcc mo14841a() {
        bcc bcc = this.f16011a;
        return bcc == null ? bcc.m15595d() : bcc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16010e, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bbk();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (boolean[][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16010e;
        }
    }
}
