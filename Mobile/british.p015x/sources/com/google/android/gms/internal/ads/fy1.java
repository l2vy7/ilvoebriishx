package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fy1 {

    /* renamed from: a */
    private final String f32032a;

    /* renamed from: b */
    private final String f32033b;

    /* renamed from: c */
    private final int f32034c;

    /* renamed from: d */
    private final String f32035d;

    /* renamed from: e */
    private final int f32036e;

    public fy1(String str, String str2, int i, String str3, int i2) {
        this.f32032a = str;
        this.f32033b = str2;
        this.f32034c = i;
        this.f32035d = str3;
        this.f32036e = i2;
    }

    /* renamed from: a */
    public final JSONObject mo31960a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f32032a);
        jSONObject.put(MediationMetaData.KEY_VERSION, this.f32033b);
        jSONObject.put(IronSourceConstants.EVENTS_STATUS, this.f32034c);
        jSONObject.put("description", this.f32035d);
        jSONObject.put("initializationLatencyMillis", this.f32036e);
        return jSONObject;
    }
}
