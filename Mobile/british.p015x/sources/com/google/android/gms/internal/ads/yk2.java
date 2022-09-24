package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yk2 implements yi2<JSONObject> {

    /* renamed from: a */
    private final Bundle f41909a;

    public yk2(Bundle bundle) {
        this.f41909a = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f41909a != null) {
            try {
                zzby.zzf(zzby.zzf(jSONObject, "device"), "play_store").put("parental_controls", zzt.zzp().zze(this.f41909a));
            } catch (JSONException unused) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
