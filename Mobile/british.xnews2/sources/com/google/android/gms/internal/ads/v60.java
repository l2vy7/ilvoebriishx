package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v60 implements e70<xt0> {
    v60() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        if (xt0.zzL() != null) {
            xt0.zzL().zza();
        }
        zzl h = xt0.mo18752h();
        if (h != null) {
            h.zzb();
            return;
        }
        zzl i = xt0.mo18754i();
        if (i != null) {
            i.zzb();
        } else {
            co0.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
