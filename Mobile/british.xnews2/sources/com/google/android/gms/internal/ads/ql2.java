package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ql2 implements yi2<JSONObject> {

    /* renamed from: a */
    private final Map<String, Object> f38166a;

    public ql2(Map<String, Object> map) {
        this.f38166a = map;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzt.zzp().zzf(this.f38166a));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            zze.zza(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
