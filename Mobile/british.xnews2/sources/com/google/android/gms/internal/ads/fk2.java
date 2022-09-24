package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fk2 implements yi2<JSONObject> {

    /* renamed from: a */
    private final String f31784a;

    public fk2(String str) {
        this.f31784a = str;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject zzf = zzby.zzf((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f31784a)) {
                zzf.put("attok", this.f31784a);
            }
        } catch (JSONException e) {
            zze.zzb("Failed putting attestation token.", e);
        }
    }
}
