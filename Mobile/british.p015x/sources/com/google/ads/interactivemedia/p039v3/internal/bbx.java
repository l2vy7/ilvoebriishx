package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bbx */
/* compiled from: IMASDK */
public final class bbx extends bkl<bbx, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final bbx f16056f;

    /* renamed from: a */
    private int f16057a;

    /* renamed from: e */
    private int f16058e;

    static {
        bbx bbx = new bbx();
        f16056f = bbx;
        bkl.m16307an(bbx.class, bbx);
    }

    private bbx() {
    }

    /* renamed from: d */
    public static bbx m15565d() {
        return f16056f;
    }

    /* renamed from: a */
    public final bbt mo14873a() {
        bbt a = bbt.m15544a(this.f16057a);
        return a == null ? bbt.UNRECOGNIZED : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16056f, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new bbx();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (int[][][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16056f;
        }
    }

    /* renamed from: c */
    public final int mo14874c() {
        return this.f16058e;
    }
}
