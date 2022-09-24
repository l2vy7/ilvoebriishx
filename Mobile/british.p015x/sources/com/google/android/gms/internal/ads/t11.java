package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t11 implements f11 {

    /* renamed from: a */
    private final ml0 f39241a;

    t11(ml0 ml0) {
        this.f39241a = ml0;
    }

    /* renamed from: a */
    public final void mo31708a(JSONObject jSONObject) {
        int i;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            i = -1;
        } else {
            i = jSONObject.optBoolean("npa");
        }
        this.f39241a.mo33553b(i, optLong);
    }
}
