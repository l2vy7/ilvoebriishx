package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fm2 implements xa3 {

    /* renamed from: a */
    final /* synthetic */ sc2 f31806a;

    /* renamed from: b */
    final /* synthetic */ ex2 f31807b;

    /* renamed from: c */
    final /* synthetic */ hm2 f31808c;

    /* renamed from: d */
    final /* synthetic */ im2 f31809d;

    fm2(im2 im2, sc2 sc2, ex2 ex2, hm2 hm2) {
        this.f31809d = im2;
        this.f31806a = sc2;
        this.f31807b = ex2;
        this.f31808c = hm2;
    }

    public final void zza(Throwable th) {
        zzbew zzbew;
        u31 u31 = (u31) this.f31809d.f20445e.zzd();
        if (u31 == null) {
            zzbew = us2.m38444b(th, (w42) null);
        } else {
            zzbew = u31.zzb().mo34667a(th);
        }
        synchronized (this.f31809d) {
            this.f31809d.f20449i = null;
            if (u31 != null) {
                u31.zzc().mo18436d(zzbew);
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37013W5)).booleanValue()) {
                    this.f31809d.f20442b.execute(new em2(this, zzbew));
                }
            } else {
                this.f31809d.f20444d.mo18436d(zzbew);
                ((u31) this.f31809d.m20583l(this.f31808c).zzh()).zzb().mo34668c().zzb();
            }
            qs2.m36700b(zzbew.f42935b, th, "AppOpenAdLoader.onFailure");
            this.f31806a.zza();
            if (this.f31807b != null) {
                gx2 g = this.f31809d.f20447g;
                ex2 ex2 = this.f31807b;
                ex2.mo31672c(zzbew);
                ex2.mo31676g(false);
                g.mo32302a(ex2.mo31678i());
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        o61 o61 = (o61) obj;
        synchronized (this.f31809d) {
            this.f31809d.f20449i = null;
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37013W5)).booleanValue()) {
                o61.mo33840e().mo35915b(this.f31809d.f20444d);
            }
            this.f31806a.zzb(o61);
            if (this.f31807b != null) {
                gx2 g = this.f31809d.f20447g;
                ex2 ex2 = this.f31807b;
                ex2.mo31673d(o61.mo33842g().f39937b);
                ex2.mo31674e(o61.mo33838c().zze());
                ex2.mo31676g(true);
                g.mo32302a(ex2.mo31678i());
            }
        }
    }
}
