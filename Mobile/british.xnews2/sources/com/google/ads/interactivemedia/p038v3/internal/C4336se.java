package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.se */
/* compiled from: IMASDK */
final class C4336se implements C4298qu {

    /* renamed from: a */
    private final C4316rl f18580a;

    /* renamed from: b */
    private final int f18581b;

    /* renamed from: c */
    private final C4312rh f18582c = new C4312rh();

    /* synthetic */ C4336se(C4316rl rlVar, int i) {
        this.f18580a = rlVar;
        this.f18581b = i;
    }

    /* renamed from: c */
    private final long m18842c(C4307rc rcVar) throws IOException {
        while (rcVar.mo16604k() < rcVar.mo16606m() - 6 && !C4038hd.m17322h(rcVar, this.f18580a, this.f18581b, this.f18582c)) {
            rcVar.mo16602i(1);
        }
        if (rcVar.mo16604k() < rcVar.mo16606m() - 6) {
            return this.f18582c.f18506a;
        }
        rcVar.mo16602i((int) (rcVar.mo16606m() - rcVar.mo16604k()));
        return this.f18580a.f18521j;
    }

    /* renamed from: a */
    public final C4297qt mo16585a(C4307rc rcVar, long j) throws IOException {
        long l = rcVar.mo16605l();
        long c = m18842c(rcVar);
        long k = rcVar.mo16604k();
        rcVar.mo16602i(Math.max(6, this.f18580a.f18514c));
        long c2 = m18842c(rcVar);
        long k2 = rcVar.mo16604k();
        if (c > j || c2 <= j) {
            return c2 <= j ? C4297qt.m18675b(c2, k2) : C4297qt.m18674a(c, l);
        }
        return C4297qt.m18676c(k);
    }

    /* renamed from: b */
    public final void mo16586b() {
    }
}
