package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.af */
/* compiled from: IMASDK */
public final class C3835af extends bkl<C3835af, C3834ae> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C3835af f14490f;

    /* renamed from: a */
    private int f14491a;

    /* renamed from: e */
    private String f14492e = "";

    static {
        C3835af afVar = new C3835af();
        f14490f = afVar;
        bkl.m16307an(C3835af.class, afVar);
    }

    private C3835af() {
    }

    /* renamed from: a */
    public static C3834ae m13418a() {
        return (C3834ae) f14490f.mo15390aj();
    }

    /* renamed from: d */
    static /* synthetic */ void m13420d(C3835af afVar, String str) {
        str.getClass();
        afVar.f14491a |= 1;
        afVar.f14492e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f14490f, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "e"});
        } else if (i2 == 3) {
            return new C3835af();
        } else {
            if (i2 == 4) {
                return new C3834ae((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f14490f;
        }
    }
}
