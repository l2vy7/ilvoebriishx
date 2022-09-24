package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rq2 implements xa3<yr1> {

    /* renamed from: a */
    final /* synthetic */ sc2 f38759a;

    /* renamed from: b */
    final /* synthetic */ ex2 f38760b;

    /* renamed from: c */
    final /* synthetic */ tq2 f38761c;

    /* renamed from: d */
    final /* synthetic */ vq2 f38762d;

    rq2(vq2 vq2, sc2 sc2, ex2 ex2, tq2 tq2) {
        this.f38762d = vq2;
        this.f38759a = sc2;
        this.f38760b = ex2;
        this.f38761c = tq2;
    }

    public final void zza(Throwable th) {
        zzbew zzbew;
        ds1 ds1 = (ds1) this.f38762d.f40519e.zzd();
        if (ds1 == null) {
            zzbew = us2.m38444b(th, (w42) null);
        } else {
            zzbew = ds1.zzb().mo34667a(th);
        }
        synchronized (this.f38762d) {
            if (ds1 != null) {
                ds1.mo31405a().mo18436d(zzbew);
                this.f38762d.f40516b.execute(new qq2(this, zzbew));
            } else {
                this.f38762d.f40518d.mo18436d(zzbew);
                this.f38762d.m38878j(this.f38761c).zze().zzb().mo34668c().zzb();
            }
            qs2.m36700b(zzbew.f42935b, th, "RewardedAdLoader.onFailure");
            if (this.f38760b != null) {
                gx2 f = this.f38762d.f40521g;
                ex2 ex2 = this.f38760b;
                ex2.mo31672c(zzbew);
                ex2.mo31676g(false);
                f.mo32302a(ex2.mo31678i());
            }
            this.f38759a.zza();
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        yr1 yr1 = (yr1) obj;
        synchronized (this.f38762d) {
            yr1.mo33840e().mo35917d(this.f38762d.f40518d);
            this.f38759a.zzb(yr1);
            Executor g = this.f38762d.f40516b;
            kq2 e = this.f38762d.f40518d;
            e.getClass();
            g.execute(new pq2(e));
            this.f38762d.f40518d.mo18124l();
            if (this.f38760b != null) {
                gx2 f = this.f38762d.f40521g;
                ex2 ex2 = this.f38760b;
                ex2.mo31673d(yr1.mo33842g().f39937b);
                ex2.mo31674e(yr1.mo33838c().zze());
                ex2.mo31676g(true);
                f.mo32302a(ex2.mo31678i());
            }
        }
    }
}
