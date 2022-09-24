package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t60 implements e70<xt0> {
    t60() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        JSONObject zzb;
        xt0 xt0 = (xt0) obj;
        d30 u = xt0.mo18792u();
        if (u == null || (zzb = u.zzb()) == null) {
            xt0.mo18322a("nativeClickMetaReady", new JSONObject());
        } else {
            xt0.mo18322a("nativeClickMetaReady", zzb);
        }
    }
}
