package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.p00;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class LoadAdError extends AdError {

    /* renamed from: e */
    private final ResponseInfo f27738e;

    public LoadAdError(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.f27738e = responseInfo;
    }

    @RecentlyNullable
    public ResponseInfo getResponseInfo() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37082e6)).booleanValue()) {
            return this.f27738e;
        }
        return null;
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
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", "null");
        } else {
            zzb.put("Response Info", responseInfo.zzc());
        }
        return zzb;
    }
}
