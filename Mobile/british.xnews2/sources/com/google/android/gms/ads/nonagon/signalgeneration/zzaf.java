package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.ha3;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.vz1;
import com.google.android.gms.internal.ads.zzcdq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaf implements ha3<zzcdq, zzah> {

    /* renamed from: a */
    private final Executor f28072a;

    /* renamed from: b */
    private final vz1 f28073b;

    public zzaf(Executor executor, vz1 vz1) {
        this.f28072a = executor;
        this.f28073b = vz1;
    }

    public final /* bridge */ /* synthetic */ mb3 zza(Object obj) throws Exception {
        zzcdq zzcdq = (zzcdq) obj;
        return bb3.m30654n(this.f28073b.mo35518b(zzcdq), new zzae(zzcdq), this.f28072a);
    }
}
