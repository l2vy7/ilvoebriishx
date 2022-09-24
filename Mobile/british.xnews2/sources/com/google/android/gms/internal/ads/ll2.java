package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzby;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ll2 implements yi2<JSONObject> {

    /* renamed from: a */
    private final String f35134a;

    public ll2(String str) {
        this.f35134a = str;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.f35134a)) {
                zzby.zzf(jSONObject, "pii").put("adsid", this.f35134a);
            }
        } catch (JSONException e) {
            co0.zzk("Failed putting trustless token.", e);
        }
    }
}
