package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cj2<T> {

    /* renamed from: a */
    private final Set<zi2<? extends yi2<T>>> f30402a;

    /* renamed from: b */
    private final Executor f30403b;

    public cj2(Executor executor, Set<zi2<? extends yi2<T>>> set) {
        this.f30403b = executor;
        this.f30402a = set;
    }

    /* renamed from: a */
    public final mb3<T> mo30938a(T t) {
        ArrayList arrayList = new ArrayList(this.f30402a.size());
        for (zi2 next : this.f30402a) {
            mb3 zzb = next.zzb();
            if (g20.f32112a.mo34648e().booleanValue()) {
                zzb.zzc(new aj2(next, zzt.zzA().elapsedRealtime()), po0.f37727f);
            }
            arrayList.add(zzb);
        }
        return bb3.m30643c(arrayList).mo30342a(new bj2(arrayList, t), this.f30403b);
    }
}
