package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ah */
/* compiled from: IMASDK */
public final class C3837ah extends bkl<C3837ah, C3836ag> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C3837ah f14770i;

    /* renamed from: a */
    private int f14771a;

    /* renamed from: e */
    private bkq<bjq> f14772e = bkl.m16311ar();

    /* renamed from: f */
    private bjq f14773f = bjq.f16482b;

    /* renamed from: g */
    private int f14774g = 1;

    /* renamed from: h */
    private int f14775h = 1;

    static {
        C3837ah ahVar = new C3837ah();
        f14770i = ahVar;
        bkl.m16307an(C3837ah.class, ahVar);
    }

    private C3837ah() {
    }

    /* renamed from: a */
    public static C3836ag m13665a() {
        return (C3836ag) f14770i.mo15390aj();
    }

    /* renamed from: d */
    static /* synthetic */ void m13667d(C3837ah ahVar, bjq bjq) {
        ahVar.m13670g();
        ahVar.f14772e.add(bjq);
    }

    /* renamed from: e */
    static /* synthetic */ void m13668e(C3837ah ahVar, bjq bjq) {
        ahVar.f14771a |= 1;
        ahVar.f14773f = bjq;
    }

    /* renamed from: f */
    static /* synthetic */ void m13669f(C3837ah ahVar, C3829aa aaVar) {
        ahVar.f14775h = aaVar.mo13221a();
        ahVar.f14771a |= 4;
    }

    /* renamed from: g */
    private final void m13670g() {
        bkq<bjq> bkq = this.f14772e;
        if (!bkq.mo15173a()) {
            this.f14772e = bkl.m16312as(bkq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f14770i, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"a", "e", "f", "g", C3831ac.m12997b(), "h", C3829aa.m12688c()});
        } else if (i2 == 3) {
            return new C3837ah();
        } else {
            if (i2 == 4) {
                return new C3836ag((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f14770i;
        }
    }
}
