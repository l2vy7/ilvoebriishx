package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class e02 implements ha3 {

    /* renamed from: a */
    public final /* synthetic */ g02 f31139a;

    /* renamed from: b */
    public final /* synthetic */ String f31140b;

    /* renamed from: c */
    public final /* synthetic */ String f31141c;

    public /* synthetic */ e02(g02 g02, String str, String str2) {
        this.f31139a = g02;
        this.f31140b = str;
        this.f31141c = str2;
    }

    public final mb3 zza(Object obj) {
        String str = this.f31140b;
        String str2 = this.f31141c;
        String str3 = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put(TtmlNode.TAG_BODY, str);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return bb3.m30649i(jSONObject);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Preloaded loader: ".concat(valueOf) : new String("Preloaded loader: "));
        }
    }
}
