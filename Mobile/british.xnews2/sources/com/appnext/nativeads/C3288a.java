package com.appnext.nativeads;

import com.appnext.core.C3198g;
import com.appnext.core.SettingsManager;
import com.ironsource.sdk.p288c.C11539d;
import java.util.HashMap;

/* renamed from: com.appnext.nativeads.a */
public final class C3288a extends SettingsManager {

    /* renamed from: fV */
    private static C3288a f12519fV;

    /* renamed from: v */
    private String f12520v = ("https://cdn.appnext.com/tools/sdk/confign/nativeads_new/" + C3198g.m10786av() + "/native_ads_config.json");

    /* renamed from: bc */
    public static synchronized C3288a m11006bc() {
        C3288a aVar;
        synchronized (C3288a.class) {
            if (f12519fV == null) {
                f12519fV = new C3288a();
            }
            aVar = f12519fV;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo10243j() {
        return this.f12520v;
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
        hashMap.put("default_video_quality", "2");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("default_video_length", "2");
        hashMap.put("min_internet_connection_video", "3G");
        hashMap.put("banner_expiration_time", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("ads_caching_time_minutes", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("gdpr", "false");
        hashMap.put("cpiActiveFlow", C11539d.f51879a);
        hashMap.put("cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("min_imp_precentage", "50");
        hashMap.put("repeat_viewable_criteria", "true");
        hashMap.put("min_vta_precentage", "50");
        hashMap.put("repeat_vta_viewable_criteria", "true");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo10246m() {
        return "NativeAdSettings";
    }
}
