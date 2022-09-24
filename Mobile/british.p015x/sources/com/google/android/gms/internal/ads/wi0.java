package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wi0 {

    /* renamed from: a */
    private final List<String> f40793a;

    /* renamed from: b */
    private final String f40794b;

    /* renamed from: c */
    private final String f40795c;

    /* renamed from: d */
    private final String f40796d;

    /* renamed from: e */
    private final boolean f40797e;

    /* renamed from: f */
    private final boolean f40798f;

    /* renamed from: g */
    private final String f40799g;

    /* renamed from: h */
    private final String f40800h;

    /* renamed from: i */
    private final String f40801i;

    /* renamed from: j */
    private final int f40802j;

    /* renamed from: k */
    private final JSONObject f40803k;

    /* renamed from: l */
    private final String f40804l;

    /* renamed from: m */
    private final String f40805m;

    public wi0(JSONObject jSONObject) {
        List<String> list;
        this.f40801i = jSONObject.optString("url");
        this.f40794b = jSONObject.optString("base_uri");
        this.f40795c = jSONObject.optString("post_parameters");
        this.f40797e = m39180j(jSONObject.optString("drt_include"));
        this.f40798f = m39180j(jSONObject.optString("cookies_include", "true"));
        this.f40799g = jSONObject.optString("request_id");
        this.f40796d = jSONObject.optString(SessionDescription.ATTR_TYPE);
        String optString = jSONObject.optString("errors");
        if (optString == null) {
            list = null;
        } else {
            list = Arrays.asList(optString.split(","));
        }
        this.f40793a = list;
        this.f40802j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f40800h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f40803k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f40804l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f40805m = jSONObject.optString("pool_key");
    }

    /* renamed from: j */
    private static boolean m39180j(String str) {
        return str != null && (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || str.equals("true"));
    }

    /* renamed from: a */
    public final int mo35623a() {
        return this.f40802j;
    }

    /* renamed from: b */
    public final String mo35624b() {
        return this.f40794b;
    }

    /* renamed from: c */
    public final String mo35625c() {
        return this.f40805m;
    }

    /* renamed from: d */
    public final String mo35626d() {
        return this.f40795c;
    }

    /* renamed from: e */
    public final String mo35627e() {
        return this.f40801i;
    }

    /* renamed from: f */
    public final List<String> mo35628f() {
        return this.f40793a;
    }

    /* renamed from: g */
    public final JSONObject mo35629g() {
        return this.f40803k;
    }

    /* renamed from: h */
    public final boolean mo35630h() {
        return this.f40798f;
    }

    /* renamed from: i */
    public final boolean mo35631i() {
        return this.f40797e;
    }
}
