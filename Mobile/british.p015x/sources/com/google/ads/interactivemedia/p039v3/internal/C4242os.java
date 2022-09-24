package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.os */
/* compiled from: IMASDK */
public final class C4242os {

    /* renamed from: a */
    private final C4215ns[] f18223a;

    /* renamed from: b */
    private final C4259pi f18224b;

    /* renamed from: c */
    private final C4261pk f18225c;

    public C4242os(C4215ns... nsVarArr) {
        C4259pi piVar = new C4259pi();
        C4261pk pkVar = new C4261pk();
        C4215ns[] nsVarArr2 = new C4215ns[2];
        this.f18223a = nsVarArr2;
        System.arraycopy(nsVarArr, 0, nsVarArr2, 0, 0);
        this.f18224b = piVar;
        this.f18225c = pkVar;
        nsVarArr2[0] = piVar;
        nsVarArr2[1] = pkVar;
    }

    /* renamed from: a */
    public final C4215ns[] mo16477a() {
        return this.f18223a;
    }

    /* renamed from: b */
    public final long mo16478b(long j) {
        return this.f18225c.mo16504k(j);
    }

    /* renamed from: c */
    public final long mo16479c() {
        return this.f18224b.mo16495p();
    }

    /* renamed from: d */
    public final void mo16480d(C4146ld ldVar) {
        this.f18225c.mo16502i(ldVar.f17826b);
        this.f18225c.mo16503j(ldVar.f17827c);
    }

    /* renamed from: e */
    public final void mo16481e(boolean z) {
        this.f18224b.mo16494o(z);
    }
}
