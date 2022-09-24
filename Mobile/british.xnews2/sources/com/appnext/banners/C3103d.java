package com.appnext.banners;

import com.appnext.core.C3198g;
import com.appnext.core.SettingsManager;
import com.ironsource.sdk.p288c.C11539d;
import java.util.HashMap;

/* renamed from: com.appnext.banners.d */
public final class C3103d extends SettingsManager {

    /* renamed from: bD */
    private static C3103d f12182bD;

    private C3103d() {
    }

    /* renamed from: I */
    public static synchronized C3103d m10544I() {
        C3103d dVar;
        synchronized (C3103d.class) {
            if (f12182bD == null) {
                f12182bD = new C3103d();
            }
            dVar = f12182bD;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo10243j() {
        return "https://cdn.appnext.com/tools/sdk/confign/banner/" + C3198g.m10786av() + "/banner_config.txt";
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
        hashMap.put("urlApp_protection", "true");
        hashMap.put("resolve_timeout", "8");
        hashMap.put("postpone_impression_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("postpone_vta_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("pview", "true");
        hashMap.put("banner_expiration_time", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("ads_caching_time_minutes", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("gdpr", "false");
        hashMap.put("BANNER_cpiActiveFlow", C11539d.f51879a);
        hashMap.put("BANNER_cpcActiveFlow", "b");
        hashMap.put("LARGE_BANNER_cpiActiveFlow", C11539d.f51879a);
        hashMap.put("LARGE_BANNER_cpcActiveFlow", "b");
        hashMap.put("MEDIUM_RECTANGLE_cpiActiveFlow", C11539d.f51879a);
        hashMap.put("MEDIUM_RECTANGLE_cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("impOne", "true");
        hashMap.put("_arFlag", "true");
        hashMap.put("banner_ar", "10");
        hashMap.put("large_banner_ar", "10");
        hashMap.put("medium_rectangle_ar", "10");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo10246m() {
        return "BannerSettings";
    }
}
