package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.ha3;
import com.google.android.gms.internal.ads.mb3;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zzd implements ha3 {
    public static final /* synthetic */ zzd zza = new zzd();

    private /* synthetic */ zzd() {
    }

    public final mb3 zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzt.zzo().mo18583h().zzs(jSONObject.getString("appSettingsJson"));
        }
        return bb3.m30649i(null);
    }
}
