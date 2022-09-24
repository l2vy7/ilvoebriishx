package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ip2 implements xa3<zi1> {

    /* renamed from: a */
    final /* synthetic */ sc2 f33396a;

    /* renamed from: b */
    final /* synthetic */ ex2 f33397b;

    /* renamed from: c */
    final /* synthetic */ xj1 f33398c;

    /* renamed from: d */
    final /* synthetic */ jp2 f33399d;

    ip2(jp2 jp2, sc2 sc2, ex2 ex2, xj1 xj1) {
        this.f33399d = jp2;
        this.f33396a = sc2;
        this.f33397b = ex2;
        this.f33398c = xj1;
    }

    public final void zza(Throwable th) {
        zzbew a = this.f33398c.mo35760a().mo34667a(th);
        synchronized (this.f33399d) {
            this.f33399d.f33973i = null;
            this.f33398c.mo35761b().mo18436d(a);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37021X5)).booleanValue()) {
                this.f33399d.f33966b.execute(new gp2(this, a));
                this.f33399d.f33966b.execute(new hp2(this, a));
            }
            qs2.m36700b(a.f42935b, th, "InterstitialAdLoader.onFailure");
            if (this.f33397b != null) {
                gx2 d = this.f33399d.f33971g;
                ex2 ex2 = this.f33397b;
                ex2.mo31672c(a);
                ex2.mo31676g(false);
                d.mo32302a(ex2.mo31678i());
            }
            this.f33396a.zza();
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zi1 zi1 = (zi1) obj;
        synchronized (this.f33399d) {
            this.f33399d.f33973i = null;
            h00 h00 = p00.f37021X5;
            if (((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue()) {
                ye1 e = zi1.mo33840e();
                e.mo35914a(this.f33399d.f33968d);
                e.mo35917d(this.f33399d.f33969e);
            }
            this.f33396a.zzb(zi1);
            if (((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue()) {
                this.f33399d.f33966b.execute(new ep2(this));
                this.f33399d.f33966b.execute(new fp2(this));
            }
            if (this.f33397b != null) {
                gx2 d = this.f33399d.f33971g;
                ex2 ex2 = this.f33397b;
                ex2.mo31673d(zi1.mo33842g().f39937b);
                ex2.mo31674e(zi1.mo33838c().zze());
                ex2.mo31676g(true);
                d.mo32302a(ex2.mo31678i());
            }
        }
    }
}
