package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yt2 {

    /* renamed from: a */
    private final HashMap<ot2, xt2<?, ?>> f41995a = new HashMap<>();

    /* renamed from: a */
    public final <R extends v91<AdT>, AdT extends o61> xt2<R, AdT> mo35974a(ot2 ot2, Context context, gt2 gt2, eu2<R, AdT> eu2) {
        xt2<R, AdT> xt2 = this.f41995a.get(ot2);
        if (xt2 != null) {
            return xt2;
        }
        lt2 lt2 = new lt2(zzffu.m21324C0(ot2, context));
        xt2<R, AdT> xt22 = new xt2<>(lt2, new gu2(lt2, gt2, eu2));
        this.f41995a.put(ot2, xt22);
        return xt22;
    }
}
