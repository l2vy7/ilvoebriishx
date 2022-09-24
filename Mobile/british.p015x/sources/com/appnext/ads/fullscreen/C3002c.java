package com.appnext.ads.fullscreen;

import com.appnext.core.C3198g;
import com.appnext.core.SettingsManager;
import java.util.HashMap;

/* renamed from: com.appnext.ads.fullscreen.c */
public class C3002c extends SettingsManager {

    /* renamed from: u */
    private static C3002c f12002u;

    /* renamed from: v */
    private String f12003v = ("https://cdn.appnext.com/tools/sdk/confign/fullscreen/" + C3198g.m10786av() + "/fullscreen_config.txt");

    /* renamed from: w */
    private HashMap<String, String> f12004w = null;

    private C3002c() {
    }

    /* renamed from: h */
    public static synchronized C3002c m10393h() {
        C3002c cVar;
        synchronized (C3002c.class) {
            if (f12002u == null) {
                f12002u = new C3002c();
            }
            cVar = f12002u;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo10243j() {
        return this.f12003v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final HashMap<String, String> mo10244k() {
        return this.f12004w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final HashMap<String, String> mo10245l() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("can_close", "true");
        hashMap.put("show_close", "true");
        hashMap.put("show_close_time", "2000");
        hashMap.put("video_length", "15");
        hashMap.put("mute", "false");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("banner_expiration_time", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("postpone_vta_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("postpone_impression_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("resolve_timeout", "8");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("caption_text_time", "3");
        hashMap.put("ads_caching_time_minutes", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_a", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("clickType_b", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("didPrivacy", "false");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo10246m() {
        return "FullscreenSettings";
    }
}
