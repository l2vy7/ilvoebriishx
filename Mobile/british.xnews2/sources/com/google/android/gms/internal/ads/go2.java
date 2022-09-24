package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.o61;
import com.google.android.gms.internal.ads.v91;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class go2<R extends v91<AdT>, AdT extends o61> implements vo2<R, fo2<R, AdT>> {

    /* renamed from: a */
    private final kt2 f32376a;

    /* renamed from: b */
    private final Executor f32377b;

    /* renamed from: c */
    private final xa3<Void> f32378c = new eo2(this);

    public go2(kt2 kt2, Executor executor) {
        this.f32376a = kt2;
        this.f32377b = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ mb3 mo30442a(wo2 wo2, uo2 uo2, Object obj) {
        return mo32173c(wo2, uo2, (v91) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ mb3 mo32172b(v91 v91, po2 po2) throws Exception {
        tt2 tt2 = po2.f20654b;
        zzcdq zzcdq = po2.f20653a;
        st2<?, ?> d = tt2 != null ? this.f32376a.mo33180d(tt2) : null;
        if (tt2 == null) {
            return bb3.m30649i(null);
        }
        if (!(d == null || zzcdq == null)) {
            bb3.m30658r(v91.zzb().mo34672g(zzcdq), this.f32378c, this.f32377b);
        }
        return bb3.m30649i(new fo2(tt2, zzcdq, d));
    }

    /* renamed from: c */
    public final mb3<fo2<R, AdT>> mo32173c(wo2 wo2, uo2<R> uo2, R r) {
        return bb3.m30646f(bb3.m30654n(sa3.m37369D(new qo2(this.f32376a, r, this.f32377b).mo34373c()), new co2(this, r), this.f32377b), Exception.class, new do2(this), this.f32377b);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
