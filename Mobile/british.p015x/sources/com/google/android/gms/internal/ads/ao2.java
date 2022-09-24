package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.o61;
import com.google.android.gms.internal.ads.v91;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ao2<R extends v91<AdT>, AdT extends o61> implements vo2<R, AdT> {

    /* renamed from: a */
    private final vo2<R, AdT> f29701a;

    /* renamed from: b */
    private final vo2<R, fo2<R, AdT>> f29702b;

    /* renamed from: c */
    private final gu2<R, AdT> f29703c;

    /* renamed from: d */
    private final String f29704d;
    @GuardedBy("this")

    /* renamed from: e */
    private R f29705e;

    /* renamed from: f */
    private final Executor f29706f;

    public ao2(vo2<R, AdT> vo2, vo2<R, fo2<R, AdT>> vo22, gu2<R, AdT> gu2, String str, Executor executor) {
        this.f29701a = vo2;
        this.f29702b = vo22;
        this.f29703c = gu2;
        this.f29704d = str;
        this.f29706f = executor;
    }

    /* renamed from: f */
    private final mb3<AdT> m30409f(st2<R, AdT> st2, wo2 wo2) {
        R r = st2.f39060a;
        this.f29705e = r;
        if (st2.f39062c != null) {
            if (r.zzf() != null) {
                st2.f39062c.mo33841f().mo33163c(st2.f39060a.zzf());
            }
            return bb3.m30649i(st2.f39062c);
        }
        r.zzb().mo34676k(st2.f39061b);
        return ((ko2) this.f29701a).mo33120c(wo2, (uo2) null, st2.f39060a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ mb3 mo30442a(wo2 wo2, uo2 uo2, Object obj) {
        return mo30446e(wo2, uo2, (v91) null);
    }

    /* renamed from: b */
    public final synchronized R zzd() {
        return this.f29705e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo30444c(wo2 wo2, zn2 zn2, uo2 uo2, v91 v91, fo2 fo2) throws Exception {
        if (fo2 != null) {
            zn2 zn22 = new zn2(zn2.f42532a, zn2.f42533b, zn2.f42534c, zn2.f42535d, zn2.f42536e, zn2.f42537f, fo2.f31832a);
            if (fo2.f31834c != null) {
                this.f29705e = null;
                this.f29703c.mo32292e(zn22);
                return m30409f(fo2.f31834c, wo2);
            }
            mb3<du2<R, AdT>> a = this.f29703c.mo32291a(zn22);
            if (a != null) {
                this.f29705e = null;
                return bb3.m30654n(a, new wn2(this), this.f29706f);
            }
            this.f29703c.mo32292e(zn22);
            wo2 = new wo2(wo2.f20978b, fo2.f31833b);
        }
        mb3 c = ((ko2) this.f29701a).mo33120c(wo2, uo2, v91);
        this.f29705e = v91;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ mb3 mo30445d(du2 du2) throws Exception {
        fu2<U, A> fu2;
        if (du2 == null || du2.f31005a == null || (fu2 = du2.f31006b) == null) {
            throw new wy1(1, "Empty prefetch");
        }
        C8236uq E = C7513ar.m30443E();
        C8164sq E2 = C8200tq.m37948E();
        E2.mo34773H(2);
        E2.mo34771B(C8342xq.m39530H());
        E.mo35221y(E2);
        du2.f31005a.f39060a.zzb().mo34668c().mo18439r((C7513ar) E.mo32424p());
        return m30409f(du2.f31005a, ((zn2) fu2).f42533b);
    }

    /* renamed from: e */
    public final synchronized mb3<AdT> mo30446e(wo2 wo2, uo2<R> uo2, R r) {
        wo2 wo22 = wo2;
        uo2<R> uo22 = uo2;
        synchronized (this) {
            t91<R> a = uo22.mo30961a(wo22.f20978b);
            a.mo32469k(new bo2(this.f29704d));
            R r2 = (v91) a.zzh();
            r2.zzg();
            r2.zzg();
            zzbfd zzbfd = r2.zzg().f30087d;
            if (zzbfd.f42958t == null) {
                if (zzbfd.f42963y == null) {
                    bs2 zzg = r2.zzg();
                    uo2<R> uo23 = uo2;
                    wo2 wo23 = wo2;
                    mb3<AdT> n = bb3.m30654n(sa3.m37369D(((go2) this.f29702b).mo32173c(wo22, uo22, r2)), new xn2(this, wo2, new zn2(uo23, wo23, zzg.f30087d, zzg.f30089f, this.f29706f, zzg.f30093j, (tt2) null), uo2, r2), this.f29706f);
                    return n;
                }
            }
            this.f29705e = r2;
            mb3<AdT> c = ((ko2) this.f29701a).mo33120c(wo22, uo22, r2);
            return c;
        }
    }
}
