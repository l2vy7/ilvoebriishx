package com.appnext.ads.interstitial;

import com.appnext.core.C3198g;
import com.appnext.core.SettingsManager;
import java.util.HashMap;

/* renamed from: com.appnext.ads.interstitial.c */
public final class C3063c extends SettingsManager {

    /* renamed from: aL */
    private static C3063c f12113aL;

    /* renamed from: v */
    private String f12114v = ("https://cdn.appnext.com/tools/sdk/confign/interstitial/" + C3198g.m10786av() + "/interstitial_config.txt");

    /* renamed from: w */
    private HashMap<String, String> f12115w = null;

    private C3063c() {
    }

    /* renamed from: C */
    public static synchronized C3063c m10511C() {
        C3063c cVar;
        synchronized (C3063c.class) {
            if (f12113aL == null) {
                f12113aL = new C3063c();
            }
            cVar = f12113aL;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo10243j() {
        return this.f12114v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final HashMap<String, String> mo10244k() {
        return this.f12115w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final HashMap<String, String> mo10245l() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("creative", Interstitial.TYPE_MANAGED);
        hashMap.put("auto_play", "true");
        hashMap.put("mute", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection", "2g");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("can_close", "true");
        hashMap.put("video_length", "15");
        hashMap.put("button_text", "");
        hashMap.put("button_color", "");
        hashMap.put("skip_title", "");
        hashMap.put("remove_poster_on_auto_play", "true");
        hashMap.put("banner_expiration_time", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("show_rating", "true");
        hashMap.put("show_desc", "true");
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("postpone_vta_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("postpone_impression_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("resolve_timeout", "8");
        hashMap.put("ads_caching_time_minutes", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_A", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("didPrivacy", "false");
        hashMap.put("S1", "[{\"id\":\"multi\",\"p\":50},{\"id\":\"single\",\"p\":50}]");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo10246m() {
        return "InterstitialSettings";
    }
}
