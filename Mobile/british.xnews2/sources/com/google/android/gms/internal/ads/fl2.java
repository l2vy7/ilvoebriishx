package com.google.android.gms.internal.ads;

import com.google.android.gms.common.C7355d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class fl2 implements yi2 {

    /* renamed from: a */
    public static final /* synthetic */ fl2 f31802a = new fl2();

    private /* synthetic */ fl2() {
    }

    public final void zza(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", C7355d.f29215a);
        } catch (JSONException unused) {
        }
    }
}
