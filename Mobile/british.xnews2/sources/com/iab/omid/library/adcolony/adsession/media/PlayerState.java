package com.iab.omid.library.adcolony.adsession.media;

import com.appnext.ads.fullscreen.RewardedVideo;

public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(RewardedVideo.VIDEO_MODE_NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");
    

    /* renamed from: a */
    private final String f21673a;

    private PlayerState(String str) {
        this.f21673a = str;
    }

    public String toString() {
        return this.f21673a;
    }
}
