package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mk2 implements zi2<yi2<JSONObject>> {

    /* renamed from: a */
    private final JSONObject f35540a;

    mk2(Context context) {
        this.f35540a = ej0.m31845c(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo33552a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f35540a);
        } catch (JSONException unused) {
            zze.zza("Failed putting version constants.");
        }
    }

    public final mb3<yi2<JSONObject>> zzb() {
        return bb3.m30649i(new lk2(this));
    }
}
