package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkSettings {

    /* renamed from: a */
    private String f51326a;

    /* renamed from: b */
    private String f51327b;

    /* renamed from: c */
    private JSONObject f51328c;

    /* renamed from: d */
    private JSONObject f51329d;

    /* renamed from: e */
    private JSONObject f51330e;

    /* renamed from: f */
    private JSONObject f51331f;

    /* renamed from: g */
    private String f51332g;

    /* renamed from: h */
    private String f51333h;

    /* renamed from: i */
    private boolean f51334i;

    /* renamed from: j */
    private String f51335j;

    /* renamed from: k */
    private int f51336k;

    /* renamed from: l */
    private int f51337l;

    /* renamed from: m */
    private int f51338m;

    /* renamed from: n */
    private String f51339n;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f51326a = networkSettings.getProviderName();
        this.f51335j = networkSettings.getProviderName();
        this.f51327b = networkSettings.getProviderTypeForReflection();
        this.f51329d = networkSettings.getRewardedVideoSettings();
        this.f51330e = networkSettings.getInterstitialSettings();
        this.f51331f = networkSettings.getBannerSettings();
        this.f51328c = networkSettings.getApplicationSettings();
        this.f51336k = networkSettings.getRewardedVideoPriority();
        this.f51337l = networkSettings.getInterstitialPriority();
        this.f51338m = networkSettings.getBannerPriority();
        this.f51339n = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f51326a = str;
        this.f51335j = str;
        this.f51327b = str;
        this.f51339n = str;
        this.f51329d = new JSONObject();
        this.f51330e = new JSONObject();
        this.f51331f = new JSONObject();
        this.f51328c = new JSONObject();
        this.f51336k = -1;
        this.f51337l = -1;
        this.f51338m = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f51326a = str;
        this.f51335j = str;
        this.f51327b = str2;
        this.f51339n = str3;
        this.f51329d = jSONObject2;
        this.f51330e = jSONObject3;
        this.f51331f = jSONObject4;
        this.f51328c = jSONObject;
        this.f51336k = -1;
        this.f51337l = -1;
        this.f51338m = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f51333h;
    }

    public JSONObject getApplicationSettings() {
        return this.f51328c;
    }

    public int getBannerPriority() {
        return this.f51338m;
    }

    public JSONObject getBannerSettings() {
        return this.f51331f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f51328c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f51328c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f51329d) != null) || (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f51330e) != null))) {
            return jSONObject2.optString("customNetworkAdapterName");
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject = this.f51331f) == null) {
            return null;
        }
        return jSONObject.optString("customNetworkAdapterName");
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f51328c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 1;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f51337l;
    }

    public JSONObject getInterstitialSettings() {
        return this.f51330e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 99;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("maxAdsPerSession", 99);
    }

    public String getProviderDefaultInstance() {
        return this.f51339n;
    }

    public String getProviderInstanceName() {
        return this.f51335j;
    }

    public String getProviderName() {
        return this.f51326a;
    }

    public String getProviderTypeForReflection() {
        return this.f51327b;
    }

    public int getRewardedVideoPriority() {
        return this.f51336k;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f51329d;
    }

    public String getSubProviderId() {
        return this.f51332g;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.f51334i;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f51333h = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f51328c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.f51338m = i;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f51331f.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f51331f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.f51337l = i;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f51330e.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f51330e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.f51334i = z;
    }

    public void setRewardedVideoPriority(int i) {
        this.f51336k = i;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f51329d.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f51329d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f51332g = str;
    }
}
