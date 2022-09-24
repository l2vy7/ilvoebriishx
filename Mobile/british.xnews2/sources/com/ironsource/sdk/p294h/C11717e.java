package com.ironsource.sdk.p294h;

import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.e */
public final class C11717e {

    /* renamed from: a */
    public JSONObject f52437a;

    public C11717e(JSONObject jSONObject) {
        this.f52437a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public final boolean mo45033a() {
        return this.f52437a.optBoolean("useCacheDir", false);
    }
}
