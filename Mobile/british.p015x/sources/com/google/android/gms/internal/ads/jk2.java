package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jk2 implements yi2<JSONObject> {

    /* renamed from: a */
    private final JSONObject f33911a;

    public jk2(JSONObject jSONObject) {
        this.f33911a = jSONObject;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f33911a);
        } catch (JSONException unused) {
            zze.zza("Unable to get cache_state");
        }
    }
}
