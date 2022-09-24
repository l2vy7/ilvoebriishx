package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.f */
/* compiled from: IMASDK */
public final class C3980f extends bkl<C3980f, C3953e> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C3980f f17036g;

    /* renamed from: a */
    private int f17037a;

    /* renamed from: e */
    private C4007g f17038e;

    /* renamed from: f */
    private C4088j f17039f;

    static {
        C3980f fVar = new C3980f();
        f17036g = fVar;
        bkl.m16307an(C3980f.class, fVar);
    }

    private C3980f() {
    }

    /* renamed from: f */
    public static C3980f m17087f(byte[] bArr, bka bka) throws bkt {
        return (C3980f) bkl.m16314au(f17036g, bArr, bka);
    }

    /* renamed from: a */
    public final boolean mo15764a() {
        return (this.f17037a & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f17036g, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "e", "f"});
        } else if (i2 == 3) {
            return new C3980f();
        } else {
            if (i2 == 4) {
                return new C3953e((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f17036g;
        }
    }

    /* renamed from: c */
    public final C4007g mo15765c() {
        C4007g gVar = this.f17038e;
        return gVar == null ? C4007g.m17222c() : gVar;
    }

    /* renamed from: d */
    public final boolean mo15766d() {
        return (this.f17037a & 2) != 0;
    }

    /* renamed from: e */
    public final C4088j mo15767e() {
        C4088j jVar = this.f17039f;
        return jVar == null ? C4088j.m17482d() : jVar;
    }
}
