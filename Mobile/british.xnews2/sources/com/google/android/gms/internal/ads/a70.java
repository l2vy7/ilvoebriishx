package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a70 implements e70<xt0> {
    a70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            xt0.zzbv();
        } else if ("resume".equals(str)) {
            xt0.zzbw();
        }
    }
}
