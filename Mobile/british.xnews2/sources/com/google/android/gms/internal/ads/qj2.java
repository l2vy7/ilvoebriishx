package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qj2 implements yi2<JSONObject> {

    /* renamed from: a */
    private final AdvertisingIdClient.Info f38157a;

    /* renamed from: b */
    private final String f38158b;

    public qj2(AdvertisingIdClient.Info info, String str) {
        this.f38157a = info;
        this.f38158b = str;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject zzf = zzby.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f38157a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                zzf.put("pdid", this.f38158b);
                zzf.put("pdidtype", "ssaid");
                return;
            }
            zzf.put("rdid", this.f38157a.getId());
            zzf.put("is_lat", this.f38157a.isLimitAdTrackingEnabled());
            zzf.put("idtype", "adid");
        } catch (JSONException e) {
            zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
