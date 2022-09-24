package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rk2 implements yi2<JSONObject> {

    /* renamed from: a */
    private final String f38699a;

    /* renamed from: b */
    private final String f38700b;

    public rk2(String str, String str2) {
        this.f38699a = str;
        this.f38700b = str2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject zzf = zzby.zzf((JSONObject) obj, "pii");
            zzf.put("doritos", this.f38699a);
            zzf.put("doritos_v2", this.f38700b);
        } catch (JSONException unused) {
            zze.zza("Failed putting doritos string.");
        }
    }
}
