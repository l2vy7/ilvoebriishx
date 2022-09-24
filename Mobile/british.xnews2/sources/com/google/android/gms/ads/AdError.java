package com.google.android.gms.ads;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.zzbew;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class AdError {
    @RecentlyNonNull
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* renamed from: a */
    private final int f27723a;

    /* renamed from: b */
    private final String f27724b;

    /* renamed from: c */
    private final String f27725c;

    /* renamed from: d */
    private final AdError f27726d;

    public AdError(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this(i, str, str2, (AdError) null);
    }

    public AdError(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, AdError adError) {
        this.f27723a = i;
        this.f27724b = str;
        this.f27725c = str2;
        this.f27726d = adError;
    }

    @RecentlyNullable
    public AdError getCause() {
        return this.f27726d;
    }

    public int getCode() {
        return this.f27723a;
    }

    public String getDomain() {
        return this.f27725c;
    }

    public String getMessage() {
        return this.f27724b;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final zzbew zza() {
        zzbew zzbew;
        AdError adError = this.f27726d;
        if (adError == null) {
            zzbew = null;
        } else {
            zzbew = new zzbew(adError.f27723a, adError.f27724b, adError.f27725c, (zzbew) null, (IBinder) null);
        }
        return new zzbew(this.f27723a, this.f27724b, this.f27725c, zzbew, (IBinder) null);
    }

    @RecentlyNonNull
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f27723a);
        jSONObject.put("Message", this.f27724b);
        jSONObject.put("Domain", this.f27725c);
        AdError adError = this.f27726d;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.zzb());
        }
        return jSONObject;
    }
}
