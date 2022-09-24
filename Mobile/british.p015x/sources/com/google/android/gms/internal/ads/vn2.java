package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.o61;
import com.google.android.gms.internal.ads.v91;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vn2<R extends v91<AdT>, AdT extends o61> implements vo2<R, st2<R, AdT>> {

    /* renamed from: a */
    private R f40486a;

    /* renamed from: b */
    private final Executor f40487b = tb3.m37771b();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ mb3 mo30442a(wo2 wo2, uo2 uo2, Object obj) {
        return mo35453c(wo2, uo2, (v91) null);
    }

    /* renamed from: b */
    public final R mo35452b() {
        return this.f40486a;
    }

    /* renamed from: c */
    public final mb3<st2<R, AdT>> mo35453c(wo2 wo2, uo2<R> uo2, R r) {
        t91<R> a = uo2.mo30961a(wo2.f20978b);
        a.mo32468g(new bp2(true));
        R r2 = (v91) a.zzh();
        this.f40486a = r2;
        s71 zzb = r2.zzb();
        st2 st2 = new st2();
        return bb3.m30653m(bb3.m30654n(sa3.m37369D(zzb.mo34674i()), new un2(this, st2, zzb), this.f40487b), new tn2(st2), this.f40487b);
    }

    public final /* synthetic */ Object zzd() {
        return this.f40486a;
    }
}
