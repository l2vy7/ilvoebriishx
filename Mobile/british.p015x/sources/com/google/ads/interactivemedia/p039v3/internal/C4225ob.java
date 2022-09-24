package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ob */
/* compiled from: IMASDK */
public final class C4225ob {

    /* renamed from: a */
    private final Handler f18151a;

    /* renamed from: b */
    private final C4226oc f18152b;

    public C4225ob(Handler handler, C4226oc ocVar) {
        this.f18151a = ocVar == null ? null : handler;
        this.f18152b = ocVar;
    }

    /* renamed from: a */
    public final void mo16391a(C4266pp ppVar) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4221ny(this, ppVar, (byte[]) null));
        }
    }

    /* renamed from: b */
    public final void mo16392b(String str, long j, long j2) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4216nt(this, str, j, j2));
        }
    }

    /* renamed from: c */
    public final void mo16393c(C4120ke keVar, C4270pt ptVar) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4217nu(this, keVar, ptVar));
        }
    }

    /* renamed from: d */
    public final void mo16394d(long j) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4218nv(this, j));
        }
    }

    /* renamed from: e */
    public final void mo16395e(int i, long j, long j2) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4219nw(this, i, j, j2));
        }
    }

    /* renamed from: f */
    public final void mo16396f(String str) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4220nx(this, str));
        }
    }

    /* renamed from: g */
    public final void mo16397g(C4266pp ppVar) {
        ppVar.mo16519a();
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4221ny(this, ppVar));
        }
    }

    /* renamed from: h */
    public final void mo16398h(boolean z) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4222nz(this, z));
        }
    }

    /* renamed from: i */
    public final void mo16399i(Exception exc) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4224oa(this, exc, (byte[]) null));
        }
    }

    /* renamed from: j */
    public final void mo16400j(Exception exc) {
        Handler handler = this.f18151a;
        if (handler != null) {
            handler.post(new C4224oa(this, exc));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo16401k(Exception exc) {
        C4226oc ocVar = this.f18152b;
        int i = amm.f15298a;
        ocVar.mo16287N(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo16402l(Exception exc) {
        C4226oc ocVar = this.f18152b;
        int i = amm.f15298a;
        ocVar.mo16286M(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo16403m(boolean z) {
        C4226oc ocVar = this.f18152b;
        int i = amm.f15298a;
        ocVar.mo16285L(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo16404n(C4266pp ppVar) {
        ppVar.mo16519a();
        C4226oc ocVar = this.f18152b;
        int i = amm.f15298a;
        ocVar.mo16284K(ppVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo16405o(String str) {
        C4226oc ocVar = this.f18152b;
        int i = amm.f15298a;
        ocVar.mo16283J(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo16406p(int i, long j, long j2) {
        C4226oc ocVar = this.f18152b;
        int i2 = amm.f15298a;
        ocVar.mo16282I(i, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo16407q(long j) {
        C4226oc ocVar = this.f18152b;
        int i = amm.f15298a;
        ocVar.mo16281H(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo16408r(C4120ke keVar, C4270pt ptVar) {
        int i = amm.f15298a;
        this.f18152b.mo16280G(keVar, ptVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo16409s(String str, long j, long j2) {
        C4226oc ocVar = this.f18152b;
        int i = amm.f15298a;
        ocVar.mo16279F(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo16410t(C4266pp ppVar) {
        C4226oc ocVar = this.f18152b;
        int i = amm.f15298a;
        ocVar.mo16278E(ppVar);
    }
}
