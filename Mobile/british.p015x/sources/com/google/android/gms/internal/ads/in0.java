package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class in0 {

    /* renamed from: a */
    private final List<String> f33343a = new ArrayList();

    /* renamed from: b */
    private final List<String> f33344b = new ArrayList();

    /* renamed from: c */
    private final Map<String, oc0> f33345c = new HashMap();

    /* renamed from: d */
    private String f33346d;

    /* renamed from: e */
    private String f33347e;

    /* renamed from: f */
    private long f33348f;

    /* renamed from: g */
    private JSONObject f33349g;

    /* renamed from: h */
    private boolean f33350h = false;

    /* renamed from: i */
    private final List<String> f33351i = new ArrayList();

    /* renamed from: j */
    private boolean f33352j = false;

    public in0(String str, long j) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        this.f33347e = str;
        this.f33348f = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f33349g = jSONObject;
                if (jSONObject.optInt(IronSourceConstants.EVENTS_STATUS, -1) != 1) {
                    this.f33350h = false;
                    co0.zzj("App settings could not be fetched successfully.");
                    return;
                }
                this.f33350h = true;
                this.f33346d = this.f33349g.optString("app_id");
                JSONArray optJSONArray2 = this.f33349g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if (IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE.equalsIgnoreCase(optString)) {
                                    this.f33344b.add(optString2);
                                } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject2 = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f33345c.put(optString2, new oc0(optJSONObject2));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.f33349g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                        this.f33343a.add(optJSONArray3.optString(i2));
                    }
                }
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37153m5)).booleanValue()) {
                    JSONObject optJSONObject3 = this.f33349g.optJSONObject("common_settings");
                    if (!(optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("loeid")) == null)) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            this.f33351i.add(optJSONArray.get(i3).toString());
                        }
                    }
                }
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36916K4)).booleanValue() && (optJSONObject = this.f33349g.optJSONObject("common_settings")) != null) {
                    this.f33352j = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e) {
                co0.zzk("Exception occurred while processing app setting json", e);
                zzt.zzo().mo18592s(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo32719a() {
        return this.f33348f;
    }

    /* renamed from: b */
    public final String mo32720b() {
        return this.f33346d;
    }

    /* renamed from: c */
    public final String mo32721c() {
        return this.f33347e;
    }

    /* renamed from: d */
    public final List<String> mo32722d() {
        return this.f33351i;
    }

    /* renamed from: e */
    public final Map<String, oc0> mo32723e() {
        return this.f33345c;
    }

    /* renamed from: f */
    public final JSONObject mo32724f() {
        return this.f33349g;
    }

    /* renamed from: g */
    public final void mo32725g(long j) {
        this.f33348f = j;
    }

    /* renamed from: h */
    public final boolean mo32726h() {
        return this.f33352j;
    }

    /* renamed from: i */
    public final boolean mo32727i() {
        return this.f33350h;
    }
}
