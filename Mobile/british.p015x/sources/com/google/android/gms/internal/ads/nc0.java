package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nc0 {

    /* renamed from: a */
    public final String f20561a;

    /* renamed from: b */
    public final String f20562b;

    /* renamed from: c */
    public final List<String> f20563c;

    /* renamed from: d */
    public final String f20564d;

    /* renamed from: e */
    public final String f20565e;

    /* renamed from: f */
    public final List<String> f20566f;

    /* renamed from: g */
    public final List<String> f20567g;

    /* renamed from: h */
    public final List<String> f20568h;

    /* renamed from: i */
    public final List<String> f20569i;

    /* renamed from: j */
    public final List<String> f20570j;

    /* renamed from: k */
    public final String f20571k;

    /* renamed from: l */
    public final List<String> f20572l;

    /* renamed from: m */
    public final List<String> f20573m;

    /* renamed from: n */
    public final List<String> f20574n;

    /* renamed from: o */
    public final String f20575o;

    /* renamed from: p */
    public final String f20576p;

    /* renamed from: q */
    public final String f20577q;

    /* renamed from: r */
    public final String f20578r;

    /* renamed from: s */
    public final String f20579s;

    /* renamed from: t */
    public final List<String> f20580t;

    /* renamed from: u */
    public final String f20581u;

    /* renamed from: v */
    public final String f20582v;

    public nc0(JSONObject jSONObject) throws JSONException {
        List<String> list;
        this.f20562b = jSONObject.optString(TtmlNode.ATTR_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f20563c = Collections.unmodifiableList(arrayList);
        this.f20564d = jSONObject.optString("allocation_id", (String) null);
        zzt.zzg();
        this.f20566f = pc0.m36052a(jSONObject, "clickurl");
        zzt.zzg();
        this.f20567g = pc0.m36052a(jSONObject, "imp_urls");
        zzt.zzg();
        this.f20568h = pc0.m36052a(jSONObject, "downloaded_imp_urls");
        zzt.zzg();
        this.f20570j = pc0.m36052a(jSONObject, "fill_urls");
        zzt.zzg();
        this.f20572l = pc0.m36052a(jSONObject, "video_start_urls");
        zzt.zzg();
        this.f20574n = pc0.m36052a(jSONObject, "video_complete_urls");
        zzt.zzg();
        this.f20573m = pc0.m36052a(jSONObject, "video_reward_urls");
        this.f20575o = jSONObject.optString("transaction_id");
        this.f20576p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzt.zzg();
            list = pc0.m36052a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f20569i = list;
        this.f20561a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f20571k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f20565e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f20577q = jSONObject.optString("html_template", (String) null);
        this.f20578r = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f20579s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        zzt.zzg();
        this.f20580t = pc0.m36052a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f20581u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f20582v = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
