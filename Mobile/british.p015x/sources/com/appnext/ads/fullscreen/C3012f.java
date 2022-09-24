package com.appnext.ads.fullscreen;

import com.appnext.core.C3198g;
import com.appnext.core.SettingsManager;
import java.util.HashMap;

/* renamed from: com.appnext.ads.fullscreen.f */
public final class C3012f extends SettingsManager {

    /* renamed from: O */
    private static C3012f f12023O;

    /* renamed from: v */
    private String f12024v = ("https://cdn.appnext.com/tools/sdk/confign/rewarded/" + C3198g.m10786av() + "/rewarded_config.txt");

    /* renamed from: w */
    private HashMap<String, String> f12025w = null;

    private C3012f() {
    }

    /* renamed from: o */
    public static synchronized C3012f m10411o() {
        C3012f fVar;
        synchronized (C3012f.class) {
            if (f12023O == null) {
                f12023O = new C3012f();
            }
            fVar = f12023O;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo10243j() {
        return this.f12024v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final HashMap<String, String> mo10244k() {
        return this.f12025w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final HashMap<String, String> mo10245l() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("can_close", "true");
        hashMap.put("show_close", "false");
        hashMap.put("video_length", "15");
        hashMap.put("mute", "false");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("banner_expiration_time", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("default_mode", RewardedVideo.VIDEO_MODE_NORMAL);
        hashMap.put("postpone_vta_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("postpone_impression_sec", SessionDescription.SUPPORTED_SDP_VERSION);
        hashMap.put("resolve_timeout", "8");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("caption_text_time", "3");
        hashMap.put("pre_title_string1", "Which Ad");
        hashMap.put("pre_title_string2", "Would you like to watch?");
        hashMap.put("pre_cta_string", "Play this ad");
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
        return "RewardedSettings";
    }
}
