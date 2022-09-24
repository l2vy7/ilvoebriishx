package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.v91;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jo2<RequestComponentT extends v91<AdT>, AdT> implements vo2<RequestComponentT, AdT> {
    @GuardedBy("this")

    /* renamed from: a */
    private RequestComponentT f33961a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ mb3 mo30442a(wo2 wo2, uo2 uo2, Object obj) {
        return mo32918c(wo2, uo2, (v91) null);
    }

    /* renamed from: b */
    public final synchronized RequestComponentT zzd() {
        return this.f33961a;
    }

    /* renamed from: c */
    public final synchronized mb3<AdT> mo32918c(wo2 wo2, uo2<RequestComponentT> uo2, RequestComponentT requestcomponentt) {
        s71 zzb;
        if (requestcomponentt != null) {
            this.f33961a = requestcomponentt;
        } else {
            this.f33961a = (v91) uo2.mo30961a(wo2.f20978b).zzh();
        }
        zzb = this.f33961a.zzb();
        return zzb.mo34673h(zzb.mo34674i());
    }
}
