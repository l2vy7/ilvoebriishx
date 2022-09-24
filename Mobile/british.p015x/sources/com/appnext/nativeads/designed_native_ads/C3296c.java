package com.appnext.nativeads.designed_native_ads;

import com.appnext.core.C3198g;
import com.appnext.core.SettingsManager;
import com.ironsource.sdk.p289c.C11539d;
import java.util.HashMap;

/* renamed from: com.appnext.nativeads.designed_native_ads.c */
public final class C3296c extends SettingsManager {

    /* renamed from: gn */
    private static C3296c f12536gn;

    /* renamed from: v */
    private String f12537v = ("https://cdn.appnext.com/tools/sdk/confign/suggested_apps/" + C3198g.m10786av() + "/suggested_apps_config.json");

    /* renamed from: bg */
    public static synchronized C3296c m11038bg() {
        C3296c cVar;
        synchronized (C3296c.class) {
            if (f12536gn == null) {
                f12536gn = new C3296c();
            }
            cVar = f12536gn;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo10243j() {
        return this.f12537v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final HashMap<String, String> mo10244k() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final HashMap<String, String> mo10245l() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("resolve_timeout", "8");
        hashMap.put("urlApp_protection", "true");
        hashMap.put("pview", "true");
        hashMap.put("postpone_vta_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("postpone_impression_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("default_caching_policy", "3");
        hashMap.put("min_internet_connection_video", "3G");
        hashMap.put("banner_expiration_time", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("ads_caching_time_minutes", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("gdpr", "false");
        hashMap.put("cpiActiveFlow", C11539d.f51879a);
        hashMap.put("cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("min_imp_precentage", "50");
        hashMap.put("repeat_viewable_criteria", "true");
        hashMap.put("min_vta_precentage", "50");
        hashMap.put("repeat_vta_viewable_criteria", "true");
        hashMap.put("stp_flag", "false");
        hashMap.put("report_vta_instead_of_impresssion", "false");
        hashMap.put("title", "Suggested Apps For You");
        hashMap.put("title_text_color", "#D0D0D0");
        hashMap.put("amount_of_icons", "5");
        hashMap.put("present_titles", "true");
        hashMap.put("app_title_text_color", "#000000");
        hashMap.put("local_direction", "false");
        hashMap.put("background_color", "#FFFFFF");
        hashMap.put("transparency", "100");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo10246m() {
        return "DesignNativeAdsSettings";
    }
}
