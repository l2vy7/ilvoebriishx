package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b22 implements lb0<c22> {
    b22() {
    }

    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        c22 c22 = (c22) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", c22.f30223c.mo35624b());
        jSONObject2.put("signals", c22.f30222b);
        jSONObject3.put(TtmlNode.TAG_BODY, c22.f30221a.f32116c);
        jSONObject3.put("headers", zzt.zzp().zzf(c22.f30221a.f32115b));
        jSONObject3.put("response_code", c22.f30221a.f32114a);
        jSONObject3.put("latency", c22.f30221a.f32117d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c22.f30223c.mo35629g());
        return jSONObject;
    }
}
