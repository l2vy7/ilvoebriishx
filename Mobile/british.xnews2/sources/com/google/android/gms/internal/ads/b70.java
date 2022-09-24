package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b70 implements e70<xt0> {
    b70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        if (map.keySet().contains(TtmlNode.START)) {
            xt0.mo18793u0().zzk();
        } else if (map.keySet().contains("stop")) {
            xt0.mo18793u0().zzl();
        } else if (map.keySet().contains("cancel")) {
            xt0.mo18793u0().zzj();
        }
    }
}
