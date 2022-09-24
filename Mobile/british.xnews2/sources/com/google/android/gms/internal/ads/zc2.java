package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zc2 implements xa3<o61> {

    /* renamed from: a */
    final /* synthetic */ sc2 f42420a;

    /* renamed from: b */
    final /* synthetic */ ex2 f42421b;

    /* renamed from: c */
    final /* synthetic */ uk1 f42422c;

    /* renamed from: d */
    final /* synthetic */ ad2 f42423d;

    zc2(ad2 ad2, sc2 sc2, ex2 ex2, uk1 uk1) {
        this.f42423d = ad2;
        this.f42420a = sc2;
        this.f42421b = ex2;
        this.f42422c = uk1;
    }

    public final void zza(Throwable th) {
        zzbew a = this.f42422c.mo35198a().mo34667a(th);
        this.f42422c.mo35199b().mo18436d(a);
        this.f42423d.f29607b.mo35285d().execute(new yc2(this, a));
        qs2.m36700b(a.f42935b, th, "NativeAdLoader.onFailure");
        this.f42420a.zza();
        if (this.f42421b != null) {
            gx2 d = this.f42423d.f29610e;
            ex2 ex2 = this.f42421b;
            ex2.mo31672c(a);
            ex2.mo31676g(false);
            d.mo32302a(ex2.mo31678i());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        o61 o61 = (o61) obj;
        synchronized (this.f42423d) {
            o61.mo33840e().mo35914a(this.f42423d.f29609d.mo34315d());
            this.f42420a.zzb(o61);
            this.f42423d.f29607b.mo35285d().execute(new xc2(this));
            if (this.f42421b != null) {
                gx2 d = this.f42423d.f29610e;
                ex2 ex2 = this.f42421b;
                ex2.mo31673d(o61.mo33842g().f39937b);
                ex2.mo31674e(o61.mo33838c().zze());
                ex2.mo31676g(true);
                d.mo32302a(ex2.mo31678i());
            }
        }
    }
}
