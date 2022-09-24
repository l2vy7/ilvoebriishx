package com.appnext.base.moments.p030b;

import com.appnext.base.moments.p027a.p028a.C3130c;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.appnext.base.moments.b.a */
public final class C3135a {
    /* renamed from: b */
    public static C3130c m10611b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        try {
            String string = jSONObject2.has("key") ? jSONObject2.getString("key") : null;
            String string2 = jSONObject2.has("cycle") ? jSONObject2.getString("cycle") : null;
            String string3 = jSONObject2.has("cycle_type") ? jSONObject2.getString("cycle_type") : null;
            return new C3130c(jSONObject2.has(IronSourceConstants.EVENTS_STATUS) ? jSONObject2.getString(IronSourceConstants.EVENTS_STATUS) : null, jSONObject2.has("sample") ? jSONObject2.getString("sample") : null, jSONObject2.has("sample_type") ? jSONObject2.getString("sample_type") : null, string2, string3, string, jSONObject2.has("service_key") ? jSONObject2.getString("service_key") : null, jSONObject2.has("data") ? jSONObject2.getString("data") : null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
