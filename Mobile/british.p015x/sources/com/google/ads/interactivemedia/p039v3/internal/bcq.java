package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcq */
/* compiled from: IMASDK */
public final class bcq extends bkl<bcq, bcp> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bcq f16113f;

    /* renamed from: a */
    private String f16114a = "";

    /* renamed from: e */
    private bcc f16115e;

    static {
        bcq bcq = new bcq();
        f16113f = bcq;
        bkl.m16307an(bcq.class, bcq);
    }

    private bcq() {
    }

    /* renamed from: d */
    public static bcq m15664d(bjq bjq, bka bka) throws bkt {
        return (bcq) bkl.m16313at(f16113f, bjq, bka);
    }

    /* renamed from: e */
    public static bcq m15665e() {
        return f16113f;
    }

    /* renamed from: a */
    public final String mo14922a() {
        return this.f16114a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16113f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bcq();
        } else {
            if (i2 == 4) {
                return new bcp((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16113f;
        }
    }

    /* renamed from: c */
    public final bcc mo14923c() {
        bcc bcc = this.f16115e;
        return bcc == null ? bcc.m15595d() : bcc;
    }
}
