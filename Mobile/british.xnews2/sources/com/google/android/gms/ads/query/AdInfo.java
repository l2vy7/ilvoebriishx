package com.google.android.gms.ads.query;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.co0;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class AdInfo {

    /* renamed from: a */
    private final QueryInfo f28125a;

    /* renamed from: b */
    private final String f28126b;

    public AdInfo(@RecentlyNonNull QueryInfo queryInfo, @RecentlyNonNull String str) {
        this.f28125a = queryInfo;
        this.f28126b = str;
    }

    @RecentlyNonNull
    public static String getRequestId(@RecentlyNonNull String str) {
        if (str == null) {
            co0.zzj("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            co0.zzj("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    @RecentlyNonNull
    public String getAdString() {
        return this.f28126b;
    }

    @RecentlyNonNull
    public QueryInfo getQueryInfo() {
        return this.f28125a;
    }
}
