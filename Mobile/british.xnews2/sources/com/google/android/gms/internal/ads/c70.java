package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class c70 implements e70<xt0> {
    c70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        if (map.keySet().contains(TtmlNode.START)) {
            xt0.mo18786s(true);
        }
        if (map.keySet().contains("stop")) {
            xt0.mo18786s(false);
        }
    }
}
