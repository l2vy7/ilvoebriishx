package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.ha3;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.zzcdq;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zzae implements ha3 {
    public final /* synthetic */ zzcdq zza;

    public /* synthetic */ zzae(zzcdq zzcdq) {
        this.zza = zzcdq;
    }

    public final mb3 zza(Object obj) {
        zzcdq zzcdq = this.zza;
        zzah zzah = new zzah(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            zzah.zzb = zzt.zzp().zze(zzcdq.f21150b).toString();
        } catch (JSONException unused) {
            zzah.zzb = "{}";
        }
        return bb3.m30649i(zzah);
    }
}
