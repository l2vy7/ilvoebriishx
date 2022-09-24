package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzby;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nr2 {

    /* renamed from: a */
    public final String f36095a;

    /* renamed from: b */
    public final String f36096b;

    /* renamed from: c */
    public final JSONObject f36097c;

    /* renamed from: d */
    public final JSONObject f36098d;

    nr2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzh = zzby.zzh(jsonReader);
        this.f36098d = zzh;
        this.f36095a = zzh.optString("ad_html", (String) null);
        this.f36096b = zzh.optString("ad_base_url", (String) null);
        this.f36097c = zzh.optJSONObject("ad_json");
    }
}
