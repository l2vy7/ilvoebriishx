package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class es2 {

    /* renamed from: a */
    private final JSONObject f31494a;

    public es2(JSONObject jSONObject) {
        this.f31494a = jSONObject;
    }

    /* renamed from: a */
    public final String mo31662a() {
        if (mo31663b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* renamed from: b */
    public final int mo31663b() {
        int optInt = this.f31494a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
