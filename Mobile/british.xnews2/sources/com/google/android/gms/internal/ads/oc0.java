package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oc0 {

    /* renamed from: a */
    public final List<nc0> f36372a;

    /* renamed from: b */
    public final List<String> f36373b;

    /* renamed from: c */
    public final List<String> f36374c;

    /* renamed from: d */
    public final List<String> f36375d;

    /* renamed from: e */
    public final List<String> f36376e;

    /* renamed from: f */
    public final List<String> f36377f;

    /* renamed from: g */
    public final String f36378g;

    /* renamed from: h */
    public final String f36379h;

    public oc0(JSONObject jSONObject) throws JSONException {
        String str;
        if (co0.zzm(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            if (valueOf.length() != 0) {
                str = "Mediation Response JSON: ".concat(valueOf);
            } else {
                str = new String("Mediation Response JSON: ");
            }
            zze.zza(str);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                nc0 nc0 = new nc0(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(nc0.f20582v);
                arrayList.add(nc0);
                if (i < 0) {
                    Iterator<String> it = nc0.f20563c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f36372a = Collections.unmodifiableList(arrayList);
        this.f36378g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzt.zzg();
            this.f36373b = pc0.m36052a(optJSONObject, "click_urls");
            zzt.zzg();
            this.f36374c = pc0.m36052a(optJSONObject, "imp_urls");
            zzt.zzg();
            this.f36375d = pc0.m36052a(optJSONObject, "downloaded_imp_urls");
            zzt.zzg();
            this.f36376e = pc0.m36052a(optJSONObject, "nofill_urls");
            zzt.zzg();
            this.f36377f = pc0.m36052a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1);
            zzces C0 = zzces.m40654C0(optJSONObject.optJSONArray("rewards"));
            if (C0 == null) {
                this.f36379h = null;
            } else {
                this.f36379h = C0.f43026b;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f36373b = null;
        this.f36374c = null;
        this.f36375d = null;
        this.f36376e = null;
        this.f36377f = null;
        this.f36379h = null;
    }
}
