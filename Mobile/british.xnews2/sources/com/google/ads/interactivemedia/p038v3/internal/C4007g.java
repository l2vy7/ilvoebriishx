package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.g */
/* compiled from: IMASDK */
public final class C4007g extends bkl<C4007g, C3953e> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C4007g f17093f;

    /* renamed from: a */
    private int f17094a;

    /* renamed from: e */
    private int f17095e = 2;

    static {
        C4007g gVar = new C4007g();
        f17093f = gVar;
        bkl.m16307an(C4007g.class, gVar);
    }

    private C4007g() {
    }

    /* renamed from: c */
    public static C4007g m17222c() {
        return f17093f;
    }

    /* renamed from: a */
    public final C4061i mo15861a() {
        C4061i a = C4061i.m17361a(this.f17095e);
        return a == null ? C4061i.ENUM_SIGNAL_SOURCE_ADSHIELD : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f17093f, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"a", "e", C4061i.m17362b()});
        } else if (i2 == 3) {
            return new C4007g();
        } else {
            if (i2 == 4) {
                return new C3953e((byte[]) null, (char[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f17093f;
        }
    }
}
