package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class eh0 {

    /* renamed from: a */
    public final boolean f31385a;

    /* renamed from: b */
    public final String f31386b;

    public eh0(boolean z, String str) {
        this.f31385a = z;
        this.f31386b = str;
    }

    /* renamed from: a */
    public static eh0 m31842a(JSONObject jSONObject) {
        return new eh0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
