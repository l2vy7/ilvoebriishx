package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.z */
/* compiled from: IMASDK */
public final class C4520z extends bkl<C4520z, C4493y> implements blo {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C4520z f19722i;

    /* renamed from: a */
    private int f19723a;

    /* renamed from: e */
    private bjq f19724e;

    /* renamed from: f */
    private bjq f19725f;

    /* renamed from: g */
    private bjq f19726g;

    /* renamed from: h */
    private bjq f19727h;

    static {
        C4520z zVar = new C4520z();
        f19722i = zVar;
        bkl.m16307an(C4520z.class, zVar);
    }

    private C4520z() {
        bjq bjq = bjq.f16482b;
        this.f19724e = bjq;
        this.f19725f = bjq;
        this.f19726g = bjq;
        this.f19727h = bjq;
    }

    /* renamed from: f */
    public static C4520z m19614f(byte[] bArr, bka bka) throws bkt {
        return (C4520z) bkl.m16314au(f19722i, bArr, bka);
    }

    /* renamed from: g */
    public static C4493y m19615g() {
        return (C4493y) f19722i.mo15390aj();
    }

    /* renamed from: i */
    static /* synthetic */ void m19617i(C4520z zVar, bjq bjq) {
        zVar.f19723a |= 1;
        zVar.f19724e = bjq;
    }

    /* renamed from: j */
    static /* synthetic */ void m19618j(C4520z zVar, bjq bjq) {
        zVar.f19723a |= 2;
        zVar.f19725f = bjq;
    }

    /* renamed from: k */
    static /* synthetic */ void m19619k(C4520z zVar, bjq bjq) {
        zVar.f19723a |= 4;
        zVar.f19726g = bjq;
    }

    /* renamed from: l */
    static /* synthetic */ void m19620l(C4520z zVar, bjq bjq) {
        zVar.f19723a |= 8;
        zVar.f19727h = bjq;
    }

    /* renamed from: a */
    public final bjq mo16876a() {
        return this.f19724e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo13480b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return bkl.m16308ao(f19722i, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new C4520z();
        } else {
            if (i2 == 4) {
                return new C4493y((byte[]) null);
            }
            if (i2 != 5) {
                return null;
            }
            return f19722i;
        }
    }

    /* renamed from: c */
    public final bjq mo16877c() {
        return this.f19725f;
    }

    /* renamed from: d */
    public final bjq mo16878d() {
        return this.f19726g;
    }

    /* renamed from: e */
    public final bjq mo16879e() {
        return this.f19727h;
    }
}
