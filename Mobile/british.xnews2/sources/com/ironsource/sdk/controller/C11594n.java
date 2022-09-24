package com.ironsource.sdk.controller;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.n */
public final class C11594n {

    /* renamed from: a */
    String f52052a;

    /* renamed from: b */
    JSONObject f52053b;

    /* renamed from: c */
    String f52054c;

    /* renamed from: d */
    String f52055d;

    public C11594n(JSONObject jSONObject) {
        this.f52052a = jSONObject.optString("functionName");
        this.f52053b = jSONObject.optJSONObject("functionParams");
        this.f52054c = jSONObject.optString("success");
        this.f52055d = jSONObject.optString("fail");
    }

    /* renamed from: a */
    public final JSONObject mo44761a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f52052a);
            jSONObject.put("functionParams", this.f52053b);
            jSONObject.put("success", this.f52054c);
            jSONObject.put("fail", this.f52055d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
