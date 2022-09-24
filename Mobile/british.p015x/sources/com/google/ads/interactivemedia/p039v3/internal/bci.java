package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bci */
/* compiled from: IMASDK */
public final class bci extends bkl<bci, bch> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final bci f16097h;

    /* renamed from: a */
    private String f16098a = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f16099e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f16100f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f16101g;

    static {
        bci bci = new bci();
        f16097h = bci;
        bkl.m16307an(bci.class, bci);
    }

    private bci() {
    }

    /* renamed from: a */
    public static bch m15626a() {
        return (bch) f16097h.mo15390aj();
    }

    /* renamed from: d */
    static /* synthetic */ void m15628d(bci bci, String str) {
        str.getClass();
        bci.f16098a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16097h, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bci();
        } else {
            if (i2 == 4) {
                return new bch((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16097h;
        }
    }
}
