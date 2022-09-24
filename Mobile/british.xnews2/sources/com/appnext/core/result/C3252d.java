package com.appnext.core.result;

/* renamed from: com.appnext.core.result.d */
public final class C3252d {

    /* renamed from: fp */
    private static C3252d f12442fp;

    /* renamed from: fj */
    private C3251c f12443fj;

    private C3252d() {
    }

    /* renamed from: aX */
    public static synchronized C3252d m10942aX() {
        C3252d dVar;
        synchronized (C3252d.class) {
            if (f12442fp == null) {
                f12442fp = new C3252d();
            }
            dVar = f12442fp;
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo10879a(C3251c cVar) {
        this.f12443fj = cVar;
    }

    /* renamed from: aY */
    public final C3251c mo10880aY() {
        return this.f12443fj;
    }
}
