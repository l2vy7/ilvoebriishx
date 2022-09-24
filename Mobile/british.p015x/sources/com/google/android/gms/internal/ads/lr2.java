package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.util.zzby;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lr2 {

    /* renamed from: a */
    public final List<String> f35214a;

    /* renamed from: b */
    public final String f35215b;

    /* renamed from: c */
    public final int f35216c;

    /* renamed from: d */
    public final String f35217d;

    /* renamed from: e */
    public final int f35218e;

    /* renamed from: f */
    public final long f35219f;

    /* renamed from: g */
    public final boolean f35220g;

    /* renamed from: h */
    public final String f35221h;

    /* renamed from: i */
    public final kr2 f35222i;

    lr2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i = 0;
        String str = "";
        long j = 0;
        kr2 kr2 = null;
        boolean z = false;
        String str2 = str;
        String str3 = str2;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzby.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37064c6)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    kr2 = new kr2(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.f35214a = emptyList;
        this.f35216c = i;
        this.f35215b = str2;
        this.f35217d = str3;
        this.f35218e = i2;
        this.f35219f = j;
        this.f35222i = kr2;
        this.f35220g = z;
        this.f35221h = str;
    }
}
