package com.google.ads.interactivemedia.p038v3.internal;

@Deprecated
/* renamed from: com.google.ads.interactivemedia.v3.internal.bcd */
/* compiled from: IMASDK */
public final class bcd extends bkl<bcd, bak> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final bcd f16083i;

    /* renamed from: a */
    private String f16084a = "";

    /* renamed from: e */
    private String f16085e = "";

    /* renamed from: f */
    private int f16086f;

    /* renamed from: g */
    private boolean f16087g;

    /* renamed from: h */
    private String f16088h = "";

    static {
        bcd bcd = new bcd();
        f16083i = bcd;
        bkl.m16307an(bcd.class, bcd);
    }

    private bcd() {
    }

    /* renamed from: a */
    public final String mo14894a() {
        return this.f16084a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f16083i, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"a", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bcd();
        } else {
            if (i2 == 4) {
                return new bak((byte[]) null, (float[][][]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f16083i;
        }
    }

    /* renamed from: c */
    public final String mo14895c() {
        return this.f16085e;
    }

    /* renamed from: d */
    public final int mo14896d() {
        return this.f16086f;
    }

    /* renamed from: e */
    public final boolean mo14897e() {
        return this.f16087g;
    }

    /* renamed from: f */
    public final String mo14898f() {
        return this.f16088h;
    }
}
