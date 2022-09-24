package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.b */
/* compiled from: IMASDK */
public final class C3872b extends bkl<C3872b, C3953e> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C3872b f15936g;

    /* renamed from: a */
    private int f15937a;

    /* renamed from: e */
    private String f15938e = "";

    /* renamed from: f */
    private String f15939f = "";

    static {
        C3872b bVar = new C3872b();
        f15936g = bVar;
        bkl.m16307an(C3872b.class, bVar);
    }

    private C3872b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f15936g, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new C3872b();
        } else {
            if (i2 == 4) {
                return new C3953e((byte[]) null, (byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f15936g;
        }
    }
}
