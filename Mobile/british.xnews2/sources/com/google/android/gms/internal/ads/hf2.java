package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hf2 implements yi2<Bundle> {
    @Nullable

    /* renamed from: a */
    private final JSONObject f20377a;
    @Nullable

    /* renamed from: b */
    private final JSONObject f20378b;

    public hf2(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.f20377a = jSONObject;
        this.f20378b = jSONObject2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f20377a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f20378b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
