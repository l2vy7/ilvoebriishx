package com.google.android.gms.ads;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbfm;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdapterResponseInfo {

    /* renamed from: a */
    private final zzbfm f27736a;

    /* renamed from: b */
    private final AdError f27737b;

    private AdapterResponseInfo(zzbfm zzbfm) {
        this.f27736a = zzbfm;
        zzbew zzbew = zzbfm.f42981d;
        this.f27737b = zzbew == null ? null : zzbew.mo36237C0();
    }

    public static AdapterResponseInfo zza(zzbfm zzbfm) {
        if (zzbfm != null) {
            return new AdapterResponseInfo(zzbfm);
        }
        return null;
    }

    @RecentlyNullable
    public AdError getAdError() {
        return this.f27737b;
    }

    @RecentlyNonNull
    public String getAdapterClassName() {
        return this.f27736a.f42979b;
    }

    @RecentlyNonNull
    public Bundle getCredentials() {
        return this.f27736a.f42982e;
    }

    public long getLatencyMillis() {
        return this.f27736a.f42980c;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @RecentlyNonNull
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f27736a.f42979b);
        jSONObject.put("Latency", this.f27736a.f42980c);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f27736a.f42982e.keySet()) {
            jSONObject2.put(str, this.f27736a.f42982e.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.f27737b;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}
