package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tw1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Long f39553a;

    /* renamed from: b */
    private final String f39554b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f39555c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Integer f39556d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f39557e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Integer f39558f;

    /* synthetic */ tw1(String str, sw1 sw1) {
        this.f39554b = str;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ String m38036a(tw1 tw1) {
        String str = (String) C8311wv.m39277c().mo18570b(p00.f37022X6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", tw1.f39553a);
            jSONObject.put("eventCategory", tw1.f39554b);
            jSONObject.putOpt("event", tw1.f39555c);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, tw1.f39556d);
            jSONObject.putOpt("rewardType", tw1.f39557e);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, tw1.f39558f);
        } catch (JSONException unused) {
            co0.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(jSONObject2);
        sb.append(");");
        return sb.toString();
    }
}
