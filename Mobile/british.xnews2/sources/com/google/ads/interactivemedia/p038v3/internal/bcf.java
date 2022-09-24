package com.google.ads.interactivemedia.p038v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcf */
/* compiled from: IMASDK */
public final class bcf extends bkl<bcf, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bcf f16094f;

    /* renamed from: a */
    private int f16095a;

    /* renamed from: e */
    private bkq<bce> f16096e = bkl.m16311ar();

    static {
        bcf bcf = new bcf();
        f16094f = bcf;
        bkl.m16307an(bcf.class, bcf);
    }

    private bcf() {
    }

    /* renamed from: e */
    public static bcf m15614e(byte[] bArr, bka bka) throws bkt {
        return (bcf) bkl.m16314au(f16094f, bArr, bka);
    }

    /* renamed from: a */
    public final int mo14904a() {
        return this.f16095a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16094f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "e", bce.class});
        } else if (i2 == 3) {
            return new bcf();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16094f;
        }
    }

    /* renamed from: c */
    public final List<bce> mo14905c() {
        return this.f16096e;
    }

    /* renamed from: d */
    public final int mo14906d() {
        return this.f16096e.size();
    }
}
