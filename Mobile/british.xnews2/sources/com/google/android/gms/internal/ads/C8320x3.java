package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8320x3 implements C8072q3 {

    /* renamed from: a */
    private final tp2 f41019a = new tp2(new byte[4], 4);

    /* renamed from: b */
    final /* synthetic */ C8392z3 f41020b;

    public C8320x3(C8392z3 z3Var) {
        this.f41020b = z3Var;
    }

    /* renamed from: a */
    public final void mo32326a(uq2 uq2) {
        if (uq2.mo35249s() == 0 && (uq2.mo35249s() & 128) != 0) {
            uq2.mo35237g(6);
            int i = uq2.mo35239i() / 4;
            for (int i2 = 0; i2 < i; i2++) {
                uq2.mo35231a(this.f41019a, 4);
                int c = this.f41019a.mo35008c(16);
                this.f41019a.mo35015j(3);
                if (c == 0) {
                    this.f41019a.mo35015j(13);
                } else {
                    int c2 = this.f41019a.mo35008c(13);
                    if (this.f41020b.f42307e.get(c2) == null) {
                        this.f41020b.f42307e.put(c2, new C8108r3(new C8356y3(this.f41020b, c2)));
                        C8392z3 z3Var = this.f41020b;
                        z3Var.f42313k = z3Var.f42313k + 1;
                    }
                }
            }
            this.f41020b.f42307e.remove(0);
        }
    }

    /* renamed from: b */
    public final void mo32327b(ay2 ay2, yb4 yb4, C7633e4 e4Var) {
    }
}
