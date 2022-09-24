package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.p33;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zzk implements p33 {
    public static final /* synthetic */ zzk zza = new zzk();

    private /* synthetic */ zzk() {
    }

    public final Object apply(Object obj) {
        int i = zzv.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
