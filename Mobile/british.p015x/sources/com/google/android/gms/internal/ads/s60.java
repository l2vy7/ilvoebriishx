package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s60 implements e70<xt0> {
    s60() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        JSONObject zza;
        xt0 xt0 = (xt0) obj;
        d30 u = xt0.mo18792u();
        if (u == null || (zza = u.zza()) == null) {
            xt0.mo18322a("nativeAdViewSignalsReady", new JSONObject());
        } else {
            xt0.mo18322a("nativeAdViewSignalsReady", zza);
        }
    }
}
