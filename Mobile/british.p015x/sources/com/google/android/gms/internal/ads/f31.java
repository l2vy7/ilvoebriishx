package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f31 implements uu3<JSONObject> {

    /* renamed from: a */
    private final iv3<ir2> f31608a;

    public f31(iv3<ir2> iv3) {
        this.f31608a = iv3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((f71) this.f31608a).mo31778a().f33438A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
