package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class uo1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ wo1 f39911a;

    /* renamed from: b */
    public final /* synthetic */ ur2 f39912b;

    /* renamed from: c */
    public final /* synthetic */ ir2 f39913c;

    /* renamed from: d */
    public final /* synthetic */ JSONObject f39914d;

    public /* synthetic */ uo1(wo1 wo1, ur2 ur2, ir2 ir2, JSONObject jSONObject) {
        this.f39911a = wo1;
        this.f39912b = ur2;
        this.f39913c = ir2;
        this.f39914d = jSONObject;
    }

    public final Object call() {
        ur2 ur2 = this.f39912b;
        ir2 ir2 = this.f39913c;
        JSONObject jSONObject = this.f39914d;
        im1 im1 = new im1();
        im1.mo32695v(jSONObject.optInt("template_id", -1));
        im1.mo32682i(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        im1.mo32692s(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        bs2 bs2 = ur2.f39936a.f38765a;
        if (bs2.f30090g.contains(Integer.toString(im1.mo32651K()))) {
            if (im1.mo32651K() == 3) {
                if (im1.mo32679g0() == null) {
                    throw new l82(1, "No custom template id for custom template ad response.");
                } else if (!bs2.f30091h.contains(im1.mo32679g0())) {
                    throw new l82(1, "Unexpected custom template id in the response.");
                }
            }
            im1.mo32693t(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (ir2.f33447J) {
                zzt.zzp();
                String zzD = com.google.android.gms.ads.internal.util.zzt.zzD();
                StringBuilder sb = new StringBuilder(String.valueOf(zzD).length() + 3 + String.valueOf(optString).length());
                sb.append(zzD);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            im1.mo32694u("headline", optString);
            im1.mo32694u(TtmlNode.TAG_BODY, jSONObject.optString(TtmlNode.TAG_BODY, (String) null));
            im1.mo32694u("call_to_action", jSONObject.optString("call_to_action", (String) null));
            im1.mo32694u("store", jSONObject.optString("store", (String) null));
            im1.mo32694u(InAppPurchaseMetaData.KEY_PRICE, jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE, (String) null));
            im1.mo32694u("advertiser", jSONObject.optString("advertiser", (String) null));
            return im1;
        }
        int K = im1.mo32651K();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(K);
        throw new l82(1, sb2.toString());
    }
}
