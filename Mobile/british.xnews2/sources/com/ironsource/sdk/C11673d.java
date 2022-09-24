package com.ironsource.sdk;

import com.ironsource.sdk.p293g.C11703d;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d */
public final class C11673d {

    /* renamed from: a */
    private static String f52279a = "ManRewInst_";

    /* renamed from: a */
    public static String m51706a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static String m51707a(C11524b bVar) {
        return (bVar.mo44602a() ? C11703d.C11708e.Banner : bVar.f51826a ? C11703d.C11708e.RewardedVideo : C11703d.C11708e.Interstitial).toString();
    }

    /* renamed from: a */
    public static String m51708a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString(MediationMetaData.KEY_NAME);
        }
        return f52279a + jSONObject.optString(MediationMetaData.KEY_NAME);
    }
}
