package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.v91;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ko2<RequestComponentT extends v91<AdT>, AdT> implements vo2<RequestComponentT, AdT> {

    /* renamed from: a */
    private final vo2<RequestComponentT, AdT> f34382a;
    @GuardedBy("this")

    /* renamed from: b */
    private RequestComponentT f34383b;

    public ko2(vo2<RequestComponentT, AdT> vo2) {
        this.f34382a = vo2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ mb3 mo30442a(wo2 wo2, uo2 uo2, Object obj) {
        return mo33120c(wo2, uo2, (v91) null);
    }

    /* renamed from: b */
    public final synchronized RequestComponentT zzd() {
        return this.f34383b;
    }

    /* renamed from: c */
    public final synchronized mb3<AdT> mo33120c(wo2 wo2, uo2<RequestComponentT> uo2, RequestComponentT requestcomponentt) {
        this.f34383b = requestcomponentt;
        if (wo2.f20977a != null) {
            s71 zzb = requestcomponentt.zzb();
            return zzb.mo34673h(zzb.mo34675j(bb3.m30649i(wo2.f20977a)));
        }
        return ((jo2) this.f34382a).mo32918c(wo2, uo2, requestcomponentt);
    }
}
