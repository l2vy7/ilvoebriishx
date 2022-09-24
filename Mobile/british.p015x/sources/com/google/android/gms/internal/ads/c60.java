package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzby;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c60 implements e70<Object> {

    /* renamed from: a */
    private final d60 f30252a;

    public c60(d60 d60) {
        this.f30252a = d60;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map<String, String> map) {
        if (this.f30252a != null) {
            String str = map.get(MediationMetaData.KEY_NAME);
            if (str == null) {
                co0.zzi("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzby.zza(new JSONObject(map.get("info")));
                } catch (JSONException e) {
                    co0.zzh("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                co0.zzg("Failed to convert ad metadata to Bundle.");
            } else {
                this.f30252a.mo18195n(str, bundle);
            }
        }
    }
}
