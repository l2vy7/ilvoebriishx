package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";
    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    @Deprecated
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* renamed from: a */
    private String f10535a = "";

    /* renamed from: b */
    private String[] f10536b;

    /* renamed from: c */
    private JSONArray f10537c = C2976x.m10301a();

    /* renamed from: d */
    private JSONObject f10538d = C2976x.m10319b();

    /* renamed from: e */
    private AdColonyUserMetadata f10539e;

    public AdColonyAppOptions() {
        setOriginStore("google");
        if (C2684a.m9411e()) {
            C2794i c = C2684a.m9409c();
            if (c.mo9692C()) {
                mo9410a(c.mo9733t().f10535a);
                mo9411a(c.mo9733t().f10536b);
            }
        }
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork("MoPub", C3791bd.UNKNOWN_CONTENT_TYPE);
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String[] split2 = split[i].split(":");
                if (split2.length == 2) {
                    String str2 = split2[0];
                    str2.hashCode();
                    if (str2.equals("store")) {
                        mediationNetwork.setOriginStore(split2[1]);
                    } else if (!str2.equals(MediationMetaData.KEY_VERSION)) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    } else {
                        mediationNetwork.setAppVersion(split2[1]);
                    }
                    i++;
                } else {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
            }
        }
        return mediationNetwork;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo9410a(String str) {
        if (str == null) {
            return this;
        }
        this.f10535a = str;
        C2976x.m10313a(this.f10538d, "app_id", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public JSONObject mo9413b() {
        return this.f10538d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String[] mo9415c() {
        return this.f10536b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public JSONArray mo9416d() {
        return this.f10537c;
    }

    public int getAppOrientation() {
        return C2976x.m10299a(this.f10538d, "app_orientation", -1);
    }

    public String getAppVersion() {
        return C2976x.m10337i(this.f10538d, "app_version");
    }

    @Deprecated
    public String getGDPRConsentString() {
        return C2976x.m10337i(this.f10538d, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return C2976x.m10329c(this.f10538d, "gdpr_required");
    }

    public boolean getKeepScreenOn() {
        return C2976x.m10329c(this.f10538d, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, MediationMetaData.KEY_NAME, C2976x.m10337i(this.f10538d, "mediation_network"));
        C2976x.m10313a(b, MediationMetaData.KEY_VERSION, C2976x.m10337i(this.f10538d, "mediation_network_version"));
        return b;
    }

    public boolean getMultiWindowEnabled() {
        return C2976x.m10329c(this.f10538d, "multi_window_enabled");
    }

    public Object getOption(String str) {
        return C2976x.m10336h(this.f10538d, str);
    }

    public String getOriginStore() {
        return C2976x.m10337i(this.f10538d, "origin_store");
    }

    public JSONObject getPluginInfo() {
        JSONObject b = C2976x.m10319b();
        C2976x.m10313a(b, MediationMetaData.KEY_NAME, C2976x.m10337i(this.f10538d, "plugin"));
        C2976x.m10313a(b, MediationMetaData.KEY_VERSION, C2976x.m10337i(this.f10538d, "plugin_version"));
        return b;
    }

    public String getPrivacyConsentString(String str) {
        JSONObject jSONObject = this.f10538d;
        return C2976x.m10337i(jSONObject, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(String str) {
        JSONObject jSONObject = this.f10538d;
        return C2976x.m10329c(jSONObject, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return C2976x.m10299a(this.f10538d, AdUnitActivity.EXTRA_ORIENTATION, -1);
    }

    public boolean getTestModeEnabled() {
        return C2976x.m10329c(this.f10538d, "test_mode");
    }

    public String getUserID() {
        return C2976x.m10337i(this.f10538d, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f10539e;
    }

    public AdColonyAppOptions setAppOrientation(int i) {
        setOption("app_orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setAppVersion(String str) {
        setOption("app_version", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(String str) {
        C2976x.m10313a(this.f10538d, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z) {
        setOption("gdpr_required", z);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z) {
        C2976x.m10325b(this.f10538d, "keep_screen_on", z);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        C2976x.m10313a(this.f10538d, "mediation_network", str);
        C2976x.m10313a(this.f10538d, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z) {
        C2976x.m10325b(this.f10538d, "multi_window_enabled", z);
        return this;
    }

    public AdColonyAppOptions setOption(String str, boolean z) {
        C2976x.m10325b(this.f10538d, str, z);
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        C2976x.m10313a(this.f10538d, "plugin", str);
        C2976x.m10313a(this.f10538d, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(String str, String str2) {
        JSONObject jSONObject = this.f10538d;
        C2976x.m10313a(jSONObject, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(String str, boolean z) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(int i) {
        setOption(AdUnitActivity.EXTRA_ORIENTATION, (double) i);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z) {
        C2976x.m10325b(this.f10538d, "test_mode", z);
        return this;
    }

    public AdColonyAppOptions setUserID(String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f10539e = adColonyUserMetadata;
        C2976x.m10315a(this.f10538d, "user_metadata", adColonyUserMetadata.f10566b);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9414b(Context context) {
        m9353a(context);
        if (C2976x.m10311a(this.f10538d, "use_forced_controller")) {
            C2951u0.f11859O = C2976x.m10329c(this.f10538d, "use_forced_controller");
        }
        if (C2976x.m10311a(this.f10538d, "use_staging_launch_server") && C2976x.m10329c(this.f10538d, "use_staging_launch_server")) {
            C2794i.f11380Y = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String b = C2916s0.m10070b(context, "IABUSPrivacy_String");
        String b2 = C2916s0.m10070b(context, "IABTCF_TCString");
        int a = C2916s0.m10049a(context, "IABTCF_gdprApplies");
        if (b != null) {
            C2976x.m10313a(this.f10538d, "ccpa_consent_string", b);
        }
        if (b2 != null) {
            C2976x.m10313a(this.f10538d, "gdpr_consent_string", b2);
        }
        boolean z = true;
        if (a == 0 || a == 1) {
            JSONObject jSONObject = this.f10538d;
            if (a != 1) {
                z = false;
            }
            C2976x.m10325b(jSONObject, "gdpr_required", z);
        }
    }

    public AdColonyAppOptions setOption(String str, double d) {
        C2976x.m10312a(this.f10538d, str, d);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo9411a(String... strArr) {
        if (strArr == null) {
            return this;
        }
        this.f10536b = strArr;
        this.f10537c = C2976x.m10301a();
        for (String b : strArr) {
            C2976x.m10322b(this.f10537c, b);
        }
        return this;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        C2976x.m10313a(this.f10538d, str, str2);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9412a() {
        return this.f10535a;
    }

    /* renamed from: a */
    private void m9353a(Context context) {
        setOption("bundle_id", C2916s0.m10076c(context));
    }
}
